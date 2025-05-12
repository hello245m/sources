package com.huawei.hms.push.ups;

import android.content.Context;
import com.huawei.hms.push.ups.entity.UPSRegisterCallBack;
import com.huawei.hms.push.ups.entity.UPSTurnCallBack;
import com.huawei.hms.push.ups.entity.UPSUnRegisterCallBack;
import k.e.b.a.c;
import k.e.b.a.f;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class UPSService {

    /* renamed from: com.huawei.hms.push.ups.UPSService$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements c<Void> {
        public final /* synthetic */ UPSTurnCallBack a;

        public AnonymousClass1(UPSTurnCallBack uPSTurnCallBack) {
        }

        @Override // k.e.b.a.c
        public void onComplete(f<Void> fVar) {
        }
    }

    /* renamed from: com.huawei.hms.push.ups.UPSService$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements c<Void> {
        public final /* synthetic */ UPSTurnCallBack a;

        public AnonymousClass2(UPSTurnCallBack uPSTurnCallBack) {
        }

        @Override // k.e.b.a.c
        public void onComplete(f<Void> fVar) {
        }
    }

    private UPSService() {
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
    }
}
