package com.xy.a.q;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JLabel;

class Class50 extends com.xy.w.Class18 implements MouseListener {
   private com.xy.q.Class54[] aax;
   private JLabel di;
   // $VF: synthetic field
   final Class105 aay;

   public Class50(Class105 var1) {
      super(com.xy.w.Class16.m("sc/d/36.png", 16, 16, 16, 16, false));
      String var10007 = "\u00144H3HdQy\u00179\u0000";
      this.aay = var1;
      this.di = com.xy.q.Class1.f(72, 9, 80, 19, 10, Color.black, com.xy.q.Class49.ch);
      this.add(this.di);
      this.aax = new com.xy.q.Class54[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aax.length; var10000 = var2) {
         this.aax[var2] = new Class115(this, var1.eg());
         Class50 var3;
         if (var2 == 0) {
            var3 = this;
            this.aax[var2].wp(com.xy.q.Class54.auw);
            com.xy.q.Class54 var10002 = this.aax[var2];
            String var10003 = "+\u000fw\bwXv\u001c6\u000b";
            var10002.dq("sc/d/4.png");
            this.aax[var2].setBounds(7, 5, 59, 57);
         } else {
            var3 = this;
            this.aax[var2].wp(com.xy.q.Class54.auv);
            com.xy.q.Class54 var4 = this.aax[var2];
            String var6 = "$\u0004x\u0003xSy\u00179\u0000";
            var4.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
            this.aax[var2].setBounds(65 + 29 * (var2 - 1), 30, 31, 31);
         }

         var3.add(this.aax[var2++]);
      }

      this.addMouseListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public void h() {
      this.aay.amf(this);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.h();
   }

   public void bb(Goodstable var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aax.length; var10000 = var2) {
         com.xy.q.Class54 var13 = this.aax[var2];
         var2++;
         var13.gs(0, null);
      }

      if (var1 == null) {
         this.setVisible(false);
      } else {
         var2 = GoodType.r(var1.getType());
         String var17;
         if (var2 == 0) {
            var17 = "款嘄";
            var17 = "武器";
         } else if (var2 == 3) {
            var17 = "蠴杪";
            var17 = "衣服";
         } else if (var2 == 1) {
            var17 = "幥嬼";
            var17 = "帽子";
         } else if (var2 == 2) {
            var17 = "頮钙";
            var17 = "项链";
         } else {
            var17 = "韓嬼";
            var17 = "鞋子";
         }

         this.di.setText(var17);
         this.aax[0].gs(1, var1);
         String var14 = var1.getValue();
         var17 = "寊瞔尉恀";
         String var3;
         if ((var3 = GoodType.getExtra(var14, "宝石属性")) != null) {
            RoleData var4 = this.aay.yx();
            var17 = "J";
            String[] var5 = var3.split("&");

            int var6;
            for (int var15 = var6 = 1; var15 < var5.length; var15 = ++var6) {
               BigDecimal var7 = new BigDecimal(var5[var6]);
               Goodstable var8;
               int var9;
               if ((var8 = var4.getGoodEquip(var7)) != null && (var9 = GoodType.ai(var2, var8.getType())) != 0) {
                  this.aax[var9].gs(1, var8);
               }
            }
         }

         int var11 = 1;
         int var12 = var2 == 0 ? 4 : 3;

         for (int var16 = var11; var16 < var12; var16 = var11) {
            this.aax[var11++].setVisible(true);
         }

         this.setVisible(true);
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class54[] vi(Class50 var0) {
      return var0.aax;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
