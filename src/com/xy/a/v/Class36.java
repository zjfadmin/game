package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class36 extends com.xy.w.Class18 implements MouseListener {
   private boolean gk;
   private JLabel dh;
   private JLabel fs;
   private int eg;
   // $VF: synthetic field
   final Class38 ahc;

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   // $VF: synthetic method
   static boolean zo(Class36 var0) {
      return var0.gk;
   }

   public Class36(Class38 var1, int var2) {
      this.ahc = var1;
      this.eg = var2;
      String var10010 = "$~3+5%7.";
      this.fs = com.xy.q.Class1.k(40, 3, 93, 20, com.xy.q.Class49.c("#c462803"), com.xy.q.Class49.ch);
      String var10008 = "/08e>k<`";
      this.dh = com.xy.q.Class1.k(40, 17, 93, 20, com.xy.q.Class49.c("#c462803"), com.xy.q.Class49.bz);
      this.fs.setHorizontalAlignment(0);
      this.dh.setHorizontalAlignment(0);
      String var3;
      if (var2 == 0) {
         var3 = "秲刁赆";
         var3 = "积分赛";
      } else if (var2 == 1) {
         var3 = "儶囸贈";
         var3 = "入围赛";
      } else if (var2 == 2) {
         var3 = "南冴赆";
         var3 = "半决赛";
      } else {
         var3 = "恨冿贈";
         var3 = "总决赛";
      }

      this.fs.setText(var3);
      this.add(this.fs);
      this.add(this.dh);
      this.addMouseListener(this);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public boolean yd(boolean var1) {
      if (var1 == this.gk) {
         return false;
      } else {
         this.gk = var1;
         if (var1) {
            this.fs.setForeground(Color.white);
            this.dh.setForeground(Color.white);
            this.fs.setBounds(0, 4, 142, 20);
            this.dh.setBounds(0, 18, 142, 20);
         } else {
            String var10004 = "$~3+5%7.";
            this.fs.setForeground(com.xy.q.Class49.c("#c462803"));
            String var10003 = "/08e>k<`";
            this.dh.setForeground(com.xy.q.Class49.c("#c462803"));
            this.fs.setBounds(40, 3, 93, 20);
            this.dh.setBounds(40, 17, 93, 20);
         }

         return true;
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (!com.xy.v.Class22.h()) {
         Activity var2 = Class38.abp(this.ahc).wg();
         StringBuilder var10002 = new StringBuilder(String.valueOf(var2.getId()));
         String var10003 = "{O";
         String var3 = Agreement.getSendTextAES("activity", var10002.append("|R").append(this.eg + 2).toString());
         this.ahc.za().k(var3);
      }
   }

   public void ye(Point[] var1, Activity var2) {
      if (var1 == null) {
         String var8 = "-737-*-737-";
         this._do("00.00-00.00");
      } else {
         long var3 = var2.getTimeOpen() + var1[0].x * 1000L;
         long var5 = var2.getTimeOpen() + var1[var1.length - 1].y * 1000L;
         String var10004 = "\u001eA}h7";
         StringBuilder var10001 = new StringBuilder(String.valueOf(com.xy.v.Class22.j(var3, "MM.dd")));
         String var10002 = "0";
         var10001 = var10001.append("-");
         String var10003 = "\u001eA}h7";
         this._do(var10001.append(com.xy.v.Class22.j(var5, "MM.dd")).toString());
      }
   }

   public void _do(String var1) {
      if (!com.xy.v.Class12.am(var1, this.dh.getText())) {
         this.dh.setText(var1);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }
}
