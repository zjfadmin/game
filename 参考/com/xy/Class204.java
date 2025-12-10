package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.TTWarRecord;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;

public class Class204 extends Class345 {
   private <undefinedtype>[] ld;
   private Class44 cn;
   private JLabel[] ad;
   private Class529[] le;
   private JLabel ax;

   public void y(int var1) {
      if (var1 >= (59 & 126) && var1 <= (127 & 62)) {
         BigDecimal var5;
         if ((var5 = this.co(var1 - (62 & 123))) != null) {
            String var6 = Agreement.getSendTextAES("teamArena", "M" + var5);
            this.uw().d(var6);
         }
      } else {
         String var2;
         if (var1 != (63 & 115) && var1 != (55 & 124) && var1 != (119 & 61) && var1 != (123 & 61)) {
            if (var1 == (126 & 55)) {
               var2 = Agreement.getSendTextAES("getfivemsg", "DD1");
               this.uw().d(var2);
            } else if (var1 == (55 & 127)) {
               List var4;
               if ((var4 = (List)this.vc().bz().getNpcShopMap().get("2027")) != null) {
                  Class423 var3 = (Class423)this.ve().e(126 & 89);
                  var3.arm(var4, "竞技积分");
                  this.ve().a(122 & 93);
               }
            } else {
               if (var1 == (62 & 121)) {
                  var2 = Agreement.getSendTextAES("teamArena", "C");
                  this.uw().d(var2);
               }

            }
         } else {
            var2 = Agreement.getSendTextAES("teamArena", "R" + (var1 == (127 & 57) ? 3 ^ 3 : var1 - (55 & 122)));
            this.uw().d(var2);
         }
      }
   }

   public void f(String var1) {
      LoginResult var2 = this.vd().getLoginResult();
      String[] var5;
      int var4 = Integer.parseInt((var5 = var1.split("\\|"))[3 ^ 3].substring(--1));
      this.ax.setText(var5[5 >> 2]);
      this.cn.fx(Class222.l(var2.getSpecies_id().toString()));
      this.ad[3 >> 2].setText(var2.getRolename());
      this.ad[1 ^ 3].setText(Class224.r(var2.getGrade()));
      this.ad[5 >> 1].setForeground(Class681.i(Class224.g(var2.getGrade())));
      this.ad[--4].setText(Class224.k(var2.getPkrecord()));
      TTWarRecord var3 = var4 > 0 ? var2.getTTWarRecord(var4) : null;
      this.ad[--1].setText(var3 != null ? var3.getTTSL() + "/" + (var3.getTTCZ() - var3.getTTSJ()) : "0/0");
      this.ad[--3].setText(var5[5 >> 1]);
      var3 = var4 > 5 >> 2 ? var2.getTTWarRecord(var4 - (3 & 5)) : null;
      this.ad[--5].setText(var3 != null && var3.getTTRank() > 0 ? String.valueOf(var3.getTTRank()) : "未上榜");

      int var6;
      for(int var10000 = var6 = 3 ^ 3; var10000 < this.ld.length; var10000 = var6) {
         this.ld[var6].a(var6 + --3 < var5.length ? var5[var6 + --3] : null);
         ++var6;
      }

      this.ve().a(this.ae());
   }

