/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.w.IIiIiiiiIIiii;
import java.awt.Graphics;
import javax.swing.JPasswordField;

public class IiiIiiiiIiIIi
extends JPasswordField {
    protected IIiIiiiiIIiii ALLATORIxDEMO;

    @Override
    public void paintImmediately(int x, int y, int w, int h) {
    }

    public IiiIiiiiIiIIi(IIiIiiiiIIiii imgCut) {
        this.ALLATORIxDEMO = imgCut;
    }

    public IiiIiiiiIiIIi() {
    }

    public void ALLATORIxDEMO(IIiIiiiiIIiii imgCut) {
        this.ALLATORIxDEMO = imgCut;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
            g.translate(2, 0);
            super.paintComponent(g);
            g.translate(-2, 0);
            return;
        }
        super.paintComponent(g);
    }
}
