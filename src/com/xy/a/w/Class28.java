package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class28 extends com.xy.q.Class30 {
   private Class52[] apl;
   private BigDecimal ee;
   private com.xy.i.Class20 aai;
   private int ae;
   private JLabel[] gj;
   private com.xy.q.Class14[] k;
   private com.xy.w.Class18 dn;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.e();
      }
   }

   public void e() {
      LoginResult var2 = this.yx().getLoginResult();
      this.apl[0].ef(var2.getExperience().longValue());
      this.apl[1].ef(var2.getContribution().longValue());
      this.apl[2].ef(var2.getGold().longValue());
   }

   public Class28(GameView var1) {
      super(106, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "ed9c968wx`";
      this.ee = new BigDecimal(100000);
      this.ae = -1;
      this.yy(-1, 0, 362, 315, com.xy.q.Class30.agh);
      com.xy.w.Class9 var25 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "俛炦";
      this.yu(var25, "修炼");
      var10008 = "tu(s($18wx`";
      String var10013 = "尺戊俛炦";
      this.aai = new com.xy.i.Class20("sc/e/26.png", 1, 349, Class49.ch, Class49.bv, "小成修炼", this);
      this.aai.setBounds(142, 265, 99, 25);
      this.add(this.aai);
      this.k = new com.xy.q.Class14[5];
      this.apl = new Class52[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.k.length; var10000 = var2) {
         this.k[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, Class49.w);
         com.xy.q.Class14 var5 = this.k[var2];
         String var10001 = "tu(r('08wx`";
         var5.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class28 var6;
         if (var2 == 0) {
            var6 = this;
            this.k[var2].setBounds(157, 40, 44, 19);
         } else if (var2 == 1) {
            var6 = this;
            this.k[var2].setBounds(285, 40, 44, 19);
         } else if (var2 == 2) {
            var6 = this;
            this.k[var2].setBounds(170, 101, 144, 19);
         } else if (var2 == 3) {
            var6 = this;
            this.k[var2].setBounds(170, 153, 144, 19);
         } else {
            if (var2 == 4) {
               this.k[var2].setBounds(170, 205, 144, 19);
            }

            var6 = this;
         }

         var6.add(this.k[var2++]);
      }

      for (int var7 = var2 = 0; var7 < this.apl.length; var7 = var2) {
         this.apl[var2] = com.xy.q.Class1.a(10, Color.white, Class49.w, null, var1);
         Class52 var8 = this.apl[var2];
         String var12 = "iV5Q5\u0004-\u001bj[}";
         var8.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class28 var9;
         if (var2 == 0) {
            var9 = this;
            this.apl[var2].setBounds(170, 127, 144, 19);
         } else if (var2 == 1) {
            var9 = this;
            this.apl[var2].setBounds(170, 179, 144, 19);
         } else {
            if (var2 == 2) {
               this.apl[var2].setBounds(170, 231, 144, 19);
            }

            var9 = this;
         }

         var9.apl[var2].n(2);
         this.apl[var2].setText("0");
         this.add(this.apl[var2++]);
      }

      this.gj = new JLabel[9];

      for (int var10 = var2 = 0; var10 < this.gj.length; var10 = ++var2) {
         int var10004 = 101 + (var2 - 3) * 26;
         var10008 = "5d&7&7&7";
         this.gj[var2] = com.xy.q.Class1.f(56, var10004, 120, 19, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var11 = this.gj[var2];
         String var14;
         if (var2 == 0) {
            var14 = "彦剗俛炦筼纽";
            var14 = "当前修炼等级";
         } else if (var2 == 1) {
            var14 = "迎叨俸炻";
            var14 = "还可修炼";
         } else if (var2 == 2) {
            var14 = "揥卝俛炦筼纽扵霚";
            var14 = "提升修炼等级所需";
         } else if (var2 == 3) {
            var14 = "俸炻扖震给骋";
            var14 = "修炼所需经验";
         } else if (var2 == 4) {
            var14 = "彦剗拐朓绺骖";
            var14 = "当前拥有经验";
         } else if (var2 == 5) {
            var14 = "俸炻扖震常账";
            var14 = "修炼所需帮贡";
         } else if (var2 == 6) {
            var14 = "彦剗拐朓帛贻";
            var14 = "当前拥有帮贡";
         } else if (var2 == 7) {
            var14 = "俸炻扖震采钶";
            var14 = "修炼所需金钱";
         } else if (var2 == 8) {
            var14 = "彦剗拐朓釤钫";
            var14 = "当前拥有金钱";
         } else {
            var14 = "";
         }

         var11.setText(var14);
         this.add(this.gj[var2]);
         if (var2 == 0) {
            this.gj[var2].setBounds(56, 40, 102, 19);
         } else if (var2 == 1) {
            this.gj[var2].setBounds(215, 40, 72, 19);
         } else if (var2 == 2) {
            this.gj[var2].setBounds(56, 69, 138, 19);
         }
      }

      this.dn = new com.xy.w.Class18();
      String var24 = "tu(r( 18wx`";
      this.dn.mt(com.xy.w.Class16.m("sc/d/66.png", 30, 1, 30, 1, false));
      this.dn.setBounds(188, 78, 150, 2);
      this.add(this.dn);
   }

   public void g(int var1) {
      this.ae = var1;
      Class28 var10000;
      if (this.ae == 1) {
         String var10001 = "尺戊俛炦";
         this.aai.setText("小成修炼");
         this.ee = new BigDecimal(this.za().l(2, 12) ? 1000000 : 2000000);
         var10000 = this;
         Class49.b(this.k[2], 2000000L);
         Class49.b(this.k[3], 300L);
         Class49.b(this.k[4], this.ee.longValue());
      } else {
         if (this.ae == 2) {
            String var7 = "失戗俸炻";
            this.aai.setText("大成修炼");
            this.ee = new BigDecimal(this.za().l(2, 12) ? 2000000 : 5000000);
            Class49.b(this.k[2], 5000000L);
            Class49.b(this.k[3], 1500L);
            Class49.b(this.k[4], this.ee.longValue());
         }

         var10000 = this;
      }

      LoginResult var3 = var10000.yx().getLoginResult();
      if (this.ae == 1) {
         String var8 = "B";
         int var4 = var3.getExtraPointInt("X");
         var10000 = this;
         this.k[0].setText(String.valueOf(var4));
         this.k[1].setText(String.valueOf(30 - var4));
      } else {
         if (this.ae == 2) {
            String var10002 = "C";
            int var5 = var3.getExtraPointInt("D");
            this.k[0].setText(String.valueOf(var5));
            this.k[1].setText(String.valueOf(60 - var5));
         }

         var10000 = this;
      }

      var10000.e();
   }

   public void f() {
      this.g(this.ae);
   }

   public void h() {
      LoginResult var1 = this.yx().getLoginResult();
      if (this.ae == 2) {
         String var10 = "B";
         if (var1.getExtraPointInt("X") < 30) {
            var10 = "尙戗俸炻尌札绅杘";
            this.afx._do("小成修炼尚未结束");
         } else {
            var10 = "^";
            if (var1.getExtraPointInt("D") >= 60) {
               var10 = "失戗俸炻巤终绅杘";
               this.afx._do("大成修炼已经结束");
            } else if (var1.getExperience().compareTo(new BigDecimal(5000000)) < 0) {
               var10 = "绺骖丸趩";
               this.afx._do("经验不足");
            } else if (var1.getContribution().compareTo(new BigDecimal(1500)) < 0) {
               var10 = "常账丛趴";
               this.afx._do("帮贡不足");
            } else if (var1.getGold().compareTo(this.ee) < 0) {
               var10 = "釤钫丸趩";
               this.afx._do("金钱不足");
            } else {
               var10 = " C";
               String var4 = Agreement.getSendTextAES("rolechange", "6D");
               this.za().k(var4);
            }
         }
      } else {
         if (this.ae == 1) {
            String var10001 = "B";
            if (var1.getExtraPointInt("X") >= 30) {
               var10001 = "尙戗俸炻巤终俸炻定毒";
               this.afx._do("小成修炼已经修炼完毕");
               return;
            }

            if (var1.getExperience().compareTo(new BigDecimal(2000000)) < 0) {
               var10001 = "绺骖丸趩";
               this.afx._do("经验不足");
               return;
            }

            if (var1.getContribution().compareTo(new BigDecimal(300)) < 0) {
               var10001 = "常账丛趴";
               this.afx._do("帮贡不足");
               return;
            }

            if (var1.getGold().compareTo(this.ee) < 0) {
               var10001 = "釤钫丸趩";
               this.afx._do("金钱不足");
               return;
            }

            var10001 = " _";
            String var3 = Agreement.getSendTextAES("rolechange", "6X");
            this.za().k(var3);
         }
      }
   }
}
