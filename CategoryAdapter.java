package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super ( fm );
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new OKCFragment ();
        }else if (position == 1){
            return new TTDFragment ();
        }else if(position == 2){
            return new GoodEatsFragment();
        }else{
            return new FunFactsFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString ( R.string.category_okc );
        } else if (position == 1) {
            return mContext.getString ( R.string.category_thingstodo );
        } else if (position == 2) {
            return mContext.getString ( R.string.category_goodeats );
        } else {
            return mContext.getString ( R.string.category_funfacts );
        }
    }
}
