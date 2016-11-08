package com.sobin.modular;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.sobin.modularone.OneConfig;
import com.sobin.modularthree.ThreeConfig;
import com.sobin.modulartwo.TwoConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, OneConfig.SDKCHANNEL+ TwoConfig.SDKCHANNEL+ ThreeConfig.SDKCHANNEL,Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, ThreeConfig.SDKCHANNEL+"==="+ LibConfig.Libcc,Toast.LENGTH_SHORT).show();




    }
}
