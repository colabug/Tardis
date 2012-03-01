package com.example;

import android.app.Activity;
import android.os.Bundle;

public class TardisActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Associate a view with this screen
        setContentView(R.layout.main);
    }
}
