package com.example.mituan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mituan.Adapter.SameCityCarAdapter;
import com.example.mituan.Adapter.ScriptAdapter;
import com.example.mituan.AddressChoiceActivity;
import com.example.mituan.GameNoticeActivity;
import com.example.mituan.MessageActivity;
import com.example.mituan.R;
import com.example.mituan.ScriptActivity;
import com.example.mituan.SearchFriendActivity;
import com.example.mituan.SearchScript;
import com.example.mituan.SearchShopActivity;
import com.example.mituan.TeamDetalsActivity;
import com.example.mituan.Util.ListViewUtil;
import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.ob.BriefScript;
import com.example.mituan.ob.SameCityCar;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener{

    private ImageView search;
    private ImageView message;
    private ImageView recommon_script;
    private LinearLayout searchScript;
    private LinearLayout searchShop;
    private RelativeLayout searchFriend;
    private RelativeLayout createRoom;
    private ListView listCar;
    private ArrayList<BriefScript> scriptList2;
    private ArrayList<BriefScript> scriptList1;
    private ArrayList<BriefScript> scriptList3;
    private ArrayList<BriefScript> scriptList4;
    private ArrayList<SameCityCar> samecityCar;
    private LinearLayout choiceAddress;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        search = getView().findViewById(R.id.main_search);
        searchScript = getView().findViewById(R.id.main_script);
        searchFriend = getView().findViewById(R.id.search_friend);
        recommon_script = getView().findViewById(R.id.img_rect_rounded);
        createRoom = getView().findViewById(R.id.createRoom);
        searchShop = getView().findViewById(R.id.search_shop);
        choiceAddress = getView().findViewById(R.id.choice_address);
        listCar = getView().findViewById(R.id.main_citycar);
        search.setOnClickListener(this);
        search.setTag(1);
        choiceAddress.setOnClickListener(this);
        choiceAddress.setTag(2);
        searchScript.setOnClickListener(this);
        searchScript.setTag(3);
        recommon_script.setOnClickListener(this);
        recommon_script.setTag(4);
        createRoom.setOnClickListener(this);
        createRoom.setTag(5);
        searchShop.setOnClickListener(this);
        searchShop.setTag(6);
        searchFriend.setOnClickListener(this);
        searchFriend.setTag(7);

        //为图片设置圆角函数
        setradius();

        String date = "07月10日"+" "+"14:00";
        samecityCar = new ArrayList<>();
        SameCityCar s = new SameCityCar(R.drawable.nianlun,"年轮",date,"清风明月堂 (曲阜师范大学北门)","水龙头都给我来！");
        samecityCar.add(s);
        SameCityCar s2 = new SameCityCar(R.drawable.yuan,"鸢飞戾天",date,"时光推理探案馆 (静轩13路77号)","求不搞别人心态的队友");
        samecityCar.add(s2);
        SameCityCarAdapter carAdapter = new SameCityCarAdapter(getActivity(),R.layout.samecity_item,samecityCar);
        ListView carList = getView().findViewById(R.id.main_citycar);
        carList.setAdapter(carAdapter);

        scriptList2 = new ArrayList<>();
        BriefScript a = new BriefScript("年轮",3,2,"8.1",R.drawable.nianlun);
        scriptList2.add(a);
        BriefScript b = new BriefScript("窗边的女人",3,3,"7.8",R.drawable.chuang);
        scriptList2.add(b);
        BriefScript c = new BriefScript("秦淮八艳",0,8,"7.6",R.drawable.qin);
        scriptList2.add(c);
        ScriptAdapter adapter2=new ScriptAdapter(getActivity(),R.layout.script_item,scriptList2);

        // 将适配器上的数据传递给listView
        ListView listView2=getView().findViewById(R.id.script_list2);
        listView2.setDivider(null);
        listView2.setAdapter(adapter2);


        scriptList1 = new ArrayList<>();
        scriptList1.add(a);
        scriptList1.add(b);
        scriptList1.add(c);
        ScriptAdapter adapter1=new ScriptAdapter(getActivity(),R.layout.script_item,scriptList1);
        ListView listView1=getView().findViewById(R.id.script_list1);
        listView1.setDivider(null);
        listView1.setAdapter(adapter2);

        scriptList3 = new ArrayList<>();
        scriptList3.add(a);
        scriptList3.add(b);
        scriptList3.add(c);
        ScriptAdapter adapter3=new ScriptAdapter(getActivity(),R.layout.script_item,scriptList3);
        ListView listView3=getView().findViewById(R.id.script_list3);
        listView3.setDivider(null);
        listView3.setAdapter(adapter3);

        scriptList4 = new ArrayList<>();
        scriptList4.add(a);
        scriptList4.add(b);
        scriptList4.add(c);
        ScriptAdapter adapter4=new ScriptAdapter(getActivity(),R.layout.script_item,scriptList4);
        ListView listView4=getView().findViewById(R.id.script_list4);
        listView4.setDivider(null);
        listView4.setAdapter(adapter4);

        ListView listView5=getView().findViewById(R.id.main_citycar);

        //为listView添加事件监听
        listView1.setOnItemClickListener(this);
        listView2.setOnItemClickListener(this);
        listView3.setOnItemClickListener(this);
        listView4.setOnItemClickListener(this);
        listView5.setOnItemClickListener(this);

        //解决ScollView和ListView的冲突问题，为ListView动态设置高度
        ListViewUtil.setListViewHeightBasedOnChildren(listCar);



    }

    public void setradius(){
        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.nianlun,R.id.img_rect_rounded,getActivity(),30);
        radiusUtil.setRadius(R.drawable.bg3,R.id.img_right1,getActivity(),30);
        radiusUtil.setRadius(R.drawable.bg1,R.id.img_right2,getActivity(),30);
        //radiusUtil.setRadius(R.drawable.nianlun,R.id.car_imgId,this,10);
    }

    @Override
    public void onClick(View v) {
        int tag = (int) v.getTag();
        switch(tag){
            case 1:
            case 4:
                Intent search = new Intent(getActivity(), ScriptActivity.class);
                startActivity(search);
                break;
            case 2:
                Intent message = new Intent(getActivity(), AddressChoiceActivity.class);
                startActivity(message);
                break;
            case 3:
                Intent searchScript = new Intent(getActivity(), SearchScript.class);
                startActivity(searchScript);
                break;
            case 5:
                Intent createRoom = new Intent(getActivity(), GameNoticeActivity.class);
                startActivity(createRoom);
                break;
            case 6:
                Intent searchShop = new Intent(getActivity(), SearchShopActivity.class);
                startActivity(searchShop);
                break;
            case 7:
                Intent searchFri = new Intent(getActivity(), SearchFriendActivity.class);
                startActivity(searchFri);
                break;
            default:
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int listId = parent.getId();
        //首先判断ListView的id值，来确定点击的是哪一个ListView
        if(listId == R.id.main_citycar){
            Intent it = new Intent(getActivity(), TeamDetalsActivity.class);
            startActivity(it);
        }else{
            BriefScript script0 = scriptList1.get(position);
            Intent search = new Intent(getActivity(),ScriptActivity.class);
            startActivity(search);
        }

    }
}
