package com.xy;

import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class400 extends JComponent implements MouseListener {
   private long zd;
   private boolean hg;
   private Class255 baf;
   private JLabel bd;
   private Class436 r;
   private int bn;
   private Class345 is;
   private boolean op;

   public void mouseClicked(MouseEvent var1) {
      if (var1.isMetaDown() && this.is instanceof Class199) {
         this.is.ve().n(this.is.ae());
      }

   }

   public Class400(Class255 var1) {
      int var10003 = --4;
      super();
      this.is = var1.gk();
      this.baf = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.bd = Class133.b(var10003, 5 >> 2, 25599 & 7308, 87 & 58, Color.WHITE, Class681.ce);
      this.add(this.bd);
      this.r = new Class436();
      this.r.setBounds(20126 & 12791, 3 & 5, 114 & 31, 114 & 31);
      this.add(this.r);
      this.addMouseListener(this);
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public boolean aqu(int var1, long var2, Mount var4, RoleData var5) {
      this.zd = var4.getMid().longValue();
      this.hg = (boolean)(this.zd == var2 ? 3 & 5 : 0);
      RoleData var10000 = var5;
      BaseMountSH var6 = var5.getMountSHByMountId(var4.getMountid());
      String var7 = var4.getMountname();
      if (var10000.getLoginResult().getMount_id() == var4.getMountid()) {
         var7 = var4.getMountname() + "(*)";
      }

      if (!Class394.r(var7, this.bd.getText())) {
         this.bd.setText(var7);
      }

      if (this.bn != (var6 != null ? var6.getId() : 0)) {
         Class400 var8;
         if (var6 != null) {
            this.bn = var6.getId();
            var8 = this;
            this.r.hf(Class222.p((125 & 102) + this.bn));
            this.r.setVisible((boolean)(--1));
         } else {
            this.bn = 0;
            var8 = this;
            this.r.q();
            this.r.setVisible((boolean)(5 >> 3));
         }

         var8.bn = var6 != null ? var6.getId() : 0;
         this.r.setVisible((boolean)(this.bn > 0 ? 2 ^ 3 : 0));
      }

      return this.hg;
   }

   public boolean t() {
      return this.op;
   }

   public void gb(boolean var1) {
      this.hg = var1;
      if (this.is instanceof Class258) {
         this.bd.setForeground(var1 ? Color.red : Color.white);
      }

   }

   public void mousePressed(MouseEvent var1) {
      if (this.baf != null) {
         this.baf.ym(this);
      }

   }

   public void mouseExited(MouseEvent var1) {
      this.op = (boolean)(3 >> 2);
   }

   public JLabel fa() {
      return this.bd;
   }

   public void mouseEntered(MouseEvent var1) {
      this.op = (boolean)(4 ^ 5);
   }

   public void q() {
      int var10003 = 2 & 5;
      this.zd = 0L;
      this.hg = (boolean)var10003;
      this.bd.setText((String)null);
      this.bd.setForeground(Color.white);
   }

   public long gl() {
      return this.zd;
   }

   public void ak(boolean var1) {
      this.op = var1;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var10001;
      if (this.hg) {
         var10001 = 2 & 5;
         var1.setColor(Class581.pp);
         var1.fillRect(var10001, 3 >> 2, this.getWidth(), this.getHeight());
      } else {
         if (this.op) {
            var10001 = 3 & 4;
            var1.setColor(Class581.wm);
            var1.fillRect(var10001, 3 >> 2, this.getWidth(), this.getHeight());
         }

      }
   }
}
