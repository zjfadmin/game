/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiIiiiI
 *  com.xy.entity.TeamRole
 *  com.xy.formula.SkillUtil
 *  com.xy.i.iiIIiiiiIiiII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.iIiIIiiiIiiiI;
import com.xy.entity.TeamRole;
import com.xy.formula.SkillUtil;
import com.xy.i.iiIIiiiiIiiII;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiiiiiIiIiI
extends JComponent
implements MouseListener {
    private IiiiIiiiiIiIi iiiIiiiiiiiIi;
    private boolean iIiiIiiiiiiII = false;
    private TeamRole IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    final /* synthetic */ iIiIIiiiIiiiI iiIiiiiiiiIii;
    private iiIIiiiiIiiII IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    static /* synthetic */ IiiiIiiiiIiIi ALLATORIxDEMO(IIIiiiiiIiIiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public void ALLATORIxDEMO(TeamRole teamRole) {
        this.IIiiIiiiIIiIi = teamRole;
        if (teamRole == null) {
            this.iIiiIiiiiiiII = false;
            this.iiiIiiiiiiiIi = null;
            this.setVisible(false);
            return;
        }
        this.ALLATORIxDEMO.setText(teamRole.getName());
        this.IiIIIiiiiIiiI.setText(IiiiIiiiiIIII.iIiIiiiiIIiii((int)teamRole.getGrade()));
        this.IiiiiiiiIIIII.setText(SkillUtil.getSepciesN((BigDecimal)teamRole.getSpeciesId()));
        this.iIiiIiiiiiiII = teamRole.getState() < 0;
        this.iiiIiiiiiiiIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)teamRole.getSpeciesId().toString(), (int)2, (int)1, null);
        this.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!this.isVisible()) return;
        this.iiIiiiiiiiIii.iIiIiiiiIIiIi(this.iIiIiiiiIiIii);
    }

    public IIIiiiiiIiIiI(iIiIIiiiIiiiI iIiIIiiiIiiiI2, int id) {
        this.iiIiiiiiiiIii = iIiIIiiiIiiiI2;
        this.iIiIiiiiIiIii = id;
        this.ALLATORIxDEMO = new JLabel("\u540d\u5b57", 0);
        this.IiIIIiiiiIiiI = new JLabel("\u7b49\u7ea7", 0);
        this.ALLATORIxDEMO.setBounds(-10, 120, 100, 23);
        this.IiIIIiiiiIiiI.setBounds(0, 144, 80, 23);
        this.ALLATORIxDEMO.setForeground(Color.white);
        this.IiIIIiiiiIiiI.setForeground(Color.white);
        this.ALLATORIxDEMO.setFont(com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiIIIiiiiIiiI.setFont(com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add(this.ALLATORIxDEMO);
        this.add(this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = new iiIIiiiiIiiII("sc/e/6.png", 1, 0, com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u9b3c\u65cf", iIiIIiiiIiiiI2.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setBounds(2, 100, 34, 18);
        this.add((Component)this.IiiiiiiiIIIII);
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (!this.isVisible()) return;
        this.iiIiiiiiiiIii.iiiIiiiiiiIIi(-1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ TeamRole ALLATORIxDEMO(IIIiiiiiIiIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (!this.isVisible()) return;
        this.iiIiiiiiiiIii.iiiIiiiiiiIIi(this.iIiIiiiiIiIii);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iIiiIiiiiiiII) return;
        if (iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.iiIiiiiiiiIii) == null) {
            iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.iiIiiiiiiiIii, (Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/67"));
        }
        g.drawImage(iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.iiIiiiiiiiIii), 0, 0, 84, 174, this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
