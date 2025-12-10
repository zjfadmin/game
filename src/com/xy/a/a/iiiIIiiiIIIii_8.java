/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiiIiiiIIiIi
 *  com.xy.a.a.iIIIiiiiiIiIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.Lingbao
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.HandleLingbao
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiiIi
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiIIiiiiIiii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IIiiIiiiIIiIi;
import com.xy.a.a.iIIIiiiiiIiIi;
import com.xy.bean.ConfirmBean;
import com.xy.entity.Lingbao;
import com.xy.formula.ExpUtil;
import com.xy.formula.PropertyUtil;
import com.xy.game.HandleLingbao;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiiIi;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiIIiiiiIiii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class iiiIIiiiIIIii
extends IiiiIiiiiIiIi {
    private iIIIiiiiiIiIi iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private IiiIIiiiiIiii IIiiIiiiIIiIi;
    private IiiIIiiiiIiii iIiIiiiiIiIii;
    private IIiiIiiiIIiIi IiIIIiiiiIiiI;
    private IIiIiiiiIiiIi iiIiiiiiiiIii;
    private IIiIiiiiIiiIi IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(int id) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        Lingbao IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChoseBao();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (id == 21) {
            if (IiiiiiiiIIIII2.getBaotype().equals("\u6cd5\u5b9d")) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u5220\u9664\u6cd5\u5b9d");
                return;
            }
            if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2.getFushis())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5220\u9664\u524d\u5148\u5378\u4e0b\u7b26\u77f3");
                return;
            }
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(8, IiiiiiiiIIIII2.getBaoid().toString(), "#Y\u786e\u5b9a\u8981\u5c06\u8be5\u7075\u5b9d\u5220\u9664\u5417\uff1f\uff1f\uff1f"));
            return;
        }
        if (id != 22) {
            if (id != 23) return;
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(10, IiiiiiiiIIIII2.getBaoid().toString(), "#Y\u786e\u5b9a\u8981\u5c06\u82b1  #G200000 #Y\u94f6\u4e24\u968f\u673a\u7075\u5b9d\u9644\u52a0\u6297\u6027\u5417??"));
            return;
        }
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLingbaolvl().intValue();
        long IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getLingbaoexe().longValue();
        long IiiiiiiiIIIII5 = ExpUtil.iIiIiiiiIIiii((int)IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII3 % 30 == 0 && IiiiiiiiIIIII4 >= IiiiiiiiIIIII5 && IiiiiiiiIIIII3 != 0) {
            StringBuffer IiiiiiiiIIIII6 = new StringBuffer();
            IiiiiiiiIIIII6.append("#Y\u4f60\u662f\u5426\u8981\u6d88\u8017#R");
            IiiiiiiiIIIII6.append(IiiiiiiiIIIII3 / 5);
            IiiiiiiiIIIII6.append("#Y\u4e2a\u7075\u5b9d\u5929\u5a01\u5370\u8fdb\u884c\u7a81\u7834");
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(9, IiiiiiiiIIIII2.getBaoid().toString(), IiiiiiiiIIIII6.toString()));
            return;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd8\u672a\u8fbe\u5230\u7a81\u7834\u6761\u4ef6");
    }

    public void iIiIiiiiIIiii(Lingbao lingbao) {
        if (this.IiIIIiiiiIiiI.isVisible()) {
            this.ALLATORIxDEMO().iIiIiiiiIIiii(lingbao.getBaoid(), 0);
            return;
        }
        this.ALLATORIxDEMO(lingbao);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Lingbao lingbao) {
        block13: {
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                this.iiiIiiiiiiIIi();
                return;
            }
            IiiiiiiiIIIII.setChoseBaoId(lingbao != null ? lingbao.getBaoid() : null);
            if (lingbao == null) {
                this.iiiIiiiiiiIIi();
                return;
            }
            iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi).ALLATORIxDEMO(com.xy.w.IIiIiiiiIiiIi.IIIIIiiiiIIii((String)lingbao.getSkin()));
            iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[0].setText(lingbao.getBaoname());
            iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[8].setText(lingbao.getBaoquality());
            iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[0].setText(lingbao.getLingbaolvl() + "\u7ea7");
            iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[1].setText(lingbao.getKangxing());
            iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[1].ALLATORIxDEMO(lingbao.getLingbaoexe().doubleValue() / (double)ExpUtil.iIiIiiiiIIiii((int)lingbao.getLingbaolvl().intValue()), 98);
            if (!lingbao.getBaotype().equals("\u6cd5\u5b9d")) break block13;
            iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi).setTextSize(null, 200);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl28
        }
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi).setTextSize(PropertyUtil.getBaoString((Lingbao)lingbao, (RoleData)IiiiiiiiIIIII, (int)200), 200);
        IiiiiiiiIIIII = IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)lingbao.getFushis()) == false ? lingbao.getFushis().split("\\|") : null;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl39
        do {
            v0 = iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            v0.ALLATORIxDEMO(0, null);
lbl28:
            // 2 sources

        } while (IiiiiiiiIIIII < iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi).length);
        return;
        do {
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII < IiiiiiiiIIIII.length && (IiiiiiiiIIIII = IiiiiiiiIIIII.getGoodEquip(new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII]))) != null) {
                iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII >= lingbao.getFusum()) {
                iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[IiiiiiiiIIIII].ALLATORIxDEMO(6, (Object)1);
            } else {
                iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            }
            ++IiiiiiiiIIIII;
