package com.example.a190322_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_start;
    Button btn_temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start = (Button)findViewById(R.id.btn_start);
        btn_temp = (Button)findViewById(R.id.btn_temp);

        btn_start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, NextActivity.class);
                Intent intent = new Intent(getApplicationContext(), NextActivity.class);
                startActivity(intent);
            }
        });

        btn_temp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "임시 토스트입니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    protected void onPause() {
        super.onPause();
        // 액티비티가 다른 액티비티에 의해 가려지게 되면 호출됨
        Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_LONG).show();
    }
}
