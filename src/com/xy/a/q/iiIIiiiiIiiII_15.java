/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIiIiiiiIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIiiiiIiiII
extends JComponent
implements MouseListener {
    private JLabel iiiiIiiiIiiII;
    private IIIiiiiiIiIiI iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    final /* synthetic */ iiIiIiiiiIiii iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    static /* synthetic */ int ALLATORIxDEMO(iiIIiiiiIiiII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(String key, String value) {
        this.IIiiIiiiIIiIi.setText(key);
        this.iiiiIiiiIiiII.setText(value);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public void ALLATORIxDEMO(boolean lock) {
        if (this.iIiiIiiiiiiII == null) {
            return;
        }
        if (this.iIiiIiiiiiiII.ALLATORIxDEMO() != null && this.IiiiiiiiIIIII == lock) {
            return;
        }
        this.IiiiiiiiIIIII = lock;
        this.iIiiIiiiiiiII.iIiIiiiiIIiii(lock ? "sc/e/30.png" : "sc/e/29.png");
    }

    /*
     * WARNING - void declaration
     */
    public iiIIiiiiIiiII(iiIiIiiiiIiii iiIiIiiiiIiii2, boolean bl, int n) {
        void index;
        void left;
        this.iIiIiiiiIiIii = iiIiIiiiiIiii2;
        this.ALLATORIxDEMO = left;
        this.iiIiiiiiiiIii = index;
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)9, (int)0, (int)126, (int)28, (Color)(left != false ? Color.white : Color.green), (Font)com.xy.q.iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)139, (int)0, (int)81, (int)28, (Color)(left != false ? Color.white : Color.green), (Font)com.xy.q.iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.add(this.IIiiIiiiIIiIi);
        this.add(this.iiiiIiiiIiiII);
        if (left != false) {
            this.iIiiIiiiiiiII = new IIIiiiiiIiIiI();
            this.iIiiIiiiiiiII.setBounds(112, 5, 17, 17);
            this.add((Component)this.iIiiIiiiiiiII);
            this.addMouseListener(this);
        }
        this.iiiIiiiiiiiIi.setBounds(0, 0, 135, 28);
        this.IiIIIiiiiIiiI.setBounds(136, 0, 55, 28);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    static /* synthetic */ boolean iIiIiiiiIIiii(iiIIiiiiIiiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ boolean ALLATORIxDEMO(iiIIiiiiIiiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(iiIIiiiiIiiII arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
