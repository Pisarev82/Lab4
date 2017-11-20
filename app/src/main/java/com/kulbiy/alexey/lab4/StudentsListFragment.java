package com.kulbiy.alexey.lab4;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StudentsListFragment extends Fragment {
    List<Student> students;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_students_list, container, false);

        addStudents();

        ListView listView = (ListView) v.findViewById(R.id.students_list);

        ListAdapter listAdapter = new ListAdapter(getActivity().getBaseContext(), students);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = students.get(position);

                PictureFragment pictureFragment = new PictureFragment();

                Bundle args = new Bundle();
                args.putInt("picture_id", student.getPictureBig());
                pictureFragment.setArguments(args);

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, pictureFragment);
                fragmentTransaction.commit();
            }
        });

        return v;
    }

    void addStudents() {
        students = new ArrayList<>();
        students.add(new Student("Леха0", R.drawable.boy, R.drawable.boy_big));
        students.add(new Student("Леха1", R.drawable.girl, R.drawable.girl_big));
        students.add(new Student("Леха2", R.drawable.boy_1, R.drawable.boy_1_big));
        students.add(new Student("Леха3", R.drawable.girl_1, R.drawable.girl_1_big));
        students.add(new Student("Леха4", R.drawable.boy_2, R.drawable.boy_2_big));
        students.add(new Student("Леха5", R.drawable.girl_2, R.drawable.girl_2_big));
        students.add(new Student("Леха6", R.drawable.boy_3, R.drawable.boy_3_big));
        students.add(new Student("Леха7", R.drawable.girl_3, R.drawable.girl_3_big));
    }
}
