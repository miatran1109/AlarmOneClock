package com.example.maalarm.finalalarm;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    PageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new clock_frag();
                break;
            case 1:
                frag = new stop_watch_frag();
                break;
//            case 2:
//                frag = new FragmentThree();
//                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
    //@Override
   // public CharSequence getPageTitle(int position) {
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//
//        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
//        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
//        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        //}
       // return title;
    }
//}

