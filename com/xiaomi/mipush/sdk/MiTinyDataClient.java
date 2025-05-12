package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.gu;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a {
        private static volatile a a;

        /* renamed from: a, reason: collision with other field name */
        private Context f4a;

        /* renamed from: a, reason: collision with other field name */
        private C0099a f5a;

        /* renamed from: a, reason: collision with other field name */
        private Boolean f6a;

        /* renamed from: a, reason: collision with other field name */
        private String f7a;

        /* renamed from: a, reason: collision with other field name */
        private final ArrayList<gu> f8a;

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class C0099a {
            public final /* synthetic */ a a;

            /* renamed from: a, reason: collision with other field name */
            private final Runnable f9a;

            /* renamed from: a, reason: collision with other field name */
            public final ArrayList<gu> f10a;

            /* renamed from: a, reason: collision with other field name */
            private ScheduledFuture<?> f11a;

            /* renamed from: a, reason: collision with other field name */
            private ScheduledThreadPoolExecutor f12a;

            public C0099a(a aVar) {
            }

            public static /* synthetic */ ScheduledFuture a(C0099a c0099a) {
            }

            public static /* synthetic */ ScheduledFuture a(C0099a c0099a, ScheduledFuture scheduledFuture) {
            }

            private void a() {
            }

            /* renamed from: a, reason: collision with other method in class */
            public static /* synthetic */ void m7a(C0099a c0099a) {
            }

            private void b() {
            }

            public static /* synthetic */ void b(C0099a c0099a) {
            }

            public void a(gu guVar) {
            }
        }

        public static /* synthetic */ Context a(a aVar) {
        }

        public static a a() {
        }

        private void a(gu guVar) {
        }

        private boolean a(Context context) {
        }

        private boolean b(Context context) {
        }

        private boolean b(gu guVar) {
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m4a(Context context) {
        }

        public synchronized void a(String str) {
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5a() {
        }

        /* renamed from: a, reason: collision with other method in class */
        public synchronized boolean m6a(gu guVar) {
        }

        public void b(String str) {
        }
    }

    public static void init(Context context, String str) {
    }

    public static boolean upload(Context context, gu guVar) {
    }

    public static boolean upload(Context context, String str, String str2, long j2, String str3) {
    }

    public static boolean upload(String str, String str2, long j2, String str3) {
    }
}
