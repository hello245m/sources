package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PushMessageHandler extends BaseService {
    private static List<MiPushClient.ICallbackResult> a;

    /* renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f14a;
    private static List<MiPushClient.MiPushClientCallback> b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface a extends Serializable {
    }

    public static void a() {
    }

    public static void a(long j2, String str, String str2) {
    }

    public static void a(Context context) {
    }

    public static void a(Context context, Intent intent) {
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
    }

    public static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
    }

    public static void a(Context context, a aVar) {
    }

    public static void a(Context context, String str, long j2, String str2, String str3) {
    }

    public static void a(Context context, String str, String str2, long j2, String str3, List<String> list) {
    }

    public static void a(MiPushClient.ICallbackResult iCallbackResult) {
    }

    public static void a(MiPushClient.MiPushClientCallback miPushClientCallback) {
    }

    public static boolean a(String str, String str2) {
    }

    public static void b() {
    }

    private static void b(Context context) {
    }

    public static void b(Context context, Intent intent) {
    }

    public static void b(Context context, String str, long j2, String str2, String str3) {
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m8b() {
    }

    private static void c(Context context, Intent intent) {
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo9a() {
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i2) {
    }
}
