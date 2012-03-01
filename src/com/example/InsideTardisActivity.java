package com.example;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class InsideTardisActivity extends FragmentActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Associate a view with this screen
        setContentView(R.layout.inside_tardis);
    }
}
