/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiIiiiiIiii
 *  com.xy.a.i.iIiIIiiiIIIiI
 *  com.xy.a.i.iIiIIiiiIIiIi
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.LaborShop
 *  com.xy.readbean.Shop
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.i;

import com.xy.a.i.IiIiIiiiiIiii;
import com.xy.a.i.iIiIIiiiIIIiI;
import com.xy.a.i.iIiIIiiiIIiIi;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.LaborShop;
import com.xy.readbean.Shop;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiiiiiIIIii
extends IIiiIiiiiIIiI {
    private JLabel iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private LaborShop IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    final /* synthetic */ iIiIIiiiIIIiI IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        if (this.iIiIiiiiIiIii != 2) return;
        Shop IiiiiiiiIIIII = new Shop();
        IiiiiiiiIIIII.setShopname(this.IIiiIiiiIIiIi.getName());
        IiiiiiiiIIIII.setShopskin(this.IIiiIiiiIIiIi.getSkin());
        IiiiiiiiIIIII.setShoptext(this.IIiiIiiiIIiIi.getText());
        ((iiIiiiiiIIiiI)this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void IIIIIiiiiIIii() {
        this.setImage("sc/b/B452.png");
        this.iiIiiiiiiiIii.setText(this.IIiiIiiiIIiIi.getName());
        this.ALLATORIxDEMO.setTextSize("#K" + this.IIiiIiiiIIiIi.getText(), 125);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)this.IIiiIiiiIIiIi.getSkin()));
        this.iIiiIiiiiiiII.setText(this.IIiiIiiiIIiIi.getXGString((int)this.IiIIIiiiiIiiI.ALLATORIxDEMO().getPackRecord().getLabortype(this.IIiiIiiiIIiIi.getId())));
        this.iiiIiiiiiiiIi.setText(this.IIiiIiiiIIiIi.getMoneyString(1.0));
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.IIiiIiiiIIiIi);
        this.iiIiiiiiiiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.iIiiIiiiiiiII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.iiiIiiiiiiiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iiIiiiiiiiIii.setHorizontalAlignment(0);
        this.iIiiIiiiiiiII.setHorizontalAlignment(10);
        this.iiiIiiiiiiiIi.setHorizontalAlignment(10);
        this.iiIiiiiiiiIii.setBounds(0, 12, 155, 25);
        this.ALLATORIxDEMO.setBounds(15, 36, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.IiiiiiiiIIIII.setBounds(22, 73, 110, 110);
        this.iIiiIiiiiiiII.setBounds(15, 188, 140, 20);
        this.iiiIiiiiiiiIi.setBounds(15, 207, 140, 20);
    }

    public void iiiiiiiiIIiii() {
        this.setImage("sc/b/B453.png");
        this.iiIiiiiiiiIii.setText(this.IIiiIiiiIIiIi.getName());
        this.ALLATORIxDEMO.setTextSize("#K" + this.IIiiIiiiIIiIi.getText(), 125);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)this.IIiiIiiiIIiIi.getSkin()));
        this.iiiIiiiiiiiIi.setText(this.IIiiIiiiIIiIi.getMoneyString(1.0));
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.IIiiIiiiIIiIi);
        this.iiIiiiiiiiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.iiiIiiiiiiiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iiIiiiiiiiIii.setHorizontalAlignment(10);
        this.iiiIiiiiiiiIi.setHorizontalAlignment(0);
        this.iiIiiiiiiiIii.setBounds(90, 25, 155, 25);
        this.ALLATORIxDEMO.setBounds(90, 50, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.IiiiiiiiIIIII.setBounds(5, 5, 80, 80);
        this.iiiIiiiiiiiIi.setBounds(0, 100, 213, 20);
    }

    public void IiiIiiiiiiIiI() {
        this.iiIiiiiiiiIii.setVisible(this.iIiIiiiiIiIii == 0 || this.iIiIiiiiIiIii == 1 || this.iIiIiiiiIiIii == 2 || this.iIiIiiiiIiIii == 3);
        this.ALLATORIxDEMO.setVisible(this.iIiIiiiiIiIii == 0 || this.iIiIiiiiIiIii == 1 || this.iIiIiiiiIiIii == 3);
        this.IiiiiiiiIIIII.setVisible(this.iIiIiiiiIiIii == 0 || this.iIiIiiiiIiIii == 1 || this.iIiIiiiiIiIii == 2 || this.iIiIiiiiIiIii == 3);
        this.iIiiIiiiiiiII.setVisible(this.iIiIiiiiIiIii == 0 || this.iIiIiiiiIiIii == 2);
        this.iiiIiiiiiiiIi.setVisible(this.iIiIiiiiIiIii == 0 || this.iIiIiiiiIiIii == 1 || this.iIiIiiiiIiIii == 2 || this.iIiIiiiiIiIii == 3);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.IIiiIiiiIIiIi == null) {
            return;
        }
        if (this.IIiiIiiiIIiIi.getGoods().length == 1) {
            iIiIIiiiIIiIi IiiiiiiiIIIII = (iIiIIiiiIIiIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(144);
            IiiiiiiiIIIII.ALLATORIxDEMO(this.IIiiIiiiIIiIi);
            return;
        }
        IiIiIiiiiIiii IiiiiiiiIIIII = (IiIiIiiiiIiii)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(143);
        IiiiiiiiIIIII.ALLATORIxDEMO(this.IIiiIiiiIIiIi);
    }

    public IIiiiiiiIIIii(iIiIIiiiIIIiI iIiIIiiiIIIiI2) {
        this.IiIIIiiiiIiiI = iIiIIiiiIIIiI2;
        super(null, 1, null, iIiIIiiiIIIiI2.ALLATORIxDEMO());
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.ALLATORIxDEMO = new RichLabel();
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI();
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.add(this.iiIiiiiiiiIii);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add(this.iIiiIiiiiiiII);
        this.add(this.iiiIiiiiiiiIi);
    }

    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        if (this.iIiIiiiiIiIii != 2) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void iIiIiiiiIIiIi() {
        this.setImage("sc/b/B454.png");
        this.iiIiiiiiiiIii.setText(this.IIiiIiiiIIiIi.getName());
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)this.IIiiIiiiIIiIi.getSkin()));
        this.iIiiIiiiiiiII.setText(this.IIiiIiiiIIiIi.getZKMoneyString(0, 1.0));
        if (this.IIiiIiiiIIiIi.getZk() != null) {
            this.iiiIiiiiiiiIi.setText(this.IIiiIiiiIIiIi.getZKMoneyString(1, this.IiIIIiiiiIiiI.ALLATORIxDEMO()));
        } else {
            this.iiiIiiiiiiiIi.setText(null);
        }
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.iiIiiiiiiiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.iIiiIiiiiiiII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.iiiIiiiiiiiIi.setForeground(Color.red);
        this.iiIiiiiiiiIii.setHorizontalAlignment(10);
        this.iIiiIiiiiiiII.setHorizontalAlignment(10);
        this.iiiIiiiiiiiIi.setHorizontalAlignment(10);
        this.iiIiiiiiiiIii.setBounds(12, 18, 120, 25);
        this.IiiiiiiiIIIII.setBounds(132, 3, 75, 80);
        this.iIiiIiiiiiiII.setBounds(12, 40, 150, 20);
        this.iiiIiiiiiiiIi.setBounds(12, 58, 150, 20);
    }

    public void iiiIiiiiiiIIi() {
        this.setImage("sc/b/B455.png");
        this.iiIiiiiiiiIii.setText(this.IIiiIiiiIIiIi.getName());
        this.ALLATORIxDEMO.setTextSize("#K" + this.IIiiIiiiIIiIi.getText(), 125);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)this.IIiiIiiiIIiIi.getSkin()));
        this.iiiIiiiiiiiIi.setText(this.IIiiIiiiIIiIi.getMoneyString(1.0));
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.IIiiIiiiIIiIi);
        this.iiIiiiiiiiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.iiiIiiiiiiiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"));
        this.iiIiiiiiiiIii.setHorizontalAlignment(0);
        this.iiiIiiiiiiiIi.setHorizontalAlignment(10);
        this.iiIiiiiiiiIii.setBounds(0, 12, 155, 25);
        this.ALLATORIxDEMO.setBounds(15, 36, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.IiiiiiiiIIIII.setBounds(22, 73, 110, 110);
        this.iiiIiiiiiiiIi.setBounds(15, 188, 140, 20);
    }

    public void ALLATORIxDEMO(int showType, LaborShop laborShop) {
        this.iIiIiiiiIiIii = showType;
        this.IIiiIiiiIIiIi = laborShop;
        if (laborShop == null) {
            return;
        }
        if (showType == 0) {
            this.IIIIIiiiiIIii();
        } else if (showType == 1) {
            this.iiiiiiiiIIiii();
        } else if (showType == 2) {
            this.iIiIiiiiIIiIi();
        } else if (showType == 3) {
            this.iiiIiiiiiiIIi();
        }
        this.IiiIiiiiiiIiI();
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }
}
