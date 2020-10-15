package com.example.bai2_lap62;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Lap6Adapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
   private final List<String > fragmentListString = new ArrayList<>();
    public Lap6Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListString.get(position);
    }
    public void addFrag(Fragment fragment,String titel){
        fragmentList.add(fragment);
        fragmentListString.add(titel);
    }
}
