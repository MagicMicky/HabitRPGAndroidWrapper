package com.magicmicky.habitrpgwrapper.lib.api;

import com.magicmicky.habitrpgwrapper.lib.models.HabitRPGData;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by MagicMicky on 10/06/2014.
 */
public interface ApiService {
    @GET("/user/")
    void getUser(Callback<HabitRPGData> habitRPGDataCallback);
}
