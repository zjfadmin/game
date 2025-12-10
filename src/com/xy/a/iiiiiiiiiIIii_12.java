/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.i.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.IiIiIiiiIIiiI;
import com.xy.i.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiiiiiiiIIii
extends JComponent {
    Image[] IiIIIiiiiIiiI;
    iiIIiiiiIiiII[] iiIiiiiiiiIii;
    final /* synthetic */ IiIiIiiiIIiiI IiiiiiiiIIIII;
    Image ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/53");

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            if (this.IiIIIiiiiIiiI[IiiiiiiiIIIII] == null) {
                return;
            }
            g.drawImage(this.ALLATORIxDEMO, IiiiiiiiIIIII * 71, 0, null);
            Image image = this.IiIIIiiiiIiiI[IiiiiiiiIIIII];
            int n = IiiiiiiiIIIII * 71 + 7;
            ++IiiiiiiiIIIII;
            g.drawImage(image, n, 7, 60, 60, null);
        }
    }

    public iiiiiiiiiIIii(IiIiIiiiIIiiI iiIiIiiiIIiiI) {
        this.IiiiiiiiIIIII = iiIiIiiiIIiiI;
        this.IiIIIiiiiIiiI = new Image[5];
        this.iiIiiiiiiiIii = new iiIIiiiiIiiII[4];
        this.setVisible(false);
    }
}
