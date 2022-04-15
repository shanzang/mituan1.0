package com.example.mituan.Adapter;

import android.content.Context;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class UserAdapter extends SimpleAdapter {
    private List<Map<String,Object>> data;
    private ListView listView;
    private SimpleAdapter simpleAdapter;

    public UserAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
    }
}
