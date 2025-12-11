package com.xy.a.q;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.socket.Agreement;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class2 implements MouseListener {
   private int ds;
   // $VF: synthetic field
   final Class108 dw;
   private int ah;

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ah == 0) {
         if (Class89.j(Class108.ana(this.dw)) == 0) {
            String var6 = "[";
            String var5 = Agreement.getSendTextAES("TransState", "3");
            this.dw.za().k(var5);
         } else {
            String var10001 = "7";
            String var4 = Agreement.getSendTextAES("TransState", "4");
            this.dw.za().k(var4);
         }
      } else {
         if (this.ah == 1) {
            if (this.ds == 0 || this.ds == 1) {
               RoleSummoning var3;
               if ((var3 = Class89.c(Class108.ana(this.dw)).getPet(this.ds)) == null) {
                  return;
               }

               this.dw.amy(this.dw.yx().getRolePet(var3.getSid().longValue()), var1);
               return;
            }

            Lingbao var2;
            if ((var2 = Class89.c(Class108.ana(this.dw)).getLingbao(this.ds - 2)) == null) {
               return;
            }

            this.dw.cq(var2);
         }
      }
   }

   public Class2(Class108 var1, int var2, int var3) {
      this.dw = var1;
      this.ah = var2;
      this.ds = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      if (this.ah == 1 || this.ah == 2) {
         if (this.ds == 0 || this.ds == 1) {
            this.dw.zc().f(42);
            return;
         }

         this.dw.zc().f(45);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.ah == 1 || this.ah == 2) {
         if (this.ds == 0 || this.ds == 1) {
            RoleSummoning var4 = this.ah == 1 ? Class89.c(Class108.ana(this.dw)).getPet(this.ds) : Class89.c(Class108.anb(this.dw)).getPet(this.ds);
            if (var4 == null) {
               return;
            }

            ((com.xy.a.Class1)this.dw.zc().j(42)).aa(var4, null, false);
            return;
         }

         Lingbao var2 = this.ah == 1 ? Class89.c(Class108.ana(this.dw)).getLingbao(this.ds - 2) : Class89.c(Class108.anb(this.dw)).getLingbao(this.ds - 2);
         if (var2 == null) {
            return;
         }

         ((com.xy.a.Class7)this.dw.zc().j(45)).cs(var2, false);
      }
   }
}
