package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class306 extends JComponent implements MouseListener {
   public static Color wd = new Color(15615 & 17305, 15615 & 17305, 15615 & 17305, 12278 & 20639);
   private JLabel lj;
   private boolean gu;
   private Class345 we;
   private Class548 wf;
   private int gw;
   private boolean po;
   private int ay;
   private BigDecimal iq;
   public static Color wg = new Color(127 & 75, 14317 & 18615, 8149 & 24763, 28085 & 4862);
   private long om;
   public static Color wh = new Color(28619 & 4351, 31221 & 1727, 123 & 95);

   public Class306(Class548 var1) {
      this.we = var1.gk();
      this.wf = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.lj = new JLabel();
      this.lj.setFont(Class681.ad);
      this.lj.setForeground(Color.GREEN);
      this.lj.setBounds(--4, --2, 29315 & 3582, 27 & 116);
      this.add(this.lj);
      this.addMouseListener(this);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var10001;
      if (this.po) {
         var10001 = 3 >> 2;
         var1.setColor(wg);
         var1.fillRect(var10001, 3 & 4, this.getWidth(), this.getHeight());
      } else {
         if (this.gu) {
            var10001 = 3 >> 2;
            var1.setColor(wd);
            var1.fillRect(var10001, 3 ^ 3, this.getWidth(), this.getHeight());
         }

      }
   }

   public void mousePressed(MouseEvent var1) {
      if (this.wf != null) {
         this.wf.alo(this);
      }

   }

   public void is(long var1, String var3) {
      this.om = var1;
      this.lj.setText(var3);
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public boolean t() {
      return this.gu;
   }

   public void gb(boolean var1) {
      this.po = var1;
   }

   public void ak(boolean var1) {
      this.gu = var1;
   }

   public long gl() {
      return this.om;
   }

   public void mouseEntered(MouseEvent var1) {
      this.gu = (boolean)(2 ^ 3);
   }

   public void mouseExited(MouseEvent var1) {
      this.gu = (boolean)(3 >> 2);
   }

   public Class306(Class345 var1) {
      this.we = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.lj = new JLabel();
      this.lj.setFont(Class681.ad);
      this.lj.setForeground(Color.GREEN);
      this.lj.setBounds(91 & 60, 5 >> 1, 126 & 111, 51 & 92);
      this.add(this.lj);
      this.addMouseListener(this);
   }

   public int ae() {
      return this.ay;
   }

   public boolean ny(int var1, long var2, Goodstable var4, RoleData var5) {
      if (this.iq == var4.getRgid()) {
         this.po = (boolean)(this.om == var2 ? --1 : 0);
         return this.po;
      } else {
         this.iq = var4.getRgid();
         this.om = var4.getRgid().longValue();
         this.po = (boolean)(this.om == var2 ? 3 >> 1 : 0);
         String var6;
         if (!Class394.r(var6 = Class394.d(var4.getValue(), "技能=", "|"), this.lj.getText())) {
            this.lj.setText(var6);
         }

         return this.po;
      }
   }

   public BigDecimal ez() {
      return this.iq;
   }

   public void ab(int var1) {
      this.ay = var1;
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void ax(Goodstable var1) {
      this.gw = 3 ^ 3;
      this.om = var1 != null ? var1.getRgid().longValue() : 0L;
      this.lj.setText(var1 != null ? var1.getGoodsname() : null);
   }

   public void q() {
      int var10003 = 5 >> 3;
      this.gw = 2 & 5;
      this.om = 0L;
      this.po = (boolean)var10003;
      this.lj.setText((String)null);
      this.lj.setForeground(Color.GREEN);
   }

   public JLabel fa() {
      return this.lj;
   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }

   }
}
