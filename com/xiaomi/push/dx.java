package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public abstract class dx extends dv {
    public Bitmap a;
    public CharSequence b;
    public CharSequence c;
    public Map<String, String> d;
    private RemoteViews e;
    private boolean f;
    private int g;
    private String h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2123i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Notification.Action> f2124j;

    /* renamed from: k, reason: collision with root package name */
    private int f2125k;

    public dx(Context context, int i2, String str) {
    }

    public dx(Context context, String str) {
    }

    private boolean i() {
    }

    private void j() {
    }

    private void k() {
    }

    private String l() {
    }

    private Bitmap m() {
    }

    private boolean n() {
    }

    private boolean o() {
    }

    private boolean p() {
    }

    public int a(float f) {
    }

    public Bitmap a(Bitmap bitmap, float f) {
    }

    @Override // com.xiaomi.push.dv
    public dv a(Map<String, String> map) {
    }

    public dx a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
    }

    public dx a(Notification.Action action) {
    }

    public dx a(CharSequence charSequence) {
    }

    public abstract String a();

    public void a(int i2) {
    }

    public void a(int i2, Notification.Action action) {
    }

    @Override // android.app.Notification.Builder
    public /* synthetic */ Notification.Builder addAction(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
    }

    @Override // android.app.Notification.Builder
    public /* synthetic */ Notification.Builder addAction(Notification.Action action) {
    }

    public dx b(CharSequence charSequence) {
    }

    public abstract String b();

    public final boolean b(int i2) {
    }

    public dx c(Bitmap bitmap) {
    }

    public abstract boolean c();

    @Override // com.xiaomi.push.dv
    public void d() {
    }

    public final void f() {
    }

    public final RemoteViews g() {
    }

    public final boolean h() {
    }

    @Override // android.app.Notification.Builder
    public /* synthetic */ Notification.Builder setContentText(CharSequence charSequence) {
    }

    @Override // android.app.Notification.Builder
    public /* synthetic */ Notification.Builder setContentTitle(CharSequence charSequence) {
    }

    @Override // android.app.Notification.Builder
    public /* synthetic */ Notification.Builder setLargeIcon(Bitmap bitmap) {
    }
}
