package com.xy.a.i;

import com.xy.readbean.Skill;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class27 extends JComponent implements MouseListener {
   private com.xy.w.Class1 abk;
   private int ae;
   private int ds;
   private com.xy.w.Class1 ahx;
   // $VF: synthetic field
   final Class22 ahy;

   public void g(int var1) {
      if (this.ae != var1) {
         this.ae = var1;
         com.xy.w.Class1 var10001;
         if (this.ae != 0) {
            String var10003 = "\u001aYFX\bT\u000e\u00151j#~";
            var10001 = com.xy.w.Class11.f("sc/bang/XPJD" + this.ae + ".tcp", null);
         } else {
            var10001 = null;
         }

         this.abk = var10001;
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      com.xy.v.Class8 var10000 = this.ahy.yt();
      Skill var4;
      if ((var4 = var10000.ac(String.valueOf(var10000.cg().getSkillId()))) != null) {
         ((com.xy.a.Class48)this.ahy.zc().j(46)).qq(1, var4, this.ae);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public Class27(Class22 var1) {
      this.ahy = var1;
      this.addMouseListener(this);
   }

   public com.xy.w.Class1 aai(int var1) {
      return var1 == this.ds ? this.ahx : null;
   }

   public void n(int var1) {
      if (this.ds != var1) {
         this.ds = var1;
         com.xy.w.Class1 var10001;
         if (this.ds != 0) {
            String var10003 = "C`\u001faQmW,hSzK";
            var10001 = com.xy.w.Class11.f("sc/bang/XPJH" + this.ds + ".tcp", null);
         } else {
            var10001 = null;
         }

         this.ahx = var10001;
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.ahy.afx.getFormManagement().f(46);
   }

   // $VF: synthetic method
   static int aaj(Class27 var0) {
      return var0.ds;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.abk != null) {
         this.abk.j(com.xy.v.Class22.l(), 0);
         this.abk.ab(var1, 57, 65);
      }
   }
}
