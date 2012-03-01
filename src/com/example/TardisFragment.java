package com.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TardisFragment extends Fragment
{
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.tardis, container, false);

        // Get handle on the image view for click events
        ImageView tardisButton = (ImageView)layout.findViewById(R.id.tardis);
        tardisButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                // Show the inside of the Tardis
                startActivity(new Intent(getActivity(), InsideTardisActivity.class));
            }
        });

        return layout;
    }
}