package com.xy.a.v;

import com.xy.q.Class54;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

class Class25 extends com.xy.q.Class50 {
   private Class54 yk;
   private int ae;
   // $VF: synthetic field
   final Class16 aaz;
   private JLabel di;
   private com.xy.w.Class18 dn;

   public void vj(int var1, ActivityFCBase var2) {
      JLabel var10001 = this.di;
      StringBuilder var10002 = new StringBuilder(String.valueOf(var1));
      String var10003 = "<";
      var10001.setText(var10002.append("/").append(var2.getNum()).toString());
      this.di.setForeground(var1 > 0 ? Color.black : Color.red);
      com.xy.v.Class8 var3 = Class16.nd(this.aaz).yt();
      Goodstable var4 = var3.ay(new BigDecimal(var2.getId()));
      byte var5;
      Goodstable var6;
      if (var4 != null) {
         var5 = 1;
         var6 = var4;
      } else {
         var5 = 0;
         var6 = var4;
      }

      this.yk.gs(var5, var6);
   }

   public Class25(Class16 var1) {
      this.aaz = var1;
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.yk = new Class54(Class16.nd(var1));
      String var10004 = "\u001aQFVF\u0006GB\u0007U";
      this.yk.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
      this.dn = new com.xy.w.Class18();
      this.add(this.yk);
      this.add(this.dn);
   }

   // $VF: synthetic method
   static int vk(Class25 var0) {
      return var0.ae;
   }

   public void n(int var1) {
      if (this.ae != var1) {
         this.ae = var1;
         if (var1 == 1) {
            if (this.di == null) {
               this.di = com.xy.q.Class1.k(22, 78, 54, 14, Color.white, com.xy.q.Class49.co);
               this.di.setHorizontalAlignment(0);
               this.add(this.di, 0);
            }

            if (!this.di.isVisible()) {
               this.di.setVisible(true);
            }

            this.yk.wp(Class54.auf);
            this.yk.setBounds(23, 24, 52, 52);
            String var2 = "\u001aQFVF\u0003[\u0000GB\u0007U";
            this.dn.dp("sc/d/122.png");
            this.dn.setBounds(0, 0, 102, 99);
         } else {
            if (var1 == 2) {
               if (this.di != null && this.di.isVisible()) {
                  this.di.setVisible(false);
               }

               this.yk.wp(Class54.ats);
               this.yk.setBounds(10, 11, 43, 43);
               String var10002 = "\u0015pIwI\"T Hc\bt";
               this.dn.dp("sc/d/123.png");
               this.dn.setBounds(0, 0, 65, 64);
            }
         }
      }
   }

   // $VF: synthetic method
   static JLabel vl(Class25 var0) {
      return var0.di;
   }

   public void bb(Goodstable var1) {
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.yk.gs(var10001, var10002);
   }
}
