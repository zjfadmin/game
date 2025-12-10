package com.xy;

import com.xy.readbean.Shop;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class Class293 extends JPanel {
   private Shop acm;
   private Class243 acn;
   private Class44 cn;
   private Color wg;
   private Image fq;
   private String rf;

   public Class293(Class345 var1, Shop var2) {
      int var10010 = 2 & 5;
      super();
      this.setPreferredSize(new Dimension(4602 & 28415, 105 & 87));
      this.setLayout((LayoutManager)null);
      this.setOpaque((boolean)var10010);
      this.setBackground(Class681.cu);
      this.acm = var2;
      this.acn = new Class243("sc/e/7.png", 5 >> 2, 3 & 4, Class681.ak, Class681.c, "兑换", var1);
      this.acn.nw(this);
      this.acn.setBounds(14767 & 18175, 31 & 126, 63 & 123, 91 & 61);
      this.add(this.acn);
      this.cn = new Class44(var1);
      this.cn.ad(Class44.art);
      this.cn.fw("sc/d/4.png");
      this.cn.setBounds(127 & 19, 118 & 15, 63 & 110, 63 & 110);
      this.add(this.cn);
      Class293 var10000;
      if (var1.uw().gameType == --4) {
         var10000 = this;
         this.wg = Class681.c("#c00ffff");
      } else {
         var10000 = this;
         this.wg = Class681.ag;
      }

      var10000.cn.c(63 & 77, var2);
      this.rf = "积分:" + var2.getShopprice();
   }

   public Shop uc() {
      return this.acm;
   }

   public void q() {
      this.acm = null;
      this.rf = null;
      this.cn.c(2 & 5, (Object)null);
   }

   public void rz(Shop var1) {
      this.acm = var1;
      this.cn.c(109 & 31, var1);
      this.rf = "积分:" + var1.getShopprice();
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.acm != null) {
         if (this.fq == null) {
            this.fq = Class511.a("sc/b/分割线_w225,h1.png");
         }

         var1.drawImage(this.fq, 111 & 30, 62 & 127, 32741 & 251, 3 & 5, this);
         var1.setFont(Class681.ce);
         var1.setColor(Color.white);
         var1.drawString(this.acm.getShopname(), 113 & 95, 31 & 116);
         var1.setColor(this.wg);
         var1.drawString(this.rf, 81 & 127, 58 & 119);
      }

   }
}
