package odt.tugas.gama.nomophobia.util;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import odt.tugas.gama.nomophobia.MainActivity;
import odt.tugas.gama.nomophobia.QuizActivity;
import odt.tugas.gama.nomophobia.R;
import odt.tugas.gama.nomophobia.data.DbHelper;
import odt.tugas.gama.nomophobia.data.QuizContract;

public class ResultActivity extends AppCompatActivity {
	private String tag=getClass().getSimpleName();
	private Activity activity=this;
	ProgressDialog loading;
	Button btresselesai;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		loading = new ProgressDialog(activity);
		loading.setMessage("Mohon Tunggu......");
		loading.setIndeterminate(false);
		loading.setCancelable(false);
		loading.show();

		Runnable progressRunnable = new Runnable() {
			@Override
			public void run() {
				loading.cancel();
				TextView t= findViewById(R.id.textResult);
				TextView persen= findViewById(R.id.skor);

				Bundle b = getIntent().getExtras();
				int score= b.getInt("score");
				Log.e(tag, "onCreate: "+score );
				t.setText("Prosentase Ketergantungan Anda ");
				persen.setText(""+score);
			}
		};

		Handler pdCanceller = new Handler();
		pdCanceller.postDelayed(progressRunnable, 3000);

//		btresselesai=findViewById(R.id.selesai);
//		btresselesai.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				startActivity(new Intent(activity, MainActivity.class));
//			}
//		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		return super.onOptionsItemSelected(item);
	}

}
