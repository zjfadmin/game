/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIIiiiiIiii
extends IiiiIiiiiIiIi {
    private IIiIIiiiIIIiI[] iiiiIiiiIiiII;
    private IiiiiiiiiIIII[] iiiIiiiiiiiIi;
    private IiiiIiiiiIiII[] iIiiIiiiiiiII;
    private iIIiIiiiIiiIi[] IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private MoneyType IiIIIiiiiIiiI;
    private iiIiIiiiiIiIi[] iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        this.iIiiIiiiiiiII[0].setText("0");
        this.iIiiIiiiiiiII[1].setText("0");
        super.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (textField != this.iIiiIiiiiiiII[0]) {
            if (textField != this.iIiiIiiiiiiII[1]) return;
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[1], (long)(31864L * number));
            return;
        }
        LoginResult loginResult = this.ALLATORIxDEMO().getLoginResult();
        int IiiiiiiiIIIII = loginResult.getTurnAround();
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((int)loginResult.getGrade());
        long IiiiiiiiIIIII3 = 0L;
        IiiiiiiiIIIII3 = (long)((double)(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? (IiiiiiiiIIIII3 = IiiiiiiiIIIII <= 3 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2) : this.ALLATORIxDEMO().ALLATORIxDEMO(3, 180)) : (IiiiiiiiIIIII3 = IiiiiiiiIIIII <= 3 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2) : 6000000000L)) * 0.002);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[0], (long)(IiiiiiiiIIIII3 * number));
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 311) {
            long IiiiiiiiIIIII = this.iiiiIiiiIiiII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII <= 0L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8f93\u5165\u4f60\u8981\u5151\u6362\u7684\u6570\u91cf");
                return;
            }
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"fm", (String)("D1" + IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (id != 312) return;
        long IiiiiiiiIIIII = this.iiiiIiiiIiiII[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0L) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8f93\u5165\u4f60\u8981\u5151\u6362\u7684\u6570\u91cf");
            return;
        }
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"fm", (String)("D3" + IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number < 0L) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.IiIIIiiiiIiiI);
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public IiiIIiiiiIiii(GameView gameView) {
        super(170, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 492, 417, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4ee4\u724c\u96c6");
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/31.png", 1, 311 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5151\u6362", (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(354, 98 + IiiiiiiiIIIII * 160, 79, 25);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new JLabel[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)79, (int)(42 + 160 * IiiiiiiiIIIII), (int)100, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1 ? "\u4f0f\u9b54\u4ee4" : (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 5 ? "\u62e5\u6709" : (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 6 ? "\u5151\u6362" : (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 7 ? "\u83b7\u5f97" : (IiiiiiiiIIIII == 8 ? "\u3010\u4eba\u7269\u7ecf\u9a8c\u3011" : (IiiiiiiiIIIII == 9 ? "\u3010\u5927\u8bdd\u5e01\u3011" : ""))))));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(202, 74 + (IiiiiiiiIIIII - 2) * 27, 36, 19);
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 7) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(202, 235 + (IiiiiiiiIIIII - 5) * 27, 36, 19);
            } else if (IiiiiiiiIIIII >= 8 && IiiiiiiiIIIII <= 9) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(239, 148 + (IiiiiiiiIIIII - 8) * 160, 80, 14);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IiiiiiiiIIIII.setTextSize("#c000000\u6e29\u99a8\u63d0\u793a\uff1a#r1\u3001\u6bcf\u5f20\u4f0f\u9b54\u4ee4\u53ef\u5151\u6362\u7684\u4eba\u7269\u7ecf\u9a8c\u4e0e\u5151\u6362\u65f6\u7684\u4eba\u7269\u7b49\u7ea7\u6709\u5173\u3002#r2\u3001\u6bcf\u5f20\u4f0f\u9b54\u4ee4\u53ef\u5151\u6362\u7684\u5927\u8bdd\u5e01,\u6839\u636e\u4ef7\u683c\u89c4\u5f8b\u6d6e\u52a8\u3002", 360);
        this.IiiiiiiiIIIII.setBounds(50, 348, this.IiiiiiiiIIIII.getWidth(), this.IiiiiiiiIIIII.getHeight());
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new MoneyType();
        this.IiIIIiiiiIiiI.setIdAndKey(0, "\u4f0f\u9b54\u4ee4");
        this.iiiiIiiiIiiII = new IIiIIiiiIIIiI[2];
        this.iiIiiiiiiiIii = new iiIiIiiiiIiIi[2];
        this.iIiiIiiiiiiII = new IiiiIiiiiIiII[2];
        this.IIiiIiiiIIiIi = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 2) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)244, (int)(74 + 160 * IiiiiiiiIIIII), (int)94, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.IiIIIiiiiIiiI, (GameView)gameView);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)244, (int)(128 + 160 * IiiiiiiiIIIII), (int)94, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(244, 101 + 160 * IiiiiiiiIIIII, 94, 19);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(2);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII]);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            int n = IiiiiiiiIIIII;
            IIiIIiiiIIIiI iIiIIiiiIIIiI = new IIiIIiiiIIIiI(15, (JTextField)this.iIiiIiiiiiiII[IiiiiiiiIIIII], this.ALLATORIxDEMO());
            ++IiiiiiiiIIIII;
            this.iiiiIiiiIiiII[n] = iIiIIiiiIIIiI;
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 1) {
                if (IiiiiiiiIIIII == 0) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/77.png");
                } else if (IiiiiiiiIIIII == 1) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/78.png");
                }
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(82, 65 + IiiiiiiiIIIII * 160, 92, 92);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(78, 61 + (IiiiiiiiIIIII - 2) * 160, 100, 100);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(50, 28 + (IiiiiiiiIIIII - 4) * 160, 411, 158);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }
}
