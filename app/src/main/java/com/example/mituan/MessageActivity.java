package com.example.mituan;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;

public class MessageActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout messageDetail;
    private LinearLayout teamAssistant;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        Window win = getWindow();
        StatusBarUtil.transparent(win);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_message);

        messageDetail = this.findViewById(R.id.message_main);
        messageDetail.setOnClickListener(this);
        messageDetail.setTag(1);

        teamAssistant = this.findViewById(R.id.team_assistant);
        teamAssistant.setOnClickListener(this);
        teamAssistant.setTag(2);

        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.message_img1,this,1000);
        radiusUtil.setRadius(R.drawable.touxiang,R.id.message_img2,this,1000);
    }

    @Override
    public void onClick(View v) {
        int tag = (int) v.getTag();
        switch(tag){
            case 1:
                Intent message_detail = new Intent(MessageActivity.this,MesDetailsActivity.class);
                startActivity(message_detail);
                break;
            case 2:
                Intent it = new Intent(MessageActivity.this,TeamAssistantActivity.class);
                startActivity(it);
                break;
            default:
                break;
        }

    }
}
