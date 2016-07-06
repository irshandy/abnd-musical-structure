package com.example.android.musicstructures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        int[] ids = {R.id.songItems1, R.id.songItems2, R.id.songItems3, R.id.songItems4, R.id.songItems5,
                R.id.songItems6, R.id.songItems7, R.id.songItems8};
        for (int id : ids) {
            TextView lbl = (TextView) findViewById(id);
            lbl.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);

                    startActivity(nowPlayingIntent);
                }
            });
        }
    }
}
