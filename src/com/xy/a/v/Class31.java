package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class31 extends com.xy.w.Class18 implements MouseListener {
   // $VF: synthetic field
   final Class23 afj;
   private int ae;
   private JLabel fs;
   private JLabel di;
   private boolean cf;

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   // $VF: synthetic method
   static boolean yc(Class31 var0) {
      return var0.cf;
   }

   public boolean yd(boolean var1) {
      if (var1 == this.cf) {
         return false;
      } else {
         this.cf = var1;
         if (var1) {
            this.di.setForeground(Color.white);
            this.fs.setForeground(Color.white);
            this.di.setBounds(0, 4, 142, 20);
            this.fs.setBounds(0, 18, 142, 20);
         } else {
            String var10004 = "\u0019w\u000e\"\b,\n'";
            this.di.setForeground(com.xy.q.Class49.c("#c462803"));
            String var10003 = "\u000fu\u0018 \u001e.\u001c%";
            this.fs.setForeground(com.xy.q.Class49.c("#c462803"));
            this.di.setBounds(40, 3, 93, 20);
            this.fs.setBounds(40, 17, 93, 20);
         }

         return true;
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public void _do(String var1) {
      if (!com.xy.v.Class12.am(var1, this.fs.getText())) {
         this.fs.setText(var1);
      }
   }

   public void ye(Point[] var1, Activity var2) {
      if (var1 == null) {
         String var8 = "$\n:\n$\u0017$\n:\n$";
         this._do("00.00-00.00");
      } else {
         long var3 = var2.getTimeOpen() + var1[0].x * 1000L;
         long var5 = var2.getTimeOpen() + var1[var1.length - 1].y * 1000L;
         String var10004 = "[a8Hr";
         StringBuilder var10001 = new StringBuilder(String.valueOf(com.xy.v.Class22.j(var3, "MM.dd")));
         String var10002 = "9";
         var10001 = var10001.append("-");
         String var10003 = "[a8Hr";
         this._do(var10001.append(com.xy.v.Class22.j(var5, "MM.dd")).toString());
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (!com.xy.v.Class22.h()) {
         Activity var2 = Class23.rr(this.afj).wg();
         StringBuilder var10002 = new StringBuilder(String.valueOf(var2.getId()));
         String var10003 = "FY";
         String var3 = Agreement.getSendTextAES("activity", var10002.append("|M").append(this.ae + 2).toString());
         this.afj.za().k(var3);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public Class31(Class23 var1, int var2) {
      this.afj = var1;
      this.ae = var2;
      String var10010 = "\u0019w\u000e\"\b,\n'";
      this.di = com.xy.q.Class1.k(40, 3, 93, 20, com.xy.q.Class49.c("#c462803"), com.xy.q.Class49.ch);
      String var10008 = "\u000fu\u0018 \u001e.\u001c%";
      this.fs = com.xy.q.Class1.k(40, 17, 93, 20, com.xy.q.Class49.c("#c462803"), com.xy.q.Class49.bz);
      this.di.setHorizontalAlignment(0);
      this.fs.setHorizontalAlignment(0);
      String var3;
      if (var2 == 0) {
         var3 = "移刼赏";
         var3 = "积分赛";
      } else if (var2 == 1) {
         var3 = "关囘赍";
         var3 = "入围赛";
      } else if (var2 == 2) {
         var3 = "卞冉赏";
         var3 = "半决赛";
      } else {
         var3 = "怭冟赍";
         var3 = "总决赛";
      }

      this.di.setText(var3);
      this.add(this.di);
      this.add(this.fs);
      this.addMouseListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
