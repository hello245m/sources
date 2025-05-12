package com.huawei.hms.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class AbstractDialog {
    public Activity a;
    public AlertDialog b;
    public Callback c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface Callback {
        void onCancel(AbstractDialog abstractDialog);

        void onDoWork(AbstractDialog abstractDialog);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ AbstractDialog a;

        public a(AbstractDialog abstractDialog) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ AbstractDialog a;

        public b(AbstractDialog abstractDialog) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements DialogInterface.OnCancelListener {
        public final /* synthetic */ AbstractDialog a;

        public c(AbstractDialog abstractDialog) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements DialogInterface.OnKeyListener {
        public final /* synthetic */ AbstractDialog a;

        public d(AbstractDialog abstractDialog) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        }
    }

    public void cancel() {
    }

    public void dismiss() {
    }

    public void fireCancel() {
    }

    public void fireDoWork() {
    }

    public Activity getActivity() {
    }

    public int getDialogThemeId() {
    }

    public AlertDialog onCreateDialog(Activity activity) {
    }

    public abstract String onGetMessageString(Context context);

    public abstract String onGetNegativeButtonString(Context context);

    public abstract String onGetPositiveButtonString(Context context);

    public abstract String onGetTitleString(Context context);

    public void setMessage(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void show(Activity activity, Callback callback) {
    }
}
