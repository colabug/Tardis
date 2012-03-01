package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TardisActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView tardisButton = (ImageView)findViewById(R.id.tardis);
        tardisButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                Toast.makeText(TardisActivity.this, R.string.timey_wimey, Toast.LENGTH_LONG).show();
                startActivity(new Intent(TardisActivity.this, InsideTardisActivity.class));
            }
        });
    }
}
