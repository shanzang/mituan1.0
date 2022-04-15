package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class TeamAssistantActivity extends AppCompatActivity {
    private RelativeLayout team_assistant_back;
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Window win = getWindow();
        StatusBarUtil.transparent(win);

        setContentView(R.layout.acivity_teamassistant);

        team_assistant_back = this.findViewById(R.id.team_assistant_back);
        team_assistant_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        this.getSupportActionBar().hide();
    }
}
