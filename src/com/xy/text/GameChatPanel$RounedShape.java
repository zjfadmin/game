/*
 * Decompiled with CFR 0.152.
 */
package com.xy.text;

import java.awt.geom.Path2D;

public class GameChatPanel.RounedShape
extends Path2D.Float {
    private float height;
    private float width;

    public GameChatPanel.RounedShape(float width, float height, float thickness) {
        this.width = width;
        this.height = height;
        this.moveTo(thickness, 0.0f);
        this.lineTo(width - thickness, 0.0f);
        this.curveTo(width - thickness, 0.0f, width, 0.0f, width, thickness);
        this.lineTo(width, height);
        this.lineTo(0.0f, height);
        this.lineTo(0.0f, thickness);
        this.curveTo(0.0f, thickness, 0.0f, 0.0f, thickness, 0.0f);
        this.lineTo(width - thickness, 0.0f);
        this.closePath();
        this.setWindingRule(0);
    }
}
