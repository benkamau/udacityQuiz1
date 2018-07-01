package com.example.bennj.udacityquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quizapp.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE  " +
                QuizContract.QuestionsTable.TABLE_NAME + "( " +
                QuizContract.QuestionsTable._ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                QuizContract.QuestionsTable.COLUMN_QUESTION + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_CHOICE1 + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_CHOICE2 + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_CHOICE3 + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_CHOICE4 + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER + "INTEGER " +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }
}

