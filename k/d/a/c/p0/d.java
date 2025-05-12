package k.d.a.c.p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k.d.a.c.f0.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class d extends k.d.a.c.p0.e {

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f5451q = false;
    public final TextWatcher d;
    public final View.OnFocusChangeListener e;
    public final TextInputLayout.e f;
    public final TextInputLayout.f g;

    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.g h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5452i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5453j;

    /* renamed from: k, reason: collision with root package name */
    public long f5454k;

    /* renamed from: l, reason: collision with root package name */
    public StateListDrawable f5455l;

    /* renamed from: m, reason: collision with root package name */
    public k.d.a.c.l0.g f5456m;

    /* renamed from: n, reason: collision with root package name */
    public AccessibilityManager f5457n;

    /* renamed from: o, reason: collision with root package name */
    public ValueAnimator f5458o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f5459p;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends k {
        public final /* synthetic */ d a;

        /* renamed from: k.d.a.c.p0.d$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class RunnableC0257a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;
            public final /* synthetic */ a b;

            public RunnableC0257a(a aVar, AutoCompleteTextView autoCompleteTextView) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(d dVar) {
        }

        @Override // k.d.a.c.f0.k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ d a;

        public b(d dVar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements View.OnFocusChangeListener {
        public final /* synthetic */ d a;

        public c(d dVar) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: k.d.a.c.p0.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0258d extends TextInputLayout.e {
        public final /* synthetic */ d e;

        public C0258d(d dVar, TextInputLayout textInputLayout) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, j.g.t.g
        public void g(View view, j.g.t.r0.c cVar) {
        }

        @Override // j.g.t.g
        public void h(View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements TextInputLayout.f {
        public final /* synthetic */ d a;

        public e(d dVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements TextInputLayout.g {
        public final /* synthetic */ d a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;
            public final /* synthetic */ f b;

            public a(f fVar, AutoCompleteTextView autoCompleteTextView) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public f(d dVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ d a;

        public g(d dVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements View.OnTouchListener {
        public final /* synthetic */ AutoCompleteTextView a;
        public final /* synthetic */ d b;

        public h(d dVar, AutoCompleteTextView autoCompleteTextView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        public final /* synthetic */ d a;

        public i(d dVar) {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j extends AnimatorListenerAdapter {
        public final /* synthetic */ d a;

        public j(d dVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public d(TextInputLayout textInputLayout) {
    }

    public static boolean D(EditText editText) {
    }

    public static /* synthetic */ AutoCompleteTextView e(EditText editText) {
    }

    public static /* synthetic */ AccessibilityManager f(d dVar) {
    }

    public static /* synthetic */ TextInputLayout.e g(d dVar) {
    }

    public static /* synthetic */ View.OnFocusChangeListener h(d dVar) {
    }

    public static /* synthetic */ boolean i() {
    }

    public static /* synthetic */ boolean j(d dVar) {
    }

    public static /* synthetic */ long k(d dVar, long j2) {
    }

    public static /* synthetic */ boolean l(d dVar) {
    }

    public static /* synthetic */ ValueAnimator m(d dVar) {
    }

    public static /* synthetic */ boolean n(EditText editText) {
    }

    public static /* synthetic */ void o(d dVar, boolean z) {
    }

    public static /* synthetic */ boolean p(d dVar, boolean z) {
    }

    public static /* synthetic */ void q(d dVar, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ void r(d dVar, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ void s(d dVar, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ void t(d dVar, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ TextWatcher u(d dVar) {
    }

    public static AutoCompleteTextView y(EditText editText) {
    }

    public final k.d.a.c.l0.g A(float f2, float f3, float f4, int i2) {
    }

    public final void B() {
    }

    public final boolean C() {
    }

    public final void E(boolean z) {
    }

    public final void F(AutoCompleteTextView autoCompleteTextView) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G(AutoCompleteTextView autoCompleteTextView) {
    }

    public final void H(AutoCompleteTextView autoCompleteTextView) {
    }

    @Override // k.d.a.c.p0.e
    public void a() {
    }

    @Override // k.d.a.c.p0.e
    public boolean b(int i2) {
    }

    @Override // k.d.a.c.p0.e
    public boolean d() {
    }

    public final void v(AutoCompleteTextView autoCompleteTextView) {
    }

    public final void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, k.d.a.c.l0.g gVar) {
    }

    public final void x(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, k.d.a.c.l0.g gVar) {
    }

    public final ValueAnimator z(int i2, float... fArr) {
    }
}
