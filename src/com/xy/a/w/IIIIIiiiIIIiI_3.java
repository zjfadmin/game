/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.bean.UseCardBean
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private RichLabel IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private iiIiIiiiiIiIi IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi[] iiIiiiiiiiIii;
    private IIiIiiiiIiIII[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public IIIIIiiiIIIiI(GameView gameView) {
        super(185, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 280, 298, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.IiiiiiiiIIIII = new IIiIiiiiIiIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/7.png", 1, 386 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "确定" : (IiiiiiiiIIIII == 1 ? "取消" : ""), (IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(65 + 90 * IiiiiiiiIIIII, 242, 59, 25);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new JLabel[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)91, (int)110, (int)66, (int)14, (Color)Color.white, (Font)(IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1 ? iiIIiiiiIiiII.iIIiiiiiiIIII : iiIIiiiiIiiII.iiiiIiiiIiiII));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "剩余时间：" : (IiiiiiiiIIIII == 1 ? "10086天" : (IiiiiiiiIIIII == 2 ? "延时天数" : (IiiiiiiiIIIII == 3 ? "每月费用" : (IiiiiiiiIIIII == 4 ? "总 费 用" : (IiiiiiiiIIIII == 5 ? "拥有积分" : ""))))));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
            if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(157, 110, 80, 14);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.red);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 5) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.black);
                if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(48, 137 + (IiiiiiiiIIIII - 2) * 23, 72, 19);
                } else if (IiiiiiiiIIIII == 5) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(48, 211, 72, 19);
                }
            }
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new iIIiIiiiIiiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)122, (int)(137 + 23 * IiiiiiiiIIIII), (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii[0].setText("30天");
        MoneyType IiiiiiiiIIIII2 = new MoneyType();
        IiiiiiiiIIIII2.setIdAndKey(4, "积分");
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)122, (int)211, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)IiiiiiiiIIIII2, (GameView)gameView);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IIiiIiiiIIiIi = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.ALLATORIxDEMO.setBounds(29, 28, 220, 100);
        this.add((Component)this.ALLATORIxDEMO);
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 386) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)"T");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id != 387) return;
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    public boolean iIiIiiiiIIiii() {
        BeauBean IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        UseCardBean IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLimit("靓号");
        BeauBean beauBean = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        if (IiiiiiiiIIIII.ALLATORIxDEMO()) {
            this.IIiiIiiiIIiIi.setTextSize("#VBEAU" + IiiiiiiiIIIII.toString() + "#L", 220);
        } else {
            this.IIiiIiiiIIiIi.setTextSize("#cFF00FF" + IiiiiiiiIIIII.getBeau(), 220);
        }
        this.IIiiIiiiIIiIi.setBounds(29 + (220 - this.IIiiIiiiIIiIi.getWidth()) / 2, 68, this.IIiiIiiiIIiIi.getWidth(), this.IIiiIiiiIIiIi.getHeight());
        long IiiiiiiiIIIII4 = Math.max(IiiiiiiiIIIII3.getUseTime(), 0);
        if (IiiiiiiiIIIII4 == 0L) {
            this.iIiIiiiiIiIii[1].setText("0天");
        } else if (IiiiiiiiIIIII4 < 60L) {
            this.iIiIiiiiIiIii[1].setText(String.valueOf(IiiiiiiiIIIII4) + "分钟");
        } else if (IiiiiiiiIIIII4 < 1440L) {
            this.iIiIiiiiIiIii[1].setText(String.valueOf(IiiiiiiiIIIII4 / 60L) + "小时");
        } else {
            this.iIiIiiiiIiIii[1].setText(String.valueOf(IiiiiiiiIIIII4 / 1440L) + "天");
        }
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII.getLvl() == 1 ? 6 : (IiiiiiiiIIIII.getLvl() == 2 ? 98 : 198);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii[1], (long)IiiiiiiiIIIII5);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii[2], (long)IiiiiiiiIIIII5);
        return true;
    }

    public void iIiIiiiiIIiii() {
        if (!this.iIiIiiiiIIiii()) {
            return;
        }
        super.iIiIiiiiIIiii();
    }
}
