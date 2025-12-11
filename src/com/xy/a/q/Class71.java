package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.LoginResult;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JPanel;

public class Class71 extends JPanel {
   private ChongjipackBean aim;
   private RichLabel ed;
   private com.xy.w.Class18 co;
   private Class15[] ain;
   private RichLabel bk;
   private int ds;
   private com.xy.i.Class16 uw;
   private com.xy.q.Class30 eu;

   public ChongjipackBean aay() {
      return this.aim;
   }

   public static void main(String[] var0) {
      String var10001 = "RJ{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{c{IxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxJRJxIxIxIxI{JxJxIxJxIxI{JxJ{JxJ{JxJ{IxJ{JxIxIxIxI{c{IxIxIxI{I{I{IxI{IxI{I{IxJxI{I{I{I{IxJxIxIxIxIxJRJxIxIxIxJ{JxJxIxJxIxJ{JxI{IxJxJxJ{IxI{IxIxIxIxI{c{IxIxIxI{I{I{J{I{J{I{I{IxJxI{J{I{I{I{J{IxIxIxIxJRJxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxI{c{I\u0017\u000b>\u001c+\n9\u001d1\u00066I:\u0010x(4\u00059\u001d7\u001b1I\u0017\u000b>\u001c+\n9\u001d7\u001bx\u001foGoI\u001c,\u0015&xJRJxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxI{c{IxIxIxIxIxI0\u001d,\u0019bFw\u001e/\u001ev\b4\u00059\u001d7\u001b1G;\u00065IxIxIxIxIxIxJRJxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxIxI{c{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{J{JR";
      System.out
         .println(
            "\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n"
         );
      String var10000 = "u\u0018pYs\tsYr\trYuYtYwYvYxYp\u0015=\u0014pYp\u0017=\u0014rYp\u0011g\u0003p\u0018pYsYrYuYtYw\u0003g\u0013|\u0014=\u0017=\u0016=\u0011=\u0010=\u0013";
      var10001 = "O~";
      String[] var1 = "4=1|2,2|3,3|4|5|6|7|9|10|11|12|13|14&&1=1|2|3|4|5|6&&6=1|2|3|4|5|6".split("&&");
      System.out.println(abb(var1, 4, 1));
      System.out.println(abb(var1, 4, 2));
      System.out.println(abb(var1, 4, 3));
      System.out.println(abb(var1, 4, 4));
   }

   public Class71(com.xy.q.Class30 var1) {
      this.eu = var1;
      this.setPreferredSize(new Dimension(463, 61));
      this.setOpaque(false);
      this.setLayout(null);
      this.ain = new Class15[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ain.length; var10000 = var2) {
         this.ain[var2] = new Class15(this, var1);
         this.ain[var2].wp(com.xy.q.Class54.ask);
         Class15 var10003 = this.ain[var2];
         String var10004 = "2FnAn\u0011oU/B";
         var10003.dq("sc/d/4.png");
         this.ain[var2].setBounds(14 + var2 * 51, 9, 46, 46);
         this.add(this.ain[var2++]);
      }

      String var10006 = "+\nw\fwZiG(\u0007?";
      String var10011 = "飇右";
      this.uw = new com.xy.i.Class16("sc/e/31.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领取", var1);
      this.uw.ajh(this);
      this.uw.setBounds(360, 17, 79, 25);
      this.add(this.uw);
      var10011 = "X绿夿勩";
      this.bk = new RichLabel("1级奖励", com.xy.q.Class49.ac);
      String var10010 = "\u0006\u0013暧乌及飇右";
      this.ed = new RichLabel("#R暂不可领取", com.xy.q.Class49.ac);
      String var10007 = "X绿夿勩";
      this.bk.setTextSize("1级奖励", 136);
      var10006 = "\u0006\u0013暧乌及飇右";
      this.ed.setTextSize("#R暂不可领取", 136);
      this.bk.setBounds(270, 10, this.bk.getWidth(), this.bk.getHeight());
      this.ed.setBounds(270, 30, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.bk);
      this.add(this.ed);
      String var10009 = "+\nw\rw_nG(\u0007?";
      this.co = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/66.png", 30, 1, 30, 1, false));
      this.co.setBounds(15, 59, 433, 2);
      this.add(this.co);
   }

