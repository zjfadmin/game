/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIiIiiiiIiii
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

import com.xy.a.q.IiIiIiiiiIiii;
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
static class iIiIIiiiIIiIi
extends IIIiiiiiIiIiI {
    private IiiiiiiiiIIII iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private com.xy.q.IIIiiiiiIiIiI IIiiIiiiIIiIi;
    final /* synthetic */ IiIiIiiiiIiii iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private iIIiIiiiIiiIi IiiiiiiiIIIII;
    private ChongjipackBean ALLATORIxDEMO;

    static /* synthetic */ ChongjipackBean ALLATORIxDEMO(iIiIIiiiIIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(ChongjipackBean bean, boolean flag) {
        this.ALLATORIxDEMO = bean;
        if (bean == null) {
            this.setVisible(false);
            return;
        }
        this.iIiiIiiiiiiII.setTextSize("#Z#K\u6bcf\u65e5\u5145\u503c\u6ee1#R" + bean.getCanpaymoney() + "#K\u5143", 400);
        this.iIiiIiiiiiiII.setBounds(66, 16, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.iiIiiiiiiiIii = 0;
        List IiiiiiiiIIIII = ChongjipackBean.getGoods((String)bean.getPackgoods());
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.size()) {
            XXGDBean xXGDBean = (XXGDBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            this.iiIiiiiiiiIii += xXGDBean.getSum();
        }
        Goodstable IiiiiiiiIIIII22 = this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(((XXGDBean)IiiiiiiiIIIII.get(0)).getId());
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII22);
        this.IiiiiiiiIIIII.setText(String.valueOf(((XXGDBean)IiiiiiiiIIIII.get(0)).getSum()));
        iIiIIiiiIIiIi iIiIIiiiIIiIi2 = this;
        if (flag) {
            iIiIIiiiIIiIi2.iiiIiiiiiiiIi.setBtn(-1, "sc/e/58.png");
        } else {
            iIiIIiiiIIiIi2.iiiIiiiiiiiIi.setBtn(1, "sc/e/31.png");
        }
        this.setVisible(true);
    }

    static /* synthetic */ int ALLATORIxDEMO(iIiIIiiiIIiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public iIiIIiiiIIiIi(IiIiIiiiiIiii iiIiIiiiiIiii) {
        this.iIiIiiiiIiIii = iiIiIiiiiIiii;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)15, (int)15, (int)15, (int)15, (boolean)false));
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII("sc/e/31.png", 1, 105, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u9886 \u53d6", iiIiIiiiiIiii.ALLATORIxDEMO());
        this.iiiIiiiiiiiIi.ALLATORIxDEMO((Object)this);
        this.iiiIiiiiiiiIi.setBounds(473, 18, 79, 25);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iIiiIiiiiiiII = new RichLabel(null, iiIIiiiiIiiII.IIiiiiiiiIIIi);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)7, (int)16, (int)16, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c00FF00"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/s24.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi = new com.xy.q.IIIiiiiiIiIiI(iiIiIiiiiIiii.ALLATORIxDEMO());
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IiIIIiiiIiiIi);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(7, 7, 49, 47);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI();
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii("sc/d/30.png");
        this.IiIIIiiiiIiiI.setBounds(56, 41, 510, 1);
        this.add((Component)this.IiIIIiiiiIiiI);
    }
}
