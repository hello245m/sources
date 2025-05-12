package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TimePickerView extends ConstraintLayout {
    public e A;
    public final Chip u;
    public final Chip v;
    public final MaterialButtonToggleGroup w;
    public final View.OnClickListener x;
    public f y;
    public g z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ TimePickerView a;

        public a(TimePickerView timePickerView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements MaterialButtonToggleGroup.e {
        public final /* synthetic */ TimePickerView a;

        public b(TimePickerView timePickerView) {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ TimePickerView a;

        public c(TimePickerView timePickerView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector a;

        public d(TimePickerView timePickerView, GestureDetector gestureDetector) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        void a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g {
        void a(int i2);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ g B(TimePickerView timePickerView) {
    }

    public static /* synthetic */ f C(TimePickerView timePickerView) {
    }

    public static /* synthetic */ e D(TimePickerView timePickerView) {
    }

    public final void E() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void F() {
    }

    public final void G() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i2) {
    }
}
