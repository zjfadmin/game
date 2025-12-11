package com.xy.a.q;

import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Eshop;
import com.xy.readbean.RoleTxBean;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JLabel;

public class Class79 extends com.xy.q.Class30 {
   private int ia = 1;
   private int gy;
   private JLabel xg;
   private com.xy.i.Class19[] hi;
   private int aa = 1;
   private Class102[] akx;
   private com.xy.w.Class0 or;
   private int cb;
   private com.xy.q.Class14 iu;
   private com.xy.w.Class18 af;
   private Eshop[] aky;
   private com.xy.i.Class19[] afg;

   public void lm(int var1) {
      Eshop var2;
      if ((var2 = this.aky[var1]) != null) {
         this.aky[var1] = null;
         RoleTxBean var3;
         if ((var3 = this.yt().ci(-Integer.parseInt(var2.getEshopiid()))) != null) {
            String var10004 = "\tFRJ\u0005";
            this.or = this.or.s("tx/tx" + var3.getRdId());
         }

         int var4 = 0;

         int var5;
         for (int var10000 = var5 = 0; var10000 < this.aky.length; var10000 = ++var5) {
            if (this.aky[var5] != null) {
               var4++;
            }
         }

         String var10003 = "裂戆敷ｲ";
         this.xg.setText("装扮数：" + var4);
      }
   }

   public void qw(Eshop var1) {
      if (var1 != null) {
         String var10000 = var1.getEshoptype();
         String var10001 = "\u000fL";
         if (var10000.equals("11")) {
            boolean var7 = false;
         } else {
            var10000 = var1.getEshoptype();
            var10001 = "6Z";
            int var9 = var10000.equals("12") ? 1 : 2;
         }

         RoleTxBean var3;
         if ((var3 = this.yt().ci(-Integer.parseInt(var1.getEshopiid()))) != null) {
            int var2 = var3.getRdType() - 1;
            this.lm(var2);
            this.aky[var2] = var1;
            String var10004 = "\tFRJ\u0005";
            com.xy.w.Class0 var4 = com.xy.w.Class11.t("tx/tx" + var3.getRdId(), -2, var3.getRdStatues() - var3.getRdType(), null);
            this.or = this.or.q(var4);
         }

         int var6 = 0;

         int var5;
         for (int var10 = var5 = 0; var10 < this.aky.length; var10 = ++var5) {
            if (this.aky[var5] != null) {
               var6++;
            }
         }

         String var10003 = "裂戆敷ｲ";
         this.xg.setText("装扮数：" + var6);
      }
   }

   public void bi(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.akx.length; var10000 = var2) {
         this.akx[var2].t();
         this.akx[var2++].setVisible(false);
      }

      Class79 var11;
      if (var1 <= 0) {
         var1 = 1;
         var11 = this;
      } else {
         if (var1 >= this.aa) {
            var1 = this.aa;
         }

         var11 = this;
      }

      var11.ia = var1;
      com.xy.q.Class14 var14 = this.iu;
      StringBuilder var10002 = new StringBuilder(String.valueOf(this.ia));
      String var10003 = "R";
      var14.setText(var10002.append("/").append(this.aa).toString());
      var2 = 0;
      int var3 = 0;
      int var4 = (var1 - 1) * 6;
      String var5 = String.valueOf(11 + this.gy);
      String var15 = "仞珡";
      String var6 = "仙玉";
      List var7 = this.yt().i();

