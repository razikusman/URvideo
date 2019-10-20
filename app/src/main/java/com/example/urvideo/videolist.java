package com.example.urvideo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class videolist extends AppCompatActivity {

    private static final int M_pr=1;

    ListView listView;
    ArrayAdapter arrayAdapter;
    ArrayList<String> arrayList;

    private String meadia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolist);
        File file =  new File(Environment.getExternalStorageDirectory().toString());
        String video;
        video[] = {String.valueOf(file)};
        }



        ArrayAdapter adapter= new ArrayAdapter<String>(this, R.layout.activity_videolistv,video);

        ListView listView = findViewById(R.id.videolist);
        listView.setAdapter(adapter);


    }



    /* private void videolist(){



        ArrayList<String> pathArrList = new ArrayList<>();
        if (cursor != null){
            while (cursor.moveToNext()){
                pathArrList.add(cursor.getString(0));
            }
            cursor.close();
        }
        log.e("all path",pathArrList.toString());
    }*/
}
