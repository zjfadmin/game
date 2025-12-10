/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiiiiiIIIII
 *  com.xy.a.q.IiIiiiiiIiIii
 *  com.xy.bean.BackRoleInfo
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.FMBean
 *  com.xy.bean.GoodsResultArrBean
 *  com.xy.bean.PrivateData
 *  com.xy.c.IIIIIiiiIiIii
 *  com.xy.c.IIIIiiiiIIIIi
 *  com.xy.c.IIIiiiiiIiIiI
 *  com.xy.c.IIIiiiiiiiiIi
 *  com.xy.c.IIiIIiiiIIIiI
 *  com.xy.c.IIiIiiiiIiIII
 *  com.xy.c.IIiIiiiiIiiIi
 *  com.xy.c.IIiiIiiiiIIiI
 *  com.xy.c.IiIIIiiiiiiIi
 *  com.xy.c.IiIiIiiiiIIiI
 *  com.xy.c.IiIiIiiiiiIiI
 *  com.xy.c.IiIiiiiiIIIiI
 *  com.xy.c.IiiIIiiiiIiii
 *  com.xy.c.IiiiIiiiiIIII
 *  com.xy.c.IiiiIiiiiIiIi
 *  com.xy.c.IiiiiiiiiIIII
 *  com.xy.c.iIIiiiiiIIIIi
 *  com.xy.c.iIiIIiiiIiiiI
 *  com.xy.c.iiIIiiiiIiiII
 *  com.xy.c.iiIiIiiiiIiIi
 *  com.xy.c.iiIiIiiiiIiii
 *  com.xy.c.iiIiIiiiiiIIi
 *  com.xy.c.iiIiiiiiIIiii
 *  com.xy.c.iiiIiiiiIiiiI
 *  com.xy.c.iiiiiiiiIIIII
 *  com.xy.c.iiiiiiiiiiIiI
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.entity.RoleTable
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiIIIiiiiiiIi
 *  com.xy.v.IiIiIiiiiiIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.socket;