lbl39:
            // 2 sources

        } while (IiiiiiiiIIIII < 5);
        IiiiiiiiIIIII = IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)lingbao.getSkills()) == false ? lingbao.getSkills().split("\\|") : null;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[5 + IiiiiiiiIIIII].ALLATORIxDEMO(7, (Object)IiiiiiiiIIIII[IiiiiiiiIIIII]);
            } else if (IiiiiiiiIIIII >= lingbao.getSkillsum()) {
                iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[5 + IiiiiiiiIIIII].ALLATORIxDEMO(6, (Object)2);
            } else {
                iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[5 + IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void iiiIiiiiiiIIi() {
        this.iIiiIiiiiiiII[1].setVisible(false);
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi).iIiIiiiiIIiii();
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[0].setText(null);
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[8].setText(null);
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[0].setText(null);
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[1].setText(null);
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[1].ALLATORIxDEMO(0.0, 98);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi).length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi)[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        iIIIiiiiiIiIi.ALLATORIxDEMO((iIIIiiiiiIiIi)this.iiiIiiiiiiiIi).setTextSize(null, 200);
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.iIiIiiiiIIiii(1);
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public iiiIIiiiIIIii(GameView gameView) {
        super(43, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, (GameView)gameView2);
        void gameView2;
        this.ALLATORIxDEMO(-2, 0, 542, 475, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u7075 \u5b9d ");
        this.iiIiiiiiiiIii = new IIiIiiiiIiiIi("sc/e/41.png", 2, 1, iiIIiiiiIiiII.iIiIiiiiiiIIi, null, new String[]{"\u7075", "\u5b9d", "\u88c5", "\u5907"}, (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII = new IIiIiiiiIiiIi("sc/e/41.png", 2, 2, iiIIiiiiIiiII.iIiIiiiiiiIIi, null, new String[]{"\u7075", "\u5b9d", "\u5c5e", "\u6027"}, (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(new iiiiiiiiIIIII(6, 19, 0, 18));
        this.IiiiiiiiIIIII.ALLATORIxDEMO(new iiiiiiiiIIIII(6, 19, 0, 18));
        this.iiIiiiiiiiIii.setBounds(42, 40, 30, 80);
        this.IiiiiiiiIIIII.setBounds(42, 121, 30, 80);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(iiIIiiiiIiiII.IIiiiiiiiIIII);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(iiIIiiiiIiiII.IIiiiiiiiIIII);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIiiIiiiIIiIi(this);
        this.IiIIIiiiiIiiI.setBounds(72, 35, 440, 295);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiiIiiiiiiiIi = new iIIIiiiiiIiIi(this);
        this.iiiIiiiiiiiIi.setBounds(72, 35, 440, 295);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/41.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(166, 9, 247, 41);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/37.png");
            } else if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(71 + (IiiiiiiiIIIII - 2) * 233, 329, 207, 105);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(72, 35, 440, 295);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new JLabel[14];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(50 + IiiiiiiiIIIII % 2 * 234), (int)(358 + IiiiiiiiIIIII / 2 * 29), (int)20, (int)20, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u7075" : (IiiiiiiiIIIII == 1 ? "\u6cd5" : (IiiiiiiiIIIII == 2 ? "\u5b9d" : (IiiiiiiiIIIII == 3 ? "\u5b9d" : ""))));
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        IIiiIiiiIiiiI[] IiiiiiiiIIIII2 = new IIiiIiiiIiiiI[2];
        IIiiIiiiIiiiI[] IiiiiiiiIIIII3 = new IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.length) {
            IiiiiiiiIIIII2[IiiiiiiiIIIII4] = new IIiiIiiiIiiiI(IiiiiiiiIIIII4 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII4, (IiiiIiiiiIiIi)this);
            IiiiiiiiIIIII3[IiiiiiiiIIIII4] = new IIiiIiiiIiiiI(IiiiiiiiIIIII4 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII4, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII2[IiiiiiiiIIIII4].setBounds(238, 435, 18, 18);
                IiiiiiiiIIIII3[IiiiiiiiIIIII4].setBounds(471, 435, 18, 18);
            } else {
                IiiiiiiiIIIII2[IiiiiiiiIIIII4].setBounds(260, 435, 18, 18);
                IiiiiiiiIIIII3[IiiiiiiiIIIII4].setBounds(493, 435, 18, 18);
            }
            this.add((Component)IiiiiiiiIIIII2[IiiiiiiiIIIII4]);
            this.add((Component)IiiiiiiiIIIII3[IiiiiiiiIIIII4++]);
        }
        this.IIiiIiiiIIiIi = new IiiIIiiiiIiii(true, (IiiiIiiiiIiIi)this, 4, 2, 51, 51, 0, 0, 72, 331);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII2, 1);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IiiIIiiiiIiii(false, (IiiiIiiiiIiIi)this, 4, 2, 51, 51, 0, 0, 305, 331);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII3, 1);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        Lingbao IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChoseBao();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (IiiiiiiiIIIII2.getBaotype().equals("\u6cd5\u5b9d")) {
            return;
        }
        if (imgGrid.ALLATORIxDEMO() == 6 && imgGrid.ALLATORIxDEMO() == 1L) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO(4);
            if (IiiiiiiiIIIII3 == -1) {
                return;
            }
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(5, IiiiiiiiIIIII2.getBaoid().toString(), "#Y\u786e\u5b9a\u8981\u5c06\u82b1#G " + IiiiiiiiIIIII3 * 8 + " #Y\u4e2a\u7075\u5b9d\u5929\u5a01\u5370\u5f00\u542f\u7b2c#G " + IiiiiiiiIIIII3 + " #Y\u4e2a\u7b26\u77f3\u683c\u5b50\u5417?"));
            return;
        }
        if (imgGrid.ALLATORIxDEMO() == 6 && imgGrid.ALLATORIxDEMO() == 2L) {
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.iIiIiiiiIIiii(4);
            if (IiiiiiiiIIIII4 == -1) {
                return;
            }
            if ((IiiiiiiiIIIII4 - 2) * 30 + 1 > IiiiiiiiIIIII2.getLingbaolvl().intValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u9700\u8981\u7b49\u7ea7\u5927\u4e8e" + ((IiiiiiiiIIIII4 - 2) * 30 + 1) + "\u624d\u80fd\u5f00\u542f" + IiiiiiiiIIIII4 + "\u4e2a\u6280\u80fd\u683c\u5b50");
                return;
            }
            if (IiiiiiiiIIIII4 >= 4 && !IiiiiiiiIIIII2.getBaoquality().equals("\u65e0\u4ef7") && !IiiiiiiiIIIII2.getBaoquality().equals("\u4f20\u4e16")) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7075\u5b9d\u54c1\u8d28\u9700\u8981\u662f\u65e0\u4ef7\u6216\u8005\u4f20\u4e16\u624d\u80fd\u5f00\u542f\u7b2c4\u548c5\u7684\u6280\u80fd\u683c\u5b50");
                return;
            }
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(6, IiiiiiiiIIIII2.getBaoid().toString(), "#Y\u786e\u5b9a\u8981\u5c06\u82b1#G " + IiiiiiiiIIIII4 * 8 + " #Y\u4e2a\u7075\u5b9d\u5929\u5a01\u5370\u5f00\u542f\u7b2c#G " + IiiiiiiiIIIII4 + " #Y\u4e2a\u6280\u80fd\u683c\u5b50\u5417?"));
            return;
        }
        if (imgGrid.ALLATORIxDEMO() == 1) {
            HandleLingbao.ALLATORIxDEMO((BigDecimal)new BigDecimal(imgGrid.ALLATORIxDEMO()), (Lingbao)IiiiiiiiIIIII2, (RoleData)IiiiiiiiIIIII);
            return;
        }
        if (imgGrid.ALLATORIxDEMO() != 7) return;
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(7, String.valueOf(IiiiiiiiIIIII2.getBaoid().toString()) + "|" + imgGrid.ALLATORIxDEMO() + "=" + imgGrid.ALLATORIxDEMO(), "#Y\u786e\u5b9a\u8981\u82b1 #G100000#Y\u94f6\u4e24\u5220\u9664 #G" + imgGrid.ALLATORIxDEMO() + "\u3010" + imgGrid.ALLATORIxDEMO() + "\u4eba\u5408\u6280\u3011"));
            return;
        }
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(7, String.valueOf(IiiiiiiiIIIII2.getBaoid().toString()) + "|" + imgGrid.ALLATORIxDEMO() + "=" + imgGrid.ALLATORIxDEMO(), "#Y\u786e\u5b9a\u8981\u82b1 #G800000#Y\u94f6\u4e24\u5220\u9664 #G" + imgGrid.ALLATORIxDEMO() + "\u3010" + imgGrid.ALLATORIxDEMO() + "\u4eba\u5408\u6280\u3011"));
    }

    public void iIiIiiiiIIiii(int id) {
        this.iiIiiiiiiiIii.ALLATORIxDEMO(id == 1);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(id == 2);
        this.iIiiIiiiiiiII[1].setVisible(false);
        this.IiIIIiiiiIiiI.setVisible(id == 1);
        if (id == 1) {
            this.ALLATORIxDEMO((Lingbao)null);
        } else if (id == 2) {
            this.ALLATORIxDEMO(this.ALLATORIxDEMO().getLingbao(this.ALLATORIxDEMO().lingbaoChoses[0]));
        }
        this.iiiIiiiiiiiIi.setVisible(id == 2);
    }

    public boolean ALLATORIxDEMO() {
        this.ALLATORIxDEMO((Lingbao)null);
        return super.ALLATORIxDEMO();
    }
}
