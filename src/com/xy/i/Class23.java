package com.xy.i;

import java.util.List;
import javax.swing.JLabel;

public class Class23 {
   private int a;
   private int b;
   private Class3[] c;
   private Class6 d;
   private List<JLabel> e;
   private int f;
   private JLabel g;

   public void a(int var1) {
      Class23 var10000;
      if (this.a == 0) {
         var10000 = this;
         this.d(var1);
      } else {
         label20: {
            if (this.a == 1) {
               if (this.d.at(var1)) {
                  var10000 = this;
                  this.f = var1;
                  break label20;
               }

               int var2 = this.d.il();
               if (var1 > var2) {
                  this.f = var2;
               }
            }

            var10000 = this;
         }
      }

      var10000.j();
   }

   public void b(boolean var1) {
      Class23 var4;
      if (this.c != null) {
         int var2;
         for (int var10000 = var2 = 0; var10000 < this.c.length; var10000 = var2) {
            this.c[var2++].setVisible(var1);
         }

         var4 = this;
      } else {
         int var3;
         if (this.e != null) {
            for (int var5 = var3 = 0; var5 < this.e.size(); var5 = var3) {
               JLabel jLabel = this.e.get(var3);
               var3++;
               ((JLabel)jLabel).setVisible(var1);
            }
         }

         var4 = this;
      }

      if (var4.g != null) {
         this.g.setVisible(var1);
      }
   }

   public Class23(List<JLabel> var1, Class6 var2, int var3) {
      this.a = var3;
      this.e = var1;
      this.d = var2;
      this.b = var1.size();
      if (var3 == 0) {
         this.c(this.b);
      }
   }

   public Class23(Class3[] var1, Class6 var2, int var3) {
      this.c = var1;
      this.d = var2;
      this.a = var3;
      this.b = var1.length;

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.c.length; var10000 = var4) {
         this.c[var4++].or(this);
      }

      if (var3 == 0) {
         this.c(this.b);
      }
   }

   public void c(int var1) {
      if (var1 < 0 || var1 > this.f()) {
         var1 = this.f();
      }

      this.b = var1;
      Class23 var4;
      if (this.c != null) {
         int var2;
         for (int var10000 = var2 = 0; var10000 < this.c.length; var10000 = ++var2) {
            if (var2 < var1) {
               this.c[var2].setBtn(2);
            }

            this.c[var2].setVisible(var2 < var1);
         }

         var4 = this;
      } else {
         int var3;
         if (this.e != null) {
            for (int var5 = var3 = 0; var5 < this.e.size(); var5 = ++var3) {
               this.e.get(var3).setVisible(var3 < var1);
            }
         }

         var4 = this;
      }

      var4.d(this.f);
   }

   public void d(int var1) {
      Class23 var3;
      if (this.c != null) {
         if (var1 < 0 || var1 >= this.b) {
            var1 = 0;
         }

         this.f = var1;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.c.length; var10000 = var2) {
            this.c[var2++].setKeep(false);
         }

         var3 = this;
         this.c[var1].setKeep(true);
      } else {
         if (this.e != null) {
            this.f = var1;
         }

         var3 = this;
      }

      var3.j();
   }

   public void e(Class3[] var1, int var2) {
      this.c = var1;
      this.a = var2;
      this.b = var1.length;

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.c.length; var10000 = var3) {
         this.c[var3++].or(this);
      }

      if (var2 == 0) {
         this.c(this.b);
      }

      this.i(this.f);
   }

   public int f() {
      if (this.c != null) {
         return this.c.length;
      } else {
         return this.e != null ? this.e.size() : 0;
      }
   }

   public int g() {
      return this.f;
   }

   public List<JLabel> h() {
      return this.e;
   }

   public void i(int var1) {
      Class23 var10000;
      if (this.a == 0) {
         var10000 = this;
         this.d(var1);
      } else {
         label39: {
            if (this.a == 1) {
               int var3;
               if (var1 == 0) {
                  var3 = var1 = this.f - 1;
               } else if (var1 == 1) {
                  var3 = var1 = this.f + 1;
               } else if (var1 == -1) {
                  var3 = var1 = 0;
               } else {
                  if (var1 == 2) {
                     var1 = this.d.il();
                  }

                  var3 = var1;
               }

               if (var3 < 0) {
                  return;
               }

               if (this.d.at(var1)) {
                  this.f = var1;
                  var10000 = this;
                  break label39;
               }

               int var2 = this.d.il();
               if (var1 > var2) {
                  this.f = var2;
               }
            }

            var10000 = this;
         }
      }

      var10000.j();
   }

   public void j() {
      if (this.g != null) {
         JLabel var10000 = this.g;
         StringBuilder var10001 = new StringBuilder(String.valueOf(this.f + 1));
         String var10002 = "z";
         var10000.setText(var10001.append("/").append(this.d.il() + 1).toString());
      }
   }

   public void k(JLabel var1) {
      this.g = var1;
      this.j();
   }

   public Class3[] l() {
      return this.c;
   }

   public JLabel m() {
      return this.g;
   }
}
