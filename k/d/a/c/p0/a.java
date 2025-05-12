package k.d.a.c.p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class a extends k.d.a.c.p0.e {
    public final TextWatcher d;
    public final View.OnFocusChangeListener e;
    public final TextInputLayout.f f;
    public final TextInputLayout.g g;
    public AnimatorSet h;

    /* renamed from: i, reason: collision with root package name */
    public ValueAnimator f5450i;

    /* renamed from: k.d.a.c.p0.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0255a implements TextWatcher {
        public final /* synthetic */ a a;

        public C0255a(a aVar) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements View.OnFocusChangeListener {
        public final /* synthetic */ a a;

        public b(a aVar) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements TextInputLayout.f {
        public final /* synthetic */ a a;

        public c(a aVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements TextInputLayout.g {
        public final /* synthetic */ a a;

        /* renamed from: k.d.a.c.p0.a$d$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class RunnableC0256a implements Runnable {
            public final /* synthetic */ EditText a;
            public final /* synthetic */ d b;

            public RunnableC0256a(d dVar, EditText editText) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public d(a aVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ a a;

        public e(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ a a;

        public f(a aVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ a a;

        public g(a aVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ a a;

        public h(a aVar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ a a;

        public i(a aVar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public a(TextInputLayout textInputLayout) {
    }

    public static /* synthetic */ boolean e(Editable editable) {
    }

    public static /* synthetic */ void f(a aVar, boolean z) {
    }

    public static /* synthetic */ View.OnFocusChangeListener g(a aVar) {
    }

    public static /* synthetic */ TextWatcher h(a aVar) {
    }

    public static boolean l(Editable editable) {
    }

    @Override // k.d.a.c.p0.e
    public void a() {
    }

    @Override // k.d.a.c.p0.e
    public void c(boolean z) {
    }

    public final void i(boolean z) {
    }

    public final ValueAnimator j(float... fArr) {
    }

    public final ValueAnimator k() {
    }

    public final void m() {
    }
}
