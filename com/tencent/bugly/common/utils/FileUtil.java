package com.tencent.bugly.common.utils;

import android.app.Application;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import n.d0.c.l;
import n.d0.d.h;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class FileUtil {
    public static final Companion Companion = null;
    private static String RMONITOR_ROOT = null;
    private static String SDPath = null;
    private static final String TAG = "Bugly_FileUtil";
    private static Application app;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class a extends o implements l<File, Boolean> {
            public static final a a = null;

            public final boolean b(File file) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ Boolean invoke(File file) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class b extends o implements l<File, Boolean> {
            public static final b a = null;

            public final boolean b(File file) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ Boolean invoke(File file) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class c extends o implements l<File, String> {
            public static final c a = null;

            public final String b(File file) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ String invoke(File file) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class d extends o implements l<String, u> {
            public final /* synthetic */ IStreamListener a;

            public d(IStreamListener iStreamListener) {
            }

            public final void b(String str) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(String str) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class e extends o implements l<String, u> {
            public final /* synthetic */ IStreamListener a;

            public e(IStreamListener iStreamListener) {
            }

            public final void b(String str) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(String str) {
            }
        }

        private Companion() {
        }

        private final String getExternalStorageDirectory() {
        }

        private final String getProcessDir() {
        }

        public static /* synthetic */ String makeTempFileName$default(Companion companion, String str, String str2, int i2, Object obj) {
        }

        public static /* synthetic */ String readStream$default(Companion companion, InputStream inputStream, int i2, int i3, Object obj) {
        }

        public static /* synthetic */ boolean zipFiles$default(Companion companion, List list, String str, boolean z, int i2, Object obj) {
        }

        public final File copyFile(File file, File file2) {
        }

        public final boolean createFile(String str, String str2) {
        }

        public final void deleteFile(File file) {
        }

        public final Application getApp() {
        }

        public final synchronized BufferedOutputStream getFileBufferStream(String str, boolean z) {
        }

        public final ArrayList<File> getFiles(String str, String str2) {
        }

        public final List<String> getFilesInDir(String str) {
        }

        public final long getLastModifiedTime(File file) {
        }

        public final String getRootPath() {
        }

        public final String getTempPath() {
        }

        public final boolean loadLibrary(String str) {
        }

        public final String makeTempFileName(String str, String str2) {
        }

        public final String readOutputFromFile(String str) {
        }

        public final String readStream(InputStream inputStream, int i2) {
        }

        public final void readStreamByLine(File file, IStreamListener iStreamListener) {
        }

        public final void setApp(Application application) {
        }

        public final boolean writeFile(String str, String str2, boolean z) {
        }

        public final boolean zipFiles(List<String> list, String str, boolean z) {
        }

        public /* synthetic */ Companion(h hVar) {
        }

        public static /* synthetic */ String readStream$default(Companion companion, InputStreamReader inputStreamReader, int i2, int i3, Object obj) {
        }

        public static /* synthetic */ boolean zipFiles$default(Companion companion, String str, String str2, boolean z, int i2, Object obj) {
        }

        public final boolean createFile(String str) {
        }

        public final String readStream(InputStreamReader inputStreamReader, int i2) {
        }

        public final synchronized boolean writeFile(String str, byte[] bArr, boolean z) {
        }

        public final void readStreamByLine(InputStream inputStream, IStreamListener iStreamListener) {
        }

        public final boolean zipFiles(String str, String str2, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface IStreamListener {
        void readLine(String str);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class MmapFile {
        private MappedByteBuffer buffer;
        private RandomAccessFile file;
        private String filePath;

        public MmapFile(String str, RandomAccessFile randomAccessFile, MappedByteBuffer mappedByteBuffer) {
        }

        public final MappedByteBuffer getBuffer() {
        }

        public final RandomAccessFile getFile() {
        }

        public final String getFilePath() {
        }

        public final void setBuffer(MappedByteBuffer mappedByteBuffer) {
        }

        public final void setFile(RandomAccessFile randomAccessFile) {
        }

        public final void setFilePath(String str) {
        }
    }

    public static final /* synthetic */ Application access$getApp$cp() {
    }

    public static final /* synthetic */ String access$getRMONITOR_ROOT$cp() {
    }

    public static final /* synthetic */ String access$getSDPath$cp() {
    }

    public static final /* synthetic */ void access$setApp$cp(Application application) {
    }

    public static final /* synthetic */ void access$setRMONITOR_ROOT$cp(String str) {
    }

    public static final /* synthetic */ void access$setSDPath$cp(String str) {
    }

    public static final File copyFile(File file, File file2) {
    }

    public static final boolean createFile(String str) {
    }

    public static final boolean createFile(String str, String str2) {
    }

    public static final void deleteFile(File file) {
    }

    public static final synchronized BufferedOutputStream getFileBufferStream(String str, boolean z) {
    }

    public static final ArrayList<File> getFiles(String str, String str2) {
    }

    public static final List<String> getFilesInDir(String str) {
    }

    public static final long getLastModifiedTime(File file) {
    }

    public static final String getRootPath() {
    }

    public static final String getTempPath() {
    }

    public static final boolean loadLibrary(String str) {
    }

    public static final String makeTempFileName(String str, String str2) {
    }

    public static final String readOutputFromFile(String str) {
    }

    public static final String readStream(InputStream inputStream, int i2) {
    }

    public static final String readStream(InputStreamReader inputStreamReader, int i2) {
    }

    public static final void readStreamByLine(File file, IStreamListener iStreamListener) {
    }

    public static final void readStreamByLine(InputStream inputStream, IStreamListener iStreamListener) {
    }

    public static final boolean writeFile(String str, String str2, boolean z) {
    }

    public static final synchronized boolean writeFile(String str, byte[] bArr, boolean z) {
    }

    public static final boolean zipFiles(String str, String str2, boolean z) {
    }

    public static final boolean zipFiles(List<String> list, String str, boolean z) {
    }
}
