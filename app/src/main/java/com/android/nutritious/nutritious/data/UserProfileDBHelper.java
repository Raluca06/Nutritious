package com.android.nutritious.nutritious.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.android.nutritious.nutritious.data.UserProfileContract.FoodEntry;
import com.android.nutritious.nutritious.data.UserProfileContract.UserEntry;
import com.android.nutritious.nutritious.data.UserProfileContract.MealsEntry;

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

        String CREATE_USER_TABLE = "CREATE TABLE " + UserEntry.TABLE_NAME
                + "("
                + UserEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
                + UserEntry.USER_NAME + " TEXT NOT NULL,"
                + UserEntry.USER_AGE + " INTEGER, "
                + UserEntry.USER_GENDER + " TEXT,"
                + UserEntry.USER_WEIGHT + "INTEGER,"
                + UserEntry.USER_HEIGHT + "INTEGER,"
                + UserEntry.USER_TARGET_WEIGHT + "INTEGER, "
                + UserEntry.USER_HEIGHT_MEASURING_UNIT + "TEXT, "
                + UserEntry.USER_WEIGHT_MEASURING_UNIT + "TEXT, "
                + UserEntry.USER_WAKEUP_TIME + "INTEGER, "
                + UserEntry.USER_NAP_TIME + "INTEGER, "
                + ")";

        String CREATE_FOOD_TABLE = "CREATE TABLE " + FoodEntry.TABLE_NAME
                + "("
                + FoodEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FoodEntry.COLUMN_DISH_API_ID + "INTEGER, "
                + FoodEntry.COLUMN_DISH_NAME + "TEXT, "
                + FoodEntry.COLUMN_CALORIES + "REAL NOT NULL, "
                + FoodEntry.COLUMN_TOTAL_FAT + "REAL NOT NULL, "
                + FoodEntry.COLUMN_SATURATED_FAT + "REAL NOT NULL, "
                + FoodEntry.COLUMN_POLYUNSATURATED_FAT + "REAL NOT NULL, "
                + FoodEntry.COLUMN_MONOSATURATED_FAT + "REAL NOT NULL, "
                + FoodEntry.COLUMN_CHOLESTEROL + "REAL NOT NULL, "
                + FoodEntry.COLUMN_SODIUM + "REAL NOT NULL, "
                + FoodEntry.COLUMN_POTASSIUM + "REAL NOT NULL, "
                + FoodEntry.COLUMN_TOTAL_CARBOHYDRATE + "REAL NOT NULL, "
                + FoodEntry.COLUMN_DIETARY_FIBER + "REAL NOT NULL, "
                + FoodEntry.COLUMN_SUGAR + "REAL NOT NULL, "
                + FoodEntry.COLUMN_PROTEIN + "REAL NOT NULL, "
                + FoodEntry.COLUMN_VITAMIN_A + "REAL NOT NULL, "
                + FoodEntry.COLUMN_VITAMIN_C + "REAL NOT NULL, "
                + FoodEntry.COLUMN_CALCIUM + "INTEGER NOT NULL, "
                + FoodEntry.COLUMN_IRON + "INTEGER NOT NULL, "
                + FoodEntry.COLUMN_VITAMIN_D + "INTEGER NOT NULL, "
                + FoodEntry.COLUMN_VITAMIN_B6 + "INTEGER NOT NULL, "
                + FoodEntry.COLUMN_VITAMIN_B12 + "INTEGER NOT NULL, "
                + FoodEntry.COLUMN_MAGNESIUM + "INTEGER NOT NULL"
                + FoodEntry.COLUMN_MAGNESIUM + "INTEGER NOT NULL"
                + ")";

        String CREATE_MEALS_TABLE = "CREATE TABLE " + MealsEntry.TABLE_NAME
                + "("
                + MealsEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
                + "FOREIGN KEY (" + MealsEntry.COLUMN_USER_KEY + ") REFERENCES" + UserEntry.TABLE_NAME + UserEntry._ID
                + "FOREIGN KEY (" + MealsEntry.COLUMN_FOOD_KEY + ") REFERENCES" + FoodEntry.TABLE_NAME + FoodEntry._ID
                + MealsEntry.COLUMN_MEAL_DATE + "INTEGER NOT NULL,"
                + MealsEntry.COLUMN_MEAL_TYPE + "TEXT NOT NULL, "
                + MealsEntry.COLUMN_FOOD_AMOUNT + "TEXT NOT NULL "
                + ")";

        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_FOOD_TABLE);
        db.execSQL(CREATE_MEALS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Wipe older tables if existed
            db.execSQL("DROP TABLE IF EXISTS " + UserEntry.TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS " + FoodEntry.TABLE_NAME);
            // Create tables again
            onCreate(db);
    }

}
