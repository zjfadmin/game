package com.xy.a.v;

import com.xy.bean.RoleShow;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLabel;

class Class5 extends com.xy.q.Class50 {
   private JLabel dh;
   private Image hf;
   private JLabel di;
   // $VF: synthetic field
   final Class8 hz;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (Class8.hq(this.hz) == null) {
         String var10001 = ";\u0001g\u0006gS|Uf\u0012&\u0005";
         Class8.ho(this.hz, com.xy.w.Class16.c("sc/d/147.png"));
      }

      var1.drawImage(Class8.hq(this.hz), 16, 0, 132, 97, null);
      if (this.hf != null) {
         var1.drawImage(this.hf, 0, 4, 165, 45, null);
      }
   }

   public void gf(boolean var1, RoleShow var2) {
      if (var2 == null) {
         this.hf = null;
         this.setVisible(false);
      } else {
         JLabel var10000 = this.dh;
         StringBuilder var10001 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var2.getGrade())));
         String var10002 = "纄";
         var10000.setText(var10001.append("级").toString());
         Class5 var3;
         if (var1) {
            var3 = this;
            String var10004 = "陽锷X";
            this.di.setText("队长:" + var2.getRolename());
         } else {
            var3 = this;
            this.di.setText(var2.getRolename());
         }

         String var10003 = "=T;K";
         var3.hf = com.xy.w.Class16.c(com.xy.w.Class15.l("bwdh" + var2.getSpecies_id().intValue()));
         this.setVisible(true);
      }
   }

   public Class5(Class8 var1) {
      this.hz = var1;
      String var10011 = "k\u0001\u000e$~TxR";
      this.dh = com.xy.q.Class1.k(20, 50, 124, 19, com.xy.q.Class49.c("#cFF6600"), com.xy.q.Class49.n);
      this.di = com.xy.q.Class1.k(0, 70, 164, 21, Color.black, com.xy.q.Class49.k);
      this.dh.setHorizontalAlignment(0);
      this.di.setHorizontalAlignment(0);
      this.add(this.dh);
      this.add(this.di);
   }
}
