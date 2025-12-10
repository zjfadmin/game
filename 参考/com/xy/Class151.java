package com.xy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;

public class Class151 extends JPanel {
   private JList<String> yp;
   private ImageIcon yq;
   private int j;
   private int bn;
   private String yr;
   private DefaultListModel<String> lz;

   public void ox(DefaultListModel<String> var1) {
      this.lz = var1;
   }

   public Class151(int var1, int var2, String var3, String[] var4) {
      int var10001 = 3 >> 2;
      int var10003 = 5 >> 2;
      super();
      this.j = var1;
      this.bn = var2;
      this.yr = var3;
      this.setPreferredSize(new Dimension(var1, var2));
      this.setLayout((LayoutManager)null);
      this.setOpaque((boolean)var10003);
      this.add(Class133.f(var10001, 3 & 4, var1 + (5 >> 1), var2 - (4 ^ 5), this.oz(), 94 & 53));
      if (var4 != null) {
         for(int var10000 = var1 = 3 >> 2; var10000 < var4.length; var10000 = var1) {
            DefaultListModel var5 = this.oy();
            var10003 = var1;
            var5.add(var1++, var4[var10003]);
         }
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.yq == null) {
         this.yq = new ImageIcon(this.yr);
      }

      var1.drawImage(this.yq.getImage(), 3 ^ 3, 3 ^ 3, this.j, this.bn, this);
   }

   public void y(int var1) {
      this.bn = var1;
   }

   public DefaultListModel<String> oy() {
      if (this.lz == null) {
         this.lz = new DefaultListModel();
      }

      return this.lz;
   }

   public String nn() {
      return this.yr;
   }

   public JList<String> oz() {
      if (this.yp == null) {
         this.yp = new JList();
         this.yp.setSelectionBackground(new Color(126 & 123, 117 & 127, 114 & 125));
         this.yp.setSelectionForeground(Color.white);
         this.yp.setForeground(Color.white);
         this.yp.setFont(Class681.bu);
         this.yp.setBackground(Class681.cu);
         this.yp.setOpaque((boolean)(3 >> 2));
         this.yp.setModel(this.oy());
      }

      return this.yp;
   }

   public void df(String[] var1) {
      this.oy().clear();
      int var2;
      if (var1 != null) {
         for(int var10000 = var2 = 5 >> 3; var10000 < var1.length; var10000 = var2) {
            DefaultListModel var3 = this.oy();
            int var10003 = var2;
            var3.add(var2++, var1[var10003]);
         }
      }

   }

   public int getWidth() {
      return this.j;
   }

   public int ae() {
      return this.bn;
   }

   public void pa(JList<String> var1) {
      this.yp = var1;
   }

   public void ab(int var1) {
      this.j = var1;
   }

   public void fx(String var1) {
      this.yr = var1;
   }
}
