package com.tencent.android.tpush.message;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.widget.RemoteViews;
import com.jg.EType;
import com.jg.JgMethodChecked;
import com.tencent.android.tpush.XGPushNotificationBuilder;
import com.tencent.android.tpush.message.d;
import com.tencent.tpns.baseapi.base.util.TTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b {
    private static volatile BroadcastReceiver a;
    private static volatile BroadcastReceiver b;
    private static MediaPlayer c;

    /* renamed from: com.tencent.android.tpush.message.b$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends BroadcastReceiver {

        /* renamed from: com.tencent.android.tpush.message.b$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C00141 extends TTask {
            public final /* synthetic */ Intent a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ String c;
            public final /* synthetic */ AnonymousClass1 d;

            public C00141(AnonymousClass1 anonymousClass1, Intent intent, Context context, String str) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.message.b$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.android.tpush.message.b$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a = null;
    }

    public static /* synthetic */ MediaPlayer a() {
    }

    public static String b(Context context) {
    }

    private static void c(Context context, d dVar, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    public static /* synthetic */ MediaPlayer a(MediaPlayer mediaPlayer) {
    }

    private static String a(int i2) {
    }

    public static synchronized XGPushNotificationBuilder a(Context context) {
    }

    public static void a(Context context, int i2, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    private static XGPushNotificationBuilder b(Context context, d dVar, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    public static XGPushNotificationBuilder a(Context context, int i2) {
    }

    public static Intent a(Context context, d.a aVar, boolean z, PushMessageManager pushMessageManager, boolean z2) {
    }

    private static synchronized int b(Context context, int i2) {
    }

    @JgMethodChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
    public static void a(Context context, Context context2, PushMessageManager pushMessageManager) {
    }

    private static boolean a(Context context, PushMessageManager pushMessageManager, d dVar, XGPushNotificationBuilder xGPushNotificationBuilder, int i2, int i3) {
    }

    private static RemoteViews a(Context context, PushMessageManager pushMessageManager, d dVar, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    private static void a(Context context, d dVar, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    private static Notification a(Context context, String str, String str2, String str3, String str4, int i2, Integer num) {
    }

    private static Bitmap a(String str) {
    }

    public static void a(Context context, PushMessageManager pushMessageManager) {
    }
}
