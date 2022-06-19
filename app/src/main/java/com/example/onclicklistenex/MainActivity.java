package com.example.onclicklistenex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_1, firstWay, second, secondWay, third, thirdWay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_1 = findViewById(R.id.first_btn);
        firstWay = findViewById(R.id.firstWay_btn);

        second = findViewById(R.id.second_btn);
        secondWay = findViewById(R.id.secondWay_btn);

        third = findViewById(R.id.third_btn);
        thirdWay = findViewById(R.id.thirdWay_btn);

        second.setOnClickListener(this);
        secondWay.setOnClickListener(this);


         textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Android app Dev", Toast.LENGTH_SHORT).show();
            }
        });
        
        firstWay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "By AMOL", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.second_btn:
                Toast.makeText(this, "Amol", Toast.LENGTH_SHORT).show();
                break;
            case R.id.secondWay_btn:
                Toast.makeText(this, "Wahane", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void meth_third(View view){
        Toast.makeText(this, "amol", Toast.LENGTH_SHORT).show();
    }

    public void meth_way_third(View view){
        Toast.makeText(this, "wahane", Toast.LENGTH_SHORT).show();
    }

}