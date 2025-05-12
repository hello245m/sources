package com.tencent.mobileqq.qfix.redirect.field;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class GCMonitor {
    public final ReferenceQueue<Object> a;
    public final Set<GCReference> b;
    public volatile boolean c;
    private final GCMonitorListener d;

    /* renamed from: com.tencent.mobileqq.qfix.redirect.field.GCMonitor$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ GCMonitor a;

        public AnonymousClass1(GCMonitor gCMonitor) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface GCMonitorListener {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class GCReference extends WeakReference<Object> {
        public GCReference(Object obj) {
        }

        public GCReference(Object obj, ReferenceQueue<? super Object> referenceQueue) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public GCMonitor(GCMonitorListener gCMonitorListener) {
    }

    public static /* synthetic */ void a(GCMonitor gCMonitor) {
    }
}
