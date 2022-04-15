package com.example.mituan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.mituan.R;
import com.example.mituan.ob.SameCityCar;

import java.util.List;

public class SameCityCarAdapter extends ArrayAdapter<SameCityCar> {
    private int resourceId;
    public SameCityCarAdapter(@NonNull Context context, int resource, @NonNull List<SameCityCar> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        SameCityCar car = getItem(position);
        View view = null;
        ViewHolder viewHolder;

        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();

            viewHolder.imageView = view.findViewById(R.id.car_imgId);
            viewHolder.CarName = view.findViewById(R.id.car_name);
            viewHolder.CarDate = view.findViewById(R.id.car_date);
            viewHolder.CarPlace = view.findViewById(R.id.car_place);
            viewHolder.CarBiaozhu = view.findViewById(R.id.biaozhu);

            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.CarName.setText(car.getName());
        viewHolder.imageView.setImageResource(car.getImageId());
        viewHolder.CarDate.setText(String.valueOf(car.getDate()));
        viewHolder.CarPlace.setText(String.valueOf(car.getPlace()));
        viewHolder.CarBiaozhu.setText(car.getBiaozhu());


        return view;
    }
    class ViewHolder{
        ImageView imageView;
        TextView CarName;
        TextView CarDate;
        TextView CarPlace;
        TextView CarBiaozhu;
    }
}
