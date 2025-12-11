package com.xy.a.q;

import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Graphics;

public class Class19 extends com.xy.q.Class30 {
   private Class27 oy;
   private com.xy.w.Class18[] aw;
   private Class31 oz;
   private com.xy.w.Class0 mw;
   private com.xy.i.Class19[] pa;
   private int eg;
   private Class60[] pb;

   public void y(int var1) {
      if (!this.dh()) {
         if (this.eg != var1) {
            com.xy.w.Class18 var10000 = this.aw[1];
            String var4;
            if (var1 == 0) {
               var4 = "4#h\"h\u0013trrn7. ";
               var4 = "sc/b/S325.png";
            } else {
               var4 = "A\n\u001d\u000b\u001d:\u0001[\u0004GB\u0007U";
               var4 = "sc/b/S326.png";
            }

            var10000.dp(var4);
         }

         this.eg = var1;

         int var2;
         for (int var3 = var2 = 0; var3 < this.pa.length; var3 = ++var2) {
            this.pa[var2].setKeep(var2 == this.eg);
         }

         if (this.eg == 0) {
            if (this.oy != null) {
               this.oy.setVisible(false);
            }

            if (this.oz == null) {
               this.oz = new Class31(this);
               this.add(this.oz, 2);
            }

            this.oz.setVisible(true);
         } else {
            if (this.eg == 1) {
               if (this.oz != null) {
                  this.oz.setVisible(false);
               }

               if (this.oy == null) {
                  this.oy = new Class27(this);
                  this.add(this.oy, 2);
               }

               this.oy.setVisible(true);
            }
         }
      }
   }

