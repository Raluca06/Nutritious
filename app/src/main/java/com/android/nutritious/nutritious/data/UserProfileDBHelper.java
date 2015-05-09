package com.android.nutritious.nutritious.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.android.nutritious.nutritious.data.UserProfileContract;

/**
 * Created by Ralu on 29.04.2015.
 */
public class UserProfileDBHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "userManager.db";

    public UserProfileDBHelper(Context context){
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
        String CREATE_USER_TABLE = "CREATE TABLE " + UserProfileContract.UserEntry.TABLE_NAME
                + "("
                + UserProfileContract.UserEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
                + UserProfileContract.UserEntry.USER_NAME + " TEXT NOT NULL,"
                + UserProfileContract.UserEntry.USER_AGE + " INTEGER, "
                + UserProfileContract.UserEntry.USER_GENDER + " TEXT,"
                + UserProfileContract.UserEntry.USER_WEIGHT + "INTEGER,"
                + UserProfileContract.UserEntry.USER_HEIGHT + "INTEGER,"
                + UserProfileContract.UserEntry.USER_TARGET_WEIGHT + "INTEGER"
                + UserProfileContract.UserEntry.USER_HEIGHT_MEASURING_UNIT + "TEXT"
                + UserProfileContract.UserEntry.USER_WEIGHT_MEASURING_UNIT + "TEXT"
                + UserProfileContract.UserEntry.USER_WAKEUP_TIME + "INTEGER"
                + UserProfileContract.UserEntry.USER_NAP_TIME + "INTEGER"
                + ")";

        String CREATE_FOOD_TABLE = "CREATE TABLE " + UserProfileContract.FoodEntry.TABLE_NAME
                + "("
                + UserProfileContract.FoodEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
                + "FOREIGN KEY (" + UserProfileContract.FoodEntry.COLUMN_USER_KEY + ") REFERENCES" + UserProfileContract.UserEntry.TABLE_NAME + UserProfileContract.UserEntry._ID
                + UserProfileContract.FoodEntry.COLUMN_DAY + "INTEGER NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_AMOUNT + "TEXT NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_CALORIES + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_TOTAL_FAT + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_SATURATED_FAT + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_POLYUNSATURATED_FAT + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_MONOSATURATED_FAT + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_CHOLESTEROL + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_SODIUM + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_POTASSIUM + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_TOTAL_CARBOHYDRATE + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_DIETARY_FIBER + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_SUGAR + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_PROTEIN + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_VITAMIN_A + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_VITAMIN_C + "REAL NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_CALCIUM + "INTEGER NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_IRON + "INTEGER NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_VITAMIN_D + "INTEGER NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_VITAMIN_B6 + "INTEGER NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_VITAMIN_B12 + "INTEGER NOT NULL"
                + UserProfileContract.FoodEntry.COLUMN_MAGNESIUM + "INTEGER NOT NULL"
                +")";
        db.execSQL(CREATE_USER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Wipe older tables if existed
            db.execSQL("DROP TABLE IF EXISTS " + UserProfileContract.UserEntry.TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS " + UserProfileContract.FoodEntry.TABLE_NAME);
            // Create tables again
            onCreate(db);
    }

}
