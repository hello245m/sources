package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.tpns.baseapi.base.util.TTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class XGPushBaseReceiver extends BroadcastReceiver {
    public static final int SUCCESS = 0;
    private long a;

    /* renamed from: com.tencent.android.tpush.XGPushBaseReceiver$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ XGPushBaseReceiver c;

        public AnonymousClass1(XGPushBaseReceiver xGPushBaseReceiver, Context context, Intent intent) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    public static /* synthetic */ void a(XGPushBaseReceiver xGPushBaseReceiver, Context context, Intent intent) {
    }

    public static /* synthetic */ void b(XGPushBaseReceiver xGPushBaseReceiver, Context context, Intent intent) {
    }

    public static /* synthetic */ void c(XGPushBaseReceiver xGPushBaseReceiver, Context context, Intent intent) {
    }

    private void d(Context context, Intent intent) {
    }

    private void e(Context context, Intent intent, int i2) {
    }

    private void f(Context context, Intent intent) {
    }

    private void g(Context context, Intent intent) {
    }

    private void h(Context context, Intent intent) {
    }

    public abstract void onDeleteAccountResult(Context context, int i2, String str);

    public abstract void onDeleteAttributeResult(Context context, int i2, String str);

    public abstract void onDeleteTagResult(Context context, int i2, String str);

    public void onInMsgClickedResult(Context context, XGPushClickedResult xGPushClickedResult) {
    }

    public void onInMsgReceivedResult(Context context, XGPushTextMessage xGPushTextMessage) {
    }

    public void onInMsgShowedResult(Context context, XGPushShowedResult xGPushShowedResult) {
    }

    public abstract void onNotificationClickedResult(Context context, XGPushClickedResult xGPushClickedResult);

    public abstract void onNotificationShowedResult(Context context, XGPushShowedResult xGPushShowedResult);

    public abstract void onQueryTagsResult(Context context, int i2, String str, String str2);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
    }

    public abstract void onRegisterResult(Context context, int i2, XGPushRegisterResult xGPushRegisterResult);

    public abstract void onSetAccountResult(Context context, int i2, String str);

    public abstract void onSetAttributeResult(Context context, int i2, String str);

    public abstract void onSetTagResult(Context context, int i2, String str);

    public abstract void onTextMessage(Context context, XGPushTextMessage xGPushTextMessage);

    public abstract void onUnregisterResult(Context context, int i2);

    private void a(Context context, Intent intent) {
    }

    private void b(Context context, Intent intent) {
    }

    private void c(Context context, Intent intent) {
    }

    private void e(Context context, Intent intent) {
    }

    private void c(Context context, Intent intent, int i2) {
    }

    private void b(Context context, Intent intent, int i2) {
    }

    private void d(Context context, Intent intent, int i2) {
    }

    private void a(Context context, Intent intent, int i2) {
    }
}
