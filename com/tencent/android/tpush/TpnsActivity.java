package com.tencent.android.tpush;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.security.interfaces.RSAPublicKey;
import java.util.List;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.ACTIVITYCHECK, EType.INTENTCHECK, EType.INTENTSCHEMECHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TpnsActivity extends Activity {
    public static final String CHECK_CODE = "checkCode";
    public static final String CUSTOM_CONTENT = "customContent";
    public static final String JUMP_type = "jumpType";
    public static final String MSG_TYPE = "msgType";
    public static final String TARGE_ACTIVITY = "targetActivity";
    public static final String TIMESTAMP = "timestamp";
    public static Application.ActivityLifecycleCallbacks a = null;
    public static List<String> b = null;
    public static String c = "";
    public static long d;
    public static long e;
    private String f;
    private int g;
    private RSAPublicKey h;

    /* renamed from: com.tencent.android.tpush.TpnsActivity$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ XGPushClickedResult b;
        public final /* synthetic */ TpnsActivity c;

        public AnonymousClass1(TpnsActivity tpnsActivity, Bundle bundle, XGPushClickedResult xGPushClickedResult) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.TpnsActivity$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ TpnsActivity e;

        public AnonymousClass2(TpnsActivity tpnsActivity, Context context, int i2, String str, String str2) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.TpnsActivity$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends TTask {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ TpnsActivity b;

        public AnonymousClass3(TpnsActivity tpnsActivity, Uri uri) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    public static /* synthetic */ void a(TpnsActivity tpnsActivity, Uri uri) {
    }

    public static void addActivityNames(String str) {
    }

    private void b(Intent intent) {
    }

    private void c(Intent intent) {
    }

    private void d(Intent intent) {
    }

    public static long getMsgIdWithIntent(Intent intent) {
    }

    public static boolean isMonitorActivityNames(String str) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onResume() {
    }

    @Override // android.app.Activity
    public void onStart() {
    }

    @Override // android.app.Activity
    public void onStop() {
    }

    public static /* synthetic */ void a(TpnsActivity tpnsActivity, Bundle bundle, XGPushClickedResult xGPushClickedResult) {
    }

    private boolean a(Intent intent) {
    }

    private void a(Bundle bundle, XGPushClickedResult xGPushClickedResult) {
    }

    private void c(String str, String str2) {
    }

    private void b(String str) {
    }

    private void b(String str, String str2) {
    }

    private void a(Uri uri) {
    }

    private void a(String str, String str2) {
    }

    private void a(String str) {
    }

    private static String a(Context context) {
    }

    private boolean a(Context context, String str, String str2, String str3, String str4, String str5) {
    }

    private void a(Context context, String str, int i2, String str2) {
    }
}
