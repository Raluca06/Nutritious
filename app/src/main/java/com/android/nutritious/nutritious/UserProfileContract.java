package com.android.nutritious.nutritious;

import android.provider.BaseColumns;

/**
 * Created by Ralu on 5/8/2015.
 */
public class UserProfileContract {

    public static final class UserEntry implements BaseColumns{
        public static final String TABLE_NAME = "user" ;

        // User Table Columns names
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

    }

    public static final class FoodEntry implements BaseColumns{

        public static final String TABLE_NAME = "food";

        //Food Table Columns names
        public static final String COLUMN_USER_KEY = "user_id";
        public static final String COLUMN_DAY = "day";
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
}
