package com.xy.a;

import com.xy.bean.PayvipBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.formula.Arith;
import com.xy.formula.BaseEquip;
import com.xy.formula.BaseGemOld;
import com.xy.formula.BaseValue;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.formula.PropertyUtil;
import com.xy.formula.QualityZW;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Buff;
import com.xy.readbean.Eshop;
import com.xy.readbean.GemOld;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleSuitBean;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StarSoul;
import com.xy.readbean.Talent;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;

public class Class48 extends com.xy.q.Class30 {
   private boolean _do;
   private RichLabel in;
   private com.xy.w.Class18 nn;
   private int ae;
   private RichLabel cj;
   private boolean bi;
   private RichLabel bj;

   public void pm(StringBuffer var1, String var2, Goodstable var3) {
      if (!com.xy.v.Class12.h(var3.getValue())) {
         String var4 = var3.getValue();
         String var5 = null;
         String var6 = null;
         Object var7 = null;
         String var8 = null;
         int var9 = 0;
         int var10 = 0;
         int var11;
         int var10000 = var11 = 0;

         while (var10000 < var4.length()) {
            String var10001 = "d";
            if ((var11 = var4.indexOf("|", var10 + 1)) == -1) {
               var11 = var4.length();
            }

            if (var9 == 0) {
               var5 = var4.substring(var10 + 3, var11);
               var10000 = var11;
            } else if (var9 == 1) {
               var6 = var4.substring(var10 + 3, var11);
               var10000 = var11;
            } else if (var9 == 2) {
               var7 = var4.substring(var10 + 3, var11);
               if (var1.length() != 0) {
                  var10001 = "'8";
                  var1.append("#r");
               }

               String var10004 = "({M^M^M^";
               var2 = qy(var1, var2, "#cFFFFFF");
               String var10002 = "ず筍续〕j";
               var1.append("【等级】 ");
               var1.append(var5);
               if (var1.length() != 0) {
                  var10001 = "(j";
                  var1.append("#r");
               }

               var10004 = "')B\fB\fB\f";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10002 = "〈祕劃〚8";
               var1.append("【神力】 ");
               String var10005 = "')B\fB\f4z";
               var2 = qy(var1, var2, "#cFFFF00");
               var1.append(var6);
               var10004 = "7";
               var1.append("/");
               String var10006 = "e";
               var1.append(Integer.parseInt(var5.split("/")[0]) * 200);
               if (var1.length() != 0) {
                  var10001 = "(j";
                  var1.append("#r");
               }

               String var10003 = "')B\fB\fB\f";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10001 = "〈戓劃〚8";
               var1.append("【战力】 ");
               var10004 = "')B\fB\f4z";
               var2 = qy(var1, var2, "#cFFFF00");
               var1.append((String)var7);
               var10000 = var11;
            } else {
               String var12;
               if ((var12 = var4.substring(var10, var11)).startsWith(GoodType.Extras[0])) {
                  var8 = this.qe(var1, var12, 520L);
                  var10000 = var11;
               } else {
                  if (var12.startsWith(GoodType.Extras[6])) {
                     this.pr(var1, var12, var8);
                  }

                  var10000 = var11;
               }
            }

            var9++;
            var10 = var10000 + 1;
            var10000 = var11;
         }
      }
   }

   public void pn(StringBuffer var1, String var2, Goodstable var3) {
      if (!com.xy.v.Class12.h(var3.getValue())) {
         String var10000 = var3.getValue();
         String var10001 = "X6";
         String[] var5 = var10000.split("\\|");
         if (var1.length() != 0) {
            var10001 = "(j";
            var1.append("#r");
         }

         String var10004 = "')B\fB\fB\f";
         var2 = qy(var1, var2, "#cFFFFFF");
         String var10002 = "〈筂线〚8";
         var1.append("【等级】 ");
         var1.append(var5[0].substring(3));
         if (var1.length() != 0) {
            var10001 = "'8";
            var1.append("#r");
         }

         var10004 = "({M^M^M^";
         var2 = qy(var1, var2, "#cFFFFFF");
         var10002 = "ず裁奍郬伇〕j";
         var1.append("【装备部位】 ");
         var1.append(var5[1].substring(5));
         if (var1.length() != 0) {
            var10001 = "(j";
            var1.append("#r");
         }

         String var10003 = "')B\fB\fB\f";
         var2 = qy(var1, var2, "#cFFFFFF");
         var10001 = "〈筂线霋汚〚8";
         var1.append("【等级需求】 ");
         var1.append(var5[2].substring(5));
         int var6 = 3;
         int var17 = var6;

         StringBuffer var19;
         while (true) {
            if (var17 >= var5.length) {
               var19 = var1;
               break;
            }

            var10000 = var5[var6];
            var10001 = "哅赢";
            if (var10000.startsWith("品质")) {
               var19 = var1;
               break;
            }

            if (var1.length() != 0) {
               var10001 = "(j";
               var1.append("#r");
            }

            var10003 = "')B\fB\fB\f";
            var2 = qy(var1, var2, "#cFFFFFF");
            var10001 = var5[var6];
            var10002 = "%";
            String[] var7 = var10001.split("=");
            var10001 = "ず";
            var1.append("【");
            var1.append(var7[0]);
            var10003 = "〚8";
            var1.append("】 ");
            var6++;
            var1.append(var7[1]);
            var17 = var6;
         }

         if (var19.length() != 0) {
            var10001 = "'8";
            var1.append("#r");
         }

         var10004 = "({M^M^M^";
         var2 = qy(var1, var2, "#cFFFFFF");
         var10002 = "ず哅赢〕j";
         var1.append("【品质】 ");
         var1.append(var5[var6].substring(3));
         var10004 = "$);(";
         var1.append("/100");
         if (var1.length() != 0) {
            var10001 = "'8";
            var1.append("#r");
         }

         var10003 = "({M^M^M^";
         var2 = qy(var1, var2, "#cFFFFFF");
         var10001 = "ず逞瀿〕j";
         var1.append("【通灵】 ");
         int var16 = Integer.parseInt(var5[0].substring(3));
         var1.append(var5[var6 + 1].substring(3));
         var10003 = "7";
         var1.append("/");
         var1.append(var16 * 1000);
         boolean var8 = true;
         int var9 = var6 + 2;

         for (int var20 = var9; var20 < var5.length; var20 = ++var9) {
            if (var5[var9].startsWith(GoodType.Extras[0])) {
               this.qe(var1, var5[var9], var3.getType());
            } else if (var5[var9].startsWith(GoodType.Extras[5])) {
               var8 = false;
               this.ps(var1, var5[var9]);
            }
         }

         if (var8) {
            if (var1.length() != 0) {
               var10001 = "'8";
               var1.append("#r");
            }

            var10003 = "({;(M\\M)";
            var2 = qy(var1, var2, "#c00FDF1");
            var10001 = "朮彊含覃醖b弄呥铇か玫か甶丁觍釘（厥颂惕觍釘抄c";
            var1.append("未开启觉醒(开启铃、环、甲之觉醒，可领悟觉醒技)");
         }
      }
   }

   public void po(StallBuyData var1) {
      String var10000 = "(O";
      this.f();
      this.ae = 1;
      this.nn.gt(com.xy.w.Class15.d(var1.getSkin()));
      String var10004 = "')B\fB\f3\u007f";
      this.in.setTextSize("#cFFFF75" + var1.getName(), 215);
      String var2 = "#W";
      StringBuffer var3 = new StringBuffer();
      if (var1.getText() != null && !var1.getText().equals("")) {
         var3.append(var1.getText());
      }

      this.cj.setTextSize(var3.toString(), 215);
      this.cr(false);
   }

   public void bk(String var1) {
      if (!com.xy.v.Class12.h(var1)) {
         this.f();
         this.cj.setFont(com.xy.q.Class49.w);
         this.cj.setTextSize(var1, 255);
         this.c();
      }
   }

   public void bq(String var1) {
      if (!com.xy.v.Class12.h(var1)) {
         this.f();
         this.cj.setTextSize(var1, 255);
         this.c();
      }
   }

