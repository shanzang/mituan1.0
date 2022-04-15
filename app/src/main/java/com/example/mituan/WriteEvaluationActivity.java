package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class WriteEvaluationActivity extends AppCompatActivity {
    private ImageView write_evaluation_back;
    public void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        Window win = getWindow();
        StatusBarUtil.transparent(win);

        setContentView(R.layout.activity_writeevaluation);

        write_evaluation_back = this.findViewById(R.id.write_evaluation_back);
        write_evaluation_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        getSupportActionBar().hide();
    }
}
