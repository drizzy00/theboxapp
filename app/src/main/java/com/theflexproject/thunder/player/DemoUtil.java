package com.theflexproject.thunder.player;

import android.content.Context;

import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.DataSource;

/** Utility methods for the demo app. */
public final class DemoUtil {

    private static final String TAG = "DemoUtil";

    public static RenderersFactory buildRenderersFactory(
            Context context, boolean preferExtensionRenderer) {
        @DefaultRenderersFactory.ExtensionRendererMode
        int extensionRendererMode = DefaultRenderersFactory.EXTENSION_RENDERER_MODE_ON;
        return new DefaultRenderersFactory(context.getApplicationContext())
                .setExtensionRendererMode(extensionRendererMode);
    }

    public static DataSource.Factory getHttpDataSourceFactory(Context context) {
        // You can keep this as is if needed
        return new DefaultHttpDataSource.Factory();
    }

    public static DataSource.Factory getDataSourceFactory(Context context) {
        context = context.getApplicationContext();
        return new DefaultDataSource.Factory(context, getHttpDataSourceFactory(context));
    }

    private DemoUtil() {}
}
