package com.tencent.rmonitor.natmem;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import k.i.k.q.b.b;
import k.i.k.q.b.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class NatMemHandler extends Handler implements b, c {
    public long a;
    public long b;
    public String c;
    public boolean d;
    public boolean e;
    public SharedPreferences f;
    public SharedPreferences.Editor g;

    public NatMemHandler(Looper looper) {
    }

    private native boolean nativeIs64Bit();

    @Override // k.i.k.q.b.c
    public void a(long j2) {
    }

    @Override // k.i.k.q.b.b
    public void b(long j2) {
    }

    public final void c(int i2) {
    }

    public final void d(String str) {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g(String str) {
    }

    public final void h() {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }

    public final void i() {
    }

    public final void j(String str) {
    }
}
