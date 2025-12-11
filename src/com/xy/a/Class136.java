package com.xy.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class136 implements MouseListener {
   private boolean dr;
   private com.xy.w.Class18 af;
   private int eg;
   // $VF: synthetic field
   final Class106 ayd;

   // $VF: synthetic method
   static boolean ano(Class136 var0) {
      return var0.dr;
   }

   // $VF: synthetic method
   static void anp(Class136 var0, com.xy.w.Class18 var1) {
      var0.af = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.eg == 0) {
         if (Class106.agd(this.ayd) == 0 || Class106.agd(this.ayd) == 1) {
            if (this.dr) {
               Class106 var2 = this.ayd;
               Class106 var6 = this.ayd;
               Class106.afv(this.ayd, 0L);
               Class106.afz(var6, 0L);
               Class106.afy(var2, 0L);
               JLabel var10007 = Class106.agc(this.ayd)[8];
               String var10008 = "涟聺釆铜－]丳";
               var10007.setText("消耗金钱：0两");
               JLabel var10006 = Class106.agc(this.ayd)[9];
               String var8 = "淡耾亰玠ｳ\u0019亰玠";
               var10006.setText("消耗仙玉：0仙玉");
               JLabel var10005 = Class106.agc(this.ayd)[10];
               String var7 = "淥耀红骛ｷ'红骛";
               var10005.setText("消耗经验：0经验");
               Class106.aft(this.ayd)[3].be(false);
               Class106.aft(this.ayd)[4].be(false);
               Class106.aft(this.ayd)[5].be(false);
               Class106.agc(this.ayd)[7].setText(null);
               Class106.agb(this.ayd)[1].setText(null);
            }

            this.be(!this.dr);
            return;
         }
      } else {
         if (this.eg == 1 || this.eg == 2) {
            this.be(!this.dr);
            return;
         }

         if ((this.eg == 3 || this.eg == 4 || this.eg == 5) && (Class106.agd(this.ayd) == 0 || Class106.agd(this.ayd) == 1) && Class106.aft(this.ayd)[0].dr) {
            Class106.aft(this.ayd)[3].be(this.eg == 3);
            Class106.aft(this.ayd)[4].be(this.eg == 4);
            Class106.aft(this.ayd)[5].be(this.eg == 5);
            JLabel var10000 = Class106.agc(this.ayd)[7];
            String var3;
            if (this.eg == 3) {
               var3 = "不";
               var3 = "两";
            } else if (this.eg == 4) {
               var3 = "亴玞";
               var3 = "仙玉";
            } else {
               var3 = "约骥";
               var3 = "经验";
            }

            var10000.setText(var3);
            Class106.agb(this.ayd)[1]
               .setText(String.valueOf(this.eg == 3 ? Class106.aga(this.ayd) : (this.eg == 4 ? Class106.afx(this.ayd) : Class106.afu(this.ayd))));
         }
      }
   }

   // $VF: synthetic method
   static void anq(Class136 var0, int var1) {
      var0.eg = var1;
   }

   public void be(boolean var1) {
      this.dr = var1;
      if (this.eg < 3) {
         String var5;
         if (var1) {
            var5 = "d\u000e8\b8^'Cg\u0003p";
            var5 = "sc/e/30.png";
         } else {
            var5 = "Z\n\u0006\f\u0006[\u0010GY\u0007N";
            var5 = "sc/e/29.png";
         }

         this.af.dp(var5);
      } else {
         String var2;
         if (var1) {
            var2 = "d\u000e8\b8[%Cg\u0003p";
            var2 = "sc/e/62.png";
         } else {
            var2 = "Z\n\u0006\f\u0006_\u001aGY\u0007N";
            var2 = "sc/e/63.png";
         }

         this.af.dp(var2);
      }
   }

   Class136(Class106 var1) {
      this.ayd = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }
}
