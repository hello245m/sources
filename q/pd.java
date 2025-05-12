package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class pd extends k.d.c.z<pd, a> implements Object {
    public static final int BASE_RESP_FIELD_NUMBER = 1;
    private static final pd DEFAULT_INSTANCE = null;
    public static final int MSG_FIELD_NUMBER = 3;
    private static volatile k.d.c.b1<pd> PARSER = null;
    public static final int SEARCH_ID_FIELD_NUMBER = 2;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 4;
    private k0 baseResp_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private b0.i<xa> msg_;
    private String searchId_;
    private int totalCount_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<pd, a> implements Object {
        public a() {
        }

        public /* synthetic */ a(k6 k6Var) {
        }
    }

    private pd() {
    }

    public static /* synthetic */ pd access$244200() {
    }

    public static /* synthetic */ void access$244300(pd pdVar, k0 k0Var) {
    }

    public static /* synthetic */ void access$244400(pd pdVar, k0 k0Var) {
    }

    public static /* synthetic */ void access$244500(pd pdVar) {
    }

    public static /* synthetic */ void access$244600(pd pdVar, String str) {
    }

    public static /* synthetic */ void access$244700(pd pdVar) {
    }

    public static /* synthetic */ void access$244800(pd pdVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$244900(pd pdVar, int i2, xa xaVar) {
    }

    public static /* synthetic */ void access$245000(pd pdVar, xa xaVar) {
    }

    public static /* synthetic */ void access$245100(pd pdVar, int i2, xa xaVar) {
    }

    public static /* synthetic */ void access$245200(pd pdVar, Iterable iterable) {
    }

    public static /* synthetic */ void access$245300(pd pdVar) {
    }

    public static /* synthetic */ void access$245400(pd pdVar, int i2) {
    }

    public static /* synthetic */ void access$245500(pd pdVar, int i2) {
    }

    public static /* synthetic */ void access$245600(pd pdVar) {
    }

    private void addAllMsg(Iterable<? extends xa> iterable) {
    }

    private void addMsg(int i2, xa xaVar) {
    }

    private void addMsg(xa xaVar) {
    }

    private void clearBaseResp() {
    }

    private void clearMsg() {
    }

    private void clearSearchId() {
    }

    private void clearTotalCount() {
    }

    private void ensureMsgIsMutable() {
    }

    public static pd getDefaultInstance() {
    }

    private void mergeBaseResp(k0 k0Var) {
    }

    public static a newBuilder() {
    }

    public static a newBuilder(pd pdVar) {
    }

    public static pd parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static pd parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static pd parseFrom(InputStream inputStream) throws IOException {
    }

    public static pd parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static pd parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static pd parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static pd parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static pd parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static pd parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static pd parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }

    public static pd parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static pd parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static k.d.c.b1<pd> parser() {
    }

    private void removeMsg(int i2) {
    }

    private void setBaseResp(k0 k0Var) {
    }

    private void setMsg(int i2, xa xaVar) {
    }

    private void setSearchId(String str) {
    }

    private void setSearchIdBytes(k.d.c.i iVar) {
    }

    private void setTotalCount(int i2) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public k0 getBaseResp() {
    }

    public xa getMsg(int i2) {
    }

    public int getMsgCount() {
    }

    public List<xa> getMsgList() {
    }

    public bb getMsgOrBuilder(int i2) {
    }

    public List<? extends bb> getMsgOrBuilderList() {
    }

    public String getSearchId() {
    }

    public k.d.c.i getSearchIdBytes() {
    }

    public int getTotalCount() {
    }

    public boolean hasBaseResp() {
    }

    public boolean hasSearchId() {
    }

    public boolean hasTotalCount() {
    }
}
