package com.company;

import javax.naming.Context;
import java.io.File;

public class checkType {
    public static String getMimeType(String url) {
        String type = null;
        String extension = MimeTypeMap.getFileExtensionFromUrl(url);
        if (extension != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
        }
        return type;
    }
    public static void main(String[] args) {

    }
}
