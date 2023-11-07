package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView categoriesListView;
    private ArrayList<String> categoriesList;
    private ArrayAdapter<String> categoriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoriesListView = findViewById(R.id.categories_listview);

        categoriesList = new ArrayList<>();
        categoriesList.add("Спорт");
        categoriesList.add("Работа");
        categoriesList.add("Дом");
        // Добавьте остальные категории

        categoriesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, categoriesList);
        categoriesListView.setAdapter(categoriesAdapter);


        };
    }
