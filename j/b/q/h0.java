package j.b.q;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public Runnable e;
    public Runnable f;
    public boolean g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2813i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ h0 a;

        public a(h0 h0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ h0 a;

        public b(h0 h0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public h0(View view) {
    }

    public static boolean h(View view, float f, float f2, float f3) {
    }

    public final void a() {
    }

    public abstract j.b.p.j.p b();

    public abstract boolean c();

    public boolean d() {
    }

    public void e() {
    }

    public final boolean f(MotionEvent motionEvent) {
    }

    public final boolean g(MotionEvent motionEvent) {
    }

    public final boolean i(View view, MotionEvent motionEvent) {
    }

    public final boolean j(View view, MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
