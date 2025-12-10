/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiiiiiIIIiI
 *  com.xy.a.i.iiIiiiiiIIiiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.StarSoul
 *  com.xy.socket.Agreement
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiIiiiiiIIIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.StarSoul;
import com.xy.socket.Agreement;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiiiiiiIIIII
extends JComponent
implements MouseListener {
    private boolean iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)28, (int)16, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
    final /* synthetic */ IiIiiiiiIIIiI iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/43.png");
    private int ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (!this.iIiIiiiiIiIii) {
            return;
        }
        StarSoul IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(this.ALLATORIxDEMO);
        long IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO().getPackRecord().getStarSoulType(IiiiiiiiIIIII.getId()) % 10000L;
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(46);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.iIiIiiiiIiIii) {
            com.xy.a.i.iiIiiiiiIIiiI IiiiiiiiIIIII = (com.xy.a.i.iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(141);
            IiiiiiiiIIIII.iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        SuitOperBean IiiiiiiiIIIII = new SuitOperBean();
        IiiiiiiiIIIII.setType(115);
        IiiiiiiiIIIII.setJade(new PartJade((long)(IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.iiIiiiiiiiIii) + 10000), this.ALLATORIxDEMO));
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (!this.iIiIiiiiIiIii) return;
        if (IiIiiiiiIIIiI.ALLATORIxDEMO() == null) {
            IiIiiiiiIIIiI.ALLATORIxDEMO((IIIIIiiiIiIii)iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/bang/XPBackDL.tcp", null));
        }
        IiIiiiiiIIIiI.ALLATORIxDEMO().ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        IiIiiiiiIIIiI.ALLATORIxDEMO().ALLATORIxDEMO(g, 14, 30);
    }

    public iiiiiiiiIIIII(IiIiiiiiIIIiI iiIiiiiiIIIiI) {
        this.iiIiiiiiiiIii = iiIiiiiiIIIiI;
        this.IiiiiiiiIIIII.setBounds(0, 16, 28, 28);
        this.IiiiiiiiIIIII.addMouseListener((MouseListener)this);
        this.add(this.IiIIIiiiiIiiI);
        this.add((Component)this.IiiiiiiiIIIII);
        this.setVisible(false);
    }

    static /* synthetic */ int ALLATORIxDEMO(iiiiiiiiIIIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(int id, boolean JH, Point point) {
        this.ALLATORIxDEMO = id;
        this.iIiIiiiiIiIii = JH;
        if (id == 0) {
            this.setVisible(false);
            return;
        }
        StarSoul IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(id);
        this.IiIIIiiiiIiiI.setText(IiiiiiiiIIIII.getName());
        this.setBounds(point.x - 14, point.y - 30, 28, 44);
        this.setVisible(true);
    }
}
