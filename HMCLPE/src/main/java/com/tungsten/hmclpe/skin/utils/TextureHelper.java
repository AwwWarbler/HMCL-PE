package com.tungsten.hmclpe.skin.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;

import javax.microedition.khronos.opengles.GL10;

public class TextureHelper
{
    public static boolean isLoadingError;
    
    static {
        TextureHelper.isLoadingError = false;
    }
    
    public static int loadGLTextureFromBitmap(final Bitmap bitmap, final GL10 gl10) {
        final int[] array = { 0 };
        gl10.glGenTextures(1, array, 0);
        gl10.glBindTexture(3553, array[0]);
        gl10.glTexParameterf(3553, 10241, 9728.0f);
        gl10.glTexParameterf(3553, 10240, 9728.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return array[0];
    }
    
    public static int loadTexture(final Context context, final int n) {
        TextureHelper.isLoadingError = false;
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        if (array[0] != 0) {
            final BitmapFactory.Options bitmapFactory = new BitmapFactory.Options();
            bitmapFactory.inScaled = false;
            final Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), n, bitmapFactory);
            GLES20.glBindTexture(3553, array[0]);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameterf(3553, 10240, 9728.0f);
            GLUtils.texImage2D(3553, 0, decodeResource, 0);
            decodeResource.recycle();
        }
        if (array[0] == 0) {
            throw new RuntimeException("Error loading texture.");
        }
        return array[0];
    }
    
    public static int loadTexture(final Context context, final Bitmap bitmap) {
        TextureHelper.isLoadingError = false;
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        if (array[0] != 0) {
            new BitmapFactory.Options().inScaled = false;
            GLES20.glBindTexture(3553, array[0]);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameterf(3553, 10240, 9728.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
        }
        if (array[0] == 0) {
            throw new RuntimeException("Error loading texture.");
        }
        return array[0];
    }
    
    public static int loadTextureFromBitmap(final Bitmap bitmap) {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        if (array[0] != 0) {
            GLES20.glBindTexture(3553, array[0]);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9728.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
        }
        if (array[0] == 0) {
            throw new RuntimeException("Error loading texture.");
        }
        return array[0];
    }
    
    public static int loadTextureFromFile(final String s, int n) {
        TextureHelper.isLoadingError = false;
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        Label_0083: {
            if (array[0] == 0) {
                break Label_0083;
            }
            while (true) {
                final BitmapFactory.Options bitmapFactory = new BitmapFactory.Options();
                bitmapFactory.inScaled = false;
                try {
                    final Bitmap decodeFile = BitmapFactory.decodeFile(s, bitmapFactory);
                    GLES20.glBindTexture(3553, array[0]);
                    GLES20.glTexParameterf(3553, 10241, 9728.0f);
                    GLES20.glTexParameterf(3553, 10240, 9728.0f);
                    GLUtils.texImage2D(3553, 0, decodeFile, 0);
                    decodeFile.recycle();
                    if (array[0] == 0) {
                        TextureHelper.isLoadingError = true;
                        return n;
                    }
                }
                catch (Exception ex) {
                    TextureHelper.isLoadingError = true;
                    return n;
                }
                n = array[0];
                return n;
            }
        }
        return n;
    }
}
