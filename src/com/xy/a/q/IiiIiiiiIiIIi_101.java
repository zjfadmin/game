/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiiiII
 *  com.xy.a.q.iIiIIiiiIIIiI
 *  com.xy.bean.ChongjipackBean
 *  com.xy.bean.XXGDBean
 *  com.xy.formula.GoodType
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIIIiiiiiiII;
import com.xy.a.q.iIiIIiiiIIIiI;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
public static class IiiIiiiiIiIIi
extends IIIiiiiiIiIiI {
    private IiiiiiiiiIIII iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private List<JLabel> iIiIiiiiIiIii;
    final /* synthetic */ iIiIIiiiIIIiI IiIIIiiiiIiiI;
    private ChongjipackBean iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private List<com.xy.q.IIIiiiiiIiIiI> ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        if (this.IiIIIiiiiIiiI.ALLATORIxDEMO().getGoodPackSum(-1L, new BigDecimal(-1), this.IiiiiiiiIIIII) < this.IiiiiiiiIIIII) {
            this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"Chongjipacksure", (String)(this.iiIiiiiiiiIii.getPacktype() + "|" + this.iiIiiiiiiiIii.getPackgradetype()));
        this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ALLATORIxDEMO(ChongjipackBean bean) {
        block5: {
            this.iiIiiiiiiiIii = bean;
            if (bean != null) break block5;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl16
        }
        this.IIiiIiiiIIiIi.setText(bean.getPackgrade());
        IiiiiiiiIIIII = ChongjipackBean.getGoodsImpactGrade((String)bean.getPackgoods());
        this.IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl43
        do {
            this.ALLATORIxDEMO.get(IiiiiiiiIIIII).ALLATORIxDEMO(0, null);
            v0 = this.iIiIiiiiIiIii.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            v0.setVisible(false);
lbl16:
            // 2 sources

        } while (IiiiiiiiIIIII < this.ALLATORIxDEMO.size());
        this.setVisible(false);
        return;
        do {
            v1 = IiiiiiiiIIIII = IiiiiiiiIIIII < this.ALLATORIxDEMO.size() ? this.ALLATORIxDEMO.get(IiiiiiiiIIIII) : null;
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII /* !! */  = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
                IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI(this.IiIIIiiiiIiiI.ALLATORIxDEMO());
                IiiiiiiiIIIII.ALLATORIxDEMO("sc/d/46.png");
                IiiiiiiiIIIII.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiIiiiiIIIi);
                this.iIiIiiiiIiIii.add((JLabel)IiiiiiiiIIIII /* !! */ );
                this.ALLATORIxDEMO.add(IiiiiiiiIIIII);
                this.add((Component)IiiiiiiiIIIII /* !! */ );
                this.add((Component)IiiiiiiiIIIII);
            }
            v2 = IiiiiiiiIIIII = (IiiiiiiiIIIII /* !! */  = (XXGDBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII)) != null ? this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII /* !! */ .getId()) : null;
            if (IiiiiiiiIIIII != null) {
                this.IiiiiiiiIIIII += GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII.getType()) != false ? 1 : IiiiiiiiIIIII /* !! */ .getSum();
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII != null ? 1 : 0, (Object)IiiiiiiiIIIII);
            IiiiiiiiIIIII.setBounds(110 + 45 * IiiiiiiiIIIII, 8, 35, 35);
            this.iIiIiiiiIiIii.get(IiiiiiiiIIIII).setText(String.valueOf(IiiiiiiiIIIII /* !! */ .getSum()));
            this.iIiIiiiiIiIii.get(IiiiiiiiIIIII).setBounds(113 + 45 * IiiiiiiiIIIII, 8, 14, 14);
            this.iIiIiiiiIiIii.get(IiiiiiiiIIIII).setVisible(IiiiiiiiIIIII != null);
            ++IiiiiiiiIIIII;
lbl43:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        IiiiiiiiIIIII = IiiiiiiiIIIII.size();
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.size()) {
            this.ALLATORIxDEMO.get(IiiiiiiiIIIII).ALLATORIxDEMO(0, null);
            v3 = this.iIiIiiiiIiIii.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            v3.setVisible(false);
        }
        this.setVisible(true);
    }

    public IiiIiiiiIiIIi(iIiIIiiiIIIiI iIiIIiiiIIIiI2) {
        this.IiIIIiiiiIiiI = iIiIIiiiIIIiI2;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)15, (int)15, (int)15, (int)15, (boolean)false));
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (int)14, (int)100, (int)24, (Color)iiIIiiiiIiiII.IiiIIiiiIIIIi[0], (Font)iiIIiiiiIiiII.IIiiiiiiiIIIi);
        this.add(this.IIiiIiiiIIiIi);
        this.iIiiIiiiiiiII = new IiiiiiiiiIIII("sc/e/31.png", 1, 190, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u9886 \u53d6", iIiIIiiiIIIiI2.ALLATORIxDEMO());
        this.iIiiIiiiiiiII.ALLATORIxDEMO((Object)this);
        this.iIiiIiiiiiiII.setBounds(330, 12, 79, 25);
        this.add((Component)this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO = new ArrayList<com.xy.q.IIIiiiiiIiIiI>();
        this.iIiIiiiiIiIii = new ArrayList<JLabel>();
    }

    public void ALLATORIxDEMO(String[] split) {
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        if (IiIIIiiiiiiII.ALLATORIxDEMO((String[])split, (int)10, (int)this.iiIiiiiiiiIii.getPackgradetype())) {
            this.iIiiIiiiiiiII.setBtn(-1, "sc/e/58.png");
            return;
        }
        this.iIiiIiiiiiiII.setBtn(1, "sc/e/31.png");
    }
}
