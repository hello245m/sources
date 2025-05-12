package k.i.d.b.c.a.d;

import com.tencent.mars.stn.StnLogic;
import java.io.ByteArrayOutputStream;
import n.d0.c.q;
import n.d0.d.o;
import n.d0.d.z;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class b implements StnLogic.ICallBack {
    public final c a;
    public final e b;
    public volatile boolean c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends o implements q<byte[], Integer, Integer, u> {
        public final /* synthetic */ z a;
        public final /* synthetic */ k.i.d.b.c.a.a.c b;
        public final /* synthetic */ int c;

        public a(z zVar, k.i.d.b.c.a.a.c cVar, int i2) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ u a(byte[] bArr, Integer num, Integer num2) {
        }

        public final void b(byte[] bArr, int i2, int i3) {
        }
    }

    public b(c cVar) {
    }

    public final c a() {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public int buf2Resp(int i2, Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i3) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public boolean isLogoned() {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public boolean makesureAuthed(String str) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public void networkAnalysisCallBack(int i2, int i3, boolean z, String str) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public boolean onLongLinkIdentifyResp(String str, byte[] bArr, byte[] bArr2) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public String[] onNewDns(String str) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public void onPush(String str, int i2, int i3, byte[] bArr) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public int onTaskEnd(int i2, Object obj, int i3, int i4) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public void reportConnectInfo(int i2, int i3) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public boolean req2Buf(int i2, Object obj, ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i3, String str) {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public void requestDoSync() {
    }

    @Override // com.tencent.mars.stn.StnLogic.ICallBack
    public String[] requestNetCheckShortLinkHosts() {
    }
}
