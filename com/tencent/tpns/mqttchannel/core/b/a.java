package com.tencent.tpns.mqttchannel.core.b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Pair;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.api.MqttConnectState;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;
import com.tencent.tpns.mqttchannel.core.common.b.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import k.i.a.b.a.e;
import k.i.a.b.a.f;
import k.i.a.b.a.h;
import k.i.a.b.a.m;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a extends c.a implements h {
    private static long b;
    private static boolean c;
    private static ExecutorService d;

    /* renamed from: k, reason: collision with root package name */
    private static int f1984k;
    private static ConcurrentHashMap<Long, com.tencent.tpns.mqttchannel.core.common.b.a> w;
    private ReentrantLock A;
    private volatile boolean B;
    private ReentrantLock C;
    public ReentrantLock a;
    private volatile f e;
    private volatile MqttConnectState f;
    private volatile int g;
    private volatile int h;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f1985i;

    /* renamed from: j, reason: collision with root package name */
    private volatile int[] f1986j;

    /* renamed from: l, reason: collision with root package name */
    private Context f1987l;

    /* renamed from: m, reason: collision with root package name */
    private Map<Long, Pair<com.tencent.tpns.mqttchannel.core.common.b.a, TTask>> f1988m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1989n;

    /* renamed from: o, reason: collision with root package name */
    private Class f1990o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f1991p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1992q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1993r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1994s;

    /* renamed from: t, reason: collision with root package name */
    private volatile int f1995t;
    private volatile int u;
    private List<com.tencent.tpns.mqttchannel.core.common.b.a> v;
    private Queue<com.tencent.tpns.mqttchannel.core.common.a.a> x;
    private long y;
    private c z;

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ a a;

        public AnonymousClass1(a aVar) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$10, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass10 implements k.i.a.b.a.a {
        public final /* synthetic */ a a;

        public AnonymousClass10(a aVar) {
        }

        @Override // k.i.a.b.a.a
        public void onFailure(e eVar, Throwable th) {
        }

        @Override // k.i.a.b.a.a
        public void onSuccess(e eVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$11, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass11 extends TTask {
        public com.tencent.tpns.mqttchannel.core.common.b.b a;
        public com.tencent.tpns.mqttchannel.core.common.b.b b;
        public final /* synthetic */ InterfaceC0090a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ a e;
        private ServiceConnection f;
        private ServiceConnection g;

        /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$11$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements ServiceConnection {
            public final /* synthetic */ AnonymousClass11 a;

            public AnonymousClass1(AnonymousClass11 anonymousClass11) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$11$2, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass2 implements ServiceConnection {
            public final /* synthetic */ AnonymousClass11 a;

            /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$11$2$1, reason: invalid class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public class AnonymousClass1 extends TTask {
                public final /* synthetic */ AnonymousClass2 a;

                public AnonymousClass1(AnonymousClass2 anonymousClass2) {
                }

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            }

            public AnonymousClass2(AnonymousClass11 anonymousClass11) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public AnonymousClass11(a aVar, InterfaceC0090a interfaceC0090a, String str) {
        }

        public static /* synthetic */ ServiceConnection a(AnonymousClass11 anonymousClass11, ServiceConnection serviceConnection) {
        }

        public static /* synthetic */ ServiceConnection b(AnonymousClass11 anonymousClass11, ServiceConnection serviceConnection) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$12, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass12 extends TTask {
        public final /* synthetic */ a a;

        public AnonymousClass12(a aVar) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$13, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass13 extends Handler {
        public final /* synthetic */ a a;

        public AnonymousClass13(a aVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$14, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass14 implements Runnable {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a a;
        public final /* synthetic */ a b;

        public AnonymousClass14(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$15, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass15 extends TTask {
        public final /* synthetic */ a a;

        public AnonymousClass15(a aVar) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$16, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static /* synthetic */ class AnonymousClass16 {
        public static final /* synthetic */ int[] a = null;
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$17, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass17 implements k.i.a.b.a.a {
        public final /* synthetic */ a a;

        public AnonymousClass17(a aVar) {
        }

        @Override // k.i.a.b.a.a
        public void onFailure(e eVar, Throwable th) {
        }

        @Override // k.i.a.b.a.a
        public void onSuccess(e eVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$18, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass18 extends TTask {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a a;
        public final /* synthetic */ a b;

        public AnonymousClass18(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$19, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass19 implements k.i.a.b.a.a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a a;
        public final /* synthetic */ a b;

        public AnonymousClass19(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
        }

        @Override // k.i.a.b.a.a
        public void onFailure(e eVar, Throwable th) {
        }

        @Override // k.i.a.b.a.a
        public void onSuccess(e eVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements k.i.a.b.a.a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a b;
        public final /* synthetic */ a c;

        public AnonymousClass2(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2, com.tencent.tpns.mqttchannel.core.common.b.a aVar3) {
        }

        @Override // k.i.a.b.a.a
        public void onFailure(e eVar, Throwable th) {
        }

        @Override // k.i.a.b.a.a
        public void onSuccess(e eVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$20, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass20 extends TTask {
        public final /* synthetic */ a a;

        public AnonymousClass20(a aVar) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$21, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass21 extends TTask {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a b;
        public final /* synthetic */ String c;
        public final /* synthetic */ a d;

        public AnonymousClass21(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2, com.tencent.tpns.mqttchannel.core.common.b.a aVar3, String str) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$22, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass22 implements k.i.a.b.a.a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a d;
        public final /* synthetic */ a e;

        public AnonymousClass22(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2, String str, JSONObject jSONObject, com.tencent.tpns.mqttchannel.core.common.b.a aVar3) {
        }

        @Override // k.i.a.b.a.a
        public void onFailure(e eVar, Throwable th) {
        }

        @Override // k.i.a.b.a.a
        public void onSuccess(e eVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$23, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass23 extends OnMqttCallback {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a b;
        public final /* synthetic */ a c;

        public AnonymousClass23(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2, com.tencent.tpns.mqttchannel.core.common.b.a aVar3) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.b
        public void callback(int i2, String str) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements k.i.a.b.a.a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a a;
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a b;
        public final /* synthetic */ a c;

        public AnonymousClass3(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2, com.tencent.tpns.mqttchannel.core.common.a.a aVar3) {
        }

        @Override // k.i.a.b.a.a
        public void onFailure(e eVar, Throwable th) {
        }

        @Override // k.i.a.b.a.a
        public void onSuccess(e eVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements k.i.a.b.a.a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.b.a b;
        public final /* synthetic */ a c;

        public AnonymousClass4(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2, com.tencent.tpns.mqttchannel.core.common.b.a aVar3) {
        }

        @Override // k.i.a.b.a.a
        public void onFailure(e eVar, Throwable th) {
        }

        @Override // k.i.a.b.a.a
        public void onSuccess(e eVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 implements InterfaceC0090a {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ a b;

        public AnonymousClass5(a aVar, boolean z) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.b.a.InterfaceC0090a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.b bVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass6 implements InterfaceC0090a {
        public final /* synthetic */ a a;

        public AnonymousClass6(a aVar) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.b.a.InterfaceC0090a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.b bVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass7 implements InterfaceC0090a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ a b;

        public AnonymousClass7(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.b.a.InterfaceC0090a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.b bVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass8 implements InterfaceC0090a {
        public final /* synthetic */ a a;

        public AnonymousClass8(a aVar) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.b.a.InterfaceC0090a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.b bVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass9 implements InterfaceC0090a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ a b;

        public AnonymousClass9(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.b.a.InterfaceC0090a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.b bVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface InterfaceC0090a {
        void a(com.tencent.tpns.mqttchannel.core.common.b.b bVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b {
        public static final b a = null;
        public static final b b = null;
        public static final b c = null;
        public static final b d = null;
        public static final b e = null;
        private static final /* synthetic */ b[] f = null;

        private b(String str, int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c extends Thread {
        public com.tencent.tpns.mqttchannel.core.common.b.a a;
        public final /* synthetic */ a b;

        /* renamed from: com.tencent.tpns.mqttchannel.core.b.a$c$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements k.i.a.b.a.a {
            public final /* synthetic */ c a;

            public AnonymousClass1(c cVar) {
            }

            @Override // k.i.a.b.a.a
            public void onFailure(e eVar, Throwable th) {
            }

            @Override // k.i.a.b.a.a
            public void onSuccess(e eVar) {
            }
        }

        public c(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2, int i2) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public a(Context context) {
    }

    public static /* synthetic */ int a(a aVar, int i2) {
    }

    public static /* synthetic */ int b(a aVar, int i2) {
    }

    public static /* synthetic */ int c(a aVar, int i2) {
    }

    public static /* synthetic */ int d(a aVar, int i2) {
    }

    public static /* synthetic */ int e(a aVar, int i2) {
    }

    public static /* synthetic */ boolean f(a aVar) {
    }

    public static /* synthetic */ boolean g(a aVar) {
    }

    public static /* synthetic */ boolean h(a aVar) {
    }

    public static /* synthetic */ boolean i(a aVar) {
    }

    public static /* synthetic */ int j(a aVar) {
    }

    public static /* synthetic */ int k(a aVar) {
    }

    public static /* synthetic */ f l(a aVar) {
    }

    public static /* synthetic */ void m(a aVar) {
    }

    public static /* synthetic */ void n(a aVar) {
    }

    public static /* synthetic */ void o(a aVar) {
    }

    public static /* synthetic */ Map p(a aVar) {
    }

    public static /* synthetic */ void q(a aVar) {
    }

    public static /* synthetic */ int r(a aVar) {
    }

    public static /* synthetic */ boolean s(a aVar) {
    }

    public static /* synthetic */ Class t(a aVar) {
    }

    public static /* synthetic */ void u(a aVar) {
    }

    public static /* synthetic */ void v(a aVar) {
    }

    @Override // k.i.a.b.a.h
    public void connectComplete(boolean z, String str) {
    }

    @Override // k.i.a.b.a.g
    public void connectionLost(Throwable th) {
    }

    @Override // k.i.a.b.a.g
    public void deliveryComplete(k.i.a.b.a.c cVar) {
    }

    @Override // k.i.a.b.a.g
    public void messageArrived(String str, m mVar) {
    }

    public static /* synthetic */ long a(a aVar, long j2) {
    }

    public static /* synthetic */ Handler b(a aVar) {
    }

    public static /* synthetic */ void c(a aVar) {
    }

    public static /* synthetic */ void d(a aVar) {
    }

    public static /* synthetic */ MqttConnectState e(a aVar) {
    }

    private b f() {
    }

    private void g() {
    }

    private void h() {
    }

    private void i() {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    private synchronized void m() {
    }

    private synchronized void n() {
    }

    @SuppressLint({"HandlerLeak"})
    private void o() {
    }

    private void p() {
    }

    private boolean q() {
    }

    private void r() {
    }

    private boolean s() {
    }

    private synchronized void t() {
    }

    public static /* synthetic */ Context a(a aVar) {
    }

    public static /* synthetic */ void b(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    public static /* synthetic */ void c(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    public static /* synthetic */ void d(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    private synchronized void e(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    public static /* synthetic */ f a(a aVar, f fVar) {
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
    }

    private synchronized void c() {
    }

    private synchronized void d() {
    }

    public static /* synthetic */ MqttConnectState a(a aVar, MqttConnectState mqttConnectState) {
    }

    private com.tencent.tpns.mqttchannel.core.common.b.a b(Long l2) {
    }

    public static /* synthetic */ void a(a aVar, int i2, Message message) {
    }

    private void g(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    public static /* synthetic */ void a(a aVar, int i2, com.tencent.tpns.mqttchannel.core.common.a.a aVar2) {
    }

    private void e(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    public static /* synthetic */ void a(a aVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar2, com.tencent.tpns.mqttchannel.core.common.b.a aVar3, String str) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void d(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    public static /* synthetic */ void a(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    private void f(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    private void h(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void d(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    public static /* synthetic */ void a(a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2, int i2, String str) {
    }

    private void f(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
    }

    private static void a(Long l2, com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    private com.tencent.tpns.mqttchannel.core.common.a.a c(Long l2) {
    }

    private void h(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void b(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    private void e() {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void c(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    private void i(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void c(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    private static com.tencent.tpns.mqttchannel.core.common.b.a a(Long l2) {
    }

    private boolean a(Context context) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void b(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void a(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.b.c
    public void a(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    public void b() {
    }

    private void b(int i2, com.tencent.tpns.mqttchannel.core.common.a.a aVar) {
    }

    private ArrayList<String> b(Context context) {
    }

    private void a(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2, String str) {
    }

    private void g(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
    }

    private void a(com.tencent.tpns.mqttchannel.core.common.b.a aVar, int i2, String str) {
    }

    private void a(InterfaceC0090a interfaceC0090a, String str) {
    }

    private void a(int i2, com.tencent.tpns.mqttchannel.core.common.a.a aVar) {
    }

    private void a(int i2, Message message) {
    }

    private synchronized void a(boolean z) {
    }

    private void a(com.tencent.tpns.mqttchannel.core.common.a.a aVar) {
    }
}
