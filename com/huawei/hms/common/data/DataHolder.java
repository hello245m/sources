package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final Builder BUILDER = null;
    public static final Parcelable.Creator<DataHolder> CREATOR = null;
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Builder {
        private String[] a;
        private final ArrayList<HashMap<String, Object>> b;
        private final String c;
        private final HashMap<Object, Integer> d;

        public /* synthetic */ Builder(String[] strArr, String str, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ String[] a(Builder builder) {
        }

        public static /* synthetic */ ArrayList b(Builder builder) {
        }

        public DataHolder build(int i2) {
        }

        public Builder setDataForContentValuesHashMap(HashMap<String, Object> hashMap) {
        }

        public Builder withRow(ContentValues contentValues) {
        }

        private Builder(String[] strArr, String str) {
        }

        public DataHolder build(int i2, Bundle bundle) {
        }

        public Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
        }
    }

    public /* synthetic */ DataHolder(Builder builder, int i2, Bundle bundle, int i3, AnonymousClass1 anonymousClass1) {
    }

    public static Builder builder(String[] strArr) {
    }

    private void checkAvailable(String str, int i2) {
    }

    public static DataHolder empty(int i2) {
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder, int i2, List list) {
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i2, int i3) {
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i2, int i3) throws IllegalArgumentException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    public final void collectColumsAndCount() {
    }

    public final void copyToBuffer(String str, int i2, int i3, CharArrayBuffer charArrayBuffer) {
    }

    public final void finalize() throws Throwable {
    }

    public final int getCount() {
    }

    public final Bundle getMetadata() {
    }

    public final int getStatusCode() {
    }

    public final Object getValue(String str, int i2, int i3, String str2) {
    }

    public final int getWindowIndex(int i2) {
    }

    public final boolean hasColumn(String str) {
    }

    public final boolean hasNull(String str, int i2, int i3) {
    }

    public final synchronized boolean isClosed() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ DataHolder(Builder builder, int i2, Bundle bundle, AnonymousClass1 anonymousClass1) {
    }

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i2) {
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i2, Bundle bundle) {
    }

    public DataHolder(Cursor cursor, int i2, Bundle bundle) {
    }

    private DataHolder(Builder builder, int i2, Bundle bundle) {
    }

    private DataHolder(Builder builder, int i2, Bundle bundle, int i3) {
    }
}
