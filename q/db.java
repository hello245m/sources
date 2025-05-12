package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class db extends k.d.c.z<db, a> implements Object {
    public static final int ACK_FIELD_NUMBER = 11;
    public static final int BASE_REQ_FIELD_NUMBER = 1;
    public static final int CLIENT_MSG_ID_FIELD_NUMBER = 9;
    public static final int CLIENT_NONCE_FIELD_NUMBER = 6;
    public static final int CLIENT_TIME_FIELD_NUMBER = 5;
    public static final int CODE_FIELD_NUMBER = 7;
    public static final int CONTENT_FIELD_NUMBER = 8;
    private static final db DEFAULT_INSTANCE = null;
    public static final int EXT_FIELD_NUMBER = 4;
    private static volatile k.d.c.b1<db> PARSER = null;
    public static final int PUBLISH_TYPE_FIELD_NUMBER = 13;
    public static final int REENTRY_CHECK_FIELD_NUMBER = 10;
    public static final int SEND_TIME_FIELD_NUMBER = 12;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int ack_;
    private j0 baseReq_;
    private int bitField0_;
    private String clientMsgId_;
    private int clientNonce_;
    private int clientTime_;
    private String code_;
    private mb content_;
    private cb ext_;
    private byte memoizedIsInitialized;
    private int publishType_;
    private int reentryCheck_;
    private int sendTime_;
    private int type_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<db, a> implements Object {
        public a() {
        }

        public /* synthetic */ a(k6 k6Var) {
        }

        public a A(int i2) {
        }

        public a B(int i2) {
        }

        public a C(int i2) {
        }

        public a v(j0 j0Var) {
        }

        public a w(String str) {
        }

        public a x(int i2) {
        }

        public a y(mb mbVar) {
        }

        public a z(cb cbVar) {
        }
    }

    private db() {
    }

    public static /* synthetic */ db access$138100() {
    }

    public static /* synthetic */ void access$138200(db dbVar, j0 j0Var) {
    }

    public static /* synthetic */ void access$138300(db dbVar, j0 j0Var) {
    }

    public static /* synthetic */ void access$138400(db dbVar) {
    }

    public static /* synthetic */ void access$138500(db dbVar, int i2) {
    }

    public static /* synthetic */ void access$138600(db dbVar) {
    }

    public static /* synthetic */ void access$138700(db dbVar, cb cbVar) {
    }

    public static /* synthetic */ void access$138800(db dbVar, cb cbVar) {
    }

    public static /* synthetic */ void access$138900(db dbVar) {
    }

    public static /* synthetic */ void access$139000(db dbVar, int i2) {
    }

    public static /* synthetic */ void access$139100(db dbVar) {
    }

    public static /* synthetic */ void access$139200(db dbVar, int i2) {
    }

    public static /* synthetic */ void access$139300(db dbVar) {
    }

    public static /* synthetic */ void access$139400(db dbVar, String str) {
    }

    public static /* synthetic */ void access$139500(db dbVar) {
    }

    public static /* synthetic */ void access$139600(db dbVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$139700(db dbVar, mb mbVar) {
    }

    public static /* synthetic */ void access$139800(db dbVar, mb mbVar) {
    }

    public static /* synthetic */ void access$139900(db dbVar) {
    }

    public static /* synthetic */ void access$140000(db dbVar, String str) {
    }

    public static /* synthetic */ void access$140100(db dbVar) {
    }

    public static /* synthetic */ void access$140200(db dbVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$140300(db dbVar, int i2) {
    }

    public static /* synthetic */ void access$140400(db dbVar) {
    }

    public static /* synthetic */ void access$140500(db dbVar, int i2) {
    }

    public static /* synthetic */ void access$140600(db dbVar) {
    }

    public static /* synthetic */ void access$140700(db dbVar, int i2) {
    }

    public static /* synthetic */ void access$140800(db dbVar) {
    }

    public static /* synthetic */ void access$140900(db dbVar, int i2) {
    }

    public static /* synthetic */ void access$141000(db dbVar) {
    }

    private void clearAck() {
    }

    private void clearBaseReq() {
    }

    private void clearClientMsgId() {
    }

    private void clearClientNonce() {
    }

    private void clearClientTime() {
    }

    private void clearCode() {
    }

    private void clearContent() {
    }

    private void clearExt() {
    }

    private void clearPublishType() {
    }

    private void clearReentryCheck() {
    }

    private void clearSendTime() {
    }

    private void clearType() {
    }

    public static db getDefaultInstance() {
    }

    private void mergeBaseReq(j0 j0Var) {
    }

    private void mergeContent(mb mbVar) {
    }

    private void mergeExt(cb cbVar) {
    }

    public static a newBuilder() {
    }

    public static a newBuilder(db dbVar) {
    }

    public static db parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static db parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static db parseFrom(InputStream inputStream) throws IOException {
    }

    public static db parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static db parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static db parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static db parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static db parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static db parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static db parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }

    public static db parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static db parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static k.d.c.b1<db> parser() {
    }

    private void setAck(int i2) {
    }

    private void setBaseReq(j0 j0Var) {
    }

    private void setClientMsgId(String str) {
    }

    private void setClientMsgIdBytes(k.d.c.i iVar) {
    }

    private void setClientNonce(int i2) {
    }

    private void setClientTime(int i2) {
    }

    private void setCode(String str) {
    }

    private void setCodeBytes(k.d.c.i iVar) {
    }

    private void setContent(mb mbVar) {
    }

    private void setExt(cb cbVar) {
    }

    private void setPublishType(int i2) {
    }

    private void setReentryCheck(int i2) {
    }

    private void setSendTime(int i2) {
    }

    private void setType(int i2) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public int getAck() {
    }

    public j0 getBaseReq() {
    }

    public String getClientMsgId() {
    }

    public k.d.c.i getClientMsgIdBytes() {
    }

    public int getClientNonce() {
    }

    public int getClientTime() {
    }

    public String getCode() {
    }

    public k.d.c.i getCodeBytes() {
    }

    public mb getContent() {
    }

    public cb getExt() {
    }

    public int getPublishType() {
    }

    public int getReentryCheck() {
    }

    public int getSendTime() {
    }

    public int getType() {
    }

    public boolean hasAck() {
    }

    public boolean hasBaseReq() {
    }

    public boolean hasClientMsgId() {
    }

    public boolean hasClientNonce() {
    }

    public boolean hasClientTime() {
    }

    public boolean hasCode() {
    }

    public boolean hasContent() {
    }

    public boolean hasExt() {
    }

    public boolean hasPublishType() {
    }

    public boolean hasReentryCheck() {
    }

    public boolean hasSendTime() {
    }

    public boolean hasType() {
    }
}
