package com.burakocak.githubrepo.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.burakocak.githubrepo.database.dao.FavoriteDao;
import com.burakocak.githubrepo.model.Favorite;

@Database(entities = {Favorite.class}, version = 1 ,exportSchema = false)
public abstract class FavoriteDatabase extends RoomDatabase {

    public abstract FavoriteDao favoriteDao();

    private static FavoriteDatabase INSTANCE;

    public static FavoriteDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (FavoriteDatabase.class)  {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context,FavoriteDatabase.class,"FAVORITE_DATABASE")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
