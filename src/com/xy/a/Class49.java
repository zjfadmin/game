package com.xy.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class49 implements MouseListener {
   private JLabel ad;
   // $VF: synthetic field
   final Class121 vu;
   private boolean il;
   private int eg;
   private com.xy.w.Class18 dn;

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   // $VF: synthetic method
   static com.xy.w.Class18 ri(Class49 var0) {
      return var0.dn;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public Class49(Class121 var1, int var2, Class121 var3) {
      this.vu = var1;
      this.eg = var2;
      this.ad = com.xy.q.Class1.k(0, 0, 0, 0, com.xy.q.Class49.h, com.xy.q.Class49.ac);
      String var4;
      if (var2 == 0) {
         var4 = "儃邬";
         var4 = "全部";
      } else if (var2 == 1) {
         var4 = "佰遂";
         var4 = "传送";
      } else if (var2 == 2) {
         var4 = "昅遞";
         var4 = "普通";
      } else if (var2 == 3) {
         var4 = "享勢";
         var4 = "任务";
      } else if (var2 == 4) {
         var4 = "唭乞";
         var4 = "商业";
      } else {
         var4 = "";
      }

      this.ad.setText(var4);
      this.il = var2 == 1;
      String var9;
      if (this.il) {
         var9 = "# \u007f&\u007fr`z~3>$";
         var9 = "sc/e/109.png";
      } else {
         var9 = "\u0018'D!Du[|E4\u0005#";
         var9 = "sc/e/108.png";
      }

      com.xy.w.Class18 var10000 = new com.xy.w.Class18(var9);
      this.dn = var10000;
      this.dn.addMouseListener(this);
      var3.add(this.ad);
      var3.add(this.dn);
   }

   // $VF: synthetic method
   static JLabel rj(Class49 var0) {
      return var0.ad;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      this.il = !this.il;
      String var4;
      if (this.il) {
         var4 = "# \u007f&\u007fr`z~3>$";
         var4 = "sc/e/109.png";
      } else {
         var4 = "\u0018'D!Du[|E4\u0005#";
         var4 = "sc/e/108.png";
      }

      this.dn.dp(var4);
      int var2 = this.eg == 0 ? 1 : Class121.akf(this.vu).length;

      for (int var10000 = var2; var10000 < Class121.akf(this.vu).length; var10000 = ++var2) {
         Class121.akf(this.vu)[var2].il = this.il;
         com.xy.w.Class18 var3 = Class121.akf(this.vu)[var2].dn;
         if (Class121.akf(this.vu)[var2].il) {
            var4 = "# \u007f&\u007fr`z~3>$";
            var4 = "sc/e/109.png";
         } else {
            var4 = "\u0018'D!Du[|E4\u0005#";
            var4 = "sc/e/108.png";
         }

         var3.dp(var4);
      }

      this.vu.e();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   // $VF: synthetic method
   static boolean rk(Class49 var0) {
      return var0.il;
   }
}
