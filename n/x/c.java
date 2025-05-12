package n.x;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public abstract class c<E> extends n.x.a<E> implements List<E>, n.d0.d.h0.a {
    public static final a a = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(n.d0.d.h hVar) {
        }

        public final void a(int i2, int i3) {
        }

        public final void b(int i2, int i3) {
        }

        public final void c(int i2, int i3, int i4) {
        }

        public final boolean d(Collection<?> collection, Collection<?> collection2) {
        }

        public final int e(Collection<?> collection) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b implements Iterator<E>, n.d0.d.h0.a {
        public int a;
        public final /* synthetic */ c<E> b;

        public b(c cVar) {
        }

        public final int a() {
        }

        public final void b(int i2) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* renamed from: n.x.c$c, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class C0766c extends c<E>.b implements ListIterator<E>, n.d0.d.h0.a {
        public final /* synthetic */ c<E> c;

        public C0766c(c cVar, int i2) {
        }

        @Override // java.util.ListIterator
        public void add(E e) {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public E previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator
        public void set(E e) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class d<E> extends c<E> implements RandomAccess {
        public final c<E> b;
        public final int c;
        public int d;

        public d(c<? extends E> cVar, int i2, int i3) {
        }

        @Override // n.x.a
        public int b() {
        }

        @Override // n.x.c, java.util.List
        public E get(int i2) {
        }
    }

    @Override // java.util.List
    public void add(int i2, E e) {
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.List
    public abstract E get(int i2);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // java.util.List
    public int indexOf(E e) {
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
    }

    @Override // java.util.List
    public int lastIndexOf(E e) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
    }

    @Override // java.util.List
    public E remove(int i2) {
    }

    @Override // java.util.List
    public E set(int i2, E e) {
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
    }
}
