package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Pair;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class av {
    public static int a;
    private static final Map<Integer, Pair<String, String>> h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final ArrayList<g> f1002i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Integer, Integer> f1003j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<Integer, String> f1004k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Map<Integer, String> f1005l = null;
    public final Context b;
    public final aj c;
    public final x d;
    public final ad e;
    public ba f;
    public BuglyStrategy.a g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends HashMap<Integer, Pair<String, String>> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends ArrayList<g> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends HashMap<Integer, Integer> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends HashMap<Integer, String> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends HashMap<Integer, String> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements ai {
        public final /* synthetic */ long a;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;

        public f(av avVar, long j2, List list, boolean z) {
        }

        @Override // com.tencent.bugly.proguard.ai
        public final void a(int i2) {
        }

        @Override // com.tencent.bugly.proguard.ai
        public final void a(int i2, bu buVar, long j2, long j3, boolean z, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class g {
        public final int a;

        public /* synthetic */ g(int i2, byte b) {
        }

        public abstract boolean a();

        public final boolean b(CrashDetailBean crashDetailBean) {
        }

        public g(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends g {
        public /* synthetic */ h(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public h() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class i extends g {
        public /* synthetic */ i(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public i() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class j extends g {
        public /* synthetic */ j(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public j() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class k extends g {
        public /* synthetic */ k(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public k() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class l extends g {
        public /* synthetic */ l(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public l() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m extends g {
        public /* synthetic */ m(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n extends g {
        public /* synthetic */ n(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public n() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class o extends g {
        public /* synthetic */ o(byte b) {
        }

        @Override // com.tencent.bugly.proguard.av.g
        public final boolean a() {
        }

        public o() {
        }
    }

    public av(int i2, Context context, aj ajVar, x xVar, ad adVar, BuglyStrategy.a aVar, ba baVar) {
    }

    private static CrashDetailBean a(List<au> list, CrashDetailBean crashDetailBean) {
    }

    private static void b(CrashDetailBean crashDetailBean, List<au> list) {
    }

    private static List<au> c(List<au> list) {
    }

    private static void d(CrashDetailBean crashDetailBean) {
    }

    private void e(CrashDetailBean crashDetailBean) {
    }

    private static ContentValues f(CrashDetailBean crashDetailBean) {
    }

    private boolean g(CrashDetailBean crashDetailBean) {
    }

    private static String h(CrashDetailBean crashDetailBean) {
    }

    private static boolean i(CrashDetailBean crashDetailBean) {
    }

    private static boolean b(String str) {
    }

    private static void c(CrashDetailBean crashDetailBean) {
    }

    private static void d(List<au> list) {
    }

    private static void f(List<CrashDetailBean> list) {
    }

    private static void c() {
    }

    public final void b(CrashDetailBean crashDetailBean, boolean z) {
    }

    private static void a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
    }

    private byte[] d(CrashDetailBean crashDetailBean, boolean z) {
    }

    public final void b(CrashDetailBean crashDetailBean) {
    }

    private Map<String, String> c(CrashDetailBean crashDetailBean, boolean z) {
    }

    private static void e(List<au> list) {
    }

    private static au b(Cursor cursor) {
    }

    public final boolean a(CrashDetailBean crashDetailBean, boolean z) {
    }

    public final boolean a(CrashDetailBean crashDetailBean, int i2, boolean z) {
    }

    private static void c(ArrayList<bq> arrayList, String str) {
    }

    private void e(CrashDetailBean crashDetailBean, boolean z) {
    }

    public static List<au> b() {
    }

    private static boolean a(String str) {
    }

    public final byte[] b(List<CrashDetailBean> list) {
    }

    private static boolean a(CrashDetailBean crashDetailBean, List<au> list, List<au> list2) {
    }

    public static List<CrashDetailBean> a() {
    }

    private static void b(ArrayList<bq> arrayList, String str) {
    }

    private static void b(ArrayList<bq> arrayList, CrashDetailBean crashDetailBean, Context context) {
    }

    private static void b(ArrayList<bq> arrayList, byte[] bArr) {
    }

    private boolean b(CrashDetailBean crashDetailBean, List<au> list, List<au> list2) {
    }

    public final void a(CrashDetailBean crashDetailBean) {
    }

    public final void a(List<CrashDetailBean> list, long j2, boolean z, boolean z2, boolean z3) {
    }

    public static void a(boolean z, List<CrashDetailBean> list) {
    }

    private static CrashDetailBean a(Cursor cursor) {
    }

    public static List<CrashDetailBean> a(List<au> list) {
    }

    private static br a(Context context, CrashDetailBean crashDetailBean, ab abVar) {
    }

    private static bs a(Context context, List<CrashDetailBean> list, ab abVar) {
    }

    private static bq a(String str, Context context, String str2) {
    }

    public static void a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
    }

    private static void a(CrashDetailBean crashDetailBean, byte[] bArr) {
    }

    private static void a(CrashDetailBean crashDetailBean, Map<String, String> map) {
    }

    private static void a(ArrayList<bq> arrayList, CrashDetailBean crashDetailBean) {
    }

    private static void a(ArrayList<bq> arrayList, String str) {
    }

    private static void a(ArrayList<bq> arrayList, String str, Context context) {
    }

    private static void a(ArrayList<bq> arrayList, byte[] bArr) {
    }

    private static void a(ArrayList<bq> arrayList, CrashDetailBean crashDetailBean, Context context) {
    }

    private static void a(ArrayList<bq> arrayList, List<String> list) {
    }

    private static Map<String, String> a(CrashDetailBean crashDetailBean, ab abVar) {
    }

    private static void a(Map<String, String> map, CrashDetailBean crashDetailBean) {
    }

    public static /* synthetic */ void a(List list, boolean z, long j2, String str, String str2) {
    }
}
