package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import java.util.Map;
import java.util.Queue;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;
    private static final Object a = null;
    private static volatile RequestManager b;
    private static Handler c;
    private static Queue<HuaweiApi.RequestHandler> d;
    private static Map<String, HuaweiApi.RequestHandler> e;

    /* renamed from: com.huawei.hms.common.internal.RequestManager$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ HuaweiApi.RequestHandler b;

        public AnonymousClass1(String str, HuaweiApi.RequestHandler requestHandler) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.huawei.hms.common.internal.RequestManager$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass2 implements Runnable {
        public final /* synthetic */ String a;

        public AnonymousClass2(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private RequestManager(Looper looper) {
    }

    public static /* synthetic */ Map a() {
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
    }

    public static void addToConnectedReqMap(String str, HuaweiApi.RequestHandler requestHandler) {
    }

    private void b() {
    }

    private void c() {
    }

    private void d() {
    }

    public static Handler getHandler() {
    }

    public static RequestManager getInstance() {
    }

    public static void removeReqByTransId(String str) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    private void a(Message message) {
    }
}
