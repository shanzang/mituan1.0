package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class AdviceActivity extends AppCompatActivity {
    private ImageView advice_back;
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        Window win = getWindow();
        StatusBarUtil.transparent(win);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_advice);

        advice_back = this.findViewById(R.id.advice_back);
        advice_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
