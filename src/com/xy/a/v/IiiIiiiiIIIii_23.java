/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiIiIiiiiIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.richtext.RichLabel;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class IiiIiiiiIIIii
extends IiiiIiiiiIiIi {
    private JLabel[] iIiiIiiiiiiII;
    private iiIiIiiiiIiii IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private RichLabel IiIIIiiiiIiiI;
    private RichLabel iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        Activity IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 4) {
            RichLabel IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? this.iiIiiiiiiiIii : (IiiiiiiiIIIII2 == 1 ? this.IiiiiiiiIIIII : (IiiiiiiiIIIII2 == 2 ? this.iIiIiiiiIiIii : this.IiIIIiiiiIiiI));
            int IiiiiiiiIIIII4 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getActivitySet(), (String)(IiiiiiiiIIIII2 == 0 ? "冠军奖励展示=" : (IiiiiiiiIIIII2 == 1 ? "亚军奖励展示=" : (IiiiiiiiIIIII2 == 2 ? "季军奖励展示=" : "殿军奖励展示="))), (String)"|");
            ActivityFC IiiiiiiiIIIII5 = IiiiiiiiIIIII4 > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4) : null;
            IiiiiiiiIIIII3.setTextSize(IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII5.getValue() : "", 168);
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII3.setBounds(328, 337, IiiiiiiiIIIII3.getWidth(), IiiiiiiiIIIII3.getHeight());
            } else if (IiiiiiiiIIIII2 == 1) {
                IiiiiiiiIIIII3.setBounds(506, 358, IiiiiiiiIIIII3.getWidth(), IiiiiiiiIIIII3.getHeight());
            } else if (IiiiiiiiIIIII2 == 2) {
                IiiiiiiiIIIII3.setBounds(185, 358, IiiiiiiiIIIII3.getWidth(), IiiiiiiiIIIII3.getHeight());
            } else if (IiiiiiiiIIIII2 == 3) {
                IiiiiiiiIIIII3.setBounds(58, 373, IiiiiiiiIIIII3.getWidth(), IiiiiiiiIIIII3.getHeight());
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public IiiIiiiiIIIii(iiIiIiiiiIiii bwdhView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, bwdhView.iiIIiiiiIiIIi);
        this.ALLATORIxDEMO(0, 0, 718, 526, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IIiiIiiiIIiIi = bwdhView;
        this.iIiiIiiiiiiII = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)318, (int)318, (int)178, (int)20, (Color)Color.YELLOW, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "冠军奖励物品" : (IiiiiiiiIIIII == 1 ? "亚军奖励物品" : (IiiiiiiiIIIII == 2 ? "季军奖励物品" : (IiiiiiiiIIIII == 3 ? "殿军奖励物品" : ""))));
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(496, 338, 141, 20);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(185, 338, 133, 20);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(59, 353, 126, 20);
            }
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiiiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/129.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(113, 2, 160, 57);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/148.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(11, 31, 692, 457);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }
}
