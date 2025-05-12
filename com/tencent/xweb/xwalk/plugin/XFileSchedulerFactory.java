package com.tencent.xweb.xwalk.plugin;

import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.SchedulerConfig;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XFileSchedulerFactory {
    public static final HashMap<String, XFileScheduler> sMapSchedulers = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class XFileScheduler extends Scheduler {
        public String mStrPluginName;

        public XFileScheduler(String str) {
        }

        @Override // com.tencent.xweb.util.Scheduler
        public String getCustomCurHourSpeedConfig(boolean z) {
        }

        @Override // com.tencent.xweb.util.Scheduler
        public String getCustomTimeRangeBindConfig() {
        }

        @Override // com.tencent.xweb.util.Scheduler
        public String getFreeFetchConfigZoneConfig() {
        }

        @Override // com.tencent.xweb.util.Scheduler
        public int getIdkeyOffsetFromDefault() {
        }

        @Override // com.tencent.xweb.util.Scheduler
        public String getScheduleType() {
        }

        @Override // com.tencent.xweb.util.Scheduler
        public boolean isSameScheduler(SchedulerConfig schedulerConfig, SchedulerConfig schedulerConfig2) {
        }
    }

    public static synchronized XFileScheduler getScheduler(String str) {
    }
}
