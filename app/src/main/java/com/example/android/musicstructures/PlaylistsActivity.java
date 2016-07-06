package com.example.android.musicstructures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        int[] ids = {R.id.playlist_item1, R.id.playlist_item2, R.id.playlist_item3, R.id.playlist_item4, R.id.playlist_item5,
                R.id.playlist_item6, R.id.playlist_item7, R.id.playlist_item8};
        for (int id : ids) {
            TextView lbl = (TextView) findViewById(id);
            lbl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent songsIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);

                    startActivity(songsIntent);
                }
            });
        }
    }
}
