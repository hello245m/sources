package k.d.a.a.m4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k.d.a.a.j4.t1;
import k.d.a.a.m4.i0;
import k.d.a.a.m4.v;
import k.d.a.a.m4.x;
import k.d.a.a.m4.z;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class s implements x {
    public final List<v.b> a;
    public final i0 b;
    public final a c;
    public final b d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap<String, String> h;

    /* renamed from: i, reason: collision with root package name */
    public final k.d.a.a.x4.m<z.a> f4105i;

    /* renamed from: j, reason: collision with root package name */
    public final k.d.a.a.w4.h0 f4106j;

    /* renamed from: k, reason: collision with root package name */
    public final t1 f4107k;

    /* renamed from: l, reason: collision with root package name */
    public final n0 f4108l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f4109m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f4110n;

    /* renamed from: o, reason: collision with root package name */
    public final e f4111o;

    /* renamed from: p, reason: collision with root package name */
    public int f4112p;

    /* renamed from: q, reason: collision with root package name */
    public int f4113q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f4114r;

    /* renamed from: s, reason: collision with root package name */
    public c f4115s;

    /* renamed from: t, reason: collision with root package name */
    public k.d.a.a.l4.b f4116t;
    public x.a u;
    public byte[] v;
    public byte[] w;
    public i0.a x;
    public i0.d y;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a(Exception exc, boolean z);

        void b(s sVar);

        void c();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void a(s sVar, int i2);

        void b(s sVar, int i2);
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends Handler {
        public boolean a;
        public final /* synthetic */ s b;

        public c(s sVar, Looper looper) {
        }

        public final boolean a(Message message, o0 o0Var) {
        }

        public void b(int i2, Object obj, boolean z) {
        }

        public synchronized void c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j2, boolean z, long j3, Object obj) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends Handler {
        public final /* synthetic */ s a;

        public e(s sVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
        }
    }

    public s(UUID uuid, i0 i0Var, a aVar, b bVar, List<v.b> list, int i2, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, n0 n0Var, Looper looper, k.d.a.a.w4.h0 h0Var, t1 t1Var) {
    }

    public static /* synthetic */ void i(s sVar, Object obj, Object obj2) {
    }

    public static /* synthetic */ void j(s sVar, Object obj, Object obj2) {
    }

    public static /* synthetic */ UUID k(s sVar) {
    }

    public static /* synthetic */ n0 l(s sVar) {
    }

    public static /* synthetic */ k.d.a.a.w4.h0 m(s sVar) {
    }

    public static /* synthetic */ e n(s sVar) {
    }

    public static /* synthetic */ void t(Exception exc, z.a aVar) {
    }

    public static /* synthetic */ void u(int i2, z.a aVar) {
    }

    public void A() {
    }

    public void B(Exception exc, boolean z) {
    }

    public final void C(Object obj, Object obj2) {
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean D() {
    }

    public final void E(byte[] bArr, int i2, boolean z) {
    }

    public void F() {
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean G() {
    }

    public final void H() {
    }

    @Override // k.d.a.a.m4.x
    public void a(z.a aVar) {
    }

    @Override // k.d.a.a.m4.x
    public void b(z.a aVar) {
    }

    @Override // k.d.a.a.m4.x
    public final UUID c() {
    }

    @Override // k.d.a.a.m4.x
    public boolean d() {
    }

    @Override // k.d.a.a.m4.x
    public Map<String, String> e() {
    }

    @Override // k.d.a.a.m4.x
    public boolean f(String str) {
    }

    @Override // k.d.a.a.m4.x
    public final x.a g() {
    }

    @Override // k.d.a.a.m4.x
    public final int getState() {
    }

    @Override // k.d.a.a.m4.x
    public final k.d.a.a.l4.b h() {
    }

    public final void o(k.d.a.a.x4.l<z.a> lVar) {
    }

    @RequiresNonNull({"sessionId"})
    public final void p(boolean z) {
    }

    public final long q() {
    }

    public boolean r(byte[] bArr) {
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean s() {
    }

    public final void v(Exception exc, int i2) {
    }

    public final void w(Object obj, Object obj2) {
    }

    public final void x(Exception exc, boolean z) {
    }

    public final void y() {
    }

    public void z(int i2) {
    }
}
