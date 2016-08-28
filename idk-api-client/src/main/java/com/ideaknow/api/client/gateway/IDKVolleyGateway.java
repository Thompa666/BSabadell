package com.ideaknow.api.client.gateway;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ideaknow.SessionManager;
import com.ideaknow.api.client.R;
import com.ideaknow.api.client.SabadellApi;
import com.ideaknow.api.client.forms.DocumentForm;
import com.ideaknow.api.client.forms.accounts.AccountForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementDocumentForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementReturnBillForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementsDebitSplitForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementsForm;
import com.ideaknow.api.client.forms.accounts.AccountPayersForm;
import com.ideaknow.api.client.forms.accounts.AccountsForm;
import com.ideaknow.api.client.forms.accounts.transfers.TransferToCardForm;
import com.ideaknow.api.client.forms.agent.AgentForm;
import com.ideaknow.api.client.forms.agent.MyAvailabilityForm;
import com.ideaknow.api.client.forms.atmmobile.AtmMobileCommissionForm;
import com.ideaknow.api.client.forms.atmmobile.OtpGenerationForm;
import com.ideaknow.api.client.forms.atmmobile.OtpRemoveForm;
import com.ideaknow.api.client.forms.banner.BannerForm;
import com.ideaknow.api.client.forms.cards.CardActivationForm;
import com.ideaknow.api.client.forms.cards.CardBlockedForm;
import com.ideaknow.api.client.forms.cards.CardConditionsForm;
import com.ideaknow.api.client.forms.cards.CardConditionsUpdateForm;
import com.ideaknow.api.client.forms.cards.CardForm;
import com.ideaknow.api.client.forms.cards.CardLastMovementForm;
import com.ideaknow.api.client.forms.cards.CardLimitForm;
import com.ideaknow.api.client.forms.cards.CardMovementGeoPointForm;
import com.ideaknow.api.client.forms.cards.CardMovementsCreditSplitForm;
import com.ideaknow.api.client.forms.cards.CardMovementsCreditSplitPeriodsForm;
import com.ideaknow.api.client.forms.cards.CardMovementsDebitSplitForm;
import com.ideaknow.api.client.forms.cards.CardMovementsDebitSplitPeriodsForm;
import com.ideaknow.api.client.forms.cards.CardPDFConditionForm;
import com.ideaknow.api.client.forms.cards.CardPrepaidReloadCommissionsForm;
import com.ideaknow.api.client.forms.cards.CardPrepaidReloadForm;
import com.ideaknow.api.client.forms.cards.CardProfileForm;
import com.ideaknow.api.client.forms.cards.CardSecondKeyForm;
import com.ideaknow.api.client.forms.cards.CardSettlementDocForm;
import com.ideaknow.api.client.forms.cards.CardSettlementsForm;
import com.ideaknow.api.client.forms.cards.CardStickerForm;
import com.ideaknow.api.client.forms.cards.CardToAccountCommissionForm;
import com.ideaknow.api.client.forms.cards.CardToAccountTransferForm;
import com.ideaknow.api.client.forms.changepin.ChangePinForm;
import com.ideaknow.api.client.forms.checks.CheckForm;
import com.ideaknow.api.client.forms.checks.CheckInstantForm;
import com.ideaknow.api.client.forms.clicktocall.ClickToCallForm;
import com.ideaknow.api.client.forms.companies.CompanyForm;
import com.ideaknow.api.client.forms.companies.LimitAssignedForm;
import com.ideaknow.api.client.forms.companies.LimitForm;
import com.ideaknow.api.client.forms.contactdata.UpdateEmailForm;
import com.ideaknow.api.client.forms.directdebit.DirectDebitForm;
import com.ideaknow.api.client.forms.directdebit.DirectDebitListForm;
import com.ideaknow.api.client.forms.form.EnrollmentCreateForm;
import com.ideaknow.api.client.forms.form.EnrollmentListForm;
import com.ideaknow.api.client.forms.form.EnrollmentRemoveForm;
import com.ideaknow.api.client.forms.glass.SessionAccountMovementsForm;
import com.ideaknow.api.client.forms.glass.SessionAccountsForm;
import com.ideaknow.api.client.forms.inbox.InboxForm;
import com.ideaknow.api.client.forms.informational.InformationalForm;
import com.ideaknow.api.client.forms.instantmoney.InstantMoneyActivationForm;
import com.ideaknow.api.client.forms.instantmoney.InstantMoneyCommissionsForm;
import com.ideaknow.api.client.forms.instantmoney.InstantMoneyForm;
import com.ideaknow.api.client.forms.key.SecondKeyForm;
import com.ideaknow.api.client.forms.mail.MailDocumentForm;
import com.ideaknow.api.client.forms.mail.MailListForm;
import com.ideaknow.api.client.forms.mail.MailsForm;
import com.ideaknow.api.client.forms.menu.MenuForm;
import com.ideaknow.api.client.forms.nfc.NfcSessionForm;
import com.ideaknow.api.client.forms.nfc.NfcSignUpCardModel;
import com.ideaknow.api.client.forms.nfc.NfcSignUpUnsubscribeForm;
import com.ideaknow.api.client.forms.nosessioninbox.NoSessionInboxActionForm;
import com.ideaknow.api.client.forms.nosessioninbox.NoSessionInboxForm;
import com.ideaknow.api.client.forms.nosessioninbox.NoSessionInboxListForm;
import com.ideaknow.api.client.forms.nosessionnotification.NoSessionNotificationsForm;
import com.ideaknow.api.client.forms.nosessiontpc.NoSessionTpcSecondKeyForm;
import com.ideaknow.api.client.forms.notification.NotificationForm;
import com.ideaknow.api.client.forms.offices.OfficesSearchForm;
import com.ideaknow.api.client.forms.product.ProductsCardsForm;
import com.ideaknow.api.client.forms.promolayers.PromoLayerAvailableForm;
import com.ideaknow.api.client.forms.promolayers.PromoLayerForm;
import com.ideaknow.api.client.forms.push.PushCreationForm;
import com.ideaknow.api.client.forms.push.PushDeviceListForm;
import com.ideaknow.api.client.forms.push.PushDeviceRegisterForm;
import com.ideaknow.api.client.forms.push.PushMessageActionForm;
import com.ideaknow.api.client.forms.push.PushMessageForm;
import com.ideaknow.api.client.forms.push.PushMessageListForm;
import com.ideaknow.api.client.forms.risk.RiskListForm;
import com.ideaknow.api.client.forms.session.SessionAgentForm;
import com.ideaknow.api.client.forms.session.SessionAnonymousForm;
import com.ideaknow.api.client.forms.session.SessionForm;
import com.ideaknow.api.client.forms.session.UserForm;
import com.ideaknow.api.client.forms.tpc.TpcEnrollmentCreateForm;
import com.ideaknow.api.client.forms.tpc.TpcKeysOfflineForm;
import com.ideaknow.api.client.forms.tpc.TpcMobileForm;
import com.ideaknow.api.client.forms.tpc.TpcSecondKeyForm;
import com.ideaknow.api.client.forms.tpc.UpdateProcessPage1Form;
import com.ideaknow.api.client.forms.tpc.UpdateProcessPage2Form;
import com.ideaknow.api.client.forms.tpc.OtpForm;
import com.ideaknow.api.client.forms.tpv.MerchantsListForm;
import com.ideaknow.api.client.forms.tpv.NewOperationForm;
import com.ideaknow.api.client.forms.tpv.OperationForm;
import com.ideaknow.api.client.forms.tpv.OperationListForm;
import com.ideaknow.api.client.forms.tpv.TerminalsForm;
import com.ideaknow.api.client.forms.transactionmonitoring.TransactionmonitoringForm;
import com.ideaknow.api.client.forms.transfers.BeneficiaryForm;
import com.ideaknow.api.client.forms.transfers.CommissionsForm;
import com.ideaknow.api.client.forms.transfers.DollarDatesForm;
import com.ideaknow.api.client.forms.transfers.OwnTransferConditionsDocumentForm;
import com.ideaknow.api.client.forms.transfers.OwnTransferForm;
import com.ideaknow.api.client.forms.transfers.PeriodicalTransferEndDateForm;
import com.ideaknow.api.client.forms.transfers.PeriodicalTransferForm;
import com.ideaknow.api.client.forms.transfers.TransferCancelConditionsDocumentForm;
import com.ideaknow.api.client.forms.transfers.TransferCancelForm;
import com.ideaknow.api.client.forms.transfers.TransferCommissionForm;
import com.ideaknow.api.client.forms.transfers.TransferDuplicatedForm;
import com.ideaknow.api.client.forms.transfers.TransferForm;
import com.ideaknow.api.client.forms.transfers.TransferInternationalBicForm;
import com.ideaknow.api.client.forms.transfers.TransfersForm;
import com.ideaknow.api.client.model.AtmMobileEnrollmentListModel;
import com.ideaknow.api.client.model.AtmMobileEnrollmentModel;
import com.ideaknow.api.client.model.BooleanResponseModel;
import com.ideaknow.api.client.model.ErrorResponse;
import com.ideaknow.api.client.model.PaginatorModel;
import com.ideaknow.api.client.model.StringResponseModel;
import com.ideaknow.api.client.model.accounts.AccountMovementsListModel;
import com.ideaknow.api.client.model.accounts.AccountPayersModel;
import com.ideaknow.api.client.model.accounts.AccountsListModel;
import com.ideaknow.api.client.model.agent.AgentModel;
import com.ideaknow.api.client.model.agent.AgentSessionModel;
import com.ideaknow.api.client.model.alerts.AlertContractListModel;
import com.ideaknow.api.client.model.alerts.AlertContractModel;
import com.ideaknow.api.client.model.atmmobile.AtmMobileCommissionListModel;
import com.ideaknow.api.client.model.atmmobile.AtmMobileOtpModel;
import com.ideaknow.api.client.model.banner.BannerModel;
import com.ideaknow.api.client.model.blacklist.BlackListModel;
import com.ideaknow.api.client.model.cards.CardActivationModel;
import com.ideaknow.api.client.model.cards.CardAllMovementsForm;
import com.ideaknow.api.client.model.cards.CardConditionsModel;
import com.ideaknow.api.client.model.cards.CardLastMovementModel;
import com.ideaknow.api.client.model.cards.CardListModel;
import com.ideaknow.api.client.model.cards.CardMovementGeoPointModel;
import com.ideaknow.api.client.model.cards.CardMovementsCreditSplitPeriodsModel;
import com.ideaknow.api.client.model.cards.CardMovementsDebitSplitPeriodsModel;
import com.ideaknow.api.client.model.cards.CardMovementsListModel;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadAmountsModel;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadCommissionsModel;
import com.ideaknow.api.client.model.cards.CardProfileCountriesListModel;
import com.ideaknow.api.client.model.cards.CardProfileRulesListModel;
import com.ideaknow.api.client.model.cards.CardSettlementsModel;
import com.ideaknow.api.client.model.checks.CheckModel;
import com.ideaknow.api.client.model.companies.CompaniesListModel;
import com.ideaknow.api.client.model.companies.CompanyCreditLimitsModel;
import com.ideaknow.api.client.model.directdebit.DirectDebitListModel;
import com.ideaknow.api.client.model.document.DocumentModel;
import com.ideaknow.api.client.model.glass.SessionAccountMovementsModel;
import com.ideaknow.api.client.model.glass.SessionAccountsModel;
import com.ideaknow.api.client.model.glass.SessionAgentAccountsModel;
import com.ideaknow.api.client.model.inbox.InboxesModel;
import com.ideaknow.api.client.model.informational.InformationalModel;
import com.ideaknow.api.client.model.instantmoney.InstantMoneyCommissionsModel;
import com.ideaknow.api.client.model.instantmoney.InstantMoneyModel;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.key.OtpQueryKeyModel;
import com.ideaknow.api.client.model.mail.MailListModel;
import com.ideaknow.api.client.model.menu.MenuModel;
import com.ideaknow.api.client.model.nfc.NfcSessionModel;
import com.ideaknow.api.client.model.offices.OfficeListModel;
import com.ideaknow.api.client.model.product.ProductsCardsModel;
import com.ideaknow.api.client.model.product.ProductsListModel;
import com.ideaknow.api.client.model.promolayers.PromoLayerResultModel;
import com.ideaknow.api.client.model.push.PushDeviceListModel;
import com.ideaknow.api.client.model.push.PushDeviceResponseModel;
import com.ideaknow.api.client.model.push.PushMessageListModel;
import com.ideaknow.api.client.model.push.PushMessageModel;
import com.ideaknow.api.client.model.risk.RiskRecordListModel;
import com.ideaknow.api.client.model.session.ContractListModel;
import com.ideaknow.api.client.model.session.SessionModel;
import com.ideaknow.api.client.model.session.UserModel;
import com.ideaknow.api.client.model.status.StatusModel;
import com.ideaknow.api.client.model.tpc.ContractResponseModel;
import com.ideaknow.api.client.model.tpc.TpcKeyListModel;
import com.ideaknow.api.client.model.tpv.MerchantListModel;
import com.ideaknow.api.client.model.tpv.TerminalListModel;
import com.ideaknow.api.client.model.tpv.TpvOperationListModel;
import com.ideaknow.api.client.model.tpv.TpvOperationModel;
import com.ideaknow.api.client.model.transfer.AccountTransferToCardModel;
import com.ideaknow.api.client.model.transfer.BanksModel;
import com.ideaknow.api.client.model.transfer.BeneficiariesModel;
import com.ideaknow.api.client.model.transfer.BeneficiaryModel;
import com.ideaknow.api.client.model.transfer.BeneficiaryResultModel;
import com.ideaknow.api.client.model.transfer.BicsModel;
import com.ideaknow.api.client.model.transfer.CardToAccountCommissionModel;
import com.ideaknow.api.client.model.transfer.CardToAccountTransferModel;
import com.ideaknow.api.client.model.transfer.CitiesModel;
import com.ideaknow.api.client.model.transfer.CommissionsModel;
import com.ideaknow.api.client.model.transfer.CountriesListModel;
import com.ideaknow.api.client.model.transfer.CurrenciesModel;
import com.ideaknow.api.client.model.transfer.DollarDatesModel;
import com.ideaknow.api.client.model.transfer.OwnTransferResponseModel;
import com.ideaknow.api.client.model.transfer.PeriodicalTransferResponseModel;
import com.ideaknow.api.client.model.transfer.TransferCancelModel;
import com.ideaknow.api.client.model.transfer.TransferResponseModel;
import com.ideaknow.api.client.model.transfer.TransfersListModel;
import com.ideaknow.api.client.network.HtmlToNativeRequest;
import com.ideaknow.api.client.network.IDKCachedGsonRequest;
import com.ideaknow.api.client.network.IDKGsonRequest;
import com.ideaknow.api.client.network.IDKInvalidateCacheGsonRequest;
import com.ideaknow.api.client.network.LargeTextLogger;
import com.ideaknow.api.client.network.NativeResponse;
import com.ideaknow.api.client.network.RequestQueuesManager;
import com.ideaknow.api.client.network.SessionCapturingRequest;
import com.ideaknow.api.client.network.SessionCapturingRequestNotLogged;
import com.ideaknow.lib.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URLEncoder;
import java.util.*;

