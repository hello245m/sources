package j.x.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import j.g.l.c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class e {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements TypeEvaluator<c.b[]> {
        public c.b[] a;

        public c.b[] a(float f, c.b[] bVarArr, c.b[] bVarArr2) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ c.b[] evaluate(float f, c.b[] bVarArr, c.b[] bVarArr2) {
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
    }

    public static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2, float f) throws XmlPullParserException, IOException {
    }

    public static Keyframe c(Keyframe keyframe, float f) {
    }

    public static void d(Keyframe[] keyframeArr, float f, int i2, int i3) {
    }

    public static PropertyValuesHolder e(TypedArray typedArray, int i2, int i3, int i4, String str) {
    }

    public static int f(TypedArray typedArray, int i2, int i3) {
    }

    public static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
    }

    public static boolean h(int i2) {
    }

    public static Animator i(Context context, int i2) throws Resources.NotFoundException {
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i2) throws Resources.NotFoundException {
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i2, float f) throws Resources.NotFoundException {
    }

    public static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
    }

    public static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    public static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
    }

    public static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
    }

    public static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
    }

    public static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f, XmlPullParser xmlPullParser) {
    }

    public static void s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
    }
}
