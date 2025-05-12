package k.d.a.c.x;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface d {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = null;
        public final e a;

        public e a(float f, e eVar, e eVar2) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ e evaluate(float f, e eVar, e eVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends Property<d, e> {
        public static final Property<d, e> a = null;

        public c(String str) {
        }

        public e a(d dVar) {
        }

        public void b(d dVar, e eVar) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ e get(d dVar) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(d dVar, e eVar) {
        }
    }

    /* renamed from: k.d.a.c.x.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0266d extends Property<d, Integer> {
        public static final Property<d, Integer> a = null;

        public C0266d(String str) {
        }

        public Integer a(d dVar) {
        }

        public void b(d dVar, Integer num) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Integer get(d dVar) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(d dVar, Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e {
        public float a;
        public float b;
        public float c;

        public /* synthetic */ e(a aVar) {
        }

        public void a(float f, float f2, float f3) {
        }

        public e() {
        }

        public e(float f, float f2, float f3) {
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
