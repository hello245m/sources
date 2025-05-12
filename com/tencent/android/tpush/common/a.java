package com.tencent.android.tpush.common;

import android.content.Context;
import com.tencent.android.tpush.XGIOperateCallback;
import com.tencent.tpns.baseapi.core.net.HttpRequestCallback;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class a {

    /* renamed from: com.tencent.android.tpush.common.a$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements HttpRequestCallback {
        public final /* synthetic */ XGIOperateCallback a;

        public AnonymousClass1(XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.tpns.baseapi.core.net.HttpRequestCallback
        public void onFailure(int i2, String str) {
        }

        @Override // com.tencent.tpns.baseapi.core.net.HttpRequestCallback
        public void onSuccess(String str) {
        }
    }

    public static String a(String str) {
    }

    public static void a(Context context, String str, long j2, int i2, XGIOperateCallback xGIOperateCallback) {
    }

    private static JSONObject a(Context context, String str, long j2, int i2) {
    }
}
