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
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SafeParcelReader {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
        }
    }

    private SafeParcelReader() {
    }

    private static void a(Parcel parcel, int i2, int i3, int i4) {
    }

    private static boolean a(int i2, int i3) {
    }

    private static void b(Parcel parcel, int i2, int i3) {
    }

    public static BigDecimal createBigDecimal(Parcel parcel, int i2) {
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int i2) {
    }

    public static BigInteger createBigInteger(Parcel parcel, int i2) {
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int i2) {
    }

    public static boolean[] createBooleanArray(Parcel parcel, int i2) {
    }

    public static ArrayList<Boolean> createBooleanList(Parcel parcel, int i2) {
    }

    public static Bundle createBundle(Parcel parcel, int i2) {
    }

    public static byte[] createByteArray(Parcel parcel, int i2) {
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int i2) {
    }

    public static SparseArray<byte[]> createByteArraySparseArray(Parcel parcel, int i2) {
    }

    public static char[] createCharArray(Parcel parcel, int i2) {
    }

    public static double[] createDoubleArray(Parcel parcel, int i2) {
    }

    public static ArrayList<Double> createDoubleList(Parcel parcel, int i2) {
    }

    public static SparseArray<Double> createDoubleSparseArray(Parcel parcel, int i2) {
    }

    public static float[] createFloatArray(Parcel parcel, int i2) {
    }

    public static ArrayList<Float> createFloatList(Parcel parcel, int i2) {
    }

    public static SparseArray<Float> createFloatSparseArray(Parcel parcel, int i2) {
    }

    public static IBinder[] createIBinderArray(Parcel parcel, int i2) {
    }

    public static ArrayList<IBinder> createIBinderList(Parcel parcel, int i2) {
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel parcel, int i2) {
    }

    public static int[] createIntArray(Parcel parcel, int i2) {
    }

    public static ArrayList<Integer> createIntegerList(Parcel parcel, int i2) {
    }

    public static long[] createLongArray(Parcel parcel, int i2) {
    }

    public static ArrayList<Long> createLongList(Parcel parcel, int i2) {
    }

    public static Parcel createParcel(Parcel parcel, int i2) {
    }

    public static Parcel[] createParcelArray(Parcel parcel, int i2) {
    }

    public static ArrayList<Parcel> createParcelList(Parcel parcel, int i2) {
    }

    public static SparseArray<Parcel> createParcelSparseArray(Parcel parcel, int i2) {
    }

    public static <P extends Parcelable> P createParcelable(Parcel parcel, int i2, Parcelable.Creator<P> creator) {
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int i2) {
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int i2) {
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int i2) {
    }

    public static String createString(Parcel parcel, int i2) {
    }

    public static String[] createStringArray(Parcel parcel, int i2) {
    }

    public static ArrayList<String> createStringList(Parcel parcel, int i2) {
    }

    public static SparseArray<String> createStringSparseArray(Parcel parcel, int i2) {
    }

    public static <C> C[] createTypedArray(Parcel parcel, int i2, Parcelable.Creator<C> creator) {
    }

    public static <C> ArrayList<C> createTypedList(Parcel parcel, int i2, Parcelable.Creator<C> creator) {
    }

    public static <C> SparseArray<C> createTypedSparseArray(Parcel parcel, int i2, Parcelable.Creator<C> creator) {
    }

    public static void ensureAtEnd(Parcel parcel, int i2) {
    }

    public static int getFieldId(int i2) {
    }

    public static boolean readBoolean(Parcel parcel, int i2) {
    }

    public static Boolean readBooleanObject(Parcel parcel, int i2) {
    }

    public static byte readByte(Parcel parcel, int i2) {
    }

    public static char readChar(Parcel parcel, int i2) {
    }

    public static double readDouble(Parcel parcel, int i2) {
    }

    public static Double readDoubleObject(Parcel parcel, int i2) {
    }

    public static float readFloat(Parcel parcel, int i2) {
    }

    public static Float readFloatObject(Parcel parcel, int i2) {
    }

    public static int readHeader(Parcel parcel) {
    }

    public static IBinder readIBinder(Parcel parcel, int i2) {
    }

    public static int readInt(Parcel parcel, int i2) {
    }

    public static Integer readIntegerObject(Parcel parcel, int i2) {
    }

    public static void readList(Parcel parcel, int i2, List list, ClassLoader classLoader) {
    }

    public static long readLong(Parcel parcel, int i2) {
    }

    public static Long readLongObject(Parcel parcel, int i2) {
    }

    public static short readShort(Parcel parcel, int i2) {
    }

    public static int readSize(Parcel parcel, int i2) {
    }

    public static void skipUnknownField(Parcel parcel, int i2) {
    }

    public static int validateObjectHeader(Parcel parcel) {
    }

    private static void a(Parcel parcel, int i2, int i3) {
    }

    private static void a(Parcel parcel, int i2) {
    }
}
