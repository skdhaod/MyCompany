package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    int imgno=0;//선택된 이미지 번호
    int imgs[]={R.drawable.info1, R.drawable.info2, R.drawable.info3, R.drawable.info4, R.drawable.info5};

    String txts[]={"우리회사는안전관리를위해...", "2번째설명", "3번째 설명", "4번째 설명", "5번째 설명"};
    ImageView img_info;
    TextView txt_info;
    Button btn_info_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img_info=findViewById(R.id.img_info);
        txt_info=findViewById(R.id.txt_info);
        btn_info_back=findViewById(R.id.btn_info_back);

        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_info:
                Log.d("test", "이미지 클릭");
                imgno = ++imgno%5;
                img_info.setImageResource(imgs[imgno]);
                txt_info.setText(txts[imgno]);
                break;
            case R.id.btn_info_back:
                Log.d("test", "버튼 클릭");
                finish();
                break;
        }
    }
}