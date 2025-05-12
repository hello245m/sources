package com.tencent.bugly.crashreport.crash.anr;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TraceFileHelper {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public long a;
        public String b;
        public long c;
        public Map<String, String[]> d;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        boolean a(long j2);

        boolean a(long j2, long j3, String str);

        boolean a(String str, int i2, String str2, String str3);
    }

    private static Object[] a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
    }

    private static String b(BufferedReader bufferedReader) throws IOException {
    }

    public static a readFirstDumpInfo(String str, boolean z) {
    }

    public static a readTargetDumpInfo(String str, String str2, boolean z) {
    }

    public static void readTraceFile(String str, b bVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d implements b {
        public final /* synthetic */ a a;
        public final /* synthetic */ boolean b;

        public d(a aVar, boolean z) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(String str, int i2, String str2, String str3) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2, long j3, String str) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements b {
        public final /* synthetic */ a a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public c(a aVar, String str, boolean z) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(String str, int i2, String str2, String str3) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2, long j3, String str) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2) {
        }
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
    }
}
