package com.xy.a.w;

import com.xy.q.Class49;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Class15 extends JPanel {
   private com.xy.i.Class20 tf;
   private com.xy.w.Class18 kh;
   private JLabel ge;
   private com.xy.i.Class20 hw;
   private JLabel bd;
   private int ha;
   private JLabel ad;
   private int ae;
   private JLabel fs;
   // $VF: synthetic field
   final Class0 tg;
   private com.xy.w.Class18 dn;

   // $VF: synthetic method
   static int nm(Class15 var0) {
      return var0.ae;
   }

   public void t() {
      int var1 = Class0.u((Class0)this.tg.eg());
      double var2 = 0.0;
      String var4;
      String var10000 = var4 = this.ad.getText();
      String var10001 = "折丟尷虽";
      Class15 var6;
      if (var10000.equals("抗三尸虫")) {
         var6 = this;
         var2 = this.ha * 100.0;
      } else {
         var10001 = "牽琤躦闈";
         if (var4.equals("物理躲闪")) {
            var6 = this;
            var2 = this.ha * 1.0;
         } else {
            label23: {
               var10001 = "躽闼";
               if (!var4.endsWith("躲闪")) {
                  var10001 = "凛兯";
                  if (!var4.endsWith("减免")) {
                     var6 = this;
                     var2 = this.ha * 1.5;
                     break label23;
                  }
               }

               var6 = this;
               var2 = this.ha * 0.4;
            }
         }
      }

      var6.bd.setText(var2 + this.fx(var4));
      JLabel var7 = this.ge;
      StringBuilder var11 = new StringBuilder(String.valueOf(this.ha));
      String var10002 = "9";
      var7.setText(var11.append("/").append(var1 == 1 ? 20 : 30).toString());
   }

   // $VF: synthetic method
   static void nn(Class15 var0, int var1) {
      var0.ha = var1;
   }

   // $VF: synthetic method
   static int no(Class15 var0) {
      return var0.ha;
   }

   public String fx(String var1) {
      String var10000 = "抃丫尬虉";
      if ("抗三尸虫".equals(var1)) {
         return "";
      } else {
         var10000 = "3";
         return "%";
      }
   }

   public Class15(Class0 var1) {
      this.tg = var1;
      this.ae = 0;
      this.ha = 0;
      this.setPreferredSize(new Dimension(324, 34));
      this.setOpaque(false);
      this.setLayout(null);
      this.kh = new com.xy.w.Class18();
      this.kh.setBounds(5, 2, 30, 30);
      this.add(this.kh);
      this.ad = com.xy.q.Class1.k(37, 7, 90, 20, Color.white, Class49.ac);
      this.bd = com.xy.q.Class1.k(160, 7, 50, 20, Color.white, Class49.ac);
      this.ge = com.xy.q.Class1.k(244, 6, 60, 22, Color.white, Class49.ac);
      this.add(this.bd);
      this.add(this.ge);
      this.add(this.ad);
      String var10011 = "el9j9<$!faq";
      this.hw = new com.xy.i.Class20("sc/e/32.png", 1, 347, var1.eg());
      this.hw.setBounds(297, 9, 11, 15);
      this.hw.gw(this);
      this.add(this.hw);
      String var10012 = "Qw\rq\r'\u0016:RzE";
      this.tf = new com.xy.i.Class20("sc/e/34.png", 1, 348, var1.eg());
      this.tf.setBounds(312, 9, 11, 15);
      this.tf.gw(this);
      this.add(this.tf);
      var10012 = "el9m9\\'8%!faq";
      this.dn = new com.xy.w.Class18("sc/b/S173.png");
      this.dn.setBounds(242, 6, 87, 22);
      this.add(this.dn);
   }

   public String jg() {
      double var1 = 0.0;
      String var3;
      String var10000 = var3 = this.ad.getText();
      String var10001 = "抃丫尬虉";
      double var5;
      if (var10000.equals("抗三尸虫")) {
         var5 = var1 = this.ha * 100.0;
      } else {
         var10001 = "牦琐躽闼";
         if (var3.equals("物理躲闪")) {
            var5 = var1 = this.ha * 1.0;
         } else {
            label22: {
               var10001 = "躦闈";
               if (!var3.endsWith("躲闪")) {
                  var10001 = "净兛";
                  if (!var3.endsWith("减免")) {
                     var5 = var1 = this.ha * 1.5;
                     break label22;
                  }
               }

               var5 = var1 = this.ha * 0.4;
            }
         }
      }

      double var10;
      int var6 = (var10 = var5 - (int)var1) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
      StringBuilder var10002 ;
      if (!(var6 == 1)) {
         var10002= new StringBuilder(String.valueOf((int)var1));
         return var10002.toString();
      } else {
         var10002= new StringBuilder(String.valueOf(var1));
         return var10002.toString();
      }
   }

   // $VF: synthetic method
   static JLabel np(Class15 var0) {
      return var0.bd;
   }

   public void nq(String[] var1, String var2, Class0 var3) {
      double var4 = 0.0;
      this.ae = 0;
      this.ha = this.ae;
      int var6;
      if (var1 != null && !"".equals(var1)) {
         for (int var10000 = var6 = 0; var10000 < var1.length; var10000 = ++var6) {
            if (var1[var6].startsWith(var2)) {
               String var9 = var1[var6];
               String var10001 = "+";
               String[] var7;
               String var10 = (var7 = var9.split("="))[0];
               var10001 = "抃丫尬虉";
               Class15 var11;
               if (var10.equals("抗三尸虫")) {
                  var11 = this;
                  this.ae = (int)(Double.parseDouble(var7[1]) / 100.0);
                  var4 = this.ae * 100.0;
               } else {
                  String var12 = var7[0];
                  var10001 = "牦琐躽闼";
                  if (var12.equals("物理躲闪")) {
                     var11 = this;
                     this.ae = (int)(Double.parseDouble(var7[1]) / 1.0);
                     var4 = this.ae * 1.0;
                  } else {
                     label30: {
                        String var13 = var7[0];
                        var10001 = "躦闈";
                        if (!var13.endsWith("躲闪")) {
                           String var14 = var7[0];
                           var10001 = "净兛";
                           if (!var14.endsWith("减免")) {
                              var11 = this;
                              this.ae = (int)(Double.parseDouble(var7[1]) / 1.5);
                              var4 = this.ae * 1.5;
                              break label30;
                           }
                        }

                        var11 = this;
                        this.ae = (int)(Double.parseDouble(var7[1]) / 0.4);
                        var4 = this.ae * 0.4;
                     }
                  }
               }

               var11.ha = this.ae;
               this.bd.setText(var4 + this.fx(var7[0]));
               JLabel var15 = this.ge;
               StringBuilder var20 = new StringBuilder(String.valueOf(this.ae));
               String var10002 = "\r";
               var15.setText(var20.append("/").append(Class0.u(var3) == 1 ? 20 : 30).toString());
               Class0.w(var3, Class0.v(var3) + this.ae);
               return;
            }
         }
      }
   }

   // $VF: synthetic method
   static JLabel nr(Class15 var0) {
      return var0.ad;
   }

   // $VF: synthetic method
   static JLabel ns(Class15 var0) {
      return var0.ge;
   }

   public void nt(int var1, String[] var2, Class0 var3) {
      short var4 = 0;
      Class15 var10000;
      if (var1 == 0) {
         var10000 = this;
         String var10005 = "抵鬨灉";
         this.ad.setText("抗鬼火");
         String var10004 = "?9=&";
         this.ge.setText("0/20");
         String var10003 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1065;
      } else if (var1 == 1) {
         var10000 = this;
         String var66 = "折丟尷虽";
         this.ad.setText("抗三尸虫");
         String var36 = "$\r&\u0012";
         this.ge.setText("0/20");
         String var6 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1070;
      } else if (var1 == 2) {
         var10000 = this;
         String var67 = "抵遃忺";
         this.ad.setText("抗遗忘");
         String var37 = "?9=&";
         this.ge.setText("0/20");
         String var7 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1075;
      } else if (var1 == 3) {
         var10000 = this;
         String var68 = "抁牦琐";
         this.ad.setText("抗物理");
         String var38 = "$\r&\u0012";
         this.ge.setText("0/20");
         String var8 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1030;
      } else if (var1 == 4) {
         var10000 = this;
         String var69 = "抃灉";
         this.ad.setText("抗火");
         String var39 = "?9=&";
         this.ge.setText("0/20");
         String var9 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1060;
      } else if (var1 == 5) {
         var10000 = this;
         String var70 = "折雡";
         this.ad.setText("抗雷");
         String var40 = "$\r&\u0012";
         this.ge.setText("0/20");
         String var10 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1050;
      } else if (var1 == 6) {
         var10000 = this;
         String var71 = "抃氖";
         this.ad.setText("抗水");
         String var41 = "?9=&";
         this.ge.setText("0/20");
         String var11 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1055;
      } else if (var1 == 7) {
         var10000 = this;
         String var72 = "折飘";
         this.ad.setText("抗风");
         String var42 = "$\r&\u0012";
         this.ge.setText("0/20");
         String var12 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1045;
      } else if (var1 == 8) {
         var10000 = this;
         String var73 = "抵丹毰";
         this.ad.setText("抗中毒");
         String var43 = "?9=&";
         this.ge.setText("0/20");
         String var13 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1020;
      } else if (var1 == 9) {
         var10000 = this;
         String var74 = "抁導卦";
         this.ad.setText("抗封印");
         String var44 = "$\r&\u0012";
         this.ge.setText("0/20");
         String var14 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1010;
      } else if (var1 == 10) {
         var10000 = this;
         String var75 = "抵昛睃";
         this.ad.setText("抗昏睡");
         String var45 = "?9=&";
         this.ge.setText("0/20");
         this.bd.setText("0");
         var4 = 1015;
      } else if (var1 == 11) {
         var10000 = this;
         String var76 = "抵淣乓";
         this.ad.setText("抗混乱");
         String var46 = "?9=&";
         this.ge.setText("0/20");
         String var15 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1005;
      } else if (var1 == 12) {
         var10000 = this;
         String var77 = "抁霈慇";
         this.ad.setText("抗震慑");
         String var47 = "$\r&\u0012";
         this.ge.setText("0/20");
         String var16 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1025;
      } else if (var1 == 13) {
         var10000 = this;
         String var78 = "牽琤躦闈";
         this.ad.setText("物理躲闪");
         String var48 = "?9<&";
         this.ge.setText("0/30");
         String var17 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1030;
      } else if (var1 == 14) {
         var10000 = this;
         String var79 = "霈慇躽闼";
         this.ad.setText("震慑躲闪");
         String var49 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var18 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1025;
      } else if (var1 == 15) {
         var10000 = this;
         String var80 = "灿泷躦闈";
         this.ad.setText("火法躲闪");
         String var50 = "?9<&";
         this.ge.setText("0/30");
         String var19 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1060;
      } else if (var1 == 16) {
         var10000 = this;
         String var81 = "雸泃躽闼";
         this.ad.setText("雷法躲闪");
         String var51 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var20 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1050;
      } else if (var1 == 17) {
         var10000 = this;
         String var82 = "氠泷躦闈";
         this.ad.setText("水法躲闪");
         String var52 = "?9<&";
         this.ge.setText("0/30");
         String var21 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1055;
      } else if (var1 == 18) {
         var10000 = this;
         String var83 = "飁泃躽闼";
         this.ad.setText("风法躲闪");
         String var53 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var22 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1045;
      } else if (var1 == 19) {
         var10000 = this;
         String var84 = "毆泷躦闈";
         this.ad.setText("毒法躲闪");
         String var54 = "?9<&";
         this.ge.setText("0/30");
         String var23 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1020;
      } else if (var1 == 20) {
         var10000 = this;
         String var85 = "導卦躽闼";
         this.ad.setText("封印躲闪");
         String var55 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var24 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1010;
      } else if (var1 == 21) {
         var10000 = this;
         String var86 = "昛睃躦闈";
         this.ad.setText("昏睡躲闪");
         String var56 = "?9<&";
         this.ge.setText("0/30");
         String var25 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1015;
      } else if (var1 == 22) {
         var10000 = this;
         String var87 = "淸乧躽闼";
         this.ad.setText("混乱躲闪");
         String var57 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var26 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1005;
      } else if (var1 == 23) {
         var10000 = this;
         String var88 = "遃忺躦闈";
         this.ad.setText("遗忘躲闪");
         String var58 = "?9<&";
         this.ge.setText("0/30");
         String var27 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1075;
      } else if (var1 == 24) {
         var10000 = this;
         String var89 = "鬳災躽闼";
         this.ad.setText("鬼火躲闪");
         String var59 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var28 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1065;
      } else if (var1 == 25) {
         var10000 = this;
         String var90 = "丫尬虉躦闈";
         this.ad.setText("三尸虫躲闪");
         String var60 = "?9<&";
         this.ge.setText("0/30");
         String var29 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1070;
      } else if (var1 == 26) {
         var10000 = this;
         String var91 = "氻泃伫宥净兛";
         this.ad.setText("水法伤害减免");
         String var61 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var30 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1055;
      } else if (var1 == 27) {
         var10000 = this;
         String var92 = "灿泷估宑凛兯";
         this.ad.setText("火法伤害减免");
         String var62 = "?9<&";
         this.ge.setText("0/30");
         String var31 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1060;
      } else if (var1 == 28) {
         var10000 = this;
         String var93 = "鬳災伫宥净兛";
         this.ad.setText("鬼火伤害减免");
         String var63 = "$\r'\u0012";
         this.ge.setText("0/30");
         String var32 = "?8?3";
         this.bd.setText("0.0%");
         var4 = 1065;
      } else if (var1 == 29) {
         var10000 = this;
         String var94 = "飚泷估宑凛兯";
         this.ad.setText("风法伤害减免");
         String var64 = "?9<&";
         this.ge.setText("0/30");
         String var33 = "$\f$\u0007";
         this.bd.setText("0.0%");
         var4 = 1045;
      } else {
         if (var1 == 30) {
            String var65 = "雸泃伫宥净兛";
            this.ad.setText("雷法伤害减免");
            String var34 = "$\r'\u0012";
            this.ge.setText("0/30");
            String var10002 = "?8?3";
            this.bd.setText("0.0%");
            var4 = 1050;
         }

         var10000 = this;
      }

      String var35 = "gA;OuQ`Gff{Mf\r";
      var10000.kh.dp("sc/masterDoor/" + var4 + ".png");
      this.bd.setForeground(Color.white);
      this.ge.setForeground(Color.WHITE);
      this.nq(var2, this.ad.getText(), var3);
   }
}
