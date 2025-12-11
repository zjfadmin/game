package com.xy.a;

import com.xy.bean.RoleShow;
import com.xy.game.GameUtil;
import com.xy.game.HandleOption;
import com.xy.readbean.Goodstable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import java.util.List;

class Class84 implements MouseListener, MouseMotionListener {
   // $VF: synthetic field
   final Class121 rb;

   Class84(Class121 var1) {
      this.rb = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      Iterator var5;
      Iterator var10000 = var5 = Class121.akn(this.rb).iterator();

      int var8;
      while (true) {
         if (!var10000.hasNext()) {
            var8 = var2;
            break;
         }

         Class31 var4 = (Class31)var5.next();
         if (Class121.vv() == null) {
            var8 = var2;
            break;
         }

         if (Class121.vv().s(var1.getX() + Class121.ajy(this.rb)[2].getX() - Class31.b(var4), var1.getY() + Class121.ajy(this.rb)[2].getY() - Class31.a(var4))) {
            Class121.akc(this.rb, Class31.c(var4).getMenu());
            Class121.akr(this.rb).d = var1.getX() + 8;
            Class121.akr(this.rb).a = var1.getY() + 12;
            Class121.akr(this.rb).b = -1;
            return;
         }

         var10000 = var5;
      }

      var2 = (int)(var8 * (Class121.akp(this.rb) / 20.0));
      var3 = (int)(var3 * (Class121.akh(this.rb) / 20.0));
      Class121 var10003 = this.rb;
      String var10006 = "\\";
      StringBuilder var10004 = new StringBuilder("(").append(var2).append(",").append(var3);
      String var10005 = "d";
      Class121.akc(var10003, var10004.append(")").toString());
      Class121.akr(this.rb).d = var1.getX() + 8;
      Class121.akr(this.rb).a = var1.getY() + 12;
      Class121.akr(this.rb).b = -1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Class121.akc(this.rb, null);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      if (var1.isMetaDown()) {
         var2 = (int)(var2 * Class121.akp(this.rb));
         var3 = (int)(var3 * Class121.akh(this.rb));
         HandleOption.ae(Class121.ajx(this.rb), var2, var3, this.rb.afx, this.rb.afx.systemData.k());
      } else {
         Iterator var5;
         Iterator var10000 = var5 = Class121.akn(this.rb).iterator();

         int var13;
         while (true) {
            if (!var10000.hasNext()) {
               var13 = var2;
               break;
            }

            Class31 var4 = (Class31)var5.next();
            if (Class121.vv() == null) {
               var13 = var2;
               break;
            }

            if (Class121.vv()
               .s(var1.getX() + Class121.ajy(this.rb)[2].getX() - Class31.b(var4), var1.getY() + Class121.ajy(this.rb)[2].getY() - Class31.a(var4))) {
               Goodstable var6;
               if ((var6 = this.rb.yx().getGood(Class31.e(var4))) == null) {
                  return;
               }

               ((Class6)this.rb.zc().j(27)).cd(var6, Class31.c(var4).getMenu());
               return;
            }

            var10000 = var5;
         }

         var2 = (int)(var13 * Class121.akp(this.rb));
         var3 = (int)(var3 * Class121.akh(this.rb));
         if (this.rb.afx.mapScene.r == Class121.ajx(this.rb)) {
            GameUtil.i(var2 / 20, var3 / 20, 0, this.rb.afx);
         } else {
            RoleShow var11 = this.rb.afx.roleUnit.ap;
            List var12;
            if ((
                  var12 = this.rb
                     .afx
                     .getObjectArea()
                     .y()
                     .a(
                        var11.getMapid().intValue(),
                        var11.getX(),
                        var11.getY(),
                        0,
                        (int)Class121.ajx(this.rb).getMapId(),
                        var2,
                        var3,
                        0,
                        0,
                        this.rb.afx.roleData
                     )
               )
               == null) {
               String var10001 = "低戍圆伀罀断泻迳刞皣皪坽";
               this.rb.afx._do("你所在位置无法达到目的地");
            } else {
               this.rb.afx.automation.e(var12);
            }
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }
}
