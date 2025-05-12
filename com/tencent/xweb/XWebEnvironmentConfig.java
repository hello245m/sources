package com.tencent.xweb;

import com.tencent.xweb.LibraryLoader;
import com.tencent.xweb.util.IXWebLogClient;
import com.tencent.xweb.util.WebViewExtensionListener;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebEnvironmentConfig {
    public IXWebLogClient a;
    public WebViewReporterInterface b;
    public ISharedPreferenceProvider c;
    public LibraryLoader.ILibraryLoader d;
    public WebViewExtensionListener e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class XWebEnvironmentConfigBuilder {
        public IXWebLogClient a;
        public WebViewReporterInterface b;
        public ISharedPreferenceProvider c;
        public LibraryLoader.ILibraryLoader d;
        public WebViewExtensionListener e;

        public XWebEnvironmentConfig createXWebEnvironmentConfig() {
        }

        public XWebEnvironmentConfigBuilder setLibraryLoader(LibraryLoader.ILibraryLoader iLibraryLoader) {
        }

        public XWebEnvironmentConfigBuilder setLogInterface(IXWebLogClient iXWebLogClient) {
        }

        public XWebEnvironmentConfigBuilder setReporterInterface(WebViewReporterInterface webViewReporterInterface) {
        }

        public XWebEnvironmentConfigBuilder setSharedPreferenceProvider(ISharedPreferenceProvider iSharedPreferenceProvider) {
        }

        public XWebEnvironmentConfigBuilder setWebViewExtensionListener(WebViewExtensionListener webViewExtensionListener) {
        }
    }

    public XWebEnvironmentConfig(IXWebLogClient iXWebLogClient, WebViewReporterInterface webViewReporterInterface, ISharedPreferenceProvider iSharedPreferenceProvider, LibraryLoader.ILibraryLoader iLibraryLoader, WebViewExtensionListener webViewExtensionListener) {
    }

    public LibraryLoader.ILibraryLoader getLibraryLoader() {
    }

    public IXWebLogClient getLogInterface() {
    }

    public WebViewReporterInterface getReporterInterface() {
    }

    public ISharedPreferenceProvider getSharedPreferenceProvider() {
    }

    public WebViewExtensionListener getWebViewExtensionListener() {
    }
}
