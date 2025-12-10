package com.xy;

import com.xy.bean.UseCardBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class311 extends Class345 {
   private Class315 ayr;
   private int j;
   private Class436[] e;
   private RichLabel acv;
   private List<Class379> ez;

   public void y(int var1) {
      this.j = this.mi(var1);

      Iterator var3;
      for(Iterator var10000 = var3 = this.ez.iterator(); var10000.hasNext(); var10000 = var3) {
         Class379 var2 = (Class379)var3.next();
         var2.setKeep((boolean)(var2.ae() == this.j ? 3 & 5 : 0));
      }

      if (this.ayr == null) {
         this.add(this.ayr = new Class315(this), 2 & 5);
      }

      this.ayr.ab(this.j);
   }

   public Class311(GameView var1) {
      int var10003 = 3 & 4;
      int var10005 = 95 & 53;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.j = var10005;
      this.va(var10003, 3 ^ 3, 31487 & 2025, 8679 & 24540, Class345.aei);
      this.ez = new ArrayList();
      Class379 var2 = new Class379("sc/e/153.png", --2, 127 & 21, Class681.ak, (Color[])null, "等级礼包", this);
      var2.setBounds(123 & 95, 75 & 124, 124 & 107, 94 & 61);
      var2.setForeground(Class681.c("#c523425"));
      this.ez.add(var2);
      this.add(var2);
      this.acv = new RichLabel("", Class681.cf);
      this.acv.setBounds((28110 & 4861) + ((24563 & 8702) - this.acv.getWidth()) / --2, 121 & 126, this.acv.getWidth(), this.acv.getHeight());
      this.add(this.acv);
      Class436[] var10001 = new Class436[--4];
      boolean var5 = true;
      this.e = var10001;

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < this.e.length; var10000 = var3) {
         this.e[var3] = new Class436();
         Class311 var4;
         if (var3 == 0) {
            var4 = this;
            this.e[var3].fw("sc/d/96.png");
            this.e[var3].setBounds(6399 & 26571, 55 & 123, 29183 & 4083, 97 & 127);
         } else if (var3 == 3 >> 1) {
            var4 = this;
            this.e[var3].fw("sc/d/98.png");
            this.e[var3].setBounds(31454 & 1519, 123, 492, 21);
         } else if (var3 == (1 ^ 3)) {
            var4 = this;
            this.e[var3].fw("sc/d/97.png");
            this.e[var3].setBounds(207, 55, 491, 89);
         } else {
            if (var3 == --3) {
               this.e[var3].fw("sc/d/101.png");
               this.e[var3].setBounds(202, 136, 499, 310);
            }

            var4 = this;
         }

         var4.add(this.e[var3++]);
      }

   }

   public boolean au(int var1) {
      Iterator var2;
      for(Iterator var10000 = var2 = this.ez.iterator(); var10000.hasNext(); var10000 = var2) {
         if (((Class379)var2.next()).ae() == var1) {
            return (boolean)(2 ^ 3);
         }
      }

      return (boolean)(3 ^ 3);
   }

   public void s() {
      this.aeg = (boolean)(3 >> 1);
   }

   public void d() {
      this.s();
   }

   public RichLabel anv() {
      return this.acv;
   }

   public int mi(int var1) {
      int var5 = 3 ^ 3;
      UseCardBean var3;
      List var4 = (var3 = this.vd().getLimit("限时礼包")) != null ? var3.getKeysByActivity() : null;

      Class379 var2;
      int var10;
      int var10000;
      for(var10000 = var10 = this.ez.size() - (5 >> 2); var10000 >= 0; var10000 = var10) {
         var2 = (Class379)this.ez.get(var10);
         if (!this.anw(var2.ae(), var4)) {
            this.remove(var2);
            this.ez.remove(var10);
            var5 = 5 >> 2;
         }

         --var10;
      }

      var10 = 5 >> 3;
      int var8 = var4 != null ? var4.size() : 0;

      for(var10000 = var10; var10000 < var8; var10000 = var10) {
         Class223 var6 = (Class223)var4.get(var10);
         if ((var6 = this.vc().r(var6.a)) != null && !this.au((int)var6.b)) {
            Class379 var7 = new Class379("sc/e/153.png", 1 ^ 3, (int)var6.b, Class681.ak, (Color[])null, var6.a, this);
            var7.setForeground(Class681.c("#c523425"));
            this.ez.add(var7);
            this.add(var7);
            var5 = 4 ^ 5;
         }

         ++var10;
      }

      Iterator var13;
      label61: {
         if (!this.au(var1)) {
            var1 = 127 & 21;

            Iterator var9;
            for(var13 = var9 = this.ez.iterator(); var13.hasNext(); var13 = var9) {
               Class379 var11;
               if ((var11 = (Class379)var9.next()).ae() != (55 & 93)) {
                  var1 = var11.ae();
                  var10000 = var5;
                  break label61;
               }
            }
         }

         var10000 = var5;
      }

      if (var10000 != 0) {
         var10 = 3 ^ 3;
         Iterator var12;
         var13 = var12 = this.ez.iterator();

         while(var13.hasNext()) {
            var2 = (Class379)var12.next();
            var13 = var12;
            int var10002 = 123 & 95;
            int var10003 = (79 & 120) + (126 & 41) * var10;
            ++var10;
            var2.setBounds(var10002, var10003, 125 & 106, 62 & 93);
         }
      }

      return var1;
   }

   public boolean anw(int var1, List<Class223> var2) {
      if (var1 == (31 & 117)) {
         return (boolean)(5 >> 2);
      } else if (var2 == null) {
         return (boolean)(3 >> 2);
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = var2.iterator(); var10000.hasNext(); var10000 = var3) {
            if (((Class223)var3.next()).b == (long)var1) {
               return (boolean)(3 >> 1);
            }
         }

         return (boolean)(3 ^ 3);
      }
   }

   public void paint(Graphics var1) {
      if (this.aeg) {
         this.y(this.j);
      }

      super.paint(var1);
   }
}
