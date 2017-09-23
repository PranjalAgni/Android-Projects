package com.example.newu.spanishnumbers;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void musicPlay(View view) {
        int id = view.getId();
        String nameId = view.getResources().getResourceEntryName(id);
        int musicPlayer = getResources().getIdentifier(nameId , "raw" , "com.example.newu.spanishnumbers");
        final MediaPlayer mediaPlayer = MediaPlayer.create(this , musicPlayer);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
