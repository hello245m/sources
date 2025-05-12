package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import i.a.a.a.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends a.AbstractBinderC0102a {
        public final /* synthetic */ NotificationCompatSideChannelService a;

        public a(NotificationCompatSideChannelService notificationCompatSideChannelService) {
        }

        @Override // i.a.a.a.a
        public void d(String str) {
        }

        @Override // i.a.a.a.a
        public void k(String str, int i2, String str2) throws RemoteException {
        }

        @Override // i.a.a.a.a
        public void n(String str, int i2, String str2, Notification notification) throws RemoteException {
        }
    }

    public abstract void a(String str, int i2, String str2);

    public abstract void b(String str);

    public void c(int i2, String str) {
    }

    public abstract void d(String str, int i2, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }
}
