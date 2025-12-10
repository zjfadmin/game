/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.richtext.RichLabel
 */
package com.xy.a;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.richtext.RichLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiiiiiIIIiI
extends RichLabel {
    final /* synthetic */ iiIiiiiiIIiiI ALLATORIxDEMO;

    public void paintComponent(Graphics g) {
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(g);
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
    }

    /*
     * WARNING - void declaration
     */
    IiIiiiiiIIIiI(iiIiiiiiIIiiI iiIiiiiiIIiiI2, String string, Font font, int n) {
        void $anonymous2;
        void $anonymous1;
        void $anonymous0;
        this.ALLATORIxDEMO = iiIiiiiiIIiiI2;
        super((String)$anonymous0, (Font)$anonymous1, (int)$anonymous2);
    }
}
