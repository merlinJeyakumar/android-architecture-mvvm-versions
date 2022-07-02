package com.data.utility

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

object RoomMigration {
    val MIGRATION_v1_2 = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("ALTER TABLE tbl_contact ADD COLUMN is_system_user INTEGER DEFAULT 0 NOT NULL")
        }
    }
}