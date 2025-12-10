/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIIIiI
 *  com.xy.a.IiiIiiiiIIIii
 *  com.xy.bean.Commodity
 *  com.xy.bean.StallNeedBean
 *  com.xy.formula.GoodType
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.StallBuyData
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.IIIIIiiiIIIiI;
import com.xy.a.IiiIiiiiIIIii;
import com.xy.bean.Commodity;
import com.xy.bean.StallNeedBean;
import com.xy.formula.GoodType;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.StallBuyData;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIIiiiIiiIi
extends IIIiiiiiIiIiI
implements MouseListener {
    private int iiIIIiiiiiiiI;
    private iIIIIiiiIiiIi IiIiiiiiIIIII;
    private Commodity iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI iiiiIiiiIiiII;
    private com.xy.q.IIIiiiiiIiIiI iiiIiiiiiiiIi;
    private iIIiIiiiIiiIi iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private boolean iIiIiiiiIiIii;
    final /* synthetic */ IIIIIiiiIIIiI IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private StallNeedBean ALLATORIxDEMO;

    public void ALLATORIxDEMO(StallNeedBean needBean) {
        this.ALLATORIxDEMO = needBean;
        this.IiiiiiiiIIIII = false;
        if (needBean == null) {
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(0, null);
            this.setVisible(false);
            return;
        }
        StallBuyData IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(needBean.getId());
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(25, (Object)needBean);
        this.iiIiiiiiiiIii.setText(String.valueOf(needBean.getTotal() - needBean.getNum()));
        this.IIiiIiiiIIiIi.setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getName() : "\u672a\u77e5\u7269\u54c1");
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIiiIiiiiiiII, (long)needBean.getMoney());
        this.setVisible(true);
    }

    static /* synthetic */ iIIIIiiiIiiIi ALLATORIxDEMO(iIIIIiiiIiiIi arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    static /* synthetic */ void ALLATORIxDEMO(iIIIIiiiIiiIi arg0, boolean arg1) {
        arg0.IiiiiiiiIIIII = arg1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (!this.IiiiiiiiIIIII) return;
        if (IIIIIiiiIIIiI.IIiIiiiiIiiiI == null) {
            IIIIIiiiIIIiI.IIiIiiiiIiiiI = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/mouse/flicker2.tcp", null);
        }
        IIIIIiiiIIIiI.IIiIiiiiIiiiI.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        IIIIIiiiIIIiI.IIiIiiiiIiiiI.ALLATORIxDEMO(g, 4, 5);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    static /* synthetic */ StallNeedBean ALLATORIxDEMO(iIIIIiiiIiiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.iIiIiiiiIiIii) {
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(this.ALLATORIxDEMO);
            return;
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(this.iiIiIiiiiIIIi);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    static /* synthetic */ Commodity ALLATORIxDEMO(iIIIIiiiIiiIi arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    public void ALLATORIxDEMO(Commodity commodity) {
        this.iiIiIiiiiIIIi = commodity;
        if (this.iiIiIiiiiIIIi == null) {
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(0, null);
            this.setVisible(false);
            return;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIiiIiiiiiiII, (long)commodity.getMoney());
        if (commodity.getGood() != null) {
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(18, (Object)commodity.getGood());
            this.iiIiiiiiiiIii.setText(GoodType.ALLATORIxDEMO((Long)commodity.getGood().getType()) ? commodity.getGood().getUsetime().toString() : "");
            this.IIiiIiiiIIiIi.setText(commodity.getGood().getGoodsname());
            this.iiIiiiiiiiIii.setForeground(Color.white);
            this.iiIiiiiiiiIii.setHorizontalAlignment(10);
            this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIiiiiiiiIii.setBounds(8, 8, 40, 14);
            this.IIiiIiiiIIiIi.setBounds(55, 7, 120, 18);
            this.iIiiIiiiiiiII.setBounds(54, 24, 86, 19);
            this.iiiIiiiiiiiIi.setBounds(7, 7, 40, 40);
            this.iiiiIiiiIiiII.iIiIiiiiIIiii("sc/d/81.png");
            this.iiiiIiiiIiiII.ALLATORIxDEMO(null);
            this.iiiiIiiiIiiII.setBounds(5, 5, 44, 44);
            this.setBounds(49 + 151 * (this.iiIIIiiiiiiiI % 4), 82 + 55 * (this.iiIIIiiiiiiiI / 4), 148, 54);
        } else if (commodity.getPet() != null) {
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(21, (Object)commodity.getPet());
            this.iiIiiiiiiiIii.setText(String.valueOf(IiiiIiiiiIIII.ALLATORIxDEMO((int)commodity.getPet().getGrade())) + "\u7ea7");
            this.IIiiIiiiIIiIi.setText(commodity.getPet().getSummoningname());
            this.iiIiiiiiiiIii.setForeground(Color.black);
            this.iiIiiiiiiiIii.setHorizontalAlignment(4);
            this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiiiiiiiIii.setBounds(200, 15, 80, 19);
            this.IIiiIiiiIIiIi.setBounds(78, 15, 150, 19);
            this.iIiiIiiiiiiII.setBounds(78, 43, 205, 19);
            this.iiiIiiiiiiiIi.setBounds(13, 11, 53, 53);
            this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
            this.iiiiIiiiIiiII.iIiIiiiiIIiii();
            this.iiiiIiiiIiiII.setBounds(9, 7, 61, 61);
            this.setBounds(49 + 303 * (this.iiIIIiiiiiiiI % 2), 85 + 82 * (this.iiIIIiiiiiiiI / 2), 300, 76);
        }
        this.setVisible(true);
    }

    /*
     * WARNING - void declaration
     */
    public iIIIIiiiIiiIi(IIIIIiiiIIIiI iIIIIiiiIIIiI, int n, boolean bl) {
        void sold;
        void index;
        this.IiIIIiiiiIiiI = iIIIIiiiIIIiI;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
        this.IiIiiiiiIIIII = this;
        this.iiIIIiiiiiiiI = index;
        this.iIiIiiiiIiIii = sold;
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiiIiiiiiiiIi = new IiiIiiiiIIIii(this, iIIIIiiiIIIiI.ALLATORIxDEMO());
        IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iiiiIiiiIiiII = sold != false ? new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)16, (int)16, (int)16, (int)16, (boolean)false)) : new IIIiiiiiIiIiI("sc/d/81.png");
        if (sold != false) {
            this.iiIiiiiiiiIii.setForeground(Color.white);
            this.iiIiiiiiiiIii.setHorizontalAlignment(10);
            this.IIiiIiiiIIiIi.setForeground(Color.black);
            this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.IIiiIiiiIIiIi.setHorizontalAlignment(10);
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IIIIiiiiiiiII);
            this.iiiIiiiiiiiIi.iIiIiiiiIIiii(false);
            this.iiiIiiiiiiiIi.setBounds(8, 5, 47, 45);
            this.iiIiiiiiiiIii.setBounds(14, 11, 40, 14);
            this.IIiiIiiiIIiIi.setBounds(59, 10, 132, 14);
            this.iIiiIiiiiiiII.setBounds(57, 29, 134, 19);
            this.iiiiIiiiIiiII.setBounds(0, 0, 200, 56);
        }
        this.add(this.iiIiiiiiiiIii);
        this.add(this.IIiiIiiiIIiIi);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.iIiiIiiiiiiII);
        this.add((Component)this.iiiiIiiiIiiII);
        this.addMouseListener(this);
    }
}
