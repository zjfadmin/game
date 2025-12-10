/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiiiiiiiIii
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RolePet
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.IIiiiiiiiiIii;
import com.xy.entity.RoleSummoning;
import com.xy.game.RolePet;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIIiiiiiiii
extends JComponent
implements MouseListener {
    private JLabel iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    final /* synthetic */ IIiiiiiiiiIii iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public iiiIIiiiiiiii(IIiiiiiiiiIii iIiiiiiiiiIii) {
        this.iIiIiiiiIiIii = iIiiiiiiiiIii;
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI(iIiiiiiiiiIii.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIiiiiiIiIiI.iIIiIiiiiiiIi);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.IiiiiiiiIIIII.setBounds(1, 1, 44, 44);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(iIiiiiiiiiIii.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI.setBounds(42, 18, 18, 18);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(iIiiiiiiiiIii.ALLATORIxDEMO());
        this.IIiiIiiiIIiIi.setBounds(62, 18, 18, 18);
        this.ALLATORIxDEMO = new JLabel();
        this.iIiiIiiiiiiII = new JLabel();
        this.iiIiiiiiiiIii = new JLabel();
        this.ALLATORIxDEMO.setBounds(82, 18, 120, 20);
        this.iIiiIiiiiiiII.setBounds(202, 18, 80, 20);
        this.iiIiiiiiiiIii.setBounds(282, 18, 50, 20);
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.ALLATORIxDEMO.setHorizontalAlignment(0);
        this.iIiiIiiiiiiII.setHorizontalAlignment(0);
        this.iiIiiiiiiiIii.setHorizontalAlignment(0);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add(this.ALLATORIxDEMO);
        this.add(this.iIiiIiiiiiiII);
        this.add(this.iiIiiiiiiiIii);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 1) {
            this.iIiIiiiiIiIii.ALLATORIxDEMO(this, true);
            return;
        }
        if (e.getButton() != 3) return;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(this, false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void ALLATORIxDEMO(RolePet rolePet) {
        Object IiiiiiiiIIIII;
        RoleSummoning IiiiiiiiIIIII2;
        RoleSummoning roleSummoning = IiiiiiiiIIIII2 = rolePet != null ? rolePet.getPet() : null;
        if (IiiiiiiiIIIII2 != null) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO(21, (Object)IiiiiiiiIIIII2);
            IiiiiiiiIIIII = rolePet.getBb1() != 0 ? this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(rolePet.getBb1()) : null;
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII != null ? 17 : 0, IiiiiiiiIIIII);
            IiiiiiiiIIIII = rolePet.getBb2() != 0 ? this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(rolePet.getBb2()) : null;
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII != null ? 17 : 0, IiiiiiiiIIIII);
        } else {
            this.IiiiiiiiIIIII.ALLATORIxDEMO(0, null);
            this.IiiiiiiiIIIII.setVisible(true);
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(0, null);
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(0, null);
        }
        this.ALLATORIxDEMO.setText(IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getSummoningname() : null);
        this.iIiiIiiiiiiII.setText(IiiiiiiiIIIII2 != null ? IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII2.getGrade()) : null);
        this.iiIiiiiiiiIii.setText(rolePet != null && rolePet.getBb() > 0 ? String.valueOf(rolePet.getBb()) : null);
        IiiiiiiiIIIII = rolePet != null && rolePet.getBb() > 0 ? Color.green : Color.white;
        this.ALLATORIxDEMO.setForeground((Color)IiiiiiiiIIIII);
        this.iIiiIiiiiiiII.setForeground((Color)IiiiiiiiIIIII);
        this.iiIiiiiiiiIii.setForeground((Color)IiiiiiiiIIIII);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(iiiIIiiiiiiii arg0) {
        return arg0.IiiiiiiiIIIII;
    }
}
