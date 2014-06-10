package com.magicmicky.habitrpgwrapper.lib.api;

import android.util.Log;

import com.google.gson.Gson;
import com.magicmicky.habitrpgwrapper.lib.models.HabitRPGData;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.MimeUtil;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;

/**
 * Created by MagicMicky on 10/06/2014.
 */
public class HabitRPGDataCallback implements Callback<HabitRPGData> {
    private final String TAG = "HabitRPGDataCallback";
    private static final int BUFFER_SIZE = 0x1000;

    @Override
    public void success(HabitRPGData habitRPGDataCallback, Response response) {
        Log.d(TAG, "Success ! " + habitRPGDataCallback.getId());
        longInfo(new Gson().toJson(habitRPGDataCallback));
    }

    @Override
    public void failure(RetrofitError retrofitError) {
        Log.w(TAG, "Failure ! " + retrofitError.getUrl());
        Log.e(TAG, retrofitError.getMessage());
        Log.e(TAG, "Network?" + retrofitError.isNetworkError());
    }

    public static void longInfo(String str) {
        if(str.length() > 4000) {
            System.out.println(str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            System.out.println(str);
    }

}
