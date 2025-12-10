/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIiIiiiiiiiIi
 *  com.xy.a.a.iiIiIiiiiiiiI
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.q.iiIiIiiiIIIiI
 *  com.xy.a.q.iiiIiiiiIiiiI
 *  com.xy.a.w.IIiIIiiiIIIiI
 *  com.xy.a.w.iiiiiiiiiiIiI
 *  com.xy.bean.BuyShopBean
 *  com.xy.bean.ChangeMapBean
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.FightingForesee
 *  com.xy.bean.LoginResult
 *  com.xy.bean.MonsterBean
 *  com.xy.bean.PrivateData
 *  com.xy.bean.QuoteOutBean
 *  com.xy.bean.RoleShow
 *  com.xy.bean.SuitOperBean
 *  com.xy.d.IIIIIiiiIiIii
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.IIiIiiiiIiIII
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.entity.Mount
 *  com.xy.entity.PartJade
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.MsgUntil
 *  com.xy.formula.PetProperty
 *  com.xy.formula.SkillUtil
 *  com.xy.game.PKSys
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.game.Task
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Door
 *  com.xy.readbean.Eshop
 *  com.xy.readbean.GoodFight
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MapModel
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.readbean.Npctable
 *  com.xy.readbean.Robots
 *  com.xy.readbean.Shop
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iiIIiiiiIiiII
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.game;

import com.xy.a.a.iIiIiiiiiiiIi;
import com.xy.a.a.iiIiIiiiiiiiI;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.q.iiIiIiiiIIIiI;
import com.xy.a.q.iiiIiiiiIiiiI;
import com.xy.a.w.IIiIIiiiIIIiI;
import com.xy.bean.BuyShopBean;
import com.xy.bean.ChangeMapBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.FightingForesee;
import com.xy.bean.LoginResult;
import com.xy.bean.MonsterBean;
import com.xy.bean.PrivateData;
import com.xy.bean.QuoteOutBean;
import com.xy.bean.RoleShow;
import com.xy.bean.SuitOperBean;
import com.xy.d.IIIIIiiiIiIii;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.IIiIiiiiIiIII;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.entity.Mount;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.MsgUntil;
import com.xy.formula.PetProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.PKSys;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.game.Task;
import com.xy.readbean.Door;
import com.xy.readbean.Eshop;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.readbean.MoneyType;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.Npctable;
import com.xy.readbean.Robots;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iiIIiiiiIiiII;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;
import java.util.List;

