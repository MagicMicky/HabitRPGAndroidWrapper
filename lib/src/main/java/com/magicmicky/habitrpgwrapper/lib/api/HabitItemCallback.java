package com.magicmicky.habitrpgwrapper.lib.api;

import com.magicmicky.habitrpgwrapper.lib.models.tasks.HabitItem;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * TODO : different gson interpreter so that we can test if the habititem is a reward or whatever.
 * Also: Tags
 * Created by MagicMicky on 10/06/2014.
 */
public class HabitItemCallback implements Callback<HabitItem> {
    @Override
    public void success(HabitItem habitItem, Response response) {

    }

    @Override
    public void failure(RetrofitError retrofitError) {

    }
}