   public void aaz(ChongjipackBean var1, int var2) {
      ChongjipackBean var10000 = this.aim = var1;
      this.l();
      if (var10000 != null) {
         List var3 = ChongjipackBean.getGoodsImpactGrade(var1.getPackgoods());
         com.xy.v.Class8 var4 = this.eu.yt();
         LoginResult var6 = this.eu.yx().getLoginResult();
         boolean var7 = false;
         Class71 var14;
         if (com.xy.v.Class4.b(var6.getGrade(), var1.getPackgrade())) {
            int var8 = -1;
            int var12;
            if (var2 == 1) {
               var12 = var8 = 4;
            } else {
               if (var2 - 1 == var6.getLowOrHihtpack()) {
                  var8 = 5;
               }

               var12 = var8;
            }

            if (var12 != -1) {
               String[] var9 = null;
               if (var6.getVipget() != null) {
                  String var13 = var6.getVipget();
                  String var10001 = "g\u0003";
                  var9 = var13.split("&&");
               }

               if (aba(var9, var8, var1.getPackgradetype())) {
                  var14 = this;
                  String var10002 = "{.嶪飯厎";
                  this.ed.setText("#G已领取");
               } else {
                  var7 = true;
                  var14 = this;
                  String var17 = "\u0006\u0018朏飇右";
                  this.ed.setText("#Y未领取");
               }
            } else {
               var14 = this;
               String var18 = "{;曚乤厷飯厎";
               this.ed.setText("#R暂不可领取");
            }
         } else {
            var14 = this;
            String var19 = "\u0006\u0013暧乌及飇右";
            this.ed.setText("#R暂不可领取");
         }

         var14.ds = 0;

         int var10;
         for (int var15 = var10 = 0; var15 < var3.size() && var10 < this.ain.length; var15 = var10) {
            Goodstable var11 = var4.ay(((XXGDBean)var3.get(var10)).getId());
            Class15.jt(this.ain[var10]).setText(String.valueOf(((XXGDBean)var3.get(var10)).getSum()));
            this.ain[var10].gs(1, var11);
            int var16 = this.ds + (!GoodType.z(var11.getType()) ? ((XXGDBean)var3.get(var10)).getSum() : 1);
            var10++;
            this.ds = var16;
         }

         this.uw.setVisible(var7);
         this.ed.setBounds(270, 30, this.ed.getWidth(), this.ed.getHeight());
         this.dq(var1.getPackgrade());
      }
   }

   public static boolean aba(String[] var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         StringBuilder var10000 = new StringBuilder(String.valueOf(var1));
         String var10001 = "e";
         String var3 = var10000.append("=").toString();

         int var4;
         for (int var8 = var4 = 0; var8 < var0.length; var8 = ++var4) {
            if (var0[var4].startsWith(var3)) {
               int var5 = var3.length();
               int var6;
               int var9 = var6 = 0;

               while (var9 < var0[var4].length()) {
                  String var10 = var0[var4];
                  var10001 = "Y";
                  if ((var6 = var10.indexOf("|", var5 + 1)) == -1) {
                     var6 = var0[var4].length();
                  }

                  if (com.xy.v.Class12.ad(var0[var4], var5, var6) == var2) {
                     return true;
                  }

                  var5 = var6 + 1;
                  var9 = var6;
               }
               break;
            }
         }

         return false;
      }
   }

   public void l() {
      int var10000 = 0;
      this.uw.setVisible(false);

      for (int var1 = 0; var10000 < this.ain.length; var10000 = var1) {
         Class15 var2 = this.ain[var1];
         var1++;
         var2.gs(0, null);
      }
   }

   public static int abb(String[] var0, int var1, int var2) {
      if (var0 == null) {
         return 0;
      } else {
         StringBuilder var10000 = new StringBuilder(String.valueOf(var1));
         String var10001 = "\u0018";
         String var3 = var10000.append("=").toString();

         int var4;
         for (int var10 = var4 = 0; var10 < var0.length; var10 = ++var4) {
            if (var0[var4].startsWith(var3)) {
               int var5 = var3.length();
               int var6 = 0;
               int var7 = 0;
               int var11 = var6;

               while (var11 < var0[var4].length()) {
                  String var12 = var0[var4];
                  var10001 = "$";
                  if ((var6 = var12.indexOf("|", var5 + 1)) == -1) {
                     var6 = var0[var4].length();
                  }

                  if ((var7 = var0[var4].indexOf(",", var5 + 1)) == -1 || var7 > var6) {
                     var7 = var6;
                  }

                  if (com.xy.v.Class12.ad(var0[var4], var5, var7) == var2) {
                     if (var7 < var6) {
                        return com.xy.v.Class12.ad(var0[var4], var7 + 1, var6);
                     }

                     return 1;
                  }

                  var5 = var6 + 1;
                  var11 = var6;
               }
               break;
            }
         }

         return 0;
      }
   }

   public void t() {
      if (this.aim != null) {
         if (this.eu.yx().getGoodPackSum(-1L, new BigDecimal(-1), this.ds) < this.ds) {
            String var3 = "伡皡肍匠乌夺";
            this.eu.afx._do("你的背包不够");
         } else {
            StringBuilder var10001 = new StringBuilder().append(this.aim.getPacktype());
            String var10002 = "$";
            String var2 = Agreement.getSendTextAES("Chongjipacksure", var10001.append("|").append(this.aim.getPackgradetype()).toString());
            this.eu.za().k(var2);
         }
      }
   }

   public void dq(String var1) {
      this.bk.setTextSize(var1, 136);
      this.bk.setBounds(270, 10, this.bk.getWidth(), this.bk.getHeight());
   }
}
