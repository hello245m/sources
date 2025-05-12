package j.b.k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c extends h implements DialogInterface {
    public final AlertController c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public final AlertController.f a;
        public final int b;

        public a(Context context) {
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        }

        public a b(View view) {
        }

        public a c(Drawable drawable) {
        }

        public c create() {
        }

        public a d(CharSequence charSequence) {
        }

        public a e(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        }

        public a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        }

        public a g(DialogInterface.OnKeyListener onKeyListener) {
        }

        public Context getContext() {
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        }

        public a i(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public a j(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public a setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public a setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public a setTitle(CharSequence charSequence) {
        }

        public a setView(View view) {
        }

        public a(Context context, int i2) {
        }
    }

    public c(Context context, int i2) {
    }

    public static int g(Context context, int i2) {
    }

    public ListView f() {
    }

    @Override // j.b.k.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
    }

    @Override // j.b.k.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
    }
}
