package com.xy.q;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class17 extends JComponent implements MouseListener {
   private JLabel db;
   private int gy;
   public static Color ws = new Color(75, 165, 145, 180);
   private boolean wt;
   public static Color wu = new Color(203, 181, 91);
   private Class30 hs;
   private BigDecimal ee;
   private int cb;
   public static Color wv = new Color(153, 153, 153, 150);
   private long et;
   private Class4 ww;
   private boolean cf;

   public boolean ah() {
      return this.cf;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.cf = false;
   }

   public void t() {
      this.gy = 0;
      this.et = 0L;
      this.wt = false;
      this.db.setText(null);
      this.db.setForeground(Color.GREEN);
   }

   public void n(int var1) {
      this.cb = var1;
   }

   public boolean rt(int var1, long var2, Goodstable var4, RoleData var5) {
      if (this.ee == var4.getRgid()) {
         this.wt = this.et == var2;
         return this.wt;
      } else {
         this.ee = var4.getRgid();
         this.et = var4.getRgid().longValue();
         this.wt = this.et == var2;
         String var10000 = var4.getValue();
         String var10001 = "拨胺U";
         String var10002 = "&";
         String var6;
         if (!com.xy.v.Class12.am(var6 = com.xy.v.Class12.ai(var10000, "技能=", "|"), this.db.getText())) {
            this.db.setText(var6);
         }

         return this.wt;
      }
   }

   public Class17(Class30 var1) {
      this.hs = var1;
      this.setLayout(null);
      this.setBackground(Class49.bk);
      this.db = new JLabel();
      this.db.setFont(Class49.bm);
      this.db.setForeground(Color.GREEN);
      this.db.setBounds(24, 2, 110, 16);
      this.add(this.db);
      this.addMouseListener(this);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.cf = true;
   }

   public Class17(Class4 var1) {
      this.hs = var1.eg();
      this.ww = var1;
      this.setLayout(null);
      this.setBackground(Class49.bk);
      this.db = new JLabel();
      this.db.setFont(Class49.bm);
      this.db.setForeground(Color.GREEN);
      this.db.setBounds(4, 2, 130, 16);
      this.add(this.db);
      this.addMouseListener(this);
   }

   public int il() {
      return this.cb;
   }

   public void ru(long var1, String var3) {
      this.et = var1;
      this.db.setText(var3);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ww != null) {
         this.ww.ed(this);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.wt) {
         var1.setColor(ws);
         var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      } else {
         if (this.cf) {
            var1.setColor(wv);
            var1.fillRect(0, 0, this.getWidth(), this.getHeight());
         }
      }
   }

   public void rm(boolean var1) {
      this.cf = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public BigDecimal em() {
      return this.ee;
   }

   public void be(boolean var1) {
      this.wt = var1;
   }

   public long ee() {
      return this.et;
   }

   public void bb(Goodstable var1) {
      this.gy = 0;
      this.et = var1 != null ? var1.getRgid().longValue() : 0L;
      this.db.setText(var1 != null ? var1.getGoodsname() : null);
   }

   public JLabel en() {
      return this.db;
   }
}
