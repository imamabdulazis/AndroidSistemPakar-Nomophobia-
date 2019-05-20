package odt.tugas.gama.nomophobia;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    private VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getSupportActionBar().setTitle("Video");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        vv = findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vv);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        vv.setMediaController(mediaController);
        vv.setVideoURI(uri);
        vv.requestFocus();
        vv.start();
    }
}
