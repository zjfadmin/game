package com.xy.a;

import com.xy.readbean.ActiveBase;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Class71 extends JPanel implements MouseListener {
   public ActiveBase adi;
   private JLabel bd;
   private com.xy.w.Class18 co;
   private com.xy.i.Class18 yr;
   private JLabel dh;
   private JLabel fs;
   private JLabel di;
   // $VF: synthetic field
   final Class19 adj;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (Class19.gu() == null) {
         String var10000 = "jC6D6\u0016/\u000eiN~";
         Class19.gt(com.xy.w.Class16.c("sc/d/66.png"));
      }

      if (Class19.go() == null) {
         String var2 = "\u007f\u0015#\u0012#B\"\u0006b\u0011";
         Class19.gr(com.xy.w.Class16.c("sc/d/4.png"));
      }

      var1.drawImage(Class19.gu(), 13, 59, 345, 1, null);
      var1.drawImage(Class19.go(), 10, 10, 45, 44, null);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public void wt(ActiveBase var1, int var2) {
      int var3 = (this.adi = var1).getNum();
      StringBuffer var4;
      StringBuffer var10000 = var4 = new StringBuffer();
      String var10001 = "旅欸敐9";
      var10000.append("日次数 ");
      var4.append(var2);
      String var10004 = "Y";
      var4.append("/");
      var4.append(var3);
      this.fs.setText(var4.toString());
      var4.setLength(0);
      int var5 = var1.getValue();
      String var10006 = "洛跚庆9";
      var4.append("活跃度 ");
      int var8;
      int var10002;
      if (var2 > var3) {
         var8 = var3;
         var10002 = var5;
      } else {
         var8 = var2;
         var10002 = var5;
      }

      var4.append(var8 * var10002);
      String var12 = "Y";
      var4.append("/");
      var4.append(var3 * var5);
      this.di.setText(var4.toString());
      this.dh.setText(var1.getHead());
      this.bd.setText(var1.getaName());
      this.co.gt(com.xy.w.Class15.d(var1.getSkin()));
      String var6 = var1.getGuide();
      if (var6 != null && !"".equals(var6)) {
         com.xy.i.Class18 var7 = this.yr;
         String var10003 = "4";
         if (this.adj.gp(var6, "-") == 3) {
            var10001 = "剁忶";
            var10001 = "前往";
         } else {
            var10001 = "臊励";
            var10001 = "自动";
         }

         var7.setText(var10001);
         this.yr.setVisible(true);
      } else {
         this.yr.setVisible(false);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.adi != null) {
         Class19.gq(this.adj).setTextSize(this.adi.getText(), 160);
      }
   }

   public Class71(Class19 var1) {
      this.adj = var1;
      this.setPreferredSize(new Dimension(371, 61));
      this.setOpaque(false);
      this.setLayout(null);
      String var10007 = "Sz\u000f|\u000f.\u000eiN~";
      String var10012 = "剁忶";
      this.yr = new com.xy.i.Class18("sc/e/7.png", 1, 154, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "前往", var1.eg());
      this.yr.gw(this);
      this.yr.setBounds(295, 20, 59, 25);
      this.add(this.yr);
      this.co = new com.xy.w.Class18();
      this.co.setBounds(10, 10, 45, 44);
      this.add(this.co);
      this.bd = new JLabel();
      this.bd.setBounds(57, 9, 100, 20);
      this.bd.setFont(com.xy.q.Class49.bz);
      this.bd.setForeground(Color.white);
      this.add(this.bd);
      this.fs = new JLabel();
      this.fs.setBounds(57, 34, 100, 20);
      this.fs.setFont(com.xy.q.Class49.bz);
      this.fs.setForeground(Color.white);
      this.add(this.fs);
      this.dh = new JLabel();
      this.dh.setBounds(152, 9, 150, 20);
      this.dh.setFont(com.xy.q.Class49.bz);
      this.dh.setForeground(Color.white);
      this.add(this.dh);
      this.di = new JLabel();
      this.di.setBounds(152, 34, 110, 20);
      this.di.setFont(com.xy.q.Class49.bz);
      this.di.setForeground(Color.white);
      this.add(this.di);
      this.addMouseListener(this);
   }
}
