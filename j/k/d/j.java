package j.k.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class j<E> extends f {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final m d;

    public j(FragmentActivity fragmentActivity) {
    }

    @Override // j.k.d.f
    public View c(int i2) {
    }

    @Override // j.k.d.f
    public boolean d() {
    }

    public Activity e() {
    }

    public Context f() {
    }

    public Handler g() {
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i2) {
    }

    public boolean l(Fragment fragment) {
    }

    public boolean m(String str) {
    }

    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
    }

    @Deprecated
    public void o(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
    }

    public void p() {
    }

    public j(Activity activity, Context context, Handler handler, int i2) {
    }
}