import com.xy.a.IiIiiiiiIIIII;
import com.xy.a.q.IiIiiiiiIiIii;
import com.xy.bean.BackRoleInfo;
import com.xy.bean.ConfirmBean;
import com.xy.bean.FMBean;
import com.xy.bean.GoodsResultArrBean;
import com.xy.bean.PrivateData;
import com.xy.c.IIIIIiiiIiIii;
import com.xy.c.IIIIiiiiIIIIi;
import com.xy.c.IIIiiiiiIiIiI;
import com.xy.c.IIIiiiiiiiiIi;
import com.xy.c.IIiIIiiiIIIiI;
import com.xy.c.IIiIiiiiIiIII;
import com.xy.c.IIiIiiiiIiiIi;
import com.xy.c.IIiiIiiiiIIiI;
import com.xy.c.IiIIIiiiiiiIi;
import com.xy.c.IiIiIiiiiIIiI;
import com.xy.c.IiIiiiiiIIIiI;
import com.xy.c.IiiIIiiiiIiii;
import com.xy.c.IiiiIiiiiIIII;
import com.xy.c.IiiiIiiiiIiIi;
import com.xy.c.IiiiiiiiiIIII;
import com.xy.c.iIIiiiiiIIIIi;
import com.xy.c.iIiIIiiiIiiiI;
import com.xy.c.iiIIiiiiIiiII;
import com.xy.c.iiIiIiiiiIiIi;
import com.xy.c.iiIiIiiiiIiii;
import com.xy.c.iiIiIiiiiiIIi;
import com.xy.c.iiIiiiiiIIiii;
import com.xy.c.iiiIiiiiIiiiI;
import com.xy.c.iiiiiiiiIIIII;
import com.xy.c.iiiiiiiiiiIiI;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.entity.RoleTable;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.IiIiIiiiiiIiI;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParamTool {
    public static GoodsResultArrBean goodarr;
    public static final Map<String, ServerAction> ACTION_MAP;

    public static void ALLATORIxDEMO(PrivateData data, GameClient client) {
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolePrivate", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(data));
        client.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    static {
        ACTION_MAP = new HashMap<String, ServerAction>();
        ParamTool.ALLATORIxDEMO();
        goodarr = new GoodsResultArrBean();
    }

    public static void ALLATORIxDEMO(Lingbao lingbao, GameClient client) {
        if (lingbao == null) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"updateling", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(lingbao));
        client.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public static void ALLATORIxDEMO(Baby baby, GameClient client) {
        if (baby == null) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"updababy", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(baby));
        client.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public static void ALLATORIxDEMO(RoleSummoning pet, GameClient client) {
        if (pet == null) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"petchange", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(pet));
        client.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(List<Goodstable> list, int type, GameClient client) {
        GoodsResultArrBean goodsResultArrBean = goodarr;
        synchronized (goodsResultArrBean) {
            void IiiiiiiiIIIII;
            goodarr.setI(type);
            goodarr.setList(list);
            String string = Agreement.getSendTextAES((String)"packchange", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(goodarr));
            client.ALLATORIxDEMO((String)IiiiiiiiIIIII);
            return;
        }
    }

    public static void ALLATORIxDEMO() {
        IiiIIiiiiIiii IiiiiiiiIIIII = null;
        ACTION_MAP.put("enterGame", (ServerAction)new iiIiiiiiIIiii());
        ACTION_MAP.put("move", (ServerAction)new iiIiIiiiiiIIi());
        ACTION_MAP.put("addgood", (ServerAction)new iIIiiiiiIIIIi());
        IiiiiiiiIIIII = new IiiIIiiiiIiii();
        ACTION_MAP.put("chat", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("prompt", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new iiIiIiiiiIiii();
        ACTION_MAP.put("monsterrefresh", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("scene", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("gangstate", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("bangtz", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("clickmonsters", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("changerolename", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("userretreat", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("intogame", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("rolelevelup", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("upRoleShow", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("mapScene", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IIIIIiiiIiIii();
        ACTION_MAP.put("stallstate", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IIiiIiiiiIIiI();
        ACTION_MAP.put("team1", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("team2", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("team3", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("team4", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("team6", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("enlist", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IIIIiiiiIIIIi();
        ACTION_MAP.put("fig1", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("fig5", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("fig4", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("fig6", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("fig8", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("fig7", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("battleconnection", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put(Agreement.fightCard, (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put(Agreement.fightAuto, (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put(Agreement.fightVideo, (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IIiIIiiiIIIiI();
        ACTION_MAP.put("friend", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("friendchat", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("searcahChatRoleName", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("searcahChatRoleId", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("searchChatRecorde", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new iIiIIiiiIiiiI();
        ACTION_MAP.put("titlelist", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("titlechange", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IiIIIiiiiiiIi();
        ACTION_MAP.put("npcdialog", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("npc", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("baby", (ServerAction)new iiiiiiiiIIIII());
        ACTION_MAP.put("richm", (ServerAction)new IIiIiiiiIiIII());
        ACTION_MAP.put("DUELBOARD", (ServerAction)new IIIiiiiiiiiIi());
        ACTION_MAP.put("extrattroper", (ServerAction)new iiIiIiiiiIiIi());
        ACTION_MAP.put("asset", (ServerAction)new IiiiIiiiiIIII());
        ACTION_MAP.put("taskN", (ServerAction)new iiiiiiiiiiIiI());
        ACTION_MAP.put("getfivemsg", (ServerAction)new IiIiIiiiiIIiI());
        IiiiiiiiIIIII = new iiiIiiiiIiiiI();
        ACTION_MAP.put("chongjipackget", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("teamArena", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("petArena", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("Paydaygradepay", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("Dayforweekgradeget", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("Dayforoneget", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("pankinglist", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("racialtransformation", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("tip", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("bookofchalg", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("exchange", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("intogang", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("stall", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("Getvipgradepack", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("applypay", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("middle", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("1", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("rolechange", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("gangchange", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("vicon", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("BEAU", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IiIiiiiiIIIiI();
        ACTION_MAP.put("activity", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("activityS", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new com.xy.c.IiIiIiiiiiIiI();
        ACTION_MAP.put("ganglist", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new iiIIiiiiIiiII();
        ACTION_MAP.put("shop", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("shopGood", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("shopPrice", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IiiiiiiiiIIII();
        ACTION_MAP.put("pawn", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("pawnpet", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("parcel", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IIIiiiiiIiIiI();
        ACTION_MAP.put("TransGood", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("TransState", (ServerAction)IiiiiiiiIIIII);
        IiiiiiiiIIIII = new IIiIiiiiIiiIi();
        ACTION_MAP.put("obtainarticle", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("drawnitems", (ServerAction)IiiiiiiiIIIII);
        ACTION_MAP.put("version", (ServerAction)new IiiiIiiiiIiIi());
    }

    public static boolean ALLATORIxDEMO(long tael, GameView gameView) {
        if (tael <= 0L) {
            return false;
        }
        long IiiiiiiiIIIII = gameView.roleData.getLoginResult().getGold().longValue() - tael;
        if (tael > 0L && IiiiiiiiIIIII >= 0L) {
            gameView.roleData.getLoginResult().setGold(new BigDecimal(IiiiiiiiIIIII));
            ParamTool.ALLATORIxDEMO(String.valueOf(tael), gameView);
            gameView.iiiIiiiiiiIIi("\u6263\u9664\u4e86" + tael + "\u4e24!");
            return true;
        }
        gameView.iIiIiiiiIIiii("\u94f6\u4e24\u4e0d\u8db3");
        return false;
    }

    public static void ALLATORIxDEMO(String tael, GameView gameView) {
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"deductiontael", (String)tael);
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public static void iIiIiiiiIIiii(String mes, GameClient client) {
        String IiiiiiiiIIIII;
        block22: {
            block24: {
                block23: {
                    block25: {
                        String IiiiiiiiIIIII2;
                        block21: {
                            int IiiiiiiiIIIII3;
                            IiiiiiiiIIIII2 = mes.substring(0, 4);
                            IiiiiiiiIIIII = null;
                            ServerAction IiiiiiiiIIIII4 = ACTION_MAP.get(IiiiiiiiIIIII2);
                            if (IiiiiiiiIIIII4 != null) {
                                if (!(IiiiiiiiIIIII2.equals("move") || IiiiiiiiIIIII2.equals("fig4") || IiiiiiiiIIIII2.equals("fig7") || IiiiiiiiIIIII2.equals("fig1") || IiiiiiiiIIIII2.equals(Agreement.fightCard) || IiiiiiiiIIIII2.equals(Agreement.fightAuto))) {
                                    mes = Agreement.getSendTextAES((String)"Monitor", (String)(String.valueOf(0) + mes));
                                    client.ALLATORIxDEMO(mes);
                                    IiIiIiiiiiIiI.ALLATORIxDEMO();
                                    return;
                                }
                                IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII2, mes.substring(6), client);
                                return;
                            }
                            int n = IiiiiiiiIIIII3 = (mes = com.xy.v.IiIIIiiiiiiIi.iiiIiiiiiiIIi((String)mes)) != null ? mes.indexOf("//") : -1;
                            if (IiiiiiiiIIIII3 == -1) {
                                return;
                            }
                            IiiiiiiiIIIII2 = mes.substring(0, IiiiiiiiIIIII3);
                            IiiiiiiiIIIII = mes.substring(IiiiiiiiIIIII3 + 2);
                            IiiiiiiiIIIII4 = ACTION_MAP.get(IiiiiiiiIIIII2);
                            if (IiiiiiiiIIIII4 != null) {
                                IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII, client);
                                return;
                            }
                            String string = IiiiiiiiIIIII2;
                            switch (string.hashCode()) {
                                case -1824989755: {
                                    if (!string.equals("serverstop")) {
                                        return;
                                    }
                                    break block21;
                                }
                                case -1627192208: {
                                    if (!string.equals("inlinelogin")) {
                                        return;
                                    }
                                    break block21;
                                }
                                case -283378388: {
                                    if (string.equals("unmarry")) break;
                                    return;
                                }
                                case 3271: {
                                    if (!string.equals("fm")) {
                                        return;
                                    }
                                    break block22;
                                }
                                case 2572211: {
                                    if (!string.equals("TG00")) {
                                        return;
                                    }
                                    break block23;
                                }
                                case 2572212: {
                                    if (!string.equals("TG01")) {
                                        return;
                                    }
                                    break block24;
                                }
                                case 41231968: {
                                    if (string.equals("makelove")) break;
                                    return;
                                }
                                case 103666725: {
                                    if (string.equals("marry")) break;
                                    return;
                                }
                                case 951117504: {
                                    if (!string.equals("confirm")) {
                                        return;
                                    }
                                    break block25;
                                }
                            }
                            ACTION_MAP.get("marry").ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII, client);
                            return;
                        }
                        client.ALLATORIxDEMO();
                        client.gameView.ALLATORIxDEMO(new ConfirmBean(27, null, IiiiiiiiIIIII2.equals("serverstop") ? "\u670d\u52a1\u5668\u91cd\u65b0\u542f\u52a8,\u8fde\u63a5\u4e2d\u65ad" : (com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII) ? "\u4f60\u5df2\u88ab\u9876\u53f7" : IiiiiiiiIIIII)));
                        return;
                    }
                    ConfirmBean IiiiiiiiIIIII5 = com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(IiiiiiiiIIIII, ConfirmBean.class);
                    client.gameView.ALLATORIxDEMO(IiiiiiiiIIIII5);
                    return;
                }
                BackRoleInfo IiiiiiiiIIIII6 = com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(IiiiiiiiIIIII, BackRoleInfo.class);
                ((IiIiiiiiIiIii)client.gameView.getFormManagement().iiiIiiiiiiIIi(103)).ALLATORIxDEMO(null, IiiiiiiiIIIII6.getList());
                return;
            }
            RoleTable IiiiiiiiIIIII7 = !com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII) ? com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(IiiiiiiiIIIII, RoleTable.class) : null;
            ((IiIiiiiiIiIii)client.gameView.getFormManagement().iiiIiiiiiiIIi(103)).ALLATORIxDEMO(IiiiiiiiIIIII7, null);
            return;
        }
        FMBean IiiiiiiiIIIII8 = com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(IiiiiiiiIIIII, FMBean.class);
        ((IiIiiiiiIIIII)client.gameView.getFormManagement().iiiIiiiiiiIIi(114)).ALLATORIxDEMO(1, IiiiiiiiIIIII8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void ALLATORIxDEMO(Goodstable goodstable, int type, GameClient client) {
        GoodsResultArrBean goodsResultArrBean = goodarr;
        synchronized (goodsResultArrBean) {
            goodarr.setI(type);
            goodarr.getList().clear();
            goodarr.getList().add(goodstable);
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"packchange", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(goodarr));
            client.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
    }

    public static void ALLATORIxDEMO(String mes, GameClient client) {
        if (client.gameView != null && client.gameView.isDraw) {
            System.out.println(String.valueOf(client.gameView.roleData.getRoleId()) + "\u6536\u5230\u7684\u6d88\u606f:" + mes);
            return;
        }
        System.out.println("\u6536\u5230\u7684\u6d88\u606f:" + mes);
    }
}
