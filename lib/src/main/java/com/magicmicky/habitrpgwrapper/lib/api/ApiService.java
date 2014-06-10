package com.magicmicky.habitrpgwrapper.lib.api;

import com.magicmicky.habitrpgwrapper.lib.models.HabitRPGUser;
import com.magicmicky.habitrpgwrapper.lib.models.Status;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.HabitItem;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

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

    //TODO:
    @GET("/user/tasks/{id}")
    void getTask(@Path("id") String id, Callback<HabitItemCallback> habitItemCallback);

/*
    @GET("/content")
    void getContent();//Check Callback

    @POST("/user/tasks/{id}/{direction}")
    void postTaskDirection(@Path("id") String id, @Path("direction") String direction);//+ weird callback with delta etc.

    @POST("/user/tasks")
    void createTask(@Body HabitItem item, Callback<HabitItemCallback> habitItemCallbackCallback)

    @PUT("/user/tasks/{id}")
    void updateTask(@Path("id") String id, @Body HabitItem item, Callback<HabitItemCallback> habitItemCallbackCallback);

    @DELETE("/user/tasks/{id}")
    void deleteTask(@Path("id") String id, Callback<HabitItemCallback> habitItemCallbackCallback);//test callback

    @POST("/user/sleep")
    void sleep(Callback<HabitRPGDataCallback> habitRPGDataCallbackCallback);//Check callback.

    @POST("/user/inventory/buy/{key}")
    void buyItem(@Path("key") String itemKey);//Check callback. Key --> /content

    @POST("/user/inventory/sell/{type}/{key}")
    void sellItem(@Path("type") String type, @Path("key") String key);//Check callback

    @POST("/user/inventory/purchase/{type}/{key}")
    void purchaseItem(@Path("type") String type, @Path("key") String key);//Check callback

    @POST("/user/inventory/feed/{pet}/{food}")
    void feedPet(@Path("pet") String pet, @Path("food") String food);//Check Callback

    @POST("/user/inventory/equip/{type}/{key}")
    void equip(@Path("type") String type, @Path("key") String key);

    @POST("/user/inventory/hatch/{egg}/{hatchingPotion}")
    void hatch(@Path("egg") String egg, @Path("hatchingPotion") String potion);//Check Callback

    @POST("/user/tags")
    void createTag(@Body Tag tag);//Check Callback

    @PUT("/user/tags/{id}")
    void updateTag(@Path("id") String id, @Body Tag tag);//callback

    @DELETE("/user/tags/{id}")
    void deleteTag(@Path("id") String id);//Callback
*/
}
