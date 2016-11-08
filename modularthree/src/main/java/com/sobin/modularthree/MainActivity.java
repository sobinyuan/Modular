package com.sobin.modularthree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sobin.modularone.OneConfig;
import com.sobin.modulartwo.TwoConfig;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnOn(View v){
        TextView textView = (TextView) findViewById(R.id.text3);
//        SuperID.initFaceSDK(this);
        textView.setText(ThreeConfig.SDKCHANNEL + TwoConfig.SDKCHANNEL + OneConfig.SDKCHANNEL);
//        textView.setText(ThreeConfig.SDKCHANNEL +"------"+ LibConfig.Libcc);
    }
}
