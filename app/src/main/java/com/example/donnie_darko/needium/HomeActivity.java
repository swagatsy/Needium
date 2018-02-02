package com.example.donnie_darko.needium;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;



public class HomeActivity extends AppCompatActivity implements ForWhom.OnFragmentInteractionListener, ForWhat.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addTab(tl.newTab().setText("For Whom?"));
        tl.addTab(tl.newTab().setText("For What?"));
        tl.setTabGravity(TabLayout.GRAVITY_FILL);
//
         final ViewPager vp = (ViewPager) findViewById(R.id.pager);
         final PagerAdapter pgad =  new PagerAdapter(getSupportFragmentManager(),tl.getTabCount());
        vp.setAdapter(pgad);
        vp.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tl));
//
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