public class HandleOption {
    /*
     * WARNING - void declaration
     */
    public static void iiiIiiiiiiIIi(int id, iIIiiiiiIIIIi npcView) {
        void IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = npcView.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2.pets.size() >= 21) {
            npcView.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u60a8\u7684\u53ec\u5524\u517d\u53ef\u643a\u5e26\u7684\u6570\u91cf\u5df2\u6ee1");
            return;
        }
        List IiiiiiiiIIIII3 = null;
        if (id == 1) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.iIiIiiiiIIiii(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(901L, 90L)});
        } else if (id == 2) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.iIiIiiiiIIiii(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(904L, 500L)});
        }
        if (IiiiiiiiIIIII3 == null) {
            npcView.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7269\u54c1\u4e0d\u8db3");
            return;
        }
        SuitOperBean suitOperBean = new SuitOperBean();
        IiiiiiiiIIIII.setType(21);
        IiiiiiiiIIIII.setJade(new PartJade(2L, id));
        IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII3));
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        npcView.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public static void iiiiiiiiIIiii(GameView gameView) {
        RoleData IiiiiiiiIIIII = gameView.roleData;
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.IiiIiiiiiiIiI((int)IiiiiiiiIIIII.getLoginResult().getGrade());
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < 3) {
            int IiiiiiiiIIIII5 = SkillUtil.getSepciesIndex((BigDecimal)IiiiiiiiIIIII.getLoginResult().getSpecies_id(), (int)IiiiiiiiIIIII4);
            int IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 < 5) {
                int IiiiiiiiIIIII7 = 1001 + IiiiiiiiIIIII5 * 5 + IiiiiiiiIIIII6;
                if (IiiiiiiiIIIII3.length() != 0) {
                    IiiiiiiiIIIII3.append("#");
                }
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII7);
                IiiiiiiiIIIII3.append("_");
                ++IiiiiiiiIIIII6;
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII4;
        }
        IiiiiiiiIIIII.getPrivateData().setSkills("S", IiiiiiiiIIIII3.toString());
        ParamTool.ALLATORIxDEMO((PrivateData)IiiiiiiiIIIII.getPrivateData(), (GameClient)gameView.getClient());
        com.xy.a.w.iiiiiiiiiiIiI IiiiiiiiIIIII22 = (com.xy.a.w.iiiiiiiiiiIiI)gameView.getFormManagement().iIiIiiiiIIiii(82);
        if (IiiiiiiiIIIII22 == null) return;
        IiiiiiiiIIIII22.iiiIiiiiiiIIi(0);
    }

    public static void ALLATORIxDEMO(BuyShopBean bean, Eshop eshop, int count, MoneyType moneyType, GameView gameView) {
        if (gameView.ALLATORIxDEMO()) {
            return;
        }
        Goodstable IiiiiiiiIIIII = gameView.getObjectArea().ALLATORIxDEMO(new BigDecimal(eshop.getEshopiid()));
        count = gameView.roleData.getGoodPackSum(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getType() : 6500L, new BigDecimal(eshop.getEshopiid()), count);
        if (count <= 0) {
            gameView.iIiIiiiiIIiii("\u4f60\u80cc\u5305\u7a7a\u95f4\u4e0d\u8db3");
            return;
        }
        long IiiiiiiiIIIII2 = 0L;
        long IiiiiiiiIIIII3 = Long.parseLong(eshop.getEshopprice());
        long IiiiiiiiIIIII4 = gameView.roleData.getMoney(moneyType);
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4 / IiiiiiiiIIIII3;
        if (IiiiiiiiIIIII2 > (long)count) {
            IiiiiiiiIIIII2 = count;
        }
        IiiiiiiiIIIII4 = IiiiiiiiIIIII3 * IiiiiiiiIIIII2;
        if (IiiiiiiiIIIII2 <= 0L) {
            gameView.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8db3\u591f\u7684" + moneyType.getKey());
            return;
        }
        if (MsgUntil.iIiIiiiiIIiii((String)eshop.getEshopname())) {
            if (gameView.roleData.ALLATORIxDEMO(eshop.getEshopname())) {
                return;
            }
            count = 1;
            IiiiiiiiIIIII2 = 1L;
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3 * IiiiiiiiIIIII2;
        }
        bean.setCd(eshop.getEshopid().toString());
        bean.setSum((int)IiiiiiiiIIIII2);
        if (moneyType.getId() == -1) {
            moneyType.setMax(moneyType.getMax() - IiiiiiiiIIIII4);
        }
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"nbuy", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(bean));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
    }

    public static void ALLATORIxDEMO(Door door, int type, GameView gameView) {
        if (door == null) {
            return;
        }
        if (type != 3 && type != 0) {
            gameView.automation.ALLATORIxDEMO(false, 0);
        }
        if (gameView.getBattleScene() != null) {
            gameView.iiiIiiiiiiIIi("\u4f60\u5728\u6218\u6597\u4e2d");
            return;
        }
        ChangeMapBean IiiiiiiiIIIII = new ChangeMapBean();
        IiiiiiiiIIIII.setMapid(door.getDoormap());
        String[] stringArray = door.getDoorpoint().split("\\|");
        int IiiiiiiiIIIII2 = Integer.parseInt(stringArray[0]);
        int IiiiiiiiIIIII3 = Integer.parseInt(stringArray[1]);
        IiiiiiiiIIIII.setMapx(IiiiiiiiIIIII2);
        IiiiiiiiIIIII.setMapy(IiiiiiiiIIIII3);
        IiiiiiiiIIIII.setType(type);
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"changemap", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public static void IiiIiiiiiiIiI(int type, GameView gameView) {
        if (type == -1) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"usercard", (String)"S");
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (type == -2) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"usercard", (String)"Q");
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"usercard", (String)("R" + type * 60));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public static void IiiIiiiiiiIiI(GameView gameView) {
        RoleData roleData = gameView.roleData;
        Mount IiiiiiiiIIIII = roleData.getMount(roleData.getLoginResult().getMount_id().intValue());
        if (IiiiiiiiIIIII == null) {
            gameView.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8bbe\u7f6e\u4e58\u9a91\u7684\u5750\u9a91");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"usermount", (String)("DH|" + IiiiiiiiIIIII.getMid()));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void iiiIiiiiiiIIi(String type, GameView gameView) {
        RoleData roleData = gameView.roleData;
        RoleSummoning IiiiiiiiIIIII = roleData.getPet(roleData.getLoginResult().getSummoning_id());
        if (IiiiiiiiIIIII == null) {
            gameView.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8bbe\u7f6e\u53c2\u6218\u7684\u53ec\u5524\u517d");
            return;
        }
        String IiiiiiiiIIIII2 = null;
        if (type.equals("\u8f6c\u751f\u5f53\u524d\u53ec\u5524\u517d")) {
            if (IiiiiiiiIIIII.getTurnRount() >= 3) {
                gameView.iIiIiiiiIIiii("\u6700\u9ad8\u52303\u8f6c");
                return;
            }
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("DH|" + IiiiiiiiIIIII.getSid()));
        } else if (type.equals("\u70b9\u5316\u5f53\u524d\u53ec\u5524\u517d")) {
            int IiiiiiiiIIIII3;
            long IiiiiiiiIIIII4 = gameView.getClient().ALLATORIxDEMO(2, 12) ? 500000 : 2000000;
            int n = IiiiiiiiIIIII3 = gameView.getClient().ALLATORIxDEMO(2, 12) ? 533 : 543;
            if (IiiiiiiiIIIII.getGrade() != IiiiiiiiIIIII3 || IiiiiiiiIIIII.getFriendliness() < IiiiiiiiIIIII4) {
                gameView.iIiIiiiiIIiii("\u53ec\u5524\u517d\u4e0d\u7b26\u5408\u70b9\u5316\u8981\u6c42");
                return;
            }
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("DH|" + IiiiiiiiIIIII.getSid()));
        } else if (type.equals("\u98de\u5347\u5f53\u524d\u53c2\u6218\u795e\u517d")) {
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("FS|" + IiiiiiiiIIIII.getSid()));
        } else if (type.equals("\u795e\u517d\u5b66\u4e60\u6280\u80fd")) {
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("SS|" + IiiiiiiiIIIII.getSid()));
        } else if (type.equals("\u542f\u7075\u5f53\u524d\u53ec\u5524\u517d")) {
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("QL|" + IiiiiiiiIIIII.getSid()));
        }
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(Goodstable good, GameView gameView) {
        RoleShow IiiiiiiiIIIII = gameView.roleUnit.iIiIiiiiIiIii;
        String IiiiiiiiIIIII2 = good.getFight().ALLATORIxDEMO(IiiiiiiiIIIII.getMapid().intValue(), IiiiiiiiIIIII.getX(), IiiiiiiiIIIII.getY(), gameView.mapScene.ALLATORIxDEMO().getMapName());
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        good.setValueTwo(IiiiiiiiIIIII2);
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)2, (GameClient)gameView.getClient());
        gameView.iiiIiiiiiiIIi("\u8def\u6807\u5df2\u6dfb\u52a0");
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int map, int x, int y, GameView gameView) {
        void IiiiiiiiIIIII;
        if (gameView.getBattleScene() != null) {
            gameView.iiiIiiiiiiIIi("\u4f60\u5728\u6218\u6597\u4e2d");
            return;
        }
        ChangeMapBean changeMapBean = new ChangeMapBean();
        IiiiiiiiIIIII.setMapid(String.valueOf(map));
        IiiiiiiiIIIII.setMapx(x);
        IiiiiiiiIIIII.setMapy(y);
        IiiiiiiiIIIII.setType(3);
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"changemap", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    public static void iIiIiiiiIIiii(int nd, iIIiiiiiIIIIi npcView) {
        void IiiiiiiiIIIII;
        Task IiiiiiiiIIIII2;
        if (npcView.iiIIiiiiIiIIi.getBattleScene() != null) return;
        if (!npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIIiIi()) {
            return;
        }
        RoleData IiiiiiiiIIIII3 = npcView.ALLATORIxDEMO();
        IIIIIiiiIiIii IiiiiiiiIIIII4 = (IIIIIiiiIiIii)npcView.ALLATORIxDEMO();
        Robots IiiiiiiiIIIII5 = IiiiiiiiIIIII4 != null ? npcView.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO.getDId())) : null;
        Task task = IiiiiiiiIIIII2 = IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII3.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII4.ALLATORIxDEMO) : null;
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        npcView.iiIIiiiiIiIIi.roleUnit.ALLATORIxDEMO();
        FightingForesee fightingForesee = new FightingForesee();
        IiiiiiiiIIIII.setYidui(npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getTeam());
        IiiiiiiiIIIII.setAlias(IiiiiiiiIIIII4.ALLATORIxDEMO());
        IiiiiiiiIIIII.setRobotid(IiiiiiiiIIIII5.getRobotid());
        IiiiiiiiIIIII.setNd(nd);
        IiiiiiiiIIIII.setType(2);
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"fig2", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        npcView.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public static void ALLATORIxDEMO(BuyShopBean bean, Shop shop, int count, MoneyType moneyType, GameView gameView) {
        if (gameView.ALLATORIxDEMO()) {
            return;
        }
        Goodstable IiiiiiiiIIIII = gameView.getObjectArea().ALLATORIxDEMO(shop.getShopiid());
        count = gameView.roleData.getGoodPackSum(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getType() : 6500L, shop.getShopiid(), count);
        if (count <= 0) {
            gameView.iIiIiiiiIIiii("\u4f60\u80cc\u5305\u7a7a\u95f4\u4e0d\u8db3");
            return;
        }
        long IiiiiiiiIIIII2 = 0L;
        long IiiiiiiiIIIII3 = shop.getShopprice();
        long IiiiiiiiIIIII4 = gameView.roleData.getMoney(moneyType);
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4 / IiiiiiiiIIIII3;
        if (IiiiiiiiIIIII2 > (long)count) {
            IiiiiiiiIIIII2 = count;
        }
        IiiiiiiiIIIII4 = IiiiiiiiIIIII3 * IiiiiiiiIIIII2;
        if (IiiiiiiiIIIII2 <= 0L) {
            gameView.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8db3\u591f\u7684" + moneyType.getKey());
            return;
        }
        if (MsgUntil.iIiIiiiiIIiii((String)shop.getShopname())) {
            if (gameView.roleData.ALLATORIxDEMO(shop.getShopname())) {
                return;
            }
            count = 1;
            IiiiiiiiIIIII2 = 1L;
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3 * IiiiiiiiIIIII2;
        }
        bean.setCd(shop.getShopid().toString());
        bean.setSum((int)IiiiiiiiIIIII2);
        if (moneyType.getId() == -1) {
            moneyType.setMax(moneyType.getMax() - IiiiiiiiIIIII4);
        }
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"nbuy", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(bean));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
    }

    public static void iIiIiiiiIIiii(GoodFight fight, Goodstable good, GameView gameView) {
        RoleShow IiiiiiiiIIIII = gameView.roleUnit.iIiIiiiiIiIii;
        String IiiiiiiiIIIII2 = good.getFight().ALLATORIxDEMO(fight, IiiiiiiiIIIII.getMapid().intValue(), IiiiiiiiIIIII.getX(), IiiiiiiiIIIII.getY(), gameView.mapScene.ALLATORIxDEMO().getMapName());
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        good.setValueTwo(IiiiiiiiIIIII2);
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)2, (GameClient)gameView.getClient());
        gameView.iiiIiiiiiiIIi("\u5df2\u7ecf\u91cd\u65b0\u505a\u597d\u8def\u6807");
    }

    public static void iIiIiiiiIIiIi(GameView gameView) {
        RoleData roleData = gameView.roleData;
        Mount IiiiiiiiIIIII = roleData.getMount(roleData.getLoginResult().getMount_id().intValue());
        if (IiiiiiiiIIIII == null) {
            gameView.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8bbe\u7f6e\u4e58\u9a91\u7684\u5750\u9a91");
            return;
        }
        if (IiiiiiiiIIIII.getMountid() < 1 || IiiiiiiiIIIII.getMountid() > 5) {
            gameView.iIiIiiiiIIiii("1-5\u5750\u9a91\u624d\u80fd\u91cd\u5851");
            return;
        }
        if (IiiiiiiiIIIII.getMountlvl() == 200 && IiiiiiiiIIIII.getProficiency() >= 100000 && IiiiiiiiIIIII.getUseNumber() >= 3) {
            ((iiIiIiiiiiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(171)).iIiIiiiiIIiii(IiiiiiiiIIIII);
            return;
        }
        gameView.iIiIiiiiIIiii("\u9700\u8981\u5750\u9a91\u70b9\u5316100\u7ea7\u6ee1\u719f\u7ec3\u4e14\u5403\u6ee1\u7b4b\u9aa8\u63d0\u6c14\u4e38");
    }

    public static void ALLATORIxDEMO(RoleSummoning pet, RoleData roleData) {
        boolean IiiiiiiiIIIII;
        int[] IiiiiiiiIIIII2 = PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)roleData);
        int IiiiiiiiIIIII3 = pet.getFaithful();
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2[0];
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII2[1];
        int IiiiiiiiIIIII6 = pet.getBasishp(IiiiiiiiIIIII2[0]);
        int IiiiiiiiIIIII7 = pet.getBasismp(IiiiiiiiIIIII2[1]);
        long IiiiiiiiIIIII8 = (IiiiiiiiIIIII4 - IiiiiiiiIIIII6 + (IiiiiiiiIIIII5 - IiiiiiiiIIIII7) + (100 - IiiiiiiiIIIII3)) / 15;
        if (IiiiiiiiIIIII3 >= 100 && IiiiiiiiIIIII6 >= IiiiiiiiIIIII4 && IiiiiiiiIIIII7 >= IiiiiiiiIIIII5) {
            roleData.getGameView().iIiIiiiiIIiii("\u60a8\u643a\u5e26\u7684\u53ec\u5524\u517d\u8840\u91cf\u548c\u5fe0\u8bda\u5ea6\u90fd\u5df2\u6ee1");
            return;
        }
        boolean bl = IiiiiiiiIIIII = roleData.getLoginResult().getGrade() <= 102;
        if (IiiiiiiiIIIII) {
            IiiiiiiiIIIII8 = 0L;
        } else if (IiiiiiiiIIIII8 <= 0L) {
            IiiiiiiiIIIII8 = 10000L;
        }
        if (!IiiiiiiiIIIII && !ParamTool.ALLATORIxDEMO((long)IiiiiiiiIIIII8, (GameView)roleData.getGameView())) {
            return;
        }
        pet.setFaithful(Integer.valueOf(100));
        pet.setBasishp(IiiiiiiiIIIII4);
        pet.setBasismp(IiiiiiiiIIIII5);
        ParamTool.ALLATORIxDEMO((RoleSummoning)pet, (GameClient)roleData.getGameView().getClient());
        if (roleData.getChosePet() == pet) {
            roleData.getRoleProperty().ALLATORIxDEMO(pet);
        }
        RoleData roleData2 = roleData;
        if (IiiiiiiiIIIII) {
            roleData2.getGameView().iIiIiiiiIIiii("\u60a8\u7684\u53ec\u5524\u517d\u6062\u590d\u5065\u5eb7\u4e86,\u4f60\u5904\u4e8e\u65b0\u624b\u9636\u6bb5\u672c\u6b21\u6cbb\u7597\u514d\u8d39");
            return;
        }
        roleData2.getGameView().iIiIiiiiIIiii("\u60a8\u7684\u53ec\u5524\u517d\u6062\u590d\u5065\u5eb7\u4e86");
    }

    /*
     * Unable to fully structure code
     */
    public static void iIiIiiiiIIiIi(int skillId, GameView gameView) {
        block8: {
            IiiiiiiiIIIII = gameView.getObjectArea().iIiIiiiiIIiii(String.valueOf(skillId));
            if (IiiiiiiiIIIII == null) {
                return;
            }
            IiiiiiiiIIIII = gameView.roleData.getPrivateData().getSkill("S");
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.length : 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(IiiiiiiiIIIII.getSkillid())) {
                    gameView.iIiIiiiiIIiii("\u4f60\u5df2\u7ecf\u5b66\u4f1a\u4e86\u8be5\u6280\u80fd");
                    return;
                }
                ++IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
            IiiiiiiiIIIII = HandleOption.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkilllevel()), IiiiiiiiIIIII);
            if (IiiiiiiiIIIII != 0) break block8;
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.length : 0;
            if (true) ** GOTO lbl33
        }
        if (IiiiiiiiIIIII == 2) {
            gameView.iIiIiiiiIIiii("\u4f60\u8fd8\u4e0d\u591f\u706b\u5019\u5b66\u4e60\u5f53\u524d\u6280\u80fd");
            return;
        }
        if (IiiiiiiiIIIII != 1) return;
        gameView.iIiIiiiiIIiii("\u5e74\u8f7b\u4eba\u4e0d\u8981\u597d\u9ad8\u9a9b\u8fdc,\u5148\u53bb\u5b66\u4e60\u4e0a\u4e00\u4e2a\u6280\u80fd!");
        return;
        do {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("#");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl33:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("#");
        }
        IiiiiiiiIIIII.append(IiiiiiiiIIIII);
        IiiiiiiiIIIII.append("_");
        IiiiiiiiIIIII.append(IiiiIiiiiIIII.IiiIiiiiiiIiI((int)gameView.roleData.getLoginResult().getGrade()));
        gameView.roleData.getPrivateData().setSkills("S", IiiiiiiiIIIII.toString());
        ParamTool.ALLATORIxDEMO((PrivateData)gameView.roleData.getPrivateData(), (GameClient)gameView.getClient());
        IiiiiiiiIIIII = (com.xy.a.w.iiiiiiiiiiIiI)gameView.getFormManagement().iIiIiiiiIIiii(82);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.iiiIiiiiiiIIi(0);
        }
        gameView.iIiIiiiiIIiii("\u4f60\u5b66\u4f1a\u4e86" + IiiiiiiiIIIII.getSkillname());
    }

    public static void iiiIiiiiiiIIi(int type, GameView gameView) {
        RoleData IiiiiiiiIIIII = gameView.roleData;
        if (type == 0) {
            RoleSummoning IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChosePet();
            if (IiiiiiiiIIIII2 == null) {
                gameView.iIiIiiiiIIiii("\u5f53\u524d\u6ca1\u6709\u9009\u4e2d\u53ec\u5524\u517d");
                return;
            }
            HandleOption.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII);
            return;
        }
        if (type != 1) return;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.pets.size()) {
            RolePet rolePet = (RolePet)IiiiiiiiIIIII.pets.get(IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII3;
            HandleOption.ALLATORIxDEMO(rolePet.getPet(), IiiiiiiiIIIII);
        }
    }

    public static void ALLATORIxDEMO(iIIiiiiiIIIIi npcView) {
        if (npcView.iiIIiiiiIiIIi.getBattleScene() != null) return;
        if (!npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIIiIi()) {
            return;
        }
        MonsterBean IiiiiiiiIIIII = ((IIIIIiiiIiiII)npcView.ALLATORIxDEMO()).IiiiiiiiIIIII;
        if (IiiiiiiiIIIII.getType() != 0) {
            npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u602a\u7269\u6b63\u5728\u5fd9\u788c\u4e2d");
            return;
        }
        FightingForesee IiiiiiiiIIIII2 = new FightingForesee();
        IiiiiiiiIIIII2.setType(1);
        if (IiiiiiiiIIIII.getRobotid() == 651) {
            if (npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getTeam().split("\\|").length > 1) {
                npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ea\u80fd\u5355\u4eba\u51fb\u6740");
                return;
            }
            IiiiiiiiIIIII2.setType(4);
        }
        IiiiiiiiIIIII2.setYidui(npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getTeam());
        IiiiiiiiIIIII2.setI(IiiiiiiiIIIII.getI().intValue());
        npcView.iiIIiiiiIiIIi.roleUnit.ALLATORIxDEMO();
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"fig2", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII2));
        npcView.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public static void ALLATORIxDEMO(GoodFight fight, Goodstable good, GameView gameView) {
        String IiiiiiiiIIIII = good.getFight().ALLATORIxDEMO(fight, 0, 0, 0, null);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        good.setValueTwo(IiiiiiiiIIIII);
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)2, (GameClient)gameView.getClient());
        gameView.iiiIiiiiiiIIi("\u8def\u6807\u5df2\u5220\u9664");
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int nd, iIIiiiiiIIIIi npcView) {
        void IiiiiiiiIIIII;
        Task IiiiiiiiIIIII2;
        if (npcView.ALLATORIxDEMO() != null && npcView.ALLATORIxDEMO() instanceof IIIIIiiiIiiII) {
            HandleOption.ALLATORIxDEMO(npcView);
            return;
        }
        if (npcView.ALLATORIxDEMO() != null && npcView.ALLATORIxDEMO() instanceof IIIIIiiiIiIii) {
            HandleOption.iIiIiiiiIIiii(nd, npcView);
            return;
        }
        if (npcView.iiIIiiiiIiIIi.getBattleScene() != null) return;
        if (!npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIIiIi()) {
            return;
        }
        RoleData IiiiiiiiIIIII3 = npcView.ALLATORIxDEMO();
        NpcInfoBean IiiiiiiiIIIII4 = npcView.ALLATORIxDEMO().ALLATORIxDEMO(npcView.iIiIiiiiIIiii().toString());
        Robots IiiiiiiiIIIII5 = IiiiiiiiIIIII4 != null ? npcView.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4.getNpctable().getBinding()) : null;
        Task task = IiiiiiiiIIIII2 = IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII3.getTaskSystem().ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII4.getNpctable().getNpcid())) : null;
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        npcView.iiIIiiiiIiIIi.roleUnit.ALLATORIxDEMO();
        FightingForesee fightingForesee = new FightingForesee();
        IiiiiiiiIIIII.setYidui(npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getTeam());
        IiiiiiiiIIIII.setAlias(IiiiiiiiIIIII4.getNpctable().getNpcname());
        IiiiiiiiIIIII.setRobotid(IiiiiiiiIIIII5.getRobotid());
        IiiiiiiiIIIII.setNd(nd);
        IiiiiiiiIIIII.setType(2);
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"fig2", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        npcView.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public static void getfight(int type, GameView gameView) {
        if (gameView.getBattleScene() != null) return;
        if (!gameView.roleUnit.iIiIiiiiIIiIi()) {
            return;
        }
        FightingForesee IiiiiiiiIIIII = new FightingForesee();
        IiiiiiiiIIIII.setType(type);
        IiiiiiiiIIIII.setYidui(gameView.roleUnit.iIiIiiiiIiIii.getTeam());
        gameView.roleUnit.ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"fig2", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(String type, iIIiiiiiIIIIi npcView) {
        List IiiiiiiiIIIII;
        NpcInfoBean IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3;
        block140: {
            block107: {
                block135: {
                    block139: {
                        block108: {
                            block138: {
                                block115: {
                                    block133: {
                                        block113: {
                                            block110: {
                                                block114: {
                                                    block111: {
                                                        block119: {
                                                            block128: {
                                                                block120: {
                                                                    block136: {
                                                                        block137: {
                                                                            block123: {
                                                                                block131: {
                                                                                    block121: {
                                                                                        block126: {
                                                                                            block125: {
                                                                                                block132: {
                                                                                                    block129: {
                                                                                                        block124: {
                                                                                                            block127: {
                                                                                                                block122: {
                                                                                                                    block105: {
                                                                                                                        block112: {
                                                                                                                            block106: {
                                                                                                                                block134: {
                                                                                                                                    block109: {
                                                                                                                                        block117: {
                                                                                                                                            block130: {
                                                                                                                                                block118: {
                                                                                                                                                    block116: {
                                                                                                                                                        if (npcView.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) && (type.equals("\u6362\u4e2a\u9ad8\u7ea7\u85cf\u5b9d\u56fe") || type.equals("\u6362\u4e2a\u8d85\u7ea7\u85cf\u5b9d\u56fe"))) {
                                                                                                                                                            Goodstable IiiiiiiiIIIII4;
                                                                                                                                                            BigDecimal IiiiiiiiIIIII5 = null;
                                                                                                                                                            iiIIiiiiIiiII[] IiiiiiiiIIIII6 = null;
                                                                                                                                                            switch (type) {
                                                                                                                                                                case "\u6362\u4e2a\u9ad8\u7ea7\u85cf\u5b9d\u56fe": {
                                                                                                                                                                    IiiiiiiiIIIII5 = new BigDecimal(170);
                                                                                                                                                                    IiiiiiiiIIIII6 = new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(171L, 3L)};
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                case "\u6362\u4e2a\u8d85\u7ea7\u85cf\u5b9d\u56fe": {
                                                                                                                                                                    IiiiiiiiIIIII5 = new BigDecimal(80060);
                                                                                                                                                                    IiiiiiiiIIIII6 = new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80059L, 5L)};
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            Goodstable goodstable = IiiiiiiiIIIII4 = IiiiiiiiIIIII5 != null ? npcView.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5) : null;
                                                                                                                                                            if (IiiiiiiiIIIII4 == null) {
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            iIiIiiiiiiiIi IiiiiiiiIIIII7 = (iIiIiiiiiiiIi)npcView.ALLATORIxDEMO().iiiIiiiiiiIIi(162);
                                                                                                                                                            IiiiiiiiIIIII7.ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII6, IiiiiiiiIIIII4);
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        IiiiiiiiIIIII3 = npcView.ALLATORIxDEMO();
                                                                                                                                                        if (type.equals("\u6211\u662f\u6765\u53ec\u5524\u4f60\u7684")) {
                                                                                                                                                            IiiiiiiiIIIII2 = npcView.ALLATORIxDEMO().ALLATORIxDEMO(npcView.iIiIiiiiIIiii().toString());
                                                                                                                                                            int IiiiiiiiIIIII8 = IiiiiiiiIIIII2.getNpctable().getNpcname().indexOf(":");
                                                                                                                                                            if (IiiiiiiiIIIII8 == -1) {
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            type = IiiiiiiiIIIII2.getNpctable().getNpcname().substring(IiiiiiiiIIIII8 + 1);
                                                                                                                                                        }
                                                                                                                                                        IiiiiiiiIIIII2 = null;
                                                                                                                                                        IiiiiiiiIIIII = null;
                                                                                                                                                        String string = type;
                                                                                                                                                        switch (string.hashCode()) {
                                                                                                                                                            case -1968694045: {
                                                                                                                                                                if (!string.equals("\u72c2\u529b\u5c01\u5370\u4e4b\u4e66")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block105;
                                                                                                                                                            }
                                                                                                                                                            case -1615211208: {
                                                                                                                                                                if (!string.equals("\u5929\u96f7\u5c01\u5370\u4e4b\u4e66")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block106;
                                                                                                                                                            }
                                                                                                                                                            case -1467640939: {
                                                                                                                                                                if (!string.equals("\u5151\u6362\u5f69\u6676\u77f3")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block107;
                                                                                                                                                            }
                                                                                                                                                            case -1332643322: {
                                                                                                                                                                if (!string.equals("\u6362\u4e2a\u8d85\u7ea7\u85cf\u5b9d\u56fe")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block108;
                                                                                                                                                            }
                                                                                                                                                            case -1214389739: {
                                                                                                                                                                if (!string.equals("\u5267\u6bd2\u5c01\u5370\u4e4b\u4e66")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block109;
                                                                                                                                                            }
                                                                                                                                                            case -901855626: {
                                                                                                                                                                if (!string.equals("\u5317\u51a5\u9f99\u541b(288\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block110;
                                                                                                                                                            }
                                                                                                                                                            case -841984324: {
                                                                                                                                                                if (!string.equals("\u753b\u76ae\u5a18\u5b50(188\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block111;
                                                                                                                                                            }
                                                                                                                                                            case -500066278: {
                                                                                                                                                                if (!string.equals("\u5fa1\u5251\u5c01\u5370\u4e4b\u4e66")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block112;
                                                                                                                                                            }
                                                                                                                                                            case -391352380: {
                                                                                                                                                                if (!string.equals("\u5b5f\u6781(288\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block113;
                                                                                                                                                            }
                                                                                                                                                            case -252839138: {
                                                                                                                                                                if (!string.equals("\u5b54\u96c0\u660e\u738b(188\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block114;
                                                                                                                                                            }
                                                                                                                                                            case -89065514: {
                                                                                                                                                                if (!string.equals("\u5999\u97f3\u683e\u5973(388\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block115;
                                                                                                                                                            }
                                                                                                                                                            case 645090: {
                                                                                                                                                                if (!string.equals("\u4e94\u53f6")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block116;
                                                                                                                                                            }
                                                                                                                                                            case 22173296: {
                                                                                                                                                                if (!string.equals("\u5782\u4e91\u53df")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block117;
                                                                                                                                                            }
                                                                                                                                                            case 27817131: {
                                                                                                                                                                if (!string.equals("\u6d6a\u6dd8\u6c99")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block118;
                                                                                                                                                            }
                                                                                                                                                            case 38284259: {
                                                                                                                                                                if (string.equals("\u989c\u5982\u7389")) break;
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            case 40681492: {
                                                                                                                                                                if (!string.equals("\u9f99\u9a6c(188\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block119;
                                                                                                                                                            }
                                                                                                                                                            case 314263709: {
                                                                                                                                                                if (!string.equals("\u753b\u4e2d\u4ed9(488\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block120;
                                                                                                                                                            }
                                                                                                                                                            case 459383875: {
                                                                                                                                                                if (!string.equals("\u4f73\u97f3\u5c0f\u4f7f\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block121;
                                                                                                                                                            }
                                                                                                                                                            case 651015043: {
                                                                                                                                                                if (!string.equals("\u51a5\u7075\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block122;
                                                                                                                                                            }
                                                                                                                                                            case 707196064: {
                                                                                                                                                                if (!string.equals("\u5982\u610f\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block123;
                                                                                                                                                            }
                                                                                                                                                            case 748348967: {
                                                                                                                                                                if (!string.equals("\u5de8\u7ffc\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block124;
                                                                                                                                                            }
                                                                                                                                                            case 750978263: {
                                                                                                                                                                if (!string.equals("\u5f53\u5eb7\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block125;
                                                                                                                                                            }
                                                                                                                                                            case 829117173: {
                                                                                                                                                                if (!string.equals("\u677e\u9f20\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block126;
                                                                                                                                                            }
                                                                                                                                                            case 911529650: {
                                                                                                                                                                if (!string.equals("\u73b2\u73d1\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block127;
                                                                                                                                                            }
                                                                                                                                                            case 983967266: {
                                                                                                                                                                if (!string.equals("\u767d\u6cfd(468\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block128;
                                                                                                                                                            }
                                                                                                                                                            case 1018376513: {
                                                                                                                                                                if (!string.equals("\u82cd\u51db\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block129;
                                                                                                                                                            }
                                                                                                                                                            case 1023207363: {
                                                                                                                                                                if (!string.equals("\u8303\u5f0f\u4e4b\u9b42")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block130;
                                                                                                                                                            }
                                                                                                                                                            case 1042713838: {
                                                                                                                                                                if (!string.equals("\u846b\u82a6\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block131;
                                                                                                                                                            }
                                                                                                                                                            case 1106960532: {
                                                                                                                                                                if (!string.equals("\u8d6d\u708e\u53e4\u5377")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block132;
                                                                                                                                                            }
                                                                                                                                                            case 1162282396: {
                                                                                                                                                                if (!string.equals("\u955c\u82b1\u6c34\u6708(388\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block133;
                                                                                                                                                            }
                                                                                                                                                            case 1502595688: {
                                                                                                                                                                if (!string.equals("\u5bd2\u51b0\u5c01\u5370\u4e4b\u4e66")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block134;
                                                                                                                                                            }
                                                                                                                                                            case 1624805537: {
                                                                                                                                                                if (!string.equals("\u6211\u8981\u5151\u6362\u63a8\u5e7f\u793c\u5305")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block135;
                                                                                                                                                            }
                                                                                                                                                            case 1676496623: {
                                                                                                                                                                if (!string.equals("\u5e74(588\u788e\u7247)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block136;
                                                                                                                                                            }
                                                                                                                                                            case 1681718485: {
                                                                                                                                                                if (!string.equals("\u6211\u8981\u5151\u6362\u6b66\u5723\u4e4b\u9b42")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block137;
                                                                                                                                                            }
                                                                                                                                                            case 1817486809: {
                                                                                                                                                                if (!string.equals("\u6362\u4e2a\u9ad8\u7ea7\u85cf\u5b9d\u56fe")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block138;
                                                                                                                                                            }
                                                                                                                                                            case 2132727578: {
                                                                                                                                                                if (!string.equals("\u6362\u4e2a\u73b2\u73d1\u85cf\u5b9d\u56fe(\u6d88\u801710E\u5927\u8bdd\u5e01,1W\u4ed9\u7389)")) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                break block139;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (IiiiiiiiIIIII2 == null) {
                                                                                                                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200101);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (IiiiiiiiIIIII2 == null) {
                                                                                                                                                        IiiiiiiiIIIII2 = new PartJade(1L, 200100);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (IiiiiiiiIIIII2 == null) {
                                                                                                                                                    IiiiiiiiIIIII2 = new PartJade(1L, 200099);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            if (IiiiiiiiIIIII2 == null) {
                                                                                                                                                IiiiiiiiIIIII2 = new PartJade(1L, 200098);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (IiiiiiiiIIIII2 == null) {
                                                                                                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200097);
                                                                                                                                        }
                                                                                                                                        IiiiiiiiIIIII = HandleOption.ALLATORIxDEMO(IiiiiiiiIIIII3);
                                                                                                                                        break block140;
                                                                                                                                    }
                                                                                                                                    IiiiiiiiIIIII2 = new PartJade(1L, 200096);
                                                                                                                                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(174L, 1L), new iiIIiiiiIiiII(175L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(178L, 1L)});
                                                                                                                                    break block140;
                                                                                                                                }
                                                                                                                                IiiiiiiiIIIII2 = new PartJade(1L, 200095);
                                                                                                                                IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(174L, 1L), new iiIIiiiiIiiII(175L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(179L, 1L)});
                                                                                                                                break block140;
                                                                                                                            }
                                                                                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200094);
                                                                                                                            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(175L, 1L), new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(178L, 1L)});
                                                                                                                            break block140;
                                                                                                                        }
                                                                                                                        IiiiiiiiIIIII2 = new PartJade(1L, 200093);
                                                                                                                        IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(178L, 1L), new iiIIiiiiIiiII(179L, 1L)});
                                                                                                                        break block140;
                                                                                                                    }
                                                                                                                    IiiiiiiiIIIII2 = new PartJade(1L, 200092);
                                                                                                                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(175L, 1L), new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(179L, 1L)});
                                                                                                                    break block140;
                                                                                                                }
                                                                                                                IiiiiiiiIIIII2 = new PartJade(1L, 200135);
                                                                                                                IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(178L, 1L), new iiIIiiiiIiiII(179L, 2L), new iiIIiiiiIiiII(181L, 1L), new iiIIiiiiIiiII(182L, 1L)});
                                                                                                                break block140;
                                                                                                            }
                                                                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200147);
                                                                                                            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(178L, 1L), new iiIIiiiiIiiII(179L, 2L), new iiIIiiiiIiiII(180L, 1L), new iiIIiiiiIiiII(181L, 1L)});
                                                                                                            break block140;
                                                                                                        }
                                                                                                        IiiiiiiiIIIII2 = new PartJade(1L, 200137);
                                                                                                        IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(179L, 2L), new iiIIiiiiIiiII(180L, 1L), new iiIIiiiiIiiII(182L, 1L)});
                                                                                                        break block140;
                                                                                                    }
                                                                                                    IiiiiiiiIIIII2 = new PartJade(1L, 200145);
                                                                                                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(174L, 2L), new iiIIiiiiIiiII(179L, 1L), new iiIIiiiiIiiII(180L, 1L), new iiIIiiiiIiiII(181L, 1L), new iiIIiiiiIiiII(183L, 1L)});
                                                                                                    break block140;
                                                                                                }
                                                                                                IiiiiiiiIIIII2 = new PartJade(1L, 200132);
                                                                                                IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(174L, 1L), new iiIIiiiiIiiII(175L, 1L), new iiIIiiiiIiiII(180L, 1L), new iiIIiiiiIiiII(181L, 1L), new iiIIiiiiIiiII(182L, 1L), new iiIIiiiiIiiII(183L, 1L)});
                                                                                                break block140;
                                                                                            }
                                                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200133);
                                                                                            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(174L, 1L), new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(180L, 2L), new iiIIiiiiIiiII(183L, 1L)});
                                                                                            break block140;
                                                                                        }
                                                                                        IiiiiiiiIIIII2 = new PartJade(1L, 200134);
                                                                                        IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(180L, 3L), new iiIIiiiiIiiII(181L, 3L)});
                                                                                        break block140;
                                                                                    }
                                                                                    IiiiiiiiIIIII2 = new PartJade(1L, 200146);
                                                                                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(175L, 1L), new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(179L, 1L), new iiIIiiiiIiiII(180L, 1L), new iiIIiiiiIiiII(182L, 2L)});
                                                                                    break block140;
                                                                                }
                                                                                IiiiiiiiIIIII2 = new PartJade(1L, 200136);
                                                                                IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(174L, 1L), new iiIIiiiiIiiII(176L, 1L), new iiIIiiiiIiiII(177L, 1L), new iiIIiiiiIiiII(179L, 1L), new iiIIiiiiIiiII(182L, 1L), new iiIIiiiiIiiII(183L, 1L)});
                                                                                break block140;
                                                                            }
                                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200144);
                                                                            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(175L, 1L), new iiIIiiiiIiiII(178L, 1L), new iiIIiiiiIiiII(180L, 1L), new iiIIiiiiIiiII(181L, 2L), new iiIIiiiiIiiII(182L, 1L)});
                                                                            break block140;
                                                                        }
                                                                        IiiiiiiiIIIII2 = new PartJade(1L, 200157);
                                                                        IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80047L, 1L)});
                                                                        break block140;
                                                                    }
                                                                    IiiiiiiiIIIII2 = new PartJade(1L, 200116);
                                                                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80167L, 588L)});
                                                                    break block140;
                                                                }
                                                                IiiiiiiiIIIII2 = new PartJade(1L, 200117);
                                                                IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80167L, 488L)});
                                                                break block140;
                                                            }
                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200123);
                                                            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80167L, 468L)});
                                                            break block140;
                                                        }
                                                        if (IiiiiiiiIIIII2 == null) {
                                                            IiiiiiiiIIIII2 = new PartJade(1L, 200124);
                                                        }
                                                    }
                                                    if (IiiiiiiiIIIII2 == null) {
                                                        IiiiiiiiIIIII2 = new PartJade(1L, 200138);
                                                    }
                                                }
                                                if (IiiiiiiiIIIII2 == null) {
                                                    IiiiiiiiIIIII2 = new PartJade(1L, 200141);
                                                }
                                                if (IiiiiiiiIIIII == null) {
                                                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80168L, 188L)});
                                                }
                                            }
                                            if (IiiiiiiiIIIII2 == null) {
                                                IiiiiiiiIIIII2 = new PartJade(1L, 200142);
                                            }
                                        }
                                        if (IiiiiiiiIIIII2 == null) {
                                            IiiiiiiiIIIII2 = new PartJade(1L, 200140);
                                        }
                                        if (IiiiiiiiIIIII == null) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80168L, 288L)});
                                        }
                                    }
                                    if (IiiiiiiiIIIII2 == null) {
                                        IiiiiiiiIIIII2 = new PartJade(1L, 200143);
                                    }
                                }
                                if (IiiiiiiiIIIII2 == null) {
                                    IiiiiiiiIIIII2 = new PartJade(1L, 200158);
                                }
                                if (IiiiiiiiIIIII == null) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80168L, 388L)});
                                }
                                break block140;
                            }
                            IiiiiiiiIIIII2 = new PartJade(0L, 170);
                            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(171L, 3L)});
                            break block140;
                        }
                        IiiiiiiiIIIII2 = new PartJade(0L, 80060);
                        IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80059L, 5L)});
                        break block140;
                    }
                    if (IiiiiiiiIIIII3.getLoginResult().getGold().compareTo(new BigDecimal(1000000000)) < 0) {
                        npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u5927\u8bdd\u5e01\u4e0d\u8db310\u4ebf");
                        return;
                    }
                    if (IiiiiiiiIIIII3.getLoginResult().getCodecard().compareTo(new BigDecimal(10000)) < 0) {
                        npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u4ed9\u7389\u4e0d\u8db31\u4e07");
                        return;
                    }
                    IiiiiiiiIIIII2 = new PartJade(0L, 81579);
                    IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(81578L, 5L)});
                    break block140;
                }
                IiiiiiiiIIIII2 = new PartJade(0L, 80046);
                IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80047L, 1L)});
                break block140;
            }
            IiiiiiiiIIIII2 = new PartJade(0L, 80165);
            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(80164L, 10L)});
            break block140;
            return;
        }
        if (IiiiiiiiIIIII2 == null || IiiiiiiiIIIII == null) {
            npcView.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7269\u54c1\u4e0d\u8db3");
            return;
        }
        if (IiiiiiiiIIIII2.getSuitid() == 1L && IiiiiiiiIIIII3.pets.size() >= 21) {
            npcView.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u60a8\u7684\u53ec\u5524\u517d\u53ef\u643a\u5e26\u7684\u6570\u91cf\u5df2\u6ee1");
            return;
        }
        if (IiiiiiiiIIIII2.getSuitid() == 0L && IiiiiiiiIIIII3.getGoodPackSum(-1L, new BigDecimal(1), 1) <= 0) {
            npcView.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u80cc\u5305\u5df2\u6ee1");
            return;
        }
        SuitOperBean IiiiiiiiIIIII7 = new SuitOperBean();
        IiiiiiiiIIIII7.setType(21);
        IiiiiiiiIIIII7.setJade((PartJade)IiiiiiiiIIIII2);
        IiiiiiiiIIIII7.setGoods(IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII));
        String IiiiiiiiIIIII9 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII7));
        npcView.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII9);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(boolean isScript, GoodFight fight, Goodstable good, GameView gameView) {
        void IiiiiiiiIIIII;
        GoodFight IiiiiiiiIIIII2 = good.getFight();
        String IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO(fight, true);
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        good.setValueTwo(IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII2.getNum() <= 0) {
            good.setUsetime(Integer.valueOf(0));
            gameView.roleData.iIiIiiiiIIiii(good.getRgid());
        }
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)2, (GameClient)gameView.getClient());
        Door door = new Door();
        door.setDoormap(String.valueOf(fight.getMap()));
        IiiiiiiiIIIII.setDoorpoint(String.valueOf(fight.getX()) + "|" + fight.getY());
        if (gameView.getObjectArea().ALLATORIxDEMO(String.valueOf(fight.getMap())).getMapFlag() != 1 || !gameView.roleUnit.iIiIiiiiIIiIi()) {
            gameView.iiiIiiiiiiIIi("\u98de\u884c\u68cb\u4f7f\u7528\u9650\u5236");
            return;
        }
        HandleOption.ALLATORIxDEMO((Door)IiiiiiiiIIIII, isScript ? 3 : 1, gameView);
    }

    /*
     * WARNING - void declaration
     */
    public static void iIiIiiiiIIiii(int type, GameView gameView) {
        void IiiiiiiiIIIII;
        if (gameView.roleUnit.iIiIiiiiIiIii.getFighting() != 0) {
            return;
        }
        gameView.roleUnit.ALLATORIxDEMO();
        FightingForesee fightingForesee = new FightingForesee();
        IiiiiiiiIIIII.setYidui(gameView.roleUnit.iIiIiiiiIiIii.getTeam());
        IiiiiiiiIIIII.setType(type);
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"fig2", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void iIiIiiiiIIiii(String type, GameView gameView) {
        if (type.equals("\u6253\u902011-14\u7ea7\u88c5\u5907")) {
            type = "\u6253\u902011-16\u7ea7\u88c5\u5907";
        }
        if (type.equals("\u7b26\u77f3")) {
            gameView.getFormManagement().iIiIiiiiIIiIi(70);
            return;
        }
        if (type.equals("\u6253\u9020\u5b69\u5b50\u88c5\u5907")) {
            gameView.getFormManagement().iIiIiiiiIIiIi(164);
            return;
        }
        ((iiIiIiiiIIIiI)gameView.getFormManagement().iiiIiiiiiiIIi(26)).iIiIiiiiIIiIi(type);
    }

    public static void ALLATORIxDEMO(String value, GameView gameView) {
        int IiiiiiiiIIIII = gameView.roleData.getLoginResult().getGrade();
        int IiiiiiiiIIIII2 = 0;
        if (value.equals("\u6211\u60f3\u8f6c\u6362\u79cd\u65cf")) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII > 459 ? 12 : (IiiiiiiiIIIII > 338 ? 10 : (IiiiiiiiIIIII > 102 ? 8 : 6));
        } else {
            IiiiiiiiIIIII2 = 8;
            if (IiiiiiiiIIIII == 102) {
                IiiiiiiiIIIII2 = 8;
            } else if (IiiiiiiiIIIII == 210) {
                IiiiiiiiIIIII2 = 8;
            } else if (IiiiiiiiIIIII == 338) {
                IiiiiiiiIIIII2 = 10;
            } else {
                if (IiiiiiiiIIIII != 459) {
                    gameView.iIiIiiiiIIiii("\u4f60\u8fd8\u4e0d\u5177\u5907\u8f6c\u751f\u7684\u6761\u4ef6\uff01");
                    return;
                }
                IiiiiiiiIIIII2 = 12;
            }
        }
        ((IIiIIiiiIIIiI)gameView.getFormManagement().iiiIiiiiiiIIi(41)).ALLATORIxDEMO(value.equals("\u6211\u60f3\u8f6c\u6362\u79cd\u65cf") ? 0 : 1, IiiiiiiiIIIII2);
    }

    public static int ALLATORIxDEMO(int id, int lvl, String[] vs) {
        if (lvl == 1) {
            return 0;
        }
        if (vs == null) {
            return 1;
        }
        String IiiiiiiiIIIII = String.valueOf(id - 1) + "_";
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < vs.length) {
            if (vs[IiiiiiiiIIIII2].startsWith(IiiiiiiiIIIII)) {
                if (Integer.parseInt(vs[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII.length())) <= 1000) return 2;
                return 0;
            }
            ++IiiiiiiiIIIII2;
        }
        return 1;
    }

    public static void ALLATORIxDEMO(int type, GameView gameView) {
        Door IiiiiiiiIIIII = new Door();
        IiiiiiiiIIIII.setDoormap("1207");
        IiiiiiiiIIIII.setDoorpoint(gameView.getClient().ALLATORIxDEMO(2, 3) ? "5080|3960" : "4294|2887");
        if (type == 1) {
            IiiiiiiiIIIII.setDoormap("3312");
            IiiiiiiiIIIII.setDoorpoint("2373|1737");
        } else if (type == 2) {
            IiiiiiiiIIIII.setDoormap("3313");
            IiiiiiiiIIIII.setDoorpoint("162|1734");
        } else if (type == 3) {
            IiiiiiiiIIIII.setDoormap("3314");
            IiiiiiiiIIIII.setDoorpoint("361|1657");
        }
        HandleOption.ALLATORIxDEMO(IiiiiiiiIIIII, 2, gameView);
    }

    /*
     * WARNING - void declaration
     */
    public static void iiiIiiiiiiIIi(GameView gameView) {
        RoleData IiiiiiiiIIIII = gameView.roleData;
        if (IiiiiiiiIIIII.getLoginResult().getGang_id() != null && IiiiiiiiIIIII.getLoginResult().getGang_id().intValue() != 0) {
            void IiiiiiiiIIIII2;
            Door door = new Door();
            IiiiiiiiIIIII2.setDoormap("3000");
            IiiiiiiiIIIII2.setDoorpoint("300|3000");
            HandleOption.ALLATORIxDEMO((Door)IiiiiiiiIIIII2, 4, gameView);
            return;
        }
        gameView.iiiIiiiiiiIIi("\u4f60\u8fd8\u6ca1\u6709\u5e2e\u6d3e");
    }

    public static List<iiIIiiiiIiiII> ALLATORIxDEMO(RoleData roleData) {
        return roleData.ALLATORIxDEMO(new iiIIiiiiIiiII[]{new iiIIiiiiIiiII(901L, 1L), new iiIIiiiiIiiII(902L, 1L), new iiIIiiiiIiiII(903L, 1L), new iiIIiiiiIiiII(904L, 1L), new iiIIiiiiIiiII(905L, 1L), new iiIIiiiiIiiII(906L, 1L), new iiIIiiiiIiiII(907L, 1L), new iiIIiiiiIiiII(908L, 1L), new iiIIiiiiIiiII(909L, 1L), new iiIIiiiiIiiII(910L, 1L)});
    }

    public static boolean ALLATORIxDEMO(int npcType, iiiiiiiiiiIiI baseUnit, GameView gameView) {
        Object IiiiiiiiIIIII;
        if (npcType == -71 || npcType == -89) {
            com.xy.q.IiiiIiiiiIiIi IiiiiiiiIIIII2 = gameView.getFormManagement().iIiIiiiiIIiii(12);
            if (IiiiiiiiIIIII2 != null) {
                gameView.iIiIiiiiIIiii("\u4f60\u73b0\u5728\u5df2\u7ecf\u5904\u4e8e\u7ed9\u4e88\u72b6\u6001");
                return true;
            }
            NpcInfoBean IiiiiiiiIIIII3 = new NpcInfoBean();
            Npctable IiiiiiiiIIIII4 = new Npctable();
            IiiiiiiiIIIII4.setNpcname(npcType == -71 ? "\u91d1\u5e01\u56de\u6536\u5546" : "\u7ed1\u7389\u56de\u6536\u5546");
            IiiiiiiiIIIII4.setNpctype(String.valueOf(Math.abs(npcType)));
            IiiiiiiiIIIII4.setNpcid("0");
            IiiiiiiiIIIII4.setSkin("0");
            IiiiiiiiIIIII4.setDir("0");
            IiiiiiiiIIIII4.setTx("0");
            IiiiiiiiIIIII4.setTy("0");
            IiiiiiiiIIIII3.setNpctable(IiiiiiiiIIIII4);
            iiIiIiiiiIiii.ALLATORIxDEMO((iiiiiiiiiiIiI)new IIiIiiiiIiIII(IiiiiiiiIIIII3), (GameView)gameView);
            return true;
        }
        if (baseUnit != null && baseUnit instanceof IIIIIiiiIiiII) {
            IiiiiiiiIIIII = (IIIIIiiiIiiII)baseUnit;
            if (IiiiiiiiIIIII.IiiiiiiiIIIII.getRobottype() == 2) {
                String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"clickmonsters", (String)("" + IiiiiiiiIIIII.IiiiiiiiIIIII.getI()));
                gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
                return true;
            }
        }
        if (npcType == 1106 || npcType == 515 || npcType == 605) {
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"shop", (String)String.valueOf(npcType));
            gameView.getClient().ALLATORIxDEMO((String)IiiiiiiiIIIII);
            return true;
        }
        IiiiiiiiIIIII = (List)gameView.getObjectArea().ALLATORIxDEMO().getNpcShopMap().get(String.valueOf(npcType));
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        iiiIiiiiIiiiI IiiiiiiiIIIII6 = (iiiIiiiiIiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(23);
        IiiiiiiiIIIII6.ALLATORIxDEMO((List)IiiiiiiiIIIII, npcType, null);
        gameView.getFormManagement().iIiIiiiiIIiIi(23);
        return true;
    }

    public static void iIiIiiiiIIiii(GameView gameView) {
        RoleData roleData = gameView.roleData;
        LoginResult IiiiiiiiIIIII = roleData.getLoginResult();
        PKSys IiiiiiiiIIIII2 = roleData.getPkSys();
        IiiiiiiiIIIII2.setPk2(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(10) < 9 ? 2 : 1);
        IiiiiiiiIIIII2.setPk1(IiiiiiiiIIIII2.getPk1() - 1);
        if (IiiiiiiiIIIII2.getPk1() < 1) {
            IiiiiiiiIIIII2.setPk1(1);
        }
        if (IiiiiiiiIIIII2.getPk1() >= 8 && IiiiiiiiIIIII2.getPk3() % 4 == 3) {
            long IiiiiiiiIIIII3 = IiiiiiiiIIIII.getExperience().longValue();
            long IiiiiiiiIIIII4 = gameView.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII.getTurnAround(), IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()));
            IiiiiiiiIIIII4 = (long)((double)IiiiiiiiIIIII4 * 0.6);
            gameView.iiiIiiiiiiIIi("\u4f60\u635f\u5931\u4e86" + IiiiiiiiIIIII4 + "\u7ecf\u9a8c");
            IiiiiiiiIIIII.setExperience(new BigDecimal(IiiiiiiiIIIII3 -= IiiiiiiiIIIII4));
            IiiiiiiiIIIII2.setPk3(IiiiiiiiIIIII2.getPk3() + 1);
        }
        IiiiiiiiIIIII2.setPk4(IiiiiiiiIIIII2.getPk4() + 1);
        IiiiiiiiIIIII.setTaskDaily(IiiiiiiiIIIII2.ALLATORIxDEMO());
        QuoteOutBean IiiiiiiiIIIII3 = new QuoteOutBean();
        IiiiiiiiIIIII3.setData(IiiiiiiiIIIII.getTaskDaily());
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"quoteout", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII3));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
        gameView.iiiIiiiiiiIIi("\u597d\u597d\u6539\u9020,\u91cd\u65b0\u505a\u4eba");
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(MapModel mapModel, int x, int y, GameView gameView, boolean confirm) {
        void IiiiiiiiIIIII;
        Goodstable IiiiiiiiIIIII2 = gameView.roleData.ALLATORIxDEMO(105L);
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (mapModel.getMapFlag() != 1 || !gameView.roleUnit.iIiIiiiiIIiIi()) {
            gameView.iiiIiiiiiiIIi("\u98de\u884c\u68cb\u4f7f\u7528\u9650\u5236");
            return;
        }
        if (!confirm) {
            gameView.ALLATORIxDEMO(new ConfirmBean(28, String.valueOf(mapModel.getMapId()) + "|" + x + "|" + y, "\u4f60\u8981\u4f7f\u7528#R" + IiiiiiiiIIIII2.getGoodsname() + "#W\u53bb\u54ea\u91cc?"));
            return;
        }
        if (gameView.getBattleScene() != null) {
            gameView.iiiIiiiiiiIIi("\u4f60\u5728\u6218\u6597\u4e2d");
            return;
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2, (int)1, (GameClient)gameView.getClient());
        if (IiiiiiiiIIIII2.getUsetime() <= 0) {
            gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII2.getRgid());
        }
        gameView.automation.ALLATORIxDEMO(false, 0);
        ChangeMapBean changeMapBean = new ChangeMapBean();
        IiiiiiiiIIIII.setMapid(String.valueOf(mapModel.getMapId()));
        IiiiiiiiIIIII.setMapx(x);
        IiiiiiiiIIIII.setMapy(y);
        IiiiiiiiIIIII.setType(1);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"changemap", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public static void ALLATORIxDEMO(GameView gameView) {
        if (!ParamTool.ALLATORIxDEMO((long)2000L, (GameView)gameView)) {
            return;
        }
        LoginResult IiiiiiiiIIIII = gameView.roleData.getLoginResult();
        int IiiiiiiiIIIII2 = gameView.roleData.getRoleProperty().getHp();
        int IiiiiiiiIIIII3 = gameView.roleData.getRoleProperty().getMp();
        if (IiiiiiiiIIIII2 > IiiiiiiiIIIII.getHp().intValue() || IiiiiiiiIIIII3 > IiiiiiiiIIIII.getMp().intValue()) {
            IiiiiiiiIIIII.setHp(new BigDecimal(IiiiiiiiIIIII2));
            IiiiiiiiIIIII.setMp(new BigDecimal(IiiiiiiiIIIII3));
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolechange", (String)("H" + IiiiiiiiIIIII.getHp() + "=" + IiiiiiiiIIIII.getMp()));
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII4);
        }
        gameView.iIiIiiiiIIiii("\u4f11\u606f\u4e86\u4e00\u591c,\u4f60\u53d8\u5f97\u66f4\u7cbe\u795e\u4e86");
    }
}
