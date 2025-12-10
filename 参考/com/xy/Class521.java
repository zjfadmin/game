package com.xy;

import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class521 extends Class397 {
   private boolean op;

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Lingbao var4 = this.op ? var3.getLingBaoIndex(var1) : var3.getFaBaoIndex(var1);
      if (var4 != null) {
         if (this.lo instanceof Class31) {
            ((Class31)this.lo).fn(var4);
         } else {
            if (this.lo instanceof Class674) {
               ((Class674)this.lo).fn(var4);
            }

         }
      }
   }

   public int ae() {
      int var1 = this.cy * this.gw;
      RoleData var2;
      if ((var2 = this.lo.vd()) == null) {
         return 3 & 4;
      } else {
         return this.op ? (var2.lingbaoList.size() - --1) / var1 : (var2.fabaoList.size() - (2 ^ 3)) / var1;
      }
   }

   protected void cl(RoleData var1) {
      Lingbao var2 = this.op ? var1.getLingBaoIndex(this.j + this.ot()) : var1.getFaBaoIndex(this.j + this.ot());
      if (var2 != null) {
         ((Class73)this.lo.ve().e(125 & 47)).ge(var2, (boolean)(3 ^ 3));
      }
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      Lingbao var6;
      if (var2.isShiftDown()) {
         var6 = this.op ? var3.getLingBaoIndex(var1) : var3.getFaBaoIndex(var1);
         if (var6 != null) {
            try {
               JTextField var4;
               ((Class175)(var4 = this.lo.aej.getBaseView().jj()).getDocument()).arf(var4.getCaretPosition(), --4, var6.getBaoid(), "[" + var6.getBaoname() + "]", "G", (AttributeSet)null);
            } catch (BadLocationException var5) {
               var5.printStackTrace();
            }
         }
      } else {
         var6 = this.op ? var3.getLingBaoIndex(var1) : var3.getFaBaoIndex(var1);
         if (var6 != null) {
            if (this.lo instanceof Class674) {
               ((Class674)this.lo).fn(var6);
            }

         }
      }
   }

   protected void q() {
      this.lo.ve().n(45 & 127);
   }

   public boolean au(int var1) {
      if ((var1 = var1 * this.cy * this.gw) == 0) {
         return (boolean)(3 >> 1);
      } else {
         RoleData var2;
         if ((var2 = this.lo.vd()) == null) {
            return (boolean)(5 >> 3);
         } else if (this.op) {
            return (boolean)(var2.getLingBaoIndex(var1) != null ? 2 ^ 3 : 0);
         } else {
            return (boolean)(var2.getFaBaoIndex(var1) != null ? 2 ^ 3 : 0);
         }
      }
   }

   protected void cm(Graphics var1, RoleData var2) {
      int var5 = this.ot();
      int var4 = 3 ^ 3;

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < this.asw.length; var10000 = var3) {
         var4 = var3 + var5;
         if (this.ama != null) {
            var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (1 ^ 3), this.m + --2, (ImageObserver)null);
         }

         Lingbao var6 = this.op ? var2.getLingBaoIndex(var4) : var2.getFaBaoIndex(var4);
         if (var6 == null) {
            if (this.asw[var3] != null) {
               this.asw[var3].g();
            }
         } else {
            if (this.asw[var3] == null || var6.getBaoid() != this.asw[var3].i) {
               if (this.asw[var3] == null) {
                  this.asw[var3] = new Class467();
               }

               this.asw[var3].c(var6);
            }

            Lingbao var7;
            if (var4 != this.gv) {
               var7 = var6;
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (4 ^ 5), var3 / this.cy * this.gc + --1, this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + (1 ^ 3), this.bn, this.m);
               var7 = var6;
            }

            if (var7.getEquipment() == 3 >> 1) {
               var1.drawImage(Class222.i, var3 % this.cy * this.dp, var3 / this.cy * this.gc, (ImageObserver)null);
            }
         }

         ++var3;
      }

   }

   public Class521(boolean var1, Class345 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.op = var1;
   }
}
