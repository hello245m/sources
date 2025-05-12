package com.tencent.wcdb;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface CrossProcessCursor extends Cursor {
    void fillWindow(int i2, CursorWindow cursorWindow);

    CursorWindow getWindow();

    boolean onMove(int i2, int i3);
}
