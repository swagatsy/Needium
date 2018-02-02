package com.example.donnie_darko.needium;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by donnie_darko on 27/10/17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {


    int num;

    public PagerAdapter(FragmentManager fm, int num)
    {
        super(fm);
        this.num=num;


    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                ForWhom fw = new ForWhom();
                return fw;
            case 1:
                ForWhat fq = new ForWhat();
                return fq;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return num;
    }
}
