package com.magicmicky.habitrpgwrapper.lib;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.magicmicky.habitrpgwrapper.lib.api.ApiService;
import com.magicmicky.habitrpgwrapper.lib.api.StatusCallback;
import com.magicmicky.habitrpgwrapper.lib.api.UserCallback;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("x-api-key", "b89ef880-7e07-4d13-8a5f-b6be25437fd8");
                request.addHeader("x-api-user","710f41f1-4113-4d8a-9714-79a84edd6175");
            }
        };

        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("https://habitrpg.com:443/api/v2/").setRequestInterceptor(requestInterceptor).build();

        ApiService service  = adapter.create(ApiService.class);
        service.getStatus(new StatusCallback());
        service.getUser(new UserCallback());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
