package com.xy.a.q;

import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class69 extends JComponent implements MouseListener {
   private Class77[] aia;
   // $VF: synthetic field
   final Class81 aib;
   private int cb;
   private JLabel[] ay;
   private com.xy.w.Class18 af;
   private long fh;
   private RichLabel bj;

   // $VF: synthetic method
   static void aak(Class69 var0, int var1) {
      var0.cb = var1;
   }

   // $VF: synthetic method
   static JLabel[] aal(Class69 var0) {
      return var0.ay;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   // $VF: synthetic method
   static long aam(Class69 var0) {
      return var0.fh;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.isMetaDown()) {
         Class81.adm(this.aib).setVisible(false);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   // $VF: synthetic method
   static void aan(Class69 var0, long var1) {
      var0.fh = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   // $VF: synthetic method
   static Class77[] aao(Class69 var0) {
      return var0.aia;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (Class81.acz() == null) {
         String var10000 = "\u007f\u000b#\f#[:F|\u0006k";
         Class81.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      }

      Class81.acz().g(var1, this.getWidth(), this.getHeight());
   }

   // $VF: synthetic method
   static int aap(Class69 var0) {
      return var0.cb;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public Class69(Class81 var1) {
      this.aib = var1;
      this.setBounds(217, 32, 340, 356);
      this.setVisible(false);
      this.ay = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ay.length; var10000 = ++var2) {
         this.ay[var2] = com.xy.q.Class1.k(40, 20, 258, 17, Color.black, com.xy.q.Class49.ch);
         JLabel var4 = this.ay[var2];
         String var6;
         if (var2 == 0) {
            var6 = "筩g冿坽厩啣儸盃镣嚍";
            var6 = "第 出场召唤兽的锦囊";
         } else {
            var6 = var2 == 1 ? "1" : "";
         }

         var4.setText(var6);
         this.ay[var2].setHorizontalAlignment(0);
         this.add(this.ay[var2]);
         if (var2 == 1) {
            this.ay[var2].setForeground(Color.red);
            this.ay[var2].setBounds(98, 20, 22, 17);
         }
      }

      this.bj = new RichLabel("", com.xy.q.Class49.w);
      String var10006 = "KoX<X<X<湁馤掸礶ｲ叠啌共盬丨乂锪嚢伖呤旺畷敄";
      this.bj.setTextSize("#c000000温馨提示：召唤兽的两个锦囊会同时生效", 280);
      this.bj.setBounds(36, 313, this.bj.getWidth(), this.bj.getHeight());
      this.add(this.bj);
      this.af = new com.xy.w.Class18();
      String var10007 = "4&h!ht~k7+ ";
      this.af.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.af.setBounds(40, 45, 258, 258);
      this.add(this.af);
      this.aia = new Class77[25];

      for (int var5 = var2 = 0; var5 < this.aia.length; var5 = var2) {
         this.aia[var2] = new Class77(var1);
         this.aia[var2].setBounds(41 + var2 % 5 * 51, 47 + var2 / 5 * 51, 49, 49);
         this.add(this.aia[var2++]);
      }

      this.addMouseListener(this);
   }
}
