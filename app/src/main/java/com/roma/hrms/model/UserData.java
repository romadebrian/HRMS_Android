package com.roma.hrms.model;

import java.security.PublicKey;

public class UserData {

    private String firstname;
    private String lastname;
    private String email;
//    private String Token_Code; // Step 5 deklarasi sebagai string

    public UserData() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getToken_Code() // Deklarasi get dulu
//    {
//        return Token_Code; // Samain sama yang di atas (line 10)
//    }
//
//    public void setToken_Code(String token_Code) { //Set token string (Bisa auto)
//        Token_Code = token_Code;
//    }
}