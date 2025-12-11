package com.xy.a.w;

import com.xy.a.Class48;
import com.xy.q.Class49;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class14 extends JComponent {
   private int aa;
   private boolean _do;
   private List<Class9> rk;
   private int cb;
   private int ae;
   // $VF: synthetic field
   final Class25 rl;
   private int eg;
   private com.xy.i.Class18 me;

   public void l() {
      if (this.ae != 0 || this.eg != 0) {
         this._do = !this._do;
         this.rl.f();
      }
   }

   public void t() {
      int var10000 = this.ae = 0;
      this.eg = 0;

      for (int var1 = 0; var10000 < this.rk.size(); var10000 = var1) {
         JLabel var2 = this.rk.get(var1);
         var1++;
         var2.setText(null);
         var2.setVisible(false);
      }
   }

   // $VF: synthetic method
   static void mk(Class14 var0, int var1) {
      var0.cb = var1;
   }

   // $VF: synthetic method
   private void ml(JLabel var1, double var2, String var4) {
      StringBuilder var10001 = new StringBuilder(String.valueOf(var4));
      String var10002 = "A";
      var10001 = var10001.append(":");
      var10002 = "@-Te";
      var1.setText(var10001.append(String.format("%.1f", var2)).append(Class48.qb(var4)).toString());
   }

   // $VF: synthetic method
   static void mm(Class14 var0, boolean var1) {
      var0._do = var1;
   }

   public void mn(double var1, String var3, String var4) {
      Class9 var5 = this.mq(this.ae + this.eg);
      Class9.kc(var5, var4);
      Class9.kb(var5, var1);
      Double var6 = null;
      Integer var7;
      if ((var7 = (Integer)Class25.abi().get(Class9.kd(var5))) != null && (var7 >> Class25.abh(this.rl) & 1) == 1) {
         var6 = this.rl.abm(var5);
      }

      Class14 var10000;
      if (var6 != null && var6 <= 0.0) {
         var10000 = this;
         var5.setForeground(Color.red);
      } else {
         var5.setForeground(Color.white);
         var10000 = this;
      }

      var10000.ml(var5, var1, var3);
      if (var3.length() > 8) {
         var5.setBounds(5, 20 + this.ae * 22, 300, 22);
         if (this.ae > this.eg) {
            this.eg++;
         }

         this.ae++;
         this.eg++;
      } else if (this.ae <= this.eg) {
         var5.setBounds(5, 20 + this.ae * 22, 150, 22);
         this.ae++;
      } else {
         var5.setBounds(155, 20 + this.eg * 22, 150, 22);
         this.eg++;
      }
   }

   // $VF: synthetic method
   static boolean mo(Class14 var0) {
      return var0._do;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (!this._do) {
         if (Class25.abj(this.rl) == null) {
            String var10001 = "\b\u0014T\u0013TDIY\u000b\u0019\u001c";
            Class25.abe(this.rl, com.xy.w.Class16.c("sc/d/32.png"));
         }

         var1.drawImage(Class25.abj(this.rl), 89, 3, 16, 16, null);
         var1.drawImage(Class25.abj(this.rl), 190, 3, 16, 16, null);
      }
   }

   public Class14(Class25 var1, int var2) {
      this.rl = var1;
      this.aa = var2;
      String var10003 = "\b\u0014T\u0012TDLY\u000b\u0019\u001c";
      int var10005 = 120 + var2;
      String var3;
      Class25 var10009;
      if (var2 == 0) {
         var3 = "沰本拲怤";
         var3 = "法术抗性";
         var10009 = var1;
      } else if (var2 == 1) {
         var3 = "爞瑽尩恜";
         var3 = "物理属性";
         var10009 = var1;
      } else if (var2 == 2) {
         var3 = "仱衏尻怤";
         var3 = "五行属性";
         var10009 = var1;
      } else if (var2 == 3) {
         var3 = "沢杔壩彁";
         var3 = "法术增强";
         var10009 = var1;
      } else if (var2 == 4) {
         var3 = "儓仕";
         var3 = "其他";
         var10009 = var1;
      } else {
         var3 = "";
         var10009 = var1;
      }

      com.xy.i.Class18 var10001 = new com.xy.i.Class18("sc/e/37.png", 1, var10005, Class49.ao, null, var3, var10009.eg());
      this.me = var10001;
      this.me.setBounds(0, 0, 299, 20);
      this.add(this.me);
      this.rk = new ArrayList<>();
   }

   // $VF: synthetic method
   static int mp(Class14 var0) {
      return var0.ae;
   }

   // $VF: synthetic method
   private Class9 mq(int var1) {
      Class9 var2 = var1 < this.rk.size() ? this.rk.get(var1) : null;
      if (var2 == null) {
         Class9 var10000 = var2 = new Class9(this.rl);
         var2.setForeground(Color.white);
         var2.setFont(Class49.n);
         var2.addMouseListener(var2);
         var2.addMouseMotionListener(this.rl.eg());
         var10000.addMouseListener(this.rl.eg());
         this.add(var10000);
         this.rk.add(var2);
      }

      var2.setVisible(true);
      return var2;
   }

   // $VF: synthetic method
   static int mr(Class14 var0) {
      return var0.eg;
   }

   // $VF: synthetic method
   static int ms(Class14 var0) {
      return var0.cb;
   }
}
