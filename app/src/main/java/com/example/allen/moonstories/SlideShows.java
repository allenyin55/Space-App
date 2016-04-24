package com.example.allen.moonstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class SlideShows extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_shows);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        viewFlipper.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(3000);
    }
}
