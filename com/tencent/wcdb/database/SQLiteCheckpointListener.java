package com.tencent.wcdb.database;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface SQLiteCheckpointListener {
    void onAttach(SQLiteDatabase sQLiteDatabase);

    void onDetach(SQLiteDatabase sQLiteDatabase);

    void onWALCommit(SQLiteDatabase sQLiteDatabase, String str, int i2);
}
