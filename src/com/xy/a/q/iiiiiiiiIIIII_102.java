/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.iIIiiiiiIIIIi
 *  com.xy.bean.PayvipBean
 *  com.xy.i.iIIIIiiiIiiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.iIIiiiiiIIIIi;
import com.xy.bean.PayvipBean;
import com.xy.i.iIIIIiiiIiiIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
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
    private JLabel iIiIiiiiIiIii;
    final /* synthetic */ iIIiiiiiIIIIi IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private PayvipBean IiiiiiiiIIIII;
    private iIIIIiiiIiiIi ALLATORIxDEMO;

    static /* synthetic */ iIIIIiiiIiiIi ALLATORIxDEMO(iiiiiiiiIIIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(46);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ PayvipBean ALLATORIxDEMO(iiiiiiiiIIIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ((iiIiiiiiIIiiI)this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(this.IiiiiiiiIIIII);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public void ALLATORIxDEMO(PayvipBean payvipBean) {
        this.IiiiiiiiIIIII = payvipBean;
        if (payvipBean == null) {
            this.setVisible(false);
            return;
        }
        this.iiIiiiiiiiIii[0].iIiIiiiiIIiii("sc/item/S" + (19 + payvipBean.getGrade()) + ".png");
        this.iiIiiiiiiiIii[1].iIiIiiiiIIiii("sc/item/S" + (9 + payvipBean.getGrade()) + ".png");
        this.iIiIiiiiIiIii.setText("V" + payvipBean.getGrade() + "\u4f1a\u5458\u5956\u52b1");
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public iiiiiiiiIIIII(iIIiiiiiIIIIi iIIiiiiiIIIIi2) {
        this.IiIIIiiiiIiiI = iIIiiiiiIIIIi2;
        this.setPreferredSize(new Dimension(115, 165));
        this.ALLATORIxDEMO = new iIIIIiiiIiiIi("sc/e/7.png", 1, 0, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u9886\u53d6", iIIiiiiiIIIIi2.ALLATORIxDEMO());
        this.ALLATORIxDEMO.ALLATORIxDEMO((JComponent)this);
        this.ALLATORIxDEMO.setBounds(28, 140, 59, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)120, (int)115, (int)20, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.add(this.iIiIiiiiIiIii);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(2, 2, 40, 35);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(2, 2, 110, 110);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/b/3.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(0, 0, 115, 115);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].addMouseListener((MouseListener)this);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }
}
