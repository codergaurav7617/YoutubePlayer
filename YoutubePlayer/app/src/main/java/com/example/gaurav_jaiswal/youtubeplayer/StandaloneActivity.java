package com.example.gaurav_jaiswal.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by gaurav_jaiswal on 28/2/17.
 */

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayViedo=(Button) findViewById(R.id.btnPlayViedo);
         Button btnPlaylist=(Button)findViewById(R.id.btnPlayList);

        btnPlayViedo.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent=null;
        switch (v.getId()){

            case R.id.btnPlayViedo:
                intent= YouTubeStandalonePlayer.createPlaylistIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_VIEDO_ID);
                break;


            case R.id.btnPlayList:
                intent= YouTubeStandalonePlayer.createPlaylistIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_PLAYLIST);
                break;



            default:

        }

        if(intent!=null){
            startActivity(intent);
        }


    }
}
