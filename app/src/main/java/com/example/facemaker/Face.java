/*
author @Daniel Lee
Filename: FaceMaker
Version - 3/1/21
 */


package com.example.facemaker;

//imports random & canvas
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SeekBar;

import java.util.Random;

   // int skinColor = 0;
   // int eyeColor = 0;
     //int hairColor = 0;
  //  int hairStyle = 0;

public class Face extends SurfaceView implements SeekBar.OnSeekBarChangeListener, AdapterView.OnItemSelectedListener{
      int skinColor = 0;
      int eyeColor = 0;
      int hairColor = 0;
      int hairStyle = 0;
    public Face(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        setBackgroundColor(Color.WHITE);
    }

    public void randomize(){ //Generates a Randome Color
        Random rand = new Random();
        int red = rand.nextInt(255);
        int green = rand.nextInt(255);
        int blue = rand.nextInt(255);
        //int ColorOut = Color.argb(255, red, green, blue);
        //return ColorOut;

        //randomizer - face
        /*
     public Face(){
        skinColor = randomize();
        eyeColor = randomize();
        hairColor = randomize();
        hairStyle = randomizeHair();
    }
         */
    }



    private void randomColor(){
        Random rand = new Random();
    }

    public void onDraw (Canvas canvas){
        //order : hair, skin, eye, mouth
        Paint drawFace = new Paint();
        drawFace.setColor(0xff0000ff);
        canvas.drawCircle(100, 100, 100, drawFace);

    }
    //draw Hair here
    public void drawHair (Canvas canvas, int hairStyle){
        //hairstyle -> one in different method
        if (this.hairStyle == 0){
            Paint drawFace = new Paint();
            drawFace.setColor(0xff000000);
            canvas.drawCircle(50, 50, 50, drawFace);
        }


    }



/*
    //////underneath are helper methods to draw each componenets
    private void drawEye(Canvas canvas){
        //draw eyes

    }
    private void drawHair(Canvas canvas){
        //draw hairs

    }
    private void drawSkin(Canvas canvas){
        //draw skin

    }
    private void drawMouth(Canvas canvas){
        //draw mouth

    }

 */


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        //modify
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // modify
        hairStyle = position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


