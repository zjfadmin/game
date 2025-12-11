package com.xy.a.a;

import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class59 extends JComponent {
   private com.xy.w.Class18 fy;
   // $VF: synthetic field
   final Class33 aux;
   private RichLabel in;
   private com.xy.q.Class14[] mv;
   private com.xy.w.Class18[] ar;
   private com.xy.i.Class17[] ajq;
   private com.xy.q.Class54[] ni;
   private JLabel[] au;

   public Class59(Class33 var1) {
      this.aux = var1;
      this.in = new RichLabel("", null, 200);
      this.in.setBounds(230, 42, 200, 80);
      this.add(this.in);
      this.au = new JLabel[9];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         this.au[var2] = com.xy.q.Class1.f(50 + var2 % 2 * 234, 358 + var2 / 2 * 29, 20, 20, 0, Color.black, com.xy.q.Class49.ch);
         JLabel var7 = this.au[var2];
         String var19;
         if (var2 == 0) {
            var19 = "嬶丣仴洂";
            var19 = "学习交流";
         } else if (var2 == 1) {
            var19 = "皹剺笞纐";
            var19 = "目前等级";
         } else if (var2 == 2) {
            var19 = "北绤逃蠏";
            var19 = "升级道行";
         } else if (var2 == 3) {
            var19 = "屩w怐";
            var19 = "属 性";
         } else if (var2 == 4) {
            var19 = "筥p瞰";
            var19 = "符 石";
         } else if (var2 == 5) {
            var19 = "抷w胊";
            var19 = "技 能";
         } else if (var2 == 6) {
            var19 = "拇恤";
            var19 = "抗性";
         } else if (var2 == 7) {
            var19 = "咖负";
            var19 = "品质";
         } else if (var2 == 8) {
            var19 = "嬶丣";
            var19 = "学习";
         } else {
            var19 = "";
         }

         var7.setText(var19);
         Class59 var8;
         if (var2 == 0) {
            var8 = this;
            this.au[var2].setFont(com.xy.q.Class49.as);
            this.au[var2].setBounds(40, 20, 140, 24);
         } else {
            label226:
            if (var2 != 1 && var2 != 2) {
               if (var2 != 3 && var2 != 4 && var2 != 5) {
                  if (var2 == 6) {
                     var8 = this;
                     this.au[var2].setFont(com.xy.q.Class49.ak);
                     this.au[var2].setBounds(223, 128, 49, 19);
                     break label226;
                  }

                  if (var2 == 7) {
                     var8 = this;
                     this.au[var2].setFont(com.xy.q.Class49.bz);
                     JLabel var34 = this.au[var2];
                     String var10003 = "s \u0016\u0005\u0016\u0005\u0016\u0005";
                     var34.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
                     this.au[var2].setBounds(75, 187, 30, 14);
                     break label226;
                  }

                  if (var2 == 8) {
                     this.au[var2].setFont(com.xy.q.Class49.bz);
                     JLabel var29 = this.au[var2];
                     String var10002 = "tT\u0011q\u0011qg\u0007";
                     var29.setForeground(com.xy.q.Class49.c("#cFFFF00"));
                     this.au[var2].setBounds(104, 187, 40, 14);
                  }
               } else {
                  this.au[var2].setFont(com.xy.q.Class49.by);
                  JLabel var9 = this.au[var2];
                  var19 = "tT\u0011q\u0011q\u0011q";
                  var9.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
                  if (var2 == 3) {
                     var8 = this;
                     this.au[var2].setBounds(230, 16, 65, 23);
                     break label226;
                  }

                  if (var2 == 4) {
                     var8 = this;
                     this.au[var2].setBounds(230, 155, 65, 23);
                     break label226;
                  }

                  if (var2 == 5) {
                     var8 = this;
                     this.au[var2].setBounds(230, 219, 65, 23);
                     break label226;
                  }
               }

               var8 = this;
            } else {
               var8 = this;
               this.au[var2].setFont(com.xy.q.Class49.ch);
               this.au[var2].setBounds(18, 214 + 24 * (var2 - 1), 72, 19);
            }
         }

         var8.add(this.au[var2++]);
      }

      this.ajq = new com.xy.i.Class17[3];

      for (int var10 = var2 = 0; var10 < this.ajq.length; var10 = var2) {
         com.xy.i.Class17[] var11 = this.ajq;
         String var55;
         if (var2 == 2) {
            var55 = "# \u007f&\u007fu~3>$";
            var55 = "sc/e/6.png";
         } else {
            var55 = "$TxRx\u0000yG9P";
            var55 = "sc/e/7.png";
         }

         int var10006 = 21 + var2;
         Font var10007 = var2 == 2 ? com.xy.q.Class49.bz : com.xy.q.Class49.ch;
         String var57;
         Class33 var10010;
         if (var2 == 0) {
            var57 = "剰阧";
            var57 = "删除";
            var10010 = var1;
         } else if (var2 == 1) {
            var57 = "竖砃";
            var57 = "突破";
            var10010 = var1;
         } else if (var2 == 2) {
            var57 = "輼挡";
            var57 = "转换";
            var10010 = var1;
         } else {
            var57 = "";
            var10010 = var1;
         }

         com.xy.i.Class17 var30 = new com.xy.i.Class17(var55, 1, var10006, var10007, null, var57, var10010.eg());
         var11[var2] = var30;
         if (var2 == 0 || var2 == 1) {
            this.ajq[var2].setForeground(Color.black);
         }

         Class59 var12;
         if (var2 == 0) {
            var12 = this;
            this.ajq[var2].setBounds(40, 264, 59, 25);
         } else if (var2 == 1) {
            var12 = this;
            this.ajq[var2].setBounds(122, 264, 59, 25);
         } else {
            if (var2 == 2) {
               this.ajq[var2].setBounds(392, 129, 34, 18);
            }

            var12 = this;
         }

         var12.add(this.ajq[var2++]);
      }

      this.mv = new com.xy.q.Class14[2];

      for (int var13 = var2 = 0; var13 < this.mv.length; var13 = var2) {
         this.mv[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, var2 == 0 ? com.xy.q.Class49.cp : com.xy.q.Class49.bz);
         com.xy.q.Class14 var31 = this.mv[var2];
         String var37 = "D4\u00183\u0018f\u0000yG9P";
         var31.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         Class59 var14;
         if (var2 == 0) {
            this.mv[var2].setBounds(94, 214, 104, 19);
            var14 = this;
         } else {
            this.mv[var2].setBounds(274, 128, 154, 19);
            var14 = this;
         }

         var14.add(this.mv[var2++]);
      }

      this.ni = new com.xy.q.Class54[10];

      for (int var15 = var2 = 0; var15 < this.ni.length; var15 = var2) {
         this.ni[var2] = new com.xy.q.Class54(var1.eg());
         this.ni[var2].gs(6, var2 < 5 ? 1 : 2);
         Class59 var16;
         if (var2 < 5) {
            var16 = this;
            this.ni[var2].setBounds(241 + var2 * 37, 182, 26, 26);
         } else {
            var16 = this;
            this.ni[var2].setBounds(238 + (var2 - 5) * 38, 250, 30, 30);
         }

         var16.add(this.ni[var2++]);
      }

      this.fy = new com.xy.w.Class18();
      this.fy.setBounds(60, 65, 100, 100);
      this.add(this.fy);
      this.ar = new com.xy.w.Class18[18];

      for (int var17 = var2 = 0; var17 < this.ar.length; var17 = var2) {
         this.ar[var2] = new com.xy.w.Class18();
         Class59 var18;
         if (var2 == 0) {
            var18 = this;
            com.xy.w.Class18 var40 = this.ar[var2];
            String var49 = "03l4lat~3>$";
            var40.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
            this.ar[var2].setBounds(40, 45, 140, 160);
         } else if (var2 == 1) {
            var18 = this;
            com.xy.w.Class18 var41 = this.ar[var2];
            String var50 = "D4\u00183\u0018c\u000fyG9P";
            var41.mt(com.xy.w.Class16.m("sc/d/48.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(97, 246, 98, 5);
         } else if (var2 == 2) {
            var18 = this;
            com.xy.w.Class18 var42 = this.ar[var2];
            String var51 = "03l4lat~3>$";
            var42.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
            this.ar[var2].setBounds(96, 244, 100, 9);
         } else {
            label251: {
               if (var2 >= 3 && var2 <= 5) {
                  com.xy.w.Class18 var33 = this.ar[var2];
                  String var47 = "D4\u00183\u0018d\u0003yG9P";
                  var33.dp("sc/d/34.png");
                  if (var2 == 3) {
                     var18 = this;
                     this.ar[var2].setBounds(219, 16, 147, 23);
                     break label251;
                  }

                  if (var2 == 4) {
                     var18 = this;
                     this.ar[var2].setBounds(218, 155, 147, 23);
                     break label251;
                  }

                  if (var2 == 5) {
                     var18 = this;
                     this.ar[var2].setBounds(218, 219, 147, 23);
                     break label251;
                  }
               } else {
                  if (var2 == 6) {
                     var18 = this;
                     com.xy.w.Class18 var46 = this.ar[var2];
                     String var54 = "03l4lat~3>$";
                     var46.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
                     this.ar[var2].setBounds(228, 43, 200, 80);
                     break label251;
                  }

                  if (var2 == 7) {
                     var18 = this;
                     com.xy.w.Class18 var45 = this.ar[var2];
                     String var53 = "D4\u00183\u0018c\u0002yG9P";
                     var45.dp("sc/d/45.png");
                     this.ar[var2].setBounds(213, 10, 7, 274);
                     break label251;
                  }

                  if (var2 >= 8 && var2 <= 12) {
                     var18 = this;
                     com.xy.w.Class18 var44 = this.ar[var2];
                     String var52 = "03l4ldp~3>$";
                     var44.dp("sc/d/43.png");
                     this.ar[var2].setBounds(241 + (var2 - 8) * 37, 182, 27, 27);
                     break label251;
                  }

                  if (var2 >= 13 && var2 <= 17) {
                     com.xy.w.Class18 var32 = this.ar[var2];
                     String var43 = "D4\u00183\u0018c\u0001yG9P";
                     var32.dp("sc/d/46.png");
                     this.ar[var2].setBounds(236 + (var2 - 13) * 38, 248, 34, 34);
                  }
               }

               var18 = this;
            }
         }

         var18.add(this.ar[var2++]);
      }
   }

   // $VF: synthetic method
   static JLabel[] alt(Class59 var0) {
      return var0.au;
   }

   // $VF: synthetic method
   static com.xy.w.Class18 alu(Class59 var0) {
      return var0.fy;
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] alv(Class59 var0) {
      return var0.mv;
   }

   // $VF: synthetic method
   static RichLabel alw(Class59 var0) {
      return var0.in;
   }

   // $VF: synthetic method
   static com.xy.q.Class54[] alx(Class59 var0) {
      return var0.ni;
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] aly(Class59 var0) {
      return var0.ar;
   }
}
