package com.example.android.saidaguide;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by rmhuneineh on 24/02/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    Context context;
    private String tabTitles[];

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = new String[] {context.getString(R.string.historic), context.getString(R.string.food),
                context.getString(R.string.mall), context.getString(R.string.sport)};
    }



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
