package j.k.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import j.g.p.b;
import j.k.d.y;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class e {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements b.InterfaceC0137b {
        public final /* synthetic */ Fragment a;

        public a(Fragment fragment) {
        }

        @Override // j.g.p.b.InterfaceC0137b
        public void onCancel() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ Fragment b;
        public final /* synthetic */ y.g c;
        public final /* synthetic */ j.g.p.b d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ b a;

            public a(b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, y.g gVar, j.g.p.b bVar) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;
        public final /* synthetic */ y.g d;
        public final /* synthetic */ j.g.p.b e;

        public c(ViewGroup viewGroup, View view, Fragment fragment, y.g gVar, j.g.p.b bVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public static void a(Fragment fragment, d dVar, y.g gVar) {
    }

    public static int b(Fragment fragment, boolean z, boolean z2) {
    }

    public static d c(Context context, Fragment fragment, boolean z, boolean z2) {
    }

    public static int d(int i2, boolean z) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public final Animation a;
        public final Animator b;

        public d(Animation animation) {
        }

        public d(Animator animator) {
        }
    }

    /* renamed from: j.k.d.e$e, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class RunnableC0157e extends AnimationSet implements Runnable {
        public final ViewGroup a;
        public final View b;
        public boolean c;
        public boolean d;
        public boolean e;

        public RunnableC0157e(Animation animation, ViewGroup viewGroup, View view) {
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f) {
        }
    }
}
