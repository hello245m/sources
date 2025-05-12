package com.tencent.xweb.debug;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.xweb.WebView;
import com.tencent.xweb.debug.IDebugView;
import j.b.k.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebDebugView implements IDebugView {
    public static final String TAG = "XWebDebugView";
    public TextView mAbstractView;
    public Button mBtnSavePage;
    public final Context mContext;
    public View mDebugRootView;
    public IDebugView.Callback mDebugViewCallback;
    public TabLayout mTabLayout;
    public TextView mVersionView;
    public final ViewGroup mViewContainer;
    public ViewPager mViewPager;
    public final WebView mWebView;

    /* renamed from: com.tencent.xweb.debug.XWebDebugView$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements DialogInterface.OnClickListener {
        public final /* synthetic */ XWebDebugView this$0;

        public AnonymousClass1(XWebDebugView xWebDebugView) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebDebugView$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements DialogInterface.OnClickListener {
        public final /* synthetic */ XWebDebugView this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass2(XWebDebugView xWebDebugView, Context context) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebDebugView$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements ValueCallback<String> {
        public final /* synthetic */ XWebDebugView this$0;

        public AnonymousClass3(XWebDebugView xWebDebugView) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebDebugView$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ XWebDebugView this$0;

        /* renamed from: com.tencent.xweb.debug.XWebDebugView$4$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements DialogInterface.OnClickListener {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        /* renamed from: com.tencent.xweb.debug.XWebDebugView$4$2, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass2 implements DialogInterface.OnClickListener {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass2(AnonymousClass4 anonymousClass4) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        public AnonymousClass4(XWebDebugView xWebDebugView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebDebugView$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ XWebDebugView this$0;

        public AnonymousClass5(XWebDebugView xWebDebugView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebDebugView$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass6 implements View.OnLongClickListener {
        public final /* synthetic */ XWebDebugView this$0;

        public AnonymousClass6(XWebDebugView xWebDebugView) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebDebugView$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass7 implements View.OnLongClickListener {
        public final /* synthetic */ XWebDebugView this$0;
        public final /* synthetic */ String val$abstractInfo;

        public AnonymousClass7(XWebDebugView xWebDebugView, String str) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    public XWebDebugView(Context context, ViewGroup viewGroup) {
    }

    public static /* synthetic */ WebView access$000(XWebDebugView xWebDebugView) {
    }

    public static /* synthetic */ View access$100(XWebDebugView xWebDebugView) {
    }

    public static /* synthetic */ IDebugView.Callback access$200(XWebDebugView xWebDebugView) {
    }

    private void initView() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public void addCallback(IDebugView.Callback callback) {
    }

    public d getAppCompatActivity() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public Context getContext() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public WebView getWebView() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public boolean handleCommandResult(Context context, CommandResult commandResult) {
    }

    public boolean isAppCompatActivity() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public boolean onInterceptTestUrl(String str) {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public void refreshAbstractView() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public void refreshDebugView() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public void refreshFpsView() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public void refreshSavePageView() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public void refreshVersionView() {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public void removeCallback(IDebugView.Callback callback) {
    }

    @Override // com.tencent.xweb.debug.IDebugView
    public boolean shouldInterceptUrl(String str) {
    }

    public XWebDebugView(WebView webView) {
    }
}
