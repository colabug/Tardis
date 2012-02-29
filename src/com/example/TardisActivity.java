package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class TardisActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView tardisButton = (ImageView)findViewById(R.id.tardis);
    }
}
