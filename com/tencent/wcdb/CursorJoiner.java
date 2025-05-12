package com.tencent.wcdb;

import java.util.Iterator;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class CursorJoiner implements Iterator<Result>, Iterable<Result> {
    private int[] mColumnsLeft;
    private int[] mColumnsRight;
    private Result mCompareResult;
    private boolean mCompareResultIsValid;
    private Cursor mCursorLeft;
    private Cursor mCursorRight;
    private String[] mValues;

    /* renamed from: com.tencent.wcdb.CursorJoiner$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$CursorJoiner$Result = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class Result {
        private static final /* synthetic */ Result[] $VALUES = null;
        public static final Result BOTH = null;
        public static final Result LEFT = null;
        public static final Result RIGHT = null;

        private Result(String str, int i2) {
        }

        public static Result valueOf(String str) {
        }

        public static Result[] values() {
        }
    }

    public CursorJoiner(Cursor cursor, String[] strArr, Cursor cursor2, String[] strArr2) {
    }

    private int[] buildColumnIndiciesArray(Cursor cursor, String[] strArr) {
    }

    private static int compareStrings(String... strArr) {
    }

    private void incrementCursors() {
    }

    private static void populateValues(String[] strArr, Cursor cursor, int[] iArr, int i2) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    @Override // java.lang.Iterable
    public Iterator<Result> iterator() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Result next() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Result next() {
    }
}
