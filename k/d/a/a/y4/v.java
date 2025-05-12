package k.d.a.a.y4;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class v extends GLSurfaceView implements w {
    public final a a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: k, reason: collision with root package name */
        public static final float[] f5216k = null;

        /* renamed from: l, reason: collision with root package name */
        public static final float[] f5217l = null;

        /* renamed from: m, reason: collision with root package name */
        public static final float[] f5218m = null;

        /* renamed from: n, reason: collision with root package name */
        public static final String[] f5219n = null;

        /* renamed from: o, reason: collision with root package name */
        public static final FloatBuffer f5220o = null;
        public final GLSurfaceView a;
        public final int[] b;
        public final int[] c;
        public final int[] d;
        public final int[] e;
        public final AtomicReference<k.d.a.a.l4.k> f;
        public final FloatBuffer[] g;
        public k.d.a.a.x4.r h;

        /* renamed from: i, reason: collision with root package name */
        public int f5221i;

        /* renamed from: j, reason: collision with root package name */
        public k.d.a.a.l4.k f5222j;

        public a(GLSurfaceView gLSurfaceView) {
        }

        public void a(k.d.a.a.l4.k kVar) {
        }

        @RequiresNonNull({"program"})
        public final void b() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }
    }

    public v(Context context) {
    }

    @Deprecated
    public w getVideoDecoderOutputBufferRenderer() {
    }

    public void setOutputBuffer(k.d.a.a.l4.k kVar) {
    }

    public v(Context context, AttributeSet attributeSet) {
    }
}
