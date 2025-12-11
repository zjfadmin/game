package com.xy.a.w;

import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;

public class Class26 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] bb;
   private Class24[] aks;
   private com.xy.w.Class0 akt;
   private com.xy.q.Class20 aku;
   private com.xy.i.Class20[] ph;
   private int ae;
   private int ds;
   private JLabel di;
   private com.xy.i.Class20[] fk;

   public void bj(BigDecimal var1, int var2) {
      if (var2 == 3) {
         this.g(3);
         Goodstable var3;
         if ((var3 = this.yx().getGood(var1)) != null) {
            Class24.abd(this.aks[var2]).gs(1, var3);
            String var10006 = "^W\u0005";
            com.xy.w.Class0 var4 = com.xy.w.Class11.t("tx/" + var3.getSkin() + "0", -2, -5, null);
            var10006 = "R\u0004\t";
            com.xy.w.Class0 var5 = com.xy.w.Class11.t("tx/" + var3.getSkin() + "1", -2, 5, null);
            this.akt = this.akt.q(var4);
            this.akt = this.akt.q(var5);
            return;
         }
      } else {
         RoleTxBean var7;
         if (var1 != null && (var7 = this.yt().ci(var1.intValue())) != null) {
            var2 = var7.getRdType() - 1;
            this.g(var2);
            Class24.abd(this.aks[var2]).gs(8, var7);
            String var10004 = "^W\u0005[R";
            com.xy.w.Class0 var8 = com.xy.w.Class11.t("tx/tx" + var7.getRdId(), -2, var7.getRdStatues() - var7.getRdType(), null);
            this.akt = this.akt.q(var8);
         }
      }
   }

   public int dx() {
      return this.ae;
   }

   public void e() {
      this.aku.vs().a(0);
   }

   public void y(int var1) {
      this.ae = var1;
      com.xy.i.Class23 var10001 = this.aku.vs();
      int var10000 = 0;
      var10001.a(0);

      for (int var2 = 0; var10000 < 4; var10000 = ++var2) {
         this.fk[var2].setKeep(var2 == var1);
      }
   }

   public void ak(Class54 var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aks.length; var10000 = ++var2) {
         if (Class24.abd(this.aks[var2]) == var1) {
            this.g(var2);
            return;
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.akt != null) {
         this.akt.r(var1, 205, 290, this.ds, com.xy.v.Class22.l());
      }
   }

   public void f() {
      RoleData var1;
      (var1 = this.yx())
         .getPackRecord()
         .g(
            Class24.abd(this.aks[0]).il() == 8 ? String.valueOf(Class24.abd(this.aks[0]).ee()) : "",
            Class24.abd(this.aks[1]).il() == 8 ? String.valueOf(Class24.abd(this.aks[1]).ee()) : "",
            Class24.abd(this.aks[2]).il() == 8 ? String.valueOf(Class24.abd(this.aks[2]).ee()) : ""
         );
      boolean var2 = false;
      BigDecimal var3 = Class24.abd(this.aks[3]).il() == 1 ? new BigDecimal(Class24.abd(this.aks[3]).ee()) : null;
      if (var1.goodChoses[12] == null || var3 == null || var1.goodChoses[12].compareTo(var3) != 0) {
         if (var1.goodChoses[12] != null) {
            var2 = true;
            Goodstable var4 = var1.getGood(var1.goodChoses[12]);
            var1.goodChoses[12] = null;
            if (var4 != null) {
               var4.setStatus(0);
               ParamTool.j(var4, 0, this.za());
            }
         }

         if (var3 != null) {
            var2 = true;
            Goodstable var5;
            if ((var5 = var1.getGood(var3)) != null) {
               var1.goodChoses[12] = var5.getRgid();
               var5.setStatus(1);
               ParamTool.j(var5, 0, this.za());
            }
         }
      }

      var1.ao(true);
      if (var2) {
         var1.getRoleProperty().f();
      }
   }

   @Override
   public boolean ah() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < 4; var10000 = var1) {
         this.g(var1++);
      }

      this.akt = null;
      return super.ah();
   }

   public Class26(GameView var1) {
      super(38, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\\I\u0000N\u0000\u001b\u0001ZAM";
      this.ae = 0;
      this.ds = 0;
      this.yy(-2, 0, 622, 409, com.xy.q.Class30.agh);
      com.xy.w.Class9 var37 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "弞豇袹扈";
      this.yu(var37, "形象装扮");
      this.fk = new com.xy.i.Class20[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.fk.length; var10000 = var2) {
         com.xy.i.Class20[] var8 = this.fk;
         if (var2 == 4) {
            var10004 = "YL\u0005J\u0005\u001c\u0012\u0001ZAM";
            var10004 = "sc/e/38.png";
         } else {
            var10004 = "U\u001f\t\u0019\tO\u001fRV\u0012A";
            var10004 = "sc/e/39.png";
         }

         int var10006 = 61 + var2;
         String var56;
         Class26 var10010;
         if (var2 == 0) {
            var56 = "牖敢";
            var56 = "特效";
            var10010 = this;
         } else if (var2 == 1) {
            var56 = "裣餌哧";
            var56 = "装饰品";
            var10010 = this;
         } else if (var2 == 2) {
            var56 = "趙迖\n";
            var56 = "足迹 ";
            var10010 = this;
         } else if (var2 == 3) {
            var56 = "翣臼\u0006";
            var56 = "翅膀 ";
            var10010 = this;
         } else if (var2 == 4) {
            var56 = "锌\u000f绉";
            var56 = "锦 绣";
            var10010 = this;
         } else {
            var56 = "";
            var10010 = this;
         }
         com.xy.i.Class20 var10001 = new com.xy.i.Class20(var10004, 2, var10006, Class49.k, null, var56, var10010);
         var8[var2] = var10001;
         Class26 var9;
         if (var2 == 4) {
            var9 = this;
            this.fk[var2].setForeground(Color.black);
            this.fk[var2].setFont(Class49.bx);
            this.fk[var2].setBounds(58, 21, 95, 33);
            this.fk[var2].setOffsetTexts(Class49.d);
            this.fk[var2].setKeep(true);
         } else {
            var9 = this;
            this.fk[var2].setOffsetTexts(Class49.bo);
            this.fk[var2].setBounds(328 + 65 * var2, 62, 63, 24);
         }

         var9.add(this.fk[var2++]);
      }

      this.aks = new Class24[4];

      for (int var10 = var2 = 0; var10 < this.aks.length; var10 = var2) {
         this.aks[var2] = new Class24(this, 0, var2);
         this.aks[var2].setBounds(53, 112 + var2 * 42, 42, 42);
         this.add(this.aks[var2++]);
      }

      String var10011 = "_E:`:`:`";
      this.di = com.xy.q.Class1.f(46, 60, 115, 23, 0, Class49.c("#cFFFFFF"), Class49.by);
      String var10005 = "锉绉颫觢";
      this.di.setText("锦绣预览");
      this.add(this.di);
      this.ph = new com.xy.i.Class20[6];

      for (int var11 = var2 = 0; var11 < this.ph.length; var11 = var2) {
         com.xy.i.Class20[] var12 = this.ph;
         int var55 = 71 + var2;
         String var62;
         Class26 var66;
         if (var2 == 2) {
            var62 = "価孾弞豇";
            var62 = "保存形象";
            var66 = this;
         } else if (var2 == 3) {
            var62 = "丯锄南陎";
            var62 = "一键卸除";
            var66 = this;
         } else if (var2 == 4) {
            var62 = "挬猈";
            var62 = "捐献";
            var66 = this;
         } else if (var2 == 5) {
            var62 = "夰宲阫贂乚";
            var62 = "多宝阁购买";
            var66 = this;
         } else {
            var62 = "";
            var66 = this;
         }

         com.xy.i.Class20 var22 = new com.xy.i.Class20(null, 1, var55, Class49.ch, Class49.bv, var62, var66);
         var12[var2] = var22;
         Class26 var13;
         if (var2 == 0) {
            var13 = this;
            var22 = this.ph[var2];
            var10003 = "U\u001f\t\u0019\tO\u0014RV\u0012A";
            var22.setImage("sc/e/32.png");
            this.ph[var2].setBounds(184, 322, 11, 15);
         } else if (var2 == 1) {
            var13 = this;
            var22 = this.ph[var2];
            var10003 = "YL\u0005J\u0005\u001c\u001e\u0001ZAM";
            var22.setImage("sc/e/34.png");
            this.ph[var2].setBounds(213, 322, 11, 15);
         } else if (var2 == 2) {
            var13 = this;
            var22 = this.ph[var2];
            var10003 = "U\u001f\t\u0019\tN\u0010RV\u0012A";
            var22.setImage("sc/e/26.png");
            this.ph[var2].setBounds(76, 367, 99, 25);
         } else if (var2 == 3) {
            var13 = this;
            var22 = this.ph[var2];
            var10003 = "YL\u0005J\u0005\u001d\u001c\u0001ZAM";
            var22.setImage("sc/e/26.png");
            this.ph[var2].setBounds(198, 367, 99, 25);
         } else if (var2 == 4) {
            var13 = this;
            var22 = this.ph[var2];
            var10003 = "\u000fESCS\u0011RV\u0012A";
            var22.setImage("sc/e/7.png");
            this.ph[var2].setBounds(323, 367, 59, 25);
         } else {
            if (var2 == 5) {
               this.ph[var2].setForeground(Color.black);
               com.xy.i.Class20 var18 = this.ph[var2];
               String var28 = "YL\u0005J\u0005\u001b\u001c\u0001ZAM";
               var18.setImage("sc/e/46.png");
               this.ph[var2].setBounds(476, 367, 119, 25);
            }

            var13 = this;
         }

         var13.add(this.ph[var2++]);
      }

      this.bb = new com.xy.w.Class18[6];

      for (int var14 = var2 = 0; var14 < this.bb.length; var14 = ++var2) {
         this.bb[var2] = new com.xy.w.Class18();
         Class26 var15;
         if (var2 == 0) {
            var15 = this;
            com.xy.w.Class18 var30 = this.bb[var2];
            var10003 = "U\u001f\t\u0018\tO\u0012RV\u0012A";
            var30.dp("sc/d/34.png");
            this.bb[var2].setBounds(46, 60, 205, 23);
         } else if (var2 == 1) {
            var15 = this;
            com.xy.w.Class18 var31 = this.bb[var2];
            var10003 = "YL\u0005K\u0005\u001d\u001e\u0001ZAM";
            var31.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.bb[var2].setBounds(103, 100, 200, 250);
         } else if (var2 == 2) {
            var15 = this;
            com.xy.w.Class18 var32 = this.bb[var2];
            var10003 = "U\u001f\t\u0018\tM\u001fRV\u0012A";
            var32.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.bb[var2].setBounds(326, 94, 258, 258);
         } else if (var2 == 3) {
            var15 = this;
            com.xy.w.Class18 var33 = this.bb[var2];
            var10003 = "YL\u0005K\u0005\u001c\u001c\u0001ZAM";
            var33.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
            this.bb[var2].setBounds(46, 85, 266, 274);
         } else if (var2 == 4) {
            var15 = this;
            com.xy.w.Class18 var34 = this.bb[var2];
            var10003 = "U\u001f\t\u0018\tO\u0010RV\u0012A";
            var34.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
            this.bb[var2].setBounds(321, 85, 273, 274);
         } else {
            if (var2 == 5) {
               com.xy.w.Class18 var19 = this.bb[var2];
               String var35 = "YL\u0005K\u0005\u001c\u001f\u0001ZAM";
               var19.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
               this.bb[var2].setBounds(29, 36, 578, 20);
            }

            var15 = this;
         }

         var15.add(this.bb[var2]);
         if (var2 == 2) {
            com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

            int var4;
            for (int var16 = var4 = 0; var16 < var3.length; var16 = var4) {
               if (var4 == 0) {
                  var10004 = "U\u001f\t\u0019\tH\u0011RV\u0012A";
                  var10004 = "sc/e/47.png";
               } else {
                  var10004 = "YL\u0005J\u0005\u001b\u0012\u0001ZAM";
                  var10004 = "sc/e/48.png";
               }

               com.xy.i.Class3 var20 = new com.xy.i.Class3(var10004, 1, var4, this);
               var3[var4] = var20;
               Class26 var17;
               if (var4 == 0) {
                  var3[var4].setBounds(583, 307, 18, 18);
                  var17 = this;
               } else {
                  var3[var4].setBounds(583, 327, 18, 18);
                  var17 = this;
               }

               var17.add(var3[var4++]);
            }

            this.aku = new com.xy.q.Class20(5, this, 5, 5, 51, 51, 0, 0, 327, 96);
            var10004 = "U\u001f\t\u0018\tM\u001eRV\u0012A";
            this.aku.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.aku.vr(var3, 1);
            this.add(this.aku);
         }
      }
   }

   public void g(int var1) {
      if (Class24.abd(this.aks[var1]).il() != 0) {
         BigDecimal var2 = new BigDecimal(Class24.abd(this.aks[var1]).ee());
         Class24.abd(this.aks[var1]).gs(0, null);
         if (var1 == 3) {
            Goodstable var3;
            if ((var3 = this.yx().getGood(var2)) != null) {
               String var10006 = "R\u0004\t";
               this.akt = this.akt.s("tx/" + var3.getSkin() + "0");
               String var10004 = "^W\u0005";
               this.akt = this.akt.s("tx/" + var3.getSkin() + "1");
               return;
            }
         } else {
            RoleTxBean var4;
            if ((var4 = this.yt().ci(var2.intValue())) != null) {
               String var5 = "R\u0004\t\b^";
               this.akt = this.akt.s("tx/tx" + var4.getRdId());
            }
         }
      }
   }

   public void cr(boolean var1) {
      if (this.ds == 0) {
         this.ds = var1 ? 4 : 7;
      } else if (this.ds == 1) {
         this.ds = var1 ? 5 : 4;
      } else if (this.ds == 2) {
         this.ds = var1 ? 6 : 5;
      } else if (this.ds == 3) {
         this.ds = var1 ? 7 : 6;
      } else if (this.ds == 4) {
         this.ds = var1 ? 1 : 0;
      } else if (this.ds == 5) {
         this.ds = var1 ? 2 : 1;
      } else if (this.ds == 6) {
         this.ds = var1 ? 3 : 2;
      } else {
         if (this.ds == 7) {
            this.ds = var1 ? 0 : 3;
         }
      }
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         this.ds = 0;
         this.h();
         this.y(0);
         super.l();
      }
   }

   public void h() {
      RoleData var1;
      RoleData var10000 = var1 = this.yx();
      long var2 = var10000.getLoginResult().getSpecies_id().longValue();
      Goodstable var4;
      long var5;
      if ((var4 = var10000.getGoodEquip(var10000.goodChoses[0])) != null && (var5 = GameUtil.a(Integer.parseInt(var4.getSkin()))) != 0L) {
         long var9;
         var2 |= (var9 = var5 + 18L) << 32;
      }

      if (this.akt == null) {
         this.akt = com.xy.w.Class11.p(var2, 2, 1, null);
      } else {
         boolean var10005 = true;
         this.akt = com.xy.w.Class11.ah(this.akt, 1, String.valueOf(var2));
      }

      int var10;
      for (int var13 = var10 = 0; var13 < 4; var13 = var10) {
         this.g(var10++);
      }

      List var11 = var1.getPackRecord().getPutTX();
      int var6 = 0;
      int var7 = var11 != null ? var11.size() : 0;

      for (int var14 = var6; var14 < var7; var14 = ++var6) {
         RoleTxBean var8;
         if ((var8 = this.yt().ci(Integer.parseInt((String)var11.get(var6)))) != null) {
            this.bj(new BigDecimal(var8.getGid()), var8.getRdType() - 1);
         }
      }

      Goodstable var12;
      if ((var12 = var1.getGoodEquip(var1.goodChoses[12])) != null) {
         this.bj(var12.getRgid(), 3);
      }
   }
}
