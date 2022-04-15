package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class SetAutoGraphActivity extends AppCompatActivity {
    private ImageView set_autograph_back;
    private EditText autograph;
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Window win = getWindow();
        StatusBarUtil.transparent(win);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_setautograph);

        autograph = this.findViewById(R.id.autograph);
        autograph.setText(getIntent().getStringExtra("autograph"));

        set_autograph_back = this.findViewById(R.id.set_autograph_back);
        set_autograph_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
