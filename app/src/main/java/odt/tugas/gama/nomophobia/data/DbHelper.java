package odt.tugas.gama.nomophobia.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import odt.tugas.gama.nomophobia.util.Question;

import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.KEY_ANSWER;
import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.KEY_ID;
import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.KEY_OPTA;
import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.KEY_OPTB;
import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.KEY_OPTC;
import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.KEY_OPTD;
import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.KEY_QUES;
import static odt.tugas.gama.nomophobia.data.QuizContract.MovieEntry.TABLE_QUEST;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "NomoPhobiaQuiz";

    private SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_QUES + " TEXT, "
                + KEY_ANSWER + " TEXT, "
                + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, "
                + KEY_OPTC + " TEXT, "
                + KEY_OPTD + " TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }

    private void addQuestions() {
        Question q1 = new Question("Saya Merasa Khawatir Jika Tidak Bisa\n" +
                "Memperoleh Informasi dan Tertinggal Berita\n" +
                "Terkini (Misal: Berita Terkini, Cuaca, Dll)\n" +
                "dengan Menggunakan mobile phone Saat\n" +
                "Membutuhkannya ?", "Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q1);
        Question q2 = new Question("Saya selalu membawa mobile phone\n" +
                "kemanapun saya pergi bahkan ke Toilet ?", "Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q2);
        Question q3 = new Question("Saya selalu membawa charger mobile phone\n" +
                "setiap saya pergi keluar rumah ?", "Sangat Tidak Sesuai", "Tidak Sesuai","Sesuai","Sangat Sesuai","?");
        this.addQuestion(q3);
        Question q4 = new Question(" Saya lebih nyaman jika mempunyai lebih dari\n" +
                "satu mobile phone ?", "Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q4);
        Question q5 = new Question(" Saya Merasa Gelisah dan kesepian Jika Saya\n" +
                "Tidak Dapat Menghabiskan Waktu Saya Untuk\n" +
                "Menggunakan mobile phone ?", "Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q5);
        Question q6= new Question(" Saya Merasa Terganggu Ketika Tidak\n" +
                "Diperbolehkan Mengunakan mobile phone Dan/\n" +
                "Atau Fasilitasnya Ketika Saya membutuhkannya\n" +
                "(Misal: Ketika mobile phone Disita, Tidak\n" +
                "Boleh Membawa Atau Menggunakan mobile\n" +
                "phone Dalam Acara Tertentu)?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q6);
        Question q7= new Question(" Ketika Saya Tidak Membawa mobile\n" +
                "phone,Saya Akan Merasa Aneh Karena Saya\n" +
                "Tidak Tahu Harus Berbuat Apa dan saya tidak\n" +
                "dapat Up-To-Date dengan Media Sosial Dan\n" +
                "Jaringan Online Lainnya? ","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q7);
        Question q8= new Question(" Saya Merasa Gelisah Jika mobile phone Saya Kehabisan Baterai? ","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q8);
        Question q9= new Question(" Saya Merasa Gelisah Jika mobile phone Saya\n" +
                "Tidak Memiliki Sinyal/Terhubung Jaringan\n" +
                "Internet? ","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q9);
        Question q10= new Question(" Saya Merasa Khawatir Jika Saya Tidak Dapat\n" +
                "Menerima Pesan Atau Telepon Masuk?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q10);
        Question q11= new Question("Saya Merasa Gelisah Jika Saya Tidak Bisa\n" +
                "Mengirim Pesan Melalui Sosial Media\n" +
                "(Instagram, Wa, Line, Dsb)?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q11);
        Question q12= new Question("Jika Saya Tidak Ada Sinyal Paket Data, Atau\n" +
                "Tidak Dapat Terkoneksi Dengan Wi-Fi, Maka\n" +
                "Saya Akan Mengecek Terus Menerus Untuk\n" +
                "Melihat Jika Ada Sinyal Atau Dapat\n" +
                "Menemukan Koneksi?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q12);
        Question q13= new Question("Saya Merasa Gelisah Jika Tidak Dapat\n" +
                "Mengecek Notification Pada mobile phone Saya?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q13);
        Question q14= new Question("Ketika Saya Tidak Membawa mobile phone,\n" +
                "Saya Akan Merasa Aneh Karena Saya Tidak\n" +
                "Dapat Mengecek Pemberitahuan (Notifications)\n" +
                "Terbaru Dari Teman Saya dan Jaringan Online\n" +
                "Lainnya?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q14);
        Question q15= new Question("Jika Saya Tidak Dapat Mengecek mobile phone\n" +
                "Untuk Sementara Waktu, Maka Akan Timbul\n" +
                "Keinginan Untuk Mengeceknya ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q15);
        Question q16= new Question("Ketika Saya Tidak Membawa mobile phone,\n" +
                "Saya Akan Merasa Cemas Karena Saya Tidak\n" +
                "Dapat Mengecek Pesan Di E-Mail Saya ?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q16);
        Question q17= new Question("Saya Merasa Khawatir Jika Keluarga Atau Teman Tidak Dapat Menghubungi Saya ? ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q17);
        Question q18= new Question("Saya Merasa Khawatir Jika Saya Tidak Dapat\n" +
                "Menghubungi Keluarga Atau Teman ?","Sangat Sesui", "Sesui", "Tidak Sesui", "Sangat Tidak Sesui","?");
        this.addQuestion(q18);
        Question q19= new Question("Saya Merasa Khawatir Jika Komunikasi Saya\n" +
                "Dengan Keluarga Atau Teman Terputus?","Sangat Sesui", "Sesui", "Tidak Sesui", "Sangat Tidak Sesui","?");
        this.addQuestion(q19);
        Question q20= new Question("Saya Merasa Gelisah Jika Tidak Menggunakan\n" +
                "mobile phone Sebelum Tidur ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q20);
        Question q21= new Question("Saya Merasa Gelisah Jika Saya Tidak Bisa\n" +
                "Memberikan Informasi Kepada Orang Lain\n" +
                "dengan Cepat ?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q21);
        Question q22= new Question("Saya Merasa Khawatir Jika Saya Tidak Dapat\n" +
                "Berkomunikasi Dengan Keluarga Atau Teman\n" +
                "Melalui mobile phone ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q22);
        Question q23= new Question("Ketika Saya Tidak Membawa mobile phone,\n" +
                "Saya Akan Merasa Cemas Karena Saya Tidak\n" +
                "Dapat Berkomunikasi Secara Langsung Dengan\n" +
                "Keluarga Dan/Atau Teman ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q23);
        Question q24= new Question("Ketika Saya Tidak Membawa mobile phone,\n" +
                "Saya Akan Merasa Cemas Karena Koneksi\n" +
                "Rutin Saya Dengan Keluarga Dan/ Atau Teman\n" +
                "Selama Ini Akan Terputus ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q24);
        Question q25= new Question("Ketika Saya Tidak Membawa mobile phone,\n" +
                "Saya Akan Merasa Khawatir Karena Keluarga\n" +
                "Dan/ Atau Teman Tidak Dapat Menjangkau\n" +
                "Saya ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q25);
        Question q26= new Question("Jika mobile phone Saya Hilang, Saya Khawatir\n" +
                "Karena Tidak Dapat Mengirim Pesan dan Panggilan Ke Teman Dan/ Atau Keluarga ? ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q26);
        Question q27= new Question("Jika mobile phone Saya Hilang, Saya Khawatir\n" +
                "Karena Data Kontak Teman Dan/Atau Keluarga\n" +
                "Saya Juga Hilang ?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q27);
        Question q28= new Question("Saya tidak merasa cemas jika harus membeli\n" +
                "paket data dua kali dalam sebulan ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q28);
        Question q29= new Question("Saya selalu menanyakan password WI-FI\n" +
                "ditempat yang ada jaringan WI-Finya ?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q29);
        Question q30= new Question("Saya lebih selektif dalam menggunakan data\n" +
                "kuota mobile phone ? ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q30);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_OPTD, quest.getOPTD());
        //Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setOPTD(cursor.getString(6));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }

    public int rowcount() {
        int row = 0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row = cursor.getCount();
        return row;
    }
}
