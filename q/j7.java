package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class j7 extends k.d.c.z<j7, a> implements Object {
    public static final int COMMENT_COUNT_FIELD_NUMBER = 1;
    public static final int COMMENT_ITEM_FIELD_NUMBER = 3;
    public static final int CONTINUE_FLAG_FIELD_NUMBER = 4;
    private static final j7 DEFAULT_INSTANCE = null;
    public static final int ELECTED_COMMENT_COUNT_FIELD_NUMBER = 2;
    public static final int LAST_COMMENT_BUFFER_FIELD_NUMBER = 5;
    private static volatile k.d.c.b1<j7> PARSER;
    private int bitField0_;
    private int commentCount_;
    private b0.i<b> commentItem_;
    private boolean continueFlag_;
    private int electedCommentCount_;
    private k.d.c.i lastCommentBuffer_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<j7, a> implements Object {
        public a() {
        }

        public /* synthetic */ a(k6 k6Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements c {
        public static final int APPMSG_FIELD_NUMBER = 2;
        public static final int COMMENT_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE = null;
        private static volatile k.d.c.b1<b> PARSER;
        private jb appmsg_;
        private int bitField0_;
        private i7 comment_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements c {
            public a() {
            }

            public /* synthetic */ a(k6 k6Var) {
            }

            public i7 v() {
            }

            public a w(i7 i7Var) {
            }
        }

        private b() {
        }

        public static /* synthetic */ b access$324900() {
        }

        public static /* synthetic */ void access$325000(b bVar, i7 i7Var) {
        }

        public static /* synthetic */ void access$325100(b bVar, i7 i7Var) {
        }

        public static /* synthetic */ void access$325200(b bVar) {
        }

        public static /* synthetic */ void access$325300(b bVar, jb jbVar) {
        }

        public static /* synthetic */ void access$325400(b bVar, jb jbVar) {
        }

        public static /* synthetic */ void access$325500(b bVar) {
        }

        private void clearAppmsg() {
        }

        private void clearComment() {
        }

        public static b getDefaultInstance() {
        }

        private void mergeAppmsg(jb jbVar) {
        }

        private void mergeComment(i7 i7Var) {
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

        private void setAppmsg(jb jbVar) {
        }

        private void setComment(i7 i7Var) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public jb getAppmsg() {
        }

        public i7 getComment() {
        }

        public boolean hasAppmsg() {
        }

        public boolean hasComment() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface c extends k.d.c.t0 {
    }

    private j7() {
    }

    public static /* synthetic */ j7 access$325700() {
    }

    public static /* synthetic */ void access$325800(j7 j7Var, int i2) {
    }

    public static /* synthetic */ void access$325900(j7 j7Var) {
    }

    public static /* synthetic */ void access$326000(j7 j7Var, int i2) {
    }

    public static /* synthetic */ void access$326100(j7 j7Var) {
    }

    public static /* synthetic */ void access$326200(j7 j7Var, int i2, b bVar) {
    }

    public static /* synthetic */ void access$326300(j7 j7Var, b bVar) {
    }

    public static /* synthetic */ void access$326400(j7 j7Var, int i2, b bVar) {
    }

    public static /* synthetic */ void access$326500(j7 j7Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$326600(j7 j7Var) {
    }

    public static /* synthetic */ void access$326700(j7 j7Var, int i2) {
    }

    public static /* synthetic */ void access$326800(j7 j7Var, boolean z) {
    }

    public static /* synthetic */ void access$326900(j7 j7Var) {
    }

    public static /* synthetic */ void access$327000(j7 j7Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$327100(j7 j7Var) {
    }

    private void addAllCommentItem(Iterable<? extends b> iterable) {
    }

    private void addCommentItem(int i2, b bVar) {
    }

    private void addCommentItem(b bVar) {
    }

    private void clearCommentCount() {
    }

    private void clearCommentItem() {
    }

    private void clearContinueFlag() {
    }

    private void clearElectedCommentCount() {
    }

    private void clearLastCommentBuffer() {
    }

    private void ensureCommentItemIsMutable() {
    }

    public static j7 getDefaultInstance() {
    }

    public static a newBuilder() {
    }

    public static a newBuilder(j7 j7Var) {
    }

    public static j7 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static j7 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static j7 parseFrom(InputStream inputStream) throws IOException {
    }

    public static j7 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static j7 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static j7 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static j7 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static j7 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static j7 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static j7 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }

    public static j7 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static j7 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static k.d.c.b1<j7> parser() {
    }

    private void removeCommentItem(int i2) {
    }

    private void setCommentCount(int i2) {
    }

    private void setCommentItem(int i2, b bVar) {
    }

    private void setContinueFlag(boolean z) {
    }

    private void setElectedCommentCount(int i2) {
    }

    private void setLastCommentBuffer(k.d.c.i iVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public int getCommentCount() {
    }

    public b getCommentItem(int i2) {
    }

    public int getCommentItemCount() {
    }

    public List<b> getCommentItemList() {
    }

    public c getCommentItemOrBuilder(int i2) {
    }

    public List<? extends c> getCommentItemOrBuilderList() {
    }

    public boolean getContinueFlag() {
    }

    public int getElectedCommentCount() {
    }

    public k.d.c.i getLastCommentBuffer() {
    }

    public boolean hasCommentCount() {
    }

    public boolean hasContinueFlag() {
    }

    public boolean hasElectedCommentCount() {
    }

    public boolean hasLastCommentBuffer() {
    }
}
