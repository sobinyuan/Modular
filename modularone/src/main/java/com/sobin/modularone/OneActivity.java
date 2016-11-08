package com.sobin.modularone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView textView = (TextView) findViewById(R.id.text1);

        textView.setText(OneConfig.SDKCHANNEL);
    }
}


