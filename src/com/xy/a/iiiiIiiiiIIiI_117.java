/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiIiiiIiIIi
 *  com.xy.w.IIIIIiiiIiIii
 */
package com.xy.a;

import com.xy.a.IIiiIiiiIiIIi;
import com.xy.w.IIIIIiiiIiIii;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiiIiiiiIIiI
extends JComponent {
    final /* synthetic */ IIiiIiiiIiIIi ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.ALLATORIxDEMO);
        IiiiiiiiIIIII.setColor(Color.BLACK);
        IiiiiiiiIIIII.fill(this.getBounds());
        IiiiiiiiIIIII.dispose();
    }

    iiiiIiiiiIIiI(IIiiIiiiIiIIi iIiiIiiiIiIIi) {
        this.ALLATORIxDEMO = iIiiIiiiIiIIi;
    }
}
