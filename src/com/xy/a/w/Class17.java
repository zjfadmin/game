package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.entity.PackRecord;
import com.xy.formula.BaseMeridians;
import com.xy.game.NpcOption;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class20;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JList;

public class Class17 extends com.xy.q.Class30 {
   private int aa;
   private com.xy.w.Class18[] sk;
   private com.xy.i.Class20 we;
   private List<NpcOption> tr;
   private JLabel[] ay;
   private com.xy.i.Class20[] wf;
   private Class8 wg;
   private Class8 wh;

   public void c() {
      String var3;
      if ((var3 = this.yx().getPrivateData().getBorn()) != null && !var3.equals("")) {
         String var10001 = "f\b";
         String[] var4 = var3.split("\\|");
         int var5 = 0;

         int var6;
         for (int var10000 = var6 = 0; var10000 < var4.length; var10000 = ++var6) {
            String var17 = var4[var6];
            var10001 = "古尊怏";
            if (var17.startsWith("双属性")) {
               String var18 = var4[var6];
               var10001 = "R";
               String[] var13 = var18.split("&");

               int var14;
               for (int var19 = var14 = 1; var19 < var13.length; var19 = var14) {
                  BigDecimal var11;
                  String var16;
                  label38: {
                     var10001 = var13[var14];
                     String var35 = "\u0015";
                     int var15 = var10001.indexOf("=");
                     var16 = var13[var14].substring(0, var15);
                     var11 = new BigDecimal(var13[var14].substring(var15 + 1));
                     var10001 = "r$截锋";
                     if (!var16.equals("HP成长")) {
                        var10001 = "\u0019x扄镗";
                        if (!var16.equals("MP成长")) {
                           var10001 = "{$截锋";
                           if (!var16.equals("AP成长")) {
                              var10001 = "\u0007x扄镗";
                              if (!var16.equals("SP成长")) {
                                 break label38;
                              }
                           }
                        }
                     }

                     var11 = com.xy.v.Class4.e(var11.doubleValue(), 100.0);
                  }

                  NpcOption var12 = this.ca(var5);
                  var5++;
                  StringBuilder var33 = new StringBuilder(String.valueOf(var16));
                  String var36 = "N";
                  var12.setTextSize(var33.append(":").append(com.xy.v.Class12.e(var11.doubleValue(), 1)).toString(), 130);
                  var14++;
                  this.wg.d(var12);
               }
            } else {
               String var8;
               BigDecimal var9;
               label50: {
                  var10001 = var4[var6];
                  String var10002 = "\u0015";
                  int var7 = var10001.indexOf("=");
                  var8 = var4[var6].substring(0, var7);
                  var9 = new BigDecimal(var4[var6].substring(var7 + 1));
                  var10001 = "r$截锋";
                  if (!var8.equals("HP成长")) {
                     var10001 = "\u0019x扄镗";
                     if (!var8.equals("MP成长")) {
                        var10001 = "{$截锋";
                        if (!var8.equals("AP成长")) {
                           var10001 = "\u0007x扄镗";
                           if (!var8.equals("SP成长")) {
                              break label50;
                           }
                        }
                     }
                  }

                  var9 = com.xy.v.Class4.e(var9.doubleValue(), 100.0);
               }

               NpcOption var10;
               NpcOption var26 = var10 = this.ca(var5);
               var5++;
               StringBuilder var34 = new StringBuilder(String.valueOf(var8));
               String var10003 = "N";
               var26.setTextSize(var34.append(":").append(com.xy.v.Class12.e(var9.doubleValue(), 1)).toString(), 130);
               this.wh.d(var10);
            }
         }
      }
   }

