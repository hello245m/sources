package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class XMJobService extends Service {
    public static Service a;
    private IBinder b;

    @TargetApi(21)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class a extends JobService {
        public Binder a;
        private Handler b;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static class HandlerC0100a extends Handler {
            public JobService a;

            public HandlerC0100a(JobService jobService) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        public a(Service service) {
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
        }
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
}
