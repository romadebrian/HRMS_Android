package com.roma.hrms.network.interfaces;

import com.roma.hrms.model.User;
import com.roma.hrms.network.config.Config;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginInterface {

    @FormUrlEncoded
    @POST(Config.API_LOGIN)
    Call<User> login(
            @Field("email") String email,
            @Field("password") String password,
            @Field("Token_DB") String token_login); // Step 5 set untuk ($_POST['Token_DB']) adalah Token DB
}