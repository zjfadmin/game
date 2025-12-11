package com.xy.a.w;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;

class Class1 extends com.xy.w.Class18 implements MouseListener {
   private BigDecimal bn;
   // $VF: synthetic field
   final Class19 bo;
   private int ah;
   private Image bp;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   // $VF: synthetic method
   static void aq(Class1 var0, Image var1) {
      var0.bp = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.bo.ue(this);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.bp != null) {
         var1.drawImage(this.bp, 2, 2, 65, 85, null);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   // $VF: synthetic method
   static void ar(Class1 var0, BigDecimal var1) {
      var0.bn = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   // $VF: synthetic method
   static BigDecimal as(Class1 var0) {
      return var0.bn;
   }

   public Class1(Class19 var1, int var2) {
      super(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
      String var10005 = "T\t\b\u000e\b^\u001eDW\u0004@";
      this.bo = var1;
      this.ah = var2;
      this.addMouseListener(this);
   }
}
