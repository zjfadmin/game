/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIIIiiiIiIii
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.v;

import com.xy.a.v.IIIIIiiiIiIii;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class iiIIiiiiIiiII
extends IiiiIiiiiIiIi {
    private iiIiIiiiIIIiI[] iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private IiiiIiiiiIiII IIiiIiiiIIiIi;
    private IIIIIiiiIiIii[] iIiIiiiiIiIii;
    private IIiIIiiiIIIiI IiIIIiiiiIiiI;
    private long iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public iiIIiiiiIiiII(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 703, 542, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiiIi = new iiIiIiiiIIIiI[1];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new iiIiIiiiIIIiI(IiiiiiiiIIIII == 0 ? "sc/e/188.png" : (IiiiiiiiIIIII == 1 ? "sc/e/156.png" : "sc/e/155.png"), 1, 181 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(342, 69, 20, 20);
            if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(305 + (IiiiiiiiIIIII - 1) * 94, 498, 18, 25);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)172, (int)69, (int)46, (int)19, (Color)Color.black, (Font)com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.ALLATORIxDEMO.setText("\u641c\u7d22");
        this.add(this.ALLATORIxDEMO);
        this.iIiiIiiiiiiII = new RichLabel("", com.xy.q.iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiiIiiiiiiII.setTextSize("#c484333\u3010\u89c4\u5219\u8bf4\u660e\u3011#r\u53ef\u4ee5\u81ea\u9009\u975e5A\u76846\u4f4d\u6570\u9753\u53f7", 480);
        this.iIiiIiiiiiiII.setBounds(172, 94, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)com.xy.q.iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IIiiIiiiIIiIi.setBounds(216, 69, 144, 19);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI = new IIiIIiiiIIIiI(0, (JTextField)this.IIiiIiiiIIiIi, (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii = new IIIIIiiiIiIii[16];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIIIiiiIiIii(this, IiiiiiiiIIIII, this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(43 + IiiiiiiiIIIII % 4 * 160, 217 + IiiiiiiiIIIII / 4 * 70, 156, 66);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)100, (int)1, (int)100, (int)1, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(47, 208, 629, 2);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/201.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(63, 26, 81, 207);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(44, 58, 634, 142);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(int id, int key) {
        if (id == 180) {
            if (key == 0) {
                return;
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("B0" + key));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id != 181) {
            if (id == 182) return;
            return;
        }
        if (iIiIIiiiIiiiI.iIiIiiiiIIiii() - this.iiIiiiiiiiIii < (long)(iIiIIiiiIiiiI.IIIIiiiiiiiII * 10)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u70b9\u7684\u592a\u5feb\u4e86");
            return;
        }
        this.iiIiiiiiiiIii = iIiIIiiiIiiiI.iIiIiiiiIIiii();
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("V0" + this.IIiiIiiiIIiIi.getText()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(int[] data) {
        Activity IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII != null ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getActivitySet(), (String)"\u9009\u9753\u53f7\u8bf4\u660e=", (String)"|") : 0;
        ActivityFC IiiiiiiiIIIII3 = IiiiiiiiIIIII2 > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2) : null;
        this.iIiiIiiiiiiII.setTextSize(IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getValue() : "\u8fd8\u672a\u8bbe\u7f6e\u8bf4\u660e\u6587\u672c", 480);
        this.iIiiIiiiiiiII.setBounds(172, 94, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        int IiiiiiiiIIIII4 = data[0];
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.iIiIiiiiIiIii.length) {
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII5 + 1 < data.length ? data[IiiiiiiiIIIII5 + 1] : 0;
            IIIIIiiiIiIii iIIIIiiiIiIii = this.iIiIiiiiIiIii[IiiiiiiiIIIII5];
            ++IiiiiiiiIIIII5;
            iIIIIiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII6, IiiiiiiiIIIII4);
        }
    }
}
