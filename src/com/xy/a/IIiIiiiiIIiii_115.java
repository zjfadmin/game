/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiIiiiIiiiI
 *  com.xy.a.iiIiIiiiiiIIi
 *  com.xy.bean.StallNeedBean
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.StallBuyData
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIiiIiiiIiiiI;
import com.xy.a.iiIiIiiiiiIIi;
import com.xy.bean.StallNeedBean;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.StallBuyData;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIIiii
extends iIiIIiiiIiiiI
implements MouseListener {
    private IIIiiiiiIiIiI iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private com.xy.q.IIIiiiiiIiIiI iIiIiiiiIiIii;
    final /* synthetic */ iiIiIiiiiiIIi IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi iiIiiiiiiiIii;
    private IIiIiiiiIIiii IiiiiiiiIIIII = this;
    private JLabel ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)56, (int)8, (int)72, (int)16, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);

    static /* synthetic */ IIiIiiiiIIiii ALLATORIxDEMO(IIiIiiiiIIiii arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(null, (StallNeedBean)this.iIiIiiiiIiIii.ALLATORIxDEMO());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public void ALLATORIxDEMO(StallNeedBean needBean) {
        if (needBean == null || needBean.getTotal() - needBean.getNum() <= 0) {
            this.iIiIiiiiIiIii.ALLATORIxDEMO(0, null);
            this.setVisible(false);
            return;
        }
        StallBuyData IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(needBean.getId());
        this.iIiIiiiiIiIii.ALLATORIxDEMO(25, (Object)needBean);
        this.ALLATORIxDEMO.setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getName() : "\u672a\u77e5\u7269\u54c1");
        this.IIiiIiiiIIiIi.setText(String.valueOf(needBean.getTotal() - needBean.getNum()));
        this.iiIiiiiiiiIii.setText(String.valueOf(needBean.getMoney()));
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public IIiIiiiiIIiii(iiIiIiiiiiIIi iiIiIiiiiiIIi2) {
        this.IiIIIiiiiIiiI = iiIiIiiiiiIIi2;
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)6, (int)6, (int)40, (int)14, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)54, (int)24, (int)72, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIiIiiiiIiIii = new IIiiIiiiIiiiI(this, iiIiIiiiiiIIi2.ALLATORIxDEMO());
        this.iIiIiiiiIiIii.ALLATORIxDEMO("sc/d/81.png");
        this.iIiIiiiiIiIii.setBounds(5, 5, 44, 44);
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        this.iIiiIiiiiiiII.setBounds(0, 0, 134, 54);
        this.add(this.ALLATORIxDEMO);
        this.add(this.IIiiIiiiIIiIi);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.iIiiIiiiiiiII);
        this.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
}
