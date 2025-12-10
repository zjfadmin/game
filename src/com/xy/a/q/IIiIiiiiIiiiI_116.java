/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiiiiiiiIii
 *  com.xy.a.q.iIiIiiiiIIIIi
 *  com.xy.game.RolePet
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Buff
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.IIiiiiiiiiIii;
import com.xy.a.q.iIiIiiiiIIIIi;
import com.xy.game.RolePet;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Buff;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiiiI
extends IIIiiiiiIiIiI {
    private JLabel iiIiiiiiiiIii;
    final /* synthetic */ IIiiiiiiiiIii IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    public IIiIiiiiIiiiI(IIiiiiiiiiIii iIiiiiiiiiIii) {
        this.IiiiiiiiIIIII = iIiiiiiiiiIii;
        super(iIiiiiiiiiIii.ALLATORIxDEMO());
        this.ALLATORIxDEMO("sc/d/18.png");
        this.iiIiiiiiiiIii = new JLabel();
        this.iiIiiiiiiiIii.setBounds(0, 29, 49, 20);
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIiiiiiiiIii.setForeground(Color.green);
        this.iiIiiiiiiiIii.setHorizontalAlignment(4);
        this.add(this.iiIiiiiiiiIii);
    }

    public void ALLATORIxDEMO(Buff buff) {
        this.ALLATORIxDEMO(buff != null ? 17 : 0, buff);
        this.setVisible(true);
        this.iiIiiiiiiiIii.setText(buff != null ? buff.getbName() : null);
        this.ALLATORIxDEMO = buff != null ? this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(buff.getbId()) : false;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.ALLATORIxDEMO) return;
        g.drawImage(IIiIiiiiIiiIi.IiiiIiiiIiIII, 33, 0, 16, 16, null);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        Buff IiiiiiiiIIIII = (Buff)this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        RolePet IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.ALLATORIxDEMO().getRolePet(iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)IIiiiiiiiiIii.ALLATORIxDEMO((IIiiiiiiiiIii)this.IiiiiiiiIIIII)));
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (IiiiiiiiIIIII.getbId() == IiiiiiiiIIIII2.getBb1()) {
            IiiiiiiiIIIII2.setBb1(0);
        } else if (IiiiiiiiIIIII.getbId() == IiiiiiiiIIIII2.getBb2()) {
            IiiiiiiiIIIII2.setBb2(0);
        } else {
            if (this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.getbId())) {
                return;
            }
            if (iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)IIiiiiiiiiIii.ALLATORIxDEMO((IIiiiiiiiiIii)this.IiiiiiiiIIIII)) == 0) {
                IiiiiiiiIIIII2.setBb1(IiiiiiiiIIIII.getbId());
            } else {
                IiiiiiiiIIIII2.setBb2(IiiiiiiiIIIII.getbId());
            }
        }
        IIiiiiiiiiIii.ALLATORIxDEMO((IIiiiiiiiiIii)this.IiiiiiiiIIIII).setVisible(false);
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiii();
        this.IiiiiiiiIIIII.iIiIiiiiIIiii(IIiiiiiiiiIii.ALLATORIxDEMO((IIiiiiiiiiIii)this.IiiiiiiiIIIII));
    }
}
