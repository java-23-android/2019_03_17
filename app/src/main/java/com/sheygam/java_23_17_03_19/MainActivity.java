package com.sheygam.java_23_17_03_19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MY_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.my_btn);
        Button testBtn = findViewById(R.id.test_btn);
        Button superBtn = findViewById(R.id.my_super_btn);
        superBtn.setOnClickListener(new MySuperBtnHandler());
        testBtn.setOnClickListener(this);
        btn.setOnClickListener(this);
    }

//    public void onClick(View view){
////        Log.d("MY_TAG","My button clicked!");
//        Log.d(TAG, "onClick: ");
//    }

    public void onSecondClick(View view) {

//        Toast.makeText(this,"Second btn clicked",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Btn clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.my_btn){
            Toast.makeText(this, "My Btn", Toast.LENGTH_SHORT).show();
        }else if(v.getId() == R.id.test_btn){
            Toast.makeText(this, "Test btn", Toast.LENGTH_SHORT).show();
        }
    }
}
