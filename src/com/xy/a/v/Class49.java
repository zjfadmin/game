package com.xy.a.v;

import com.xy.q.Class54;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

class Class49 extends com.xy.q.Class50 {
   private RichLabel ed;
   private com.xy.i.Class22 abw;
   // $VF: synthetic field
   final Class15 arc;
   private JLabel dh;
   private Class54 fe;
   private com.xy.w.Class18 dm;
   private RichLabel bj;

   public void ajk(ActivityFC var1, boolean var2, long var3) {
      com.xy.v.Class8 var5 = Class15.mh(this.arc).yt();
      this.abw.g(var1.getId());
      ActivityFCTarget var6 = (ActivityFCTarget)var1.getData();
      String var7 = var5.aj(var6.getT1());
      String var8 = var5.aj(var6.getT2());
      RichLabel var10000 = this.bj;
      String var10001;
      if (!com.xy.v.Class12.h(var7)) {
         String var10003 = "\f}";
         var10001 = "#W" + var7;
      } else {
         var10001 = "";
      }

      var10000.setTextSize(var10001, 160);
      var10000 = this.ed;
      if (!com.xy.v.Class12.h(var8)) {
         String var37 = "/sMQMQMQ";
         var10001 = "#cAAAAAA" + var8;
      } else {
         var10001 = "";
      }

      var10000.setTextSize(var10001, 230);
      this.bj.setBounds(59, 10, this.bj.getWidth(), this.bj.getHeight());
      this.ed.setBounds(59, 30, this.ed.getWidth(), this.ed.getHeight());
      JLabel var19 = this.dh;
      StringBuilder var10002 = new StringBuilder(String.valueOf(var3));
      String var38 = "\u0005";
      var19.setText(var10002.append("/").append(var6.getTarget().getNum()).toString());
      if (var2) {
         String var28 = "co?i?9(\"`bw";
         this.abw.setBtn(-1, "sc/e/58.png");
         String var29 = "巘颩叼";
         this.abw.setText("已领取");
      } else if (var3 >= var6.getTarget().getNum()) {
         String var30 = "co?i??!\"`bw";
         this.abw.setBtn(1, "sc/e/31.png");
         String var31 = "颩叼";
         this.abw.setText("领取");
      } else {
         String var32 = "co?i?9(\"`bw";
         this.abw.setBtn(-1, "sc/e/58.png");
         String var33 = "最辑戺";
         this.abw.setText("未达成");
      }

      StringBuffer var9 = new StringBuffer();
      ActivityFCBase[] var10 = var6.getGains();

      int var11;
      for (int var16 = var11 = 0; var16 < var10.length; var16 = ++var11) {
         ActivityFCBase var12;
         if ((var12 = var10[var11]).getType() == 1) {
            if (var9.length() != 0) {
               var10001 = "/b";
               var9.append("#r");
            }

            com.xy.v.Class26 var13 = Class15.mi(this.arc).getPointKey(var12.getId());
            StringBuilder var21 = new StringBuilder(String.valueOf(var12.getNum()));
            String var34;
            if (var13 != null) {
               var34 = var13.a;
            } else {
               String var35 = "朅矏秀刬";
               var34 = "未知积分";
            }

            var9.append(var21.append(var34).toString());
         } else if (var12.getType() == 2) {
            Goodstable var14;
            if ((var14 = var5.ay(new BigDecimal(var12.getId()))) != null) {
               if (var9.length() != 0) {
                  var10001 = "/b";
                  var9.append("#r");
               }

               var9.append(var12.getNum());
               String var36 = "一";
               var9.append("个");
               var9.append(var14.getGoodsname());
            }
         } else if (var12.getType() == 3) {
            if (var9.length() != 0) {
               var10001 = "/b";
               var9.append("#r");
            }

            var10001 = "\u001e欋隠朐她力";
            var9.append("1次随机奖励");
         } else if (var12.getType() == 4) {
            if (var9.length() != 0) {
               var10001 = "/b";
               var9.append("#r");
            }

            var9.append(var12.getNum() + var12.getKey());
         }
      }

      this.fe.gs(22, var9.toString());
      Class54 var17 = this.fe;
      if (!com.xy.v.Class12.h(var6.getSkin())) {
         var10001 = var6.getSkin();
      } else {
         var10001 = "\u0013\u001f\u0019";
         var10001 = "903";
      }

      var17.gt(com.xy.w.Class15.d(var10001));
   }

   public void t() {
      this.abw.g(0);
      this.bj.clear();
      this.ed.clear();
      this.fe.h();
      this.setVisible(false);
   }

   public Class49(Class15 var1, com.xy.q.Class30 var2, Class15 var3) {
      this.arc = var1;
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.fe = new Class54(var2);
      this.fe.setBounds(5, 5, 44, 44);
      this.dh = com.xy.q.Class1.k(196, 10, 80, 16, Color.white, com.xy.q.Class49.n);
      this.dh.setHorizontalAlignment(0);
      this.bj = new RichLabel("", com.xy.q.Class49.w);
      this.ed = new RichLabel("", com.xy.q.Class49.n);
      String var10009 = "co?i??!\"`bw";
      String var10014 = "颩叼";
      this.abw = new com.xy.i.Class22("sc/e/31.png", 1, 112, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领取", var2, var3);
      this.abw.setFont(com.xy.q.Class49.ch);
      this.abw.setBounds(278, 14, 79, 25);
      String var10006 = "co?h?:&\"`bw";
      this.dm = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/66.png", 80, 1, 80, 1, false));
      this.dm.setBounds(8, 53, 350, 2);
      this.add(this.fe);
      this.add(this.dh);
      this.add(this.bj);
      this.add(this.ed);
      this.add(this.abw);
      this.add(this.dm);
   }
}
