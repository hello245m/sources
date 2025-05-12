package k.i.h.b.o.i;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import q.ec;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class x {
    public LifecycleOwner a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Observer<k.i.h.b.d.w0.c.i<ec>> {
        public final /* synthetic */ int a;
        public final /* synthetic */ k.i.h.b.o.m.i0.f b;
        public final /* synthetic */ k.i.h.b.o.m.i0.g c;
        public final /* synthetic */ Bundle d;
        public final /* synthetic */ MutableLiveData e;
        public final /* synthetic */ x f;

        public a(x xVar, int i2, k.i.h.b.o.m.i0.f fVar, k.i.h.b.o.m.i0.g gVar, Bundle bundle, MutableLiveData mutableLiveData) {
        }

        public void a(k.i.h.b.d.w0.c.i<ec> iVar) {
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(k.i.h.b.d.w0.c.i<ec> iVar) {
        }
    }

    public x(LifecycleOwner lifecycleOwner) {
    }

    public abstract void a(int i2, int i3, String str, ec ecVar, k.i.h.b.o.m.i0.f fVar, k.i.h.b.o.m.i0.g gVar, Bundle bundle);

    public final void b(int i2, k.i.h.b.o.m.i0.f fVar, k.i.h.b.o.m.i0.g gVar, Bundle bundle) {
    }

    public abstract boolean c(int i2, k.i.h.b.o.m.i0.f fVar, k.i.h.b.o.m.i0.g gVar, Bundle bundle, MutableLiveData<k.i.h.b.d.w0.c.i<ec>> mutableLiveData);
}
