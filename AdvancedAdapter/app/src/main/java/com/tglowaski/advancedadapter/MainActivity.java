package com.tglowaski.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Student one = new Student("Eddie","Desimone","Construction Management");
    Student two = new Student("John","Hamm","Business Management");
    Student three = new Student("Jon","Snow","Criminal Justice");
    Student four = new Student("Rick","Sanchez","Chemistry");
    Student five = new Student("Jim","Halpert","Marketing");
    ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students.add(one);
        students.add(two);
        students.add(three);
        students.add(four);
        students.add(five);
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        StudentAdapter adapter = new StudentAdapter(this,students);
        listView.setAdapter(adapter);





    }
}


