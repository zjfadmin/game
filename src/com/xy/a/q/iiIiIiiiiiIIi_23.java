/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiiIiiiiIIIii
 *  com.xy.a.q.iIIIIiiiIiiIi
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiiIiiiiIIIii;
import com.xy.a.q.iIIIIiiiIiiIi;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiiiIIi
extends JComponent
implements MouseListener {
    final /* synthetic */ iIIIIiiiIiiIi IiIIIiiiiIiiI;
    private IiiIiiiiIIIii[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public iiIiIiiiiiIIi(iIIIIiiiIiiIi iIIIIiiiIiiIi2) {
        this.IiIIIiiiiIiiI = iIIIIiiiIiiIi2;
        this.IiiiiiiiIIIII.setBounds(9, 9, 206, 104);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iiIiiiiiiiIii = new IiiIiiiiIIIii[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiiIiiiiIIIii(iIIIIiiiIiiIi2, IiiiiiiiIIIII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(10 + IiiiiiiiIIIII % 4 * 51, 10 + IiiiiiiiIIIII / 4 * 51, 51, 51);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        this.ALLATORIxDEMO.setBounds(0, 0, 224, 122);
        this.add((Component)this.ALLATORIxDEMO);
        this.addMouseListener(this);
    }
}
