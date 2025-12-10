package com.xy;

import java.util.List;
import javax.swing.JLabel;

public class Class679 {
   private int a;
   private JLabel b;
   private int c;
   private List<JLabel> d;
   private Class216[] e;
   private Class524 f;
   private boolean g;
   private int h;
   private int i;

   public List<JLabel> a() {
      return this.d;
   }

   public Class679(List<JLabel> var1, Class524 var2, int var3) {
      this.c = var3;
      this.d = var1;
      this.f = var2;
      this.i = var1.size();
      if (var3 == 0) {
         this.m(this.i);
      }

   }

   public Class679(Class216[] var1, Class524 var2, int var3) {
      this.e = var1;
      this.f = var2;
      this.c = var3;
      this.i = var1.length;

      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < this.e.length; var10000 = var4) {
         this.e[var4++].ah(this);
      }

      this.l();
      if (var3 == 0) {
         this.m(this.i);
      }

   }

   public void b() {
      if (this.b != null) {
         this.b.setText(this.h + (3 & 5) + "/" + (this.f.ae() + --1));
      }
   }

   public int c() {
      return this.h;
   }

   public void d(int var1) {
      Class679 var10000;
      if (this.c == 0) {
         this.o(var1);
         var10000 = this;
      } else {
         label37: {
            if (this.c == 5 >> 2) {
               int var3;
               if (var1 == 0) {
                  var3 = var1 = this.h - --1;
               } else if (var1 == 5 >> 2) {
                  var3 = var1 = this.h + --1;
               } else if (var1 == -4 >> 2) {
                  var3 = var1 = 3 >> 2;
               } else {
                  if (var1 == --2) {
                     var1 = this.f.ae();
                  }

                  var3 = var1;
               }

               if (var3 < 0) {
                  return;
               }

               if (this.f.au(var1)) {
                  this.h = var1;
                  var10000 = this;
                  break label37;
               }

               int var2 = this.f.ae();
               if (var1 > var2) {
                  this.h = var2;
               }
            }

            var10000 = this;
         }
      }

      var10000.b();
   }

   public int e() {
      return this.h + this.a;
   }

   public Class216[] f() {
      return this.e;
   }

   public int g() {
      return this.a;
   }

   public int h() {
      if (this.e != null) {
         return this.g ? this.e[this.e.length - --1].ag().d + (this.e[this.e.length - (3 >> 1)].ag().c == 5 >> 2 ? 2 ^ 3 : 0) : this.e.length;
      } else {
         return this.d != null ? this.d.size() : 0;
      }
   }

   public void i(int var1) {
      Class679 var10000;
      if (this.c == 0) {
         this.o(var1);
         var10000 = this;
      } else {
         label18: {
            if (this.c == --1) {
               if (this.f.au(var1)) {
                  this.h = var1;
                  var10000 = this;
                  break label18;
               }

               int var2 = this.f.ae();
               if (var1 > var2) {
                  this.h = var2;
               }
            }

            var10000 = this;
         }
      }

      var10000.b();
   }

   public int j() {
      if (this.e != null) {
         return this.e.length;
      } else {
         return this.d != null ? this.d.size() : 0;
      }
   }

   public void k(JLabel var1) {
      this.b = var1;
      this.b();
   }

   public void l() {
      if (this.e != null && this.e.length >= (1 ^ 3) && this.e[this.e.length - (2 ^ 3)].ae() <= (-35 & -66)) {
         this.g = (boolean)(3 & 5);
         this.a = this.e[5 >> 3].ae();
      } else {
         this.a = this.g = (boolean)(3 & 4);
      }
   }

   public void m(int var1) {
      if (var1 < 0 || var1 > this.j()) {
         var1 = this.j();
      }

      this.i = var1;
      int var10000;
      int var2;
      Class679 var3;
      if (this.e != null) {
         for(var10000 = var2 = 5 >> 3; var10000 < this.e.length; var10000 = var2) {
            if (var2 < var1) {
               this.e[var2].setBtn(1 ^ 3);
            }

            this.e[var2].setVisible((boolean)(var2 < var1 ? --1 : 0));
            ++var2;
         }

         var3 = this;
      } else {
         if (this.d != null) {
            for(var10000 = var2 = 3 & 4; var10000 < this.d.size(); var10000 = var2) {
               ((JLabel)this.d.get(var2)).setVisible((boolean)(var2 < var1 ? 3 >> 1 : 0));
               ++var2;
            }
         }

         var3 = this;
      }

      var3.o(this.h);
   }

   public void n(Class216[] var1, int var2) {
      Class216[] var10001 = this.e = var1;
      this.c = var2;
      this.i = var10001.length;

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < this.e.length; var10000 = var3) {
         this.e[var3++].ah(this);
      }

      this.l();
      if (var2 == 0) {
         this.m(this.i);
      }

      this.d(this.g ? var1[3 >> 2].ae() - this.a : this.h);
   }

   public void o(int var1) {
      Class679 var3;
      if (this.e != null) {
         if (var1 < 0 || var1 >= this.i) {
            var1 = 0;
         }

         this.h = var1;

         int var2;
         for(int var10000 = var2 = 2 & 5; var10000 < this.e.length; var10000 = var2) {
            this.e[var2++].setKeep((boolean)(5 >> 3));
         }

         var3 = this;
         this.e[var1].setKeep((boolean)(--1));
      } else {
         if (this.d != null) {
            this.h = var1;
         }

         var3 = this;
      }

      var3.b();
   }

   public JLabel p() {
      return this.b;
   }

   public void q(boolean var1) {
      int var10000;
      int var2;
      Class679 var3;
      if (this.e != null) {
         for(var10000 = var2 = 3 & 4; var10000 < this.e.length; var10000 = var2) {
            this.e[var2++].setVisible(var1);
         }

         var3 = this;
      } else {
         if (this.d != null) {
            for(var10000 = var2 = 3 ^ 3; var10000 < this.d.size(); var10000 = var2) {
               Object var4 = this.d.get(var2);
               ++var2;
               ((JLabel)var4).setVisible(var1);
            }
         }

         var3 = this;
      }

      if (var3.b != null) {
         this.b.setVisible(var1);
      }

   }
}
