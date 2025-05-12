package com.tencent.tinker.loader;

import android.annotation.SuppressLint;
import com.tencent.tinker.anno.Keep;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

@SuppressLint({"NewApi"})
@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class TinkerClassLoader extends PathClassLoader {
    private final ClassLoader mOriginAppClassLoader;

    @Keep
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class CompoundEnumeration<E> implements Enumeration<E> {
        private Enumeration<E>[] enums;
        private int index;
        public final /* synthetic */ TinkerClassLoader this$0;

        public CompoundEnumeration(TinkerClassLoader tinkerClassLoader, Enumeration<E>[] enumerationArr) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        public E nextElement() {
        }
    }

    public TinkerClassLoader(String str, File file, String str2, ClassLoader classLoader) {
    }

    private static void injectDexPath(ClassLoader classLoader, String str, File file) {
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
    }
}
