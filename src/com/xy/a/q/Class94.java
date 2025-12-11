package com.xy.a.q;

import com.xy.bean.QualityClBean;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class94 extends com.xy.q.Class30 {
   private JLabel[] lt;
   private QualityClBean app;
   private RichLabel in;
   private RichLabel h;
   private com.xy.w.Class18[] ar;
   private com.xy.i.Class19[] pa;
   private JScrollPane ba;
   private JScrollPane l;

   public void g(int var1) {
      if (var1 == 188) {
         this.app = null;
         this.zc().f(this.lj());
      } else {
         if (var1 == 189) {
            if (this.app == null) {
               return;
            }

            Goodstable var2;
            if ((var2 = this.yx().getGood(this.app.getRgid())) == null) {
               return;
            }

            String var10001 = var2.getValue();
            String var10002 = "i+";
            var2.setValue(GoodType.e(var10001.split("\\|"), 5, this.app.getNewAttr()));
            String var3 = Agreement.getSendTextAES("extrattroper", com.xy.v.Class31.a().toJson(this.app));
            this.za().k(var3);
            this.app = null;
            this.zc().f(this.lj());
         }
      }
   }

   public void ba(QualityClBean var1) {
      this.app = var1;
   }

   public void aih(String var1, int var2) {
      String var10001 = "\u0003";
      String[] var3 = var1.split("&");
      double var4;
      int var6 = (int)(var4 = Double.parseDouble(var3[2]));
      double var7 = var4 - var6;
      long var9 = ExpUtil.d(Long.parseLong(var3[3]));
      Skill var11 = this.yt().ac(var3[1]);
      if (var2 == 0) {
         int var19 = 0;
         JLabel var37 = this.lt[2];
         StringBuilder var40 = new StringBuilder(String.valueOf(var11.getSkillname()));
         String var10004 = "\u007f";
         var40 = var40.append("(").append(var4);
         var10004 = "\f";
         var37.setText(var40.append(")").toString());
         var10004 = "\u0016\u0010";
         this.in.setTextSize(com.xy.a.Class48.pp("#G" + var11.getRemark(), var11, var3[2], String.valueOf(var9)), 145);

         for (int var13 = 0; var19 < 5; var19 = ++var13) {
            if (var13 + 1 <= var6) {
               com.xy.w.Class18 var20 = this.ar[2 + var13];
               var10001 = "V}\n}\n&\u0016";
               var20.dp("sc/c/83");
            } else {
               com.xy.w.Class18 var21 = this.ar[2 + var13];
               var10001 = "$VxVx\rc";
               var21.dp("sc/c/84");
            }
         }

         if (var6 != 5) {
            if (var7 < 0.2) {
               com.xy.w.Class18 var24 = this.ar[2 + var6];
               var10001 = "V}\n}\n&\u0011";
               var24.dp("sc/c/84");
            } else if (var7 > 0.8) {
               com.xy.w.Class18 var23 = this.ar[2 + var6];
               var10001 = "$VxVx\rd";
               var23.dp("sc/c/83");
            } else {
               com.xy.w.Class18 var22 = this.ar[2 + var6];
               var10001 = "V}\n}\n&\u0017";
               var22.dp("sc/c/82");
            }
         }
      } else {
         JLabel var25 = this.lt[3];
         StringBuilder var10002 = new StringBuilder(String.valueOf(var11.getSkillname()));
         String var10003 = "\u007f";
         var10002 = var10002.append("(").append(var4);
         var10003 = "\f";
         var25.setText(var10002.append(")").toString());
         var10003 = "\u0016\u0010";
         this.h.setTextSize(com.xy.a.Class48.pp("#G" + var11.getRemark(), var11, var3[2], String.valueOf(var9)), 145);

         int var12;
         for (int var10000 = var12 = 0; var10000 < 5; var10000 = ++var12) {
            if (var12 + 1 <= var6) {
               com.xy.w.Class18 var14 = this.ar[7 + var12];
               var10001 = "V}\n}\n&\u0016";
               var14.dp("sc/c/83");
            } else {
               com.xy.w.Class18 var15 = this.ar[7 + var12];
               var10001 = "$VxVx\rc";
               var15.dp("sc/c/84");
            }
         }

         if (var6 != 5) {
            if (var7 < 0.2) {
               com.xy.w.Class18 var18 = this.ar[7 + var6];
               var10001 = "V}\n}\n&\u0011";
               var18.dp("sc/c/84");
            } else if (var7 > 0.8) {
               com.xy.w.Class18 var17 = this.ar[7 + var6];
               var10001 = "$VxVx\rd";
               var17.dp("sc/c/83");
            } else {
               com.xy.w.Class18 var16 = this.ar[7 + var6];
               var10001 = "V}\n}\n&\u0017";
               var16.dp("sc/c/82");
            }
         }
      }
   }

   public Class94(GameView var1) {
      super(94, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "mF1A1\u00140UpB";
      this.yy(-1, 0, 478, 320, com.xy.q.Class30.agh);
      com.xy.w.Class9 var22 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "抵肪觼釅";
      this.yu(var22, "技能觉醒");
      this.rm(false);
      this.wp(new com.xy.v.Class32(14, 0, 0, 37));
      this.pa = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.pa.length; var10000 = var2) {
         com.xy.i.Class19[] var5 = this.pa;
         String var10004 = "V}\n{\n,\u00130UpB";
         int var23 = 188 + var2;
         String var24;
         Class94 var10010;
         if (var2 == 0) {
            var24 = "侊畬又抵肪";
            var24 = "保留原技能";
            var10010 = this;
         } else if (var2 == 1) {
            var24 = "曚捼斕択胘";
            var24 = "替换新技能";
            var10010 = this;
         } else {
            var24 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/26.png", 1, var23, Class49.ch, Class49.bv, var24, var10010);
         var5[var2] = var10002;
         this.pa[var2].setBounds(99 + 202 * var2, 238, 99, 25);
         this.add(this.pa[var2++]);
      }

      this.lt = new JLabel[10];

      for (int var6 = var2 = 0; var6 < this.lt.length; var6 = ++var2) {
         int var10003 = 63 + (var2 - 2) % 2 * 202;
         int var21 = 62 + (var2 - 2) / 2 * 27;
         String var10008 = "\u00164s\u0011s\u0011s\u0011";
         this.lt[var2] = com.xy.q.Class1.f(var10003, var21, 170, 28, 10, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.w);
         JLabel var7 = this.lt[var2];
         String var9;
         if (var2 == 0) {
            var9 = "厁觬醌报";
            var9 = "原觉醒技";
         } else if (var2 == 1) {
            var9 = "斅覞醧拗";
            var9 = "新觉醒技";
         } else if (var2 == 2) {
            var9 = "択胘吓\r*\u000b'\f";
            var9 = "技能名(4.9)";
         } else if (var2 == 3) {
            var9 = "抵肪吸\u007f\u0000y\u0005~";
            var9 = "技能名(5.0)";
         } else if (var2 != 4 && var2 != 5) {
            var9 = "";
         } else {
            var9 = "觬醌広";
            var9 = "觉醒度";
         }

         var7.setText(var9);
         this.add(this.lt[var2]);
         if (var2 == 0) {
            this.lt[var2].setForeground(Color.white);
            this.lt[var2].setFont(com.xy.q.Class49.ck);
            this.lt[var2].setBounds(72, 32, 110, 23);
         }

         if (var2 == 1) {
            this.lt[var2].setForeground(Color.green);
            this.lt[var2].setFont(com.xy.q.Class49.ak);
            this.lt[var2].setBounds(274, 32, 110, 23);
         }
      }

      this.in = new RichLabel("", com.xy.q.Class49.ac);
      this.h = new RichLabel("", com.xy.q.Class49.ac);
      this.ba = com.xy.q.Class1.g(59, 118, 181, 100, this.in, 30);
      this.add(this.ba);
      this.l = com.xy.q.Class1.g(261, 118, 181, 100, this.h, 30);
      this.add(this.l);
      this.ar = new com.xy.w.Class18[20];

      for (int var8 = var2 = 0; var8 < this.ar.length; var8 = ++var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         if (var2 >= 0 && var2 <= 1) {
            com.xy.w.Class18 var16 = this.ar[var2];
            String var20 = "$VxQx\u0006c\u001b'[0";
            var16.dp("sc/d/34.png");
            this.ar[var2].setBounds(57 + 202 * var2, 32, 180, 23);
         } else if (var2 >= 2 && var2 <= 11) {
            if (var2 >= 2 && var2 <= 6) {
               this.ar[var2].setBounds(115 + 22 * (var2 - 2), 94, 15, 16);
            } else if (var2 >= 7 && var2 <= 11) {
               this.ar[var2].setBounds(317 + 22 * (var2 - 7), 94, 15, 16);
            }
         } else if (var2 >= 12 && var2 <= 17) {
            com.xy.w.Class18 var15 = this.ar[var2];
            String var19 = "V}\nz\n,\u00110UpB";
            var15.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            if (var2 >= 12 && var2 <= 15) {
               this.ar[var2].setBounds(57 + (var2 - 12) % 2 * 202, 62 + (var2 - 12) / 2 * 27, 180, 28);
            } else if (var2 >= 16 && var2 <= 17) {
               this.ar[var2].setBounds(57 + (var2 - 16) * 202, 116, 180, 104);
            }
         } else if (var2 >= 18 && var2 <= 19) {
            com.xy.w.Class18 var14 = this.ar[var2];
            String var18 = "$VxQx\u0006d\u001b'[0";
            var14.mt(com.xy.w.Class16.m("sc/d/33.png", 20, 20, 30, 30, false));
            this.ar[var2].setBounds(47 + 202 * (var2 - 18), 24, 203, 209);
         }
      }
   }
}
