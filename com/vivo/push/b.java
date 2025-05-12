package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.vivo.vms.IPCInvoke;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class b implements ServiceConnection {
    private static final Object a = null;
    private static Map<String, b> b;
    private boolean c;
    private String d;
    private Context e;
    private AtomicInteger f;
    private volatile IPCInvoke g;
    private Object h;

    /* renamed from: i, reason: collision with root package name */
    private String f2037i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f2038j;

    private b(Context context, String str) {
    }

    public static /* synthetic */ AtomicInteger a(b bVar) {
    }

    public static /* synthetic */ void b(b bVar) {
    }

    public static /* synthetic */ void c(b bVar) {
    }

    private void d() {
    }

    private void e() {
    }

    private void f() {
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public static b a(Context context, String str) {
    }

    private void b() {
    }

    private boolean c() {
    }

    public final boolean a() {
    }

    private void a(int i2) {
    }

    public final boolean a(Bundle bundle) {
    }
}
