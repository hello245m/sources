package com.tencent.rfix.loader.verify;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RemoteVerifyTask {
    private static final String[] IGNORE_VERIFY_LIST = null;
    private static final int PLATFORM_ID_ANDROID = 1;
    private static final int REQUEST_TIMEOUT = 3000;
    private static final String REQUEST_URL = "https://content.rconfig.qq.com/trpc.rconfig.task_svr.GetConfigService/NativeLoadPatch";
    private static final String REQUEST_URL_TEST = "https://t.rconfig.qq.com/trpc.rconfig.task_svr.GetConfigService/NativeLoadPatch";
    private static final int RET_CODE_HTTP_FAIL = -2;
    private static final int RET_CODE_HTTP_TIMEOUT = -1;
    private static final int RET_CODE_JSON_FAIL = -3;
    private static final int RET_CODE_UNKNOWN = -9;
    private static final String TAG = "RFix.RemoteVerifyTask";
    private static final int WAIT_LOCK_TIMEOUT = 3500;
    private static long sRequestSeq;
    private static final Object sWaitLock = null;
    private final Context context;
    private volatile boolean verifyResult;

    /* renamed from: com.tencent.rfix.loader.verify.RemoteVerifyTask$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ RemoteVerifyTask a;

        public AnonymousClass1(RemoteVerifyTask remoteVerifyTask) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public RemoteVerifyTask(Context context) {
    }

    public static /* synthetic */ Object access$000() {
    }

    public static /* synthetic */ boolean access$102(RemoteVerifyTask remoteVerifyTask, boolean z) {
    }

    public static /* synthetic */ boolean access$200(RemoteVerifyTask remoteVerifyTask) {
    }

    private JSONObject buildRequest(RemoteVerifyInfo remoteVerifyInfo) {
    }

    private JSONObject buildResponse(int i2, String str) {
    }

    private boolean doRemoteVerify() {
    }

    private JSONObject doRequest(JSONObject jSONObject) {
    }

    private String getRequestURL() {
    }

    private boolean inIgnoreVerifyList() {
    }

    public boolean remoteVerify() {
    }
}