   public void e() {
      RoleData var1 = this.yx();
      if (this.aa == 0) {
         LoginResult var2;
         LoginResult var10000 = var2 = var1.getLoginResult();
         int var3 = com.xy.v.Class4.q(var10000.getGrade());
         int var4 = com.xy.v.Class4.s(var10000.getGrade());
         StringBuffer var5;
         StringBuffer var27 = var5 = new StringBuffer();
         String var10001 = "6";
         var27.append("B");
         int var6 = 0;

         for (int var28 = var6; var28 < 5; var28 = ++var6) {
            if (var6 != 4 || var3 == 4) {
               if (var6 != 0) {
                  var10001 = "\u0015";
                  var5.append("=");
               }

               if (var6 == 0) {
                  var5.append(var2.getBone() - var4);
               } else if (var6 == 1) {
                  var5.append(var2.getSpir() - var4);
               } else if (var6 == 2) {
                  var5.append(var2.getPower() - var4);
               } else if (var6 == 3) {
                  var5.append(var2.getSpeed() - var4);
               } else {
                  var5.append(var2.getCalm() - var4);
               }
            }
         }

         PackRecord var39 = var1.getPackRecord();
         String var10003 = "6";
         BigDecimal[] var20 = var39.getBaseValue(5, "B");
         PackRecord var29 = var1.getPackRecord();
         var10001 = "j";
         var29.setEquip("B", var5.toString());

         int var7;
         for (int var30 = var7 = 0; var30 < var20.length; var30 = ++var7) {
            if (var7 == 4 && var3 != 4) {
               var2.setCalm(0);
            } else {
               int var8 = var20[var7] != null ? var20[var7].intValue() : 0;
               var8 += var4;
               if (var7 == 0) {
                  var2.setBone(var8);
               } else if (var7 == 1) {
                  var2.setSpir(var8);
               } else if (var7 == 2) {
                  var2.setPower(var8);
               } else if (var7 == 3) {
                  var2.setSpeed(var8);
               } else {
                  var2.setCalm(var8);
               }
            }
         }
      } else if (this.aa == 1) {
         PrivateData var9;
         String var12;
         if ((var12 = (var9 = var1.getPrivateData()).getBorn()) == null || var12.equals("")) {
            return;
         }

         StringBuffer var15 = new StringBuffer();
         String var17 = null;
         String var41 = "f\b";
         String[] var21 = var12.split("\\|");

         int var24;
         for (int var31 = var24 = 0; var31 < var21.length; var31 = ++var24) {
            String var32 = var21[var24];
            var41 = "古尊怏";
            if (var32.startsWith("双属性")) {
               String var33 = var21[var24].substring(4);
               var41 = "R";
               String var10002 = "T";
               var17 = var33.replace("&", "|");
            } else {
               if (var15.length() == 0) {
                  var41 = "厸層恓";
                  var15.append("双属性");
               }

               var41 = "\u000e";
               var15.append("&");
               var15.append(var21[var24]);
            }
         }

         RoleData var35;
         label131: {
            if (var15.length() != 0) {
               if (var17 == null || var17.equals("")) {
                  var17 = var15.toString();
                  var35 = var1;
                  break label131;
               }

               StringBuilder var34 = new StringBuilder(String.valueOf(var17));
               var41 = "\b";
               var17 = var34.append("|").append(var15.toString()).toString();
            }

            var35 = var1;
         }

         var17 = var35.getRoleProperty().g(null, var17);
         var9.setBorn(var17);
      } else if (this.aa == 2) {
         Vector var10 = var1.getRoleProperty().meridiansVector;
         StringBuffer var13 = new StringBuffer();
         BaseMeridians var16 = null;
         BaseMeridians var19 = null;

         int var22;
         for (int var36 = var22 = 0; var36 < var10.size(); var36 = ++var22) {
            BaseMeridians var25;
            if ((var25 = (BaseMeridians)var10.get(var22)).getBh() == 0) {
               var16 = var25;
            } else if (var25.getBh() == 99) {
               var19 = var25;
            } else {
               BaseMeridians var37;
               if (var13.length() == 0) {
                  String var47 = "\u0011m\u0015";
                  var13.append("99=");
                  var37 = var25;
               } else {
                  String var48 = "R";
                  var13.append("&");
                  var37 = var25;
               }

               var37.a(var13);
            }
         }

         if (var13.length() == 0) {
            return;
         }

         if (var19 != null) {
            if (var13.length() != 0) {
               String var49 = "T";
               var13.append("|");
            }

            String var50 = var19.getKey();
            String var52 = "R";
            String var53 = "T";
            var13.append(var50.replace("&", "|"));
         }

         if (var16 != null) {
            if (var13.length() != 0) {
               String var51 = "\b";
               var13.append("|");
            }

            var16.a(var13);
         }

         LoginResult var23;
         (var23 = var1.getLoginResult()).setMeridians(var13.toString());
         var1.getRoleProperty().meridiansVector.clear();
         var1.getRoleProperty().t(var23.getMeridians());
      }

      String var54 = "\u0011x";
      String var11 = Agreement.getSendTextAES("rolechange", "EP" + this.aa);
      this.za().k(var11);
      var1.getRoleProperty().e();
      JList var14 = Class8.b(this.wh);
      this.wh.a(Class8.b(this.wg));
      this.wg.a(var14);
   }

