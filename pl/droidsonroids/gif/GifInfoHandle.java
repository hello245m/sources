package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.system.ErrnoException;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class GifInfoHandle {
    public volatile long a;

    public GifInfoHandle() {
    }

    private static native void bindSurface(long j2, Surface surface, long[] jArr);

    public static native int createTempNativeFileDescriptor() throws GifIOException;

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z) throws GifIOException;

    private static native void free(long j2);

    private static native long getAllocationByteCount(long j2);

    private static native String getComment(long j2);

    private static native int getCurrentFrameIndex(long j2);

    private static native int getCurrentLoop(long j2);

    private static native int getCurrentPosition(long j2);

    private static native int getDuration(long j2);

    private static native int getFrameDuration(long j2, int i2);

    private static native int getHeight(long j2);

    private static native int getLoopCount(long j2);

    private static native long getMetadataByteCount(long j2);

    private static native int getNativeErrorCode(long j2);

    private static native int getNumberOfFrames(long j2);

    private static native long[] getSavedState(long j2);

    private static native long getSourceLength(long j2);

    private static native int getWidth(long j2);

    private static native void glTexImage2D(long j2, int i2, int i3);

    private static native void glTexSubImage2D(long j2, int i2, int i3);

    private static native void initTexImageDescriptor(long j2);

    private static native boolean isAnimationCompleted(long j2);

    private static native boolean isOpaque(long j2);

    public static int j(FileDescriptor fileDescriptor, boolean z) throws GifIOException, ErrnoException {
    }

    public static long o(FileDescriptor fileDescriptor, long j2, boolean z) throws GifIOException {
    }

    public static native long openByteArray(byte[] bArr) throws GifIOException;

    public static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    public static native long openFile(String str) throws GifIOException;

    public static native long openNativeFileDescriptor(int i2, long j2) throws GifIOException;

    public static native long openStream(InputStream inputStream) throws GifIOException;

    public static GifInfoHandle p(ContentResolver contentResolver, Uri uri) throws IOException {
    }

    private static native void postUnbindSurface(long j2);

    private static native long renderFrame(long j2, Bitmap bitmap);

    private static native boolean reset(long j2);

    private static native long restoreRemainder(long j2);

    private static native int restoreSavedState(long j2, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j2);

    private static native void seekToFrame(long j2, int i2, Bitmap bitmap);

    private static native void seekToFrameGL(long j2, int i2);

    private static native void seekToTime(long j2, int i2, Bitmap bitmap);

    private static native void setLoopCount(long j2, char c);

    private static native void setOptions(long j2, char c, boolean z);

    private static native void setSpeedFactor(long j2, float f);

    private static native void startDecoderThread(long j2);

    private static native void stopDecoderThread(long j2);

    public synchronized long a() {
    }

    public synchronized int b() {
    }

    public synchronized int c() {
    }

    public synchronized int d() {
    }

    public synchronized int e() {
    }

    public synchronized int f() {
    }

    public void finalize() throws Throwable {
    }

    public synchronized int g() {
    }

    public synchronized long h() {
    }

    public synchronized int i() {
    }

    public synchronized int k() {
    }

    public synchronized int l() {
    }

    public synchronized boolean m() {
    }

    public synchronized boolean n() {
    }

    public synchronized void q() {
    }

    public synchronized long r(Bitmap bitmap) {
    }

    public synchronized boolean s() {
    }

    public synchronized long t() {
    }

    public synchronized void u() {
    }

    public synchronized void v(int i2, Bitmap bitmap) {
    }

    public synchronized void w(int i2, Bitmap bitmap) {
    }

    public void x(char c, boolean z) {
    }

    public GifInfoHandle(ByteBuffer byteBuffer) throws GifIOException {
    }

    public GifInfoHandle(String str) throws GifIOException {
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
    }
}
