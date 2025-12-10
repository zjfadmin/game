/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIiIiiiiiiiIi
 *  com.xy.a.i.IIiIiiiiIiIII
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.q.IIIiIiiiIiIii
 *  com.xy.a.q.iiiiiiiiiIiII
 *  com.xy.a.w.iiiiiiiiiiIiI
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.LoginResult
 *  com.xy.bean.PrivateData
 *  com.xy.bean.RoleShow
 *  com.xy.formula.GoodType
 *  com.xy.game.HandleBabyAndPal
 *  com.xy.game.HandleEquip
 *  com.xy.game.HandleLingbao
 *  com.xy.game.HandleMount
 *  com.xy.game.HandlePet
 *  com.xy.game.PKSys
 *  com.xy.game.RoleData
 *  com.xy.game.Task
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 */
package com.xy.game;

import com.xy.a.a.iIiIiiiiiiiIi;
import com.xy.a.i.IIiIiiiiIiIII;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.q.IIIiIiiiIiIii;
import com.xy.a.q.iiiiiiiiiIiII;
import com.xy.a.w.iiiiiiiiiiIiI;
import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.formula.GoodType;
import com.xy.game.HandleBabyAndPal;
import com.xy.game.HandleEquip;
import com.xy.game.HandleLingbao;
import com.xy.game.HandleMount;
import com.xy.game.HandlePet;
import com.xy.game.PKSys;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class HandleGood {
    public static int[] ALLATORIxDEMO(String value) {
        String[] IiiiiiiiIIIII = value.split("=")[1].split("\\|");
        int[] IiiiiiiiIIIII2 = new int[IiiiiiiiIIIII.length];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3].split("\\&")[0];
            IiiiiiiiIIIII2[IiiiiiiiIIIII3++] = Integer.parseInt(IiiiiiiiIIIII4);
        }
        return IiiiiiiiIIIII2;
    }

    public static void IIiiIiiiiIiII(Goodstable good, RoleData roleData) {
        long IiiiiiiiIIIII = good.getType();
        if (IiiiiiiiIIIII == 100L || IiiiiiiiIIIII == 888L || IiiiiiiiIIIII == 2041L) {
            long[] IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((String)good.getValue());
            if (IiiiiiiiIIIII2[0] != 0L && roleData.getLoginResult().getGold().longValue() + IiiiiiiiIIIII2[0] > IiiiIiiiiIiIi.IiIIIiiiiIiiI.longValue()) {
                roleData.getGameView().iIiIiiiiIIiii("\u91d1\u94b1\u4e0a\u965099.99\u4ebf");
                return;
            }
            good.ALLATORIxDEMO(1);
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (IiiiiiiiIIIII == 7005L || IiiiiiiiIIIII == 118L || IiiiiiiiIIIII == 2051L || IiiiiiiiIIIII == 2052L || IiiiiiiiIIIII == 2057L || IiiiiiiiIIIII == 1007L) {
            String[] IiiiiiiiIIIII4;
            if (roleData.getGoodPackSum(-1L, new BigDecimal(-1), 1) == 0) {
                roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7684\u80cc\u5305\u5df2\u6ee1");
                return;
            }
            int IiiiiiiiIIIII5 = 1;
            if (IiiiiiiiIIIII == 118L) {
                IiiiiiiiIIIII5 = Math.max(1, IIiiIiiiiIIiI.ALLATORIxDEMO((String)good.getValue(), (String)"\u9700\u8981\u6570\u91cf=", (String)"|"));
                if (IiiiiiiiIIIII5 > good.getUsetime()) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u4f60\u9700\u8981\u51d1\u591f" + IiiiiiiiIIIII5 + "\u4e2a\u76f8\u540c\u7269\u54c1\u624d\u80fd\u5f00\u542f");
                    return;
                }
                long IiiiiiiiIIIII6 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)good.getValue(), (String)"\u8bfb\u6761=", (String)"|");
                if (IiiiiiiiIIIII6 > 0L) {
                    roleData.getGameView().getGameReadBar().setReadBar(1, 3, "\u5f00\u542f" + good.getGoodsname(), (double)Math.max(300L, IiiiiiiiIIIII6), iIiIIiiiIiiiI.ALLATORIxDEMO(), (Object)good.getRgid());
                    return;
                }
            } else if ((IiiiiiiiIIIII == 2051L || IiiiiiiiIIIII == 2052L || IiiiiiiiIIIII == 2057L || IiiiiiiiIIIII == 1007L) && (IiiiiiiiIIIII4 = good.getValue().split("\\="))[0].equals("\u5b9d\u56fe")) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII4[1].split(",");
                int IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII4[0]);
                int IiiiiiiiIIIII8 = Integer.parseInt(IiiiiiiiIIIII4[2]) / 20;
                int IiiiiiiiIIIII9 = Integer.parseInt(IiiiiiiiIIIII4[3]) / 20;
                if ((long)IiiiiiiiIIIII7 != roleData.getGameView().mapScene.ALLATORIxDEMO()) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u597d\u50cf\u4e0d\u662f\u5728\u8fd9\u4e2a\u573a\u666f\u5427");
                    return;
                }
                RoleShow roleShow = roleData.getGameView().roleUnit.iIiIiiiiIiIii;
                long IiiiiiiiIIIII10 = roleShow.getX() / 20;
                long IiiiiiiiIIIII11 = roleShow.getY() / 20;
                IiiiiiiiIIIII8 = (int)((long)IiiiiiiiIIIII8 - IiiiiiiiIIIII10);
                IiiiiiiiIIIII9 = (int)((long)IiiiiiiiIIIII9 - IiiiiiiiIIIII11);
                IiiiiiiiIIIII8 = Math.abs(IiiiiiiiIIIII8);
                IiiiiiiiIIIII9 = Math.abs(IiiiiiiiIIIII9);
                if (IiiiiiiiIIIII8 > 4 || IiiiiiiiIIIII9 > 4) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u5750\u6807\u4e0d\u5bf9");
                    return;
                }
            }
            good.ALLATORIxDEMO(IiiiiiiiIIIII5);
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (IiiiiiiiIIIII == 502L) {
            if (roleData.pets.size() >= 21) {
                roleData.getGameView().iiiIiiiiiiIIi("\u60a8\u7684\u53ec\u5524\u517d\u53ef\u643a\u5e26\u7684\u6570\u91cf\u5df2\u6ee1\uff01\uff01\uff01");
                return;
            }
            good.ALLATORIxDEMO(1);
            String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII12);
            return;
        }
        if (IiiiiiiiIIIII == 717L) {
            int IiiiiiiiIIIII13 = Integer.parseInt(good.getValue()) / 100;
            if (IiiiiiiiIIIII13 > 7) return;
            if (roleData.getGameView().getFormManagement().iIiIiiiiIIiii(7) != null) {
                HandleMount.ALLATORIxDEMO((Goodstable)good, (RoleData)roleData);
                return;
            }
            if (roleData.getMount(IiiiiiiiIIIII13) != null) {
                roleData.getGameView().iIiIiiiiIIiii("\u4f60\u5df2\u6709\u8fd9\u79cd\u5750\u9a91\uff01");
                return;
            }
            good.ALLATORIxDEMO(1);
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (IiiiiiiiIIIII == 2525L) {
            String IiiiiiiiIIIII14;
            if (good.getGoodsid().compareTo(new BigDecimal(81445)) == 0) {
                if (3337L != roleData.getGameView().mapScene.ALLATORIxDEMO()) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u524d\u5f80\u5b54\u5e99(33,16)\u4f7f\u7528");
                    return;
                }
                IiiiiiiiIIIII14 = roleData.getGameView().roleUnit.iIiIiiiiIiIii;
                long IiiiiiiiIIIII15 = (IiiiiiiiIIIII14.getX() - 668) / 40;
                long IiiiiiiiIIIII16 = (IiiiiiiiIIIII14.getY() - 335) / 40;
                IiiiiiiiIIIII15 = Math.abs(IiiiiiiiIIIII15);
                IiiiiiiiIIIII16 = Math.abs(IiiiiiiiIIIII16);
                if (IiiiiiiiIIIII15 > 4L || IiiiiiiiIIIII16 > 4L) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u524d\u5f80\u5b54\u5e99(33,16)\u4f7f\u7528");
                    return;
                }
            }
            good.ALLATORIxDEMO(1);
            IiiiiiiiIIIII14 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII14);
            return;
        }
        if (GoodType.IIiiiiiiIIiiI((long)IiiiiiiiIIIII) || GoodType.iiiIiiiiiIiii((long)IiiiiiiiIIIII) || IiiiiiiiIIIII == 88L || IiiiiiiiIIIII == 99L || IiiiiiiiIIIII == 111L || IiiiiiiiIIIII == 112L || IiiiiiiiIIIII == 113L || IiiiiiiiIIIII == 151L || IiiiiiiiIIIII == 193L) {
            String IiiiiiiiIIIII17 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII17);
            return;
        }
        if (IiiiiiiiIIIII == 1006L) {
            good.ALLATORIxDEMO(1);
            String IiiiiiiiIIIII18 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII18);
            return;
        }
        if (IiiiiiiiIIIII != 2054L) return;
        good.ALLATORIxDEMO(1);
        String IiiiiiiiIIIII19 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII19);
    }

    public static void IIIiiiiiiIIiI(Goodstable good, RoleData roleData) {
        if (!HandleGood.ALLATORIxDEMO(roleData)) {
            return;
        }
        if (good.getValue() != null && !good.getValue().equals("")) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII.iIiIiiiiIIiii(good);
            return;
        }
        long IiiiiiiiIIIII = good.getType();
        int IiiiiiiiIIIII2 = 0;
        if (IiiiiiiiIIIII == 2010L) {
            IiiiiiiiIIIII2 = 10;
        } else if (IiiiiiiiIIIII == 2011L) {
            IiiiiiiiIIIII2 = 1;
        } else if (IiiiiiiiIIIII == 2012L) {
            IiiiiiiiIIIII2 = 99;
        }
        HandleGood.ALLATORIxDEMO(good, IiiiiiiiIIIII2, roleData);
    }

    public static void IIIIIiiiiIIii(Goodstable goodstable, RoleData roleData) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < roleData.goodChoses.length) {
            if (roleData.goodChoses[IiiiiiiiIIIII] != null) {
                roleData.getGameView().iIiIiiiiIIiii("\u8bf7\u8131\u4e0b\u88c5\u5907");
                return;
            }
            ++IiiiiiiiIIIII;
        }
        LoginResult loginResult = IiiiiiiiIIIII = roleData.getLoginResult();
        LoginResult loginResult2 = IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((int)loginResult2.getGrade());
        loginResult.setBone(Integer.valueOf(IiiiiiiiIIIII2));
        loginResult2.setSpir(Integer.valueOf(IiiiiiiiIIIII2));
        loginResult.setPower(Integer.valueOf(IiiiiiiiIIIII2));
        loginResult2.setSpeed(Integer.valueOf(IiiiiiiiIIIII2));
        if (loginResult.getTurnAround() >= 4) {
            IiiiiiiiIIIII.setCalm(Integer.valueOf(IiiiiiiiIIIII2));
        }
        IiiiiiiiIIIII.setHp(new BigDecimal(roleData.getRoleProperty().getHp()));
        IiiiiiiiIIIII.setMp(new BigDecimal(roleData.getRoleProperty().getMp()));
        roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7684\u4f7f\u7528\u4e86" + goodstable.getGoodsname());
        goodstable.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)goodstable, (int)1, (GameClient)roleData.getGameView().getClient());
        roleData.getRoleProperty().IIIiiiiiiIIiI();
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"rolechange", (String)("D" + IiiiiiiiIIIII.getBone() + "=" + IiiiiiiiIIIII.getSpir() + "=" + IiiiiiiiIIIII.getPower() + "=" + IiiiiiiiIIIII.getSpeed() + "=" + IiiiiiiiIIIII.getCalm()));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public static void ALLATORIxDEMO(Goodstable good, boolean isShiftDown, RoleData roleData) throws Exception {
        long IiiiiiiiIIIII = good.getType();
        if (isShiftDown && (roleData.getGameView().getClient().ALLATORIxDEMO(2, 12) || IiiiiiiiIIIII == 132L) && (IiiiiiiiIIIII == 88L || IiiiiiiiIIIII == 112L || IiiiiiiiIIIII == 118L || IiiiiiiiIIIII == 151L || IiiiiiiiIIIII == 2041L || IiiiiiiiIIIII == 132L || GoodType.iiiIiiiiiIiii((long)IiiiiiiiIIIII) || GoodType.IIiiiiiiIIiiI((long)IiiiiiiiIIIII))) {
            iIiIiiiiiiiIi IiiiiiiiIIIII2 = (iIiIiiiiiiiIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(162);
            IiiiiiiiIIIII2.ALLATORIxDEMO(0, null, good);
            return;
        }
        int IiiiiiiiIIIII3 = GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII);
        if (IiiiiiiiIIIII3 != -1) {
            HandleEquip.ALLATORIxDEMO((RoleData)roleData, (int)IiiiiiiiIIIII3, (Goodstable)good);
        } else if (IiiiiiiiIIIII == 0L) {
            int IiiiiiiiIIIII4 = good.getUsetime();
            HandleGood.iiiIiiiiiiIIi(good, roleData);
            if (IiiiiiiiIIIII4 != good.getUsetime()) {
                ParamTool.ALLATORIxDEMO((Goodstable)good, (int)1, (GameClient)roleData.getGameView().getClient());
                String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"rolechange", (String)("H" + roleData.getLoginResult().getHp() + "=" + roleData.getLoginResult().getMp()));
                roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
                roleData.getRoleProperty().IIIiiiiiiIIiI();
                roleData.getGameView().iIiIiiiiIIiii(false, "\u6218\u6597\u3001\u7ad9\u7acb\u3001\u884c\u8d70\u4f7f\u7528\u836f\u54c1.mp3");
            }
        } else if (IiiiiiiiIIIII == 60001L || IiiiiiiiIIIII == 60002L) {
            HandleGood.ALLATORIxDEMO(good, roleData);
        } else if (IiiiiiiiIIIII == 60005L && roleData.getGameView().getClient().ALLATORIxDEMO()) {
            HandleGood.IiiIiiiiiiIiI(good, roleData);
        } else if (IiiiiiiiIIIII == 2114L) {
            HandleGood.IIIIIiiiiIIii(good, roleData);
        } else if (IiiiiiiiIIIII == 2042L) {
            HandleGood.iiiiiiiiIIiii(good, roleData);
        } else if (GoodType.IIiIIiiiIiIIi((long)IiiiiiiiIIIII)) {
            HandleGood.IIIiiiiiiIIiI(good, roleData);
        } else if (IiiiiiiiIIIII == 188L) {
            HandleLingbao.ALLATORIxDEMO((Goodstable)good, (RoleData)roleData);
        } else if (IiiiiiiiIIIII == 1688L) {
            roleData.getGameView().ALLATORIxDEMO(new ConfirmBean(81, good.getRgid().toString(), "\u8bf7\u8f93\u5165\u4f60\u7684\u65b0\u540d\u79f0,\u4fee\u6539\u6210\u529f\u540e\u5c06\u6263\u9664\u4e00\u5f20\u6539\u540d\u5361"));
        } else if (IiiiiiiiIIIII == 300L) {
            roleData.getGameView().ALLATORIxDEMO(new ConfirmBean(82, good.getRgid().toString(), "\u8bf7\u8f93\u5165\u4f60\u8981\u60f3\u8981\u7684\u4fee\u6b63#r\u7f16\u53f7  \u7537\u4eba-1,\u5973\u4eba-2,\u7537\u9b54-3,\u5973\u9b54-4,\u7537\u4ed9-5,\u5973\u4ed9-6,\u7537\u9b3c-7,\u5973\u9b3c-8,\u7537\u9f99-9,\u5973\u9f99-10#r\u8f93\u5165\u683c\u5f0f\u5982:1-2-3\u5373\u4e00\u4e16\u7537\u4eba \u4e8c\u4e16\u5973\u4eba \u4e09\u4e16\u7537\u9b54"));
        } else if (IiiiiiiiIIIII == 121L) {
            roleData.getGameView().ALLATORIxDEMO(new ConfirmBean(84, good.getRgid().toString(), "\u8f93\u5165\u73a9\u5bb6\u7684\u89d2\u8272ID\u89e3\u9664\u5bf9\u5e94\u7684\u88ab\u7981\u8a00\u73a9\u5bb6#r\u4e0d\u77e5\u9053ID\u5728\u5ba2\u6237\u7aef\u5de6\u4e0a\u89d2\u67e5\u770b"));
        } else if (IiiiiiiiIIIII == 122L) {
            roleData.getGameView().ALLATORIxDEMO(new ConfirmBean(85, good.getRgid().toString(), "\u8f93\u5165\u73a9\u5bb6\u7684\u8d26\u53f7\u89e3\u9664\u5bf9\u5e94\u7684\u88ab\u5c01\u53f7\u73a9\u5bb6"));
        } else if (IiiiiiiiIIIII == 213L) {
            HandleGood.iIiIiiiiIIiIi(good, roleData);
        } else if (IiiiiiiiIIIII == 132L) {
            iIIiiiiiIIIIi IiiiiiiiIIIII6 = (iIIiiiiiIIIIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII6.ALLATORIxDEMO(good, 1);
        } else if (IiiiiiiiIIIII >= 50L && IiiiiiiiIIIII <= 61L || IiiiiiiiIIIII == 133L || IiiiiiiiIIIII == 134L || IiiiiiiiIIIII == 139L) {
            HandleBabyAndPal.ALLATORIxDEMO((Goodstable)good, (boolean)isShiftDown, (RoleData)roleData);
        } else if (IiiiiiiiIIIII == 1003L) {
            HandleGood.iIiIiiiiIIiii(good, roleData);
        } else if (IiiiiiiiIIIII == 729L) {
            HandlePet.ALLATORIxDEMO((Goodstable)good, (RoleData)roleData);
        } else {
            if (IiiiiiiiIIIII == 889L) {
                String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"getfivemsg", (String)"G");
                roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII7);
                return;
            }
            if (IiiiiiiiIIIII == 559L) {
                iiiiiiiiiIiII IiiiiiiiIIIII8 = (iiiiiiiiiIiII)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(118);
                IiiiiiiiIIIII8.ALLATORIxDEMO(good);
                return;
            }
            if (IiiiiiiiIIIII == 560L) {
                int IiiiiiiiIIIII9 = good.getValue().indexOf("=");
                if (IiiiiiiiIIIII9 == -1) {
                    return;
                }
                int IiiiiiiiIIIII10 = Integer.parseInt(good.getValue().substring(IiiiiiiiIIIII9 + 1));
                if (IiiiiiiiIIIII10 <= 100) {
                    String IiiiiiiiIIIII11 = Agreement.getSendTextAES((String)"getfivemsg", (String)("DD" + IiiiiiiiIIIII10));
                    roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII11);
                    return;
                }
                if (IiiiiiiiIIIII10 <= 1000) {
                    String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"getfivemsg", (String)("RR" + IiiiiiiiIIIII10));
                    roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII12);
                    return;
                }
                if (IiiiiiiiIIIII10 <= 2000) return;
                String IiiiiiiiIIIII13 = Agreement.getSendTextAES((String)"getfivemsg", (String)("VV" + IiiiiiiiIIIII10));
                roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII13);
                return;
            }
            if (IiiiiiiiIIIII == 60003L) {
                IIIiIiiiIiIii IiiiiiiiIIIII14 = (IIIiIiiiIiIii)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(87);
                IiiiiiiiIIIII14.iIiIiiiiIIiii(Integer.parseInt(good.getValue()));
                roleData.getGameView().getFormManagement().iIiIiiiiIIiIi(87);
                return;
            }
            if (IiiiiiiiIIIII != 506L) {
                if (IiiiiiiiIIIII == 190L || IiiiiiiiIIIII == 891L || IiiiiiiiIIIII == 1002L) {
                    HandleLingbao.ALLATORIxDEMO((Goodstable)good, (boolean)isShiftDown, (RoleData)roleData);
                } else if (IiiiiiiiIIIII == 520L) {
                    roleData.getGameView().ALLATORIxDEMO(new ConfirmBean(2, good.getRgid().toString(), "\u771f\u7684\u8981\u653e\u5165\u5730\u715e\u661f\u5f55\u5417?"));
                } else if (GoodType.IIIIIiiiiiiIi((long)IiiiiiiiIIIII)) {
                    HandleBabyAndPal.ALLATORIxDEMO((Goodstable)good, (RoleData)roleData);
                } else if (IiiiiiiiIIIII == 717L && roleData.getChoseMount() != null) {
                    HandleMount.ALLATORIxDEMO((Goodstable)good, (RoleData)roleData);
                } else if (IiiiiiiiIIIII == 721L && roleData.getChoseMount() == null && roleData.getGameView().getClient().gameMount) {
                    iIIiiiiiIIIIi IiiiiiiiIIIII15 = (iIIiiiiiIIIIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(27);
                    IiiiiiiiIIIII15.ALLATORIxDEMO(good);
                } else if (IiiiiiiiIIIII == 718L || IiiiiiiiIIIII == 719L || IiiiiiiiIIIII == 720L || IiiiiiiiIIIII == 721L || IiiiiiiiIIIII == 724L || IiiiiiiiIIIII == 801L || IiiiiiiiIIIII == 802L || IiiiiiiiIIIII == 103L) {
                    HandleMount.ALLATORIxDEMO((Goodstable)good, (RoleData)roleData);
                } else {
                    if (IiiiiiiiIIIII == 136L || IiiiiiiiIIIII == 137L || IiiiiiiiIIIII == 138L) {
                        if (!roleData.getGameView().getClient().gameBaby) {
                            return;
                        }
                        if (IiiiiiiiIIIII == 137L) {
                            roleData.getGameView().getFormManagement().iIiIiiiiIIiIi(165);
                            return;
                        }
                        IIiIiiiiIiIII IiiiiiiiIIIII16 = (IIiIiiiiIiIII)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(166);
                        IiiiiiiiIIIII16.iiiIiiiiiiIIi(IiiiiiiiIIIII == 136L ? 1 : 0);
                        return;
                    }
                    HandleGood.IIiiIiiiiIiII(good, roleData);
                }
            }
        }
        if (good.getUsetime() > 0) return;
        roleData.iIiIiiiiIIiii(good.getRgid());
    }

    public static boolean ALLATORIxDEMO(RoleData roleData) {
        if (roleData.getTaskSystem().ALLATORIxDEMO()) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f20\u9001\u9650\u5236");
            return false;
        }
        if (roleData.getGameView().mapScene.ALLATORIxDEMO().getMapFlag() == 1) {
            if (roleData.getGameView().roleUnit.iIiIiiiiIIiIi()) return true;
        }
        roleData.getGameView().iIiIiiiiIIiii("\u98de\u884c\u68cb\u4f7f\u7528\u9650\u5236");
        return false;
    }

    public static boolean ALLATORIxDEMO(int[] yao, double hp_z, double hp_d, double mp_z, double mp_d, RoleData roleData) {
        if (hp_z == hp_d && mp_z == mp_d) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u5df2\u7ecf\u5f88\u5065\u5eb7\u4e86");
            return false;
        }
        boolean IiiiiiiiIIIII = false;
        if ((yao[0] != 0 || yao[2] != 0) && hp_z > hp_d) {
            IiiiiiiiIIIII = true;
        } else if (hp_z <= hp_d && (yao[0] != 0 || yao[2] != 0)) {
            roleData.getGameView().iIiIiiiiIIiii("\u751f\u547d\u503c\u5df2\u6ee1");
        }
        if ((yao[1] != 0 || yao[3] != 0) && mp_z > mp_d) {
            IiiiiiiiIIIII = true;
            return IiiiiiiiIIIII;
        }
        if (!(mp_z <= mp_d)) return IiiiiiiiIIIII;
        if (yao[1] == 0) {
            if (yao[3] == 0) return IiiiiiiiIIIII;
        }
        roleData.getGameView().iIiIiiiiIIiii("\u9b54\u6cd5\u503c\u5df2\u6ee1");
        return IiiiiiiiIIIII;
    }

    public static boolean ALLATORIxDEMO(int[] yao, RoleData roleData) {
        double IiiiiiiiIIIII = roleData.getRoleProperty().getHp();
        double IiiiiiiiIIIII2 = roleData.getLoginResult().getHp().intValue();
        double IiiiiiiiIIIII3 = roleData.getRoleProperty().getMp();
        double IiiiiiiiIIIII4 = roleData.getLoginResult().getMp().intValue();
        if (IiiiiiiiIIIII2 == 0.0) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII;
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
        }
        if (!HandleGood.ALLATORIxDEMO(yao, IiiiiiiiIIIII, IiiiiiiiIIIII2, IiiiiiiiIIIII3, IiiiiiiiIIIII4, roleData)) {
            return false;
        }
        if (yao[0] != 0 || yao[2] != 0) {
            if ((IiiiiiiiIIIII2 = IiiiiiiiIIIII2 + (double)yao[0] + (double)yao[2] * IiiiiiiiIIIII / 100.0) > IiiiiiiiIIIII) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII;
            }
            roleData.getLoginResult().setHp(new BigDecimal((int)IiiiiiiiIIIII2));
        }
        if (yao[1] == 0) {
            if (yao[3] == 0) return true;
        }
        if ((IiiiiiiiIIIII4 = IiiiiiiiIIIII4 + (double)yao[1] + (double)yao[3] * IiiiiiiiIIIII3 / 100.0) > IiiiiiiiIIIII3) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
        }
        roleData.getLoginResult().setMp(new BigDecimal((int)IiiiiiiiIIIII4));
        return true;
    }

    public static void iiiiiiiiIIiii(Goodstable good, RoleData roleData) {
        long[] IiiiiiiiIIIII = IiiiIiiiiIIII.ALLATORIxDEMO((String)good.getValue());
        if (IiiiiiiiIIIII[4] == 0L) return;
        if (!HandleGood.ALLATORIxDEMO(IiiiiiiiIIIII[4], roleData)) return;
        good.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)1, (GameClient)roleData.getGameView().getClient());
        ParamTool.ALLATORIxDEMO((PrivateData)roleData.getPrivateData(), (GameClient)roleData.getGameView().getClient());
        iiiiiiiiiiIiI IiiiiiiiIIIII2 = (iiiiiiiiiiIiI)roleData.getGameView().getFormManagement().iIiIiiiiIIiii(82);
        if (IiiiiiiiIIIII2 == null) return;
        IiiiiiiiIIIII2.iiiIiiiiiiIIi(0);
    }

    public static void IiiIiiiiiiIiI(Goodstable good, RoleData roleData) {
        String IiiiiiiiIIIII;
        Goodstable IiiiiiiiIIIII2 = roleData.getObjectArea().ALLATORIxDEMO(good.getGoodsid());
        String string = IiiiiiiiIIIII = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getValue() : null;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            roleData.getGameView().iIiIiiiiIIiii("\u6570\u636e\u5f02\u5e38");
            return;
        }
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII.length()) {
            int IiiiiiiiIIIII8;
            String IiiiiiiiIIIII9;
            IiiiiiiiIIIII7 = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII5 + 1);
            if (IiiiiiiiIIIII7 == -1) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII.length();
            }
            if ((IiiiiiiiIIIII6 = IiiiiiiiIIIII.indexOf("@", IiiiiiiiIIIII5 + 1)) == -1 || IiiiiiiiIIIII6 > IiiiiiiiIIIII7) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII7;
            }
            String IiiiiiiiIIIII10 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII6);
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
            if ((IiiiiiiiIIIII6 = IiiiiiiiIIIII.indexOf("@", IiiiiiiiIIIII5 + 1)) == -1 || IiiiiiiiIIIII6 > IiiiiiiiIIIII7) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII7;
            }
            if ((IiiiiiiiIIIII6 = (IiiiiiiiIIIII9 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII6)).indexOf("=")) == -1) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII9.length();
            }
            int IiiiiiiiIIIII11 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII9, (int)0, (int)IiiiiiiiIIIII6);
            int n = IiiiiiiiIIIII8 = IiiiiiiiIIIII6 < IiiiiiiiIIIII9.length() ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII9, (int)(IiiiiiiiIIIII6 + 1), (int)IiiiiiiiIIIII9.length()) : 1;
            if (IiiiiiiiIIIII10.equals("\u7269\u54c1")) {
                IiiiiiiiIIIII2 = roleData.getObjectArea().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII11));
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null && GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII2.getType()) ? ++IiiiiiiiIIIII3 : (IiiiiiiiIIIII3 += IiiiiiiiIIIII8);
            } else if (IiiiiiiiIIIII10.equals("\u53ec\u5524\u517d")) {
                IiiiiiiiIIIII4 += IiiiiiiiIIIII8;
            }
            IiiiiiiiIIIII5 = IiiiiiiiIIIII7 + 1;
        }
        if (IiiiiiiiIIIII3 > 0 && roleData.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII3) < IiiiiiiiIIIII3) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        if (IiiiiiiiIIIII4 > 0 && roleData.pets.size() + IiiiiiiiIIIII4 > 21) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7684\u53ec\u5524\u517d\u680f\u4e0d\u591f");
            return;
        }
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"user", (String)good.getRgid().toString());
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    public static void iIiIiiiiIIiIi(Goodstable good, RoleData roleData) {
        PKSys IiiiiiiiIIIII = roleData.getPkSys();
        if (IiiiiiiiIIIII.getPk1() > 0) {
            IiiiiiiiIIIII.ALLATORIxDEMO();
        } else {
            roleData.getGameView().iiiIiiiiiiIIi("\u4f60\u8eab\u4e0a\u6ca1\u6709PK\u70b9,\u5c31\u4e0d\u8981\u778e\u6363\u4e71,\u7279\u8d66\u4ee4\u5c31\u4e0d\u8fd8\u7ed9\u4f60\u4e86");
        }
        good.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)1, (GameClient)roleData.getGameView().getClient());
    }

    /*
     * Unable to fully structure code
     */
    public static void ALLATORIxDEMO(Goodstable good, int num, RoleData roleData) {
        block11: {
            block10: {
                block9: {
                    if (!HandleGood.ALLATORIxDEMO(roleData)) {
                        return;
                    }
                    IiiiiiiiIIIII = roleData.getGameView().roleUnit;
                    IiiiiiiiIIIII = roleData.getGameView().mapScene.ALLATORIxDEMO();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.iIiIiiiiIiIii.getMapid() + "," + IiiiiiiiIIIII.getMapName() + "," + IiiiiiiiIIIII.iiIiIiiiiIIIi + "," + IiiiiiiiIIIII.IIiiiiiiiIIIi;
                    if (num != -999) break block9;
                    IiiiiiiiIIIII = new StringBuffer();
                    IiiiiiiiIIIII = good.getValue().split("\\|");
                    if (IiiiiiiiIIIII.length >= 6) {
                        roleData.getGameView().iIiIiiiiIIiii("\u8bb0\u5f55\u70b9\u5df2\u7ecf\u6ee1\u4e86");
                        return;
                    }
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl30
                }
                if (num > 0) break block10;
                num = Math.abs(num);
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII = good.getValue().split("\\|");
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl57
            }
            good.setValue("\u4f20\u9001=" + IiiiiiiiIIIII + "|\u53ef\u7528\u6b21\u6570=" + num);
            break block11;
            do {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl30:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length - 1);
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append("\u4f20\u9001=");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII.length - 1]);
            good.setValue(IiiiiiiiIIIII.toString());
            break block11;
            do {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                if (IiiiiiiiIIIII == num) {
                    IiiiiiiiIIIII.append("\u4f20\u9001=");
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                } else {
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                }
                ++IiiiiiiiIIIII;
lbl57:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            good.setValue(IiiiiiiiIIIII.toString());
        }
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)2, (GameClient)roleData.getGameView().getClient());
        roleData.getGameView().iIiIiiiiIIiii("\u8bb0\u5f55\u70b9\u751f\u6548");
    }

    public static void iiiIiiiiiiIIi(Goodstable good, RoleData roleData) {
        if (!HandleGood.ALLATORIxDEMO(GoodType.ALLATORIxDEMO((String)good.getValue()), roleData)) {
            return;
        }
        good.ALLATORIxDEMO(1);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean ALLATORIxDEMO(long addsld, RoleData roleData) {
        IiiiiiiiIIIII = roleData.getPrivateData();
        IiiiiiiiIIIII = IiiiIiiiiIIII.IiiIiiiiiiIiI((int)roleData.getLoginResult().getGrade());
        IiiiiiiiIIIII = IiiiiiiiIIIII.getSkill("S");
        if (IiiiiiiiIIIII == null) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u8fd8\u672a\u5b66\u4e60\u6280\u80fd");
            return false;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block5: {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("_");
                IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[1]);
                if ((double)IiiiiiiiIIIII <= IiiiiiiiIIIII || (IiiiiiiiIIIII = roleData.getObjectArea().iIiIiiiiIIiii(IiiiiiiiIIIII[0])) == null) break block5;
                if ((double)IiiiiiiiIIIII < IiiiiiiiIIIII + (double)addsld) {
                    addsld = (int)((double)IiiiiiiiIIIII - IiiiiiiiIIIII);
                }
                roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7684" + IiiiiiiiIIIII.getSkillname() + "\u83b7\u5f97" + addsld + "\u719f\u7ec3\u5ea6");
                IiiiiiiiIIIII[IiiiiiiiIIIII] = String.valueOf(IiiiiiiiIIIII[1]) + "_" + (int)(IiiiiiiiIIIII += (double)addsld);
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl30
            }
            ++IiiiiiiiIIIII;
        }
        roleData.getGameView().iIiIiiiiIIiii("\u6280\u80fd\u719f\u7ec3\u5ea6\u5df2\u6ee1!");
        return false;
        do {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("#");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl30:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        IiiiiiiiIIIII.setSkills("S", IiiiiiiiIIIII.toString());
        return true;
    }

    public static void iIiIiiiiIIiii(Goodstable goodstable, RoleData roleData) {
        String IiiiiiiiIIIII;
        Task IiiiiiiiIIIII2 = null;
        int[] IiiiiiiiIIIII3 = HandleGood.ALLATORIxDEMO(goodstable.getValue());
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            IiiiiiiiIIIII2 = roleData.getTaskSystem().getTaskId(IiiiiiiiIIIII3[IiiiiiiiIIIII4]);
            if (IiiiiiiiIIIII2 != null) {
                String string = Agreement.getSendTextAES((String)"taskN", (String)("E" + IiiiiiiiIIIII2.getTaskId()));
                roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
                goodstable.ALLATORIxDEMO(1);
                ParamTool.ALLATORIxDEMO((Goodstable)goodstable, (int)1, (GameClient)roleData.getGameView().getClient());
                break;
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII2 != null) return;
        IiiiiiiiIIIII4 = HandleGood.ALLATORIxDEMO(goodstable.getValue());
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("L" + IiiiiiiiIIIII4));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public static int ALLATORIxDEMO(String value) {
        String[] IiiiiiiiIIIII = value.split("=")[1].split("\\|");
        int IiiiiiiiIIIII2 = (int)(Math.random() * 100.0 + 1.0);
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII6 = IiiiiiiiIIIII[IiiiiiiiIIIII5].split("\\&")[0];
            String IiiiiiiiIIIII7 = IiiiiiiiIIIII[IiiiiiiiIIIII5].split("\\&")[1];
            if (IiiiiiiiIIIII2 > IiiiiiiiIIIII4 && IiiiiiiiIIIII2 <= IiiiiiiiIIIII4 + Integer.parseInt(IiiiiiiiIIIII7)) {
                IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII6);
            }
            ++IiiiiiiiIIIII5;
            IiiiiiiiIIIII4 += Integer.parseInt(IiiiiiiiIIIII7);
        }
        return IiiiiiiiIIIII3;
    }

    public static void ALLATORIxDEMO(Goodstable goodstable, RoleData roleData) {
        LoginResult IiiiiiiiIIIII = roleData.getLoginResult();
        int IiiiiiiiIIIII2 = 0;
        String[] IiiiiiiiIIIII3 = goodstable.getValue().split("\\|");
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3[IiiiiiiiIIIII4].split("=");
            if (IiiiiiiiIIIII5[0].equals("\u7b49\u7ea7\u8981\u6c42")) {
                if (!IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade(), (String)IiiiiiiiIIIII5[1])) {
                    roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7b49\u7ea7\u592a\u4f4e");
                    return;
                }
            } else if (IiiiiiiiIIIII5[0].equals("\u7269\u54c1")) {
                String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII5[1].split("\\&");
                int IiiiiiiiIIIII7 = 0;
                while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
                    String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII6[IiiiiiiiIIIII7].split("\\$");
                    Goodstable IiiiiiiiIIIII9 = roleData.getObjectArea().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII8[0]));
                    if (IiiiiiiiIIIII9 != null) {
                        IiiiiiiiIIIII2 += !GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII9.getType()) ? Integer.parseInt(IiiiiiiiIIIII8[1]) : 1;
                    }
                    ++IiiiiiiiIIIII7;
                }
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII2 == 0) {
            return;
        }
        if (roleData.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII2) < IiiiiiiiIIIII2) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        goodstable.ALLATORIxDEMO(1);
        if (goodstable.getUsetime() <= 0) {
            roleData.iIiIiiiiIIiii(goodstable.getRgid());
        }
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"user", (String)goodstable.getRgid().toString());
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII22);
    }
}
