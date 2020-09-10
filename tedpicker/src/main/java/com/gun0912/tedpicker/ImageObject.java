package com.gun0912.tedpicker;

import android.net.Uri;

/**
 * Created by LENOVO on 2/27/2020.
 */

public class ImageObject {

    private Uri originalUri;
    private Uri compressUri;

    public ImageObject(Uri originalUri) {
        this.originalUri = originalUri;
    }

    public ImageObject(Uri originalUri, Uri compressUri) {
        this.originalUri = originalUri;
        this.compressUri = compressUri;
    }

    public Uri getOriginalUri() {
        return originalUri;
    }

    public void setOriginalUri(Uri originalUri) {
        this.originalUri = originalUri;
    }

    public Uri getCompressUri() {
        return compressUri;
    }

    public void setCompressUri(Uri compressUri) {
        this.compressUri = compressUri;
    }
}
