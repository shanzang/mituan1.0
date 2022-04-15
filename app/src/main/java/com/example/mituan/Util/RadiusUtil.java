package com.example.mituan.Util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.widget.ImageView;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

public class RadiusUtil {

    public void setRadius(int layout, int id, Activity activity,int radius){
        ImageView mImgRectRound;
        mImgRectRound = (ImageView) activity.findViewById(id);
        Bitmap image= BitmapFactory.decodeResource(activity.getResources(),layout);
        //创建RoundedBitmapDrawable对象
        RoundedBitmapDrawable roundImg = RoundedBitmapDrawableFactory.create(activity.getResources(),image);
        //抗锯齿
        roundImg.setAntiAlias(true);
        //设置圆角半径
        roundImg.setCornerRadius(radius);
        //设置显示图片
        mImgRectRound.setImageDrawable(roundImg);
    }

}
