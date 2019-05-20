package odt.tugas.gama.nomophobia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import odt.tugas.gama.nomophobia.data.DbHelper;
import odt.tugas.gama.nomophobia.util.Question;
import odt.tugas.gama.nomophobia.util.ResultActivity;

public class QuizActivity extends AppCompatActivity {
    private String tag = this.getClass().getSimpleName();
    private Activity activity = this;
    ProgressDialog loading;
    ImageButton btinstruksi;
    List<Question> quesList;
    int score = 0;
    int skor = 0;
    int qid = 0;
    Question currentQ;
    TextView txtQuestion;
    RadioButton rda, rdb, rdc, rdd;
    Button butNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().setTitle("Kuis");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        loading = new ProgressDialog(activity);
        loading.setMessage("Mohon Tunggu......");
        loading.setIndeterminate(false);
        loading.setCancelable(false);
        //loading.show();
        final CardView cardView = findViewById(R.id.card_view);
        cardView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in));
        btinstruksi = findViewById(R.id.btinstruksi);
        btinstruksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.layout_custom_dialog, null))
                        .create()
                        .show();
            }
        });

        DbHelper db = new DbHelper(this);
        quesList = db.getAllQuestions();
        currentQ = quesList.get(qid);
        txtQuestion = findViewById(R.id.textView1);
        butNext = findViewById(R.id.button1);

        butNext.setVisibility(View.GONE);

        rda = findViewById(R.id.radio0);
        rdb = findViewById(R.id.radio1);
        rdc = findViewById(R.id.radio2);
        rdd = findViewById(R.id.radio3);
        setQuestionView();

        final RadioGroup grp = findViewById(R.id.radioGroup1);
        grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio0:
                        skor = 4;
                        butNext.setVisibility(View.VISIBLE);
                        butNext.startAnimation(AnimationUtils.loadAnimation(activity,R.anim.zoom_in));
                        Toast.makeText(activity, "" + skor, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio1:
                        skor = 3;
                        butNext.setVisibility(View.VISIBLE);
                        butNext.startAnimation(AnimationUtils.loadAnimation(activity,R.anim.zoom_in));
                        Toast.makeText(activity, "" + skor, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio2:
                        skor = 2;
                        butNext.setVisibility(View.VISIBLE);
                        butNext.startAnimation(AnimationUtils.loadAnimation(activity,R.anim.zoom_in));
                        Toast.makeText(activity, "" + skor, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio3:
                        skor = 1;
                        butNext.setVisibility(View.VISIBLE);
                        butNext.startAnimation(AnimationUtils.loadAnimation(activity,R.anim.zoom_in));
                        Toast.makeText(activity, "" + skor, Toast.LENGTH_SHORT).show();
                }
            }
        });
                butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                RadioButton answer = findViewById(grp.getCheckedRadioButtonId());
                grp.clearCheck();

                score += skor++;
                Log.d("score", "Your score" + score);
                if (qid < 10) {//jumlah sepulu,mulai dari index 0
                    butNext.setVisibility(View.GONE);
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                    Bundle b = new Bundle();
                    //score=(score/qid)*100;//untuk menampilkan data presentase data hasil yang telah di inputkan
                    b.putInt("score", score);
                    intent.putExtras(b);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_quiz, menu);
        return true;
    }

    private void setQuestionView() {
        txtQuestion.setText(currentQ.getQUESTION());
        rda.setText(currentQ.getOPTA());
        rdb.setText(currentQ.getOPTB());
        rdc.setText(currentQ.getOPTC());
        rdd.setText(currentQ.getOPTD());
        qid++;
    }
}
