package com.example.allen.moonstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Calendar;
import java.util.Currency;

public class MoonPhase extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon_phase);

        imageView = (ImageView) findViewById(R.id.imageView6);

        GetDate dateGetter = new GetDate();
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 0)
        {
            imageView.setImageResource(R.drawable.a0);
        }
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 1)
        {
            imageView.setImageResource(R.drawable.a1);
        }
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 2)
        {
            imageView.setImageResource(R.drawable.a2);
        }
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 3)
        {
            imageView.setImageResource(R.drawable.a3);
        }
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 4)
        {
            imageView.setImageResource(R.drawable.a4);
        }
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 5)
        {
            imageView.setImageResource(R.drawable.a5);
        }
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 6)
        {
            imageView.setImageResource(R.drawable.a6);
        }
        if (moon_phase(dateGetter.getCurrentDay(), dateGetter.getCurrentMonth(), dateGetter.getCurrentYear()) == 7)
        {
            imageView.setImageResource(R.drawable.a7);
        }
    }



    public int moon_phase(int m, int d, int y) {
    /*
      calculates the moon phase (0-7), accurate to 1 segment.
      0 = > new moon.
      4 => full moon.
      */

        int c, e;
        double jd;
        int b;
        double g, h, i, j;

        if (m < 3) {
            y--;
            m += 12;
        }
        ++m;
        g = Math.floor(365.25 * y);
        c = (int) g;
        h = 30.6 * m;
        e = (int) h;
        jd = c + e + d - 694039.09;  /* jd is total days elapsed */
        jd /= 29.53;           /* divide by the moon cycle (29.53 days) */
        i = jd;
        b = (int) i;    /* int(jd) -> b, take integer part of jd */
        jd -= b;		   /* subtract integer part to leave fractional part of original jd */
        j = jd * 8 + 0.5;
        b = (int) j;  /* scale fraction from 0-8 and round by adding 0.5 */
        b = b % 8;		   /* 0 and 8 are the same so turn 8 into 0 */
        return b;
    }
}
