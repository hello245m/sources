package k.d.a.a.k4;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import k.d.a.a.j4.t1;
import k.d.a.a.p3;
import k.d.a.a.y2;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface x {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends Exception {
        public final int a;
        public final boolean b;

        public b(int i2, int i3, int i4, int i5, y2 y2Var, boolean z, Exception exc) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(boolean z);

        void b(Exception exc);

        void c(long j2);

        void d();

        void e(int i2, long j2, long j3);

        void f();

        void g();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d extends Exception {
        public d(long j2, long j3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e extends Exception {
        public final int a;
        public final boolean b;
        public final y2 c;

        public e(int i2, y2 y2Var, boolean z) {
        }
    }

    void A(a0 a0Var);

    void a();

    boolean b(y2 y2Var);

    boolean e();

    p3 f();

    void flush();

    void g();

    void h(p3 p3Var);

    void i(AudioDeviceInfo audioDeviceInfo);

    void j() throws e;

    boolean k();

    void l(int i2);

    long m(boolean z);

    void n();

    void o(q qVar);

    void p(long j2);

    void pause();

    void q();

    void r(float f);

    void s();

    void t(t1 t1Var);

    boolean u(ByteBuffer byteBuffer, long j2, int i2) throws b, e;

    void v(c cVar);

    int w(y2 y2Var);

    void x(y2 y2Var, int i2, int[] iArr) throws a;

    void y();

    void z(boolean z);

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends Exception {
        public final y2 a;

        public a(Throwable th, y2 y2Var) {
        }

        public a(String str, y2 y2Var) {
        }
    }
}
