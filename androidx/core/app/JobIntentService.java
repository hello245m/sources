package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class JobIntentService extends Service {
    public static final HashMap<ComponentName, h> g = null;
    public b a;
    public h b;
    public a c;
    public boolean d;
    public boolean e;
    public final ArrayList<d> f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ JobIntentService a;

        public a(JobIntentService jobIntentService) {
        }

        public Void a(Void... voidArr) {
        }

        public void b(Void r1) {
        }

        public void c(Void r1) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(Void r1) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Void r1) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        IBinder a();

        e b();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c extends h {
        public final PowerManager.WakeLock d;
        public final PowerManager.WakeLock e;
        public boolean f;
        public boolean g;

        public c(Context context, ComponentName componentName) {
        }

        @Override // androidx.core.app.JobIntentService.h
        public void b() {
        }

        @Override // androidx.core.app.JobIntentService.h
        public void c() {
        }

        @Override // androidx.core.app.JobIntentService.h
        public void d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class d implements e {
        public final Intent a;
        public final int b;
        public final /* synthetic */ JobIntentService c;

        public d(JobIntentService jobIntentService, Intent intent, int i2) {
        }

        @Override // androidx.core.app.JobIntentService.e
        public void a() {
        }

        @Override // androidx.core.app.JobIntentService.e
        public Intent getIntent() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        void a();

        Intent getIntent();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class f extends JobServiceEngine implements b {
        public final JobIntentService a;
        public final Object b;
        public JobParameters c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public final class a implements e {
            public final JobWorkItem a;
            public final /* synthetic */ f b;

            public a(f fVar, JobWorkItem jobWorkItem) {
            }

            @Override // androidx.core.app.JobIntentService.e
            public void a() {
            }

            @Override // androidx.core.app.JobIntentService.e
            public Intent getIntent() {
            }
        }

        public f(JobIntentService jobIntentService) {
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
        }

        @Override // androidx.core.app.JobIntentService.b
        public e b() {
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g extends h {
        public g(Context context, ComponentName componentName, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class h {
        public final ComponentName a;
        public boolean b;
        public int c;

        public h(ComponentName componentName) {
        }

        public void a(int i2) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public static h d(Context context, ComponentName componentName, boolean z, int i2) {
    }

    public e a() {
    }

    public boolean b() {
    }

    public void c(boolean z) {
    }

    public abstract void e(Intent intent);

    public boolean f() {
    }

    public void g() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
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
}
