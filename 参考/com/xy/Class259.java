package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.formula.BaseMeridians;
import com.xy.game.NpcOption;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class259 extends Class345 {
   private <undefinedtype> agc;
   private Class70 agd;
   private <undefinedtype> age;
   private List<NpcOption> zy;
   private Class436[] be;
   private JLabel[] ad;
   private Class70[] ach;
   private int m;

   public void o() {
      LoginResult var2;
      RoleData var7;
      LoginResult var10000 = var2 = (var7 = this.vd()).getLoginResult();
      int var6 = Class224.g(var10000.getGrade());
      int var4 = Class224.d(var10000.getGrade());
      int var5 = 2 & 5;

      int var3;
      int var12;
      Class259 var13;
      for(var12 = var3 = 2 & 5; var12 < 5; var12 = var3) {
         NpcOption var1 = this.lm(var5);
         ++var5;
         if (var3 == 0) {
            var13 = this;
            var1.setTextSize("根骨:" + (var2.getBone() - var4), 14246 & 18651);
         } else if (var3 == (3 & 5)) {
            var13 = this;
            var1.setTextSize("灵性:" + (var2.getSpir() - var4), 970 & 31927);
         } else if (var3 == (1 ^ 3)) {
            var13 = this;
            var1.setTextSize("力量:" + (var2.getPower() - var4), 18918 & 13979);
         } else if (var3 == --3) {
            var13 = this;
            var1.setTextSize("敏捷:" + (var2.getSpeed() - var4), 14014 & 18883);
         } else if (var6 == --4) {
            var13 = this;
            var1.setTextSize("定力:" + (var2.getCalm() - var4), 17067 & 15830);
         } else {
            var1.setTextSize("定力:0", 10443 & 22454);
            var13 = this;
         }

         ++var3;
         var13.age.a(var1);
      }

      BigDecimal[] var10 = var7.getPackRecord().getBaseValue(--5, "B");

      int var8;
      for(var12 = var8 = 3 >> 2; var12 < var10.length; var12 = var8) {
         int var11 = var10[var8] != null ? var10[var8].intValue() : 0;
         NpcOption var9 = this.lm(var5);
         ++var5;
         if (var8 == 0) {
            var13 = this;
            var9.setTextSize("根骨:" + var11, 28335 & 4562);
         } else if (var8 == --1) {
            var13 = this;
            var9.setTextSize("灵性:" + var11, 16835 & 16062);
         } else if (var8 == 5 >> 1) {
            var13 = this;
            var9.setTextSize("力量:" + var11, 29387 & 3510);
         } else if (var8 == --3) {
            var13 = this;
            var9.setTextSize("敏捷:" + var11, 7891 & 25006);
         } else {
            var9.setTextSize("定力:" + var11, 22659 & 10238);
            var13 = this;
         }

         ++var8;
         var13.agc.a(var9);
      }

   }

   public void y(int var1) {
      int var10000 = 2 & 5;
      this.m = var1;

      for(int var2 = var10000; var10000 < this.ach.length; var10000 = var2) {
         this.ach[var2].setKeep((boolean)(var2 == var1 ? --1 : 0));
         ++var2;
      }

      this.age.d();
      this.agc.d();
      Class259 var3;
      if (this.m == 0) {
         this.o();
         var3 = this;
      } else if (this.m == (3 & 5)) {
         var3 = this;
         this.p();
      } else {
         if (this.m == --2) {
            this.s();
         }

         var3 = this;
      }

      var3.age.b(this.age.b);
      this.agc.b(this.agc.b);
   }

   public void p() {
      String var5;
      if ((var5 = this.vd().getPrivateData().getBorn()) != null && !var5.equals("")) {
         String[] var13 = var5.split("\\|");
         int var7 = 5 >> 3;

         int var3;
         for(int var10000 = var3 = 3 ^ 3; var10000 < var13.length; var10000 = var3) {
            if (var13[var3].startsWith("双属性")) {
               String[] var12 = var13[var3].split("&");

               int var10;
               for(var10000 = var10 = --1; var10000 < var12.length; var10000 = var10) {
                  int var14 = var12[var10].indexOf("=");
                  String var11 = var12[var10].substring(2 & 5, var14);
                  BigDecimal var8 = new BigDecimal(var12[var10].substring(var14 + (3 & 5)));
                  if (var11.equals("HP成长") || var11.equals("MP成长") || var11.equals("AP成长") || var11.equals("SP成长")) {
                     var8 = Class224.l(var8.doubleValue(), 100.0D);
                  }

                  NpcOption var9 = this.lm(var7);
                  ++var7;
                  var9.setTextSize(var11 + ":" + Class394.ak(var8.doubleValue(), 4 ^ 5), 19895 & 13002);
                  ++var10;
                  this.agc.a(var9);
               }
            } else {
               int var4 = var13[var3].indexOf("=");
               String var1 = var13[var3].substring(2 & 5, var4);
               BigDecimal var6 = new BigDecimal(var13[var3].substring(var4 + (3 >> 1)));
               if (var1.equals("HP成长") || var1.equals("MP成长") || var1.equals("AP成长") || var1.equals("SP成长")) {
                  var6 = Class224.l(var6.doubleValue(), 100.0D);
               }

               NpcOption var2;
               NpcOption var10001 = var2 = this.lm(var7);
               ++var7;
               var10001.setTextSize(var1 + ":" + Class394.ak(var6.doubleValue(), --1), 12026 & 20871);
               this.age.a(var2);
            }

            ++var3;
         }

      }
   }

   public void s() {
      int var7 = 2 & 5;
      Vector var8 = this.vd().getRoleProperty().meridiansVector;

      int var5;
      for(int var10000 = var5 = 5 >> 3; var10000 < var8.size(); var10000 = var5) {
         BaseMeridians var4;
         if ((var4 = (BaseMeridians)var8.get(var5)).getBh() != 0) {
            StringBuilder var10001;
            Object[] var10003;
            boolean var10005;
            if (var4.getBh() == (107 & 119)) {
               String[] var11 = var4.getKey().split("&");

               int var6;
               for(var10000 = var6 = 5 >> 3; var10000 < var11.length; var10000 = var6) {
                  String[] var1;
                  if ((var1 = var11[var6].split("_")).length == --5) {
                     int var2 = Integer.parseInt(var1[3 ^ 3]);
                     BaseMeridians var13 = new BaseMeridians;
                     int var14 = Integer.parseInt(var1[4 ^ 5]);
                     int var10004 = Integer.parseInt(var1[--2]);
                     String var15;
                     String[] var10006;
                     if (var1.length == --5) {
                        var15 = var1[--3];
                        var10006 = var1;
                     } else {
                        var15 = null;
                        var10006 = var1;
                     }

                     var13.<init>(var2, var14, var10004, var15, var10006.length == --5 ? Double.parseDouble(var1[--4]) : 0.0D);
                     BaseMeridians var9 = var13;
                     NpcOption var10 = this.lm(var7);
                     ++var7;
                     var10001 = (new StringBuilder(String.valueOf(var9.getKey()))).append(":");
                     var10003 = new Object[3 >> 1];
                     var10005 = true;
                     var10003[3 & 4] = var9.getKeyValue();
                     var10.setTextSize(var10001.append(String.format("%.1f", var10003)).toString(), 4855 & 28042);
                     this.agc.a(var10);
                  }

                  ++var6;
               }
            } else {
               NpcOption var3;
               NpcOption var12 = var3 = this.lm(var7);
               ++var7;
               var10001 = (new StringBuilder(String.valueOf(var4.getKey()))).append(":");
               var10003 = new Object[2 ^ 3];
               var10005 = true;
               var10003[3 >> 2] = var4.getKeyValue();
               var12.setTextSize(var10001.append(String.format("%.1f", var10003)).toString(), 30391 & 2506);
               this.age.a(var3);
            }
         }

         ++var5;
      }

   }

   public Class259(GameView var1) {
      int var10001 = --3;
      int var10005 = -2 & -1;
      super(29094 & 3805, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 2 & 5, 28647 & 4542, 1365 & 31722, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 119 & 76, 119 & 76, 119 & 76, 119 & 76, (boolean)(3 & 4)), "切换属性");
      Class70[] var4 = new Class70[var10001];
      boolean var10003 = true;
      this.ach = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ach.length; var10000 = var2) {
         Class70[] var3 = this.ach;
         Class70 var10002 = new Class70;
         var10005 = 1 ^ 3;
         int var10006 = (55 & 123) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class259 var10010;
         if (var2 == 0) {
            var10009 = "属 性";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "修正";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "经脉";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.ach[var2].setOffsetTexts(Class681.bv);
         this.ach[var2].setBounds((122 & 63) + (110 & 119) * var2, 86 & 63, 127 & 95, 45 & 115);
         this.add(this.ach[var2++]);
      }

      this.zy = new ArrayList();
      this.age = (<undefinedtype>)(new Object(3 ^ 3, this) {
         private JScrollPane a;
         private JList<NpcOption> b = new JList();
         private int d;

         public void a(NpcOption var1) {
            this.b.add(var1);
            var1.setBounds(3 ^ 3, this.d, 20437 & 12479, var1.getHeight());
            this.d += var1.getHeight();
            this.b.setPreferredSize(new Dimension(10493 & 22423, this.d));
         }

         public void b(JList<NpcOption> var1) {
            this.b = var1;
            this.a.setViewportView(var1);
         }

         public {
            this.a = Class133.f(var2 == 0 ? 124 & 63 : 235, 110, 22231 & 10685, 23003 & 9919, this.b, 55 & 92);
            var3.add(this.a);
         }

         public void d() {
            this.d = 3 & 4;
            this.b.removeAll();
         }
      });
      this.agc = (<undefinedtype>)(new Object(4 ^ 5, this) {
         private JScrollPane a;
         private JList<NpcOption> b = new JList();
         private int d;

         public void a(NpcOption var1) {
            this.b.add(var1);
            var1.setBounds(3 ^ 3, this.d, 20437 & 12479, var1.getHeight());
            this.d += var1.getHeight();
            this.b.setPreferredSize(new Dimension(10493 & 22423, this.d));
         }

         public void b(JList<NpcOption> var1) {
            this.b = var1;
            this.a.setViewportView(var1);
         }

         public {
            this.a = Class133.f(var2 == 0 ? 124 & 63 : 235, 110, 22231 & 10685, 23003 & 9919, this.b, 55 & 92);
            var3.add(this.a);
         }

         public void d() {
            this.d = 3 & 4;
            this.b.removeAll();
         }
      });
      if (this.uw().VALUE.indexOf(87 & 107) == -4 >> 2) {
         this.ach[5 >> 1].setVisible((boolean)(2 & 5));
      }

      var10001 = --2;
      this.agd = new Class70("sc/e/7.png", 3 & 5, 55 & 126, Class681.ak, Class681.c, "切换", this);
      this.agd.setBounds(18171 & 14788, 950 & 32093, 59 & 127, 25);
      this.add(this.agd);
      JLabel[] var6 = new JLabel[var10001];
      var10003 = true;
      this.ad = var6;

      Class259 var5;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.b(67 + var2 % (5 >> 1) * 176, 99 + var2 / (5 >> 1) * 24, 36, 18, Color.black, Class681.ak);
         if (var2 == 0) {
            var5 = this;
            this.ad[var2].setText("当前启用");
            this.ad[var2].setForeground(Color.green);
            this.ad[var2].setFont(Class681.bq);
            this.ad[var2].setBounds(75, 65, 72, 23);
         } else {
            if (var2 == (3 & 5)) {
               this.ad[var2].setText("未启用");
               this.ad[var2].setForeground(Color.white);
               this.ad[var2].setFont(Class681.v);
               this.ad[var2].setBounds(251, 65, 72, 23);
            }

            var5 = this;
         }

         var5.add(this.ad[var2++]);
      }

      Class436[] var8 = new Class436[9];
      var10003 = true;
      this.be = var8;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var5 = this;
            this.be[var2].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 & 4)));
            this.be[var2].setBounds(38, 36, 351, 20);
         } else if (var2 != --1 && var2 != 5 >> 1) {
            if (var2 != --3 && var2 != --4) {
               if (var2 != --5 && var2 != 6) {
                  if (var2 == 7 || var2 == 8) {
                     this.be[var2].eq(Class511.q("sc/d/33.png", 38, 38, 38, 38, (boolean)(5 >> 3)));
                     this.be[var2].setBounds(53 + (var2 - 7) * 176, 64, 166, 210);
                  }

                  var5 = this;
               } else {
                  var5 = this;
                  this.be[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 & 4)));
                  this.be[var2].setBounds(58 + (var2 - 5) * 176, 88, 151, 177);
               }
            } else {
               var5 = this;
               this.be[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
               this.be[var2].setBounds(58 + (var2 - --3) * 176, 88, 151, 21);
            }
         } else {
            var5 = this;
            this.be[var2].fw("sc/d/34.png");
            this.be[var2].setBounds(54 + (var2 - --1) * 176, 65, 161, 23);
         }

         var5.add(this.be[var2++]);
      }

   }

   public void d() {
      RoleData var6 = this.vd();
      int var1;
      int var10000;
      int var22;
      if (this.m == 0) {
         LoginResult var20;
         LoginResult var25 = var20 = var6.getLoginResult();
         int var14 = Class224.g(var25.getGrade());
         int var18 = Class224.d(var25.getGrade());
         StringBuffer var16;
         (var16 = new StringBuffer()).append("B");
         var1 = 3 & 4;

         for(var10000 = var1; var10000 < 5; var10000 = var1) {
            if (var1 != --4 || var14 == --4) {
               if (var1 != 0) {
                  var16.append("=");
               }

               if (var1 == 0) {
                  var16.append(var20.getBone() - var18);
               } else if (var1 == --1) {
                  var16.append(var20.getSpir() - var18);
               } else if (var1 == (1 ^ 3)) {
                  var16.append(var20.getPower() - var18);
               } else if (var1 == --3) {
                  var16.append(var20.getSpeed() - var18);
               } else {
                  var16.append(var20.getCalm() - var18);
               }
            }

            ++var1;
         }

         BigDecimal[] var12 = var6.getPackRecord().getBaseValue(--5, "B");
         var6.getPackRecord().setEquip("B", var16.toString());

         for(var10000 = var22 = 3 & 4; var10000 < var12.length; var10000 = var22) {
            if (var22 == --4 && var14 != --4) {
               var20.setCalm(3 >> 2);
            } else {
               int var8 = var12[var22] != null ? var12[var22].intValue() : 0;
               var8 += var18;
               if (var22 == 0) {
                  var20.setBone(var8);
               } else if (var22 == (3 & 5)) {
                  var20.setSpir(var8);
               } else if (var22 == (1 ^ 3)) {
                  var20.setPower(var8);
               } else if (var22 == --3) {
                  var20.setSpeed(var8);
               } else {
                  var20.setCalm(var8);
               }
            }

            ++var22;
         }
      } else if (this.m == --1) {
         String var13;
         PrivateData var19;
         if ((var13 = (var19 = var6.getPrivateData()).getBorn()) == null || var13.equals("")) {
            return;
         }

         StringBuffer var17 = new StringBuffer();
         String var11 = null;
         String[] var10 = var13.split("\\|");

         for(var10000 = var22 = 3 >> 2; var10000 < var10.length; var10000 = var22) {
            if (var10[var22].startsWith("双属性")) {
               var11 = var10[var22].substring(--4).replace("&", "|");
            } else {
               if (var17.length() == 0) {
                  var17.append("双属性");
               }

               var17.append("&");
               var17.append(var10[var22]);
            }

            ++var22;
         }

         RoleData var24;
         label129: {
            if (var17.length() != 0) {
               if (var11 == null || var11.equals("")) {
                  var11 = var17.toString();
                  var24 = var6;
                  break label129;
               }

               var11 = var11 + "|" + var17.toString();
            }

            var24 = var6;
         }

         var11 = var24.getRoleProperty().ab((String[])null, var11);
         var19.setBorn(var11);
      } else if (this.m == (1 ^ 3)) {
         Vector var5 = var6.getRoleProperty().meridiansVector;
         StringBuffer var3 = new StringBuffer();
         BaseMeridians var4 = null;
         BaseMeridians var2 = null;

         for(var10000 = var1 = 5 >> 3; var10000 < var5.size(); var10000 = var1) {
            BaseMeridians var7;
            if ((var7 = (BaseMeridians)var5.get(var1)).getBh() == 0) {
               var4 = var7;
            } else if (var7.getBh() == (127 & 99)) {
               var2 = var7;
            } else {
               BaseMeridians var23;
               if (var3.length() == 0) {
                  var3.append("99=");
                  var23 = var7;
               } else {
                  var3.append("&");
                  var23 = var7;
               }

               var23.a(var3);
            }

            ++var1;
         }

         if (var3.length() == 0) {
            return;
         }

         if (var2 != null) {
            if (var3.length() != 0) {
               var3.append("|");
            }

            var3.append(var2.getKey().replace("&", "|"));
         }

         if (var4 != null) {
            if (var3.length() != 0) {
               var3.append("|");
            }

            var4.a(var3);
         }

         LoginResult var9;
         (var9 = var6.getLoginResult()).setMeridians(var3.toString());
         var6.getRoleProperty().meridiansVector.clear();
         var6.getRoleProperty().w(var9.getMeridians());
      }

      String var21 = Agreement.getSendTextAES("rolechange", "EP" + this.m);
      this.uw().d(var21);
      var6.getRoleProperty().k();
      JList var15 = this.age.b;
      this.age.b(this.agc.b);
      this.agc.b(var15);
   }

   public NpcOption lm(int var1) {
      NpcOption var2 = var1 < this.zy.size() ? (NpcOption)this.zy.get(var1) : null;
      if (var2 == null) {
         var2 = new NpcOption(this);
         this.zy.add(var2);
      }

      return var2;
   }

   public void q() {
      if (this.vd() != null) {
         this.y(3 & 4);
         super.q();
      }
   }
}
