package com.xy;

import com.xy.bean.RoleShow;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.readbean.Activity;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.Npctable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Class165 extends Class292 {
   public NpcInfoBean az;
   private int av;
   private String ba;
   public Npctable bb;
   private int o;
   private Class457 bc;
   public static final List<String> bd = Class394.ae("5-9|12-18|31|38-40|44-48|50|54|57|58|60|61|66|69|71|77|78");

   public int l(Class292 var1) {
      return var1.ah > this.ah ? --1 : -1;
   }

   public static void cj(Class165 var0, NpcInfoBean var1, GameView var2) {
      Npctable var4;
      if (!Class394.o((var4 = var1.getNpctable()).getNpctype())) {
         int var3;
         if ((var3 = Integer.parseInt(var4.getNpctype())) != (29690 & 4079) && var3 != (6131 & 27743) && var3 != (13261 & 20027) && (var3 < (1917 & 31951) || var3 > (16117 & 17755)) && (var3 < (14846 & 18431) || var3 > (12015 & 21266)) && var3 != (26597 & 8190) && var3 != (4095 & 30694) && var3 != (18431 & 16359)) {
            int var8;
            String var17;
            if (var3 == (7133 & 25790)) {
               Class603 var11 = var2.getObjectArea();
               List var6 = var2.baseView.ks();
               Activity var7 = null;
               int var10000 = var8 = 2 & 5;

               Activity var19;
               while(true) {
                  if (var10000 >= var6.size()) {
                     var19 = var7;
                     break;
                  }

                  Class441 var9;
                  Activity var10 = (var9 = (Class441)var6.get(var8)).tp() > (101 & 126) && var9.tp() < (6142 & 26825) ? var11.aq(var9.tp()) : null;
                  if (var10 != null && var10.getModelId() == --3) {
                     var19 = var7 = var10;
                     break;
                  }

                  ++var8;
                  var10000 = var8;
               }

               if (var19 != null) {
                  var17 = Agreement.getSendTextAES("activity", var7.getId() + "|N");
                  var2.getClient().d(var17);
                  return;
               }
            }

            Task var12;
            if ((var12 = var2.roleData.getTaskSystem().a("答题", var1.getNpctable().getNpcname())) != null) {
               TaskProgress var14 = var12.getProgressFinish("答题", var1.getNpctable().getNpcname());
               ((Class472)var2.getFormManagement().e(27 & 127)).lv(var0, var1, var12, var14);
            } else {
               String[] var13;
               String var16;
               GameView var20;
               if ((var13 = var2.roleUnit.ad()) != null && var13.length > (3 & 5) && bd.contains(var4.getNpctype())) {
                  var16 = Agreement.getSendTextAES("npcdialog", var1.getNpctable().getNpcid());
                  var20 = var2;
                  var2.getClient().d(var16);
               } else {
                  Class472 var15 = (Class472)var2.getFormManagement().e(123 & 31);
                  var20 = var2;
                  var15.ll(var0, var1, var3);
               }

               if ((var12 = var20.roleData.getTaskSystem().a("问候", var1.getNpctable().getNpcname())) != null) {
                  if (Class394.o(var16 = var12.getTaskData().getUnknowType("访问读条"))) {
                     var17 = Agreement.getSendTextAES("taskN", "W" + var12.getTaskId() + "|" + var1.getNpctable().getNpcname());
                     var2.getClient().d(var17);
                     return;
                  }

                  var8 = var16.indexOf("#");
                  long var18 = Class394.q(var16, 5 >> 3, var8) * 1000L;
                  var2.getGameReadBar().setReadBar(var12.getTaskId(), --5, var16.substring(var8 + (4 ^ 5)), (double)var18, Class280.l(), "W" + var12.getTaskId() + "|" + var1.getNpctable().getNpcname());
               }

            }
         } else {
            String var5 = Agreement.getSendTextAES("gangmonitor", String.valueOf(var3));
            var2.getClient().d(var5);
         }
      }
   }

   public Class165(NpcInfoBean var1) {
      int var10003 = --2;
      super();
      this.ac = var10003;
      this.ck(var1);
   }

   public void ck(NpcInfoBean var1) {
      try {
         Class165 var10000;
         label51: {
            int var10006 = 3 >> 2;
            this.bb = (this.az = var1).getNpctable();
            this.ab = Integer.parseInt(this.bb.getTx());
            this.al = Integer.parseInt(this.bb.getTy());
            this.ar = var10006;
            this.ad = this.bb.getNpcname();
            this.ai = this.bb.getTitle();
            if (!Class394.o(this.ai)) {
               if (this.ai.startsWith("#c")) {
                  this.aa = Class681.c(this.ai.substring(3 >> 2, 78 & 57));
                  var10000 = this;
                  this.ai = this.ai.substring(9 & 126);
                  break label51;
               }

               if (this.ai.startsWith("#R")) {
                  this.aa = Color.RED;
                  var10000 = this;
                  this.ai = this.ai.substring(5 >> 1);
                  break label51;
               }

               if (this.ai.startsWith("#G")) {
                  this.aa = Color.GREEN;
                  var10000 = this;
                  this.ai = this.ai.substring(5 >> 1);
                  break label51;
               }

               if (this.ai.startsWith("#B")) {
                  this.aa = Color.BLUE;
                  var10000 = this;
                  this.ai = this.ai.substring(5 >> 1);
                  break label51;
               }

               if (this.ai.startsWith("#W")) {
                  this.aa = Color.WHITE;
                  var10000 = this;
                  this.ai = this.ai.substring(1 ^ 3);
                  break label51;
               }

               if (this.ai.startsWith("#K")) {
                  this.aa = Color.BLACK;
                  var10000 = this;
                  this.ai = this.ai.substring(--2);
                  break label51;
               }

               if (this.ai.startsWith("#Y")) {
                  var10000 = this;
                  this.aa = Color.YELLOW;
                  this.ai = this.ai.substring(5 >> 1);
                  break label51;
               }
            } else {
               this.ai = null;
            }

            var10000 = this;
         }

         var10000.as = !Class394.o(this.bb.getDir()) ? Class292.bi(Integer.parseInt(this.bb.getDir())) : 3;
         if (!Class394.o(this.bb.getHeadTxt())) {
            this.bc = new Class457(this.bb.getHeadTxt());
            var10000 = this;
         } else {
            this.bc = null;
            var10000 = this;
         }

         var10000.ba(this.bb.getSkin(), (RoleShow)null);
         this.ae();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public String cl() {
      if (this.av == 0) {
         return null;
      } else {
         this.o += 126 & 61;
         if (this.av > this.o) {
            return null;
         } else {
            this.o -= this.av;
            this.as(this.ba);
            return this.ba;
         }
      }
   }

   public void k(Graphics var1) {
      if (this.bc != null) {
         this.bc.a(var1, this.am, this.ak);
      }

   }

   public void a(GameView var1) {
      if (var1.getMouseIndex() == Class320.l) {
         cj(this, this.az, var1);
      } else {
         if (var1.getMouseIndex() == Class320.n) {
            Class183.al(this, var1);
         }

      }
   }

   public void ae() {
      this.av = this.o = 3 ^ 3;
      this.ba = null;
      if (!Class394.o(this.bb.getTicktxt()) && !Class394.o(this.bb.getTick())) {
         this.av = Integer.parseInt(this.bb.getTick());
         if (this.av <= 0) {
            this.av = 2 & 5;
         } else {
            this.ba = this.bb.getTicktxt();
         }
      }
   }
}
