package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FishPagerAdapter6 extends FragmentStateAdapter {

    public FishPagerAdapter6(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FishFragment61();
            case 1:
                return new FishFragment62();
            default:
                return new FishFragment61();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
