package com.roma.hrms.network;

import android.content.Context;

import com.roma.hrms.network.config.RetrofitBuilder;
import com.roma.hrms.network.interfaces.LoginInterface;

import retrofit2.Callback;

public class LoginService {

    private LoginInterface loginInterface;

    public LoginService(Context context) {
        loginInterface = RetrofitBuilder.builder(context)
                .create(LoginInterface.class);
    }

    public void doLogin(String email, String password, String token_login, Callback callback) { // Step 3 set string [token_login]
        loginInterface.login(email, password, token_login).enqueue(callback); // Step 4 [Menjuju ke interfaces.LoginInterface]
    }

}