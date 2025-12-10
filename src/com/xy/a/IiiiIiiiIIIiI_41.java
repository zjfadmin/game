/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIiiiiiIiII
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.battle.TypeState
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IiIIiiiiiIiII;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.battle.TypeState;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiiIiiiIIIiI
extends JComponent
implements MouseListener {
    Skill iiiIiiiiiiiIi;
    int iIiiIiiiiiiII;
    final /* synthetic */ IiIIiiiiiIiII IIiiIiiiIIiIi;
    String iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    JLabel IiiiiiiiIIIII;
    IIIiiiiiIiIiI ALLATORIxDEMO = new IIIiiiiiIiIiI();

    @Override
    public void mouseEntered(MouseEvent e) {
        boolean IiiiiiiiIIIII;
        this.IiIIIiiiiIiiI = Boolean.TRUE;
        if (this.iiiIiiiiiiiIi == null) {
            return;
        }
        iiIiiiiiIIiiI IiiiiiiiIIIII2 = (iiIiiiiiIIiiI)this.IIiiIiiiIIiIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        if (IiIIiiiiiIiII.ALLATORIxDEMO((IiIIiiiiiIiII)this.IIiiIiiiIIiIi).ALLATORIxDEMO().getType() != 0) {
            RoleSummoning IiiiiiiiIIIII3 = this.IIiiIiiiIIiIi.ALLATORIxDEMO().getPet(new BigDecimal(IiIIiiiiiIiII.ALLATORIxDEMO((IiIIiiiiiIiII)this.IIiiIiiiIIiIi).ALLATORIxDEMO().getId()));
            if (IiiiiiiiIIIII3 == null) return;
            IiiiiiiiIIIII2.ALLATORIxDEMO(this.iiiIiiiiiiiIi, 1.0, IiiiIiiiiIIII.iiiiiiiiIIiii((int)IiiiiiiiIIIII3.getGrade()), IiiiIiiiiIIII.IIIIIiiiiIIii((int)IiiiiiiiIIIII3.getGrade()));
            return;
        }
        int IiiiiiiiIIIII4 = IiiiIiiiiIIII.ALLATORIxDEMO((int)this.IIiiIiiiIIiIi.ALLATORIxDEMO().getLoginResult().getGrade());
        int IiiiiiiiIIIII5 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)this.IIiiIiiiIIiIi.ALLATORIxDEMO().getLoginResult().getGrade());
        RoleData IiiiiiiiIIIII6 = this.IIiiIiiiIIiIi.ALLATORIxDEMO();
        int IiiiiiiiIIIII7 = IiiiiiiiIIIII5 == 0 ? 10000 : (IiiiiiiiIIIII5 == 1 ? 15000 : (IiiiiiiiIIIII5 == 2 ? 20000 : 25000));
        boolean bl = IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO().gameBattle && (IiiiiiiiIIIII6.getRoleProperty().sld1 > 0 || IiiiiiiiIIIII6.getRoleProperty().sld2 > 0);
        if (IiiiiiiiIIIII) {
            int IiiiiiiiIIIII8 = (Integer.parseInt(this.iiiIiiiiiiiIi.getSkillid()) - 1001) / 5 + 1;
            int IiiiiiiiIIIII9 = 0;
            if (IiiiiiiiIIIII8 == IiiiiiiiIIIII6.getRoleProperty().sm1) {
                IiiiiiiiIIIII9 = (int)((double)IiiiiiiiIIIII9 + (double)IiiiiiiiIIIII6.getRoleProperty().sld1 * 67.5);
            } else if (IiiiiiiiIIIII8 == IiiiiiiiIIIII6.getRoleProperty().sm2) {
                IiiiiiiiIIIII9 = (int)((double)IiiiiiiiIIIII9 + (double)IiiiiiiiIIIII6.getRoleProperty().sld2 * 67.5);
            }
            IiiiiiiiIIIII7 += IiiiiiiiIIIII9;
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(this.iiiIiiiiiiiIi, (double)IiiiiiiiIIIII7, IiiiiiiiIIIII4, IiiiiiiiIIIII5);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.ALLATORIxDEMO(Boolean.TRUE);
    }

    public IiiiIiiiIIIiI(IiIIiiiiiIiII iiIIiiiiiIiII) {
        this.IIiiIiiiIIiIi = iiIIiiiiiIiII;
        this.ALLATORIxDEMO.setBounds(0, 0, 25, 25);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)27, (int)0, (int)85, (int)25, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.add((Component)this.ALLATORIxDEMO);
        this.add(this.IiiiiiiiIIIII);
        this.addMouseListener(this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.ALLATORIxDEMO(Boolean.FALSE);
        if (!this.IiIIIiiiiIiiI) return;
        this.IIiiIiiiIIiIi.iiIIiiiiIiIIi.getBattleControl().setMouseIndex(iiIiIiiiIIIiI.ALLATORIxDEMO, (Object)this.iiiIiiiiiiiIi);
        this.IIiiIiiiIIiIi.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(34);
        this.IIiiIiiiIIiIi.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(46);
        this.IIiiIiiiIIiIi.iiIIiiiiIiIIi.getBattleControl().iiiiiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void setBounds(int n, int n2, int n3, int n4) {
        void height;
        void width;
        void y;
        void x;
        super.setBounds((int)(x + this.iiIiiiiiiiIii), (int)(y + this.iiIiiiiiiiIii), (int)width, (int)height);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.ALLATORIxDEMO(Boolean.FALSE);
        this.IiIIIiiiiIiiI = Boolean.FALSE;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void ALLATORIxDEMO(TypeState typeState) {
        this.iIiIiiiiIiIii = typeState != null ? typeState.getType() : null;
        this.iIiiIiiiiiiII = typeState != null ? typeState.getState() : 0;
        Skill skill = this.iiiIiiiiiiiIi = this.iIiIiiiiIiIii != null ? this.IIiiIiiiIIiIi.ALLATORIxDEMO().ALLATORIxDEMO(this.iIiIiiiiIiIii) : null;
        if (this.iiiIiiiiiiiIi == null) {
            this.ALLATORIxDEMO.iIiIiiiiIIiii();
            this.IiiiiiiiIIIII.setText(null);
            this.setVisible(false);
            return;
        }
        int IiiiiiiiIIIII = Integer.parseInt(this.iiiIiiiiiiiIi.getSkillid());
        if (IiiiiiiiIIIII > 9000 && IiiiiiiiIIIII < 10000 || IiiiiiiiIIIII > 12000 && IiiiiiiiIIIII < 13000) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.iIiIiiiiIIiIi((int)IiiiiiiiIIIII));
        } else {
            this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)this.iiiIiiiiiiiIi.getSkillid()));
        }
        this.IiiiiiiiIIIII.setText(this.iiiIiiiiiiiIi.getSkillname());
        this.IiiiiiiiIIIII.setForeground(this.iIiiIiiiiiiII == 2 ? Color.red : Color.white);
        this.setVisible(true);
    }

    public void ALLATORIxDEMO(Boolean v) {
        if (this.iiIiiiiiiiIii == v) {
            return;
        }
        this.iiIiiiiiiiIii = v;
        super.setBounds(this.getX() + (this.iiIiiiiiiiIii ? 1 : -1), this.getY() + (this.iiIiiiiiiiIii ? 1 : -1), this.getWidth(), this.getHeight());
    }
}
