package com.magicmicky.habitrpgwrapper.lib.api;

import com.magicmicky.habitrpgwrapper.lib.models.DefaultResponse;
import com.magicmicky.habitrpgwrapper.lib.models.HabitRPGData;
import com.magicmicky.habitrpgwrapper.lib.models.Status;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by MagicMicky on 10/06/2014.
 */
public interface ApiService {
    @GET("/status")
    void getStatus(Callback<Status> statusCallback);
    @GET("/user/")
    void getUser(Callback<HabitRPGData> habitRPGDataCallback);
}
