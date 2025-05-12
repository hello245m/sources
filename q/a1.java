package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class a1 extends k.d.c.z<a1, a> implements Object {
    public static final int AUTHKEY_FIELD_NUMBER = 8;
    private static final a1 DEFAULT_INSTANCE = null;
    public static final int EXPIRETIME_FIELD_NUMBER = 3;
    public static final int FRONTID_FIELD_NUMBER = 4;
    public static final int FRONTIP1PORTLIST_FIELD_NUMBER = 12;
    public static final int FRONTIP1_FIELD_NUMBER = 5;
    public static final int FRONTIP2PORTLIST_FIELD_NUMBER = 13;
    public static final int FRONTIP2_FIELD_NUMBER = 6;
    private static volatile k.d.c.b1<a1> PARSER = null;
    public static final int UIN_FIELD_NUMBER = 2;
    public static final int VER_FIELD_NUMBER = 1;
    public static final int ZONEDOMAIN_FIELD_NUMBER = 7;
    public static final int ZONEID_FIELD_NUMBER = 9;
    public static final int ZONEIP1PORTLIST_FIELD_NUMBER = 14;
    public static final int ZONEIP1_FIELD_NUMBER = 10;
    public static final int ZONEIP2PORTLIST_FIELD_NUMBER = 15;
    public static final int ZONEIP2_FIELD_NUMBER = 11;
    private p.b authKey_;
    private int bitField0_;
    private int expireTime_;
    private int frontID_;
    private b1 frontIP1PortList_;
    private String frontIP1_;
    private b1 frontIP2PortList_;
    private String frontIP2_;
    private byte memoizedIsInitialized;
    private int uin_;
    private int ver_;
    private String zoneDomain_;
    private int zoneID_;
    private b1 zoneIP1PortList_;
    private String zoneIP1_;
    private b1 zoneIP2PortList_;
    private String zoneIP2_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<a1, a> implements Object {
        public /* synthetic */ a(q0 q0Var) {
        }

        public a() {
        }
    }

    private a1() {
    }

    public static /* synthetic */ void access$1000(a1 a1Var) {
    }

    public static /* synthetic */ void access$1100(a1 a1Var, int i2) {
    }

    public static /* synthetic */ void access$1200(a1 a1Var) {
    }

    public static /* synthetic */ void access$1300(a1 a1Var, int i2) {
    }

    public static /* synthetic */ void access$1400(a1 a1Var) {
    }

    public static /* synthetic */ void access$1500(a1 a1Var, int i2) {
    }

    public static /* synthetic */ void access$1600(a1 a1Var) {
    }

    public static /* synthetic */ void access$1700(a1 a1Var, String str) {
    }

    public static /* synthetic */ void access$1800(a1 a1Var) {
    }

    public static /* synthetic */ void access$1900(a1 a1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2000(a1 a1Var, String str) {
    }

    public static /* synthetic */ void access$2100(a1 a1Var) {
    }

    public static /* synthetic */ void access$2200(a1 a1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2300(a1 a1Var, String str) {
    }

    public static /* synthetic */ void access$2400(a1 a1Var) {
    }

    public static /* synthetic */ void access$2500(a1 a1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$2600(a1 a1Var, p.b bVar) {
    }

    public static /* synthetic */ void access$2700(a1 a1Var, p.b bVar) {
    }

    public static /* synthetic */ void access$2800(a1 a1Var) {
    }

    public static /* synthetic */ void access$2900(a1 a1Var, int i2) {
    }

    public static /* synthetic */ void access$3000(a1 a1Var) {
    }

    public static /* synthetic */ void access$3100(a1 a1Var, String str) {
    }

    public static /* synthetic */ void access$3200(a1 a1Var) {
    }

    public static /* synthetic */ void access$3300(a1 a1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3400(a1 a1Var, String str) {
    }

    public static /* synthetic */ void access$3500(a1 a1Var) {
    }

    public static /* synthetic */ void access$3600(a1 a1Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$3700(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$3800(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$3900(a1 a1Var) {
    }

    public static /* synthetic */ void access$4000(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$4100(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$4200(a1 a1Var) {
    }

    public static /* synthetic */ void access$4300(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$4400(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$4500(a1 a1Var) {
    }

    public static /* synthetic */ void access$4600(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$4700(a1 a1Var, b1 b1Var) {
    }

    public static /* synthetic */ void access$4800(a1 a1Var) {
    }

    public static /* synthetic */ a1 access$800() {
    }

    public static /* synthetic */ void access$900(a1 a1Var, int i2) {
    }

    private void clearAuthKey() {
    }

    private void clearExpireTime() {
    }

    private void clearFrontID() {
    }

    private void clearFrontIP1() {
    }

    private void clearFrontIP1PortList() {
    }

    private void clearFrontIP2() {
    }

    private void clearFrontIP2PortList() {
    }

    private void clearUin() {
    }

    private void clearVer() {
    }

    private void clearZoneDomain() {
    }

    private void clearZoneID() {
    }

    private void clearZoneIP1() {
    }

    private void clearZoneIP1PortList() {
    }

    private void clearZoneIP2() {
    }

    private void clearZoneIP2PortList() {
    }

    public static a1 getDefaultInstance() {
    }

    private void mergeAuthKey(p.b bVar) {
    }

    private void mergeFrontIP1PortList(b1 b1Var) {
    }

    private void mergeFrontIP2PortList(b1 b1Var) {
    }

    private void mergeZoneIP1PortList(b1 b1Var) {
    }

    private void mergeZoneIP2PortList(b1 b1Var) {
    }

    public static a newBuilder() {
    }

    public static a1 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static a1 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<a1> parser() {
    }

    private void setAuthKey(p.b bVar) {
    }

    private void setExpireTime(int i2) {
    }

    private void setFrontID(int i2) {
    }

    private void setFrontIP1(String str) {
    }

    private void setFrontIP1Bytes(k.d.c.i iVar) {
    }

    private void setFrontIP1PortList(b1 b1Var) {
    }

    private void setFrontIP2(String str) {
    }

    private void setFrontIP2Bytes(k.d.c.i iVar) {
    }

    private void setFrontIP2PortList(b1 b1Var) {
    }

    private void setUin(int i2) {
    }

    private void setVer(int i2) {
    }

    private void setZoneDomain(String str) {
    }

    private void setZoneDomainBytes(k.d.c.i iVar) {
    }

    private void setZoneID(int i2) {
    }

    private void setZoneIP1(String str) {
    }

    private void setZoneIP1Bytes(k.d.c.i iVar) {
    }

    private void setZoneIP1PortList(b1 b1Var) {
    }

    private void setZoneIP2(String str) {
    }

    private void setZoneIP2Bytes(k.d.c.i iVar) {
    }

    private void setZoneIP2PortList(b1 b1Var) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public p.b getAuthKey() {
    }

    public int getExpireTime() {
    }

    public int getFrontID() {
    }

    public String getFrontIP1() {
    }

    public k.d.c.i getFrontIP1Bytes() {
    }

    public b1 getFrontIP1PortList() {
    }

    public String getFrontIP2() {
    }

    public k.d.c.i getFrontIP2Bytes() {
    }

    public b1 getFrontIP2PortList() {
    }

    public int getUin() {
    }

    public int getVer() {
    }

    public String getZoneDomain() {
    }

    public k.d.c.i getZoneDomainBytes() {
    }

    public int getZoneID() {
    }

    public String getZoneIP1() {
    }

    public k.d.c.i getZoneIP1Bytes() {
    }

    public b1 getZoneIP1PortList() {
    }

    public String getZoneIP2() {
    }

    public k.d.c.i getZoneIP2Bytes() {
    }

    public b1 getZoneIP2PortList() {
    }

    public boolean hasAuthKey() {
    }

    public boolean hasExpireTime() {
    }

    public boolean hasFrontID() {
    }

    public boolean hasFrontIP1() {
    }

    public boolean hasFrontIP1PortList() {
    }

    public boolean hasFrontIP2() {
    }

    public boolean hasFrontIP2PortList() {
    }

    public boolean hasUin() {
    }

    public boolean hasVer() {
    }

    public boolean hasZoneDomain() {
    }

    public boolean hasZoneID() {
    }

    public boolean hasZoneIP1() {
    }

    public boolean hasZoneIP1PortList() {
    }

    public boolean hasZoneIP2() {
    }

    public boolean hasZoneIP2PortList() {
    }

    public static a newBuilder(a1 a1Var) {
    }

    public static a1 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static a1 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static a1 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static a1 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static a1 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static a1 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static a1 parseFrom(InputStream inputStream) throws IOException {
    }

    public static a1 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static a1 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static a1 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
