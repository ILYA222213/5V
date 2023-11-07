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

    private ListView categoriesListView; // ListView для отображения списка категорий
    private ArrayList<String> categoriesList; //Список категорий
    private ArrayAdapter<String> categoriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoriesListView = findViewById(R.id.categories_listview);

        categoriesList = new ArrayList<>();
        categoriesList.add("Спорт"); //добавлени списка категории Спорт
        categoriesList.add("Работа"); //добавление списка категории Работа
        categoriesList.add("Дом"); //Добавление списка категории Дом

        categoriesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, categoriesList);//адамптер для списка категориий
        categoriesListView.setAdapter(categoriesAdapter);

        categoriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, TasksActivity.class);
                intent.putExtra("category", categoriesList.get(position)); //передача выбранной категории в акстивити с задачами
                startActivity(intent);
            }
        });
    }
}