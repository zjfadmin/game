/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiIiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iiiIiiiiIiIiI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIIiiiiiiii
implements MouseListener {
    private JLabel IiiiiiiiIIIII;
    final /* synthetic */ iiiIiiiiIiIiI ALLATORIxDEMO;

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public iiiIIiiiiiiii(iiiIiiiiIiIiI iiiIiiiiIiIiI2, JLabel jLabel) {
        this.ALLATORIxDEMO = iiiIiiiiIiIiI2;
        this.IiiiiiiiIIIII = jLabel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = this.IiiiiiiiIIIII.getText().equals("\u9996\u9875") ? 0 : (this.IiiiiiiiIIIII.getText().equals("\u5c3e\u9875") ? (iiiIiiiiIiIiI.ALLATORIxDEMO((iiiIiiiiIiIiI)this.ALLATORIxDEMO).size() - 1) / 24 : Integer.parseInt(this.IiiiiiiiIIIII.getText()) - 1);
        if (IiiiiiiiIIIII == iiiIiiiiIiIiI.ALLATORIxDEMO((iiiIiiiiIiIiI)this.ALLATORIxDEMO)) return;
        this.ALLATORIxDEMO.iIiIiiiiIIiii(IiiiiiiiIIIII);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
