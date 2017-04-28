package com.example.android.saidaguide;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by rmhuneineh on 24/02/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[] { "Historic", "Food", "Malls", "Sports" };

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2) {
            return new MallsFragment();
        } else {
            return new SportsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
