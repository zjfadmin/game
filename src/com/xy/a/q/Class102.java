package com.xy.a.q;

import com.xy.readbean.Eshop;
import com.xy.readbean.Shop;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class Class102 extends JComponent implements MouseListener {
   private com.xy.q.Class54 jw;
   private String aq;
   private String aaq = "";
   public static com.xy.v.Class32 adb = new com.xy.v.Class32(2, 2, 110, 110);
   private Class102 atc;
   private com.xy.i.Class16 atd;

   public Class102(com.xy.q.Class30 var1) {
      this.aq = "";
      this.atc = this;
      this.setPreferredSize(new Dimension(115, 150));
      String var10009 = "I\u000f\u0015\t\u0015Z\u0014\u001cT\u000b";
      String var10012 = "贍乩";
      this.atd = new com.xy.i.Class16("sc/e/6.png", 1, 0, "购买", var1);
      this.atd.ajh(this);
      this.atd.setOffsetTexts(com.xy.q.Class49.ag);
      this.atd.setBounds(80, 132, 34, 17);
      this.add(this.atd);
      if (var1 instanceof Class79) {
         this.jw = new Class21(this, var1);
         this.addMouseListener(this);
      }

      if (this.jw == null) {
         this.jw = new com.xy.q.Class54(var1);
      }

      String var10005 = "I\u000f\u0015\u000e\u0015_\u0014\u001cT\u000b";
      this.jw.dq("sc/b/3.png");
      this.jw.wp(adb);
      this.jw.setBounds(0, 0, 115, 115);
      this.add(this.jw);
   }

   public void alc(Eshop var1, String var2) {
      this.t();
      this.setVisible(var1 != null);
      if (var1 != null) {
         StringBuilder var10005 = new StringBuilder(String.valueOf(var1.getEshopprice()));
         String var10006 = "L";
         this.aq = var10005.append(" ").append(var2).toString();
         this.aaq = var1.getEshopname();
         this.jw.gs(19, var1);
         this.jw.setVisible(true);
      }
   }

   public void ov(Shop var1) {
      this.t();
      this.setVisible(var1 != null);
      if (var1 != null) {
         StringBuilder var10005 = new StringBuilder(String.valueOf(var1.getShopprice()));
         String var10006 = "9秏刟";
         this.aq = var10005.append(" 积分").toString();
         this.aaq = var1.getShopname();
         this.jw.gs(13, var1);
         this.jw.setVisible(true);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      var1.setFont(com.xy.q.Class49.bz);
      var1.setColor(Color.black);
      var1.drawString(this.aaq, 0, 129);
      var1.setColor(Color.red);
      var1.drawString(this.aq, 0, 144);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.atd.getForm() instanceof Class79) {
         ((Class79)this.atd.getForm()).qw((Eshop)this.jw.jx());
      }
   }

   // $VF: synthetic method
   static Class102 ald(Class102 var0) {
      return var0.atc;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public com.xy.q.Class54 ep() {
      return this.jw;
   }

   public void t() {
      this.aaq = "";
      this.aq = "";
      this.jw.gs(0, null);
      this.jw.setVisible(true);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
