package com.tencent.tpns.baseapi.base.logger;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class DeviceInfo {
    private BuildInfo a;
    private ScreenInfo b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class BuildInfo {
        public final /* synthetic */ DeviceInfo a;
        private String b;
        private String c;
        private int d;
        private String e;
        private String f;

        public BuildInfo(DeviceInfo deviceInfo) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class ScreenInfo {
        public final /* synthetic */ DeviceInfo a;
        private int b;
        private int c;

        public ScreenInfo(DeviceInfo deviceInfo, Context context) {
        }

        private int a(Context context) {
        }

        private int b(Context context) {
        }

        public String toString() {
        }
    }

    public DeviceInfo(Context context) {
    }

    public String toString() {
    }
}
