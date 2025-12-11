package com.xy.a.a;

import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class27 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] bb;
   private int aa;
   private com.xy.q.Class50 za;
   private JLabel df;
   private Class47 zb;
   private Class3 zc;
   private Class10[] zd;
   private com.xy.i.Class4 ze;
   private com.xy.w.Class1 zf = null;

   public Class27(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 743, 519, com.xy.q.Class30.agf);
      String var10011 = "t\u0004c#d\"e!";
      this.df = com.xy.q.Class1.k(112, 267, 40, 19, com.xy.q.Class49.c("#c4D3E2F"), com.xy.q.Class49.ao);
      String var10006 = "乲夊";
      this.df.setText("中天");
      this.df.setHorizontalAlignment(0);
      this.add(this.df);
      this.za = new Class40(this);
      this.za.setBounds(50, 195, 200, 160);
      this.zd = new Class10[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.zd.length; var10000 = var2) {
         Class10[] var4 = this.zd;
         int var7 = var2;
         Class10 var10001 = new Class10(this, var2, this);
         var2++;
         var4[var7] = var10001;
      }

      String var10009 = "$\u0004x\u0002xV`Sy\u00179\u0000";
      String var10014 = "匘纄";
      this.ze = new com.xy.i.Class4("sc/e/174.png", 1, 191, com.xy.q.Class49.ao, null, "升级", this);
      var10006 = "t\u0004bVe%gV";
      this.ze.setForeground(com.xy.q.Class49.c("#c512B01"));
      this.ze.setBounds(421, 450, 120, 33);
      this.add(this.ze);
      this.zb = new Class47(this);
      this.zc = new Class3(this);
      this.add(this.zb);
      this.add(this.zc);
      this.bb = new com.xy.w.Class18[2];

      for (int var5 = var2 = 0; var5 < this.bb.length; var5 = var2) {
         this.bb[var2] = new com.xy.w.Class18();
         Class27 var6;
         if (var2 == 0) {
            var6 = this;
            com.xy.w.Class18 var9 = this.bb[var2];
            String var12 = ",@pGp\u0012h\u0017qS1D";
            var9.dp("sc/d/174.png");
            this.bb[var2].setBounds(55, 189, 170, 178);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var8 = this.bb[var2];
               String var10 = "$\u0004x\u0003xVaQy\u00179\u0000";
               var8.dp("sc/d/166.png");
               this.bb[var2].setBounds(47, 50, 668, 447);
            }

            var6 = this;
         }

         var6.add(this.bb[var2++]);
      }
   }

   // $VF: synthetic method
   static void ts(Class27 var0, com.xy.w.Class1 var1) {
      var0.zf = var1;
   }

   public void cr(boolean var1) {
      this.zb.be(var1);
   }

   // $VF: synthetic method
   static com.xy.q.Class50 tt(Class27 var0) {
      return var0.za;
   }

   public int dx() {
      return this.aa;
   }

   public void e() {
      this.aa = 0;
      this.f();
   }

   public void f() {
      RoleData var1 = this.yx();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.zd.length; var10000 = var2) {
         JLabel var3 = Class10.c(this.zd[var2]);
         BaseMountSH var10001 = var1.getMountSHByindex(var2);
         var2++;
         var3.setText(String.valueOf(var10001.getLvl()));
      }

      this.g(this.aa);
   }

   public void g(int var1) {
      this.aa = var1;
      this.za.setVisible(this.aa == 0);

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.zd.length; var10000 = ++var2) {
         boolean var3 = var2 == this.aa;
         if (Class10.b(this.zd[var2]).ah() != var3) {
            Class10.b(this.zd[var2]).setKeep(var3);
            this.zd[var2].a();
         }
      }

      RoleData var4 = this.yx();
      if (this.aa == 0) {
         this.zb.am(var4);
         this.zb.setVisible(true);
         this.zc.setVisible(false);
      } else {
         this.zc.ae(this.aa, var4);
         this.zc.setVisible(true);
         this.zb.setVisible(false);
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class1 tu(Class27 var0) {
      return var0.zf;
   }

   // $VF: synthetic method
   static int tv(Class27 var0) {
      return var0.aa;
   }

   public void bb(Goodstable var1) {
      this.zb.bb(var1);
   }

   public void h() {
      this.zf = null;
   }
}
