package com.xy.d;

import com.xy.game.RoleTaskData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.i.Class21;
import com.xy.readbean.Activity;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.Npctable;
import com.xy.readbean.TaskData;
import com.xy.socket.Agreement;
import com.xy.text.GameReadBar;
import com.xy.text.GameView;
import com.xy.v.Class12;
import com.xy.v.Class22;
import java.awt.Graphics;
import java.util.List;

public class Class1 extends Class4 {
   public static final List<String> c = Class12.ak("5-9|12-18|31|38-40|44-48|50|54|57|58|60|61|66|69|71|77|78");
   public Npctable d;
   private int e;
   public NpcInfoBean f;
   private String g;
   private int h;

   public void e(NpcInfoBean var1) {
      try {
         this.f = var1;
         this.d = var1.getNpctable();
         this.ae = Integer.parseInt(this.d.getTx());
         this.v = Integer.parseInt(this.d.getTy());
         this.al = 0;
         this.w = this.d.getNpcname();
         this.ag = this.d.getTitle();
         this.ak = !Class12.h(this.d.getDir()) ? Class4.ao(Integer.parseInt(this.d.getDir())) : 3;
         this.af(this.d.getSkin(), null);
         this.g();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public String f() {
      if (this.h == 0) {
         return null;
      } else {
         this.e += 60;
         if (this.h > this.e) {
            return null;
         } else {
            this.e = this.e - this.h;
            this.ak(this.g);
            return this.g;
         }
      }
   }

   @Override
   public void b(GameView var1) {
      if (var1.getMouseIndex() == com.xy.v.Class3.k) {
         h(this, this.f, var1);
      } else {
         if (var1.getMouseIndex() == com.xy.v.Class3.l) {
            Class8.bn(this, var1);
         }
      }
   }

   @Override
   public void d(Graphics var1) {
   }

   @Override
   public int c(Class4 var1) {
      return var1.ab > this.ab ? 1 : -1;
   }

   public void g() {
      this.h = this.e = 0;
      this.g = null;
      if (!Class12.h(this.d.getTicktxt()) && !Class12.h(this.d.getTick())) {
         this.h = Integer.parseInt(this.d.getTick());
         if (this.h <= 0) {
            this.h = 0;
         } else {
            this.g = this.d.getTicktxt();
         }
      }
   }

   static {
      String var10000 = "D\bHY@\u0017\\\u0014IYB\u0014\r\u0016I\bE\u0015\r\u0011E\bE\u001d\r\u0010AYD\u0011\r\u0010FYD\u001d\r\u0013AYG\u0014\r\u0013GYG\u001c\r\u0012@YF\u0012\r\u0012I";
   }

   public Class1(NpcInfoBean var1) {
      this.aa = 2;
      this.e(var1);
   }

   public static void h(Class1 var0, NpcInfoBean var1, GameView var2) {
      Npctable var3;
      if (!Class12.h((var3 = var1.getNpctable()).getNpctype())) {
         int var4;
         if ((var4 = Integer.parseInt(var3.getNpctype())) != 1002
            && var4 != 1107
            && var4 != 521
            && (var4 < 1101 || var4 > 1105)
            && (var4 < 510 || var4 > 514)
            && var4 != 2020
            && var4 != 2022
            && var4 != 2023) {
            if (var4 == 156) {
               com.xy.v.Class8 var11 = var2.getObjectArea();
               List var6 = var2.baseView.rs();
               Activity var7 = null;
               int var8;
               int var10000 = var8 = 0;

               Activity var23;
               while (true) {
                  if (var10000 >= var6.size()) {
                     var23 = var7;
                     break;
                  }

                  Class21 var9;
                  Activity var10 = (var9 = (Class21)var6.get(var8)).il() > 100 && var9.il() < 200 ? var11.cd(var9.il()) : null;
                  if (var10 != null && var10.getModelId() == 3) {
                     var23 = var7 = var10;
                     break;
                  }

                  var10000 = ++var8;
               }

               if (var23 != null) {
                  StringBuilder var34 = new StringBuilder(String.valueOf(var7.getId()));
                  String var36 = "\u0011Y";
                  String var21 = Agreement.getSendTextAES("activity", var34.append("|N").toString());
                  var2.getClient().k(var21);
                  return;
               }
            }

            RoleTaskData var24 = var2.roleData.getTaskSystem();
            String var10001 = "筱飩";
            Task var12;
            if ((var12 = var24.e("答题", var1.getNpctable().getNpcname())) != null) {
               var10001 = "笹颏";
               TaskProgress var15 = var12.getProgressFinish("答题", var1.getNpctable().getNpcname());
               ((com.xy.a.Class6)var2.getFormManagement().j(27)).bz(var0, var1, var12, var15);
            } else {
               String[] var14;
               GameView var25;
               if ((var14 = var2.roleUnit.ba()) != null && var14.length > 1 && c.contains(var3.getNpctype())) {
                  String var17 = Agreement.getSendTextAES("npcdialog", var1.getNpctable().getNpcid());
                  var25 = var2;
                  var2.getClient().k(var17);
               } else {
                  com.xy.a.Class6 var16 = (com.xy.a.Class6)var2.getFormManagement().j(27);
                  var25 = var2;
                  var16.bw(var0, var1, var4);
               }

               var24 = var25.roleData.getTaskSystem();
               var10001 = "闋偨";
               if ((var12 = var24.e("问候", var1.getNpctable().getNpcname())) != null) {
                  TaskData var27 = var12.getTaskData();
                  var10001 = "诒闹讖杶";
                  String var18;
                  if (Class12.h(var18 = var27.getUnknowType("访问读条"))) {
                     String var37 = "&";
                     StringBuilder var32 = new StringBuilder("W").append(var12.getTaskId());
                     String var35 = "k";
                     String var20 = Agreement.getSendTextAES("taskN", var32.append("|").append(var1.getNpctable().getNpcname()).toString());
                     var2.getClient().k(var20);
                     return;
                  }

                  String var10002 = "R";
                  int var19 = var18.indexOf("#");
                  long var22 = Class12.s(var18, 0, var19) * 1000L;
                  GameReadBar var28 = var2.getGameReadBar();
                  int var31 = var12.getTaskId();
                  String var10003 = var18.substring(var19 + 1);
                  double var10004 = var22;
                  long var10005 = Class22.l();
                  String var10008 = "@";
                  StringBuilder var10006 = new StringBuilder("W").append(var12.getTaskId());
                  String var10007 = "\r";
                  var28.setReadBar(var31, 5, var10003, var10004, var10005, var10006.append("|").append(var1.getNpctable().getNpcname()).toString());
               }
            }
         } else {
            String var5 = Agreement.getSendTextAES("gangmonitor", String.valueOf(var4));
            var2.getClient().k(var5);
         }
      }
   }
}
