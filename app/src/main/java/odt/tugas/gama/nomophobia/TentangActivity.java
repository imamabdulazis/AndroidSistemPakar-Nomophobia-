package odt.tugas.gama.nomophobia;

import android.content.res.Configuration;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class TentangActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        getSupportActionBar().setTitle("Tentang Aplikasi");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        View aboutPage = new AboutPage(this)
                .setImage(R.drawable.nomo)
                .setDescription("Aplikasi ini di buat untuk menganalisis penyakit NomoPhobia, Yaitu penyakit ketergantungan terhadap HandPhone.")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("Connect with me")
                .addEmail("imamabdulazis028@gmail.com")
                .addWebsite("https://github.com/imamabdulazis/")
                .addFacebook("aziz.imam.73")
                .addTwitter("sumbrah")
                .addInstagram("_imunn")
                .addGitHub("imamabdulazis")
                .addItem(getCopyRightsElement())
                .create();
        setContentView(aboutPage);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.about_github), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TentangActivity.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
}
