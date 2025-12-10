/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIIIiiiiiIII
 *  com.xy.a.i.IIIIIiiiIiiII
 *  com.xy.a.i.IIiIiiiiIiIII
 *  com.xy.a.q.IiIIIiiiiiiIi
 *  com.xy.a.q.IiIiIiiiiIIiI
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.q.IIIiIiiiiIIiI
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.a.iiIIIiiiiiIII;
import com.xy.a.i.IIIIIiiiIiiII;
import com.xy.a.i.IIiIiiiiIiIII;
import com.xy.a.q.IiIIIiiiiiiIi;
import com.xy.a.q.IiIiIiiiiIIiI;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IIIiIiiiiIIiI;
import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiIiI;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class IiiiIiiiiIiII
extends JComponent
implements MouseListener {
    public IiiiIiiiiIiIi iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    public IIIiIiiiiIiII iIiIiiiiIiIii;
    public iiIIiiiiIiIiI IiIIIiiiiIiiI;
    public Object iiIiiiiiiiIii;
    public IIIiIiiiiIIiI IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public Object ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() != 3) return;
        if (this.iIiiIiiiiiiII instanceof IiIIIiiiiiiIi) {
            ((IiIIIiiiiiiIi)this.iIiiIiiiiiiII).iiiIiiiiiiIIi(false);
            return;
        }
        if (this.iIiiIiiiiiiII instanceof IIIIIiiiIiiII) {
            ((IIIIIiiiIiiII)this.iIiiIiiiiiiII).iiiIiiiiiiIIi(false);
            return;
        }
        if (this.iIiiIiiiiiiII instanceof IIiIiiiiIiIII) {
            ((IIiIiiiiIiIII)this.iIiiIiiiiiiII).iiiIiiiiiiIIi(false);
            return;
        }
        if (this.iIiiIiiiiiiII instanceof iiIIIiiiiiIII) {
            ((iiIIIiiiiiIII)this.iIiiIiiiiiiII).iiiIiiiiiiIIi(false);
            return;
        }
        if (!(this.iIiiIiiiiiiII instanceof IiIiIiiiiIIiI)) return;
        ((IiIiIiiiiIIiI)this.iIiiIiiiiiiII).iiiIiiiiiiIIi(false);
    }

    public IiiiIiiiiIiII(IiiiIiiiiIiIi form) {
        this.iIiiIiiiiiiII = form;
        if (!(form instanceof iiIIIiiiiiIII) && !(form instanceof IiIiIiiiiIIiI)) {
            this.iIiIiiiiIiIii = new IIIiIiiiiIiII(0, 100, form);
            this.iIiIiiiiIiIii.ALLATORIxDEMO(10, 122, 150, 20);
            this.add((Component)this.iIiIiiiiIiIii);
        }
        IIiiIiiiIiiiI[] IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII[IiiiiiiiIIIII2] = new IIiiIiiiIiiiI(IiiiiiiiIIIII2 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII2, form);
            IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(280 + IiiiiiiiIIIII2 * 20, 123, 18, 18);
            this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII2++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.ALLATORIxDEMO.setBounds(9, 13, 309, 105);
        this.add((Component)this.ALLATORIxDEMO);
        if (form instanceof iiIIIiiiiiIII || form instanceof IiIiIiiiiIIiI) {
            this.IiiiiiiiIIIII = new IIIiIiiiiIIiI(form, 6, 2, 51, 51, 0, 0, 10, 15);
            this.IiiiiiiiIIIII.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
            this.IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
            this.add((Component)this.IiiiiiiiIIIII);
        } else {
            this.IiIIIiiiiIiiI = new iiIIiiiiIiIiI(form, 6, 2, 51, 51, 0, 0, 10, 15);
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
            this.IiIIIiiiiIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
            this.add((Component)this.IiIIIiiiiIiiI);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(0, 0, 330, 150);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
