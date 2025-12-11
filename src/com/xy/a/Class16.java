package com.xy.a;

import com.xy.battle.TypeState;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.readbean.Skill;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class16 extends JComponent implements MouseListener {
   Skill ij;
   int cn;
   // $VF: synthetic field
   final Class123 ik;
   String aq;
   private boolean dr;
   private boolean il;
   JLabel di;
   com.xy.w.Class18 dn;

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.dr = Boolean.TRUE;
      if (this.ij != null) {
         Class48 var2 = (Class48)this.ik.zc().j(46);
         if (Class123.akx(this.ik).cg().getType() == 0) {
            int var11 = com.xy.v.Class4.s(this.ik.yx().getLoginResult().getGrade());
            int var4 = com.xy.v.Class4.q(this.ik.yx().getLoginResult().getGrade());
            RoleData var5 = this.ik.yx();
            int var6 = var4 == 0 ? 10000 : (var4 == 1 ? 15000 : (var4 == 2 ? 20000 : 25000));
            boolean var7 = this.ik.za().gameBattle && (var5.getRoleProperty().sld1 > 0 || var5.getRoleProperty().sld2 > 0);
            if (var7) {
               int var9 = (Integer.parseInt(this.ij.getSkillid()) - 1001) / 5 + 1;
               int var10 = 0;
               int var10000;
               if (var9 == var5.getRoleProperty().sm1) {
                  var10 = (int)(var10 + var5.getRoleProperty().sld1 * 67.5);
                  var10000 = var6;
               } else {
                  if (var9 == var5.getRoleProperty().sm2) {
                     var10 = (int)(var10 + var5.getRoleProperty().sld2 * 67.5);
                  }

                  var10000 = var6;
               }

               var6 = var10000 + var10;
            }

            var2.qa(this.ij, var6, var11, var4);
         } else {
            RoleSummoning var3;
            if ((var3 = this.ik.yx().getPet(new BigDecimal(Class123.akx(this.ik).cg().getId()))) != null) {
               var2.qa(this.ij, 1.0, com.xy.v.Class4.f(var3.getGrade()), com.xy.v.Class4.c(var3.getGrade()));
            }
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.gn(Boolean.TRUE);
   }

   public Class16(Class123 var1) {
      this.ik = var1;
      this.dn = new com.xy.w.Class18();
      this.dn.setBounds(0, 0, 25, 25);
      this.di = com.xy.q.Class1.k(27, 0, 85, 25, Color.white, com.xy.q.Class49.cp);
      this.add(this.dn);
      this.add(this.di);
      this.addMouseListener(this);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.gn(Boolean.FALSE);
      if (this.dr) {
         this.ik.afx.getBattleControl().setMouseIndex(com.xy.v.Class3.n, this.ij);
         this.ik.afx.getFormManagement().f(34);
         this.ik.afx.getFormManagement().f(46);
         this.ik.afx.getBattleControl().d();
      }
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      super.setBounds(var1 + (this.il ? 1 : 0), var2 + (this.il ? 1 : 0), var3, var4);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.gn(Boolean.FALSE);
      this.dr = Boolean.FALSE;
      this.ik.zc().f(46);
   }

   public void ea(TypeState var1) {
      this.aq = var1 != null ? var1.getType() : null;
      this.cn = var1 != null ? var1.getState() : 0;
      this.ij = this.aq != null ? this.ik.yt().bq(this.aq) : null;
      if (this.ij == null) {
         this.dn.l();
         this.di.setText(null);
         this.setVisible(false);
      } else {
         int var2;
         Class16 var10000;
         if (((var2 = Integer.parseInt(this.ij.getSkillid())) <= 9000 || var2 >= 10000) && (var2 <= 12000 || var2 >= 13000)) {
            var10000 = this;
            this.dn.gt(com.xy.w.Class15.h(this.ij.getSkillid()));
         } else {
            var10000 = this;
            this.dn.gt(com.xy.w.Class15.i(var2));
         }

         var10000.di.setText(this.ij.getSkillname());
         this.di.setForeground(this.cn == 2 ? Color.red : Color.white);
         this.setVisible(true);
      }
   }

   public void gn(Boolean var1) {
      if (this.il != var1) {
         this.il = var1;
         super.setBounds(this.getX() + (this.il ? 1 : -1), this.getY() + (this.il ? 1 : -1), this.getWidth(), this.getHeight());
      }
   }
}
