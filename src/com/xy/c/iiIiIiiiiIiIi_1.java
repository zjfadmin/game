/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiIiIii
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.a.i.IIIiiiiiIiIiI
 *  com.xy.a.q.IiIIIiiiiiiIi
 *  com.xy.a.q.IiIiIiiiiIIiI
 *  com.xy.a.q.iIiIiiiiiiiIi
 *  com.xy.a.q.iiIiIiiiiIiii
 *  com.xy.a.q.iiiiIiiiiiIiI
 *  com.xy.bean.QualityClBean
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.IIIiIiiiIiIii;
import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.a.i.IIIiiiiiIiIiI;
import com.xy.a.q.IiIIIiiiiiiIi;
import com.xy.a.q.IiIiIiiiiIIiI;
import com.xy.a.q.iIiIiiiiiiiIi;
import com.xy.a.q.iiIiIiiiiIiii;
import com.xy.a.q.iiiiIiiiiiIiI;
import com.xy.bean.QualityClBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;

public class iiIiIiiiiIiIi
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        Goodstable IiiiiiiiIIIII;
        QualityClBean IiiiiiiiIIIII2 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, QualityClBean.class);
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        GameView IiiiiiiiIIIII3 = gameClient.gameView;
        if (IiiiiiiiIIIII2.getType() == 1 || IiiiiiiiIIIII2.getType() == 2 || IiiiiiiiIIIII2.getType() == -2 || IiiiiiiiIIIII2.getType() >= 71 && IiiiiiiiIIIII2.getType() <= 76 || IiiiiiiiIIIII2.getType() == 53 || IiiiiiiiIIIII2.getType() == 54 || IiiiiiiiIIIII2.getType() == -81 || IiiiiiiiIIIII2.getType() == -82 || IiiiiiiiIIIII2.getType() == 53 || IiiiiiiiIIIII2.getType() == 82 || IiiiiiiiIIIII2.getType() == 133 || IiiiiiiiIIIII2.getType() == 135) {
            iiIiIiiiiIiii IiiiiiiiIIIII4 = (iiIiIiiiiIiii)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(11);
            if (IiiiiiiiIIIII2.getType() == 53 || IiiiiiiiIIIII2.getType() == 54) {
                iIiIIiiiIiiiI IiiiiiiiIIIII5 = (iIiIIiiiIiiiI)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(95);
                BigDecimal IiiiiiiiIIIII6 = IiiiiiiiIIIII5.ALLATORIxDEMO();
                if (IiiiiiiiIIIII6 == null) {
                    return;
                }
                Goodstable IiiiiiiiIIIII7 = IiiiiiiiIIIII3.roleData.getGood(IiiiiiiiIIIII6);
                if (IiiiiiiiIIIII7 == null) {
                    return;
                }
                if (!IiiiiiiiIIIII4.isVisible()) {
                    String IiiiiiiiIIIII8 = IiiiiiiiIIIII7.getValue().split("\\|")[IiiiiiiiIIIII2.getType() == 53 ? 3 : 4];
                    IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII2.getRgid(), IiiiiiiiIIIII8, IiiiiiiiIIIII2.getType() == 53 ? 2 : 3, false);
                }
            }
            IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 4 || IiiiiiiiIIIII2.getType() == -4) {
            IIIiiiiiIiIiI IiiiiiiiIIIII9 = (IIIiiiiiIiIiI)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(74);
            IiiiiiiiIIIII9.ALLATORIxDEMO(IiiiiiiiIIIII2);
            IIIiIiiiIiIii IiiiiiiiIIIII10 = (IIIiIiiiIiIii)IiiiiiiiIIIII3.getFormManagement().iIiIiiiiIIiii(121);
            if (IiiiiiiiIIIII10 == null) return;
            IiiiiiiiIIIII10.iiiiIiiiIiIiI(IiiiiiiiIIIII2.getNewAttr());
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 44) {
            IIIiIiiiIiIii IiiiiiiiIIIII11;
            Goodstable IiiiiiiiIIIII12 = IiiiiiiiIIIII3.roleData.getGood(IiiiiiiiIIIII2.getRgid());
            if (IiiiiiiiIIIII12 == null) {
                return;
            }
            String IiiiiiiiIIIII13 = MsgUntil.getValuesMessage((String[])IiiiiiiiIIIII12.getValue().split("\\|"), (String)"\u89c9\u9192\u6280");
            iIiIiiiiiiiIi IiiiiiiiIIIII14 = (iIiIiiiiiiiIi)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(94);
            IiiiiiiiIIIII14.ALLATORIxDEMO(IiiiiiiiIIIII13, 0);
            IiiiiiiiIIIII14.ALLATORIxDEMO(IiiiiiiiIIIII2.getNewAttr(), 1);
            IiiiiiiiIIIII14.ALLATORIxDEMO(IiiiiiiiIIIII2);
            if (!IiiiiiiiIIIII14.isVisible()) {
                IiiiiiiiIIIII3.getFormManagement().iIiIiiiiIIiIi(94);
            }
            if ((IiiiiiiiIIIII11 = (IIIiIiiiIiIii)IiiiiiiiIIIII3.getFormManagement().iIiIiiiiIIiii(121)) == null) return;
            IiiiiiiiIIIII11.iIiIiiiiIIiIi(IiiiiiiiIIIII2.getNewAttr());
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 46) {
            Goodstable IiiiiiiiIIIII15 = IiiiiiiiIIIII3.roleData.getGood(IiiiiiiiIIIII2.getRgid());
            if (IiiiiiiiIIIII15 == null) {
                return;
            }
            IiiiiiiiIIIII15.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII15.getValue().split("\\|"), (int)5, (String)IiiiiiiiIIIII2.getNewAttr()));
            IiIIIiiiiiiIi IiiiiiiiIIIII16 = (IiIIIiiiiiiIi)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(91);
            Goodstable IiiiiiiiIIIII17 = (Goodstable)IiiiiiiiIIIII16.ALLATORIxDEMO()[0].ALLATORIxDEMO().ALLATORIxDEMO();
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)(IiiiiiiiIIIII17 != null ? IiiiiiiiIIIII17.getRgid() : null), (BigDecimal)IiiiiiiiIIIII15.getRgid())) {
                return;
            }
            IiiiiiiiIIIII16.ALLATORIxDEMO(IiiiiiiiIIIII15);
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 5) {
            Goodstable IiiiiiiiIIIII18 = IiiiiiiiIIIII3.roleData.getGood(IiiiiiiiIIIII2.getRgid());
            if (IiiiiiiiIIIII18 == null) {
                return;
            }
            String IiiiiiiiIIIII19 = GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII18.getValue().split("\\|"), (int)4, (String)IiiiiiiiIIIII2.getNewAttr());
            IiiiiiiiIIIII18.setValue(IiiiiiiiIIIII19);
            iiiiIiiiiiIiI IiiiiiiiIIIII20 = (iiiiIiiiiiIiI)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(84);
            IiiiiiiiIIIII20.iIiIiiiiIIiii(IiiiiiiiIIIII18);
            if (IiiiiiiiIIIII18.getStatus() != 1) return;
            IiiiiiiiIIIII3.roleData.getRoleProperty().IIIIIiiiiIIii();
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 143) {
            IiIiIiiiiIIiI IiiiiiiiIIIII21 = (IiIiIiiiiIIiI)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(175);
            IiiiiiiiIIIII21.ALLATORIxDEMO(2, (Object)IiiiiiiiIIIII2);
            IIIiIiiiIiIii IiiiiiiiIIIII22 = (IIIiIiiiIiIii)IiiiiiiiIIIII3.getFormManagement().iIiIiiiiIIiii(121);
            if (IiiiiiiiIIIII22 == null) return;
            IiiiiiiiIIIII22.IIiIIiiiiiIII(IiiiiiiiIIIII2.getNewAttr());
            return;
        }
        if (IiiiiiiiIIIII2.getType() != 144) return;
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2.getNewAttr()) && (IiiiiiiiIIIII = IiiiiiiiIIIII3.roleData.getGood(IiiiiiiiIIIII2.getRgid())) != null) {
            IiiiiiiiIIIII.setValue(IiiiiiiiIIIII2.getNewAttr());
        }
        IiiiiiiiIIIII = (IiIiIiiiiIIiI)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(175);
        IiiiiiiiIIIII.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII2);
    }
}
