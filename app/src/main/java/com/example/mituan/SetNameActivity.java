package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class SetNameActivity extends AppCompatActivity {
    private ImageView setname_back;
    private TextView name;
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Window win = getWindow();
        StatusBarUtil.transparent(win);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_setname);

        name = this.findViewById(R.id.name);
        name.setText(getIntent().getStringExtra("name"));

        setname_back = this.findViewById(R.id.set_name_back);
        setname_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
