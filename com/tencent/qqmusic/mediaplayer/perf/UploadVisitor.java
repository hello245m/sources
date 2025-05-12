package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class UploadVisitor implements PerformanceTracer.Visitor, Collectable {
    private HashMap<String, Long> prefInfos;

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(ErrorUploadCollector errorUploadCollector) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(PlayerInfoCollector playerInfoCollector) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor
    public void visitSpeedCheck(List<PerformanceTracer.SpeedCheck> list, PerformanceTracer.OverallInfo overallInfo) {
    }
}
