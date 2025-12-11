package com.xy.a.q;

import com.xy.entity.TeamRole;
import java.awt.Color;
import java.awt.Dimension;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class25 extends JComponent {
   private int ha;
   // $VF: synthetic field
   final Class11 sw;
   private BigDecimal gi;
   private com.xy.w.Class18 af;
   private JLabel di;
   private JLabel im;

   // $VF: synthetic method
   static void nf(Class25 var0, int var1) {
      var0.ha = var1;
   }

   public void ng(TeamRole var1, int var2) {
      if (var1 == null) {
         this.gi = null;
         this.af.l();
         this.di.setText(null);
         this.im.setText(null);
         this.ha = 0;
      } else {
         this.gi = var1.getRoleId();
         String var10003 = "8";
         this.af.dp(com.xy.w.Class15.l("s" + var1.getSpeciesId()));
         if (var2 == 0) {
            this.di.setText("");
            this.im.setText("");
         } else {
            this.di.setText(var1.getName());
            JLabel var10000 = this.im;
            StringBuilder var10001 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var1.getGrade())));
            String var10002 = "纥";
            var10000.setText(var10001.append("级").toString());
         }
      }
   }

   // $VF: synthetic method
   static int nh(Class25 var0) {
      return var0.ha;
   }

   // $VF: synthetic method
   static BigDecimal ni(Class25 var0) {
      return var0.gi;
   }

   public Class25(Class11 var1) {
      this.sw = var1;
      this.ha = 0;
      this.setPreferredSize(new Dimension(93, 110));
      this.af = new com.xy.w.Class18();
      this.af.setBounds(26, 20, 40, 40);
      this.add(this.af);
      this.di = new JLabel();
      this.di.setBounds(0, 67, 93, 15);
      this.di.setFont(com.xy.q.Class49.bz);
      this.di.setHorizontalAlignment(0);
      this.add(this.di);
      this.im = new JLabel();
      this.im.setBounds(0, 82, 93, 15);
      this.im.setForeground(Color.red);
      this.im.setFont(com.xy.q.Class49.bz);
      this.im.setHorizontalAlignment(0);
      this.add(this.im);
   }
}
