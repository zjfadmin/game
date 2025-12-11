package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.formula.ExpUtil;
import com.xy.i.Class20;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class18 extends com.xy.q.Class30 {
   private com.xy.q.Class14[] ov;
   private static BigDecimal ej = new BigDecimal(0);
   private BigDecimal nh;
   private Class52 zs;
   private com.xy.w.Class18[] fd;
   private BigDecimal gi;
   private com.xy.i.Class20[] wf;
   private Class52 kt;
   private JLabel[] au;

   public void c() {
      LoginResult var2;
      BigDecimal var3 = (var2 = this.yx().getLoginResult()).getExperience();
      BigDecimal var10000;
      if (this.za().l(2, 5)) {
         String var10001 = "广間赖獕";
         var10000 = var2.getScoretype("师门贡献");
      } else {
         var10000 = var2.getGold();
      }

      BigDecimal var4 = var10000;
      String var10003 = "c";
      int var5;
      int var6 = ExpUtil.getTSP(var5 = var2.getExtraPointInt("T"));
      int var7 = ExpUtil.getTSX(var5);
      int var9 = ExpUtil.getTSExp(var6 + 1) - var7;
      String var10 = com.xy.v.Class4.h(var2.getGrade());
      int var12 = ExpUtil.g(ExpUtil.c(var2.getGrade()), this.za());
      if (var6 >= var12) {
         String var25 = "嶅優挕膈弤制壴男乽阫";
         this.afx._do("已兑换至当前境界上限");
      } else if (var9 <= 0) {
         String var24 = "嶥兦挵臄弄剺壔畻九陧";
         this.afx._do("已兑换至当前境界上限");
      } else {
         BigDecimal var13 = var3.divide(this.nh, 0, 1);
         BigDecimal var14 = var4.divide(this.gi, 0, 1);
         switch (var13.compareTo(var14)) {
            case -1:
               if (var13.compareTo(ej) <= 0) {
                  String var23 = "弤制纸髷乺跈";
                  this.afx._do("当前经验不足");
                  return;
               } else {
                  this.uc(var2, var4, var3, var13, var9);
                  return;
               }
            case 0:
               if (var14.compareTo(ej) <= 0) {
                  GameView var16 = this.afx;
                  String var21;
                  if (this.za().l(2, 5)) {
                     var21 = "弄剺幟闟赶猙乚趄哛绸髛郊乚趄";
                     var21 = "当前师门贡献不足和经验都不足";
                  } else {
                     var21 = "弨刺奜讪幺哻纴髻邆乺跈";
                     var21 = "当前大话币和经验都不足";
                  }

                  var16._do(var21);
                  return;
               }

               this.uc(var2, var4, var3, var13, var9);
               return;
            case 1:
               if (var14.compareTo(ej) <= 0) {
                  GameView var15 = this.afx;
                  String var18;
                  if (this.za().l(2, 5)) {
                     var18 = "弄剺幟闟赶猙乚趄";
                     var18 = "当前师门贡献不足";
                  } else {
                     var18 = "弨刺奜讪幺乺跈";
                     var18 = "当前大话币不足";
                  }

                  var15._do(var18);
                  return;
               }

               this.uc(var2, var4, var3, var14, var9);
               return;
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.e();
      }
   }

   public void e() {
      LoginResult var2 = this.yx().getLoginResult();
      this.zs.ef(var2.getExperience().longValue());
      if (this.za().l(2, 5)) {
         String var10002 = "幟闟赶猙";
         this.kt.ef(var2.getScoretype("师门贡献").longValue());
      } else {
         this.kt.ef(var2.getGold().longValue());
      }
   }

   public Class18(GameView var1) {
      super(83, 2, com.xy.q.Class30.afz, var1);
      String var36;
      if (this.za().l(2, 12)) {
         var36 = "\u0002g\u0007g\u0007";
         var36 = "50000";
      } else if (this.za().gameType == 2) {
         var36 = "OGKGKGK";
         var36 = "4000000";
      } else if (this.za().gameType == 1) {
         var36 = "e\u0007g\u0007g\u0007g\u0007";
         var36 = "20000000";
      } else {
         var36 = "CKGKGK";
         var36 = "400000";
      }

      BigDecimal var10000 = new BigDecimal(var36);
      this.gi = var10000;
      if (this.za().gameType == 2) {
         var36 = "f\u0007g\u0007g\u0007g\u0007";
         var36 = "10000000";
      } else {
         var36 = "NGKGKGK";
         var36 = "5000000";
      }

      BigDecimal bigDecimal = new BigDecimal(var36);
      this.nh = bigDecimal;
      var36 = "$TxSx\u0006yG9P";
      this.yy(-1, 0, 402, 437, com.xy.q.Class30.agh);
      com.xy.w.Class9 var44 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "掫匰侕烋烂";
      this.yu(var44, "提升修炼点");
      this.wf = new com.xy.i.Class20[2];

      int var2;
      for (int var7 = var2 = 0; var7 < this.wf.length; var7 = var2) {
         com.xy.i.Class20[] var8 = this.wf;
         var10004 = "D4\u00182\u0018e\u0001yG9P";
         int var10006 = 331 + var2;
         String var46;
         Class18 var10010;
         if (var2 == 0) {
            var46 = "乷镕儦挙";
            var46 = "一键兑换";
            var10010 = this;
         } else if (var2 == 1) {
            var46 = "揧匐俙烫炎";
            var46 = "提升修炼点";
            var10010 = this;
         } else {
            var46 = "";
            var10010 = this;
         }

         Class20 var10002 = new Class20("sc/e/26.png", 1, var10006, Class49.ch, Class49.bv, var46, var10010);
         var8[var2] = var10002;
         Class18 var9;
         if (var2 == 0) {
            var9 = this;
            this.wf[var2].setBounds(91, 386, 99, 25);
         } else {
            if (var2 == 1) {
               com.xy.i.Class20 var10001 = this.wf[var2];
               String var32 = "\b\u0014T\u0012TCMY\u000b\u0019\u001c";
               var10001.setImage("sc/e/46.png");
               this.wf[var2].setBounds(200, 386, 119, 25);
            }

            var9 = this;
         }

         var9.add(this.wf[var2++]);
      }

      this.ov = new com.xy.q.Class14[9];

      for (int var10 = var2 = 0; var10 < this.ov.length; var10 = ++var2) {
         if (var2 != 6 && var2 != 8) {
            this.ov[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 0, Color.white, Class49.w);
            com.xy.q.Class14 var11 = this.ov[var2];
            String var17 = "D4\u00183\u0018f\u0000yG9P";
            var11.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
            Class18 var12;
            if (var2 == 0) {
               var12 = this;
               this.ov[var2].setBounds(145, 49, 39, 19);
            } else if (var2 == 1) {
               var12 = this;
               this.ov[var2].setBounds(330, 49, 39, 19);
            } else if (var2 >= 2 && var2 <= 4) {
               var12 = this;
               this.ov[var2].setBounds(184, 126 + (var2 - 2) * 30, 154, 19);
            } else {
               if (var2 >= 5 && var2 <= 8) {
                  this.ov[var2].setBounds(184, 256 + (var2 - 5) * 31, 154, 19);
               }

               var12 = this;
            }

            var12.add(this.ov[var2]);
         }
      }

      this.zs = com.xy.q.Class1.a(0, Color.white, Class49.w, null, var1);
      this.kt = com.xy.q.Class1.a(0, Color.white, Class49.w, null, var1);
      String var49 = "\b\u0014T\u0013TFLY\u000b\u0019\u001c";
      this.zs.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      String var48 = "D4\u00183\u0018f\u0000yG9P";
      this.kt.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.zs.setBounds(184, 287, 154, 19);
      this.kt.setBounds(184, 349, 154, 19);
      this.zs.setText("0");
      this.kt.setText("0");
      this.add(this.zs);
      this.add(this.kt);
      this.au = new JLabel[11];

      for (int var13 = var2 = 0; var13 < this.au.length; var13 = ++var2) {
         String var10008 = "T\u0018GKGKGK";
         this.au[var2] = com.xy.q.Class1.f(55, 49, 88, 19, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var14 = this.au[var2];
         String var19;
         if (var2 == 0) {
            var19 = "彤刚夞柵炎";
            var19 = "当前天枢点";
         } else if (var2 == 1) {
            var19 = "刞伢厘優挕奒柕烂";
            var19 = "剩余可兑换天枢点";
         } else if (var2 == 2) {
            var19 = "兦挵夞柵炎戗霷";
            var19 = "兑换天枢点所需";
         } else if (var2 == 3) {
            var19 = "弤制仍爒笾络";
            var19 = "当前人物等级";
         } else if (var2 == 4) {
            var19 = "弄剺仭牞壔畻";
            var19 = "当前人物境界";
         } else if (var2 == 5) {
            var19 = "弤制侙烇辬廝";
            var19 = "当前修炼进度";
         } else if (var2 == 6) {
            var19 = "兦挵俙烫炎戗霷";
            var19 = "兑换修炼点所需";
         } else if (var2 == 7) {
            var19 = "户靻纸髷";
            var19 = "所需经验";
         } else if (var2 == 8) {
            var19 = "弄剺纘骻";
            var19 = "当前经验";
         } else if (var2 == 9) {
            var19 = "户靻醦铊";
            var19 = "所需金钱";
         } else if (var2 == 10) {
            var19 = "弄剺醆钆";
            var19 = "当前金钱";
         } else {
            var19 = "";
         }

         var14.setText(var19);
         this.add(this.au[var2]);
         if (var2 == 0) {
            this.au[var2].setBounds(55, 49, 88, 19);
         } else if (var2 == 1) {
            this.au[var2].setBounds(191, 49, 138, 19);
         } else if (var2 == 2) {
            this.au[var2].setBounds(55, 85, 120, 19);
         } else if (var2 >= 3 && var2 <= 5) {
            this.au[var2].setBounds(55, 126 + (var2 - 3) * 30, 120, 19);
         } else if (var2 == 6) {
            this.au[var2].setBounds(55, 220, 120, 19);
         } else if (var2 >= 7 && var2 <= 10) {
            this.au[var2].setBounds(55, 256 + (var2 - 7) * 31, 172, 19);
         }
      }

      this.fd = new com.xy.w.Class18[2];

      for (int var15 = var2 = 0; var15 < this.fd.length; var15 = var2) {
         String var10007 = "\b\u0014T\u0013TDKY\u000b\u0019\u001c";
         this.fd[var2] = new com.xy.w.Class18("sc/d/30.png");
         this.fd[var2].setBounds(56, 106 + 135 * var2, 280, 1);
         this.add(this.fd[var2++]);
      }

      Class49.b(this.ov[5], this.nh.longValue());
      Class49.b(this.ov[7], this.gi.longValue());
      if (this.za().l(2, 5)) {
         JLabel var30 = this.au[9];
         String var35 = "戗霷幟贖";
         var30.setText("所需师贡");
         JLabel var16 = this.au[10];
         String var31 = "弤制广赚";
         var16.setText("当前师贡");
      }
   }

   public void f() {
      LoginResult var10001 = this.yx().getLoginResult();
      String var10006 = "/";
      int var3 = var10001.getExtraPointInt("T");
      BigDecimal var4 = var10001.getExperience();
      int var5 = ExpUtil.getTSP(var3);
      int var6 = ExpUtil.getTSX(var3);
      int var7 = ExpUtil.getTSExp(var5 + 1);
      String var8 = com.xy.v.Class4.h(var10001.getGrade());
      int var9;
      int var10 = ExpUtil.g(var9 = ExpUtil.c(var10001.getGrade()), this.za());
      String var11 = ExpUtil.b(var10001.getRace_id(), var9);
      this.ub(var4, var6, var7, var8, var11, var5, var10);
      this.e();
   }

   @Override
   public void l() {
      this.f();
      super.l();
   }

   public void h() {
      LoginResult var2;
      BigDecimal var3 = (var2 = this.yx().getLoginResult()).getExperience();
      BigDecimal var10000;
      if (this.za().l(2, 5)) {
         String var10001 = "幟闟赶猙";
         var10000 = var2.getScoretype("师门贡献");
      } else {
         var10000 = var2.getGold();
      }

      BigDecimal var4 = var10000;
      if (var3.compareTo(this.nh) < 0) {
         String var29 = "弤制纸髷乺跈";
         this.afx._do("当前经验不足");
      } else if (var4.compareTo(this.gi) < 0) {
         GameView var21 = this.afx;
         String var27;
         if (this.za().l(2, 5)) {
            var27 = "弄剺幟闟赶猙乚趄";
            var27 = "当前师门贡献不足";
         } else {
            var27 = "弨刺奜讪幺乺跈";
            var27 = "当前大话币不足";
         }

         var21._do(var27);
      } else {
         String var10004 = "c";
         int var5;
         int var6 = ExpUtil.getTSP(var5 = var2.getExtraPointInt("T"));
         int var7 = ExpUtil.getTSX(var5);
         int var8 = ExpUtil.getTSExp(var6 + 1);
         String var9 = com.xy.v.Class4.h(var2.getGrade());
         int var10;
         int var11 = ExpUtil.g(var10 = ExpUtil.c(var2.getGrade()), this.za());
         String var12 = ExpUtil.b(var2.getRace_id(), var10);
         if (var6 >= var11) {
            String var25 = "嶅優挕膈弤制壴男乽阫";
            this.afx._do("已兑换至当前境界上限");
         } else {
            var3 = var3.subtract(this.nh);
            var4 = var4.subtract(this.gi);
            var2.setExperience(var3);
            LoginResult var20;
            if (this.za().l(2, 5)) {
               String var22 = var2.getScore();
               var10004 = "帿閿贖獹\n";
               var2.setScore(com.xy.v.Class5.a(var22, "师门贡献=" + var4, 1));
               var20 = var2;
            } else {
               var2.setGold(var4);
               var20 = var2;
            }

            String var23 = "/";
            var20.setExtraPoint("T", 1);
            var23 = "\u0003\u0006";
            String var13 = Agreement.getSendTextAES("rolechange", "T1");
            var10004 = "c";
            this.za().k(var13);
            String var10006 = "弨刺侕烋烂勗J";
            this.afx._do("当前修炼点加1");
            var6 = ExpUtil.getTSP(var5 = var2.getExtraPointInt("T"));
            var7 = ExpUtil.getTSX(var5);
            var8 = ExpUtil.getTSExp(var6 + 1);
            this.ub(var3, var7, var8, var9, var12, var6, var11);
            this.e();
         }
      }
   }

   public void ub(BigDecimal var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      this.ov[0].setText(String.valueOf(var6));
      this.ov[1].setText(String.valueOf(var7 - var6));
      this.ov[2].setText(var4);
      com.xy.q.Class14 var10000 = this.ov[3];
      String var9;
      if (var5 == null) {
         var9 = "\u001aw\u001a";
         var9 = "- -";
      } else {
         var9 = var5;
      }

      var10000.setText(var9);
      var10000 = this.ov[4];
      StringBuilder var10 = new StringBuilder(String.valueOf(var2));
      String var10002 = "T";
      var10000.setText(var10.append("/").append(var3).toString());
   }

   public void uc(LoginResult var1, BigDecimal var2, BigDecimal var3, BigDecimal var4, int var5) {
      int var6 = var5 >= var4.intValue() ? var4.intValue() : var5;
      var2 = var2.subtract(new BigDecimal(var6).multiply(this.gi));
      var3 = var3.subtract(new BigDecimal(var6).multiply(this.nh));
      var1.setExperience(var3);
      LoginResult var10000;
      if (this.za().l(2, 5)) {
         var10000 = var1;
         String var10002 = var1.getScore();
         String var10005 = "帿閿贖獹\n";
         var1.setScore(com.xy.v.Class5.a(var10002, "师门贡献=" + var2, 1));
      } else {
         var10000 = var1;
         var1.setGold(var2);
      }

      String var10001 = "/";
      var10000.setExtraPoint("T", var6);
      String var10003 = "c";
      String var7 = Agreement.getSendTextAES("rolechange", "T" + var6);
      this.za().k(var7);
      String var10007 = "弤制侙烇烎勛";
      this.afx._do("当前修炼点加" + var6);
      String var10006 = "c";
      int var8;
      int var9 = ExpUtil.getTSP(var8 = var1.getExtraPointInt("T"));
      int var10 = ExpUtil.getTSX(var8);
      int var11 = ExpUtil.getTSExp(var9 + 1);
      String var12 = com.xy.v.Class4.h(var1.getGrade());
      int var13;
      int var14 = ExpUtil.g(var13 = ExpUtil.c(var1.getGrade()), this.za());
      String var15 = ExpUtil.b(var1.getRace_id(), var13);
      this.ub(var3, var10, var11, var12, var15, var9, var14);
      this.e();
   }
}
