package com.xy.a.q;

import com.xy.entity.RoleSummoning;
import com.xy.game.RolePet;
import com.xy.readbean.Buff;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class107 extends JComponent {
   // $VF: synthetic field
   final Class81 acz;
   private int ae;
   private JLabel[] gj;
   private Class107 awv;
   private com.xy.q.Class54[] afw;

   public void lc(RolePet var1) {
      RoleSummoning var2 = var1 != null ? var1.getPet() : null;
      Buff var3 = var1 != null && var1.getBb1() != 0 ? this.acz.yt().a(var1.getBb1()) : null;
      Buff var4 = var1 != null && var1.getBb2() != 0 ? this.acz.yt().a(var1.getBb2()) : null;
      com.xy.q.Class54 var10000 = this.afw[0];
      byte var10001;
      RoleSummoning var10002;
      if (var2 != null) {
         var10001 = 21;
         var10002 = var2;
      } else {
         var10001 = 0;
         var10002 = var2;
      }

      var10000.gs(var10001, var10002);
      var10000 = this.afw[1];
      Buff var18;
      if (var3 != null) {
         var10001 = 17;
         var18 = var3;
      } else {
         var10001 = 0;
         var18 = var3;
      }

      var10000.gs(var10001, var18);
      var10000 = this.afw[2];
      Buff var19;
      if (var4 != null) {
         var10001 = 17;
         var19 = var4;
      } else {
         var10001 = 0;
         var19 = var4;
      }

      var10000.gs(var10001, var19);

      int var5;
      for (int var8 = var5 = 0; var8 < this.afw.length; var8 = var5) {
         this.afw[var5++].setVisible(true);
      }

      JLabel var9 = this.gj[1];
      String var14;
      if (var3 != null) {
         var14 = var3.getbName();
      } else {
         String var15 = "锔嚣\u0003";
         var14 = "锦囊1";
      }

      var9.setText(var14);
      JLabel var10 = this.gj[2];
      String var16;
      if (var4 != null) {
         var16 = var4.getbName();
      } else {
         String var17 = "锔嚉\u0000";
         var16 = "锦囊2";
      }

      var10.setText(var16);
      this.gj[3].setVisible(var3 == null);
      this.gj[4].setVisible(var3 == null);
   }

   // $VF: synthetic method
   static Class107 amt(Class107 var0) {
      return var0.awv;
   }

   // $VF: synthetic method
   static Class81 amu(Class107 var0) {
      return var0.acz;
   }

   // $VF: synthetic method
   static int amv(Class107 var0) {
      return var0.ae;
   }

   // $VF: synthetic method
   static com.xy.q.Class54[] amw(Class107 var0) {
      return var0.afw;
   }

   public Class107(Class81 var1, int var2) {
      this.acz = var1;
      this.ae = var2;
      this.awv = this;
      this.gj = new JLabel[5];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.gj.length; var10000 = var3) {
         this.gj[var3] = com.xy.q.Class1.k(0, 0, 0, 0, Color.black, var3 == 0 ? com.xy.q.Class49.ch : com.xy.q.Class49.n);
         Class107 var6;
         if (var3 == 0) {
            JLabel var5 = this.gj[var3];
            String var12;
            if (var2 == 0) {
               var12 = "筯\u0003冹圈";
               var12 = "第1出场";
            } else if (var2 == 1) {
               var12 = "筅\u0000冓圈";
               var12 = "第2出场";
            } else if (var2 == 2) {
               var12 = "筯\u0001冹圈";
               var12 = "第3出场";
            } else {
               var12 = "敆揆乣阇";
               var12 = "支援上阵";
            }

            var5.setText(var12);
            var6 = this;
            this.gj[var3].setBounds(0, 0, 140, 17);
         } else {
            label77:
            if (var3 != 1 && var3 != 2) {
               if (var3 == 3 || var3 == 4) {
                  this.gj[var3].setForeground(Color.gray);
                  this.gj[var3].setHorizontalAlignment(0);
                  JLabel var8 = this.gj[var3];
                  String var17;
                  if (var3 == 3) {
                     var17 = "淉I劒";
                     var17 = "添 加";
                  } else {
                     var17 = "锔c囸";
                     var17 = "锦 囊";
                  }

                  var8.setText(var17);
                  if (var3 == 3) {
                     var6 = this;
                     this.gj[var3].setBounds(62, 36, 41, 16);
                     break label77;
                  }

                  this.gj[var3].setBounds(62, 56, 41, 16);
               }

               var6 = this;
            } else {
               this.gj[var3].setHorizontalAlignment(0);
               JLabel var7 = this.gj[var3];
               String var10003 = "镥囸";
               var7.setText("锦囊" + var3);
               if (var3 == 1) {
                  var6 = this;
                  this.gj[var3].setBounds(62, 17, 41, 16);
               } else {
                  var6 = this;
                  this.gj[var3].setBounds(102, 17, 41, 16);
               }
            }
         }

         var6.add(this.gj[var3++]);
      }

      this.afw = new com.xy.q.Class54[3];

      for (int var9 = var3 = 0; var9 < this.afw.length; var9 = var3) {
         Class107 var10;
         if (var3 == 0) {
            var10 = this;
            this.afw[var3] = new com.xy.q.Class54(var1.eg());
            this.afw[var3].wp(com.xy.q.Class54.auw);
            com.xy.q.Class54 var20 = this.afw[var3];
            String var23 = "\u001aQFVF\u0006GB\u0007U";
            var20.dq("sc/d/4.png");
            this.afw[var3].setBounds(4, 18, 59, 57);
         } else {
            Class107 var11;
            if (var3 == 1) {
               var11 = this;
               this.afw[var3] = new Class83(this, var1.eg());
            } else {
               var11 = this;
               this.afw[var3] = new Class112(this, var1.eg());
            }

            var11.afw[var3].wp(com.xy.q.Class54.auk);
            com.xy.q.Class54 var19 = this.afw[var3];
            String var21 = "0QlVl\u0006mB-U";
            var19.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
            if (var3 == 1) {
               var10 = this;
               this.afw[var3].setBounds(62, 34, 41, 41);
            } else {
               var10 = this;
               this.afw[var3].setBounds(102, 34, 41, 41);
            }
         }

         var10.add(this.afw[var3++]);
      }
   }
}
