/*
 * Decompiled with CFR 0.152.
 */
package com.xy.richtext;

import java.awt.Image;

public class RichBeauUnit {
    private transient boolean isM;
    private int bh;
    private transient Image image;

    public int getWidth() {
        return this.image.getWidth(null);
    }

    public boolean isM() {
        return this.isM;
    }

    public Image getImage() {
        return this.image;
    }

    public int getBh() {
        return this.bh;
    }

    public int getHeight() {
        return this.image.getHeight(null);
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public RichBeauUnit() {
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    public RichBeauUnit(int bh) {
        if (bh < 0 || bh > 9) {
            bh = 0;
        }
        this.bh = bh;
    }

    public void setM(boolean isM) {
        this.isM = isM;
    }
}
