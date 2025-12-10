package com.xy;

import com.xy.formula.MsgUntil;
import com.xy.readbean.Goodstable;
import com.xy.readbean.LaborShop;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class538 extends Class345 {
   private RichLabel aho;
   private RichLabel dr;
   private Class436 tu;
   private LaborShop ayq;
   private Image xs;
   private Class489 axd;
   private JLabel d;
   private List<null> ie;
   private int cy;
   private JLabel ax;

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.cy != -4 >> 2) {
         <undefinedtype> var2 = this.cy < this.ie.size() ? (<undefinedtype>)this.ie.get(this.cy) : null;
         if (var2 != null) {
            if (this.xs == null) {
               this.xs = Class511.a("sc/b/S340.png");
            }

            var1.drawImage(this.xs, var2.getX(), var2.getY(), (ImageObserver)null);
         }
      }
   }

   public int e() {
      return this.cy;
   }

   public void aem(LaborShop var1) {
      this.ayq = var1;
      this.aho.setTextSize("#cD8C07A" + (var1.getChoice() != null ? MsgUntil.b(var1.getGoods().length) + "#r选#r一#r礼#r包" : "礼#r盒"), 63 & 84);
      this.aho.setBounds(75 & 60, 126 & 51, this.aho.getWidth(), this.aho.getHeight());
      this.ax.setText(var1.getName());
      this.tu.hf(Class222.i(var1.getSkin()));
      this.dr.setTextSize(var1.getText(), 14331 & 18686);
      this.dr.setBounds(100 & 63, 28413 & 4574, this.dr.getWidth(), this.dr.getHeight());
      this.d.setText(var1.getMoneyString(var1.getZk() != null ? Class489.bp(this.vd()) : 1.0D));
      int var10000 = 3 & 4;
      this.cy = -4 >> 2;

      int var2;
      for(var2 = var10000; var10000 < var1.getGoods().length; var10000 = var2) {
         Object var3 = var2 < this.ie.size() ? (<undefinedtype>)this.ie.get(var2) : null;
         if (var3 == null) {
            var3 = new Class44(this, var2) {
               // $FF: synthetic field
               final Class538 nh;
               private int m;

               public void mousePressed(MouseEvent var1) {
                  if (this.nh.ayq.getChoice() != null) {
                     this.nh.cy = this.m;
                  }

               }

               public {
                  this.fw("sc/b/S339.png");
                  this.m = var2;
               }
            };
            ((<undefinedtype>)var3).setBounds((29695 & 3389) + var2 % --3 * (116 & 63), (102 & 61) + var2 / --3 * (127 & 56), 119 & 60, 119 & 60);
            this.ie.add(var3);
            this.add((Component)var3);
         }

         Goodstable var4;
         if ((var4 = this.vc().n(new BigDecimal(var1.getGoods()[var2]))) != null) {
            ((<undefinedtype>)var3).c(3 >> 1, var4);
         } else {
            ((<undefinedtype>)var3).c(0, (Object)null);
            ((<undefinedtype>)var3).setVisible((boolean)(--1));
         }

         ++var2;
      }

      for(var10000 = var2 = this.ie.size() - (2 ^ 3); var10000 >= var1.getGoods().length; var10000 = var2) {
         this.remove((Component)this.ie.remove(var2--));
      }

      this.ve().a(this.ae());
   }

   public LaborShop ael() {
      return this.ayq;
   }

   public Class538(GameView var1) {
      int var10005 = 24309 & 8670;
      int var10010 = 85 & 126;
      int var10015 = -4 >> 2;
      super(31439 & 1471, --2, Class345.aef, var1);
      this.va(var10015, 5 >> 3, 16895 & 16379, 14711 & 18428, Class345.aeo);
      this.fx("sc/b/S334.png");
      this.aho = new RichLabel("", Class681.y);
      this.ax = Class133.c(var10010, 122 & 63, 30187 & 2740, 60 & 87, 3 >> 2, Class681.c("#cF7C16A"), Class681.ce);
      this.tu = new Class436();
      this.tu.setBounds(119 & 122, 126 & 107, 90 & 125, 90 & 125);
      this.dr = new RichLabel();
      this.d = Class133.c(var10005, 9714 & 23391, 6384 & 26543, 20 & 127, 75 & 62, Class681.c("#c634424"), Class681.y);
      this.axd = new Class489("sc/b/B457.png", 2 ^ 3, 62 & 119, this);
      this.axd.setBounds(428, 329, 68, 36);
      this.add(this.aho);
      this.add(this.ax);
      this.add(this.tu);
      this.add(this.dr);
      this.add(this.d);
      this.add(this.axd);
      this.ie = new ArrayList();
   }
}
