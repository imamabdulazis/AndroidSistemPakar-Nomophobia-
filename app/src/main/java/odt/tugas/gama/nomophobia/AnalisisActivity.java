package odt.tugas.gama.nomophobia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnalisisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis);
        getSupportActionBar().setTitle("Data Hasil Analisis");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
