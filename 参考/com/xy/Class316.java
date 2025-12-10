package com.xy;

import com.xy.readbean.Activity;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class316 extends Class345 {
   private int j;
   private int bn;
   private List<Class345> lq;
   private List<Class379> ez;

   public Class345 jc(int var1, int var2) {
      this.j = this.fs(var1, var2);
      if (this.j == (4 ^ 5)) {
         var2 = 2 & 5;
      }

      this.bn = var2;

      Iterator var10000;
      Iterator var4;
      for(var10000 = var4 = this.ez.iterator(); var10000.hasNext(); var10000 = var4) {
         Class379 var3;
         Class379 var8 = var3 = (Class379)var4.next();
         var8.setKeep((boolean)(var8.ae() == this.j && var3.tp() == var2 ? --1 : 0));
      }

      Object var6;
      Class316 var9;
      if ((var6 = this.jh(var1, var2)) == null) {
         if (this.j == 5 >> 2) {
            var6 = new Class311(this.aej);
            var9 = this;
         } else {
            if (this.j == (1 ^ 3)) {
               Activity var7 = this.vc().aq(var2);
               var6 = new Class75(var7, this.aej);
            }

            var9 = this;
         }

         var9.lq.add(var6);
         this.add((Component)var6);
      }

      if (var6 instanceof Class311) {
         ((Class311)var6).d();
         var9 = this;
      } else {
         if (var6 instanceof Class75) {
            ((Class75)var6).s();
         }

         var9 = this;
      }

      Iterator var5;
      for(var10000 = var5 = var9.lq.iterator(); var10000.hasNext(); var10000 = var5) {
         Class345 var10 = (Class345)var5.next();
         var10.setVisible((boolean)(var10 == var6 ? --1 : 0));
      }

      return (Class345)var6;
   }

   public void as(int var1) {
      if (this.j == var1) {
         Class345 var2;
         if ((var2 = this.jh(var1, this.bn)) instanceof Class311) {
            ((Class311)var2).s();
         } else {
            if (var2 instanceof Class75) {
               ((Class75)var2).p();
            }

         }
      }
   }

   public boolean jd(int var1, int var2) {
      Iterator var3;
      for(Iterator var10000 = var3 = this.ez.iterator(); var10000.hasNext(); var10000 = var3) {
         Class379 var4;
         if ((var4 = (Class379)var3.next()).ae() == var1 && var4.tp() == var2) {
            return (boolean)(5 >> 2);
         }
      }

      return (boolean)(3 & 4);
   }

   public int fs(int var1, int var2) {
      int var7 = 2 & 5;
      List var4 = this.aej.baseView.ks();

      int var5;
      Class379 var6;
      int var10000;
      for(var10000 = var5 = this.ez.size() - (2 ^ 3); var10000 >= 0; var10000 = var5) {
         var6 = (Class379)this.ez.get(var5);
         if (!this.jg(var6.ae(), var2, var4)) {
            this.remove(var6);
            this.ez.remove(var5);
            Class345 var3 = this.jh(var6.ae(), var2);
            if (var3 != null) {
               this.remove(var3);
               this.lq.remove(var3);
            }

            var7 = 1;
         }

         --var5;
      }

      for(var10000 = var5 = 3 >> 2; var10000 < var4.size(); var10000 = var5) {
         Activity var9;
         Class441 var11;
         if ((var11 = (Class441)var4.get(var5)).tp() > (117 & 110) && var11.tp() < (1993 & 30974) && (var9 = this.vc().aq(var11.tp())) != null && var9.getModelId() == (1 ^ 3) && !this.jd(1 ^ 3, var9.getId())) {
            Class379 var8 = new Class379("sc/e/152.png", 5 >> 1, 5 >> 1, Class681.bd, (Color[])null, Class394.d(var9.getBaseSet(), "名称=", "|"), this);
            var8.y(var9.getId());
            var8.setForeground(Class681.c("#c513B32"));
            this.ez.add(var8);
            this.add(var8);
            var7 = 3 >> 1;
         }

         ++var5;
      }

      if (!this.jd(var1, var2)) {
         var1 = 5 >> 2;
      }

      if (var7 != 0) {
         var5 = 5 >> 3;
         Iterator var10;
         Iterator var12 = var10 = this.ez.iterator();

         while(var12.hasNext()) {
            var6 = (Class379)var10.next();
            var12 = var10;
            int var10002 = (121 & 94) + (125 & 111) * var5;
            int var10003 = 3 >> 2;
            ++var5;
            var6.setBounds(var10002, var10003, 123 & 111, 99 & 61);
         }
      }

      return var1;
   }

   public void y(int var1) {
      Class316 var10000;
      label20: {
         Class345 var2;
         if (var1 == 0) {
            if ((var2 = this.jc(--1, 2 & 5)) instanceof Class311) {
               ((Class311)var2).y(117 & 31);
               var10000 = this;
               break label20;
            }
         } else if (var1 == --1) {
            if ((var2 = this.jc(4 ^ 5, 3 & 4)) instanceof Class311) {
               ((Class311)var2).y(127 & 22);
               var10000 = this;
               break label20;
            }
         } else if (var1 != (4 ^ 5)) {
            return;
         }

         var10000 = this;
      }

      var10000.ve().a(this.ae());
   }

   public Class345 je(int var1, int var2) {
      Class345 var3;
      return (var3 = this.jh(var1, var2)) != null && var3.isVisible() ? var3 : null;
   }

   public void jf(Activity var1) {
      if (var1 != null) {
         if (var1.getModelId() == --2) {
            this.jc(5 >> 1, var1.getId());
            this.ve().a(this.ae());
         }
      }
   }

   public boolean jg(int var1, int var2, List<Class441> var3) {
      if (var1 == 5 >> 2) {
         return (boolean)(4 ^ 5);
      } else {
         if (var1 == (1 ^ 3)) {
            var1 = 3 >> 2;
            int var4 = var3 != null ? var3.size() : 0;

            for(int var10000 = var1; var10000 < var4; var10000 = var1) {
               if (((Class441)var3.get(var1)).tp() == var2) {
                  return (boolean)(--1);
               }

               ++var1;
            }
         }

         return false;
      }
   }

   public int e() {
      return this.j;
   }

   public Class345 jh(int var1, int var2) {
      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < this.lq.size(); var10000 = var4) {
         Class345 var3 = (Class345)this.lq.get(var4);
         if (var1 == 3 >> 1 && var3 instanceof Class311) {
            return var3;
         }

         if (var1 == (1 ^ 3) && var3 instanceof Class75 && ((Class75)var3).e() == var2) {
            return var3;
         }

         ++var4;
      }

      return null;
   }

   public Class316(GameView var1) {
      int var10005 = 3 ^ 3;
      int var10009 = -4 >> 2;
      super(13823 & 19111, 1 ^ 3, Class345.aef, var1);
      this.va(var10009, 5 >> 3, 9981 & 23531, 11756 & 21463, Class345.aeo);
      this.uv(Class511.q("sc/d/95.png", 3 & 4, 3 & 4, 3 & 4, 3 & 4, (boolean)(3 ^ 3)), (String)null);
      this.ak((boolean)var10005);
      this.ad(new Class116(5 >> 3, 111 & 28, 5 >> 3, 5 >> 3));
      this.aea.setImage("sc/e/157.png");
      this.aea.setBounds(22220 & 11251, 25 & 127, 35 & 125, 112 & 47);
      this.ez = new ArrayList();
      Class379 var2 = new Class379("sc/e/152.png", 5 >> 1, 3 >> 1, Class681.bd, (Color[])null, "新人福利", this);
      var2.setBounds(122 & 93, 3 ^ 3, 123 & 111, 63 & 97);
      var2.setForeground(Class681.c("#c513B32"));
      this.ez.add(var2);
      this.add(var2);
      this.lq = new ArrayList();
   }
}
