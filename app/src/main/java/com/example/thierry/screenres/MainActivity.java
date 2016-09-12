package com.example.thierry.screenres;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView xRes, yRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xRes = (TextView)findViewById(R.id.xRes);
        yRes = (TextView)findViewById(R.id.yRes);
        Display display = getWindowManager().getDefaultDisplay();
        xRes.setText("" + display.getWidth());
        yRes.setText("" + display.getHeight());
    }
}
