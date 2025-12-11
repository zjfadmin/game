package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class33 extends com.xy.q.Class50 implements MouseListener {
   // $VF: synthetic field
   final Class38 abt;
   private Image acu;
   private JLabel dh;
   private int ds;
   private Image at;
   private JLabel im;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.acu != null) {
         var1.drawImage(this.acu, 16, 0, 132, 97, null);
      }

      if (this.at != null) {
         var1.drawImage(this.at, 0, 4, 165, 45, null);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.ds > 0) {
         Activity var2 = Class38.abp(this.abt).wg();
         StringBuilder var10002 = new StringBuilder(String.valueOf(var2.getId()));
         String var10003 = "X,";
         String var3 = Agreement.getSendTextAES("activity", var10002.append("|t").append(this.ds).toString());
         this.abt.za().k(var3);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public Class33(Class38 var1) {
      this.abt = var1;
      this.dh = com.xy.q.Class1.k(0, 50, 164, 21, Color.black, com.xy.q.Class49.k);
      this.im = com.xy.q.Class1.k(0, 70, 164, 21, Color.black, com.xy.q.Class49.k);
      this.dh.setHorizontalAlignment(0);
      this.im.setHorizontalAlignment(0);
      this.add(this.dh);
      this.add(this.im);
      this.addMouseListener(this);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public void yk(boolean var1, BWDHTeam var2) {
      this.ds = var2 != null ? var2.getId() : 0;
      this.im.setText(var2 != null ? var2.getName() : "");
      String var3;
      if (var1) {
         var3 = "W;\u000b<\u000bi\u0010o\n(J?";
         var3 = "sc/d/147.png";
      } else {
         var3 = "\u0018xD\u007fD*R-Ek\u0005|";
         var3 = "sc/d/196.png";
      }

      this.acu = com.xy.w.Class16.c(var3);
      Class33 var10000;
      if (var2 != null && var2.getRoleShows() != null) {
         String var10004 = "陇镛b";
         this.dh.setText("队长:" + var2.getRoleShows()[0].getRolename());
         var10000 = this;
         var10004 = "\tl\u000fs";
         this.at = com.xy.w.Class16.c(com.xy.w.Class15.l("bwdh" + var2.getRoleShows()[0].getSpecies_id().intValue()));
      } else {
         var10000 = this;
         this.dh.setText(null);
         this.at = null;
      }

      var10000.setVisible(true);
   }
}
