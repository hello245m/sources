package com.huawei.hms.push;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.push.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HmsMessageService extends Service {
    public static final String PROXY_TYPE = "proxy_type";
    public static final String SUBJECT_ID = "subject_id";
    private final Messenger a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements e.a {
        public final /* synthetic */ HmsMessageService a;

        private b(HmsMessageService hmsMessageService) {
        }

        @Override // com.huawei.hms.push.e.a
        public void a(Message message) {
        }

        public /* synthetic */ b(HmsMessageService hmsMessageService, a aVar) {
        }
    }

    private void a(String str, String str2) {
    }

    private void b(Intent intent) {
    }

    public void doMsgReceived(Intent intent) {
    }

    public void handleIntentMessage(Intent intent) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    public void onDeletedMessages() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    public void onMessageDelivered(String str, Exception exc) {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onNewToken(String str, Bundle bundle) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    public void onTokenError(Exception exc) {
    }

    public void onTokenError(Exception exc, Bundle bundle) {
    }

    private Bundle a(Intent intent) {
    }

    private void b(String str, String str2) {
    }

    private void a(Intent intent, String str) {
    }

    private void b(String str, String str2, int i2) {
    }

    private synchronized void a(Intent intent, Bundle bundle, String str, int i2) {
    }

    private synchronized void a(Intent intent, Bundle bundle, String str) {
    }

    private void a(String str, String str2, int i2) {
    }
}
