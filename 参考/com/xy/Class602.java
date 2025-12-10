package com.xy;

import com.xy.readbean.Assist;
import com.xy.readbean.TaskSet;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class Class602 extends JComponent implements MouseListener {
   private Class107 aha;
   private static Image ll;
   private Class319 uh;
   private RichLabel z;
   private JTextField ahb;
   private boolean ee;
   private int j;
   private Class436 av;
   private boolean bb;
   private Assist ahc;

   public void mousePressed(MouseEvent var1) {
      this.aha.ang(this);
   }

   public Class602(Class107 var1) {
      this.aha = var1;
      this.av = new Class436();
      this.av.setBounds(46 & 89, 121 & 22, 121 & 22, 121 & 22);
      this.av.addMouseListener(new MouseListener() {
         public void mousePressed(MouseEvent var1) {
            Class602.this.ak((boolean)(Class602.this.t() ? 2 & 5 : 1));
         }

         public void mouseClicked(MouseEvent var1) {
         }

         public void mouseReleased(MouseEvent var1) {
         }

         public void mouseExited(MouseEvent var1) {
         }

         public void mouseEntered(MouseEvent var1) {
         }
      });
      this.add(this.av);
      this.z = new RichLabel("", Class681.cw, 2495 & 30572);
      this.ahb = Class133.l(Class681.ad, Color.white);
      this.ahb.setText("0");
      this.ahb.setBounds(23039 & 10110, 78 & 63, 103 & 92, 59 & 87);
      this.ahb.setHorizontalAlignment(3 ^ 3);
      this.uh = new Class319(--4, this.ahb, var1);
      this.add(this.z);
      this.add(this.ahb);
      int var10004 = 3 >> 1;
      this.addMouseListener(this);
      this.ak((boolean)var10004);
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void xf(boolean var1, int var2, Assist var3) {
      this.xg(this.j, var3);
      this.ak(var1);
      this.ahb.setText(String.valueOf(var3.getNum()));
   }

   public boolean bl() {
      return this.ee;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (ll == null) {
         ll = Class511.a("sc/b/S342.png");
      }

      var1.drawImage(ll, 3 >> 2, 3 >> 2, (ImageObserver)null);
   }

   public void mouseExited(MouseEvent var1) {
   }

   public boolean t() {
      return this.bb;
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void gb(boolean var1) {
      this.ee = var1;
   }

   public void ak(boolean var1) {
      this.bb = var1;
      this.av.hf(Class511.a(var1 ? "sc/b/B460.png" : "sc/b/B461.png"));
   }

   public void xg(int var1, Assist var2) {
      int var3 = this.ahc != null && this.ahc.getId() == var2.getId() ? 3 >> 2 : 1;
      this.j = var1;
      this.ahc = var2;
      if (var2 == null) {
         this.setVisible((boolean)(5 >> 3));
      } else {
         if (var3 != 0) {
            this.ak((boolean)(3 >> 1));
            this.ahb.setText(String.valueOf(var2.getNum()));
         }

         StringBuffer var4 = new StringBuffer("#Z");
         if (var2.getType() == 0) {
            var4.append("#c81291F");
            var4.append(var2.getName());
            var4.append("(已完成#R");
            var4.append(this.aha.vd().getTaskSystem().d(var2.getSid(), --2));
            var4.append("#c81291F次)");
         }

         int var10001 = 3 & 5;
         this.z.setTextSize(var4.toString(), 20285 & 12782);
         this.z.setBounds(92 & 63, 110 & 27, this.z.getWidth(), this.z.getHeight());
         this.ak(var2.a());
         this.setVisible((boolean)var10001);
      }
   }

   public int e() {
      return (int)this.uh.gl();
   }

   public Assist xh() {
      return this.ahc;
   }

   public JTextField jj() {
      return this.ahb;
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public int tp() {
      if (this.bb && this.ahc != null) {
         TaskSet var1 = this.aha.vc().b(this.ahc.getSid());
         int var2 = this.aha.vd().getTaskSystem().d(this.ahc.getSid(), --2);
         int var3 = (int)this.uh.gl();
         int var4;
         if ((var4 = this.aha.vd().getTaskSystem().getTaskSetNum(var1, 5 >> 1)) != 0) {
            var3 = Math.min((int)this.uh.gl(), var4);
         }

         return var3 - var2;
      } else {
         return 0;
      }
   }

   public int ae() {
      return this.j;
   }
}
