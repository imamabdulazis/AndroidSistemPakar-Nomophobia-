package odt.tugas.gama.nomophobia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView=findViewById(R.id.materi);
        cardView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MateriActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView=findViewById(R.id.video);
        cardView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,VideoActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView=findViewById(R.id.quiz);
        cardView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,QuizActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView=findViewById(R.id.hasil_analisis);
        cardView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnalisisActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView=findViewById(R.id.tentang);

        cardView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TentangActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}
