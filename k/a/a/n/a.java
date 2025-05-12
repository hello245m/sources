package k.a.a.n;

import android.annotation.TargetApi;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class a implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final int e;
    public long f;
    public final int g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public Writer f3620i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap<String, d> f3621j;

    /* renamed from: k, reason: collision with root package name */
    public int f3622k;

    /* renamed from: l, reason: collision with root package name */
    public long f3623l;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f3624m;

    /* renamed from: n, reason: collision with root package name */
    public final Callable<Void> f3625n;

    /* renamed from: k.a.a.n.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class CallableC0189a implements Callable<Void> {
        public final /* synthetic */ a a;

        public CallableC0189a(a aVar) {
        }

        public Void a() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
        }

        public /* synthetic */ b(CallableC0189a callableC0189a) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;
        public final /* synthetic */ a d;

        public /* synthetic */ c(a aVar, d dVar, CallableC0189a callableC0189a) {
        }

        public static /* synthetic */ d c(c cVar) {
        }

        public static /* synthetic */ boolean[] d(c cVar) {
        }

        public void a() throws IOException {
        }

        public void b() {
        }

        public void e() throws IOException {
        }

        public File f(int i2) throws IOException {
        }

        public c(a aVar, d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class d {
        public final String a;
        public final long[] b;
        public File[] c;
        public File[] d;
        public boolean e;
        public c f;
        public long g;
        public final /* synthetic */ a h;

        public /* synthetic */ d(a aVar, String str, CallableC0189a callableC0189a) {
        }

        public static /* synthetic */ long[] a(d dVar) {
        }

        public static /* synthetic */ String b(d dVar) {
        }

        public static /* synthetic */ long c(d dVar) {
        }

        public static /* synthetic */ long d(d dVar, long j2) {
        }

        public static /* synthetic */ boolean e(d dVar) {
        }

        public static /* synthetic */ boolean f(d dVar, boolean z) {
        }

        public static /* synthetic */ c g(d dVar) {
        }

        public static /* synthetic */ c h(d dVar, c cVar) {
        }

        public static /* synthetic */ void i(d dVar, String[] strArr) throws IOException {
        }

        public File j(int i2) {
        }

        public File k(int i2) {
        }

        public String l() throws IOException {
        }

        public final IOException m(String[] strArr) throws IOException {
        }

        public final void n(String[] strArr) throws IOException {
        }

        public d(a aVar, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class e {
        public final File[] a;

        public /* synthetic */ e(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0189a callableC0189a) {
        }

        public File a(int i2) {
        }

        public e(a aVar, String str, long j2, File[] fileArr, long[] jArr) {
        }
    }

    public a(File file, int i2, int i3, long j2) {
    }

    public static void D(File file, File file2, boolean z) throws IOException {
    }

    public static /* synthetic */ Writer a(a aVar) {
    }

    public static /* synthetic */ int b(a aVar) {
    }

    public static /* synthetic */ void c(a aVar) throws IOException {
    }

    public static /* synthetic */ File d(a aVar) {
    }

    public static /* synthetic */ void e(a aVar, c cVar, boolean z) throws IOException {
    }

    public static /* synthetic */ boolean g(a aVar) {
    }

    public static /* synthetic */ void h(a aVar) throws IOException {
    }

    public static /* synthetic */ int i(a aVar, int i2) {
    }

    @TargetApi(26)
    public static void k(Writer writer) throws IOException {
    }

    public static void o(File file) throws IOException {
    }

    @TargetApi(26)
    public static void r(Writer writer) throws IOException {
    }

    public static a w(File file, int i2, int i3, long j2) throws IOException {
    }

    public final void A(String str) throws IOException {
    }

    public final synchronized void B() throws IOException {
    }

    public synchronized boolean C(String str) throws IOException {
    }

    public final void F() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    public final void j() {
    }

    public final synchronized void l(c cVar, boolean z) throws IOException {
    }

    public void n() throws IOException {
    }

    public c p(String str) throws IOException {
    }

    public final synchronized c q(String str, long j2) throws IOException {
    }

    public synchronized e t(String str) throws IOException {
    }

    public final boolean u() {
    }

    public final void y() throws IOException {
    }

    public final void z() throws IOException {
    }
}
