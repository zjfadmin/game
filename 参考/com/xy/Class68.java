package com.xy;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.ParamTool;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class68 extends Class397 {
   public Class68(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   protected void cl(RoleData var1) {
      Goodstable var2;
      if ((var2 = var1.getStarCardGood(this.j + this.ot())) != null) {
         ((Class270)this.lo.ve().e(46 & 127)).oj(var2, (boolean)(3 >> 2));
      }
   }

   protected void cm(Graphics var1, RoleData var2) {
      List var4 = null;
      if (this.lo instanceof Class545) {
         var4 = ((Class545)this.lo).ci();
      }

      int var3;
      for(int var10000 = var3 = 0; var10000 < this.asw.length; var10000 = var3) {
         if (this.ama != null) {
            var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + --2, this.m + --2, (ImageObserver)null);
         }

         Goodstable var5;
         if ((var5 = var2.getStarCardGood(var3)) == null) {
            if (this.asw[var3] != null) {
               this.asw[var3].g();
            }
         } else {
            if (this.asw[var3] == null || var5.getRgid() != this.asw[var3].i) {
               if (this.asw[var3] == null) {
                  this.asw[var3] = new Class467();
               }

               this.asw[var3].d(var5);
            }

            List var6;
            if (var3 != this.gv) {
               var6 = var4;
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (5 >> 2), var3 / this.cy * this.gc + (4 ^ 5), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + --2, this.bn, this.m);
               var6 = var4;
            }

            Goodstable var7;
            label48: {
               if (var6 != null) {
                  if (var4.contains(var5.getRgid())) {
                     var7 = var5;
                     var1.drawImage(Class222.i, var3 % this.cy * this.dp, var3 / this.cy * this.gc, (ImageObserver)null);
                     break label48;
                  }
               } else if (var5.getStatus() == (4 ^ 5)) {
                  var1.drawImage(Class222.i, var3 % this.cy * this.dp, var3 / this.cy * this.gc, (ImageObserver)null);
               }

               var7 = var5;
            }

            if (var7.getGoodlock() == 3 >> 1) {
               var1.drawImage(Class222.u, var3 % this.cy * this.dp + (100 & 63), var3 / this.cy * this.gc, 63 & 74, 77 & 62, (ImageObserver)null);
            }
         }

         ++var3;
      }

   }

   protected void q() {
      this.lo.ve().n(47 & 126);
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var5 = var3.getStarCardGood(var1);
      if (this.lo instanceof Class95) {
         if (var5 != null) {
            if (var2.isShiftDown()) {
               try {
                  JTextField var6;
                  ((Class175)(var6 = this.lo.aej.getBaseView().jj()).getDocument()).arf(var6.getCaretPosition(), 1 ^ 3, var5.getRgid(), "[" + var5.getGoodsname() + "]", "G", (AttributeSet)null);
               } catch (BadLocationException var4) {
                  var4.printStackTrace();
               }
            } else if (this.lo.aej.getMouseIndex() == Class320.g) {
               if (var5.getGoodlock() == (4 ^ 5)) {
                  this.lo.aej.fw("该物品已加锁");
               } else if (GoodType.ag(var5.getType())) {
                  this.lo.aej.fw("该物品无法加锁");
               } else {
                  int var10001 = 2 & 5;
                  var5.setGoodlock(--1);
                  ParamTool.g(var5, var10001, this.lo.aej.getClient());
                  this.lo.aej.setMouseIndex(Class320.l);
                  this.lo.aej.fw("加锁成功");
               }
            } else if (this.lo.aej.getMouseIndex() == Class320.m) {
               if (var5.getGoodlock() == 0) {
                  this.lo.aej.fw("该物品未加锁");
               } else {
                  int var10003 = 2 & 5;
                  var5.setGoodlock(2 & 5);
                  ParamTool.g(var5, var10003, this.lo.aej.getClient());
                  this.lo.aej.setMouseIndex(Class320.l);
                  this.lo.aej.fw("解锁成功");
               }
            } else {
               ((Class95)this.lo).ly(var5);
            }
         }
      } else if (this.lo instanceof Class545) {
         if (var5 != null) {
            ((Class545)this.lo).bk(var5.getRgid());
         }
      } else {
         if (this.lo instanceof Class649) {
            if (var5 == null) {
               return;
            }

            ((Class649)this.lo).amo(4 ^ 5, (String[])null, var5);
         }

      }
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getStarCardGood(var1)) != null) {
         if (this.lo instanceof Class95) {
            ((Class95)this.lo).ly(var4);
         } else if (this.lo instanceof Class545) {
            ((Class545)this.lo).bk(var4.getRgid());
         } else {
            if (this.lo instanceof Class649) {
               ((Class649)this.lo).amo(5 >> 2, (String[])null, var4);
            }

         }
      }
   }
}
