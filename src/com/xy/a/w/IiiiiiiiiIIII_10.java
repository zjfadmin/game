/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIiIiiiiIIiii
 *  com.xy.bean.LoginResult
 *  com.xy.formula.BaseMeridians
 *  com.xy.formula.SkillUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.w;

import com.xy.a.w.IIiIiiiiIIiii;
import com.xy.bean.LoginResult;
import com.xy.formula.BaseMeridians;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;
import java.math.BigDecimal;

public class IiiiiiiiiIIII
extends IiiiIiiiiIiIi {
    private IIiIiiiiIiIII iiIiiiiiiiIii;
    private com.xy.w.IIiIiiiiIIiii IiiiiiiiIIIII;
    private IIiIiiiiIIiii[] ALLATORIxDEMO;

    public IiiiiiiiiIIII(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 602, 425, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO = new IIiIiiiiIIiii[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIiIiiiiIIiii(this, IiiiiiiiIIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(48 + IiiiiiiiIIIII * 176, 63, 170, 300);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIiIiiiiIiIII("sc/e/6.png", 1, 91, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u91cd\u7f6e", (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
        this.iiIiiiiiiiIii.setBounds(535, 376, 34, 18);
        this.add((Component)this.iiIiiiiiiiIii);
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        LoginResult IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult();
        BaseMeridians IiiiiiiiIIIII3 = IiiiiiiiIIIII.getRoleProperty().getMeridians(0);
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getKey() != null ? Integer.parseInt(IiiiiiiiIIIII3.getKey()) - 1 : -1;
        int IiiiiiiiIIIII5 = SkillUtil.getSepciesIndex((BigDecimal)IiiiiiiiIIIII2.getSpecies_id());
        int IiiiiiiiIIIII6 = SkillUtil.getFMMax((int)IiiiiiiiIIIII2.getGrade(), (GameClient)this.ALLATORIxDEMO());
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < this.ALLATORIxDEMO.length) {
            IIiIiiiiIIiii iIiIiiiiIIiii = this.ALLATORIxDEMO[IiiiiiiiIIIII7];
            ++IiiiiiiiIIIII7;
            iIiIiiiiIIiii.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII5, IiiiiiiiIIIII6, IiiiiiiiIIIII3);
        }
    }

    static /* synthetic */ com.xy.w.IIiIiiiiIIiii ALLATORIxDEMO(IiiiiiiiiIIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiiiiiiiIIII arg0, com.xy.w.IIiIiiiiIIiii arg1) {
        arg0.IiiiiiiiIIIII = arg1;
    }
}
