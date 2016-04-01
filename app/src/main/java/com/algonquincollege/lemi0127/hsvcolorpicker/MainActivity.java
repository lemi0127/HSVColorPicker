package com.algonquincollege.lemi0127.hsvcolorpicker;

import android.app.Activity;
import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 *  {HSV Color Picker Midterm assignment for Android Application Development}
 *  @author {lemi0127@algonquinlive.com}
 */

public class MainActivity extends Activity {

    private static final String ABOUT_DIALOG_TAG;

    static {
        ABOUT_DIALOG_TAG = "About Dialog";
    }

    private TextView colorSwatch;
    private TextView hueText, saturationText, valueText;
    float currentHue, currentSaturation, currentValue;
    float []setHSV = new float[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Text init
        colorSwatch = (TextView) findViewById(R.id.colorSwatch);
        hueText = (TextView) findViewById(R.id.hue);
        saturationText = (TextView) findViewById(R.id.saturation);
        valueText = (TextView) findViewById(R.id.value);

        //Hue Bar init
        final SeekBar hueBar = (SeekBar) findViewById(R.id.hueSB);
        hueBar.setOnSeekBarChangeListener(SeekBarListener);

        //Saturation Bar init
        final SeekBar saturationBar = (SeekBar) findViewById(R.id.saturationSB);
        saturationBar.setOnSeekBarChangeListener(SeekBarListener);

        //Value Bar init
        final SeekBar valueBar = (SeekBar) findViewById(R.id.valueSB);
        valueBar.setOnSeekBarChangeListener(SeekBarListener);


        //Button Group init
        Button black = (Button) findViewById(R.id.blackButton);
        Button red = (Button) findViewById(R.id.redButton);
        Button lime = (Button) findViewById(R.id.limeButton);
        Button blue = (Button) findViewById(R.id.blueButton);
        Button yellow = (Button) findViewById(R.id.yellowButton);
        Button cyan = (Button) findViewById(R.id.cyanButton);
        Button magenta = (Button) findViewById(R.id.magentaButton);
        Button silver = (Button) findViewById(R.id.silverButton);
        Button grey = (Button) findViewById(R.id.greyButton);
        Button maroon = (Button) findViewById(R.id.maroonButton);
        Button olive = (Button) findViewById(R.id.oliveButton);
        Button green = (Button) findViewById(R.id.greenButton);
        Button purple = (Button) findViewById(R.id.purpleButton);
        Button teal = (Button) findViewById(R.id.tealButton);
        Button navy = (Button) findViewById(R.id.navyButton);




        //Color Swatch Long Click

        colorSwatch.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
                hueText.setText("Hue:");
                saturationText.setText("Saturation:");
                valueText.setText("Value/Lightness:");
                return false;
            }
        });

        //Button Group Listeners

        black.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(0,0,0);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(0);
                saturationBar.setProgress(0);
                valueBar.setProgress(0);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        red.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(0,100,100);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(0);
                saturationBar.setProgress(100);
                valueBar.setProgress(100);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        lime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(120,100,100);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(120);
                saturationBar.setProgress(100);
                valueBar.setProgress(100);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(240,100,100);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(240);
                saturationBar.setProgress(100);
                valueBar.setProgress(100);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(60,100,100);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(60);
                saturationBar.setProgress(100);
                valueBar.setProgress(100);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        cyan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(180,100,100);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(180);
                saturationBar.setProgress(100);
                valueBar.setProgress(100);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        magenta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(300,100,100);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(300);
                saturationBar.setProgress(100);
                valueBar.setProgress(100);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        silver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(0,0,75);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(0);
                saturationBar.setProgress(0);
                valueBar.setProgress(75);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        grey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(0,0,50);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(0);
                saturationBar.setProgress(0);
                valueBar.setProgress(50);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        maroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(0,100,50);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(0);
                saturationBar.setProgress(100);
                valueBar.setProgress(50);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        olive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(60,100,50);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(60);
                saturationBar.setProgress(100);
                valueBar.setProgress(50);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        green.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(120,100,50);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(120);
                saturationBar.setProgress(100);
                valueBar.setProgress(50);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(300,100,50);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(300);
                saturationBar.setProgress(100);
                valueBar.setProgress(50);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        teal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(180,100,50);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(180);
                saturationBar.setProgress(100);
                valueBar.setProgress(50);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

        navy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                HSV(240,100,50);
                colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));
                hueBar.setProgress(240);
                saturationBar.setProgress(100);
                valueBar.setProgress(50);
                Toast.makeText(getApplicationContext(), "H:" + hueBar.getProgress() + "% " + "S:" + saturationBar.getProgress() + "% " + "V:" + valueBar.getProgress() + "% ", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void HSV(float hue ,float saturation ,float value){

        setHSV[0]= hue;
        setHSV[1]= saturation;
        setHSV[2]= value;
        colorSwatch.setBackgroundColor(Color.HSVToColor(setHSV));

    }




    private SeekBar.OnSeekBarChangeListener SeekBarListener =
             new SeekBar.OnSeekBarChangeListener(){
@Override
public void onProgressChanged(SeekBar seekBar,int progress,boolean fromUser){
        switch(seekBar.getId()){
        case R.id.hueSB:
        currentHue = progress;
        hueText.setText("HUE:"+currentHue+"\u00B0");
        break;

        case R.id.saturationSB:
        currentSaturation= (float)progress/100;
        saturationText.setText("SATURATION:" + currentSaturation + "\u00B0");
        break;

        case R.id.valueSB:
        currentValue=(float)progress/100;
        valueText.setText("VALUE/LIGHTNESS:" + currentValue + "\u00B0");
        break;
        }
            HSV(currentHue,currentSaturation,currentValue);
        }

                 @Override
                 public void onStartTrackingTouch(SeekBar seekBar) {

                 }

                 @Override
                 public void onStopTrackingTouch(SeekBar seekBar) {

                     hueText.setText("Hue:");
                     saturationText.setText("Saturation:");
                     valueText.setText("Value/Lightness:");
                 }


             };



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_about) {
            DialogFragment newFragment = new AboutDialogFragment();
            newFragment.show( getFragmentManager(), ABOUT_DIALOG_TAG );
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //private void
    }


