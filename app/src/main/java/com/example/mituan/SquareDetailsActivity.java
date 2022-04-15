package com.example.mituan;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SquareDetailsActivity extends AppCompatActivity{
    private ImageView sdetailsPoint;
    private BottomSheetDialog bottomSheet;
    private TextView report;
    private TextView cancel;
    private ImageView square_details_back;
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        Window win = getWindow();
        StatusBarUtil.transparent(win);

        setContentView(R.layout.activity_squaredetails);

        sdetailsPoint = this.findViewById(R.id.sdetails_point);
        bottomSheet = new BottomSheetDialog(SquareDetailsActivity.this);//实例化BottomSheetDialog
        bottomSheet.setCancelable(true);//设置点击外部是否可以取消
        View view = View.inflate(this, R.layout.layout_dialog, null);
        report = view.findViewById(R.id.tv_report);
        cancel = view.findViewById(R.id.tv_cancel);
        bottomSheet.setContentView(view);

        square_details_back = this.findViewById(R.id.square_details_back);
        square_details_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        sdetailsPoint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                bottomSheet.show();//显示弹窗
            }
        });
        report.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(SquareDetailsActivity.this, "举报成功", Toast.LENGTH_SHORT).show();
                bottomSheet.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                bottomSheet.dismiss();
            }
        });
    }

}
