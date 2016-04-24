package com.example.allen.moonstories;

import java.util.Calendar;

/**
 * Created by Allen on 2016/4/23.
 */
public class GetDate {

    Calendar c = Calendar.getInstance();
    public int getCurrentDay(){
        return  c.get(Calendar.DAY_OF_MONTH);
    }
    public int getCurrentMonth()
    {
        return c.get(Calendar.MONTH);
    }
    public int getCurrentYear(){
        return c.get(Calendar.YEAR);
    }
}
