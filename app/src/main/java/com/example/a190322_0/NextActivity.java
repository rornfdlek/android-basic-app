package com.example.a190322_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    Button btn_close;
    Button btn_toast;
    Button btn_choice;
    EditText et_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        btn_close = (Button)findViewById(R.id.btn_close);
        btn_toast = (Button)findViewById(R.id.btn_toast);
        btn_choice = (Button)findViewById(R.id.btn_choice);
        et_choice = (EditText)findViewById(R.id.et_choice);

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "What a delicious toast!", Toast.LENGTH_LONG).show();
            }
        });

        btn_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_choice.getText().toString().equals("bake toast")){
                    Toast.makeText(getApplicationContext(), "What a delicious toast!", Toast.LENGTH_LONG).show();
                }else if(et_choice.getText().toString().equals("back")){
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "잘못된 요청입니다.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        // 액티비티가 사용자와 상호작용하기 직전 호출됨
        Toast.makeText(getApplicationContext(), "Resumed", Toast.LENGTH_LONG).show();
    }

}
