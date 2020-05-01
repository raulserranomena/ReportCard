package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of Grades
        ArrayList<Grade> grades = new ArrayList<Grade>();
        grades.add(new Grade("Matemáticas", 97, "A"));
        grades.add(new Grade("Física", 98, "A"));
        grades.add(new Grade("Biología", 89, "B+"));
        grades.add(new Grade("Química", 93, "A-"));
        grades.add(new Grade("Emprendimiento", 96, "A"));
        grades.add(new Grade("Fundamentos de Programación", 100, "A"));

        // Create an {@link GradeAdapter}, whose data source is a list of {@link Grade}s. The
        // adapter knows how to create list items for each item in the list.
        GradeAdapter adapter = new GradeAdapter(this, grades);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_main.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link GradeAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Grade} in the list.
        listView.setAdapter(adapter);




    }
}
