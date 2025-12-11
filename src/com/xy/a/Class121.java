package com.xy.a;

import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.GameMove;
import com.xy.game.RoleData;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class121 extends com.xy.q.Class30 {
   private int arw;
   private com.xy.w.Class9 arx;
   private com.xy.w.Class18[] ary;
   private com.xy.q.Class14 arz;
   private Class125 asa;
   private int aod;
   private com.xy.i.Class18 asb;
   private static com.xy.w.Class1 asc;
   private Image asd;
   private com.xy.i.Class18 ase;
   private double asf;
   private Image[] asg;
   private double ash;
   private Image mh;
   private List<Class31> ai;
   private Class49[] asi;
   private String zj;
   private com.xy.i.Class18 asj;
   private String ng;
   private JComponent ahn;
   private boolean _do;
   private List<Class124> rk;
   private com.xy.v.Class32 ask;
   private Class126 asl;
   private MapModel asm;
   private com.xy.q.Class14 en;
   private List<com.xy.i.Class18> jr;

   protected void dj(Graphics var1) {
      if (this.asl != null) {
         this.asl.c(var1);
      }

      if (this._do || this.asm == this.afx.mapScene.r && this.afx.roleUnit.ah()) {
         if (this.asg[0] == null) {
            String var10003 = "\u001boGiG=Y8F|\u0006k";
            this.asg[0] = com.xy.w.Class16.c("sc/e/114.png");
            String var10002 = "x{$}$):-%he\u007f";
            this.asg[1] = com.xy.w.Class16.c("sc/e/115.png");
         }

         if (this._do) {
            if (this.asm == this.afx.mapScene.r && this.afx.roleUnit.ah()) {
               this._do = false;
               this.ng = null;
               this.c();
            }
         } else {
            this.c();
         }

         Graphics var10000;
         if (com.xy.v.Class22.l() / 100L % 2L == 0L) {
            var10000 = var1;
            var1.drawImage(this.asg[0], this.arw, this.aod - 20, 23, 21, null);
         } else {
            var10000 = var1;
            var1.drawImage(this.asg[0], this.arw, this.aod - 21, 23, 21, null);
         }

         var10000.drawImage(this.asg[1], this.arw - 1, this.aod, 25, 11, null);
      }

      if (this.zj != null) {
         var1.setColor(Color.YELLOW);
         var1.setFont(com.xy.q.Class49.ac);
         if (this.ask.b == -1) {
            this.ask.b = var1.getFontMetrics().stringWidth(this.zj) + 6;
            this.ask.c = var1.getFontMetrics().getHeight() + 6;
         }

         var1.translate(this.ask.d, this.ask.a);
         this.arx.g(var1, this.ask.b, this.ask.c);
         var1.translate(-this.ask.d, -this.ask.a);
         var1.drawString(this.zj, this.ask.d + 3, this.ask.a + 16);
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class1 vv() {
      return asc;
   }

   // $VF: synthetic method
   static MapModel ajx(Class121 var0) {
      return var0.asm;
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] ajy(Class121 var0) {
      return var0.ary;
   }

   public boolean dh() {
      com.xy.n.Class0 var1 = this.afx.mapScene;
      if (this.afx.mapScene == null) {
         return false;
      } else {
         return this.asm != null && this.asm.getMapId() == var1.a ? true : this.akm(var1.r);
      }
   }

   // $VF: synthetic method
   static void ajz(Class121 var0, Image var1) {
      var0.asd = var1;
   }

   public void aka(int var1, Object var2, com.xy.i.Class1 var3) {
      if (var1 == 271) {
         NpcInfoBean var4;
         if ((var4 = this.yt().at(String.valueOf(var2))) != null) {
            if (this.asa == null) {
               this.asa = new Class125(this);
            }

            this.asa.akz(var4);
            Point var5 = GameView.dr(var3.getX(), var3.getY(), this.asa.getWidth(), this.asa.getHeight(), this.getWidth(), this.getHeight());
            this.asa.setBounds(var5.x, var5.y, this.asa.getWidth(), this.asa.getHeight());
            this.add(this.asa, 0);
            this.asa.setVisible(true);
         }
      } else {
         if (var1 == 272) {
            ((Class132)this.zc().j(157)).mc(this.asm);
         }
      }
   }

   // $VF: synthetic method
   static void akb(Class121 var0, int var1) {
      var0.arw = var1;
   }

   public Class121(GameView var1) {
      super(22, 2, com.xy.q.Class30.afz, var1);
      this.arx = com.xy.w.Class16.m("sc/e/75.png", 6, 6, 6, 6, false);
      this.ask = new com.xy.v.Class32(-1, -1, 0, 0);
      this.asg = new Image[2];
      String var10004 = "kh7o73.%he\u007f";
      this.yy(-1, 0, 863, 484, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/86.png", 80, 36, 80, 36, false), null);
      this.wp(new com.xy.v.Class32(0, 0, 3, 0));
      this.add(this.agl = new com.xy.q.Class40());
      this.fj(2, 34, 32);
      String var10017 = "\u007f\u000b#\r#_?F|\u0006k";
      this.agi.setImage("sc/e/73.png");
      this.agi.setBounds(this.getWidth() - 44, 5, 46, 32);
      this.en = com.xy.q.Class1.i(6, 5, 128, 25, 10, Color.white, com.xy.q.Class49.ac);
      this.arz = com.xy.q.Class1.i(141, 5, 95, 25, 10, Color.white, com.xy.q.Class49.ac);
      String var10011 = "+柽诩V[[吆孏";
      this.en.setText(" 查询NPC名字");
      String var10010 = ",枍诮圸栋";
      this.arz.setText(" 查询坐标");
      String var10009 = "kh7n79!%he\u007f";
      this.en.mt(com.xy.w.Class16.m("sc/e/29.png", 3, 3, 3, 3, false));
      String var10008 = "\u007f\u000b#\r#Z5F|\u0006k";
      this.arz.mt(com.xy.w.Class16.m("sc/e/29.png", 3, 3, 3, 3, false));
      var10009 = "x{$}$):/%he\u007f";
      this.asb = new com.xy.i.Class18("sc/e/117.png", 2, 0, this);
      var10008 = "\u001boGiG=Y:F|\u0006k";
      this.asj = new com.xy.i.Class18("sc/e/116.png", 2, 0, this);
      this.asb.setBounds(111, 6, 23, 23);
      this.asj.setBounds(213, 6, 23, 23);
      this.add(this.asb);
      this.add(this.asj);
      this.add(this.en);
      this.add(this.arz);
      String var10013 = "x{$}$): %he\u007f";
      String var10018 = "骰纫摴紮";
      this.ase = new com.xy.i.Class18("sc/e/118.png", 1, 272, com.xy.q.Class49.w, null, "高级搜索", this);
      var10010 = "({M^M^N\\";
      this.ase.setForeground(com.xy.q.Class49.c("#cFFFFED"));
      this.ase.setOffsetTexts(com.xy.q.Class49.bo);
      this.ase.setBounds(245, 6, 76, 23);
      this.add(this.ase);
      this.asi = new Class49[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.asi.length; var10000 = var2) {
         Class49[] var5 = this.asi;
         int var8 = var2;
         Class49 var10001 = new Class49(this, var2, this);
         var2++;
         var5[var8] = var10001;
      }

      this.ary = new com.xy.w.Class18[3];

      for (int var6 = var2 = 0; var6 < this.ary.length; var6 = var2) {
         this.ary[var2] = new com.xy.w.Class18();
         Class121 var7;
         if (var2 == 0) {
            var7 = this;
            com.xy.w.Class18 var9 = this.ary[var2];
            String var12 = "\u007f\u000b#\f#P4F|\u0006k";
            var9.dp("sc/d/88.png");
            this.ary[var2].setBounds(788, 66, 29, 179);
         } else if (var2 == 1) {
            var7 = this;
            com.xy.w.Class18 var10 = this.ary[var2];
            String var13 = "kh7o73/%he\u007f";
            var10.mt(com.xy.w.Class16.m("sc/d/87.png", 10, 10, 10, 200, false));
            this.ary[var2].setBounds(776, 34, 82, 420);
         } else {
            if (var2 == 2) {
               this.ary[var2].setBounds(3, 34, 772, 420);
               Class84 var3 = new Class84(this);
               this.ary[var2].addMouseListener(var3);
               this.ary[var2].addMouseMotionListener(var3);
               this.ahn = new Class30(this);
               this.add(this.ahn, 0);
            }

            var7 = this;
         }

         var7.add(this.ary[var2++]);
      }

      this.rk = new ArrayList<>();
      this.ai = new ArrayList<>();
      this.jr = new ArrayList<>();
   }

   // $VF: synthetic method
   static void akc(Class121 var0, String var1) {
      var0.zj = var1;
   }

   public void akd(List<Class124> var1, NpcInfoBean var2, int var3) {
      int var4;
      Class124 var5;
      List var10000;
      if ((var5 = this.akk(var4 = Integer.parseInt(var2.getNpctable().getNpcid()))) == null) {
         int var6 = Integer.parseInt(var2.getNpctable().getTx());
         int var7 = Integer.parseInt(var2.getNpctable().getTy());
         var5 = new Class124(this, var4, (int)(var6 / this.asf - 4.5), (int)(var7 / this.ash - 4.5), var2.getNpctable().getNpcname());
         var10000 = var1;
         Class124.b(var5, var3);
         Class124.c(var5, Class124.f(var5) + this.ary[2].getX());
         Class124.g(var5, Class124.a(var5) + this.ary[2].getY());
      } else {
         if (var1 == this.rk) {
            return;
         }

         var10000 = var1;
      }

      var10000.add(var5);
   }

   // $VF: synthetic method
   static void ake(Class121 var0, int var1) {
      var0.aod = var1;
   }

   public void c() {
      GameMove var1;
      if ((var1 = this.afx.roleUnit.ar()) == null) {
         this.ng = null;
         this.arw = 0;
         this.aod = 0;
      } else if (com.xy.v.Class12.h(var1.getValue())) {
         int var6 = var1.x2;
         int var9 = var1.y2;
         var6 = (int)(var6 / this.asf - 12.5);
         var9 = (int)(var9 / this.asf - 6.0);
         var6 += this.ary[2].getX();
         int var10001 = var9 + this.ary[2].getY();
         this.arw = var6;
         this.aod = var10001;
      } else {
         if (this.ng != var1.getValue()) {
            this.ng = var1.getValue();
            String var10006 = "&";
            int var2 = this.ng.lastIndexOf("*");
            String var10005 = "2";
            int var3 = this.ng.lastIndexOf("*", var2 - 1);
            int var4 = com.xy.v.Class12.ad(this.ng, var3 + 1, var2);
            int var5 = com.xy.v.Class12.ad(this.ng, var2 + 1, this.ng.length());
            var4 = (int)(var4 / this.asf - 12.5);
            var5 = (int)(var5 / this.asf - 6.0);
            var4 += this.ary[2].getX();
            var5 += this.ary[2].getY();
            this.arw = var4;
            this.aod = var5;
         }
      }
   }

   // $VF: synthetic method
   static Class49[] akf(Class121 var0) {
      return var0.asi;
   }

   // $VF: synthetic method
   static void akg(Class121 var0, boolean var1) {
      var0._do = var1;
   }

   public void e() {
      int var1 = 0;

      int var2;
      for (int var10000 = var2 = 1; var10000 < this.asi.length; var10000 = ++var2) {
         if (Class49.rk(this.asi[var2])) {
            var1 |= 1 << var2;
         }
      }

      for (int var23 = var2 = 0; var23 < this.jr.size(); var23 = var2) {
         Object var24 = this.jr.get(var2);
         var2++;
         ((com.xy.i.Class18)var24).setVisible(false);
      }

      if (var1 == 0) {
         this.rk.clear();
      } else {
         var2 = 0;
         com.xy.v.Class8 var3 = this.yt();
         boolean var4 = Class49.rk(this.asi[0]);
         ArrayList var5 = new ArrayList();
         FormulaNum[] var6 = this.asm.getNpcs();
         int var7 = 0;
         int var8 = var6 != null ? var6.length : 0;

         for (int var25 = var7; var25 < var8; var25 = ++var7) {
            FormulaNum var9 = var6[var7];
            int var10 = 0;
            int var11 = var9.getSize();

            for (int var26 = var10; var26 < var11; var26 = ++var10) {
               long var12 = var9.getZhi(var10);
               NpcInfoBean var14;
               if ((var14 = var3.at(String.valueOf(var12))) != null
                  && !com.xy.v.Class12.h(var14.getNpctable().getNpctype())
                  && !com.xy.v.Class12.h(var14.getNpctable().getNpcname())) {
                  int var15;
                  if ((var15 = Integer.parseInt(var14.getNpctable().getNpctype())) == 2) {
                     if (var4 || Class49.rk(this.asi[1])) {
                        com.xy.i.Class18 var16 = var2 < this.jr.size() ? this.jr.get(var2) : null;
                        if (var16 == null) {
                           String var10002 = "\u001boGiG=Y<F|\u0006k";
                           var16 = new com.xy.i.Class18("sc/e/110.png", 1, 271, this);
                           this.ahn.add(var16, 0);
                           this.jr.add(var16);
                        }

                        var2++;
                        int var17 = Integer.parseInt(var14.getNpctable().getTx());
                        int var18 = Integer.parseInt(var14.getNpctable().getTy());
                        var17 = (int)(var17 / this.asf - 13.5) + this.ary[2].getX();
                        var18 = (int)(var18 / this.ash - 13.5) + this.ary[2].getY();
                        var16.gw(var12);
                        var16.setBounds(var17, var18, 27, 27);
                        var16.setVisible(true);
                     }
                  } else if ((var15 < 5 || var15 > 10)
                     && (var15 < 13 || var15 > 15)
                     && var15 != 18
                     && var15 != 37
                     && var15 != 45
                     && var15 != 50
                     && var15 != 88
                     && var15 != 99
                     && var15 != 120
                     && var15 != 121
                     && var15 != 123
                     && var15 != 124
                     && var15 != 125
                     && var15 != 131
                     && var15 != 136
                     && var15 != 735
                     && var15 != 2025) {
                     if (var4 || Class49.rk(this.asi[2])) {
                        this.akd(var5, var14, 0);
                     }
                  } else if (var4 || Class49.rk(this.asi[4])) {
                     this.akd(var5, var14, 1);
                  }
               }
            }
         }

         this.rk = var5;
      }
   }

   // $VF: synthetic method
   static double akh(Class121 var0) {
      return var0.ash;
   }

   // $VF: synthetic method
   static Image aki(Class121 var0) {
      return var0.mh;
   }

   // $VF: synthetic method
   static Image akj(Class121 var0) {
      return var0.asd;
   }

   public Class124 akk(int var1) {
      Iterator var3;
      for (Iterator var10000 = var3 = this.rk.iterator(); var10000.hasNext(); var10000 = var3) {
         Class124 var2;
         if (Class124.d(var2 = (Class124)var3.next()) == var1) {
            return var2;
         }
      }

      return null;
   }

   // $VF: synthetic method
   static void vy(com.xy.w.Class1 var0) {
      asc = var0;
   }

   // $VF: synthetic method
   static void akl(Class121 var0, Image var1) {
      var0.mh = var1;
   }

   protected void dn(Graphics var1) {
      Iterator var3;
      Iterator var10000 = var3 = this.rk.iterator();

      while (var10000.hasNext()) {
         Class124 var2 = (Class124)var3.next();
         var10000 = var3;
         var2.e(var1);
      }

      var10000 = var3 = this.ai.iterator();

      while (var10000.hasNext()) {
         Class31 var4 = (Class31)var3.next();
         var10000 = var3;
         var4.d(var1);
      }

      if (this.afx.mapScene.r == this.asm) {
         var1.drawImage(
            com.xy.w.Class16.i(),
            (int)(this.afx.roleUnit.ae / this.asf - 5.0) + this.ary[2].getX(),
            (int)(this.afx.roleUnit.v / this.ash - 5.0) + this.ary[2].getY(),
            10,
            10,
            null
         );
      }
   }

   public void f() {
      RoleData var1 = this.yx();
      ArrayList var2 = new ArrayList();

      int var3;
      for (int var10000 = var3 = 0; var10000 < var1.goodPacks.length; var10000 = ++var3) {
         Goodstable var4;
         GoodFight var5;
         if ((var4 = var1.getGood(var1.goodPacks[var3])) != null && GoodType.aj(var4.getType()) && (var5 = var4.getFight()) != null) {
            for (; var5 != null; var5 = var5.getNextFight()) {
               if (var5.getMap() == this.asm.getMapId()) {
                  Class31 var6 = new Class31(this, var4.getRgid(), var5);
                  var2.add(var6);
               }
            }
         }
      }

      this.ai = var2;
   }

   public boolean akm(MapModel var1) {
      com.xy.w.Class17 var2;
      if ((var2 = com.xy.w.Class16.h(String.valueOf(var1.getMapModel()))) == null) {
         return false;
      } else {
         this.asm = var1;
         this.asl = null;
         this._do = false;
         this.ng = null;
         this.ary[2].gt(var2.c());
         this.ary[2].setBounds(3, 34, var2.c().getWidth(null), var2.c().getHeight(null));
         this.ary[0].setBounds(this.ary[2].getWidth() + 15, 66, 29, 179);
         this.ary[1].setBounds(this.ary[2].getWidth() + 3, 34, 82, this.ary[2].getHeight());

         int var3;
         for (int var10000 = var3 = 0; var10000 < this.asi.length; var10000 = var3) {
            Class49.ri(this.asi[var3]).setBounds(20 + 68 * var3, 37 + this.ary[2].getHeight(), 20, 20);
            JLabel var5 = Class49.rj(this.asi[var3]);
            int var10001 = 43 + 68 * var3;
            int var10002 = 37 + this.ary[2].getHeight();
            var3++;
            var5.setBounds(var10001, var10002, 45, 20);
         }

         this.agl.yz(var1.getMapName(), null);
         this.zb(this.ary[2].getWidth() + 47, 46, 34, (var1.getMapName().length() + 1) * 34);
         this.yv(-1, 0, this.ary[2].getWidth() + 90, this.ary[2].getHeight() + 64);
         this.ahn.setBounds(0, 0, this.ary[2].getWidth() + 90, this.ary[2].getHeight() + 64);
         if (this.asa != null) {
            this.asa.setVisible(false);
         }

         Point var4 = com.xy.w.Class16.q(var1.getMapModel());
         this.asf = (double)var4.x / this.ary[2].getWidth();
         this.ash = (double)var4.y / this.ary[2].getHeight();
         this.h();
         return true;
      }
   }

   // $VF: synthetic method
   static List akn(Class121 var0) {
      return var0.ai;
   }

   public void mc(MapModel var1) {
      this.asl = null;
      Class121 var10000;
      if (this.asm != null && this.asm.getMapId() == var1.getMapId()) {
         var10000 = this;
         this.f();
      } else {
         if (!this.akm(var1)) {
            return;
         }

         var10000 = this;
      }

      var10000.zc().b(this.lj());
   }

   // $VF: synthetic method
   static Class125 ako(Class121 var0) {
      return var0.asa;
   }

   // $VF: synthetic method
   static double akp(Class121 var0) {
      return var0.asf;
   }

   public void akq(MapModel var1, NpcInfoBean var2) {
      NpcInfoBean var10000;
      if (this.asm != null && this.asm.getMapId() == var1.getMapId()) {
         var10000 = var2;
         this.f();
      } else {
         if (!this.akm(var1)) {
            return;
         }

         var10000 = var2;
      }

      int var3 = Integer.parseInt(var10000.getNpctable().getTx());
      int var4 = Integer.parseInt(var2.getNpctable().getTy());
      this.asl = new Class126(this, (int)(var3 / this.asf - 4.5), (int)(var4 / this.ash - 4.5), var2.getNpctable().getNpcname());
      Class126.b(this.asl, Class126.d(this.asl) + this.ary[2].getX());
      Class126.e(this.asl, Class126.a(this.asl) + this.ary[2].getY());
      this.zc().b(this.lj());
   }

   public void h() {
      this.e();
      this.f();
   }

   // $VF: synthetic method
   static com.xy.v.Class32 akr(Class121 var0) {
      return var0.ask;
   }
}
