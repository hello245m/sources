package j.n.a;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import j.d.h;
import j.n.a.a;
import j.n.b.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b extends j.n.a.a {
    public static boolean c = false;
    public final LifecycleOwner a;
    public final c b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a<D> extends MutableLiveData<D> implements c.InterfaceC0162c<D> {
        public final int a;
        public final Bundle b;
        public final j.n.b.c<D> c;
        public LifecycleOwner d;
        public C0160b<D> e;
        public j.n.b.c<D> f;

        public a(int i2, Bundle bundle, j.n.b.c<D> cVar, j.n.b.c<D> cVar2) {
        }

        @Override // j.n.b.c.InterfaceC0162c
        public void a(j.n.b.c<D> cVar, D d) {
        }

        public j.n.b.c<D> b(boolean z) {
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        }

        public j.n.b.c<D> d() {
        }

        public void e() {
        }

        public j.n.b.c<D> f(LifecycleOwner lifecycleOwner, a.InterfaceC0159a<D> interfaceC0159a) {
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(Observer<? super D> observer) {
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
        }

        public String toString() {
        }
    }

    /* renamed from: j.n.a.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0160b<D> implements Observer<D> {
        public final j.n.b.c<D> a;
        public final a.InterfaceC0159a<D> b;
        public boolean c;

        public C0160b(j.n.b.c<D> cVar, a.InterfaceC0159a<D> interfaceC0159a) {
        }

        public void a(String str, PrintWriter printWriter) {
        }

        public boolean b() {
        }

        public void c() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(D d) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends ViewModel {
        public static final ViewModelProvider.Factory c = null;
        public h<a> a;
        public boolean b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> cls) {
            }
        }

        public static c c(ViewModelStore viewModelStore) {
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        }

        public void b() {
        }

        public <D> a<D> d(int i2) {
        }

        public boolean e() {
        }

        public void f() {
        }

        public void g(int i2, a aVar) {
        }

        public void h(int i2) {
        }

        public void i() {
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
        }
    }

    public b(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
    }

    @Override // j.n.a.a
    public void a(int i2) {
    }

    @Override // j.n.a.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // j.n.a.a
    public <D> j.n.b.c<D> d(int i2, Bundle bundle, a.InterfaceC0159a<D> interfaceC0159a) {
    }

    @Override // j.n.a.a
    public void e() {
    }

    public final <D> j.n.b.c<D> f(int i2, Bundle bundle, a.InterfaceC0159a<D> interfaceC0159a, j.n.b.c<D> cVar) {
    }

    public String toString() {
    }
}
