package com.example.ubuntu.textview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ubuntu.textview.R;

public class MainActivity extends AppCompatActivity {

    private int w;
    private int h;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        float density = metrics.density;
        int densityDpi = metrics.densityDpi;
        final String w = Integer.toString(width);
        final String h = Integer.toString(height);

        Log.d("fb1", width + "," + height + "," + densityDpi);

        Toast.makeText(getApplicationContext(), width + ", " + height + "," + densityDpi, Toast.LENGTH_LONG).show();

        Button bw = (Button) findViewById(R.id.w);
        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.showInfo);
                tv.setText(w);
            }
        });

        Button bh = (Button) findViewById(R.id.h);
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.showInfo);
                tv.setText(h);
            }
        });

    }
}





