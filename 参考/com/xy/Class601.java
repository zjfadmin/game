package com.xy;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;

public class Class601 extends Class93 {
   private Image image;
   private int m;

   public void bq(Object var1) {
      if (var1 == null) {
         this.image = null;
      } else if (var1 instanceof RoleSummoning) {
         RoleSummoning var3 = (RoleSummoning)var1;
         this.image = Class222.t("p" + var3.getSummoningskin());
      } else if (var1 instanceof Lingbao) {
         Lingbao var2 = (Lingbao)var1;
         this.image = Class222.j(var2.getSkin());
      } else {
         this.image = null;
      }
   }

   public Class601(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
   }

   public void ac(MouseEvent var1, boolean var2) {
   }

   public int ae() {
      return this.m;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.image != null) {
         var1.drawImage(this.image, --2, --2, 57 & 110, 57 & 110, (ImageObserver)null);
      }

   }

   public void af(MouseEvent var1) {
      Class84 var2;
      if ((var2 = (Class84)this.form.ve().m(63 & 126)) != null && var2.isVisible()) {
         this.form.ve().n(63 & 126);
      } else {
         ((Class84)this.form.ve().e(126 & 63)).y(this.m == (47 & 91) ? 2 & 5 : 1);
         this.form.ve().a(62 & 127);
      }
   }
}
