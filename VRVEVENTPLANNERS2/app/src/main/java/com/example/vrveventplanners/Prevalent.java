package com.example.vrveventplanners;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class Prevalent {

    public static UserModel currentOnlineUser;

    private static final String SHARED_PREF_NAME = "User_info";

    public static final String UserPhoneKey = "phone";
    public static final String UserPasswordKey = "password";
    public static final String UserEmailKey = "email";

    @SuppressLint("StaticFieldLeak")
    private static Prevalent mInstance;
    @SuppressLint("StaticFieldLeak")
    private static Context mCtx;

    private Prevalent(Context context) {
        mCtx = context;
    }

    public void logout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
//        mCtx.startActivity(new Intent(mCtx, LoginActivity.class));
    }

}
