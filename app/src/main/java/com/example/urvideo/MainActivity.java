package com.example.urvideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private SeekBar seekBar;
    private String path;
    private String meadia = Environment.getExternalStorageDirectory().getAbsolutePath();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        seekBar = findViewById(R.id.seekBar);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE},PackageManager.PERMISSION_GRANTED);
        videoView.setVideoPath(meadia);


    }

    public void PlayButton(View view){
        videoView.start();
    }

    public void StopButton(View view){
        videoView.stopPlayback();

    }

    public void PauseButton(View view){
        videoView.pause();

    }

    public void RestartButton(View view){
        videoView.resume();

    }

}
