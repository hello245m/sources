package com.tencent.tinker.loader;

import android.app.Application;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SystemClassLoaderAdder {
    public static int sPatchDexCount;

    /* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Comparator<File> {
        public final /* synthetic */ Map val$matchesClassNPatternMemo;

        public AnonymousClass1(Map map) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(File file, File file2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class ArkHot {
        private ArkHot() {
        }

        public static /* synthetic */ void access$400(ClassLoader classLoader, List list) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException, SecurityException {
        }

        public static void install(ClassLoader classLoader, List<File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException, SecurityException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class V14 {
        private V14() {
        }

        public static /* synthetic */ void access$200(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        }

        public static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        }

        public static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class V19 {
        private V19() {
        }

        public static /* synthetic */ void access$100(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        public static /* synthetic */ Object[] access$500(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }

        public static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        public static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class V23 {
        private V23() {
        }

        public static /* synthetic */ void access$000(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        public static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        public static Object[] makePathElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class V4 {
        private V4() {
        }

        public static /* synthetic */ void access$300(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
        }

        public static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
        }
    }

    public static boolean checkDexInstall(ClassLoader classLoader) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
    }

    public static List<File> createSortedAdditionalPathEntries(List<File> list) {
    }

    public static void injectDexesInternal(ClassLoader classLoader, List<File> list, File file) throws Throwable {
    }

    public static void installApk(PathClassLoader pathClassLoader, List<File> list) throws Throwable {
    }

    public static void installDexes(Application application, ClassLoader classLoader, File file, List<File> list, boolean z, boolean z2) throws Throwable {
    }

    public static void uninstallPatchDex(ClassLoader classLoader) throws Throwable {
    }
}
