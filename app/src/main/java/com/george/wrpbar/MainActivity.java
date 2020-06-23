package com.george.wrpbar;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BesselView besselView, besselView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        besselView = findViewById(R.id.besselview);
        besselView.setMcolor(Color.rgb(255, 182, 193));
        besselView.setStyle(Paint.Style.FILL_AND_STROKE);
        besselView.startAnim();

        besselView2 = findViewById(R.id.besselview2);
        besselView2.setOriginY(450);
        besselView2.setDx(100);
        besselView2.setRange(70);
        besselView2.setStyle(Paint.Style.FILL_AND_STROKE);
        besselView2.startAnim();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TAG", "x:" + event.getX() + " y:" + event.getY());
        return true;
    }
}
