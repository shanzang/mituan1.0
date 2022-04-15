package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;

public class FansActivity extends AppCompatActivity {
    private ImageView fans_back;
    public void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        //获取window，并将其传给StatusBarUtil工具类中的transparent方法
        Window win;
        win = getWindow();
        StatusBarUtil.transparent(win);
        //隐藏掉标题栏
        getSupportActionBar().hide();

        setContentView(R.layout.activity_fans);

        fans_back = this.findViewById(R.id.fans_back);
        fans_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //对图片进行圆角设置
        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.fans_img1,this,1000);
        radiusUtil.setRadius(R.drawable.touxiang,R.id.fans_img2,this,1000);
    }
}
