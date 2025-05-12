package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class BinderAdapter implements ServiceConnection {
    private Context a;
    private final String b;
    private final String c;
    private BinderCallBack d;
    private IBinder e;
    private final Object f;
    private boolean g;
    private Handler h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f599i;

    /* renamed from: com.huawei.hms.adapter.BinderAdapter$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ BinderAdapter a;

        public AnonymousClass1(BinderAdapter binderAdapter) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.huawei.hms.adapter.BinderAdapter$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements Handler.Callback {
        public final /* synthetic */ BinderAdapter a;

        public AnonymousClass2(BinderAdapter binderAdapter) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface BinderCallBack {
        void onBinderFailed(int i2);

        void onBinderFailed(int i2, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context context, String str, String str2) {
    }

    public static /* synthetic */ void a(BinderAdapter binderAdapter) {
    }

    public static /* synthetic */ BinderCallBack b(BinderAdapter binderAdapter) {
    }

    private void c() {
    }

    private void d() {
    }

    private void e() {
    }

    private void f() {
    }

    private void g() {
    }

    private BinderCallBack h() {
    }

    private void i() {
    }

    private void j() {
    }

    public int a() {
    }

    public int b() {
    }

    public void binder(BinderCallBack binderCallBack) {
    }

    public String getServiceAction() {
    }

    public IBinder getServiceBinder() {
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void unBind() {
    }

    public void updateDelayTask() {
    }
}
