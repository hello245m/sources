package k.a.a.p.r.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface u {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a implements u {
        public final k.a.a.p.o.k a;
        public final k.a.a.p.p.a0.b b;
        public final List<ImageHeaderParser> c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, k.a.a.p.p.a0.b bVar) {
        }

        @Override // k.a.a.p.r.d.u
        public int a() throws IOException {
        }

        @Override // k.a.a.p.r.d.u
        public Bitmap b(BitmapFactory.Options options) throws IOException {
        }

        @Override // k.a.a.p.r.d.u
        public void c() {
        }

        @Override // k.a.a.p.r.d.u
        public ImageHeaderParser.ImageType d() throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b implements u {
        public final k.a.a.p.p.a0.b a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, k.a.a.p.p.a0.b bVar) {
        }

        @Override // k.a.a.p.r.d.u
        public int a() throws IOException {
        }

        @Override // k.a.a.p.r.d.u
        public Bitmap b(BitmapFactory.Options options) throws IOException {
        }

        @Override // k.a.a.p.r.d.u
        public void c() {
        }

        @Override // k.a.a.p.r.d.u
        public ImageHeaderParser.ImageType d() throws IOException {
        }
    }

    int a() throws IOException;

    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
