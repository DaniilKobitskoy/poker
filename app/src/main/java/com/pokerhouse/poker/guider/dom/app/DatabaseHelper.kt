package com.pokerhouse.poker.guider.dom.app

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "app_database"
        const val DATABASE_VERSION = 1
        const val TABLE_NAME = "user"
        const val COLUMN_IS_FIRST_LOGIN = "is_first_login"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTableQuery = "CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_IS_FIRST_LOGIN INTEGER)"
        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun updateFirstLoginStatus(isFirstLogin: Boolean) {
        val db = writableDatabase
        db.execSQL("INSERT OR REPLACE INTO $TABLE_NAME ($COLUMN_IS_FIRST_LOGIN) VALUES (${if (isFirstLogin) 1 else 0})")
        db.close()
    }

    @SuppressLint("Range")
    fun isFirstLogin(): Boolean {
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_NAME", null)
        val isFirstLogin = if (cursor.moveToFirst()) {
            cursor.getInt(cursor.getColumnIndex(COLUMN_IS_FIRST_LOGIN)) == 1
        } else {
            true // Вернуть true, если таблица пуста
        }
        cursor.close()
        db.close()
        return isFirstLogin
    }
}
