package com.xy.q;

import com.xy.a.q.Class85;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class33 extends JComponent implements MouseListener {
   private boolean bv;
   private Class30 hs;
   private int ha;
   private Class45 aio;
   private com.xy.w.Class18 gh;
   private boolean il;
   private JLabel di;
   private long kd;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.il) {
         var1.setColor(Class53.acj);
         var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      } else {
         if (this.bv) {
            var1.setColor(Class53.wu);
            var1.fillRect(0, 0, this.getWidth(), this.getHeight());
         }
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.bv = false;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.aio != null) {
         this.aio.aht(this);
      }
   }

   public long ee() {
      return this.kd;
   }

   public boolean abc(int var1, long var2, Mount var4, RoleData var5) {
      this.kd = var4.getMid().longValue();
      this.il = this.kd == var2;
      BaseMountSH var6 = var5.getMountSHByMountId(var4.getMountid());
      String var7 = var4.getMountname();
      if (var5.getLoginResult().getMount_id() == var4.getMountid()) {
         StringBuilder var10000 = new StringBuilder(String.valueOf(var4.getMountname()));
         String var10001 = "\u001ai\u001b";
         var7 = var10000.append("(*)").toString();
      }

      if (!com.xy.v.Class12.am(var7, this.di.getText())) {
         this.di.setText(var7);
      }

      if (this.ha != (var6 != null ? var6.getId() : 0)) {
         Class33 var8;
         if (var6 != null) {
            this.ha = var6.getId();
            var8 = this;
            this.gh.gt(com.xy.w.Class15.s(100 + this.ha));
            this.gh.setVisible(true);
         } else {
            this.ha = 0;
            var8 = this;
            this.gh.l();
            this.gh.setVisible(false);
         }

         var8.ha = var6 != null ? var6.getId() : 0;
         this.gh.setVisible(this.ha > 0);
      }

      return this.il;
   }

   public void rm(boolean var1) {
      this.bv = var1;
   }

   public JLabel en() {
      return this.di;
   }

   public void be(boolean var1) {
      this.il = var1;
      if (this.hs instanceof Class85) {
         this.di.setForeground(var1 ? Color.red : Color.white);
      }
   }

   public void t() {
      this.kd = 0L;
      this.il = false;
      this.di.setText(null);
      this.di.setForeground(Color.white);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public Class33(Class45 var1) {
      this.hs = var1.eg();
      this.aio = var1;
      this.setLayout(null);
      this.setBackground(Class49.bk);
      this.di = Class1.k(4, 1, 140, 18, Color.WHITE, Class49.ac);
      this.add(this.di);
      this.gh = new com.xy.w.Class18();
      this.gh.setBounds(150, 1, 18, 18);
      this.add(this.gh);
      this.addMouseListener(this);
   }

   public boolean ah() {
      return this.bv;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.isMetaDown() && this.hs instanceof com.xy.a.a.Class31) {
         this.hs.zc().f(this.hs.lj());
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.bv = true;
   }
}
