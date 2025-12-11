package com.xy.a.q;

import com.xy.bean.PayvipBean;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class113 extends JComponent implements MouseListener {
   private JLabel ad;
   // $VF: synthetic field
   final Class106 axu;
   private com.xy.w.Class18[] j;
   private PayvipBean axv;
   private com.xy.i.Class16 atd;

   // $VF: synthetic method
   static com.xy.i.Class16 anl(Class113 var0) {
      return var0.atd;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.axu.afx.getFormManagement().f(46);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   // $VF: synthetic method
   static PayvipBean anm(Class113 var0) {
      return var0.axv;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      ((com.xy.a.Class48)this.axu.afx.getFormManagement().j(46)).qx(this.axv);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public void qx(PayvipBean var1) {
      if ((this.axv = var1) == null) {
         this.setVisible(false);
      } else {
         com.xy.w.Class18 var10004 = this.j[0];
         String var10007 = ";\u0004g\u000e<\u0002%H\u001b";
         var10004.dp("sc/item/S" + (19 + var1.getGrade()) + ".png");
         com.xy.w.Class18 var10003 = this.j[1];
         String var10006 = "/)s#(/1e\u000f";
         var10003.dp("sc/item/S" + (9 + var1.getGrade()) + ".png");
         JLabel var10002 = this.ad;
         String var10005 = "\u001e";
         StringBuilder var2 = new StringBuilder("V").append(var1.getGrade());
         String var3 = "佐各夜勭";
         var10002.setText(var2.append("会员奖励").toString());
         this.setVisible(true);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public Class113(Class106 var1) {
      this.axu = var1;
      this.setPreferredSize(new Dimension(115, 165));
      String var10009 = "9?e9ekd,$;";
      String var10014 = "飡厞";
      this.atd = new com.xy.i.Class16("sc/e/7.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领取", var1.eg());
      this.atd.ajh(this);
      this.atd.setBounds(28, 140, 59, 25);
      this.add(this.atd);
      this.ad = com.xy.q.Class1.f(0, 120, 115, 20, 0, Color.black, com.xy.q.Class49.ch);
      this.add(this.ad);
      this.j = new com.xy.w.Class18[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.j.length; var10000 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         Class113 var3;
         if (var2 == 0) {
            var3 = this;
            this.j[var2].setBounds(2, 2, 40, 35);
         } else if (var2 == 1) {
            var3 = this;
            this.j[var2].setBounds(2, 2, 110, 110);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var10002 = this.j[var2];
               String var10003 = "9?e>eod,$;";
               var10002.dp("sc/b/3.png");
               this.j[var2].setBounds(0, 0, 115, 115);
               this.j[var2].addMouseListener(this);
            }

            var3 = this;
         }

         var3.add(this.j[var2++]);
      }
   }
}
