package k.d.a.c.n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a<V extends View> extends c<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    public OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    /* JADX WARN: Field signature parse error: b
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    /* renamed from: k.d.a.c.n.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class RunnableC0250a implements Runnable {
        public final CoordinatorLayout a;
        public final View b;
        public final /* synthetic */ a c;

        public RunnableC0250a(a aVar, CoordinatorLayout coordinatorLayout, V v) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public a() {
    }

    private void ensureVelocityTracker() {
    }

    public abstract boolean canDragView(V v);

    public final boolean fling(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f) {
    }

    public abstract int getMaxDragOffset(V v);

    public abstract int getScrollRangeForDragFling(V v);

    public abstract int getTopBottomOffsetForScrollingSibling();

    public abstract void onFlingFinished(CoordinatorLayout coordinatorLayout, V v);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    public final int scroll(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i2) {
    }

    public abstract int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    public a(Context context, AttributeSet attributeSet) {
    }
}
