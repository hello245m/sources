package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class s0 extends k.d.c.z<s0, a> implements Object {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int BASE_REQ_FIELD_NUMBER = 1;
    public static final int BEGIN_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 11;
    private static final s0 DEFAULT_INSTANCE = null;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int INDICATION_FIELD_NUMBER = 6;
    public static final int MODE_FIELD_NUMBER = 8;
    public static final int MSGID_FIELD_NUMBER = 13;
    public static final int OFFSET_FIELD_NUMBER = 10;
    public static final int OPTION_FIELD_NUMBER = 5;
    private static volatile k.d.c.b1<s0> PARSER = null;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 14;
    public static final int REF_DATE_FIELD_NUMBER = 15;
    public static final int SORT_KEY_FIELD_NUMBER = 12;
    public static final int SORT_TYPE_FIELD_NUMBER = 9;
    public static final int USER_SOURCE_FIELD_NUMBER = 7;
    private String action_;
    private j0 baseReq_;
    private int beginTimestamp_;
    private int bitField0_;
    private int count_;
    private int endTimestamp_;
    private String indication_;
    private byte memoizedIsInitialized;
    private String mode_;
    private String msgid_;
    private int offset_;
    private String option_;
    private String publishDate_;
    private String refDate_;
    private String sortKey_;
    private int sortType_;
    private String userSource_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<s0, a> implements Object {
        public /* synthetic */ a(q0 q0Var) {
        }

        public a A(String str) {
        }

        public a B(String str) {
        }

        public a C(String str) {
        }

        public a D(int i2) {
        }

        public a E(String str) {
        }

        public a F(String str) {
        }

        public a G(String str) {
        }

        public a H(String str) {
        }

        public a I(int i2) {
        }

        public a J(String str) {
        }

        public a v(String str) {
        }

        public a w(j0 j0Var) {
        }

        public a x(int i2) {
        }

        public a y(int i2) {
        }

        public a z(int i2) {
        }

        public a() {
        }
    }

    private s0() {
    }

    public static /* synthetic */ s0 access$40100() {
    }

    public static /* synthetic */ void access$40200(s0 s0Var, j0 j0Var) {
    }

    public static /* synthetic */ void access$40300(s0 s0Var, j0 j0Var) {
    }

    public static /* synthetic */ void access$40400(s0 s0Var) {
    }

    public static /* synthetic */ void access$40500(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$40600(s0 s0Var) {
    }

    public static /* synthetic */ void access$40700(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$40800(s0 s0Var, int i2) {
    }

    public static /* synthetic */ void access$40900(s0 s0Var) {
    }

    public static /* synthetic */ void access$41000(s0 s0Var, int i2) {
    }

    public static /* synthetic */ void access$41100(s0 s0Var) {
    }

    public static /* synthetic */ void access$41200(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$41300(s0 s0Var) {
    }

    public static /* synthetic */ void access$41400(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$41500(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$41600(s0 s0Var) {
    }

    public static /* synthetic */ void access$41700(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$41800(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$41900(s0 s0Var) {
    }

    public static /* synthetic */ void access$42000(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$42100(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$42200(s0 s0Var) {
    }

    public static /* synthetic */ void access$42300(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$42400(s0 s0Var, int i2) {
    }

    public static /* synthetic */ void access$42500(s0 s0Var) {
    }

    public static /* synthetic */ void access$42600(s0 s0Var, int i2) {
    }

    public static /* synthetic */ void access$42700(s0 s0Var) {
    }

    public static /* synthetic */ void access$42800(s0 s0Var, int i2) {
    }

    public static /* synthetic */ void access$42900(s0 s0Var) {
    }

    public static /* synthetic */ void access$43000(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$43100(s0 s0Var) {
    }

    public static /* synthetic */ void access$43200(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$43300(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$43400(s0 s0Var) {
    }

    public static /* synthetic */ void access$43500(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$43600(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$43700(s0 s0Var) {
    }

    public static /* synthetic */ void access$43800(s0 s0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$43900(s0 s0Var, String str) {
    }

    public static /* synthetic */ void access$44000(s0 s0Var) {
    }

    public static /* synthetic */ void access$44100(s0 s0Var, k.d.c.i iVar) {
    }

    private void clearAction() {
    }

    private void clearBaseReq() {
    }

    private void clearBeginTimestamp() {
    }

    private void clearCount() {
    }

    private void clearEndTimestamp() {
    }

    private void clearIndication() {
    }

    private void clearMode() {
    }

    private void clearMsgid() {
    }

    private void clearOffset() {
    }

    private void clearOption() {
    }

    private void clearPublishDate() {
    }

    private void clearRefDate() {
    }

    private void clearSortKey() {
    }

    private void clearSortType() {
    }

    private void clearUserSource() {
    }

    public static s0 getDefaultInstance() {
    }

    private void mergeBaseReq(j0 j0Var) {
    }

    public static a newBuilder() {
    }

    public static s0 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static s0 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<s0> parser() {
    }

    private void setAction(String str) {
    }

    private void setActionBytes(k.d.c.i iVar) {
    }

    private void setBaseReq(j0 j0Var) {
    }

    private void setBeginTimestamp(int i2) {
    }

    private void setCount(int i2) {
    }

    private void setEndTimestamp(int i2) {
    }

    private void setIndication(String str) {
    }

    private void setIndicationBytes(k.d.c.i iVar) {
    }

    private void setMode(String str) {
    }

    private void setModeBytes(k.d.c.i iVar) {
    }

    private void setMsgid(String str) {
    }

    private void setMsgidBytes(k.d.c.i iVar) {
    }

    private void setOffset(int i2) {
    }

    private void setOption(String str) {
    }

    private void setOptionBytes(k.d.c.i iVar) {
    }

    private void setPublishDate(String str) {
    }

    private void setPublishDateBytes(k.d.c.i iVar) {
    }

    private void setRefDate(String str) {
    }

    private void setRefDateBytes(k.d.c.i iVar) {
    }

    private void setSortKey(String str) {
    }

    private void setSortKeyBytes(k.d.c.i iVar) {
    }

    private void setSortType(int i2) {
    }

    private void setUserSource(String str) {
    }

    private void setUserSourceBytes(k.d.c.i iVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public String getAction() {
    }

    public k.d.c.i getActionBytes() {
    }

    public j0 getBaseReq() {
    }

    public int getBeginTimestamp() {
    }

    public int getCount() {
    }

    public int getEndTimestamp() {
    }

    public String getIndication() {
    }

    public k.d.c.i getIndicationBytes() {
    }

    public String getMode() {
    }

    public k.d.c.i getModeBytes() {
    }

    public String getMsgid() {
    }

    public k.d.c.i getMsgidBytes() {
    }

    public int getOffset() {
    }

    public String getOption() {
    }

    public k.d.c.i getOptionBytes() {
    }

    public String getPublishDate() {
    }

    public k.d.c.i getPublishDateBytes() {
    }

    public String getRefDate() {
    }

    public k.d.c.i getRefDateBytes() {
    }

    public String getSortKey() {
    }

    public k.d.c.i getSortKeyBytes() {
    }

    public int getSortType() {
    }

    public String getUserSource() {
    }

    public k.d.c.i getUserSourceBytes() {
    }

    public boolean hasAction() {
    }

    public boolean hasBaseReq() {
    }

    public boolean hasBeginTimestamp() {
    }

    public boolean hasCount() {
    }

    public boolean hasEndTimestamp() {
    }

    public boolean hasIndication() {
    }

    public boolean hasMode() {
    }

    public boolean hasMsgid() {
    }

    public boolean hasOffset() {
    }

    public boolean hasOption() {
    }

    public boolean hasPublishDate() {
    }

    public boolean hasRefDate() {
    }

    public boolean hasSortKey() {
    }

    public boolean hasSortType() {
    }

    public boolean hasUserSource() {
    }

    public static a newBuilder(s0 s0Var) {
    }

    public static s0 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static s0 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static s0 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static s0 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static s0 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static s0 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static s0 parseFrom(InputStream inputStream) throws IOException {
    }

    public static s0 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static s0 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static s0 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
