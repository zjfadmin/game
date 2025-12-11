package com.xy.a.q;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class56 implements MouseListener {
   private int cb;
   private JLabel dh;
   // $VF: synthetic field
   final Class88 adp;
   private int eg;
   private com.xy.w.Class18 dn;

   public void n(int var1) {
      this.cb = var1;
      String var2;
      if (var1 == 0) {
         var2 = "qq-w- ;<r|e";
         var2 = "sc/e/29.png";
      } else {
         var2 = "6Yj_j\tu\u00145T\"";
         var2 = "sc/e/30.png";
      }

      this.dn.dp(var2);
   }

   // $VF: synthetic method
   static JLabel ww(Class56 var0) {
      return var0.dh;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public Class56(Class88 var1, int var2, Class88 var3) {
      this.adp = var1;
      this.eg = var2;
      this.dh = com.xy.q.Class1.f(65, 358 + var2 * 22, 150, 17, 10, Color.black, com.xy.q.Class49.k);
      String var4;
      if (var2 == 0) {
         var4 = "弒吭攽揶刅衪";
         var4 = "开启支援列表";
      } else if (var2 == 1) {
         var4 = "镄宠駓叫厩唞儸";
         var4 = "锁定首发召唤兽";
      } else if (var2 == 2) {
         var4 = "戊斕畞靠昬礸攽揶";
         var4 = "战斗界面显示支援";
      } else {
         var4 = "";
      }

      this.dh.setText(var4);
      String var10005 = "6Yj_j\b|\u00145T\"";
      this.dn = new com.xy.w.Class18("sc/e/29.png");
      this.dn.setBounds(47, 358 + var2 * 22, 17, 17);
      Class88 var10000;
      if (var2 == 1) {
         var10000 = var3;
         this.n(1);
      } else {
         this.dn.addMouseListener(this);
         var10000 = var3;
      }

      var10000.add(this.dh);
      var3.add(this.dn);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.eg == 0) {
         this.adp.e();
      } else {
         if (this.eg == 2) {
            this.adp.afx.systemData.setB6(this.cb != 0);
            this.adp.afx.systemData.setValue();
            this.n(this.cb == 0 ? 1 : 0);
            this.adp.afx.getBattleControl().g();
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }
}
