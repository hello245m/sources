package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class aa extends k.d.c.z<aa, a> implements Object {
    public static final int BASE_RESP_FIELD_NUMBER = 1;
    private static final aa DEFAULT_INSTANCE = null;
    private static volatile k.d.c.b1<aa> PARSER = null;
    public static final int PKG_LIST_FIELD_NUMBER = 2;
    private k0 baseResp_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private b0.i<b> pkgList_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<aa, a> implements Object {
        public a() {
        }

        public /* synthetic */ a(k6 k6Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements c {
        public static final int BASE_VERSION_FIELD_NUMBER = 4;
        private static final b DEFAULT_INSTANCE = null;
        private static volatile k.d.c.b1<b> PARSER = null;
        public static final int PKG_NAME_FIELD_NUMBER = 1;
        public static final int PKG_VERSION_LIST_FIELD_NUMBER = 2;
        public static final int TARGET_PKG_FIELD_NUMBER = 3;
        private int baseVersion_;
        private int bitField0_;
        private String pkgName_;
        private b0.i<bc> pkgVersionList_;
        private bc targetPkg_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements c {
            public a() {
            }

            public /* synthetic */ a(k6 k6Var) {
            }
        }

        private b() {
        }

        public static /* synthetic */ b access$340900() {
        }

        public static /* synthetic */ void access$341000(b bVar, String str) {
        }

        public static /* synthetic */ void access$341100(b bVar) {
        }

        public static /* synthetic */ void access$341200(b bVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$341300(b bVar, int i2, bc bcVar) {
        }

        public static /* synthetic */ void access$341400(b bVar, bc bcVar) {
        }

        public static /* synthetic */ void access$341500(b bVar, int i2, bc bcVar) {
        }

        public static /* synthetic */ void access$341600(b bVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$341700(b bVar) {
        }

        public static /* synthetic */ void access$341800(b bVar, int i2) {
        }

        public static /* synthetic */ void access$341900(b bVar, bc bcVar) {
        }

        public static /* synthetic */ void access$342000(b bVar, bc bcVar) {
        }

        public static /* synthetic */ void access$342100(b bVar) {
        }

        public static /* synthetic */ void access$342200(b bVar, int i2) {
        }

        public static /* synthetic */ void access$342300(b bVar) {
        }

        private void addAllPkgVersionList(Iterable<? extends bc> iterable) {
        }

        private void addPkgVersionList(int i2, bc bcVar) {
        }

        private void addPkgVersionList(bc bcVar) {
        }

        private void clearBaseVersion() {
        }

        private void clearPkgName() {
        }

        private void clearPkgVersionList() {
        }

        private void clearTargetPkg() {
        }

        private void ensurePkgVersionListIsMutable() {
        }

        public static b getDefaultInstance() {
        }

        private void mergeTargetPkg(bc bcVar) {
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

        private void removePkgVersionList(int i2) {
        }

        private void setBaseVersion(int i2) {
        }

        private void setPkgName(String str) {
        }

        private void setPkgNameBytes(k.d.c.i iVar) {
        }

        private void setPkgVersionList(int i2, bc bcVar) {
        }

        private void setTargetPkg(bc bcVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getBaseVersion() {
        }

        public String getPkgName() {
        }

        public k.d.c.i getPkgNameBytes() {
        }

        public bc getPkgVersionList(int i2) {
        }

        public int getPkgVersionListCount() {
        }

        public List<bc> getPkgVersionListList() {
        }

        public cc getPkgVersionListOrBuilder(int i2) {
        }

        public List<? extends cc> getPkgVersionListOrBuilderList() {
        }

        public bc getTargetPkg() {
        }

        public boolean hasBaseVersion() {
        }

        public boolean hasPkgName() {
        }

        public boolean hasTargetPkg() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface c extends k.d.c.t0 {
    }

    private aa() {
    }

    public static /* synthetic */ aa access$342500() {
    }

    public static /* synthetic */ void access$342600(aa aaVar, k0 k0Var) {
    }

    public static /* synthetic */ void access$342700(aa aaVar, k0 k0Var) {
    }

    public static /* synthetic */ void access$342800(aa aaVar) {
    }

    public static /* synthetic */ void access$342900(aa aaVar, int i2, b bVar) {
    }

    public static /* synthetic */ void access$343000(aa aaVar, b bVar) {
    }

    public static /* synthetic */ void access$343100(aa aaVar, int i2, b bVar) {
    }

    public static /* synthetic */ void access$343200(aa aaVar, Iterable iterable) {
    }

    public static /* synthetic */ void access$343300(aa aaVar) {
    }

    public static /* synthetic */ void access$343400(aa aaVar, int i2) {
    }

    private void addAllPkgList(Iterable<? extends b> iterable) {
    }

    private void addPkgList(int i2, b bVar) {
    }

    private void addPkgList(b bVar) {
    }

    private void clearBaseResp() {
    }

    private void clearPkgList() {
    }

    private void ensurePkgListIsMutable() {
    }

    public static aa getDefaultInstance() {
    }

    private void mergeBaseResp(k0 k0Var) {
    }

    public static a newBuilder() {
    }

    public static a newBuilder(aa aaVar) {
    }

    public static aa parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static aa parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static aa parseFrom(InputStream inputStream) throws IOException {
    }

    public static aa parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static aa parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static aa parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static aa parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static aa parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static aa parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static aa parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }

    public static aa parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static aa parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static k.d.c.b1<aa> parser() {
    }

    private void removePkgList(int i2) {
    }

    private void setBaseResp(k0 k0Var) {
    }

    private void setPkgList(int i2, b bVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public k0 getBaseResp() {
    }

    public b getPkgList(int i2) {
    }

    public int getPkgListCount() {
    }

    public List<b> getPkgListList() {
    }

    public c getPkgListOrBuilder(int i2) {
    }

    public List<? extends c> getPkgListOrBuilderList() {
    }

    public boolean hasBaseResp() {
    }
}
