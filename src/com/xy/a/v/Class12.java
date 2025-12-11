package com.xy.a.v;

import com.xy.bean.RoleShow;
import com.xy.formula.SkillUtil;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

class Class12 extends com.xy.q.Class50 {
   private com.xy.w.Class0 or;
   private RoleShow os;
   private com.xy.w.Class18 gh;
   // $VF: synthetic field
   final Class38 ot;
   private com.xy.w.Class18 dm;
   private JLabel im;

   public void kt(RoleShow var1) {
      if ((this.os = var1) == null) {
         this.or = null;
         this.setVisible(false);
      } else {
         this.im.setText(var1.getRolename());
         String var10007 = "kh7o7";
         this.dm.dp("sc/d/" + (134 + (SkillUtil.getSepciesIndex(var1.getSpecies_id()) - 1) / 2) + ".png");
         this.or = null;
         this.setVisible(true);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.os != null) {
         if (Class38.abq(this.ot) == null) {
            String var10001 = "\b?\n7";
            Class38.abo(this.ot, com.xy.w.Class11.x(com.xy.w.Class15.p("long")));
         }

         if (Class38.abq(this.ot) != null) {
            Class38.abq(this.ot).j(com.xy.v.Class22.l(), 0);
            Class38.abq(this.ot).ab(var1, 68, 138);
         }

         if (this.or == null) {
            this.or = com.xy.w.Class11.p(this.os.getSpecies_id().longValue(), 2, 1, null);
         }

         this.or.r(var1, 68, 138, 4, com.xy.v.Class22.l());
      }
   }

   public Class12(Class38 var1) {
      this.ot = var1;
      this.im = com.xy.q.Class1.k(39, 171, 77, 20, Color.white, com.xy.q.Class49.bz);
      this.im.setHorizontalAlignment(0);
      this.dm = new com.xy.w.Class18();
      String var10007 = "\u00173K4KaWiJ \n7";
      this.gh = new com.xy.w.Class18("sc/d/139.png");
      this.dm.setBounds(9, 167, 29, 29);
      this.gh.setBounds(0, 172, 135, 20);
      this.add(this.im);
      this.add(this.dm);
      this.add(this.gh);
   }
}
