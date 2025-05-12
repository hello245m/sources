package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import k.e.b.a.a;
import k.e.b.a.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {
    private final String a;
    private final String b;
    private Parcelable c;
    private String d;
    private a e;
    private int f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
    }

    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, g<ResultT> gVar);

    public int getApiLevel() {
    }

    @Deprecated
    public int getMinApkVersion() {
    }

    public Parcelable getParcelable() {
    }

    public String getRequestJson() {
    }

    public a getToken() {
    }

    public String getTransactionId() {
    }

    public String getUri() {
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, g<ResultT> gVar) {
    }

    public void setApiLevel(int i2) {
    }

    public void setParcelable(Parcelable parcelable) {
    }

    public void setToken(a aVar) {
    }

    public void setTransactionId(String str) {
    }

    public TaskApiCall(String str, String str2, String str3) {
    }

    public TaskApiCall(String str, String str2, String str3, int i2) {
    }
}
