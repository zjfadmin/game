package com.xy.a.q;

import com.xy.formula.SkillUtil;
import com.xy.readbean.Skill;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class95 implements MouseListener {
   Class58 apq;
   // $VF: synthetic field
   final Class13 afi;

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.afi.zc().f(46);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Skill var2 = Class58.yb(this.apq) > 0 ? this.afi.yt().ac(String.valueOf(Class58.yb(this.apq))) : null;
      if (var2 != null) {
         com.xy.a.Class48 var3 = (com.xy.a.Class48)this.afi.zc().j(46);
         StringBuilder var10001 = new StringBuilder(String.valueOf(var2.getSkillname()));
         String var10002 = "S";
         var10001 = var10001.append("(").append((int)Class58.xz(this.apq));
         var10002 = "纗*";
         var3.es(var10001.append("级)").toString(), SkillUtil.h(var2, (int)Class58.xz(this.apq)));
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public Class95(Class13 var1, Class58 var2) {
      this.afi = var1;
      this.apq = var2;
   }
}
