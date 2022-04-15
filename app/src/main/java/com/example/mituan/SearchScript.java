package com.example.mituan;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class SearchScript extends AppCompatActivity {
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_searchscript);

        this.getSupportActionBar().hide();
        Window win = getWindow();
        StatusBarUtil.transparent(win);

    }
}
