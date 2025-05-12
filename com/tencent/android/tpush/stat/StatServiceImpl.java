package com.tencent.android.tpush.stat;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.android.tpush.stat.event.Event;
import com.tencent.android.tpush.stat.event.c;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class StatServiceImpl {
    public static volatile long a;
    private static Map<String, Long> b;
    private static volatile Handler c;
    private static volatile int d;
    private static volatile String e;
    private static volatile String f;
    private static com.tencent.android.tpush.stat.b.c g;
    private static volatile boolean h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f855i;

    /* renamed from: j, reason: collision with root package name */
    private static Handler f856j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile Runnable f857k;

    /* renamed from: l, reason: collision with root package name */
    private static long f858l;

    /* renamed from: m, reason: collision with root package name */
    private static List<c> f859m;

    /* renamed from: n, reason: collision with root package name */
    private static long f860n;

    /* renamed from: o, reason: collision with root package name */
    private static volatile long f861o;

    /* renamed from: p, reason: collision with root package name */
    private static Context f862p;

    /* renamed from: q, reason: collision with root package name */
    private static String f863q;

    /* renamed from: r, reason: collision with root package name */
    private static volatile SharedPreferences f864r;

    /* renamed from: s, reason: collision with root package name */
    private static volatile SharedPreferences f865s;
    public static volatile boolean storedList;

    /* renamed from: t, reason: collision with root package name */
    private static volatile SharedPreferences f866t;
    private static AtomicInteger u;
    private static final Integer v = null;
    private static AtomicBoolean w;

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Context a;

        public AnonymousClass1(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$10, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ Event a;

        public AnonymousClass10(Event event) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$11, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ long d;

        public AnonymousClass11(Context context, int i2, int i3, long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$12, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass12 implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ c.a c;

        public AnonymousClass12(Context context, String str, c.a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$13, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass13 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$14, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass14 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$15, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass15 implements e {
        public final /* synthetic */ List a;

        public AnonymousClass15(List list) {
        }

        @Override // com.tencent.android.tpush.stat.e
        public void a() {
        }

        @Override // com.tencent.android.tpush.stat.e
        public void b() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$16, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass16 implements e {
        public final /* synthetic */ Event a;

        /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$16$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ AnonymousClass16 a;

            public AnonymousClass1(AnonymousClass16 anonymousClass16) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass16(Event event) {
        }

        @Override // com.tencent.android.tpush.stat.e
        public void a() {
        }

        @Override // com.tencent.android.tpush.stat.e
        public void b() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements e {
        public final /* synthetic */ List a;

        public AnonymousClass2(List list) {
        }

        @Override // com.tencent.android.tpush.stat.e
        public void a() {
        }

        @Override // com.tencent.android.tpush.stat.e
        public void b() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ long c;

        public AnonymousClass3(String str, Context context, long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        public AnonymousClass4(String str, Context context, long j2, long j3, long j4) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ double a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ long c;

        public AnonymousClass5(double d, Context context, long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass6 implements com.tencent.android.tpush.stat.lifecycle.a {
        public final /* synthetic */ long a;

        /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$6$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass6 a;

            public AnonymousClass1(AnonymousClass6 anonymousClass6) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass6(long j2) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void a(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void a(Activity activity, Bundle bundle) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void b(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void b(Activity activity, Bundle bundle) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void c(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void d(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void e(Activity activity) {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass7 implements c {
        public final /* synthetic */ long a;

        public AnonymousClass7(long j2) {
        }

        @Override // com.tencent.android.tpush.stat.c
        public void a() {
        }

        @Override // com.tencent.android.tpush.stat.c
        public void b() {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass8 implements com.tencent.android.tpush.stat.lifecycle.a {
        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void a(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void a(Activity activity, Bundle bundle) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void b(Activity activity, Bundle bundle) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void c(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void d(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void e(Activity activity) {
        }

        @Override // com.tencent.android.tpush.stat.lifecycle.a
        public void b(Activity activity) {
        }
    }

    /* renamed from: com.tencent.android.tpush.stat.StatServiceImpl$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass9 implements Runnable {
        public final /* synthetic */ Event a;

        public AnonymousClass9(Event event) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ long a(long j2) {
    }

    public static /* synthetic */ long b(long j2) {
    }

    public static /* synthetic */ Context c() {
    }

    public static void checkAppLunch(Context context) {
    }

    public static boolean commitEvents(Context context, int i2) {
    }

    public static /* synthetic */ SharedPreferences d(SharedPreferences sharedPreferences) {
    }

    public static /* synthetic */ AtomicInteger e() {
    }

    public static /* synthetic */ Integer f() {
    }

    public static /* synthetic */ Map g() {
    }

    public static Context getContext(Context context) {
    }

    public static Handler getHandler(Context context) {
    }

    public static /* synthetic */ String h() {
    }

    public static /* synthetic */ String i() {
    }

    public static void inerTrackBeginPage(Context context, String str, long j2) {
    }

    public static synchronized void init(Context context) {
    }

    public static void initAutoStats(Context context, long j2) {
    }

    public static /* synthetic */ boolean j() {
    }

    public static /* synthetic */ Runnable k() {
    }

    public static /* synthetic */ Handler l() {
    }

    public static /* synthetic */ List m() {
    }

    public static /* synthetic */ boolean n() {
    }

    public static /* synthetic */ long o() {
    }

    public static void reportEvent(Context context, Event event) {
    }

    public static void reportXGEvent(Context context, Event event) {
    }

    public static void send3rdCaughtException(Context context, String str, Throwable th) {
    }

    public static boolean sendLocalMsg(Context context, int i2) {
    }

    public static void sendTryCatchException(Context context, String str, Throwable th) {
    }

    public static void setContext(Context context) {
    }

    public static void setCrashMatchString(String str) {
    }

    public static void setupExceptionHandler(Context context) {
    }

    public static void trackBeginPage(Context context, String str, long j2) {
    }

    public static void trackCustomKVEvent(Context context, String str, Properties properties) {
    }

    public static void trackEndPage(Context context, String str, long j2) {
    }

    public static void trackLaunchEvent(Context context, int i2, int i3, long j2) {
    }

    public static /* synthetic */ Runnable a(Runnable runnable) {
    }

    public static /* synthetic */ SharedPreferences b(SharedPreferences sharedPreferences) {
    }

    public static /* synthetic */ SharedPreferences c(SharedPreferences sharedPreferences) {
    }

    public static /* synthetic */ com.tencent.android.tpush.stat.b.c d() {
    }

    private static int e(List<?> list) {
    }

    public static /* synthetic */ void a(Context context, String str, long j2, long j3, long j4) {
    }

    public static /* synthetic */ String b(String str) {
    }

    public static /* synthetic */ String c(String str) {
    }

    public static synchronized void d(List<?> list) {
    }

    public static /* synthetic */ boolean a(boolean z) {
    }

    public static /* synthetic */ boolean b(boolean z) {
    }

    public static synchronized void c(List<?> list) {
    }

    public static boolean a(Context context) {
    }

    public static int b(Context context, long j2) {
    }

    public static void trackEndPage(Context context, String str, long j2, long j3, long j4) {
    }

    public static boolean a(String str) {
    }

    public static JSONObject a() {
    }

    public static void b(Event event) {
    }

    private static void b(List<?> list, SharedPreferences sharedPreferences) {
    }

    public static void a(Context context, long j2) {
    }

    public static synchronized void b(List<?> list) {
    }

    public static void a(List<Event> list) {
    }

    public static void a(Event event) {
    }

    private static void a(List<?> list, SharedPreferences sharedPreferences) {
    }

    private static void b(Context context, String str, long j2, long j3, long j4) {
    }

    public static synchronized void b() {
    }

    private static void a(SharedPreferences sharedPreferences, List<?> list) {
    }

    public static void a(List<String> list, List<String> list2) {
    }

    public static void a(Context context, long j2, boolean z) {
    }

    private static void a(Context context, double d2, long j2, boolean z) {
    }

    public static void a(SharedPreferences sharedPreferences) {
    }

    public static void a(Context context, Throwable th) {
    }

    private static void a(Context context, int i2, String str, Throwable th) {
    }

    private static void a(Context context, int i2, String str, JSONArray jSONArray) {
    }

    private static void a(c cVar) {
    }

    private static void a(Application application, long j2) {
    }
}
