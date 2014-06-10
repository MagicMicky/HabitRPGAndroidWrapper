package com.magicmicky.habitrpgwrapper.lib.api;

import com.magicmicky.habitrpgwrapper.lib.models.HabitRPGUser;
import com.magicmicky.habitrpgwrapper.lib.models.Status;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by MagicMicky on 10/06/2014.
 */
public interface ApiService {
    @GET("/status")
    void getStatus(Callback<Status> statusCallback);

    @GET("/user/")
    void getUser(Callback<HabitRPGUser> habitRPGUserCallback);

    @POST("/user/revive")
    void revive(Callback<HabitRPGUser> habitRPGUserCallback);

}
