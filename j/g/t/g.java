package j.g.t;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import j.g.t.r0.c;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class g {
    public static final View.AccessibilityDelegate c = null;
    public final View.AccessibilityDelegate a;
    public final View.AccessibilityDelegate b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends View.AccessibilityDelegate {
        public final g a;

        public a(g gVar) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
        }
    }

    public g() {
    }

    public static List<c.a> c(View view) {
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
    }

    public j.g.t.r0.d b(View view) {
    }

    public View.AccessibilityDelegate d() {
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void g(View view, j.g.t.r0.c cVar) {
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
    }

    public boolean j(View view, int i2, Bundle bundle) {
    }

    public final boolean k(int i2, View view) {
    }

    public void l(View view, int i2) {
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
    }

    public g(View.AccessibilityDelegate accessibilityDelegate) {
    }
}
