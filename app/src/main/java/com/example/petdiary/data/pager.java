package com.example.petdiary.data;
import static com.example.petdiary.data.CatList.IMAGE_DRAWABLES;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.petdiary.fragment.Fragment_result;

public class pager extends FragmentStatePagerAdapter {



    public pager(Fragment fragment) {
        super(fragment.getChildFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        // Note: Initialize with the child fragment manager.

    }

    @Override
    public int getCount() {
        return IMAGE_DRAWABLES.length;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return Fragment_result.newInstance(IMAGE_DRAWABLES[position]);
    }
}



