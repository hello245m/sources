package com.tencent.tpns.baseapi.core.net;

import android.content.Context;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a {
    private static a a;
    private Context b;

    /* renamed from: com.tencent.tpns.baseapi.core.net.a$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements HostnameVerifier {
        public final /* synthetic */ String a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, String str) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    private a(Context context) {
    }

    public static a a(Context context) {
    }

    public String a(String str, String str2, String str3, HttpRequestCallback httpRequestCallback, boolean z) {
    }

    public static String a(String str) {
    }
}
