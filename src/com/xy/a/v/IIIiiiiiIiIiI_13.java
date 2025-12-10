/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.ConfirmBean
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBeau
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.bean.ConfirmBean;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBeau;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class IIIiiiiiIiIiI
extends IiiiIiiiiIiIi {
    private RichLabel IiIIIiiiiIiiI;
    private com.xy.w.IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private iiIiIiiiIIIiI IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        ActivityFCBeau IiiiiiiiIIIII;
        Activity IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2.getActivitySet(), (String)"\u9753\u53f7\u4fe1\u7b4f\u8bbe\u7f6e=", (String)"|") : 0;
        ActivityFC IiiiiiiiIIIII4 = IiiiiiiiIIIII3 > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3) : null;
        ActivityFCBeau activityFCBeau = IiiiiiiiIIIII = IiiiiiiiIIIII4 != null ? (ActivityFCBeau)IiiiiiiiIIIII4.getData() : null;
        if (IiiiiiiiIIIII != null) {
            long IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getTimeOpen() + (long)IiiiiiiiIIIII.getPointTime().x * 1000L;
            long IiiiiiiiIIIII6 = IiiiiiiiIIIII2.getTimeOpen() + (long)IiiiiiiiIIIII.getPointTime().y * 1000L;
            this.IiIIIiiiiIiiI.setTextSize("#c484333\u6295\u653e\u65f6\u95f4\u4e3a#cFF0000  " + iIiIIiiiIiiiI.iIiIiiiiIIiii((long)IiiiiiiiIIIII5) + " ~ " + iIiIIiiiIiiiI.iIiIiiiiIIiii((long)IiiiiiiiIIIII6), 500);
        } else {
            this.IiIIIiiiiIiiI.setTextSize("", 500);
        }
        this.IiIIIiiiiIiiI.setBounds(101, 75, this.IiIIIiiiiIiiI.getWidth(), this.IiIIIiiiiIiiI.getHeight());
        this.ALLATORIxDEMO[1].setText("198 \u79ef\u5206");
    }

    public void iIiIiiiiIIiii(int id) {
        if (id != 201) return;
        Activity IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII != null ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getActivitySet(), (String)"\u9753\u53f7\u4fe1\u7b4f\u8bf4\u660e=", (String)"|") : 0;
        ActivityFC IiiiiiiiIIIII3 = IiiiiiiiIIIII2 > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2) : null;
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(35, null, IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getValue() : "\u8fd8\u672a\u8bbe\u7f6e\u8bf4\u660e\u6587\u672c"));
    }

    public IIIiiiiiIiIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 703, 542, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiiiiiiiIIIII = new iiIiIiiiIIIiI("sc/e/187.png", 1, 201, iiIIiiiiIiiII.IIiiiiiiiIIIi, null, "\u8d2d\u4e70", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(323, 438, 67, 35);
        this.add((Component)this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new JLabel[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)306, (int)105, (int)100, (int)24, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c86745C"), (Font)iiIIiiiiIiiII.iiiIiiiiIiiii);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u9753\u53f7\u4fe1\u7b4f" : (IiiiiiiiIIIII == 1 ? "198 \u79ef\u5206" : (IiiiiiiiIIIII == 2 ? "\u8d2d\u4e70\u9753\u53f7\u4fe1\u7b4f\uff0c\u81ea\u5b9a\u4e49\u4e00\u7ec4\u571f\u8c6a\u91d1\u9753\u53f7" : "")));
            if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(280, 361, 153, 28);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cDDC798"));
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(182, 401, 349, 20);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiIiiiIIiIi);
            }
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiIIIiiiiIiiI.setTextSize("#c484333\u6295\u653e\u65f6\u95f4\u4e3a#cFF0000  2020-01-01 20:00:00 ~ 2020-01-03 20:00:00", 500);
        this.IiIIIiiiiIiiI.setBounds(101, 75, this.IiIIIiiiiIiiI.getWidth(), this.IiIIIiiiiIiiI.getHeight());
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new com.xy.w.IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/200.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(301, 163, 110, 184);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/139.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(280, 361, 153, 28);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/202.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(93, 39, 608, 407);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/132.png", (int)50, (int)50, (int)50, (int)50, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(45, 68, 633, 432);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }
}
