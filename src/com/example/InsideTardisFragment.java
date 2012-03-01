package com.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class InsideTardisFragment extends Fragment
{
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.inside_tardis_content, container, false);

        // Get handle on the image view for click events
        ImageView insideTardisButton = (ImageView) layout.findViewById(R.id.inside_tardis);
        insideTardisButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                // Show your favorite Doctor Who quote
                Toast.makeText(getActivity(), R.string.timey_wimey, Toast.LENGTH_LONG).show();
            }
        });

        return layout;
    }
}