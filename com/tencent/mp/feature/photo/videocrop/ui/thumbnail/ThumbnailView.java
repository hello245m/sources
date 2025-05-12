package com.tencent.mp.feature.photo.videocrop.ui.thumbnail;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.xweb.util.WXWebReporter;
import java.util.List;
import k.i.h.b.z.m.l;
import n.d0.c.p;
import n.d0.d.h;
import n.d0.d.o;
import n.i;
import o.a.f2;
import o.a.s3.u;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ThumbnailView extends FrameLayout {
    public final l a;
    public final List<k.i.h.b.z.p.b.b> b;
    public k.i.h.b.z.p.e.b c;
    public long d;
    public long e;
    public final LinearLayoutManager f;
    public final k.i.h.b.z.p.d.f.e g;
    public final k.i.h.b.z.p.d.f.f.a h;

    /* renamed from: i, reason: collision with root package name */
    public final ColorDrawable f1708i;

    /* renamed from: j, reason: collision with root package name */
    public final u<Integer> f1709j;

    /* renamed from: k, reason: collision with root package name */
    public final u<k.i.h.b.z.p.b.a> f1710k;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends RecyclerView.u {
        public final /* synthetic */ ThumbnailView a;

        public a(ThumbnailView thumbnailView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class b extends n.d0.d.l implements n.d0.c.l<k.i.h.b.z.p.b.b, Drawable> {
        public b(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ Drawable invoke(k.i.h.b.z.p.b.b bVar) {
        }

        public final Drawable m(k.i.h.b.z.p.b.b bVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.photo.videocrop.ui.thumbnail.ThumbnailView$loadVideo$1", f = "ThumbnailView.kt", l = {WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS, CdnLogic.kAppTypeNearEvent, 208}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.l implements p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public int c;
        public int d;
        public long e;
        public int f;
        public /* synthetic */ Object g;
        public final /* synthetic */ ThumbnailView h;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.photo.videocrop.ui.thumbnail.ThumbnailView$loadVideo$1$1", f = "ThumbnailView.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super n.u>, Object> {
            public int a;
            public final /* synthetic */ ThumbnailView b;
            public final /* synthetic */ i<Float, Float> c;
            public final /* synthetic */ float d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ float f;

            public a(ThumbnailView thumbnailView, i<Float, Float> iVar, float f, boolean z, float f2, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        @n.a0.k.a.f(c = "com.tencent.mp.feature.photo.videocrop.ui.thumbnail.ThumbnailView$loadVideo$1$3", f = "ThumbnailView.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.a0.k.a.l implements p<t0, n.a0.d<? super n.u>, Object> {
            public int a;
            public final /* synthetic */ ThumbnailView b;

            public b(ThumbnailView thumbnailView, n.a0.d<? super b> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public c(ThumbnailView thumbnailView, n.a0.d<? super c> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements n.d0.c.a<Float> {
        public final /* synthetic */ ThumbnailView a;
        public final /* synthetic */ n.d0.c.a<Long> b;

        public d(ThumbnailView thumbnailView, n.d0.c.a<Long> aVar) {
        }

        public final Float b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Float invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class e extends n.d0.d.a implements p<k.i.h.b.z.p.b.b, n.a0.d<? super n.u>, Object> {
        public e(Object obj) {
        }

        public static final /* synthetic */ Object b(e eVar) {
        }

        public final Object c(k.i.h.b.z.p.b.b bVar, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(k.i.h.b.z.p.b.b bVar, n.a0.d<? super n.u> dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class f extends n.d0.d.a implements p<Integer, n.a0.d<? super n.u>, Object> {
        public f(Object obj) {
        }

        public static final /* synthetic */ Object b(f fVar) {
        }

        public final Object c(int i2, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, n.a0.d<? super n.u> dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class g extends n.d0.d.a implements p<i<? extends Float, ? extends Float>, n.a0.d<? super n.u>, Object> {
        public g(Object obj) {
        }

        public static final /* synthetic */ Object b(g gVar) {
        }

        public final Object c(i<Float, Float> iVar, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(i<? extends Float, ? extends Float> iVar, n.a0.d<? super n.u> dVar) {
        }
    }

    public ThumbnailView(Context context, AttributeSet attributeSet) {
    }

    public ThumbnailView(Context context, AttributeSet attributeSet, int i2) {
    }

    public static final /* synthetic */ k.i.h.b.z.p.d.f.e a(ThumbnailView thumbnailView) {
    }

    public static final /* synthetic */ Drawable b(ThumbnailView thumbnailView, k.i.h.b.z.p.b.b bVar) {
    }

    public static final /* synthetic */ k.i.h.b.z.p.e.b c(ThumbnailView thumbnailView) {
    }

    public static final /* synthetic */ u d(ThumbnailView thumbnailView) {
    }

    public static final /* synthetic */ k.i.h.b.z.p.d.f.f.a e(ThumbnailView thumbnailView) {
    }

    public static final /* synthetic */ List f(ThumbnailView thumbnailView) {
    }

    public static final /* synthetic */ void g(ThumbnailView thumbnailView, int i2) {
    }

    public static final /* synthetic */ void h(ThumbnailView thumbnailView) {
    }

    public static final /* synthetic */ Object i(ThumbnailView thumbnailView, k.i.h.b.z.p.b.b bVar, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object j(ThumbnailView thumbnailView, i iVar, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object k(ThumbnailView thumbnailView, int i2, n.a0.d dVar) {
    }

    public static final /* synthetic */ float l(ThumbnailView thumbnailView, long j2) {
    }

    public static /* synthetic */ void o(ThumbnailView thumbnailView, t0 t0Var) {
    }

    public static final void w(ThumbnailView thumbnailView, t0 t0Var) {
    }

    public static final /* synthetic */ Object x(ThumbnailView thumbnailView, k.i.h.b.z.p.b.b bVar, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object y(ThumbnailView thumbnailView, i iVar, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object z(ThumbnailView thumbnailView, int i2, n.a0.d dVar) {
    }

    public final long A(float f2) {
    }

    public final float B(long j2) {
    }

    public final k.i.h.b.z.p.b.a getSelection() {
    }

    public final o.a.s3.e<k.i.h.b.z.p.b.a> getSelectionFlow() {
    }

    public final int getState() {
    }

    public final o.a.s3.e<Integer> getStateFlow() {
    }

    public final k.i.h.b.z.p.b.a m() {
    }

    public final Drawable n(k.i.h.b.z.p.b.b bVar) {
    }

    public final f2 p(t0 t0Var) {
    }

    public final void q(k.i.h.b.z.p.b.b bVar) {
    }

    public final void r(int i2) {
    }

    public final void s() {
    }

    public final void setPlaying(boolean z) {
    }

    public final void setPlayingDurationMsProvider(n.d0.c.a<Long> aVar) {
    }

    public final void t(i<Float, Float> iVar) {
    }

    public final void u(int i2) {
    }

    public final void v(t0 t0Var, k.i.h.b.z.p.e.b bVar, long j2, long j3) {
    }

    public /* synthetic */ ThumbnailView(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
