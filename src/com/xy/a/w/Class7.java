package com.xy.a.w;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class7 implements MouseListener {
   // $VF: synthetic field
   final Class19 ju;
   private int eg;
   private int ah;

   public Class7(Class19 var1, int var2, int var3) {
      this.ju = var1;
      this.ah = var2;
      this.eg = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ah == 1) {
         boolean var2 = this.eg == 1;
         if (var2 == Class19.ud(this.ju)) {
            return;
         }

         Class19.uf(this.ju, var2);
         com.xy.w.Class18 var10000 = Class19.ug(this.ju)[1];
         String var4;
         if (Class19.ud(this.ju)) {
            var4 = "YL\u0005J\u0005\u0019\u0019\u0001ZAM";
            var4 = "sc/e/63.png";
         } else {
            var4 = "B\u000e\u001e\b\u001e[\u0003CA\u0003V";
            var4 = "sc/e/62.png";
         }

         var10000.dp(var4);
         var10000 = Class19.ug(this.ju)[2];
         if (Class19.ud(this.ju)) {
            var4 = "YL\u0005J\u0005\u0019\u0018\u0001ZAM";
            var4 = "sc/e/62.png";
         } else {
            var4 = "B\u000e\u001e\b\u001e[\u0002CA\u0003V";
            var4 = "sc/e/63.png";
         }

         var10000.dp(var4);
         this.ju.f();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }
}
