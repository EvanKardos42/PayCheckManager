package kardos.engima.paycheckmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class PaycheckDatabase extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DatabaseContract.FeedEntry.TABLE_NAME + " (" +
                    DatabaseContract.FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    DatabaseContract.FeedEntry.COLUMN_NAME_TITLE + " TEXT," +
                    DatabaseContract.FeedEntry.COLUMN_NAME_AMOUNT + " REAL," +
                    DatabaseContract.FeedEntry.COLUMN_NAME_PERCENTAGE + " TEXT)";

    public PaycheckDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void add(FractionOfCheck f){
        ContentValues values = new ContentValues();
        values.put(DatabaseContract.FeedEntry.COLUMN_NAME_TITLE,f.getTile());
        values.put(DatabaseContract.FeedEntry.COLUMN_NAME_AMOUNT,f.getAmount());
        values.put(DatabaseContract.FeedEntry.COLUMN_NAME_PERCENTAGE,f.getPercentage());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(DatabaseContract.FeedEntry.TABLE_NAME,null,values);
        db.close();
    }

    public void delete(String title){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM "+ DatabaseContract.FeedEntry.TABLE_NAME +
                    " WHERE " + DatabaseContract.FeedEntry.COLUMN_NAME_TITLE +
                    " = \" " + title + " \" ;");
    }
}
