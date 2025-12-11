package com.xy.a;

import com.xy.readbean.Assist;
import com.xy.readbean.TaskSet;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class Class141 extends JComponent implements MouseListener {
   private static Image ayt;
   private com.xy.w.Class18 ei;
   private RichLabel av;
   private int cn;
   private boolean wb;
   private Class41 akm;
   private JTextField adr;
   private com.xy.q.Class27 ayu;
   private boolean bi;
   private Assist ayv;

   public void rm(boolean var1) {
      this.wb = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public void aop(int var1, Assist var2) {
      boolean var3 = this.ayv == null || this.ayv.getId() != var2.getId();
      this.cn = var1;
      this.ayv = var2;
      if (var2 == null) {
         this.setVisible(false);
      } else {
         if (var3) {
            this.be(true);
            this.adr.setText(String.valueOf(var2.getNum()));
         }

         String var10002 = "\u0019N";
         StringBuffer var4 = new StringBuffer("#Z");
         if (var2.getType() == 0) {
            String var10001 = "=F&\u0014,\u001c/c";
            var4.append("#c81291F");
            var4.append(var2.getName());
            String var10003 = "\u0012左家戄\u0019F";
            var4.append("(已完成#R");
            var4.append(this.akm.yx().getTaskSystem().f(var2.getSid(), 2));
            String var10005 = "=F&\u0014,\u001c/c欿\f";
            var4.append("#c81291F次)");
         }

         this.av.setTextSize(var4.toString(), 300);
         this.av.setBounds(28, 10, this.av.getWidth(), this.av.getHeight());
         this.be(var2.a());
         this.setVisible(true);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.akm.nu(this);
   }

   public int dx() {
      return this.cn;
   }

   public int lj() {
      if (this.bi && this.ayv != null) {
         TaskSet var1 = this.akm.yt().cj(this.ayv.getSid());
         int var2 = this.akm.yx().getTaskSystem().f(this.ayv.getSid(), 2);
         int var3 = (int)this.ayu.ee();
         int var4;
         if ((var4 = this.akm.yx().getTaskSystem().getTaskSetNum(var1, 2)) != 0) {
            var3 = Math.min((int)this.ayu.ee(), var4);
         }

         return var3 - var2;
      } else {
         return 0;
      }
   }

   public void aoq(boolean var1, int var2, Assist var3) {
      this.aop(this.cn, var3);
      this.be(var1);
      this.adr.setText(String.valueOf(var3.getNum()));
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (ayt == null) {
         String var10000 = "V}\n|\nM\u0016*\u00170UpB";
         ayt = com.xy.w.Class16.c("sc/b/S342.png");
      }

      var1.drawImage(ayt, 0, 0, null);
   }

   public JTextField ty() {
      return this.adr;
   }

   public int il() {
      return (int)this.ayu.ee();
   }

   public Assist aor() {
      return this.ayv;
   }

   public boolean dh() {
      return this.wb;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public Class141(Class41 var1) {
      this.akm = var1;
      this.ei = new com.xy.w.Class18();
      this.ei.setBounds(8, 16, 16, 16);
      this.ei.addMouseListener(new Class37(this));
      this.add(this.ei);
      this.av = new RichLabel("", com.xy.q.Class49.ck, 300);
      this.adr = com.xy.q.Class1.n(com.xy.q.Class49.bm, Color.white);
      this.adr.setText("0");
      this.adr.setBounds(382, 14, 68, 19);
      this.adr.setHorizontalAlignment(0);
      this.ayu = new com.xy.q.Class27(4, this.adr, var1);
      this.add(this.av);
      this.add(this.adr);
      this.addMouseListener(this);
      this.be(true);
   }

   public boolean ah() {
      return this.bi;
   }

   public void be(boolean var1) {
      this.bi = var1;
      String var2;
      if (var1) {
         var2 = "gY;X;x \f$\u0014dTs";
         var2 = "sc/b/B460.png";
      } else {
         var2 = "V}\n|\n\\\u0011(\u00140UpB";
         var2 = "sc/b/B461.png";
      }

      this.ei.gt(com.xy.w.Class16.c(var2));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
