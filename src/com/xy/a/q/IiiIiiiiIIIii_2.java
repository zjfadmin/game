/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIIIIiiiIiiIi
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.iIIIIiiiIiiIi;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIiiiiIIIii
extends JComponent
implements MouseListener {
    private int iiIiiiiiiiIii;
    private Image IiiiiiiiIIIII;
    final /* synthetic */ iIIIIiiiIiiIi ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public IiiIiiiiIIIii(iIIIIiiiIiiIi iIIIIiiiIiiIi2, int index) {
        this.ALLATORIxDEMO = iIIIIiiiIiiIi2;
        this.iiIiiiiiiiIii = index;
        this.IiiiiiiiIIIII = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)String.valueOf(746 + index * 3));
        this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(iIIIIiiiIiiIi.ALLATORIxDEMO(), 0, 0, this.getWidth(), this.getHeight(), null);
        g.drawImage(this.IiiiiiiiIIIII, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.ALLATORIxDEMO)[2].ALLATORIxDEMO(16, (Object)(746 + this.iiIiiiiiiiIii * 3));
        iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.ALLATORIxDEMO, (boolean)false);
    }
}
