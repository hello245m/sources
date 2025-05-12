package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ErrorDialogFragment extends DialogFragment {
    private Dialog a;
    private DialogInterface.OnCancelListener b;

    public static ErrorDialogFragment newInstance(Dialog dialog) {
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
    }
}
