package com.tencent.wcdb.support;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i2) {
    }

    private int safeSizeOf(K k2, V v) {
    }

    public V create(K k2) {
    }

    public final synchronized int createCount() {
    }

    public void entryRemoved(boolean z, K k2, V v, V v2) {
    }

    public final void evictAll() {
    }

    public final synchronized int evictionCount() {
    }

    public final V get(K k2) {
    }

    public final synchronized int hitCount() {
    }

    public final synchronized int maxSize() {
    }

    public final synchronized int missCount() {
    }

    public final V put(K k2, V v) {
    }

    public final synchronized int putCount() {
    }

    public final V remove(K k2) {
    }

    public void resize(int i2) {
    }

    public final synchronized int size() {
    }

    public int sizeOf(K k2, V v) {
    }

    public final synchronized Map<K, V> snapshot() {
    }

    @SuppressLint({"DefaultLocale"})
    public final synchronized String toString() {
    }

    public void trimToSize(int i2) {
    }
}
