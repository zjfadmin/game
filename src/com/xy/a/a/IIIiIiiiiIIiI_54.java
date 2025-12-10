/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIiIIiiiIIIiI
 *  com.xy.a.a.iIiIIiiiIIiIi
 *  com.xy.formula.BaseMountSH
 *  com.xy.game.RoleData
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.iIiIIiiiIIIiI;
import com.xy.a.a.iIiIIiiiIIiIi;
import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiiIIiI
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi[] IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private iIiIIiiiIIIiI IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private iIiIIiiiIIiIi IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number < 0L) {
            return 0L;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getMoney(iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)this.IiiiiiiiIIIII)) / iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)this.IiiiiiiiIIIII);
        BaseMountSH IiiiiiiiIIIII3 = IiiiiiiiIIIII.getMountSHByindex(this.iiIiiiiiiiIii);
        IiiiiiiiIIIII2 = Math.min((long)IiiiiiiiIIIII3.getExpTotal() - (long)IiiiiiiiIIIII3.getExp(), IiiiiiiiIIIII2);
        if (number <= IiiiiiiiIIIII2) return null;
        return IiiiiiiiIIIII2;
    }

    public void iiiIiiiiiiIIi(int id) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        BaseMountSH IiiiiiiiIIIII2 = IiiiiiiiIIIII.getMountSHByindex(this.iiIiiiiiiiIii);
        if (id == 211 || id == 212) {
            long IiiiiiiiIIIII3;
            long IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getExpTotal();
            long l = IiiiiiiiIIIII3 = id == 211 ? iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)this.IiiiiiiiIIIII).ALLATORIxDEMO() : IiiiiiiiIIIII4 - (long)IiiiiiiiIIIII2.getExp();
            if (IiiiiiiiIIIII3 <= 0L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u63d0\u5347\u4fee\u4e3a\u70b9\u6570\u4e0d\u80fd\u4e3a0");
                return;
            }
            if (IiiiiiiiIIIII.getMoney(iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)this.IiiiiiiiIIIII)) < IiiiiiiiIIIII3 * iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)this.IiiiiiiiIIIII)) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
                return;
            }
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"usermount", (String)("SHXL" + IiiiiiiiIIIII2.getId() + "|" + IiiiiiiiIIIII3));
            this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        if (id != 213) return;
        Goodstable IiiiiiiiIIIII6 = IiiiiiiiIIIII.ALLATORIxDEMO(107L);
        if (IiiiiiiiIIIII6 != null && iIiIIiiiIIIiI.ALLATORIxDEMO((iIiIIiiiIIIiI)this.IiIIIiiiiIiiI) <= (long)IiiiiiiiIIIII6.getUsetime().intValue()) {
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"usermount", (String)("SHTP" + IiiiiiiiIIIII2.getId() + "|" + IiiiiiiiIIIII6.getRgid()));
            this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u8db3\u591f\u7684\u7075\u5143\u6676");
    }

    public void iiiIiiiiiiIIi() {
        BaseMountSH IiiiiiiiIIIII = this.ALLATORIxDEMO().getMountSHByindex(this.iiIiiiiiiiIii);
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getExpTotal();
        this.IIiiIiiiIIiIi[0].setText(BaseMountSH.SH_HEAD_NAME[this.iiIiiiiiiiIii]);
        this.IIiiIiiiIIiIi[1].setText(String.valueOf(IiiiiiiiIIIII.getLvl()));
        this.IIiiIiiiIIiIi[2].setText(String.valueOf(String.valueOf(IiiiiiiiIIIII.getExp()) + "/" + IiiiiiiiIIIII2));
        if ((long)IiiiiiiiIIIII.getExp() < IiiiiiiiIIIII2) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            this.IiiiiiiiIIIII.setVisible(true);
            this.IiIIIiiiiIiiI.setVisible(false);
            return;
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI.setVisible(true);
        this.IiiiiiiiIIIII.setVisible(false);
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)this.IiiiiiiiIIIII), (long)(iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)this.IiiiiiiiIIIII) * number));
    }

    public IIIiIiiiiIIiI(GameView gameView) {
        super(174, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 342, 386, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u63d0\u5347\u5b88\u62a4\u4e4b\u529b");
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 44));
        this.ALLATORIxDEMO = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)65, (int)(44 + 26 * IiiiiiiiIIIII), (int)72, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5b88\u62a4\u4e4b\u529b" : (IiiiiiiiIIIII == 1 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u4fee\u4e3a\u70b9" : "")));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(10);
            if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(65, 140, 130, 19);
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new iIIiIiiiIiiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)138, (int)(44 + IiiiiiiiIIIII * 26), (int)134, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new iIiIIiiiIIiIi(this);
        this.IiIIIiiiiIiiI = new iIiIIiiiIIIiI(this);
        this.IiiiiiiiIIIII.setBounds(65, 175, 250, 135);
        this.IiIIIiiiiIiiI.setBounds(65, 175, 250, 135);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI();
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)100, (int)1, (int)100, (int)1, (boolean)false));
        this.iIiIiiiiIiIii.setBounds(65, 163, 241, 2);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    public void iIiIiiiiIIiii(int id) {
        this.iiIiiiiiiiIii = id;
        this.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
