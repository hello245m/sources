package com.tencent.rmonitor.qqbattery;

import android.os.Handler;
import android.os.Message;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.qqbattery.monitor.HookMethodCallback;
import java.io.File;
import java.util.List;
import java.util.Map;
import k.i.k.e.h.f;
import k.i.k.t.b;
import k.i.k.t.e;
import k.i.k.t.j.c;
import k.i.k.t.j.d;
import k.i.k.t.j.f;
import k.i.k.t.j.g;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class QQBatteryMonitor extends QAPMMonitorPlugin implements Handler.Callback {
    public static boolean debug;

    /* renamed from: o, reason: collision with root package name */
    public static final long f1945o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static volatile QQBatteryMonitor f1946p;
    public Handler a;
    public b b;
    public List<e> c;
    public d d;
    public k.i.k.t.j.a e;
    public c f;
    public f g;
    public g h;

    /* renamed from: i, reason: collision with root package name */
    public k.i.k.t.h.b f1947i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1948j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1949k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1950l;

    /* renamed from: m, reason: collision with root package name */
    public int f1951m;

    /* renamed from: n, reason: collision with root package name */
    public final Map<String, k.i.k.t.i.c> f1952n;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements f.b {
        public int a;
        public final /* synthetic */ k.i.k.t.d b;
        public final /* synthetic */ int c;
        public final /* synthetic */ QQBatteryMonitor d;

        public a(QQBatteryMonitor qQBatteryMonitor, k.i.k.t.d dVar, int i2) {
        }

        @Override // k.i.k.e.h.f.b
        public void readLine(String str) {
        }
    }

    public static /* synthetic */ boolean e(QQBatteryMonitor qQBatteryMonitor, k.i.k.t.d dVar, String str, int i2) {
    }

    public static QQBatteryMonitor getInstance() {
    }

    public final void f(k.i.k.t.d dVar, String str, String[] strArr) throws Exception {
    }

    public final void g(long j2, long j3) {
    }

    public HookMethodCallback getGpsHook() {
    }

    public HookMethodCallback getWakeLockHook() {
    }

    public HookMethodCallback getWifiHook() {
    }

    public final void h(long j2, long j3) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    public final void i(boolean z, String str, JSONObject jSONObject) {
    }

    public final long j() {
    }

    public final long k() {
    }

    public final void l() {
    }

    public final void m() {
    }

    public final void n() {
    }

    public final void o() {
    }

    public void onCmdRequest(String str) {
    }

    public void onGpsScan(String str, Object[] objArr) {
    }

    public void onWriteLog(String str, String str2) {
    }

    public final k.i.k.t.d p(List<File> list) {
    }

    public final boolean q(k.i.k.t.d dVar, String str, int i2) {
    }

    public final void r() {
    }

    public final void s() {
    }

    public void setCmdWhite(List<String> list, int i2) {
    }

    public void setLogWhite(List<String> list, int i2) {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
    }

    public boolean t() {
    }

    public void u() {
    }

    public void v() {
    }

    public final void w(long j2, long j3) {
    }

    public final void x() {
    }
}
