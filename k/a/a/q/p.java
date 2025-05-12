package k.a.a.q;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Collection;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class p implements Handler.Callback {

    /* renamed from: j, reason: collision with root package name */
    public static final b f3716j = null;
    public volatile k.a.a.l a;
    public final Map<FragmentManager, o> b;
    public final Map<j.k.d.m, s> c;
    public final Handler d;
    public final b e;
    public final j.d.a<View, Fragment> f;
    public final j.d.a<View, android.app.Fragment> g;
    public final Bundle h;

    /* renamed from: i, reason: collision with root package name */
    public final k f3717i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements b {
        @Override // k.a.a.q.p.b
        public k.a.a.l a(k.a.a.c cVar, l lVar, q qVar, Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        k.a.a.l a(k.a.a.c cVar, l lVar, q qVar, Context context);
    }

    public p(b bVar, k.a.a.f fVar) {
    }

    @TargetApi(17)
    public static void a(Activity activity) {
    }

    public static k b(k.a.a.f fVar) {
    }

    public static Activity c(Context context) {
    }

    public static void f(Collection<Fragment> collection, Map<View, Fragment> map) {
    }

    public static boolean u(Context context) {
    }

    @TargetApi(26)
    @Deprecated
    public final void d(FragmentManager fragmentManager, j.d.a<View, android.app.Fragment> aVar) {
    }

    @Deprecated
    public final void e(FragmentManager fragmentManager, j.d.a<View, android.app.Fragment> aVar) {
    }

    @Deprecated
    public final android.app.Fragment g(View view, Activity activity) {
    }

    public final Fragment h(View view, FragmentActivity fragmentActivity) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    @Deprecated
    public final k.a.a.l i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
    }

    public k.a.a.l j(Activity activity) {
    }

    @TargetApi(17)
    @Deprecated
    public k.a.a.l k(android.app.Fragment fragment) {
    }

    public k.a.a.l l(Context context) {
    }

    public k.a.a.l m(View view) {
    }

    public k.a.a.l n(Fragment fragment) {
    }

    public k.a.a.l o(FragmentActivity fragmentActivity) {
    }

    public final k.a.a.l p(Context context) {
    }

    @Deprecated
    public o q(Activity activity) {
    }

    public final o r(FragmentManager fragmentManager, android.app.Fragment fragment) {
    }

    public s s(j.k.d.m mVar) {
    }

    public final s t(j.k.d.m mVar, Fragment fragment) {
    }

    public final k.a.a.l v(Context context, j.k.d.m mVar, Fragment fragment, boolean z) {
    }
}
