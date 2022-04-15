package com.example.mituan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;
import com.example.mituan.ob.User;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class UserIntroduceActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout SetName;
    private LinearLayout SetAutoGrapg;
    private ImageView user_introduce_back;
    private LinearLayout SetSex;
    private LinearLayout SetTou;
    private BottomSheetDialog sexbottomSheet;
    private BottomSheetDialog toubottomSheet;
    private TextView sexMale;
    private TextView sexFemale;
    private TextView sexCancel;
    //从相册选择
    private TextView touX;
    //取消
    private TextView touC;
    private User user;

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        Window win = getWindow();
        StatusBarUtil.transparent(win);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_uintroduce);

        SetName = this.findViewById(R.id.set_name);
        SetName.setOnClickListener(this);
        SetAutoGrapg = this.findViewById(R.id.set_autograph);
        SetAutoGrapg.setOnClickListener(this);
        user_introduce_back = this.findViewById(R.id.user_introduce_back);
        user_introduce_back.setOnClickListener(this);

        //为性别设置底部弹出框
        SetSex = this.findViewById(R.id.set_sex);
        sexbottomSheet = new BottomSheetDialog(UserIntroduceActivity.this);//实例化BottomSheetDialog
        sexbottomSheet.setCancelable(true);//设置点击外部是否可以取消
        View view = View.inflate(this, R.layout.layout_sex, null);
        sexMale = view.findViewById(R.id.sex_male);
        sexFemale = view.findViewById(R.id.sex_female);
        sexCancel = view.findViewById(R.id.sex_cancel);
        sexbottomSheet.setContentView(view);

        SetSex.setOnClickListener(this);
        sexMale.setOnClickListener(this);
        sexFemale.setOnClickListener(this);

        //为头像设置底部弹出框
        SetTou = this.findViewById(R.id.set_touxiang);
        toubottomSheet = new BottomSheetDialog(UserIntroduceActivity.this);//实例化BottomSheetDialog
        toubottomSheet.setCancelable(true);//设置点击外部是否可以取消
        View view1 = View.inflate(this, R.layout.layout_touxiang, null);
        touX = view1.findViewById(R.id.touxiang_xuanze);
        touC = view1.findViewById(R.id.touxiang_cancel);
        toubottomSheet.setContentView(view1);

        SetTou.setOnClickListener(this);
        touX.setOnClickListener(this);
        touC.setOnClickListener(this);
        //进行数据与控件的绑定
        bindData();

        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.introduce_img,UserIntroduceActivity.this,1000);
    }
    public void bindData(){
        user = (User)getIntent().getSerializableExtra("user");
        ImageView introduce_img = this.findViewById(R.id.introduce_img);
        introduce_img.setImageResource(user.getImgId());
        TextView introduce_name = this.findViewById(R.id.introduce_name);
        introduce_name.setText(user.getName());
        TextView introduce_phone = this.findViewById(R.id.introduce_phone);
        introduce_phone.setText(user.getPhoneNum());
        TextView introduce_sex = this.findViewById(R.id.introduce_sex);
        if(user.getSex()==0){
            introduce_sex.setText("女");
        }else{
            introduce_sex.setText("男");
        }
        TextView introduce_personal = this.findViewById(R.id.introduce_personal);
        introduce_personal.setText(user.getIntroduce());
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.set_name:
                Intent setName = new Intent(UserIntroduceActivity.this,SetNameActivity.class);
                setName.putExtra("name",user.getName());
                startActivity(setName);
                break;
            case R.id.set_autograph:
                Intent setAutoGraph = new Intent(UserIntroduceActivity.this,SetAutoGraphActivity.class);
                setAutoGraph.putExtra("autograph",user.getIntroduce());
                startActivity(setAutoGraph);
                break;
            case R.id.user_introduce_back:
                finish();
                break;
            case R.id.set_sex:
                sexbottomSheet.show();
                break;
            case R.id.sex_male:
                sexbottomSheet.dismiss();
                break;
            case R.id.sex_female:
                sexbottomSheet.dismiss();
                break;
            case R.id.set_touxiang:
                toubottomSheet.show();
                break;
            case R.id.touxiang_xuanze:
                toubottomSheet.dismiss();
                break;
            case R.id.touxiang_cancel:
                toubottomSheet.dismiss();
                break;
            default:
                break;
        }
    }
}
