package androidx.lifecycle;

import android.app.Application;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ViewModelProvider {
    private final Factory factory;
    private final ViewModelStore store;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static final Companion Companion = null;
        public static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        private static AndroidViewModelFactory sInstance;
        private final Application application;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
            }

            public final Factory defaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner viewModelStoreOwner) {
            }

            public final AndroidViewModelFactory getInstance(Application application) {
            }
        }

        public AndroidViewModelFactory(Application application) {
        }

        public static final /* synthetic */ AndroidViewModelFactory access$getSInstance$cp() {
        }

        public static final /* synthetic */ void access$setSInstance$cp(AndroidViewModelFactory androidViewModelFactory) {
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface Factory {
        <T extends ViewModel> T create(Class<T> cls);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class KeyedFactory extends OnRequeryFactory implements Factory {
        public <T extends ViewModel> T create(Class<T> cls) {
        }

        public abstract <T extends ViewModel> T create(String str, Class<T> cls);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = null;
        private static NewInstanceFactory sInstance;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            public final NewInstanceFactory getInstance() {
            }
        }

        public static final /* synthetic */ NewInstanceFactory access$getSInstance$cp() {
        }

        public static final /* synthetic */ void access$setSInstance$cp(NewInstanceFactory newInstanceFactory) {
        }

        public static final NewInstanceFactory getInstance() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
        }
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
    }

    public <T extends ViewModel> T get(Class<T> cls) {
    }

    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner) {
    }

    public <T extends ViewModel> T get(String str, Class<T> cls) {
    }

    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
    }
}