   public Class204(GameView var1) {
      int var10001 = 26 & 127;
      int var10005 = -4 >> 2;
      super(122 & 127, --2, Class345.aef, var1);
      this.va(var10005, 2 & 5, 21226 & 12215, 21973 & 11243, Class345.aeo);
      this.fx("sc/b/S284.png");
      JLabel[] var5 = new JLabel[var10001];
      boolean var10003 = true;
      this.ad = var5;

      int var3;
      Class204 var4;
      int var10000;
      for(var10000 = var3 = 3 & 4; var10000 < this.ad.length; var10000 = var3) {
         this.ad[var3] = new JLabel("测试数据隔山");
         if (var3 < (63 & 70)) {
            this.ad[var3].setBounds(var3 % (5 >> 1) == 0 ? 19447 & 13471 : 351, 62 + var3 / (1 ^ 3) * (63 & 95), 127 & 100, 90 & 55);
            var4 = this;
            this.ad[var3].setFont(Class681.ce);
         } else {
            int var2 = (var3 - (55 & 78)) / --4;
            var4 = this;
            this.ad[var3].setBounds((85 & 126) + var2 * (119 & 125), (20479 & 12596) + (var3 - (119 & 14)) % --4 * (119 & 27), 81 & 126, 18);
            this.ad[var3].setFont(Class681.bm);
         }

         var4.add(this.ad[var3++]);
      }

      <undefinedtype>[] var6 = new <undefinedtype>[--5];
      var10003 = true;
      this.ld = var6;

      for(var10000 = var3 = 3 & 4; var10000 < this.ld.length; var10000 = var3) {
         <undefinedtype>[] var7 = this.ld;
         var10001 = var3;
         Object var8 = new Object(var3, this) {
            private BigDecimal a;
            private int c;
            private Class529 d;
            private Class19 e;

            public void a(String var1) {
               this.d.setVisible((boolean)(var1 != null ? --1 : 0));
               if (var1 == null) {
                  Class204.this.ad[(102 & 31) + --4 * this.c].setText((String)null);
                  Class204.this.ad[(15 & 119) + --4 * this.c].setText((String)null);
                  Class204.this.ad[(40 & 95) + --4 * this.c].setText((String)null);
                  Class204.this.ad[(105 & 31) + --4 * this.c].setText((String)null);
                  this.a = null;
                  this.e = null;
               } else {
                  String[] var4;
                  String[] var10000 = var4 = var1.split("=");
                  int var2 = Integer.parseInt(var10000[--5]);
                  int var3 = Integer.parseInt(var10000[39 & 94]);
                  int var10006 = 2 ^ 3;
                  this.a = new BigDecimal(var4[2 & 5]);
                  this.e = Class330.f(var4[var10006], 87 & 47, 4 ^ 5, (String)null);
                  Class204.this.ad[(46 & 87) + --4 * this.c].setText(var4[--3]);
                  Class204.this.ad[(119 & 15) + --4 * this.c].setText(Class224.r(Integer.parseInt(var4[1 ^ 3])));
                  Class204.this.ad[(57 & 78) + --4 * this.c].setText(var4[--4]);
                  Class204.this.ad[(29 & 107) + --4 * this.c].setText(var3 + "/" + (var2 - var3));
               }
            }

            public void c(Graphics var1) {
               if (this.e != null) {
                  this.e.a(var1, (94 & 127) + this.c * (119 & 125), 15198 & 17855, 3 ^ 3, System.currentTimeMillis());
               }
            }

            public {
               this.c = var2;
               this.d = new Class529("sc/e/7.png", 3 & 5, (63 & 122) + var2, Class681.ak, Class681.c, "膜拜", var3);
               this.d.setBounds((71 & 124) + (117 & 127) * var2, 14231 & 18926, 127 & 59, 123 & 30);
               var3.add(this.d);
            }
         };
         ++var3;
         var7[var10001] = (<undefinedtype>)var8;
      }

      Class529[] var10 = new Class529[7];
      var10003 = true;
      this.le = var10;

      for(var10000 = var3 = 3 >> 2; var10000 < this.le.length; var10000 = var3) {
         label39: {
            if (var3 < 6) {
               this.le[var3] = new Class529("sc/b/B" + (386 + var3) + ".png", 5 >> 2, 51 + var3, this);
               if (var3 < --3) {
                  var4 = this;
                  this.le[var3].setBounds(440, 58 + 30 * var3, 80, 21);
                  break label39;
               }

               if (var3 < 6) {
                  var4 = this;
                  this.le[var3].setBounds(530, 59 + 30 * (var3 - --3), 100, 19);
                  break label39;
               }
            } else if (var3 == 6) {
               this.le[var3] = new Class529("sc/e/28.png", --1, 57, Class681.bm, (Color[])null, "赛季奖励", this);
               this.le[var3].setBounds(29, 133, 68, 17);
            }

            var4 = this;
         }

         var4.add(this.le[var3++]);
      }

      this.ax = new JLabel("第一赛季:2021年7月1日 至 2021年7月15日");
      this.ax.setFont(Class681.ad);
      this.ax.setForeground(Color.red);
      this.ax.setBounds(28, 159, 460, 16);
      this.add(this.ax);
      this.cn = new Class44(this);
      this.cn.ad(new Class116(5 >> 1, 5 >> 1, 66, 66));
      this.cn.setBounds(28, 55, 70, 70);
      this.cn.fw("sc/b/S155.png");
      this.add(this.cn);
   }

   protected void paintComponent(Graphics var1) {
      int var10000 = 5 >> 3;
      super.paintComponent(var1);

      for(int var2 = var10000; var10000 < this.ld.length; var10000 = var2) {
         this.ld[var2++].c(var1);
      }

   }

   public BigDecimal co(int var1) {
      return this.ld[var1].a;
   }
}
