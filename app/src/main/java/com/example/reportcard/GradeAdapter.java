package com.example.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GradeAdapter extends ArrayAdapter<Grade> {

    public GradeAdapter(Activity context, ArrayList<Grade> grades){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, grades);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Grade} object located at this position in the list
        Grade currentGrade = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID subject_name_text_view.
        TextView subjectNameTextView = (TextView) listItemView.findViewById(R.id.subject_name_text_view);
        // Get the Subject from the currentGrade object and set this text on
        // the subjectNameTextView.
        assert currentGrade != null;
        subjectNameTextView.setText(currentGrade.getSubject());

        // Find the TextView in the list_item.xml layout with the ID grade_out_of_100_text_view.
        TextView gradeOutOf100TextView = (TextView) listItemView.findViewById(R.id.grade_out_of_100_text_view);
        // Get the grade in the format grade/100 from the currentGrade object and set this text on
        // the gradeOutOf100TextView.
        gradeOutOf100TextView.setText(String.valueOf(currentGrade.getGradeOutOf100()));

        // Find the TextView in the list_item.xml layout with the ID grade_letter_format_text_view.
        TextView gradeLetterFormatTextView = (TextView) listItemView.findViewById(R.id.grade_letter_format_text_view);
        // Get the grade in the Letter format from the currentGrade object and set this text on
        // the gradeLetterFormatTextView.
        gradeLetterFormatTextView.setText(currentGrade.getGradeLetterFormat());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
