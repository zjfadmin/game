package com.xy.a;

import com.xy.formula.QualityZW;
import java.awt.Color;
import javax.swing.JLabel;

class Class95 {
   private JLabel a;
   // $VF: synthetic field
   final Class142 b;
   private com.xy.q.Class36 c;
   private com.xy.q.Class36 d;

   public Class95(Class142 var1) {
      super();
      String var10003 = "p\u0006,\u0001,T4Ks\u000bd";
      String var10005 = "[7\u00070\u0007e\u001fzX:O";
      this.b = var1;
      this.a = new JLabel();
      this.a.setForeground(Color.black);
      this.a.setFont(com.xy.q.Class49.cp);
      this.d = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.ac, Color.white);
      this.c = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.cp, Color.white);
      var1.add(this.a);
      var1.add(this.d);
      var1.add(this.c);
   }

   // $VF: synthetic method
   static com.xy.q.Class36 a(Class95 var0) {
      return var0.c;
   }

   public boolean b(String var1) {
      String var2 = this.e();
      if (var1.length() > var2.length()) {
         return false;
      } else if (var2.equals(var1)) {
         return true;
      } else {
         String var10001 = "T";
         if (var2.indexOf("|") == -1) {
            return false;
         } else {
            var10001 = "9\u007f";
            String[] var4 = var2.split("\\|");

            int var5;
            for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = ++var5) {
               if (var4[var5].equals(var1)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public double c() {
      return QualityZW.getDouble(this.c.getText());
   }

   // $VF: synthetic method
   static com.xy.q.Class36 d(Class95 var0) {
      return var0.d;
   }

   public String e() {
      return this.d.getText();
   }

   public void f(String var1, int var2, int var3, int var4) {
      this.a.setVisible(var2 != 0);
      this.d.setVisible(var2 != 0);
      this.c.setVisible(var2 != 0);
      if (var2 != 0) {
         this.a.setText(var1);
         this.d.setText("");
         this.c.setText("");
         this.a.setBounds(var2 - 8, var3, 68, 18);
         this.d.setBounds(var2 + 62, var3 - 1, 86, 20);
         this.c.setBounds(var2 + 62 + 60 + 35, var3 - 1, 51, 20);
         this.d.setEditable(var4 == 0 || var4 == 2);
         this.c.setEditable(var4 == 0 || var4 == 1);
         if (var4 == 1) {
            this.d.setText(var1);
         } else {
            if (var4 == 2) {
               this.c.setVisible(true);
            }
         }
      }
   }
}
