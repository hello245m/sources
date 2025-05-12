package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class Reporters {

    /* renamed from: com.tencent.qqmusic.mediaplayer.perf.Reporters$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements PerformanceTracer.Visitor {
        public final /* synthetic */ AudioInformation val$audioInformation;
        public final /* synthetic */ Map val$extra;

        public AnonymousClass1(AudioInformation audioInformation, Map map) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor
        public void visitSpeedCheck(List<PerformanceTracer.SpeedCheck> list, PerformanceTracer.OverallInfo overallInfo) {
        }
    }

    public static /* synthetic */ void access$000(List list, StringBuilder sb, long j2) {
    }

    public static PerformanceTracer.Visitor detail(AudioInformation audioInformation, Map<String, String> map) {
    }

    private static void generateDetailedPerformance(List<PerformanceTracer.SpeedCheck> list, StringBuilder sb, long j2) {
    }
}
