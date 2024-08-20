/*
 * Copyright (c) 2024 lingyicute.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package code.name.monkey.retromusic.glide.palette;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

import code.name.monkey.retromusic.util.RetroColorUtil;

public class BitmapPaletteTranscoder implements ResourceTranscoder<Bitmap,  BitmapPaletteWrapper> {

    @Override
  public Resource<BitmapPaletteWrapper> transcode(@NonNull Resource<Bitmap> toTranscode, @NonNull Options options) {
    Bitmap bitmap = toTranscode.get();
    BitmapPaletteWrapper bitmapPaletteWrapper =
            new BitmapPaletteWrapper(bitmap, RetroColorUtil.generatePalette(bitmap));
    return new BitmapPaletteResource(bitmapPaletteWrapper);
  }
}
