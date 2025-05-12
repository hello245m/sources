package com.huawei.hms.framework.common;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AssetsUtil {
    private static final ExecutorService EXECUTOR_SERVICE = null;
    private static final int GET_SP_TIMEOUT = 5;
    private static final String TAG = "AssetsUtil";
    private static final String THREAD_NAME = "AssetsUtil_Operate";

    /* renamed from: com.huawei.hms.framework.common.AssetsUtil$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Callable<String[]> {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$path;

        public AnonymousClass1(Context context, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ String[] call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public String[] call2() throws Exception {
        }
    }

    public static String[] list(Context context, String str) {
    }

    public static InputStream open(Context context, String str) throws IOException {
    }
}
