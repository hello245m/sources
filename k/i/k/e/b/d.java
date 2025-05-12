package k.i.k.e.b;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final ArrayList<String> a = null;
    public static final ArrayList<String> b = null;
    public static final Activity c = null;
    public static final CopyOnWriteArraySet<k.i.k.e.b.b> d = null;
    public static final Looper e = null;
    public static final Handler f = null;
    public static int g;
    public static final ArrayList<Integer> h = null;

    /* renamed from: i, reason: collision with root package name */
    public static Application f8151i;

    /* renamed from: j, reason: collision with root package name */
    public static WeakReference<Activity> f8152j;

    /* renamed from: k, reason: collision with root package name */
    public static long f8153k;

    /* renamed from: l, reason: collision with root package name */
    public static final SimpleDateFormat f8154l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f8155m = null;

    /* renamed from: n, reason: collision with root package name */
    public static int f8156n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f8157o = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ Application a;

        public a(Application application) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ Application a;

        public b(Application application) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static final /* synthetic */ void a(d dVar, Application application, boolean z) {
    }

    public static final void f(Application application) {
    }

    public static final void g(Application application) {
    }

    public static final void n(k.i.k.e.b.b bVar) {
    }

    public static final void o(k.i.k.e.b.b bVar) {
    }

    public final void b(String str) {
    }

    public final void c() {
    }

    public final WeakReference<Activity> d() {
    }

    public final JSONArray e() {
    }

    public final boolean h(Context context) {
    }

    public final boolean i() {
    }

    public final void j(Activity activity, int i2) {
    }

    public final void k(Activity activity, int i2, k.i.k.e.b.b bVar) {
    }

    public final void l(Activity activity, String str) {
    }

    public final void m(Application application, boolean z) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
    }

    public final void p(int i2, boolean z) {
    }

    public final void q(int i2) {
    }
}
