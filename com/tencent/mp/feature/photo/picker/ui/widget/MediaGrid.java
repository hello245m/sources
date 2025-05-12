package com.tencent.mp.feature.photo.picker.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mp.feature.base.ui.widget.CheckView;
import k.a.a.p.p.q;
import k.a.a.t.g;
import k.a.a.t.l.j;
import k.i.h.b.z.o.d.d;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MediaGrid extends SquareFrameLayout implements View.OnClickListener {
    public final ImageView a;
    public final View b;
    public final CheckView c;
    public final LinearLayout d;
    public final TextView e;
    public final View f;
    public a g;
    public d h;

    /* renamed from: i, reason: collision with root package name */
    public b f1707i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface a {
        void k(CheckView checkView, d dVar, RecyclerView.e0 e0Var);

        void l(ImageView imageView, d dVar, RecyclerView.e0 e0Var);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b {
        public final boolean a;
        public final int b;
        public final int c;
        public final RecyclerView.e0 d;

        public b(boolean z, int i2, int i3, RecyclerView.e0 e0Var) {
        }

        public final boolean a() {
        }

        public final int b() {
        }

        public final int c() {
        }

        public final RecyclerView.e0 d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c implements g<Bitmap> {
        public boolean a(Bitmap bitmap, Object obj, j<Bitmap> jVar, k.a.a.p.a aVar, boolean z) {
        }

        @Override // k.a.a.t.g
        public boolean e(q qVar, Object obj, j<Bitmap> jVar, boolean z) {
        }

        @Override // k.a.a.t.g
        public /* bridge */ /* synthetic */ boolean h(Bitmap bitmap, Object obj, j<Bitmap> jVar, k.a.a.p.a aVar, boolean z) {
        }
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
    }

    public MediaGrid(Context context, AttributeSet attributeSet, int i2) {
    }

    private final void setGifTag(boolean z) {
    }

    private final void setImage(d dVar) {
    }

    private final void setVideoDuration(d dVar) {
    }

    public final void a(d dVar) {
    }

    public final void b() {
    }

    public final a getMListener() {
    }

    public final d getMMediaItem() {
    }

    public final b getMPreBindInfo() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public final void setCheckEnabled(boolean z) {
    }

    public final void setCheckViewVisibility(boolean z) {
    }

    public final void setChecked(boolean z) {
    }

    public final void setCheckedNum(int i2) {
    }

    public final void setMListener(a aVar) {
    }

    public final void setMMediaItem(d dVar) {
    }

    public final void setMPreBindInfo(b bVar) {
    }

    public final void setMaskType(int i2) {
    }

    public /* synthetic */ MediaGrid(Context context, AttributeSet attributeSet, int i2, int i3, h hVar) {
    }
}
