package com.example.mituan;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.ImageBlurUtil;
import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;

public class TeamDetalsActivity extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout team_details_back;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        //获取window，并将其传给StatusBarUtil工具类中的transparent方法
        Window win;
        win = getWindow();
        StatusBarUtil.transparent(win);
        //隐藏掉标题栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_teamdetails);

        View layout = this.findViewById(R.id.script_bg1);
        //模糊
        Resources res = this.getResources();
        //拿到初始图
        Bitmap bmp= BitmapFactory.decodeResource(res,R.drawable.nianlun1);
        //处理得到模糊效果的图
        Bitmap blurBitmap = ImageBlurUtil.blurBitmap(this, bmp, 25f);
        layout.setBackground( new BitmapDrawable(blurBitmap));

        team_details_back = this.findViewById(R.id.team_details_back);
        team_details_back.setOnClickListener(this);

        //对图片进行圆角设置
        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.nianlun,R.id.script_img1,this,100);
        radiusUtil.setRadius(R.drawable.touxiang,R.id.car_people1,this,1000);
        radiusUtil.setRadius(R.drawable.touxiang,R.id.car_people2,this,1000);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.team_details_back:
                finish();
                break;
        }
    }
}
