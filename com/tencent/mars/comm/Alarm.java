package com.tencent.mars.comm;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Alarm extends BroadcastReceiver {
    private static final String KEXTRA_ID = "ID";
    private static final String KEXTRA_PID = "PID";
    private static final String TAG = "MicroMsg.Alarm";
    private static TreeSet<Object[]> alarm_waiting_set;
    private static Alarm bc_alarm;
    private static WakerLock wakerlock;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ComparatorAlarm implements Comparator<Object[]> {
        private ComparatorAlarm() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object[] objArr, Object[] objArr2) {
        }

        public /* synthetic */ ComparatorAlarm(AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Object[] objArr, Object[] objArr2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class TSetData {
        private static final /* synthetic */ TSetData[] $VALUES = null;
        public static final TSetData ID = null;
        public static final TSetData PENDINGINTENT = null;
        public static final TSetData WAITTIME = null;

        private TSetData(String str, int i2) {
        }

        public static TSetData valueOf(String str) {
        }

        public static TSetData[] values() {
        }
    }

    private static boolean cancelAlarmMgr(long j2, Context context, PendingIntent pendingIntent) {
    }

    private native void onAlarm(long j2);

    public static void resetAlarm(Context context) {
    }

    private static PendingIntent setAlarmMgr(int i2, long j2, long j3, Context context) {
    }

    public static boolean start(int i2, long j2, int i3, Context context) {
    }

    public static boolean stop(long j2, Context context) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
