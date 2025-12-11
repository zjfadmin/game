package com.xy.q;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;

public class Class19 extends JPanel {
   private DefaultListModel<String> yp;
   private JList<String> pq;
   private int ae;
   private String nq;
   private ImageIcon yq;
   private int ah;

   public void g(int var1) {
      this.ae = var1;
   }

   public DefaultListModel<String> td() {
      if (this.yp == null) {
         this.yp = new DefaultListModel<>();
      }

      return this.yp;
   }

   public String jg() {
      return this.nq;
   }

   public Class19(int var1, int var2, String var3, String[] var4) {
      this.ah = var1;
      this.ae = var2;
      this.nq = var3;
      this.setPreferredSize(new Dimension(var1, var2));
      this.setLayout(null);
      this.setOpaque(true);
      this.add(Class1.g(0, 0, var1 + 2, var2 - 1, this.th(), 20));
      int var6;
      if (var4 != null) {
         for (int var10000 = var6 = 0; var10000 < var4.length; var10000 = var6) {
            DefaultListModel var7 = this.td();
            int var10003 = var6;
            var7.add(var6++, var4[var10003]);
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.yq == null) {
         this.yq = new ImageIcon(this.nq);
      }

      var1.drawImage(this.yq.getImage(), 0, 0, this.ah, this.ae, this);
   }

   @Override
   public int getWidth() {
      return this.ah;
   }

   public void te(JList<String> var1) {
      this.pq = var1;
   }

   public void tf(DefaultListModel<String> var1) {
      this.yp = var1;
   }

   public void tg(String[] var1) {
      this.td().clear();
      int var2;
      if (var1 != null) {
         for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = var2) {
            DefaultListModel var3 = this.td();
            int var10003 = var2;
            var3.add(var2++, var1[var10003]);
         }
      }
   }

   public void dq(String var1) {
      this.nq = var1;
   }

   public JList<String> th() {
      if (this.pq == null) {
         this.pq = new JList<>();
         this.pq.setSelectionBackground(new Color(122, 117, 112));
         this.pq.setSelectionForeground(Color.white);
         this.pq.setForeground(Color.white);
         this.pq.setFont(Class49.k);
         this.pq.setBackground(Class49.bk);
         this.pq.setOpaque(false);
         this.pq.setModel(this.td());
      }

      return this.pq;
   }

   public int il() {
      return this.ae;
   }

   public void n(int var1) {
      this.ah = var1;
   }
}
