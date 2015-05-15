package com.magicmicky.habitrpgwrapper.lib.api.TypeAdapter;

import android.util.Log;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.magicmicky.habitrpgwrapper.lib.models.tasks.Tags;

import org.json.JSONTokener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by magicmicky on 15/05/15.
 */
public class TagsAdapter extends TypeAdapter {

    @Override
    public void write(JsonWriter out, Object value) throws IOException {
        Log.d("OMG","omg");
    }

    @Override
    public Object read(JsonReader in) throws IOException {
        List<String> tags = new ArrayList<>();
        boolean isClosed=false;
        do {
            switch(in.peek()) {
                case BEGIN_OBJECT:
                    in.beginObject();
                    break;
                case NAME:
                    String tag = in.nextName();
                    if(in.nextBoolean()) {
                        tags.add(tag);
                    }
                    Log.d("TagsAdapter", "Added tag " + tag);
                    break;
                case END_OBJECT:
                    in.endObject();
                    isClosed=true;
                default:
            }
        } while(!isClosed);
        return new Tags(tags);
    }
}
