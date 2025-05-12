package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor a;

    public HMSCursorWrapper(Cursor cursor) {
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i2, CursorWindow cursorWindow) {
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
    }

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i2, int i3) {
    }

    public void setWindow(CursorWindow cursorWindow) {
    }
}
