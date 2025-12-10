/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIiIIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IIiIIiiiIIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class iiiIiiiiIiiiI
extends IIIiiiiiIiIiI
implements MouseListener {
    private BigDecimal iiIiiiiiiiIii;
    final /* synthetic */ IIiIIiiiIIIiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;
    private Image ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    static /* synthetic */ void ALLATORIxDEMO(iiiIiiiiIiiiI arg0, Image arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.IiiiiiiiIIIII.ALLATORIxDEMO(this);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.ALLATORIxDEMO == null) return;
        g.drawImage(this.ALLATORIxDEMO, 2, 2, 65, 85, null);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    static /* synthetic */ void ALLATORIxDEMO(iiiIiiiiIiiiI arg0, BigDecimal arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    static /* synthetic */ BigDecimal ALLATORIxDEMO(iiiIiiiiIiiiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public iiiIiiiiIiiiI(IIiIIiiiIIIiI iIiIIiiiIIIiI, int index) {
        this.IiiiiiiiIIIII = iIiIIiiiIIIiI;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.ALLATORIxDEMO = index;
        this.addMouseListener(this);
    }
}
