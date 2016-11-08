package com.sobin.modulartwo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView textView = (TextView) findViewById(R.id.text2);

        textView.setText(TwoConfig.SDKCHANNEL);
    }
}
