/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIIIiiiiiiii
 *  com.xy.a.q.IIIiiiiiiiiIi
 *  com.xy.bean.LoginResult
 *  com.xy.bean.TTWarRecord
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.IIIIIiiiiiiii;
import com.xy.a.q.IIIiiiiiiiiIi;
import com.xy.bean.LoginResult;
import com.xy.bean.TTWarRecord;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;

public class iIiiIiiiIiIIi
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII[] iIiIiiiiIiIii;
    private IIIIIiiiiiiii[] IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].ALLATORIxDEMO(g);
        }
    }

    public void iIiIiiiiIIiIi(String mes) {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        String[] IiiiiiiiIIIII2 = mes.split("\\|");
        int IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII2[0].substring(1));
        this.ALLATORIxDEMO.setText(IiiiiiiiIIIII2[1]);
        this.iiIiiiiiiiIii.iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII.getSpecies_id().toString()));
        this.IiiiiiiiIIIII[0].setText(IiiiiiiiIIIII.getRolename());
        this.IiiiiiiiIIIII[2].setText(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade()));
        this.IiiiiiiiIIIII[2].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((int)IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade())));
        this.IiiiiiiiIIIII[4].setText(IiiiIiiiiIIII.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getPkrecord()));
        TTWarRecord IiiiiiiiIIIII4 = IiiiiiiiIIIII3 > 0 ? IiiiiiiiIIIII.getTTWarRecord(IiiiiiiiIIIII3) : null;
        this.IiiiiiiiIIIII[1].setText(IiiiiiiiIIIII4 != null ? String.valueOf(IiiiiiiiIIIII4.getTTSL()) + "/" + (IiiiiiiiIIIII4.getTTCZ() - IiiiiiiiIIIII4.getTTSJ()) : "0/0");
        this.IiiiiiiiIIIII[3].setText(IiiiiiiiIIIII2[2]);
        IiiiiiiiIIIII4 = IiiiiiiiIIIII3 > 1 ? IiiiiiiiIIIII.getTTWarRecord(IiiiiiiiIIIII3 - 1) : null;
        this.IiiiiiiiIIIII[5].setText(IiiiiiiiIIIII4 != null && IiiiiiiiIIIII4.getTTRank() > 0 ? String.valueOf(IiiiiiiiIIIII4.getTTRank()) : "\u672a\u4e0a\u699c");
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII5].ALLATORIxDEMO(IiiiiiiiIIIII5 + 3 < IiiiiiiiIIIII2.length ? IiiiiiiiIIIII2[IiiiiiiiIIIII5 + 3] : null);
            ++IiiiiiiiIIIII5;
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public BigDecimal ALLATORIxDEMO(int index) {
        return IIIIIiiiiiiii.ALLATORIxDEMO((IIIIIiiiiiiii)this.IiIIIiiiiIiiI[index]);
    }

    public iIiiIiiiIiIIi(GameView gameView) {
        super(122, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 674, 449, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S284.png");
        this.IiiiiiiiIIIII = new JLabel[26];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new JLabel("\u6d4b\u8bd5\u6570\u636e\u9694\u5c71");
            if (IiiiiiiiIIIII < 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(IiiiiiiiIIIII % 2 == 0 ? 151 : 351, 62 + IiiiiiiiIIIII / 2 * 31, 100, 18);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
            } else {
                int IiiiiiiiIIIII2 = (IiiiiiiiIIIII - 6) / 4;
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(84 + IiiiiiiiIIIII2 * 117, 308 + (IiiiiiiiIIIII - 6) % 4 * 19, 80, 18);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIIIiiiiiiii[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            int n = IiiiiiiiIIIII;
            IIIIIiiiiiiii iIIIIiiiiiiii = new IIIIIiiiiiiii(this, IiiiiiiiIIIII, this);
            ++IiiiiiiiIIIII;
            this.IiIIIiiiiIiiI[n] = iIIIIiiiiiiii;
        }
        this.iIiIiiiiIiIii = new IiiiiiiiiIIII[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            if (IiiiiiiiIIIII < 6) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/b/B" + (386 + IiiiiiiiIIIII) + ".png", 1, 51 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                if (IiiiiiiiIIIII < 3) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(440, 58 + 30 * IiiiiiiiIIIII, 80, 21);
                } else if (IiiiiiiiIIIII < 6) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(530, 59 + 30 * (IiiiiiiiIIIII - 3), 100, 19);
                }
            } else if (IiiiiiiiIIIII == 6) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/28.png", 1, 57, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u8d5b\u5b63\u5956\u52b1", (IiiiIiiiiIiIi)this);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(29, 133, 68, 17);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new JLabel("\u7b2c\u4e00\u8d5b\u5b63:2021\u5e747\u67081\u65e5 \u81f3 2021\u5e747\u670815\u65e5");
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.ALLATORIxDEMO.setForeground(Color.red);
        this.ALLATORIxDEMO.setBounds(28, 159, 460, 16);
        this.add(this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(new iiiiiiiiIIIII(2, 2, 66, 66));
        this.iiIiiiiiiiIii.setBounds(28, 55, 70, 70);
        this.iiIiiiiiiiIii.ALLATORIxDEMO("sc/b/S155.png");
        this.add((Component)this.iiIiiiiiiiIii);
    }

    static /* synthetic */ JLabel[] ALLATORIxDEMO(iIiiIiiiIiIIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id >= 58 && id <= 62) {
            BigDecimal IiiiiiiiIIIII = this.ALLATORIxDEMO(id - 58);
            if (IiiiiiiiIIIII == null) {
                return;
            }
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"teamArena", (String)("M" + IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (id == 51 || id == 52 || id == 53 || id == 57) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"teamArena", (String)("R" + (id == 57 ? 0 : id - 50)));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id == 54) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"getfivemsg", (String)"DD1");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id != 55) {
            if (id != 56) return;
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"teamArena", (String)"C");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        List IiiiiiiiIIIII = (List)this.ALLATORIxDEMO().ALLATORIxDEMO().getNpcShopMap().get("2027");
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IIIiiiiiiiiIi IiiiiiiiIIIII3 = (IIIiiiiiiiiIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(88);
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII, "\u7ade\u6280\u79ef\u5206");
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(88);
    }
}
