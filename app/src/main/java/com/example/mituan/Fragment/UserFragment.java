package com.example.mituan.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.mituan.AdviceActivity;
import com.example.mituan.AttentionActivity;
import com.example.mituan.DongTaiActivity;
import com.example.mituan.EvaluationActivity;
import com.example.mituan.FansActivity;
import com.example.mituan.MessageActivity;
import com.example.mituan.PlayedActvity;
import com.example.mituan.R;
import com.example.mituan.UserIntroduceActivity;
import com.example.mituan.Util.ImageBlurUtil;
import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.WantPlayActivity;
import com.example.mituan.ob.User;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserFragment extends Fragment implements View.OnClickListener{
    private LinearLayout userFans;
    private  LinearLayout userAttention;
    private RelativeLayout userMessage;
    private RelativeLayout userAdvice;
    private ImageView userIntroduce;
    private LinearLayout DongTai;
    private RelativeLayout EvaluationBtn;
    private RelativeLayout played;
    private RelativeLayout wantplay;
    private User user;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_user, container, false);
        return root;
    }

    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);
        initClick();
        user = new User();
        initData();
        bindData();
        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.user_touxiang,getActivity(),200);

    }
    public void bindData(){
        TextView user_name = getView().findViewById(R.id.user_name);
        user_name.setText(user.getName());
        ImageView user_img = getView().findViewById(R.id.user_touxiang);
        user_img.setImageResource(user.getImgId());
        TextView user_personal = getView().findViewById(R.id.user_personal);
        user_personal.setText(user.getIntroduce());
        TextView user_dongtaiNum = getView().findViewById(R.id.user_dongtai_num);
        user_dongtaiNum.setText(String.valueOf(user.getDongtaiNum()));
        TextView user_fansNum = getView().findViewById(R.id.user_fans_num);
        user_fansNum.setText(String.valueOf(user.getFansNum()));
        TextView user_attentionNum = getView().findViewById(R.id.user_attention_num);
        user_attentionNum.setText(String.valueOf(user.getConcernNum()));
        TextView user_notWriteNum = getView().findViewById(R.id.user_message_num);
        user_notWriteNum.setText(String.valueOf(user.getNotWriteMes()));
    }
    public void initData(){
        user.setName("南城");
        user.setImgId(R.drawable.touxiang);
        user.setPhoneNum("13654873826");
        user.setSex(1);
        user.setIntroduce("唯爱清风与明月");
        user.setDongtaiNum(12);
        user.setFansNum(4);
        user.setConcernNum(5);
        user.setNotWriteMes(7);
    }

    public void initClick(){
        userFans = getView().findViewById(R.id.user_fans);
        userFans.setOnClickListener(this);
        userAttention = getView().findViewById(R.id.user_attention);
        userAttention.setOnClickListener(this);
        userMessage = getView().findViewById(R.id.user_message);
        userMessage.setOnClickListener(this);
        userAdvice = getView().findViewById(R.id.user_advice);
        userAdvice.setOnClickListener(this);

        userIntroduce = getView().findViewById(R.id.user_introduce);
        userIntroduce.setOnClickListener(this);

        DongTai = getView().findViewById(R.id.dongtai);
        DongTai.setOnClickListener(this);
        EvaluationBtn = getView().findViewById(R.id.evaluation_btn);
        EvaluationBtn.setOnClickListener(this);
        played = getView().findViewById(R.id.played);
        played.setOnClickListener(this);
        wantplay = getView().findViewById(R.id.wantplay);
        wantplay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.user_fans:
                Intent user_fans = new Intent(getActivity(), FansActivity.class);
                startActivity(user_fans);
                break;
            case R.id.user_attention:
                Intent user_attention = new Intent(getActivity(), AttentionActivity.class);
                startActivity(user_attention);
                break;
            case R.id.user_message:
                Intent user_message = new Intent(getActivity(), MessageActivity.class);
                startActivity(user_message);
                break;
            case R.id.user_advice:
                Intent user_advice = new Intent(getActivity(), AdviceActivity.class);
                startActivity(user_advice);
                break;
            case R.id.user_introduce:
                Intent user_introduce = new Intent(getActivity(), UserIntroduceActivity.class);
                user_introduce.putExtra("user",user);
                startActivity(user_introduce);
                break;
            case R.id.dongtai:
                Intent dongtai = new Intent(getActivity(), DongTaiActivity.class);
                startActivity(dongtai);
                break;
            case R.id.evaluation_btn:
                Intent evaluationBtn = new Intent(getActivity(), EvaluationActivity.class);
                startActivity(evaluationBtn);
                break;
            case R.id.wantplay:
                Intent wantplay = new Intent(getActivity(), WantPlayActivity.class);
                startActivity(wantplay);
                break;
            case R.id.played:
                Intent played = new Intent(getActivity(), PlayedActvity.class);
                startActivity(played);
                break;
            default:
                break;
        }
    }
}
