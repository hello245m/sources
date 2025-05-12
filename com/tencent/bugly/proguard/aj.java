package com.tencent.bugly.proguard;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class aj {
    private static aj f;
    public final x a;
    public final Context b;
    public ai c;
    public long d;
    public long e;
    private Map<Integer, Long> g;
    private LinkedBlockingQueue<Runnable> h;

    /* renamed from: i, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f976i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f977j;

    /* renamed from: k, reason: collision with root package name */
    private long f978k;

    /* renamed from: l, reason: collision with root package name */
    private int f979l;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable a;
        public final /* synthetic */ aj b;

        public a(aj ajVar, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ LinkedBlockingQueue b;

        public b(aj ajVar, int i2, LinkedBlockingQueue linkedBlockingQueue) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    private aj(Context context) {
    }

    public static /* synthetic */ Object a(aj ajVar) {
    }

    public static /* synthetic */ int b(aj ajVar) {
    }

    public static synchronized aj a(Context context) {
    }

    public final boolean b(int i2) {
    }

    public static synchronized aj a() {
    }

    public final void a(int i2, bt btVar, String str, String str2, ai aiVar, long j2, boolean z) {
    }

    private void b() {
    }

    public final void a(int i2, bt btVar, String str, String str2, ai aiVar) {
    }

    public final long a(boolean z) {
    }

    public final synchronized void a(long j2, boolean z) {
    }

    public final synchronized void a(int i2, long j2) {
    }

    public final synchronized long a(int i2) {
    }

    private static void a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i2) {
    }

    private void a(int i2, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
    }

    private boolean a(Runnable runnable, boolean z) {
    }

    private void a(Runnable runnable, long j2) {
    }

    public final void a(Runnable runnable, boolean z, boolean z2, long j2) {
    }
}
