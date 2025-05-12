package com.tencent.tpns.baseapi.core.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.tpns.baseapi.base.util.CacheHelper;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a {
    private static final Map<String, SharedPreferences> a = null;

    /* renamed from: com.tencent.tpns.baseapi.core.a.a$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ CacheHelper.Key[] a;
        public final /* synthetic */ Context b;

        public AnonymousClass1(CacheHelper.Key[] keyArr, Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.baseapi.core.a.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class C0082a {
        private static Handler a;
        private static final Object b = null;
        private static final LinkedList<Runnable> c = null;
        private static boolean d;
        private static final Object e = null;

        /* renamed from: com.tencent.tpns.baseapi.core.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class HandlerC0083a extends Handler {

            /* renamed from: com.tencent.tpns.baseapi.core.a.a$a$a$1, reason: invalid class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public class AnonymousClass1 extends TTask {
                public final /* synthetic */ HandlerC0083a a;

                public AnonymousClass1(HandlerC0083a handlerC0083a) {
                }

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            }

            public HandlerC0083a(Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        public static /* synthetic */ void a() {
        }

        private static Handler b() {
        }

        private static void c() {
        }

        public static void a(Runnable runnable, boolean z) {
        }
    }

    public static /* synthetic */ SharedPreferences a(Context context, String str) {
    }

    private static void b(Context context, String str) {
    }

    public static void b(Context context, CacheHelper.Key<?>... keyArr) {
    }

    private static SharedPreferences c(Context context, String str) {
    }

    private static SharedPreferences d(Context context, String str) {
    }

    public static /* synthetic */ void a(SharedPreferences.Editor editor, String str, Object obj) {
    }

    public static void a(Context context, CacheHelper.Key<?>... keyArr) {
    }

    public static <T> T b(Context context, CacheHelper.Key<T> key) {
    }

    private static <T> void b(SharedPreferences.Editor editor, String str, T t2) {
    }

    private static boolean a() {
    }

    private static void a(Context context, boolean z, CacheHelper.Key<?>... keyArr) {
    }

    public static <T> T a(Context context, CacheHelper.Key<T> key) {
    }

    private static <T> T a(SharedPreferences sharedPreferences, String str, T t2) {
    }
}
