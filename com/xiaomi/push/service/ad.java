package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.gw;
import java.util.HashSet;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class ad {
    private static volatile ad c;
    public SharedPreferences a;
    public SharedPreferences b;
    private HashSet<a> d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static abstract class a implements Runnable {
        private String mDescription;
        private int mId;

        public a(int i2, String str) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public abstract void onCallback();

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    private ad(Context context) {
    }

    public static ad a(Context context) {
    }

    private String a(int i2) {
    }

    private String a(gw gwVar) {
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
    }

    public int a(int i2, int i3) {
    }

    public int a(gw gwVar, int i2) {
    }

    public long a(int i2, long j2) {
    }

    public String a(int i2, String str) {
    }

    public synchronized void a() {
    }

    public synchronized void a(a aVar) {
    }

    public void a(List<Pair<Integer, Object>> list) {
    }

    public void a(List<Pair<gw, Integer>> list, List<Pair<Integer, Object>> list2) {
    }

    public boolean a(int i2, boolean z) {
    }

    public void b() {
    }
}
