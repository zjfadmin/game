package com.xy.a.a;

import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class Class60 extends com.xy.q.Class54 {
   private BigDecimal bn;
   // $VF: synthetic field
   final Class33 aqz;
   private int ah;

   // $VF: synthetic method
   private void f() {
      this.bn = null;
      this.gs(0, null);
      this.setVisible(true);
      this.aui.zc().f(45);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Class60 var4;
      label16: {
         RoleData var10000 = this.aqz.yx();
         Lingbao var3;
         if ((var3 = var10000.getLingbao(var10000.lingbaoChoses[this.ah])) != null) {
            if (this.bn != var3.getBaoid()) {
               var4 = this;
               this.bn = var3.getBaoid();
               this.gs(5, var3);
               break label16;
            }
         } else if (this.bn != null) {
            this.f();
         }

         var4 = this;
      }

      var4.paintComponent(var1);
   }

   public Class60(Class33 var1, int var2, com.xy.q.Class30 var3) {
      super(var3);
      this.aqz = var1;
      this.ah = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      super.mouseReleased(var1);
      if (this.aqz.afx.getBattleScene() == null) {
         RoleData var2;
         RoleData var10000 = var2 = this.aqz.yx();
         if (var10000.getLingbao(var10000.lingbaoChoses[this.ah]) != null) {
            if (!this.aqz.ze().ah()) {
               if (this.aqz.afx.getMouseIndex() == com.xy.v.Class3.k) {
                  var2.h(null, this.ah);
               }
            }
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      if (var1.getButton() == 1) {
         RoleData var10000 = this.aqz.yx();
         Lingbao var3;
         if ((var3 = var10000.getLingbao(var10000.lingbaoChoses[this.ah])) == null) {
            return;
         }

         if (var1.isShiftDown()) {
            try {
               JTextField var4;
               com.xy.q.Class11 var6 = (com.xy.q.Class11)(var4 = this.aqz.ze().getBaseView().ty()).getDocument();
               int var10001 = var4.getCaretPosition();
               BigDecimal var10003 = var3.getBaoid();
               String var10004 = "[" + var3.getBaoname() + "]";
               String var10005 = "\u0002";
               var6.lx(var10001, 4, var10003, var10004, "G", null);
               return;
            } catch (BadLocationException var5) {
               var5.printStackTrace();
               return;
            }
         }
      }
   }
}
