/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.scene.BWDHTeam
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class BWDHJpanel7
extends IiiiIiiiiIiIi {
    private RichLabel IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private RichLabel IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public BWDHJpanel7(GameView gameView) {
        super(178, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 747, 383, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/189.png", (int)0, (int)0, (int)0, (int)0, (boolean)false), null);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, 0, 25, 0));
        this.ALLATORIxDEMO = new JLabel[16];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)194, (int)19, (int)360, (int)30, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFF28B"), (Font)iiIIiiiiIiiII.IiIiiiiiIiIiI);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "战斗回合数：99" : (IiiiiiiiIIIII == 1 ? "队伍名称1" : (IiiiiiiiIIIII == 2 ? "队伍名称2" : (IiiiiiiiIIIII == 3 ? "比武大会积分数" : (IiiiiiiiIIIII == 4 ? "战斗结束时存活单位数" : (IiiiiiiiIIIII == 5 ? "全场离场召唤兽" : (IiiiiiiiIIIII == 6 ? "战斗结束时在场灵宝数" : (IiiiiiiiIIIII == 7 ? "全场离场灵宝数" : ""))))))));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiIIiiiIiiII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(148 + (IiiiiiiiIIIII - 1) * 269, 126, 182, 44);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 7) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(211, 186 + (IiiiiiiiIIIII - 3) * 25, 326, 20);
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new RichLabel("#cD1C3421000(#G+100#cD1C342)", iiIIiiiiIiiII.iIIiiiiiiIIII, 90);
        this.IiIIIiiiiIiiI = new RichLabel("#cD1C342(#R-100#cD1C342)1000", iiIIiiiiIiiII.iIIiiiiiiIIII, 90);
        this.IIiiIiiiIIiIi.setBounds(240, 185, 90, 20);
        this.IiIIIiiiiIiiI.setBounds(507 - this.IiIIIiiiiIiiI.getWidth(), 185, 90, 20);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new JLabel[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(240 + IiiiiiiiIIIII / 4 * 237), (int)(211 + IiiiiiiiIIIII % 4 * 25), (int)30, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cD1C342"), (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText("0");
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setHorizontalAlignment(IiiiiiiiIIIII < 4 ? 10 : 4);
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII, 747);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[12];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/191.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(342, 103, 64, 84);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/192.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(196, 73, 86, 45);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/193.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(463, 73, 90, 47);
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/194.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(148 + (IiiiiiiiIIIII - 3) * 269, 126, 182, 51);
            } else if (IiiiiiiiIIIII == 5 || IiiiiiiiIIIII == 6) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/66.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(115, 56 + (IiiiiiiiIIIII - 5) * 251, 561, 2);
            } else if (IiiiiiiiIIIII >= 7 && IiiiiiiiIIIII <= 11) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/139.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(211, 186 + (IiiiiiiiIIIII - 7) * 25, 326, 20);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(boolean win, int matchType, int battleRound, BWDHTeam bwdhTeam1, BWDHTeam bwdhTeam2, String tip) {
        this.ALLATORIxDEMO[0].setText("战斗回合数：" + battleRound);
        this.ALLATORIxDEMO[1].setText(bwdhTeam1.getName());
        this.ALLATORIxDEMO[2].setText(bwdhTeam2.getName());
        if (bwdhTeam1.getData2()[1] != 0) {
            this.IIiiIiiiIIiIi.setTextSize("#cD1C342" + bwdhTeam1.getData2()[0] + "(" + (bwdhTeam1.getData2()[1] > 0 ? "#G" : "#R") + bwdhTeam1.getData2()[1] + "#cD1C342)", 90);
        } else {
            this.IIiiIiiiIIiIi.setTextSize("#cD1C342" + bwdhTeam1.getData2()[0], 90);
        }
        if (bwdhTeam2.getData2()[1] != 0) {
            this.IiIIIiiiiIiiI.setTextSize("#cD1C342(" + (bwdhTeam2.getData2()[1] > 0 ? "#G" : "#R") + bwdhTeam2.getData2()[1] + "#cD1C342)" + bwdhTeam2.getData2()[0], 90);
        } else {
            this.IiIIIiiiiIiiI.setTextSize("#cD1C342" + bwdhTeam2.getData2()[0], 90);
        }
        this.IiIIIiiiiIiiI.setBounds(507 - this.IiIIIiiiiIiiI.getWidth(), 185, 90, 20);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 2) {
            int IiiiiiiiIIIII2 = IiiiiiiiIIIII == 0 ? 0 : 4;
            BWDHTeam IiiiiiiiIIIII3 = IiiiiiiiIIIII == 0 ? bwdhTeam1 : bwdhTeam2;
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2 + 0].setText(String.valueOf(IiiiiiiiIIIII3.getData2()[2]));
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2 + 1].setText(String.valueOf(IiiiiiiiIIIII3.getData2()[3]));
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2 + 2].setText(String.valueOf(IiiiiiiiIIIII3.getData2()[4]));
            ++IiiiiiiiIIIII;
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2 + 3].setText(String.valueOf(IiiiiiiiIIIII3.getData2()[5]));
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)tip)) {
            this.IiiiiiiiIIIII.setTextSize("#W" + tip, 747);
        } else {
            this.IiiiiiiiIIIII.setTextSize(null, 747);
        }
        this.IiiiiiiiIIIII.setBounds((747 - this.IiiiiiiiIIIII.getWidth()) / 2, 326, this.IiiiiiiiIIIII.getWidth(), 20);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
