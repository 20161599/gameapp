package com.example.game;

import android.graphics.drawable.Drawable;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.util.*;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
int step=1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btnimage1(View view) {
        ImageView img1 = (ImageView) findViewById(R.id.imageView1);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);


        if (img2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView2)).setImageDrawable(img1.getDrawable());
            ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.bg_blue);

            step++;

        }
        if (img3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {

            ((ImageView) findViewById(R.id.imageView3)).setImageDrawable(img1.getDrawable());
            ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.bg_blue);
            step++;

        }
    }
    public void btnimage2(View view) {
        int k=0;
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);

        ImageView img4 = (ImageView) findViewById(R.id.imageView4);
        ImageView img1 = (ImageView) findViewById(R.id.imageView1);
        if (img2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.sun).getConstantState())&img1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {

            setContentView(R.layout.layout2);
            TextView txt=(TextView)findViewById(R.id.con);

           txt.setText("Congratulation!you used "+step+" step");
           // Toast.makeText(this, " You clicked the button", Toast.LENGTH_LONG).show();
           k=1;
        }
        if (img1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())&k!=1) {


            ((ImageView) findViewById(R.id.imageView1)).setImageDrawable(img2.getDrawable());
            ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.bg_blue);
            step++;

        }
        if (img4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView4)).setImageDrawable(img2.getDrawable());
            ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.bg_blue);

            step++;

        }
    }

    public void btnimage3(View view) {
        int k=0;
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        ImageView img1 = (ImageView) findViewById(R.id.imageView1);

        ImageView img4= (ImageView) findViewById(R.id.imageView4);
        ImageView img5 = (ImageView) findViewById(R.id.imageView5);

        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        if (img3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.sun).getConstantState())&img1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            setContentView(R.layout.layout2);

            TextView txt=(TextView)findViewById(R.id.con);
            txt.setText("Congratulation!you used "+step+" step");
            //Toast.makeText(this, " You clicked the button", Toast.LENGTH_LONG).show();
            k=1;
        }

        if (img1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())&k!=1) {
            ((ImageView) findViewById(R.id.imageView1)).setImageDrawable(img3.getDrawable());
            ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.bg_blue);

            step++;

        }
        if (img4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView4)).setImageDrawable(img3.getDrawable());
            ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.bg_blue);
            step++;

        }
        if (img5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView5)).setImageDrawable(img3.getDrawable());
            ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.bg_blue);
            step++;

        }
    }

    public void btnimage4(View view) {

        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        ImageView img4= (ImageView) findViewById(R.id.imageView4);

        ImageView img6 = (ImageView) findViewById(R.id.imageView6);

        if (img2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView2)).setImageDrawable(img4.getDrawable());
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.bg_blue);
            step++;

        }
        if (img3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView3)).setImageDrawable(img4.getDrawable());
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.bg_blue);
            step++;

        }
        if (img6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {

            ((ImageView) findViewById(R.id.imageView6)).setImageDrawable(img4.getDrawable());
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.bg_blue);
            step++;

        }


    }
    public void btnimage5(View view) {

        ImageView img3 = (ImageView) findViewById(R.id.imageView3);

        ImageView img5 = (ImageView) findViewById(R.id.imageView5);
        ImageView img6 = (ImageView) findViewById(R.id.imageView6);

        if (img3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView3)).setImageDrawable(img5.getDrawable());
            ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.bg_blue);
            step++;

        }
        if (img6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView6)).setImageDrawable(img5.getDrawable());
            ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.bg_blue);
            step++;

        }

    }
    public void btnimage6(View view) {

        ImageView img4= (ImageView) findViewById(R.id.imageView4);
        ImageView img5 = (ImageView) findViewById(R.id.imageView5);
        ImageView img6 = (ImageView) findViewById(R.id.imageView6);

        if (img4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView4)).setImageDrawable(img6.getDrawable());
            ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.bg_blue);
            step++;

        }
        if (img5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.bg_blue).getConstantState())) {
            ((ImageView) findViewById(R.id.imageView5)).setImageDrawable(img6.getDrawable());
            ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.bg_blue);
            step++;

        }

    }


    public void btnstart(View view) {
         setContentView(R.layout.layout);
    }

    public void btncon(View view) {
        setContentView(R.layout.activity_main);

    }
    public void btnexit(View view) {
        finish();

    }

}