/**
 * Gateway that implements the Sabadell api using Volley as the networking library.
 */
public class IDKVolleyGateway extends IDKGateway {

    private static final int STATUS_CODE_SESSION_EXPIRED = 403;
    private static final int STATUS_CODE_HAS_CONFLICT= 409;

    public static final String TAG = "IDKVolley";
    public static String mUserAgent = "";

    /** Params key constants */
    private static final String ORDER = "order";
    private static final String ITEMS_PER_PAGE = "itemsPerPage";
    private static final String PAGE = "page";
    private static final String TYPE = "type";
    private static final String FILTER = "filter";
    private static final String ID = "id";
    private static final String FORMAT = "format";
    private static final String OPERATION_CODE = "operationCode";
    private static final String CONTRACT_CCC = "contractCCC";
    private static final String BENEFICIARY_NAME = "name";
    private static final String REGISTERED_DEVICE = "registeredDevice";
    private static final String HTML_PLUGINS_HTTP_GET = "GET";
    private static final String HTML_PLUGINS_HTTP_PUT = "PUT";
    private static final String HTML_PLUGINS_HTTP_POST = "POST";
    private static final String SCALE_FACTOR = "scaleFactor";
    private static final String BRAND = "brand";
    private static final String IS_WEB = "isWeb";
    private static final String IS_PILOT = "isPilot";
    private static final String PROMOLAYER_BRAND = "brand";
    private static final String PROMOLAYER_STATUS = "status";
    private static final String PLATFORM = "platform";
    private static final String PERSONALIZATION = "personalization";
    private static final String SIGNATURE_TYPE = "signatureType";
    private static final String WALLET_INSTALLED = "walletInstalled";
    private static final String DMS = "dms";
    private static final String ADDRESS = "address";
    private static final String LAT = "lat";
    private static final String LNG = "lng";
    private static final String NUM_OFFICES = "numOffices";

    private static final String NO_ERROR = "noError";

    /**
     * Should be an Application context to avoid memory leaks. It is only used to read error
     * messages from the strings.xml.
     */
    private Context mContext;

    /** Default Gson parser for the IDKGsonRequests to use. */
    public static final Gson IDK_GSON = new GsonBuilder().create();

    /** The default encoding fot the parameters of a GET request. */
    private static final String DEFAULT_GET_PARAMS_ENCODING = "UTF-8";

    /** The default socket timeout in milliseconds. */
    private static final int DEFAULT_TIMEOUT_MS = 60000;
    private static final int DEFAULT_TIMEOUT_MS_DEBUG = 90000;
    /** The default number of retries. */
    private static final int DEFAULT_MAX_RETRIES = 0;
    /** The default backoff multiplier. */
    private static final float DEFAULT_BACKOFF_MULT = 0f;
    /** The default retry policy for IDKGsonRequests to use. */


    public static final RetryPolicy IDK_RETRY_POLICY_DEBUG = new DefaultRetryPolicy(DEFAULT_TIMEOUT_MS_DEBUG,
            DEFAULT_MAX_RETRIES, DEFAULT_BACKOFF_MULT);

    public static final RetryPolicy IDK_RETRY_POLICY = new DefaultRetryPolicy(DEFAULT_TIMEOUT_MS,
            DEFAULT_MAX_RETRIES, DEFAULT_BACKOFF_MULT);

    /**
     * Recommendation: pass the Application context in order to avoid possible memory leaks linked
     * to a destroying activity.
     *
     * @param context a context, preferably the Application context.
     */
    public IDKVolleyGateway(String userAgent, Context context) {
        if (!RequestQueuesManager.hasBeenInitialized()) {
            // Initialize request queues manager
            RequestQueuesManager.init(context);

            // Set user-agent header
            mUserAgent = userAgent;

            // Set tag for voley logging
            VolleyLog.setTag(TAG);
        }

        // Save context in order to use it in other methods
        mContext = context;
    }

    /**
     * Set the debug flag for the Api and its requests.
     *
     * @param debug true to enable debug logging, false to disable it.
     */
    @Override
    public void setDebug(boolean debug) {
        DEBUG = debug;
        VolleyLog.DEBUG = debug;
    }

    /**
     * Cancels all pending requests
     */
    @Override
    public void cancelPendingRequests() {
        RequestQueuesManager.cancelPendingRequests(TAG);
    }

    /**
     * Adds a request to non-concurrent requests queue
     * @param request Request to be added
     * @param <T> Request type
     */
    protected <T> void addToNonConcurrentRequestQueue(Request<T> request) {
        addToRequestQueue(request, TAG, "", true);
    }

    /**
     * Adds a request to non-concurrent requests queue using a custom logging tag
     * @param request Request to be added
     * @param tag Custom tag to be used for logging
     * @param <T> Request type
     */
    protected <T> void addToNonConcurrentRequestQueue(Request<T> request, String tag) {
        addToRequestQueue(request, tag, "", true);
    }

    /**
     * Adds a request to concurrent requests queue
     * @param request Request to be added
     * @param <T> Request type
     */
    protected <T> void addToConcurrentRequestQueue(Request<T> request) {
        addToRequestQueue(request, TAG, "", false);
    }

    /**
     * Adds a request to concurrent requests queue
     * @param request Request to be added
     * @param tag Custom tag to be used for logging
     * @param <T> Request type
     */
    protected <T> void addToConcurrentRequestQueue(Request<T> request, String tag) {
        addToRequestQueue(request, tag, "", false);
    }

    /**
     * Adds the specified request to the global queue, if tag is specified then it is used,
     * otherwise the default TAG is used.
     *
     * @param request the request to add to the queue.
     * @param tag the tag to set to the request, empty if default tag is desired.
     * @param logTag the tag to distinguish between HTML or Native api calls
     */
    protected <T> void addToRequestQueue(Request<T> request, String tag,
                                         String logTag, boolean blockConcurrent) {
        if (request instanceof IDKGsonRequest) {
            ((IDKGsonRequest) request)
                    .setCurrentAcceptLanguageHeaderValue(CURRENT_ACCEPT_LANGUAGE_HEADER_VALUE);
        }

        // Get request queue according to blockConcurrent parameter
        RequestQueue requestQueue;
        if (blockConcurrent) {
            requestQueue = RequestQueuesManager.getNonConcurrentRequestsQueue();
            logRequest("Adding request to non-concurrent requests queue:", request, tag, logTag);
        } else {
            requestQueue = RequestQueuesManager.getConcurrentRequestsQueue();
            logRequest("Adding request to concurrent requests queue:", request, tag, logTag);
        }

        // Add request to the corresponding queue
        requestQueue.add(request);
    }

