package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TasksActivity extends AppCompatActivity {

    private ListView tasksListView;
    private EditText taskEditText;
    private Button addButton;
    private ArrayList<String> tasksList;
    private ArrayAdapter<String> tasksAdapter;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        category = getIntent().getStringExtra("category");

        tasksListView = findViewById(R.id.tasks_listview);
        taskEditText = findViewById(R.id.task_edittext);
        addButton = findViewById(R.id.add_button);

        tasksList = new ArrayList<>();

        tasksAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, tasksList);
        tasksListView.setAdapter(tasksAdapter);



        };
    }
