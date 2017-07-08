package com.example.parktaejun.nosmoking.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.parktaejun.nosmoking.FragmentActivity.FriendsFragment;
import com.example.parktaejun.nosmoking.FragmentActivity.GraphFragment;
import com.example.parktaejun.nosmoking.FragmentActivity.NewsfeedFragment;

/**
 * Created by parktaejun on 2017. 7. 9..
 */

public class MainAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public MainAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FriendsFragment FFragment = new FriendsFragment();
                return FFragment;
            case 1:
                NewsfeedFragment MFragment = new NewsfeedFragment();
                return MFragment;
            case 2:
                GraphFragment GFragment = new GraphFragment();
                return GFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
