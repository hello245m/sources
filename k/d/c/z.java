package k.d.c;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.d.c.a;
import k.d.c.b0;
import k.d.c.s0;
import k.d.c.v;
import k.d.c.v1;
import k.d.c.z;
import k.d.c.z.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class z<MessageType extends z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends k.d.c.a<MessageType, BuilderType> {
    private static Map<Object, z<?, ?>> defaultInstanceMap;
    public int memoizedSerializedSize;
    public q1 unknownFields;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b<MessageType extends z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a.AbstractC0277a<MessageType, BuilderType> {
        public final MessageType a;
        public MessageType b;
        public boolean c;

        public b(MessageType messagetype) {
        }

        @Override // k.d.c.s0.a
        public /* bridge */ /* synthetic */ s0 L() {
        }

        @Override // k.d.c.s0.a
        public /* bridge */ /* synthetic */ s0 build() {
        }

        public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        }

        @Override // k.d.c.a.AbstractC0277a
        public /* bridge */ /* synthetic */ a.AbstractC0277a d(k.d.c.a aVar) {
        }

        @Override // k.d.c.a.AbstractC0277a
        public /* bridge */ /* synthetic */ a.AbstractC0277a g(j jVar, q qVar) throws IOException {
        }

        @Override // k.d.c.t0
        public /* bridge */ /* synthetic */ s0 getDefaultInstanceForType() {
        }

        @Override // k.d.c.t0
        public final boolean isInitialized() {
        }

        public final MessageType j() {
        }

        public MessageType k() {
        }

        public BuilderType l() {
        }

        public final void n() {
        }

        public void o() {
        }

        public MessageType p() {
        }

        public BuilderType q(MessageType messagetype) {
        }

        public BuilderType r(j jVar, q qVar) throws IOException {
        }

        @Override // k.d.c.s0.a
        public /* bridge */ /* synthetic */ s0.a s(j jVar, q qVar) throws IOException {
        }

        public BuilderType t(MessageType messagetype) {
        }

        public final void u(MessageType messagetype, MessageType messagetype2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c<T extends z<T, ?>> extends k.d.c.b<T> {
        public final T a;

        public c(T t2) {
        }

        @Override // k.d.c.b1
        public /* bridge */ /* synthetic */ Object b(j jVar, q qVar) throws c0 {
        }

        public T g(j jVar, q qVar) throws c0 {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e implements v.b<e> {
        public final b0.d<?> a;
        public final int b;
        public final v1.b c;
        public final boolean d;
        public final boolean e;

        public e(b0.d<?> dVar, int i2, v1.b bVar, boolean z, boolean z2) {
        }

        @Override // k.d.c.v.b
        public int H() {
        }

        @Override // k.d.c.v.b
        public boolean I() {
        }

        @Override // k.d.c.v.b
        public v1.b J() {
        }

        @Override // k.d.c.v.b
        public s0.a K(s0.a aVar, s0 s0Var) {
        }

        @Override // k.d.c.v.b
        public v1.c S() {
        }

        @Override // k.d.c.v.b
        public boolean T() {
        }

        public int a(e eVar) {
        }

        public b0.d<?> b() {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f<ContainingType extends s0, Type> extends o<ContainingType, Type> {
        public final ContainingType a;
        public final Type b;
        public final s0 c;
        public final e d;

        public f(ContainingType containingtype, Type type, s0 s0Var, e eVar, Class cls) {
        }

        public Object b(Object obj) {
        }

        public ContainingType c() {
        }

        public v1.b d() {
        }

        public s0 e() {
        }

        public int f() {
        }

        public boolean g() {
        }

        public Object h(Object obj) {
        }

        public Object i(Object obj) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g {
        public static final g a = null;
        public static final g b = null;
        public static final g c = null;
        public static final g d = null;
        public static final g e = null;
        public static final g f = null;
        public static final g g = null;
        public static final /* synthetic */ g[] h = null;

        public g(String str, int i2) {
        }

        public static g valueOf(String str) {
        }

        public static g[] values() {
        }
    }

    public static /* synthetic */ f access$000(o oVar) {
    }

    public static /* synthetic */ z access$200(z zVar, byte[] bArr, int i2, int i3, q qVar) throws c0 {
    }

    private static <MessageType extends d<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>, T> f<MessageType, T> checkIsLite(o<MessageType, T> oVar) {
    }

    private static <T extends z<T, ?>> T checkMessageInitialized(T t2) throws c0 {
    }

    public static b0.a emptyBooleanList() {
    }

    public static b0.b emptyDoubleList() {
    }

    public static b0.f emptyFloatList() {
    }

    public static b0.g emptyIntList() {
    }

    public static b0.h emptyLongList() {
    }

    public static <E> b0.i<E> emptyProtobufList() {
    }

    private final void ensureUnknownFieldsInitialized() {
    }

    public static <T extends z<?, ?>> T getDefaultInstance(Class<T> cls) {
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
    }

    public static b0.g mutableCopy(b0.g gVar) {
    }

    public static Object newMessageInfo(s0 s0Var, String str, Object[] objArr) {
    }

    public static <ContainingType extends s0, Type> f<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, s0 s0Var, b0.d<?> dVar, int i2, v1.b bVar, boolean z, Class cls) {
    }

    public static <ContainingType extends s0, Type> f<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, s0 s0Var, b0.d<?> dVar, int i2, v1.b bVar, Class cls) {
    }

    public static <T extends z<T, ?>> T parseDelimitedFrom(T t2, InputStream inputStream) throws c0 {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, ByteBuffer byteBuffer, q qVar) throws c0 {
    }

    private static <T extends z<T, ?>> T parsePartialDelimitedFrom(T t2, InputStream inputStream, q qVar) throws c0 {
    }

    public static <T extends z<T, ?>> T parsePartialFrom(T t2, j jVar, q qVar) throws c0 {
    }

    public static <T extends z<?, ?>> void registerDefaultInstance(Class<T> cls, T t2) {
    }

    public Object buildMessageInfo() throws Exception {
    }

    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder() {
    }

    public Object dynamicMethod(g gVar, Object obj) {
    }

    public abstract Object dynamicMethod(g gVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
    }

    @Override // k.d.c.t0
    public /* bridge */ /* synthetic */ s0 getDefaultInstanceForType() {
    }

    @Override // k.d.c.a
    public int getMemoizedSerializedSize() {
    }

    @Override // k.d.c.s0
    public final b1<MessageType> getParserForType() {
    }

    @Override // k.d.c.s0
    public int getSerializedSize() {
    }

    public int hashCode() {
    }

    @Override // k.d.c.t0
    public final boolean isInitialized() {
    }

    public void makeImmutable() {
    }

    public void mergeLengthDelimitedField(int i2, i iVar) {
    }

    public final void mergeUnknownFields(q1 q1Var) {
    }

    public void mergeVarintField(int i2, int i3) {
    }

    @Override // k.d.c.s0
    public /* bridge */ /* synthetic */ s0.a newBuilderForType() {
    }

    public boolean parseUnknownField(int i2, j jVar) throws IOException {
    }

    @Override // k.d.c.a
    public void setMemoizedSerializedSize(int i2) {
    }

    @Override // k.d.c.s0
    public /* bridge */ /* synthetic */ s0.a toBuilder() {
    }

    public String toString() {
    }

    @Override // k.d.c.s0
    public void writeTo(l lVar) throws IOException {
    }

    public static final <T extends z<T, ?>> boolean isInitialized(T t2, boolean z) {
    }

    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
    }

    public Object dynamicMethod(g gVar) {
    }

    @Override // k.d.c.t0
    public final MessageType getDefaultInstanceForType() {
    }

    @Override // k.d.c.s0
    public final BuilderType newBuilderForType() {
    }

    @Override // k.d.c.s0
    public final BuilderType toBuilder() {
    }

    public static b0.h mutableCopy(b0.h hVar) {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, ByteBuffer byteBuffer) throws c0 {
    }

    public static <T extends z<T, ?>> T parseDelimitedFrom(T t2, InputStream inputStream, q qVar) throws c0 {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, i iVar) throws c0 {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends z<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        public v<e> extensions;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a {
            public final Iterator<Map.Entry<e, Object>> a;
            public final /* synthetic */ d b;

            public /* synthetic */ a(d dVar, boolean z, a aVar) {
            }

            public a(d dVar, boolean z) {
            }
        }

        private void eagerlyMergeMessageSetExtension(j jVar, f<?, ?> fVar, q qVar, int i2) throws IOException {
        }

        private void mergeMessageSetExtensionFromBytes(i iVar, q qVar, f<?, ?> fVar) throws IOException {
        }

        private <MessageType extends s0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, j jVar, q qVar) throws IOException {
        }

        private boolean parseExtension(j jVar, q qVar, f<?, ?> fVar, int i2, int i3) throws IOException {
        }

        private void verifyExtensionContainingType(f<MessageType, ?> fVar) {
        }

        public v<e> ensureExtensionsAreMutable() {
        }

        public boolean extensionsAreInitialized() {
        }

        public int extensionsSerializedSize() {
        }

        public int extensionsSerializedSizeAsMessageSet() {
        }

        @Override // k.d.c.z, k.d.c.t0
        public /* bridge */ /* synthetic */ s0 getDefaultInstanceForType() {
        }

        public final <Type> Type getExtension(o<MessageType, Type> oVar) {
        }

        public final <Type> int getExtensionCount(o<MessageType, List<Type>> oVar) {
        }

        public final <Type> boolean hasExtension(o<MessageType, Type> oVar) {
        }

        public final void mergeExtensionFields(MessageType messagetype) {
        }

        @Override // k.d.c.z, k.d.c.s0
        public /* bridge */ /* synthetic */ s0.a newBuilderForType() {
        }

        public d<MessageType, BuilderType>.a newExtensionWriter() {
        }

        public d<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
        }

        public <MessageType extends s0> boolean parseUnknownField(MessageType messagetype, j jVar, q qVar, int i2) throws IOException {
        }

        public <MessageType extends s0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, j jVar, q qVar, int i2) throws IOException {
        }

        @Override // k.d.c.z, k.d.c.s0
        public /* bridge */ /* synthetic */ s0.a toBuilder() {
        }

        public final <Type> Type getExtension(o<MessageType, List<Type>> oVar, int i2) {
        }
    }

    public static b0.f mutableCopy(b0.f fVar) {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, i iVar, q qVar) throws c0 {
    }

    public static b0.b mutableCopy(b0.b bVar) {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, byte[] bArr) throws c0 {
    }

    public static b0.a mutableCopy(b0.a aVar) {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, byte[] bArr, q qVar) throws c0 {
    }

    public static <E> b0.i<E> mutableCopy(b0.i<E> iVar) {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, InputStream inputStream) throws c0 {
    }

    private static <T extends z<T, ?>> T parsePartialFrom(T t2, byte[] bArr, int i2, int i3, q qVar) throws c0 {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, InputStream inputStream, q qVar) throws c0 {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, j jVar) throws c0 {
    }

    public static <T extends z<T, ?>> T parseFrom(T t2, j jVar, q qVar) throws c0 {
    }

    public static <T extends z<T, ?>> T parsePartialFrom(T t2, j jVar) throws c0 {
    }

    private static <T extends z<T, ?>> T parsePartialFrom(T t2, i iVar, q qVar) throws c0 {
    }
}
