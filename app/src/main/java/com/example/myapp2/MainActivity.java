package com.example.myapp2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mList;
    ArrayList<Item> arrayItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.list_view);

        arrayItem = new ArrayList<>();
        itemDetails();

        CustomAdapter mAdapter = new CustomAdapter(this, arrayItem);

        mList.setAdapter(mAdapter);

        mList.setOnItemClickListener(this::onItemClick);

    }

    public void itemDetails() {

        arrayItem.add(new Item("avatar_1", "SeyedAriya", "12:14", "سلام. بریم آبگرم فردوس؟"));
        arrayItem.add(new Item("avatar_2", "Ahmad", "11:41", "فایلا رو دانلود کردی؟"));
        arrayItem.add(new Item("avatar_3", "Amir", "11:38", "شرمنده امروز نمیرسم بیام"));
        arrayItem.add(new Item("avatar_4", "Rza", "11:32", "اوکی. ممنون"));
        arrayItem.add(new Item("avatar_1", "Taghi", "12:14", "سلام. بریم آبگرم فردوس؟"));
        arrayItem.add(new Item("avatar_2", "Abas", "11:41", "فایلا رو دانلود کردی؟"));
        arrayItem.add(new Item("avatar_3", "Arsalan", "11:38", "شرمنده امروز نمیرسم بیام"));
        arrayItem.add(new Item("avatar_4", "sina", "11:32", "اوکی. ممنون"));

    }

    private void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, "Item Number " + (i+1), Toast.LENGTH_SHORT).show();
    }
}