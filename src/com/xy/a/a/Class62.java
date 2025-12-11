package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class62 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] de;
   private com.xy.q.Class54 bw;
   private com.xy.i.Class3[] ga;
   private com.xy.w.Class0 zx;
   private com.xy.q.Class21 nz;
   private Class36[] axw;
   private JLabel di;
   private com.xy.i.Class4 hq;

   public Class62(GameView var1) {
      super(67, 2, com.xy.q.Class30.afz, var1);
      String var10010 = "UP\tW\t\u0002\bCHT";
      this.yy(-3, 0, 371, 500, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.rm(false);
      this.wp(new com.xy.v.Class32(0, 0, 11, 0));
      var10010 = "$y7*A\\7*";
      this.di = com.xy.q.Class1.f(24, 33, 310, 18, 0, com.xy.q.Class49.c("#c00FF00"), com.xy.q.Class49.ab);
      this.add(this.di);
      String var10009 = "UP\tV\t\u0004\bCHT";
      String var10014 = "洐给";
      this.hq = new com.xy.i.Class4("sc/e/7.png", 1, 41, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "洗练", this);
      this.hq.setBounds(150, 231, 59, 25);
      this.add(this.hq);
      this.axw = new Class36[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.axw.length; var10000 = var2) {
         this.axw[var2] = new Class36(this, var2, this);
         Class36 var10003 = this.axw[var2];
         String var10004 = "@E\u001cB\u001c\u0013\u0002\bCHT";
         var10003.dq("sc/d/51.png");
         this.axw[var2].wp(com.xy.q.Class54.atp);
         this.add(this.axw[var2++]);
      }

      this.bw = new com.xy.q.Class54(this);
      this.bw.setBounds(170, 202, 24, 24);
      this.add(this.bw);
      this.de = new com.xy.w.Class18[3];

      for (int var4 = var2 = 0; var4 < this.de.length; var4 = var2) {
         this.de[var2] = new com.xy.w.Class18();
         Class62 var5;
         if (var2 == 0) {
            var5 = this;
            com.xy.w.Class18 var6 = this.de[var2];
            String var10 = "id5c52-)ji}";
            var6.dp("sc/d/57.png");
            this.de[var2].setBounds(170, 202, 24, 24);
         } else if (var2 == 1) {
            var5 = this;
            com.xy.w.Class18 var7 = this.de[var2];
            String var11 = "@E\u001cB\u001c\u0017\n\bCHT";
            var7.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.de[var2].setBounds(25, 265, 309, 207);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var10001 = this.de[var2];
               String var8 = "id5c52*)ji}";
               var10001.mt(com.xy.w.Class16.m("sc/d/50.png", 50, 50, 50, 50, false));
               this.de[var2].setBounds(24, 21, 310, 245);
            }

            var5 = this;
         }

         var5.add(this.de[var2++]);
      }

      this.nz = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 26, 267);
      String var12 = "@E\u001cB\u001c\u0017\u000b\bCHT";
      this.nz.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.nz.rm(true);
      this.add(this.nz);
   }

   public void ew(RoleSummoning var1) {
      this.h();
      if (var1 != null) {
         RoleData var2;
         if ((var2 = this.yx()) != null) {
            this.di.setText(var1.getSummoningname());
            String var3 = var1.getStye();
            this.zx = var1.getPart(this.afx);
            if (var3 != null && var3.length() > 1) {
               boolean var4 = true;
               String[] var5 = null;
               String var10001 = "[f";
               String[] var6 = var3.split("\\|");

               int var7;
               for (int var10000 = var7 = 1; var10000 < var6.length; var10000 = ++var7) {
                  String var17 = var6[var7];
                  var10001 = "\u001e";
                  String[] var8;
                  Goodstable var9;
                  if ((var8 = var17.split("-")).length >= 2 && (var9 = var2.getGoodEquip(new BigDecimal(var8[1]))) != null) {
                     int var10 = Integer.parseInt(var8[0]);
                     this.axw[var10].bb(var9);
                     if (var10 != 3 && var4) {
                        String var18 = var9.getValue();
                        var10001 = "[f";
                        String var12;
                        if ((var12 = MsgUntil.getValuesMessage(var18.split("\\|"), GoodType.Extras[5])) != null) {
                           if (var5 == null) {
                              var5 = new String[3];
                           }

                           var5[var10] = var12;
                        } else {
                           var4 = false;
                        }
                     }
                  }
               }

               if (var4 && var5 != null && var5[0] != null && var5[1] != null && var5[2] != null) {
                  String var10002 = var5[0];
                  String var10003 = "\u0015";
                  String[] var13 = var10002.split("&");
                  var10001 = var5[1];
                  var10002 = "<";
                  String[] var14 = var10001.split("&");
                  String var19 = var5[2];
                  var10001 = "\u0015";
                  String[] var15 = var19.split("&");
                  if (var13[1].equals(var14[1]) && var13[1].equals(var15[1])) {
                     BigDecimal var16 = MsgUntil.r(var13[2], var14[2], var15[2]);
                     BigDecimal var11 = MsgUntil.r(var13[3], var14[3], var15[3]);
                     var13[2] = var16.toString();
                     var13[3] = var11.toString();
                     this.bw.gs(9, var13);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.zx != null) {
         this.zx.r(var1, 182, 184, 0, com.xy.v.Class22.l());
      }
   }

   @Override
   public boolean ah() {
      this.h();
      return super.ah();
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         RoleSummoning var2;
         if ((var2 = this.yx().getChosePet()) != null) {
            this.f();
            this.ew(var2);
            super.l();
         }
      }
   }

   public void f() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.ga == null || this.ga.length != var1) {
         this.ga = this.zd(this.ga, var1, this.nz.ah());
         short var2 = 334;
         short var3 = 265;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.ga.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.ga[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.nz.vr(this.ga, 0);
      }
   }

   public void h() {
      int var10000 = 0;
      this.di.setText(null);

      for (int var1 = 0; var10000 < this.axw.length; var10000 = var1) {
         this.axw[var1++].bb(null);
      }

      this.bw.gs(0, null);
      String var10004 = "id5c52,)ji}";
      this.bw.dp("sc/d/56.png");
      this.bw.setVisible(true);
      this.zx = null;
   }
}
