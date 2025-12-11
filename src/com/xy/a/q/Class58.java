package com.xy.a.q;

import com.xy.readbean.AlchemyUnit;
import com.xy.readbean.Skill;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class58 extends JComponent {
   private int gz;
   private JLabel ge;
   private com.xy.w.Class18 fy;
   private String ao;
   private com.xy.w.Class18 co;
   private boolean gk;
   private double afh;
   private boolean il;
   private JLabel di;
   // $VF: synthetic field
   final Class13 afi;

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.il) {
         if (Class13.ie(this.afi) == null) {
            String var10001 = "\u0014+H-Hy_|I8\t/";
            Class13.ib(this.afi, com.xy.w.Class16.c("sc/e/184.png"));
         }

         var1.drawImage(Class13.ie(this.afi), 11, 0, 35, 35, null);
      }

      if (this.gk) {
         if (Class13.hz(this.afi) == null) {
            String var3 = "I&\u0015 \u0015t\r|\u00145T\"";
            Class13.hw(this.afi, com.xy.w.Class16.c("sc/e/179.png"));
         }

         var1.drawImage(Class13.hz(this.afi), 15, 2, 27, 32, null);
      } else {
         if (Class13.hv(this.afi) == null) {
            String var2 = "\u0014+H-Hy_xI8\t/";
            Class13.hs(this.afi, com.xy.w.Class16.c("sc/e/180.png"));
         }

         var1.drawImage(Class13.hv(this.afi), 15, 2, 27, 32, null);
      }
   }

   public void xw(String var1, double var2, AlchemyUnit var4) {
      if (com.xy.v.Class12.h(var1)) {
         this.t();
      } else {
         this.ao = var1;
         this.gz = 0;
         this.afh = var2;
         this.gk = true;
         this.il = false;
         String var10003 = "\u0019&|\u0003|r~u";
         this.ge.setForeground(com.xy.q.Class49.c("#cFFF7D0"));
         this.ge.setText(var1);
         this.di.setText(com.xy.v.Class12.e(var2, var4 != null ? var4.getSize() : 1) + com.xy.a.Class48.qb(var1));
         this.co.ant(var4 != null ? var2 / var4.getMax() : 1.0, 68);
         this.fy.setVisible(true);
      }
   }

   public void t() {
      this.ao = null;
      this.gz = 0;
      this.afh = 0.0;
      this.gk = false;
      this.il = false;
      String var10005 = "D+%y^\f_z";
      this.ge.setForeground(com.xy.q.Class49.c("#cB19D82"));
      String var10004 = "瀰窷斥灏汑";
      this.ge.setText("灵窍无灵气");
      this.di.setText("");
      this.co.ant(0.0, 68);
      this.fy.setVisible(false);
   }

   public Class58(Class13 var1, int var2) {
      this.afi = var1;
      String var10008 = "D+%y^\f_z";
      this.ge = com.xy.q.Class1.k(46, 10, 120, 16, com.xy.q.Class49.c("#cB19D82"), com.xy.q.Class49.w);
      this.di = com.xy.q.Class1.k(172, 10, 70, 16, Color.white, com.xy.q.Class49.w);
      if (var2 >= 5) {
         this.ge.addMouseListener(new Class95(var1, this));
      }

      this.di.setHorizontalAlignment(0);
      this.add(this.ge);
      this.add(this.di);
      String var10010 = "I&\u0015!\u0015t\u0002w\u00145T\"";
      this.co = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/182.png", 2, 2, 2, 2, false));
      String var10009 = ";\u0004g\u0002gUqI8\t/";
      this.fy = new com.xy.w.Class18(com.xy.w.Class16.m("sc/e/29.png", 6, 6, 6, 6, false));
      this.co.setBounds(173, 12, 68, 13);
      this.fy.setBounds(172, 10, 70, 16);
      this.add(this.co);
      this.add(this.fy);
   }

   // $VF: synthetic method
   static String xx(Class58 var0) {
      return var0.ao;
   }

   public void xy(int var1, int var2, Skill var3) {
      if (var3 == null) {
         this.t();
      } else {
         this.ao = null;
         this.gz = var1;
         this.afh = var2;
         this.gk = true;
         this.il = false;
         String var10005 = "\u0019&|\u0003|r~u";
         this.ge.setForeground(com.xy.q.Class49.c("#cFFF7D0"));
         this.ge.setText(var3.getSkillname());
         var10005 = "笮绯";
         this.di.setText("等级" + var2);
         this.co.ant(var2 / 15.0, 68);
         this.fy.setVisible(true);
      }
   }

   // $VF: synthetic method
   static double xz(Class58 var0) {
      return var0.afh;
   }

   // $VF: synthetic method
   static void ya(Class58 var0, boolean var1) {
      var0.il = var1;
   }

   // $VF: synthetic method
   static int yb(Class58 var0) {
      return var0.gz;
   }
}
