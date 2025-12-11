package com.xy.i;

import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class21 extends Class1 {
   private int eg;
   private int ah;

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public void g(int var1) {
      this.eg = var1;
   }

   public Class21(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
   }

   public int lj() {
      return this.ah;
   }

   public Class21(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class21 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.eg != 0) {
         if (this.eg == 3) {
            Class0.ff(142, this.form.afx);
         } else if (this.eg == 5) {
            Class0.fh(167, this.form.afx, new Integer(1));
         } else if (this.eg > 100 && this.eg < 200) {
            Activity var5;
            if ((var5 = this.form.yt().cd(this.eg)) != null) {
               if (var5.getModelId() == 1) {
                  Class0.fh(168, this.form.afx, var5);
               } else if (var5.getModelId() == 2) {
                  Class0.fh(167, this.form.afx, var5);
               } else {
                  if (var5.getModelId() == 3) {
                     Class0.fh(176, this.form.afx, var5);
                  }
               }
            }
         } else {
            String var4 = Agreement.getSendTextAES("vicon", String.valueOf(this.eg));
            this.form.za().k(var4);
         }
      } else if (this.ah == 50) {
         if (this.form.za().gameType == 2) {
            Class0.ff(103, this.form.afx);
         } else {
            Class0.ff(129, this.form.afx);
         }
      } else if (this.ah == 52) {
         String var3 = Agreement.getSendTextAES("Paydaygradepay", null);
         this.form.za().k(var3);
      } else if (this.ah == 56) {
         Class0.ff(120, this.form.afx);
      } else if (this.ah == 57) {
         String var10001 = "\u000eyj\u001fh\u001e";
         String var2 = Agreement.getSendTextAES("getfivemsg", "VV2001");
         this.form.za().k(var2);
      } else if (this.ah == 68) {
         Class0.ff(68, this.form.afx);
      } else {
         if (this.ah == 150) {
            Class0.ff(150, this.form.afx);
         }
      }
   }

   public void n(int var1) {
      this.ah = var1;
   }

   public int il() {
      return this.eg;
   }

   public Class21(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }
}
