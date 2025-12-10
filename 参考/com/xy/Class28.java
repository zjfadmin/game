package com.xy;

import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class28 extends JComponent implements MouseListener {
   private long fz;
   private JLabel lk;
   private int gv;
   public static Color pm = new Color(123 & 79, 26813 & 6119, 4061 & 28851, 29879 & 3068);
   private Class612 pn;
   private boolean po;
   public static Color pp = new Color(13501 & 19419, 13501 & 19419, 13501 & 19419, 28158 & 4759);
   public static Color pq = new Color(14315 & 18655, 20927 & 12021, 123 & 95);
   private boolean lc;
   private Class643 dy;
   private Class345 pr;

   public Class28(Class612 var1) {
      this.pr = var1.gk();
      this.pn = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.dy = new Class643("sc/c/81", 3 >> 1, 119 & 14, Class681.bm, (Color[])null, (String)null, this.pr);
      this.dy.setBounds(--3, 2 ^ 3, 31 & 114, 31 & 114);
      this.dy.bq(this);
      this.add(this.dy);
      this.lk = new JLabel();
      this.lk.setFont(Class681.ad);
      this.lk.setForeground(Color.GREEN);
      this.lk.setBounds(122 & 29, 5 >> 1, 127 & 110, 91 & 52);
      this.add(this.lk);
      this.addMouseListener(this);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var10001;
      if (this.lc) {
         var10001 = 3 & 4;
         var1.setColor(pm);
         var1.fillRect(var10001, 3 ^ 3, this.getWidth(), this.getHeight());
      } else {
         if (this.po) {
            var10001 = 3 & 4;
            var1.setColor(pp);
            var1.fillRect(var10001, 3 & 4, this.getWidth(), this.getHeight());
         }

      }
   }

   public void is(long var1, String var3) {
      this.fz = var1;
      this.lk.setText(var3);
   }

   public void mouseClicked(MouseEvent var1) {
      if (var1.isMetaDown() && this.pr instanceof Class275) {
         this.pr.ve().n(this.pr.ae());
      }

   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }

   }

   public Class28(Class345 var1) {
      this.pr = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.dy = new Class643("sc/c/81", 3 >> 1, 111 & 22, Class681.bm, (Color[])null, (String)null, var1);
      this.dy.setBounds(--3, 3 >> 1, 59 & 86, 59 & 86);
      this.dy.bq(this);
      this.add(this.dy);
      this.lk = new JLabel();
      this.lk.setFont(Class681.ad);
      this.lk.setForeground(Color.GREEN);
      this.lk.setBounds(28 & 123, 5 >> 1, 126 & 111, 51 & 92);
      this.add(this.lk);
      this.addMouseListener(this);
   }

   public long gl() {
      return this.fz;
   }

   public boolean t() {
      return this.po;
   }

   public void gb(boolean var1) {
      this.po = var1;
   }

   public boolean it(int var1, long var2, Lingbao var4, RoleData var5, List<BigDecimal> var6) {
      this.fz = var4.getBaoid().longValue();
      this.lc = (boolean)(this.fz == var2 ? 4 ^ 5 : 0);
      String var7;
      if (!Class394.r(var7 = var4.getBaoname(), this.lk.getText())) {
         this.lk.setText(var7);
      }

      if (this.gv != var1) {
         this.dy.setText(String.valueOf(this.gv = var1));
      }

      Class28 var10000;
      if (this.pr instanceof Class275) {
         if (var6 != null && var6.contains(var4.getBaoid())) {
            var10000 = this;
            this.lk.setForeground(Color.red);
            return var10000.lc;
         }

         if (var4.getEquipment() == --1) {
            var10000 = this;
            this.lk.setForeground(pq);
            return var10000.lc;
         }

         this.lk.setForeground(Color.white);
      }

      var10000 = this;
      return var10000.lc;
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void ab(int var1) {
      this.gv = var1;
      this.dy.setText(String.valueOf(var1));
   }

   public void mousePressed(MouseEvent var1) {
      if (this.pn != null) {
         this.pn.akz(this);
      }

   }

   public void mouseEntered(MouseEvent var1) {
      this.po = (boolean)(4 ^ 5);
      if (this.pr instanceof Class275) {
         Lingbao var2;
         if ((var2 = this.pr.vd().getLingbao(new BigDecimal(this.fz))) == null) {
            return;
         }

         ((Class73)this.pr.ve().e(125 & 47)).ge(var2, (boolean)(5 >> 3));
      }

   }

   public int ae() {
      return this.gv;
   }

   public void mouseExited(MouseEvent var1) {
      this.po = (boolean)(5 >> 3);
      if (this.pr instanceof Class275) {
         this.pr.ve().n(127 & 45);
      }

   }

   public void q() {
      int var10003 = 3 ^ 3;
      this.fz = 0L;
      this.lc = (boolean)var10003;
      this.lk.setText((String)null);
      this.lk.setForeground(Color.GREEN);
   }

   public void ak(boolean var1) {
      this.lc = var1;
      if (this.pr instanceof Class258) {
         this.lk.setForeground(var1 ? Color.red : Color.white);
      }

   }

   public JLabel fa() {
      return this.lk;
   }

   public void fn(Lingbao var1) {
      this.fz = var1 != null ? var1.getBaoid().longValue() : 0L;
      this.lk.setText(var1 != null ? var1.getBaoname() : null);
   }
}
