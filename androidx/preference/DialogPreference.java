package androidx.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class DialogPreference extends Preference {
    private Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence mNegativeButtonText;
    private CharSequence mPositiveButtonText;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        Preference findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public Drawable getDialogIcon() {
    }

    public int getDialogLayoutResource() {
    }

    public CharSequence getDialogMessage() {
    }

    public CharSequence getDialogTitle() {
    }

    public CharSequence getNegativeButtonText() {
    }

    public CharSequence getPositiveButtonText() {
    }

    @Override // androidx.preference.Preference
    public void onClick() {
    }

    public void setDialogIcon(Drawable drawable) {
    }

    public void setDialogLayoutResource(int i2) {
    }

    public void setDialogMessage(CharSequence charSequence) {
    }

    public void setDialogTitle(CharSequence charSequence) {
    }

    public void setNegativeButtonText(CharSequence charSequence) {
    }

    public void setPositiveButtonText(CharSequence charSequence) {
    }

    public void setDialogIcon(int i2) {
    }

    public void setDialogMessage(int i2) {
    }

    public void setDialogTitle(int i2) {
    }

    public void setNegativeButtonText(int i2) {
    }

    public void setPositiveButtonText(int i2) {
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
    }

    public DialogPreference(Context context) {
    }
}
