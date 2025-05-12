package com.tencent.rmonitor.io;

import com.tencent.rmonitor.base.meta.IOMeta;
import k.i.k.c.f.h.b;
import k.i.k.l.a.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class IoFakeJniBridge extends c {
    private static final String TAG = "RMonitor_io_IoFakeJniBridge";
    private static volatile IoFakeJniBridge instance;
    private static final k.i.k.k.a publishListener = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class JavaContext {
        private final String stack;
        private final String threadName;

        public /* synthetic */ JavaContext(a aVar) {
        }

        private JavaContext() {
        }
    }

    private IoFakeJniBridge() {
    }

    public static IoFakeJniBridge getInstance() {
    }

    private static JavaContext getJavaContext() {
    }

    public static void onIOInfoPublish(IOMeta[] iOMetaArr) {
    }

    public static void onIOStart(int i2, String str, long j2) {
    }

    public static void onIOStop(int i2, String str, long j2, IOMeta iOMeta) {
    }

    @Override // k.i.k.l.a.c
    public void registerHookers() {
    }

    public void setReporter(b bVar) {
    }
}
