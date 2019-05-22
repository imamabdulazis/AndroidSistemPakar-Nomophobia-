package odt.tugas.gama.nomophobia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AnimationUtils;

import odt.tugas.gama.nomophobia.util.ResultActivity;

public class MainActivity extends AppCompatActivity {
    CardView cardView1,cardView2,cardView3,cardView4,cardView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1=findViewById(R.id.materi);
        cardView1.setEnabled(false);
        cardView1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MateriActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView2=findViewById(R.id.video);
        cardView2.setEnabled(false);
        cardView2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,VideoActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView3=findViewById(R.id.quiz);
        cardView3.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,QuizActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView4=findViewById(R.id.hasil_analisis);
        //cardView4.setEnabled(false);
        cardView4.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ResultActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        cardView5=findViewById(R.id.tentang);
        cardView5.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in));
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TentangActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });


    }
}
