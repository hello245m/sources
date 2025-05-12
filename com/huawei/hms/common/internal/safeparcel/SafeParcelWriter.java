package com.huawei.hms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    private static void a(Parcel parcel, int i2, int i3) {
    }

    private static void b(Parcel parcel, int i2) {
    }

    public static int beginObjectHeader(Parcel parcel) {
    }

    public static void finishObjectHeader(Parcel parcel, int i2) {
    }

    public static void writeBigDecimal(Parcel parcel, int i2, BigDecimal bigDecimal, boolean z) {
    }

    public static void writeBigDecimalArray(Parcel parcel, int i2, BigDecimal[] bigDecimalArr, boolean z) {
    }

    public static void writeBigInteger(Parcel parcel, int i2, BigInteger bigInteger, boolean z) {
    }

    public static void writeBigIntegerArray(Parcel parcel, int i2, BigInteger[] bigIntegerArr, boolean z) {
    }

    public static void writeBoolean(Parcel parcel, int i2, boolean z) {
    }

    public static void writeBooleanArray(Parcel parcel, int i2, boolean[] zArr, boolean z) {
    }

    public static void writeBooleanList(Parcel parcel, int i2, List<Boolean> list, boolean z) {
    }

    public static void writeBooleanObject(Parcel parcel, int i2, Boolean bool, boolean z) {
    }

    public static void writeBundle(Parcel parcel, int i2, Bundle bundle, boolean z) {
    }

    public static void writeByte(Parcel parcel, int i2, byte b) {
    }

    public static void writeByteArray(Parcel parcel, int i2, byte[] bArr, boolean z) {
    }

    public static void writeByteArrayArray(Parcel parcel, int i2, byte[][] bArr, boolean z) {
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i2, SparseArray<byte[]> sparseArray, boolean z) {
    }

    public static void writeChar(Parcel parcel, int i2, char c) {
    }

    public static void writeCharArray(Parcel parcel, int i2, char[] cArr, boolean z) {
    }

    public static void writeDouble(Parcel parcel, int i2, double d) {
    }

    public static void writeDoubleArray(Parcel parcel, int i2, double[] dArr, boolean z) {
    }

    public static void writeDoubleList(Parcel parcel, int i2, List<Double> list, boolean z) {
    }

    public static void writeDoubleObject(Parcel parcel, int i2, Double d, boolean z) {
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i2, SparseArray<Double> sparseArray, boolean z) {
    }

    public static void writeFloat(Parcel parcel, int i2, float f) {
    }

    public static void writeFloatArray(Parcel parcel, int i2, float[] fArr, boolean z) {
    }

    public static void writeFloatList(Parcel parcel, int i2, List<Float> list, boolean z) {
    }

    public static void writeFloatObject(Parcel parcel, int i2, Float f, boolean z) {
    }

    public static void writeFloatSparseArray(Parcel parcel, int i2, SparseArray<Float> sparseArray, boolean z) {
    }

    public static void writeIBinder(Parcel parcel, int i2, IBinder iBinder, boolean z) {
    }

    public static void writeIBinderArray(Parcel parcel, int i2, IBinder[] iBinderArr, boolean z) {
    }

    public static void writeIBinderList(Parcel parcel, int i2, List<IBinder> list, boolean z) {
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i2, SparseArray<IBinder> sparseArray, boolean z) {
    }

    public static void writeInt(Parcel parcel, int i2, int i3) {
    }

    public static void writeIntArray(Parcel parcel, int i2, int[] iArr, boolean z) {
    }

    public static void writeIntegerList(Parcel parcel, int i2, List<Integer> list, boolean z) {
    }

    public static void writeIntegerObject(Parcel parcel, int i2, Integer num, boolean z) {
    }

    public static void writeList(Parcel parcel, int i2, List list, boolean z) {
    }

    public static void writeLong(Parcel parcel, int i2, long j2) {
    }

    public static void writeLongArray(Parcel parcel, int i2, long[] jArr, boolean z) {
    }

    public static void writeLongList(Parcel parcel, int i2, List<Long> list, boolean z) {
    }

    public static void writeLongObject(Parcel parcel, int i2, Long l2, boolean z) {
    }

    public static void writeParcel(Parcel parcel, int i2, Parcel parcel2, boolean z) {
    }

    public static void writeParcelArray(Parcel parcel, int i2, Parcel[] parcelArr, boolean z) {
    }

    public static void writeParcelList(Parcel parcel, int i2, List<Parcel> list, boolean z) {
    }

    public static void writeParcelSparseArray(Parcel parcel, int i2, SparseArray<Parcel> sparseArray, boolean z) {
    }

    public static void writeParcelable(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
    }

    public static void writeShort(Parcel parcel, int i2, short s2) {
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i2, SparseBooleanArray sparseBooleanArray, boolean z) {
    }

    public static void writeSparseIntArray(Parcel parcel, int i2, SparseIntArray sparseIntArray, boolean z) {
    }

    public static void writeSparseLongArray(Parcel parcel, int i2, SparseLongArray sparseLongArray, boolean z) {
    }

    public static void writeString(Parcel parcel, int i2, String str, boolean z) {
    }

    public static void writeStringArray(Parcel parcel, int i2, String[] strArr, boolean z) {
    }

    public static void writeStringList(Parcel parcel, int i2, List<String> list, boolean z) {
    }

    public static void writeStringSparseArray(Parcel parcel, int i2, SparseArray<String> sparseArray, boolean z) {
    }

    public static <P extends Parcelable> void writeTypedArray(Parcel parcel, int i2, P[] pArr, int i3, boolean z) {
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i2, List<T> list, boolean z) {
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i2, SparseArray<T> sparseArray, boolean z) {
    }

    private static int a(Parcel parcel, int i2) {
    }

    private static <P extends Parcelable> void a(Parcel parcel, P p2, int i2) {
    }
}
