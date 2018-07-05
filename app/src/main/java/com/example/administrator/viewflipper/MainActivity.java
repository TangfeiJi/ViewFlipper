package com.example.administrator.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
private ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper=findViewById(R.id.flipper);
        for (int i = 0; i < 10; i++) {
            final View ll_content = View.inflate(MainActivity.this, R.layout.item_flipper, null);
//            TextView tv_content = (TextView) ll_content.findViewById(R.id.tv_content);
//            tv_content.setText(testList.get(i).toString());
            flipper.addView(ll_content);
        }
    }
}
