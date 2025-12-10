package com.xy;

import com.xy.bean.RoleShow;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.JLabel;

public class Class257 extends Class345 {
   private Image bx;
   private <undefinedtype>[] hr;
   private JLabel[] u;

   public void ei(BWDHTeam var1, BWDHTeam var2) {
      this.u[3 ^ 3].setText(var1.getName());
      this.u[--1].setText(var2.getName());
      RoleShow[] var4 = var1.getRoleShows();

      int var10000;
      int var10001;
      int var10002;
      int var3;
      <undefinedtype> var5;
      for(var10000 = var3 = 2 & 5; var10000 < 5; var10000 = var3) {
         var5 = this.hr[var3];
         if (var3 == 0) {
            var10001 = 5 >> 2;
            var10002 = var3;
         } else {
            var10001 = 0;
            var10002 = var3;
         }

         var5.jv((boolean)var10001, var10002 < var4.length ? var4[var3] : null);
         ++var3;
      }

      var4 = var2.getRoleShows();

      for(var10000 = var3 = 3 ^ 3; var10000 < 5; var10000 = var3) {
         var5 = this.hr[--5 + var3];
         if (var3 == 0) {
            var10001 = 4 ^ 5;
            var10002 = var3;
         } else {
            var10001 = 0;
            var10002 = var3;
         }

         var5.jv((boolean)var10001, var10002 < var4.length ? var4[var3] : null);
         ++var3;
      }

      this.ve().a(this.ae());
   }

   public Class257(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10007 = -4 >> 2;
      super(2555 & 30389, 5 >> 1, Class345.aef, var1);
      this.va(var10007, 2 & 5, 1023 & 32538, 31210 & 1919, Class345.aeo);
      this.uv(Class511.q("sc/d/146.png", 3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, (boolean)(2 & 5)), (String)null);
      this.aea.setImage("sc/e/162.png");
      this.aea.setBounds(8190 & 25341, --4, 127 & 27, 127 & 27);
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.u = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.b((127 & 99) + (23967 & 9200) * var2, 1 ^ 3, 11246 & 21721, 59 & 100, Color.white, Class681.ch);
         this.u[var2].setHorizontalAlignment(3 & 4);
         this.add(this.u[var2++]);
      }

      <undefinedtype>[] var5 = new <undefinedtype>[46 & 91];
      var10003 = true;
      this.hr = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.hr.length; var10000 = var2) {
         this.hr[var2] = new Class456() {
            private JLabel d;
            private JLabel ir;
            private Image rv;

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               if (Class257.this.bx == null) {
                  Class257.this.bx = Class511.a("sc/d/147.png");
               }

               var1.drawImage(Class257.this.bx, 55 & 88, 2 & 5, 10924 & 21975, 123 & 101, (ImageObserver)null);
               if (this.rv != null) {
                  var1.drawImage(this.rv, 5 >> 3, --4, 26877 & 6055, 127 & 45, (ImageObserver)null);
               }

            }

            public void jv(boolean var1, RoleShow var2) {
               if (var2 == null) {
                  int var10001 = 2 & 5;
                  this.rv = null;
                  this.setVisible((boolean)var10001);
               } else {
                  this.d.setText(Class224.r(var2.getGrade()) + "级");
                  <undefinedtype> var10000;
                  if (var1) {
                     this.ir.setText("队长:" + var2.getRolename());
                     var10000 = this;
                  } else {
                     this.ir.setText(var2.getRolename());
                     var10000 = this;
                  }

                  var10000.rv = Class511.a(Class222.l("bwdh" + var2.getSpecies_id().intValue()));
                  this.setVisible((boolean)(--1));
               }
            }

            public {
               int var10005 = 3 ^ 3;
               int var10007 = 93 & 54;
               this.d = Class133.b(var10007, 119 & 58, 126 & 125, 31 & 115, Class681.c("#cFF6600"), Class681.ab);
               this.ir = Class133.b(var10005, 86 & 111, 4093 & 28838, 119 & 29, Color.black, Class681.bu);
               this.d.setHorizontalAlignment(3 & 4);
               this.ir.setHorizontalAlignment(5 >> 3);
               this.add(this.d);
               this.add(this.ir);
            }
         };
         Class257 var3;
         if (var2 != 0 && var2 != (3 & 5)) {
            if (var2 >= (1 ^ 3) && var2 <= --4) {
               var3 = this;
               this.hr[var2].setBounds(127 & 7, 44 + 105 * (var2 - (5 >> 1)), 165, 97);
            } else if (var2 != --5 && var2 != 6) {
               if (var2 >= 7 && var2 <= 9) {
                  this.hr[var2].setBounds(612, 44 + 105 * (var2 - 7), 165, 97);
               }

               var3 = this;
            } else {
               var3 = this;
               this.hr[var2].setBounds(452, 97 + 105 * (var2 - --5), 165, 97);
            }
         } else {
            var3 = this;
            this.hr[var2].setBounds(27391 & 5543, (113 & 111) + (105 & 127) * var2, 32229 & 703, 105 & 119);
         }

         var3.add(this.hr[var2++]);
      }

   }
}
