package k.d.a.a.y4.c0;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k.d.a.a.y4.c0.g;
import k.d.a.a.y4.c0.m;
import k.d.a.a.y4.x;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class l extends GLSurfaceView {
    public final CopyOnWriteArrayList<b> a;
    public final SensorManager b;
    public final Sensor c;
    public final g d;
    public final Handler e;
    public final m f;
    public final k g;
    public SurfaceTexture h;

    /* renamed from: i, reason: collision with root package name */
    public Surface f5207i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5208j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5209k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5210l;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class a implements GLSurfaceView.Renderer, m.a, g.a {
        public final k a;
        public final float[] b;
        public final float[] c;
        public final float[] d;
        public final float[] e;
        public final float[] f;
        public float g;
        public float h;

        /* renamed from: i, reason: collision with root package name */
        public final float[] f5211i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f5212j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ l f5213k;

        public a(l lVar, k kVar) {
        }

        @Override // k.d.a.a.y4.c0.g.a
        public synchronized void a(float[] fArr, float f) {
        }

        @Override // k.d.a.a.y4.c0.m.a
        public synchronized void b(PointF pointF) {
        }

        public final float c(float f) {
        }

        public final void d() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
        }

        @Override // k.d.a.a.y4.c0.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void A(Surface surface);

        void D(Surface surface);
    }

    public l(Context context) {
    }

    public static /* synthetic */ void a(l lVar, SurfaceTexture surfaceTexture) {
    }

    private /* synthetic */ void c() {
    }

    private /* synthetic */ void e(SurfaceTexture surfaceTexture) {
    }

    public static void h(SurfaceTexture surfaceTexture, Surface surface) {
    }

    public void b(b bVar) {
    }

    public /* synthetic */ void d() {
    }

    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
    }

    public final void g(SurfaceTexture surfaceTexture) {
    }

    public d getCameraMotionListener() {
    }

    public x getVideoFrameMetadataListener() {
    }

    public Surface getVideoSurface() {
    }

    public void i(b bVar) {
    }

    public final void j() {
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
    }

    public void setDefaultStereoMode(int i2) {
    }

    public void setUseSensorRotation(boolean z) {
    }

    public l(Context context, AttributeSet attributeSet) {
    }
}
