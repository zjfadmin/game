/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIIIiiiiIiIII
 *  com.xy.bean.ChongjipackBean
 *  com.xy.bean.XXGDBean
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iIIIiiiiIiIII;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIiiiiIiIiI
extends IIIiiiiiIiIiI {
    private ChongjipackBean iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi;
    private com.xy.q.IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    final /* synthetic */ iIIIiiiiIiIII IiIIIiiiiIiiI;
    private IiiiiiiiiIIII iiIiiiiiiiIii;
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    static /* synthetic */ int ALLATORIxDEMO(iiIIiiiiIiIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(ChongjipackBean bean, boolean flag) {
        this.iIiiIiiiiiiII = bean;
        if (bean == null) {
            this.setVisible(false);
            return;
        }
        this.IIiiIiiiIIiIi.setTextSize("#Z#K\u8fde\u7eed\u5145\u503c#R" + this.iIiiIiiiiiiII.getPackgradetype() + "#K\u5929", 400);
        this.IIiiIiiiIIiIi.setBounds(280, 16, this.IIiiIiiiIIiIi.getWidth(), this.IIiiIiiiIIiIi.getHeight());
        this.ALLATORIxDEMO = 0;
        List IiiiiiiiIIIII = ChongjipackBean.getGoods((String)bean.getPackgoods());
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.size()) {
            XXGDBean xXGDBean = (XXGDBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            this.ALLATORIxDEMO += xXGDBean.getSum();
        }
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.length) {
            XXGDBean IiiiiiiiIIIII3 = IiiiiiiiIIIII2 < IiiiiiiiIIIII.size() ? (XXGDBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII2) : null;
            iiIIiiiiIiIiI iiIIiiiiIiIiI2 = this;
            if (IiiiiiiiIIIII3 == null) {
                iiIIiiiiIiIiI2.iIiIiiiiIiIii[IiiiiiiiIIIII2].ALLATORIxDEMO(0, null);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].setVisible(true);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setVisible(false);
            } else {
                Goodstable IiiiiiiiIIIII4 = iiIIiiiiIiIiI2.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3.getId());
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII4);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setText(String.valueOf(IiiiiiiiIIIII3.getSum()));
            }
            ++IiiiiiiiIIIII2;
        }
        iiIIiiiiIiIiI iiIIiiiiIiIiI3 = this;
        if (flag) {
            iiIIiiiiIiIiI3.iiIiiiiiiiIii.setBtn(-1, "sc/e/58.png");
        } else {
            iiIIiiiiIiIiI3.iiIiiiiiiiIii.setBtn(1, "sc/e/31.png");
        }
        this.setVisible(true);
    }

    static /* synthetic */ ChongjipackBean ALLATORIxDEMO(iiIIiiiiIiIiI arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public iiIIiiiiIiIiI(iIIIiiiiIiIII iIIIiiiiIiIII2) {
        this.IiIIIiiiiIiiI = iIIIiiiiIiIII2;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)15, (int)15, (int)15, (int)15, (boolean)false));
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII("sc/e/31.png", 1, 121, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u9886 \u53d6", iIIIiiiiIiIII2.ALLATORIxDEMO());
        this.iiIiiiiiiiIii.ALLATORIxDEMO((Object)this);
        this.iiIiiiiiiiIii.setBounds(473, 18, 79, 25);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi = new RichLabel(null, iiIIiiiiIiiII.IIiiiiiiiIIIi);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(40 + IiiiiiiiIIIII * 52), (int)7, (int)16, (int)16, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c00FF00"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/s24.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new com.xy.q.IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI(iIIIiiiiIiIII2.ALLATORIxDEMO());
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IiIIIiiiIiiIi);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(7 + IiiiiiiiIIIII * 52, 7, 49, 47);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
    }
}
