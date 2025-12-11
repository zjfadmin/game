package com.xy.a.q;

import com.xy.entity.RoleSummoning;
import com.xy.game.RolePet;
import com.xy.readbean.Buff;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class54 extends JComponent implements MouseListener {
   private JLabel bd;
   private com.xy.q.Class54 jw;
   // $VF: synthetic field
   final Class81 acz;
   private com.xy.q.Class54 vo;
   private JLabel fs;
   private com.xy.q.Class54 ada;
   private JLabel im;

   public Class54(Class81 var1) {
      this.acz = var1;
      this.ada = new com.xy.q.Class54(var1.eg());
      this.ada.wp(com.xy.q.Class54.auq);
      String var10020 = "07l0l`m$-3";
      this.ada.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
      this.ada.setBounds(1, 1, 44, 44);
      this.vo = new com.xy.q.Class54(var1.eg());
      this.vo.setBounds(42, 18, 18, 18);
      this.jw = new com.xy.q.Class54(var1.eg());
      this.jw.setBounds(62, 18, 18, 18);
      this.im = new JLabel();
      this.bd = new JLabel();
      this.fs = new JLabel();
      this.im.setBounds(82, 18, 120, 20);
      this.bd.setBounds(202, 18, 80, 20);
      this.fs.setBounds(282, 18, 50, 20);
      this.im.setFont(com.xy.q.Class49.ac);
      this.bd.setFont(com.xy.q.Class49.ac);
      this.fs.setFont(com.xy.q.Class49.ac);
      this.im.setHorizontalAlignment(0);
      this.bd.setHorizontalAlignment(0);
      this.fs.setHorizontalAlignment(0);
      this.add(this.ada);
      this.add(this.vo);
      this.add(this.jw);
      this.add(this.im);
      this.add(this.bd);
      this.add(this.fs);
      this.addMouseListener(this);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getButton() == 1) {
         this.acz.adk(this, true);
      } else {
         if (var1.getButton() == 3) {
            this.acz.adk(this, false);
         }
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public void lc(RolePet var1) {
      RoleSummoning var2 = var1 != null ? var1.getPet() : null;
      Class54 var10000;
      if (var2 != null) {
         this.ada.gs(21, var2);
         Buff var3 = var1.getBb1() != 0 ? this.acz.yt().a(var1.getBb1()) : null;
         byte var10001;
         Buff var10002;
         if (var3 != null) {
            var10001 = 17;
            var10002 = var3;
         } else {
            var10001 = 0;
            var10002 = var3;
         }

         this.vo.gs(var10001, var10002);
         var3 = var1.getBb2() != 0 ? this.acz.yt().a(var1.getBb2()) : null;
         if (var3 != null) {
            var10001 = 17;
            var10002 = var3;
         } else {
            var10001 = 0;
            var10002 = var3;
         }

         this.jw.gs(var10001, var10002);
         var10000 = this;
      } else {
         var10000 = this;
         this.ada.gs(0, null);
         this.ada.setVisible(true);
         this.vo.gs(0, null);
         this.jw.gs(0, null);
      }

      var10000.im.setText(var2 != null ? var2.getSummoningname() : null);
      this.bd.setText(var2 != null ? com.xy.v.Class4.k(var2.getGrade()) : null);
      this.fs.setText(var1 != null && var1.getBb() > 0 ? String.valueOf(var1.getBb()) : null);
      Color var5 = var1 != null && var1.getBb() > 0 ? Color.green : Color.white;
      this.im.setForeground(var5);
      this.bd.setForeground(var5);
      this.fs.setForeground(var5);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   // $VF: synthetic method
   static com.xy.q.Class54 wr(Class54 var0) {
      return var0.ada;
   }
}
