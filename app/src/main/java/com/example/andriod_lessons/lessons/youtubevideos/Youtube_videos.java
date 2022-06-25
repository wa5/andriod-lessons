package com.example.andriod_lessons.lessons.youtubevideos;

import androidx.appcompat.app.AppCompatActivity;
import com.example.andriod_lessons.R;
import android.os.Bundle;
import android.util.Log;

public class Youtube_videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_videos);
        Log.d("myTag1", "This is my message2");
    }
}