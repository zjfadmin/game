/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.iiIiIiiiiiIIi
 *  com.xy.entity.PartJade
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.iiIiIiiiiiIIi;
import com.xy.entity.PartJade;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class IiiIiiiiIIIii
extends JComponent {
    public PartJade IiIIIiiiiIiiI;
    private Image iiIiiiiiiiIii;
    private IiiiIiiiiIiIi IiiiiiiiIIIII;
    public IIIiiiiiIiIiI[] ALLATORIxDEMO = new IIIiiiiiIiIiI[5];

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S57.png");
        }
        g.drawImage(this.iiIiiiiiiiIii, 0, 0, 291, 171, this);
        g.setColor(Color.white);
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.drawString(String.valueOf(this.IiIIIiiiiIiiI.getJade1()), 30, 27);
        g.drawString(String.valueOf(this.IiIIIiiiiIiiI.getJade2()), 120, 27);
        g.drawString(String.valueOf(this.IiIIIiiiiIiiI.getJade3()), 210, 27);
        g.drawString(String.valueOf(this.IiIIIiiiiIiiI.getJade4()), 75, 105);
        g.drawString(String.valueOf(this.IiIIIiiiiIiiI.getJade5()), 165, 105);
    }

    static /* synthetic */ IiiiIiiiiIiIi ALLATORIxDEMO(IiiIiiiiIIIii arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public IiiIiiiiIIIii(IiiiIiiiiIiIi form, PartJade partJade) {
        this.setPreferredSize(new Dimension(270, 170));
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiIIIiiiiIiiI = partJade;
        this.IiiiiiiiIIIII = form;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.ALLATORIxDEMO[IiiiiiiiIIIII].addMouseListener((MouseListener)new iiIiIiiiiiIIi(this, IiiiiiiiIIIII + 1));
            if (IiiiiiiiIIIII < 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(30 + IiiiiiiiIIIII * 90, 17, 54, 51);
            } else {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(75 + (IiiiiiiiIIIII - 3) * 90, 97, 54, 51);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }

    public static Goodstable ALLATORIxDEMO(PartJade partJade, int index) {
        String IiiiiiiiIIIII = "";
        if (index == 1) {
            IiiiiiiiIIIII = "\u7075\u5b9d\u5929\u5c0a\u70bc\u5236\u7684\u7389\u7b26\uff0c\u53ef\u8f9f\u90aa\uff0c\u53ef\u795b\u75c5\uff0c\u53ef\u7948\u798f\uff0c\u53ef\u4ee4\u88c5\u5907\u4ea7\u751f\u7384\u5999\u7684\u53d8\u5316\u3002        \u54c1\u8d28\uff1a\u628a\u73a9";
        } else if (index == 2) {
            IiiiiiiiIIIII = "\u7075\u5b9d\u5929\u5c0a\u70bc\u5236\u7684\u7389\u7b26\uff0c\u53ef\u8f9f\u90aa\uff0c\u53ef\u795b\u75c5\uff0c\u53ef\u7948\u798f\uff0c\u53ef\u4ee4\u88c5\u5907\u4ea7\u751f\u7384\u5999\u7684\u53d8\u5316\u3002        \u54c1\u8d28\uff1a\u8d34\u8eab";
        } else if (index == 3) {
            IiiiiiiiIIIII = "\u7075\u5b9d\u5929\u5c0a\u70bc\u5236\u7684\u7389\u7b26\uff0c\u53ef\u8f9f\u90aa\uff0c\u53ef\u795b\u75c5\uff0c\u53ef\u7948\u798f\uff0c\u53ef\u4ee4\u88c5\u5907\u4ea7\u751f\u7384\u5999\u7684\u53d8\u5316\u3002        \u54c1\u8d28\uff1a\u73cd\u85cf";
        } else if (index == 4) {
            IiiiiiiiIIIII = "\u7075\u5b9d\u5929\u5c0a\u70bc\u5236\u7684\u7389\u7b26\uff0c\u53ef\u8f9f\u90aa\uff0c\u53ef\u795b\u75c5\uff0c\u53ef\u7948\u798f\uff0c\u53ef\u4ee4\u88c5\u5907\u4ea7\u751f\u7384\u5999\u7684\u53d8\u5316\u3002        \u54c1\u8d28\uff1a\u65e0\u4ef7";
        } else if (index == 5) {
            IiiiiiiiIIIII = "\u7075\u5b9d\u5929\u5c0a\u70bc\u5236\u7684\u7389\u7b26\uff0c\u53ef\u8f9f\u90aa\uff0c\u53ef\u795b\u75c5\uff0c\u53ef\u7948\u798f\uff0c\u53ef\u4ee4\u88c5\u5907\u4ea7\u751f\u7384\u5999\u7684\u53d8\u5316\u3002        \u54c1\u8d28\uff1a\u4f20\u4e16";
        }
        Goodstable IiiiiiiiIIIII2 = new Goodstable();
        IiiiiiiiIIIII2.setSkin("tzyf" + index);
        IiiiiiiiIIIII2.setGoodsname("\u7075\u5b9d\u7389\u7b26");
        IiiiiiiiIIIII2.setInstruction(IiiiiiiiIIIII);
        IiiiiiiiIIIII2.setValue("");
        IiiiiiiiIIIII2.setQuality(Long.valueOf(1L));
        return IiiiiiiiIIIII2;
    }

    public void ALLATORIxDEMO(PartJade partJade) {
        this.IiIIIiiiiIiiI = partJade;
    }
}