    /**
     * Log a request with a custom message.
     *
     * @param message the message to show with the request.
     * @param request the request to log.
     * @param logTag the tag to distinguish between HTML or Native api calls
     */
    protected static <T> void logRequest(String message, Request<T> request, String tag, String logTag) {
        if (!DEBUG) {
            return;
        }

        try {
            StringBuilder log = new StringBuilder();

            String url = "";
            log.append("\n").append(message).append("\n");
            log.append(" \n");
            log.append("\n=============== ").append(logTag).append(" REQUEST ================\n");
            switch (request.getMethod()) {
                case Request.Method.GET:
                    url += "GET ";
                    break;
                case Request.Method.POST:
                    url += "POST ";
                    break;
                case Request.Method.PUT:
                    url += "PUT ";
                    break;
                case Request.Method.DELETE:
                    url += "DELETE ";
                    break;
                default:
                    url += "Request.Method." + request.getMethod();
                    break;
            }
            log.append(url).append(request.getUrl()).append("\n");

            log.append("\n=============== ").append(logTag).append(" HEADERS ================\n");
            for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
                log.append(header.getKey()).append(": ").append(header.getValue()).append("\n");
            }

            log.append("\n================= ").append(logTag).append(" BODY =================\n");
            byte[] body = request.getBody();
            if (body != null) {
                // The body encoding isn't accessible from outside the request, we assume the same
                // encoding for GET parameters will be used for POST/PUT bodies.
                String bodyStr = new String(body, DEFAULT_GET_PARAMS_ENCODING);
                log.append(bodyStr);
            }
            log.append("\n============== ").append(logTag).append(" END REQUEST =============\n");
            log.append(" \n");

            LargeTextLogger.d(tag, log);

        } catch (AuthFailureError authFailureError) {
            authFailureError.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            Log.d(tag, e.getMessage(), e);
        } catch (Exception e) {
            Log.d(tag, e.getMessage(), e);
        }
    }

    /**
     * Receive a map of key=value parameters and add them to the url as a query string. The
     * parameters are url encoded.
     *
     * @param url the url of the request.
     * @param params the map of parameters with key, value pairs.
     *
     * @return the url with the added parameters as query string.
     */
    protected String encodeGetParameters(String url, Map<String, String> params) {
        StringBuilder encodedParams = new StringBuilder();
        String encoding = DEFAULT_GET_PARAMS_ENCODING;

        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                encodedParams.append(URLEncoder.encode(entry.getKey(), encoding));
                encodedParams.append('=');
                encodedParams.append(URLEncoder.encode(entry.getValue(), encoding));
                encodedParams.append('&');
            }
            url += "?" + encodedParams.toString();
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException("Encoding not supported: " + encoding, uee);
        }

        return url;
    }

    /**
     * Receive a json object representing a map of key=value parameters and add them to the url
     * as a query string. The parameters are url encoded.
     *
     * @param url the url of the request.
     * @param params the json containing map of parameters with key, value pairs.
     *
     * @return the url with the added parameters as query string.
     */
    public String encodeGetParametersFromJson(String url, String params) {
        JSONObject json = null;
        try {
            Map<String, String> paramsMap = new HashMap<String, String>();
            json = new JSONObject(params);

            Iterator<String> iter = json.keys();
            while (iter.hasNext()) {
                String key = iter.next();
                String value = (String) json.get(key);
                paramsMap.put(key, value);
            }

            url = encodeGetParameters(url, paramsMap);
        } catch (JSONException e) {
            Log.d(TAG, "encodeGetParametersFromJson: failed parsing of Json parameters.");
        }

        return url;
    }

    public static ErrorResponse parseVolleyError(Context context, VolleyError volleyError) {
        if (volleyError instanceof HtmlFacadeError) {
            return new ErrorResponse(((HtmlFacadeError) volleyError).getHtml());
        }

        if (volleyError instanceof DecodeError) {
            ErrorResponse decodeError = new ErrorResponse(((DecodeError) volleyError).getData(),
                    ((DecodeError) volleyError).getCharset());
            decodeError.setErrorMessage(context.getString(R.string.idk_api_error_generic_message));
            logErrorResponse(decodeError);
            return decodeError;
        }

        ErrorResponse genericError = new ErrorResponse();
        if (context != null) {
            genericError.setErrorMessage(context.getString(R.string.idk_api_error_generic_message));
        }

        if (volleyError == null || volleyError.networkResponse == null
                || volleyError.networkResponse.data == null
                || volleyError.networkResponse.headers == null) {
            logErrorResponse(genericError);
            return genericError;
        }

        try {
            int statusCode = volleyError.networkResponse.statusCode;

            String charSet = HttpHeaderParser.parseCharset(volleyError.networkResponse.headers);
            String json = new String(volleyError.networkResponse.data, charSet);

            boolean isSessionExpired = statusCode == STATUS_CODE_SESSION_EXPIRED;
            boolean hasConflict = statusCode == STATUS_CODE_HAS_CONFLICT;

            // in case of expired session, session manager should be notified
            if (isSessionExpired) {
                SessionManager.closeSession();
            }

            ErrorResponse response = IDKVolleyGateway.IDK_GSON.fromJson(json, ErrorResponse.class);
            response.setSessionExpired(isSessionExpired);
            if (hasConflict) {
                String code = response.getCode();
                if (!StringUtils.isEmpty(code)) {
                    response.setInstantMoneyDisabled(
                            code.equals(ErrorResponse.ERROR_CODE_ACTIVATE_INSTANT_MONEY));
                    response.setNoAlertsContract(
                            code.equals(ErrorResponse.ERROR_CODE_ALERTS_CONTRACTS_EMPTY_LIST));
                    response.setNfcCardAlreadyActivated(
                            code.equals(ErrorResponse.ERROR_CODE_NFC_SIGN_UP_CARD));
                }
            }

            logErrorResponse(response);

            return response;
        } catch (Exception e) {
            return genericError;
        }
    }

    @Override
    public void login(SessionForm form, final IDKGatewayResponse.Listener<SessionModel>
            responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {

        String params = IDK_GSON.toJson(form);

        SessionCapturingRequest<SessionModel> request = new SessionCapturingRequest<SessionModel>(
                Request.Method.POST, SessionModel.class, SabadellApi.sSessionUrl, params,
                new Response.Listener<SessionModel>() {
                    @Override
                    public void onResponse(SessionModel session) {
                        responseListener.onResponse(session);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }, IDK_GSON, Request.Priority.HIGH
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void logout(final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.DELETE, Void.class, SabadellApi.sSessionUrl,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accounts(AccountsForm form,
            final IDKGatewayResponse.Listener<AccountsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(TYPE, form.getType());
        if (form.getPage() != null) {
            params.put(PAGE, Integer.toString(form.getPage()));
            params.put(ITEMS_PER_PAGE, Integer.toString(form.getItemsPerPage()));
            params.put(ORDER, form.getOrder());

            // Instant Selling: Added new parameter to avoid showing error messages when user has no
            // accounts. Modified by Everis Mobile SL on 22/12/2014.
            params.put(NO_ERROR, Boolean.toString(true));
        }

        if (form.getContractCCC() != null) {
            params.put(CONTRACT_CCC, form.getContractCCC());
        }

        String url = encodeGetParameters(SabadellApi.sAccountsUrl, params);
        IDKCachedGsonRequest<AccountsListModel> request = new IDKCachedGsonRequest<AccountsListModel>(
                Request.Method.GET, AccountsListModel.class, url,
                new Response.Listener<AccountsListModel>() {
                    @Override
                    public void onResponse(AccountsListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accountsAlias(AccountForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(Request.Method.PUT, Void.class,
                SabadellApi.sAccountsAlias, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(
                                parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accountMovements(AccountMovementsForm form,
            final IDKGatewayResponse.Listener<AccountMovementsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AccountMovementsListModel> request = new
                IDKGsonRequest<AccountMovementsListModel>(Request.Method.POST,
                AccountMovementsListModel.class, SabadellApi.sAccountsMovementsUrl, params,
                new Response.Listener<AccountMovementsListModel>() {
                    @Override
                    public void onResponse(AccountMovementsListModel movementsListModel) {
                        responseListener.onResponse(movementsListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accountMovementsDocument(AccountMovementDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.POST, DocumentModel.class, SabadellApi.sAccountsMovementsDocumentUrl,
                params,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel response) {
                        responseListener.onResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accountMovementReturnBill(AccountMovementReturnBillForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<BooleanResponseModel> request = new IDKGsonRequest<BooleanResponseModel>(
                Request.Method.POST, BooleanResponseModel.class,
                SabadellApi.sAccountsMovementsReturnBillUrl, params,
                new Response.Listener<BooleanResponseModel>() {
                    @Override
                    public void onResponse(BooleanResponseModel booleanResponseModel) {
                        responseListener.onResponse(booleanResponseModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accountMovementSplit(AccountMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request =
                new IDKGsonRequest<Void>(Request.Method.POST, Void.class,
                        SabadellApi.sAccountsMovementsSplitUrl, params,
                        new Response.Listener<Void>() {
                            @Override
                            public void onResponse(Void response) {
                                responseListener.onResponse(response);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accountPayers(AccountPayersForm form,
            final IDKGatewayResponse.Listener<AccountPayersModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AccountPayersModel> request = new IDKGsonRequest<AccountPayersModel>(
                Request.Method.POST, AccountPayersModel.class, SabadellApi.sAccountsPayers,
                params,
                new Response.Listener<AccountPayersModel>() {
                    @Override
                    public void onResponse(AccountPayersModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void accountTransferToCard(TransferToCardForm form,
            final IDKGatewayResponse.Listener<AccountTransferToCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<AccountTransferToCardModel> request =
                new IDKInvalidateCacheGsonRequest<AccountTransferToCardModel>(Request.Method.POST,
                        AccountTransferToCardModel.class,
                        SabadellApi.sAccountTransferToCard, params,
                        new Response.Listener<AccountTransferToCardModel>() {
                            @Override
                            public void onResponse(
                                    AccountTransferToCardModel accountTransferToCardModel) {
                                responseListener.onResponse(accountTransferToCardModel);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void activeAgentMyAvailability(MyAvailabilityForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request =
                new IDKGsonRequest<Void>(
                        Request.Method.POST, Void.class,
                        SabadellApi.sActiveAgentMyAvailability, params,
                        new Response.Listener<Void>() {
                            @Override
                            public void onResponse(Void model) {
                                responseListener.onResponse(null);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );
        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void activeAgent(AgentForm form,
            final IDKGatewayResponse.Listener<AgentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AgentModel> request =
                new IDKGsonRequest<AgentModel>(
                        Request.Method.POST, AgentModel.class,
                        SabadellApi.sActiveAgent, params,
                        new Response.Listener<AgentModel>() {
                            @Override
                            public void onResponse(AgentModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }, IDK_GSON, Request.Priority.LOW);

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void agentAvailable(
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<BooleanResponseModel> request =
                new IDKGsonRequest<BooleanResponseModel>(
                        Request.Method.GET, BooleanResponseModel.class,
                        SabadellApi.sAgentAvailable,
                        new Response.Listener<BooleanResponseModel>() {
                            @Override
                            public void onResponse(BooleanResponseModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void alertsContracts(
            final IDKGatewayResponse.Listener<AlertContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<AlertContractListModel> request = new
                IDKGsonRequest<AlertContractListModel>(Request.Method.GET,
                AlertContractListModel.class, SabadellApi.sAlertsContracts,
                new Response.Listener<AlertContractListModel>() {
                    @Override
                    public void onResponse(AlertContractListModel alertContractListModel) {
                        responseListener.onResponse(alertContractListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cards(String filter, PaginatorModel paginator,
            final IDKGatewayResponse.Listener<CardListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put(FILTER, filter);
        if (paginator != null) {
            params.put(PAGE, paginator.getPage().toString());
            params.put(ITEMS_PER_PAGE, paginator.getItemsPerPage().toString());
            params.put(ORDER, paginator.getOrder());
        }

        String url = encodeGetParameters(SabadellApi.sCardsUrl, params);
        IDKCachedGsonRequest<CardListModel> request = new IDKCachedGsonRequest<CardListModel>(
                Request.Method.GET, CardListModel.class, url,
                new Response.Listener<CardListModel>() {
                    @Override
                    public void onResponse(CardListModel cardList) {
                        responseListener.onResponse(cardList);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }, IDK_GSON
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void atmCommissions(AtmMobileCommissionForm form,
            final IDKGatewayResponse.Listener<AtmMobileCommissionListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AtmMobileCommissionListModel> request =
                new IDKGsonRequest<AtmMobileCommissionListModel>(
                        Request.Method.POST, AtmMobileCommissionListModel.class,
                        SabadellApi.sAtmCommissions, params,
                        new Response.Listener<AtmMobileCommissionListModel>() {
                            @Override
                            public void onResponse(AtmMobileCommissionListModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    public void atmCreate(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AtmMobileEnrollmentModel> request =
                new IDKGsonRequest<AtmMobileEnrollmentModel>(
                        Request.Method.POST, AtmMobileEnrollmentModel.class,
                        SabadellApi.sAtmCreate, params,
                        new Response.Listener<AtmMobileEnrollmentModel>() {
                            @Override
                            public void onResponse(AtmMobileEnrollmentModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void atmCreateOTP(OtpGenerationForm form,
            final IDKGatewayResponse.Listener<AtmMobileOtpModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AtmMobileOtpModel> request =
                new IDKGsonRequest<AtmMobileOtpModel>(
                        Request.Method.POST, AtmMobileOtpModel.class,
                        SabadellApi.sAtmCreateOTP, params,
                        new Response.Listener<AtmMobileOtpModel>() {
                            @Override
                            public void onResponse(AtmMobileOtpModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void atmEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AtmMobileEnrollmentListModel> request =
                new IDKGsonRequest<AtmMobileEnrollmentListModel>(Request.Method.POST,
                        AtmMobileEnrollmentListModel.class, SabadellApi.sAtmEnrollments, params,
                        new Response.Listener<AtmMobileEnrollmentListModel>() {
                            @Override
                            public void onResponse(AtmMobileEnrollmentListModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void atmRemoveOTP(OtpRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request =
                new IDKGsonRequest<Void>(Request.Method.POST,
                        Void.class, SabadellApi.sAtmRemoveOTP, params,
                        new Response.Listener<Void>() {
                            @Override
                            public void onResponse(Void model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void bannerProduct(BannerForm form,
            final IDKGatewayResponse.Listener<BannerModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(SCALE_FACTOR, form.getScaleFactor());
        params.put(BRAND, form.getBrand());
        params.put(IS_WEB, String.valueOf(form.isWeb()));
        params.put(PLATFORM, form.getPlatform());
        params.put(PERSONALIZATION, form.getPersonalization());
        params.put(SIGNATURE_TYPE, form.getSignatureType());

        String url = encodeGetParameters(SabadellApi.sBannerProductUrl, params);

        IDKGsonRequest<BannerModel> request = new IDKGsonRequest<BannerModel>(
                Request.Method.GET, BannerModel.class, url,
                new Response.Listener<BannerModel>() {
                    @Override
                    public void onResponse(BannerModel response) {
                        responseListener.onResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToConcurrentRequestQueue(request);
    }

    @Override
    public void bannerWallet(final BannerForm form, final IDKGatewayResponse.Listener<BannerModel>
            responseListener, final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(SCALE_FACTOR, form.getScaleFactor());
        params.put(IS_WEB, String.valueOf(form.isWeb()));
        params.put(BRAND, String.valueOf(form.getBrand()));
        params.put(WALLET_INSTALLED, String.valueOf(form.isAppInstalled()));

        String url = encodeGetParameters(SabadellApi.sBannerWalletUrl, params);

        IDKGsonRequest<BannerModel> request = new IDKGsonRequest<BannerModel>(
                Request.Method.GET, BannerModel.class, url,
                new Response.Listener<BannerModel>() {
                    @Override
                    public void onResponse(BannerModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToConcurrentRequestQueue(request);
    }

    @Override
    public void blacklist(final IDKGatewayResponse.Listener<BlackListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<BlackListModel> request = new IDKGsonRequest<BlackListModel>(
                Request.Method.GET, BlackListModel.class, SabadellApi.sBlacklistUrl,
                new Response.Listener<BlackListModel>() {
                    @Override
                    public void onResponse(BlackListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardActivation(CardActivationForm form,
            final IDKGatewayResponse.Listener<CardActivationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<CardActivationModel> request = new IDKInvalidateCacheGsonRequest<CardActivationModel>(
                Request.Method.POST, CardActivationModel.class, SabadellApi.sCardsActivationUrl,
                params,
                new Response.Listener<CardActivationModel>() {
                    @Override
                    public void onResponse(CardActivationModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardActivationPdfGeneral(DocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.GET, DocumentModel.class,
                SabadellApi.sCardsActivationConditionsGeneralUrl, null,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardActivationPdfSpecific(CardPDFConditionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(DMS, form.getDms());
        String url = encodeGetParameters(SabadellApi.sCardsActivationConditionsSpecificUrl, params);

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.GET, DocumentModel.class, url, null,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardsAlias(CardForm form, final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<Void> request = new IDKInvalidateCacheGsonRequest<Void>(
                Request.Method.PUT, Void.class, SabadellApi.sCardsAlias, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(
                                parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardBlock(CardBlockedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<Void> request = new IDKInvalidateCacheGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sCardBlocklUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardConditions(CardConditionsForm form,
            final IDKGatewayResponse.Listener<CardConditionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardConditionsModel> request = new IDKGsonRequest<CardConditionsModel>(
                Request.Method.POST, CardConditionsModel.class, SabadellApi.sCardsConditionsUrl,
                params,
                new Response.Listener<CardConditionsModel>() {
                    @Override
                    public void onResponse(CardConditionsModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardConditionsUpdate(CardConditionsUpdateForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<Void> request = new IDKInvalidateCacheGsonRequest<Void>(
                Request.Method.PUT, Void.class, SabadellApi.sCardsConditionsUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardMovementGeopoint(CardMovementGeoPointForm cardMovementGeoPointForm,
            final IDKGatewayResponse.Listener<CardMovementGeoPointModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(cardMovementGeoPointForm);

        IDKGsonRequest<CardMovementGeoPointModel> request = new IDKGsonRequest<CardMovementGeoPointModel>(
                Request.Method.POST, CardMovementGeoPointModel.class,
                SabadellApi.sCardMovementsGeopointUrl, params,
                new Response.Listener<CardMovementGeoPointModel>() {
                    @Override
                    public void onResponse(CardMovementGeoPointModel cardMovementGeoPointModel) {
                        responseListener.onResponse(cardMovementGeoPointModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardMovements(CardAllMovementsForm card,
            final IDKGatewayResponse.Listener<CardMovementsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(card);

        IDKGsonRequest<CardMovementsListModel> request = new IDKGsonRequest<CardMovementsListModel>(
                Request.Method.POST, CardMovementsListModel.class,
                SabadellApi.sCardMovementsUrl, params,
                new Response.Listener<CardMovementsListModel>() {
                    @Override
                    public void onResponse(CardMovementsListModel cardContract) {
                        responseListener.onResponse(cardContract);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardMovementsUnconfirmedLast(CardLastMovementForm form,
            final IDKGatewayResponse.Listener<CardLastMovementModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardLastMovementModel> request = new IDKGsonRequest<CardLastMovementModel>(
                Request.Method.POST, CardLastMovementModel.class,
                SabadellApi.sCardMovementsUnconfirmedLastUrl, params,
                new Response.Listener<CardLastMovementModel>() {
                    @Override
                    public void onResponse(CardLastMovementModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardMovementsCreditSplitPeriods(CardMovementsCreditSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsCreditSplitPeriodsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardMovementsCreditSplitPeriodsModel> request =
                new IDKGsonRequest<CardMovementsCreditSplitPeriodsModel>(
                        Request.Method.POST, CardMovementsCreditSplitPeriodsModel.class,
                        SabadellApi.sCreditSplitPeriodUrl,
                        params,
                        new Response.Listener<CardMovementsCreditSplitPeriodsModel>() {
                            @Override
                            public void onResponse(
                                    CardMovementsCreditSplitPeriodsModel periodsModel) {
                                responseListener.onResponse(periodsModel);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardMovementsCreditSplit(CardMovementsCreditSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<Void> request = new IDKInvalidateCacheGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sCreditSplitUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardMovementsDebitSplitPeriods(CardMovementsDebitSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsDebitSplitPeriodsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardMovementsDebitSplitPeriodsModel> request =
                new IDKGsonRequest<CardMovementsDebitSplitPeriodsModel>(
                        Request.Method.POST, CardMovementsDebitSplitPeriodsModel.class,
                        SabadellApi.sDebitSplitPeriodUrl, params,
                        new Response.Listener<CardMovementsDebitSplitPeriodsModel>() {
                            @Override
                            public void onResponse(
                                    CardMovementsDebitSplitPeriodsModel periodsModel) {
                                responseListener.onResponse(periodsModel);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardMovementsDebitSplit(CardMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<Void> request = new IDKInvalidateCacheGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sDebitSplitUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardPinRecovery(CardSecondKeyForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<StringResponseModel> request = new
                IDKInvalidateCacheGsonRequest<StringResponseModel>(Request.Method.POST,
                StringResponseModel.class,
                SabadellApi.sCardPinRecovery, params,
                new Response.Listener<StringResponseModel>() {
                    @Override
                    public void onResponse(StringResponseModel stringResponseModel) {
                        responseListener.onResponse(stringResponseModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardPrepaidReload(CardPrepaidReloadForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<Void> request = new
                IDKInvalidateCacheGsonRequest<Void>(Request.Method.POST, Void.class,
                SabadellApi.sCardPrepaidReload, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    public void cardPrepaidReloadAmounts(CardForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadAmountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardPrepaidReloadAmountsModel> request = new
                IDKGsonRequest<CardPrepaidReloadAmountsModel>(Request.Method.POST,
                CardPrepaidReloadAmountsModel.class, SabadellApi.sCardPrepaidReloadAmounts, params,
                new Response.Listener<CardPrepaidReloadAmountsModel>() {
                    @Override
                    public void onResponse(
                            CardPrepaidReloadAmountsModel cardPrepaidReloadAmountsModel) {
                        responseListener.onResponse(cardPrepaidReloadAmountsModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardPrepaidReloadCommissions(CardPrepaidReloadCommissionsForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadCommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardPrepaidReloadCommissionsModel> request = new
                IDKGsonRequest<CardPrepaidReloadCommissionsModel>(Request.Method.POST,
                CardPrepaidReloadCommissionsModel.class, SabadellApi.sCardPrepaidReloadCommissions,
                params,
                new Response.Listener<CardPrepaidReloadCommissionsModel>() {
                    @Override
                    public void onResponse(
                            CardPrepaidReloadCommissionsModel cardPrepaidReloadCommissionsModel) {
                        responseListener.onResponse(cardPrepaidReloadCommissionsModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardProfiles(CardForm form,
            final IDKGatewayResponse.Listener<CardProfileRulesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<CardProfileRulesListModel> request =
                new IDKInvalidateCacheGsonRequest<CardProfileRulesListModel>(
                        Request.Method.POST, CardProfileRulesListModel.class,
                        SabadellApi.sProfilesRulesUrl, params,
                        new Response.Listener<CardProfileRulesListModel>() {
                            @Override
                            public void onResponse(CardProfileRulesListModel rulesList) {
                                responseListener.onResponse(rulesList);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardProfilesCountries(
            final IDKGatewayResponse.Listener<CardProfileCountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<CardProfileCountriesListModel> request =
                new IDKGsonRequest<CardProfileCountriesListModel>(
                        Request.Method.GET, CardProfileCountriesListModel.class,
                        SabadellApi.sProfilesCountriesUrl,
                        new Response.Listener<CardProfileCountriesListModel>() {
                            @Override
                            public void onResponse(
                                    CardProfileCountriesListModel countriesListModel) {
                                responseListener.onResponse(countriesListModel);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardProfilesRules(CardProfileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request =
                new IDKGsonRequest<Void>(
                        Request.Method.PUT, Void.class,
                        SabadellApi.sProfilesRulesUrl, params,
                        new Response.Listener<Void>() {
                            @Override
                            public void onResponse(Void rulesList) {
                                responseListener.onResponse(rulesList);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardSettlements(CardSettlementsForm form,
            final IDKGatewayResponse.Listener<CardSettlementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardSettlementsModel> request = new IDKGsonRequest<CardSettlementsModel>(
                Request.Method.POST, CardSettlementsModel.class, SabadellApi.sCardSettlementsUrl,
                params,
                new Response.Listener<CardSettlementsModel>() {
                    @Override
                    public void onResponse(CardSettlementsModel cardSettlements) {
                        responseListener.onResponse(cardSettlements);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void cardSettlementDoc(CardSettlementDocForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(ID, form.getId());
        params.put(FORMAT, form.getFormat());
        String url = encodeGetParameters(SabadellApi.sCardSettlementsDocumentUrl, params);

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.GET, DocumentModel.class, url,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);

    }

    @Override
    public void cardSticker(CardStickerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sCardStickerUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void changePin(ChangePinForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.PUT, Void.class, SabadellApi.sChangePinUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void clickToCall(ClickToCallForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sClickToCallUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void contracts(UserForm form,
            final IDKGatewayResponse.Listener<ContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<ContractListModel> request = new IDKGsonRequest<ContractListModel>(
                Request.Method.POST, ContractListModel.class, SabadellApi.sContractsUrl, params,
                new Response.Listener<ContractListModel>() {
                    @Override
                    public void onResponse(ContractListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void companies(CompanyForm form,
            final IDKGatewayResponse.Listener<CompaniesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CompaniesListModel> request = new IDKGsonRequest<CompaniesListModel>(
                Request.Method.POST, CompaniesListModel.class,
                SabadellApi.sCompaniesUrl, params,
                new Response.Listener<CompaniesListModel>() {
                    @Override
                    public void onResponse(CompaniesListModel companiesListModel) {
                        responseListener.onResponse(companiesListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void companyCreditLimits(LimitForm form,
            final IDKGatewayResponse.Listener<CompanyCreditLimitsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CompanyCreditLimitsModel> request = new IDKGsonRequest<CompanyCreditLimitsModel>(
                Request.Method.POST, CompanyCreditLimitsModel.class,
                SabadellApi.sCompaniesCreditLimits, params,
                new Response.Listener<CompanyCreditLimitsModel>() {
                    @Override
                    public void onResponse(CompanyCreditLimitsModel companiesListModel) {
                        responseListener.onResponse(companiesListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void companyCreditLimitsAssigned(LimitAssignedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class,
                SabadellApi.sCompaniesCreditLimitsAssigned, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void companiesListModel) {
                        responseListener.onResponse(companiesListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void companyCreditLimitsConditions(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.GET, DocumentModel.class,
                SabadellApi.sCompaniesCreditLimitsCondition,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel companiesListModel) {
                        responseListener.onResponse(companiesListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void contactDataUpdateEmail(UpdateEmailForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.PUT, Void.class,
                SabadellApi.sContactDataUpdateEmailUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void contactDataUpdateEmailPdf(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.GET, DocumentModel.class, SabadellApi.sContactDataPdfUrl, "",
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void countries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {

        IDKGsonRequest<CountriesListModel> request = new IDKGsonRequest<CountriesListModel>(
                Request.Method.GET, CountriesListModel.class, SabadellApi.sCountriesUrl,
                new Response.Listener<CountriesListModel>() {
                    @Override
                    public void onResponse(CountriesListModel companiesListModel) {
                        responseListener.onResponse(companiesListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void creditLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class,
                SabadellApi.sCreditLimitUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void responseModel) {
                        responseListener.onResponse(responseModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void debitLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class,
                SabadellApi.sDebitLimitUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void responseModel) {
                        responseListener.onResponse(responseModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void directDebit(DirectDebitListForm form,
            final IDKGatewayResponse.Listener<DirectDebitListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<DirectDebitListModel> request = new IDKGsonRequest<DirectDebitListModel>(
                Request.Method.POST, DirectDebitListModel.class,
                SabadellApi.sDirectDebitUrl, params,
                new Response.Listener<DirectDebitListModel>() {
                    @Override
                    public void onResponse(DirectDebitListModel directDebitListModel) {
                        responseListener.onResponse(directDebitListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void directDebitUpdate(DirectDebitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<Void> request = new IDKInvalidateCacheGsonRequest<Void>(
                Request.Method.PUT, Void.class,
                SabadellApi.sDirectDebitUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void directDebitListModel) {
                        responseListener.onResponse(directDebitListModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void inbox(InboxForm form,
            final IDKGatewayResponse.Listener<InboxesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<InboxesModel> request = new IDKGsonRequest<InboxesModel>(
                Request.Method.GET, InboxesModel.class, SabadellApi.sInboxUrl, params,
                new Response.Listener<InboxesModel>() {
                    @Override
                    public void onResponse(InboxesModel inboxesModel) {
                        responseListener.onResponse(inboxesModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void informational(InformationalForm form,
            final IDKGatewayResponse.Listener<InformationalModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<InformationalModel> request = new IDKGsonRequest<InformationalModel>(
                Request.Method.POST, InformationalModel.class, SabadellApi.sInformationalUrl, params,
                new Response.Listener<InformationalModel>() {
                    @Override
                    public void onResponse(InformationalModel informationalModel) {
                        responseListener.onResponse(informationalModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        responseListener.onResponse(null);
                    }
                }
        );
        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void instantCashCommission(CardToAccountCommissionForm form,
            final IDKGatewayResponse.Listener<CardToAccountCommissionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CardToAccountCommissionModel> request = new IDKGsonRequest<CardToAccountCommissionModel>(
                Request.Method.POST, CardToAccountCommissionModel.class,
                SabadellApi.sInstantCashCommissionUrl, params,
                new Response.Listener<CardToAccountCommissionModel>() {
                    @Override
                    public void onResponse(
                            CardToAccountCommissionModel cardToAccountCommissionModel) {
                        responseListener.onResponse(cardToAccountCommissionModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void instantCashTransfer(CardToAccountTransferForm form,
            final IDKGatewayResponse.Listener<CardToAccountTransferModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<CardToAccountTransferModel> request = new IDKInvalidateCacheGsonRequest<CardToAccountTransferModel>(
                Request.Method.POST, CardToAccountTransferModel.class,
                SabadellApi.sCardToAccountUrl, params,
                new Response.Listener<CardToAccountTransferModel>() {
                    @Override
                    public void onResponse(CardToAccountTransferModel cardToAccountTransferModel) {
                        responseListener.onResponse(cardToAccountTransferModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void instantCheck(CheckForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CheckModel> request = new IDKGsonRequest<CheckModel>(
                Request.Method.POST, CheckModel.class, SabadellApi.sInstantCheckUrl, params,
                new Response.Listener<CheckModel>() {
                    @Override
                    public void onResponse(CheckModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void instantCheckOcr(CheckInstantForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CheckModel> request = new IDKGsonRequest<CheckModel>(
                Request.Method.POST, CheckModel.class, SabadellApi.sInstantCheckOcrUrl, params,
                new Response.Listener<CheckModel>() {
                    @Override
                    public void onResponse(CheckModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void instantMoney(InstantMoneyForm form,
            final IDKGatewayResponse.Listener<InstantMoneyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<InstantMoneyModel> request =
                new IDKInvalidateCacheGsonRequest<InstantMoneyModel>(Request.Method.POST,
                        InstantMoneyModel.class, SabadellApi.sInstantMoney,
                        params,
                        new Response.Listener<InstantMoneyModel>() {
                            @Override
                            public void onResponse(InstantMoneyModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void instantMoneyActivation(InstantMoneyActivationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sInstantMoneyActivation, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void instantMoneyCommissions(InstantMoneyCommissionsForm form,
            final IDKGatewayResponse.Listener<InstantMoneyCommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<InstantMoneyCommissionsModel> request =
                new IDKGsonRequest<InstantMoneyCommissionsModel>(
                        Request.Method.POST, InstantMoneyCommissionsModel.class,
                        SabadellApi.sInstantMoneyCommissions, params,
                        new Response.Listener<InstantMoneyCommissionsModel>() {
                            @Override
                            public void onResponse(InstantMoneyCommissionsModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void mailDocument(MailDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.POST, DocumentModel.class, SabadellApi.sMailsDocumentUrl, params,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void mailList(MailListForm form,
            final IDKGatewayResponse.Listener<MailListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<MailListModel> request = new IDKGsonRequest<MailListModel>(
                Request.Method.POST, MailListModel.class, SabadellApi.sMailsUrl, params,
                new Response.Listener<MailListModel>() {
                    @Override
                    public void onResponse(MailListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void mailMarkAsRead(MailsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.PUT, Void.class, SabadellApi.sMailsUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void menu(MenuForm form,
            final IDKGatewayResponse.Listener<MenuModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(SCALE_FACTOR, form.getScaleFactor());
        params.put(BRAND, form.getBrand());
        params.put(IS_WEB, String.valueOf(form.isWeb()));
        params.put(IS_PILOT, String.valueOf(form.isPilot()));

        String url = encodeGetParameters(SabadellApi.sMenuUrl, params);

        SessionCapturingRequestNotLogged<MenuModel> request = new SessionCapturingRequestNotLogged<MenuModel>(
                Request.Method.GET, MenuModel.class, url,
                new Response.Listener<MenuModel>() {
                    @Override
                    public void onResponse(MenuModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void message(PushMessageForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<PushMessageModel> request = new IDKGsonRequest<PushMessageModel>(
                Request.Method.POST, PushMessageModel.class, SabadellApi.sMessageUrl, params,
                new Response.Listener<PushMessageModel>() {
                    @Override
                    public void onResponse(PushMessageModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void messageList(PushMessageListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<PushMessageListModel> request = new IDKGsonRequest<PushMessageListModel>(
                Request.Method.POST, PushMessageListModel.class, SabadellApi.sMessagesUrl, params,
                new Response.Listener<PushMessageListModel>() {
                    @Override
                    public void onResponse(PushMessageListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void messageMarkAsRead(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.PUT, Void.class, SabadellApi.sMessageUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void messageRemove(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sMessagesRemoveUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void namingList(final IDKGatewayResponse.Listener<JSONObject> responseListener,
             final IDKGatewayResponse.ErrorListener errorListener) {

        IDKGsonRequest<JSONObject> request = new IDKGsonRequest<JSONObject>(
                Request.Method.GET, JSONObject.class, SabadellApi.sNamingList,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject json) {
                        responseListener.onResponse(json);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionInboxEnrollment(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AtmMobileEnrollmentModel> request = new IDKGsonRequest<AtmMobileEnrollmentModel>(
                Request.Method.POST, AtmMobileEnrollmentModel.class,
                SabadellApi.sNosessionInboxEnrollmentUrl, params,
                new Response.Listener<AtmMobileEnrollmentModel>() {
                    @Override
                    public void onResponse(AtmMobileEnrollmentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionInboxEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AtmMobileEnrollmentListModel> request = new IDKGsonRequest<AtmMobileEnrollmentListModel>(
                Request.Method.POST, AtmMobileEnrollmentListModel.class,
                SabadellApi.sNosessionInboxEnrollmentsUrl, params,
                new Response.Listener<AtmMobileEnrollmentListModel>() {
                    @Override
                    public void onResponse(AtmMobileEnrollmentListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionInboxMessage(NoSessionInboxForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<PushMessageModel> request = new IDKGsonRequest<PushMessageModel>(
                Request.Method.POST, PushMessageModel.class,
                SabadellApi.sNosessionInboxMessageUrl, params,
                new Response.Listener<PushMessageModel>() {
                    @Override
                    public void onResponse(PushMessageModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionInboxMessageDelete(NoSessionInboxActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class,
                SabadellApi.sNosessionInboxMessageDeleteUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionInboxMessageMarkAsRead(NoSessionInboxActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.PUT, Void.class, SabadellApi.sNosessionInboxMessageUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionInboxMessages(NoSessionInboxListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<PushMessageListModel> request = new IDKGsonRequest<PushMessageListModel>(
                Request.Method.POST, PushMessageListModel.class,
                SabadellApi.sNosessionInboxMessagesUrl, params,
                new Response.Listener<PushMessageListModel>() {
                    @Override
                    public void onResponse(PushMessageListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionInboxUnenrollment(EnrollmentRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class,
                SabadellApi.sNosessionInboxUnenrollmentUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionNotifications(NoSessionNotificationsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sNosessionNotificationsUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void noSessionTpc(NoSessionTpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<KeyModel> request = new IDKGsonRequest<KeyModel>(
                Request.Method.POST, KeyModel.class, SabadellApi.sNosessionTpcUrl, params,
                new Response.Listener<KeyModel>() {
                    @Override
                    public void onResponse(KeyModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void notification(NotificationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sNotificationUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void otpTpcGeneration(OtpForm form,
            final IDKGatewayResponse.Listener<OtpQueryKeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<OtpQueryKeyModel> request = new IDKGsonRequest<OtpQueryKeyModel>(
                Request.Method.POST, OtpQueryKeyModel.class, SabadellApi.sTpcOtp, params,
                new Response.Listener<OtpQueryKeyModel>() {
                    @Override
                    public void onResponse(OtpQueryKeyModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void offices(OfficesSearchForm form,
            final IDKGatewayResponse.Listener<OfficeListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();

        String address = form.getAddress();
        if (!StringUtils.isEmpty(address)) {
            params.put(ADDRESS, address);
        } else {
            params.put(BRAND, String.valueOf(form.getBrand()));
            params.put(LAT, String.valueOf(form.getLat()));
            params.put(LNG, String.valueOf(form.getLng()));
        }
        params.put(NUM_OFFICES, String.valueOf(form.getNumOffices()));
        String url = encodeGetParameters(SabadellApi.sOfficesUrl, params);

        IDKGsonRequest<OfficeListModel> request = new IDKGsonRequest<OfficeListModel>(
                Request.Method.GET, OfficeListModel.class, url,
                new Response.Listener<OfficeListModel>() {
                    @Override
                    public void onResponse(OfficeListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void ownTransfer(OwnTransferForm form,
            final IDKGatewayResponse.Listener<OwnTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<OwnTransferResponseModel> request = new IDKInvalidateCacheGsonRequest<OwnTransferResponseModel>(
                Request.Method.POST, OwnTransferResponseModel.class, SabadellApi.sTransferOwnUrl,
                params,
                new Response.Listener<OwnTransferResponseModel>() {
                    @Override
                    public void onResponse(OwnTransferResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void ownTransferConditionsDocument(OwnTransferConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);
        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.POST, DocumentModel.class,
                SabadellApi.sTransferOwnConditionsDocumentUrl, params,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel documentModel) {
                        responseListener.onResponse(documentModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void products(final IDKGatewayResponse.Listener<ProductsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKCachedGsonRequest<ProductsListModel> request = new IDKCachedGsonRequest<ProductsListModel>(
                Request.Method.GET, ProductsListModel.class, SabadellApi.sProductsUrl,
                new Response.Listener<ProductsListModel>() {
                    @Override
                    public void onResponse(ProductsListModel productsModel) {
                        responseListener.onResponse(productsModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void serviceHealth(final IDKGatewayResponse.Listener<Void> responseListener,
                              final IDKGatewayResponse.ErrorListener errorListener) {

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(Request.Method.GET,Void.class,SabadellApi.sServiceHealth,
        new Response.Listener<Void>() {
            @Override
            public void onResponse(Void response) {
                responseListener.onResponse(response);
            }
        },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                }
            }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void serviceHealthFake(int operation, final IDKGatewayResponse.Listener<Void> responseListener,
                              final IDKGatewayResponse.ErrorListener errorListener) {

        Map attr = new HashMap<String,String>();
        attr.put(("operation"), Integer.toString(operation));
        String params = encodeGetParameters(SabadellApi.sServiceHealth,attr);
        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(Request.Method.GET,Void.class,params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void response) {
                        responseListener.onResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void productsCards(ProductsCardsForm form,
            final IDKGatewayResponse.Listener<ProductsCardsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<ProductsCardsModel> request = new IDKGsonRequest<ProductsCardsModel>(
                Request.Method.POST, ProductsCardsModel.class, SabadellApi.sProductsCardsUrl,
                params,
                new Response.Listener<ProductsCardsModel>() {
                    @Override
                    public void onResponse(ProductsCardsModel productsCardsModel) {
                        responseListener.onResponse(productsCardsModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void promolayer(PromoLayerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(PROMOLAYER_STATUS, form.getStatus());
        String url = encodeGetParameters(
                SabadellApi.sPromoLayerUrl + SabadellApi.SLASH + form.getLayerCode(), params);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.GET, Void.class, url,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void response) {
                        responseListener.onResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void promolayerAvailable(PromoLayerAvailableForm form,
            final IDKGatewayResponse.Listener<PromoLayerResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(PROMOLAYER_BRAND, form.getBrand());

        String urlWithPromoLayerCode = SabadellApi.sPromoLayerAvailableUrl
                .replace(PromoLayerAvailableForm.PROMOLAYER_CODE,
                        PromoLayerAvailableForm.PROMOLAYER_CODE_NO_SESSION_INBOX);

        String url = encodeGetParameters(urlWithPromoLayerCode, params);

        IDKGsonRequest<PromoLayerResultModel> request = new IDKGsonRequest<PromoLayerResultModel>(
                Request.Method.GET, PromoLayerResultModel.class, url,
                new Response.Listener<PromoLayerResultModel>() {
                    @Override
                    public void onResponse(PromoLayerResultModel response) {
                        responseListener.onResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void pushContract(PushCreationForm form,
            final IDKGatewayResponse.Listener<AlertContractModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AlertContractModel> request = new IDKGsonRequest<AlertContractModel>(
                Request.Method.POST, AlertContractModel.class, SabadellApi.sPushContractUrl, params,
                new Response.Listener<AlertContractModel>() {
                    @Override
                    public void onResponse(AlertContractModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void pushContracts(
            final IDKGatewayResponse.Listener<AlertContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {

        IDKGsonRequest<AlertContractListModel> request = new IDKGsonRequest<AlertContractListModel>(
                Request.Method.GET, AlertContractListModel.class, SabadellApi.sPushContractsUrl,
                new Response.Listener<AlertContractListModel>() {
                    @Override
                    public void onResponse(AlertContractListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void pushDeviceRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<PushDeviceResponseModel> request = new IDKGsonRequest<PushDeviceResponseModel>(
                Request.Method.POST, PushDeviceResponseModel.class, SabadellApi.sPushDeviceUrl,
                params,
                new Response.Listener<PushDeviceResponseModel>() {
                    @Override
                    public void onResponse(PushDeviceResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void pushDeviceRemove(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sPushDeviceRemoveUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void pushDevices(PushDeviceListForm form,
            final IDKGatewayResponse.Listener<PushDeviceListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<PushDeviceListModel> request = new IDKGsonRequest<PushDeviceListModel>(
                Request.Method.POST, PushDeviceListModel.class, SabadellApi.sPushDevicesUrl, params,
                new Response.Listener<PushDeviceListModel>() {
                    @Override
                    public void onResponse(PushDeviceListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void pushDeviceRefreshRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<PushDeviceResponseModel> request = new IDKGsonRequest<PushDeviceResponseModel>(
                Request.Method.POST, PushDeviceResponseModel.class, SabadellApi.sRefreshUrl, params,
                new Response.Listener<PushDeviceResponseModel>() {
                    @Override
                    public void onResponse(PushDeviceResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }, IDK_GSON, Request.Priority.LOW
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void riskRecords(RiskListForm form,
            final IDKGatewayResponse.Listener<RiskRecordListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<RiskRecordListModel> request = new IDKGsonRequest<RiskRecordListModel>(
                Request.Method.POST, RiskRecordListModel.class, SabadellApi.sRiskRecordsUrl, params,
                new Response.Listener<RiskRecordListModel>() {
                    @Override
                    public void onResponse(RiskRecordListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void secondKey(SecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(OPERATION_CODE, form.getOperationCode());
        params.put(REGISTERED_DEVICE, String.valueOf(form.isRegisteredDevice()));
        String url = encodeGetParameters(SabadellApi.sSecondKeyUrl, params);

        IDKGsonRequest<KeyModel> request = new IDKGsonRequest<KeyModel>(
                Request.Method.GET, KeyModel.class, url,
                new Response.Listener<KeyModel>() {
                    @Override
                    public void onResponse(KeyModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void status(String statusAppCode,
            final IDKGatewayResponse.Listener<StatusModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String statusUrl = SabadellApi.sStatusUrl + SabadellApi.SLASH + statusAppCode;
        IDKGsonRequest<StatusModel> request = new IDKGsonRequest<StatusModel>(
                Request.Method.GET, StatusModel.class, statusUrl,
                new Response.Listener<StatusModel>() {
                    @Override
                    public void onResponse(StatusModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void sessionAnonymousLogin(SessionAnonymousForm form,
            final IDKGatewayResponse.Listener<UserModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        SessionCapturingRequest<UserModel> request = new SessionCapturingRequest<UserModel>(
                Request.Method.POST, UserModel.class, SabadellApi.sSessionAnonymousUrl, params,
                new Response.Listener<UserModel>() {
                    @Override
                    public void onResponse(UserModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void sessionAnonymousLogout(final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.DELETE, Void.class, SabadellApi.sSessionAnonymousUrl,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcCreate(TpcEnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TpcKeyListModel> request = new IDKGsonRequest<TpcKeyListModel>(
                Request.Method.POST, TpcKeyListModel.class, SabadellApi.sTpcEnrollmentUrl, params,
                new Response.Listener<TpcKeyListModel>() {
                    @Override
                    public void onResponse(TpcKeyListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<AtmMobileEnrollmentListModel> request =
                new IDKGsonRequest<AtmMobileEnrollmentListModel>(Request.Method.POST,
                        AtmMobileEnrollmentListModel.class, SabadellApi.sTpcEnrollmentsUrl, params,
                        new Response.Listener<AtmMobileEnrollmentListModel>() {
                            @Override
                            public void onResponse(AtmMobileEnrollmentListModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcKeys(TpcKeysOfflineForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TpcKeyListModel> request =
                new IDKGsonRequest<TpcKeyListModel>(Request.Method.POST,
                        TpcKeyListModel.class, SabadellApi.sTpcKeysUrl, params,
                        new Response.Listener<TpcKeyListModel>() {
                            @Override
                            public void onResponse(TpcKeyListModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcMobile(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request =
                new IDKGsonRequest<Void>(Request.Method.POST,
                        Void.class, SabadellApi.sTpcMobileUrl, params,
                        new Response.Listener<Void>() {
                            @Override
                            public void onResponse(Void model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcMobileUpdate(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request =
                new IDKGsonRequest<Void>(Request.Method.PUT,
                        Void.class, SabadellApi.sTpcMobileUrl, params,
                        new Response.Listener<Void>() {
                            @Override
                            public void onResponse(Void model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcSecondKey(TpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<KeyModel> request =
                new IDKGsonRequest<KeyModel>(Request.Method.POST, KeyModel.class,
                        SabadellApi.sTpcUrl, params,
                        new Response.Listener<KeyModel>() {
                            @Override
                            public void onResponse(KeyModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcUpdateProcessPage1(UpdateProcessPage1Form form,
            final IDKGatewayResponse.Listener<ContractResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<ContractResponseModel> request = new IDKGsonRequest<ContractResponseModel>(
                Request.Method.POST, ContractResponseModel.class,
                SabadellApi.sTpcUpdateProcessPage1, params,
                new Response.Listener<ContractResponseModel>() {
                    @Override
                    public void onResponse(ContractResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpcUpdateProcessPage2(UpdateProcessPage2Form form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(
                Request.Method.POST, Void.class, SabadellApi.sTpcUpdateProcessPage2, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpvMerchants(MerchantsListForm form,
            final IDKGatewayResponse.Listener<MerchantListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<MerchantListModel> request = new IDKGsonRequest<MerchantListModel>(
                Request.Method.POST, MerchantListModel.class, SabadellApi.sTpvMerchantsUrl, params,
                new Response.Listener<MerchantListModel>() {
                    @Override
                    public void onResponse(MerchantListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpvTerminals(TerminalsForm form,
            final IDKGatewayResponse.Listener<TerminalListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TerminalListModel> request = new IDKGsonRequest<TerminalListModel>(
                Request.Method.POST, TerminalListModel.class, SabadellApi.sTpvMerchantsTerminalsUrl,
                params,
                new Response.Listener<TerminalListModel>() {
                    @Override
                    public void onResponse(TerminalListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpvOperations(OperationListForm form,
            final IDKGatewayResponse.Listener<TpvOperationListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TpvOperationListModel> request = new IDKGsonRequest<TpvOperationListModel>(
                Request.Method.POST, TpvOperationListModel.class, SabadellApi.sTpvOperationsUrl,
                params,
                new Response.Listener<TpvOperationListModel>() {
                    @Override
                    public void onResponse(TpvOperationListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpvOperationsOperation(NewOperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TpvOperationModel> request = new IDKGsonRequest<TpvOperationModel>(
                Request.Method.POST, TpvOperationModel.class,
                SabadellApi.sTpvOperationsOperationUrl, params,
                new Response.Listener<TpvOperationModel>() {
                    @Override
                    public void onResponse(TpvOperationModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpvOperationsOperationStatus(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TpvOperationModel> request = new IDKGsonRequest<TpvOperationModel>(
                Request.Method.POST, TpvOperationModel.class,
                SabadellApi.sTpvOperationsOperationStatusUrl, params,
                new Response.Listener<TpvOperationModel>() {
                    @Override
                    public void onResponse(TpvOperationModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void tpvOperationsRefund(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TpvOperationModel> request = new IDKGsonRequest<TpvOperationModel>(
                Request.Method.POST, TpvOperationModel.class,
                SabadellApi.sTpvOperationsRefundUrl, params,
                new Response.Listener<TpvOperationModel>() {
                    @Override
                    public void onResponse(TpvOperationModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transactionMonitoring(TransactionmonitoringForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<KeyModel> request = new IDKGsonRequest<KeyModel>(
                Request.Method.POST, KeyModel.class, SabadellApi.sTransactionMonitoringUrl, params,
                new Response.Listener<KeyModel>() {
                    @Override
                    public void onResponse(KeyModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferCancel(TransferCancelForm form,
            final IDKGatewayResponse.Listener<TransferCancelModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TransferCancelModel> request = new IDKGsonRequest<TransferCancelModel>
                (Request.Method.POST, TransferCancelModel.class, SabadellApi.sTransferCancelUrl,
                        params,
                        new Response.Listener<TransferCancelModel>() {
                            @Override
                            public void onResponse(TransferCancelModel cancelTransferModel) {
                                responseListener.onResponse(cancelTransferModel);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferCancelConditionsDocument(TransferCancelConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.POST, DocumentModel.class,
                SabadellApi.sTransferCancelConditionsDocument, params,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(
                                parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<TransferResponseModel> request = new IDKInvalidateCacheGsonRequest<TransferResponseModel>(
                Request.Method.POST, TransferResponseModel.class,
                SabadellApi.sTransfersInternationalUrl, params,
                new Response.Listener<TransferResponseModel>() {
                    @Override
                    public void onResponse(TransferResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalBanks(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BanksModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String url = SabadellApi.sTransfersInternationalCountriesUrl + "/" +
                form.getCountryKey() + "/" + SabadellApi.URL_BANKS_WS;

        IDKGsonRequest<BanksModel> request = new IDKGsonRequest<BanksModel>(
                Request.Method.GET, BanksModel.class, url,
                new Response.Listener<BanksModel>() {
                    @Override
                    public void onResponse(BanksModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<BeneficiariesModel> request = new IDKGsonRequest<BeneficiariesModel>(
                Request.Method.GET, BeneficiariesModel.class,
                SabadellApi.sTransfersInternationalBeneficiariesUrl,
                new Response.Listener<BeneficiariesModel>() {
                    @Override
                    public void onResponse(BeneficiariesModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<BeneficiaryResultModel> request = new IDKGsonRequest<BeneficiaryResultModel>(
                Request.Method.POST, BeneficiaryResultModel.class,
                SabadellApi.sTransfersInternationalBeneficiariesUrl, params,
                new Response.Listener<BeneficiaryResultModel>() {
                    @Override
                    public void onResponse(BeneficiaryResultModel beneficiaryModel) {
                        responseListener.onResponse(beneficiaryModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(Request.Method.POST,
                Void.class, SabadellApi.sTransfersInternationalBeneficiariesDeleteUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        BeneficiaryModel beneficiary = form.getBeneficiary();

        Map<String, String> params = new HashMap<String, String>();
        params.put(BENEFICIARY_NAME, beneficiary.getName());
        String url = encodeGetParameters(SabadellApi.sTransfersInternationalBeneficiariesUrl +
                SabadellApi.SLASH + beneficiary.getBeneficiaryId(), params);

        IDKGsonRequest<BeneficiaryResultModel> request = new IDKGsonRequest<BeneficiaryResultModel>(
                Request.Method.GET, BeneficiaryResultModel.class, url,
                new Response.Listener<BeneficiaryResultModel>() {
                    @Override
                    public void onResponse(BeneficiaryResultModel beneficiaryModel) {
                        responseListener.onResponse(beneficiaryModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<BeneficiaryResultModel> request = new IDKGsonRequest<BeneficiaryResultModel>(
                Request.Method.PUT, BeneficiaryResultModel.class,
                SabadellApi.sTransfersInternationalBeneficiariesUrl, params,
                new Response.Listener<BeneficiaryResultModel>() {
                    @Override
                    public void onResponse(BeneficiaryResultModel beneficiaryModel) {
                        responseListener.onResponse(beneficiaryModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalBic(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BicsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String url = null;
        String cityEncoded = form.getCityKey();
        try {
            cityEncoded = URLEncoder.encode(form.getCityKey(), DEFAULT_GET_PARAMS_ENCODING);
            cityEncoded = cityEncoded.replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
        }

        url = SabadellApi.sTransfersInternationalCountriesUrl + SabadellApi.SLASH +
                form.getCountryKey() + SabadellApi.URL_BANKS_WS + SabadellApi.SLASH +
                form.getBankKey() + SabadellApi.URL_CITIES_WS + SabadellApi.SLASH +
                cityEncoded + SabadellApi.URL_BIC_WS;

        IDKGsonRequest<BicsModel> request = new IDKGsonRequest<BicsModel>(
                Request.Method.GET, BicsModel.class, url,
                new Response.Listener<BicsModel>() {
                    @Override
                    public void onResponse(BicsModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalCities(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<CitiesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String url = SabadellApi.sTransfersInternationalCountriesUrl + SabadellApi.SLASH +
                form.getCountryKey() + SabadellApi.URL_BANKS_WS + SabadellApi.SLASH +
                form.getBankKey() + SabadellApi.URL_CITIES_WS;

        IDKGsonRequest<CitiesModel> request = new IDKGsonRequest<CitiesModel>(
                Request.Method.GET, CitiesModel.class, url,
                new Response.Listener<CitiesModel>() {
                    @Override
                    public void onResponse(CitiesModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CommissionsModel> request = new IDKGsonRequest<CommissionsModel>(
                Request.Method.POST, CommissionsModel.class,
                SabadellApi.sTransfersInternationalCommissionsUrl, params,
                new Response.Listener<CommissionsModel>() {
                    @Override
                    public void onResponse(CommissionsModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalCountries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<CountriesListModel> request = new IDKGsonRequest<CountriesListModel>(
                Request.Method.GET, CountriesListModel.class,
                SabadellApi.sTransfersInternationalCountriesUrl,
                new Response.Listener<CountriesListModel>() {
                    @Override
                    public void onResponse(CountriesListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalCurrencies(
            final IDKGatewayResponse.Listener<CurrenciesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<CurrenciesModel> request = new IDKGsonRequest<CurrenciesModel>(
                Request.Method.GET, CurrenciesModel.class,
                SabadellApi.sTransfersInternationalCurrenciesUrl,
                new Response.Listener<CurrenciesModel>() {
                    @Override
                    public void onResponse(CurrenciesModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferInternationalDollarDates(DollarDatesForm form,
            final IDKGatewayResponse.Listener<DollarDatesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<DollarDatesModel> request = new IDKGsonRequest<DollarDatesModel>(
                Request.Method.POST, DollarDatesModel.class,
                SabadellApi.sTransfersInternationalDollarDatesUrl, params,
                new Response.Listener<DollarDatesModel>() {
                    @Override
                    public void onResponse(DollarDatesModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<TransferResponseModel> request = new IDKInvalidateCacheGsonRequest<TransferResponseModel>(
                Request.Method.POST, TransferResponseModel.class, SabadellApi.sTransfersNationalUrl,
                params,
                new Response.Listener<TransferResponseModel>() {
                    @Override
                    public void onResponse(TransferResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        IDKGsonRequest<BeneficiariesModel> request = new IDKGsonRequest<BeneficiariesModel>(
                Request.Method.GET, BeneficiariesModel.class,
                SabadellApi.sTransfersNationalBeneficiariesUrl,
                new Response.Listener<BeneficiariesModel>() {
                    @Override
                    public void onResponse(BeneficiariesModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<BeneficiaryResultModel> request = new IDKGsonRequest<BeneficiaryResultModel>(
                Request.Method.POST, BeneficiaryResultModel.class,
                SabadellApi.sTransfersNationalBeneficiariesUrl, params,
                new Response.Listener<BeneficiaryResultModel>() {
                    @Override
                    public void onResponse(BeneficiaryResultModel beneficiaryModel) {
                        responseListener.onResponse(beneficiaryModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<Void> request = new IDKGsonRequest<Void>(Request.Method.POST,
                Void.class, SabadellApi.sTransfersNationalBeneficiariesDeleteUrl, params,
                new Response.Listener<Void>() {
                    @Override
                    public void onResponse(Void model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        BeneficiaryModel beneficiary = form.getBeneficiary();

        Map<String, String> params = new HashMap<String, String>();
        params.put(BENEFICIARY_NAME, beneficiary.getName());
        String url = encodeGetParameters(SabadellApi.sTransfersNationalBeneficiariesUrl +
                SabadellApi.SLASH + beneficiary.getBeneficiaryId(), params);

        IDKGsonRequest<BeneficiaryResultModel> request = new IDKGsonRequest<BeneficiaryResultModel>(
                Request.Method.GET, BeneficiaryResultModel.class, url,
                new Response.Listener<BeneficiaryResultModel>() {
                    @Override
                    public void onResponse(BeneficiaryResultModel beneficiaryModel) {
                        responseListener.onResponse(beneficiaryModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<BeneficiaryResultModel> request = new IDKGsonRequest<BeneficiaryResultModel>(
                Request.Method.PUT, BeneficiaryResultModel.class,
                SabadellApi.sTransfersNationalBeneficiariesUrl, params,
                new Response.Listener<BeneficiaryResultModel>() {
                    @Override
                    public void onResponse(BeneficiaryResultModel beneficiaryModel) {
                        responseListener.onResponse(beneficiaryModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<CommissionsModel> request = new IDKGsonRequest<CommissionsModel>(
                Request.Method.POST, CommissionsModel.class,
                SabadellApi.sTransfersNationalCommissionsUrl, params,
                new Response.Listener<CommissionsModel>() {
                    @Override
                    public void onResponse(CommissionsModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalCommissionsDocument(TransferCommissionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                Request.Method.POST, DocumentModel.class,
                SabadellApi.sTransfersNationalCommissionsDocumentUrl,
                params,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel documentModel) {
                        responseListener.onResponse(documentModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalDuplicated(TransferDuplicatedForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<BooleanResponseModel> request = new IDKGsonRequest<BooleanResponseModel>(
                Request.Method.POST, BooleanResponseModel.class,
                SabadellApi.sTransfersNationalDuplicatedUrl, params,
                new Response.Listener<BooleanResponseModel>() {
                    @Override
                    public void onResponse(BooleanResponseModel booleanResponseModel) {
                        responseListener.onResponse(booleanResponseModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(
                                parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transfersList(TransfersForm form,
            final IDKGatewayResponse.Listener<TransfersListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<TransfersListModel> request = new IDKGsonRequest<TransfersListModel>(
                Request.Method.POST, TransfersListModel.class,
                SabadellApi.sTransferUrl, params,
                new Response.Listener<TransfersListModel>() {
                    @Override
                    public void onResponse(TransfersListModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalPeriodicalCreate(PeriodicalTransferForm form,
            final IDKGatewayResponse.Listener<PeriodicalTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<PeriodicalTransferResponseModel> request = new IDKInvalidateCacheGsonRequest<PeriodicalTransferResponseModel>(
                Request.Method.POST, PeriodicalTransferResponseModel.class,
                SabadellApi.sTransfersNationalPeriodicalsCreateUrl, params,
                new Response.Listener<PeriodicalTransferResponseModel>() {
                    @Override
                    public void onResponse(PeriodicalTransferResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void transferNationalPeriodicalEndDate(PeriodicalTransferEndDateForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<StringResponseModel> request = new IDKGsonRequest<StringResponseModel>(
                Request.Method.POST, StringResponseModel.class,
                SabadellApi.sTransfersNationalPeriodicalsEndDateUrl, params,
                new Response.Listener<StringResponseModel>() {
                    @Override
                    public void onResponse(StringResponseModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    // ########################################
    // Glass WebServices
    // ########################################

    @Override
    public void glassAgent(SessionAgentForm form,
            final IDKGatewayResponse.Listener<AgentSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        SessionCapturingRequest<AgentSessionModel> request
                = new SessionCapturingRequest<AgentSessionModel>(
                Request.Method.POST, AgentSessionModel.class, SabadellApi.sGlassAgent,
                params,
                new Response.Listener<AgentSessionModel>() {
                    @Override
                    public void onResponse(AgentSessionModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void glassAgentAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAgentAccountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        SessionCapturingRequest<SessionAgentAccountsModel> request =
                new SessionCapturingRequest<SessionAgentAccountsModel>(
                        Request.Method.POST, SessionAgentAccountsModel.class,
                        SabadellApi.sGlassAgentAccounts, params,
                        new Response.Listener<SessionAgentAccountsModel>() {
                            @Override
                            public void onResponse(SessionAgentAccountsModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void glassAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAccountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        SessionCapturingRequest<SessionAccountsModel> request =
                new SessionCapturingRequest<SessionAccountsModel>(
                        Request.Method.POST, SessionAccountsModel.class,
                        SabadellApi.sGlassAccounts, params,
                        new Response.Listener<SessionAccountsModel>() {
                            @Override
                            public void onResponse(SessionAccountsModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void glassAccountsMovements(SessionAccountMovementsForm form,
            final IDKGatewayResponse.Listener<SessionAccountMovementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        SessionCapturingRequest<SessionAccountMovementsModel> request =
                new SessionCapturingRequest<SessionAccountMovementsModel>(
                        Request.Method.POST, SessionAccountMovementsModel.class,
                        SabadellApi.sGlassAccountsMovements, params,
                        new Response.Listener<SessionAccountMovementsModel>() {
                            @Override
                            public void onResponse(SessionAccountMovementsModel model) {
                                responseListener.onResponse(model);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                errorListener.onErrorResponse(
                                        parseVolleyError(mContext, volleyError));
                            }
                        }
                );

        addToNonConcurrentRequestQueue(request);
    }

    // ########################################
    // Wallet WebServices
    // ########################################
    @Override
    public void nfcSession(NfcSessionForm form,
            final IDKGatewayResponse.Listener<NfcSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKGsonRequest<NfcSessionModel> request = new IDKGsonRequest<NfcSessionModel>(
                Request.Method.POST, NfcSessionModel.class,
                SabadellApi.sWalletNfcSession, params,
                new Response.Listener<NfcSessionModel>() {
                    @Override
                    public void onResponse(NfcSessionModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void nfcSignupCard(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<NfcSignUpCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<NfcSignUpCardModel> request = new
                IDKInvalidateCacheGsonRequest<NfcSignUpCardModel>(Request.Method.POST,
                NfcSignUpCardModel.class, SabadellApi.sWalletNfcSignupCard, params,
                new Response.Listener<NfcSignUpCardModel>() {
                    @Override
                    public void onResponse(NfcSignUpCardModel nfcSignUpCardModel) {
                        responseListener.onResponse(nfcSignUpCardModel);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }

        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void nfcSignupCardDelete(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        String params = IDK_GSON.toJson(form);

        IDKInvalidateCacheGsonRequest<StringResponseModel> request = new IDKInvalidateCacheGsonRequest<StringResponseModel>(
                Request.Method.POST, StringResponseModel.class,
                SabadellApi.sWalletNfcSignupCardDelete,
                params,
                new Response.Listener<StringResponseModel>() {
                    @Override
                    public void onResponse(StringResponseModel stringResponseModel) {
                        responseListener.onResponse(null);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }

        );

        addToNonConcurrentRequestQueue(request);
    }

    // ########################################
    // Html plugins methods
    // ########################################

    @Override
    public void downloadPdf(String url, String params, String httpMethod,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        int method = httpMethod.equals(HTML_PLUGINS_HTTP_GET) ? Request.Method.GET
                                                              : Request.Method.POST;
        if (method == Request.Method.GET) {
            url = encodeGetParametersFromJson(url, params);
        }

        IDKGsonRequest<DocumentModel> request = new IDKGsonRequest<DocumentModel>(
                method, DocumentModel.class, url, params,
                new Response.Listener<DocumentModel>() {
                    @Override
                    public void onResponse(DocumentModel model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                    }
                }
        );

        addToNonConcurrentRequestQueue(request);
    }

    @Override
    public void htmlToNativeRequest(final String url, String method, final String body,
            final Map<String, String> headers,
            final IDKGatewayResponse.Listener<NativeResponse> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        int methodNum = Request.Method.GET;
        if (method.equals(HTML_PLUGINS_HTTP_GET)) {
            methodNum = Request.Method.GET;
        } else if (method.equals(HTML_PLUGINS_HTTP_PUT)) {
            methodNum = Request.Method.PUT;
        } else if (method.equals(HTML_PLUGINS_HTTP_POST)) {
            methodNum = Request.Method.POST;
        }

        HtmlToNativeRequest request = new HtmlToNativeRequest(methodNum, url, body, headers,
                new Response.Listener<NativeResponse>() {
                    @Override
                    public void onResponse(NativeResponse model) {
                        responseListener.onResponse(model);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        // If it is a native error (e.g. parsing the response) send it as callback.error.
                        // Otherwise it is an Http error, send it a callback.success so Html can handle it.
                        if (volleyError instanceof ParseError) {
                            errorListener.onErrorResponse(parseVolleyError(mContext, volleyError));
                        } else if (volleyError != null && volleyError.networkResponse != null) {
                            String charSet = HttpHeaderParser.parseCharset(volleyError.networkResponse.headers);
                            String body = null;
                            try {
                                body = new String(volleyError.networkResponse.data, charSet);
                            } catch (UnsupportedEncodingException e) {
                                Log.d(TAG, e.getMessage(), e);
                            }
                            responseListener.onResponse(new NativeResponse(url, volleyError
                                    .networkResponse.statusCode, "", headers, body));

                        }
                    }
                }
        );

        addToConcurrentRequestQueue(request, "HTML");
    }

    /**
     * Log an error response to show the error message received as json.
     *
     * @param errorResponse the error response to log
     */
    protected static <T> void logErrorResponse(ErrorResponse errorResponse) {
        if (!DEBUG) {
            return;
        }

        try {
            StringBuilder log = new StringBuilder();

            log.append("Error response (");
            if (errorResponse != null) {
                log.append(((Object) errorResponse).getClass().getSimpleName()).append("): ");
                log.append(errorResponse.getErrorMessage());
            } else {
                log.append("): ");
            }
            log.append("\n");

            Log.e(TAG, log.toString());

        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }
    }
}