package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class InsideTardisActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Associate a view with this screen
        setContentView(R.layout.inside_tardis);

        // Get handle on the image view for click events
        ImageView insideTardisButton = (ImageView)findViewById(R.id.inside_tardis);
        insideTardisButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                // Show your favorite Doctor Who quote
                Toast.makeText(InsideTardisActivity.this, R.string.timey_wimey, Toast.LENGTH_LONG).show();
            }
        });
    }
}
