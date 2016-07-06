package com.example.android.musicstructures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        int[] ids = {R.id.album_item1, R.id.album_item2, R.id.album_item3, R.id.album_item4, R.id.album_item5,
                R.id.album_item6, R.id.album_item7, R.id.album_item8};
        for (int id : ids) {
            TextView lbl = (TextView) findViewById(id);
            lbl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);

                    startActivity(songsIntent);
                }
            });
        }
    }
}
