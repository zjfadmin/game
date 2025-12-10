/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Gang
 *  com.xy.entity.GangGroup
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IiIIIiiiiiiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.entity.Gang;
import com.xy.entity.GangGroup;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.i.IiIIIiiiiiiIi;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class IIiiiiiiiIIIi
extends IiiiIiiiiIiIi {
    private IiIIIiiiiiiIi IiiIIiiiiiiiI;
    private IiIIIiiiiiiIi IIiiiiiiIiiII;
    private IiIIIiiiiiiIi IiiiIiiiIiIII;
    private IiIIIiiiiiiIi IIiiiiiiiIIIi;
    private JTextArea IIIiiiiiIIiII;
    private IiIIIiiiiiiIi iiIiiiiiiIIiI;
    private IiIIIiiiiiiIi iIiiIiiiIiIIi;
    private IiIIIiiiiiiIi iiiiIiiiIIiii;
    private IiIIIiiiiiiIi iIIiIiiiiiiIi;
    private IiIIIiiiiiiIi IIIIiiiiiiiII;
    private IiIIIiiiiiiIi iiIIIiiiiiiiI;
    private IiIIIiiiiiiIi IiIiiiiiIIIII;
    private IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private IiIIIiiiiiiIi iiiiIiiiIiiII;
    private IIIIIiiiIIIiI[] iiiIiiiiiiiIi;
    private iIIiIiiiIiiIi[] iIiiIiiiiiiII;
    private IiIIIiiiiiiIi IIiiIiiiIIiIi;
    private IiIIIiiiiiiIi[] iIiIiiiiIiIii;
    private IiIIIiiiiiiIi IiIIIiiiiIiiI;
    private JScrollPane iiIiiiiiiiIii;
    private IiIIIiiiiiiIi IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(Gang gang, GangGroup gangGroup) {
        this.iIiiIiiiiiiII[0].setText(gang.getGangname());
        this.iIiiIiiiiiiII[1].setText(gang.getGanggrade().toString());
        this.iIiiIiiiiiiII[2].setText(gang.getBuilder().toString());
        this.iIiiIiiiiiiII[3].setText(gang.getGangnumber().toString());
        this.iIiiIiiiiiiII[4].setText(gang.getGangbelong());
        this.IIIiiiiiIIiII.setText(gang.getIntroduction());
        this.IiiIIiiiiiiiI.ALLATORIxDEMO(gang.getGanggrade().intValue());
        if (gangGroup == null) return;
        this.iiiiIiiiIIiii.ALLATORIxDEMO(gangGroup.getXy());
        this.IiIiiiiiIIIII.ALLATORIxDEMO(gangGroup.getKj());
    }

    public void iIiIiiiiIIiii(int id) {
        if (id != 204) return;
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"obtainarticle", null);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public IIiiiiiiiIIIi(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 662, 475, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiiIi = new IIIIIiiiIIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/26.png", 1, 204 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u8d4f\u529f\u5802" : (IiiiiiiiIIIII == 1 ? "\u5e2e\u6d3e\u4ed3\u5e93" : ""), (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(541, 374 + IiiiiiiiIIIII * 35, 99, 25);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new JLabel[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)540, (int)(67 + 45 * IiiiiiiiIIIII), (int)72, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5e2e\u6d3e\u540d\u79f0" : (IiiiiiiiIIIII == 1 ? "\u5e2e\u6d3e\u7b49\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u5e2e\u6d3e\u8d21\u732e" : (IiiiiiiiIIIII == 3 ? "\u6210\u5458\u6570\u91cf" : (IiiiiiiiIIIII == 4 ? "\u73b0\u4efb\u5e2e\u4e3b" : (IiiiiiiiIIIII == 5 ? "\u5e2e\u6d3e\u5b97\u65e8" : ""))))));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(Color.white);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(47, 324, 490, 21);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiiIiiiiiiII = new iIIiIiiiIiiIi[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)540, (int)(86 + 45 * IiiiiiiiIIIII), (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IIIiiiiiIIiII = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white);
        this.IIIiiiiiIIiII.setLineWrap(true);
        this.IIIiiiiiIIiII.setEditable(false);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)345, (int)490, (int)88, (Component)this.IIIiiiiiIIiII, (int)20);
        this.add(this.iiIiiiiiiiIii);
        this.IIiiiiiiiIIIi = new IiIIIiiiiiiIi("sc/b/B292.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.IIiiiiiiiIIIi.setBounds(250, 180, 19, 18);
        this.add((Component)this.IIiiiiiiiIIIi);
        this.IiiiiiiiIIIII = new IiIIIiiiiiiIi("sc/b/B294.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(203, 202, 22, 19);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iiIIIiiiiiiiI = new IiIIIiiiiiiIi("sc/b/B293.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.iiIIIiiiiiiiI.setBounds(293, 204, 20, 22);
        this.add((Component)this.iiIIIiiiiiiiI);
        this.IIiiIiiiIIiIi = new IiIIIiiiiiiIi("sc/b/B295.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(244, 224, 16, 22);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iiiiIiiiIiiII = new IiIIIiiiiiiIi("sc/b/B300.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIiiII.setBounds(93, 231, 78, 59);
        this.add((Component)this.iiiiIiiiIiiII);
        this.iiiiIiiiIIiii = new IiIIIiiiiiiIi("sc/b/B301.png", 1, 2023, (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIIiii.setBounds(427, 160, 102, 70);
        this.add((Component)this.iiiiIiiiIIiii);
        this.IIiiiiiiIiiII = new IiIIIiiiiiiIi("sc/b/B302.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.IIiiiiiiIiiII.setBounds(50, 175, 57, 61);
        this.add((Component)this.IIiiiiiiIiiII);
        this.IiIIIiiiiIiiI = new IiIIIiiiiiiIi("sc/b/B304.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(438, 62, 87, 71);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IiiIIiiiiiiiI = new IiIIIiiiiiiIi("sc/b/B305.png", 1, 2021, (IiiiIiiiiIiIi)this);
        this.IiiIIiiiiiiiI.setBounds(330, 93, 130, 88);
        this.add((Component)this.IiiIIiiiiiiiI);
        this.IiIiiiiiIIIII = new IiIIIiiiiiiIi("sc/b/B299.png", 1, 2022, (IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(385, 200, 108, 85);
        this.add((Component)this.IiIiiiiiIIIII);
        this.iiIiiiiiiIIiI = new IiIIIiiiiiiIi("sc/b/B298.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiIIiI.setBounds(305, 256, 86, 52);
        this.add((Component)this.iiIiiiiiiIIiI);
        this.IIIIiiiiiiiII = new IiIIIiiiiiiIi("sc/b/B297.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.IIIIiiiiiiiII.setBounds(279, 75, 99, 67);
        this.add((Component)this.IIIIiiiiiiiII);
        this.IiiiIiiiIiIII = new IiIIIiiiiiiIi("sc/b/B296.png", 1, 2026, (IiiiIiiiiIiIi)this);
        this.IiiiIiiiIiIII.setBounds(241, 179, 38, 47);
        this.add((Component)this.IiiiIiiiIiIII);
        this.iIiiIiiiIiIIi = new IiIIIiiiiiiIi("sc/b/B290.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiIiIIi.setBounds(326, 134, 21, 32);
        this.add((Component)this.iIiiIiiiIiIIi);
        this.iIIiIiiiiiiIi = new IiIIIiiiiiiIi("sc/b/B291.png", 1, 0, (IiiiIiiiiIiIi)this);
        this.iIIiIiiiiiiIi.setBounds(370, 160, 21, 27);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.iIiIiiiiIiIii = new IiIIIiiiiiiIi[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IiIIIiiiiiiIi("sc/b/B303.png", 1, 0, (IiiiIiiiiIiIi)this);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii[0].setBounds(106, 234, 24, 42);
        this.iIiIiiiiIiIii[1].setBounds(152, 257, 24, 42);
        this.iIiIiiiiIiIii[2].setBounds(179, 202, 24, 42);
        this.iIiIiiiiIiIii[3].setBounds(210, 222, 24, 42);
        this.iIiIiiiiIiIii[4].setBounds(279, 148, 24, 42);
        this.iIiIiiiiIiIii[5].setBounds(312, 168, 24, 42);
        this.iIiIiiiiIiIii[6].setBounds(423, 58, 24, 42);
        this.iIiIiiiiIiIii[7].setBounds(496, 100, 24, 42);
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/b/S166.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(50, 60, 481, 261);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(47, 55, 490, 269);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(47, 324, 490, 21);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(47, 324, 490, 112);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
    }
}
