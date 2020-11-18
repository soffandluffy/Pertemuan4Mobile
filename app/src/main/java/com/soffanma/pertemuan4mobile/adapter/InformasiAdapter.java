package com.soffanma.pertemuan4mobile.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.soffanma.pertemuan4mobile.fragment.InformasiFragment;
import com.soffanma.pertemuan4mobile.fragment.RatingFragment;

public class InformasiAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public InformasiAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InformasiFragment();
            case 1:
                return new RatingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}