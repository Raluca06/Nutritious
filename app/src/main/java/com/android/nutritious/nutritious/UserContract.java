package com.android.nutritious.nutritious;

import android.provider.BaseColumns;

/**
 * Created by Ralu on 5/8/2015.
 */
public class UserContract {

    public static final class UserEntry implements BaseColumns{
        public static final String TABLE_NAME = "user" ;
    }

    public static final class FoodEntry implements BaseColumns{
        public static final String TABLE_NAME = "food";
    }
}
