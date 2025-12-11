package com.xy.a;

import com.xy.entity.TeamRole;
import com.xy.formula.SkillUtil;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class34 extends JComponent implements MouseListener {
   private com.xy.w.Class0 rs;
   private boolean _do;
   private TeamRole rt;
   private int cb;
   private JLabel dh;
   // $VF: synthetic field
   final Class25 ru;
   private com.xy.i.Class10 rv;
   private JLabel im;

   // $VF: synthetic method
   static com.xy.w.Class0 mu(Class34 var0) {
      return var0.rs;
   }

   public void mv(TeamRole var1) {
      if ((this.rt = var1) == null) {
         this._do = false;
         this.rs = null;
         this.setVisible(false);
      } else {
         this.im.setText(var1.getName());
         this.dh.setText(com.xy.v.Class4.h(var1.getGrade()));
         this.rv.setText(SkillUtil.getSepciesN(var1.getSpeciesId()));
         this._do = var1.getState() < 0;
         this.rs = com.xy.w.Class11.t(var1.getSpeciesId().toString(), 2, 1, null);
         this.setVisible(true);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.isVisible()) {
         this.ru.bi(this.cb);
      }
   }

   public Class34(Class25 var1, int var2) {
      this.ru = var1;
      this._do = false;
      this.cb = var2;
      String var10012 = "君孋";
      this.im = new JLabel("名字", 0);
      String var10011 = "筏纞";
      this.dh = new JLabel("等级", 0);
      this.im.setBounds(-10, 120, 100, 23);
      this.dh.setBounds(0, 144, 80, 23);
      this.im.setForeground(Color.white);
      this.dh.setForeground(Color.white);
      this.im.setFont(com.xy.q.Class49.ac);
      this.dh.setFont(com.xy.q.Class49.ac);
      this.add(this.im);
      this.add(this.dh);
      String var10008 = "e\u007f9y9*8lx{";
      String var10013 = "鬺时";
      this.rv = new com.xy.i.Class10("sc/e/6.png", 1, 0, com.xy.q.Class49.bz, null, "鬼族", var1.eg());
      this.rv.setBounds(2, 100, 34, 18);
      this.add(this.rv);
      this.addMouseListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      if (this.isVisible()) {
         this.ru.y(-1);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   // $VF: synthetic method
   static TeamRole mw(Class34 var0) {
      return var0.rt;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.isVisible()) {
         this.ru.y(this.cb);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this._do) {
         if (Class25.ko(this.ru) == null) {
            String var10001 = "ou3u3 +";
            Class25.kq(this.ru, com.xy.w.Class16.c("sc/c/67"));
         }

         var1.drawImage(Class25.ko(this.ru), 0, 0, 84, 174, this);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
