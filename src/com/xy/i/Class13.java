package com.xy.i;

import com.xy.a.q.Class88;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.q.Class30;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

public class Class13 extends Class1 {
   private Image image;
   private int ah;

   @Override
   public void cw(MouseEvent var1) {
      Class88 var2;
      if ((var2 = (Class88)this.form.zc().l(62)) != null && var2.isVisible()) {
         this.form.zc().f(62);
      } else {
         ((Class88)this.form.zc().j(62)).bi(this.ah == 11 ? 0 : 1);
         this.form.zc().b(62);
      }
   }

   public void gw(Object var1) {
      if (var1 == null) {
         this.image = null;
      } else if (var1 instanceof RoleSummoning) {
         RoleSummoning var3 = (RoleSummoning)var1;
         String var10003 = ",";
         this.image = com.xy.w.Class15.e("p" + var3.getSummoningskin());
      } else if (var1 instanceof Lingbao) {
         Lingbao var2 = (Lingbao)var1;
         this.image = com.xy.w.Class15.b(var2.getSkin());
      } else {
         this.image = null;
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.image != null) {
         var1.drawImage(this.image, 2, 2, 40, 40, null);
      }
   }

   public Class13(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
   }

   public int il() {
      return this.ah;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }
}
