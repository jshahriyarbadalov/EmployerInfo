package com.shahriyar.employerinfo.data;

import android.content.Context;

import com.shahriyar.employerinfo.pojo.Employee;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Employee.class}, version=2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase database;
    private static final Object LOCK=new Object();
    private static final String DB_NAME="employees.db";
    public static AppDatabase getInstance(Context context){
        synchronized (LOCK) {
            if (database == null) {
                database = Room.databaseBuilder(context, AppDatabase.class, DB_NAME).fallbackToDestructiveMigration().build();
            }
            return database;
        }
    }

    public abstract EmployeeDao employeeDao();
}
