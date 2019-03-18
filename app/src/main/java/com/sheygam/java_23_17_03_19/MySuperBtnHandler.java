package com.sheygam.java_23_17_03_19;

import android.util.Log;
import android.view.View;

public class MySuperBtnHandler implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Log.d("MY_TAG", "onClick handler: ");
    }
}
