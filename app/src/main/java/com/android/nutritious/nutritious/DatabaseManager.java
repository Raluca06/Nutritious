package com.android.nutritious.nutritious;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ralu on 29.04.2015.
 */
public class DatabaseManager extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "UserManager";

    // Contacts table name
    private static final String TABLE_USER = "user";

    // User Table Columns names
    private static final String USER_ID = "id";
    private static final String USER_NAME = "name";
    private static final String USER_AGE = "age";
    private static final String USER_GENDER = "gender";
    private static final String USER_WEIGHT = "weight";
    private static final String USER_HEIGHT = "height";
    private static final String USER_TARGET_WEIGHT = "target_weight";
    private static final String USER_HEIGHT_MEASURING_UNIT = "height_measuring_unit";
    private static final String USER_WEIGHT_MEASURING_UNIT = "weight_measuring_unit";
    private static final String USER_WAKEUP_TIME = "wakeup_time";
    private static final String USER_NAP_TIME = "nap_time";
    private static final String USER_AM_PM = "am_pm";

    public DatabaseManager(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param db The database.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Construct a table for todo items
        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
                + USER_ID + " INTEGER PRIMARY KEY," + USER_NAME + " TEXT,"
                + USER_AGE + " INTEGER" + USER_GENDER + " TEXT" + USER_WEIGHT + "INTEGER" + USER_HEIGHT + "INTEGER" + USER_TARGET_WEIGHT + "INTEGER" +")";
        db.execSQL(CREATE_USER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion == 1) {
            // Wipe older tables if existed
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
            // Create tables again
            onCreate(db);
        }
    }

}
