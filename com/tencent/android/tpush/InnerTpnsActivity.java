package com.tencent.android.tpush;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.List;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.ACTIVITYCHECK, EType.INTENTCHECK, EType.INTENTSCHEMECHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class InnerTpnsActivity extends Activity {
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

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ XGPushClickedResult b;
        public final /* synthetic */ InnerTpnsActivity c;

        public AnonymousClass1(InnerTpnsActivity innerTpnsActivity, Bundle bundle, XGPushClickedResult xGPushClickedResult) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$10, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass10 implements DialogInterface.OnClickListener {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ InnerTpnsActivity b;

        public AnonymousClass10(InnerTpnsActivity innerTpnsActivity, Intent intent) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements DialogInterface.OnClickListener {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ InnerTpnsActivity b;

        public AnonymousClass2(InnerTpnsActivity innerTpnsActivity, Intent intent) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends TTask {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ InnerTpnsActivity b;

        public AnonymousClass3(InnerTpnsActivity innerTpnsActivity, Uri uri) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass4 implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements DialogInterface.OnClickListener {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ InnerTpnsActivity b;

        public AnonymousClass5(InnerTpnsActivity innerTpnsActivity, Intent intent) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass6 implements DialogInterface.OnClickListener {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ InnerTpnsActivity b;

        public AnonymousClass6(InnerTpnsActivity innerTpnsActivity, Intent intent) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass7 implements DialogInterface.OnCancelListener {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ InnerTpnsActivity b;

        public AnonymousClass7(InnerTpnsActivity innerTpnsActivity, Intent intent) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass8 implements DialogInterface.OnClickListener {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ InnerTpnsActivity b;

        public AnonymousClass8(InnerTpnsActivity innerTpnsActivity, Intent intent) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.InnerTpnsActivity$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass9 implements DialogInterface.OnClickListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ InnerTpnsActivity c;

        public AnonymousClass9(InnerTpnsActivity innerTpnsActivity, String str, Intent intent) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public static /* synthetic */ void a(InnerTpnsActivity innerTpnsActivity, Intent intent) {
    }

    public static void addActivityNames(String str) {
    }

    public static /* synthetic */ void b(InnerTpnsActivity innerTpnsActivity, Intent intent) {
    }

    private void c(Intent intent) {
    }

    private void d(Intent intent) {
    }

    private void e(Intent intent) {
    }

    private void f(Intent intent) {
    }

    private void g(Intent intent) {
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

    public static /* synthetic */ void a(InnerTpnsActivity innerTpnsActivity, Uri uri) {
    }

    private void b(Intent intent) {
    }

    public static /* synthetic */ void a(InnerTpnsActivity innerTpnsActivity, Bundle bundle, XGPushClickedResult xGPushClickedResult) {
    }

    public static /* synthetic */ void a(InnerTpnsActivity innerTpnsActivity, String str, Intent intent) {
    }

    private boolean a(Intent intent) {
    }

    private void a(Bundle bundle, XGPushClickedResult xGPushClickedResult) {
    }

    private ResolveInfo d(String str) {
    }

    private void c(String str) {
    }

    private void b(String str) {
    }

    private void b(int i2, Intent intent) {
    }

    private void a(Uri uri) {
    }

    private void a(String str) {
    }

    private void a() {
    }

    private static String a(Context context) {
    }

    public static void a(Application application) {
    }

    private void a(int i2, Intent intent) {
    }

    private void a(String str, Intent intent) {
    }
}
