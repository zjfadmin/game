package com.xy.a;

import com.xy.bean.StallNeedBean;
import com.xy.readbean.StallBuyData;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class53 extends com.xy.q.Class50 implements MouseListener {
   private com.xy.w.Class18 gf;
   private JLabel df;
   private com.xy.q.Class54 yk;
   // $VF: synthetic field
   final Class127 yl;
   private com.xy.q.Class14 oo;
   private Class53 ym;
   private JLabel im;

   // $VF: synthetic method
   static Class53 sx(Class53 var0) {
      return var0.ym;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.yl.amb(null, (StallNeedBean)this.yk.jx());
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public void gg(StallNeedBean var1) {
      if (var1 != null && var1.getTotal() - var1.getNum() > 0) {
         StallBuyData var2 = this.yl.yt().cb(var1.getId());
         this.yk.gs(25, var1);
         String var10001;
         if (var2 != null) {
            var10001 = var2.getName();
         } else {
            var10001 = "朓瞐牐咴";
            var10001 = "未知物品";
         }

         this.im.setText(var10001);
         this.df.setText(String.valueOf(var1.getTotal() - var1.getNum()));
         this.oo.setText(String.valueOf(var1.getMoney()));
         this.setVisible(true);
      } else {
         this.yk.gs(0, null);
         this.setVisible(false);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public Class53(Class127 var1) {
      this.yl = var1;
      this.ym = this;
      this.im = com.xy.q.Class1.k(56, 8, 72, 16, Color.black, com.xy.q.Class49.n);
      this.df = com.xy.q.Class1.k(6, 6, 40, 14, Color.white, com.xy.q.Class49.n);
      this.oo = com.xy.q.Class1.i(54, 24, 72, 19, 10, Color.white, com.xy.q.Class49.w);
      String var10007 = "P<\f;\fn\u0014qS1D";
      this.oo.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.yk = new Class131(this, var1.eg());
      String var10006 = "\u0006ZZ]Z\u0001D\u0017\u0005W\u0012";
      this.yk.dq("sc/d/81.png");
      this.yk.setBounds(5, 5, 44, 44);
      var10006 = "P<\f;\fl\u0015qS1D";
      this.gf = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.gf.setBounds(0, 0, 134, 54);
      this.add(this.im);
      this.add(this.df);
      this.add(this.oo);
      this.add(this.yk);
      this.add(this.gf);
      this.addMouseListener(this);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }
}
