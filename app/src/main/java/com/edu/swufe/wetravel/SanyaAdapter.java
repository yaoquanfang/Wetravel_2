package com.edu.swufe.wetravel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SanyaAdapter extends FragmentPagerAdapter {

        private String[] title = new String[]{"第一次来","穷游","深度小众"};

        public SanyaAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                return new FirstSanya();
            }else if(position==1){
                return new SecondSanya();
            }else{
                return new ThirdSanya();
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }

        @Override
        public int getCount() {
            return 3;
        }
}
