package com.magicmicky.habitrpgwrapper.lib.api;

import android.util.Log;

import com.magicmicky.habitrpgwrapper.lib.models.HabitRPGData;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by MagicMicky on 10/06/2014.
 */
public class HabitRPGDataCallback implements Callback<HabitRPGData> {
    private final String TAG = "HabitRPGDataCallback";
    @Override
    public void success(HabitRPGData habitRPGDataCallback, Response response) {
        Log.d(TAG, "Success ! " + habitRPGDataCallback.getProfile().getName());
    }

    @Override
    public void failure(RetrofitError retrofitError) {
        Log.w(TAG, "Failure ! ");
    }
}
