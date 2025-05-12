package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableList.of or another implementation")
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class q<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] a = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a<E> extends b<E> {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int i2) {
        }

        @Override // k.d.b.b.q.b
        @CanIgnoreReturnValue
        public b<E> b(Iterable<? extends E> iterable) {
        }

        @CanIgnoreReturnValue
        public a<E> d(E e) {
        }

        public final void e(int i2) {
        }
    }

    @DoNotMock
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b<E> {
        public static int c(int i2, int i3) {
        }

        @CanIgnoreReturnValue
        public abstract b<E> a(E e);

        @CanIgnoreReturnValue
        public b<E> b(Iterable<? extends E> iterable) {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
    }

    public s<E> b() {
    }

    @CanIgnoreReturnValue
    public int c(Object[] objArr, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object obj);

    @CheckForNull
    public Object[] f() {
    }

    public int g() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    public int k() {
    }

    public abstract boolean l();

    public abstract t0<E> m();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
    }
}
