package com.xy.a.a;

import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.readbean.PalData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class45 extends JComponent implements MouseListener {
   private JLabel sy;
   // $VF: synthetic field
   final Class38 alw;
   private JLabel df;
   private com.xy.i.Class4 mn;
   private int ae;
   private Image hf;
   private int eg;
   private com.xy.w.Class18 dn;

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.hf != null) {
         var1.drawImage(this.hf, 0, 0, 147, 49, this);
      }
   }

   public void afa(PalData var1, Pal var2, String[] var3, String var4) {
      this.eg = var1.getPalId();
      String var10005 = "l";
      this.dn.gt(com.xy.w.Class15.e("p" + var1.getSkin()));
      this.df.setText(var1.getName());
      if (var4 != null) {
         JLabel var10000 = this.sy;
         StringBuilder var10001 = new StringBuilder(String.valueOf(var4));
         String var10002 = "绖";
         var10000.setText(var10001.append("级").toString());
      }

      this.afd(var2, var3, var4);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   // $VF: synthetic method
   static int afb(Class45 var0) {
      return var0.ae;
   }

   public Class45(Class38 var1) {
      this.alw = var1;
      this.ae = -1;
      this.setPreferredSize(new Dimension(147, 49));
      this.dn = new com.xy.w.Class18();
      this.dn.setBounds(5, 4, 37, 37);
      this.add(this.dn);
      this.df = new JLabel();
      this.df.setForeground(Color.white);
      this.df.setFont(com.xy.q.Class49.ac);
      this.df.setBounds(45, 5, 70, 16);
      this.add(this.df);
      this.sy = new JLabel();
      this.sy.setForeground(Color.white);
      this.sy.setFont(com.xy.q.Class49.ac);
      this.sy.setBounds(45, 25, 70, 16);
      this.add(this.sy);
      String var10011 = "V\u0012\n\u0014\nD\u000b\u0001K\u0016";
      this.mn = new com.xy.i.Class4("sc/e/5.png", 1, 0, com.xy.q.Class49.bz, null, "", var1.eg());
      this.mn.setBounds(100, 8, 34, 17);
      this.mn.setForeground(Color.white);
      this.mn.removeMouseListener(this.mn);
      this.add(this.mn);
      this.addMouseListener(this);
   }

   // $VF: synthetic method
   static JLabel afc(Class45 var0) {
      return var0.sy;
   }

   public void afd(Pal var1, String[] var2, String var3) {
      BigDecimal var10002;
      String[] var10003;
      if (var1 != null) {
         var10002 = var1.getId();
         var10003 = var2;
      } else {
         var10002 = null;
         var10003 = var2;
      }

      this.ae = this.alw.ach(var10002, var10003);
      if (this.ae == -1) {
         this.mn.setBtn(0, null);
         String var6 = "ou3t3T.%)8lx{";
         this.mn.setText(null);
         this.hf = com.xy.w.Class16.c("sc/b/B235.png");
      } else {
         this.hf = null;
         JLabel var10001 = this.sy;
         StringBuilder var4 = new StringBuilder(String.valueOf(var3));
         String var7 = "绖";
         var10001.setText(var4.append("级").toString());
         if (this.ae == 0) {
            this.mn.setBtn(0, null);
            this.mn.setText(null);
         } else {
            String var5 = "e\u007f9y9)8lx{";
            this.mn.setBtn(1, "sc/e/5.png");
            this.mn.setText(BaseValue.getPalBtnArrStr(this.ae - 1));
         }
      }
   }

   public void n(int var1) {
      this.eg = var1;
      PalData var2 = this.alw.yt().bj(var1);
      String var10005 = "\u0001";
      this.dn.gt(com.xy.w.Class15.e("p" + var2.getSkin()));
      this.df.setText(var2.getName());
      this.sy.setText(null);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.alw.g(this.eg);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   // $VF: synthetic method
   static int afe(Class45 var0) {
      return var0.eg;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (Class38.gu() == null) {
         String var10000 = "ou3t3E-#/8lx{";
         Class38.gt(com.xy.w.Class16.c("sc/b/S153.png"));
      }

      var1.drawImage(Class38.gu(), 0, 0, 147, 49, this);
   }
}
