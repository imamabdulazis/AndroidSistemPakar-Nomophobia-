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
        Question q1 = new Question("Saya merasa informatif jika memperoleh informasi dan tidak tertinggal berita terkini ", "Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q1);
        Question q2 = new Question("Saya lebih merasa up to date jika mengetahui informasi status di mobile phone", "Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q2);
        Question q3 = new Question("Saya merasa tidak lengkap, jika kemanapun saya pergi bahkan ke toilet tidak membawa  mobile phone", "Sangat Sesuai", "Sesuai","Tidak Sesuai","Sangat Tidak Sesuai","?");
        this.addQuestion(q3);
        Question q4 = new Question(" Saya menggunakan mobile phone jika ada kepentingan dan ada yang menghubungi saya", "Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q4);
        Question q5 = new Question(" Saya merasa lebih tenang, jika saya pergi tidak lupa membawa charger  mobile phone" , "Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q5);
        Question q6= new Question(" Saya merasa lebih tenang, jika saya membawa mobile phone dengan baterai keadaan penuh","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q6);
        Question q7= new Question(" Saya pasti akan menempatkan mobile phone di tempat yang aman ","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q7);
        Question q8= new Question(" Jika  mobile phone saya hilang, Saya berusaha untuk segera mungkin membeli mobile phone baru  ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q8);
        Question q9= new Question(" Saya yakin jika ada pesan atau panggilan di mobile phone akan ada pemberitahuannya" ,"Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q9);
        Question q10= new Question(" Saya akan mengecek  mobile phone , dan berusaha mencari tempat yang terdapat sinyal atau terhubung jaringan internet","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q10);
        Question q11= new Question("Jika sinyal mobile phone sedang gangguan saya hanya menunggu sampai stabil kembali","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q11);
        Question q12= new Question("Ketika saya sedang berkunjung ke rumah sodara, sayapun akan bertanya dimana tempat yang terdapat sinyal/WI-FI","Sangat Sesuai", "Sesuai", " Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q12);
        Question q13= new Question("Saya mengecek mobile phone jika ada pemberitahuan masuk","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q13);
        Question q14= new Question("Ketika saya tidak membawa  mobile phone , Saya berusaha segera pulang untuk mengecek informasi terbaru pada media sosial atau jaringan online","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sanagt Tidak Sesuai","?");
        this.addQuestion(q14);
        Question q15= new Question("Saya yakin jika ada kegiatan atau informasi yang penting maka infonya tidak akan mendadak","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q15);
        Question q16= new Question("Saya terbiasa mengecek  mobile phone dengan durasi yang pendek (cepat)","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q16);
        Question q17= new Question("Menurut saya pesan di e-mail penting untuk segera diketahui, maka Saya akan berusaha sigap pada  mobile phone  ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q17);
        Question q18= new Question("Saya memanfaatkan aplikasi pada mobile phone sesuai kebutuhan","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q18);
        Question q19= new Question("Jika saya dan keluarga terputus hubungan komunikasinya, Saya segera menemuinya secara langsung","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q19);
        Question q20= new Question("Komunikasi melaluli mobile phone lebih efektif daripada komunikasi secara langsung","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q20);
        Question q21= new Question("Saya mematikan mobile phone saat malam hari (sedang istirahat/tidur)","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q21);
        Question q22= new Question("Menurut saya rutinitas mengecek  mobile phone sebelum tidur menjadi kebutuhan saya","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q22);
        Question q23= new Question("Saya merasa cukup komunikatif dengan Keluarga dan Teman melalui  mobile phone dan media sosial ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q23);
        Question q24= new Question("Saya lebih suka untuk berkomunikasi secara langsung","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q24);
        Question q25= new Question("Ketika saya berkunjung ke rumah sodara atau teman saya tidak sering menggunakan mobile phone","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q25);
        Question q26= new Question("Menurut saya dengan  mobile phone , Saya dengan Keluarga dan/atau Teman bisa saling menjangkau diwaktu yang diinginkan ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q26);
        Question q27= new Question("Pemakaian data kuota saya dalam sebulan cukup 2gb","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q27);
        Question q28= new Question("Saya selektif dalam menggunakan paket data kuota pada  mobile phone untuk kebutuhan ","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q28);
        Question q29= new Question("Jika paket data kuota habis belum sebulan atau belum pada waktunya saya siap membeli","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q29);
        Question q30= new Question("SSaya merasa senang menonton youtube walaupun menggunakan kuota banyak ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
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
