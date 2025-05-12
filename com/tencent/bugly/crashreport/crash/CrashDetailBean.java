package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = null;
    public byte[] A;
    public Map<String, String> B;
    public String C;
    public String D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public long U;
    public boolean V;
    public Map<String, String> W;
    public Map<String, String> X;
    public int Y;
    public int Z;
    public long a;
    public Map<String, String> aa;
    public Map<String, String> ab;
    public byte[] ac;
    public String ad;
    public String ae;
    public int b;
    public String c;
    public String d;
    public Boolean e;
    public boolean f;
    public String g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public String f944i;

    /* renamed from: j, reason: collision with root package name */
    public Map<String, PlugInBean> f945j;

    /* renamed from: k, reason: collision with root package name */
    public Map<String, PlugInBean> f946k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f947l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f948m;

    /* renamed from: n, reason: collision with root package name */
    public int f949n;

    /* renamed from: o, reason: collision with root package name */
    public String f950o;

    /* renamed from: p, reason: collision with root package name */
    public String f951p;

    /* renamed from: q, reason: collision with root package name */
    public String f952q;

    /* renamed from: r, reason: collision with root package name */
    public String f953r;

    /* renamed from: s, reason: collision with root package name */
    public String f954s;

    /* renamed from: t, reason: collision with root package name */
    public long f955t;
    public String u;
    public int v;
    public String w;
    public String x;
    public String y;
    public String z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Parcelable.Creator<CrashDetailBean> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CrashDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CrashDetailBean[] newArray(int i2) {
        }
    }

    public CrashDetailBean() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CrashDetailBean(Parcel parcel) {
    }
}
