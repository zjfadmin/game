/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Graphics;
import javax.swing.JLabel;

public class iIIiIiiiIiiIi
extends JLabel {
    protected boolean IiiiiiiiIIIII = true;
    protected IIiIiiiiIIiii ALLATORIxDEMO;

    @Override
    public void setText(String text) {
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)text, (String)this.getText())) {
            return;
        }
        super.setText(text);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void setHorizontalAlignment(int n) {
        void alignment;
        super.setHorizontalAlignment((int)alignment);
        this.IiiiiiiiIIIII = alignment != false;
    }

    public iIIiIiiiIiiIi(IIiIiiiiIIiii imgCut) {
        this.ALLATORIxDEMO = imgCut;
    }

    public void ALLATORIxDEMO(IIiIiiiiIIiii imgCut) {
        this.ALLATORIxDEMO = imgCut;
    }

    public iIIiIiiiIiiIi() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
        }
        if (this.IiiiiiiiIIIII) {
            g.translate(2, 0);
            super.paintComponent(g);
            g.translate(-2, 0);
            return;
        }
        super.paintComponent(g);
    }
}
