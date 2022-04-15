package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class EvaluationActivity extends AppCompatActivity {
    private ImageView evaluation_back;
    public void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);

        Window win = getWindow();
        StatusBarUtil.transparent(win);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_evaluation);

        evaluation_back = this.findViewById(R.id.evaluation_back);
        evaluation_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
