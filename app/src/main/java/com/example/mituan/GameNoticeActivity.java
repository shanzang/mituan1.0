package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;

public class GameNoticeActivity extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout game_back;
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        Window win;
        win = getWindow();
        StatusBarUtil.transparent(win);

        setContentView(R.layout.activity_game);

        game_back = this.findViewById(R.id.game_back);
        game_back.setOnClickListener(this);

        getSupportActionBar().hide();

        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.nianlun,R.id.game_script,this,20);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.game_back:
                finish();
                break;
        }
    }
}
