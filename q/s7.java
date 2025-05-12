package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class s7 extends k.d.c.z<s7, a> implements Object {
    public static final int BASE_RESP_FIELD_NUMBER = 1;
    private static final s7 DEFAULT_INSTANCE = null;
    private static volatile k.d.c.b1<s7> PARSER = null;
    public static final int TOPICLIST_FIELD_NUMBER = 2;
    private k0 baseResp_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private b0.i<b> topicList_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<s7, a> implements Object {
        public a() {
        }

        public /* synthetic */ a(k6 k6Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements c {
        private static final b DEFAULT_INSTANCE = null;
        public static final int ERR_MSG_FIELD_NUMBER = 3;
        public static final int ERR_TYPE_FIELD_NUMBER = 2;
        private static volatile k.d.c.b1<b> PARSER = null;
        public static final int TOPIC_FIELD_NUMBER = 1;
        private int bitField0_;
        private String errMsg_;
        private int errType_;
        private byte memoizedIsInitialized;
        private v6 topic_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements c {
            public a() {
            }

            public /* synthetic */ a(k6 k6Var) {
            }
        }

        private b() {
        }

        public static /* synthetic */ b access$136000() {
        }

        public static /* synthetic */ void access$136100(b bVar, v6 v6Var) {
        }

        public static /* synthetic */ void access$136200(b bVar, v6 v6Var) {
        }

        public static /* synthetic */ void access$136300(b bVar) {
        }

        public static /* synthetic */ void access$136400(b bVar, int i2) {
        }

        public static /* synthetic */ void access$136500(b bVar) {
        }

        public static /* synthetic */ void access$136600(b bVar, String str) {
        }

        public static /* synthetic */ void access$136700(b bVar) {
        }

        public static /* synthetic */ void access$136800(b bVar, k.d.c.i iVar) {
        }

        private void clearErrMsg() {
        }

        private void clearErrType() {
        }

        private void clearTopic() {
        }

        public static b getDefaultInstance() {
        }

        private void mergeTopic(v6 v6Var) {
        }

        public static a newBuilder() {
        }

        public static a newBuilder(b bVar) {
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
        }

        public static b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static k.d.c.b1<b> parser() {
        }

        private void setErrMsg(String str) {
        }

        private void setErrMsgBytes(k.d.c.i iVar) {
        }

        private void setErrType(int i2) {
        }

        private void setTopic(v6 v6Var) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public String getErrMsg() {
        }

        public k.d.c.i getErrMsgBytes() {
        }

        public int getErrType() {
        }

        public v6 getTopic() {
        }

        public boolean hasErrMsg() {
        }

        public boolean hasErrType() {
        }

        public boolean hasTopic() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface c extends k.d.c.t0 {
    }

    private s7() {
    }

    public static /* synthetic */ s7 access$137000() {
    }

    public static /* synthetic */ void access$137100(s7 s7Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$137200(s7 s7Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$137300(s7 s7Var) {
    }

    public static /* synthetic */ void access$137400(s7 s7Var, int i2, b bVar) {
    }

    public static /* synthetic */ void access$137500(s7 s7Var, b bVar) {
    }

    public static /* synthetic */ void access$137600(s7 s7Var, int i2, b bVar) {
    }

    public static /* synthetic */ void access$137700(s7 s7Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$137800(s7 s7Var) {
    }

    public static /* synthetic */ void access$137900(s7 s7Var, int i2) {
    }

    private void addAllTopicList(Iterable<? extends b> iterable) {
    }

    private void addTopicList(int i2, b bVar) {
    }

    private void addTopicList(b bVar) {
    }

    private void clearBaseResp() {
    }

    private void clearTopicList() {
    }

    private void ensureTopicListIsMutable() {
    }

    public static s7 getDefaultInstance() {
    }

    private void mergeBaseResp(k0 k0Var) {
    }

    public static a newBuilder() {
    }

    public static a newBuilder(s7 s7Var) {
    }

    public static s7 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static s7 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static s7 parseFrom(InputStream inputStream) throws IOException {
    }

    public static s7 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static s7 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static s7 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static s7 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static s7 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static s7 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static s7 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }

    public static s7 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static s7 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static k.d.c.b1<s7> parser() {
    }

    private void removeTopicList(int i2) {
    }

    private void setBaseResp(k0 k0Var) {
    }

    private void setTopicList(int i2, b bVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public k0 getBaseResp() {
    }

    public b getTopicList(int i2) {
    }

    public int getTopicListCount() {
    }

    public List<b> getTopicListList() {
    }

    public c getTopicListOrBuilder(int i2) {
    }

    public List<? extends c> getTopicListOrBuilderList() {
    }

    public boolean hasBaseResp() {
    }
}
