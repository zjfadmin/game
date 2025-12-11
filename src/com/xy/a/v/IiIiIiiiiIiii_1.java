/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiIIiiiiIiIiI
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.readbean.Goodstable
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.v;

import com.xy.a.v.iiIIiiiiIiIiI;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiIiiiiIiii
extends iIiIIiiiIiiiI {
    private RichLabel iIiiIiiiiiiII;
    private iiIiIiiiIIIiI IIiiIiiiIIiIi;
    final /* synthetic */ iiIIiiiiIiIiI iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private com.xy.q.IIIiiiiiIiIiI iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    public void ALLATORIxDEMO(ActivityFC activityFC, boolean isGet, long num) {
        IiiiiiiiiIIII IiiiiiiiIIIII = iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiIiiiiIiIii).ALLATORIxDEMO();
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii(activityFC.getId());
        ActivityFCTarget IiiiiiiiIIIII2 = (ActivityFCTarget)activityFC.getData();
        String IiiiiiiiIIIII3 = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2.getT1());
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2.getT2());
        this.ALLATORIxDEMO.setTextSize(!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII3) ? "#W" + IiiiiiiiIIIII3 : "", 160);
        this.iIiiIiiiiiiII.setTextSize(!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII4) ? "#cAAAAAA" + IiiiiiiiIIIII4 : "", 230);
        this.ALLATORIxDEMO.setBounds(59, 10, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.iIiiIiiiiiiII.setBounds(59, 30, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.IiIIIiiiiIiiI.setText(String.valueOf(num) + "/" + IiiiiiiiIIIII2.getTarget().getNum());
        if (isGet) {
            this.IIiiIiiiIIiIi.setBtn(-1, "sc/e/58.png");
            this.IIiiIiiiIIiIi.setText("已领取");
        } else if (num >= IiiiiiiiIIIII2.getTarget().getNum()) {
            this.IIiiIiiiIIiIi.setBtn(1, "sc/e/31.png");
            this.IIiiIiiiIIiIi.setText("领取");
        } else {
            this.IIiiIiiiIIiIi.setBtn(-1, "sc/e/58.png");
            this.IIiiIiiiIIiIi.setText("未达成");
        }
        StringBuffer IiiiiiiiIIIII5 = new StringBuffer();
        ActivityFCBase[] IiiiiiiiIIIII6 = IiiiiiiiIIIII2.getGains();
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
            Goodstable IiiiiiiiIIIII8;
            ActivityFCBase IiiiiiiiIIIII9 = IiiiiiiiIIIII6[IiiiiiiiIIIII7];
            if (IiiiiiiiIIIII9.getType() == 1) {
                if (IiiiiiiiIIIII5.length() != 0) {
                    IiiiiiiiIIIII5.append("#r");
                }
                iiIiIiiiiIiii iiIiIiiiiIiii2 = iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiIiiiiIiIii).getPointKey(IiiiiiiiIIIII9.getId());
                IiiiiiiiIIIII5.append(String.valueOf(IiiiiiiiIIIII9.getNum()) + (IiiiiiiiIIIII8 != null ? IiiiiiiiIIIII8.IiiiiiiiIIIII : "未知积分"));
            } else if (IiiiiiiiIIIII9.getType() == 2) {
                IiiiiiiiIIIII8 = IiiiiiiiIIIII.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII9.getId()));
                if (IiiiiiiiIIIII8 != null) {
                    if (IiiiiiiiIIIII5.length() != 0) {
                        IiiiiiiiIIIII5.append("#r");
                    }
                    IiiiiiiiIIIII5.append(IiiiiiiiIIIII9.getNum());
                    IiiiiiiiIIIII5.append("个");
                    IiiiiiiiIIIII5.append(IiiiiiiiIIIII8.getGoodsname());
                }
            } else if (IiiiiiiiIIIII9.getType() == 3) {
                if (IiiiiiiiIIIII5.length() != 0) {
                    IiiiiiiiIIIII5.append("#r");
                }
                IiiiiiiiIIIII5.append("1次随机奖励");
            } else if (IiiiiiiiIIIII9.getType() == 4) {
                if (IiiiiiiiIIIII5.length() != 0) {
                    IiiiiiiiIIIII5.append("#r");
                }
                IiiiiiiiIIIII5.append(String.valueOf(IiiiiiiiIIIII9.getNum()) + IiiiiiiiIIIII9.getKey());
            }
            ++IiiiiiiiIIIII7;
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO(22, (Object)IiiiiiiiIIIII5.toString());
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)(!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2.getSkin()) ? IiiiiiiiIIIII2.getSkin() : "903")));
    }

    public void ALLATORIxDEMO() {
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii(0);
        this.ALLATORIxDEMO.clear();
        this.iIiiIiiiiiiII.clear();
        this.iiIiiiiiiiIii.iiiIiiiiiiIIi();
        this.setVisible(false);
    }

    public IiIiIiiiiIiii(iiIIiiiiIiIiI iiIIiiiiIiIiI2, IiiiIiiiiIiIi form, iiIIiiiiIiIiI oneView) {
        this.iIiIiiiiIiIii = iiIIiiiiIiIiI2;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIiiiiiiiIii = new com.xy.q.IIIiiiiiIiIiI(form);
        this.iiIiiiiiiiIii.setBounds(5, 5, 44, 44);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)196, (int)10, (int)80, (int)16, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IiIIIiiiiIiiI.setHorizontalAlignment(0);
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IIiiIiiiIIiIi = new iiIiIiiiIIIiI("sc/e/31.png", 1, 112, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "领取", form, (JComponent)oneView);
        this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.IIiiIiiiIIiIi.setBounds(278, 14, 79, 25);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)80, (int)1, (int)80, (int)1, (boolean)false));
        this.IiiiiiiiIIIII.setBounds(8, 53, 350, 2);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add(this.IiIIIiiiiIiiI);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.iIiiIiiiiiiII);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.IiiiiiiiIIIII);
    }
}
