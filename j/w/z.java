package j.w;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class z {
    public static x a;
    public static ThreadLocal<WeakReference<j.d.a<ViewGroup, ArrayList<x>>>> b;
    public static ArrayList<ViewGroup> c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public x a;
        public ViewGroup b;

        /* renamed from: j.w.z$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0185a extends y {
            public final /* synthetic */ j.d.a a;
            public final /* synthetic */ a b;

            public C0185a(a aVar, j.d.a aVar2) {
            }

            @Override // j.w.x.f
            public void c(x xVar) {
            }
        }

        public a(x xVar, ViewGroup viewGroup) {
        }

        public final void a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static void a(ViewGroup viewGroup, x xVar) {
    }

    public static j.d.a<ViewGroup, ArrayList<x>> b() {
    }

    public static void c(ViewGroup viewGroup, x xVar) {
    }

    public static void d(ViewGroup viewGroup, x xVar) {
    }
}
