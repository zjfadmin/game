package com.xy.i;

import com.xy.a.v.Class24;
import com.xy.a.v.Class27;
import com.xy.a.v.Class28;
import com.xy.a.v.Class37;
import com.xy.a.v.Class38;
import com.xy.a.v.Class39;
import com.xy.a.v.Class44;
import com.xy.a.v.Class45;
import com.xy.a.v.Class48;
import com.xy.q.Class30;
import com.xy.q.Class49;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class Class22 extends Class1 {
   private int ds;
   private JComponent qe;
   private int ah;

   @Override
   public void cw(MouseEvent var1) {
      if (this.qe != null) {
         if (this.qe instanceof Class48) {
            ((Class48)this.qe).g(this.ds);
         } else if (this.qe instanceof com.xy.a.v.Class21) {
            ((com.xy.a.v.Class21)this.qe).n(this.ds);
         } else if (this.qe instanceof com.xy.a.v.Class15) {
            ((com.xy.a.v.Class15)this.qe).cc(this.ds, this.ah);
         } else if (this.qe instanceof Class37) {
            ((Class37)this.qe).g(this.ds);
         } else {
            if (this.qe instanceof com.xy.a.v.Class16) {
               ((com.xy.a.v.Class16)this.qe).n(this.ds);
            }
         }
      } else if (this.ds == 140) {
         ((Class27)this.form).h();
      } else if (this.ds == 141 || this.ds == 142) {
         ((Class38)this.form).gs(this.ds, null);
      } else if (this.ds == 151) {
         ((Class45)this.form).g(Integer.parseInt(this.getName()));
      } else if (this.ds == 161 || this.ds == 162) {
         ((com.xy.a.v.Class23)this.form).gs(this.ds, Integer.parseInt(this.getName()));
      } else if (this.ds >= 180 && this.ds <= 183) {
         ((com.xy.a.v.Class22)this.form).cc(this.ds, this.ah);
      } else if (this.ds >= 191 && this.ds <= 198) {
         ((com.xy.a.v.Class20)this.form).cc(this.ds, this.ah);
      } else {
         if (this.ds == 201) {
            ((com.xy.a.v.Class0)this.form).g(this.ds);
         }
      }
   }

   public Class22(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ds = var3;
      Class22 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(0);
      this.setText(var6);
   }

   public Class22(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7, JComponent var8) {
      super(var1, var2, var5, var7);
      this.ds = var3;
      this.qe = var8;
      Class22 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(0);
      this.setText(var6);
   }

   public int lj() {
      return this.ds;
   }

   public int il() {
      return this.ah;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (this.ds >= 1 && this.ds <= 20) {
         if (var2) {
            ((Class39)this.form).acj(this.ds, this.ah);
            return;
         }
      } else if (this.ds >= 21 && this.ds <= 30) {
         if (var2) {
            ((Class44)this.form).g(this.ds);
            return;
         }
      } else if (this.ds == 31) {
         if (var2) {
            ((Class28)this.form).g(this.ah);
            return;
         }
      } else if (this.ds == 32) {
         if (var2) {
            ((com.xy.a.v.Class30)this.form).g(this.ah);
            return;
         }
      } else if (this.ds == 143) {
         if (var2) {
            ((Class38)this.form).gs(this.ds, Integer.parseInt(this.getName()));
            return;
         }
      } else {
         if (this.ds == 146) {
            ((Class38)this.form).gs(this.ds, Integer.parseInt(this.getName()));
            return;
         }

         if (this.ds >= 171 && this.ds <= 173) {
            ((Class24)this.form).g(this.ds - 171);
         }
      }
   }

   public void g(int var1) {
      this.ah = var1;
   }

   public Class22(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ds = var3;
      this.form = var4;
   }

   public void n(int var1) {
      this.ds = var1;
   }

   public Class22(String var1, int var2, int var3, Class30 var4, JComponent var5) {
      super(var1, var2, var4);
      this.ds = var3;
      this.qe = var5;
      this.setHorizontalAlignment(0);
      this.setVerticalTextPosition(0);
   }

   public Class22(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }
}
