package com.xy.a.i;

import com.xy.game.RoleData;
import com.xy.readbean.StarSoul;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Class22 extends com.xy.q.Class30 {
   private com.xy.w.Class1 abg;
   private long abh = -1L;
   private static com.xy.w.Class1 zk;
   public static com.xy.w.Class1 yv = null;
   private int aa;
   private Class27 abi;
   private Class40 abj;
   private static com.xy.w.Class1 abk;
   private Class26[] abl;
   private com.xy.w.Class1 kl;
   private List<Class17> iv;
   private Class48 abm;

   public com.xy.w.Class1 vu() {
      if (this.aa == 0) {
         return null;
      } else {
         if (this.kl == null) {
            String var10002 = "ti(hfd`%_Z_@";
            this.kl = com.xy.w.Class11.x("sc/bang/XPXJ" + this.aa + ".tcp");
         }

         return this.kl;
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class1 vv() {
      return abk;
   }

   public void y(int var1) {
      Class22 var10000;
      label19: {
         this.h();
         if (var1 == -1) {
            if (this.aa == 0) {
               var1 = 1;
               var10000 = this;
               break label19;
            }

            var1 = this.aa;
         }

         var10000 = this;
      }

      var10000.g(var1);
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   public void g(int var1) {
      this.kl = this.aa == var1 ? this.kl : null;
      int var10000 = 0;
      this.aa = var1;

      for (int var2 = 0; var10000 < this.iv.size(); var10000 = var2) {
         Class17 var10 = this.iv.get(var2);
         var2++;
         var10.ma(0, false, null);
      }

      StarSoul var8 = var1 != 0 ? this.yt().p(10000 + var1) : null;
      if (var8 != null) {
         long var3 = this.yx().getPackRecord().getStarSoulType(var8.getId());
         String var11 = var8.getValue();
         String var10001 = "[v";
         String[] var5 = var11.split("\\|");

         int var6;
         for (int var12 = var6 = 0; var12 < var5.length; var12 = var6) {
            Class17 var7 = var6 < this.iv.size() ? this.iv.get(var6) : null;
            if (var7 == null) {
               var7 = new Class17(this);
               this.iv.add(var7);
               this.add(var7);
            }

            int var13 = Integer.parseInt(var5[var6]);
            boolean var10002;
            Class22 var10003;
            if ((var3 >> var6 & 1L) == 1L) {
               var10002 = true;
               var10003 = this;
            } else {
               var10002 = false;
               var10003 = this;
            }

            var7.ma(var13, var10002, var10003.df(var1, var6++));
         }

         Class48.apn(this.abm, Class27.aaj(this.abi) == var1 ? 2 : (var1 > 0 && Class26.yq(this.abl[var1 - 1]) ? 1 : 0));
         Point var9 = this.df(100, var1);
         this.abm.setBounds(var9.x, var9.y, 48, 48);
      }
   }

   public static Image[] vw(int var0) {
      Image[] var1 = new Image[3];
      String var10002 = "[!\u0007 I,Omp\u0012j6F";
      com.xy.w.Class1 var2;
      if ((var2 = com.xy.w.Class11.f("sc/bang/XPBtn" + var0 + ".tcp", null)) != null) {
         var1[1] = com.xy.w.Class11.r(var2.y(), var2.b()[2], var2);
         var1[2] = com.xy.w.Class11.r(var2.y(), var2.b()[1], var2);
      }

      return var1;
   }

   // $VF: synthetic method
   static int vx(Class22 var0) {
      return var0.aa;
   }

   public Class22(GameView var1) {
      super(137, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 646, 464, com.xy.q.Class30.agf);
      this.abj = new Class40(this, -1);
      this.abj.setBounds(123, 376, 63, 58);
      this.add(this.abj);
      this.abi = new Class27(this);
      this.abi.setBounds(451, 340, 112, 124);
      this.add(this.abi);
      this.abm = new Class48(this);
      this.add(this.abm);
      this.abl = new Class26[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.abl.length; var10000 = var2) {
         this.abl[var2] = new Class26(this, var2 + 1);
         this.add(this.abl[var2++]);
      }

      this.iv = new ArrayList<>();
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (zk == null) {
         String var10000 = "1KmJ#F%\u0007\u001ax\u0000I!Cl\\!X";
         zk = com.xy.w.Class11.f("sc/bang/XPBack.tcp", null);
         zk.j(com.xy.v.Class22.l(), 0);
      }

      zk.ab(var1, 0, 0);
      if (this.vu() != null) {
         this.kl.j(com.xy.v.Class22.l(), 0);
         this.kl.ab(var1, 185, 75);
      }
   }

   // $VF: synthetic method
   static void vy(com.xy.w.Class1 var0) {
      abk = var0;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      int var10000 = 0;
      super.paintChildren(var1);

      for (int var2 = 0; var10000 < this.abl.length; var10000 = var2) {
         Class26 var3 = this.abl[var2];
         int var10002 = var2 + 1;
         var2++;
         var3.yn(this.abi.aai(var10002), var1);
      }

      if (Class48.apo(this.abm) == 2) {
         if (yv == null) {
            String var4 = "1KmE-]1MmN.A!C'Zl\\!X";
            yv = com.xy.w.Class11.f("sc/mouse/flicker.tcp", null);
         }

         yv.j(com.xy.v.Class22.l(), 0);
         yv.ab(var1, this.abm.getX(), this.abm.getY());
      }

      if (this.abh != -1L) {
         if (this.abg == null) {
            String var10001 = "ti(hfd`%_ZEkda^S)~dz";
            this.abg = com.xy.w.Class11.f("sc/bang/XPBackYY.tcp", null);
         }

         this.abg.j(Math.min(com.xy.v.Class22.l() - this.abh, this.abg.a() - 1), 0);
         this.abg.ab(var1, 322, 212);
         if (com.xy.v.Class22.l() - this.abh >= this.abg.a()) {
            this.abh = -1L;
         }
      }
   }

   // $VF: synthetic method
   static void vz(Class22 var0, long var1) {
      var0.abh = var1;
   }

   // $VF: synthetic method
   static long wa(Class22 var0) {
      return var0.abh;
   }

   public Point df(int var1, int var2) {
      if (var1 == 1) {
         if (var2 == 0) {
            return new Point(389, 200);
         }

         if (var2 == 1) {
            return new Point(288, 249);
         }

         if (var2 == 2) {
            return new Point(252, 164);
         }
      } else if (var1 == 2) {
         if (var2 == 0) {
            return new Point(336, 245);
         }

         if (var2 == 1) {
            return new Point(278, 274);
         }

         if (var2 == 2) {
            return new Point(233, 216);
         }

         if (var2 == 3) {
            return new Point(256, 125);
         }
      } else if (var1 == 3) {
         if (var2 == 0) {
            return new Point(399, 144);
         }

         if (var2 == 1) {
            return new Point(229, 270);
         }

         if (var2 == 2) {
            return new Point(302, 250);
         }

         if (var2 == 3) {
            return new Point(250, 201);
         }

         if (var2 == 4) {
            return new Point(348, 117);
         }
      } else if (var1 == 4) {
         if (var2 == 0) {
            return new Point(322, 244);
         }

         if (var2 == 1) {
            return new Point(268, 238);
         }

         if (var2 == 2) {
            return new Point(297, 199);
         }

         if (var2 == 3) {
            return new Point(390, 166);
         }

         if (var2 == 4) {
            return new Point(366, 112);
         }
      } else if (var1 == 5) {
         if (var2 == 0) {
            return new Point(394, 143);
         }

         if (var2 == 1) {
            return new Point(401, 190);
         }

         if (var2 == 2) {
            return new Point(232, 232);
         }

         if (var2 == 3) {
            return new Point(309, 213);
         }

         if (var2 == 4) {
            return new Point(244, 179);
         }

         if (var2 == 5) {
            return new Point(299, 137);
         }
      } else if (var1 == 6) {
         if (var2 == 0) {
            return new Point(335, 266);
         }

         if (var2 == 1) {
            return new Point(430, 200);
         }

         if (var2 == 2) {
            return new Point(354, 184);
         }

         if (var2 == 3) {
            return new Point(361, 130);
         }

         if (var2 == 4) {
            return new Point(296, 126);
         }
      } else if (var1 == 7) {
         if (var2 == 0) {
            return new Point(392, 290);
         }

         if (var2 == 1) {
            return new Point(363, 210);
         }

         if (var2 == 2) {
            return new Point(291, 166);
         }

         if (var2 == 3) {
            return new Point(298, 115);
         }
      } else if (var1 == 8) {
         if (var2 == 0) {
            return new Point(398, 142);
         }

         if (var2 == 1) {
            return new Point(347, 208);
         }

         if (var2 == 2) {
            return new Point(247, 274);
         }

         if (var2 == 3) {
            return new Point(236, 214);
         }
      } else if (var1 == 100) {
         if (var2 == 1) {
            return new Point(300, 85);
         }

         if (var2 == 2) {
            return new Point(353, 121);
         }

         if (var2 == 3) {
            return new Point(354, 259);
         }

         if (var2 == 4) {
            return new Point(300, 288);
         }

         if (var2 == 5) {
            return new Point(351, 260);
         }

         if (var2 == 6) {
            return new Point(206, 187);
         }

         if (var2 == 7) {
            return new Point(267, 270);
         }

         if (var2 == 8) {
            return new Point(357, 257);
         }
      }

      return new Point(0, 0);
   }

   public void h() {
      int var1 = 0;
      RoleData var2 = this.yx();
      com.xy.v.Class8 var3 = this.yt();

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.abl.length; var10000 = ++var4) {
         StarSoul var5 = var3.p(10000 + Class26.yp(this.abl[var4]));
         long var6 = var2.getPackRecord().getStarSoulType(var5.getId());
         int var8 = com.xy.v.Class12.ac('|', var5.getValue()) + 1;
         boolean var9 = true;

         boolean var14;
         label55: {
            int var10;
            for (int var13 = var10 = 0; var13 < var8; var13 = ++var10) {
               if ((var6 >> var10 & 1L) != 1L) {
                  var14 = var9 = false;
                  break label55;
               }
            }

            var14 = var9;
         }

         if (var14) {
            var1++;
         }

         Class26.yo(this.abl[var4], var9);
         int var12;
         if (this.aa + 10000 == var5.getId()) {
            for (int var15 = var12 = 0; var15 < var8; var15 = var12) {
               Class17 var11 = var12 < this.iv.size() ? this.iv.get(var12) : null;
               int var10001 = Class17.lz(var11);
               boolean var10002;
               Class22 var10003;
               if ((var6 >> var12 & 1L) == 1L) {
                  var10002 = true;
                  var10003 = this;
               } else {
                  var10002 = false;
                  var10003 = this;
               }

               var11.ma(var10001, var10002, var10003.df(this.aa, var12++));
            }
         }
      }

      this.abi.g(var1);
      this.abi.n((int)var2.getPackRecord().getStarSoulType(20000));
      Class48.apn(this.abm, Class27.aaj(this.abi) == this.aa ? 2 : (this.aa > 0 && Class26.yq(this.abl[this.aa - 1]) ? 1 : 0));
   }
}
