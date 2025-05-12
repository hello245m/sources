package j.n.a;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import j.n.b.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a {

    /* renamed from: j.n.a.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface InterfaceC0159a<D> {
        void a(c<D> cVar, D d);

        c<D> b(int i2, Bundle bundle);

        void c(c<D> cVar);
    }

    public static <T extends LifecycleOwner & ViewModelStoreOwner> a c(T t2) {
    }

    public abstract void a(int i2);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> c<D> d(int i2, Bundle bundle, InterfaceC0159a<D> interfaceC0159a);

    public abstract void e();
}