   public void f() {
      RoleData var1 = this.yx();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.pb.length; var10000 = var2) {
         RolePet var3 = var1.getBBRolePet(var2 + 1);
         this.pb[var2++].lc(var3);
      }
   }

   @Override
   public void l() {
      if (!this.dh()) {
         this.f();
         this.h();
         this.y(0);
         super.l();
      }
   }

   // $VF: synthetic method
   static int ld(Class19 var0) {
      return var0.eg;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.mw != null) {
         this.mw.r(var1, 149, 210, 4, com.xy.v.Class22.l());
      }
   }

   public Class31 le() {
      return this.oz;
   }

   public Class19(GameView var1) {
      super(135, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "3$o#ovn7. ";
      this.eg = -1;
      this.yy(-1, 0, 602, 375, com.xy.q.Class30.agh);
      com.xy.w.Class9 var13 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "叞啍兏殽斥";
      this.yu(var13, "召唤兽比斗");
      this.pa = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.pa.length; var10000 = var2) {
         com.xy.i.Class19[] var5 = this.pa;
         var10004 = "4#h%hs\u007fn7. ";
         int var10006 = 206 + var2;
         String var16;
         Class19 var10010;
         if (var2 == 0) {
            var16 = "匼挣珢耷";
            var16 = "单挑王者";
            var10010 = this;
         } else if (var2 == 1) {
            var16 = "杀彽嚢陘";
            var16 = "最强团队";
            var10010 = this;
         } else {
            var16 = "";
            var10010 = this;
         }

         com.xy.i.Class19 var10002 = new com.xy.i.Class19("sc/e/38.png", 2, var10006, Class49.bx, Class49.bv, var16, var10010);
         var5[var2] = var10002;
         this.pa[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.pa[var2].setBounds(64 + 102 * var2, 18, 95, 33);
         this.add(this.pa[var2++]);
      }

      this.pb = new Class60[4];

      for (int var6 = var2 = 0; var6 < this.pb.length; var6 = var2) {
         String var10008 = "A\n\u001d\u000b\u001d+\u0006]\u0003GB\u0007U";
         this.pb[var2] = new Class60(this, "sc/b/B441.png", 1, var2 + 1);
         this.pb[var2].setBounds(67 + var2 * 42, 234, 42, 55);
         this.add(this.pb[var2++]);
      }

      this.aw = new com.xy.w.Class18[2];

      for (int var7 = var2 = 0; var7 < this.aw.length; var7 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         Class19 var8;
         if (var2 == 0) {
            var8 = this;
            com.xy.w.Class18 var11 = this.aw[var2];
            var10003 = "4#h$hsrn7. ";
            var11.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
            this.aw[var2].setBounds(50, 32, 430, 20);
         } else {
            if (var2 == 1) {
               this.aw[var2].setBounds(50, 51, 519, 290);
            }

            var8 = this;
         }

         var8.add(this.aw[var2++]);
      }
   }

   public void ab(int var1, boolean var2) {
      if (var1 == 0 && this.oz != null) {
         this.oz.be(var2);
      } else {
         if (var1 == 1 && this.oy != null) {
            this.oy.be(var2);
         }
      }
   }

   public void h() {
      RoleData var10000 = this.yx();
      long var2 = var10000.getLoginResult().getSpecies_id().longValue();
      Goodstable var4;
      long var5;
      if ((var4 = var10000.getGoodEquip(var10000.goodChoses[0])) != null && (var5 = GameUtil.a(Integer.parseInt(var4.getSkin()))) != 0L) {
         long var7;
         var2 |= (var7 = var5 + 18L) << 32;
      }

      if (this.mw == null) {
         this.mw = com.xy.w.Class11.p(var2, 2, 1, null);
      } else {
         boolean var10005 = true;
         this.mw = com.xy.w.Class11.ah(this.mw, 1, String.valueOf(var2));
      }
   }

   public Class27 lf() {
      return this.oy;
   }

   public boolean dh() {
      return this.oz != null && this.oz.ah() ? true : this.oy != null && this.oy.ah();
   }

   @Override
   public boolean ah() {
      if (this.dh()) {
         String var10002 = "伉歑坁匋鄤丟斉泧儚闟霋杍";
         this.afx._do("你正在匹配中无法关闭面板");
         return false;
      } else {
         this.mw = null;
         return super.ah();
      }
   }

   public void g(int var1) {
      if (var1 == 208) {
         if (this.oy != null && this.oy.ah()) {
            String var20 = "传欤坨卾鄍嚥陟厫啤儺殔旐";
            this.afx._do("你正在匹配团队召唤兽比斗");
         } else {
            boolean var5 = this.oz != null && this.oz.ah();
            String var18;
            if (var5) {
               var18 = "\u0001X\u0003";
               var18 = "311";
            } else {
               var18 = "tqw";
               var18 = "310";
            }

            String var7 = Agreement.getSendTextAES("petArena", var18);
            this.za().k(var7);
         }
      } else if (var1 == 211) {
         if (this.oz != null && this.oz.ah()) {
            String var16 = "伉歑坁匋鄤卧仓叞啍兏殽斥";
            this.afx._do("你正在匹配单人召唤兽比斗");
         } else {
            boolean var4 = this.oy != null && this.oy.ah();
            String var14;
            if (var4) {
               var14 = "tqt";
               var14 = "313";
            } else {
               var14 = "\u0001X\u0000";
               var14 = "312";
            }

            String var6 = Agreement.getSendTextAES("petArena", var14);
            this.za().k(var6);
         }
      } else {
         String var2 = null;
         String var8;
         if (var1 == 209) {
            var8 = "trw";
            var8 = var2 = "320";
         } else if (var1 == 210) {
            var8 = "\u0001[\u0003";
            var8 = var2 = "321";
         } else if (var1 == 212) {
            var8 = "tsw";
            var8 = var2 = "330";
         } else if (var1 == 213) {
            var8 = "\u0001Z\u0003";
            var8 = var2 = "331";
         } else if (var1 == 214) {
            var8 = "tsu";
            var8 = var2 = "332";
         } else {
            if (var1 == 215) {
               var8 = "\u0001Z\u0001";
               var2 = "333";
            }

            var8 = var2;
         }

         if (var8 != null) {
            String var3 = Agreement.getSendTextAES("petArena", var2);
            this.za().k(var3);
         }
      }
   }
}
