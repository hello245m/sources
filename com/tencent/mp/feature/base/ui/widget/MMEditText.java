package com.tencent.mp.feature.base.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import k.i.h.b.d.b1.p.b0;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MMEditText extends EditText {
    public InputConnection a;
    public ArrayList<TextWatcher> b;
    public int c;
    public a d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface a {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface b {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class c implements TextWatcher {
        public EditText a;
        public TextView b;
        public int c;
        public b d;
        public e e;
        public f f;
        public b0 g;
        public boolean h;

        public c(EditText editText, TextView textView, int i2) {
        }

        public void a(e eVar) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        public void b(f fVar) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void c(b0 b0Var) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class d implements TextWatcher {
        public boolean a;
        public boolean b;
        public final /* synthetic */ MMEditText c;

        public d(MMEditText mMEditText) {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface e {
        void a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface f {
        void a(int i2);
    }

    public MMEditText(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ void a(MMEditText mMEditText, CharSequence charSequence, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void b(MMEditText mMEditText, CharSequence charSequence, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void c(MMEditText mMEditText, Editable editable) {
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
    }

    public final void d() {
    }

    public void e(String str) {
    }

    public final void f(Editable editable) {
    }

    public final void g(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public InputConnection getInputConnection() {
    }

    public final void h(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void i(String str) {
    }

    public void j(String str) {
    }

    public void k(CharSequence charSequence) {
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
    }

    public void setBackListener(a aVar) {
    }
}