   public NpcOption ca(int var1) {
      NpcOption var2 = var1 < this.tr.size() ? this.tr.get(var1) : null;
      if (var2 == null) {
         var2 = new NpcOption(this);
         this.tr.add(var2);
      }

      return var2;
   }

   public void f() {
      int var1 = 0;
      Vector var3 = this.yx().getRoleProperty().meridiansVector;

      int var4;
      for (int var10000 = var4 = 0; var10000 < var3.size(); var10000 = ++var4) {
         BaseMeridians var5;
         if ((var5 = (BaseMeridians)var3.get(var4)).getBh() != 0) {
            if (var5.getBh() == 99) {
               String var14 = var5.getKey();
               String var19 = "\u000e";
               String[] var12 = var14.split("&");

               int var7;
               for (int var15 = var7 = 0; var15 < var12.length; var15 = ++var7) {
                  String[] var8;
                  if ((var8 = var12[var7].split("_")).length == 5) {
                     int var9 = Integer.parseInt(var8[0]);
                     int var10003 = Integer.parseInt(var8[1]);
                     int var10004 = Integer.parseInt(var8[2]);
                     String var10005;
                     String[] var10006;
                     if (var8.length == 5) {
                        var10005 = var8[3];
                        var10006 = var8;
                     } else {
                        var10005 = null;
                        var10006 = var8;
                     }

                     BaseMeridians var16 = new BaseMeridians(
                        var9, var10003, var10004, var10005, var10006.length == 5 ? Double.parseDouble(var8[4]) : 0.0
                     );
                     BaseMeridians var10 = var16;
                     NpcOption var11 = this.ca(var1);
                     var1++;
                     StringBuilder var17 = new StringBuilder(String.valueOf(var10.getKey()));
                     String var22 = "N";
                     StringBuilder var20 = var17.append(":");
                     var22 = "q\u0006eN";
                     var11.setTextSize(var20.append(String.format("%.1f", var10.getKeyValue())).toString(), 130);
                     this.wg.d(var11);
                  }
               }
            } else {
               NpcOption var6;
               NpcOption var13 = var6 = this.ca(var1);
               var1++;
               StringBuilder var10001 = new StringBuilder(String.valueOf(var5.getKey()));
               String var10002 = "N";
               var10001 = var10001.append(":");
               var10002 = "q\u0006eN";
               var13.setTextSize(var10001.append(String.format("%.1f", var5.getKeyValue())).toString(), 130);
               this.wh.d(var6);
            }
         }
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.aa = var1;

      for (int var2 = 0; var10000 < this.wf.length; var10000 = ++var2) {
         this.wf[var2].setKeep(var2 == var1);
      }

      this.wh.c();
      this.wg.c();
      Class17 var3;
      if (this.aa == 0) {
         this.h();
         var3 = this;
      } else if (this.aa == 1) {
         var3 = this;
         this.c();
      } else {
         if (this.aa == 2) {
            this.f();
         }

         var3 = this;
      }

      var3.wh.a(Class8.b(this.wh));
      this.wg.a(Class8.b(this.wg));
   }

   public Class17(GameView var1) {
      super(132, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "'K{L{\u0019zX:O";
      this.yy(-2, 0, 422, 320, com.xy.q.Class30.agh);
      com.xy.w.Class9 var18 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "刽挖層恓";
      this.yu(var18, "切换属性");
      this.wf = new com.xy.i.Class20[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.wf.length; var10000 = var2) {
         com.xy.i.Class20[] var5 = this.wf;
         var10004 = "[7\u00071\u0007g\u0010zX:O";
         int var10006 = 51 + var2;
         String var27;
         Class17 var10010;
         if (var2 == 0) {
            var27 = "尪\u001a恓";
            var27 = "属 性";
            var10010 = this;
         } else if (var2 == 1) {
            var27 = "侺歋";
            var27 = "修正";
            var10010 = this;
         } else if (var2 == 2) {
            var27 = "绵腽";
            var27 = "经脉";
            var10010 = this;
         } else {
            var27 = "";
            var10010 = this;
         }

         Class20 var10002 = new Class20("sc/e/38.png", 2, var10006, Class49.bx, Class49.bv, var27, var10010);
         var5[var2] = var10002;
         this.wf[var2].setOffsetTexts(Class49.d);
         this.wf[var2].setBounds(58 + 102 * var2, 22, 95, 33);
         this.add(this.wf[var2++]);
      }

      this.tr = new ArrayList<>();
      this.wh = new Class8(this, 0, this);
      this.wg = new Class8(this, 1, this);
      if (this.za().VALUE.indexOf(67) == -1) {
         this.wf[2].setVisible(false);
      }

      String var10008 = "'K{M{\u001fzX:O";
      String var10013 = "刽挖";
      this.we = new com.xy.i.Class20("sc/e/7.png", 1, 54, Class49.ch, Class49.bv, "切换", this);
      this.we.setBounds(192, 276, 59, 25);
      this.add(this.we);
      this.ay = new JLabel[2];

      for (int var6 = var2 = 0; var6 < this.ay.length; var6 = var2) {
         this.ay[var2] = com.xy.q.Class1.k(67 + var2 % 2 * 176, 99 + var2 / 2 * 24, 36, 18, Color.black, Class49.ch);
         Class17 var7;
         if (var2 == 0) {
            var7 = this;
            JLabel var25 = this.ay[var2];
            String var10005 = "弇剥呻甀";
            var25.setText("当前启用");
            this.ay[var2].setForeground(Color.green);
            this.ay[var2].setFont(Class49.a);
            this.ay[var2].setBounds(75, 65, 72, 23);
         } else {
            if (var2 == 1) {
               JLabel var19 = this.ay[var2];
               var10004 = "杞吕畜";
               var19.setText("未启用");
               this.ay[var2].setForeground(Color.white);
               this.ay[var2].setFont(Class49.s);
               this.ay[var2].setBounds(251, 65, 72, 23);
            }

            var7 = this;
         }

         var7.add(this.ay[var2++]);
      }

      this.sk = new com.xy.w.Class18[9];

      for (int var8 = var2 = 0; var8 < this.sk.length; var8 = var2) {
         this.sk[var2] = new com.xy.w.Class18();
         Class17 var9;
         if (var2 == 0) {
            var9 = this;
            com.xy.w.Class18 var12 = this.sk[var2];
            var10003 = "[7\u00070\u0007g\u001dzX:O";
            var12.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
            this.sk[var2].setBounds(38, 36, 351, 20);
         } else if (var2 == 1 || var2 == 2) {
            var9 = this;
            com.xy.w.Class18 var16 = this.sk[var2];
            var10003 = "\u0007Y[^[\t@\u0014\u0004T\u0013";
            var16.dp("sc/d/34.png");
            this.sk[var2].setBounds(54 + (var2 - 1) * 176, 65, 161, 23);
         } else if (var2 == 3 || var2 == 4) {
            var9 = this;
            com.xy.w.Class18 var15 = this.sk[var2];
            var10003 = "[7\u00070\u0007f\u001dzX:O";
            var15.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.sk[var2].setBounds(58 + (var2 - 3) * 176, 88, 151, 21);
         } else if (var2 != 5 && var2 != 6) {
            if (var2 == 7 || var2 == 8) {
               com.xy.w.Class18 var10001 = this.sk[var2];
               String var14 = "[7\u00070\u0007g\u001bzX:O";
               var10001.mt(com.xy.w.Class16.m("sc/d/33.png", 38, 38, 38, 38, false));
               this.sk[var2].setBounds(53 + (var2 - 7) * 176, 64, 166, 210);
            }

            var9 = this;
         } else {
            var9 = this;
            com.xy.w.Class18 var13 = this.sk[var2];
            var10003 = "\u0007Y[^[\b@\u0014\u0004T\u0013";
            var13.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.sk[var2].setBounds(58 + (var2 - 5) * 176, 88, 151, 177);
         }

         var9.add(this.sk[var2++]);
      }
   }

   public void h() {
      RoleData var1;
      LoginResult var2;
      LoginResult var10000 = var2 = (var1 = this.yx()).getLoginResult();
      int var3 = com.xy.v.Class4.q(var10000.getGrade());
      int var4 = com.xy.v.Class4.s(var10000.getGrade());
      int var5 = 0;

      int var6;
      for (int var12 = var6 = 0; var12 < 5; var12 = var6) {
         NpcOption var7 = this.ca(var5);
         var5++;
         Class17 var13;
         if (var6 == 0) {
            var13 = this;
            String var10004 = "桍骒N";
            var7.setTextSize("根骨:" + (var2.getBone() - var4), 130);
         } else if (var6 == 1) {
            var13 = this;
            String var19 = "灝恳\u0012";
            var7.setTextSize("灵性:" + (var2.getSpir() - var4), 130);
         } else if (var6 == 2) {
            var13 = this;
            String var20 = "勯釵N";
            var7.setTextSize("力量:" + (var2.getPower() - var4), 130);
         } else if (var6 == 3) {
            var13 = this;
            String var21 = "敧挣\u0012";
            var7.setTextSize("敏捷:" + (var2.getSpeed() - var4), 130);
         } else if (var3 == 4) {
            var13 = this;
            String var22 = "寮务N";
            var7.setTextSize("定力:" + (var2.getCalm() - var4), 130);
         } else {
            String var10001 = "寎劳n\u0018";
            var7.setTextSize("定力:0", 130);
            var13 = this;
         }

         var6++;
         var13.wh.d(var7);
      }

      PackRecord var15 = var1.getPackRecord();
      String var10002 = "6";
      BigDecimal[] var10 = var15.getBaseValue(5, "B");

      int var11;
      for (int var16 = var11 = 0; var16 < var10.length; var16 = var11) {
         int var8 = var10[var11] != null ? var10[var11].intValue() : 0;
         NpcOption var9 = this.ca(var5);
         var5++;
         Class17 var17;
         if (var11 == 0) {
            var17 = this;
            String var23 = "树髼\u0012";
            var9.setTextSize("根骨:" + var8, 130);
         } else if (var11 == 1) {
            var17 = this;
            String var24 = "瀁思N";
            var9.setTextSize("灵性:" + var8, 130);
         } else if (var11 == 2) {
            var17 = this;
            String var25 = "劳醛\u0012";
            var9.setTextSize("力量:" + var8, 130);
         } else if (var11 == 3) {
            var17 = this;
            String var26 = "攻捍N";
            var9.setTextSize("敏捷:" + var8, 130);
         } else {
            String var10003 = "宲勏\u0012";
            var9.setTextSize("定力:" + var8, 130);
            var17 = this;
         }

         var11++;
         var17.wg.d(var9);
      }
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         this.g(0);
         super.l();
      }
   }
}
