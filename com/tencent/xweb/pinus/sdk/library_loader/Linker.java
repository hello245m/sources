package com.tencent.xweb.pinus.sdk.library_loader;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class Linker {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean DEBUG = true;
    public static final String EXTRA_LINKER_SHARED_RELROS = "org.chromium.base.android.linker.shared_relros";
    public static final String LINKER_JNI_LIBRARY = "xweb_linker";
    public static final String TAG = "Linker";
    public static final Object sLock = null;
    public static Linker sSingleton;
    public long mBaseLoadAddress;
    public boolean mInBrowserProcess;
    public LibInfo mLibInfo;
    public int mState;
    public boolean mWaitForSharedRelros;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public @interface State {
        public static final int DONE = 3;
        public static final int DONE_PROVIDE_RELRO = 2;
        public static final int INITIALIZED = 1;
        public static final int UNINITIALIZED = 0;
    }

    public static Linker getInstance() {
    }

    public static long getRandomBaseLoadAddress() {
    }

    private void loadLinkerJniLibraryLocked() {
    }

    public static native long nativeGetRandomBaseLoadAddress();

    private void setupBaseLoadAddressLocked() {
    }

    public abstract int createMemroyFile(String str);

    public final void disableSharedRelros() {
    }

    public final void ensureInitializedLocked() {
    }

    public final long getBaseLoadAddress() {
    }

    public final Bundle getSharedRelros() {
    }

    public final void initServiceProcess(long j2) {
    }

    public final void loadLibrary(String str, boolean z) {
    }

    public final void loadLibraryByFd(String str, boolean z, int i2, boolean z2) {
    }

    public abstract void loadLibraryByFdImplLocked(String str, boolean z, int i2, boolean z2);

    public abstract void loadLibraryImplLocked(String str, boolean z);

    public final void provideSharedRelros(Bundle bundle) {
    }

    public void setApkFilePath(String str) {
    }

    public final void waitForSharedRelrosLocked() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = null;
        public static final String EXTRA_LINKER_LIB_INFO = "libinfo";
        public String mLibFilePath;
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd;
        public long mRelroSize;
        public long mRelroStart;

        /* renamed from: com.tencent.xweb.pinus.sdk.library_loader.Linker$LibInfo$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements Parcelable.Creator<LibInfo> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LibInfo createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LibInfo[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LibInfo createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LibInfo[] newArray(int i2) {
            }
        }

        public LibInfo() {
        }

        public static void closeQuietly(Closeable closeable) {
        }

        public static LibInfo fromBundle(Bundle bundle) {
        }

        public void close() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public Bundle toBundle() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public LibInfo(Parcel parcel) {
        }
    }
}
