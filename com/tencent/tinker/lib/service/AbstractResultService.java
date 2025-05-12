package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import k.i.m.d.e.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AbstractResultService extends IntentService {
    public static void b(Context context, a aVar, String str) {
    }

    public abstract void a(a aVar);

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
    }
}
