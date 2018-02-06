package com.kcktechsolutions.programmaster;

import android.support.v7.widget.CardView;

/**
 * Created by Ravi kiranJ on 2/6/2018.
 */

public interface CardAdapter{

        int MAX_ELEVATION_FACTOR = 8;

        float getBaseElevation();

        CardView getCardViewAt(int position);

        int getCount();
}
