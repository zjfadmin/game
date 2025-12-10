/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiIiIiiiiIiii
 *  com.xy.a.a.IiiiIiiiiIiII
 *  com.xy.a.a.iiIIiiiiIiIiI
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.Mount
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IiIiIiiiiIiii;
import com.xy.a.a.IiiiIiiiiIiII;
import com.xy.a.a.iiIIiiiiIiIiI;
import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiiiiII
extends iIiIIiiiIiiiI {
    final /* synthetic */ iiIIiiiiIiIiI iIiiIiiiiiiII;
    private com.xy.q.IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(IIiIiiiiiiiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(MouseEvent mouseEvent) {
        RoleData IiiiiiiiIIIII = iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII).ALLATORIxDEMO();
        BaseMountSH IiiiiiiiIIIII2 = IiiiiiiiIIIII.getMountSHByindex(iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII));
        if (this.iiIiiiiiiiIii < IiiiiiiiIIIII2.getUnlock()) {
            int IiiiiiiiIIIII3;
            int n = IiiiiiiiIIIII3 = this.iiIiiiiiiiIii == 0 ? IiiiiiiiIIIII2.getPoint().x : IiiiiiiiIIIII2.getPoint().y;
            if (IiiiiiiiIIIII3 > 0) {
                iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII).iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(32, "SHGZ0|" + iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII) + "|" + this.iiIiiiiiiiIii, "#W\u786e\u5b9a\u5c06\u8be5\u5750\u9a91\u79fb\u51fa\u5b88\u62a4\u69fd\uff1f"));
                return;
            }
            IiiiIiiiiIiII IiiiiiiiIIIII4 = (IiiiIiiiiIiII)iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII).ALLATORIxDEMO().iiiIiiiiiiIIi(173);
            IiiiiiiiIIIII4.ALLATORIxDEMO(iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII), this.iiIiiiiiiiIii);
            return;
        }
        Goodstable IiiiiiiiIIIII5 = IiiiiiiiIIIII.ALLATORIxDEMO(107L);
        if (IiiiiiiiIIIII5 == null) {
            iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII).iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u8db3\u591f\u7684\u7075\u5143\u6676");
            return;
        }
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"usermount", (String)("SHUN" + iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)this.iIiiIiiiiiiII) + "|" + IiiiiiiiIIIII5.getRgid()));
        IiiiiiiiIIIII.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public IIiIiiiiiiiII(iiIIiiiiIiIiI iiIIiiiiIiIiI2, int index) {
        this.iIiiIiiiiiiII = iiIIiiiiIiIiI2;
        this.iiIiiiiiiiIii = index;
        this.IIiiIiiiIIiIi = new IiIiIiiiiIiii(this, (IiiiIiiiiIiIi)iiIIiiiiIiIiI.ALLATORIxDEMO((iiIIiiiiIiIiI)iiIIiiiiIiIiI2));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IIiiiiiiIiiII);
        this.IIiiIiiiIIiIi.setBounds(28, 0, 60, 60);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)60, (int)115, (int)22, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiiiiiiiIIIII.setHorizontalAlignment(0);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI("sc/d/163.png");
        this.IiIIIiiiiIiiI.setBounds(10, 60, 95, 22);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI(index == 0 ? "sc/d/170.png" : "sc/d/171.png");
        this.iIiIiiiiIiIii.setBounds(46, 81, 29, 32);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add(this.IiiiiiiiIIIII);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.add((Component)this.iIiIiiiiIiIii);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        if (index == 0) {
            this.ALLATORIxDEMO.setBounds(287, 70, 160, 160);
            return;
        }
        this.ALLATORIxDEMO.setBounds(508, 70, 160, 160);
    }

    public void ALLATORIxDEMO(boolean unlock, BaseMountSH mountSH, RoleData roleData) {
        if (!unlock) {
            this.ALLATORIxDEMO.iIiIiiiiIIiii("sc/d/173.png");
            this.IIiiIiiiIIiIi.ALLATORIxDEMO("sc/d/161.png");
            this.IIiiIiiiIIiIi.iIiIiiiiIIiii();
            this.IiiiiiiiIIIII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c959595"));
            this.IiiiiiiiIIIII.setText("16\u7ea7\u53ef\u89e3\u9501");
            return;
        }
        int IiiiiiiiIIIII = this.iiIiiiiiiiIii == 0 ? mountSH.getPoint().x : mountSH.getPoint().y;
        this.ALLATORIxDEMO.iIiIiiiiIIiii("sc/d/172.png");
        this.IIiiIiiiIIiIi.ALLATORIxDEMO("sc/d/160.png");
        if (IiiiiiiiIIIII <= 0) {
            this.IIiiIiiiIIiIi.iIiIiiiiIIiii();
            this.IiiiiiiiIIIII.setText(null);
            return;
        }
        Mount IiiiiiiiIIIII2 = roleData.getMount(IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIiIiiiiIiiIi.ALLATORIxDEMO((int)roleData.getLoginResult().getRace_id().intValue(), (int)IiiiiiiiIIIII));
        this.IiiiiiiiIIIII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cCEB987"));
        this.IiiiiiiiIIIII.setText(IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getMountname() : String.valueOf(MsgUntil.iIiIiiiiIIiii((int)IiiiiiiiIIIII)) + "\u5750\u9a91");
    }
}
