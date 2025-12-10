/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiIiiiiIIiI
 *  com.xy.a.i.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiIiIiiiiIIiI;
import com.xy.a.i.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiiIi
extends JComponent
implements MouseListener {
    final /* synthetic */ IiiiiiiiiIIII IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
    private IiIiIiiiiIIiI[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public IIiIiiiiIiiIi(IiiiiiiiiIIII iiiiiiiiiIIII) {
        this.IiIIIiiiiIiiI = iiiiiiiiiIIII;
        this.iiIiiiiiiiIii.setBounds(9, 9, 206, 104);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiiiiiiiIIIII = new IiIiIiiiiIIiI[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(iiiiiiiiiIIII, IiiiiiiiIIIII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(10 + IiiiiiiiIIIII % 4 * 51, 10 + IiiiiiiiIIIII / 4 * 51, 51, 51);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        this.ALLATORIxDEMO.setBounds(0, 0, 224, 122);
        this.add((Component)this.ALLATORIxDEMO);
        this.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
