/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.MountButton2
 *  com.xy.a.a.MountButton3
 *  com.xy.a.a.MountJpanel3
 *  com.xy.a.a.iIIiIiiiIiiIi
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.Mount
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.BaseMountSkill
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.MountButton2;
import com.xy.a.a.MountButton3;
import com.xy.a.a.MountJpanel3;
import com.xy.a.a.iIIiIiiiIiiIi;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class MountButton1
extends iIiIIiiiIiiiI {
    private JLabel IIiiIiiiIIiIi;
    private com.xy.q.IIIiiiiiIiIiI iIiIiiiiIiIii;
    final /* synthetic */ iIIiIiiiIiiIi IiIIIiiiiIiiI;
    private com.xy.q.IIIiiiiiIiIiI iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public MountButton1(iIIiIiiiIiiIi iIIiIiiiIiiIi2, int index) {
        this.IiIIIiiiiIiiI = iIIiIiiiIiiIi2;
        this.ALLATORIxDEMO = index;
        this.iIiIiiiiIiIii = new MountButton2(this, (IiiiIiiiiIiIi)iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)iIIiIiiiIiiIi2));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/161.png", (int)10, (int)10, (int)10, (int)10, (boolean)false));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.ALLATORIxDEMO);
        this.iIiIiiiiIiIii.setBounds(28, 0, 58, 58);
        this.iiIiiiiiiiIii = new MountButton3(this, (IiiiIiiiiIiIi)iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)iIIiIiiiIiiIi2));
        this.iiIiiiiiiiIii.setBounds(66, 38, 32, 32);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)70, (int)115, (int)22, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IIiiIiiiIIiIi.setHorizontalAlignment(0);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/163.png");
        this.IiiiiiiiIIIII.setBounds(10, 70, 95, 22);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add(this.IIiiIiiiIIiIi);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void iiiIiiiiiiIIi(MouseEvent e) {
        BaseMountSH IiiiiiiiIIIII = iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).ALLATORIxDEMO().getMountSHByindex(0);
        if (this.ALLATORIxDEMO >= IiiiiiiiIIIII.getUnlock()) {
            return;
        }
        if (IiiiiiiiIIIII.getMounts()[this.ALLATORIxDEMO].getB2() > 0) {
            iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(32, "SHXQ" + this.ALLATORIxDEMO, "#W\u786e\u5b9a\u82b1\u8d39#G50W#W\u94f6\u4e24\u5c06\u5b88\u62a4\u77f3\u79fb\u51fa\u5b88\u62a4\u69fd\uff1f"));
            return;
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(this.ALLATORIxDEMO);
    }

    public void iIiIiiiiIIiii(MouseEvent e) {
        RoleData IiiiiiiiIIIII = iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).ALLATORIxDEMO();
        BaseMountSH IiiiiiiiIIIII2 = IiiiiiiiIIIII.getMountSHByindex(0);
        if (this.ALLATORIxDEMO < IiiiiiiiIIIII2.getUnlock()) {
            BaseMountSkill IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getMounts()[this.ALLATORIxDEMO];
            if (IiiiiiiiIIIII3.getB1() > 0) {
                iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(32, "SHGZ0|0|" + this.ALLATORIxDEMO, "#W\u5750\u9a91\u79fb\u51fa\u5b88\u62a4\u69fd\u540e\uff0c\u5c06\u5931\u53bb#G\u5b88\u62a4\u77f3\u52a0\u6301#W\u3002"));
                return;
            }
            IiiiIiiiiIiII IiiiiiiiIIIII4 = (IiiiIiiiiIiII)iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).ALLATORIxDEMO().iiiIiiiiiiIIi(173);
            IiiiiiiiIIIII4.ALLATORIxDEMO(0, this.ALLATORIxDEMO);
            return;
        }
        Goodstable IiiiiiiiIIIII5 = IiiiiiiiIIIII.ALLATORIxDEMO(107L);
        if (IiiiiiiiIIIII5 == null) {
            iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u8db3\u591f\u7684\u7075\u5143\u6676");
            return;
        }
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"usermount", (String)("SHUN0|" + IiiiiiiiIIIII5.getRgid()));
        IiiiiiiiIIIII.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        BaseMountSH IiiiiiiiIIIII = iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).ALLATORIxDEMO().getMountSHByindex(0);
        if (this.ALLATORIxDEMO >= IiiiiiiiIIIII.getUnlock()) {
            return;
        }
        BaseMountSkill IiiiiiiiIIIII2 = IiiiiiiiIIIII.getMounts()[this.ALLATORIxDEMO];
        if (IiiiiiiiIIIII2.getB2() <= 0) {
            return;
        }
        Goodstable IiiiiiiiIIIII3 = iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(25298));
        if (IiiiiiiiIIIII3 == null) return;
        if (IiiiiiiiIIIII3.getType() != 108L) {
            return;
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII3);
        ((iiIiiiiiIIiiI)iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.IiIIIiiiiIiiI).ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII3, false);
    }

    public void ALLATORIxDEMO(boolean unlock, BaseMountSH mountSH, RoleData roleData) {
        if (unlock) {
            BaseMountSkill IiiiiiiiIIIII = mountSH.getMounts()[this.ALLATORIxDEMO];
            this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/160.png", (int)10, (int)10, (int)10, (int)10, (boolean)false));
            if (IiiiiiiiIIIII.getB1() > 0) {
                Mount IiiiiiiiIIIII2 = roleData.getMount(IiiiiiiiIIIII.getB1());
                this.iIiIiiiiIiIii.ALLATORIxDEMO(IIiIiiiiIiiIi.ALLATORIxDEMO((int)roleData.getLoginResult().getRace_id().intValue(), (int)IiiiiiiiIIIII.getB1()));
                this.IIiiIiiiIIiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cCEB987"));
                this.IIiiIiiiIIiIi.setText(IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getMountname() : String.valueOf(MsgUntil.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getB1())) + "\u5750\u9a91");
            } else {
                this.iIiIiiiiIiIii.iIiIiiiiIIiii();
                this.IIiiIiiiIIiIi.setText(null);
            }
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(IiiiiiiiIIIII.getB2() > 0 ? "sc/e/182.png" : "sc/e/183.png");
            this.iiIiiiiiiiIii.setVisible(true);
            return;
        }
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/161.png", (int)10, (int)10, (int)10, (int)10, (boolean)false));
        this.iIiIiiiiIiIii.iIiIiiiiIIiii();
        this.iiIiiiiiiiIii.setVisible(false);
        this.IIiiIiiiIIiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c959595"));
        this.IIiiIiiiIIiIi.setText(String.valueOf(this.ALLATORIxDEMO == 0 ? "3" : (this.ALLATORIxDEMO == 1 ? "6" : (this.ALLATORIxDEMO == 2 ? "9" : (this.ALLATORIxDEMO == 3 ? "12" : (this.ALLATORIxDEMO == 4 ? "16" : (this.ALLATORIxDEMO == 5 ? "20" : (this.ALLATORIxDEMO == 6 ? "24" : ""))))))) + "\u7ea7\u53ef\u89e3\u9501");
    }
}
