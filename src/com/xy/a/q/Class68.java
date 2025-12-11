package com.xy.a.q;

import com.xy.game.RoleData;
import com.xy.readbean.Bbuy;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;

class Class68 extends com.xy.q.Class21 {
   // $VF: synthetic field
   final Class17 ahz;

   Class68(Class17 var1, com.xy.q.Class30 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.ahz = var1;
   }

   @Override
   protected void tk(Graphics var1, RoleData var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < this.abe.length; var10000 = ++var3) {
         if (this.lp != null) {
            var1.drawImage(this.lp, var3 % this.ae * this.z, var3 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      int var3 = this.dx();
      if (this.cf && var3 >= this.ia() - this.abe.length) {
         this.tk(var1, var2);
      } else {
         int var4 = 0;
         var1.setFont(com.xy.q.Class49.ac);
         var1.setColor(Color.white);
         com.xy.v.Class8 var5 = Class17.kj(this.ahz) != 1 && Class17.kj(this.ahz) != 2 ? null : this.ahz.yt();

         int var6;
         for (int var10000 = var6 = 0; var10000 < this.abe.length; var10000 = ++var6) {
            var4 = var6 + var3;
            if (this.lp != null) {
               var1.drawImage(this.lp, var6 % this.ae * this.z, var6 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
            }

            Goodstable var7;
            if ((var7 = var2.getGood(var2.goodPacks[var4])) == null) {
               if (this.abe[var6] != null) {
                  this.abe[var6].e();
               }
            } else {
               if (this.abe[var6] == null || var7.getRgid() != this.abe[var6].e) {
                  if (this.abe[var6] == null) {
                     this.abe[var6] = new com.xy.w.Class14();
                  }

                  this.abe[var6].g(var7);
               }

               Class68 var10;
               if (var4 != this.gv) {
                  var10 = this;
                  com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
               } else {
                  com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz, this.ah);
                  var10 = this;
               }

               if (var10.abe[var6].c != null) {
                  var1.drawString(this.abe[var6].c, var6 % this.ae * this.z + 4, var6 / this.ae * this.cb + 14);
               }

               if (var7.getGoodlock() == 1) {
                  var1.drawImage(com.xy.w.Class15.s, var6 % this.ae * this.z + 36, var6 / this.ae * this.cb, 10, 12, null);
               }

               Bbuy var8;
               if (var5 != null
                  && (var8 = var5.bc(var7.getGoodsid())) != null
                  && (Class17.kj(this.ahz) == 1 && var8.getPrice1() != 0L || Class17.kj(this.ahz) == 2 && var8.getPrice2() != 0L)) {
                  var1.drawImage(com.xy.w.Class15.c, var6 % this.ae * this.z + 4, var6 / this.ae * this.cb + 4, 20, 20, null);
               }

               if (this.bi && var4 == this.gw) {
                  var1.setColor(Color.red);
                  var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
                  var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
                  var1.setColor(Color.white);
               }
            }
         }
      }
   }
}
