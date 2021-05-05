package com.example.ql_thuchi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CreateFragment extends FragmentStateAdapter {
    public CreateFragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ThuFragment();
            case 1:
                return new ChiFragment();
        }
        return new ThuFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
