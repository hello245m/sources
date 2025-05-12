package com.tencent.mars.comm;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class NetworkSignalUtil {
    public static final String TAG = "MicroMsg.NetworkSignalUtil";
    private static Context context = null;
    private static long strength = 10000;

    /* renamed from: com.tencent.mars.comm.NetworkSignalUtil$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends PhoneStateListener {
        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        }
    }

    public static void InitNetworkSignalUtil(Context context2) {
    }

    public static /* synthetic */ void access$000(SignalStrength signalStrength) {
    }

    private static void calSignalStrength(SignalStrength signalStrength) {
    }

    public static long getGSMSignalStrength() {
    }

    public static long getNetworkSignalStrength(boolean z) {
    }

    public static long getWifiSignalStrength() {
    }
}