   public static String pp(String var0, Skill var1, String var2, String var3) {
      String var10001 = "c內弗下e";
      String var10004 = "'\u0018";
      StringBuilder var10002 = new StringBuilder("#R")
         .append((int)Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3))));
      String var10003 = "(_";
      String var10000 = var0.replace("{公式一}", var10002.append("#G").toString());
      var10001 = "1全彅予7";
      var10004 = "(J";
      var10002 = new StringBuilder("#R");
      double var37 = Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)));
      var10004 = "z*r";
      var10002 = var10002.append((int)Arith.b(var37, Double.parseDouble("0.8")));
      var10003 = "(_";
      var10000 = var10000.replace("{公式二}", var10002.append("#G").toString());
      var10001 = "1全彅不7";
      var10004 = "(J";
      var10002 = new StringBuilder("#R");
      double var39 = Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)));
      var10004 = "z*}";
      var10002 = var10002.append((int)Arith.b(var39, Double.parseDouble("0.7")));
      var10003 = "(_";
      var10000 = var10000.replace("{公式三}", var10002.append("#G").toString());
      var10001 = "1全彅囟7";
      var10004 = "(J";
      var10002 = new StringBuilder("#R");
      double var41 = Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)));
      var10004 = "z*y";
      var10002 = var10002.append((int)Arith.b(var41, Double.parseDouble("0.3")));
      var10003 = "(_";
      var10000 = var10000.replace("{公式四}", var10002.append("#G").toString());
      var10001 = "1全彅亐7";
      var10004 = "(J";
      var10002 = new StringBuilder("#R")
         .append(
            (int)Arith.c(
               Double.parseDouble("100"),
               Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)))
            )
         );
      var10003 = "'\r";
      var10000 = var10000.replace("{公式五}", var10002.append("#G").toString());
      var10001 = "c內弗兦e";
      var10004 = "'\u0018";
      var10002 = new StringBuilder("#R");
      double var44 = Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)));
      var10004 = ";69-";
      var10002 = var10002.append((int)Arith.b(var44, Double.parseDouble("0.25")));
      var10003 = "'\r";
      var10000 = var10000.replace("{公式六}", var10002.append("#G").toString());
      var10001 = "c內弗丈e";
      var10004 = "'\u0018";
      var10002 = new StringBuilder("#R")
         .append(
            (int)Arith.g(
               Double.parseDouble("100"),
               Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)))
            )
         );
      var10003 = "(_";
      var10000 = var10000.replace("{公式七}", var10002.append("#G").toString());
      var10001 = "1全彅兯7";
      var10004 = "(J";
      var10002 = new StringBuilder("#R");
      double var47 = Double.parseDouble("1");
      double var64 = Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)));
      String var10005 = "4d4}";
      var10002 = var10002.append((int)Arith.g(var47, Arith.b(var64, Double.parseDouble("0.07"))));
      var10003 = "(_";
      var10000 = var10000.replace("{公式八}", var10002.append("#G").toString());
      var10001 = "1全彅乙7";
      var10004 = "(J";
      var10002 = new StringBuilder("#R");
      double var49 = Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)));
      var10004 = "z*\u007f";
      var10002 = var10002.append((int)Arith.b(var49, Double.parseDouble("0.5")));
      var10003 = "(_";
      var10000 = var10000.replace("{公式九}", var10002.append("#G").toString());
      var10001 = "1全彅卅7";
      var10004 = "(J";
      var10002 = new StringBuilder("#R");
      double var51 = Arith.b(Arith.e(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0, 0), Math.sqrt(Double.parseDouble(var3)));
      var10004 = "4d4\u007f";
      var10002 = var10002.append((int)Arith.b(var51, Double.parseDouble("0.05")));
      var10003 = "(_";
      return var10000.replace("{公式十}", var10002.append("#G").toString());
   }

   public int pq(int var1, int var2) {
      if ((var1 < 3001 || var1 > 3009) && var1 != 3023 && var1 != 3027) {
         if (var1 == 3013 || var1 == 3014 || var1 == 3015) {
            return this.ky(var2);
         } else if (var1 >= 3016 && var1 <= 3020) {
            return this.pv(var2);
         } else {
            return var1 != 3028 && var1 != 3029 && var1 != 3030 ? var2 : var2 - 3;
         }
      } else {
         return this.qt(var2);
      }
   }

   public void pr(StringBuffer var1, String var2, String var3) {
      if (var1.length() != 0) {
         String var10001 = "'8";
         var1.append("#r");
      }

      String var10003 = "({M^M^M^";
      String var4 = qy(var1, null, "#cFFFFFF");
      String var15 = "〔仞衈せ";
      var1.append("【五行】");
      String var10002 = ">";
      String[] var5 = var2.split("&");
      String[] var10000;
      if (var3 != null) {
         var15 = "w";
         var10000 = var3.split("=");
      } else {
         var10000 = null;
      }

      String[] var6 = var10000;
      double var7 = 0.0;

      int var9;
      for (int var13 = var9 = 1; var13 < var5.length; var13 = ++var9) {
         String var14 = var5[var9];
         var15 = "%";
         String[] var10 = var14.split("=");
         if (var1.length() != 0) {
            var15 = "'8";
            var1.append("#r");
         }

         var10003 = "({M^M^;(";
         var4 = qy(var1, var4, "#cFFFF00");
         var1.append(var10[0]);
         var10002 = "j";
         var1.append(" ");
         var1.append(var10[1]);
         String var10004 = "$);(";
         var1.append("/100");
         if (var6 != null) {
            var7 += MsgUntil.i(var6[2], var10[0], var10[1]);
         }
      }

      if (var6 != null) {
         if (var1.length() != 0) {
            var15 = "'8";
            var1.append("#r");
         }

         String var32 = "({?YO]O\\";
         var4 = qy(var1, var4, "#c4ADEDD");
         var10002 = "仞衈勪戔晕阱丁功j";
         var1.append("五行加成星阵之力 ");
         var15 = ".6:~";
         var1.append(String.format("%.1f", var7));
         var10002 = "o";
         var1.append("%");
         if (var1.length() != 0) {
            var15 = "(j";
            var1.append("#r");
         }

         var10002 = "〔晕阱せ";
         var1.append("【星阵】");
         if (var1.length() != 0) {
            var15 = "(j";
            var1.append("#r");
         }

         var1.append(var6[1]);
         var10002 = "b";
         var1.append("(");
         var1.append(var6[2]);
         var32 = "1";
         var1.append(")");
         if (this.nb(var6[1])) {
            var10003 = "'8')B\fB\fB\f赠幗宯j')4zB\f4z";
            var1.append("#r#cFFFFFF赤帝宫 #c00FF00" + var6[3]);
            var32 = "(j({M^M^M^静帅宠8({;(M^;(";
            var1.append("#r#cFFFFFF青帝宫 #c00FF00" + var6[4]);
            String var10005 = "'8')B\fB\fB\f黀幗宯j')4zB\f4z";
            var1.append("#r#cFFFFFF黄帝宫 #c00FF00" + var6[5]);
            String var10006 = "(j({M^M^M^癶帅宠8({;(M^;(";
            var1.append("#r#cFFFFFF白帝宫 #c00FF00" + var6[6]);
            String var10007 = "'8')B\fB\fB\f黕幗宯j')4zB\f4z";
            var1.append("#r#cFFFFFF黑帝宫 #c00FF00" + var6[7]);
            var4 = null;
         }

         var10003 = "(j({;(M^;(";
         var1.append("#r#c00FF00" + this.fx(var6[1]));
      } else {
         var15 = "'8')0\u000b@\u000f@\u000e旤晕阱ｆ亐蠆暆乇甛攂";
         var1.append("#r#c4ADEDD无星阵，五行暂不生效");
      }
   }

   public void ps(StringBuffer var1, String var2) {
      String var10001 = ">";
      String[] var3 = var2.split("&");
      Skill var4 = this.yt().ac(var3[1]);
      if (var1.length() != 0) {
         var10001 = "'8";
         var1.append("#r");
      }

      long var5 = ExpUtil.d(Long.parseLong(var3[3]));
      String var10003 = "({M^M^;(";
      String var7 = qy(var1, null, "#cFFFF00");
      var10001 = "〔覃醖拊〕j";
      var1.append("【觉醒技】 ");
      var1.append(var4.getSkillname());
      String var10004 = "0";
      var1.append("(");
      var1.append(var3[2]);
      String var10006 = "c";
      var1.append(")");
      if (var1.length() != 0) {
         var10001 = "(j";
         var1.append("#r");
      }

      var10004 = "')B\fB\fB\f";
      var7 = qy(var1, var7, "#cFFFFFF");
      String var10002 = "〛觑醙折筂线〚8";
      var1.append("【觉醒技等级】 ");
      var1.append(var5);
      if (var1.length() != 0) {
         var10001 = "'8";
         var1.append("#r");
      }

      var10004 = "({M^M^M^";
      var7 = qy(var1, var7, "#cFFFFFF");
      var10002 = "ず籿埁〕j逞畢";
      var1.append("【类型】 通用");
      if (var1.length() != 0) {
         var10001 = "(j";
         var1.append("#r");
      }

      var10004 = "')4zB\f4z";
      var7 = qy(var1, var7, "#c00FF00");
      var1.append(pp(var4.getRemark(), var4, var3[2], String.valueOf(var5)));
      if (var1.length() != 0) {
         var10001 = "(j";
         var1.append("#r");
      }

      var10003 = "')G\u007fG\u007f<y";
      var7 = qy(var1, var7, "#cC5C583");
      var10001 = "铈〙玤〙甹觑醙丑吃丘＇觑醙折斲号甔敐";
      var1.append("铃、环、甲觉醒三合一，觉醒技方可生效");
   }

   public void pt(UseCardBean var1) {
      this.f();
      StringBuffer var2;
      StringBuffer var10000 = var2 = new StringBuffer();
      String var10001 = "i]j";
      var10000.append("#Y ");
      var2.append(var1.getName());
      String var13 = var1.getType();
      var10001 = "XNBH";
      UseCardBean var14;
      if (var13.equals("SVIP")) {
         var14 = var1;
         String var10002 = "ivi]亯丏勪戔厠圬\u001aR\u000f服攂";
         var2.append("#r#Y以下加成只在PVE有效");
      } else {
         String var15 = var1.getType();
         var10001 = "_L";
         if (var15.equals("TT")) {
            if (!com.xy.v.Class12.h(var1.getValue())) {
               com.xy.v.Class8 var9 = this.yt();
               String var32 = var1.getValue();
               var10001 = "X6";
               String[] var10 = var32.split("\\|");

               int var11;
               for (int var33 = var11 = 0; var33 < var10.length; var33 = ++var11) {
                  int var12 = Integer.parseInt(var10[var11]);
                  Buff var7;
                  if ((var7 = var9.a(var12)) != null) {
                     var10001 = "(j";
                     var2.append("#r");
                     var2.append(var7.getColor());
                     var2.append(var7.getbName());
                  }
               }
            }

            this.cj.setTextSize(var2.toString(), 255);
            this.c();
            return;
         }

         String var16 = var1.getType();
         var10001 = "朌匫";
         if (var16.equals("月卡")) {
            if (this.za().l(2, 12)) {
               var10001 = ";y8(O:6毄旽奝助颍収";
               var2.append("#r #W1.每日奖励领取");
               String var59 = "'8$iSx*厥贩为剫杦欥攺";
               var2.append("#r #W2.可购买副本次数");
               String var10003 = ";y8(O86濋洣劢打劔胥";
               var2.append("#r #W3.激活助手功能");
               String var10004 = "ivj'\u001d0d歿仫吊ｆ黜诮囚奇衄沟";
               var2.append("#r #W4.死亡后，默认回复血法");
               String var10005 = ";y8(O>6[NN丵莼徏IMM^劫戈#锈丆号挪\"兣糣弱泍>=#弢霌慉9=\"1";
               var2.append("#r #W5.PVE中获得BUFF加成(锐不可挡:全系强法5%(强震慑2%))");
               var14 = var1;
            } else {
               var10001 = "ivj'\u001d5d毋斯奒勻颂厜";
               var2.append("#r #W1.每日奖励领取");
               String var60 = "(j+;\\*%号账乨剤朴欪敨";
               var2.append("#r #W2.可购买副本次数");
               String var64 = "ivj'\u001d7d濄浱劭戁力肷";
               var2.append("#r #W3.激活助手功能");
               String var70 = ";y8(O?6歰亹吅４黓讼囕夕衋泍";
               var2.append("#r #W4.死亡后，默认回复血法");
               String var74 = "'8$iS\u007f*\u001aR\u000f丩菽従\bQ\fB勪戔b锢乀淿苻>伵甬奐佗沟末敱凿於（权7z!槈玃飗夒壔劤乊丮匟佉c";
               var2.append("#r #W5.PVE中获得BUFF加成(锦上添花:使用多体法术攻击时，有30%概率额外增加一个单位)");
               var14 = var1;
            }
         } else {
            String var17 = var1.getType();
            var10001 = "孨卹";
            if (var17.equals("季卡")) {
               if (this.za().l(2, 12)) {
                  var10001 = "ivj'\u001d5d毋斯奒勻颂厜";
                  var2.append("#r #W1.每日奖励领取");
                  String var61 = ";y8(O96墕劸:欹剤朴欪敨";
                  var2.append("#r #W2.增加1次副本次数");
                  String var65 = "ivj'\u001d7d濄浱劭戁力肷";
                  var2.append("#r #W3.激活助手功能");
                  String var71 = ";y8(O?6墕劸莼徏牢哙榉玟8=";
                  var2.append("#r #W4.增加获得物品概率3%");
                  String var75 = "'8$iS\u007f*晄雳扒斓乧服x4o榆珍颙奜莳忝丄歫牭咋奒勻，乇匁呡绋髆々醛钵か剫杦秫剌筍夜劵ｃ";
                  var2.append("#r #W5.明雷战斗中有20%概率额外获得一次物品奖励（不包含经验、金钱、副本积分等奖励）");
                  var14 = var1;
               } else {
                  var10001 = ";y8(O:6毄旽奝助颍収";
                  var2.append("#r #W1.每日奖励领取");
                  String var62 = "ivj'\u001d6d墚勪5歫剫杦欥攺";
                  var2.append("#r #W2.增加1次副本次数");
                  String var66 = ";y8(O86濋洣劢打劔胥";
                  var2.append("#r #W3.激活助手功能");
                  String var72 = "ivj'\u001d0d墚勪莳忝牭咋榆珍7o";
                  var2.append("#r #W4.增加获得物品概率3%");
                  String var76 = "(j+;\\-%H]]並莯徜Z^^M劸戛0锛丕古彋1毗囕吐弋姓旽+;=榉玟莼徏9(炲似宸糣忶觞');炡掬刮糰忥觍4挊绵下囆吃1";
                  var2.append("#r #W5.PVE中获得BUFF加成(锐不可当:每回合开始时30%概率获得20点伤害系忽视,10点控制系忽视,持续一回合)");
                  var14 = var1;
               }
            } else {
               long var3;
               if ((var3 = Math.max(var1.getUseTime(), 0)) > 0L) {
                  var10001 = "$j'\r剭伓旲閾'\u0013";
                  var2.append("  #G剩余时间#Y");
                  var2.append(var3);
                  String var67 = "(_刍钇";
                  var2.append("#G分钟");
               }

               var14 = var1;
            }
         }
      }

      if (!com.xy.v.Class12.h(var14.getValue())) {
         String var18 = var1.getValue();
         var10001 = "X6";
         String[] var8 = var18.split("\\|");

         int var4;
         for (int var19 = var4 = 0; var19 < var8.length; var19 = ++var4) {
            String var20 = var8[var4];
            var10001 = "%";
            String[] var5;
            if ((var5 = var20.split("=")).length == 2) {
               String var21 = var5[0];
               var10001 = "抄肷";
               if (var21.equals("技能")) {
                  Skill var6;
                  Skill var22 = var6 = this.yt().ac(var5[1]);
                  String var63 = "(j(O+8";
                  var2.append("#r#W  ");
                  var2.append(var5[0]);
                  String var73 = "j";
                  var2.append(" ");
                  if (var22 == null) {
                     String var68 = "朲矮折胶5";
                     var2.append("未知技能-" + var5[1]);
                  } else {
                     String var23 = var6.getSkillid();
                     var10001 = "<z1x";
                     if (var23.equals("8052")) {
                        var2.append(var6.getRemark());
                     } else {
                        var2.append(var6.getSkillname());
                     }
                  }
               } else {
                  String var24 = var5[0];
                  var10001 = "栌筦";
                  if (!var24.equals("标签")) {
                     String var25 = var5[0];
                     var10001 = "偶";
                     if (!var25.equals("值")) {
                        String var26 = var5[0];
                        var10001 = "皥肼";
                        if (!var26.equals("皮肤")) {
                           String var27 = var5[0];
                           var10001 = "施呛";
                           if (!var27.equals("方向")) {
                              String var28 = var5[0];
                              var10001 = "叓躳卪籣";
                              if (!var28.equals("变身卡类")) {
                                 String var29 = var5[0];
                                 var10001 = "&r&";
                                 if (!var29.equals("lvl")) {
                                    String var30 = var5[0];
                                    var10001 = "別奎";
                                    if (!var30.equals("刮奖")) {
                                       String var31 = var5[0];
                                       var10001 = "卥簱";
                                       if (!var31.equals("卡类")) {
                                          var10001 = "(j(O+8";
                                          var2.append("#r#W  ");
                                          var2.append(var5[0]);
                                          String var69 = "j";
                                          var2.append(" ");
                                          var2.append(pu(var5[1]));
                                          var2.append(qb(var5[0]));
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else if (var5.length == 1) {
               var10001 = "(j(O+8";
               var2.append("#r#W  ");
               var2.append(var5[0]);
            }
         }
      }

      this.cj.setTextSize(var2.toString(), 255);
      this.c();
   }

   public static String pu(String var0) {
      StringBuffer var1 = new StringBuffer();

      try {
         if (Double.parseDouble(var0) > 0.0) {
            String var10001 = "a";
            var1.append("+");
         }

         String var6 = "W6";
         String[] var4 = var0.split("\\.");
         var1.append(var4[0]);
         if (var4.length >= 2) {
            var6 = "d";
            var1.append(".");
            var1.append(var4[1].charAt(0));
         }

         return var1.toString();
      } catch (Exception var5) {
         return var0;
      }
   }

   public int pv(int var1) {
      return var1 >= 5 ? 10 : (var1 << 1) - 1;
   }

   public void pw(StringBuffer var1, String var2) {
      String var10001 = ">";
      String[] var3 = var2.split("&");
      if (var1.length() != 0) {
         var10001 = "'8";
         var1.append("#r");
      }

      String var10003 = "(O";
      String var4 = qy(var1, null, "#W");
      var10001 = "〔烶噬せ";
      var1.append("【炼器】");
      String var10004 = "({;(NYM^";
      var4 = qy(var1, var4, "#c00EAFF");
      String var10002 = "彊免歫整j";
      var1.append("开光次数 ");
      var1.append(var3[1]);
      int var5 = 2;

      for (int var10000 = var5; var10000 < var3.length; var10000 = var5) {
         String var8 = var3[var5];
         var10001 = "%";
         String[] var6 = var8.split("=");
         if (var1.length() != 0) {
            var10001 = "'8";
            var1.append("#r");
         }

         var10003 = "({;(H\\;(";
         var4 = qy(var1, var4, "#c00CD00");
         var1.append(var6[0]);
         var10002 = "j";
         var1.append(" ");
         var1.append(pu(var6[1]));
         var5++;
         var1.append(qb(var6[0]));
      }
   }

   public void px(StringBuffer var1, String var2, String var3, long var4, Integer var6) {
      if (!com.xy.v.Class12.h(var3)) {
         String var10001 = "Wd";
         String[] var7 = var3.split("\\|");
         String var8 = null;
         if (var4 != 779L) {
            String var9 = null;
            String var10 = null;
            String var11 = null;
            String var12 = null;
            String var13 = null;
            String var14 = null;
            int var15;
            int var10000 = var15 = 0;

            String var35;
            while (true) {
               if (var10000 >= var7.length) {
                  var35 = var10;
                  break;
               }

               if (var7[var15] != null) {
                  String var31 = var7[var15];
                  var10001 = "l";
                  if (var31.indexOf("&") != -1) {
                     var35 = var10;
                     break;
                  }

                  String var32 = var7[var15];
                  var10001 = "%";
                  int var16;
                  if ((var16 = var32.indexOf("=")) != -1) {
                     String var17;
                     String var33 = var17 = var7[var15].substring(0, var16);
                     var10001 = "筍续";
                     boolean var34 = var33.equals("等级");
                     String var10002 = "阽敨";
                     if (var34 | var17.equals("阶数")) {
                        var12 = var17;
                        var13 = var7[var15].substring(var16 + 1);
                        var7[var15] = null;
                     } else {
                        var10001 = "奓袏哅赢";
                        if (var17.equals("套装品质")) {
                           var9 = var7[var15].substring(var16 + 1);
                           var7[var15] = null;
                        } else {
                           var10001 = "裎够郣何";
                           if (var17.equals("装备部位")) {
                              var10 = var7[var15].substring(var16 + 1);
                              var7[var15] = null;
                           } else {
                              label277: {
                                 var10001 = "怣剡覅氈";
                                 if (!var17.equals("性别要求")) {
                                    var10001 = "怬刳";
                                    if (!var17.equals("性别")) {
                                       var10001 = "裁奍觖舸";
                                       if (var17.equals("装备角色")) {
                                          var14 = var7[var15].substring(var16 + 1);
                                          var7[var15] = null;
                                       }
                                       break label277;
                                    }
                                 }

                                 var11 = var7[var15].substring(var16 + 1);
                                 var7[var15] = null;
                              }
                           }
                        }
                     }
                  }
               }

               var10000 = ++var15;
            }

            if (var35 == null) {
               var10 = String.valueOf(GoodType.r(var4));
            }

            if (var14 == null && var11 == null) {
               String var36 = "*";
               var11 = "2";
            }

            if (var9 != null) {
               if (var1.length() != 0) {
                  var10001 = "'8";
                  var1.append("#r");
               }

               String var10003 = "({M^M^M^";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10001 = "〔夝裁咋贬せ";
               var1.append("【套装品质】");
               var1.append(var9);
               var9 = null;
               if (var10 != null) {
                  String var29;
                  if ((var29 = MsgUntil.f(var10, true)) != null) {
                     var10 = var29;
                  }

                  if (var1.length() != 0) {
                     var10001 = "(j";
                     var1.append("#r");
                  }

                  var10003 = "')B\fB\fB\f";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  var10001 = "〛裝夌郰但〉";
                  var1.append("【装备部位】");
                  var1.append(var10);
                  var10 = null;
               }

               if (var11 != null) {
                  if (var1.length() != 0) {
                     var10001 = "'8";
                     var1.append("#r");
                  }

                  String var10004 = "({M^M^M^";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  String var117 = "〔袏夃覘艶せ";
                  var1.append("【装备角色】");
                  if (var11.equals("1")) {
                     var10001 = "甼怿觙艪";
                     var10001 = "男性角色";
                  } else if (var11.equals("0")) {
                     var10001 = "奷恭觖舸";
                     var10001 = "女性角色";
                  } else {
                     var10001 = "手朑";
                     var10001 = "所有";
                  }

                  var1.append(var10001);
                  var11 = null;
               }

               if (var14 != null) {
                  if (var1.length() != 0) {
                     var10001 = "'8";
                     var1.append("#r");
                  }

                  var10003 = "({M^M^M^";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  var10001 = "〔袏夃覘艶せ";
                  var1.append("【装备角色】");
                  var1.append(var14);
                  var14 = null;
               }

               if (var12 != null) {
                  if (var1.length() != 0) {
                     var10001 = "(j";
                     var1.append("#r");
                  }

                  var10003 = "')B\fB\fB\f";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  var10001 = "〈";
                  var1.append("【");
                  var1.append(var12);
                  var10003 = "せ";
                  var1.append("】");
                  var1.append(var13);
               }
            } else {
               if (var12 != null) {
                  if (var1.length() != 0) {
                     var10001 = "(j";
                     var1.append("#r");
                  }

                  String var136 = "')B\fB\fB\f";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  var10001 = "〈";
                  var1.append("【");
                  var1.append(var12);
                  var136 = "せ";
                  var1.append("】");
                  var1.append(var13);
               }

               if (var10 != null) {
                  String var30;
                  if ((var30 = MsgUntil.f(var10, false)) != null) {
                     var10 = var30;
                  }

                  if (var1.length() != 0) {
                     var10001 = "(j";
                     var1.append("#r");
                  }

                  String var138 = "')B\fB\fB\f";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  var10001 = "〛裝夌郰但〉";
                  var1.append("【装备部位】");
                  var1.append(var10);
                  var10 = null;
               }

               if (var11 != null) {
                  if (var1.length() != 0) {
                     var10001 = "'8";
                     var1.append("#r");
                  }

                  String var150 = "({M^M^M^";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  String var118 = "〔袏夃覘艶せ";
                  var1.append("【装备角色】");
                  if (var11.equals("1")) {
                     var10001 = "甼怿觙艪";
                     var10001 = "男性角色";
                  } else if (var11.equals("0")) {
                     var10001 = "奷恭觖舸";
                     var10001 = "女性角色";
                  } else {
                     var10001 = "手朑";
                     var10001 = "所有";
                  }

                  var1.append(var10001);
                  var11 = null;
               }

               if (var14 != null) {
                  if (var1.length() != 0) {
                     var10001 = "'8";
                     var1.append("#r");
                  }

                  String var139 = "({M^M^M^";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  var10001 = "〔袏夃覘艶せ";
                  var1.append("【装备角色】");
                  var1.append(var14);
                  var14 = null;
               }
            }
         }

         int var19;
         for (int var37 = var19 = 0; var37 < var7.length; var37 = ++var19) {
            if (var7[var19] != null) {
               if (var7[var19].startsWith(GoodType.Extras[0])) {
                  var8 = this.qe(var1, var7[var19], var4);
               } else if (var7[var19].startsWith(GoodType.Extras[1])) {
                  this.pw(var1, var7[var19]);
               } else if (var7[var19].startsWith(GoodType.Extras[2])) {
                  this.pz(var1, var7[var19], var4);
               } else if (var7[var19].startsWith(GoodType.Extras[3])) {
                  this.qd(var1, var7[var19]);
               } else if (var7[var19].startsWith(GoodType.Extras[4])) {
                  this.qv(var1, var7[var19]);
               } else if (var7[var19].startsWith(GoodType.Extras[5])) {
                  this.ps(var1, var7[var19]);
               } else if (var7[var19].startsWith(GoodType.Extras[6])) {
                  this.pr(var1, var7[var19], var8);
               } else if (var7[var19].startsWith(GoodType.Extras[8])) {
                  this.qm(var1, var7[var19]);
               } else if (var7[var19].startsWith(GoodType.Extras[9])) {
                  this.qc(var1, var7[var19]);
               } else {
                  String var38 = var7[var19];
                  var10001 = "%";
                  String[] var22 = var38.split("=");
                  if (var1.length() != 0) {
                     var10001 = "'8";
                     var1.append("#r");
                  }

                  String var39 = var22[0];
                  var10001 = "筂线";
                  if (!var39.equals("等级")) {
                     String var40 = var22[0];
                     var10001 = "防攺";
                     if (!var40.equals("阶数")) {
                        String var41 = var22[0];
                        var10001 = "裁奍觖舸";
                        if (!var41.equals("装备角色")) {
                           String var42 = var22[0];
                           var10001 = "裎够筂线";
                           if (!var42.equals("装备等级")) {
                              String var43 = var22[0];
                              var10001 = "奓袏哅赢";
                              if (!var43.equals("套装品质")) {
                                 String var44 = var22[0];
                                 var10001 = "朄骒搾幬筍续";
                                 if (var44.equals("最高携带等级")) {
                                    String var120;
                                    if (this.za().gameType == 2) {
                                       var120 = "({;(M^M^";
                                       var120 = "#c00FFFF";
                                    } else {
                                       var120 = "')B\fB\fB\f";
                                       var120 = "#cFFFFFF";
                                    }

                                    var2 = qy(var1, var2, var120);
                                    var10001 = "〈";
                                    var1.append("【");
                                    var1.append(var22[0]);
                                    String var144 = "せ";
                                    var1.append("】");
                                    var1.append(var22[1]);
                                 } else {
                                    String var45 = var22[0];
                                    var10001 = "劐釗覊汚";
                                    if (!var45.equals("力量要求")) {
                                       String var46 = var22[0];
                                       var10001 = "灱恭覅氈";
                                       if (!var46.equals("灵性要求")) {
                                          String var47 = var22[0];
                                          var10001 = "栲骰覊汚";
                                          if (!var47.equals("根骨要求")) {
                                             String var48 = var22[0];
                                             var10001 = "敋挽覅氈";
                                             if (!var48.equals("敏捷要求")) {
                                                String var49 = var22[0];
                                                var10001 = "筂线覊汚";
                                                if (!var49.equals("等级要求")) {
                                                   String var50 = var22[0];
                                                   var10001 = "壴村覅氈";
                                                   if (!var50.equals("声望要求")) {
                                                      String var51 = var22[0];
                                                      var10001 = "裁奍郬伇";
                                                      if (var51.equals("装备部位")) {
                                                         String var25;
                                                         if ((var25 = MsgUntil.f(var22[1], true)) != null) {
                                                            var22[1] = var25;
                                                         }

                                                         String var145 = "({M^M^M^";
                                                         var2 = qy(var1, var2, "#cFFFFFF");
                                                         var10001 = "〔袏夃邢佉せ";
                                                         var1.append("【装备部位】");
                                                         var1.append(var22[1]);
                                                      } else {
                                                         String var52 = var22[0];
                                                         var10001 = "怬刳覊汚";
                                                         if (!var52.equals("性别要求")) {
                                                            String var53 = var22[0];
                                                            var10001 = "怣剡";
                                                            if (!var53.equals("性别")) {
                                                               String var54 = var22[0];
                                                               var10001 = "耔丏";
                                                               if (var54.equals("耐久")) {
                                                                  if (this.za().gameType == 2) {
                                                                     int var26 = var22[1].indexOf(",");
                                                                     var22[1] = var22[1].substring(0, var26 != -1 ? var26 : var22[1].length());
                                                                     String var146 = "({M]M^<*";
                                                                     var2 = qy(var1, var2, "#cFEFF72");
                                                                     var10001 = "聚乁j";
                                                                     var1.append("耐久 ");
                                                                     var1.append(var22[1]);
                                                                  } else {
                                                                     String var147 = "({M^M^8+";
                                                                     var2 = qy(var1, var2, "#cFFFF33");
                                                                     var10001 = "聚乁p'\r";
                                                                     var1.append("耐久:#G");
                                                                     var1.append(var22[1].split(",")[0]);
                                                                  }
                                                               } else if (var22.length > 1) {
                                                                  String var128;
                                                                  if (this.za().gameType == 2) {
                                                                     var128 = "({M]M^<*";
                                                                     var128 = "#cFEFF72";
                                                                  } else {
                                                                     var128 = "')B\fB\f3\u007f";
                                                                     var128 = "#cFFFF75";
                                                                  }

                                                                  var2 = qy(var1, var2, var128);
                                                                  var1.append(var22[0]);
                                                                  String var148 = "8";
                                                                  var1.append(" ");
                                                                  var1.append(pu(var22[1]));
                                                                  var1.append(qb(var22[0]));
                                                                  if (var6 != null && var6 > 0) {
                                                                     var148 = "'\r";
                                                                     var2 = qy(var1, var2, "#G");
                                                                     var10001 = "8";
                                                                     var1.append(" ");
                                                                     var128 = "b";
                                                                     var1.append("(");
                                                                     String var152 = "3";
                                                                     var1.append("+");
                                                                     var10001 = "!d5,";
                                                                     var1.append(
                                                                        String.format("%.1f", BaseEquip.getQHGemXS(var6) / 100.0 * Double.parseDouble(var22[1]))
                                                                     );
                                                                     var128 = "1";
                                                                     var1.append(")");
                                                                  }
                                                               } else if (var4 == 779L) {
                                                                  var1.append(var22[0]);
                                                               }
                                                               continue;
                                                            }
                                                         }

                                                         String var151 = "({M^M^M^";
                                                         var2 = qy(var1, var2, "#cFFFFFF");
                                                         String var126 = "〔恭刯觋汆せ";
                                                         var1.append("【性别要求】");
                                                         if (var22[1].equals("1")) {
                                                            var10001 = "甯";
                                                            var10001 = "男";
                                                         } else if (var22[1].equals("0")) {
                                                            var10001 = "夹";
                                                            var10001 = "女";
                                                         } else {
                                                            var10001 = "兣郰怬刳";
                                                            var10001 = "全部性别";
                                                         }

                                                         var1.append(var10001);
                                                      }
                                                      continue;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }

                                    String var123;
                                    if (this.za().gameType == 2) {
                                       var123 = "({M]M^<*";
                                       var123 = "#cFEFF72";
                                    } else {
                                       var123 = "')B\fB\fB\f";
                                       var123 = "#cFFFFFF";
                                    }

                                    var2 = qy(var1, var2, var123);
                                    var1.append(var22[0]);
                                    var123 = "8";
                                    var1.append(" ");
                                    var1.append(var22[1]);
                                 }
                                 continue;
                              }
                           }
                        }

                        String var142 = "({M^M^M^";
                        var2 = qy(var1, var2, "#cFFFFFF");
                        var10001 = "ず";
                        var1.append("【");
                        var1.append(var22[0]);
                        var142 = "〉";
                        var1.append("】");
                        var1.append(var22[1]);
                        continue;
                     }
                  }

                  String var140 = "({M^M^M^";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  var10001 = "ず";
                  var1.append("【");
                  var1.append(var22[0]);
                  var140 = "〉";
                  var1.append("】");
                  var1.append(var22[1]);
               }
            }
         }
      }
   }

   public String py(String var1, int var2) {
      if (var2 >= 9) {
         String var7 = "夭贎巶迴刴杊髜壉畈f三厥弾卜";
         return "天资已达到最高境界,不可强化";
      } else if (var1 != null && !var1.equals("")) {
         String var10001 = "Wd";
         String[] var3 = var1.split("\\|");
         StringBuffer var4 = new StringBuffer();

         int var5;
         for (int var10000 = var5 = 0; var10000 < var3.length; var10000 = var5) {
            var10001 = "j";
            var4.append(" ");
            var10001 = var3[var5];
            String var10002 = "%";
            String[] var6 = var10001.split("=");
            var4.append(var6[0]);
            String var10003 = "$t9j";
            var4.append(" >= ");
            var5++;
            var4.append(var6[1]);
         }

         String var10 = "+4辵刨覊汚吅号仮绿绦弢匝朑凫玟戛劇";
         var4.append(" ,达到要求后可以继续强化有几率成功");
         return var4.toString();
      } else {
         return "";
      }
   }

   public Class48(GameView var1) {
      super(46, 4, com.xy.q.Class30.afz, var1);
      String var10003 = "kh7o7?!%he\u007f";
      this.yy(0, 0, 0, 0, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/49.png", 6, 6, 6, 6, false), null);
      this.nn = new com.xy.w.Class18();
      this.add(this.nn);
      this.in = new Class120(this, "", com.xy.q.Class49.ad, 490);
      this.add(this.in);
      this.cj = com.xy.v.Class27.j("", com.xy.q.Class49.ac, 490);
      this.add(this.cj);
      this.bj = com.xy.v.Class27.j("", com.xy.q.Class49.cp, 120);
      this.bj.setBounds(5, 135, 120, 120);
      this.add(this.bj);
   }

   public static String na(String var0, String var1) {
      StringBuffer var2 = new StringBuffer();
      int var3 = 0;
      String var10001 = "Wd";
      String[] var4 = var1.split("\\|");
      Map var5 = com.xy.v.Class27.d();

      int var6;
      for (int var10000 = var6 = 0; var10000 < var4.length; var10000 = ++var6) {
         if (var4[var6].startsWith(GoodType.Extras[1])) {
            String var22 = var4[var6];
            var10001 = "l";
            String[] var7;
            var3 = Integer.parseInt((var7 = var22.split("&"))[1]);

            int var8;
            for (int var23 = var8 = 2; var23 < var7.length; var23 = ++var8) {
               String var24 = var7[var8];
               var10001 = "%";
               int var9;
               if ((var9 = var24.indexOf("=")) != -1) {
                  String var10 = var7[var8].substring(0, var9);
                  double var11 = Double.parseDouble(var7[var8].substring(var9 + 1));
                  PropertyUtil.k(var5, var10, var11);
               }
            }

            var4[var6] = null;
            break;
         }
      }

      for (int var25 = var6 = 0; var25 < var4.length; var25 = ++var6) {
         if (var4[var6] != null) {
            String var26 = var4[var6];
            var10001 = "w";
            int var17;
            if ((var17 = var26.indexOf("=")) != -1) {
               String var10003 = "({M^M^M^";
               var0 = qy(var2, var0, "#cFFFFFF");
               if (var2.length() != 0) {
                  var10001 = "'8";
                  var2.append("#r");
               }

               String var19 = var4[var6].substring(0, var17);
               String var20 = var4[var6].substring(var17 + 1);
               var10001 = "筂线";
               if (var19.equals("等级")) {
                  String var10002 = "')B\fB\fB\f";
                  var0 = qy(var2, var0, "#cFFFFFF");
                  var10001 = "〈";
                  var2.append("【");
                  var2.append(var19);
                  var10003 = "せ";
                  var2.append("】");
                  var2.append(var20);
               } else {
                  String var41 = "({O]O]2]";
                  var0 = qy(var2, var0, "#cDEDE9E");
                  var2.append(var19);
                  String var10004 = "j";
                  var2.append(" ");
                  var2.append(pu(var20));
                  var2.append(qb(var19));
                  var41 = "贔敗";
                  if (var19.equals("负敏")) {
                     var10001 = "劤彰逛廬";
                     var10001 = "加强速度";
                  } else {
                     var10003 = "劫弢";
                     var10001 = "加强" + var19;
                  }

                  Double var21;
                  if ((var21 = (Double)var5.get(var10001)) != null) {
                     var10003 = "'\r";
                     var0 = qy(var2, var0, "#G");
                     var10001 = "8";
                     var2.append(" ");
                     var41 = "b";
                     var2.append("(");
                     var10004 = "3";
                     var2.append("+");
                     var10001 = "!d5,";
                     var2.append(String.format("%.1f", var21 / 100.0 * Double.parseDouble(var20)));
                     var41 = "1";
                     var2.append(")");
                  }
               }
            }
         }
      }

      if (var3 > 0) {
         if (var2.length() != 0) {
            var10001 = "'8";
            var2.append("#r");
         }

         String var49 = "({;(NYM^";
         var0 = qy(var2, var0, "#c00EAFF");
         var10001 = "彰匒歫整j";
         var2.append("强化次数 ");
         var2.append(var3);
         Iterator var18 = var5.keySet().iterator();

         for (Iterator var27 = var18; var27.hasNext(); var27 = var18) {
            String var16 = (String)var18.next();
            if (var2.length() != 0) {
               var10001 = "(j";
               var2.append("#r");
            }

            var49 = "')4zA\u000bB\f";
            var0 = qy(var2, var0, "#c00EAFF");
            var2.append(var16);
            String var45 = "8";
            var2.append(" ");
            var2.append(var5.get(var16));
            String var52 = "o";
            var2.append("%");
         }
      }

      com.xy.v.Class27.k(var5);
      return var2.toString();
   }

   public void pz(StringBuffer var1, String var2, long var3) {
      String var5 = null;
      String var10001 = ">";
      String[] var6 = var2.split("&");

      int var7;
      for (int var10000 = var7 = 1; var10000 < var6.length; var10000 = var7) {
         String var9 = var6[var7];
         var10001 = "w";
         String[] var8 = var9.split("=");
         if (var1.length() != 0) {
            var10001 = "(j";
            var1.append("#r");
         }

         String var12;
         if (GoodType.l(var3)) {
            var12 = "')4zA\u000bB\f";
            var12 = "#c00EAFF";
         } else {
            var12 = "({I]2/3.";
            var12 = "#cBE9786";
         }

         var5 = qy(var1, var5, var12);
         var1.append(var8[0]);
         var12 = "j";
         var1.append(" ");
         var1.append(pu(var8[1]));
         var7++;
         var1.append(qb(var8[0]));
      }
   }

   public void ov(Shop var1) {
      String var10001 = "'\u001d";
      this.f();
      this.ae = 1;
      this.nn.gt(com.xy.w.Class15.d(var1.getShopskin()));
      String var10005 = "({M^M^<-";
      this.in.setTextSize("#cFFFF75" + var1.getShopname(), 215);
      String var2 = "#W";
      StringBuffer var3 = new StringBuffer();
      Goodstable var4 = this.yt().ay(var1.getShopiid());
      Goodstable var10000;
      if (var1.getShoptext() != null && !var1.getShoptext().equals("")) {
         var10000 = var4;
         var3.append(var1.getShoptext());
      } else {
         if (var4 != null && var4.getInstruction() != null && !var4.getInstruction().equals("")) {
            var3.append(var4.getInstruction());
         }

         var10000 = var4;
      }

      if (var10000 != null && var4.getType() == 112L) {
         this.rb(var3, var2, var4.getValue(), var4.getType());
      }

      if (var1.getShoptype() >= 5001 && var1.getShoptype() <= 5006) {
         if (var3.length() != 0) {
            var10001 = "(j";
            var3.append("#r");
         }

         String var10003 = "'\u0013";
         var2 = qy(var3, var2, "#Y");
         var10001 = "叉耛仼栤18";
         var3.append("参考价格: ");
         var3.append(var1.getShopprice());
      }

      this.cj.setTextSize(var3.toString(), 215);
      this.cr(false);
   }

   public void qa(Skill var1, double var2, int var4, int var5) {
      this.f();
      this.ae = 2;
      int var6;
      Class48 var10000;
      if ((var6 = Integer.parseInt(var1.getSkillid())) > 12000 && var6 <= 13000) {
         String var9 = SkillUtil.g(var1, var2);
         var10000 = this;
         this.nn.gt(com.xy.w.Class15.i(var6));
         String var11 = "({m m{<(";
         this.in.setTextSize("#cf8fc70" + var1.getSkillname(), 215);
         this.cj.setTextSize(var9, 215);
      } else if (var6 >= 10001 && var6 <= 10008) {
         var10000 = this;
         this.nn.gt(com.xy.w.Class15.g(var1.getSkillid()));
         String var10 = "')brb)3z";
         this.in.setTextSize("#cf8fc70" + var1.getSkillname(), 215);
         this.cj.setTextSize(SkillUtil.f(var1.getRemark(), var1, var2), 215);
      } else {
         String var7;
         if ((var7 = com.xy.a.a.Class9.gb(var6, var1, var2, var4, var5)) == null) {
            return;
         }

         int var8;
         if ((var8 = var7.indexOf(var1.getSkillname())) != -1 && var8 <= 8) {
            var7 = var7.substring(0, var8) + var7.substring(var8 + var1.getSkillname().length());
         }

         var10000 = this;
         this.nn.gt(com.xy.w.Class15.h(var1.getSkillid()));
         String var10005 = "({m m{<(";
         this.in.setTextSize("#cf8fc70" + var1.getSkillname(), 215);
         this.cj.setTextSize(var7, 215);
      }

      var10000.e();
   }

   public void ci(String var1) {
      if (!com.xy.v.Class12.h(var1)) {
         this.f();
         this.cj.setFont(com.xy.q.Class49.n);
         this.cj.setTextSize(var1, 180);
         this.cj.setBounds(7, 7, this.cj.getWidth(), this.cj.getHeight());
         int var2 = 15 + this.cj.getWidth();
         int var3 = 14 + this.cj.getHeight();
         Point var10002 = this.ze().dd(var2, var3);
         this.yv(var10002.x, var10002.y, var2, var3);
         this.zc().b(this.lj());
      }
   }

   public static String qb(String var0) {
      String var10001 = "拝";
      if (var0.indexOf("抗") != -1) {
         var10001 = "抜丑尳虳";
         if (!var0.equals("抗三尸虫")) {
            var10001 = "拝不屲";
            if (!var0.equals("抗三尸")) {
               var10001 = "抏浢焮歨氌";
               if (!var0.equals("抗浩然正气")) {
                  var10001 = "拝隐尻扗爑";
                  if (!var0.equals("抗隔山打牛")) {
                     var10001 = "抏静靺獫牁";
                     if (!var0.equals("抗青面獠牙")) {
                        var10001 = "拝夭鬞觧伙";
                        if (!var0.equals("抗天魔解体")) {
                           var10001 = "抏射楤夗哵";
                           if (!var0.equals("抗小楼夜哭")) {
                              var10001 = "拝刂儃匒弻";
                              if (!var0.equals("抗分光化影")) {
                                 var10001 = "抏毙似";
                                 if (!var0.startsWith("抗毒伤")) {
                                    var10001 = "雅朾拝灱寗传对";
                                    if (!var0.equals("随机抗灵宝伤害")) {
                                       String var4 = "=";
                                       return "%";
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return "";
      } else {
         var10001 = "劤扚";
         if (var0.endsWith("加成")) {
            String var3 = "=";
            return "%";
         } else {
            var10001 = "与嗎苡汾";
            if (!var0.equals("上善若水")) {
               var10001 = "尓埛萶宂";
               if (!var0.equals("尘埃落定")) {
                  var10001 = "灱狊丄烳";
                  if (!var0.equals("灵犀一点")) {
                     var10001 = "匝衘戛碿";
                     if (!var0.equals("化血成碧")) {
                        var10001 = "羊仰进曤";
                        if (!var0.equals("美人迟暮")) {
                           var10001 = "昅珸朂泲";
                           if (!var0.equals("明珠有泪")) {
                              var10001 = "寽斪屚恭盪桍传对";
                              if (!var0.equals("对无属性目标伤害")) {
                                 var10001 = "劫戈攰凣";
                                 if (!var0.equals("加成攻击")) {
                                    var10001 = "弢";
                                    if (var0.indexOf("强") == -1) {
                                       var10001 = "稏廬";
                                       if (var0.indexOf("程度") == -1) {
                                          var10001 = "玟";
                                          if (var0.indexOf("率") == -1) {
                                             var10001 = "狆曾";
                                             if (var0.indexOf("狂暴") == -1) {
                                                var10001 = "呶丵";
                                                if (var0.indexOf("命中") == -1 && var0.indexOf("致命") == -1) {
                                                   var10001 = "忹覌";
                                                   if (var0.indexOf("忽视") == -1) {
                                                      var10001 = "展怿霋汚";
                                                      if (var0.indexOf("属性需求") == -1) {
                                                         return "";
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }

                                    var10001 = "乃尼蘡";
                                    if (var0.indexOf("三尸虫") != -1) {
                                       var10001 = "稀庾";
                                       if (var0.indexOf("程度") != -1) {
                                          String var2 = "o";
                                          return "%";
                                       }

                                       return "";
                                    }

                                    var10001 = "欪敨";
                                    if (var0.indexOf("次数") == -1) {
                                       var10001 = "偶";
                                       if (!var0.endsWith("值")) {
                                          String var1 = "=";
                                          return "%";
                                       }
                                    }

                                    return "";
                                 }
                              }

                              String var10000 = "o";
                              return "%";
                           }
                        }
                     }
                  }
               }
            }

            return "";
         }
      }
   }

   public void qc(StringBuffer var1, String var2) {
      String var10002 = "({M]M^<*";
      String var3 = qy(var1, null, "#cFEFF72");
      int var4 = 0;
      int var5 = 0;
      int var6;
      int var10000 = var6 = 0;

      while (var10000 != var2.length()) {
         String var10001 = "l";
         if ((var6 = var2.indexOf("&", var5 + 1)) == -1) {
            var6 = var2.length();
         }

         if (var4 == 0) {
            var10000 = var6;
         } else {
            BaseGemOld var7;
            GemOld var8;
            if ((var8 = (var7 = new BaseGemOld(var2.substring(var5, var6))).getGemOld(this.yt())) != null) {
               if (var1.length() != 0) {
                  var10001 = "(j";
                  var1.append("#r");
               }

               var1.append(var8.getKey());
               var10002 = "j";
               var1.append(" ");
               var1.append(com.xy.v.Class12.e(var7.getLvl() * var7.getValue() / 100.0 * var8.getValue(), 1));
               var1.append(qb(var8.getKey()));
            }

            var10000 = var6;
         }

         var4++;
         var5 = var10000 + 1;
         var10000 = var6;
      }
   }

   public void qd(StringBuffer var1, String var2) {
      if (var1.length() != 0) {
         String var10001 = "(j";
         var1.append("#r");
      }

      String var10003 = "')4zb,b,";
      String var3 = qy(var1, null, "#c00ffff");
      String var23 = "〛奏裎屆怬〉";
      var1.append("【套装属性】");
      String var10002 = "l";
      String[] var4 = var2.split("&");
      int var5 = 4;

      for (int var10000 = var5; var10000 < var4.length; var10000 = var5) {
         String var18 = var4[var5];
         var23 = "%";
         String[] var6 = var18.split("=");
         if (var1.length() != 0) {
            var23 = "'8";
            var1.append("#r");
         }

         var10003 = "({;(H\\;(";
         var3 = qy(var1, var3, "#c00CD00");
         var1.append(var6[0]);
         var10002 = "j";
         var1.append(" ");
         var1.append(pu(var6[1]));
         var5++;
         var1.append(qb(var6[0]));
      }

      if (var1.length() != 0) {
         var23 = "(j";
         var1.append("#r");
      }

      var10003 = "')4zb,b,";
      var3 = qy(var1, null, "#c00ffff");
      var23 = "〛奏裎哙责\"";
      var1.append("【套装品质:");
      var1.append(var4[3]);
      var10003 = "せ";
      var1.append("】");
      var5 = Integer.parseInt(var4[1]);
      RoleSuitBean var17 = this.yt().bd(var5);
      if (var17 != null) {
         int var7 = this.yx().getRoleProperty().getSuitSum(var4[1]);
         String var19 = var17.getHaveSkill();
         var23 = "Wd";
         String[] var8 = var19.split("\\|");

         int var9;
         for (int var20 = var9 = 0; var20 < var8.length; var20 = ++var9) {
            var19 = var8[var9];
            var23 = "g";
            String[] var10 = var19.split("-");
            int var11 = Integer.parseInt(var10[0]);
            Skill var12;
            if ((var12 = this.yt().ac(var10[1])) != null) {
               if (var1.length() != 0) {
                  var23 = "(j";
                  var1.append("#r");
               }

               StringBuffer var22;
               if (var7 >= var11) {
                  var10003 = "')4zG\u000e4z";
                  var3 = qy(var1, null, "#c00CD00");
                  var1.append("[");
                  var22 = var1;
                  var1.append(var11);
               } else {
                  var22 = var1;
                  String var10004 = "({3(< <.";
                  var3 = qy(var1, null, "#c807876");
                  var1.append("[");
                  var1.append(var7);
               }

               var23 = "e";
               var22.append("/");
               var1.append(var11);
               var1.append("]");
               var1.append(var12.getSkillname());
            }
         }
      }
   }

   public String qe(StringBuffer var1, String var2, long var3) {
      String var5 = null;
      String var6 = null;
      boolean var7 = GoodType.an(var3) || GoodType.w(var3);
      String var10001 = "l";
      String[] var8 = var2.split("&");

      int var9;
      for (int var10000 = var9 = 1; var10000 < var8.length; var10000 = ++var9) {
         String var13 = var8[var9];
         var10001 = "昔阭展怿";
         if (var13.startsWith("星阵属性")) {
            var5 = var8[var9];
         } else {
            String var14 = var8[var9];
            var10001 = "w";
            String[] var10 = var14.split("=");
            if (var1.length() != 0) {
               var10001 = "(j";
               var1.append("#r");
            }

            String var15 = var10[0];
            var10001 = "牽拊";
            if (var15.equals("特技")) {
               String var35 = "({3.3(2(";
               var6 = qy(var1, var6, "#c868090");
               var10001 = "牽拊";
               var1.append("特技");
               int var11 = 1;

               for (int var18 = var11; var18 < var10.length; var18 = ++var11) {
                  Skill var12;
                  if ((var12 = this.yt().ac(var10[var11])) != null) {
                     if (var1.length() != 0) {
                        var10001 = "(j";
                        var1.append("#r");
                     }

                     var1.append(var12.getSkillname());
                     String var33 = "p";
                     var1.append(":");
                     var1.append(var12.getRemark());
                  }
               }
            } else {
               String var16 = var10[0];
               var10001 = "筂线";
               if (var16.endsWith("等级")) {
                  String var10003 = "')4zG\u000e4z";
                  var6 = qy(var1, var6, "#c00CD00");
                  var1.append(var10[0]);
                  String var10002 = "8";
                  var1.append(" ");
                  var1.append(var10[1]);
                  String var10004 = "续";
                  var1.append("级");
               } else {
                  String var17 = var10[0];
                  var10001 = "赏贰";
                  if (var17.equals("资质")) {
                     String var28 = "')B\fB\fB\f";
                     var6 = qy(var1, var6, "#cFFFFFF");
                     var10001 = "〛祆逑〉";
                     var1.append("【神通】");
                     var1.append(var10[0]);
                     String var34 = "j";
                     var1.append(" ");
                     var1.append(var10[1]);
                     String var10005 = "$);(";
                     var1.append("/100");
                  } else {
                     String var30;
                     if (var7) {
                        var30 = "')4zA\u000bB\f";
                        var30 = "#c00EAFF";
                     } else {
                        var30 = "({;(H\\;(";
                        var30 = "#c00CD00";
                     }

                     var6 = qy(var1, var6, var30);
                     var1.append(var10[0]);
                     var30 = "j";
                     var1.append(" ");
                     var1.append(pu(var10[1]));
                     var1.append(qb(var10[0]));
                  }
               }
            }
         }
      }

      return var5;
   }

   public void c() {
      this.cj.setBounds(15, 13, this.cj.getWidth(), this.cj.getHeight());
      int var1 = 30 + this.cj.getWidth();
      int var2 = 26 + this.cj.getHeight();
      Point var10002 = this.ze().dd(var1, var2);
      this.yv(var10002.x, var10002.y, var1, var2);
      this.zc().b(this.lj());
   }

   public boolean nb(String var1) {
      String var10001 = "朵隊";
      if (!var1.equals("朱雀")) {
         var10001 = "静龁";
         if (!var1.equals("青龙")) {
            var10001 = "癹蘄";
            if (!var1.equals("白虎")) {
               var10001 = "玏歾";
               if (!var1.equals("玄武")) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public void e() {
      this.nn.setVisible(true);
      this.in.setBounds(90, 5, this.in.getWidth(), this.in.getHeight());
      this.cj.setBounds(90, 10 + this.in.getHeight(), this.cj.getWidth(), this.cj.getHeight());
      short var1 = 320;
      int var2 = Math.max(120, 20 + this.cj.getHeight() + this.in.getHeight());
      Point var10002 = this.ze().dd(var1, var2);
      this.yv(var10002.x, var10002.y, var1, var2);
      this.zc().b(this.lj());
   }

   public void qf(Baby var1, Talent var2, int var3, boolean var4, String var5, int var6) {
      this.f();
      StringBuffer var7 = new StringBuffer();
      String var10000 = var2.getText();
      String var10001 = "6";
      int var8;
      if ((var8 = var10000.indexOf("|")) == -1) {
         var8 = var2.getText().length();
      }

      String var9 = var4 ? var2.getText().substring(0, var8) : var2.getText().substring(var8 + 1);
      Class48 var28;
      if (var4) {
         Map var10;
         double var11;
         double var13 = var11 = (Double)(var10 = var1.getBabyMap(this.yx())).get(BaseValue.babyTotal3);

         int var15;
         for (int var26 = var15 = 9; var26 <= 10; var26 = ++var15) {
            Double var16;
            if ((var16 = (Double)var10.get(BaseValue.babyKeys[var15])) != null) {
               if (var16 > 400.0) {
                  var16 = 400.0 + (var16 - 400.0) / 6.4;
               }

               var13 += var11 * var16 * 0.002;
            }
         }

         Double var24;
         label104: {
            double var23;
            var24 = (var23 = var13 / 100.0) * var2.getTouch();
            if (var2.getId() > 1000) {
               int var17;
               if (((var17 = (var2.getId() - 1001) / 2) < 6 || var17 > 9) && var17 != 23) {
                  StringBuilder var35 = new StringBuilder(String.valueOf(var2.getTalentName()));
                  String var56 = "叕勢凤珍墚勪";
                  Double var25;
                  if ((var25 = (Double)var10.get(var35.append("发动几率增加").toString())) != null && var25 != 0.0)
                      var24 += var25;

               } else {
                  StringBuilder var34 = new StringBuilder(String.valueOf(var2.getTalentName()));
                  String var10002 = "吳攮伯宫墕劸";
                  Double var18;
                  if ((var18 = (Double)var10.get(var34.append("吸收伤害增加").toString())) != null && var18 != 0.0) {
                     var24 += var18;
                     var10000 = var9;
                     break label104;
                  }
               }
            }

            var10000 = var9;
         }

         var10001 = "p敨倷e";
         var9 = var10000.replace("{数值}", com.xy.v.Class12.e(var24, 2));
         var28 = this;
         String var57 = "'\u001d";
         var7.append("#W");
         var7.append(var2.getTalentName());
         String var10004 = "(j";
         var7.append("#r");
         var7.append(var9);
         String var10006 = "'8";
         var7.append("#r");
         var7.append(this.py(var2.getDemand(), var3));
         com.xy.v.Class27.k(var10);
      } else {
         var10000 = var2.getValue();
         var10001 = "Wd";
         String[] var20;
         if ((var20 = var10000.split("\\|")).length == 2) {
            var10000 = var20[1];
            var10001 = "w";
            var10000 = var10000.split("=")[1];
            var10001 = "W3";
            var20 = var10000.split("\\+");
            var10001 = "\u007f攺倸7";
            double var58 = Double.parseDouble(var20[0]);
            int var61;
            double var10003;
            if (var20.length > 1) {
               var10003 = Double.parseDouble(var20[1]);
               var61 = var3;
            } else {
               var10003 = 0.0;
               var61 = var3;
            }

            var9 = var9.replace("{数值}", com.xy.v.Class12.e(var58 + var10003 * var61, 2));
         }

         var10001 = "(O弱匎";
         var7.append("#W强化");
         var7.append(var2.getTalentName());
         String var60 = "j";
         var7.append(" ");
         var7.append(var3);
         String var10005 = "线(j";
         var7.append("级#r");
         var7.append(var9);
         String var10007 = "'8";
         var7.append("#r");
         if (com.xy.v.Class12.h(var5)) {
            var10001 = "(j(_迓朲莼収绘屘'丕古弢匝歼抋胥样孈";
            var7.append("#r#G还未获取结局,不可强化此技能格子");
            return;
         }

         Class48 var32;
         if (var3 >= 10) {
            var32 = this;
            String var59 = "iC嶸绋迴刴杊髜续刯仌";
            var7.append("#G已经达到最高级别了");
         } else {
            var10001 = "(_古份逑迟炲凣抋胥样孈涃耏琷浞玂涪杮弢匝歼抋胥'朑凫玟戛劇";
            var7.append("#G可以通过点击技能格子消耗琼浆玉液来强化此技能,有几率成功");
            var32 = this;
         }

         BabyResult var22 = var32.yt().av(var5);
         int var12 = 0;
         int var33;
         if (var6 == 0) {
            var33 = var22.getQ1();
         } else if (var6 == 1) {
            var33 = var22.getQ2();
         } else {
            if (var6 == 2) {
               var12 = var22.getQ3();
            }

            var33 = var12;
         }

         switch (var33) {
            case 0:

               var10001 = "'8'\r歠拊胹桶叫彰匒奣赀p三厥弾卜";
               var7.append("#r#G此技能格可强化天资:不可强化");
               var28 = this;
               break;
            case 1:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎佅线亱旗夢赜";
               var7.append("#r#G此技能格可强化天资:可强化低级人族天资");
               var28 = this;
               break;
            case 2:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜佊续魐斅夭贎";
               var7.append("#r#G此技能格可强化天资:可强化低级魔族天资");
               var28 = this;
               break;
            case 3:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎佅线仒旗夢赜";
               var7.append("#r#G此技能格可强化天资:可强化低级仙族天资");
               var28 = this;
               break;
            case 4:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜佊续鬸斅夭贎";
               var7.append("#r#G此技能格可强化天资:可强化低级鬼族天资");
               var28 = this;
               break;
            case 5:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎兣郰佅线夢赜";
               var7.append("#r#G此技能格可强化天资:可强化全部低级天资");
               var28 = this;
               break;
            case 6:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜髜续亾斅夭贎";
               var7.append("#r#G此技能格可强化天资:可强化高级人族天资");
               var28 = this;
               break;
            case 7:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎髓线魟旗夢赜";
               var7.append("#r#G此技能格可强化天资:可强化高级魔族天资");
               var28 = this;
               break;
            case 8:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜髜续仝斅夭贎";
               var7.append("#r#G此技能格可强化天资:可强化高级仙族天资");
               var28 = this;
               break;
            case 9:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎髓线鬷旗夢赜";
               var7.append("#r#G此技能格可强化天资:可强化高级鬼族天资");
               var28 = this;
               break;
            case 10:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜公邢髜续夭贎";
               var7.append("#r#G此技能格可强化天资:可强化全部高级天资");
               var28 = this;
               break;
            case 11:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎兣郰夢赜";
               var7.append("#r#G此技能格可强化天资:可强化全部天资");
            default:
               var28 = this;
         }
      }

      var28.cj.setTextSize(var7.toString(), 255);
      this.c();
   }

   public void qg(StringBuffer var1, String var2, String var3, long var4) {
      if (!com.xy.v.Class12.h(var3)) {
         int var6 = 0;
         int var7 = 0;
         boolean var8 = false;
         boolean var9 = false;
         String var10002 = "(A";
         var2 = qy(var1, var2, "#Y");
         int var10 = 0;
         int var11;
         int var10000 = var11 = 0;

         while (var10000 < var3.length()) {
            String var10001 = "6";
            if ((var11 = var3.indexOf("|", var10 + 1)) == -1) {
               var11 = var3.length();
            }

            label60: {
               var10001 = "%";
               int var12;
               if ((var12 = var3.indexOf("=", var10 + 1)) != -1) {
                  if (var12 > var11) {
                     var10000 = var11;
                     break label60;
                  }

                  String var13;
                  String var23 = var13 = var3.substring(var10, var12);
                  var10001 = "筍续";
                  if (var23.equals("等级")) {
                     var6 = com.xy.v.Class12.ad(var3, var12 + 1, var11);
                     var10000 = var11;
                     break label60;
                  }

                  var10001 = "耛九";
                  if (var13.equals("耐久")) {
                     var7 = com.xy.v.Class12.ad(var3, var12 + 1, var11);
                     var10000 = var11;
                     break label60;
                  }

                  var10001 = "抄肷";
                  if (var13.equals("技能")) {
                     if (!var8) {
                        this.qr(var1, var6, var7);
                        var8 = true;
                     }

                     if (!var9) {
                        String var33 = "({3.3(2(";
                        var2 = qy(var1, var2, "#c868090");
                        var10001 = "'8〔爳抄せ";
                        var1.append("#r【特技】");
                        var9 = true;
                     }

                     var10 = var12 + 1;
                     String var10004 = ";";
                     var12 = var3.indexOf("#", var10 + 1);
                     int var22 = com.xy.v.Class12.ad(var3, var10, var12);
                     int var15 = com.xy.v.Class12.ad(var3, var12 + 1, var11);
                     Skill var17;
                     if ((var17 = this.yt().ac(String.valueOf(var22))) == null) {
                        var10000 = var11;
                     } else {
                        var10001 = "'8";
                        var1.append("#r");
                        var1.append(var17.getSkillname());
                        String var34 = "0";
                        var1.append("(");
                        var1.append(var15);
                        String var35 = "纣c";
                        var1.append("级)");
                        String var10006 = "\"";
                        var1.append(":");
                        String var10007 = SkillUtil.h(var17, var15);
                        String var10008 = "'\u001d";
                        String var10009 = "({3.3(2(";
                        var1.append(var10007.replaceAll("#W", "#c868090"));
                        var10000 = var11;
                     }
                     break label60;
                  }

                  String var14;
                  String var24 = var14 = var3.substring(var12 + 1, var11);
                  String var10003 = "'8";
                  var1.append("#r");
                  var1.append(var13);
                  String var10005 = "8";
                  var1.append(" ");
                  if (var24.charAt(0) != '-') {
                     var10001 = "a";
                     var1.append("+");
                  }

                  var1.append(var14);
                  var1.append(qb(var13));
               }

               var10000 = var11;
            }

            var10 = var10000 + 1;
            var10000 = var11;
         }

         if (!var8) {
            this.qr(var1, var6, var7);
         }
      }
   }

   public String fx(String var1) {
      String var10001 = "朵隊";
      if (var1.equals("朱雀")) {
         String var9 = "瑍疾\"畮徶凄尉兣阇冻淯睪忀抜怿";
         return "瑕疵:略微减少全队冰混睡忘抗性";
      } else {
         var10001 = "靖鿓";
         if (var1.equals("青龙")) {
            String var8 = "瑍疾\"畮徶凄尉兣阇仒泍抜怿";
            return "瑕疵:略微减少全队仙法抗性";
         } else {
            var10001 = "癹蘄";
            if (var1.equals("白虎")) {
               String var7 = "瑍疾\"畮徶凄尉兣阇鬷灳《丑尳虳抜怿";
               return "瑕疵:略微减少全队鬼火、三尸虫抗性";
            } else {
               var10001 = "玀欬";
               if (var1.equals("玄武")) {
                  String var6 = "瑍疾\"畮徶凄尉兣阇霌慉抜怿";
                  return "瑕疵:略微减少全队震慑抗性";
               } else {
                  var10001 = "釕爑";
                  if (var1.equals("金牛")) {
                     String var5 = "朧斡手朑亱牱《叴唯入寲敔斲逸戛皜牢琞伯宫朂丘宑皜劫戈";
                     return "本方所有人物、召唤兽对敌方造成的物理伤害有一定的加成";
                  } else {
                     var10001 = "灯獵";
                     if (var1.equals("火猿")) {
                        String var4 = "苽寲斡灾宅寲朴斲代愄卍但逸戛似宸４抾抏下宂稀庾伯宫０毗9囆吃号甔敐下欹";
                        return "若对方灵宝对本方任意单位造成伤害，抵抗一定程度伤害；每2回合可生效一次";
                     } else {
                        var10001 = "赠騦";
                        if (var1.equals("赤马")) {
                           String var3 = "朧斡手朑亱牱《叴唯入莼徏下宂组骔劫戈";
                           return "本方所有人物、召唤兽获得一定经验加成";
                        } else {
                           var10001 = "黀鸮";
                           if (var1.equals("黄鹤")) {
                              String var2 = "朧斡手朑亱牱墕劸冻淯睪忀抜怿";
                              return "本方所有人物增加冰混睡忘抗性";
                           } else {
                              String var10000 = "木旳扄权亾爣々厦唠儷皀亓泑か鬸瀡々靍慕权丄寐劤扚";
                              return "本方所有人物、召唤兽的仙法、鬼火、震慑有一定加成";
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void qh(StringBuffer var1, String var2, String var3, long var4) {
      if (!com.xy.v.Class12.h(var3)) {
         boolean var6 = false;
         String var10001 = "X6";
         String[] var7 = var3.split("\\|");

         int var8;
         for (int var10000 = var8 = 0; var10000 < var7.length; var10000 = ++var8) {
            String var11 = var7[var8];
            var10001 = "%";
            int var9;
            if ((var9 = var11.indexOf("=")) != -1) {
               String var10;
               String var12 = var10 = var7[var8].substring(0, var9);
               var10001 = "亏亼";
               if (!var12.equals("事件")) {
                  var10001 = "糝构";
                  if (!var10.equals("糖果")) {
                     var10001 = "覅氈";
                     if (var10.endsWith("要求")) {
                        if (var1.length() != 0) {
                           var10001 = "(j";
                           var1.append("#r");
                        }

                        String var10003 = "'\u001d";
                        var2 = qy(var1, var2, "#W");
                        var10001 = "〈";
                        var1.append("【");
                        var1.append(var10);
                        var10003 = "せ";
                        var1.append("】");
                        var1.append(var7[var8].substring(var9 + 1));
                        var10001 = "广龜覊汚";
                        if (var10.equals("年龄要求")) {
                           var10001 = "峋";
                           var1.append("岁");
                        }
                     } else {
                        if (var1.length() != 0) {
                           if (var6) {
                              var10001 = ",";
                           } else {
                              var10001 = "(j";
                              var10001 = "#r";
                           }

                           var1.append(var10001);
                        }

                        var6 = true;
                        String var10002 = "'\u0013";
                        var2 = qy(var1, var2, "#Y");
                        var10001 = "夿诖帙";
                        if (var10.equals("大话币")) {
                           var10001 = "淂耓奭诙幋";
                           var1.append("消耗大话币");
                           var1.append(var7[var8].substring(var9 + 1));
                        } else {
                           var1.append(var10);
                           if (var7[var8].charAt(var9 + 1) != '-') {
                              var10001 = "3";
                              var1.append("+");
                           }

                           var1.append(var7[var8].substring(var9 + 1));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void qi(Baby var1, Talent var2, int var3, boolean var4, String var5, int var6) {
      if (this.za().gameBaby) {
         this.qf(var1, var2, var3, var4, var5, var6);
      } else {
         this.f();
         StringBuffer var7 = new StringBuffer();
         String var10002 = "i]j";
         var7.append("#Y ");
         boolean var10000;
         if (!var4 && var3 != 0) {
            String var10001 = "弱匎";
            var7.append("强化");
            var7.append(var2.getTalentName());
            String var10003 = "j";
            var7.append(" ");
            var7.append(var3);
            String var10005 = "线";
            var7.append("级");
            var10000 = var4;
         } else {
            var7.append(var2.getTalentName());
            var10000 = var4;
         }

         Class48 var11;
         if (var10000) {
            String var9 = var2.getText();
            String var12 = "\u007f覬叕冪玃7";
            StringBuilder var14 = new StringBuilder(String.valueOf(var3 * var2.getTouch()));
            String var16 = "=";
            String var10 = var9.replace("{触发几率}", var14.append("%").toString());
            var12 = "\u007f觋汆7";
            String var8 = var10.replace("{要求}", this.py(var2.getDemand(), var3));
            var11 = this;
            var10002 = "(j(O";
            var7.append("#r#W");
            var7.append(var8);
         } else {
            var11 = this;
            this.qs(var7, var2, var3, var5, var6);
         }

         var11.cj.setTextSize(var7.toString(), 255);
         this.c();
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Class48 var10000;
      label34: {
         super.paintComponent(var1);
         if (this.nn.gu() != null) {
            Image var2 = this.nn.gu();
            if (this.ae == 2) {
               int var3 = Math.min(80, var2.getWidth(null));
               int var4 = Math.min(80, var2.getHeight(null));
               if (this.nn.getWidth() != var3 || this.nn.getHeight() != var4) {
                  var10000 = this;
                  this.nn.setBounds(5 + (80 - var3) / 2, 10 + (80 - var4) / 2, var3, var4);
                  break label34;
               }
            } else {
               int var5 = Math.min(120, var2.getWidth(null));
               int var6 = Math.min(120, var2.getHeight(null));
               if (this.nn.getWidth() != var5 || this.nn.getHeight() != var6) {
                  this.nn.setBounds(5 + (120 - var5) / 2, 10 + (120 - var6) / 2, var5, var6);
               }
            }
         }

         var10000 = this;
      }

      if (var10000._do) {
         var1.drawImage(com.xy.w.Class15.a, this.getWidth() - 49, 0, this);
      }

      if (this.bi) {
         var1.drawImage(com.xy.w.Class15.s, 15, 8, this);
      }
   }

   public void es(String var1, String var2) {
      this.f();
      String var10005 = "')brb)3z";
      this.in.setTextSize("#cf8fc70" + var1, 215);
      this.cj.setTextSize(var2, 215);
      this.h();
   }

   public int qj(int var1, int var2) {
      if (var1 == 3009) {
         return 1;
      } else if (var1 == 3010 || var1 == 3026 || var1 == 3021 || var1 == 3022) {
         return 2;
      } else if (var1 >= 3016 && var1 <= 3019) {
         return var2 > 4 ? 3 : 2;
      } else if (var1 == 3025 || var1 == 3023) {
         return 3;
      } else if (var1 != 3029 && var1 != 3028) {
         return var2;
      } else {
         return var2 > 3 ? 2 : 1;
      }
   }

   public void cr(boolean var1) {
      this.nn.setVisible(true);
      this.in.setBounds(130, 5, this.in.getWidth(), this.in.getHeight());
      this.cj.setBounds(130, 10 + this.in.getHeight(), this.cj.getWidth(), this.cj.getHeight());
      short var2 = 360;
      int var3 = Math.max(140, 20 + this.cj.getHeight() + this.in.getHeight());
      Point var4 = var1 ? this.ze().df(var2, var3) : this.ze().dd(var2, var3);
      this.yv(var4.x, var4.y, var2, var3);
      this.zc().b(this.lj());
   }

   public void qk(StringBuffer var1, String var2, String var3, long var4) {
      if (!com.xy.v.Class12.h(var3)) {
         if (var1.length() != 0) {
            String var10001 = "'8";
            var1.append("#r");
         }

         var1.append(na(var2, var3));
      }
   }

   public void ql(StringBuffer var1, String var2, Goodstable var3) {
      if (!com.xy.v.Class12.h(var3.getValue())) {
         String var4 = var3.getValue();
         String var5 = null;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9;
         int var10000 = var9 = 0;

         while (var10000 < var4.length()) {
            String var10001 = "d";
            if ((var9 = var4.indexOf("|", var8 + 1)) == -1) {
               var9 = var4.length();
            }

            if (var7 == 0) {
               var5 = var4.substring(var8 + 3, var9);
               if (var1.length() != 0) {
                  var10001 = "'8";
                  var1.append("#r");
               }

               String var10003 = "({M^M^M^";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10001 = "〔咋贬せ";
               var1.append("【品质】");
               var2 = qy(var1, var2, GoodType.getQualityColorOx(var5));
               var1.append(var5);
               var10000 = var9;
            } else if (var7 == 1) {
               var6 = com.xy.v.Class12.ad(var4, var8 + 3, var9);
               if (var1.length() != 0) {
                  var10001 = "(j";
                  var1.append("#r");
               }

               String var36 = "')B\fB\fB\f";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10001 = "〛昇纬〉";
               var1.append("【星级】");
               String var10004 = "')B\fB\f4z";
               var2 = qy(var1, var2, "#cFFFF00");
               var1.append(var6);
               var36 = "7:-";
               var1.append("/15");
               var10000 = var9;
            } else if (var7 == 2) {
               int var10 = com.xy.v.Class12.ad(var4, var8 + 3, var9);
               if (var1.length() != 0) {
                  var10001 = "'8";
                  var1.append("#r");
               }

               String var41 = "({M^M^M^";
               var2 = qy(var1, var2, "#cFFFFFF");
               String var10002 = "〔笃纣せ";
               var1.append("【等级】");
               var1.append(BaseValue.getWingLevel(var10));
               if (var1.length() != 0) {
                  var10001 = "(j";
                  var1.append("#r");
               }

               String var38 = "')B\fB\fB\f";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10001 = "〛绗骇〉";
               var1.append("【经验】");
               var1.append(var10);
               var10000 = var9;
            } else if (var7 == 3) {
               if (var1.length() != 0) {
                  var10001 = "'8";
                  var1.append("#r");
               }

               String var39 = "({M^M^M^";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10001 = "〔飖艶せ";
               var1.append("【颜色】");
               var1.append(var4.substring(var8 + 3, var9));
               var10000 = var9;
            } else {
               label79: {
                  String var17;
                  String var19 = var17 = var4.substring(var8, var9);
                  var10001 = "劐釗";
                  if (!var19.startsWith("力量")) {
                     var10001 = "灱恭";
                     if (!var17.startsWith("灵性")) {
                        var10001 = "栲骰";
                        if (!var17.startsWith("根骨")) {
                           var10001 = "敋挽";
                           if (!var17.startsWith("敏捷")) {
                              if (var17.startsWith(GoodType.Extras[0])) {
                                 this.qe(var1, var17, 8888L);
                              }

                              var10000 = var9;
                              break label79;
                           }
                        }
                     }
                  }

                  var10001 = "%";
                  String[] var11 = var17.split("=");
                  if (var1.length() != 0) {
                     var10001 = "'8";
                     var1.append("#r");
                  }

                  String var40 = "({H\\HY=\\";
                  var2 = qy(var1, var2, "#cCDCA6D");
                  var1.append(var11[0]);
                  String var35 = "j";
                  var1.append(" ");
                  var1.append(BaseValue.getUpStarData(var11[1], var6, var5));
                  String var10006 = "({M^M^M^";
                  var2 = qy(var1, var2, "#cFFFFFF");
                  String var42 = "b";
                  var1.append("(");
                  var1.append(var11[1]);
                  var10006 = "1";
                  var1.append(")");
                  var10000 = var9;
               }
            }

            var7++;
            var8 = var10000 + 1;
            var10000 = var9;
         }
      }
   }

   public void qm(StringBuffer var1, String var2) {
      String var10001 = ">";
      String[] var3 = var2.split("&");
      double var4 = 1.0;
      int var6;
      int var7 = (var6 = Integer.parseInt(var3[1])) >> 5 & 31;
      int var8 = var6 & 31;
      StringBuffer var9 = null;

      int var10;
      for (int var10000 = var10 = 4; var10000 < var3.length; var10000 = ++var10) {
         String var21 = var3[var10];
         var10001 = "爳抄w";
         Skill var11;
         if (var21.startsWith("特技=") && (var11 = this.yt().ac(var3[var10].substring(3))) != null) {
            int var12;
            StringBuffer var22;
            if ((var12 = Integer.parseInt(var11.getSkillid())) == 8121) {
               var4 += 0.15;
               var22 = var9;
            } else {
               if (var12 == 8122) {
                  var4 += 0.25;
               }

               var22 = var9;
            }

            if (var22 == null) {
               String var10002 = "牲折";
               var9 = new StringBuffer("特技");
            }

            var10001 = "'8";
            var9.append("#r");
            var9.append(var11.getSkillname());
         }
      }

      String var35 = "({I\\<^8^";
      String var16 = qy(var1, null, "#cBD7F3F");

      int var18;
      for (int var23 = var18 = 2; var23 < 4 && var18 < var3.length; var23 = ++var18) {
         String var24 = var3[var18];
         var10001 = "爳抄w";
         if (!var24.startsWith("特技=")) {
            String var25 = var3[var18];
            var10001 = "%";
            int var19;
            if ((var19 = var25.indexOf("=")) != -1) {
               String var13 = var3[var18].substring(0, var19);
               var10001 = var3[var18];
               var35 = "i";
               var19 = var10001.indexOf("#", var13.length() + 1);
               double var14 = QualityZW.getDouble(var3[var18].substring(var13.length() + 1, var19)) * (var18 == 2 ? var7 : var8)
                  + QualityZW.getDouble(var3[var18].substring(var19 + 1));
               if (var4 != 1.0) {
                  var14 *= var4;
               }

               if (var1.length() != 0) {
                  var10001 = "(j";
                  var1.append("#r");
               }

               var1.append(var13);
               var35 = "j";
               var1.append(" ");
               var1.append(com.xy.v.Class12.e(var14, 1));
               var1.append(qb(var13));
            }
         }
      }

      if (var1.length() != 0) {
         var10001 = "(j";
         var1.append("#r");
      }

      var10001 = "恱炽糳倸p";
      var1.append("总点粹值:");
      var1.append(var7 + var8);
      if (var9 != null) {
         if (var1.length() != 0) {
            var10001 = "(j";
            var1.append("#r");
         }

         String var10003 = "')<|<z=z";
         String var17 = qy(var1, null, "#c868090");
         var1.append(var9);
      }
   }

   public void qn(StarSoul var1, long var2) {
      this.f();
      this.ae = 2;
      int var4 = var1.getId() <= 10000 ? 120 : 280;
      StringBuffer var5;
      StringBuffer var10000 = var5 = new StringBuffer();
      String var10001 = "')brb)3z";
      var10000.append("#cf8fc70");
      var5.append(var1.getName());
      String var10004 = "(j";
      var5.append("#r");
      Class48 var11;
      if (var1.getId() <= 10000) {
         var11 = this;
         String var10002 = "iS聚乁p";
         var5.append("#W耐久:");
         var5.append(var2);
         var10004 = "73(;((j炲凣衮兝耛九";
         var5.append("/8000#r点击补充耐久");
      } else {
         com.xy.v.Class8 var6 = this.yt();
         var10001 = "'\u001d濄浱扄靊')brb)3z";
         var5.append("#W激活所需#cf8fc70");
         var10001 = var1.getValue();
         String var15 = "Wd";
         String[] var7 = var10001.split("\\|");
         int var8 = 0;

         for (int var12 = var8; var12 < var7.length; var12 = var8) {
            StarSoul var9 = var6.p(Integer.parseInt(var7[var8]));
            if (var8 != 0) {
               var5.append(",");
            }

            var8++;
            var5.append(var9.getName());
         }

         Skill var10 = var6.ac(String.valueOf(var1.getLvl()));
         var11 = this;
         var15 = "'8'\u001d濄浱吊菽従拊胹g')brb)3z";
         var5.append("#r#W激活后获得技能-#cf8fc70");
         var5.append(var10.getSkillname());
      }

      var11.cj.setTextSize(var5.toString(), var4);
      this.c();
   }

   public void qo(RoleTxBean var1) {
      this.f();
      String var10007 = "p2";
      this.nn.gt(com.xy.w.Class15.d("tx" + var1.getRdId()));
      String var10006 = "({M^M^<-";
      this.in.setTextSize("#cFFFF75" + var1.getRdName(), 215);
      this.cj.setTextSize(var1.getRdAsk(), 215);
      this.cr(false);
   }

   public void qp(String var1, int var2, Lingbao var3) {
      this.f();
      Skill var4 = this.yt().bq(var1);
      StringBuffer var5 = new StringBuffer();
      String var10002 = "(O";
      var5.append("#W");
      var5.append(var1);
      String var10004 = "'8'\u0013〔纎同拊胹せ>j";
      var5.append("#r#Y【组合技能】: ");
      var5.append(var2);
      String var10006 = "亢吃折(j(A〛络吃籣垀〉18";
      var5.append("人合技#r#Y【组合类型】: ");
      Skill var10000;
      if (var4.getSkilltype().equals("0")) {
         var10000 = var4;
         var10002 = "敱凿簱";
         var5.append("攻击类");
      } else if (var4.getSkilltype().equals("1")) {
         var10000 = var4;
         var10002 = "辝劢籣";
         var5.append("辅助类");
      } else {
         String var10001 = "葷宙簱";
         var5.append("落宝类");
         var10000 = var4;
      }

      String var22 = var10000.getRemark();
      String var33 = "Wd";
      String[] var6 = var22.split("\\|");
      int var7 = Integer.parseInt(var4.getSkillid());

      int var8;
      for (int var23 = var8 = 0; var23 < var6.length; var23 = ++var8) {
         String var24 = var6[var8];
         var33 = "皤栃攺";
         if (var24.equals("目标数")) {
            var33 = ";y;R〈盥栟敻〉18";
            var5.append("#r#Y【目标数】: ");
            var5.append(this.pq(var7, var2));
         } else {
            String var25 = var6[var8];
            var33 = "捋绩嚔同攺";
            if (var25.equals("持续回合数")) {
               var33 = ";y;R〈挊绵囕吐敻〉18";
               var5.append("#r#Y【持续回合数】: ");
               var5.append(this.qj(var7, var2));
            } else if (this.za().gameBattle && var7 >= 3001 && var7 <= 3023) {
               int var9;
               label101: {
                  var9 = var3 != null ? var3.getLingbaolvl().intValue() : 0;
                  if (var3 != null) {
                     int var10;
                     if ((var10 = BaseValue.getQv(var3.getBaoquality())) == 50) {
                        var9 = (int)(var9 * 2.5);
                        var10000 = var4;
                        break label101;
                     }

                     if (var10 == 40) {
                        var9 = (int)(var9 * 1.7);
                        var10000 = var4;
                        break label101;
                     }

                     if (var10 == 30) {
                        var9 = (int)(var9 * 1.3);
                        var10000 = var4;
                        break label101;
                     }

                     if (var10 == 20) {
                        var9 = (int)(var9 * 1.1);
                     }
                  }

                  var10000 = var4;
               }

               double var14;
               Lingbao var27;
               label123: {
                  double var19 = Double.parseDouble(var10000.getValue());
                  double var12 = Double.parseDouble(var4.getGrow());
                  var14 = var19 + var12 * var9;
                  if (var7 == 3011 || var7 == 3012) {
                     if (var2 == 5) {
                        var14 *= 3.84;
                        var27 = var3;
                        break label123;
                     }

                     if (var2 == 4) {
                        var14 *= 2.74;


                        var27 = var3;
                        break label123;
                     }

                     if (var2 == 3) {
                        var14 *= 1.96;
                        var27 = var3;
                        break label123;
                     }

                     if (var2 == 2) {
                        var14 *= 1.4;
                     }
                  }

                  var27 = var3;
               }

               if (var27 != null) {
                  Map var16 = PropertyUtil.getBaoMap(var3, this.yx());
                  String var28 = var3.getBaotype();
                  var33 = "政冱";
                  Double var29;
                  if (var28.equals("攻击")) {
                     var33 = "伯宫";
                     var29 = (Double)var16.get("伤害");
                  } else {
                     String var30 = var3.getBaotype();
                     var33 = "辁勣";
                     if (var30.equals("辅助")) {
                        var33 = "囕夕";
                        var29 = (Double)var16.get("回复");
                     } else {
                        var33 = "萹寗";
                        var29 = (Double)var16.get("落宝");
                     }
                  }

                  double var17 = var29;
                  var14 *= 1.0 + var17;
                  com.xy.v.Class27.k(var16);
               }

               Object var20 = null;
               StringBuffer var32;
               if (var7 == 3003 || var7 == 3004) {
                  var10002 = ":5";
                  var20 = "1-" + com.xy.v.Class12.e(var14, 0);
                  var32 = var5;
               } else if (var7 == 3002) {
                  StringBuilder var31 = new StringBuilder(String.valueOf(com.xy.v.Class12.e(var14 / 1000.0, 0)));
                  var33 = "g";
                  var20 = var31.append("-").append(com.xy.v.Class12.e(var14, 0)).toString();
                  var32 = var5;
               } else {
                  var20 = com.xy.v.Class12.e(var14, 0);
                  var32 = var5;
               }

               var33 = "(j(O";
               var32.append("#r#W");
               var10002 = var6[var8];
               String var10003 = "\u007f攺倸7";
               var5.append(var10002.replace("{数值}", (CharSequence)var20));
            } else {
               var33 = "(j(O";
               var5.append("#r#W");
               var5.append(var6[var8]);
            }
         }
      }

      this.cj.setTextSize(var5.toString(), 215);
      this.c();
   }

   public void qq(int var1, Skill var2, int var3) {
      this.f();
      this.ae = 2;
      Class48 var10000;
      if (var1 == 0) {
         StringBuffer var4 = new StringBuffer();
         String var10003 = "({m m{<(秓折";
         StringBuilder var10001 = new StringBuilder("#cf8fc70秘技");
         String var9;
         if (var3 == 0) {
            var9 = "iVb朮澊洿c";
            var9 = "#R(未激活)";
         } else if (var3 == 1) {
            var9 = "0古濘洰1";
            var9 = "(可激活)";
         } else {
            var9 = "iCb巶澊洿c";
            var9 = "#G(已激活)";
         }

         var4.append(var10001.append(var9).toString());
         var9 = "(j({m m{<(";
         var4.append("#r#cf8fc70");
         var4.append(var2.getSkillname());
         String var10004 = "p'\r";
         var4.append(":#G");
         var4.append(var2.getRemark());
         this.cj.setTextSize(var4.toString(), 310);
         var10000 = this;
      } else {
         StringBuffer var5;
         StringBuffer var6 = var5 = new StringBuffer();
         String var15 = "({m m{<(";
         StringBuilder var7 = new StringBuilder("#cf8fc70").append(var2.getSkillname());
         String var13 = "b";
         var7 = var7.append("(").append(var3);
         var13 = "731";
         var6.append(var7.append("/8)").toString());
         String var16 = "'8'\r";
         var5.append("#r#G" + var2.getRemark());
         var10000 = this;
         this.cj.setTextSize(var5.toString(), 310);
      }

      var10000.c();
   }

   public void qr(StringBuffer var1, int var2, int var3) {
      String var10001 = ";y耈乎8";
      var1.append("#r耐久 ");
      var1.append(var3);
      String var10003 = "+{4z4iv镱炸笃纣j";
      var1.append("/1000#r锻炼等级 ");
      var1.append(var2);
      String var10005 = "线";
      var1.append("级");
   }

   public void qs(StringBuffer var1, Talent var2, int var3, String var4, int var5) {
      String var10000 = var2.getValue();
      String var10001 = "X6";
      String[] var6;
      if ((var6 = var10000.split("\\|")).length == 2) {
         var10000 = var6[1];
         var10001 = "%";
         var6 = var10000.split("=");
         var10001 = "'8";
         var1.append("#r");
         String var10002 = "8(O叚劰";
         var1.append(" #W发动");
         var1.append(var2.getTalentName());
         String var10004 = "於墚勪";
         var1.append("时增加");
         var1.append(var6[0]);
         String var10005 = var6[1];
         String var10006 = "W3";
         var6 = var10005.split("\\+");
         var1.append(Double.parseDouble(var6[0]) + Double.parseDouble(var6[1]) * var3);
      }

      var10001 = "'8";
      var1.append("#r");
      if (var3 >= 10) {
         var10000 = var4;
         String var31 = ";L巪组辦刻朘髓线删亞";
         var1.append("#G已经达到最高级别了");
      } else {
         if (var3 >= 10) {
            var10001 = "'\r叫亯逞辍炽冱抄肷核嬚涌聝琸洌玍淸条彰匒欮抄肷(权凤珍戔動";
            var1.append("#G可以通过点击技能格子消耗琼浆玉液来强化此技能,有几率成功");
         }

         var10000 = var4;
      }

      if (com.xy.v.Class12.h(var10000)) {
         var10001 = "(j(_迓朲莼収绘屘'丕古弢匝歼抋胥样孈";
         var1.append("#r#G还未获取结局,不可强化此技能格子");
      } else {
         BabyResult var7 = this.yt().av(var4);
         int var8 = 0;
         int var13;
         if (var5 == 0) {
            var13 = var7.getQ1();
         } else if (var5 == 1) {
            var13 = var7.getQ2();
         } else {
            if (var5 == 2) {
               var8 = var7.getQ3();
            }

            var13 = var8;
         }

         switch (var13) {
            case 0:

               var10001 = "'8'\r歠拊胹桶叫彰匒奣赀p三厥弾卜";
               var1.append("#r#G此技能格可强化天资:不可强化");
               return;
            case 1:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎佅线亱旗夢赜";
               var1.append("#r#G此技能格可强化天资:可强化低级人族天资");
               return;
            case 2:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜佊续魐斅夭贎";
               var1.append("#r#G此技能格可强化天资:可强化低级魔族天资");
               return;
            case 3:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎佅线仒旗夢赜";
               var1.append("#r#G此技能格可强化天资:可强化低级仙族天资");
               return;
            case 4:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜佊续鬸斅夭贎";
               var1.append("#r#G此技能格可强化天资:可强化低级鬼族天资");
               return;
            case 5:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎兣郰佅线夢赜";
               var1.append("#r#G此技能格可强化天资:可强化全部低级天资");
               return;
            case 6:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜髜续亾斅夭贎";
               var1.append("#r#G此技能格可强化天资:可强化高级人族天资");
               return;
            case 7:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎髓线魟旗夢赜";
               var1.append("#r#G此技能格可强化天资:可强化高级魔族天资");
               return;
            case 8:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜髜续仝斅夭贎";
               var1.append("#r#G此技能格可强化天资:可强化高级仙族天资");
               return;
            case 9:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎髓线鬷旗夢赜";
               var1.append("#r#G此技能格可强化天资:可强化高级鬼族天资");
               return;
            case 10:
               var10001 = "iviC欮抄肷核厥弾卜夭贎>厥弾卜公邢髜续夭贎";
               var1.append("#r#G此技能格可强化天资:可强化全部高级天资");
               return;
            case 11:
               var10001 = ";y;L歼抋胥样号弱匎夢赜1号弱匎兣郰夢赜";
               var1.append("#r#G此技能格可强化天资:可强化全部天资");
         }
      }
   }

   public int qt(int var1) {
      return var1 <= 3 ? var1 : (var1 << 1) - 3;
   }

   public void f() {
      this.ae = 0;
      this.in.clear();
      this.cj.clear();
      this.bj.clear();
      this.cj.setFont(com.xy.q.Class49.ac);
      this.nn.l();
      this._do = false;
      this.bi = false;
      this.nn.setVisible(false);
   }

   public void qu(StringBuffer var1, String var2, String var3, long var4) {
      if (var3 != null && !var3.equals("")) {
         BaseGemOld var6;
         GemOld var7;
         if ((var7 = (var6 = new BaseGemOld(var3)).getGemOld(this.yt())) != null) {
            String var10003 = "(A";
            var2 = qy(var1, var2, "#Y");
            String var10004 = "笃纣j";
            var1.append("等级 " + var6.getLvl());
            if (var1.length() != 0) {
               String var10001 = "(j";
               var1.append("#r");
            }

            var1.append(var7.getKey());
            var10003 = "j";
            var1.append(" ");
            var1.append(com.xy.v.Class12.e(var6.getLvl() * var6.getValue() / 100.0 * var7.getValue(), 1));
            var1.append(qb(var7.getKey()));
            if (var1.length() != 0) {
               String var10 = "(j";
               var1.append("#r");
            }

            var10004 = "亽倸j";
            var1.append("价值 " + var6.getValue());
            if (var1.length() != 0) {
               String var11 = "(j";
               var1.append("#r");
            }

            String var12 = "锼嵈邢佉p";
            var1.append("镶嵌部位:");
            int var8 = 0;

            for (int var10000 = var8; var10000 < var7.getParts().length; var10000 = var8) {
               if (var8 != 0) {
                  var12 = "〙";
                  var1.append("、");
               }

               var1.append(GoodType.ar(var7.getParts()[var8++]));
            }
         }
      }
   }

   public void h() {
      this.in.setBounds(15, 5, this.in.getWidth(), this.in.getHeight());
      this.cj.setBounds(15, 36, this.cj.getWidth(), this.cj.getHeight());
      int var1 = 30 + this.cj.getWidth();
      int var2 = 26 + this.cj.getHeight() + this.in.getHeight();
      Point var10002 = this.ze().dd(var1, var2);
      this.yv(var10002.x, var10002.y, var1, var2);
      this.zc().b(this.lj());
   }

   public void qv(StringBuffer var1, String var2) {
      RoleData var3 = this.yx();
      if (var1.length() != 0) {
         String var10001 = "(j";
         var1.append("#r");
      }

      String var10003 = "')4zb,b,";
      String var4 = qy(var1, null, "#c00ffff");
      String var11 = "〛宅矸镮嵇〉";
      var1.append("【宝石镶嵌】");
      String var10002 = "l";
      String[] var5 = var2.split("&");
      int var6 = 1;

      for (int var10000 = var6; var10000 < var5.length; var10000 = ++var6) {
         Goodstable var7;
         if ((var7 = var3.getGoodEquip(new BigDecimal(var5[var6]))) != null) {
            if (var1.length() != 0) {
               var11 = "(j";
               var1.append("#r");
            }

            var10003 = "')A\u000b1}4z";
            var4 = qy(var1, null, "#cEA5700");
            var1.append(var7.getGoodsname());
            var11 = var7.getValue();
            var10002 = "Wd";
            String[] var8 = var11.split("\\|");
            var10002 = "j";
            var1.append(" ");
            var10003 = var8[0];
            String var10004 = "%";
            var1.append(var10003.split("=")[1]);
            var10004 = "纣j";
            var1.append("级 ");
            var10004 = var8[1];
            String var10005 = "%";
            var8 = var10004.split("=");
            var1.append(var8[0]);
            String var10006 = "j";
            var1.append(" ");
            var1.append(pu(var8[1]) + qb(var8[1]));
         }
      }
   }

   public void qw(Eshop var1) {
      String var10001 = "(O";
      this.f();
      this.ae = 1;
      this.nn.gt(com.xy.w.Class15.d(var1.getEshopskin()));
      String var10005 = "')B\fB\f3\u007f";
      this.in.setTextSize("#cFFFF75" + var1.getEshopname(), 215);
      String var2 = "#W";
      StringBuffer var3 = new StringBuffer();
      Goodstable var4 = this.yt().ay(new BigDecimal(var1.getEshopiid()));
      Goodstable var10000;
      if (var1.getEshoptext() != null && !var1.getEshoptext().equals("")) {
         var10000 = var4;
         var3.append(var1.getEshoptext());
      } else {
         if (var4 != null && var4.getInstruction() != null && !var4.getInstruction().equals("")) {
            var3.append(var4.getInstruction());
         }

         var10000 = var4;
      }

      if (var10000 != null && var4.getType() == 112L) {
         this.rb(var3, var2, var4.getValue(), var4.getType());
      }

      this.cj.setTextSize(var3.toString(), 215);
      this.cr(false);
   }

   public void qx(PayvipBean var1) {
      this.f();
      this.ae = 1;
      String var10005 = "\u0019";
      this.nn.gt(com.xy.w.Class15.d("S" + var1.getGrade()));
      RichLabel var10001 = this.in;
      String var10004 = ";h^M^M/>N";
      StringBuilder var10002 = new StringBuilder("#cFFFF75V").append(var1.getGrade());
      String var10003 = "伞吒奒勻";
      var10001.setTextSize(var10002.append("会员奖励").toString(), 215);
      this.cj.setTextSize(var1.getInstructiontext() != null ? var1.getInstructiontext() : "", 215);
      this.cr(false);
   }

   public static String qy(StringBuffer var0, String var1, String var2) {
      if (com.xy.v.Class12.am(var1, var2)) {
         return var1;
      } else {
         var0.append(var2);
         return var2;
      }
   }

   public void hr(Goodstable var1, boolean var2) {
      this.f();
      this.ae = 1;
      this.nn.gt(com.xy.w.Class15.d(var1.getSkin()));
      this._do = GoodType.o(var1.getQuality());
      this.bi = var1.getGoodlock() == 1;
      RichLabel var10000 = this.bj;
      String var10001;
      if (var1.getAuthor() != null) {
         String var10003 = "'\u0018刲伖亾p";
         var10001 = "#R制作人:" + var1.getAuthor();
      } else {
         var10001 = "";
      }

      var10000.setText(var10001);
      if (var1.getQht() != null && var1.getQht() > 0) {
         StringBuffer var3;
         StringBuffer var8 = var3 = new StringBuffer();
         var10001 = "({M^M^<-";
         var8.append("#cFFFF75");
         var3.append(var1.getGoodsname());
         String var17 = "'8";
         var3.append("#r");
         int var4 = 1;

         for (int var9 = var4; var9 < var1.getQht(); var9 = ++var4) {
            if (var1.getQhv() != null && var4 <= var1.getQhv()) {
               var10001 = "'r<{";
               var3.append("#881");
            } else {
               var10001 = "( 3(";
               var3.append("#880");
            }
         }

         this.in.setTextSize(var3.toString(), 215);
      } else {
         String var16 = "({M^M^<-";
         this.in.setTextSize("#cFFFF75" + var1.getGoodsname(), 215);
      }

      String var10 = "'\u001d";
      String var6 = "#W";
      StringBuffer var7 = new StringBuffer();
      Goodstable var5;
      Goodstable var11;
      if ((var5 = this.yt().ay(var1.getGoodsid())) == null && !com.xy.v.Class12.h(var1.getInstruction())) {
         var11 = var1;
         var7.append(var1.getInstruction());
      } else {
         if (var5 != null && !com.xy.v.Class12.h(var5.getInstruction())) {
            var7.append(var5.getInstruction());
         }

         var11 = var1;
      }

      Class48 var12;
      label96: {
         if (!GoodType.ac(var11.getType())) {
            if (var1.getType() == 520L) {
               var12 = this;
               this.pm(var7, var6, var1);
               break label96;
            }

            if (var1.getType() == 8888L) {
               var12 = this;
               this.ql(var7, var6, var1);
               break label96;
            }

            if (GoodType.ag(var1.getType())) {
               var12 = this;
               this.pn(var7, var6, var1);
               break label96;
            }

            if (GoodType.x(var1.getType())) {
               var12 = this;
               this.qz(var7, var6, var1);
               break label96;
            }

            if (var1.getType() == 779L || GoodType.r(var1.getType()) != -1) {
               var12 = this;
               this.px(var7, var6, var1.getValue(), var1.getType(), var1.getQhv());
               break label96;
            }

            if (var1.getType() == 188L) {
               var12 = this;
               this.qk(var7, var6, var1.getValue(), var1.getType());
               break label96;
            }

            if (var1.getType() == 133L || var1.getType() == 134L) {
               var12 = this;
               this.qh(var7, var6, var1.getValue(), var1.getType());
               break label96;
            }

            if (var1.getType() == 114L) {
               var12 = this;
               this.ra(var7, var6, var1.getValue(), var1.getType());
               break label96;
            }

            if (var1.getType() == 700L) {
               var12 = this;
               this.qu(var7, var6, var1.getValue(), var1.getType());
               break label96;
            }

            if (var1.getType() == 139L) {
               var12 = this;
               this.rc(var7, var6, var1.getValue(), var1.getType());
               break label96;
            }

            if (var1.getType() == 108L) {
               this.qg(var7, var6, var1.getValue(), var1.getType());
               var12 = this;
               break label96;
            }

            this.rb(var7, var6, var1.getValue(), var1.getType());
         }

         var12 = this;
      }

      var12.cj.setTextSize(var7.toString(), 215);
      this.cr(var2);
   }

   public void qz(StringBuffer var1, String var2, Goodstable var3) {
      if (!com.xy.v.Class12.h(var3.getValue())) {
         String var10000 = var3.getValue();
         String var10001 = "Wd";
         String[] var5 = var10000.split("\\|");
         int var6 = 0;
         if (var1.length() != 0) {
            var10001 = "'8";
            var1.append("#r");
         }

         String var10004 = "({M^M^M^";
         var2 = qy(var1, var2, "#cFFFFFF");
         String var10002 = "ず筍续〕j";
         var1.append("【等级】 ");
         String var10003 = var5[var6];
         var6++;
         var1.append(var10003.substring(3));
         if (var1.length() != 0) {
            var10001 = "(j";
            var1.append("#r");
         }

         var10003 = "')B\fB\fB\f";
         var2 = qy(var1, var2, "#cFFFFFF");
         var10001 = "〈筂线覊汚〚8";
         var1.append("【等级要求】 ");
         var10002 = var5[var6];
         var6++;
         var1.append(var10002.substring(5));
         var10000 = var5[var6];
         var10001 = "怣剡";
         if (var10000.startsWith("性别")) {
            if (var1.length() != 0) {
               var10001 = "(j";
               var1.append("#r");
            }

            var10004 = "')5\u000f=zB\f";
            var2 = qy(var1, var2, "#c1E90FF");
            var10002 = "〈怬刳覊汚〚8";
            var1.append("【性别要求】 ");
            String var7 = var5[var6].substring(5);
            if (var7.equals("1")) {
               var10001 = "畽";
               var10001 = "男";
            } else if (var7.equals("0")) {
               var10001 = "奫";
               var10001 = "女";
            } else {
               var10001 = "公邢怣剡";
               var10001 = "全部性别";
            }

            var1.append(var10001);
            var6++;
         }

         if (var1.length() != 0) {
            var10001 = "(j";
            var1.append("#r");
         }

         var10003 = "')5\u000f=zB\f";
         var2 = qy(var1, var2, "#c1E90FF");
         var10001 = "〈哊贰〚8";
         var1.append("【品质】 ");
         var10002 = var5[var6];
         var6++;
         var1.append(var10002.substring(3));
         int var18 = var6;

         StringBuffer var21;
         while (true) {
            if (var18 >= var5.length) {
               var21 = var1;
               break;
            }

            var10000 = var5[var6];
            var10001 = "夛同廬";
            if (var10000.startsWith("契合度")) {
               var21 = var1;
               break;
            }

            if (var1.length() != 0) {
               var10001 = "(j";
               var1.append("#r");
            }

            var10000 = var5[var6];
            var10001 = "w";
            String[] var15 = var10000.split("=");
            var10003 = "({O]O]2]";
            var2 = qy(var1, var2, "#cDEDE9E");
            var1.append(var15[0]);
            var1.append(pu(var15[1]));
            var6++;
            var1.append(qb(var15[0]));
            var18 = var6;
         }

         if (var21.length() != 0) {
            var10001 = "'8";
            var1.append("#r");
         }

         var10003 = "({O]O]2]";
         var2 = qy(var1, var2, "#cDEDE9E");
         var10001 = "奕呂庢j";
         var1.append("契合度 ");
         var1.append(var5[var6].substring(4));
         int var16 = var6 + 1;

         for (int var22 = var16; var22 < var5.length; var22 = var16) {
            var10002 = var5[var16];
            var16++;
            this.qe(var1, var10002, var3.getType());
         }
      }
   }

   public void ra(StringBuffer var1, String var2, String var3, long var4) {
      if (var3 != null && !var3.equals("")) {
         String var10001 = "d";
         int var6;
         if ((var6 = var3.indexOf("|")) != -1) {
            int var7 = Integer.parseInt(var3.substring(3, var6));
            String var8 = var3.substring(var6 + 4);
            Skill var9;
            if ((var9 = this.yt().ac(var8)) != null) {
               String var10003 = "'\r";
               var2 = qy(var1, var2, "#G");
               if (var7 == 2) {
                  var10001 = "彘剕灾阮丱,u!纬旮古田";
                  var10001 = "当前灵阶为4~9级时可用";
               } else {
                  var10001 = "彗切灱陼举zz~纣於叫畢";
                  var10001 = "当前灵阶为0~4级时可用";
               }

               var1.append(var10001);
               var10003 = "(J";
               var2 = qy(var1, var2, "#R");
               String var10004 = "拊胹p";
               var1.append("技能:" + var9.getSkillname());
            }
         }
      }
   }

   public int ky(int var1) {
      return (var1 << 1) - 1;
   }

   public void rb(StringBuffer var1, String var2, String var3, long var4) {
      if (var3 != null && !var3.equals("")) {
         String var10001 = "Wd";
         String[] var6 = var3.split("\\|");
         String var7 = null;

         int var8;
         for (int var10000 = var8 = 0; var10000 < var6.length; var10000 = ++var8) {
            if (var6[var8].startsWith(GoodType.Extras[0])) {
               var7 = this.qe(var1, var6[var8], var4);
            } else if (var6[var8].startsWith(GoodType.Extras[1])) {
               this.pw(var1, var6[var8]);
            } else if (var6[var8].startsWith(GoodType.Extras[2])) {
               this.pz(var1, var6[var8], var4);
            } else if (var6[var8].startsWith(GoodType.Extras[3])) {
               this.qd(var1, var6[var8]);
            } else if (var6[var8].startsWith(GoodType.Extras[4])) {
               this.qv(var1, var6[var8]);
            } else if (var6[var8].startsWith(GoodType.Extras[5])) {
               this.ps(var1, var6[var8]);
            } else if (var6[var8].startsWith(GoodType.Extras[6])) {
               this.pr(var1, var6[var8], var7);
            } else {
               String var15 = var6[var8];
               var10001 = "w";
               String[] var9 = var15.split("=");
               if (var1.length() != 0) {
                  var10001 = "(j";
                  var1.append("#r");
               }

               String var16 = var9[0];
               var10001 = "裁奍觖舸";
               if (!var16.equals("装备角色")) {
                  String var17 = var9[0];
                  var10001 = "筂线";
                  if (!var17.equals("等级")) {
                     String var18 = var9[0];
                     var10001 = "裁奍筍续";
                     if (!var18.equals("装备等级")) {
                        String var19 = var9[0];
                        var10001 = "阽敨";
                        if (!var19.equals("阶数")) {
                           String var20 = var9[0];
                           var10001 = "筍续覅氈";
                           if (!var20.equals("等级要求")) {
                              String var21 = var9[0];
                              var10001 = "劐釗覊汚";
                              if (!var21.equals("力量要求")) {
                                 String var22 = var9[0];
                                 var10001 = "灱恭覅氈";
                                 if (!var22.equals("灵性要求")) {
                                    String var23 = var9[0];
                                    var10001 = "栲骰覊汚";
                                    if (!var23.equals("根骨要求")) {
                                       String var24 = var9[0];
                                       var10001 = "敋挽覅氈";
                                       if (!var24.equals("敏捷要求")) {
                                          String var25 = var9[0];
                                          var10001 = "奜裝哊贰";
                                          if (!var25.equals("套装品质")) {
                                             String var26 = var9[0];
                                             var10001 = "壴村覅氈";
                                             if (!var26.equals("声望要求")) {
                                                String var27 = var9[0];
                                                var10001 = "裁奍郬伇";
                                                if (var27.equals("装备部位")) {
                                                   String var10;
                                                   if ((var10 = MsgUntil.f(var9[1], true)) != null) {
                                                      var9[1] = var10;
                                                   }

                                                   String var144 = "({M^M^M^";
                                                   var2 = qy(var1, var2, "#cFFFFFF");
                                                   var10001 = "〔袏夃邢佉せ";
                                                   var1.append("【装备部位】");
                                                   var1.append(var9[1]);
                                                } else {
                                                   String var28 = var9[0];
                                                   var10001 = "怬刳覊汚";
                                                   if (!var28.equals("性别要求")) {
                                                      String var29 = var9[0];
                                                      var10001 = "怣剡";
                                                      if (!var29.equals("性别")) {
                                                         String var30 = var9[0];
                                                         var10001 = "L\u001a";
                                                         if (!var30.equals("HP")) {
                                                            String var31 = var9[0];
                                                            var10001 = "FH";
                                                            if (!var31.equals("MP")) {
                                                               String var32 = var9[0];
                                                               var10001 = "\u0002To";
                                                               if (!var32.equals("HP%")) {
                                                                  String var33 = var9[0];
                                                                  var10001 = "U[=";
                                                                  if (!var33.equals("MP%")) {
                                                                     String var34 = var9[0];
                                                                     var10001 = "绋髆";
                                                                     if (!var34.equals("经验")) {
                                                                        String var35 = var9[0];
                                                                        var10001 = "亹寞";
                                                                        if (!var35.equals("亲密")) {
                                                                           String var36 = var9[0];
                                                                           var10001 = "铻";
                                                                           if (!var36.equals("钱")) {
                                                                              String var37 = var9[0];
                                                                              var10001 = "炡";
                                                                              if (!var37.equals("点")) {
                                                                                 String var38 = var9[0];
                                                                                 var10001 = "功醅";
                                                                                 if (!var38.equals("力量")) {
                                                                                    String var39 = var9[0];
                                                                                    var10001 = "灾怿";
                                                                                    if (!var39.equals("灵性")) {
                                                                                       String var40 = var9[0];
                                                                                       var10001 = "栽髢";
                                                                                       if (!var40.equals("根骨")) {
                                                                                          String var41 = var9[0];
                                                                                          var10001 = "敄捯";
                                                                                          if (!var41.equals("敏捷")) {
                                                                                             String var42 = var9[0];
                                                                                             var10001 = "埽儱";
                                                                                             if (var42.equals("培养")) {
                                                                                                String var147 = "({;(m~m~";
                                                                                                var2 = qy(var1, var2, "#c00ffff");
                                                                                                var1.append(var9[0]);
                                                                                                String var138 = "j";
                                                                                                var1.append(" ");
                                                                                                var1.append(pu(var9[1]));
                                                                                             } else {
                                                                                                String var43 = var9[0];
                                                                                                var10001 = "哊贰";
                                                                                                if (var43.equals("品质")) {
                                                                                                   String var148 = "')5\u000f=zB\f";
                                                                                                   var2 = qy(var1, var2, "#c1E90FF");
                                                                                                   var1.append(var9[0]);
                                                                                                   String var139 = "8";
                                                                                                   var1.append(" ");
                                                                                                   var1.append(pu(var9[1]));
                                                                                                } else {
                                                                                                   String var44 = var9[0];
                                                                                                   var10001 = "坔桍";
                                                                                                   if (!var44.equals("坐标")) {
                                                                                                      String var45 = var9[0];
                                                                                                      var10001 = "冎両筂线";
                                                                                                      if (!var45.equals("内丹等级")) {
                                                                                                         String var46 = var9[0];
                                                                                                         var10001 = "欥攺";
                                                                                                         if (var46.equals("次数")) {
                                                                                                            String var150 = "({M^M^8+";
                                                                                                            var2 = qy(var1, var2, "#cFFFF33");
                                                                                                            var1.append(var9[1]);
                                                                                                         } else {
                                                                                                            String var47 = var9[0];
                                                                                                            var10001 = "炸姜欥攺";
                                                                                                            if (var47.equals("炼妖次数")) {
                                                                                                               String var151 = "({;(I^M^";
                                                                                                               var2 = qy(var1, var2, "#c00BFFF");
                                                                                                               var1.append(var9[0]);
                                                                                                               String var141 = "j";
                                                                                                               var1.append(" ");
                                                                                                               var1.append(pu(var9[1]));
                                                                                                            } else {
                                                                                                               String var48 = var9[0];
                                                                                                               var10001 = "揄迨";
                                                                                                               if (!var48.equals("描述")) {
                                                                                                                  String var49 = var9[0];
                                                                                                                  var10001 = "吉禺";
                                                                                                                  if (!var49.equals("名称")) {
                                                                                                                     String var50 = var9[0];
                                                                                                                     var10001 = "伤運";
                                                                                                                     if (!var50.equals("传送")) {
                                                                                                                        String var51 = var9[0];
                                                                                                                        var10001 = "宖囦";
                                                                                                                        if (!var51.equals("宝图")) {
                                                                                                                           String var52 = var9[0];
                                                                                                                           var10001 = "叫畢欥攺";
                                                                                                                           if (var52.equals("可用次数")) {
                                                                                                                              String var155 = "({M^M^8+";
                                                                                                                              var2 = qy(var1, var2, "#cFFFF33");
                                                                                                                              var10001 = "辒叫亯佻畢";
                                                                                                                              var1.append("还可以使用");
                                                                                                                              var1.append(var9[1]);
                                                                                                                              var155 = "欹";
                                                                                                                              var1.append("次");
                                                                                                                           } else {
                                                                                                                              String var53 = var9[0];
                                                                                                                              var10001 = "抄肷";
                                                                                                                              if (var53.equals("技能")) {
                                                                                                                                 if (var4 != 112L) {
                                                                                                                                    String var157 = "({M^M^8+";
                                                                                                                                    var2 = qy(
                                                                                                                                       var1, var2, "#cFFFF33"
                                                                                                                                    );
                                                                                                                                    var10001 = "拊胹p'\r";
                                                                                                                                    var1.append("技能:#G");
                                                                                                                                    var1.append(var9[1]);
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 String var54 = var9[0];
                                                                                                                                 var10001 = "抋胥筂线";
                                                                                                                                 if (var54.equals("技能等级")) {
                                                                                                                                    String var158 = "')B\fB\f7y";
                                                                                                                                    var2 = qy(
                                                                                                                                       var1, var2, "#cFFFF33"
                                                                                                                                    );
                                                                                                                                    var10001 = "折胶筑纬\"(_";
                                                                                                                                    var1.append("技能等级:#G");
                                                                                                                                    var1.append(var9[1]);
                                                                                                                                 } else {
                                                                                                                                    String var55 = var9[0];
                                                                                                                                    var10001 = "耔丏";
                                                                                                                                    if (var55.equals("耐久")) {
                                                                                                                                       if (this.za().gameType
                                                                                                                                          == 2) {
                                                                                                                                          int var14 = var9[1]
                                                                                                                                             .indexOf(",");
                                                                                                                                          var9[1] = var9[1]
                                                                                                                                             .substring(
                                                                                                                                                0,
                                                                                                                                                var14 != -1
                                                                                                                                                   ? var14
                                                                                                                                                   : var9[1]
                                                                                                                                                      .length()
                                                                                                                                             );
                                                                                                                                          String var159 = "{M]M^<*";
                                                                                                                                          var2 = qy(
                                                                                                                                             var1,
                                                                                                                                             var2,
                                                                                                                                             "cFEFF72"
                                                                                                                                          );
                                                                                                                                          var10001 = "聚乁j";
                                                                                                                                          var1.append("耐久 ");
                                                                                                                                          var1.append(var9[1]);
                                                                                                                                       } else {
                                                                                                                                          String var160 = "({M^M^8+";
                                                                                                                                          var2 = qy(
                                                                                                                                             var1,
                                                                                                                                             var2,
                                                                                                                                             "#cFFFF33"
                                                                                                                                          );
                                                                                                                                          var10001 = "聚乁p'\r";
                                                                                                                                          var1.append("耐久:#G");
                                                                                                                                          var1.append(
                                                                                                                                             var9[1].split(",")[0]
                                                                                                                                          );
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       String var56 = var9[0];
                                                                                                                                       var10001 = "圱敨";
                                                                                                                                       if (var56.equals("场数")) {
                                                                                                                                          var1.append("");
                                                                                                                                       } else if (var9.length
                                                                                                                                          > 1) {
                                                                                                                                          String var57 = var9[0];
                                                                                                                                          var10001 = "厦唠儷";
                                                                                                                                          if (!var57.equals(
                                                                                                                                             "召唤兽"
                                                                                                                                          )) {
                                                                                                                                             String var58 = var9[0];
                                                                                                                                             var10001 = "牢哙";
                                                                                                                                             if (!var58.equals(
                                                                                                                                                "物品"
                                                                                                                                             )) {
                                                                                                                                                String var59 = var9[0];
                                                                                                                                                var10001 = "栃笴";
                                                                                                                                                if (!var59.equals(
                                                                                                                                                   "标签"
                                                                                                                                                )) {
                                                                                                                                                   String var60 = var9[0];
                                                                                                                                                   var10001 = "値";
                                                                                                                                                   if (!var60.equals(
                                                                                                                                                      "值"
                                                                                                                                                   )) {
                                                                                                                                                      String var61 = var9[0];
                                                                                                                                                      var10001 = "皪胮";
                                                                                                                                                      if (!var61.equals(
                                                                                                                                                         "皮肤"
                                                                                                                                                      )) {
                                                                                                                                                         String var62 = var9[0];
                                                                                                                                                         var10001 = "斲吉";
                                                                                                                                                         if (!var62.equals(
                                                                                                                                                            "方向"
                                                                                                                                                         )) {
                                                                                                                                                            String var63 = var9[0];
                                                                                                                                                            var10001 = "叜軡卥簱";
                                                                                                                                                            if (!var63.equals(
                                                                                                                                                               "变身卡类"
                                                                                                                                                            )) {
                                                                                                                                                               String var64 = var9[0];
                                                                                                                                                               var10001 = "t}t";
                                                                                                                                                               if (!var64.equals(
                                                                                                                                                                  "lvl"
                                                                                                                                                               )
                                                                                                                                                                  )
                                                                                                                                                                {
                                                                                                                                                                  String var65 = var9[0];
                                                                                                                                                                  var10001 = "刪夜";
                                                                                                                                                                  if (!var65.equals(
                                                                                                                                                                     "刮奖"
                                                                                                                                                                  )
                                                                                                                                                                     )
                                                                                                                                                                   {
                                                                                                                                                                     String var66 = var9[0];
                                                                                                                                                                     var10001 = "卪籣";
                                                                                                                                                                     if (!var66.equals(
                                                                                                                                                                        "卡类"
                                                                                                                                                                     )
                                                                                                                                                                        )
                                                                                                                                                                      {
                                                                                                                                                                        String var67 = var9[0];
                                                                                                                                                                        var10001 = "挅级旲閾";
                                                                                                                                                                        if (!var67.equals(
                                                                                                                                                                           "持续时间"
                                                                                                                                                                        )
                                                                                                                                                                           )
                                                                                                                                                                         {
                                                                                                                                                                           String var68 = var9[0];
                                                                                                                                                                           var10001 = "诰杹";
                                                                                                                                                                           if (!var68.equals(
                                                                                                                                                                              "读条"
                                                                                                                                                                           )
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              String var161 = "')@\u000f@\u000f=\u000f";
                                                                                                                                                                              var2 = qy(
                                                                                                                                                                                 var1,
                                                                                                                                                                                 var2,
                                                                                                                                                                                 "#cDEDE9E"
                                                                                                                                                                              );
                                                                                                                                                                              var1.append(
                                                                                                                                                                                 var9[0]
                                                                                                                                                                              );
                                                                                                                                                                              String var142 = "8";
                                                                                                                                                                              var1.append(
                                                                                                                                                                                 " "
                                                                                                                                                                              );
                                                                                                                                                                              var1.append(
                                                                                                                                                                                 pu(
                                                                                                                                                                                    var9[1]
                                                                                                                                                                                 )
                                                                                                                                                                              );
                                                                                                                                                                              var1.append(
                                                                                                                                                                                 qb(
                                                                                                                                                                                    var9[0]
                                                                                                                                                                                 )
                                                                                                                                                                              );
                                                                                                                                                                           }
                                                                                                                                                                        }
                                                                                                                                                                     }
                                                                                                                                                                  }
                                                                                                                                                               }
                                                                                                                                                            }
                                                                                                                                                         }
                                                                                                                                                      }
                                                                                                                                                   }
                                                                                                                                                }
                                                                                                                                             }
                                                                                                                                          }
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              }
                                                                                                                           }
                                                                                                                           continue;
                                                                                                                        }
                                                                                                                     }

                                                                                                                     String[] var13 = var9[1].split(",");
                                                                                                                     int var11 = Integer.parseInt(var13[2])
                                                                                                                        / 20;
                                                                                                                     int var12 = Integer.parseInt(var13[3])
                                                                                                                        / 20;
                                                                                                                     String var153 = "')B\fB\f7y";
                                                                                                                     var2 = qy(var1, var2, "#cFFFF33");
                                                                                                                     var10001 = "坛栟18";
                                                                                                                     var1.append("坐标: ");
                                                                                                                     var1.append(var13[1]);
                                                                                                                     var153 = "b";
                                                                                                                     var1.append("(");
                                                                                                                     var1.append(var11);
                                                                                                                     var1.append(",");
                                                                                                                     var1.append(var12);
                                                                                                                     String var10007 = "1";
                                                                                                                     var1.append(")");
                                                                                                                     continue;
                                                                                                                  }
                                                                                                               }

                                                                                                               String var152 = "({;(I^M^";
                                                                                                               var2 = qy(var1, var2, "#c00BFFF");
                                                                                                               var1.append(var9[1]);
                                                                                                            }
                                                                                                         }
                                                                                                         continue;
                                                                                                      }
                                                                                                   }

                                                                                                   String var149 = "')B\fB\f7y";
                                                                                                   var2 = qy(var1, var2, "#cFFFF33");
                                                                                                   var1.append(var9[0]);
                                                                                                   String var140 = "\"";
                                                                                                   var1.append(":");
                                                                                                   var1.append(pu(var9[1]));
                                                                                                }
                                                                                             }
                                                                                             continue;
                                                                                          }
                                                                                       }
                                                                                    }
                                                                                 }

                                                                                 String var146 = "')G\tG\t=s";
                                                                                 var2 = qy(var1, var2, "#cCCCC99");
                                                                                 var1.append(var9[0]);
                                                                                 String var137 = "8";
                                                                                 var1.append(" ");
                                                                                 var1.append(pu(var9[1]));
                                                                                 continue;
                                                                              }
                                                                           }
                                                                        }
                                                                     }
                                                                  }
                                                               }
                                                            }
                                                         }

                                                         String var145 = "')B\fB\fB\f";
                                                         var2 = qy(var1, var2, "#cFFFFFF");
                                                         var1.append(var9[0]);
                                                         String var136 = "8";
                                                         var1.append(" ");
                                                         var1.append(pu(var9[1]));
                                                         continue;
                                                      }
                                                   }

                                                   String var10004 = "({M^M^M^";
                                                   var2 = qy(var1, var2, "#cFFFFFF");
                                                   String var10002 = "〔恭刯觋汆せ";
                                                   var1.append("【性别要求】");
                                                   if (var9[1].equals("1")) {
                                                      var10001 = "甯";
                                                      var10001 = "男";
                                                   } else if (var9[1].equals("0")) {
                                                      var10001 = "夹";
                                                      var10001 = "女";
                                                   } else {
                                                      var10001 = "兣郰怬刳";
                                                      var10001 = "全部性别";
                                                   }

                                                   var1.append(var10001);
                                                }
                                                continue;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               String var10003 = "({M^M^M^";
               var2 = qy(var1, var2, "#cFFFFFF");
               var10001 = "ず";
               var1.append("【");
               var1.append(var9[0]);
               var10003 = "〉";
               var1.append("】");
               var1.append(var9[1]);
            }
         }
      }
   }

   public void rc(StringBuffer var1, String var2, String var3, long var4) {
      if (!com.xy.v.Class12.h(var3)) {
         boolean var6 = false;
         int var7 = 0;
         int var8;
         int var10000 = var8 = 0;

         while (var10000 < var3.length()) {
            String var10001 = "6";
            if ((var8 = var3.indexOf("|", var7 + 1)) == -1) {
               var8 = var3.length();
            }

            String var10;
            if ((var10 = var3.substring(var7, var8)).startsWith(GoodType.Extras[1])) {
               var10001 = ">";
               String[] var20;
               if ((var20 = var10.split("&")).length <= 2) {
                  String var54 = "'\r";
                  var2 = qy(var1, var2, "#G");
                  var10001 = "(j";
                  var1.append("#r");
                  String var47 = "炽醛戔動";
                  var1.append("点金成功");
                  var10000 = var8;
               } else {
                  int var12;
                  for (int var23 = var12 = 2; var23 < var20.length; var23 = ++var12) {
                     String var24 = var20[var12];
                     var10001 = "%";
                     int var19;
                     if ((var19 = var24.indexOf("=")) != -1) {
                        String var13;
                        String var25 = var13 = var20[var12].substring(0, var19);
                        var10001 = "牽拊";
                        if (var25.equals("特技")) {
                           String var52 = "({3.3(2(";
                           var2 = qy(var1, var2, "#c868090");
                           var10001 = "'8牽拊";
                           var1.append("#r特技");
                           com.xy.v.Class8 var14 = this.yt();
                           var10001 = var20[var12];
                           String var46 = "%";
                           String[] var15 = var10001.split("=");
                           int var16 = 1;

                           for (int var26 = var16; var26 < var15.length; var26 = ++var16) {
                              Skill var17;
                              if ((var17 = var14.ac(var15[var16])) != null) {
                                 var10001 = "'8";
                                 var1.append("#r");
                                 var1.append(var17.getSkillname());
                                 var52 = "\"";
                                 var1.append(":");
                                 var1.append(var17.getRemark());
                              }
                           }
                        } else {
                           String var50 = "'\r";
                           var2 = qy(var1, var2, "#G");
                           var10001 = "(j";
                           var1.append("#r");
                           var1.append(var13);
                           var50 = "j";
                           var1.append(" ");
                           if (var20[var12].charAt(var19 + 1) != '-') {
                              var10001 = "3";
                              var1.append("+");
                           }

                           var1.append(var20[var12].substring(var19 + 1));
                        }
                     }
                  }

                  var10000 = var8;
               }
            } else {
               var10001 = "w";
               int var9;
               if ((var9 = var10.indexOf("=")) == -1) {
                  var10000 = var8;
               } else {
                  label106: {
                     label84: {
                        String var11;
                        String var21 = var11 = var10.substring(0, var9);
                        var10001 = "筂线";
                        if (!var21.equals("等级")) {
                           var10001 = "裁奍籿埁";
                           if (!var11.equals("装备类型")) {
                              var10001 = "怬刳覊汚";
                              if (!var11.equals("性别要求")) {
                                 String var49 = "(A";
                                 var2 = qy(var1, var2, "#Y");
                                 if (var6) {
                                    var10001 = "j";
                                    var10001 = " ";
                                 } else {
                                    var10001 = "(j";
                                    var10001 = "#r";
                                 }

                                 var1.append(var10001);
                                 var1.append(var11);
                                 if (var10.charAt(var9 + 1) != '-') {
                                    var10001 = "a";
                                    var1.append("+");
                                 }

                                 var1.append(var10.substring(var9 + 1));
                                 var6 = true;
                                 break label84;
                              }
                           }
                        }

                        String var10003 = "'\u001d";
                        var2 = qy(var1, var2, "#W");
                        var10001 = "(j";
                        var1.append("#r");
                        var1.append(var11);
                        var10003 = ">j";
                        var1.append(": ");
                        var1.append(var10.substring(var9 + 1));
                        var10001 = "筂线";
                        if (var11.equals("等级")) {
                           var10000 = var8;
                           String var10002 = "续";
                           var1.append("级");
                           break label106;
                        }
                     }

                     var10000 = var8;
                  }
               }
            }

            var7 = var10000 + 1;
            var10000 = var8;
         }
      }
   }
}
