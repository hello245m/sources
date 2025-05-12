package k.j.a.e;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.widget.MediaController;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class d extends TextureView implements TextureView.SurfaceTextureListener, MediaController.MediaPlayerControl {
    public MediaPlayer a;
    public SurfaceTexture b;
    public Surface c;
    public String d;
    public float e;
    public float f;
    public MediaController g;
    public final float[] h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f8362i;

    /* renamed from: j, reason: collision with root package name */
    public Matrix f8363j;

    /* renamed from: k, reason: collision with root package name */
    public List<MediaPlayer.OnPreparedListener> f8364k;

    /* renamed from: l, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f8365l;

    /* renamed from: m, reason: collision with root package name */
    public MediaPlayer.OnVideoSizeChangedListener f8366m;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ d a;

        public a(d dVar) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b implements MediaPlayer.OnErrorListener {
        public b(d dVar) {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class c implements MediaPlayer.OnBufferingUpdateListener {
        public c(d dVar) {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        }
    }

    /* renamed from: k.j.a.e.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class C0757d implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ d a;

        public C0757d(d dVar) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class e implements MediaPlayer.OnVideoSizeChangedListener {
        public final /* synthetic */ d a;

        public e(d dVar) {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    public d(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ void a(d dVar, MediaPlayer mediaPlayer) {
    }

    public static /* synthetic */ MediaPlayer.OnCompletionListener b(d dVar) {
    }

    public static /* synthetic */ MediaPlayer.OnVideoSizeChangedListener c(d dVar) {
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

    public void d(MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    public final void e(Context context) {
    }

    public final void f() {
    }

    public final boolean g() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
    }

    public String getPlayUrl() {
    }

    public final boolean h() {
    }

    public final void i(MediaPlayer mediaPlayer) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
    }

    public void j(Uri uri) {
    }

    public final void k() {
    }

    public final void l(Surface surface) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
    }

    public void setMediaController(MediaController mediaController) {
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
    }
}
