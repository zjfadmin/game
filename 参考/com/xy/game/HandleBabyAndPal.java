package com.xy.game;

import com.xy.W;
import com.xy.ca;
import com.xy.fC;
import com.xy.mw;
import com.xy.bean.ConfirmBean;
import com.xy.entity.Baby;
import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HandleBabyAndPal {
   public static void a(Baby var0, Goodstable var1, RoleData var2) {
      if (var0.getBabyage() < (8047 & 25080)) {
         var2.getGameView().fw("孩子太小不能使用");
      } else if (var0.getBabyage() >= (15728 & 23519)) {
         var2.getGameView().fw("回不去了#15");
      } else {
         String[] var10000 = var1.getValue().split("-");
         int var4 = Integer.parseInt(var10000[3 >> 2]);
         int var3 = Integer.parseInt(var10000[3 >> 1]) - var4 + (3 >> 1);
         var4 += W.c.nextInt(var3);
         int[] var11 = new int[89 & 47];
         boolean var10002 = true;
         int[] var9 = var11;
         int var13 = 47 & 88;
         int var10004 = 55 & 79;
         int var10006 = 86 & 47;
         int var10008 = --5;
         int var10010 = --4;
         int var10012 = --3;
         int var10014 = 5 >> 1;
         int var10016 = --1;
         var9[3 >> 2] = var0.getQizhi();
         var9[var10016] = var0.getNeili();
         var9[var10014] = var0.getZhili();
         var9[var10012] = var0.getNaili();
         var9[var10010] = var0.getMingqi();
         var9[var10008] = var0.getDaode();
         var9[var10006] = var0.getPanni();
         var9[var10004] = var0.getWanxing();
         var9[var13] = var0.getXiaoxin();
         int var5 = var4 / --5;
         int var12 = var4;

         Baby var14;
         while(true) {
            if (var12 <= 0) {
               var14 = var0;
               break;
            }

            int var6 = 0;

            int var7;
            for(var12 = var7 = 2 & 5; var12 < var9.length; var12 = var7) {
               if (var9[var7] <= 0) {
                  ++var6;
               }

               ++var7;
            }

            if (var6 >= (91 & 45)) {
               var14 = var0;
               break;
            }

            var7 = var5;
            if (var5 > var4) {
               var7 = var4;
            }

            int var8 = W.c.nextInt(25 & 111);

            for(var11 = var9; var11[var8] == 0; var11 = var9) {
               var8 = W.c.nextInt(91 & 45);
            }

            if (var7 > var9[var8]) {
               var7 = var9[var8];
            }

            var9[var8] -= var7;
            var12 = var4 -= var7;
         }

         var14.setQizhi(var9[5 >> 3]);
         int var10009 = 57 & 78;
         int var10011 = 127 & 7;
         int var10015 = 110 & 23;
         int var10018 = --5;
         int var10020 = --4;
         int var10024 = --3;
         int var10027 = 1 ^ 3;
         var0.setNeili(var9[5 >> 2]);
         var0.setZhili(var9[var10027]);
         var0.setNaili(var9[var10024]);
         var0.setMingqi(var9[var10020]);
         var0.setDaode(var9[var10018]);
         var0.setPanni(var9[var10015]);
         var0.setWanxing(var9[var10011]);
         var0.setXiaoxin(var9[var10009]);
         var0.setBabyage(var0.getBabyage() - (17274 & 15853));
         var1.ab(3 & 5);
         ParamTool.g(var1, 3 & 5, var2.getGameView().getClient());
         ParamTool.b(var0, var2.getGameView().getClient());
         fC var10;
         if ((var10 = var2.getGameView().getFormManagement().m(--1)) != null) {
            ((ca)var10).ti(var0);
         }

         var2.getGameView().fw("孩子回到了一年前");
      }
   }

   public static void b(Baby var0, Goodstable var1, RoleData var2) {
      Baby var10000;
      int var3;
      if ((var3 = (int)(var1.getType() - 54L) / (1 ^ 3)) < 0) {
         var3 = 2 & 5;
         var10000 = var0;
      } else {
         if (var3 > --3) {
            var3 = --3;
         }

         var10000 = var0;
      }

      if (var10000.getChildSex() == 0 && var1.getType() % 2L != 0L) {
         var2.getGameView().fw("这是女孩子用的");
      } else if (var0.getChildSex() == (2 ^ 3) && var1.getType() % 2L == 0L) {
         var2.getGameView().fw("这是男孩子用的");
      } else {
         fC var4;
         if (HandleEquip.a(var2, var0, var1, var3) && (var4 = var2.getGameView().getFormManagement().m(2 ^ 3)) != null) {
            ((ca)var4).ti(var0);
         }

      }
   }

   public static void c(Goodstable var0, RoleData var1) {
      Pal var2;
      if ((var2 = var1.getChosePal()) == null) {
         var1.getGameView().fw("你没有选中的伙伴");
      } else if (var0.getType() != 7500L) {
         String var3 = Agreement.getSendTextAES("userpal", var2.getId() + "|" + var0.getRgid());
         var1.getGameView().getClient().d(var3);
      }
   }

   public static void d(Baby var0, Goodstable var1, RoleData var2) {
      String[] var3 = var1.getValue().split("\\|");
      String[] var10000 = var3[W.c.nextInt(var3.length)].split("=");
      String var4 = var10000[2 & 5];
      var10000 = var10000[3 >> 1].split("-");
      int var9 = Integer.parseInt(var10000[5 >> 3]);
      int var5;
      int var6 = (var5 = Integer.parseInt(var10000[2 ^ 3])) - var9 + --1;
      int var7;
      if ((var7 = W.c.nextInt(var6) + var9) <= var9 + (5 >> 2) || var7 >= var5 - --1) {
         var7 = W.c.nextInt(var6) + var9;
      }

      Baby var10;
      switch(var4.hashCode()) {
      case 668086:
         while(false) {
         }

         if (!var4.equals("内力")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setNeili(var0.getNeili() + var7);
         }
         break;
      case 694695:
         if (!var4.equals("名气")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setMingqi(var0.getMingqi() + var7);
         }
         break;
      case 702347:
         if (!var4.equals("叛逆")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setPanni(var0.getPanni() + var7);
         }
         break;
      case 749574:
         if (!var4.equals("孝心")) {
            var10 = var0;
            break;
         } else {
            var0.setXiaoxin(var0.getXiaoxin() + var7);
         }
      default:
         var10 = var0;
         break;
      case 834401:
         if (!var4.equals("智力")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setZhili(var0.getZhili() + var7);
         }
         break;
      case 893844:
         if (!var4.equals("气质")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setQizhi(var0.getQizhi() + var7);
         }
         break;
      case 942494:
         if (!var4.equals("玩性")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setWanxing(var0.getWanxing() + var7);
         }
         break;
      case 1037451:
         if (!var4.equals("耐力")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setNaili(var0.getNaili() + var7);
         }
         break;
      case 1169860:
         if (!var4.equals("道德")) {
            var10 = var0;
         } else {
            var10 = var0;
            var0.setDaode(var0.getDaode() + var7);
         }
      }

      var10.setBabyage(var0.getBabyage() + (14 & 123));
      f(var0, var2);
      var1.ab(4 ^ 5);
      ParamTool.g(var1, 5 >> 2, var2.getGameView().getClient());
      ParamTool.b(var0, var2.getGameView().getClient());
      fC var8;
      if ((var8 = var2.getGameView().getFormManagement().m(4 ^ 5)) != null) {
         ((ca)var8).ti(var0);
      }

      var2.getGameView().fw("孩子在#G " + var4 + " #Y上增加了#G " + var7 + " #Y点属性");
   }

   public static void e(Goodstable var0, boolean var1, RoleData var2) {
      Baby var4;
      if ((var4 = var2.getChoseBaby()) == null) {
         var2.getGameView().fw("你没有选中的孩子");
      } else {
         int var3 = var0.getType().intValue();
         String var5;
         if (var2.getGameView().getClient().gameBaby) {
            if (var1 && var2.getGameView().getClient().n(5 >> 1, 45 & 94) && (var3 == (19623 & 13277) || var3 == (20630 & 12271))) {
               ((mw)var2.getGameView().getFormManagement().e(419 & 32510)).arc(--3, var4.getBabyid(), var0);
               return;
            }

            if (var3 == (28391 & 4509) || var3 == (13311 & 19590)) {
               var5 = Agreement.getSendTextAES("userbaby", var0.getRgid() + "|" + var4.getBabyid());
               var2.getGameView().getClient().d(var5);
               return;
            }

            if (var3 == (115 & 63)) {
               var5 = Agreement.getSendTextAES("userbaby", var0.getRgid() + "|" + var4.getBabyid());
               var2.getGameView().getClient().d(var5);
               return;
            }

            if (var3 == (63 & 117)) {
               var2.getGameView().aal(new ConfirmBean(31 & 126, var4.getBabyid() + "|" + var0.getRgid(), "#W你确定将你的孩子#Y" + var4.getBabyname() + "#W进行重置?"));
               return;
            }

            if (var3 == (19871 & 13035)) {
               var5 = Agreement.getSendTextAES("userbaby", var0.getRgid() + "|" + var4.getBabyid());
               var2.getGameView().getClient().d(var5);
               return;
            }
         } else {
            if (var3 == (63 & 114)) {
               d(var4, var0, var2);
               return;
            }

            if (var3 == (63 & 115)) {
               var5 = Agreement.getSendTextAES("userbaby", var0.getRgid() + "|" + var4.getBabyid());
               var2.getGameView().getClient().d(var5);
               return;
            }

            if (var3 >= (119 & 62) && var3 <= (61 & 127)) {
               b(var4, var0, var2);
               return;
            }

            if (var3 == (61 & 119)) {
               a(var4, var0, var2);
            }
         }

      }
   }

   public static void f(Baby var0, RoleData var1) {
      if (var0.getBabyage() >= (23004 & 16243)) {
         if (var0.getOutcome() == null || var0.getOutcome().equals("")) {
            List var9 = var1.getObjectArea().bu().getAllBabyResults();
            BigDecimal[] var10001;
            RoleData var10002;
            if (var0 != null) {
               var10001 = var0.getpartAll();
               var10002 = var1;
            } else {
               var10001 = null;
               var10002 = var1;
            }

            Map var10 = BaseValue.getProperty(var0, var10001, var10002);
            int var4 = 3 ^ 3;
            int var5 = 5 >> 3;
            String var6 = "";

            Iterator var8;
            for(Iterator var10000 = var8 = var10.keySet().iterator(); var10000.hasNext(); var10000 = var8) {
               String var7 = (String)var8.next();
               int var2 = (Integer)var10.get(var7);
               var4 += var2;
               if (var2 >= var5) {
                  var5 = var2;
                  var6 = var7;
               }
            }

            BabyResult var13 = null;
            int var17 = var5 = var9.size() - (3 & 5);

            Baby var19;
            label68:
            while(true) {
               if (var17 < 0) {
                  var19 = var0;
                  break;
               }

               if ((var13 = (BabyResult)var9.get(var5)).getT1().equals("无") || var13.getT1().equals(var6)) {
                  String[] var15 = var13.getT2().split("\\|");
                  int var16;
                  var17 = var16 = 3 >> 2;

                  while(true) {
                     if (var17 >= var15.length) {
                        var19 = var0;
                        break label68;
                     }

                     String[] var3 = var15[var16].split("=");
                     int var11 = var4;
                     if (!var3[3 & 4].equals("总")) {
                        var11 = (Integer)var10.get(var3[2 & 5]);
                     }

                     String[] var18 = var3[--1].split("\\-");
                     int var14 = Integer.parseInt(var18[3 >> 2]);
                     int var12 = Integer.parseInt(var18[5 >> 2]);
                     if (var11 < var14 || var11 > var12) {
                        break;
                     }

                     ++var16;
                     var17 = var16;
                  }
               }

               --var5;
               var17 = var5;
            }

            var19.setOutcome(var0.getChildSex() == 0 ? var13.getNan() : var13.getNv());
            var1.getGameView().fw("孩子获得#G" + var0.getOutcome() + "结局");
         }
      }
   }
}
