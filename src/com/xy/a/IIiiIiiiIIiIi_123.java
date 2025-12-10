/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iIiIiiiiiiiIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiIIiIi
implements MouseListener {
    private JLabel iIiIiiiiIiIii;
    final /* synthetic */ iIiIiiiiiiiIi IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(IIiiIiiiIIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public IIiiIiiiIIiIi(iIiIiiiiiiiIi iIiIiiiiiiiIi2, int n, iIiIiiiiiiiIi iIiIiiiiiiiIi3) {
        void view;
        void index;
        this.IiIIIiiiiIiiI = iIiIiiiiiiiIi2;
        this.IiiiiiiiIIIII = index;
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Color)iiIIiiiiIiiII.IiiIiiiiIiiiI, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIiIiiiiIiIii.setText(index == false ? "\u5168\u90e8" : (index == true ? "\u4f20\u9001" : (index == 2 ? "\u666e\u901a" : (index == 3 ? "\u4efb\u52a1" : (index == 4 ? "\u5546\u4e1a" : "")))));
        this.iiIiiiiiiiIii = index == true;
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(this.iiIiiiiiiiIii ? "sc/e/109.png" : "sc/e/108.png");
        this.ALLATORIxDEMO.addMouseListener((MouseListener)this);
        view.add((Component)this.iIiIiiiiIiIii);
        view.add((Component)this.ALLATORIxDEMO);
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(IIiiIiiiIIiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.iiIiiiiiiiIii = !this.iiIiiiiiiiIii;
        this.ALLATORIxDEMO.iIiIiiiiIIiii(this.iiIiiiiiiiIii ? "sc/e/109.png" : "sc/e/108.png");
        int IiiiiiiiIIIII = this.IiiiiiiiIIIII == 0 ? 1 : iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI).length;
        while (IiiiiiiiIIIII < iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI).length) {
            iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI)[IiiiiiiiIIIII].iiIiiiiiiiIii = this.iiIiiiiiiiIii;
            iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI)[IiiiiiiiIIIII].ALLATORIxDEMO.iIiIiiiiIIiii(iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI)[IiiiiiiiIIIII].iiIiiiiiiiIii ? "sc/e/109.png" : "sc/e/108.png");
            ++IiiiiiiiIIIII;
        }
        this.IiIIIiiiiIiiI.IiiIiiiiiiIiI();
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    static /* synthetic */ boolean ALLATORIxDEMO(IIiiIiiiIIiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }
}
