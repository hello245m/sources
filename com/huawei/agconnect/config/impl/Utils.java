package com.huawei.agconnect.config.impl;

import com.huawei.agconnect.AGCRoutePolicy;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class Utils {
    private static final int BUFF_SIZE = 4096;
    public static final String DEFAULT_NAME = "DEFAULT_INSTANCE";
    private static final String TAG = "Utils";

    public static void closeQuietly(Closeable closeable) {
    }

    public static void copy(Reader reader, Writer writer) throws IOException {
    }

    public static void copy(Reader reader, Writer writer, char[] cArr) throws IOException {
    }

    public static Map<String, String> fixKeyPathMap(Map<String, String> map) {
    }

    public static String fixPath(String str) {
    }

    public static AGCRoutePolicy getRoutePolicyFromJson(String str, String str2) {
    }

    public static String toString(InputStream inputStream, String str) throws UnsupportedEncodingException, IOException {
    }
}
