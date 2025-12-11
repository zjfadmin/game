package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.text.GameView;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class39 extends com.xy.q.Class30 {
   private List<com.xy.i.Class22> wq;
   private List<com.xy.q.Class30> eq;
   private int eg;
   private int ah;

   public Class39(GameView var1) {
      super(167, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "t%(\"(\u007f2hw(`";
      this.yy(-1, 0, 745, 452, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/95.png", 0, 0, 0, 0, false), null);
      this.rm(false);
      this.wp(new com.xy.v.Class32(0, 12, 0, 0));
      String var10004 = "\u007f0#6#b9d\"#b4";
      this.agi.setImage("sc/e/157.png");
      this.agi.setBounds(704, 25, 33, 32);
      this.wq = new ArrayList<>();
      String var10003 = "5dibi6s5hw(`";
      String var10008 = "於仩禃剺";
      com.xy.i.Class22 var2 = new com.xy.i.Class22("sc/e/152.png", 2, 1, com.xy.q.Class49.ak, null, "新人福利", this);
      String var10002 = "eds6uEu5";
      var2.setBounds(88, 0, 107, 33);
      var2.setForeground(com.xy.q.Class49.c("#c513B32"));
      this.wq.add(var2);
      this.add(var2);
      this.eq = new ArrayList<>();
   }

   public com.xy.q.Class30 acj(int var1, int var2) {
      this.ah = this.qj(var1, var2);
      if (this.ah == 1) {
         var2 = 0;
      }

      this.eg = var2;

      Iterator var4;
      for (Iterator var10000 = var4 = this.wq.iterator(); var10000.hasNext(); var10000 = var4) {
         com.xy.i.Class22 var3;
         com.xy.i.Class22 var8 = var3 = (com.xy.i.Class22)var4.next();
         var8.setKeep(var8.lj() == this.ah && var3.il() == var2);
      }

      Object var6;
      if ((var6 = this.acn(var1, var2)) == null) {
         Class39 var9;
         if (this.ah == 1) {
            var6 = new Class44(this.afx);
            var9 = this;
         } else {
            if (this.ah == 2) {
               Activity var7 = this.yt().cd(var2);
               var6 = new Class28(var7, this.afx);
            }

            var9 = this;
         }

         var9.eq.add((com.xy.q.Class30)var6);
         this.add((Component)var6);
      }

      Class39 var10;
      if (var6 instanceof Class44) {
         ((Class44)var6).h();
         var10 = this;
      } else {
         if (var6 instanceof Class28) {
            ((Class28)var6).e();
         }

         var10 = this;
      }

      Iterator var5;
      for (Iterator var11 = var5 = var10.eq.iterator(); var11.hasNext(); var11 = var5) {
         com.xy.q.Class30 var12 = (com.xy.q.Class30)var5.next();
         var12.setVisible(var12 == var6);
      }

      return (com.xy.q.Class30)var6;
   }

   public boolean ack(int var1, int var2, List<com.xy.i.Class21> var3) {
      if (var1 == 1) {
         return true;
      } else {
         if (var1 == 2) {
            int var4 = 0;
            int var5 = var3 != null ? var3.size() : 0;

            for (int var10000 = var4; var10000 < var5; var10000 = ++var4) {
               if (var3.get(var4).il() == var2) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void y(int var1) {
      if (this.ah == var1) {
         com.xy.q.Class30 var2;
         if ((var2 = this.acn(var1, this.eg)) instanceof Class44) {
            ((Class44)var2).f();
         } else {
            if (var2 instanceof Class28) {
               ((Class28)var2).h();
            }
         }
      }
   }

   public boolean acl(int var1, int var2) {
      Iterator var4;
      for (Iterator var10000 = var4 = this.wq.iterator(); var10000.hasNext(); var10000 = var4) {
         com.xy.i.Class22 var3;
         if ((var3 = (com.xy.i.Class22)var4.next()).lj() == var1 && var3.il() == var2) {
            return true;
         }
      }

      return false;
   }

   public int qj(int var1, int var2) {
      boolean var3 = false;
      List var4 = this.afx.baseView.rs();

      int var5;
      for (int var10000 = var5 = this.wq.size() - 1; var10000 >= 0; var10000 = --var5) {
         com.xy.i.Class22 var6 = this.wq.get(var5);
         if (!this.ack(var6.lj(), var2, var4)) {
            this.remove(var6);
            this.wq.remove(var5);
            com.xy.q.Class30 var7 = this.acn(var6.lj(), var2);
            if (var7 != null) {
               this.remove(var7);
               this.eq.remove(var7);
            }

            var3 = true;
         }
      }

      for (int var15 = var5 = 0; var15 < var4.size(); var15 = ++var5) {
         com.xy.i.Class21 var11;
         Activity var13;
         if ((var11 = (com.xy.i.Class21)var4.get(var5)).il() > 100
            && var11.il() < 200
            && (var13 = this.yt().cd(var11.il())) != null
            && var13.getModelId() == 2
            && !this.acl(2, var13.getId())) {
            String var10002 = "\u007f0#6#b9a\"#b4";
            Font var10005 = com.xy.q.Class49.ak;
            String var10007 = var13.getBaseSet();
            String var10008 = "吊禶:";
            String var10009 = "/";
            com.xy.i.Class22 var8 = new com.xy.i.Class22("sc/e/152.png", 2, 2, var10005, null, com.xy.v.Class12.ai(var10007, "名称=", "|"), this);
            var10002 = "eds6uEu5";
            var8.g(var13.getId());
            var8.setForeground(com.xy.q.Class49.c("#c513B32"));
            this.wq.add(var8);
            this.add(var8);
            var3 = true;
         }
      }

      if (!this.acl(var1, var2)) {
         var1 = 1;
      }

      if (var3) {
         var5 = 0;
         Iterator var14;
         Iterator var16 = var14 = this.wq.iterator();

         while (var16.hasNext()) {
            com.xy.i.Class22 var12 = (com.xy.i.Class22)var14.next();
            var16 = var14;
            int var18 = 88 + 109 * var5;
            var5++;
            var12.setBounds(var18, 0, 107, 33);
         }
      }

      return var1;
   }

   public com.xy.q.Class30 acm(int var1, int var2) {
      com.xy.q.Class30 var3;
      return (var3 = this.acn(var1, var2)) != null && var3.isVisible() ? var3 : null;
   }

   public com.xy.q.Class30 acn(int var1, int var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < this.eq.size(); var10000 = ++var3) {
         com.xy.q.Class30 var4 = this.eq.get(var3);
         if (var1 == 1 && var4 instanceof Class44) {
            return var4;
         }

         if (var1 == 2 && var4 instanceof Class28 && ((Class28)var4).dx() == var2) {
            return var4;
         }
      }

      return null;
   }

   public void g(int var1) {
      Class39 var10000;
      label22: {
         if (var1 == 0) {
            com.xy.q.Class30 var2;
            if ((var2 = this.acj(1, 0)) instanceof Class44) {
               ((Class44)var2).g(21);
               var10000 = this;
               break label22;
            }
         } else if (var1 == 1) {
            com.xy.q.Class30 var3;
            if ((var3 = this.acj(1, 0)) instanceof Class44) {
               ((Class44)var3).g(22);
               var10000 = this;
               break label22;
            }
         } else if (var1 != 1) {
            return;
         }

         var10000 = this;
      }

      var10000.zc().b(this.lj());
   }

   public int dx() {
      return this.ah;
   }

   public void ws(Activity var1) {
      if (var1 != null) {
         if (var1.getModelId() == 2) {
            this.acj(2, var1.getId());
            this.zc().b(this.lj());
         }
      }
   }
}
