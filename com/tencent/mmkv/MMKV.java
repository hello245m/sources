package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import k.i.g.c;
import k.i.g.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    public static final EnumMap<d, Integer> a = null;
    public static final EnumMap<c, Integer> b = null;
    public static final c[] c = null;
    public static final Set<Long> d = null;
    public static String e;
    public static boolean f;
    public static k.i.g.b g;
    public static boolean h;

    /* renamed from: i, reason: collision with root package name */
    public static k.i.g.a f1108i;
    private final long nativeHandle;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void loadLibrary(String str);
    }

    public MMKV(long j2) {
    }

    public static MMKV a(long j2, String str, int i2) throws RuntimeException {
    }

    private native long actualSize(long j2);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static native boolean checkProcessMode(long j2);

    private native boolean containsKey(long j2, String str);

    private native long count(long j2);

    private static native long createNB(int i2);

    private native boolean decodeBool(long j2, String str, boolean z);

    private native byte[] decodeBytes(long j2, String str);

    private native double decodeDouble(long j2, String str, double d2);

    private native float decodeFloat(long j2, String str, float f2);

    private native int decodeInt(long j2, String str, int i2);

    private native long decodeLong(long j2, String str, long j3);

    private native String decodeString(long j2, String str, String str2);

    private native String[] decodeStringSet(long j2, String str);

    private static native void destroyNB(long j2, int i2);

    private native boolean encodeBool(long j2, String str, boolean z);

    private native boolean encodeBytes(long j2, String str, byte[] bArr);

    private native boolean encodeDouble(long j2, String str, double d2);

    private native boolean encodeFloat(long j2, String str, float f2);

    private native boolean encodeInt(long j2, String str, int i2);

    private native boolean encodeLong(long j2, String str, long j3);

    private native boolean encodeSet(long j2, String str, String[] strArr);

    private native boolean encodeString(long j2, String str, String str2);

    private static native long getDefaultMMKV(int i2, String str);

    private static native long getMMKVWithAshmemFD(String str, int i2, int i3, String str2);

    private static native long getMMKVWithID(String str, int i2, String str2, String str3);

    private static native long getMMKVWithIDAndSize(String str, int i2, int i3, String str2);

    public static MMKV i() throws RuntimeException {
    }

    public static native boolean isFileValid(String str, String str2);

    public static void j() {
    }

    private static native void jniInitialize(String str, String str2, int i2);

    public static String k(String str, String str2, b bVar, c cVar) {
    }

    public static void l() {
    }

    private static void mmkvLogImp(int i2, String str, int i3, String str2, String str3) {
    }

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
    }

    private static int onMMKVFileLengthError(String str) {
    }

    public static native int pageSize();

    public static String q(Context context, c cVar) {
    }

    public static String r(Context context, String str, b bVar, c cVar) {
    }

    private native void removeValueForKey(long j2, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    public static int s(c cVar) {
    }

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i2);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    public static MMKV t(String str) throws RuntimeException {
    }

    private native long totalSize(long j2);

    public static MMKV u(String str, int i2) throws RuntimeException {
    }

    private native int valueSize(long j2, String str, boolean z);

    public static native String version();

    public static void w(c cVar, String str) {
    }

    private native int writeValueToNB(long j2, String str, long j3, int i2);

    public native String[] allKeys();

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public boolean b(String str) {
    }

    public byte[] c(String str) {
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
    }

    public native void clearAll();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
    }

    public native String cryptKey();

    public byte[] d(String str, byte[] bArr) {
    }

    public long e(String str, long j2) {
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
    }

    public String f(String str, String str2) {
    }

    public Set<String> g(String str, Set<String> set) {
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
    }

    public Set<String> h(String str, Set<String> set, Class<? extends Set> cls) {
    }

    public native void lock();

    public boolean m(String str, long j2) {
    }

    public native String mmapID();

    public boolean n(String str, String str2) {
    }

    public boolean o(String str, Set<String> set) {
    }

    public boolean p(String str, byte[] bArr) {
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f2) {
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i2) {
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j2) {
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, String str2) {
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void v(String str) {
    }
}
