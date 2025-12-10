/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class iIiIIiiiiiiiI
extends IiiiIiiiiIiIi {
    private RichLabel IiIiiiiiIIIII;
    private IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private IiiiiiiiiIIII[] iiiiIiiiIiiII;
    private iiIiIiiiiIiIi iiiIiiiiiiiIi;
    private IIIIIiiiIIIiI iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi = new BigDecimal(1000000);
    private JLabel[] iIiIiiiiIiIii;
    private IIIIIiiiIIIiI IiIIIiiiiIiiI;
    private JScrollPane iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private iIIiIiiiIiiIi ALLATORIxDEMO;

    public void ALLATORIxDEMO(RoleSummoning pet, int type) {
        List IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        if (type == 1) {
            IiiiiiiiIIIII.add(pet);
        } else {
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.size()) {
                if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)pet.getSid(), (BigDecimal)((RoleSummoning)IiiiiiiiIIIII.get(IiiiiiiiIIIII2)).getSid())) {
                    ++IiiiiiiiIIIII2;
                    continue;
                }
                IiiiiiiiIIIII.remove(IiiiiiiiIIIII2);
                break;
            }
        }
        this.iIiiIiiiiiiII.ALLATORIxDEMO();
        this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        this.iiiIiiiiiiiIi.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO(List<RoleSummoning> pets) {
        this.IiIIIiiiiIiiI.ALLATORIxDEMO((List)(pets != null ? pets : new ArrayList()));
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii(int id) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (id == 106) {
            RoleSummoning IiiiiiiiIIIII2;
            RolePet IiiiiiiiIIIII3 = IiiiiiiiIIIII.getRolePet(this.iIiiIiiiiiiII.ALLATORIxDEMO());
            RoleSummoning roleSummoning = IiiiiiiiIIIII2 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getPet() : null;
            if (IiiiiiiiIIIII2 == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u5148\u9009\u4e2d\u53ec\u5524\u517d");
                return;
            }
            if (IiiiiiiiIIIII2.getGoods() != null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u643a\u5e26\u7740\u88c5\u5907\u6216\u5185\u4e39");
                return;
            }
            if (IiiiiiiiIIIII.getPetMount(IiiiiiiiIIIII2.getSid()) != null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u88ab\u7ba1\u5236\u4e2d\uff0c\u4e0d\u53ef\u653e\u751f\uff01\uff01\uff01");
                return;
            }
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getLoginResult().getSummoning_id(), (BigDecimal)IiiiiiiiIIIII2.getSid())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u5df2\u5728\u53c2\u6218\u4e2d\uff01\uff01\uff01");
                return;
            }
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"pawnpet", (String)("P" + IiiiiiiiIIIII2.getSid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        if (id != 107) return;
        if (IiiiiiiiIIIII.pets.size() >= 21) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u7684\u53ec\u5524\u517d\u53ef\u643a\u5e26\u7684\u6570\u91cf\u5df2\u6ee1\uff01\uff01\uff01");
            return;
        }
        RoleSummoning IiiiiiiiIIIII5 = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        if (IiiiiiiiIIIII5 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u5148\u9009\u4e2d\u53ec\u5524\u517d");
            return;
        }
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"pawnpet", (String)("R" + IiiiiiiiIIIII5.getSid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public iIiIIiiiiiiiI(GameView gameView) {
        super(131, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 542, 375, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u53ec\u5524\u517d\u5bc4\u5b58");
        this.iIiiIiiiiiiII = new IIIIIiiiIIIiI((IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(0, 0, 180, 20);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)67, (int)151, (int)180, (int)149, (Component)this.iIiiIiiiiiiII, (int)20);
        this.add(this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI((IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(0, 0, 180, 20);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)318, (int)151, (int)180, (int)149, (Component)this.IiIIIiiiiIiiI, (int)20);
        this.add(this.iiIiiiiiiiIii);
        this.IiIiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IiIiiiiiIIIII.setTextSize("#c000000\u6e29\u99a8\u63d0\u793a\uff1a1\u3001\u5de6\u53f3\u5217\u8868\u5404\u90091\u53ea\u53ec\u5524\u517d\u53ef\u4ee5\u4ea4\u6362\u4f4d\u7f6e\uff1b#r         2\u3001\u5bc4\u5b58\uff08\u4ea4\u6362\uff09\u8d39\u7528\u4e0e\u53ec\u5524\u517d\u5217\u8868\u6240\u9009\u53ec\u5524\u517d\u7ea7\u522b\u6709\u5173\u3002", 408);
        this.IiIiiiiiIIIII.setBounds(95, 41, this.IiIiiiiiIIIII.getWidth(), this.IiIiiiiiIIIII.getHeight());
        this.add((Component)this.IiIiiiiiIIIII);
        this.iiiiIiiiIiiII = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/26.png", 1, 106 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5bc4 \u5b58" : (IiiiiiiiIIIII == 1 ? "\u53d6 \u56de" : ""), (IiiiIiiiiIiIi)this);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(109 + 245 * IiiiiiiiIIIII, 308, 99, 25);
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)166, (int)94, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.ALLATORIxDEMO);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.ALLATORIxDEMO, (long)this.IIiiIiiiIIiIi.longValue());
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)364, (int)94, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(2);
        this.iiiIiiiiiiiIi.setText("0");
        MoneyType IiiiiiiiIIIII2 = new MoneyType();
        IiiiiiiiIIIII2.setIdAndKey(1, "\u73b0\u91d1");
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iIiIiiiiIiIii = new JLabel[4];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(92 + 198 * IiiiiiiiIIIII3), (int)94, (int)72, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII3 == 0 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII3 == 1 ? "\u62e5\u6709\u73b0\u91d1" : (IiiiiiiiIIIII3 == 2 ? "\u53ec\u5524\u517d\u5217\u8868" : (IiiiiiiiIIIII3 == 3 ? "\u5bc4\u5b58\u5217\u8868" : ""))));
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII3]);
            if (IiiiiiiiIIIII3 >= 2 && IiiiiiiiIIIII3 <= 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setBounds(67 + 251 * (IiiiiiiiIIIII3 - 2), 130, 180, 21);
            }
            ++IiiiiiiiIIIII3;
        }
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI[7];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII3]);
            if (IiiiiiiiIIIII3 >= 0 && IiiiiiiiIIIII3 <= 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(67 + 251 * IiiiiiiiIIIII3, 130, 180, 21);
            }
            if (IiiiiiiiIIIII3 >= 2 && IiiiiiiiIIIII3 <= 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(67 + 251 * (IiiiiiiiIIIII3 - 2), 130, 180, 170);
            }
            if (IiiiiiiiIIIII3 >= 4 && IiiiiiiiIIIII3 <= 5) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(251 + 33 * (IiiiiiiiIIIII3 - 4), 166, 30, 56);
                if (IiiiiiiiIIIII3 == 4) {
                    this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].iIiIiiiiIIiii("sc/d/68.png");
                }
                if (IiiiiiiiIIIII3 == 5) {
                    this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].iIiIiiiiIIiii("sc/d/69.png");
                }
            }
            if (IiiiiiiiIIIII3 == 6) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(54, 28, 460, 320);
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public void iIiIiiiiIIiii() {
        this.iIiiIiiiiiiII.ALLATORIxDEMO();
        this.iiiIiiiiiiiIi.iIiIiiiiIIiii();
        super.iIiIiiiiIIiii();
    }
}
