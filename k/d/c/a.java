package k.d.c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import k.d.c.a;
import k.d.c.a.AbstractC0277a;
import k.d.c.s0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0277a<MessageType, BuilderType>> implements s0 {
    public int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
    }

    public static void checkByteStringIsUtf8(i iVar) throws IllegalArgumentException {
    }

    private String getSerializingExceptionMessage(String str) {
    }

    public int getMemoizedSerializedSize() {
    }

    public int getSerializedSize(i1 i1Var) {
    }

    public o1 newUninitializedMessageException() {
    }

    public void setMemoizedSerializedSize(int i2) {
    }

    public byte[] toByteArray() {
    }

    @Override // k.d.c.s0
    public i toByteString() {
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
    }

    public void writeTo(OutputStream outputStream) throws IOException {
    }

    /* renamed from: k.d.c.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class AbstractC0277a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0277a<MessageType, BuilderType>> implements s0.a {
        public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        }

        public static <T> void b(Iterable<T> iterable, List<? super T> list) {
        }

        public static o1 i(s0 s0Var) {
        }

        public final String c(String str) {
        }

        public abstract BuilderType d(MessageType messagetype);

        public BuilderType e(i iVar, q qVar) throws c0 {
        }

        @Override // k.d.c.s0.a
        public /* bridge */ /* synthetic */ s0.a f(i iVar, q qVar) throws c0 {
        }

        public abstract BuilderType g(j jVar, q qVar) throws IOException;

        public BuilderType h(s0 s0Var) {
        }

        @Override // k.d.c.s0.a
        public /* bridge */ /* synthetic */ s0.a m(s0 s0Var) {
        }

        /* renamed from: k.d.c.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class C0278a extends FilterInputStream {
            public int a;

            public C0278a(InputStream inputStream, int i2) {
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
            }
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
    }
}
