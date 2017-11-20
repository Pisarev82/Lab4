package com.kulbiy.alexey.lab4;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PictureFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_picture, container, false);

        ImageView imageView = (ImageView) v.findViewById(R.id.picture);

        int picture_id = getArguments().getInt("picture_id", R.drawable.girl);

        imageView.setImageResource(picture_id);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentsListFragment studentsListFragment = new StudentsListFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, studentsListFragment);
                fragmentTransaction.commit();
            }
        });

        return v;
    }
}
