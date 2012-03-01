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
        setContentView(R.layout.inside_tardis);

        ImageView insideTardisButton = (ImageView)findViewById(R.id.inside_tardis);
        insideTardisButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                Toast.makeText(InsideTardisActivity.this, R.string.timey_wimey, Toast.LENGTH_LONG).show();
            }
        });
    }
}
