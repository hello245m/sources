package com.tencent.wcdb.database;

import java.io.Closeable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class SQLiteClosable implements Closeable {
    private int mReferenceCount;

    public void acquireReference() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract void onAllReferencesReleased();

    @Deprecated
    public void onAllReferencesReleasedFromContainer() {
    }

    public void releaseReference() {
    }

    @Deprecated
    public void releaseReferenceFromContainer() {
    }
}
