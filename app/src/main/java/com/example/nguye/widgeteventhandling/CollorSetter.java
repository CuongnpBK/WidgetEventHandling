package com.example.nguye.widgeteventhandling;

import android.view.View;

/**
 * Created by nguye on 2/27/2017.
 */

public class CollorSetter implements View.OnClickListener {
    private int regionColor;
    private EventHandlingExample mainActivity;

    public CollorSetter(int regionColor, EventHandlingExample mainActivity) {
        this.regionColor = regionColor;
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.setRegionColor(regionColor);
    }
}
