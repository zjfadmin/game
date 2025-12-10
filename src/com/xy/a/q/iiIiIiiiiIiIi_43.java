/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiIIiiiIIIiI
 *  com.xy.a.q.iiIiiiiiIIiiI
 *  com.xy.i.iIIIIiiiIiiIi
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Eshop
 *  com.xy.readbean.Shop
 *  com.xy.v.iiiiiiiiIIIII
 */
package com.xy.a.q;

import com.xy.a.q.IIiIIiiiIIIiI;
import com.xy.a.q.iiIiiiiiIIiiI;
import com.xy.i.iIIIIiiiIiiIi;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Eshop;
import com.xy.readbean.Shop;
import com.xy.v.iiiiiiiiIIIII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiIi
extends JComponent
implements MouseListener {
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private String iIiIiiiiIiIii = "";
    private String IiIIIiiiiIiiI = "";
    public static iiiiiiiiIIIII iiIiiiiiiiIii = new iiiiiiiiIIIII(2, 2, 110, 110);
    private iiIiIiiiiIiIi IiiiiiiiIIIII = this;
    private iIIIIiiiIiiIi ALLATORIxDEMO;

    public iiIiIiiiiIiIi(IiiiIiiiiIiIi form) {
        this.setPreferredSize(new Dimension(115, 150));
        this.ALLATORIxDEMO = new iIIIIiiiIiiIi("sc/e/6.png", 1, 0, "\u8d2d\u4e70", form);
        this.ALLATORIxDEMO.ALLATORIxDEMO((JComponent)this);
        this.ALLATORIxDEMO.setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
        this.ALLATORIxDEMO.setBounds(80, 132, 34, 17);
        this.add((Component)this.ALLATORIxDEMO);
        if (form instanceof iiIiiiiiIIiiI) {
            this.IIiiIiiiIIiIi = new IIiIIiiiIIIiI(this, form);
            this.addMouseListener(this);
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(form);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO("sc/b/3.png");
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi.setBounds(0, 0, 115, 115);
        this.add((Component)this.IIiiIiiiIIiIi);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Eshop eshop, String string) {
        void moneyType;
        void shop;
        this.ALLATORIxDEMO();
        this.setVisible(shop != null);
        if (shop == null) {
            return;
        }
        this.iIiIiiiiIiIii = String.valueOf(shop.getEshopprice()) + " " + (String)moneyType;
        this.IiIIIiiiiIiiI = shop.getEshopname();
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(19, (Object)shop);
        this.IIiiIiiiIIiIi.setVisible(true);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Shop shop) {
        void shop2;
        this.ALLATORIxDEMO();
        this.setVisible(shop2 != null);
        if (shop2 == null) {
            return;
        }
        this.iIiIiiiiIiIii = String.valueOf(shop2.getShopprice()) + " \u79ef\u5206";
        this.IiIIIiiiiIiiI = shop2.getShopname();
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(13, (Object)shop2);
        this.IIiiIiiiIIiIi.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        g.setColor(Color.black);
        g.drawString(this.IiIIIiiiiIiiI, 0, 129);
        g.setColor(Color.red);
        g.drawString(this.iIiIiiiiIiIii, 0, 144);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (!(this.ALLATORIxDEMO.getForm() instanceof iiIiiiiiIIiiI)) return;
        ((iiIiiiiiIIiiI)this.ALLATORIxDEMO.getForm()).ALLATORIxDEMO((Eshop)this.IIiiIiiiIIiIi.ALLATORIxDEMO());
    }

    static /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO(iiIiIiiiiIiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public IIIiiiiiIiIiI ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO() {
        this.IiIIIiiiiIiiI = "";
        this.iIiIiiiiIiIii = "";
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(0, null);
        this.IIiiIiiiIIiIi.setVisible(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
