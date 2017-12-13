package com.example.android.githubpracticeudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeTextHungarian(View view){
        TextView helloText = findViewById(R.id.helloText);
        helloText.setText("Hello világ!");
    }

//    public void makeTextYourLangauge1(View view){
//        TextView helloText = findViewById(R.id.helloText);
//        helloText.setText("");
//    }
//
//     public void makeTextYourLangauge1(View view){
//        TextView helloText = findViewById(R.id.helloText);
//        helloText.setText("");
//    }
//
//     public void makeTextYourLangauge1(View view){
//        TextView helloText = findViewById(R.id.helloText);
//        helloText.setText("");
//    }
//
//     public void makeTextYourLangauge1(View view){
//        TextView helloText = findViewById(R.id.helloText);
//        helloText.setText("");
//    }
//
//     public void makeTextYourLangauge1(View view){
//        TextView helloText = findViewById(R.id.helloText);
//        helloText.setText("");
//    }



}
