package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class SystemManager {
    public static SystemManager a;
    public static final Object b = null;
    public static SystemNotifier c;

    public static /* synthetic */ Object a() {
    }

    public static SystemManager getInstance() {
    }

    public static SystemNotifier getSystemNotifier() {
    }

    public void notifyNoticeResult(int i2) {
    }

    public void notifyResolutionResult(Intent intent, String str) {
    }

    public void notifyUpdateResult(int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements SystemNotifier {
        public final List<SystemObserver> a;

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i2) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i2) {
        }
    }
}
