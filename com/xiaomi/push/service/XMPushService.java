package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.IBinder;
import android.os.Messenger;
import com.xiaomi.push.eq;
import com.xiaomi.push.ex;
import com.xiaomi.push.fb;
import com.xiaomi.push.fc;
import com.xiaomi.push.fe;
import com.xiaomi.push.fh;
import com.xiaomi.push.ft;
import com.xiaomi.push.service.aj;
import com.xiaomi.push.service.cl;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class XMPushService extends Service implements fe {

    /* renamed from: k, reason: collision with root package name */
    private static boolean f2492k = false;
    public Class a;
    public Messenger b;
    private boolean c;
    private fc d;
    private at e;
    private String f;
    private f g;
    private t h;

    /* renamed from: i, reason: collision with root package name */
    private k f2493i;

    /* renamed from: j, reason: collision with root package name */
    private a f2494j;

    /* renamed from: l, reason: collision with root package name */
    private r f2495l;

    /* renamed from: m, reason: collision with root package name */
    private int f2496m;

    /* renamed from: n, reason: collision with root package name */
    private int f2497n;

    /* renamed from: o, reason: collision with root package name */
    private long f2498o;

    /* renamed from: p, reason: collision with root package name */
    private ex f2499p;

    /* renamed from: q, reason: collision with root package name */
    private fb f2500q;

    /* renamed from: r, reason: collision with root package name */
    private cf f2501r;

    /* renamed from: s, reason: collision with root package name */
    private ah f2502s;

    /* renamed from: t, reason: collision with root package name */
    private cl f2503t;
    private Collection<com.xiaomi.push.service.t> u;
    private ArrayList<n> v;
    private fh w;
    private ContentObserver x;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a extends BroadcastReceiver {
        public final /* synthetic */ XMPushService a;
        private final Object b;

        private a(XMPushService xMPushService) {
        }

        public /* synthetic */ a(XMPushService xMPushService, bm bmVar) {
        }

        private void a() {
        }

        private void a(long j2) {
        }

        public static /* synthetic */ void a(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b extends j {
        public aj.b a;
        public final /* synthetic */ XMPushService b;

        public b(XMPushService xMPushService, aj.b bVar) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class c extends j {
        private final aj.b a;

        public c(aj.b bVar) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class d extends j {
        public final /* synthetic */ XMPushService a;
        private eq b;

        public d(XMPushService xMPushService, eq eqVar) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }

        public eq c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class e extends j {
        public final /* synthetic */ XMPushService a;

        public e(XMPushService xMPushService) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class f extends BroadcastReceiver {
        public final /* synthetic */ XMPushService a;

        public f(XMPushService xMPushService) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class g extends j {
        public int a;
        public Exception b;
        public final /* synthetic */ XMPushService c;

        public g(XMPushService xMPushService, int i2, Exception exc) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class h extends j {
        public final /* synthetic */ XMPushService a;

        public h(XMPushService xMPushService) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class i extends j {
        public final /* synthetic */ XMPushService a;
        private Intent b;

        public i(XMPushService xMPushService, Intent intent) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }

        public Intent c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static abstract class j extends cl.b {
        public j(int i2) {
        }

        public abstract void a();

        public abstract String b();

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class k extends BroadcastReceiver {
        public final /* synthetic */ XMPushService a;

        public k(XMPushService xMPushService) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class l extends j {
        public final /* synthetic */ XMPushService a;

        public l(XMPushService xMPushService) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class m extends j {
        public final /* synthetic */ XMPushService a;
        private ft b;

        public m(XMPushService xMPushService, ft ftVar) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface n {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class o extends j {
        public boolean a;
        public final /* synthetic */ XMPushService b;

        public o(XMPushService xMPushService, boolean z) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class p extends j {
        public aj.b a;
        public final /* synthetic */ XMPushService b;

        public p(XMPushService xMPushService, aj.b bVar) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class q extends j {
        public final /* synthetic */ XMPushService a;

        public q(XMPushService xMPushService) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class r extends BroadcastReceiver {
        public final /* synthetic */ XMPushService a;

        public r(XMPushService xMPushService) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class s extends j {
        public aj.b a;
        public int b;
        public String c;
        public String d;
        public final /* synthetic */ XMPushService e;

        public s(XMPushService xMPushService, aj.b bVar, int i2, String str, String str2) {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void a() {
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class t extends BroadcastReceiver {
        public final /* synthetic */ XMPushService a;

        public t(XMPushService xMPushService) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static /* synthetic */ fb a(XMPushService xMPushService, fb fbVar) {
    }

    private ft a(ft ftVar, String str, String str2) {
    }

    public static /* synthetic */ String a(XMPushService xMPushService) {
    }

    private void a(BroadcastReceiver broadcastReceiver) {
    }

    private void a(Intent intent) {
    }

    private void a(Intent intent, int i2) {
    }

    public static /* synthetic */ void a(XMPushService xMPushService, Intent intent) {
    }

    private void a(com.xiaomi.push.service.b bVar) {
    }

    private static void a(String str) {
    }

    private void a(String str, int i2) {
    }

    private boolean a(Context context) {
    }

    public static /* synthetic */ boolean a(XMPushService xMPushService, Context context) {
    }

    public static /* synthetic */ boolean a(XMPushService xMPushService, boolean z) {
    }

    private boolean a(String str, Intent intent) {
    }

    private aj.b b(String str, Intent intent) {
    }

    private void b(Intent intent) {
    }

    public static /* synthetic */ void b(XMPushService xMPushService) {
    }

    private void b(boolean z) {
    }

    private void c(Intent intent) {
    }

    private void c(j jVar) {
    }

    private void c(boolean z) {
    }

    public static /* synthetic */ boolean c(XMPushService xMPushService) {
    }

    public static /* synthetic */ fc d(XMPushService xMPushService) {
    }

    private void d(Intent intent) {
    }

    public static /* synthetic */ fb e(XMPushService xMPushService) {
    }

    private void e(Intent intent) {
    }

    public static /* synthetic */ void f(XMPushService xMPushService) {
    }

    public static /* synthetic */ cl g(XMPushService xMPushService) {
    }

    public static /* synthetic */ ah h(XMPushService xMPushService) {
    }

    public static /* synthetic */ void i(XMPushService xMPushService) {
    }

    public static boolean j() {
    }

    public static /* synthetic */ boolean j(XMPushService xMPushService) {
    }

    private int[] k() {
    }

    private String l() {
    }

    private String m() {
    }

    private void n() {
    }

    private void o() {
    }

    private boolean p() {
    }

    private boolean q() {
    }

    private boolean r() {
    }

    private void s() {
    }

    private void t() {
    }

    private void u() {
    }

    private boolean v() {
    }

    private boolean w() {
    }

    private boolean x() {
    }

    private void y() {
    }

    private void z() {
    }

    public void a() {
    }

    public void a(int i2) {
    }

    public void a(int i2, Exception exc) {
    }

    public void a(eq eqVar) {
    }

    @Override // com.xiaomi.push.fe
    public void a(fb fbVar) {
    }

    @Override // com.xiaomi.push.fe
    public void a(fb fbVar, int i2, Exception exc) {
    }

    @Override // com.xiaomi.push.fe
    public void a(fb fbVar, Exception exc) {
    }

    public void a(j jVar) {
    }

    public void a(j jVar, long j2) {
    }

    public void a(n nVar) {
    }

    public void a(aj.b bVar) {
    }

    public void a(String str, String str2, int i2, String str3, String str4) {
    }

    public void a(String str, byte[] bArr, boolean z) {
    }

    public void a(boolean z) {
    }

    public void a(byte[] bArr, String str) {
    }

    public void a(eq[] eqVarArr) {
    }

    @Override // com.xiaomi.push.fe
    public void b(fb fbVar) {
    }

    public void b(j jVar) {
    }

    public boolean b() {
    }

    public boolean b(int i2) {
    }

    public boolean c() {
    }

    public cf d() {
    }

    public cf e() {
    }

    public boolean f() {
    }

    public boolean g() {
    }

    public fb h() {
    }

    public void i() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }
}
