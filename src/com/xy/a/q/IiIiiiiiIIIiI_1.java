/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.UseCardBean
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class IiIiiiiiIIIiI
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private IiiiiiiiiIIII[] iiIiiiiiiiIii;
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public IiIiiiiiIIIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 682, 475, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/26.png", 1, 282 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u9886\u53d6\u5956\u52b1" : (IiiiiiiiIIIII == 1 ? "\u9886\u53d6\u5956\u52b1" : ""), (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(381, 81 + 190 * IiiiiiiiIIIII, 99, 25);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)67, (int)(172 + IiiiiiiiIIIII * 190), (int)79, (int)22, (Color)Color.black, (Font)iiIIiiiiIiiII.IIiiiiiiiIIIi);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6708\u5361" : (IiiiiiiiIIIII == 1 ? "\u5b63\u5361" : ""));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)253, (int)(84 + IiiiiiiiIIIII * 190), (int)79, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiIIiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            iIIiIiiiIiiIi iIIiIiiiIiiIi2 = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiIiiiIiiIi2.setText("99");
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                if (IiiiiiiiIIIII == 0) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/82.png");
                } else if (IiiiiiiiIIIII == 1) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/83.png");
                }
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(67, 85 + IiiiiiiiIIIII * 190, 79, 77);
            } else if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(67, 85 + (IiiiiiiiIIIII - 2) * 190, 79, 77);
            } else if (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)80, (int)1, (int)80, (int)1, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(154, 109 + (IiiiiiiiIIIII - 4) * 190, 501, 2);
            } else if (IiiiiiiiIIIII == 6) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/84.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(157, 87, 494, 141);
            } else if (IiiiiiiiIIIII == 7) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/85.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(157, 277, 497, 148);
            } else if (IiiiiiiiIIIII == 8 || IiiiiiiiIIIII == 9) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(53, 62 + (IiiiiiiiIIIII - 8) * 190, 610, 180);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        UseCardBean IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLimit("\u6708\u5361");
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getUseTime() / 1440 : 0;
        this.IiiiiiiiIIIII[0].setText(IiiiiiiiIIIII3 > 0 ? String.valueOf(IiiiiiiiIIIII3) : "--");
        this.iiIiiiiiiiIii[0].setVisible(IiiiiiiiIIIII2 != null);
        if (IiiiiiiiIIIII2 == null && this.ALLATORIxDEMO().VALUE.indexOf("K") != -1) {
            this.iiIiiiiiiiIii[0].setText("\u8d2d\u4e70\u6708\u5361");
            this.iiIiiiiiiiIii[0].setVisible(true);
        } else {
            this.iiIiiiiiiiIii[0].setText("\u9886\u53d6\u5956\u52b1");
        }
        IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLimit("\u5b63\u5361");
        IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getUseTime() / 1440 : 0;
        this.IiiiiiiiIIIII[1].setText(IiiiiiiiIIIII3 > 0 ? String.valueOf(IiiiiiiiIIIII3) : "--");
        this.iiIiiiiiiiIii[1].setVisible(IiiiiiiiIIIII2 != null);
        if (IiiiiiiiIIIII2 == null && this.ALLATORIxDEMO().VALUE.indexOf("K") != -1) {
            this.iiIiiiiiiiIii[1].setText("\u8d2d\u4e70\u5b63\u5361");
            this.iiIiiiiiiiIii[1].setVisible(true);
            return;
        }
        this.iiIiiiiiiiIii[1].setText("\u9886\u53d6\u5956\u52b1");
    }

    public void iIiIiiiiIIiii(int id) {
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("R1=" + (id == 283 ? 2 : (id == 282 ? 1 : 0))));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }
}
