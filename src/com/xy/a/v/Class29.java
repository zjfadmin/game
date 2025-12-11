package com.xy.a.v;

import com.xy.bean.RoleShow;
import com.xy.formula.SkillUtil;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

class Class29 extends com.xy.q.Class50 {
   // $VF: synthetic field
   final Class7 acd;
   private com.xy.w.Class0 zx;
   private RoleShow ace;
   private com.xy.w.Class18 af;
   private JLabel di;
   private com.xy.w.Class18 dn;

   public void kt(RoleShow var1) {
      if ((this.ace = var1) == null) {
         this.zx = null;
         this.setVisible(false);
      } else {
         this.di.setText(var1.getRolename());
         String var10007 = "\u0006ZZ]Z";
         this.af.dp("sc/d/" + (134 + (SkillUtil.getSepciesIndex(var1.getSpecies_id()) - 1) / 2) + ".png");
         this.zx = null;
         this.setVisible(true);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ace != null) {
         if (Class7.hi(this.acd) == null) {
            String var10001 = "I\u001eK\u0016";
            Class7.hh(this.acd, com.xy.w.Class11.x(com.xy.w.Class15.p("long")));
         }

         if (Class7.hi(this.acd) != null) {
            Class7.hi(this.acd).j(com.xy.v.Class22.l(), 0);
            Class7.hi(this.acd).ab(var1, 68, 138);
         }

         if (this.zx == null) {
            this.zx = com.xy.w.Class11.p(this.ace.getSpecies_id().longValue(), 2, 1, null);
         }

         this.zx.r(var1, 68, 138, 4, com.xy.v.Class22.l());
      }
   }

   public Class29(Class7 var1) {
      this.acd = var1;
      this.di = com.xy.q.Class1.k(39, 171, 77, 20, Color.white, com.xy.q.Class49.bz);
      this.di.setHorizontalAlignment(0);
      this.af = new com.xy.w.Class18();
      String var10007 = "V\u0012\n\u0015\n@\u0016H\u000b\u0001K\u0016";
      this.dn = new com.xy.w.Class18("sc/d/139.png");
      this.af.setBounds(9, 167, 29, 29);
      this.dn.setBounds(0, 172, 135, 20);
      this.add(this.di);
      this.add(this.af);
      this.add(this.dn);
   }
}
