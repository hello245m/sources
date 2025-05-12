package com.tencent.android.tpush;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.message.PushMessageManager;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.baseapi.core.net.HttpRequestCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPushManager {
    public static final int MAX_TAG_LENGTH = 50;
    public static final int MAX_TAG_SIZE = 500;
    public static final int OPERATION_FAIL = 1;
    public static final int OPERATION_REQ_REGISTER = 100;
    public static final int OPERATION_REQ_UNREGISTER = 101;
    public static final int OPERATION_SUCCESS = 0;
    private static boolean a;
    private static Context b;
    private static Long c;
    private static long d;
    private static volatile TTask e;
    private static volatile Queue<Long> f;
    private static XGPushNotifactionCallback g;
    private static XGSysPushNotifactionCallback h;

    /* renamed from: i, reason: collision with root package name */
    private static Map<b, c> f727i;

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f728j = null;
    public static Map<String, Long> lastSuccessRegisterMap;

    /* renamed from: com.tencent.android.tpush.XGPushManager$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements XGIOperateCallback {
        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$10, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass10 extends TTask {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ int d;
        public final /* synthetic */ XGIOperateCallback e;
        public final /* synthetic */ String f;

        /* renamed from: com.tencent.android.tpush.XGPushManager$10$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends BroadcastReceiver {
            public final /* synthetic */ AnonymousClass10 a;

            /* renamed from: com.tencent.android.tpush.XGPushManager$10$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
            public class C00111 extends TTask {
                public final /* synthetic */ Intent a;
                public final /* synthetic */ AnonymousClass1 b;

                public C00111(AnonymousClass1 anonymousClass1, Intent intent) {
                }

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            }

            public AnonymousClass1(AnonymousClass10 anonymousClass10) {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
            }
        }

        public AnonymousClass10(String str, long j2, Context context, int i2, XGIOperateCallback xGIOperateCallback, String str2) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$11, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass11 extends TTask {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ Intent b;

        public AnonymousClass11(Activity activity, Intent intent) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$12, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass12 implements XGIOperateCallback {
        public final /* synthetic */ String a;

        public AnonymousClass12(String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$13, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass13 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ XGLocalMessage b;

        public AnonymousClass13(Context context, XGLocalMessage xGLocalMessage) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$14, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass14 extends TTask {
        public final /* synthetic */ Context a;

        public AnonymousClass14(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$15, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass15 extends TTask {
        public final /* synthetic */ Context a;

        public AnonymousClass15(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$16, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass16 extends TTask {
        public final /* synthetic */ long a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f729i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f730j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f731k;

        /* renamed from: com.tencent.android.tpush.XGPushManager$16$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 implements XGIOperateCallback {
            public final /* synthetic */ AnonymousClass16 a;

            public AnonymousClass1(AnonymousClass16 anonymousClass16) {
            }

            @Override // com.tencent.android.tpush.XGIOperateCallback
            public void onFail(Object obj, int i2, String str) {
            }

            @Override // com.tencent.android.tpush.XGIOperateCallback
            public void onSuccess(Object obj, int i2) {
            }
        }

        public AnonymousClass16(long j2, Context context, String str, int i2, String str2, long j3, String str3, String str4, String str5, String str6, long j4) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$17, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass17 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ XGIOperateCallback b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f732i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f733j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f734k;

        public AnonymousClass17(Context context, XGIOperateCallback xGIOperateCallback, long j2, String str, long j3, int i2, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$18, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass18 implements XGIOperateCallback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ List b;

        public AnonymousClass18(Context context, List list) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$19, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass19 extends BroadcastReceiver {
        public final /* synthetic */ XGIOperateCallback a;
        public final /* synthetic */ boolean b;

        public AnonymousClass19(XGIOperateCallback xGIOperateCallback, boolean z) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements com.tencent.android.tpush.b {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ XGIOperateCallback e;

        public AnonymousClass2(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.android.tpush.b
        public void a(Object obj, int i2) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$20, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass20 extends BroadcastReceiver {
        public final /* synthetic */ XGIOperateCallback a;

        /* renamed from: com.tencent.android.tpush.XGPushManager$20$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ Context a;
            public final /* synthetic */ AnonymousClass20 b;

            public AnonymousClass1(AnonymousClass20 anonymousClass20, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass20(XGIOperateCallback xGIOperateCallback) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$21, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass21 extends BroadcastReceiver {
        public final /* synthetic */ HttpRequestCallback a;

        public AnonymousClass21(HttpRequestCallback httpRequestCallback) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$22, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass22 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ HttpRequestCallback b;
        public final /* synthetic */ BroadcastReceiver c;

        public AnonymousClass22(Context context, HttpRequestCallback httpRequestCallback, BroadcastReceiver broadcastReceiver) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$23, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass23 implements XGIOperateCallback {
        public final /* synthetic */ String a;

        public AnonymousClass23(String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$24, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass24 implements XGIOperateCallback {
        public final /* synthetic */ String a;

        public AnonymousClass24(String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$25, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass25 implements XGIOperateCallback {
        public final /* synthetic */ String a;

        public AnonymousClass25(String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$26, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass26 implements XGIOperateCallback {
        public final /* synthetic */ String a;

        public AnonymousClass26(String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$27, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass27 implements XGIOperateCallback {
        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$28, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass28 implements XGIOperateCallback {
        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$29, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass29 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ XGIOperateCallback b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;

        public AnonymousClass29(Context context, XGIOperateCallback xGIOperateCallback, long j2, String str) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends BroadcastReceiver {
        public final /* synthetic */ XGIOperateCallback a;

        /* renamed from: com.tencent.android.tpush.XGPushManager$3$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ Intent a;
            public final /* synthetic */ AnonymousClass3 b;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, Intent intent) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass3(XGIOperateCallback xGIOperateCallback) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass4 implements XGIOperateCallback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ XGIOperateCallback e;

        public AnonymousClass4(Context context, String str, int i2, int i3, XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements XGIOperateCallback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ XGIOperateCallback f;

        public AnonymousClass5(Context context, String str, int i2, int i3, String str2, XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass6 extends BroadcastReceiver {
        public final /* synthetic */ XGIOperateCallback a;

        /* renamed from: com.tencent.android.tpush.XGPushManager$6$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ Intent a;
            public final /* synthetic */ AnonymousClass6 b;

            public AnonymousClass1(AnonymousClass6 anonymousClass6, Intent intent) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass6(XGIOperateCallback xGIOperateCallback) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass7 implements com.tencent.android.tpush.b {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ long d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ XGIOperateCallback g;

        public AnonymousClass7(Context context, String str, int i2, long j2, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.android.tpush.b
        public void a(Object obj, int i2) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass8 extends BroadcastReceiver {
        public final /* synthetic */ XGIOperateCallback a;

        /* renamed from: com.tencent.android.tpush.XGPushManager$8$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ Intent a;
            public final /* synthetic */ AnonymousClass8 b;

            public AnonymousClass1(AnonymousClass8 anonymousClass8, Intent intent) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass8(XGIOperateCallback xGIOperateCallback) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushManager$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass9 implements com.tencent.android.tpush.b {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ XGIOperateCallback g;

        public AnonymousClass9(Context context, String str, long j2, String str2, int i2, String str3, XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.android.tpush.b
        public void a(Object obj, int i2) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AccountInfo {
        public String accountName;
        public int accountType;

        public AccountInfo(int i2, String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class AccountType {
        private static final /* synthetic */ AccountType[] $VALUES = null;
        public static final AccountType ALIPAY = null;
        public static final AccountType BAIDU = null;
        public static final AccountType CUSTOM = null;
        public static final AccountType DOUBAN = null;
        public static final AccountType EMAIL = null;
        public static final AccountType FACEBOOK = null;
        public static final AccountType GOOGLE = null;

        @Deprecated
        public static final AccountType IDFA = null;

        @Deprecated
        public static final AccountType IDFMD5 = null;

        @Deprecated
        public static final AccountType IMEI = null;

        @Deprecated
        public static final AccountType IMEIMD5 = null;
        public static final AccountType JINGDONG = null;
        public static final AccountType LINKEDIN = null;

        @Deprecated
        public static final AccountType MAC = null;

        @Deprecated
        public static final AccountType MACMDS = null;
        public static final AccountType OAID = null;
        public static final AccountType OAIDMD5 = null;
        public static final AccountType PHONE_NUMBER = null;
        public static final AccountType QQ = null;
        public static final AccountType QQMD5 = null;
        public static final AccountType QQ_OPEN_ID = null;
        public static final AccountType SINA_WEIBO = null;
        public static final AccountType TAOBAO = null;
        public static final AccountType TWITTER = null;
        public static final AccountType UNIONID = null;
        public static final AccountType UNKNOWN = null;
        public static final AccountType WX_OPEN_ID = null;
        private int value;

        private AccountType(String str, int i2, int i3) {
        }

        public static AccountType valueOf(String str) {
        }

        public static AccountType[] values() {
        }

        public int getValue() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends TTask {
        private Context a;
        private Intent b;
        private XGIOperateCallback c;
        private int d;
        private int e;
        private boolean f;

        public a(XGIOperateCallback xGIOperateCallback, Context context, Intent intent, int i2, int i3, boolean z) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends BroadcastReceiver {
        public Context a;
        public Intent b;
        public XGIOperateCallback c;
        public int d;

        public b(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends TTask {
        public Context a;
        public Intent b;
        public XGIOperateCallback c;
        public int d;

        /* renamed from: com.tencent.android.tpush.XGPushManager$c$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ c a;

            public AnonymousClass1(c cVar) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public c(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    private XGPushManager() {
    }

    public static /* synthetic */ Intent a(Context context, Intent intent, XGIOperateCallback xGIOperateCallback, AccountInfo accountInfo) {
    }

    public static long addLocalNotification(Context context, XGLocalMessage xGLocalMessage) {
    }

    public static void addLocalNotificationList(Context context, ArrayList<XGLocalMessage> arrayList) {
    }

    @Deprecated
    public static void addTags(Context context, String str, Set<String> set) {
    }

    @Deprecated
    public static void appendAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void appendTags(Context context, String str, Set<String> set) {
    }

    public static /* synthetic */ Map b() {
    }

    @Deprecated
    public static void bindAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static String bytesToHex(byte[] bArr) {
    }

    private static void c(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback) {
    }

    public static void cancelAllNotifaction(Context context) {
    }

    public static void cancelNotifaction(Context context, int i2) {
    }

    @Deprecated
    public static void cleanTags(Context context, String str) {
    }

    public static void clearAccounts(Context context) {
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static void clearAndAppendAttributes(Context context, String str, Map<String, String> map, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void clearAndAppendTags(Context context, String str, Set<String> set) {
    }

    public static void clearAttributes(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static void clearLocalNotifications(Context context) {
    }

    public static void clearTags(Context context, String str) {
    }

    public static void createNotificationChannel(Context context, String str, String str2, boolean z, boolean z2, boolean z3, Uri uri) {
    }

    private static void d(Context context, String str, int i2, long j2, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void delAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static void delAccounts(Context context, Set<Integer> set, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void delAccountsByKeys(Context context, Set<Integer> set, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void delAllAccount(Context context) {
    }

    public static void delAttributes(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void delTag(Context context, String str) {
    }

    public static void delTags(Context context, String str, Set<String> set) {
    }

    public static void deleteKeyValueTag(Context context, String str, String str2) {
    }

    @Deprecated
    public static void deleteTag(Context context, String str) {
    }

    @Deprecated
    public static void deleteTags(Context context, String str, Set<String> set) {
    }

    public static void enableService(Context context, boolean z) {
    }

    public static Context getContext() {
    }

    public static String getCustomContentFromIntent(Context context, Intent intent) {
    }

    public static XGPushNotificationBuilder getDefaultNotificationBuilder(Context context) {
    }

    public static XGPushNotifactionCallback getNotifactionCallback() {
    }

    public static XGPushNotificationBuilder getNotificationBuilder(Context context, int i2) {
    }

    public static String getServiceTag(Context context) {
    }

    public static XGSysPushNotifactionCallback getSysNotifactionCallback() {
    }

    public static void initCommonComponents(Context context) {
    }

    public static boolean isNotificationOpened(Context context) {
    }

    public static String loadOtherPushToken(Context context, boolean z, long j2) {
    }

    public static void logger(int i2, String str, String str2, Throwable th) {
    }

    public static void msgAck(Context context, PushMessageManager pushMessageManager) {
    }

    public static XGPushClickedResult onActivityStarted(Activity activity) {
    }

    public static void onActivityStoped(Activity activity) {
    }

    public static void onEvent(Context context, String str, Properties properties) {
    }

    public static void onMessageCleared(Context context, XGPushTextMessage xGPushTextMessage) {
    }

    public static void onMessageClicked(Context context, XGPushTextMessage xGPushTextMessage) {
    }

    public static void openNotification(Context context) {
    }

    public static void openNotificationSettings(Context context) {
    }

    public static void queryTags(Context context, String str, int i2, int i3, XGIOperateCallback xGIOperateCallback) {
    }

    public static void registerPush(Context context) {
    }

    public static void reportTpnsInfoToBugly(Context context) {
    }

    public static void sendCommReport2Service(Context context, String str, String str2) {
    }

    public static void setContext(Context context) {
    }

    public static void setDefaultNotificationBuilder(Context context, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    public static void setKeyValueTag(Context context, String str, String str2) {
    }

    public static void setNotifactionCallback(XGPushNotifactionCallback xGPushNotifactionCallback) {
    }

    public static void setPushNotificationBuilder(Context context, int i2, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    public static void setSysNotifactionCallback(XGSysPushNotifactionCallback xGSysPushNotifactionCallback) {
    }

    @Deprecated
    public static void setTag(Context context, String str) {
    }

    @Deprecated
    public static void setTags(Context context, String str, Set<String> set) {
    }

    public static void startPushService(Context context) {
    }

    public static void stopPushService(Context context) {
    }

    public static void unregisterPush(Context context) {
    }

    public static void uploadLogFile(Context context, HttpRequestCallback httpRequestCallback) {
    }

    @Deprecated
    public static void upsertAccounts(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static void upsertAttributes(Context context, String str, Map<String, String> map, XGIOperateCallback xGIOperateCallback) {
    }

    public static void upsertPhoneNumber(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static /* synthetic */ TTask a() {
    }

    @Deprecated
    public static void addTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void appendAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
    }

    public static /* synthetic */ void b(Context context, Intent intent) {
    }

    @Deprecated
    public static void bindAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void cleanTags(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void delAllAccount(Context context, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void deleteTag(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void deleteTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
    }

    public static void registerPush(Context context, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void setTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
    }

    public static /* synthetic */ TTask a(TTask tTask) {
    }

    @Deprecated
    public static void appendAccount(Context context, String str, int i2) {
    }

    public static /* synthetic */ void b(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void bindAccount(Context context, String str, int i2) {
    }

    public static void clearAccounts(Context context, XGIOperateCallback xGIOperateCallback) {
    }

    public static void unregisterPush(Context context, String str, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    public static /* synthetic */ void a(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void appendAccount(Context context, String str) {
    }

    public static /* synthetic */ void b(Context context, String str, int i2, long j2, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void bindAccount(Context context, String str) {
    }

    public static void clearTags(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static void registerPush(Context context, long j2, XGIOperateCallback xGIOperateCallback) {
    }

    public static /* synthetic */ void a(Context context, String str, int i2, int i3, String str2, XGIOperateCallback xGIOperateCallback) {
    }

    private static void b(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void delTag(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void setTag(Context context, String str, XGIOperateCallback xGIOperateCallback) {
    }

    public static /* synthetic */ void a(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback) {
    }

    public static void registerPush(Context context, long j2, AccountInfo accountInfo, XGIOperateCallback xGIOperateCallback) {
    }

    public static void unregisterPush(Context context, XGIOperateCallback xGIOperateCallback) {
    }

    public static void a(Context context, XGIOperateCallback xGIOperateCallback, long j2, String str, String str2, String str3, String str4) {
    }

    public static void appendTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
    }

    private static void b(Context context, String str, int i2, int i3, String str2, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
    }

    public static void clearAndAppendTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void delAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
    }

    public static void delTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void upsertAccounts(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
    }

    public static void queryTags(Context context, String str, int i2, int i3, String str2, XGIOperateCallback xGIOperateCallback) {
    }

    public static void registerPush(Context context, String str, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, String str, int i2) {
    }

    @Deprecated
    public static void delAccount(Context context, String str) {
    }

    @Deprecated
    public static void upsertAccounts(Context context, String str, int i2) {
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, String str) {
    }

    @Deprecated
    public static void upsertAccounts(Context context, String str) {
    }

    public static String a(Set<String> set, String str) {
    }

    private static void c(Context context, String str, int i2, long j2, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    public static void upsertAccounts(Context context, List<AccountInfo> list, XGIOperateCallback xGIOperateCallback) {
    }

    private static void d(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3) {
    }

    private static void c(Context context, Intent intent) {
    }

    private static void d(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
    }

    private static void b(Context context, String str, long j2, String str2, int i2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    public static void c(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3) {
    }

    private static synchronized void c(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
    }

    public static void b(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3) {
    }

    private static Intent b(Context context, Intent intent, XGIOperateCallback xGIOperateCallback, AccountInfo accountInfo) {
    }

    private static String a(Map<String, String> map) {
    }

    private static boolean c() {
    }

    private static String a(Set<String> set) {
    }

    private static boolean a(String str, String str2) {
    }

    public static void a(Context context, String str, int i2, long j2, String str2, String str3) {
    }

    public static void a(Context context, String str, int i2, long j2, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    public static void a(Context context, String str, long j2, String str2, int i2, String str3, XGIOperateCallback xGIOperateCallback) {
    }

    public static XGPushClickedResult a(Activity activity) {
    }

    private static String b(Set<Integer> set) {
    }

    public static long a(Context context, XGLocalMessage xGLocalMessage, long j2) {
    }

    public static void a(Context context, Intent intent) {
    }

    private static void a(Context context, Intent intent, String str) {
    }

    public static void a(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3) {
    }

    public static void a(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3, long j4) {
    }

    private static String a(Context context, long j2) {
    }

    public static void a(Context context, Intent intent, XGIOperateCallback xGIOperateCallback, boolean z) {
    }

    private static String a(String str) {
    }

    private static String a(List<AccountInfo> list) {
    }

    private static String a(String str, int i2) {
    }
}
