/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.iIIIIiiiIiiIi
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Shop
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.i.iIIIIiiiIiiIi;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Shop;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiiiIIiii
extends JPanel {
    private Image IIiiIiiiIIiIi;
    private Color iIiIiiiiIiIii;
    private Shop IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private iIIIIiiiIiiIi IiiiiiiiIIIII;
    private String ALLATORIxDEMO;

    public iiIiiiiiIIiii(IiiiIiiiiIiIi form, Shop shop) {
        this.setPreferredSize(new Dimension(250, 65));
        this.setLayout(null);
        this.setOpaque(false);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiIIIiiiiIiiI = shop;
        this.IiiiiiiiIIIII = new iIIIIiiiIiiIi("sc/e/7.png", 1, 0, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5151\u6362", form);
        this.IiiiiiiiIIIII.ALLATORIxDEMO((JComponent)this);
        this.IiiiiiiiIIIII.setBounds(175, 30, 59, 25);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI(form);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIiiiiiIiIiI.iIiIiiiiIiIii);
        this.iiIiiiiiiiIii.ALLATORIxDEMO("sc/d/4.png");
        this.iiIiiiiiiiIii.setBounds(19, 6, 46, 46);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiIiiiiIiIii = form.ALLATORIxDEMO().gameType == 4 ? iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c00ffff") : iiIIiiiiIiiII.IIIIIiiiIIiiI;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(13, (Object)shop);
        this.ALLATORIxDEMO = "\u79ef\u5206:" + shop.getShopprice();
    }

    public Shop ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiIIIiiiiIiiI == null) return;
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/\u5206\u5272\u7ebf_w225,h1.png");
        }
        g.drawImage(this.IIiiIiiiIIiIi, 14, 62, 225, 1, this);
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.setColor(Color.white);
        g.drawString(this.IiIIIiiiiIiiI.getShopname(), 81, 20);
        g.setColor(this.iIiIiiiiIiIii);
        g.drawString(this.ALLATORIxDEMO, 81, 50);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Shop shop) {
        void shop2;
        this.IiIIIiiiiIiiI = shop;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(13, (Object)shop);
        this.ALLATORIxDEMO = "\u79ef\u5206:" + shop2.getShopprice();
    }

    public void ALLATORIxDEMO() {
        this.IiIIIiiiiIiiI = null;
        this.ALLATORIxDEMO = null;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(0, null);
    }
}
