package com.example.avgfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class first extends AppCompatActivity {
    Button b1;
    MediaController mediaController;
    VideoView vi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        b1=(Button)findViewById(R.id.bfir);
        vi=(VideoView)findViewById(R.id.vfir);
        mediaController=new MediaController(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videopath="android.resource://com.example.avgfitness/"+R.raw.crunch;
                Uri uri=Uri.parse(videopath);
                vi.setVideoURI(uri);
                vi.setMediaController(mediaController);
                mediaController.setAnchorView(vi);
                vi.start();
            }
        });
    }
}
