package com.xy;

import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class443 extends JComponent implements MouseListener {
   private boolean cb;
   private JLabel lk;
   private Class345 we;
   private boolean afz;
   private long aoh;
   private boolean po;
   private int ay;
   private Class643 qn;
   private int bn;
   private Class285 aui;
   private JLabel ax;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var10001;
      if (this.afz) {
         var10001 = 3 ^ 3;
         var1.setColor(Class581.pp);
         var1.fillRect(var10001, 3 & 4, this.getWidth(), this.getHeight());
      } else {
         if (this.po) {
            var10001 = 3 >> 2;
            var1.setColor(Class581.wm);
            var1.fillRect(var10001, 2 & 5, this.getWidth(), this.getHeight());
         }

      }
   }

   public JLabel fa() {
      return this.lk;
   }

   public void is(long var1, String var3) {
      this.aoh = var1;
      this.lk.setText(var3);
   }

   public void gb(boolean var1) {
      this.afz = var1;
      if (this.we instanceof Class258) {
         this.lk.setForeground(var1 ? Color.red : Color.white);
      }

   }

   public Class443(Class285 var1) {
      this.we = var1.gk();
      this.aui = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.qn = new Class643("sc/c/81", 5 >> 2, 110 & 23, Class681.bm, (Color[])null, (String)null, this.we);
      this.qn.setBounds(--3, 3 >> 1, 123 & 22, 123 & 22);
      this.qn.bq(this);
      this.add(this.qn);
      this.lk = Class133.b(126 & 25, --2, 127 & 110, 80 & 63, Color.GREEN, Class681.ad);
      this.add(this.lk);
      Class443 var10000;
      if (this.we instanceof Class364) {
         this.ax = Class133.b(17900 & 15127, 1 ^ 3, 126 & 111, 61 & 82, Color.GREEN, Class681.ad);
         var10000 = this;
         this.add(this.ax);
      } else {
         this.ax = Class133.b(129, 1 ^ 3, 126 & 111, 24 & 119, Color.GREEN, Class681.ad);
         var10000 = this;
         this.add(this.ax);
      }

      var10000.addMouseListener(this);
   }

   public void ak(boolean var1) {
      this.po = var1;
   }

   public void fn(Lingbao var1) {
      this.ay = --1;
      this.aoh = var1 != null ? var1.getBaoid().longValue() : 0L;
      this.lk.setText(var1 != null ? var1.getBaoname() : null);
   }

   public void mouseExited(MouseEvent var1) {
      this.po = (boolean)(3 ^ 3);
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void v(RoleSummoning var1) {
      this.ay = 3 & 4;
      this.aoh = var1 != null ? var1.getSid().longValue() : 0L;
      this.lk.setText(var1 != null ? var1.getSummoningname() : null);
   }

   public long gl() {
      return this.aoh;
   }

   public void q() {
      int var10003 = 5 >> 3;
      int var10005 = 3 & 4;
      this.ay = 5 >> 3;
      this.aoh = 0L;
      this.afz = (boolean)var10005;
      this.cb = (boolean)var10003;
      this.lk.setText((String)null);
      this.lk.setForeground(Color.GREEN);
   }

   public Class443(Class345 var1) {
      this.we = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.qn = new Class643("sc/c/81", 5 >> 2, 86 & 47, Class681.bm, (Color[])null, (String)null, var1);
      this.qn.setBounds(--3, 3 & 5, 22 & 123, 22 & 123);
      this.qn.bq(this);
      this.add(this.qn);
      this.lk = Class133.b(125 & 26, 5 >> 1, 126 & 111, 48 & 95, Color.GREEN, Class681.ad);
      this.add(this.lk);
      this.ax = Class133.b(19645 & 13251, 5 >> 1, 127 & 110, 60 & 83, Color.GREEN, Class681.ad);
      this.add(this.ax);
      this.addMouseListener(this);
   }

   public int ae() {
      return this.bn;
   }

   public void mousePressed(MouseEvent var1) {
      if (this.aui != null) {
         this.aui.apa(this);
      }

   }

   public boolean aji(int var1, long var2, RoleSummoning var4, RoleData var5) {
      this.aoh = var4.getSid().longValue();
      this.afz = (boolean)(this.aoh == var2 ? 2 ^ 3 : 0);
      this.cb = (boolean)(var4.getPetlock() == (3 & 5) ? 2 ^ 3 : 0);
      Mount var7 = var5.getPetMount(var4.getSid());
      String var6;
      if (!Class394.r(var6 = var4.getSummoningname(), this.lk.getText())) {
         this.lk.setText(var6);
      }

      if (this.bn != var1) {
         this.qn.setText(String.valueOf(this.bn = var1));
      }

      this.lk.setForeground(var7 != null ? Color.GREEN : Color.white);
      this.ax.setText(var7 != null ? var7.getMountname() : null);
      return this.afz;
   }

   public void mouseClicked(MouseEvent var1) {
      if (var1.isMetaDown()) {
         if (this.we instanceof Class199) {
            this.we.ve().n(this.we.ae());
            return;
         }

         if (this.we instanceof Class364) {
            Class364 var2 = (Class364)this.we;
            var2.bk(new BigDecimal(this.aoh));
         }
      }

   }

   public void ab(int var1) {
      this.bn = var1;
      this.qn.setText(String.valueOf(var1));
   }

   public void mouseEntered(MouseEvent var1) {
      this.po = (boolean)(--1);
   }

   public boolean t() {
      return this.po;
   }
}
