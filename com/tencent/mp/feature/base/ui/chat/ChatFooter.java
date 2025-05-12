package com.tencent.mp.feature.base.ui.chat;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mp.feature.base.ui.chat.ChattingAppPanel;
import com.tencent.mp.feature.base.ui.widget.MMEditText;
import com.tencent.mp.framework.ui.widget.widget.KeyboardLinearLayout;
import k.i.h.b.d.b1.f.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ChatFooter extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public String K;
    public boolean L;
    public k.i.h.b.d.b1.f.g M;
    public int N;
    public View O;
    public final m P;
    public Animation Q;
    public Animation R;
    public boolean S;
    public KeyboardLinearLayout.a T;
    public final Handler U;
    public d.a V;
    public n a;
    public InputMethodManager b;
    public View c;
    public LinearLayout d;
    public k.i.h.b.d.b1.f.d e;
    public ChatFooterBottom f;
    public MMEditText g;
    public TextView h;

    /* renamed from: i, reason: collision with root package name */
    public Button f1311i;

    /* renamed from: j, reason: collision with root package name */
    public ImageButton f1312j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f1313k;

    /* renamed from: l, reason: collision with root package name */
    public k.i.h.b.d.b1.f.b f1314l;

    /* renamed from: m, reason: collision with root package name */
    public k.i.h.b.d.b1.p.l f1315m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1316n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1317o;

    /* renamed from: p, reason: collision with root package name */
    public MMEditText.c f1318p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1319q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1320r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1321s;

    /* renamed from: t, reason: collision with root package name */
    public ChattingAppPanel f1322t;
    public ImageButton u;
    public FrameLayout v;
    public Context w;
    public Activity x;
    public boolean y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Runnable {
        public final /* synthetic */ ChatFooter a;

        public a(ChatFooter chatFooter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ ChatFooter a;

        public b(ChatFooter chatFooter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c implements d.a {
        public final /* synthetic */ ChatFooter a;

        public c(ChatFooter chatFooter) {
        }

        @Override // k.i.h.b.d.b1.f.d.a
        public void a(String str) {
        }

        @Override // k.i.h.b.d.b1.f.d.a
        public void b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class d implements Runnable {
        public final /* synthetic */ ChatFooter a;

        public d(ChatFooter chatFooter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class e implements Runnable {
        public final /* synthetic */ ChatFooter a;

        public e(ChatFooter chatFooter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ ChatFooter a;

        public f(ChatFooter chatFooter) {
        }

        @Override // android.view.View.OnClickListener
        public synchronized void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class g implements View.OnTouchListener {
        public g(ChatFooter chatFooter) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class h implements View.OnTouchListener {
        public final /* synthetic */ ChatFooter a;

        public h(ChatFooter chatFooter) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class i implements MMEditText.a {
        public final /* synthetic */ ChatFooter a;

        public i(ChatFooter chatFooter) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.MMEditText.a
        public void a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class j implements KeyboardLinearLayout.a {
        public final /* synthetic */ ChatFooter a;

        public j(ChatFooter chatFooter) {
        }

        @Override // com.tencent.mp.framework.ui.widget.widget.KeyboardLinearLayout.a
        public void a(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class k extends Handler {
        public final /* synthetic */ ChatFooter a;

        public k(ChatFooter chatFooter) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class l implements View.OnClickListener {
        public final /* synthetic */ ChatFooter a;

        public l(ChatFooter chatFooter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class m {
        public String a;
        public int b;

        public m() {
        }

        public /* synthetic */ m(d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class n implements TextWatcher {
        public TextWatcher a;
        public final /* synthetic */ ChatFooter b;

        public n(ChatFooter chatFooter, TextWatcher textWatcher) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public ChatFooter(Context context, AttributeSet attributeSet) {
    }

    private /* synthetic */ void O(int i2, int i3) {
    }

    public static /* synthetic */ Activity a(ChatFooter chatFooter) {
    }

    public static /* synthetic */ Button b(ChatFooter chatFooter) {
    }

    public static /* synthetic */ ChatFooterBottom c(ChatFooter chatFooter) {
    }

    public static /* synthetic */ int d(ChatFooter chatFooter, int i2) {
    }

    public static /* synthetic */ LinearLayout e(ChatFooter chatFooter) {
    }

    public static /* synthetic */ k.i.h.b.d.b1.p.l f(ChatFooter chatFooter) {
    }

    public static /* synthetic */ k.i.h.b.d.b1.p.l g(ChatFooter chatFooter, k.i.h.b.d.b1.p.l lVar) {
    }

    private int getChatLayout() {
    }

    public static /* synthetic */ k.i.h.b.d.b1.f.b h(ChatFooter chatFooter) {
    }

    public static /* synthetic */ void i(ChatFooter chatFooter, int i2, int i3, boolean z) {
    }

    public static /* synthetic */ boolean j(ChatFooter chatFooter) {
    }

    public static /* synthetic */ KeyboardLinearLayout.a k(ChatFooter chatFooter) {
    }

    public static /* synthetic */ void l(ChatFooter chatFooter) {
    }

    public static /* synthetic */ void m(ChatFooter chatFooter, boolean z) {
    }

    public static /* synthetic */ k.i.h.b.d.b1.f.d n(ChatFooter chatFooter) {
    }

    public void A() {
    }

    public void B(int i2) {
    }

    public void C() {
    }

    public boolean D() {
    }

    public final void E(Context context) {
    }

    public final void F() {
    }

    public final void G() {
    }

    public final void H() {
    }

    public final void I() {
    }

    public final void J(MMEditText mMEditText) {
    }

    public void K() {
    }

    public final void L() {
    }

    public boolean M() {
    }

    public boolean N() {
    }

    public /* synthetic */ void P(int i2, int i3) {
    }

    public boolean Q() {
    }

    public void R() {
    }

    public void S(Context context, Activity activity) {
    }

    public final void T(boolean z) {
    }

    public void U(boolean z) {
    }

    public void V(int i2) {
    }

    public void W() {
    }

    public final void X(int i2) {
    }

    public void Y() {
    }

    public final void Z(int i2) {
    }

    public final void a0(int i2) {
    }

    public void b0(boolean z, int i2, int i3) {
    }

    public void c0(String str, int i2, boolean z) {
    }

    public void d0(String str, boolean z) {
    }

    public void e0(int i2, boolean z) {
    }

    public final void f0() {
    }

    public void g0() {
    }

    public MMEditText getEditText() {
    }

    public int getInsertPos() {
    }

    public int getKeyBordHeightPX() {
    }

    public String getLastContent() {
    }

    public int getMode() {
    }

    public View getPanel() {
    }

    public void h0() {
    }

    public void i0() {
    }

    public void j0() {
    }

    public void k0() {
    }

    public final void l0(boolean z) {
    }

    public void m0(MMEditText mMEditText) {
    }

    public void o(View view) {
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void p(boolean z) {
    }

    public final void q(int i2, int i3, boolean z) {
    }

    public final void r(int i2) {
    }

    public final void s() {
    }

    public void setAppPanelListener(ChattingAppPanel.a aVar) {
    }

    public void setBottomPanelVisibility(int i2) {
    }

    public void setCattingRootLayoutId(int i2) {
    }

    public void setChatFooterBgColor(int i2) {
    }

    public void setChatFooterEventListener(k.i.h.b.d.b1.f.b bVar) {
    }

    public void setEditText(MMEditText mMEditText) {
    }

    public void setEnableAppPanel(boolean z) {
    }

    public void setEnableSendBtn(boolean z) {
    }

    public void setEnableSmiley(boolean z) {
    }

    public void setEnableWordCount(boolean z) {
    }

    public void setHint(String str) {
    }

    public void setInsertPos(int i2) {
    }

    public void setLastContent(String str) {
    }

    public void setLastText(String str) {
    }

    public void setMode(int i2) {
    }

    public void setSmileyPanelCallback(k.i.h.b.d.b1.f.g gVar) {
    }

    public void setToSendTextColor(boolean z) {
    }

    public void setUserName(String str) {
    }

    public void setWordCount(int i2) {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }

    public final void y(boolean z) {
    }

    public final void z() {
    }

    public ChatFooter(Context context, AttributeSet attributeSet, int i2) {
    }
}
