package k.i.k.t.j;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Pair;
import com.tencent.rmonitor.qqbattery.monitor.HookMethodCallback;
import com.tencent.rmonitor.qqbattery.monitor.MethodHookParam;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import k.i.k.t.h.i;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class g extends k.i.k.t.e implements HookMethodCallback {
    public k.i.k.t.f g;
    public k.i.k.t.f h;

    /* renamed from: i, reason: collision with root package name */
    public int f8246i;

    /* renamed from: j, reason: collision with root package name */
    public long f8247j;

    /* renamed from: k, reason: collision with root package name */
    public int f8248k;

    /* renamed from: l, reason: collision with root package name */
    public long f8249l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap<WeakReference<WifiManager.WifiLock>, c> f8250m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap<String, b> f8251n;

    /* renamed from: o, reason: collision with root package name */
    public HashMap<String, b> f8252o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap<String, HashSet<Long>> f8253p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap<String, HashSet<Long>> f8254q;

    public g(i iVar) {
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

    public final void n(c cVar, int i2) {
    }

    public final void o(MethodHookParam methodHookParam, String str) {
    }

    public final void p(MethodHookParam methodHookParam, String str) {
    }

    public final void q(MethodHookParam methodHookParam, String str) {
    }

    public final void r(String str) {
    }

    public final void s(String str, String str2, long j2) {
    }

    public final void t(String str) {
    }

    public void u(Bundle bundle) {
    }

    public final void v(boolean z) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b {
        public String a;
        public HashSet<Pair<Long, Long>> b;

        public b(g gVar) {
        }

        public /* synthetic */ b(g gVar, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c {
        public String a;
        public String b;
        public String c;
        public long d;

        public c(g gVar) {
        }

        public /* synthetic */ c(g gVar, a aVar) {
        }
    }
}
