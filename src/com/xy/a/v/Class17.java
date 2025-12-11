package com.xy.a.v;

import javax.swing.JLabel;

class Class17 extends com.xy.q.Class50 {
   private JLabel fs;
   private com.xy.w.Class18 dm;
   // $VF: synthetic field
   final Class45 st;

   public void cc(int var1, int var2) {
      String var3;
      if (var1 == 8) {
         var3 = "减凸";
         var3 = "冠军";
      } else if (var1 == 7) {
         var3 = "亞凑";
         var3 = "亚军";
      } else if (var1 == 6) {
         var3 = "嬌凸";
         var3 = "季军";
      } else if (var1 == 5) {
         var3 = "殻凑";
         var3 = "殿军";
      } else if (var1 == 4) {
         var3 = "嚴彙昤组呢匶";
         var3 = "四强晋级名单";
      } else if (var1 == 3) {
         var3 = "兯彰晏续吉匟";
         var3 = "八强晋级名单";
      } else if (var1 == 2) {
         var3 = "匢儂彙昤组呢匶";
         var3 = "十六强晋级名单";
      } else {
         var3 = "不匋予彰晏续吉匟";
         var3 = "三十二强晋级名单";
      }

      this.fs.setText(var3);
      this.setBounds(123, var2, 289, 30);
   }

   public Class17(Class45 var1) {
      this.st = var1;
      String var10009 = "L\u0000X'YR]S";
      this.fs = com.xy.q.Class1.k(55, 0, 179, 30, com.xy.q.Class49.c("#c7D6120"), com.xy.q.Class49.ar);
      this.fs.setHorizontalAlignment(0);
      String var10006 = "w)+.+{4y*:j-";
      this.dm = new com.xy.w.Class18("sc/d/103.png");
      this.dm.setBounds(0, 10, 289, 11);
      this.add(this.fs);
      this.add(this.dm);
   }
}
