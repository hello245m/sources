package com.tencent.mp.framework.ui.widget.widget.span;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class TextViewWithAnimatedImageSpan extends TextView {
    public final ArrayList<b> a;
    public final HashMap<Integer, Integer> b;
    public SpannableStringBuilder c;
    public int d;
    public int e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public static final C0075a d = null;
        public static final a e = null;
        public boolean a;
        public boolean b;
        public boolean c;

        /* renamed from: com.tencent.mp.framework.ui.widget.widget.span.TextViewWithAnimatedImageSpan$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0075a {
            public C0075a() {
            }

            public /* synthetic */ C0075a(h hVar) {
            }

            public final a a() {
            }
        }

        public a(boolean z, boolean z2, boolean z3) {
        }

        public static final /* synthetic */ a a() {
        }

        public final boolean b() {
        }

        public final boolean c() {
        }

        public final boolean d() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b {
        public int a;
        public final ImageSpan b;
        public ClickableSpan c;

        public b(int i2, ImageSpan imageSpan) {
        }

        public final ClickableSpan a() {
        }

        public final ImageSpan b() {
        }

        public final int c() {
        }

        public final void d(ClickableSpan clickableSpan) {
        }

        public final void e(int i2) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends ClickableSpan {
        public final /* synthetic */ k.i.h.c.d.a.m.c.b a;
        public final /* synthetic */ a b;
        public final /* synthetic */ d c;
        public final /* synthetic */ TextViewWithAnimatedImageSpan d;
        public final /* synthetic */ b e;
        public final /* synthetic */ k.i.h.c.d.a.m.c.d f;

        public c(k.i.h.c.d.a.m.c.b bVar, a aVar, d dVar, TextViewWithAnimatedImageSpan textViewWithAnimatedImageSpan, b bVar2, k.i.h.c.d.a.m.c.d dVar2) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d implements Animator.AnimatorListener {
        public final /* synthetic */ TextViewWithAnimatedImageSpan a;
        public final /* synthetic */ b b;
        public final /* synthetic */ k.i.h.c.d.a.m.c.d c;

        public d(TextViewWithAnimatedImageSpan textViewWithAnimatedImageSpan, b bVar, k.i.h.c.d.a.m.c.d dVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public TextViewWithAnimatedImageSpan(Context context, AttributeSet attributeSet) {
    }

    public static final /* synthetic */ void a(TextViewWithAnimatedImageSpan textViewWithAnimatedImageSpan, ImageSpan imageSpan, k.i.h.c.d.a.m.c.d dVar) {
    }

    public static final /* synthetic */ void b(TextViewWithAnimatedImageSpan textViewWithAnimatedImageSpan, int i2) {
    }

    public static /* synthetic */ void l(TextViewWithAnimatedImageSpan textViewWithAnimatedImageSpan, k.i.h.c.d.a.m.c.b bVar, boolean z, int i2, Object obj) {
    }

    public final k.i.h.c.d.a.m.c.b c(Bitmap bitmap, a aVar, k.i.h.c.d.a.m.c.d dVar) {
    }

    public final k.i.h.c.d.a.m.c.b d(k.i.h.c.d.a.m.c.b bVar, a aVar, k.i.h.c.d.a.m.c.d dVar) {
    }

    public final void e(Context context) {
    }

    public final k.i.h.c.d.a.m.c.b f(k.i.h.c.d.a.m.c.b bVar, int i2, a aVar, k.i.h.c.d.a.m.c.d dVar) {
    }

    public final void g(ImageSpan imageSpan, k.i.h.c.d.a.m.c.d dVar) {
    }

    public final int getImageSpanListWidth() {
    }

    public final int getImageSpanSize() {
    }

    public final int getSize() {
    }

    public final void h(ImageSpan imageSpan, k.i.h.c.d.a.m.c.d dVar) {
    }

    public final void i(int i2) {
    }

    public final void j(ImageSpan imageSpan, k.i.h.c.d.a.m.c.d dVar) {
    }

    public final void k(k.i.h.c.d.a.m.c.b bVar, boolean z) {
    }

    public final void m() {
    }
}
