package com.xy.q;

import com.xy.a.q.Class85;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class41 extends JComponent implements MouseListener {
   private com.xy.i.Class4 alh;
   private int gz;
   private Class6 ali;
   private long qa;
   private boolean _do;
   private JLabel df;
   private int cb;
   private JLabel dh;
   private Class30 wd;
   private boolean bi;
   private boolean cf;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.bi) {
         var1.setColor(Class53.acj);
         var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      } else {
         if (this._do) {
            var1.setColor(Class53.wu);
            var1.fillRect(0, 0, this.getWidth(), this.getHeight());
         }
      }
   }

   public void t() {
      this.cb = 0;
      this.qa = 0L;
      this.bi = false;
      this.cf = false;
      this.df.setText(null);
      this.df.setForeground(Color.GREEN);
   }

   public boolean ado(int var1, long var2, RoleSummoning var4, RoleData var5) {
      this.qa = var4.getSid().longValue();
      this.bi = this.qa == var2;
      this.cf = var4.getPetlock() == 1;
      Mount var6 = var5.getPetMount(var4.getSid());
      String var7;
      if (!com.xy.v.Class12.am(var7 = var4.getSummoningname(), this.df.getText())) {
         this.df.setText(var7);
      }

      if (this.gz != var1) {
         this.alh.setText(String.valueOf(this.gz = var1));
      }

      this.df.setForeground(var6 != null ? Color.GREEN : Color.white);
      this.dh.setText(var6 != null ? var6.getMountname() : null);
      return this.bi;
   }

   public long ee() {
      return this.qa;
   }

   public void ru(long var1, String var3) {
      this.qa = var1;
      this.df.setText(var3);
   }

   public int il() {
      return this.gz;
   }

   public JLabel en() {
      return this.df;
   }

   public boolean ah() {
      return this._do;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this._do = false;
   }

   public void ew(RoleSummoning var1) {
      this.cb = 0;
      this.qa = var1 != null ? var1.getSid().longValue() : 0L;
      this.df.setText(var1 != null ? var1.getSummoningname() : null);
   }

   public void n(int var1) {
      this.gz = var1;
      this.alh.setText(String.valueOf(var1));
   }

   public void rm(boolean var1) {
      this._do = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.isMetaDown()) {
         if (this.wd instanceof com.xy.a.a.Class31) {
            this.wd.zc().f(this.wd.lj());
            return;
         }

         if (this.wd instanceof com.xy.a.a.Class0) {
            com.xy.a.a.Class0 var2 = (com.xy.a.a.Class0)this.wd;
            var2.i(new BigDecimal(this.qa));
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this._do = true;
   }

   public Class41(Class30 var1) {
      this.wd = var1;
      this.setLayout(null);
      this.setBackground(Class49.bk);
      String var10007 = "i*5*5q+";
      this.alh = new com.xy.i.Class4("sc/c/81", 1, 6, Class49.bz, null, null, var1);
      this.alh.setBounds(3, 1, 18, 18);
      this.alh.gw(this);
      this.add(this.alh);
      this.df = Class1.k(24, 2, 110, 16, Color.GREEN, Class49.bm);
      this.add(this.df);
      this.dh = Class1.k(129, 2, 110, 16, Color.GREEN, Class49.bm);
      this.add(this.dh);
      this.addMouseListener(this);
   }

   public Class41(Class6 var1) {
      this.wd = var1.eg();
      this.ali = var1;
      this.setLayout(null);
      this.setBackground(Class49.bk);
      String var10008 = "i*5*5q+";
      this.alh = new com.xy.i.Class4("sc/c/81", 1, 6, Class49.bz, null, null, this.wd);
      this.alh.setBounds(3, 1, 18, 18);
      this.alh.gw(this);
      this.add(this.alh);
      this.df = Class1.k(24, 2, 110, 16, Color.GREEN, Class49.bm);
      this.add(this.df);
      Class41 var10000;
      if (this.wd instanceof com.xy.a.a.Class0) {
         var10000 = this;
         this.dh = Class1.k(260, 2, 110, 16, Color.GREEN, Class49.bm);
         this.add(this.dh);
      } else {
         var10000 = this;
         this.dh = Class1.k(129, 2, 110, 16, Color.GREEN, Class49.bm);
         this.add(this.dh);
      }

      var10000.addMouseListener(this);
   }

   public void cq(Lingbao var1) {
      this.cb = 1;
      this.qa = var1 != null ? var1.getBaoid().longValue() : 0L;
      this.df.setText(var1 != null ? var1.getBaoname() : null);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ali != null) {
         this.ali.ek(this);
      }
   }

   public void be(boolean var1) {
      this.bi = var1;
      if (this.wd instanceof Class85) {
         this.df.setForeground(var1 ? Color.red : Color.white);
      }
   }
}
