package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class DownloadService extends Service {

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, a> f330j = null;
    public final b a;
    public final String b;
    public final int c;
    public final int d;
    public a e;
    public int f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f331i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public final k.d.a.a.q4.a a;
        public DownloadService b;

        public static /* synthetic */ k.d.a.a.q4.a a(a aVar) {
        }

        public void b(DownloadService downloadService) {
        }

        public void c(DownloadService downloadService) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class b {
        public void a() {
        }

        public void b() {
        }
    }

    public abstract k.d.a.a.q4.a a();

    public abstract k.d.a.a.r4.b b();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
    }
}
