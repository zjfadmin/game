package com.xy.q;

import com.xy.a.q.Class108;
import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class Class7 extends Class25 {
   private boolean cf;

   @Override
   public int il() {
      int var1 = this.ae * this.ha;
      RoleData var2;
      if ((var2 = this.wd.yx()) == null) {
         return 0;
      } else {
         return this.cf ? (var2.lingbaoList.size() - 1) / var1 : (var2.fabaoList.size() - 1) / var1;
      }
   }

   @Override
   public boolean at(int var1) {
      int var2;
      if ((var2 = var1 * this.ae * this.ha) == 0) {
         return true;
      } else {
         RoleData var3;
         if ((var3 = this.wd.yx()) == null) {
            return false;
         } else {
            return this.cf ? var3.getLingBaoIndex(var2) != null : var3.getFaBaoIndex(var2) != null;
         }
      }
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      if (var2.isShiftDown()) {
         Lingbao var7 = this.cf ? var3.getLingBaoIndex(var1) : var3.getFaBaoIndex(var1);
         if (var7 != null) {
            try {
               JTextField var5;
               Class11 var10000 = (Class11)(var5 = this.wd.afx.getBaseView().ty()).getDocument();
               int var10001 = var5.getCaretPosition();
               BigDecimal var10003 = var7.getBaoid();
               String var10004 = "[" + var7.getBaoname() + "]";
               String var10005 = "o";
               var10000.lx(var10001, 4, var10003, var10004, "G", null);
            } catch (BadLocationException var6) {
               var6.printStackTrace();
            }
         }
      } else {
         Lingbao var4 = this.cf ? var3.getLingBaoIndex(var1) : var3.getFaBaoIndex(var1);
         if (var4 != null) {
            if (this.wd instanceof Class108) {
               ((Class108)this.wd).cq(var4);
            }
         }
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      int var3 = this.dx();
      int var4 = 0;

      int var5;
      for (int var10000 = var5 = 0; var10000 < this.abe.length; var10000 = ++var5) {
         var4 = var5 + var3;
         if (this.lp != null) {
            var1.drawImage(this.lp, var5 % this.ae * this.z, var5 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         Lingbao var6 = this.cf ? var2.getLingBaoIndex(var4) : var2.getFaBaoIndex(var4);
         if (var6 == null) {
            if (this.abe[var5] != null) {
               this.abe[var5].e();
            }
         } else {
            if (this.abe[var5] == null || var6.getBaoid() != this.abe[var5].e) {
               if (this.abe[var5] == null) {
                  this.abe[var5] = new com.xy.w.Class14();
               }

               this.abe[var5].j(var6);
            }

            Lingbao var8;
            if (var4 != this.gv) {
               var8 = var6;
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz, this.ah);
               var8 = var6;
            }

            if (var8.getEquipment() == 1) {
               var1.drawImage(com.xy.w.Class15.c, var5 % this.ae * this.z, var5 / this.ae * this.cb, null);
            }
         }
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(45);
   }

   public Class7(boolean var1, Class30 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.cf = var1;
   }

   @Override
   protected void am(RoleData var1) {
      Lingbao var2 = this.cf ? var1.getLingBaoIndex(this.ia + this.dx()) : var1.getFaBaoIndex(this.ia + this.dx());
      if (var2 != null) {
         ((com.xy.a.Class7)this.wd.zc().j(45)).cs(var2, false);
      }
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Lingbao var4 = this.cf ? var3.getLingBaoIndex(var1) : var3.getFaBaoIndex(var1);
      if (var4 != null) {
         if (this.wd instanceof com.xy.a.a.Class33) {
            ((com.xy.a.a.Class33)this.wd).acb(var4);
         } else {
            if (this.wd instanceof Class108) {
               ((Class108)this.wd).cq(var4);
            }
         }
      }
   }
}
