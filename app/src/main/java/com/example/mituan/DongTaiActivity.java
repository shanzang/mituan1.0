package com.example.mituan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;

public class DongTaiActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout dongtaiMes;
    private ImageView releaseBtn1;
    private ImageView dongtai_back;

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        Window win = getWindow();
        StatusBarUtil.transparent(win);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_dongtai);

        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.dongtai_touxiang1,DongTaiActivity.this,1000);
        radiusUtil.setRadius(R.drawable.yuan,R.id.dongtai_img1,DongTaiActivity.this,200);

        dongtaiMes = this.findViewById(R.id.dongtai_mes);
        dongtaiMes.setOnClickListener(this);
        releaseBtn1 = this.findViewById(R.id.dongtai_btn1);
        releaseBtn1.setOnClickListener(this);
        dongtai_back = this.findViewById(R.id.dongtai_back);
        dongtai_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.dongtai_mes:
                Intent it = new Intent(DongTaiActivity.this, SquareDetailsActivity.class);
                startActivity(it);
                break;
            case R.id.dongtai_btn1:
                Intent it2 = new Intent(DongTaiActivity.this, SquareReleaseActivity.class);
                startActivity(it2);
                break;
            case R.id.dongtai_back:
                finish();
        }
    }
}
