package com.huawei.hms.api;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class HuaweiMobileServicesUtil {
    public static final String HMS_ERROR_DIALOG = "HuaweiMobileServicesErrorDialog";
    private static final int HMS_VERSION_CODE_NOMDM = 20500000;
    private static final String TAG = "HuaweiMobileServicesUtil";

    public static Dialog getErrorDialog(int i2, Activity activity, int i3) {
    }

    public static String getErrorString(int i2) {
    }

    @Deprecated
    public static String getOpenSourceSoftwareLicenseInfo(Context context) {
    }

    public static Context getRemoteContext(Context context) {
    }

    public static Resources getRemoteResource(Context context) {
    }

    public static int isHuaweiMobileServicesAvailable(Context context, int i2) {
    }

    public static boolean isUserRecoverableError(int i2) {
    }

    public static boolean popupErrDlgFragment(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
    }

    public static void setApplication(Application application) {
    }

    public static boolean showErrorDialogFragment(int i2, Activity activity, int i3) {
    }

    public static void showErrorNotification(int i2, Context context) {
    }

    public static Dialog getErrorDialog(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
    }

    public static boolean popupErrDlgFragment(int i2, Activity activity, Fragment fragment, int i3, DialogInterface.OnCancelListener onCancelListener) {
    }

    public static int isHuaweiMobileServicesAvailable(Context context) {
    }
}
