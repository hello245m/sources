package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.Map;

@TargetApi(24)
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class w {
    private static w a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a {
        public List<b> a;
        public List<b> b;
        public final /* synthetic */ w c;

        private a(w wVar) {
        }

        public /* synthetic */ a(w wVar, x xVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b {
        public int a;
        public Notification b;
        public final /* synthetic */ w c;

        public b(w wVar, int i2, Notification notification) {
        }

        public String toString() {
        }
    }

    private w() {
    }

    private int a(String str, String str2) {
    }

    public static w a() {
    }

    private String a(Notification notification) {
    }

    private List<StatusBarNotification> a(z zVar) {
    }

    private void a(Context context, int i2, Notification notification, boolean z) {
    }

    private void a(Context context, String str, String str2) {
    }

    private void a(Context context, String str, String str2, Notification notification) {
    }

    private void a(Map<String, a> map, StatusBarNotification statusBarNotification) {
    }

    private boolean a(Context context) {
    }

    private String b(Notification notification) {
    }

    private void b(Context context, int i2, Notification notification) {
    }

    private boolean b() {
    }

    private boolean b(Context context) {
    }

    private boolean c(Notification notification) {
    }

    private boolean d(Notification notification) {
    }

    public String a(Context context, Notification.Builder builder, String str) {
    }

    public void a(Context context, int i2, Notification notification) {
    }
}
