package k.i.k.t.j;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.util.Pair;
import com.tencent.rmonitor.qqbattery.monitor.HookMethodCallback;
import com.tencent.rmonitor.qqbattery.monitor.MethodHookParam;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k.i.k.t.f;
import k.i.k.t.h.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class f extends k.i.k.t.e implements HookMethodCallback, Handler.Callback {
    public HashMap<WeakReference<PowerManager.WakeLock>, c> g;
    public Handler h;

    /* renamed from: i, reason: collision with root package name */
    public long f8238i;

    /* renamed from: j, reason: collision with root package name */
    public int f8239j;

    /* renamed from: k, reason: collision with root package name */
    public long f8240k;

    /* renamed from: l, reason: collision with root package name */
    public int f8241l;

    /* renamed from: m, reason: collision with root package name */
    public long f8242m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap<String, b> f8243n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap<String, b> f8244o;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c {
        public int a;
        public String b;
        public String c;
        public String d;
        public Map<String, Integer> e;
        public long f;
        public k.i.k.t.f g;
        public k.i.k.t.f h;

        /* renamed from: i, reason: collision with root package name */
        public long f8245i;

        public c(f fVar) {
        }

        public void a() {
        }

        public Pair<Boolean, Integer> b(String str) {
        }

        public long c() {
        }

        public boolean d() {
        }

        public Pair<Boolean, List<f.a>> e(PowerManager.WakeLock wakeLock, String str, long j2) {
        }

        public Pair<Boolean, Long> f(PowerManager.WakeLock wakeLock, int i2) {
        }
    }

    public f(h hVar) {
    }

    public static /* synthetic */ int n(f fVar) {
    }

    public static /* synthetic */ long o(f fVar) {
    }

    public static /* synthetic */ int p(f fVar) {
    }

    public static /* synthetic */ long q(f fVar) {
    }

    public void A(String str, Object obj, Object[] objArr, Object obj2) {
    }

    public void B(Bundle bundle) {
    }

    public final void C(boolean z) {
    }

    public final void D(HashMap<String, b> hashMap, boolean z) {
    }

    public final void E(HashMap<String, b> hashMap, boolean z) {
    }

    @Override // com.tencent.rmonitor.qqbattery.monitor.HookMethodCallback
    public void afterHookedMethod(MethodHookParam methodHookParam) {
    }

    @Override // com.tencent.rmonitor.qqbattery.monitor.HookMethodCallback
    public void beforeHookedMethod(MethodHookParam methodHookParam) {
    }

    @Override // k.i.k.t.e
    public void c() {
    }

    @Override // k.i.k.t.e
    public void e() {
    }

    @Override // k.i.k.t.e
    public void f() {
    }

    @Override // k.i.k.t.e
    public void g() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    public final void r(c cVar, int i2) {
    }

    public final void s(String str, Object obj, Object[] objArr, Object obj2) {
    }

    public final void t(Object obj, Object[] objArr) {
    }

    public final void u(c cVar, WeakReference<PowerManager.WakeLock> weakReference, Object obj, Object[] objArr) {
    }

    public final void v(c cVar) {
    }

    public final void w(String str, Object[] objArr, Object obj) {
    }

    public final void x(String str, Bundle bundle) {
    }

    public final void y(Object obj, Object[] objArr) {
    }

    public final void z(Object obj, WeakReference<PowerManager.WakeLock> weakReference, Object[] objArr, c cVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b {
        public String a;
        public int b;
        public HashSet<Pair<Long, Long>> c;

        public b(f fVar) {
        }

        public /* synthetic */ b(f fVar, a aVar) {
        }
    }
}
