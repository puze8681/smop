package com.example.parktaejun.nosmoking.Main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.parktaejun.nosmoking.Font.Font;
import com.example.parktaejun.nosmoking.R;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Font.setGlobalFont(this, getWindow().getDecorView(), 'r');
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_friends_friends).setTag("time_lime"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_newsfeed).setTag("chat_room"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_graph).setTag("chat_room"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Smop");

        MainAdapter pagerAdapter = new MainAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                switch (tabLayout.getSelectedTabPosition()){
                    case 0:
                        tab.setIcon(R.drawable.ic_friends_friends);
                        break;
                    case 1:
                        tab.setIcon(R.drawable.ic_newsfeed_newsfeed);
                        break;
                    case 2:
                        tab.setIcon(R.drawable.ic_graph_graph);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch (tabLayout.getSelectedTabPosition()){
                    case 0:
                        tab.setIcon(R.drawable.ic_friends);
                        break;
                    case 1:
                        tab.setIcon(R.drawable.ic_newsfeed);
                        break;
                    case 2:
                        tab.setIcon(R.drawable.ic_graph);
                        break;
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
