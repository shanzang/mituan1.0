package com.example.mituan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mituan.R;
import com.example.mituan.ob.BriefScript;

import java.util.ArrayList;

public class ScriptAdapter extends ArrayAdapter<BriefScript> {
    private int resourceId;

    public ScriptAdapter(@NonNull Context context, int resource, ArrayList<BriefScript> objects) {
        super(context, resource,objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BriefScript script = getItem(position);
        View view;
        ViewHolder viewHolder;

        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(resourceId,parent,false);
            //view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder = new ViewHolder();

            viewHolder.scriptName = view.findViewById(R.id.script_name);
            viewHolder.scriptImage = view.findViewById(R.id.script_image);
            viewHolder.maleNumber = view.findViewById(R.id.script_male);
            viewHolder.femaleNumber = view.findViewById(R.id.script_female);
            viewHolder.scriptStore = view.findViewById(R.id.script_store);

            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(ViewHolder) view.getTag();
        }
        viewHolder.scriptName.setText(script.getName());
        viewHolder.scriptImage.setImageResource(script.getImageId());
        viewHolder.maleNumber.setText(String.valueOf(script.getMale()));
        viewHolder.femaleNumber.setText(String.valueOf(script.getFemale()));
        viewHolder.scriptStore.setText((String)script.getStore());



        return view;
    }

    class ViewHolder{
        TextView scriptName;
        TextView maleNumber;
        TextView femaleNumber;
        ImageView scriptImage;
        TextView scriptStore;
    }
}
