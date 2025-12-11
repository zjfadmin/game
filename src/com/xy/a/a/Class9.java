package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.CustomFunction;
import com.xy.formula.FBUtil;
import com.xy.formula.Formula;
import com.xy.formula.PetProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class9 extends com.xy.q.Class30 {
   private Class24[] ht;
   private JLabel[] ap;
   private com.xy.i.Class4[] hu;
   private Class63 hv;
   private List<Class24> eq;
   private JScrollPane ba;
   private com.xy.w.Class18[] cl;

   public void fp(RoleSummoning var1, int var2, int var3, Skill var4, boolean var5) {
      Class63.apl(this.hv, var4);
      this.hv.t();
      if (var4 == null) {
         int var16;
         for (int var60 = var16 = 0; var60 < this.ht.length; var60 = var16) {
            this.ht[var16++].setBorder(null);
         }
      } else {
         int var6;
         for (int var10000 = var6 = 0; var10000 < this.ht.length; var10000 = ++var6) {
            if (Class24.pi(this.ht[var6]) == var2) {
               this.ht[var6].setBorder(BorderFactory.createLineBorder(Color.red, 2));
            } else {
               this.ht[var6].setBorder(null);
            }
         }

         if (!var5) {
            Class63.apl(this.hv, null);
         }

         Class9 var38;
         if (var2 == 3036) {
            var38 = this;
            Class63.apk(this.hv).addText(var4.getSkillname());
         } else {
            label239: {
               if (var2 <= 1100) {
                  String var14;
                  if ((var14 = gb(var2, var4, 1.0, 200, 3)) != null) {
                     var38 = this;
                     Class63.apk(this.hv).addText(var14);
                     break label239;
                  }
               } else {
                  String var13 = !this.za().gameBattle && var2 != 1282 ? fx(var4.getRemark()) : var4.getRemark();
                  if (var2 == 1267) {
                     double var7 = Math.pow(var1.getFriendliness().longValue(), 0.16666666666666666);
                     String var10001 = "\u0018攟偟^\u001e";
                     String var39 = var13.replace("{数值1}", com.xy.v.Class12.e(5.0 + 0.3 * var7 + 0.4 * Math.pow(var1.getZBone(this.afx).intValue(), 0.5), 1));
                     var10001 = "E敭倂/C";
                     String var40 = var39.replace("{数值2}", com.xy.v.Class12.e(3.0 + 0.4 * var7 + 0.6 * Math.pow(var1.getZBone(this.afx).intValue(), 0.5), 1));
                     var10001 = "\u0018攟偟\\\u001e";
                     String var41 = var40.replace("{数值3}", com.xy.v.Class12.e(2.0 + 0.2 * var7 + 0.2 * Math.pow(var1.getZSpeed(this.afx).intValue(), 0.5), 1));
                     var10001 = "E敭倂)C";
                     String var42 = var41.replace("{数值4}", com.xy.v.Class12.e(3.5 + 0.2 * var7 + 0.3 * Math.pow(var1.getZSpeed(this.afx).intValue(), 0.5), 1));
                     var10001 = "\u0018攟偟Z\u001e";
                     var13 = var42.replace("{数值5}", com.xy.v.Class12.e(4.5 + 0.2 * var7 + 0.3 * Math.pow(var1.getZPower(this.afx).intValue(), 0.5), 1));
                     var38 = this;
                  } else {
                     if (var2 == 1282) {
                        double var17 = 20.0 + CustomFunction.a(var1.getFriendliness(), 0.6);
                        StringBuffer var9;
                        (var9 = new StringBuffer()).append(com.xy.v.Class12.e(var17, 1));
                        String var10002 = "\u001dZ\u0011>l";
                        var9.append("#G/#R");
                        var9.append(com.xy.v.Class12.e(var17 * 1.1, 1));
                        String var10004 = "@(LL1";
                        var9.append("#G/#R");
                        var9.append(com.xy.v.Class12.e(var17 * 1.2, 1));
                        String var10006 = "\u001dZ\u0011>l";
                        var9.append("#G/#R");
                        var9.append(com.xy.v.Class12.e(var17 * 1.85, 1));
                        int[] var10 = PetProperty.getPetHMASp(var1, this.yx());
                        var17 = 12.0 + CustomFunction.a(var1.getFriendliness(), 0.2);
                        var17 = 1000.0 + var17 / 100.0 * var10[1];
                        String var10008 = "\u0018攟偟^\u001e";
                        String var10007 = var13.replace("{数值1}", var9.toString());
                        var10008 = "E敭倂/C";
                        var13 = var10007.replace("{数值2}", com.xy.v.Class12.e(var17, 0));
                     }

                     var38 = this;
                  }

                  if (var38.za().gameBattle || var2 == 1282) {
                     String var53 = var4.getSkilltype();
                     String var76 = "W";
                     if (!var53.equals("4")) {
                        if (var2 == 1288) {
                           double var22 = 20.0 + CustomFunction.a(var1.getFriendliness(), 0.7);
                           StringBuffer var32;
                           (var32 = new StringBuffer()).append(com.xy.v.Class12.e(var22, 1));
                           String var88 = "@(LL1";
                           var32.append("#G/#R");
                           var32.append(com.xy.v.Class12.e(var22 * 1.2, 1));
                           String var95 = "\u001dZ\u0011>l";
                           var32.append("#G/#R");
                           var32.append(com.xy.v.Class12.e(var22 * 1.4, 1));
                           String var96 = "@(LL1";
                           var32.append("#G/#R");
                           var32.append(com.xy.v.Class12.e(var22 * 2.0, 1));
                           int[] var36 = PetProperty.getPetHMASp(var1, this.yx());
                           var22 = 20.0 + CustomFunction.a(var1.getFriendliness(), 0.3);
                           var22 = 1000.0 + var22 / 100.0 * var36[1];
                           String var99 = "E敭倂,C";
                           String var97 = var13.replace("{数值1}", var32.toString());
                           var99 = "\u0018攟偟]\u001e";
                           var13 = var97.replace("{数值2}", com.xy.v.Class12.e(var22, 0));
                           var38 = this;
                        } else {
                           if (var2 != 1267 && var2 != 1282) {
                              var13 = fv(var2, var4, var1);
                           }

                           var38 = this;
                        }
                     } else {
                        int var21 = 0;

                        int var27;
                        for (int var54 = var27 = 0; var54 < this.ht.length; var54 = ++var27) {
                           Skill var31 = Class24.pi(this.ht[var27]) > 0 ? this.yt().ac(String.valueOf(Class24.pi(this.ht[var27]))) : null;
                           if (var31 != null) {
                              String var55 = var31.getSkilltype();
                              var76 = "\r";
                              if (var55.equals("3")) {
                                 var21++;
                              }
                           }
                        }

                        String var56;
                        label166: {
                           var27 = 999;
                           if (var21 > 0) {
                              if (this.za().l(2, 12)) {
                                 if (var21 == 1) {
                                    var27 = 4999;
                                    var56 = var13;
                                    break label166;
                                 }

                                 if (var21 == 2) {
                                    var27 = 9999;
                                    var56 = var13;
                                    break label166;
                                 }

                                 if (var21 >= 3) {
                                    var27 = 12999;
                                    var56 = var13;
                                    break label166;
                                 }
                              } else {
                                 if (this.za().gameType == 2) {
                                    var27 += var21 * 2000;
                                    var56 = var13;
                                    break label166;
                                 }

                                 var27 += var21 * 200;
                              }
                           }

                           var56 = var13;
                        }

                        var76 = "S@ZVZ";
                        StringBuilder var87 = new StringBuilder(String.valueOf(var1.getTrainNum()));
                        String var93 = "\u0011";
                        var13 = var56.replace("0/999", var87.append("/").append(var27).toString());
                        var38 = this;
                     }

                     Class63.apk(var38.hv).addText(var13);
                     var38 = this;
                     break label239;
                  }

                  String var65 = "AB";
                  String[] var20 = var13.split("\\|");

                  int var8;
                  for (int var44 = var8 = 0; var44 < var20.length; var44 = ++var8) {
                     String var45 = var20[var8];
                     var65 = "^";
                     String[] var30 = var45.split("=");
                     String var46 = var4.getSkilltype();
                     var65 = "\n";
                     if (var46.equals("4")) {
                        String var47 = var30[1];
                        var65 = "S@ZVZ";
                        if (var47.equals("0/999")) {
                           int var34 = 0;

                           int var11;
                           for (int var48 = var11 = 0; var48 < this.ht.length; var48 = ++var11) {
                              Skill var12 = Class24.pi(this.ht[var11]) > 0 ? this.yt().ac(String.valueOf(Class24.pi(this.ht[var11]))) : null;
                              if (var12 != null) {
                                 String var49 = var12.getSkilltype();
                                 var65 = "\r";
                                 if (var49.equals("3")) {
                                    var34++;
                                 }
                              }
                           }

                           String[] var50;
                           label189: {
                              var11 = 999;
                              if (var34 > 0) {
                                 if (this.za().gameType == 2) {
                                    var11 += 2000 * var34;
                                    var50 = var30;
                                    break label189;
                                 }

                                 var11 += 200 * var34;
                              }

                              var50 = var30;
                           }

                           StringBuilder var80 = new StringBuilder(String.valueOf(var1.getTrainNum()));
                           String var10003 = "L";
                           var50[1] = var80.append("/").append(var11).toString();
                        }
                     }

                     String var35;
                     if ((var35 = fw(var20, var8)) != null) {
                        RichLabel var51 = Class63.apk(this.hv);
                        var8++;
                        String var90 = ">]";
                        StringBuilder var70 = new StringBuilder("#c").append(var30[0]);
                        String var81 = "C";
                        StringBuilder var71 = var70.append(" ").append(var30[1]);
                        var81 = ">]";
                        StringBuilder var72 = var71.append("#c");
                        var81 = var20[var8];
                        var90 = "^";
                        StringBuilder var73 = var72.append(var81.split("=")[0]).append(var35);
                        var81 = ">L";
                        var51.addText(var73.append("#r").toString());
                     } else {
                        RichLabel var52 = Class63.apk(this.hv);
                        String var92 = "L\u0000";
                        StringBuilder var74 = new StringBuilder("#c").append(var30[0]);
                        String var85 = "\u001e";
                        StringBuilder var75 = var74.append(" ").append(var30[1]);
                        var85 = "L\u0011";
                        var52.addText(var75.append("#r").toString());
                     }
                  }
               }

               var38 = this;
            }
         }

         Dimension var15 = Class63.apk(var38.hv).computeSize(205);
         Class63.apk(this.hv).setBounds(3, 3, (int)var15.getWidth(), (int)var15.getHeight());
         int var25 = 3 + (int)var15.getHeight();
         if (var2 == 3036) {
            var25 += this.hv.pq(var3, var25);
            var38 = this;
         } else if (fz(var2, this.za())) {
            if (var3 == -1) {
               int var29 = var1.getQLNum();

               int var33;
               for (int var59 = var33 = 0; var59 < this.ht.length; var59 = ++var33) {
                  if (Class24.pi(this.ht[var33]) > 0 && Class24.pj(this.ht[var33]) != -1) {
                     var29--;
                  }
               }

               byte var89;
               int var94;
               if (var29 > 0) {
                  var89 = -1;
                  var94 = var25;
               } else {
                  var89 = -2;
                  var94 = var25;
               }

               var25 += this.hv.qj(var89, var94);
               var38 = this;
            } else {
               var25 += this.hv.qj(var3, var25);
               var38 = this;
            }
         } else {
            var25 += this.hv.qj(-3, var25);
            var38 = this;
         }

         var38.hv.setBounds(0, 0, 215, var25);
      }
   }

   // $VF: synthetic method
   private static String fq(int var0, Skill var1, double var2, int var4, int var5) {
      String var6 = var1.getRemark();
      int var7 = Integer.parseInt(var1.getSkilllevel());
      double var8 = Double.parseDouble(var1.getDielectric());
      String var19;
      if (var0 <= 1005) {
         var19 = "淪乏";
         var19 = "混乱";
      } else if (var0 <= 1010) {
         var19 = "屮匓";
         var19 = "封印";
      } else if (var0 <= 1015) {
         var19 = "昒睟";
         var19 = "昏睡";
      } else if (var0 <= 1020) {
         var19 = "乂殱";
         var19 = "中毒";
      } else if (var0 <= 1025) {
         var19 = "霚慯";
         var19 = "震慑";
      } else if (var0 <= 1030) {
         var19 = "勴醬";
         var19 = "力量";
      } else if (var0 <= 1035) {
         var19 = "把怙";
         var19 = "抗性";
      } else if (var0 <= 1040) {
         var19 = "勏遼";
         var19 = "加速";
      } else if (var0 <= 1045) {
         var19 = "飰";
         var19 = "风";
      } else if (var0 <= 1050) {
         var19 = "隔";
         var19 = "雷";
      } else if (var0 <= 1055) {
         var19 = "氊";
         var19 = "水";
      } else if (var0 <= 1060) {
         var19 = "瀈";
         var19 = "火";
      } else if (var0 <= 1065) {
         var19 = "鬡灕";
         var19 = "鬼火";
      } else if (var0 <= 1070) {
         var19 = "乪屗蘈";
         var19 = "三尸虫";
      } else if (var0 <= 1075) {
         var19 = "遊忦";
         var19 = "遗忘";
      } else if (var0 <= 1080) {
         var19 = "\u001c\u000e\u0002\u000b";
         var19 = "smmh";
      } else if (var0 <= 1085) {
         var19 = "霤雍";
         var19 = "霹雳";
      } else if (var0 <= 1090) {
         var19 = "泈沁";
         var19 = "沧波";
      } else if (var0 <= 1095) {
         var19 = "甅霨";
         var19 = "甘霖";
      } else {
         var19 = "戙搤";
         var19 = "扶摇";
      }

      String var10 = var19;
      int var11 = (var0 - 1001) / 5;
      StringBuffer var12 = new StringBuffer();
      var19 = var6;
      String var10002 = ">i」闖洣〯";
      var12.append("#W【门派】");
      var12.append(SkillUtil.getSkillBySM(var11));
      String var10004 = "L\u0011み幫僪ひ";
      var12.append("#r【师傅】");
      var12.append(SkillUtil.getSkillBySMSF(var11));
      String var10006 = "\u001do〮泈朑糦〯";
      var12.append("#r【法术系】");
      var12.append(SkillUtil.getSkillBySMText(var11));
      String var10008 = "@\u001dび燰纠廉ひ";
      var12.append("#r【熟练度】");
      var12.append((int)var2);
      String var10010 = ">L」涶耊sM〯";
      var12.append("#r【消耗MP】");
      var12.append((int)(var8 * (var2 / 25000.0 + 1.0)));
      String var10012 = "L\u0011";
      var12.append("#r");
      int var13 = 0;
      int var14 = 0;

      StringBuffer var41;
      while (true) {
         String var10001 = "E";
         if ((var13 = var19.indexOf("{", var14)) == -1) {
            var41 = var12;
            break;
         }

         var10001 = "\u001e";
         if ((var14 = var6.indexOf("}", var13 + 1)) == -1) {
            var41 = var12;
            break;
         }

         String var15;
         var19 = var15 = var6.substring(var13 + 1, var14);
         var10001 = "E";
         if (var19.indexOf("{") != -1) {
            var19 = var6;
            var13++;
         } else {
            int var16 = var6.length();
            var6 = fu(var15, var6, var0, var1, var2, var4, var5, var10, var7);
            var14 += var6.length() - var16;
            var19 = var6;
         }
      }

      var41.append(var6);
      return var12.toString();
   }

   public static String fr(String var0, String var1, int var2, Skill var3, RoleSummoning var4) {
      String var9;
      String var10000;
      label43: {
         double var5 = Double.parseDouble(var3.getValue());
         double var7 = Double.parseDouble(var3.getGrow());
         var9 = null;
         String var10001 = "攟偟";
         if (!var0.equals("数值")) {
            var10001 = "敩倂";
            if (!var0.equals("整值")) {
               label44: {
                  var10001 = "敭倂答纙";
                  if (!var0.equals("数值等级")) {
                     var10001 = "攛偟符组";
                     if (!var0.equals("整值等级")) {
                        break label44;
                     }
                  }

                  var10001 = "敭倂答纙";
                  int var15 = var0.equals("数值等级") ? 1 : 0;
                  int var11 = com.xy.v.Class4.c(var4.getGrade());
                  int var12 = com.xy.v.Class4.f(var4.getGrade());
                  if (var11 >= 4) {
                     var12 = Math.max(var12, 180);
                  }

                  double var13 = var12 / 200.0 * BaseValue.a(var4.getFriendliness(), var7);
                  var9 = com.xy.v.Class12.e(var5 + var13, var15);
               }

               var10000 = var9;
               break label43;
            }
         }

         var10001 = "攟偟";
         int var10 = var0.equals("数值") ? 1 : 0;
         var10000 = var9 = com.xy.v.Class12.e(var5 + BaseValue.a(var4.getFriendliness(), var7), var10);
      }

      if (var10000 == null) {
         return var1;
      } else {
         String var10003 = "\u0018";
         StringBuilder var21 = new StringBuilder("{").append(var0);
         String var10002 = "C";
         return var1.replace(var21.append("}").toString(), var9);
      }
   }

   // $VF: synthetic method
   static Class63 fs(Class9 var0) {
      return var0.hv;
   }

   public Skill ft() {
      return Class63.apm(this.hv);
   }

   public static String fu(String var0, String var1, int var2, Skill var3, double var4, int var6, int var7, String var8, int var9) {
      String var10 = null;
      String var10001 = "仕攓";
      String var10000;
      if (var0.equals("人数")) {
         var10000 = var10 = String.valueOf(FBUtil.e(var9, (int)var4, var8));
      } else {
         var10001 = "因吕敎";
         if (var0.equals("回合数")) {
            byte var11 = 0;
            byte var19;
            if (var2 > 1015 && (var2 < 1071 || var2 > 1075)) {
               if (var2 <= 1020) {
                  var19 = var11 = 3;
               } else {
                  if (var2 <= 1040 || var2 >= 1076 && var2 <= 1080) {
                     var11 = 7;
                  }

                  var19 = var11;
               }
            } else {
               var19 = var11 = 7;
            }

            var10000 = var10 = String.valueOf(var19);
         } else {
            var10001 = "歎攓";
            if (var0.equals("次数")) {
               var10000 = var10 = String.valueOf(var9 == 5 ? 3 : (var9 == 4 ? 5 : 2));
            } else {
               label124: {
                  var10001 = "敭倂";
                  if (var0.startsWith("数值")) {
                     int var18 = var0.length() > 2 ? com.xy.v.Class12.ad(var0, 2, var0.length()) - 1 : 0;
                     Formula var12;
                     if ((var12 = var3.getFormulaByIndex(var18)) == null) {
                        return var1;
                     }

                     int var13 = (var2 - 1001) / 5;
                     double var14 = var12.a(var4, var6, var7);
                     if (var18 == 0 && (var13 >= 8 && var13 <= 13 || var13 == 17 || var13 == 18 || var13 == 19)) {
                        var10000 = var10 = String.valueOf((int)var14);
                        break label124;
                     }

                     if (var18 == 1 && var13 == 3) {
                        var10000 = var10 = String.valueOf((int)var14);
                        break label124;
                     }

                     if (var18 == 3 && var13 == 15) {
                        var10000 = var10 = String.valueOf((int)var14);
                        break label124;
                     }

                     if (var18 == 4 && var13 == 15) {
                        var10000 = var10 = String.valueOf((int)var14);
                        break label124;
                     }

                     StringBuilder var20 = new StringBuilder(String.valueOf(com.xy.v.Class12.e(var14, 1)));
                     var10001 = "F";
                     var10 = var20.append("%").toString();
                  }

                  var10000 = var10;
               }
            }
         }
      }

      if (var10000 == null) {
         return var1;
      } else {
         String var10003 = "E";
         StringBuilder var25 = new StringBuilder("{").append(var0);
         String var10002 = "\u001e";
         return var1.replace(var25.append("}").toString(), var10);
      }
   }

   // $VF: synthetic method
   private static String fv(int var0, Skill var1, RoleSummoning var2) {
      String var3 = var1.getRemark();
      int var4 = 0;
      int var5 = 0;
      String var10000 = var3;

      while (true) {
         String var10001 = "E";
         if ((var4 = var10000.indexOf("{", var5)) == -1) {
            return var3;
         }

         var10001 = "\u001e";
         if ((var5 = var3.indexOf("}", var4 + 1)) == -1) {
            return var3;
         }

         String var6;
         var10000 = var6 = var3.substring(var4 + 1, var5);
         var10001 = "E";
         if (var10000.indexOf("{") != -1) {
            var10000 = var3;
            var4++;
         } else {
            int var7 = var3.length();
            var3 = fr(var6, var3, var0, var1, var2);
            var5 += var3.length() - var7;
            var10000 = var3;
         }
      }
   }

   public Class9(GameView var1) {
      super(18, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 574, 451, com.xy.q.Class30.agh);
      com.xy.w.Class9 var26 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "拯肞";
      this.yu(var26, "技能");
      this.hu = new com.xy.i.Class4[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hu.length; var10000 = var2) {
         String var10006 = "M~\u0011x\u0011/\u00063NsY";
         this.hu[var2] = new com.xy.i.Class4("sc/e/28.png", 1, 42 + var2, com.xy.q.Class49.bz, null, "", this);
         this.hu[var2].setBounds(68 + 164 * var2, 397, 68, 17);
         com.xy.i.Class4 var6 = this.hu[var2];
         String var13;
         if (var2 == 0) {
            var13 = "敀掗剸蠋";
            var13 = "支援列表";
         } else if (var2 == 1) {
            var13 = "刽陚抝胃";
            var13 = "删除技能";
         } else {
            var13 = "";
         }

         var6.setText(var13);
         this.add(this.hu[var2++]);
      }

      this.ap = new JLabel[2];

      for (int var7 = var2 = 0; var7 < this.ap.length; var7 = var2) {
         this.ap[var2] = com.xy.q.Class1.f(52, 28 + var2 * 85, 487, 21, 0, Color.white, com.xy.q.Class49.ch);
         JLabel var8 = this.ap[var2];
         String var16;
         if (var2 == 0) {
            var16 = "奆畼拯肞";
            var16 = "天生技能";
         } else if (var2 == 1) {
            var16 = "颛悡抝胃";
            var16 = "领悟技能";
         } else {
            var16 = "";
         }

         var8.setText(var16);
         this.add(this.ap[var2++]);
      }

      this.ht = new Class24[9];

      for (int var9 = var2 = 0; var9 < this.ht.length; var9 = var2) {
         this.ht[var2] = new Class24(this, 1, var2);
         Class9 var10;
         if (var2 == 0) {
            var10 = this;
            this.ht[var2].setBounds(159, 144, 50, 50);
         } else if (var2 == 1) {
            var10 = this;
            this.ht[var2].setBounds(89, 184, 50, 50);
         } else if (var2 == 2) {
            var10 = this;
            this.ht[var2].setBounds(63, 254, 50, 50);
         } else if (var2 == 3) {
            var10 = this;
            this.ht[var2].setBounds(89, 324, 50, 50);
         } else if (var2 == 4) {
            var10 = this;
            this.ht[var2].setBounds(159, 364, 50, 50);
         } else if (var2 == 5) {
            var10 = this;
            this.ht[var2].setBounds(229, 324, 50, 50);
         } else if (var2 == 6) {
            var10 = this;
            this.ht[var2].setBounds(159, 254, 50, 50);
         } else if (var2 == 7) {
            var10 = this;
            this.ht[var2].setBounds(255, 254, 50, 50);
         } else {
            if (var2 == 8) {
               this.ht[var2].setBounds(229, 184, 50, 50);
            }

            var10 = this;
         }

         var10.ht[var2].setBounds(this.ht[var2].getX() - 2, this.ht[var2].getY() - 2, 54, 54);
         this.add(this.ht[var2++]);
      }

      this.eq = new ArrayList<>();
      this.hv = new Class63(this);
      this.ba = com.xy.q.Class1.g(318, 136, 233, 280, this.hv, 30);
      this.add(this.ba);
      this.cl = new com.xy.w.Class18[5];

      for (int var11 = var2 = 0; var11 < this.cl.length; var11 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         Class9 var12;
         String var10003;
         if (var2 == 0 || var2 == 1) {
            var12 = this;
            com.xy.w.Class18 var24 = this.cl[var2];
            var10003 = "\u0010\fL\u000bL]VA\u0013\u0001\u0004";
            var24.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(52, 28 + var2 * 85, 487, 21);
         } else if (var2 == 2) {
            var12 = this;
            com.xy.w.Class18 var21 = this.cl[var2];
            var10003 = "M~\u0011y\u0011/\n3NsY";
            var21.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(52, 28, 487, 80);
         } else if (var2 == 3) {
            var12 = this;
            com.xy.w.Class18 var22 = this.cl[var2];
            var10003 = "\u0010\fL\u000bLZ[A\u0013\u0001\u0004";
            var22.dp("sc/d/58.png");
            this.cl[var2].setBounds(52, 133, 264, 291);
         } else {
            if (var2 == 4) {
               com.xy.w.Class18 var18 = this.cl[var2];
               String var23 = "M~\u0011y\u0011/\n3NsY";
               var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.cl[var2].setBounds(316, 134, 223, 290);
            }

            var12 = this;
         }

         var12.add(this.cl[var2++]);
      }
   }

   public static String fw(String[] var0, int var1) {
      if (var0.length > var1 + 1) {
         String var10000 = var0[var1 + 1];
         String var10001 = "^";
         String[] var2;
         if ((var2 = var10000.split("=")).length > 1) {
            var10000 = var2[1];
            var10001 = "E共弱丝C";
            if (var10000.equals("{公式一}")) {
               return "1";
            }

            var10000 = var2[1];
            var10001 = "\u0018儃彬代\u001e";
            if (var10000.equals("{公式二}")) {
               return "1";
            }

            var10000 = var2[1];
            var10001 = "E共弱且C";
            if (var10000.equals("{公式三}")) {
               return "1";
            }

            var10000 = var2[1];
            var10001 = "\u0018儃彬嚴\u001e";
            if (var10000.equals("{公式四}")) {
               return "1";
            }

            var10000 = var2[1];
            var10001 = "E共弱争C";
            if (var10000.equals("{公式五}")) {
               return "1";
            }
         }
      }

      return null;
   }

   public static String fx(String var0) {
      String var10000 = "]GME\\F_";
      Matcher var2 = Pattern.compile(">(.*?)<").matcher(var0);
      var10000 = ":\u001d5\u00107\u00014\u0019";
      Matcher var4 = Pattern.compile("'#(.*?)'").matcher(var0);
      StringBuffer var5 = new StringBuffer();

      for (Matcher var14 = var4; var14.find(); var14 = var4) {
         String var6 = var4.group();
         if (!var5.toString().equals("")) {
            String var10001 = "\u001f";
            var5.append("|");
         }

         String var10002 = ":\u001d";
         String var20 = var6.split("'#")[1];
         var10002 = "D";
         var5.append(var20.split("'")[0]);
      }

      StringBuffer var11 = new StringBuffer();

      for (Matcher var15 = var2; var15.find(); var15 = var2) {
         String var7;
         var10000 = var7 = var2.group();
         String var21 = "#\u0002";
         if (!var10000.equals("><")) {
            if (!var11.toString().equals("")) {
               var21 = "\u001f";
               var11.append("|");
            }

            String var30 = "\u0000";
            var21 = var7.split(">")[1];
            var30 = "_";
            var11.append(var21.split("<")[0]);
         }
      }

      StringBuffer var12 = new StringBuffer();
      var10000 = var5.toString();
      String var24 = "AB";
      String[] var8 = var10000.split("\\|");
      var10000 = var11.toString();
      var24 = "3\u001f";
      String[] var9 = var10000.split("\\|");

      int var10;
      for (int var19 = var10 = 0; var19 < var8.length && var10 < var9.length; var19 = var10) {
         if (!var12.toString().equals("")) {
            var24 = "B";
            var12.append("|");
         }

         StringBuilder var27 = new StringBuilder(String.valueOf(var8[var10]));
         String var32 = "^";
         StringBuilder var28 = var27.append("=");
         var32 = var9[var10];
         var10++;
         var12.append(var28.append(var32).toString());
      }

      return var12.toString();
   }

   public static String fy(int var0, int var1) {
      if (var0 == 1858) {
         String var136 = "因吕剳１巏斤夺亓倬圭犈怜皺产牗趗夤１觘双凞玚揮博趴备〼朝夤揍卹";
         StringBuilder var58 = new StringBuilder("回合前，己方处于倒地状态的人物越多，触发几率提升越多。最多提升").append(var1 * 20);
         String var109 = "Jｫ戯杪仕爊邒偱坟斕ｦち";
         return var58.append("%（所有人物都倒地时）。").toString();
      } else if (var0 == 1880) {
         String var135 = "叱唚兠禅圧旈１寇斤咲臷巏逽垵盥吲皙叒唹元趗夤１觘双凞玚揮博趴备〼朝夤揍卹";
         StringBuilder var57 = new StringBuilder("召唤兽离场时，对方和自己造型相同的召唤兽越多，触发几率提升越多。最多提升").append(var1 * 10);
         String var108 = "Jち";
         return var57.append("%。").toString();
      } else if (var0 == 1839) {
         String var134 = "夬贛旫Ｒ";
         StringBuilder var56 = new StringBuilder("失败时，").append(var1 * 10);
         String var107 = "F槭珤膅嶒乢欘从ち";
         return var56.append("%概率自己不死亡。").toString();
      } else if (var0 == 1600) {
         String var133 = "盐栚皺把弄劆兵里毱囃吶凒尯";
         StringBuilder var55 = new StringBuilder("目标的抗强力克金每回合减少").append(var1 * 2);
         String var106 = "Fね駵嚱呫乢冬屾ちｧ亦均厴剟仙爆佇寜斕異攫ねｪ";
         return var55.append("%。首回合不减少。（仅在受到人物伤害时生效。）").toString();
      } else if (var0 == 1601) {
         String var132 = "盐栚皺把弄劆兵朵毱囃吶凒尯";
         StringBuilder var54 = new StringBuilder("目标的抗强力克木每回合减少").append(var1 * 2);
         String var105 = "Fね駵嚱呫乢冬屾ちｧ亦均厴剟仙爆佇寜斕異攫ねｪ";
         return var54.append("%。首回合不减少。（仅在受到人物伤害时生效。）").toString();
      } else if (var0 == 1602) {
         String var131 = "盐栚皺把弄劆兵圂毱囃吶凒尯";
         StringBuilder var53 = new StringBuilder("目标的抗强力克土每回合减少").append(var1 * 2);
         String var104 = "Fね駵嚱呫乢冬屾ちｧ亦均厴剟仙爆佇寜斕異攫ねｪ";
         return var53.append("%。首回合不减少。（仅在受到人物伤害时生效。）").toString();
      } else if (var0 == 1603) {
         String var130 = "盐栚皺把弄劆兵氩毱囃吶凒尯";
         StringBuilder var52 = new StringBuilder("目标的抗强力克水每回合减少").append(var1 * 2);
         String var103 = "Fね駵嚱呫乢冬屾ちｧ亦均厴剟仙爆佇寜斕異攫ねｪ";
         return var52.append("%。首回合不减少。（仅在受到人物伤害时生效。）").toString();
      } else if (var0 == 1604) {
         String var129 = "盐栚皺把弄劆兵灶毱囃吶凒尯";
         StringBuilder var51 = new StringBuilder("目标的抗强力克火每回合减少").append(var1 * 2);
         String var102 = "Fね駵嚱呫乢冬屾ちｧ亦均厴剟仙爆佇寜斕異攫ねｪ";
         return var51.append("%。首回合不减少。（仅在受到人物伤害时生效。）").toString();
      } else if (var0 == 1605) {
         String var128 = "盳根皙抩旽屠怺会宮毱囃吶凒尯";
         StringBuilder var50 = new StringBuilder("目标的抗无属性伤害每回合减少").append(var1 * 1);
         String var101 = "Fね駵嚱呫乢冬屾ちｧ亦均厴剟仙爆佇寜斕異攫ねｪ";
         return var50.append("%。首回合不减少。（仅在受到人物伤害时生效。）").toString();
      } else if (var0 == 1850) {
         String var127 = "妟枢囃吶朶夺亓袕淪犈怜旈１丵囃吶脬淉榟玹揍卹";
         StringBuilder var48 = new StringBuilder("如果回合末处于被混状态时，下回合脱混概率提升").append(var1 * 5);
         String var99 = "Jち殠歂腞涔料ｯ";
         var48 = var48.append("%。每次脱混时，").append(var1 * 3);
         var99 = "\u001b榟玹莪復彎因吕皺児疕把淉敕枢〟抾胠觘双戨囃吶朶丳夙亰袶淉犫怿１颣夋榼玚渻雫〼";
         return var48.append("%概率获得当回合的免疫抗混效果。技能触发或回合末不处于被混状态，额外概率清零。").toString();
      } else if (var0 == 1852) {
         String var126 = "姭柿嚱呫杄奧仡裈屮狕恮斕｣乨嚱呫腞屢槭珤掿匤";
         StringBuilder var46 = new StringBuilder("如果回合末处于被封状态时，下回合脱封概率提升").append(var1 * 5);
         String var97 = "8〼毒欟脬尿旫Ｒ";
         var46 = var46.append("%。每次脱封时，").append(var1 * 3);
         var97 = "F槭珤菘忴弼嚽呧盧儢痈拸屢攧柿ね拣肒覅厾扵嚱呫杄乮奫仭裄屢狙恢｣飾她槡珨湦隙ち";
         return var46.append("%概率获得当回合的免疫抗封效果。技能触发或回合末不处于被封状态，额外概率清零。").toString();
      } else if (var0 == 1854) {
         String var125 = "妟枢囃吶朶夺亓袕必犈怜旈１丵囃吶脬忦榟玹揍卹";
         StringBuilder var44 = new StringBuilder("如果回合末处于被忘状态时，下回合脱忘概率提升").append(var1 * 5);
         String var95 = "Jち殠歂腞徻料ｯ";
         var44 = var44.append("%。每次脱忘时，").append(var1 * 3);
         var95 = "\u001b榟玹莪復彎因吕皺児疕把忦敕枢〟抾胠觘双戨囃吶朶丳夙亰袶忦犫怿１颣夋榼玚渻雫〼";
         return var44.append("%概率获得当回合的免疫抗忘效果。技能触发或回合末不处于被忘状态，额外概率清零。").toString();
      } else if (var0 == 1820) {
         String var124 = "辴坙料ｯ";
         StringBuilder var43 = new StringBuilder("进场时，").append(var1 * 10);
         String var94 = "8榼玚臔劵攅処彭剐衾釒朾尌卫佐〼";
         return var43.append("%概率自动攻击当前血量最少单位。").toString();
      } else if (var0 == 1822) {
         String var123 = "辴坙料ｯ";
         StringBuilder var42 = new StringBuilder("进场时，").append(var1 * 10);
         String var93 = "8榼玚臔劵攅処彭剐衾釒朾尌卫佐〼";
         return var42.append("%概率自动攻击当前血量最少单位。").toString();
      } else if (var0 == 1833) {
         String var122 = "骷组剩袡敔冘覉厲槭珤壱勃";
         StringBuilder var41 = new StringBuilder("高级分裂攻击触发概率增加").append(var1 * 1);
         String var92 = "8〼";
         return var41.append("%。").toString();
      } else if (var0 == 1831) {
         String var121 = "剩苒抭析覉厲料ｯ壱勃";
         StringBuilder var39 = new StringBuilder("分花拂柳触发时，增加").append(var1 * 1.5);
         String var90 = "8呃丰Ｒ";
         var39 = var39.append("%命中，").append(var1 * 2000);
         var90 = "敔冘勴ち";
         return var39.append("攻击力。").toString();
      } else if (var0 == 1834) {
         StringBuilder var38 = new StringBuilder(String.valueOf(var1 * 10));
         String var89 = "8榼玚悒刞发仸觘双业欼〼";
         return var38.append("%概率悬刃可以触发两次。").toString();
      } else if (var0 == 1836) {
         StringBuilder var37 = new StringBuilder(String.valueOf(var1 * 10));
         String var88 = "J槡珨逴惌厌亊覅厾乇歎ち";
         return var37.append("%概率遗患可以触发两次。").toString();
      } else if (var0 == 1835) {
         String var120 = "妼极举丷卫佐沟朔觘双Ｒ世举午佳觻可榟玹揍卹";
         StringBuilder var35 = new StringBuilder("如果一个单位没有触发，下一单位触发概率提升").append(var1 * 2);
         String var86 = "Jち覉厲料ｯ飲奵遏扳杯奄蠯醬";
         var35 = var35.append("%。触发时，额外造成最大血量").append(var1 * 1.5);
         var86 = "\u001b皙会宮〼毒因吕弾姖戨耘觘双举欼吰１颣夋榼玚彬雫〼";
         return var35.append("%的伤害。每回合开始或者触发一次后，额外概率归零。").toString();
      } else if (var0 == 1865) {
         String var119 = "攣旚仕爊区伮盫辽冔珤冠屲";
         StringBuilder var34 = new StringBuilder("敌方人物单位的连击率减少").append(var1 * 1);
         String var85 = "8〼";
         return var34.append("%。").toString();
      } else if (var0 == 1611) {
         StringBuilder var32 = new StringBuilder(String.valueOf(var1 * 5));
         String var83 = "F槭珤壱勃^匶伢ｯ嚱奮蠯沶殻俨壱勃";
         var32 = var32.append("%概率增加1单位，回复血法比例增加").append(var1 * 1);
         var83 = "8〼";
         return var32.append("%。").toString();
      } else if (var0 == 1871) {
         StringBuilder var31 = new StringBuilder(String.valueOf(var1 * 6));
         String var82 = "F槭珤壱勃^匶伢ち";
         return var31.append("%概率增加1单位。").toString();
      } else if (var0 == 1872) {
         StringBuilder var30 = new StringBuilder(String.valueOf(var1 * 6));
         String var81 = "\u001b榟玹境办,卫佐〼";
         return var30.append("%概率增加1单位。").toString();
      } else if (var0 == 1612) {
         StringBuilder var29 = new StringBuilder(String.valueOf(var1 * 10));
         String var80 = "F槭珤壱勃^匶伢ち";
         return var29.append("%概率增加1单位。").toString();
      } else if (var0 == 1838) {
         String var118 = "觻可吔亄头盆旫Ｒ";
         StringBuilder var28 = new StringBuilder("触发吉人天相时，").append(var1 * 10);
         String var79 = "J槡珨履杯奄蠯醬盫P_F較卵乕拇皑ち";
         return var28.append("%概率将最大血量的30%转化为护盾。").toString();
      } else if (var0 == 1873) {
         String var117 = "朒斤毱武亟丝且叱唚兠Ｒ揍卹";
         StringBuilder var26 = new StringBuilder("本方每死亡一个召唤兽，提升").append(2.0 + var1 * 0.3);
         String var77 = "F亶沶魓瀈拸恄ね乩阿壽勏膐";
         var26 = var26.append("%仙法鬼火抗性。上限增加至").append(30 + var1);
         var77 = "\u001b〟Ｖ曢捜厂敶极Ｗ";
         return var26.append("%。（替换原效果）").toString();
      } else if (var0 == 1884) {
         String var116 = "覉厲泦隝攧柿呡ｯ欋沶杀盧皁桤攟杪";
         StringBuilder var25 = new StringBuilder("触发沉雾效果后，此法术的目标数有").append(var1 * 10);
         String var76 = "\u001b榟玹凒尯厂朒盳根敭书仸\u000e3\r5就敭郖创榼玚凱,且午佳=侵(且午佳=\u000b-\u001b凒尯,且=\u000b-\u001b凒尯/且4〼";
         return var25.append("%概率减少原本目标数乘以0.3(小数部分概率减1个单位 例5个单位 50%减少1个 50%减少2个)。").toString();
      } else if (var0 == 1885) {
         String var115 = "奞赆料O";
         StringBuilder var24 = new StringBuilder("失败时,").append(var1 * 10);
         String var75 = "\u001b榟玹臷巏丐歅亼〼";
         return var24.append("%概率自己不死亡。").toString();
      } else if (var0 == 1891) {
         String var114 = "裈膛欘盫皍桨O戌阇沺醬殻俨掿匤";
         StringBuilder var23 = new StringBuilder("被致死的目标,扣除法量比例提升").append(var1 * 10);
         String var74 = "\u001b";
         return var23.append("%").toString();
      } else if (var0 == 1881) {
         StringBuilder var22 = new StringBuilder(String.valueOf(var1 * 8));
         String var73 = "J槡珨厵淧支旖駵久厏啋儞捨亇";
         return var22.append("%概率取消敌方首个召唤兽指令").toString();
      } else if (var0 == 1882) {
         StringBuilder var21 = new StringBuilder(String.valueOf(var1 * 10));
         String var72 = "8榼玚迃劽举囃吶";
         return var21.append("%概率追加一回合").toString();
      } else if (var0 == 1883) {
         String var20 = "伐厴剟佇寜壽勏P_F";
         return "使受到伤害增加30%";
      } else if (var0 == 1867) {
         String var113 = "抝胃陙办";
         StringBuilder var19 = new StringBuilder("技能附加").append(var1);
         String var71 = "陕呀瀖攧柿";
         return var19.append("阶启灵效果").toString();
      } else if (var0 == 1868) {
         StringBuilder var18 = new StringBuilder(String.valueOf(var1 * 10));
         String var70 = "\u001b榟玹丐甖迆兛冪半5叔伇甡敕举欼\u0017";
         return var18.append("%概率不用进入冷却(只会生效一次)").toString();
      } else if (var0 == 1869) {
         String var112 = "拯肞異攫槭珤掿匤";
         StringBuilder var17 = new StringBuilder("技能生效概率提升").append(var1 * 10);
         String var69 = "8〼";
         return var17.append("%。").toString();
      } else if (var0 == 1841) {
         String var111 = "掿骻厣篂佋寐";
         return "提高双管伤害" + var1 * 2000;
      } else if (var0 == 1842) {
         StringBuilder var16 = new StringBuilder(String.valueOf(var1 * 6));
         String var68 = "8榼玚颣夋因夐叒唹元並亄,\u000e8氪衝咲泈劥";
         return var16.append("%概率额外回复召唤兽主人10%气血和法力").toString();
      } else if (var0 == 1828) {
         StringBuilder var15 = new StringBuilder(String.valueOf(var1 * 6));
         String var67 = "J槡珨卵斏厌亊覅厾乇歎ち";
         return var15.append("%概率化无可以触发两次。").toString();
      } else if (var0 == 1829) {
         StringBuilder var14 = new StringBuilder(String.valueOf(var1 * 10));
         String var66 = "\u001b榟玹丐甖禦圄";
         return var14.append("%概率不用离场").toString();
      } else if (var0 == 1830) {
         StringBuilder var13 = new StringBuilder(String.valueOf(var1 * 6));
         String var65 = "J槡珨飾她嚽奢厏啋儞乔仙^SJ汷蠯哯沺勸";
         return var13.append("%概率额外回复召唤兽主人10%气血和法力").toString();
      } else if (var0 == 1606) {
         StringBuilder var12 = new StringBuilder(String.valueOf(var1 * 10));
         String var64 = "\u001b榟玹丐甖迆兛冪半5叔伇甡敕举欼\u0017";
         return var12.append("%概率不用进入冷却(只会生效一次)").toString();
      } else if (var0 == 1607) {
         StringBuilder var11 = new StringBuilder(String.valueOf(var1 * 10));
         String var63 = "F槭珤飲奵壱勃乯义皁桤";
         return var11.append("%概率额外增加一个目标").toString();
      } else if (var0 == 1608) {
         StringBuilder var10 = new StringBuilder(String.valueOf(var1 * 10));
         String var62 = "\u001b榟玹丐甖迆兛冪半5叔伇甡敕举欼\u0017";
         return var10.append("%概率不用进入冷却(只会生效一次)").toString();
      } else if (var0 == 1890) {
         StringBuilder var9 = new StringBuilder(String.valueOf(var1 * 10));
         String var61 = "J盧槭珤壱勃乯义区伮";
         return var9.append("%的概率增加一个单位").toString();
      } else if (var0 == 1895) {
         String var110 = "抝胃甂敶榟玹揍卹";
         StringBuilder var8 = new StringBuilder("技能生效概率提升").append(var1 * 20);
         String var60 = "F";
         return var8.append("%").toString();
      } else if (var0 == 1900) {
         String var10002 = "禦圄旫\u0012栤捐攲揊刊衖朷兛圧皺叱唚兠丰彎剳禦圄叱唚兠逞垖盆向皺丷敎1颣夋墠劽闔玭榼玚〼毒且境办";
         StringBuilder var6 = new StringBuilder("离场时,根据支援列表未入场的召唤兽与当前离场召唤兽造型相同的个数,额外增加闪现概率。每个增加").append(0.2 * var1);
         String var10001 = "JK杯她壱勃";
         var6 = var6.append("%(最多增加").append(1 * var1);
         var10001 = "8\u0017";
         return var6.append("%)").toString();
      } else {
         if (var0 == 3036) {
            if (var1 == 1) {
               String var5 = "支旖厏啋儞杦RWF乤嚽呧乮肒醩救膉軄摙幉拣肒ちｧ乮卪呈厃啇儒拣肒ｪ杦PJ拖拸支旖盧奆质古剕";
               return "敌方召唤兽有18%下回合不能释放自身携带技能。（不包含召唤兽技能）有3%抵抗敌方的天赋压制";
            }

            if (var1 == 2) {
               String var4 = "敲斤叒唹元朔\u000f$\u001b世因吕丳胠釴攣臔躶搄帻抾胠〿丐胃觻可冘万敕枢咑斃攣冻两抾胠〼朔\n3\u000b8抋把敲斤皺头赵厖刈";
               return "敌方召唤兽有19%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能。有4.5%抵抗敌方的天赋压制";
            }

            if (var1 == 3) {
               String var3 = "攣旚厃啇儒杪]SJ乨嚱呫乢肞醥敝膅軈摕幅拯肞の乮肒覅厾処乖攫柳哯旒敝凪乚拯肞の乮肒侾拋儕亹皍桨ち杦UJ拖拸支旖盧奆质古剕";
               return "敌方召唤兽有20%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能、不能保护其他目标。有6%抵抗敌方的天赋压制";
            }

            if (var1 == 4) {
               String var2 = "敲斤叒唹元朔\f,\u001b世因吕丳胠釴攣臔躶搄帻抾胠〿丐胃觻可冘万敕枢咑斃攣冻两抾胠〿丐胃俀抚八宽盳根〜丳胠迥衑牗琛攅処〼朔\t3\u000b8抋把敲斤皺头赵厖刈";
               return "敌方召唤兽有21%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能、不能保护其它目标、不能进行物理攻击。有7.5%抵抗敌方的天赋压制";
            }

            if (var1 == 5) {
               String var10000 = "支旖厏啋儞杦Q]F乤嚽呧乮肒醩救膉軄摙幉拣肒ぢ乢肞覉厲凪乚攧柿哣旞救処乖拣肒ぢ乢肞遦把侲拇の乮肒辸蠣爊瑩敘冔ぢ乢肞伐畋爆咢桠ち杦ZJ拖拸支旖盧奆质古剕";
               return "敌方召唤兽有22%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能、不能选择保护、不能进行物理攻击、不能使用物品栏。有9%抵抗敌方的天赋压制";
            }
         }

         return null;
      }
   }

   public void ew(RoleSummoning var1) {
      this.h();
      if (var1 != null) {
         ArrayList var2 = new ArrayList();
         if (var1.getPetSkills() != null && !var1.getPetSkills().equals("")) {
            String var10000 = var1.getPetSkills();
            String var10001 = "3\u001f";
            String[] var3 = var10000.split("\\|");

            int var4;
            for (int var20 = var4 = 0; var20 < var3.length; var20 = ++var4) {
               var10000 = var3[var4];
               var10001 = "r";
               if (!var10000.startsWith("L")) {
                  var10000 = var3[var4];
                  var10001 = "2";
                  if (!var10000.startsWith("Q")) {
                     var10000 = var3[var4];
                     var10001 = "j";
                     if (!var10000.startsWith("T")) {
                        var10000 = var3[var4];
                        var10001 = ";";
                        if (!var10000.startsWith("X")) {
                           var2.add(var3[var4]);
                        }
                     }
                  }
               }
            }
         }

         int var10 = var1.getOpenSealByType(0);
         int var11 = var1.getOpenSealByType(1);

         int var5;
         for (int var25 = var5 = 0; var25 < 9; var25 = ++var5) {
            if (var5 >= var10) {
               if (this.za().gamePetSkill && var5 >= var11) {
                  this.ht[var5].cc(-2, -1);
               } else {
                  this.ht[var5].cc(-1, -1);
               }
            } else if (var5 == 6 && var1.getBeastSkills() != null && !var1.getBeastSkills().equals("")) {
               this.ht[6].cc(Integer.parseInt(var1.getBeastSkills()), -1);
            } else if (var5 < 6 && var2 != null && var5 < var2.size() || var5 > 6 && var2 != null && var5 - 1 < var2.size()) {
               String var6;
               String var26 = var6 = (String)var2.get(var5 < 6 ? var5 : var5 - 1);
               String var34 = "\u0003";
               int var7;
               int var8 = (var7 = var26.indexOf("=")) == -1 ? -1 : Integer.parseInt(var6.substring(var7 + 1));
               this.ht[var5].cc(Integer.parseInt(var7 == -1 ? var6 : var6.substring(0, var7)), var8);
            } else {
               this.ht[var5].cc(0, -1);
            }
         }

         var5 = 0;
         if (var1.getSkill() != null && !var1.getSkill().equals("")) {
            String var27 = var1.getSkill();
            String var35 = "3\u001f";
            String[] var14 = var27.split("\\|");

            int var16;
            for (int var28 = var16 = 0; var28 < var14.length; var28 = ++var16) {
               Skill var18;
               if ((var18 = this.yt().ac(var14[var16])) != null) {
                  Class24 var9 = this.ga(var5);
                  var5++;
                  var9.setVisible(true);
                  var9.cc(Integer.parseInt(var18.getSkillid()), -1);
               }
            }
         }

         com.xy.v.Class8 var29 = this.yt();
         String var36 = ".\u000e.\b";
         Skill var15;
         if ((var15 = var29.ac("3036")) != null) {
            Class24 var17 = this.ga(var5);
            var5++;
            var17.setVisible(true);
            int var19 = var1.getTFNum();
            var17.cc(Integer.parseInt(var15.getSkillid()), var19 > 0 ? var19 : -1);
            var17.setBounds(482, 50, 55, 55);
         }
      }
   }

   public static boolean fz(int var0, GameClient var1) {
      return var1.gameType != 2
            || (var0 < 1606 || var0 > 1608)
               && (var0 < 1828 || var0 > 1830)
               && (var0 < 1840 || var0 > 1842)
               && (var0 < 1867 || var0 > 1869)
               && (var0 < 1881 || var0 > 1883)
         ? var0 >= 1600 && var0 <= 1605
            || var0 == 1611
            || var0 == 1612
            || var0 == 1820
            || var0 == 1822
            || var0 == 1831
            || var0 == 1833
            || var0 >= 1834 && var0 <= 1836
            || var0 == 1838
            || var0 == 1839
            || var0 == 1850
            || var0 == 1852
            || var0 == 1854
            || var0 == 1858
            || var0 == 1865
            || var0 >= 1871 && var0 <= 1873
            || var0 == 1880
            || var0 == 1884
            || var0 == 1885
            || var0 == 1606
            || var0 == 1607
            || var0 == 1608
            || var0 == 1828
            || var0 == 1829
            || var0 == 1830
            || var0 == 1841
            || var0 == 1842
            || var0 == 1867
            || var0 == 1868
            || var0 == 1869
            || var0 == 1881
            || var0 == 1882
            || var0 == 1883
            || var0 == 1890
            || var0 == 1891
            || var0 == 1895
            || var0 == 1900
         : false;
   }

   public Class24 ga(int var1) {
      if (var1 < this.eq.size()) {
         this.eq.get(var1).setBounds(55 + 57 * var1, 50, 55, 55);
         return this.eq.get(var1);
      } else {
         Class24 var2 = new Class24(this, 0, this.eq.size());
         this.gd(var2);
         return var2;
      }
   }

   public void f() {
      if (!this.afx.ah()) {
         RoleSummoning var1;
         if ((var1 = this.yx().getChosePet()) != null) {
            Skill var2;
            if ((var2 = this.ft()) == null) {
               GameView var25 = this.ze();
               String var32 = "诉途拗丝且抝胃";
               var25._do("请选择一个技能");
            } else {
               boolean var3 = false;
               String var4;
               if ((var4 = var1.getBeastSkills()) != null && var4.equals(var2.getSkillid())) {
                  var3 = true;
               }

               boolean var15;
               label100: {
                  if (!var3 && (var4 = var1.getPetSkills()) != null && !var4.equals("")) {
                     String var10001 = "3\u001f";
                     String[] var5 = var4.split("\\|");

                     int var6;
                     for (int var10000 = var6 = 0; var10000 < var5.length; var10000 = ++var6) {
                        String var14 = var5[var6];
                        var10001 = "\u0003";
                        if (var14.indexOf("=") == -1) {
                           if (var5[var6].equals(var2.getSkillid())) {
                              var15 = var3 = true;
                              break label100;
                           }
                        } else {
                           String var16 = var5[var6];
                           StringBuilder var27 = new StringBuilder(String.valueOf(var2.getSkillid()));
                           String var10002 = "^";
                           if (var16.startsWith(var27.append("=").toString())) {
                              var15 = var3 = true;
                              break label100;
                           }
                        }
                     }
                  }

                  var15 = var3;
               }

               if (!var15) {
                  GameView var24 = this.ze();
                  String var31 = "丐胃刽陚头甡抝胃";
                  var24._do("不能删除天生技能");
               } else if (!this.za().l(2, 12)) {
                  GameView var23 = this.afx;
                  StringBuilder var36 = new StringBuilder().append(var1.getSid());
                  String var41 = "B";
                  String var37 = var36.append("|").append(var2.getSkillid()).toString();
                  String var46 = "@6伃码对觮剃阋CL$";
                  StringBuilder var42 = new StringBuilder("#Y你确定要删除 #G").append(var2.getSkillname());
                  String var44 = ">g迄且抝胃吊\u0001";
                  var23.dm(new ConfirmBean(12, var37, var42.append("#Y这个技能吗?").toString()));
               } else {
                  String var17 = var2.getSkilltype();
                  String var28 = "P";
                  if (var17.equals("3")) {
                     String var18 = var2.getSkillid();
                     var28 = ".\u000e.\n";
                     if (!var18.equals("3034")) {
                        int var11 = 0;

                        int var12;
                        for (int var19 = var12 = 0; var19 < this.ht.length; var19 = ++var12) {
                           Skill var7 = Class24.pi(this.ht[var12]) > 0 ? this.yt().ac(String.valueOf(Class24.pi(this.ht[var12]))) : null;
                           if (var7 != null) {
                              String var20 = var7.getSkilltype();
                              var28 = "P";
                              if (var20.equals("3")) {
                                 var11++;
                              }
                           }
                        }

                        if (var11 >= 2) {
                           var12 = var11 == 2 ? 100 : (var11 == 3 ? 500 : 3000);
                           if (this.za().f()) {
                              var12 = var11 == 2 ? 100 : (var11 == 3 ? 200 : 500);
                           }

                           GameView var22 = this.afx;
                           StringBuilder var34 = new StringBuilder().append(var1.getSid());
                           String var39 = "B";
                           String var35 = var34.append("|").append(var2.getSkillid()).toString();
                           String var45 = "L:伏晌呉觢码对苞赚";
                           StringBuilder var40 = new StringBuilder("#Y你是否要确定花费").append(var12);
                           String var43 = "科创\u0012迆衲绕枿抝胃釐俐";
                           var22.dm(new ConfirmBean(12, var35, var40.append("积分,进行终极技能重修").toString()));
                           return;
                        }
                     }
                  }

                  GameView var21 = this.afx;
                  StringBuilder var10004 = new StringBuilder().append(var1.getSid());
                  String var10005 = "\u001f";
                  String var33 = var10004.append("|").append(var2.getSkillid()).toString();
                  String var10007 = "\u001dD佞昲吘覜硐宇芏贤\u000f-i夺诣帜\u0012刽陚>y";
                  StringBuilder var38 = new StringBuilder("#Y你是否要确定花费10W大话币,删除#G").append(var2.getSkillname());
                  String var10006 = "L:辶义拯肞呸ｼG姡柳晌级柢拯肞乻泂杦飥惰\\P\\併醮侁扳P\\PJ";
                  var21.dm(new ConfirmBean(12, var33, var38.append("#Y这个技能吗？(如果是终极技能且没有领悟???会重修成???)").toString()));
               }
            }
         }
      }
   }

   @Override
   public void l() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         this.ew(var1.getChosePet());
         super.l();
      }
   }

   public static String gb(int var0, Skill var1, double var2, int var4, int var5) {
      if (var0 < 1001 || var0 > 1100) {
         return null;
      } else if (var1.getFormulas() != null) {
         return fq(var0, var1, var2, var4, var5);
      } else {
         String var6 = var1.getRemark();
         int var7 = Integer.parseInt(var1.getSkilllevel());
         double var8 = Double.parseDouble(var1.getGrow());
         double var10 = Double.parseDouble(var1.getDielectric());
         double var12 = Double.parseDouble(var1.getValue());
         String var20;
         if (var0 <= 1005) {
            var20 = "淪乏";
            var20 = "混乱";
         } else if (var0 <= 1010) {
            var20 = "屮匓";
            var20 = "封印";
         } else if (var0 <= 1015) {
            var20 = "昒睟";
            var20 = "昏睡";
         } else if (var0 <= 1020) {
            var20 = "乂殱";
            var20 = "中毒";
         } else if (var0 <= 1025) {
            var20 = "霚慯";
            var20 = "震慑";
         } else if (var0 <= 1030) {
            var20 = "勴醬";
            var20 = "力量";
         } else if (var0 <= 1035) {
            var20 = "把怙";
            var20 = "抗性";
         } else if (var0 <= 1040) {
            var20 = "勏遼";
            var20 = "加速";
         } else if (var0 <= 1045) {
            var20 = "飰";
            var20 = "风";
         } else if (var0 <= 1050) {
            var20 = "隔";
            var20 = "雷";
         } else if (var0 <= 1055) {
            var20 = "氊";
            var20 = "水";
         } else if (var0 <= 1060) {
            var20 = "瀈";
            var20 = "火";
         } else if (var0 <= 1065) {
            var20 = "鬡灕";
            var20 = "鬼火";
         } else if (var0 <= 1070) {
            var20 = "乪屗蘈";
            var20 = "三尸虫";
         } else if (var0 <= 1075) {
            var20 = "遊忦";
            var20 = "遗忘";
         } else if (var0 <= 1080) {
            var20 = "\u001c\u000e\u0002\u000b";
            var20 = "smmh";
         } else if (var0 <= 1085) {
            var20 = "霤雍";
            var20 = "霹雳";
         } else if (var0 <= 1090) {
            var20 = "泈沁";
            var20 = "沧波";
         } else if (var0 <= 1095) {
            var20 = "甅霨";
            var20 = "甘霖";
         } else {
            var20 = "戙搤";
            var20 = "扶摇";
         }

         String var14 = var20;
         String var10001 = "a且敭B";
         var6 = var6.replace("|个数|", String.valueOf(FBUtil.e(var7, (int)var2, var14)));
         if (var0 > 1015 && (var0 < 1071 || var0 > 1075)) {
            if (var0 <= 1020) {
               BigDecimal var17 = new BigDecimal((int)((var12 + var2 * var8 / 1000.0) * 1000.0) / 15.0 * 17.0);
               var10001 = "a会宮B";
               String var58;
               if (var7 > 3) {
                  var58 = "^V";
                  var58 = "15";
               } else if (var7 > 1) {
                  var58 = ",\f3\u000b";
                  var58 = "12.5";
               } else {
                  var58 = "^S";
                  var58 = "10";
               }

               var20 = var6.replace("|伤害|", var58);
               var10001 = "a凞玚B";
               var20 = var20.replace("|几率|", var17.setScale(2, 4).toString());
               var10001 = "\u0013嚽呧\u001f";
               var58 = "\r";
               var20 = var20.replace("|回合|", "3");
            } else if (var0 > 1040 && (var0 < 1076 || var0 > 1080)) {
               if (var0 > 1065 && var0 < 1081) {
                  if (var0 <= 1070) {
                     var10001 = "\u0013佇寜\u001f";
                     var20 = var6.replace("|伤害|", String.valueOf((int)((var12 * var4 + var2 * var8 / 1000.0) * 1000.0)));
                     var10001 = "a凞玚B";
                     var6 = var20.replace("|几率|", String.valueOf((int)(var12 * 100.0 + (int)(var2 / 250.0))));
                  }

                  var20 = var6;
               } else {
                  BigDecimal var19 = new BigDecimal((var12 + var8 * (1.0 + 5.0 * var2 / 5000.0 * (10.0 - var2 / 5000.0) / 2.0)) * var4);
                  var10001 = "a会宮B";
                  var20 = var6.replace("|伤害|", String.valueOf(var19.intValue()));
               }
            } else {
               BigDecimal var18 = new BigDecimal((int)((var12 + var2 * var8 / 1000.0) * 1000.0) / 10.0);
               var10001 = "\u0013嚽呧\u001f";
               String var62 = "\t";
               var20 = var6.replace("|回合|", "7");
               var10001 = "\u0013佇寜\u001f";
               var20 = var20.replace("|伤害|", var18.setScale(2, 4).toString());
            }
         } else {
            BigDecimal var15 = new BigDecimal(var12 + var8 * new BigDecimal(Math.pow(var2, 0.3)).setScale(2, 4).doubleValue());
            var10001 = "\u0013冃珨\u001f";
            var20 = var6.replace("|几率|", var15.setScale(2, 4).toString());
            var10001 = "a因吕B";
            String var10002 = "T";
            var20 = var20.replace("|回合|", "7");
         }

         var10001 = "\u001f蒲\u001f";
         return var20.replace("|蓝|", String.valueOf((int)(var10 * (var2 / 25000.0 + 1.0))));
      }
   }

   public static String gc(RoleSummoning var0, int var1, int var2, Skill var3, GameClient var4) {
      StringBuffer var5 = new StringBuffer();
      StringBuffer var10000;
      if (var1 == 3036) {
         var10000 = var5;
         var5.append(var3.getSkillname());
      } else {
         if (var1 < 1100) {
            String var11;
            if ((var11 = gb(var1, var3, 1.0, 200, 4)) != null) {
               var5.append(var11);
               return var5.toString();
            }
         } else {
            String var6 = !var4.gameBattle && var1 != 1282 ? fx(var3.getRemark()) : var3.getRemark();
            if (var4.gameBattle || var1 == 1282) {
               var5.append(var6);
               return var5.toString();
            }

            String var10001 = "AB";
            String[] var7 = var6.split("\\|");

            int var8;
            for (int var12 = var8 = 0; var12 < var7.length; var12 = ++var8) {
               var10001 = var7[var8];
               String var10002 = "^";
               String[] var9 = var10001.split("=");
               String var10;
               if ((var10 = fw(var7, var8)) != null) {
                  var8++;
                  String var10003 = ">]";
                  StringBuilder var14 = new StringBuilder("#c").append(var9[0]);
                  var10002 = "C";
                  StringBuilder var15 = var14.append(" ").append(var9[1]);
                  var10002 = ">]";
                  StringBuilder var16 = var15.append("#c");
                  var10002 = var7[var8];
                  var10003 = "^";
                  StringBuilder var17 = var16.append(var10002.split("=")[0]).append(var10);
                  var10002 = ">L";
                  var5.append(var17.append("#r").toString());
               } else {
                  String var27 = "L\u0000";
                  StringBuilder var18 = new StringBuilder("#c").append(var9[0]);
                  var10002 = "\u001e";
                  StringBuilder var19 = var18.append(" ").append(var9[1]);
                  var10002 = "L\u0011";
                  var5.append(var19.append("#r").toString());
               }
            }
         }

         var10000 = var5;
      }

      return var10000.toString();
   }

   public void g(int var1) {
      if (var1 == 45) {
         RoleSummoning var2;
         if ((var2 = this.yx().getChosePet()) == null) {
            return;
         }

         if (Class63.apm(this.hv) == null) {
            String var4 = "讔遦把乯义拯肞";
            this.afx._do("请选择一个技能");
            return;
         }

         String var10003 = "Lr";
         StringBuilder var10001 = new StringBuilder("QL").append(Class63.apm(this.hv).getSkillid());
         String var10002 = "\u001f";
         String var3 = Agreement.getSendTextAES("userpet", var10001.append("|").append(var2.getSid()).toString());
         this.za().k(var3);
      }
   }

   public void gd(Class24 var1) {
      var1.setBounds(55 + 57 * this.eq.size(), 50, 55, 55);
      this.eq.add(var1);
      this.add(var1, 0);
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.eq.size(); var10000 = var1) {
         Object var3 = this.eq.get(var1);
         var1++;
         ((Class24)var3).setVisible(false);
      }

      for (int var4 = var1 = 0; var4 < this.ht.length; var4 = var1) {
         Class24 var5 = this.ht[var1];
         var1++;
         var5.cc(-1, -1);
      }

      this.fp(null, 0, 0, null, true);
   }
}
