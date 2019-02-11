package com.example.week5daily2homeassignment.model.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.example.week5daily2homeassignment.model.student.Student;

import java.util.ArrayList;

public class StudentDatabaseSqlHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "student_db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "student_gpa_table";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_GPA = "gpa";
    private static final String FIELD_PHONE = "phone";


    public StudentDatabaseSqlHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "("
                + FIELD_NAME + " TEXT PRIMARY KEY, "
                + FIELD_GPA + " TEXT, "
                + FIELD_PHONE + " TEXT)";
        db.rawQuery(query, null);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        onCreate(db);

    }

    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> returnList = new ArrayList<>();

        return returnList;
    }

    public Student getSingleStudentByName(String name) {
        Student returnStudent = null;

        return returnStudent;
    }

    public void insertNewStudent(Student passedStudent) {

    }

    public void deleteStudent(Student passedStudent) {

    }

    public void updateStudent(Student passedStudent) {

    }


}
