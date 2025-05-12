package com.tencent.xweb.pinus.sdk.process;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ContentChildProcessService extends Service {
    public static final String TAG = "ContentChildProcessService";
    public ChildProcessServiceWrapper mService;

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
