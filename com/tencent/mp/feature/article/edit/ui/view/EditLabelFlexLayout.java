package com.tencent.mp.feature.article.edit.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import j.b.q.k;
import java.util.List;
import n.d0.c.l;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class EditLabelFlexLayout extends k.d.a.b.e implements View.OnClickListener {
    public l<? super String, u> A;
    public l<? super String, u> B;
    public l<? super String, u> C;

    /* renamed from: r, reason: collision with root package name */
    public int f1255r;

    /* renamed from: s, reason: collision with root package name */
    public final List<String> f1256s;

    /* renamed from: t, reason: collision with root package name */
    public final List<TextView> f1257t;
    public final InputFilter[] u;
    public final InputFilter[] v;
    public int w;
    public final a x;
    public l<? super String, u> y;
    public l<? super List<String>, u> z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends k {
        public final /* synthetic */ EditLabelFlexLayout e;

        public a(Context context, EditLabelFlexLayout editLabelFlexLayout) {
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements l<Integer, u> {
        public final /* synthetic */ EditLabelFlexLayout a;

        public b(EditLabelFlexLayout editLabelFlexLayout) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements l<String, u> {
        public static final c a = null;

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements l<String, u> {
        public static final d a = null;

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends o implements l<String, u> {
        public static final e a = null;

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements l<List<? extends String>, u> {
        public static final f a = null;

        public final void b(List<String> list) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(List<? extends String> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends o implements l<String, u> {
        public static final g a = null;

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h implements TextWatcher {
        public final /* synthetic */ EditLabelFlexLayout a;
        public final /* synthetic */ Context b;

        public h(EditLabelFlexLayout editLabelFlexLayout, Context context) {
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

    public EditLabelFlexLayout(Context context, AttributeSet attributeSet) {
    }

    public static final void B(EditLabelFlexLayout editLabelFlexLayout, View view) {
    }

    public static final /* synthetic */ void C(EditLabelFlexLayout editLabelFlexLayout) {
    }

    public static final /* synthetic */ void D(EditLabelFlexLayout editLabelFlexLayout, int i2) {
    }

    public static final /* synthetic */ a E(EditLabelFlexLayout editLabelFlexLayout) {
    }

    public static final /* synthetic */ void F(EditLabelFlexLayout editLabelFlexLayout) {
    }

    public static /* synthetic */ void M(EditLabelFlexLayout editLabelFlexLayout) {
    }

    public static /* synthetic */ void N(EditLabelFlexLayout editLabelFlexLayout, View view) {
    }

    public static /* synthetic */ void O(EditLabelFlexLayout editLabelFlexLayout) {
    }

    public static final void P(EditLabelFlexLayout editLabelFlexLayout) {
    }

    public static final void X(EditLabelFlexLayout editLabelFlexLayout) {
    }

    public void G(String str) {
    }

    @SuppressLint({"SetTextI18n"})
    public final void H(String str) {
    }

    public final void I() {
    }

    public final void J(int i2) {
    }

    public void K() {
    }

    public final void L() {
    }

    public final void Q() {
    }

    public final void R() {
    }

    public final void S(int i2) {
    }

    public void T() {
    }

    public void U(String str) {
    }

    public final void V(int i2) {
    }

    public final void W() {
    }

    public String getInputText() {
    }

    public List<String> getLabels() {
    }

    public final l<String, u> getOnFinishInput() {
    }

    public final l<String, u> getOnInputChange() {
    }

    public final l<String, u> getOnLabelAdd() {
    }

    public final l<List<String>, u> getOnLabelChange() {
    }

    public final l<String, u> getOnLabelDelete() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public void setInputText(String str) {
    }

    public final void setOnFinishInput(l<? super String, u> lVar) {
    }

    public final void setOnInputChange(l<? super String, u> lVar) {
    }

    public final void setOnLabelAdd(l<? super String, u> lVar) {
    }

    public final void setOnLabelChange(l<? super List<String>, u> lVar) {
    }

    public final void setOnLabelDelete(l<? super String, u> lVar) {
    }
}
