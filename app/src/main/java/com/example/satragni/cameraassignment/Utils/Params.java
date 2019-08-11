package com.example.satragni.cameraassignment.Utils;

import android.os.Build;

public class Params {


    public static final String TAG = "++JPR++";
    public static final int CAMERA_REQUEST_EDIT_PROFILE = 111;
    public static final int GALLERY_PICTURE_EDIT_PROFILE = 112;
    public static final int MY_PERMISSIONS_WRITE_EXTERNAL_STORAGE = 117;

    public static final String MANUFACTURER = Build.MANUFACTURER.toLowerCase();
    public static final String DEVICE_MODEL = Build.MODEL.toLowerCase();

    private static String getUserAgent() {
        try {
            return Build.MANUFACTURER.toLowerCase() + " " + Build.MODEL.toLowerCase();
        } catch (Exception e) {
            return "Android Device";
        }
    }


}
