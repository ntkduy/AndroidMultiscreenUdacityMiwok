package com.ntkduy1604.androidmultiscreenudacitymiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Add array of Words To NumbersActivity
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "1"));
        words.add(new Word("two", "2"));
        words.add(new Word("three", "3"));
        words.add(new Word("four", "4"));
        words.add(new Word("five", "5"));
        words.add(new Word("six", "6"));
        words.add(new Word("seven", "7"));
        words.add(new Word("eight", "8"));
        words.add(new Word("nine", "9"));
        words.add(new Word("ten", "10"));



        // Create an ArrayAdapter variable with String data type
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        //Create a ListView variable
        ListView listView = (ListView) findViewById(R.id.activity_numbers);

        listView.setAdapter(itemsAdapter);

    }
}
