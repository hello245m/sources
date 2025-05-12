package com.tencent.android.tpush.inappmessage;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a extends Dialog {
    public RelativeLayout a;
    public Activity b;
    public boolean c;

    /* renamed from: com.tencent.android.tpush.inappmessage.a$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ a a;

        public AnonymousClass1(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public a(Activity activity) {
    }

    private RelativeLayout g() {
    }

    private RelativeLayout h() {
    }

    public void a() {
    }

    public abstract void a(RelativeLayout relativeLayout);

    public abstract RelativeLayout.LayoutParams b();

    public abstract boolean c();

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public abstract boolean d();

    public abstract void e();

    public void f() {
    }

    private e a(View view) {
    }
}