      int var8;
      for (int var12 = var8 = 0; var12 < var7.size(); var12 = ++var8) {
         Eshop var9;
         if ((var9 = (Eshop)var7.get(var8)).getEshoptype().equals(var5)) {
            if (var2 >= var4) {
               Class102 var13 = this.akx[var3];
               var3++;
               var13.alc(var9, var6);
               if (var3 >= this.akx.length) {
                  return;
               }
            }

            var2++;
         }
      }
   }

   public void cr(boolean var1) {
      if (this.cb == 0) {
         this.cb = var1 ? 4 : 7;
      } else if (this.cb == 1) {
         this.cb = var1 ? 5 : 4;
      } else if (this.cb == 2) {
         this.cb = var1 ? 6 : 5;
      } else if (this.cb == 3) {
         this.cb = var1 ? 7 : 6;
      } else if (this.cb == 4) {
         this.cb = var1 ? 1 : 0;
      } else if (this.cb == 5) {
         this.cb = var1 ? 2 : 1;
      } else if (this.cb == 6) {
         this.cb = var1 ? 3 : 2;
      } else {
         if (this.cb == 7) {
            this.cb = var1 ? 0 : 3;
         }
      }
   }

   public void y(int var1) {
      if (var1 == 274) {
         this.bi(1);
      } else if (var1 == 275) {
         this.bi(this.aa);
      } else if (var1 == 276) {
         this.bi(this.ia - 1);
      } else if (var1 == 277) {
         this.bi(this.ia + 1);
      } else if (var1 == 278) {
         this.cr(true);
      } else if (var1 == 279) {
         this.cr(false);
      } else if (var1 == 280) {
         this.lm(0);
         this.lm(1);
         this.lm(2);
      } else {
         if (var1 == 281) {
            ((Class23)this.zc().j(51)).ly(this.aky);
         }
      }
   }

   public int dx() {
      int var1 = 0;
      String var2 = String.valueOf(11 + this.gy);
      List var3 = this.yt().i();

      int var4;
      for (int var10000 = var4 = 0; var10000 < var3.size(); var10000 = ++var4) {
         if (((Eshop)var3.get(var4)).getEshoptype().equals(var2)) {
            var1++;
         }
      }

      return var1;
   }

   public void f() {
      int var10000 = 0;
      this.or = null;

      for (int var1 = 0; var10000 < this.aky.length; var10000 = var1) {
         this.aky[var1++] = null;
      }

      String var2 = "袭扩攘＝X";
      this.xg.setText("装扮数：0");
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.or != null) {
         this.or.r(var1, 158, 292, this.cb, com.xy.v.Class22.l());
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.gy = var1;

      for (int var2 = 0; var10000 < this.afg.length; var10000 = ++var2) {
         this.afg[var2].setKeep(var2 == this.gy);
      }

      int var3;
      this.aa = (var3 = this.dx()) % 6 == 0 ? var3 / 6 : var3 / 6 + 1;
      this.bi(1);
   }

   public Class79(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 682, 475, com.xy.q.Class30.agf);
      this.aky = new Eshop[3];
      this.afg = new com.xy.i.Class19[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.afg.length; var10000 = var2) {
         com.xy.i.Class19[] var5 = this.afg;
         String var10004 = "\u000e]R[R\rD\u0010\rP\u001a";
         int var10006 = 271 + var2;
         String var27;
         Class79 var10010;
         if (var2 == 0) {
            var27 = "牾攠";
            var27 = "特效";
            var10010 = this;
         } else if (var2 == 1) {
            var27 = "袸饎咼";
            var27 = "装饰品";
            var10010 = this;
         } else if (var2 == 2) {
            var27 = "趴辑";
            var27 = "足迹";
            var10010 = this;
         } else {
            var27 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var27, var10010);

         var5[var2] = var10002;
         this.afg[var2].setBounds(443 + 65 * var2, 73, 63, 24);
         this.add(this.afg[var2++]);
      }

      this.akx = new Class102[6];

      for (int var6 = var2 = 0; var6 < this.akx.length; var6 = var2) {
         this.akx[var2] = new Class102(this);
         this.akx[var2].setBounds(284 + var2 % 3 * 125, 96 + var2 / 3 * 165, 115, 150);
         this.add(this.akx[var2++]);
      }

      this.hi = new com.xy.i.Class19[8];

      for (int var7 = var2 = 0; var7 < this.hi.length; var7 = var2) {
         com.xy.i.Class19[] var8 = this.hi;
         String var23 = "M\u001e\u0011\u0018\u0011K\u0010\rP\u001a";
         int var26 = 274 + var2;
         String var31;
         Class79 var35;
         if (var2 == 0) {
            var31 = "馑頝";
            var31 = "首页";
            var35 = this;
         } else if (var2 == 1) {
            var31 = "朕須";
            var31 = "末页";
            var35 = this;
         } else if (var2 == 6) {
            var31 = "卿阌";
            var31 = "卸除";
            var35 = this;
         } else if (var2 == 7) {
            var31 = "诫稂";
            var31 = "试穿";
            var35 = this;
         } else {
            var31 = "";
            var35 = this;
         }

         com.xy.i.Class19 var19 = new com.xy.i.Class19("sc/e/6.png", 1, var26, com.xy.q.Class49.bz, null, var31, var35);
         var8[var2] = var19;
         this.hi[var2].setBounds(264 + 140 * var2, 435, 34, 18);
         Class79 var11;
         if (var2 != 2 && var2 != 3) {
            if (var2 != 4 && var2 != 5) {
               if (var2 == 6 || var2 == 7) {
                  this.hi[var2].setBounds(185 + 40 * (var2 - 6), 391, 34, 18);
               }

               var11 = this;
            } else {
               Class79 var12;
               if (var2 == 4) {
                  var12 = this;
                  com.xy.i.Class19 var15 = this.hi[var2];
                  String var21 = "\u001bdGbG4Z)\u0018i\u000f";
                  var15.setImage("sc/e/32.png");
               } else {
                  if (var2 == 5) {
                     com.xy.i.Class19 var13 = this.hi[var2];
                     String var16 = "\u000e]R[R\rI\u0010\rP\u001a";
                     var13.setImage("sc/e/34.png");
                  }

                  var12 = this;
               }

               var12.hi[var2].setBounds(139 + 35 * (var2 - 4), 353, 11, 15);
               var11 = this;
            }
         } else {
            Class79 var9;
            if (var2 == 2) {
               var9 = this;
               com.xy.i.Class19 var10001 = this.hi[var2];
               String var20 = "\u001bdGbG3Z)\u0018i\u000f";
               var10001.setImage("sc/e/42.png");
            } else {
               if (var2 == 3) {
                  com.xy.i.Class19 var10 = this.hi[var2];
                  String var14 = "\u000e]R[R\nN\u0010\rP\u001a";
                  var10.setImage("sc/e/43.png");
               }

               var9 = this;
            }

            var9.hi[var2].setBounds(301 + 82 * (var2 - 2), 435, 18, 18);
            var11 = this;
         }

         var11.add(this.hi[var2++]);
      }

      this.xg = com.xy.q.Class1.k(53, 392, 130, 16, Color.black, com.xy.q.Class49.y);
      String var24 = "袭扩攘＝X";
      this.xg.setText("装扮数：0");
      this.xg.setHorizontalAlignment(10);
      this.add(this.xg);
      this.iu = com.xy.q.Class1.i(322, 435, 58, 18, 0, Color.white, com.xy.q.Class49.w);
      var24 = "\u000e]RZR\u000fJ\u0010\rP\u001a";
      this.iu.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.iu);
      String var10008 = "\u001bdGcG6^)\u0018i\u000f";
      this.af = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
      this.af.setBounds(53, 98, 218, 292);
      this.add(this.af);
   }

   public void h() {
      this.or = com.xy.w.Class11.t(this.yx().getLoginResult().getSpecies_id().toString(), 2, 1, null);

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aky.length; var10000 = var2) {
         this.aky[var2++] = null;
      }

      String var10003 = "袸扐攍ＤM";
      this.xg.setText("装扮数：0");
      this.g(0);
   }
}
