package com.xy.a;

import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class130 extends JComponent {
   private com.xy.q.Class14[] awn;
   private com.xy.q.Class27[] awo;
   private com.xy.q.Class52 awp;
   public int ia;
   private com.xy.q.Class36[] awq;
   private MoneyType yj;
   public long agx;
   public int aa;
   private com.xy.w.Class18[] sk;
   private Class54[] awr;
   private RichLabel h;
   private com.xy.i.Class18[] ts;
   private RichLabel cj;
   private JLabel[] o;
   // $VF: synthetic field
   final Class93 ys;

   // $VF: synthetic method
   static com.xy.q.Class27[] amm(Class130 var0) {
      return var0.awo;
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] amn(Class130 var0) {
      return var0.awn;
   }

   public void dq(String var1) {
      int var10000 = 0;
      this.agx = 0L;

      for (int var2 = 0; var10000 < this.awq.length; var10000 = var2) {
         this.awq[var2++].setText("0");
      }

      int var10;
      for (int var13 = var10 = 0; var13 < this.awr.length; var13 = var10) {
         this.awr[var10++].setVisible(false);
      }

      String var16 = "5U";
      String[] var11 = var1.split("\\|");
      var10000 = 2;
      this.ia = Integer.parseInt(var11[0].substring(2));
      this.aa = (Integer.parseInt(var11[1]) - 1) / 6 + 1;
      com.xy.q.Class14 var17 = this.awn[0];
      StringBuilder var10002 = new StringBuilder(String.valueOf(this.ia));
      String var10003 = "&";
      var17.setText(var10002.append("/").append(this.aa).toString());

      for (int var3 = 2; var10000 < var11.length && var3 < 8; var10000 = ++var3) {
         int var4 = var3 - 2;
         Class54 var5 = this.awr[var4];
         String var18 = var11[var3];
         var10003 = "\u0014";
         var4 = var18.indexOf("=");
         long var6 = com.xy.v.Class12.s(var11[var3], 0, var4);
         long var8 = com.xy.v.Class12.s(var11[var3], var4 + 1, var11[var3].length());
         var5.tj(var6, var8);
         var5.setVisible(true);
         if (var3 == 2) {
            this.agx = var6;
         }
      }

      com.xy.q.Class49.b(this.awn[1], this.agx);
   }

   public Class130(Class93 var1) {
      this.ys = var1;
      this.ia = 1;
      this.aa = 1;
      this.ts = new com.xy.i.Class18[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ts.length; var10000 = ++var2) {
         String var10006 = "\u001aJFLF\u001fGY\u0007N";
         this.ts[var2] = new com.xy.i.Class18("sc/e/6.png", 1, 185 + var2, com.xy.q.Class49.bz, null, "", var1.eg());
         this.ts[var2].setBounds(164 + var2 * 140, 321, 34, 18);
         com.xy.i.Class18 var9 = this.ts[var2];
         String var24;
         if (var2 == 0) {
            var24 = "駀顼";
            var24 = "首页";
         } else if (var2 == 1) {
            var24 = "杂顜";
            var24 = "末页";
         } else if (var2 == 4) {
            var24 = "砸宓赻乹";
            var24 = "确定购买";
         } else {
            var24 = "";
         }

         var9.setText(var24);
         this.add(this.ts[var2]);
         if (var2 >= 2 && var2 <= 3) {
            Class130 var10;
            if (var2 == 2) {
               var10 = this;
               com.xy.i.Class18 var28 = this.ts[var2];
               String var44 = "Z\n\u0006\f\u0006]\u001bGY\u0007N";
               var28.setImage("sc/e/42.png");
            } else {
               if (var2 == 3) {
                  com.xy.i.Class18 var11 = this.ts[var2];
                  var24 = "z5&3&b:xy8n";
                  var11.setImage("sc/e/43.png");
               }

               var10 = this;
            }

            var10.ts[var2].setBounds(201 + (var2 - 2) * 82, 321, 18, 18);
         } else if (var2 == 4) {
            this.ts[var2].setFont(com.xy.q.Class49.ch);
            this.ts[var2].setForeground(Color.black);
            com.xy.i.Class18 var27 = this.ts[var2];
            String var10002 = "Z\n\u0006\f\u0006[\u001fGY\u0007N";
            var27.setImage("sc/e/26.png");
            this.ts[var2].setBounds(202, 464, 99, 25);
         }
      }

      this.o = new JLabel[9];

      for (int var12 = var2 = 0; var12 < this.o.length; var12 = ++var2) {
         this.o[var2] = com.xy.q.Class1.k(47 + 120 * var2, 57, 150, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var13 = this.o[var2];
         String var31;
         if (var2 == 0) {
            var31 = "歪坾唧匀皍亏玀";
            var31 = "正在售卖的仙玉";
         } else if (var2 == 1) {
            var31 = "\u0001奎说幨贄丙\u0000";
            var31 = "(大话币购买)";
         } else if (var2 == 2) {
            var31 = "亏玀";
            var31 = "仙玉";
         } else if (var2 == 3) {
            var31 = "殦炐啇仞";
            var31 = "每点售价";
         } else if (var2 == 4) {
            var31 = "恭仾";
            var31 = "总价";
         } else if (var2 == 5) {
            var31 = "资乙亰玠";
            var31 = "购买仙玉";
         } else if (var2 == 6) {
            var31 = "恭仾";
            var31 = "总价";
         } else if (var2 == 7) {
            var31 = "殦炐啇仞";
            var31 = "每点售价";
         } else if (var2 == 8) {
            var31 = "珦釘";
            var31 = "现金";
         } else {
            var31 = "";
         }

         var13.setText(var31);
         this.o[var2].setHorizontalAlignment(10);
         this.add(this.o[var2]);
         if (var2 == 1) {
            this.o[var2].setForeground(Color.red);
         } else if (var2 >= 2 && var2 <= 4) {
            this.o[var2].setForeground(Color.white);
            if (var2 == 2) {
               this.o[var2].setBounds(85, 78, 72, 21);
            } else if (var2 == 3) {
               this.o[var2].setBounds(196, 78, 72, 21);
            } else if (var2 == 4) {
               this.o[var2].setBounds(366, 78, 72, 21);
            }
         } else if (var2 >= 5 && var2 <= 8) {
            this.o[var2].setBounds(116 + (var2 - 5) % 2 * 177, 361 + (var2 - 5) / 2 * 25, 72, 19);
         }
      }

      this.awr = new Class54[6];

      for (int var14 = var2 = 0; var14 < this.awr.length; var14 = var2) {
         this.awr[var2] = new Class54(var1);
         this.awr[var2].setBounds(51, 99 + var2 * 36, 402, 36);
         this.add(this.awr[var2++]);
      }

      this.cj = new RichLabel("", com.xy.q.Class49.n);
      String var10005 = "\n\n\u0019Y\u0019Y\u0019Y渀駁揹祓Ｓ畘产粒绶斟\n\no/\u0019Y\u0019Y臃勁帇伉挠焎朩伧皭匼仞佱兡资乙･彺女亓呥旟";
      this.cj.setTextSize("#c000000温馨提示：由于系统时#cFF0000自动帮你按照最低的单价优先购买，当多人同时", 410);
      this.cj.setBounds(41, 418, this.cj.getWidth(), this.cj.getHeight());
      this.add(this.cj);
      this.h = new RichLabel("", com.xy.q.Class49.bz);
      String var57 = "*5O\u00109f9f贤並旿厹胴佌变畉仾桪发區％ujf9f9f9伶胴揳叞殂彚创卜亡有奌髑v)v)v)v)v)v央讋师";
      this.h.setTextSize("#cFF0000购买时可能会发生价格变化，#c000000你能接受比当前单价最多高           大话币", 410);
      this.h.setBounds(42, 437, this.h.getWidth(), this.h.getHeight());
      this.add(this.h);
      String var10003 = "Z\n\u0006\r\u0006X\u001eGY\u0007N";
      com.xy.w.Class9 var6 = com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false);
      this.yj = new MoneyType();
      String var10011 = "醇钸";
      this.yj.setIdAndKey(1, "金钱");
      this.awp = com.xy.q.Class1.m(332, 387, 124, 19, 10, Color.white, com.xy.q.Class49.w, this.yj, var1.afx);
      this.awp.n(2);
      this.awp.mt(var6);
      this.add(this.awp);
      this.awn = new com.xy.q.Class14[3];
      this.awq = new com.xy.q.Class36[2];
      this.awo = new com.xy.q.Class27[2];

      int var3;
      for (int var15 = var3 = 0; var15 < this.awn.length; var15 = var3) {
         this.awn[var3] = com.xy.q.Class1.i(222, 321, 58, 18, var3 == 0 ? 0 : 10, Color.white, com.xy.q.Class49.w);
         this.awn[var3].mt(var6);
         Class130 var16;
         if (var3 == 1) {
            var16 = this;
            this.awn[var3].setBounds(188, 387, 89, 19);
         } else {
            if (var3 == 2) {
               this.awn[var3].setBounds(332, 362, 124, 19);
            }

            var16 = this;
         }

         var16.add(this.awn[var3++]);
      }

      for (int var17 = var3 = 0; var17 < this.awq.length; var17 = var3) {
         this.awq[var3] = com.xy.q.Class1.j(var6, com.xy.q.Class49.w, Color.white);
         Class130 var18;
         if (var3 == 0) {
            var18 = this;
            this.awq[var3].setBounds(188, 362, 89, 19);
         } else {
            if (var3 == 1) {
               this.awq[var3].setBounds(345, 439, 59, 19);
            }

            var18 = this;
         }

         var18.add(this.awq[var3]);
         com.xy.q.Class27[] var40 = this.awo;
         int var47 = var3;
         com.xy.q.Class27 var53 = new com.xy.q.Class27(15, this.awq[var3], var1.eg());
         var3++;
         var40[var47] = var53;
      }

      this.sk = new com.xy.w.Class18[5];

      for (int var19 = var3 = 0; var19 < this.sk.length; var19 = var3) {
         this.sk[var3] = new com.xy.w.Class18();
         Class130 var20;
         if (var3 == 0) {
            var20 = this;
            com.xy.w.Class18 var48 = this.sk[var3];
            var10003 = "Z\n\u0006\r\u0006[\u001cGY\u0007N";
            var48.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.sk[var3].setBounds(47, 78, 408, 21);
         } else if (var3 == 1) {
            var20 = this;
            com.xy.w.Class18 var49 = this.sk[var3];
            var10003 = "z5&2&d=xy8n";
            var49.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.sk[var3].setBounds(47, 78, 408, 235);
         } else if (var3 == 2) {
            Class130 var22;
            if (var1.za().l(2, 11)) {
               com.xy.w.Class18 var21 = this.sk[var3];
               String var41 = "P\u000b\u001cY\u0019";
               var21.gt(com.xy.w.Class15.d("yb500"));
               var22 = this;
            } else {
               com.xy.w.Class18 var23 = this.sk[var3];
               String var42 = ";e?";
               var23.gt(com.xy.w.Class15.d("236"));
               var22 = this;
            }

            var22.sk[var3].setBounds(51, 360, 50, 50);
            var20 = this;
         } else if (var3 == 3) {
            var20 = this;
            com.xy.w.Class18 var50 = this.sk[var3];
            var10003 = "\u001aJFMF\u001dGY\u0007N";
            var50.dp("sc/d/4.png");
            this.sk[var3].setBounds(47, 356, 59, 57);
         } else {
            if (var3 == 4) {
               com.xy.w.Class18 var43 = this.sk[var3];
               String var51 = "z5&2&`?xy8n";
               var43.mt(com.xy.w.Class16.m("sc/d/66.png", 60, 1, 60, 1, false));
               this.sk[var3].setBounds(56, 346, 390, 2);
            }

            var20 = this;
         }

         var20.add(this.sk[var3++]);
      }
   }

   // $VF: synthetic method
   static com.xy.i.Class18[] amo(Class130 var0) {
      return var0.ts;
   }

   // $VF: synthetic method
   static com.xy.q.Class52 amp(Class130 var0) {
      return var0.awp;
   }

   // $VF: synthetic method
   static com.xy.q.Class36[] amq(Class130 var0) {
      return var0.awq;
   }

   // $VF: synthetic method
   static Class54[] amr(Class130 var0) {
      return var0.awr;
   }
}
