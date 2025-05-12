package t.a.a;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.MediaController;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class c extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    public final ScheduledThreadPoolExecutor a;
    public volatile boolean b;
    public long c;
    public final Rect d;
    public final Paint e;
    public final Bitmap f;
    public final GifInfoHandle g;
    public final ConcurrentLinkedQueue<t.a.a.a> h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f8414i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuffColorFilter f8415j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f8416k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8417l;

    /* renamed from: m, reason: collision with root package name */
    public final j f8418m;

    /* renamed from: n, reason: collision with root package name */
    public final l f8419n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f8420o;

    /* renamed from: p, reason: collision with root package name */
    public ScheduledFuture<?> f8421p;

    /* renamed from: q, reason: collision with root package name */
    public int f8422q;

    /* renamed from: r, reason: collision with root package name */
    public int f8423r;

    /* renamed from: s, reason: collision with root package name */
    public t.a.a.n.a f8424s;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a extends m {
        public final /* synthetic */ c b;

        public a(c cVar, c cVar2) {
        }

        @Override // t.a.a.m
        public void a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b extends m {
        public final /* synthetic */ int b;
        public final /* synthetic */ c c;

        public b(c cVar, c cVar2, int i2) {
        }

        @Override // t.a.a.m
        public void a() {
        }
    }

    public c(GifInfoHandle gifInfoHandle, c cVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
    }

    public final void a() {
    }

    public Bitmap b() {
    }

    public int c() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
    }

    public int d() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public int e() {
    }

    public int f() {
    }

    public boolean g() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    public final void j() {
    }

    public Bitmap k(int i2) {
    }

    public final void l() {
    }

    public void m(long j2) {
    }

    public final PorterDuffColorFilter n(ColorStateList colorStateList, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    public String toString() {
    }
}
