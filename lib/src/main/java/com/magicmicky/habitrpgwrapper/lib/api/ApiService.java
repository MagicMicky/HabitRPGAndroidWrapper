package com.magicmicky.habitrpgwrapper.lib.api;

import com.magicmicky.habitrpgwrapper.lib.models.HabitRPGUser;
import com.magicmicky.habitrpgwrapper.lib.models.Status;
import com.magicmicky.habitrpgwrapper.lib.models.Tag;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.Daily;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.Habit;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.HabitItem;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.Reward;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.ToDo;

import java.util.List;

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

    @POST("/user/tasks/{id}/{direction}")
    void postTaskDirection(@Path("id") String id, @Path("direction") String direction, TaskDirectionCallback taskDirectionCallback);//+ weird callback with delta etc.

    @POST("/user/tasks")
    void createItem(@Body Habit item, Callback<Habit> habitItemCallback);

    @POST("/user/tasks")
    void createItem(@Body Daily item, Callback<Daily> habitItemCallback);

    @POST("/user/tasks")
    void createItem(@Body ToDo item, Callback<ToDo> habitItemCallback);

    @POST("/user/tasks")
    void createItem(@Body Reward item, Callback<Reward> habitItemCallback);

    @PUT("/user/tasks/{id}")
    void updateTask(@Path("id") String id, @Body Habit item, Callback<Habit> habitItemCallback);

    @PUT("/user/tasks/{id}")
    void updateTask(@Path("id") String id, @Body Daily item, Callback<Daily> habitItemCallback);

    @PUT("/user/tasks/{id}")
    void updateTask(@Path("id") String id, @Body ToDo item, Callback<ToDo> habitItemCallback);

    @PUT("/user/tasks/{id}")
    void updateTask(@Path("id") String id, @Body Reward item, Callback<Reward> habitItemCallback);

    @DELETE("/user/tasks/{id}")
    void deleteTask(@Path("id") String id, Callback<Void> voidCallback);//test callback

    @POST("/user/tags")
    void createTag(@Body Tag tag, Callback<List<Tag>> multiTagCallback);//Check Callback

    @PUT("/user/tags/{id}")
    void updateTag(@Path("id") String id, @Body Tag tag, Callback<Tag> multiTagCallback);//callback

    @DELETE("/user/tags/{id}")
    void deleteTag(@Path("id") String id, Callback<Void> voidCallback);//Callback


/*
    @GET("/content")
    void getContent();//Check Callback

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



    @GET("/user/tasks/{id}")
    void getTask(@Path("id") String id, Callback<HabitItemCallback> habitItemCallback);
*/
}
