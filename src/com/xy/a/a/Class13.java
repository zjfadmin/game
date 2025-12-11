package com.xy.a.a;

import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.readbean.PalData;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class13 extends JComponent {
   private com.xy.w.Class18 co;
   private com.xy.q.Class14[] mv;
   public com.xy.w.Class0 mw;
   private com.xy.i.Class4[] ly;
   private JLabel[] o;
   // $VF: synthetic field
   final Class38 mx;

   public void fn(Pal var1, PalData var2) {
      RoleData var3;
      String var4 = com.xy.v.Class4.h((var3 = this.mx.yx()).getLoginResult().getGrade());
      int[] var5 = PetProperty.getPalHMASp(var1, var2, var3);
      this.mv[0].setText(var2.getName());
      this.mv[1].setText(var2.getTrait());
      this.mv[2].setText(new StringBuilder(String.valueOf(var4)).append("级").toString());
      this.mv[3].setForeground(BaseValue.getPalLvlColor(var1 == null ? 0.0 : var1.getGrow()));
      this.mv[3].setText(BaseValue.getPalLvl(var1 == null ? 0.0 : var1.getGrow()));
      this.mv[4].setText(String.valueOf(var5[0]));
      this.mv[5].setText(String.valueOf(var5[1]));
      this.mv[6].setText(String.valueOf(var5[2]));
      this.mv[7].setText(String.valueOf(var5[3]));
      Class13 var10000;
      if (this.mw == null) {
         this.mw = com.xy.w.Class11.t(var2.getSkin(), 7, 1, null);
         var10000 = this;
      } else {
         this.mw = com.xy.w.Class11.ah(this.mw, 1, var2.getSkin());
         var10000 = this;
      }

      BigDecimal var8;
      RoleData var9;
      if (var1 != null) {
         var8 = var1.getId();
         var9 = var3;
      } else {
         var8 = null;
         var9 = var3;
      }

      int var6 = var10000.mx.aci(var8, var9.getLoginResult().getPals());
      this.n(var6);
      this.be(false);
   }

   // $VF: synthetic method
   static com.xy.i.Class4[] ju(Class13 var0) {
      return var0.ly;
   }

   public boolean ah() {
      if (this.ly[2].isVisible()) {
         this.be(false);
         return true;
      } else {
         return false;
      }
   }

   public Class13(Class38 var1) {
      this.mx = var1;
      this.ly = new com.xy.i.Class4[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ly.length; var10000 = var2) {
         com.xy.i.Class4[] var5 = this.ly;
         int var10006 = 123 + var2;
         String var23;
         Class38 var10010;
         if (var2 == 0) {
            var23 = "调整";
            var10010 = var1;
         } else if (var2 == 1) {
            var23 = "抗性";
            var10010 = var1;
         } else {
            var23 = "";
            var10010 = var1;
         }

         com.xy.i.Class4 var10002 = new com.xy.i.Class4("sc/e/7.png", 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var23, var10010.eg());
         var5[var2] = var10002;
         Class13 var6;
         if (var2 != 0 && var2 != 1) {
            var6 = this;
            this.ly[var2].setBounds(224, 225 + (var2 - 2) * 25, 59, 25);
         } else {
            var6 = this;
            this.ly[var2].setBounds(224 + var2 * 79, 325, 59, 25);
         }

         var6.add(this.ly[var2++]);
      }

      this.o = new JLabel[8];

      for (int var7 = var2 = 0; var7 < this.o.length; var7 = var2) {
         this.o[var2] = com.xy.q.Class1.f(380, 82 + 28 * var2, 45, 19, 0, Color.black, com.xy.q.Class49.ch);
         JLabel var8 = this.o[var2];
         String var10;
         if (var2 == 0) {
            var10 = "名字";
         } else if (var2 == 1) {
            var10 = "门派";
         } else if (var2 == 2) {
            var10 = "等级";
         } else if (var2 == 3) {
            var10 = "资质";
         } else if (var2 == 4) {
            var10 = "气血";
         } else if (var2 == 5) {
            var10 = "法力";
         } else if (var2 == 6) {
            var10 = "攻击";
         } else if (var2 == 7) {
            var10 = "速度";
         } else {
            var10 = "";
         }

         var8.setText(var10);
         this.add(this.o[var2++]);
      }

      this.mv = new com.xy.q.Class14[8];

      for (int var9 = var2 = 0; var9 < this.mv.length; var9 = var2) {
         this.mv[var2] = com.xy.q.Class1.i(425, 82 + 28 * var2, 114, 19, 10, Color.white, com.xy.q.Class49.w);
         this.mv[var2].mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.mv[var2++]);
      }

      this.co = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
      this.co.setBounds(205, 70, 175, 244);
      this.add(this.co);
   }

   // $VF: synthetic method
   static JLabel[] jv(Class13 var0) {
      return var0.o;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.mw != null) {
         this.mw.r(var1, 285, 270, 0, com.xy.v.Class22.l());
      }
   }

   public void n(int var1) {
      if (var1 == 0) {
         this.ly[0].setText("参战");
      } else if (var1 > 0) {
         this.ly[0].setText("调整");
      } else {
         this.ly[0].setText("激活");
      }
   }

   public void be(boolean var1) {
      int var2;
      for (int var10000 = var2 = 2; var10000 < this.ly.length; var10000 = var2) {
         this.ly[var2++].setVisible(var1);
      }
   }
}
