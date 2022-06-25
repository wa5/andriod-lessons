package com.example.andriod_lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.andriod_lessons.lessons.youtubevideos.Youtube_videos;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Button btn = (Button) findViewById(R.id.youtbebutton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =findViewById(R.id.youtbebutton);
        Log.d("myTag", "This is my message");
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Youtube_videos.class);
                startActivity(intent);
                Log.d("myTag", "This is my message1");

            }
        });
    }



}