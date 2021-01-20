package com.example.grafika_zvuk;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer tetris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tetris = MediaPlayer.create(this, R.raw.tetris);
    }

    public void PlayMusic(View v)
    {
        tetris.start();
    }

    public void PauseMusic(View v)
    {
        if(tetris.isPlaying())
        {
            tetris.pause();
        }
    }

    public void LoopMusic(View v)
    {
        if(tetris.isLooping())
        {
            tetris.setLooping(false);
        }
        else
        {
            tetris.setLooping(true);
        }
    }
}