package odt.tugas.gama.nomophobia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MateriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        getSupportActionBar().setTitle("Materi");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView mWebView;
        mWebView = findViewById(R.id.index);

        mWebView.loadUrl("file:///android_asset/index.html");

    }
}
