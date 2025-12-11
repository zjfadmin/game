package com.xy.a.q;

import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class26 extends JComponent implements MouseListener {
   private JLabel ge;
   private JLabel sy;
   private com.xy.q.Class54 bw;
   private int ha;
   private int cb;
   private int ae;
   private int ds;
   private BigDecimal mz;
   // $VF: synthetic field
   final Class87 sz;

   public void cb(Goodstable var1, int var2) {
      this.mz = var1 != null ? var1.getGoodsid() : null;
      this.ae = var2;
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.bw.gs(var10001, var10002);
      if (this.mz != null) {
         this.ge.setText(var2 > 1 ? String.valueOf(var2) : null);
         this.sy.setText(var1.getGoodsname());
         this.sy.setForeground(Color.WHITE);
      } else {
         this.ge.setText(null);
         this.sy.setText(null);
      }
   }

   public void n(int var1) {
      this.cb = var1;
      this.ge.setVisible(var1 == 2);
      this.sy.setVisible(var1 == 2);
      this.bw.setVisible(var1 == 2);
   }

   public Class26(Class87 var1, int var2) {
      this.sz = var1;
      this.setLayout(null);
      this.setOpaque(false);
      this.ds = var2;
      this.bw = new com.xy.q.Class54(var1.eg());
      this.bw.setBounds(20, 54, 80, 80);
      this.ge = new JLabel("", 4);
      this.sy = new JLabel("", 0);
      this.ge.setForeground(Color.red);
      this.ge.setFont(com.xy.q.Class49.cp);
      this.sy.setFont(com.xy.q.Class49.ac);
      this.ge.setBounds(78, 58, 30, 18);
      this.sy.setBounds(0, 150, 120, 16);
      this.add(this.ge);
      this.add(this.sy);
      this.add(this.bw);
      this.addMouseListener(this);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.cb == 2) {
         if (Class87.gu() == null) {
            String var10000 = "$VxWxfd\u0005f\u001b'[0";
            Class87.gt(com.xy.w.Class16.c("sc/b/S301.png"));
         }

         var1.drawImage(Class87.gu(), 2, 2, null);
      } else if (Class87.agf(this.sz) == null) {
         String var10001 = "-h(m/j";
         Class87.agg(this.sz, com.xy.w.Class11.x(com.xy.w.Class15.p("drawfp")));
      } else {
         if (this.cb == 1) {
            this.ha += 17;
            if (this.ha >= Class87.agf(this.sz).a()) {
               this.ha = Class87.agf(this.sz).a();
               this.n(2);
               this.sz.tm(null);
            }
         }

         Class87.agf(this.sz).j(this.ha, 0);
         Class87.agf(this.sz).ab(var1, 2, 2);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.setBorder(null);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.cb == 0) {
         this.setBorder(BorderFactory.createLineBorder(Color.red, 2));
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.cb == 0) {
         if (Class87.agh(this.sz) != -1) {
            Goodstable var2 = this.sz.yx().bk(Class87.agj(this.sz));
            StringBuffer var3 = new StringBuffer();
            String var10002 = "\u0007";
            var3.append("P");
            var3.append(Class87.agi(this.sz));
            String var10004 = "f";
            var3.append("|");
            var3.append(this.ds);
            String var10006 = "+";
            var3.append("|");
            var3.append(1);
            if (var2 != null) {
               String var10001 = "f";
               var3.append("|");
               var3.append(var2.getRgid());
            }

            String var4 = Agreement.getSendTextAES("getfivemsg", var3.toString());
            this.sz.za().k(var4);
         }
      }
   }
}
