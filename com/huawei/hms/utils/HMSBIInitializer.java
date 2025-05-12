package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HMSBIInitializer {
    public static final Object d = null;
    public static HMSBIInitializer e;
    public static HiAnalyticsInstance f;
    public final Context a;
    public AtomicBoolean b;
    public boolean c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements IQueryUrlCallBack {
        public final /* synthetic */ HMSBIInitializer a;

        public a(HMSBIInitializer hMSBIInitializer) {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i2) {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends AsyncTask<String, Integer, Void> {
        public final /* synthetic */ HMSBIInitializer a;

        public b(HMSBIInitializer hMSBIInitializer) {
        }

        public Void a(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(String[] strArr) {
        }

        public /* synthetic */ b(HMSBIInitializer hMSBIInitializer, a aVar) {
        }
    }

    public HMSBIInitializer(Context context) {
    }

    public static /* synthetic */ void a(HMSBIInitializer hMSBIInitializer, String str) {
    }

    public static /* synthetic */ Context b(HMSBIInitializer hMSBIInitializer) {
    }

    public static /* synthetic */ AtomicBoolean c(HMSBIInitializer hMSBIInitializer) {
    }

    public static HMSBIInitializer getInstance(Context context) {
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
    }

    public void initBI() {
    }

    public boolean isInit() {
    }

    public static /* synthetic */ boolean a(HMSBIInitializer hMSBIInitializer) {
    }

    public static /* synthetic */ HiAnalyticsInstance a() {
    }

    public static /* synthetic */ HiAnalyticsInstance a(HiAnalyticsInstance hiAnalyticsInstance) {
    }

    public final void a(String str) {
    }
}
