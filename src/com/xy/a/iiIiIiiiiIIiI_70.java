/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleControl
 *  com.xy.battle.BattleScene
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.battle.BattleControl;
import com.xy.battle.BattleScene;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JLabel;

public class iiIiIiiiiIIiI
extends IiiiIiiiiIiIi {
    private JLabel[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        BattleControl IiiiiiiiIIIII = this.iiIIiiiiIiIIi.getBattleControl();
        BattleScene IiiiiiiiIIIII2 = IiiiiiiiIIIII.battleScene;
        if (IiiiiiiiIIIII2 == null) return;
        if (!IiiiiiiiIIIII2.battleTip) {
            return;
        }
        this.IiiiiiiiIIIII[0].setText(String.valueOf(IiiiiiiiIIIII2.battleRoundMax) + "\u56de\u5408\u4e0a\u9650");
        boolean IiiiiiiiIIIII3 = IiiiiiiiIIIII.battleCamp == -1 || IiiiiiiiIIIII.battleCamp == 1;
        BattleScene battleScene = IiiiiiiiIIIII2;
        this.IiiiiiiiIIIII[5].setText(String.valueOf(IiiiiiiiIIIII3 ? battleScene.campPetDie2 : battleScene.campPetDie1));
        BattleScene battleScene2 = IiiiiiiiIIIII2;
        this.IiiiiiiiIIIII[7].setText(String.valueOf(IiiiiiiiIIIII3 ? battleScene2.campLingDie2 : battleScene2.campLingDie1));
        BattleScene battleScene3 = IiiiiiiiIIIII2;
        this.IiiiiiiiIIIII[6].setText(String.valueOf(IiiiiiiiIIIII3 ? battleScene3.campPetDie1 : battleScene3.campPetDie2));
        BattleScene battleScene4 = IiiiiiiiIIIII2;
        this.IiiiiiiiIIIII[8].setText(String.valueOf(IiiiiiiiIIIII3 ? battleScene4.campLingDie1 : battleScene4.campLingDie2));
        this.IiiiiiiiIIIII[9].setText(IiiiiiiiIIIII.battleCamp == -1 ? "(\u4e3b\u89c6\u89d2)" : "(\u6211\u65b9)");
        this.IiiiiiiiIIIII[10].setText(IiiiiiiiIIIII.battleCamp == -1 ? "(\u4e3b\u89c6\u89d2)" : "(\u6211\u65b9)");
        BattleScene battleScene5 = IiiiiiiiIIIII2;
        this.IiiiiiiiIIIII[11].setText(IiiiiiiiIIIII3 ? battleScene5.campName2 : battleScene5.campName1);
        BattleScene battleScene6 = IiiiiiiiIIIII2;
        this.IiiiiiiiIIIII[12].setText(IiiiiiiiIIIII3 ? battleScene6.campName1 : battleScene6.campName2);
        int IiiiiiiiIIIII4 = this.getWidth();
        int IiiiiiiiIIIII5 = this.getHeight();
        Point point = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII4, IiiiiiiiIIIII5);
        this.iIiIiiiiIIiii(point.x, point.y, IiiiiiiiIIIII4, IiiiiiiiIIIII5);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public iiIiIiiiiIIiI(GameView gameView) {
        super(161, 5, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 298, 200, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false), null);
        this.IiiiiiiiIIIII = new JLabel[13];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)9, (int)43, (int)280, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFF00"), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "999\u56de\u5408\u4e0a\u9650" : (IiiiiiiiIIIII == 1 ? "\u6d88\u8017\u53ec\u5524\u517d\u6570\u91cf" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017\u7075\u5b9d\u6570\u91cf" : (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4 ? "\uff1a" : (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 8 ? "8\u4e2a" : (IiiiiiiiIIIII == 9 || IiiiiiiiIIIII == 10 ? "\uff08\u6211\u65b9\uff09" : (IiiiiiiiIIIII == 11 ? "\u5b66\u4e60\u4ea4\u6d41\u7ec3\u4e60" : (IiiiiiiiIIIII == 12 ? "\u7ec3\u4e60\u4e34\u6479\u81ea\u5b66" : ""))))))));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(9, 75 + (IiiiiiiiIIIII - 1) * 66, 280, 20);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFBD833"));
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(9, 102 + (IiiiiiiiIIIII - 3) * 66, 280, 20);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IiIiIiiiiiiiI);
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 8) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(49 + (IiiiiiiiIIIII - 5) % 2 * 95, 101 + (IiiiiiiiIIIII - 5) / 2 * 66, 100, 22);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cE8DDCE"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IiIiIiiiiiiiI);
            } else if (IiiiiiiiIIIII == 9 || IiiiiiiiIIIII == 10) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(211, 101 + (IiiiiiiiIIIII - 9) * 66, 69, 22);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cCCCCCC"));
            } else if (IiiiiiiiIIIII == 11) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(10, 9, 120, 20);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            } else if (IiiiiiiiIIIII == 12) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(168, 9, 120, 20);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(4);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/93.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(2, 2, 294, 36);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)50, (int)1, (int)50, (int)1, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(49, 132, 205, 2);
            }
            ++IiiiiiiiIIIII;
        }
    }
}
