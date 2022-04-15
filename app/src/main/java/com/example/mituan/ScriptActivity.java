package com.example.mituan;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.ImageBlurUtil;
import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;
import com.example.mituan.ob.Script;
import com.example.mituan.ob.ScriptRole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScriptActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout WEvaluationBtn;
    private RelativeLayout script_back;
    private Script script;
    private ScriptRole scriptRole;
    private GridView gridrole;
    private BaseAdapter radapter;
    private ArrayList<Map<String,Object>> rData;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        //获取window，并将其传给StatusBarUtil工具类中的transparent方法
        Window win;
        win = getWindow();
        StatusBarUtil.transparent(win);
        //隐藏掉标题栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_script);
        //new一个新的script作为全局变量
        script = new Script();
        scriptRole = new ScriptRole();

        script_back = this.findViewById(R.id.script_back);
        script_back.setOnClickListener(this);

        WEvaluationBtn = this.findViewById(R.id.w_evaluation_btn);
        WEvaluationBtn.setOnClickListener(this);
        //进行角色介绍的布局
        setGrid();
        setGridParams();
        Log.e("Eee", String.valueOf(rData));
        gridrole = this.findViewById(R.id.grid_role);

        radapter = new SimpleAdapter(ScriptActivity.this,rData,R.layout.role_item,
                new String[]{"name","introduce"},new int[]{R.id.role_name,R.id.role_introduce});
        gridrole.setAdapter(radapter);

        View layout = this.findViewById(R.id.script_bg1);

        initData();
        bindData();
        //模糊
        Resources res = this.getResources();
        //拿到初始图
        Bitmap bmp= BitmapFactory.decodeResource(res,R.drawable.script_bg);
        //处理得到模糊效果的图
        Bitmap blurBitmap = ImageBlurUtil.blurBitmap(this, bmp, 25f);
        layout.setBackground( new BitmapDrawable(blurBitmap));

        //对图片进行圆角设置
        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(script.getImgId(),R.id.script_img1,this,100);

    }
    public void setGridParams(){
        int length = 120;  //定义一个长度
        int size = rData.size();  //得到集合长度
        //获得屏幕分辨路
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        float density = dm.density;
        int gridviewWidth = (int) (size * (length + 10) * density);
        int itemWidth = (int) (length * density);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                gridviewWidth, LinearLayout.LayoutParams.MATCH_PARENT);
        gridrole.setLayoutParams(params); // 设置GirdView布局参数,横向布局的关键
        gridrole.setColumnWidth(itemWidth); // 设置列表项宽
        gridrole.setHorizontalSpacing(20); // 设置列表项水平间距
        gridrole.setStretchMode(GridView.NO_STRETCH);
        gridrole.setNumColumns(size); // 设置列数量=列表集合数
    }
    public void setGrid(){
        gridrole = this.findViewById(R.id.grid_role);
        rData = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("name","袁本");
        map.put("introduce","眼神坚毅，刚中柔外，身材高挑的女人");
        Map<String,Object> map1 = new HashMap<>();
        map1.put("name","陈烁");
        map1.put("introduce","眼神锐利，热情善谈，身材健硕的男人");
        Map<String,Object> map2 = new HashMap<>();
        map2.put("name","姚波");
        map2.put("introduce","眼神冰冷，少言寡语，身材消瘦的男人");
        Map<String,Object> map3 = new HashMap<>();
        map3.put("name","王小冉");
        map3.put("introduce","眼神忧郁，唯唯诺诺，个子不高的女人");
        Map<String,Object> map4 = new HashMap<>();
        map4.put("name","刘伯钊");
        map4.put("introduce","眼神严肃，彬彬有礼，中等身材的男人");
        rData.add(map);
        rData.add(map1);
        rData.add(map2);
        rData.add(map3);
        rData.add(map4);
    }
    public void initData(){
        script.setName("年轮");
        script.setImgId(R.drawable.nianlun);
        script.setMaleNum(3);
        script.setFemaleNum(2);
        script.setScore(8.1);
        script.setLabel("硬核 | 还原 | 情感");
        script.setBriefIntroduce("百年前的大火，一个破败凋敝的小村落，五个背负着各自秘密的男女在今夜齐聚，是偶然的相遇还是宿命的相逢？默数着一圈圈年轮，繁密的背后掩盖着怎样动人心弦的故事？往后的月色，让我如何不想起你...");
    }
    public void bindData(){
        TextView script_name = this.findViewById(R.id.script_name);
        script_name.setText(script.getName());
        TextView script_name2 = this.findViewById(R.id.script_name2);
        script_name2.setText(script.getName());
        ImageView script_img1 = this.findViewById(R.id.script_img1);
        script_img1.setImageResource(script.getImgId());
        TextView script_score = this.findViewById(R.id.script_score);
        script_score.setText(String.valueOf(script.getScore()));
        TextView script_male = this.findViewById(R.id.script_male_num);
        script_male.setText(String.valueOf(script.getMaleNum()));
        TextView script_female = this.findViewById(R.id.script_female_num);
        script_female.setText(String.valueOf(script.getFemaleNum()));
        TextView script_label = this.findViewById(R.id.script_label);
        script_label.setText(script.getLabel());
        TextView script_introduce = this.findViewById(R.id.script_introduce);
        script_introduce.setText(script.getBriefIntroduce());
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.w_evaluation_btn:
                Intent it = new Intent(ScriptActivity.this,WriteEvaluationActivity.class);
                startActivity(it);
                break;
            case R.id.script_back:
                finish();
                break;
            default:
                break;
        }

    }
}
