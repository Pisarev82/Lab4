package com.kulbiy.alexey.lab4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Student> {

    public ListAdapter(@NonNull Context context, @NonNull List<Student> students) {
        super(context, R.layout.students_list_item, students);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.students_list_item, null);
        }

        if (student != null) {
            ((ImageView) convertView.findViewById(R.id.picture)).setImageResource(student.getPicture());
            ((TextView) convertView.findViewById(R.id.text)).setText(student.getName());
        }

        return convertView;
    }
}
