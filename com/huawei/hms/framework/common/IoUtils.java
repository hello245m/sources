package com.huawei.hms.framework.common;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class IoUtils {
    private static final int BUFF_SIZE = 4096;
    private static final int MAX_SIZE = 16777216;

    private IoUtils() {
    }

    public static void close(Cursor cursor) {
    }

    public static void closeSecure(Reader reader) {
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
    }

    public static void closeSecure(Writer writer) {
    }

    public static void closeSecure(InputStream inputStream) {
    }

    public static void closeSecure(OutputStream outputStream) {
    }

    public static void closeSecure(Closeable closeable) {
    }
}
