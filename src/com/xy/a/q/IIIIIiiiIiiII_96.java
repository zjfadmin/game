/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IIiIiiiiIiiIi
 *  com.xy.a.q.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.AlchemyUnit
 *  com.xy.readbean.Skill
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IIiIiiiiIiiIi;
import com.xy.a.q.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.AlchemyUnit;
import com.xy.readbean.Skill;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIIiiiIiiII
extends JComponent {
    private int iiIiIiiiiIIIi;
    private JLabel iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)10, (int)120, (int)16, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cB19D82"), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
    private IIIiiiiiIiIiI iiiIiiiiiiiIi;
    private String iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private boolean iIiIiiiiIiIii;
    private double IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)172, (int)10, (int)70, (int)16, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
    final /* synthetic */ IiIiIiiiiIIiI ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        if (this.iiIiiiiiiiIii) {
            if (IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.ALLATORIxDEMO) == null) {
                IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.ALLATORIxDEMO, (Image)com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/e/184.png"));
            }
            g.drawImage(IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.ALLATORIxDEMO), 11, 0, 35, 35, null);
        }
        if (this.iIiIiiiiIiIii) {
            if (IiIiIiiiiIIiI.iIiIiiiiIIiii((IiIiIiiiiIIiI)this.ALLATORIxDEMO) == null) {
                IiIiIiiiiIIiI.iIiIiiiiIIiii((IiIiIiiiiIIiI)this.ALLATORIxDEMO, (Image)com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/e/179.png"));
            }
            g.drawImage(IiIiIiiiiIIiI.iIiIiiiiIIiii((IiIiIiiiiIIiI)this.ALLATORIxDEMO), 15, 2, 27, 32, null);
            return;
        }
        if (IiIiIiiiiIIiI.iiiIiiiiiiIIi((IiIiIiiiiIIiI)this.ALLATORIxDEMO) == null) {
            IiIiIiiiiIIiI.iiiIiiiiiiIIi((IiIiIiiiiIIiI)this.ALLATORIxDEMO, (Image)com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/e/180.png"));
        }
        g.drawImage(IiIiIiiiiIIiI.iiiIiiiiiiIIi((IiIiIiiiiIIiI)this.ALLATORIxDEMO), 15, 2, 27, 32, null);
    }

    public void ALLATORIxDEMO(String key, double zhi, AlchemyUnit alchemyUnit) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)key)) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiiIiiiiiiII = key;
        this.iiIiIiiiiIIIi = 0;
        this.IiIIIiiiiIiiI = zhi;
        this.iIiIiiiiIiIii = true;
        this.iiIiiiiiiiIii = false;
        this.iiiiIiiiIiiII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFF7D0"));
        this.iiiiIiiiIiiII.setText(key);
        this.IiiiiiiiIIIII.setText(String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)zhi, (int)(alchemyUnit != null ? alchemyUnit.getSize() : 1))) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)key));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(alchemyUnit != null ? zhi / alchemyUnit.getMax() : 1.0, 68);
        this.iiiIiiiiiiiIi.setVisible(true);
    }

    public void ALLATORIxDEMO() {
        this.iIiiIiiiiiiII = null;
        this.iiIiIiiiiIIIi = 0;
        this.IiIIIiiiiIiiI = 0.0;
        this.iIiIiiiiIiIii = false;
        this.iiIiiiiiiiIii = false;
        this.iiiiIiiiIiiII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cB19D82"));
        this.iiiiIiiiIiiII.setText("\u7075\u7a8d\u65e0\u7075\u6c14");
        this.IiiiiiiiIIIII.setText("");
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(0.0, 68);
        this.iiiIiiiiiiiIi.setVisible(false);
    }

    /*
     * WARNING - void declaration
     */
    public IIIIIiiiIiiII(IiIiIiiiiIIiI iiIiIiiiiIIiI, int n) {
        void index;
        this.ALLATORIxDEMO = iiIiIiiiiIIiI;
        if (index >= 5) {
            this.iiiiIiiiIiiII.addMouseListener((MouseListener)new IIiIiiiiIiiIi(iiIiIiiiiIIiI, this));
        }
        this.IiiiiiiiIIIII.setHorizontalAlignment(0);
        this.add(this.iiiiIiiiIiiII);
        this.add(this.IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/182.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/e/29.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(173, 12, 68, 13);
        this.iiiIiiiiiiiIi.setBounds(172, 10, 70, 16);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.iiiIiiiiiiiIi);
    }

    static /* synthetic */ String ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public void ALLATORIxDEMO(int skillId, int skillLvl, Skill skill) {
        if (skill == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiiIiiiiiiII = null;
        this.iiIiIiiiiIIIi = skillId;
        this.IiIIIiiiiIiiI = skillLvl;
        this.iIiIiiiiIiIii = true;
        this.iiIiiiiiiiIii = false;
        this.iiiiIiiiIiiII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFF7D0"));
        this.iiiiIiiiIiiII.setText(skill.getSkillname());
        this.IiiiiiiiIIIII.setText("\u7b49\u7ea7" + skillLvl);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO((double)skillLvl / 15.0, 68);
        this.iiiIiiiiiiiIi.setVisible(true);
    }

    static /* synthetic */ double ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiiII arg0, boolean arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    static /* synthetic */ int ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.iiIiIiiiiIIIi;
    }
}
