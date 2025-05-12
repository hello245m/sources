package j.k.d;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler a;
    public Runnable b;
    public DialogInterface.OnCancelListener c;
    public DialogInterface.OnDismissListener d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f3359i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3360j;

    /* renamed from: k, reason: collision with root package name */
    public Observer<LifecycleOwner> f3361k;

    /* renamed from: l, reason: collision with root package name */
    public Dialog f3362l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3363m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3364n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3365o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3366p;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ d a;

        public a(d dVar) {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements DialogInterface.OnCancelListener {
        public final /* synthetic */ d a;

        public b(d dVar) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements DialogInterface.OnDismissListener {
        public final /* synthetic */ d a;

        public c(d dVar) {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: j.k.d.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0156d implements Observer<LifecycleOwner> {
        public final /* synthetic */ d a;

        public C0156d(d dVar) {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.lifecycle.Observer
        @SuppressLint({"SyntheticAccessor"})
        public /* bridge */ /* synthetic */ void onChanged(LifecycleOwner lifecycleOwner) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends f {
        public final /* synthetic */ f a;
        public final /* synthetic */ d b;

        public e(d dVar, f fVar) {
        }

        @Override // j.k.d.f
        public View c(int i2) {
        }

        @Override // j.k.d.f
        public boolean d() {
        }
    }

    public static /* synthetic */ Dialog c0(d dVar) {
    }

    public static /* synthetic */ DialogInterface.OnDismissListener d0(d dVar) {
    }

    public static /* synthetic */ boolean g0(d dVar) {
    }

    public final void A0(Bundle bundle) {
    }

    public final Dialog E0() {
    }

    public void F0(int i2, int i3) {
    }

    public void G0(Dialog dialog, int i2) {
    }

    public void I0(m mVar, String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public f createFragmentContainer() {
    }

    public void i0() {
    }

    public void m0() {
    }

    public final void n0(boolean z, boolean z2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public Dialog q0() {
    }

    public int r0() {
    }

    public Dialog v0(Bundle bundle) {
    }

    public View x0(int i2) {
    }

    public boolean y0() {
    }
}
