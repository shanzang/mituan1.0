package com.example.mituan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mituan.R;
import com.example.mituan.SquareDetailsActivity;
import com.example.mituan.SquareReleaseActivity;
import com.example.mituan.Util.RadiusUtil;

public class SquareFragment extends Fragment implements View.OnClickListener{
    private LinearLayout squareMes;
    private ImageView releaseBtn1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_square, container, false);
        return root;
    }
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.square_touxiang1,getActivity(),1000);
        radiusUtil.setRadius(R.drawable.yuan,R.id.square_img1,getActivity(),200);

        squareMes = getView().findViewById(R.id.square_mes);
        squareMes.setOnClickListener(this);
        releaseBtn1 = getView().findViewById(R.id.release_btn1);
        releaseBtn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.square_mes:
                Intent it = new Intent(getActivity(), SquareDetailsActivity.class);
                startActivity(it);
                break;
            case R.id.release_btn1:
                Intent it2 = new Intent(getActivity(), SquareReleaseActivity.class);
                startActivity(it2);
                break;
        }
    }
}
