/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiiiiiIIIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.readbean.Skill
 *  com.xy.readbean.StarSoul
 *  com.xy.socket.Agreement
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiIiiiiiIIIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.readbean.Skill;
import com.xy.readbean.StarSoul;
import com.xy.socket.Agreement;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIiiiiIIIIi
extends IIIiiiiiIiIiI
implements MouseListener {
    final /* synthetic */ IiIiiiiiIIIiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    static /* synthetic */ void ALLATORIxDEMO(IIIIiiiiIIIIi arg0, int arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        StarSoul IiiiiiiiIIIII;
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        StarSoul starSoul = IiiiiiiiIIIII = IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.IiiiiiiiIIIII) != 0 ? IiiiiiiiIIIII2.ALLATORIxDEMO(10000 + IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.IiiiiiiiIIIII)) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        Skill IiiiiiiiIIIII3 = IiiiiiiiIIIII2.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII.getLvl()));
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(0, IiiiiiiiIIIII3, this.ALLATORIxDEMO);
    }

    /*
     * WARNING - void declaration
     */
    protected void paintComponent(Graphics g) {
        void IiiiiiiiIIIII;
        super.paintComponent(g);
        if (this.ALLATORIxDEMO != 0) return;
        Graphics2D graphics2D = (Graphics2D)g;
        IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.iIiiIiiiiiiII);
        IiiiiiiiIIIII.setColor(Color.BLACK);
        IiiiiiiiIIIII.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics2D.setComposite(IIIIIiiiIiIii.iIiiIiiiIiIIi);
    }

    static /* synthetic */ int ALLATORIxDEMO(IIIIiiiiIIIIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void mousePressed(MouseEvent e) {
        void IiiiiiiiIIIII;
        if (this.ALLATORIxDEMO != 1) return;
        SuitOperBean suitOperBean = new SuitOperBean();
        suitOperBean.setType(116);
        suitOperBean.setJade(new PartJade((long)(IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.IiiiiiiiIIIII) + 10000), 0));
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public IIIIiiiiIIIIi(IiIiiiiiIIIiI iiIiiiiiIIIiI) {
        this.IiiiiiiiIIIII = iiIiiiiiIIIiI;
        super(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/bang/XPSkill.png"));
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }
}
