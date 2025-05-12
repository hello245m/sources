package com.tencent.mp.feature.base.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.mp.framework.ui.widget.widget.span.TextViewWithAnimatedImageSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k.a.a.t.l.h;
import k.a.a.t.m.f;
import k.i.h.c.d.a.m.c.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ImageSpanEditTextView extends LinearLayout {
    public int a;
    public final ArrayList<k.i.h.c.d.a.m.c.b> b;
    public final HashMap<Integer, d> c;
    public boolean d;
    public Map<Integer, View> e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends h<Bitmap> {
        public final /* synthetic */ ImageSpanEditTextView d;
        public final /* synthetic */ TextViewWithAnimatedImageSpan.a e;
        public final /* synthetic */ d f;

        /* renamed from: com.tencent.mp.feature.base.ui.widget.ImageSpanEditTextView$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0048a implements d {
            public final /* synthetic */ d a;
            public final /* synthetic */ ImageSpanEditTextView b;

            public C0048a(d dVar, ImageSpanEditTextView imageSpanEditTextView) {
            }

            @Override // k.i.h.c.d.a.m.c.d
            public void a(boolean z, ImageSpan imageSpan) {
            }

            @Override // k.i.h.c.d.a.m.c.d
            public void b(boolean z, ImageSpan imageSpan) {
            }
        }

        public a(ImageSpanEditTextView imageSpanEditTextView, TextViewWithAnimatedImageSpan.a aVar, d dVar) {
        }

        @Override // k.a.a.t.l.j
        public /* bridge */ /* synthetic */ void b(Object obj, f fVar) {
        }

        @Override // k.a.a.t.l.a, k.a.a.t.l.j
        public void f(Drawable drawable) {
        }

        public void m(Bitmap bitmap, f<? super Bitmap> fVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements TextWatcher {
        public final /* synthetic */ ImageSpanEditTextView a;

        public b(ImageSpanEditTextView imageSpanEditTextView) {
        }

        public static final void a(ImageSpanEditTextView imageSpanEditTextView) {
        }

        public static /* synthetic */ void b(ImageSpanEditTextView imageSpanEditTextView) {
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

    public ImageSpanEditTextView(Context context, AttributeSet attributeSet) {
    }

    public static final /* synthetic */ HashMap b(ImageSpanEditTextView imageSpanEditTextView) {
    }

    public static final /* synthetic */ ArrayList c(ImageSpanEditTextView imageSpanEditTextView) {
    }

    public static final /* synthetic */ void d(ImageSpanEditTextView imageSpanEditTextView, ImageSpan imageSpan, boolean z) {
    }

    public static final /* synthetic */ void e(ImageSpanEditTextView imageSpanEditTextView, ImageSpan imageSpan, boolean z, d dVar) {
    }

    public static final /* synthetic */ void f(ImageSpanEditTextView imageSpanEditTextView) {
    }

    public static final /* synthetic */ void g(ImageSpanEditTextView imageSpanEditTextView) {
    }

    private final int getLayoutId() {
    }

    public static /* synthetic */ void i(ImageSpanEditTextView imageSpanEditTextView, String str, TextViewWithAnimatedImageSpan.a aVar, d dVar, int i2, Object obj) {
    }

    public static final boolean m(ImageSpanEditTextView imageSpanEditTextView, View view, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ void o(ImageSpanEditTextView imageSpanEditTextView) {
    }

    public static /* synthetic */ boolean p(ImageSpanEditTextView imageSpanEditTextView, View view, int i2, KeyEvent keyEvent) {
    }

    public static final void s(ImageSpanEditTextView imageSpanEditTextView) {
    }

    public View a(int i2) {
    }

    public final EditText getEditText() {
    }

    public final void h(String str, TextViewWithAnimatedImageSpan.a aVar, d dVar) {
    }

    public final boolean j() {
    }

    public final int k() {
    }

    public final void l(Context context) {
    }

    public final boolean n() {
    }

    public final void q(k.i.h.c.d.a.m.c.b bVar, boolean z) {
    }

    public final void r(ImageSpan imageSpan, boolean z) {
    }

    public final void setImageSpanMaxWidth(int i2) {
    }

    public final void setImageSpanMinWidth(int i2) {
    }

    public final void t(ImageSpan imageSpan, boolean z, d dVar) {
    }

    public final void u(ImageSpan imageSpan) {
    }

    public final void v() {
    }

    public final void w() {
    }

    public final void x() {
    }

    public final void y() {
    }
}
