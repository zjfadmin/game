/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIiiiiIIIIi
 *  com.xy.a.a.iIIiiiiiIIIIi
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.a.iIIIiiiiIiiII
 *  com.xy.a.q.IIIIIiiiIIIiI
 *  com.xy.a.q.IIIIIiiiIiIii
 *  com.xy.a.q.iIIIIiiiIiiIi
 *  com.xy.a.w.iiiiiiiiiiIiI
 *  com.xy.bean.ChangeRoleNameBean
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.LoginResult
 *  com.xy.bean.PrivateData
 *  com.xy.bean.RoleShow
 *  com.xy.bean.SuitOperBean
 *  com.xy.bean.UseCardBean
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.formula.RoleGradeBorn
 *  com.xy.formula.RoleSkill
 *  com.xy.game.HandleOption
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MapModel
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iiIIiiiiIiiII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.a.IIIIiiiiIIIIi;
import com.xy.a.a.iIIiiiiiIIIIi;
import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.a.iIIIiiiiIiiII;
import com.xy.a.q.IIIIIiiiIIIiI;
import com.xy.a.q.IIIIIiiiIiIii;
import com.xy.a.q.iIIIIiiiIiiIi;
import com.xy.a.w.iiiiiiiiiiIiI;
import com.xy.bean.ChangeRoleNameBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.SuitOperBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.formula.RoleGradeBorn;
import com.xy.formula.RoleSkill;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiiiiiiIIII
extends com.xy.q.IiiiIiiiiIiIi {
    private LinkedList<ConfirmBean> IIiiIiiiIIiIi;
    private IiiiIiiiiIiII iIiIiiiiIiIii;
    private ConfirmBean IiIIIiiiiIiiI;
    private com.xy.i.IIIIIiiiIIIiI iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private com.xy.i.IIIIIiiiIIIiI ALLATORIxDEMO;

    private /* synthetic */ void iIiIIiiiiIIiI(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        String IiiiiiiiIIIII = this.iIiIiiiiIiIii.getText().trim();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f93\u5165\u4e0d\u80fd\u4e3a\u7a7a");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"exchangegoods", (String)IiiiiiiiIIIII);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    private /* synthetic */ void iiiiiiiiIiIiI(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        if (confirmBean.getType() == 3) {
            if (this.ALLATORIxDEMO().getBabys().size() >= 6) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u6700\u591a\u629a\u517b6\u4e2a\u5b69\u5b50");
                return;
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"babycustoday", (String)"yes");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (confirmBean.getType() == 4) return;
        if (confirmBean.getType() != 30) return;
        int IiiiiiiiIIIII = confirmBean.getValue().indexOf("|");
        Baby IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getBaby(new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)0, (int)IiiiiiiiIIIII)));
        Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().getGood(new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)(IiiiiiiiIIIII + 1), (int)confirmBean.getValue().length())));
        if (IiiiiiiiIIIII2 == null) return;
        if (IiiiiiiiIIIII3 == null) return;
        if (IiiiiiiiIIIII3.getType() != 53L) {
            return;
        }
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"userbaby", (String)(IiiiiiiiIIIII3.getRgid() + "|" + IiiiiiiiIIIII2.getBabyid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public boolean ALLATORIxDEMO(ConfirmBean confirmBean) {
        if (confirmBean.getType() == 81) return true;
        if (confirmBean.getType() == 82) return true;
        if (confirmBean.getType() == 83) return true;
        if (confirmBean.getType() == 84) return true;
        if (confirmBean.getType() == 85) return true;
        if (confirmBean.getType() == 86) return true;
        if (confirmBean.getType() == 33) return true;
        if (confirmBean.getType() == 35) return true;
        return false;
    }

    private /* synthetic */ void IIiIIiiiiiIII(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(new BigDecimal(confirmBean.getValue()));
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.getType() != 520L) {
            return;
        }
        if (this.ALLATORIxDEMO().ALLATORIxDEMO()) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (confirmBean.getType() == 20) {
            SuitOperBean IiiiiiiiIIIII3 = new SuitOperBean();
            ArrayList<BigDecimal> IiiiiiiiIIIII4 = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII4.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII3.setGoods(IiiiiiiiIIIII4);
            IiiiiiiiIIIII3.setType(58);
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII3));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        if (IiiiiiiiIIIII.getStatus() == 1) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u5df2\u53c2\u6218\u661f\u5361\u65e0\u6cd5\u53d6\u51fa");
            return;
        }
        if (IiiiiiiiIIIII.getStatus() == 0) {
            IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setStatus(Integer.valueOf(4));
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII);
        } else if (IiiiiiiiIIIII.getStatus() == 4) {
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII2.getGoodPackSum(IiiiiiiiIIIII.getType().longValue(), IiiiiiiiIIIII.getGoodsid(), 1);
            if (IiiiiiiiIIIII6 <= 0) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u80cc\u5305\u683c\u6570\u4e0d\u8db3");
                return;
            }
            IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setStatus(Integer.valueOf(0));
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII);
            iIiIIiiiIiiiI IiiiiiiiIIIII7 = (iIiIIiiiIiiiI)this.ALLATORIxDEMO().iIiIiiiiIIiii(95);
            if (IiiiiiiiIIIII7 != null) {
                IiiiiiiiIIIII7.iiiIiiiiiiIIi(IiiiiiiiIIIII);
            }
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(97);
        }
        ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.ALLATORIxDEMO());
    }

    public String ALLATORIxDEMO(ConfirmBean confirmBean) {
        if (confirmBean.getType() == 81) {
            return "\u4fee\u6539";
        }
        if (confirmBean.getType() == 82) {
            return "\u4fee\u6b63";
        }
        if (confirmBean.getType() == 83) {
            return "\u5151\u6362";
        }
        if (confirmBean.getType() == 84) {
            return "\u89e3\u7981";
        }
        if (confirmBean.getType() == 85) {
            return "\u89e3\u5c01";
        }
        if (confirmBean.getType() != 86) return "\u786e\u5b9a";
        return "\u62db\u52df";
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiiIiiiIiIiI(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (confirmBean.getType() == 18) {
            iIIIIiiiIiiIi IiiiiiiiIIIII2 = (iIIIIiiiIiiIi)this.ALLATORIxDEMO().iIiIiiiiIIiii(85);
            if (IiiiiiiiIIIII2 == null) return;
            if (IiiiiiiiIIIII2.iiiIiiiiiiIIi() != 2) return;
            IiiiiiiiIIIII2.iIiIiiiiIIiIi(true);
            return;
        }
        if (confirmBean.getType() == 19) {
            void IiiiiiiiIIIII3;
            int IiiiiiiiIIIII4 = confirmBean.getValue().indexOf("|");
            BigDecimal IiiiiiiiIIIII5 = new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)0, (int)IiiiiiiiIIIII4));
            BigDecimal IiiiiiiiIIIII6 = new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)(IiiiiiiiIIIII4 + 1), (int)confirmBean.getValue().length()));
            Goodstable IiiiiiiiIIIII7 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII5);
            Goodstable IiiiiiiiIIIII8 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII7 == null) return;
            if (IiiiiiiiIIIII8 == null) return;
            if (IiiiiiiiIIIII5.compareTo(IiiiiiiiIIIII6) == 0) {
                return;
            }
            if (!GoodType.iiIIiiiiiIIIi((long)IiiiiiiiIIIII8.getType())) {
                return;
            }
            if (IiiiiiiiIIIII7.getGoodlock() == 1) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                return;
            }
            if (IiiiiiiiIIIII8.getGoodlock() == 1) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                return;
            }
            if (IiiiiiiiIIIII8.getStatus() == 0) {
                return;
            }
            int IiiiiiiiIIIII9 = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII8.getValue());
            BigDecimal IiiiiiiiIIIII10 = new BigDecimal(3200000 * IiiiiiiiIIIII9);
            if (IiiiiiiiIIIII.getLoginResult().getGold().longValue() < IiiiiiiiIIIII10.longValue()) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u94b1\u4e0d\u8db3");
                return;
            }
            if (!IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII8)) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u80cc\u5305\u5df2\u6ee1");
                return;
            }
            IiiiiiiiIIIII8.setStatus(Integer.valueOf(0));
            ArrayList<BigDecimal> IiiiiiiiIIIII11 = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII11.add(IiiiiiiiIIIII5);
            IiiiiiiiIIIII11.add(IiiiiiiiIIIII6);
            IiiiiiiiIIIII.getLoginResult().setGold(IiiiiiiiIIIII.getLoginResult().getGold().subtract(IiiiiiiiIIIII10));
            SuitOperBean suitOperBean = new SuitOperBean();
            IiiiiiiiIIIII3.setType(20);
            IiiiiiiiIIIII3.setGoods(IiiiiiiiIIIII11);
            String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII3));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII12);
            return;
        }
        if (confirmBean.getType() == 21) {
            String IiiiiiiiIIIII13 = Agreement.getSendTextAES((String)"TransState", (String)("1|" + confirmBean.getValue()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII13);
            return;
        }
        if (confirmBean.getType() == 22) {
            IIIIIiiiIiIii IiiiiiiiIIIII14 = (IIIIIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(61);
            IIIIIiiiIIIiI IiiiiiiiIIIII15 = IiiiiiiiIIIII14.iiiIiiiiiiIIi() == 1 ? IiiiiiiiIIIII14.ALLATORIxDEMO() : null;
            String IiiiiiiiIIIII16 = IiiiiiiiIIIII15 != null ? IiiiiiiiIIIII15.ALLATORIxDEMO() : null;
            if (IiiiiiiiIIIII16 == null) return;
            if (!IiiiiiiiIIIII16.equals("\u4ed9\u5668\u5206\u89e3")) {
                if (!IiiiiiiiIIIII16.equals("\u5b88\u62a4\u77f3\u5206\u89e3")) return;
            }
            IiiiiiiiIIIII15.ALLATORIxDEMO(true);
            return;
        }
        if (confirmBean.getType() == 23) {
            String IiiiiiiiIIIII17 = Agreement.getSendTextAES((String)"userpal", (String)("C" + confirmBean.getValue()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII17);
            return;
        }
        if (confirmBean.getType() == 24) {
            try {
                RoleShow IiiiiiiiIIIII18 = this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii;
                LoginResult IiiiiiiiIIIII19 = this.iiIIiiiiIiIIi.roleData.getLoginResult();
                IiiiiiiiIIIII19.setGang_id(new BigDecimal(0));
                IiiiiiiiIIIII19.setGangname("");
                IiiiiiiiIIIII19.setGangpost("");
                IiiiiiiiIIIII19.setAchievement(new BigDecimal(0));
                IiiiiiiiIIIII19.setResistance("\u4e3b-|\u526f-");
                IiiiiiiiIIIII18.setGang_id(IiiiiiiiIIIII19.getGang_id());
                IiiiiiiiIIIII18.setGangname(IiiiiiiiIIIII19.getGangname());
                IiiiiiiiIIIII.getRoleProperty().IIIIIiiiiIIii();
                String IiiiiiiiIIIII20 = Agreement.getSendTextAES((String)"gangretreat", null);
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII20);
            }
            catch (Exception IiiiiiiiIIIII21) {
                IiiiiiiiIIIII21.printStackTrace();
            }
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(48);
            return;
        }
        if (confirmBean.getType() == 25) {
            String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"gangchange", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII22);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(48);
            return;
        }
        if (confirmBean.getType() == 26) {
            String IiiiiiiiIIIII23 = Agreement.getSendTextAES((String)"gangshot", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII23);
            iIIIiiiiIiiII IiiiiiiiIIIII24 = (iIIIiiiiIiiII)this.ALLATORIxDEMO().iIiIiiiiIIiii(48);
            if (IiiiiiiiIIIII24 == null) return;
            IiiiiiiiIIIII24.ALLATORIxDEMO(new BigDecimal(confirmBean.getValue()));
            return;
        }
        if (confirmBean.getType() == 28) {
            int IiiiiiiiIIIII25 = confirmBean.getValue().indexOf("|");
            int IiiiiiiiIIIII26 = confirmBean.getValue().indexOf("|", IiiiiiiiIIIII25 + 1);
            MapModel IiiiiiiiIIIII27 = this.ALLATORIxDEMO().ALLATORIxDEMO(confirmBean.getValue().substring(0, IiiiiiiiIIIII25));
            if (IiiiiiiiIIIII27 == null) {
                return;
            }
            int IiiiiiiiIIIII28 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)(IiiiiiiiIIIII25 + 1), (int)IiiiiiiiIIIII26);
            int IiiiiiiiIIIII29 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)(IiiiiiiiIIIII26 + 1), (int)confirmBean.getValue().length());
            HandleOption.ALLATORIxDEMO((MapModel)IiiiiiiiIIIII27, (int)IiiiiiiiIIIII28, (int)IiiiiiiiIIIII29, (GameView)this.iiIIiiiiIiIIi, (boolean)true);
            return;
        }
        if (confirmBean.getType() == 29) {
            String IiiiiiiiIIIII30 = Agreement.getSendTextAES((String)"exchange", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII30);
            return;
        }
        if (confirmBean.getType() == 87) {
            String IiiiiiiiIIIII31 = Agreement.getSendTextAES((String)"Chongjipacksure", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII31);
            return;
        }
        if (confirmBean.getType() == 88) {
            String IiiiiiiiIIIII32 = Agreement.getSendTextAES((String)"activity", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII32);
            return;
        }
        if (confirmBean.getType() == 89) {
            String IiiiiiiiIIIII33 = Agreement.getSendTextAES((String)"racialtransformation", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII33);
            return;
        }
        if (confirmBean.getType() == 33) {
            String IiiiiiiiIIIII34 = this.iIiIiiiiIiIii.getText();
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII34)) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u961f\u4f0d\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a");
                return;
            }
            if (!IiiiIiiiiIiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII34)) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u961f\u4f0d\u540d\u79f0\u4e0d\u80fd\u6709\u7279\u6b8a\u7b26\u53f7");
                return;
            }
            if (!IiiiIiiiiIiIi.iIiIiiiiIIiii((String)IiiiiiiiIIIII34)) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u961f\u4f0d\u540d\u79f0\u4e2d\u5305\u542b\u975e\u6cd5\u5b57\u7b26\uff01\uff01");
                return;
            }
            if (IiiiiiiiIIIII34.length() > 5) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u961f\u4f0d\u540d\u79f0\u6700\u591a5\u4e2a\u5b57\u7b26");
                return;
            }
            String IiiiiiiiIIIII35 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(confirmBean.getValue()) + "|E" + IiiiiiiiIIIII34));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII35);
            return;
        }
        if (confirmBean.getType() == 34) {
            UseCardBean IiiiiiiiIIIII36 = IiiiiiiiIIIII.getLimit("\u9753\u53f7");
            if (IiiiiiiiIIIII36 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u9753\u53f7");
                return;
            }
            IiiiiiiiIIIII.iIiIiiiiIIiii("\u9753\u53f7");
            StringBuffer IiiiiiiiIIIII37 = new StringBuffer("T");
            IiiiiiiiIIIII37.append(IiiiiiiiIIIII36.getType());
            String IiiiiiiiIIIII38 = Agreement.getSendTextAES((String)"usercard", (String)IiiiiiiiIIIII37.toString());
            this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII38);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(183);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(184);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(185);
            return;
        }
        if (confirmBean.getType() != 35) return;
        int IiiiiiiiIIIII39 = 0;
        try {
            IiiiiiiiIIIII39 = Integer.parseInt(this.iIiIiiiiIiIii.getText());
        }
        catch (Exception IiiiiiiiIIIII40) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ea\u80fd\u586b\u6570\u5b57");
            return;
        }
        String IiiiiiiiIIIII41 = Agreement.getSendTextAES((String)"BEAU", (String)("B2" + IiiiiiiiIIIII39));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII41);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void IIiIIiiiiiIiI(boolean flag, ConfirmBean confirmBean) {
        block12: {
            if (!flag) {
                return;
            }
            if (this.ALLATORIxDEMO().ALLATORIxDEMO()) {
                return;
            }
            IiiiiiiiIIIII = confirmBean.getValue();
            if (IiiiiiiiIIIII.indexOf("|") == -1) break block12;
            IiiiiiiiIIIII = new ArrayList<Goodstable>();
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl42
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(new BigDecimal(IiiiiiiiIIIII));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (IiiiiiiiIIIII.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u52a0\u9501\uff0c\u4e0d\u53ef\u4e22\u5f03\u3002\u3002");
            return;
        }
        if (GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII.getType()) != -1 && GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[4]) != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u9576\u5d4c\u5b9d\u77f3\u65e0\u6cd5\u4e22\u5f03");
            return;
        }
        IiiiiiiiIIIII.setUsetime(Integer.valueOf(0));
        this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
        ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)1, (GameClient)this.ALLATORIxDEMO());
        return;
        do {
            if ((IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.length();
            }
            if ((IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII)))) != null) {
                if (IiiiiiiiIIIII.getGoodlock() == 1) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u52a0\u9501\uff0c\u4e0d\u53ef\u4e22\u5f03\u3002\u3002");
                } else if (GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII.getType()) != -1 && GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[4]) != null) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u9576\u5d4c\u5b9d\u77f3\u65e0\u6cd5\u4e22\u5f03");
                } else {
                    IiiiiiiiIIIII.setUsetime(Integer.valueOf(0));
                    this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                }
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl42:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length());
        if (IiiiiiiiIIIII.size() == 0) return;
        ParamTool.ALLATORIxDEMO(IiiiiiiiIIIII, (int)1, (GameClient)this.ALLATORIxDEMO());
    }

    private /* synthetic */ void IIIiIiiiIiIii(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        String IiiiiiiiIIIII = this.iIiIiiiiIiIii.getText().trim();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f93\u5165\u4e0d\u80fd\u4e3a\u7a7a");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"user", (String)(String.valueOf(confirmBean.getValue()) + "|" + IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    private /* synthetic */ void IIiIIiiiIiIIi(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (confirmBean.getType() == 5) {
            Lingbao IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLingbao(new BigDecimal(confirmBean.getValue()));
            if (IiiiiiiiIIIII2 == null) return;
            if (IiiiiiiiIIIII2.getBaotype().equals("\u6cd5\u5b9d")) {
                return;
            }
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO(4);
            if (IiiiiiiiIIIII3 == -1) {
                return;
            }
            List IiiiiiiiIIIII4 = IiiiiiiiIIIII.ALLATORIxDEMO(new com.xy.v.iiIIiiiiIiiII[]{new com.xy.v.iiIIiiiiIiiII(10079L, (long)(IiiiiiiiIIIII3 * 8))});
            if (IiiiiiiiIIIII4 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u591f" + IiiiiiiiIIIII3 * 8 + "\u4e2a\u7075\u5b9d\u5929\u5a01\u5370");
                return;
            }
            IiiiiiiiIIIII.IiiIiiiiiiIiI(IiiiiiiiIIIII4);
            IiiiiiiiIIIII2.ALLATORIxDEMO(true);
            ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII2, (GameClient)this.ALLATORIxDEMO());
            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (confirmBean.getType() == 6) {
            Lingbao IiiiiiiiIIIII5 = IiiiiiiiIIIII.getLingbao(new BigDecimal(confirmBean.getValue()));
            if (IiiiiiiiIIIII5 == null) return;
            if (IiiiiiiiIIIII5.getBaotype().equals("\u6cd5\u5b9d")) {
                return;
            }
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII5.iIiIiiiiIIiii(4);
            if (IiiiiiiiIIIII6 == -1) {
                return;
            }
            if ((IiiiiiiiIIIII6 - 2) * 30 + 1 > IiiiiiiiIIIII5.getLingbaolvl().intValue()) {
                return;
            }
            if (IiiiiiiiIIIII6 >= 4 && !IiiiiiiiIIIII5.getBaoquality().equals("\u65e0\u4ef7") && !IiiiiiiiIIIII5.getBaoquality().equals("\u4f20\u4e16")) {
                return;
            }
            List IiiiiiiiIIIII7 = IiiiiiiiIIIII.ALLATORIxDEMO(new com.xy.v.iiIIiiiiIiiII[]{new com.xy.v.iiIIiiiiIiiII(10079L, (long)(IiiiiiiiIIIII6 * 8))});
            if (IiiiiiiiIIIII7 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u591f" + IiiiiiiiIIIII6 * 8 + "\u4e2a\u7075\u5b9d\u5929\u5a01\u5370");
                return;
            }
            IiiiiiiiIIIII.IiiIiiiiiiIiI(IiiiiiiiIIIII7);
            IiiiiiiiIIIII5.ALLATORIxDEMO(false);
            ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII5, (GameClient)this.ALLATORIxDEMO());
            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        if (confirmBean.getType() == 7) {
            int IiiiiiiiIIIII8 = confirmBean.getValue().indexOf("|");
            BigDecimal IiiiiiiiIIIII9 = new BigDecimal(confirmBean.getValue().substring(0, IiiiiiiiIIIII8));
            String IiiiiiiiIIIII10 = confirmBean.getValue().substring(IiiiiiiiIIIII8 + 1);
            Lingbao IiiiiiiiIIIII11 = IiiiiiiiIIIII.getLingbao(IiiiiiiiIIIII9);
            if (IiiiiiiiIIIII11 == null) return;
            if (IiiiiiiiIIIII11.getBaotype().equals("\u6cd5\u5b9d")) {
                return;
            }
            long IiiiiiiiIIIII12 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 100000 : 800000;
            if (!ParamTool.ALLATORIxDEMO((long)IiiiiiiiIIIII12, (GameView)this.iiIIiiiiIiIIi)) return;
            String IiiiiiiiIIIII13 = IiiiiiiiIIIII11.getSkills();
            IiiiiiiiIIIII11.setSkills(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII13, (String)IiiiiiiiIIIII10, (int)0));
            ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII11, (GameClient)this.ALLATORIxDEMO());
            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII11);
            return;
        }
        if (confirmBean.getType() == 8) {
            Lingbao IiiiiiiiIIIII14 = IiiiiiiiIIIII.getLingbao(new BigDecimal(confirmBean.getValue()));
            if (IiiiiiiiIIIII14 == null) return;
            if (IiiiiiiiIIIII14.getBaotype().equals("\u6cd5\u5b9d")) {
                return;
            }
            if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII14.getFushis())) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5220\u9664\u524d\u5148\u5378\u4e0b\u7b26\u77f3");
                return;
            }
            if (IiiiiiiiIIIII14.getEquipment() == 1) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8fd8\u5904\u4e8e\u88c5\u5907\u72b6\u6001");
                return;
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII14);
            iiiIIiiiIIIii IiiiiiiiIIIII15 = (iiiIIiiiIIIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(43);
            if (IiiiiiiiIIIII15 == null) return;
            IiiiiiiiIIIII15.ALLATORIxDEMO(null);
            return;
        }
        if (confirmBean.getType() == 9) {
            Lingbao IiiiiiiiIIIII16 = IiiiiiiiIIIII.getLingbao(new BigDecimal(confirmBean.getValue()));
            if (IiiiiiiiIIIII16 == null) {
                return;
            }
            int IiiiiiiiIIIII17 = IiiiiiiiIIIII16.getLingbaolvl().intValue();
            int IiiiiiiiIIIII18 = IiiiiiiiIIIII17 / 5;
            List IiiiiiiiIIIII19 = IiiiiiiiIIIII.ALLATORIxDEMO(new com.xy.v.iiIIiiiiIiiII[]{new com.xy.v.iiIIiiiiIiiII(10079L, (long)IiiiiiiiIIIII18)});
            if (IiiiiiiiIIIII19 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u591f" + IiiiiiiiIIIII18 + "\u4e2a\u7075\u5b9d\u5929\u5a01\u5370");
                return;
            }
            IiiiiiiiIIIII.IiiIiiiiiiIiI(IiiiiiiiIIIII19);
            long IiiiiiiiIIIII20 = IiiiiiiiIIIII16.getLingbaoexe().longValue();
            long IiiiiiiiIIIII13 = ExpUtil.iIiIiiiiIIiii((int)IiiiiiiiIIIII17);
            IiiiiiiiIIIII16.setLingbaolvl(new BigDecimal(++IiiiiiiiIIIII17));
            IiiiiiiiIIIII16.setLingbaoexe(new BigDecimal(IiiiiiiiIIIII20 -= IiiiiiiiIIIII13));
            ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII16, (GameClient)this.ALLATORIxDEMO());
            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII16);
            return;
        }
        if (confirmBean.getType() != 10) return;
        Lingbao IiiiiiiiIIIII21 = IiiiiiiiIIIII.getLingbao(new BigDecimal(confirmBean.getValue()));
        if (IiiiiiiiIIIII21 == null) {
            return;
        }
        if (!ParamTool.ALLATORIxDEMO((long)200000L, (GameView)this.iiIIiiiiIiIIi)) return;
        if (IiiiiiiiIIIII21.getEquipment() == 1) {
            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII21.getKangxing(), false);
        }
        IiiiiiiiIIIII21.setKangxing(MsgUntil.ALLATORIxDEMO((int)IiiiiiiiIIIII21.getLingbaolvl().intValue(), (GameClient)this.iiIIiiiiIiIIi.getClient()));
        if (IiiiiiiiIIIII21.getEquipment() == 1) {
            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII21.getKangxing(), true);
        }
        ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII21, (GameClient)this.ALLATORIxDEMO());
        IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII21);
    }

    private /* synthetic */ void IIiiIiiiiIiII(boolean flag, ConfirmBean confirmBean) {
        String IiiiiiiiIIIII;
        if (!flag) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        String IiiiiiiiIIIII3 = this.iIiIiiiiIiIii.getText().trim();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII3)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f93\u5165\u4e0d\u80fd\u4e3a\u7a7a");
            return;
        }
        if (IiiiiiiiIIIII2.teamBean != null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7ec4\u961f\u72b6\u6001\u4e0b\u4e0d\u80fd\u4f7f\u7528\u6539\u540d\u5361");
            return;
        }
        if (IiiiiiiiIIIII3.equals(IiiiiiiiIIIII2.getLoginResult().getRolename())) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4fee\u6539\u540e\u7684\u540d\u5b57\u4e0d\u80fd\u548c\u81ea\u5df1\u91cd\u590d");
            return;
        }
        if (!IiiiIiiiiIiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII3)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4fee\u6539\u540e\u7684\u540d\u5b57\u4e0d\u80fd\u6709\u7279\u6b8a\u7b26\u53f7");
            return;
        }
        if (!IiiiIiiiiIiIi.iIiIiiiiIIiii((String)IiiiiiiiIIIII3)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u540d\u79f0\u4e2d\u5305\u542b\u975e\u6cd5\u5b57\u7b26\uff01\uff01");
            return;
        }
        int IiiiiiiiIIIII4 = 0;
        char[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3.toCharArray();
        int IiiiiiiiIIIII62 = 0;
        while (IiiiiiiiIIIII62 < IiiiiiiiIIIII5.length) {
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII5[IiiiiiiiIIIII62]);
            IiiiiiiiIIIII4 = IiiiiiiiIIIII.getBytes().length == 1 ? ++IiiiiiiiIIIII4 : (IiiiiiiiIIIII4 += 2);
            ++IiiiiiiiIIIII62;
        }
        if (IiiiiiiiIIIII4 > 14) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u540d\u79f0\u592a\u957f");
            return;
        }
        if (confirmBean.getValue() == null) {
            if (!this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(2, 12)) return;
            if (IiiiiiiiIIIII2.getLoginResult().getMoney() < 30) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u79ef\u5206\u4e0d\u8db330");
                return;
            }
            ChangeRoleNameBean IiiiiiiiIIIII62 = new ChangeRoleNameBean();
            IiiiiiiiIIIII62.setOldName(IiiiiiiiIIIII2.getLoginResult().getRolename());
            IiiiiiiiIIIII62.setNewName(IiiiiiiiIIIII3);
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"changerolename", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII62));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        Goodstable IiiiiiiiIIIII7 = IiiiiiiiIIIII2.getGood(new BigDecimal(confirmBean.getValue()));
        if (IiiiiiiiIIIII7 == null) {
            return;
        }
        IiiiiiiiIIIII = new ChangeRoleNameBean();
        IiiiiiiiIIIII.setOldName(IiiiiiiiIIIII2.getLoginResult().getRolename());
        IiiiiiiiIIIII.setNewName(IiiiiiiiIIIII3);
        IiiiiiiiIIIII.setRgid(IiiiiiiiIIIII7.getRgid());
        String IiiiiiiiIIIII8 = Agreement.getSendTextAES((String)"changerolename", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
    }

    private /* synthetic */ void IIIiiiiiiIIiI(boolean flag, ConfirmBean confirmBean) {
        Goodstable IiiiiiiiIIIII;
        if (!flag) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult();
        String[] IiiiiiiiIIIII4 = this.iIiIiiiiIiIii.getText().trim().split("-");
        if (IiiiiiiiIIIII4.length > IiiiiiiiIIIII3.getTurnAround() || IiiiiiiiIIIII4.length > 3) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ea\u80fd\u8f93\u5165\u4e8e\u81ea\u8eab\u76f8\u540c\u7684\u8f6c\u751f\u6b21\u6570");
            return;
        }
        int[] IiiiiiiiIIIII5 = RoleGradeBorn.getbz((String[])IiiiiiiiIIIII4);
        if (IiiiiiiiIIIII5 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f93\u5165\u683c\u5f0f\u6709\u8bef");
            return;
        }
        String IiiiiiiiIIIII6 = null;
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII5.length) {
            String[] stringArray = RoleSkill.getRoleSkill().getAllSkill(IiiiiiiiIIIII5[IiiiiiiiIIIII7], IiiiiiiiIIIII7 * 5000 + 10000);
            ++IiiiiiiiIIIII7;
            IiiiiiiiIIIII6 = RoleGradeBorn.ALLATORIxDEMO((String[])stringArray, IiiiiiiiIIIII6);
        }
        String IiiiiiiiIIIII22 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII2.getPrivateData().getBorn(), (String)"\u53cc\u5c5e\u6027&", (String)"|");
        if (IiiiiiiiIIIII22 != null) {
            IiiiiiiiIIIII22 = "\u53cc\u5c5e\u6027&" + IiiiiiiiIIIII22;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII6 == null || IiiiiiiiIIIII6.length() == 0 ? IiiiiiiiIIIII22 : String.valueOf(IiiiiiiiIIIII6) + "|" + IiiiiiiiIIIII22;
        }
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII2.getGood(new BigDecimal(confirmBean.getValue()))) == null) {
            return;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(1);
        if (IiiiiiiiIIIII.getUsetime() <= 0) {
            IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
        }
        ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)1, (GameClient)this.ALLATORIxDEMO());
        PrivateData IiiiiiiiIIIII8 = IiiiiiiiIIIII2.getPrivateData();
        IiiiiiiiIIIII8.setBorn(IiiiiiiiIIIII6);
        ParamTool.ALLATORIxDEMO((PrivateData)IiiiiiiiIIIII8, (GameClient)this.ALLATORIxDEMO());
        IiiiiiiiIIIII2.getRoleProperty().ALLATORIxDEMO(null, IiiiiiiiIIIII6);
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u66f4\u6539\u4fee\u6b63\u6210\u529f");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void iiiIiiiiiiIIi() {
        IIiiiiiiiIIII iIiiiiiiiIIII = this;
        synchronized (iIiiiiiiiIIII) {
            ConfirmBean confirmBean = this.IiIIIiiiiIiiI = this.IIiiIiiiIIiIi.size() != 0 ? this.IIiiIiiiIIiIi.removeFirst() : null;
            {
                if (this.IiIIIiiiiIiiI == null) {
                    this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
                    return;
                }
                this.IiiiiiiiIIIII.setTextSize(this.IiIIIiiiiIiiI.getMSG(), 494);
                this.iIiIiiiiIiIii.setText(null);
                this.iIiIiiiiIiIii.setVisible(this.ALLATORIxDEMO(this.IiIIIiiiiIiiI));
                this.iIiIiiiiIiIii.setBounds(21, this.IiiiiiiiIIIII.getY() + this.IiiiiiiiIIIII.getHeight() + 5, 494, 20);
                this.ALLATORIxDEMO.setText(this.ALLATORIxDEMO(this.IiIIIiiiiIiiI));
                this.ALLATORIxDEMO.setBounds(65, this.IiiiiiiiIIIII.getY() + this.IiiiiiiiIIIII.getHeight() + 45, 59, 25);
                this.iiIiiiiiiiIii.setBounds(375, this.IiiiiiiiIIIII.getY() + this.IiiiiiiiIIIII.getHeight() + 45, 59, 25);
                this.iIiIiiiiIIiii(-1, 0, 532, this.ALLATORIxDEMO.getY() + 50);
                if (!this.isVisible()) {
                    this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
                }
                if (!this.iIiIiiiiIiIii.isVisible()) return;
                if (!this.iiIIiiiiIiIIi.isVisible()) return;
                if (!this.iiIIiiiiIiIIi.gameFrame.isFocused()) return;
                this.iIiIiiiiIiIii.requestFocus();
                return;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(ConfirmBean confirmBean) {
        IIiiiiiiiIIII iIiiiiiiiIIII = this;
        synchronized (iIiiiiiiiIIII) {
            this.IIiiIiiiIIiIi.add(confirmBean);
            if (this.IiIIIiiiiIiiI != null) {
                return;
            }
            this.iiiIiiiiiiIIi();
            return;
        }
    }

    private /* synthetic */ void IIIIIiiiiIIii(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)confirmBean.getValue());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    private /* synthetic */ void iiiiiiiiIIiii(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        String IiiiiiiiIIIII = this.iIiIiiiiIiIii.getText().trim();
        if (!IIiiIiiiiIIiI.iiiIiiiiiiIIi((String)IiiiiiiiIIIII)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u8f93\u5165\u6570\u5b57");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"hjsl", (String)("Z|" + IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    private /* synthetic */ void IiiIiiiiiiIiI(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        if (confirmBean.getType() != 14) {
            if (confirmBean.getType() != 32) return;
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"usermount", (String)confirmBean.getValue());
            this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        int IiiiiiiiIIIII = confirmBean.getValue().indexOf("|");
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII = confirmBean.getValue().length();
        }
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)0, (int)IiiiiiiiIIIII));
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        Mount IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getMount(IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        if (confirmBean.getType() != 14) return;
        if (IiiiiiiiIIIII3.getLoginResult().getMount_id().intValue() == IiiiiiiiIIIII4.getMountid().intValue()) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u60a8\u7684\u5750\u9a91\u8fd8\u88ab\u60a8\u9a91\u7740\u5462\uff01");
            return;
        }
        if (IiiiiiiiIIIII4.getSid() != null || IiiiiiiiIIIII4.getOthrersid() != null || IiiiiiiiIIIII4.getSid3() != null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u60a8\u7684\u5750\u9a91\u7ba1\u5236\u7740\u53ec\u5524\u517d\u5462\uff01");
            return;
        }
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"mountrelease", (String)("" + IiiiiiiiIIIII4.getMid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
        IiiiiiiiIIIII3.mounts.remove(IiiiiiiiIIIII4);
        if (this.iiIIiiiiIiIIi.getClient().gameMount) {
            iIIiiiiiIIIIi IiiiiiiiIIIII6 = (iIIiiiiiIIIIi)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(172);
            if (IiiiiiiiIIIII6 != null) {
                if (IiiiiiiiIIIII6.iIiIiiiiIIiii()) return;
            }
            this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(20);
            return;
        }
        IIIIiiiiIIIIi IiiiiiiiIIIII7 = (IIIIiiiiIIIIi)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(7);
        if (IiiiiiiiIIIII7 != null) {
            IiiiiiiiIIIII7.IiiIiiiiiiIiI();
            return;
        }
        this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(20);
    }

    public IIiiiiiiiIIII(GameView gameView) {
        super(104, 3, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 532, 149, com.xy.q.IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/d/26.png");
        this.IIiiIiiiIIiIi = new LinkedList();
        this.IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((String)"", (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (int)384);
        this.IiiiiiiiIIIII.setBounds(21, 25, 494, 20);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white);
        this.iIiIiiiiIiIii.setBounds(21, 50, 494, 20);
        this.add((Component)this.iIiIiiiiIiIii);
        this.ALLATORIxDEMO = new com.xy.i.IIIIIiiiIIIiI("sc/e/7.png", 1, 110, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u5b9a", (com.xy.q.IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii = new com.xy.i.IIIIIiiiIIIiI("sc/e/7.png", 1, 111, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u53d6\u6d88", (com.xy.q.IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(65, 102, 59, 25);
        this.iiIiiiiiiiIii.setBounds(375, 102, 59, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.iiIiiiiiiiIii);
    }

    private /* synthetic */ void iIiIiiiiIIiIi(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        String IiiiiiiiIIIII = this.iIiIiiiiIiIii.getText().trim();
        if (!IIiiIiiiiIIiI.iiiIiiiiiiIIi((String)IiiiiiiiIIIII)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u8f93\u5165\u6570\u5b57");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"user", (String)(String.valueOf(confirmBean.getValue()) + "|" + IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iiiIiiiiiiIIi(boolean flag) {
        if (this.IiIIIiiiiIiiI.getType() == 1) {
            this.IIiIIiiiiiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 2) {
            this.IIiIIiiiiiIII(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 20) {
            this.IIiIIiiiiiIII(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 3) {
            this.iiiiiiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 4) {
            this.iiiiiiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 30) {
            this.iiiiiiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 5 || this.IiIIIiiiiIiiI.getType() == 6 || this.IiIIIiiiiIiiI.getType() == 7 || this.IiIIIiiiiIiiI.getType() == 8 || this.IiIIIiiiiIiiI.getType() == 9 || this.IiIIIiiiiIiiI.getType() == 10) {
            this.IIiIIiiiIiIIi(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 11 || this.IiIIIiiiiIiiI.getType() == 12 || this.IiIIIiiiiIiiI.getType() == 13 || this.IiIIIiiiiIiiI.getType() == 31) {
            this.ALLATORIxDEMO(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 14 || this.IiIIIiiiiIiiI.getType() == 32) {
            this.IiiIiiiiiiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 15) {
            this.iiiIiiiiiiIIi(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 16) {
            this.iiiIiiiiiiIIi(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 17) {
            this.IIIIIiiiiIIii(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 18) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 19) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 21) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 22) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 23) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 24) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 25) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 26) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 28) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 29) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 87) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 88) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 89) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 33) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 34) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 35) {
            this.iiiiIiiiIiIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 27) {
            this.iiIIiiiiIiIIi.gameFrame.ALLATORIxDEMO(this.iiIIiiiiIiIIi);
        } else if (this.IiIIIiiiiIiiI.getType() == 81) {
            this.IIiiIiiiiIiII(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 82) {
            this.IIIiiiiiiIIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 83) {
            this.iIiIIiiiiIIiI(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 84) {
            this.iIiIiiiiIIiIi(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 85) {
            this.IIIiIiiiIiIii(flag, this.IiIIIiiiiIiiI);
        } else if (this.IiIIIiiiiIiiI.getType() == 86) {
            this.iiiiiiiiIIiii(flag, this.IiIIIiiiiIiiI);
        } else {
            this.iIiIiiiiIIiii(flag, this.IiIIIiiiiIiiI);
        }
        this.iiiIiiiiiiIIi();
    }

    public boolean ALLATORIxDEMO() {
        if (this.IiIIIiiiiIiiI == null) return super.ALLATORIxDEMO();
        this.iiiIiiiiiiIIi();
        return super.ALLATORIxDEMO();
    }

    private /* synthetic */ void iiiIiiiiiiIIi(boolean flag, ConfirmBean confirmBean) {
        if (!flag) {
            return;
        }
        if (confirmBean.getType() == 15) {
            long IiiiiiiiIIIII = Long.parseLong(confirmBean.getValue());
            if (!ParamTool.ALLATORIxDEMO((long)IiiiiiiiIIIII, (GameView)this.iiIIiiiiIiIIi)) return;
            RoleData roleData = this.ALLATORIxDEMO();
            roleData.getPrivateData().setSkills("N", null);
            roleData.getPrivateData().setSkills("T", null);
            roleData.getRoleProperty().iiiiiiiiIIiii();
            ParamTool.ALLATORIxDEMO((PrivateData)roleData.getPrivateData(), (GameClient)this.ALLATORIxDEMO());
            roleData.getRoleProperty().ALLATORIxDEMO();
            iiiiiiiiiiIiI IiiiiiiiIIIII2 = (iiiiiiiiiiIiI)this.ALLATORIxDEMO().iIiIiiiiIIiii(82);
            if (IiiiiiiiIIIII2 == null) return;
            IiiiiiiiIIIII2.iiiIiiiiiiIIi(2);
            return;
        }
        if (confirmBean.getType() != 16) return;
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII.getLoginResult().getGold().compareTo(new BigDecimal(500000)) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
            return;
        }
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"rolechange", (String)confirmBean.getValue());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    private /* synthetic */ void iIiIiiiiIIiii(boolean flag, ConfirmBean confirmBean) {
        if (confirmBean.getType() == 120) {
            if (!flag) {
                confirmBean.setValue("-" + confirmBean.getValue());
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"confirm", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(confirmBean));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (confirmBean.getType() == 122) {
            if (!flag) {
                confirmBean.setValue("-" + confirmBean.getValue());
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"confirm", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(confirmBean));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (!flag) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"confirm", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(confirmBean));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    private /* synthetic */ void ALLATORIxDEMO(boolean flag, ConfirmBean confirmBean) {
        RoleData IiiiiiiiIIIII;
        RolePet IiiiiiiiIIIII2;
        RoleSummoning IiiiiiiiIIIII3;
        if (!flag) {
            return;
        }
        if (confirmBean.getType() == 13) {
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"userpet", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        if (confirmBean.getType() == 31) {
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"userpet", (String)confirmBean.getValue());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        int IiiiiiiiIIIII6 = confirmBean.getValue().indexOf("|");
        if (IiiiiiiiIIIII6 == -1) {
            IiiiiiiiIIIII6 = confirmBean.getValue().length();
        }
        if ((IiiiiiiiIIIII3 = (IiiiiiiiIIIII2 = (IiiiiiiiIIIII = this.ALLATORIxDEMO()).getRolePet(IIiiIiiiiIIiI.ALLATORIxDEMO((String)confirmBean.getValue(), (int)0, (int)IiiiiiiiIIIII6))).getPet()) == null) {
            return;
        }
        if (confirmBean.getType() != 11) {
            if (confirmBean.getType() != 12) return;
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"userpet", (String)("PS|" + confirmBean.getValue()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
        if (IiiiiiiiIIIII3.getPetlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u5df2\u52a0\u9501,\u4e0d\u80fd\u653e\u751f");
            return;
        }
        if (IiiiiiiiIIIII3.getGoods() != null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u643a\u5e26\u7740\u88c5\u5907\u6216\u5185\u4e39");
            return;
        }
        if (IiiiiiiiIIIII.getPetMount(IiiiiiiiIIIII3.getSid()) != null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8fd9\u53ea\u53ec\u5524\u517d\u88ab\u7ba1\u5236\u4e2d\uff0c\u4e0d\u53ef\u653e\u751f\uff01\uff01\uff01");
            return;
        }
        if (IiiiiiiiIIIII.getLoginResult().getSummoning_id() != null && IiiiiiiiIIIII.getLoginResult().getSummoning_id().compareTo(IiiiiiiiIIIII3.getSid()) == 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8fd9\u53ea\u53ec\u5524\u517d\u5df2\u5728\u53c2\u6218\u4e2d\uff01\uff01\uff01");
            return;
        }
        IiiiiiiiIIIII.pets.remove(IiiiiiiiIIIII2);
        String IiiiiiiiIIIII8 = Agreement.getSendTextAES((String)"petrelease", (String)IiiiiiiiIIIII3.getSid().toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
    }
}
