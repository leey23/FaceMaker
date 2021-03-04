package com.example.facemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Face face = (Face)findViewById(R.id.face);

        SeekBar seekBarRed = (SeekBar) findViewById(R.id.RedSetting);
        seekBarRed.setOnSeekBarChangeListener(face);

        SeekBar seekBarBlue = (SeekBar) findViewById(R.id.BlueSetting);
        seekBarBlue.setOnSeekBarChangeListener(face);

        SeekBar seekBarGreen = (SeekBar) findViewById(R.id.GreenSetting);
        seekBarGreen.setOnSeekBarChangeListener(face);

        Spinner spinner = (Spinner) findViewById(R.id.hairStyles);
        spinner.setOnItemSelectedListener(face);
    }
}




/*
////////////////////////
MotionEvent -> CakeController
public boolean onTouch(View view, MotionEvent motionEvent) {
        //
        //cm.SetIsCandle()
        if (motionEvent.getAction() == 0){
            model.by = motionEvent.getY();
            model.bx = motionEvent.getX();
            model.isBalloon = true;
            model.ty = motionEvent.getY();
            model.tx = motionEvent.getX();
            model.touch = true;
            myCakeView.invalidate();
        }
        //myCakeView.invalidate();
        return true;
    }
/////////////////////////
cakeView -> implemented from Balloon - Lab#4
public void drawBalloon(Canvas canvas){

        Paint paintBalloon = new Paint();
        paintBalloon.setColor(0xff0000ff);
        Paint stringColor = new Paint();
        stringColor.setColor(0xff000000);

        canvas.drawOval(cakeInfo.bx-25f, cakeInfo.by-50f,cakeInfo.bx+25f, cakeInfo.by+50f, paintBalloon);
        canvas.drawLine(cakeInfo.bx,cakeInfo.by+50f, cakeInfo.bx, cakeInfo.by+150f, stringColor);

    }
//////////////////////////////
onDraw method -> CakeView
if(cakeInfo.isBalloon) {
            drawBalloon(canvas);
        }
////////////////////////////
 */