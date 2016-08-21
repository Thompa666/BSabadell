package com.kjohnson.sunriseapp.data;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by wolf on 8/21/2016.
 */

public class CustomRequest extends Request {

    private static final String NAMESPACE = "http://www.webservicex.com/globalweather.asmx";
    private static final String URL = "http://www.webservicex.com/globalweather.asmx?wsdl";
    private static final String SOAP_ACTION = "http://www.webservicex.com/globalweather.asmx/GetCitiesByCountry";
    private static final String METHOD_NAME = "GetCitiesByCountry";
    Response.Listener mListener;


    public CustomRequest(int method, String url, Response.Listener listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        mListener = listener;
    }

    @Override
    protected Response parseNetworkResponse(NetworkResponse response) {

        SoapObject requestSoap = new SoapObject(NAMESPACE, METHOD_NAME);
        requestSoap.addProperty("CountryName", "Spain");
        SoapSerializationEnvelope soapEnvelope = new
                SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.setOutputSoapObject(requestSoap);
        HttpTransportSE Object = new HttpTransportSE(URL);


        AndroidHttpTransport httpTransport = new AndroidHttpTransport(URL);
        httpTransport.debug = true;  //this is optional, use it if you don't want to use a packet sniffer to check what the sent message was (httpTransport.requestDump)
        try {
            httpTransport.call(SOAP_ACTION, soapEnvelope); //send request
            SoapPrimitive resultString = (SoapPrimitive) soapEnvelope.getResponse();
            String resultStr = resultString.toString();
//            SoapObject result =(SoapObject)soapEnvelope.getResponse(); //get response
            return Response.success(resultStr, HttpHeaderParser.parseCacheHeaders(response));
        } catch (IOException e) {
            return Response.error(new ParseError(e));
        } catch (XmlPullParserException e) {
            return Response.error(new ParseError(e));
        }


    }

    @Override
    protected void deliverResponse(Object response) {
        mListener.onResponse(response);
    }

    @Override
    public int compareTo(Object another) {
        return 0;
    }
}
