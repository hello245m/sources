package k.i.k.p.e;

import com.tencent.rmonitor.base.meta.InspectUUID;
import com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a implements IMemoryLeakListener {
    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener
    public void onCheckingLeaked(int i2, String str) {
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener
    public boolean onFilter(Object obj) {
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener
    public void onFinishDump(boolean z, String str, String str2) {
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener
    public void onHprofDumped(String str) {
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener
    public boolean onLeaked(InspectUUID inspectUUID) {
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener
    public List<String> onPrepareDump(String str) {
    }
}
