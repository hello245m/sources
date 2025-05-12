package k.d.a.a.m4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k.d.a.a.j4.t1;
import k.d.a.a.m4.b0;
import k.d.a.a.m4.i0;
import k.d.a.a.m4.s;
import k.d.a.a.m4.v;
import k.d.a.a.m4.z;
import k.d.a.a.y2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class t implements b0 {
    public final UUID b;
    public final i0.c c;
    public final n0 d;
    public final HashMap<String, String> e;
    public final boolean f;
    public final int[] g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final g f4117i;

    /* renamed from: j, reason: collision with root package name */
    public final k.d.a.a.w4.h0 f4118j;

    /* renamed from: k, reason: collision with root package name */
    public final h f4119k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4120l;

    /* renamed from: m, reason: collision with root package name */
    public final List<s> f4121m;

    /* renamed from: n, reason: collision with root package name */
    public final Set<f> f4122n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<s> f4123o;

    /* renamed from: p, reason: collision with root package name */
    public int f4124p;

    /* renamed from: q, reason: collision with root package name */
    public i0 f4125q;

    /* renamed from: r, reason: collision with root package name */
    public s f4126r;

    /* renamed from: s, reason: collision with root package name */
    public s f4127s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f4128t;
    public Handler u;
    public int v;
    public byte[] w;
    public t1 x;
    public volatile d y;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public final HashMap<String, String> a;
        public UUID b;
        public i0.c c;
        public boolean d;
        public int[] e;
        public boolean f;
        public k.d.a.a.w4.h0 g;
        public long h;

        public t a(n0 n0Var) {
        }

        @CanIgnoreReturnValue
        public b b(boolean z) {
        }

        @CanIgnoreReturnValue
        public b c(boolean z) {
        }

        @CanIgnoreReturnValue
        public b d(int... iArr) {
        }

        @CanIgnoreReturnValue
        public b e(UUID uuid, i0.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements i0.b {
        public final /* synthetic */ t a;

        public c(t tVar) {
        }

        @Override // k.d.a.a.m4.i0.b
        public void a(i0 i0Var, byte[] bArr, int i2, int i3, byte[] bArr2) {
        }

        public /* synthetic */ c(t tVar, a aVar) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends Handler {
        public final /* synthetic */ t a;

        public d(t tVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e extends Exception {
        public /* synthetic */ e(UUID uuid, a aVar) {
        }

        public e(UUID uuid) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements b0.b {
        public final z.a b;
        public x c;
        public boolean d;
        public final /* synthetic */ t e;

        public f(t tVar, z.a aVar) {
        }

        private /* synthetic */ void b(y2 y2Var) {
        }

        private /* synthetic */ void d() {
        }

        public void a(y2 y2Var) {
        }

        public /* synthetic */ void c(y2 y2Var) {
        }

        public /* synthetic */ void e() {
        }

        @Override // k.d.a.a.m4.b0.b
        public void release() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g implements s.a {
        public final Set<s> a;
        public s b;

        public g(t tVar) {
        }

        @Override // k.d.a.a.m4.s.a
        public void a(Exception exc, boolean z) {
        }

        @Override // k.d.a.a.m4.s.a
        public void b(s sVar) {
        }

        @Override // k.d.a.a.m4.s.a
        public void c() {
        }

        public void d(s sVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements s.b {
        public final /* synthetic */ t a;

        public h(t tVar) {
        }

        public static /* synthetic */ void c(s sVar) {
        }

        @Override // k.d.a.a.m4.s.b
        public void a(s sVar, int i2) {
        }

        @Override // k.d.a.a.m4.s.b
        public void b(s sVar, int i2) {
        }

        public /* synthetic */ h(t tVar, a aVar) {
        }
    }

    public /* synthetic */ t(UUID uuid, i0.c cVar, n0 n0Var, HashMap hashMap, boolean z, int[] iArr, boolean z2, k.d.a.a.w4.h0 h0Var, long j2, a aVar) {
    }

    public static /* synthetic */ s e(t tVar) {
    }

    public static /* synthetic */ s f(t tVar, s sVar) {
    }

    public static /* synthetic */ g g(t tVar) {
    }

    public static /* synthetic */ void h(t tVar) {
    }

    public static /* synthetic */ Set i(t tVar) {
    }

    public static /* synthetic */ Looper j(t tVar) {
    }

    public static /* synthetic */ x k(t tVar, Looper looper, z.a aVar, y2 y2Var, boolean z) {
    }

    public static /* synthetic */ List l(t tVar) {
    }

    public static /* synthetic */ long m(t tVar) {
    }

    public static /* synthetic */ Set n(t tVar) {
    }

    public static /* synthetic */ Handler o(t tVar) {
    }

    public static /* synthetic */ int p(t tVar) {
    }

    public static /* synthetic */ s q(t tVar) {
    }

    public static /* synthetic */ s r(t tVar, s sVar) {
    }

    public static boolean t(x xVar) {
    }

    public static List<v.b> x(v vVar, UUID uuid, boolean z) {
    }

    public final void A(Looper looper) {
    }

    public final void B() {
    }

    public final void C() {
    }

    public final void D() {
    }

    public void E(int i2, byte[] bArr) {
    }

    public final void F(x xVar, z.a aVar) {
    }

    public final void G(boolean z) {
    }

    @Override // k.d.a.a.m4.b0
    public void a(Looper looper, t1 t1Var) {
    }

    @Override // k.d.a.a.m4.b0
    public int b(y2 y2Var) {
    }

    @Override // k.d.a.a.m4.b0
    public x c(z.a aVar, y2 y2Var) {
    }

    @Override // k.d.a.a.m4.b0
    public b0.b d(z.a aVar, y2 y2Var) {
    }

    @Override // k.d.a.a.m4.b0
    public final void prepare() {
    }

    @Override // k.d.a.a.m4.b0
    public final void release() {
    }

    public final x s(Looper looper, z.a aVar, y2 y2Var, boolean z) {
    }

    public final boolean u(v vVar) {
    }

    public final s v(List<v.b> list, boolean z, z.a aVar) {
    }

    public final s w(List<v.b> list, boolean z, z.a aVar, boolean z2) {
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void y(Looper looper) {
    }

    public final x z(int i2, boolean z) {
    }

    public t(UUID uuid, i0.c cVar, n0 n0Var, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, k.d.a.a.w4.h0 h0Var, long j2) {
    }
}
