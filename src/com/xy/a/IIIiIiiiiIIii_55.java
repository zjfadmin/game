/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiIiiiiIiIIi
 */
package com.xy.a;

import com.xy.a.IiiIiiiiIiIIi;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiiIIii
implements MouseListener {
    final /* synthetic */ IiiIiiiiIiIIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public IIIiIiiiiIIii(IiiIiiiiIiIIi iiiIiiiiIiIIi, int index) {
        this.IiiiiiiiIIIII = iiiIiiiiIiIIi;
        this.ALLATORIxDEMO = index;
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        void IiiiiiiiIIIII;
        if (this.ALLATORIxDEMO >= 100) {
            IiiIiiiiIiIIi.ALLATORIxDEMO((IiiIiiiiIiIIi)this.IiiiiiiiIIIII, (int)(this.ALLATORIxDEMO - 100));
            this.IiiiiiiiIIIII.ALLATORIxDEMO();
            return;
        }
        if (e.isMetaDown()) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(this.IiiiiiiiIIIII.iIiIiiiiIIiii());
            return;
        }
        if ((IiiIiiiiIiIIi.ALLATORIxDEMO((IiiIiiiiIiIIi)this.IiiiiiiiIIIII) - 1) * 40 + this.ALLATORIxDEMO > 168) return;
        JTextField jTextField = this.IiiiiiiiIIIII.iiIIiiiiIiIIi.baseView.ALLATORIxDEMO();
        jTextField.setText(String.valueOf(IiiiiiiiIIIII.getText()) + "#" + ((IiiIiiiiIiIIi.ALLATORIxDEMO((IiiIiiiiIiIIi)this.IiiiiiiiIIIII) - 1) * 40 + this.ALLATORIxDEMO));
    }
}
