package com.magicmicky.habitrpgwrapper.lib.api;

import android.util.Log;

import com.google.gson.Gson;
import com.magicmicky.habitrpgwrapper.lib.models.TaskDirection;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.HabitItem;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Simple implementation for TaskDirection callback. When the result is the result for a taskDirection.
 * Created by MagicMicky on 12/06/2014.
 */
public class TaskDirectionCallback implements Callback<TaskDirection> {
    private static final String TAG = "TaskDirection";
    @Override
    public void success(TaskDirection taskDirection, Response response) {
        Log.d(TAG, "Task value modified:" + taskDirection.getDelta());
        Log.d(TAG +"_ans", new Gson().toJson(taskDirection));

    }

    @Override
    public void failure(RetrofitError retrofitError) {
        Log.w(TAG, "failure!!");

    }
}
