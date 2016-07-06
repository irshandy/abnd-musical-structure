package com.example.android.musicstructures;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView albumart = (ImageView) findViewById(R.id.albumart);

        albumart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(NowPlayingActivity.this, AlbumsActivity.class);

                startActivity(albumIntent);
            }
        });

        TextView songtitle = (TextView) findViewById(R.id.songtitle);

        songtitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(NowPlayingActivity.this, SongsActivity.class);

                startActivity(songsIntent);
            }
        });

        final TextView songartist = (TextView) findViewById(R.id.songartist);

        songartist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(NowPlayingActivity.this, ArtistsActivity.class);

                startActivity(artistIntent);
            }
        });

        ImageView rewind = (ImageView) findViewById(R.id.rewind);

        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Tapping that should rewind the music. But it is not yet implemented";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        ImageView play = (ImageView) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Tapping that should pause or play the music. But it is not yet implemented";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        ImageView fastforward = (ImageView) findViewById(R.id.fastforward);

        fastforward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Tapping that should fast forward the music. But it is not yet implemented";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}
