package com.xy;

import com.xy.bean.BeauBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Class225 extends Class345 {
   private JLabel[] hj;
   private Class70[] ms;
   private Class436[] an;
   private RichLabel gi;

   public void d() {
      RoleData var1;
      if ((var1 = this.vd()) != null) {
         UseCardBean var2;
         BeauBean var3 = (var2 = var1.getLimit("靓号")) != null ? var2.a() : null;
         Class225 var10000;
         if (var3 == null) {
            var10000 = this;
            this.gi.setTextSize("", 480 & 32607);
         } else if (var3.a()) {
            this.gi.setTextSize("#VBEAU" + var3.toString() + "#L", 7139 & 25948);
            var10000 = this;
         } else {
            this.gi.setTextSize("#cFF00FF" + var3.getBeau(), 26969 & 6118);
            var10000 = this;
         }

         var10000.gi.setBounds((126 & 51) + ((28007 & 5080) - this.gi.getWidth()) / (1 ^ 3), 127 & 116, this.gi.getWidth(), this.gi.getHeight());
         this.hj[5 >> 1].setText(String.valueOf(var1.getRoleId()));
         if (var3 != null) {
            this.hj[--4].setText(Class280.c(var2.getTime(), "yyyy年MM月dd日"));
            this.hj[--3].setVisible((boolean)(4 ^ 5));
            this.hj[--4].setVisible((boolean)(2 ^ 3));
            this.ms[2 & 5].setVisible((boolean)(4 ^ 5));
            this.ms[--1].setVisible((boolean)(5 >> 2));
         } else {
            this.hj[--3].setVisible((boolean)(2 & 5));
            this.hj[--4].setVisible((boolean)(3 >> 2));
            this.ms[3 ^ 3].setVisible((boolean)(5 >> 3));
            this.ms[2 ^ 3].setVisible((boolean)(5 >> 3));
         }
      }
   }

   public void q() {
      if (this.vd() != null) {
         this.d();
         super.q();
      }
   }

   public Class225(GameView var1) {
      int var10001 = --5;
      int var10005 = -4 >> 2;
      super(11519 & 21431, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 2459 & 30710, 9680 & 23487, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 70 & 125, 70 & 125, 70 & 125, 70 & 125, (boolean)(2 & 5)), "我的靓号");
      Class70[] var5 = new Class70[var10001];
      boolean var10003 = true;
      this.ms = var5;

      int var2;
      Class225 var4;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.ms.length; var10000 = var2) {
         Class70[] var3 = this.ms;
         Class70 var6 = new Class70;
         String var10004 = var2 == 0 ? "sc/e/6.png" : (var2 == 5 >> 2 ? "sc/e/7.png" : "sc/e/26.png");
         int var10006 = (5117 & 28031) + var2;
         Font var10007 = Class681.ak;
         String var10009;
         Class225 var10010;
         if (var2 == 0) {
            var10009 = "捐献";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "续费";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "开通靓号";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "靓号染色";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "频道显示";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var6;
         this.ms[var2].setBounds(9059 & 24031, 23231 & 9727, 47 & 114, 62 & 83);
         if (var2 == 0) {
            var4 = this;
            this.ms[var2].setFont(Class681.bm);
            this.ms[var2].setForeground(Color.white);
         } else if (var2 == --1) {
            var4 = this;
            this.ms[var2].setBounds(32610 & 413, 20735 & 12220, 59 & 127, 31 & 121);
            this.ms[var2].setForeground(Color.black);
         } else {
            if (var2 >= (1 ^ 3) && var2 <= --4) {
               this.ms[var2].setBounds(29527 & 3496, (13567 & 19453) + (var2 - (1 ^ 3)) * (63 & 106), 99, 25);
               this.ms[var2].setForeground(Color.black);
            }

            var4 = this;
         }

         var4.add(this.ms[var2++]);
      }

      this.gi = new RichLabel("", Class681.q);
      this.add(this.gi);
      JLabel[] var7 = new JLabel[12];
      var10003 = true;
      this.hj = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.b(50, 32, 320, 21, Color.white, Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "当前效果" : (var2 == 3 >> 1 ? "原始ID：" : (var2 == --2 ? "学习交流练习自学10086" : (var2 == --3 ? "靓号到期时间：" : (var2 == --4 ? "2020年5月15号" : (var2 == --5 ? "到期未续费则会回收靓号，需重新购买或竞拍" : (var2 == 6 ? "极品靓号，" : (var2 == 7 ? "尽享尊贵" : (var2 == 8 ? "靓号染色，" : (var2 == 9 ? "彰显个性" : (var2 == 10 ? "频道显示，" : (var2 == 11 ? "万人瞩目" : ""))))))))))));
         this.hj[var2].setHorizontalAlignment(10);
         if (var2 == 0) {
            var4 = this;
            this.hj[var2].setHorizontalAlignment(3 >> 2);
         } else {
            label214: {
               if (var2 >= (2 ^ 3) && var2 <= --5) {
                  this.hj[var2].setFont(Class681.ab);
                  if (var2 == --1) {
                     var4 = this;
                     this.hj[var2].setBounds(60, 60, 54, 14);
                     break label214;
                  }

                  if (var2 == 5 >> 1) {
                     var4 = this;
                     this.hj[var2].setBounds(114, 60, 200, 14);
                     break label214;
                  }

                  if (var2 == --3) {
                     var4 = this;
                     this.hj[var2].setBounds(60, 193, 91, 14);
                     break label214;
                  }

                  if (var2 == 4) {
                     var4 = this;
                     this.hj[var2].setBounds(151, 193, 100, 14);
                     break label214;
                  }

                  if (var2 == 5) {
                     var4 = this;
                     this.hj[var2].setBounds(81, 225, 280, 14);
                     this.hj[var2].setForeground(Color.black);
                     break label214;
                  }
               } else if (var2 >= 6 && var2 <= 11) {
                  this.hj[var2].setFont(Class681.cf);
                  this.hj[var2].setBounds(77 + (var2 - 6) % 2 * 85, 254 + (var2 - 6) / 2 * 42, 100, 19);
                  if (var2 == 6 || var2 == 8 || var2 == 10) {
                     this.hj[var2].setForeground(Color.yellow);
                  }
               }

               var4 = this;
            }
         }

         var4.add(this.hj[var2++]);
      }

      Class436[] var8 = new Class436[6];
      var10003 = true;
      this.an = var8;

      for(var10000 = var2 = 5 >> 3; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         this.add(this.an[var2]);
         if (var2 >= 0 && var2 <= 2) {
            this.an[var2].eq(Class511.q("sc/d/66.png", 100, --1, 100, --1, (boolean)(3 >> 2)));
            if (var2 == 0) {
               this.an[var2].setBounds(60, 180, 300, 2);
            } else if (var2 == 3 >> 1) {
               this.an[var2].setBounds(60, 283, 300, 2);
            } else if (var2 == 2) {
               this.an[var2].setBounds(60, 325, 300, 2);
            }
         } else if (var2 == 3) {
            this.an[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            this.an[var2].setBounds(50, 32, 320, 21);
         } else if (var2 >= 4 && var2 <= 5) {
            this.an[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 & 4)));
            if (var2 == 4) {
               this.an[var2].setBounds(50, 32, 320, 190);
            } else if (var2 == 5) {
               this.an[var2].setBounds(50, 241, 320, 132);
            }
         }

         ++var2;
      }

   }

   public void y(int var1) {
      if (var1 == (26495 & 6655)) {
         String var5 = Agreement.getSendTextAES("BEAU", "V0");
         this.uw().d(var5);
      } else {
         RoleData var2;
         if ((var2 = this.vd()) != null) {
            UseCardBean var4;
            BeauBean var3 = (var4 = var2.getLimit("靓号")) != null ? var4.a() : null;
            if (var3 != null) {
               if (var1 == (30205 & 2943)) {
                  this.aej.aal(new ConfirmBean(43 & 118, (String)null, "你确定要放弃该靓号吗？"));
               } else if (var1 == (32255 & 894)) {
                  Class658.cy(2557 & 30395, this.aej);
               } else {
                  if (var1 == (10117 & 23034)) {
                     if (var3.getLvl() != (4 ^ 5)) {
                        this.aej.f("该靓号无需染色");
                        return;
                     }

                     Class658.cy(184, this.aej);
                  }

               }
            }
         }
      }
   }
}
