package com.xy.socket;

import com.xy.aT;
import com.xy.bX;
import com.xy.bk;
import com.xy.bq;
import com.xy.ck;
import com.xy.cn;
import com.xy.dG;
import com.xy.dl;
import com.xy.du;
import com.xy.eE;
import com.xy.fS;
import com.xy.fc;
import com.xy.fd;
import com.xy.gJ;
import com.xy.gV;
import com.xy.gY;
import com.xy.gZ;
import com.xy.gx;
import com.xy.hK;
import com.xy.hd;
import com.xy.iX;
import com.xy.ib;
import com.xy.jl;
import com.xy.k;
import com.xy.kM;
import com.xy.kk;
import com.xy.lV;
import com.xy.lc;
import com.xy.lo;
import com.xy.mi;
import com.xy.s;
import com.xy.u;
import com.xy.bean.BackRoleInfo;
import com.xy.bean.ConfirmBean;
import com.xy.bean.FMBean;
import com.xy.bean.GoodsResultArrBean;
import com.xy.bean.PrivateData;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.entity.RoleTable;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParamTool {
   public static final Map<String, ServerAction> ACTION_MAP = new HashMap();
   public static GoodsResultArrBean goodarr;

   public static void a(List<Goodstable> var0, int var1, GameClient var2) {
      synchronized(goodarr) {
         goodarr.setI(var1);
         goodarr.setList(var0);
         String var5 = Agreement.getSendTextAES("packchange", mi.b().toJson(goodarr));
         var2.d(var5);
      }
   }

   public static void b(Baby var0, GameClient var1) {
      if (var0 != null) {
         String var2 = Agreement.getSendTextAES("updababy", mi.b().toJson(var0));
         var1.d(var2);
      }
   }

   public static boolean c(long var0, GameView var2) {
      if (var0 <= 0L) {
         return (boolean)(3 & 4);
      } else {
         long var3 = var2.roleData.getLoginResult().getGold().longValue() - var0;
         if (var0 > 0L && var3 >= 0L) {
            int var10000 = --1;
            var2.roleData.getLoginResult().setGold(new BigDecimal(var3));
            d(String.valueOf(var0), var2);
            var2.f("扣除了" + var0 + "两!");
            return (boolean)var10000;
         } else {
            var2.fw("银两不足");
            return (boolean)(3 >> 2);
         }
      }
   }

   public static void d(String var0, GameView var1) {
      String var2 = Agreement.getSendTextAES("deductiontael", var0);
      var1.getClient().d(var2);
   }

   public static void e() {
      eE var0 = null;
      ACTION_MAP.put("enterGame", new ck());
      ACTION_MAP.put("move", new fS());
      ACTION_MAP.put("addgood", new lV());
      var0 = new eE();
      ACTION_MAP.put("chat", var0);
      ACTION_MAP.put("prompt", var0);
      k var1 = new k();
      ACTION_MAP.put("monsterrefresh", var1);
      ACTION_MAP.put("scene", var1);
      ACTION_MAP.put("gangstate", var1);
      ACTION_MAP.put("bangtz", var1);
      ACTION_MAP.put("clickmonsters", var1);
      ACTION_MAP.put("changerolename", var1);
      ACTION_MAP.put("userretreat", var1);
      ACTION_MAP.put("intogame", var1);
      ACTION_MAP.put("rolelevelup", var1);
      ACTION_MAP.put("upRoleShow", var1);
      ACTION_MAP.put("mapScene", var1);
      ib var2 = new ib();
      ACTION_MAP.put("stallstate", var2);
      kk var3 = new kk();
      ACTION_MAP.put("team1", var3);
      ACTION_MAP.put("team2", var3);
      ACTION_MAP.put("team3", var3);
      ACTION_MAP.put("team4", var3);
      ACTION_MAP.put("team6", var3);
      ACTION_MAP.put("enlist", var3);
      bq var4 = new bq();
      ACTION_MAP.put("fig1", var4);
      ACTION_MAP.put("fig5", var4);
      ACTION_MAP.put("fig4", var4);
      ACTION_MAP.put("fig6", var4);
      ACTION_MAP.put("fig8", var4);
      ACTION_MAP.put("fig7", var4);
      ACTION_MAP.put("battleconnection", var4);
      ACTION_MAP.put(Agreement.fightCard, var4);
      ACTION_MAP.put(Agreement.fightAuto, var4);
      ACTION_MAP.put(Agreement.fightVideo, var4);
      ACTION_MAP.put("fig3", var4);
      aT var5 = new aT();
      ACTION_MAP.put("friend", var5);
      ACTION_MAP.put("friendchat", var5);
      ACTION_MAP.put("searcahChatRoleName", var5);
      ACTION_MAP.put("searcahChatRoleId", var5);
      ACTION_MAP.put("searchChatRecorde", var5);
      cn var6 = new cn();
      ACTION_MAP.put("titlelist", var6);
      ACTION_MAP.put("titlechange", var6);
      dl var7 = new dl();
      ACTION_MAP.put("npcdialog", var7);
      ACTION_MAP.put("npc", var7);
      ACTION_MAP.put("baby", new fc());
      ACTION_MAP.put("richm", new bX());
      ACTION_MAP.put("DUELBOARD", new lc());
      ACTION_MAP.put("extrattroper", new hK());
      ACTION_MAP.put("asset", new lo());
      ACTION_MAP.put("taskN", new gZ());
      ACTION_MAP.put("getfivemsg", new du());
      jl var8 = new jl();
      ACTION_MAP.put("chongjipackget", var8);
      ACTION_MAP.put("teamArena", var8);
      ACTION_MAP.put("petArena", var8);
      ACTION_MAP.put("Paydaygradepay", var8);
      ACTION_MAP.put("Dayforweekgradeget", var8);
      ACTION_MAP.put("Dayforoneget", var8);
      ACTION_MAP.put("pankinglist", var8);
      ACTION_MAP.put("racialtransformation", var8);
      ACTION_MAP.put("tip", var8);
      ACTION_MAP.put("bookofchalg", var8);
      ACTION_MAP.put("exchange", var8);
      ACTION_MAP.put("intogang", var8);
      ACTION_MAP.put("stall", var8);
      ACTION_MAP.put("Getvipgradepack", var8);
      ACTION_MAP.put("applypay", var8);
      ACTION_MAP.put("middle", var8);
      ACTION_MAP.put("1", var8);
      ACTION_MAP.put("rolechange", var8);
      ACTION_MAP.put("gangchange", var8);
      ACTION_MAP.put("vicon", var8);
      ACTION_MAP.put("BEAU", var8);
      fd var9 = new fd();
      ACTION_MAP.put("activity", var9);
      ACTION_MAP.put("activityS", var9);
      u var10 = new u();
      ACTION_MAP.put("ganglist", var10);
      gx var11 = new gx();
      ACTION_MAP.put("shop", var11);
      ACTION_MAP.put("shopGood", var11);
      ACTION_MAP.put("shopPrice", var11);
      kM var12 = new kM();
      ACTION_MAP.put("pawn", var12);
      ACTION_MAP.put("pawnpet", var12);
      ACTION_MAP.put("parcel", var12);
      gJ var13 = new gJ();
      ACTION_MAP.put("TransGood", var13);
      ACTION_MAP.put("TransState", var13);
      s var14 = new s();
      ACTION_MAP.put("obtainarticle", var14);
      ACTION_MAP.put("drawnitems", var14);
      ACTION_MAP.put("version", new iX());
   }

   public static void f(PrivateData var0, GameClient var1) {
      String var2 = Agreement.getSendTextAES("rolePrivate", mi.b().toJson(var0));
      var1.d(var2);
   }

   public static void g(Goodstable var0, int var1, GameClient var2) {
      Goodstable var10000 = var0;
      GameClient var5 = var2;
      Goodstable var7 = var10000;
      synchronized(goodarr) {
         if (var5.getAreaId() == 5 >> 2 && (var5.getIp().equals("43.138.128.224") || var5.getIp().equals("192.168.1.10")) && var5.getPortTcp() != (7771 & 32767)) {
         }

         goodarr.setI(var1);
         goodarr.getList().clear();
         goodarr.getList().add(var7);
         String var6 = Agreement.getSendTextAES("packchange", mi.b().toJson(goodarr));
         var5.d(var6);
      }
   }

   public static void h(RoleSummoning var0, GameClient var1) {
      if (var0 != null) {
         String var2 = Agreement.getSendTextAES("petchange", mi.b().toJson(var0));
         var1.d(var2);
      }
   }

   public static void i(Lingbao var0, GameClient var1) {
      if (var0 != null) {
         String var2 = Agreement.getSendTextAES("updateling", mi.b().toJson(var0));
         var1.d(var2);
      }
   }

   public static void j(String var0, GameClient var1) {
      String var2 = var0.substring(5 >> 3, --4);
      String var4 = null;
      ServerAction var3;
      if ((var3 = (ServerAction)ACTION_MAP.get(var2)) != null) {
         if (!var2.equals("move") && !var2.equals("fig4") && !var2.equals("fig7") && !var2.equals("fig1") && !var2.equals(Agreement.fightCard) && !var2.equals(Agreement.fightAuto)) {
            var0 = Agreement.getSendTextAES("Monitor", (3 ^ 3) + var0);
            var1.d(var0);
            bk.c();
         } else {
            var3.a(var2, var0.substring(70 & 63), var1);
         }
      } else {
         int var5 = (var0 = dG.e(var0)) != null ? var0.indexOf("//") : -1;
         if (var5 != -4 >> 2) {
            var2 = var0.substring(3 >> 2, var5);
            var4 = var0.substring(var5 + (1 ^ 3));
            if ((var3 = (ServerAction)ACTION_MAP.get(var2)) != null) {
               var3.a(var2, var4, var1);
            } else {
               label96: {
                  switch(var2.hashCode()) {
                  case -1824989755:
                     while(false) {
                     }

                     if (!var2.equals("serverstop")) {
                        return;
                     }
                     break label96;
                  case -1627192208:
                     if (!var2.equals("inlinelogin")) {
                        return;
                     }
                     break label96;
                  case -283378388:
                     if (!var2.equals("unmarry")) {
                        return;
                     }
                     break;
                  case 3271:
                     if (!var2.equals("fm")) {
                        return;
                     }

                     FMBean var9 = (FMBean)mi.b().fromJson(var4, FMBean.class);
                     ((gY)var1.gameView.getFormManagement().e(118 & 123)).ark(--1, var9);
                  default:
                     return;
                  case 2572211:
                     if (!var2.equals("TG00")) {
                        return;
                     }

                     BackRoleInfo var8 = (BackRoleInfo)mi.b().fromJson(var4, BackRoleInfo.class);
                     ((gV)var1.gameView.getFormManagement().e(127 & 103)).aqh((RoleTable)null, var8.getList());
                     return;
                  case 2572212:
                     if (!var2.equals("TG01")) {
                        return;
                     }

                     RoleTable var7 = !hd.o(var4) ? (RoleTable)mi.b().fromJson(var4, RoleTable.class) : null;
                     ((gV)var1.gameView.getFormManagement().e(103 & 127)).aqh(var7, (List)null);
                     return;
                  case 41231968:
                     if (!var2.equals("makelove")) {
                        return;
                     }
                     break;
                  case 103666725:
                     if (!var2.equals("marry")) {
                        return;
                     }
                     break;
                  case 951117504:
                     if (!var2.equals("confirm")) {
                        return;
                     }

                     ConfirmBean var6 = (ConfirmBean)mi.b().fromJson(var4, ConfirmBean.class);
                     var1.gameView.aal(var6);
                     return;
                  }

                  ((ServerAction)ACTION_MAP.get("marry")).a(var2, var4, var1);
                  return;
               }

               var1.c();
               if (var1.gameView != null) {
                  var1.gameView.aal(new ConfirmBean(123 & 31, (String)null, var2.equals("serverstop") ? "服务器重新启动,连接中断" : (hd.o(var4) ? "你已被顶号" : var4)));
               }

            }
         }
      }
   }

   public static void k(String var0, GameClient var1) {
      if (var1.gameView != null && var1.gameView.isDraw) {
         System.out.println(var1.gameView.roleData.getRoleId() + "收到的消息:" + var0);
      } else {
         System.out.println("收到的消息:" + var0);
      }
   }

   static {
      e();
      goodarr = new GoodsResultArrBean();
   }
}
