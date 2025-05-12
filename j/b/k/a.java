package j.b.k;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import j.b.p.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(Drawable drawable);

    public abstract void B(boolean z);

    public abstract void C(CharSequence charSequence);

    public j.b.p.b D(b.a aVar) {
    }

    public boolean g() {
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public abstract void l();

    public boolean m() {
    }

    public void n(Configuration configuration) {
    }

    public void o() {
    }

    public abstract boolean p(int i2, KeyEvent keyEvent);

    public boolean q(KeyEvent keyEvent) {
    }

    public boolean r() {
    }

    public abstract void s(Drawable drawable);

    public abstract void t(View view, C0110a c0110a);

    public abstract void u(boolean z);

    public abstract void v(boolean z);

    public abstract void w(boolean z);

    public abstract void x(boolean z);

    public abstract void y(boolean z);

    public abstract void z(float f);

    /* renamed from: j.b.k.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0110a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0110a(Context context, AttributeSet attributeSet) {
        }

        public C0110a(int i2, int i3) {
        }

        public C0110a(C0110a c0110a) {
        }

        public C0110a(ViewGroup.LayoutParams layoutParams) {
        }
    }
}
