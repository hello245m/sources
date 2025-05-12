package j.g.t;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class m {
    public static boolean a = false;
    public static Method b = null;
    public static boolean c = false;
    public static Field d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
    }

    public static boolean b(Activity activity, KeyEvent keyEvent) {
    }

    public static boolean c(Dialog dialog, KeyEvent keyEvent) {
    }

    public static boolean d(View view, KeyEvent keyEvent) {
    }

    @SuppressLint({"LambdaLast"})
    public static boolean e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
    }

    public static DialogInterface.OnKeyListener f(Dialog dialog) {
    }
}
