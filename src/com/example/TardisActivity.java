package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TardisActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Associate a view with this screen
        setContentView(R.layout.main);

        // Get handle on the image view for click events
        ImageView tardisButton = (ImageView)findViewById(R.id.tardis);
        tardisButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                // Show the inside of the Tardis
                startActivity(new Intent(TardisActivity.this, InsideTardisActivity.class));
            }
        });
    }
}
