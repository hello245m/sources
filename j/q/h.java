package j.q;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import j.q.j;
import j.r.e.j;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class h extends RecyclerView.h<l> implements Preference.c, PreferenceGroup.b {
    public PreferenceGroup d;
    public List<Preference> e;
    public List<Preference> f;
    public List<c> g;
    public c h;

    /* renamed from: i, reason: collision with root package name */
    public Handler f3421i;

    /* renamed from: j, reason: collision with root package name */
    public j.q.a f3422j;

    /* renamed from: k, reason: collision with root package name */
    public Runnable f3423k;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ h a;

        public a(h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends j.b {
        public final /* synthetic */ List a;
        public final /* synthetic */ List b;
        public final /* synthetic */ j.d c;

        public b(h hVar, List list, List list2, j.d dVar) {
        }

        @Override // j.r.e.j.b
        public boolean a(int i2, int i3) {
        }

        @Override // j.r.e.j.b
        public boolean b(int i2, int i3) {
        }

        @Override // j.r.e.j.b
        public int d() {
        }

        @Override // j.r.e.j.b
        public int e() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public int a;
        public int b;
        public String c;

        public c() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public c(c cVar) {
        }
    }

    public h(PreferenceGroup preferenceGroup) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ void H(l lVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ l J(ViewGroup viewGroup, int i2) {
    }

    public final void T(Preference preference) {
    }

    public final c U(Preference preference, c cVar) {
    }

    public final void V(List<Preference> list, PreferenceGroup preferenceGroup) {
    }

    public Preference W(int i2) {
    }

    public void X(l lVar, int i2) {
    }

    public l Y(ViewGroup viewGroup, int i2) {
    }

    public void Z() {
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference) {
    }

    @Override // androidx.preference.Preference.c
    public void f(Preference preference) {
    }

    @Override // androidx.preference.PreferenceGroup.b
    public int g(Preference preference) {
    }

    @Override // androidx.preference.Preference.c
    public void i(Preference preference) {
    }

    @Override // androidx.preference.PreferenceGroup.b
    public int j(String str) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int q() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long r(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int s(int i2) {
    }

    public h(PreferenceGroup preferenceGroup, Handler handler) {
    }
}
