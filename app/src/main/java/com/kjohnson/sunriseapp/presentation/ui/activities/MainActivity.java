package com.kjohnson.sunriseapp.presentation.ui.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kjohnson.sunriseapp.R;
import com.kjohnson.sunriseapp.domain.executor.impl.ThreadExecutor;
import com.kjohnson.sunriseapp.domain.model.UserModel;
import com.kjohnson.sunriseapp.presentation.presenters.MainPresenter;
import com.kjohnson.sunriseapp.presentation.presenters.impl.MainPresenterImpl;
import com.kjohnson.sunriseapp.threading.MainThreadImpl;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainPresenter.View{

    private EditText mUserNameEdTxt;
    private EditText mPasswordEdTxt;
    private Button mLoginButton;

    private MainPresenter mPresenter;
    private UserModel mUserModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        findViewsByIds();

        mLoginButton.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                mUserModel = new UserModel(mUserNameEdTxt.getText().toString(),
                        mPasswordEdTxt.getText().toString());

                mPresenter = new MainPresenterImpl(ThreadExecutor.getInstance(),
                        MainThreadImpl.getInstance(),
                        MainActivity.this,
                        mUserModel);

                mPresenter.onSubmitButtonPressed();

            }
        });

    }

    private void findViewsByIds() {
        mLoginButton = (Button) findViewById(R.id.logInButton);
        mUserNameEdTxt = (EditText) findViewById(R.id.userNameEdTxt);
        mPasswordEdTxt = (EditText) findViewById(R.id.passwordEdTxt);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void showProgress() {
//        mWelcomeTextView.setText("Retrieving...");
    }

    @Override
    public void hideProgress() {
        Toast.makeText(this, "Retrieved!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showError(String message) {
//        mWelcomeTextView.setText(message);
        Toast.makeText(this, "Login Unsuccesful: Type again your username/password",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void displayWelcomeMessage(String msg) {
//        mWelcomeTextView.setText(msg);
    }

    public void saveOnSharedPreferences() {
        SharedPreferences sharedPreferences = getSharedPreferences("myRepository", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", mUserNameEdTxt.getText().toString());
        editor.putString("password", mPasswordEdTxt.getText().toString());
        editor.commit();
        editor.clear();
    }


    @Override
    public void navigateToTabActivity() {
//        Intent NavigationIntent = new Intent(this, MockActivity.class);
        saveOnSharedPreferences();
        Intent NavigationIntent = new Intent(this, SunriseActivity.class);
        startActivity(NavigationIntent);
    }

}
