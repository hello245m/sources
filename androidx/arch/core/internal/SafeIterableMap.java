package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    private Entry<K, V> mEnd;
    private WeakHashMap<SupportRemove<K, V>, Boolean> mIterators;
    private int mSize;
    public Entry<K, V> mStart;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        public AscendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> backward(Entry<K, V> entry) {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> forward(Entry<K, V> entry) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        public DescendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> backward(Entry<K, V> entry) {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> forward(Entry<K, V> entry) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Entry<K, V> implements Map.Entry<K, V> {
        public final K mKey;
        public Entry<K, V> mNext;
        public Entry<K, V> mPrevious;
        public final V mValue;

        public Entry(K k2, V v) {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        @Override // java.util.Map.Entry
        public V getValue() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class IteratorWithAdditions implements Iterator<Map.Entry<K, V>>, SupportRemove<K, V> {
        private boolean mBeforeStart;
        private Entry<K, V> mCurrent;
        public final /* synthetic */ SafeIterableMap this$0;

        public IteratorWithAdditions(SafeIterableMap safeIterableMap) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class ListIterator<K, V> implements Iterator<Map.Entry<K, V>>, SupportRemove<K, V> {
        public Entry<K, V> mExpectedEnd;
        public Entry<K, V> mNext;

        public ListIterator(Entry<K, V> entry, Entry<K, V> entry2) {
        }

        private Entry<K, V> nextNode() {
        }

        public abstract Entry<K, V> backward(Entry<K, V> entry);

        public abstract Entry<K, V> forward(Entry<K, V> entry);

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface SupportRemove<K, V> {
        void supportRemove(Entry<K, V> entry);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
    }

    public Map.Entry<K, V> eldest() {
    }

    public boolean equals(Object obj) {
    }

    public Entry<K, V> get(K k2) {
    }

    public int hashCode() {
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
    }

    public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
    }

    public Map.Entry<K, V> newest() {
    }

    public Entry<K, V> put(K k2, V v) {
    }

    public V putIfAbsent(K k2, V v) {
    }

    public V remove(K k2) {
    }

    public int size() {
    }

    public String toString() {
    }
}
