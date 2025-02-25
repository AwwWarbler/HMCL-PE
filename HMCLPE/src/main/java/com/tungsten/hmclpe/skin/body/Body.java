package com.tungsten.hmclpe.skin.body;

import com.tungsten.hmclpe.skin.Cube;

public class Body extends Cube
{
    protected float[] body_texcoords;
    protected float[] jacket_texcoords;
    
    public Body() {
        super(8.0f, 12.0f, 4.0f, 0.0f, 2.0f, 0.0f, -0.15f, 0.0f, 1.0f, 0.0f, 3.0f, -3.0f);
        this.body_texcoords = new float[] { 0.3125f, 0.5f, 0.3125f, 0.3125f, 0.4375f, 0.3125f, 0.4375f, 0.5f, 0.3125f, 0.3125f, 0.3125f, 0.25f, 0.4375f, 0.25f, 0.4375f, 0.3125f, 0.4375f, 0.3125f, 0.4375f, 0.25f, 0.5625f, 0.25f, 0.5625f, 0.3125f, 0.4375f, 0.5f, 0.4375f, 0.3125f, 0.5f, 0.3125f, 0.5f, 0.5f, 0.25f, 0.5f, 0.25f, 0.3125f, 0.3125f, 0.3125f, 0.3125f, 0.5f, 0.5f, 0.5f, 0.5f, 0.3125f, 0.625f, 0.3125f, 0.625f, 0.5f };
        this.jacket_texcoords = new float[] { 0.3125f, 16.5f, 0.3125f, 16.3125f, 0.4375f, 16.3125f, 0.4375f, 16.5f, 0.3125f, 16.3125f, 0.3125f, 16.25f, 0.4375f, 16.25f, 0.4375f, 16.3125f, 0.4375f, 16.3125f, 0.4375f, 16.25f, 0.5625f, 16.25f, 0.5625f, 16.3125f, 0.4375f, 16.5f, 0.4375f, 16.3125f, 0.5f, 16.3125f, 0.5f, 16.5f, 0.25f, 16.5f, 0.25f, 16.3125f, 0.3125f, 16.3125f, 0.3125f, 16.5f, 0.5f, 16.5f, 0.5f, 16.3125f, 0.625f, 16.3125f, 0.625f, 16.5f };
        this.AddTextures(this.body_texcoords);
    }
}
