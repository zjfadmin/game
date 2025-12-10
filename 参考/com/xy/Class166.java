package com.xy;

import com.xy.bean.LoginResult;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class166 extends Class345 {
   private Class556[] ag;
   private Class529[] ah;
   private JLabel[] ai;
   private RichLabel aj;
   private Class319[] ak;
   private Class245[] al;
   private MoneyType am;
   private Class436[] an;
   private Class217[] ao;

   public Long x(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         long var4 = this.vd().getMoney(this.am);
         return var1 > var4 ? var4 : null;
      }
   }

   public void y(int var1) {
      long var2;
      String var4;
      if (var1 == (15807 & 17271)) {
         if ((var2 = this.ak[5 >> 3].gl()) <= 0L) {
            this.aej.f("输入你要兑换的数量");
         } else {
            var4 = Agreement.getSendTextAES("fm", "D1" + var2);
            this.uw().d(var4);
         }
      } else {
         if (var1 == (1916 & 31163)) {
            if ((var2 = this.ak[3 & 5].gl()) <= 0L) {
               this.aej.f("输入你要兑换的数量");
               return;
            }

            var4 = Agreement.getSendTextAES("fm", "D3" + var2);
            this.uw().d(var4);
         }

      }
   }

   public void z(long var1, JTextField var3) {
      if (var3 == this.ao[3 ^ 3]) {
         LoginResult var10001 = this.vd().getLoginResult();
         int var4 = var10001.getTurnAround();
         int var5 = Class224.d(var10001.getGrade());
         long var6 = 0L;
         long var10000;
         if (this.uw().n(1 ^ 3, 30 & 109)) {
            var6 = var4 <= --3 ? this.vc().ac(var4, var5) : this.vc().ac(--3, 8125 & 24822);
            var10000 = var6;
         } else {
            var6 = var4 <= --3 ? this.vc().ac(var4, var5) : 6000000000L;
            var10000 = var6;
         }

         var6 = (long)((double)var10000 * 0.002D);
         Class681.j(this.al[3 ^ 3], var6 * var1);
      } else {
         if (var3 == this.ao[5 >> 2]) {
            Class681.j(this.al[4 ^ 5], 31864L * var1);
         }

      }
   }

   public void q() {
      this.ao[3 ^ 3].setText("0");
      this.ao[5 >> 2].setText("0");
      super.q();
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 >> 1);
   }

   public Class166(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(29935 & 3002, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 ^ 3, 20990 & 12269, 16377 & 16807, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 68 & 127, 68 & 127, 68 & 127, 68 & 127, (boolean)(3 & 4)), "令牌集");
      Class529[] var3 = new Class529[var10001];
      boolean var10003 = true;
      this.ah = var3;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.ah.length; var10000 = var2) {
         this.ah[var2] = new Class529("sc/e/31.png", 4 ^ 5, (16191 & 16887) + var2, Class681.ak, Class681.c, "兑换", this);
         this.ah[var2].setBounds(27006 & 6115, (98 & 127) + var2 * (6129 & 26798), 79 & 127, 57 & 95);
         this.add(this.ah[var2++]);
      }

      JLabel[] var4 = new JLabel[111 & 26];
      var10003 = true;
      this.ai = var4;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.ai.length; var10000 = var2) {
         this.ai[var2] = Class133.b(127 & 79, (62 & 107) + (8359 & 24568) * var2, 124 & 103, 87 & 59, Color.black, Class681.ak);
         this.ai[var2].setText(var2 != 0 && var2 != (4 ^ 5) ? (var2 != --2 && var2 != --5 ? (var2 != --3 && var2 != 6 ? (var2 != --4 && var2 != 7 ? (var2 == 8 ? "【人物经验】" : (var2 == 9 ? "【大话币】" : "")) : "获得") : "兑换") : "拥有") : "伏魔令");
         this.ai[var2].setHorizontalAlignment(5 >> 3);
         this.add(this.ai[var2]);
         if (var2 >= 5 >> 1 && var2 <= --4) {
            this.ai[var2].setBounds(202, 74 + (var2 - --2) * 27, 36, 19);
         } else if (var2 >= --5 && var2 <= 7) {
            this.ai[var2].setBounds(202, 235 + (var2 - --5) * 27, 36, 19);
         } else if (var2 >= 8 && var2 <= 9) {
            this.ai[var2].setHorizontalAlignment(10);
            this.ai[var2].setFont(Class681.ab);
            this.ai[var2].setBounds(239, 148 + (var2 - 8) * 160, 80, 14);
         }

         ++var2;
      }

      var10001 = --2;
      this.aj = new RichLabel("", Class681.ab);
      this.aj.setTextSize("#c000000温馨提示：#r1、每张伏魔令可兑换的人物经验与兑换时的人物等级有关。#r2、每张伏魔令可兑换的大话币,根据价格规律浮动。", 360);
      this.aj.setBounds(50, 348, this.aj.getWidth(), this.aj.getHeight());
      this.add(this.aj);
      this.am = new MoneyType();
      this.am.setIdAndKey(2 & 5, "伏魔令");
      Class319[] var5 = new Class319[var10001];
      var10003 = true;
      this.ak = var5;
      Class556[] var7 = new Class556[--2];
      var10003 = true;
      this.ag = var7;
      Class217[] var8 = new Class217[1 ^ 3];
      var10003 = true;
      this.ao = var8;
      Class245[] var9 = new Class245[1 ^ 3];
      var10003 = true;
      this.al = var9;

      for(var10000 = var2 = 3 >> 2; var10000 < 2; var10000 = var2) {
         this.ag[var2] = Class133.m(244, 74 + 160 * var2, 94, 19, 10, Color.white, Class681.q, this.am, var1);
         this.ao[var2] = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)), Class681.q, Color.white);
         this.al[var2] = Class133.a(244, 128 + 160 * var2, 94, 19, 10, Color.white, Class681.q);
         this.ao[var2].setBounds(244, 101 + 160 * var2, 94, 19);
         this.ag[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         this.al[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         this.ag[var2].ab(2);
         this.add(this.ao[var2]);
         this.add(this.al[var2]);
         this.add(this.ag[var2]);
         Class319[] var11 = this.ak;
         int var10004 = var2;
         Class319 var12 = new Class319(15, this.ao[var2], this.gk());
         ++var2;
         var11[var10004] = var12;
      }

      Class436[] var10 = new Class436[6];
      var10003 = true;
      this.an = var10;

      for(var10000 = var2 = 2 & 5; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         Class166 var6;
         if (var2 >= 0 && var2 <= 3 >> 1) {
            if (var2 == 0) {
               var6 = this;
               this.an[var2].fw("sc/d/77.png");
            } else {
               if (var2 == (2 ^ 3)) {
                  this.an[var2].fw("sc/d/78.png");
               }

               var6 = this;
            }

            var6.an[var2].setBounds(82, 65 + var2 * 160, 92, 92);
            var6 = this;
         } else if (var2 >= 2 && var2 <= 3) {
            var6 = this;
            this.an[var2].eq(Class511.q("sc/d/4.png", 5, 5, 5, 5, (boolean)(3 >> 2)));
            this.an[var2].setBounds(78, 61 + (var2 - 2) * 160, 100, 100);
         } else {
            if (var2 >= 4 && var2 <= 5) {
               this.an[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 >> 2)));
               this.an[var2].setBounds(50, 28 + (var2 - 4) * 160, 411, 158);
            }

            var6 = this;
         }

         var6.add(this.an[var2++]);
      }

   }
}
