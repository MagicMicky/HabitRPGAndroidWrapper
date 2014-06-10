package com.magicmicky.habitrpgwrapper.lib;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.magicmicky.habitrpgwrapper.lib.api.ApiService;

import org.apache.http.client.protocol.RequestDefaultHeaders;

import java.util.ArrayList;
import java.util.List;

import retrofit.RequestHeaders;
import retrofit.RestAdapter;
import retrofit.client.Header;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestHeaders headers = new RequestHeaders() {
            @Override
            public List<Header> get() {
                List<Header> h = new ArrayList<Header>();
                h.add(new Header("x-api-key", "b89ef880-7e07-4d13-8a5f-b6be25437fd8"));
                h.add(new Header("x-api-user","710f41f1-4113-4d8a-9714-79a84edd6175"));
                h.add(new Header("Accept-Encoding", "gzip"));
                return h;
            }
        };
        RestAdapter adapter = new RestAdapter.Builder().setServer("https://habitrpg.com/api/v2/").setRequestHeaders(headers).build();

        ApiService service  = adapter.create(ApiService.class);

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
