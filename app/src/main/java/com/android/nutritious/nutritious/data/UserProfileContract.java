package com.android.nutritious.nutritious.data;

import android.provider.BaseColumns;

/**
 * Created by Ralu on 5/8/2015.
 */
public class UserProfileContract {

    public static final String AUTHORITY = "com.android.nutritious.nutritious.data";
    public static final String SCHEMA = "CONTENT";

    public static final String USER_URI = "";

    public static final class UserEntry implements BaseColumns{
        public static final String TABLE_NAME = "user" ;

        // User Table Columns names
        public static final String USER_NAME = "name";
        public static final String USER_AGE = "age";
        public static final String USER_GENDER = "gender";
        public static final String USER_WEIGHT = "weight";
        public static final String USER_HEIGHT = "height";
        public static final String USER_TARGET_WEIGHT = "target_weight";
        public static final String USER_HEIGHT_MEASURING_UNIT = "height_measuring_unit";
        public static final String USER_WEIGHT_MEASURING_UNIT = "weight_measuring_unit";
        public static final String USER_WAKEUP_TIME = "wakeup_time";
        public static final String USER_NAP_TIME = "nap_time";

    }

    public static final class FoodEntry implements BaseColumns{

        public static final String TABLE_NAME = "food";

        //Food Table Columns names
        public static final String COLUMN_DISH_NAME = "dish_name";
        public static final String COLUMN_CALORIES = "calories";
        public static final String COLUMN_TOTAL_FAT = "total_fat";
        public static final String COLUMN_SATURATED_FAT = "saturated_fat";
        public static final String COLUMN_POLYUNSATURATED_FAT = "polyunsaturated_fat";
        public static final String COLUMN_MONOSATURATED_FAT = "monosaturated_fat";
        public static final String COLUMN_CHOLESTEROL = "cholesterol";
        public static final String COLUMN_SODIUM = "sodium";
        public static final String COLUMN_POTASSIUM = "potassium";
        public static final String COLUMN_TOTAL_CARBOHYDRATE = "total_carbohydrate";
        public static final String COLUMN_DIETARY_FIBER = "dietary_fiber";
        public static final String COLUMN_SUGAR = "sugar";
        public static final String COLUMN_PROTEIN = "protein";
        public static final String COLUMN_VITAMIN_A = "vitaminA";
        public static final String COLUMN_VITAMIN_C = "vitaminC";
        public static final String COLUMN_VITAMIN_D = "vitaminD";
        public static final String COLUMN_VITAMIN_B6 = "vitaminB6";
        public static final String COLUMN_VITAMIN_B12 = "vitaminB12";
        public static final String COLUMN_CALCIUM = "calcium";
        public static final String COLUMN_MAGNESIUM = "magnesium";
        public static final String COLUMN_IRON = "iron";
    }

    public static final class MealsEntry implements BaseColumns{
        public static final String TABLE_NAME = "meals";

        //Meals Table Columns names
        public static final String COLUMN_FOOD_KEY = "food_id";
        public static final String COLUMN_USER_KEY = "user_id";
        public static final String COLUMN_MEAL_TYPE = "meal_type";
        public static final String COLUMN_MEAL_DATE = "date";
        public static final String COLUMN_FOOD_AMOUNT = "amount";
    }
}
