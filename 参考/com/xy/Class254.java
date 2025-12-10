package com.xy;

import com.xy.readbean.Eshop;
import com.xy.readbean.Shop;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class Class254 extends JComponent implements MouseListener {
   public static Class116 la = new Class116(1 ^ 3, 1 ^ 3, 110 & 127, 110 & 127);
   private Class243 acn;
   private String aar = "";
   private Class254 ahj = this;
   private String yr = "";
   private Class44 it;

   public void mousePressed(MouseEvent var1) {
   }

   public void mouseReleased(MouseEvent var1) {
      if (this.acn.getForm() instanceof Class139) {
         ((Class139)this.acn.getForm()).sq((Eshop)this.it.hr());
      }

   }

   public void mouseExited(MouseEvent var1) {
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void q() {
      this.aar = "";
      this.yr = "";
      this.it.c(3 >> 2, (Object)null);
      this.it.setVisible((boolean)(--1));
   }

   protected void paintComponent(Graphics var1) {
      Class254 var10000 = this;
      Graphics var2 = var1;
      Class254 var3 = var10000;
      var3.paintComponent(var2);
      var2.setFont(Class681.bm);
      var2.setColor(Color.black);
      var2.drawString(var3.aar, 2 & 5, 25271 & 7625);
      var2.setColor(Color.red);
      var2.drawString(var3.yr, 3 >> 2, 3539 & 29372);
   }

   public Class254(Class345 var1) {
      this.setPreferredSize(new Dimension(119 & 123, 21759 & 11158));
      this.acn = new Class243("sc/e/6.png", 2 ^ 3, 3 & 4, "购买", var1);
      this.acn.nw(this);
      this.acn.setOffsetTexts(Class681.am);
      this.acn.setBounds(80 & 127, 8668 & 24231, 42 & 119, 29 & 115);
      this.add(this.acn);
      if (var1 instanceof Class139) {
         this.it = new Class44(var1) {
            public void af(MouseEvent var1) {
               Class254.this.ahj.mouseReleased(var1);
            }
         };
         this.addMouseListener(this);
      }

      if (this.it == null) {
         this.it = new Class44(var1);
      }

      this.it.fw("sc/b/3.png");
      this.it.ad(la);
      this.it.setBounds(2 & 5, 2 & 5, 115 & 127, 115 & 127);
      this.add(this.it);
   }

   public void rz(Shop var1) {
      this.q();
      this.setVisible((boolean)(var1 != null ? --1 : 0));
      if (var1 != null) {
         this.yr = var1.getShopprice() + " 积分";
         this.aar = var1.getShopname();
         this.it.c(79 & 61, var1);
         this.it.setVisible((boolean)(--1));
      }
   }

   public void xk(Eshop var1, String var2) {
      this.q();
      this.setVisible((boolean)(var1 != null ? 3 & 5 : 0));
      if (var1 != null) {
         this.yr = var1.getEshopprice() + " " + var2;
         this.aar = var1.getEshopname();
         this.it.c(55 & 91, var1);
         this.it.setVisible((boolean)(4 ^ 5));
      }
   }

   public Class44 u() {
      return this.it;
   }
}
