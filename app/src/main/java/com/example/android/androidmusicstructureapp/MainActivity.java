package com.example.android.androidmusicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Layout that shows the Now Is Playing category
        LinearLayout nowIsPlaying = (LinearLayout) findViewById(R.id.nowIsPlaying);
        LinearLayout albums = (LinearLayout) findViewById(R.id.albums);
        LinearLayout artists = (LinearLayout) findViewById(R.id.artists);
        LinearLayout musicStore = (LinearLayout) findViewById(R.id.musicStore);


        nowIsPlaying.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent nowIsPlayingIntent = new Intent(MainActivity.this, nowIsPlaying.class);
                        startActivity(nowIsPlayingIntent);
                    }
                });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, albums.class);
                startActivity(albumsIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, artists.class);
                startActivity(artistsIntent);
            }
        });

        musicStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(MainActivity.this, musicStore.class);
                startActivity(musicStoreIntent);
            }
        });



    }
}