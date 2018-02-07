package com.zaaviyah.alpha_sqllite_7_2_18;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pakistan laptop on 2/7/2018.
 */

public class DatabaseHelper  extends SQLiteOpenHelper{

    private static final String DATABASE_NAME="shah.db";
    private static final String TABLE_NAME="shah";

     public  DatabaseHelper(Context context){

         super(context,DATABASE_NAME,null,1);

         SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
     }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " +TABLE_NAME +
                " (ID INTEGER PRIMARY KEY AUTOINCREMENT ," +
                " NAME TEXT , " +
                "MOBILE_NUMBER TEXT ," +
                "EMAIL TEXT)"  );
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }

   public boolean insertContact(String name, String phone, String email){

       SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

       ContentValues contentValues = new ContentValues();

       contentValues.put("NAME", name);
       contentValues.put("MOBILE_NUMBER", phone);
       contentValues.put("EMAIL", email);

       long result =sqLiteDatabase.insert("shah", null, contentValues);

       if (result == -1)
           return false ;
       else
           return  true ;

   }
}
