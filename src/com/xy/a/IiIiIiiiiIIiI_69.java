/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiIiiiiIiiIi
 *  com.xy.bean.RoleSystem
 *  com.xy.game.RoleData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameMain
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.IIiIiiiiIiiIi;
import com.xy.bean.RoleSystem;
import com.xy.game.RoleData;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;

public class IiIiIiiiiIIiI
extends IiiiIiiiiIiIi {
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private IIIIIiiiIIIiI IiiiiiiiIIIII;
    private IIiIiiiiIiiIi[] ALLATORIxDEMO;

    public void iIiIiiiiIIiIi() {
        long IiiiiiiiIIIII = IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[0]).ALLATORIxDEMO();
        IiiiiiiiIIIII |= (long)(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[1]).ALLATORIxDEMO() << 4);
        IiiiiiiiIIIII |= (long)(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[2]) << 8);
        IiiiiiiiIIIII |= (long)(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[3]) << 9);
        IiiiiiiiIIIII |= (long)(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[10]) << 10);
        IiiiiiiiIIIII |= (long)(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[11]) << 11);
        IiiiiiiiIIIII |= (long)(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[12]) << 14);
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
            IiiiiiiiIIIII |= (long)(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[13]) << 16);
        }
        if (this.iiIIiiiiIiIIi.systemData.setSystemValue(IiiiiiiiIIIII)) {
            this.iiIIiiiiIiIIi.screenData.ALLATORIxDEMO(this.iiIIiiiiIiIIi.systemData.getShowView());
            this.iiIIiiiiIiIIi.gameFrame.ALLATORIxDEMO();
        }
        GameMain.gameRunnable.setFPS(this.iiIIiiiiIiIIi.systemData.getFPS());
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii();
        RoleSystem IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getRoleSystem();
        boolean IiiiiiiiIIIII3 = false;
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((Integer)IiiiiiiiIIIII2.getIsPk(), (Integer)IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[4]))) {
            IiiiiiiiIIIII2.setIsPk(Integer.valueOf(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[4])));
            IiiiiiiiIIIII3 = true;
        }
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((Integer)IiiiiiiiIIIII2.getIsNews(), (Integer)IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[5]))) {
            IiiiiiiiIIIII2.setIsNews(Integer.valueOf(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[5])));
            IiiiiiiiIIIII3 = true;
        }
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((Integer)IiiiiiiiIIIII2.getIsMail(), (Integer)IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[6]))) {
            IiiiiiiiIIIII2.setIsMail(Integer.valueOf(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[6])));
            IiiiiiiiIIIII3 = true;
        }
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((Integer)IiiiiiiiIIIII2.getIsFriend(), (Integer)IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[7]))) {
            IiiiiiiiIIIII2.setIsFriend(Integer.valueOf(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[7])));
            IiiiiiiiIIIII3 = true;
        }
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((Integer)IiiiiiiiIIIII2.getIsGood(), (Integer)IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[8]))) {
            IiiiiiiiIIIII2.setIsGood(Integer.valueOf(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[8])));
            IiiiiiiiIIIII3 = true;
        }
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((Integer)IiiiiiiiIIIII2.getIsTeam(), (Integer)IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[9]))) {
            IiiiiiiiIIIII2.setIsTeam(Integer.valueOf(IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.ALLATORIxDEMO[9])));
            IiiiiiiiIIIII3 = true;
        }
        if (!IiiiiiiiIIIII3) return;
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"roleSystem", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII2));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO[0].ALLATORIxDEMO(0, this.iiIIiiiiIiIIi.systemData.getShowView());
        this.ALLATORIxDEMO[1].ALLATORIxDEMO(1, this.iiIIiiiiIiIIi.systemData.getFPSMax());
        this.ALLATORIxDEMO[2].ALLATORIxDEMO(2, this.iiIIiiiiIiIIi.systemData.IIiiIiiiiIiII() ? 1 : 0);
        this.ALLATORIxDEMO[3].ALLATORIxDEMO(3, this.iiIIiiiiIiIIi.systemData.iIiIiiiiIIiIi() ? 1 : 0);
        this.ALLATORIxDEMO[4].ALLATORIxDEMO(4, IiiiiiiiIIIII.getRoleSystem().getIsPk() == 1 ? 1 : 0);
        this.ALLATORIxDEMO[5].ALLATORIxDEMO(5, IiiiiiiiIIIII.getRoleSystem().getIsNews() == 1 ? 1 : 0);
        this.ALLATORIxDEMO[6].ALLATORIxDEMO(6, IiiiiiiiIIIII.getRoleSystem().getIsMail() == 1 ? 1 : 0);
        this.ALLATORIxDEMO[7].ALLATORIxDEMO(7, IiiiiiiiIIIII.getRoleSystem().getIsFriend() == 1 ? 1 : 0);
        this.ALLATORIxDEMO[8].ALLATORIxDEMO(8, IiiiiiiiIIIII.getRoleSystem().getIsGood() == 1 ? 1 : 0);
        this.ALLATORIxDEMO[9].ALLATORIxDEMO(9, IiiiiiiiIIIII.getRoleSystem().getIsTeam() == 1 ? 1 : 0);
        this.ALLATORIxDEMO[10].ALLATORIxDEMO(10, this.iiIIiiiiIiIIi.systemData.iiiiiiiiIIiii() ? 1 : 0);
        this.ALLATORIxDEMO[11].ALLATORIxDEMO(11, this.iiIIiiiiIiIIi.systemData.IIIiiiiiiIIiI() ? 1 : 0);
        this.ALLATORIxDEMO[12].ALLATORIxDEMO(12, this.iiIIiiiiIiIIi.systemData.ALLATORIxDEMO() ? 1 : 0);
        if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) return;
        this.ALLATORIxDEMO[13].ALLATORIxDEMO(13, this.iiIIiiiiIiIIi.systemData.IiiIiiiiiiIiI() ? 1 : 0);
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public IiIiIiiiiIIiI(GameView gameView) {
        super(50, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 552, 334, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6e38\u620f\u8bbe\u7f6e");
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI("sc/e/26.png", 1, 113, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u4fdd\u5b58\u8bbe\u7f6e", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI("sc/e/26.png", 1, 114, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u9000\u51fa\u6e38\u620f", (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(99, 280, 99, 25);
        this.IiiiiiiiIIIII.setBounds(368, 280, 99, 25);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new IIiIiiiiIiiIi[this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 14 : 13];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIiIiiiiIiiIi(this, IiiiiiiiIIIII, this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII++, 0);
        }
    }
}
