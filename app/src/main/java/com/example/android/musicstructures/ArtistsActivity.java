package com.example.android.musicstructures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        int[] ids = {R.id.artist_item1, R.id.artist_item2, R.id.artist_item3, R.id.artist_item4, R.id.artist_item5,
                R.id.artist_item6, R.id.artist_item7, R.id.artist_item8};
        for (int id : ids) {
            TextView lbl = (TextView) findViewById(id);
            lbl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);

                    startActivity(songsIntent);
                }
            });
        }
    }
}
