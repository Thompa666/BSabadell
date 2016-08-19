package com.kjohnson.sunriseapp.presentation.ui.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.kjohnson.sunriseapp.R;
import com.kjohnson.sunriseapp.domain.executor.impl.ThreadExecutor;
import com.kjohnson.sunriseapp.domain.model.UserModel;
import com.kjohnson.sunriseapp.presentation.presenters.SunrisePresenter;
import com.kjohnson.sunriseapp.presentation.presenters.impl.SunrisePresenterImpl;
import com.kjohnson.sunriseapp.threading.MainThreadImpl;


public class OneFragment extends Fragment implements SunrisePresenter.View{

    private UserModel mUserModel;
    private SunrisePresenter mPresenter;


    private EditText mLatitudeEditText, mLongitudeEditText;
    private Button mRequestSunriseHourButton;

    private final String DEFAULT_VALUE = "Error: No value found";

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        findViewsByIds();

        mRequestSunriseHourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mUserModel = buildUserModel();
                mUserModel.setLatLngCoordinatesOnRequest(
                        mLatitudeEditText.getText().toString(),
                        mLongitudeEditText.getText().toString()
                );

                mPresenter = new SunrisePresenterImpl(ThreadExecutor.getInstance(),
                        MainThreadImpl.getInstance(),
                        OneFragment.this,
                        mUserModel);

                mPresenter.onAstronomyApiRequest();



//                String password = sharedPreferences.getString("password");
//
//            mUserModel = new UserModel()

            }
        });
    }

    private UserModel buildUserModel() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("myRepository", getContext().MODE_PRIVATE);
        String username = sharedPreferences.getString("username", DEFAULT_VALUE);
        String password = sharedPreferences.getString("password", DEFAULT_VALUE);

        return new UserModel(username, password);
    }

    private void findViewsByIds() {
        mLatitudeEditText = (EditText) getView().findViewById(R.id.latitudeEdTxt);
        mLongitudeEditText = (EditText) getView().findViewById(R.id.longitudeEdTxt);
        mRequestSunriseHourButton = (Button) getView().findViewById(R.id.requestSunriseHourBtn);
    }


    @Override
    public void showResponse() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String message) {

    }
}