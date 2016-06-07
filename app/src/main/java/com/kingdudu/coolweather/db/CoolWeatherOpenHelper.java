package com.kingdudu.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by KingDuDu on 2016/6/7.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * Province（省）表的建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province("
            + "id integer primary key autoincrement, "
            + "province_name text, "
            + "province_code text)";

    /**
     * City（市）表的建表语句
     */
    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement, "
            + "City_name text, "
            + "City_code text, "
            + "province_id integer)";

    /**
     * County（区）表的建表语句
     */
    public static final String CREATE_COUNTY = "create table County("
            + "id integer primary key autoincrement, "
            + "County_name text, "
            + "County_code text, "
            + "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
