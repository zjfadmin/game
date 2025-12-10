package com.xy;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCLucky;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class137 extends Class456 {
   private ActivityFC aor;
   private int[] amr;
   private Class345 nz;
   private JLabel[] iv;
   private Class556[] zi;
   private Class436[] be;
   private List<null> ie;
   private Activity ex;
   private Class379[] aos;

   public void ab(int var1) {
      if (var1 != (17623 & 15275)) {
         if (var1 == (7156 & 25743) || var1 == (7829 & 25071)) {
            long var11 = (long)(var1 == (10422 & 22477) ? 4 ^ 5 : 10);
            RoleData var4 = this.nz.vd();
            ActivityFCLucky var5;
            ActivityFCBase[] var6 = (var5 = (ActivityFCLucky)this.aor.getData()).getUses();

            int var7;
            int var10000;
            for(var10000 = var7 = 3 >> 2; var10000 < var6.length; var10000 = var7) {
               ActivityFCBase var8;
               if ((var8 = var6[var7]).getType() == (4 ^ 5)) {
                  var11 = Math.min(var11, var4.getActivityMoney(this.ex.getId(), var8.getId()) / var8.getNum());
               } else if (var8.getType() == --4) {
                  MoneyType var9;
                  if ((var9 = new MoneyType(ActivityFC.getActivityMoneyKey(var8.getKey()), 0L)).getId() == 0) {
                     var9.setKey(var8.getKey());
                  }

                  var11 = Math.min(var11, var4.getMoney(var9) / var8.getNum());
               }

               ++var7;
            }

            if (var11 <= 0L) {
               this.nz.aej.f("积分不足");
               return;
            }

            var7 = 0;
            Class603 var14 = this.nz.vc();
            ActivityFCBase[] var15 = var5.getGains();

            int var12;
            for(var10000 = var12 = 3 >> 2; var10000 < var15.length; var10000 = var12) {
               ActivityFCBase var13;
               if ((var13 = var15[var12]).getType() != (4 ^ 5)) {
                  if (var13.getType() != (1 ^ 3)) {
                     if (var13.getType() == --3) {
                        ++var7;
                     } else {
                        var13.getType();
                     }
                  } else {
                     Goodstable var10 = var14.n(new BigDecimal(var13.getId()));
                     var7 = (int)((long)var7 + (var10 != null && GoodType.ag(var10.getType()) ? 1L : var13.getNum()));
                  }
               }

               ++var12;
            }

            var7 = (int)((long)var7 * var11);
            if (var4.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var7) < var7) {
               this.nz.aej.f("你的背包不够");
               return;
            }

            this.nz.aej.gameTXMask.a("HDCJ", --2, this.ex.getId() + "|" + this.aor.getId() + "|" + var11);
            return;
         }

         if (var1 == (2559 & 30342)) {
            String var2 = Agreement.getSendTextAES("activity", this.ex.getId() + "|L" + this.aor.getId());
            this.nz.aej.getClient().d(var2);
         }
      }

   }

   public void ch(int[] var1) {
      int var10000 = 5 >> 3;
      this.amr = var1;

      for(int var5 = var10000; var10000 < this.ie.size(); var10000 = var5) {
         <undefinedtype> var2;
         String var3;
         int var4;
         if ((var2 = (<undefinedtype>)this.ie.get(var5)).bn == --1 && var2.isVisible() && (var4 = (var3 = var2.bd.getText()).indexOf("/")) != -4 >> 2) {
            int var6 = Class394.b(var3, var4 + (2 ^ 3), var3.length());
            var2.bd.setText(Math.max(5 >> 3, var6 - this.mi(var5)) + "/" + var6);
         }

         ++var5;
      }

   }

   public Class137(Class345 var1) {
      int var10001 = --4;
      int var10006 = 3 & 4;
      super();
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.setBounds(var10006, 5 >> 3, 20207 & 13305, 5622 & 27597);
      this.nz = var1;
      this.ie = new ArrayList();
      Class379[] var5 = new Class379[var10001];
      boolean var10003 = true;
      this.aos = var5;

      int var2;
      Class137 var3;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.aos.length; var10000 = var2) {
         if (var2 == 0) {
            var3 = this;
            this.aos[var2] = new Class379("sc/e/158.png", 4 ^ 5, (20911 & 11987) + var2, var1, this);
            this.aos[var2].setBounds(8927 & 24510, 59 & 125, 93 & 59, 93 & 59);
         } else if (var2 >= (4 ^ 5) && var2 <= (1 ^ 3)) {
            Class379[] var4 = this.aos;
            Class379 var10002 = new Class379;
            int var10005 = 3 >> 1;
            var10006 = (15255 & 17643) + var2;
            Font var10007 = Class681.ak;
            String var10009;
            Class345 var10010;
            if (var2 == 5 >> 2) {
               var10009 = "单抽一次";
               var10010 = var1;
            } else {
               var10009 = "连抽十次";
               var10010 = var1;
            }

            var10002.<init>("sc/e/154.png", var10005, var10006, var10007, (Color[])null, var10009, var10010, this);
            var4[var2] = var10002;
            var3 = this;
            this.aos[var2].setForeground(Class681.c("#c523425"));
            this.aos[var2].setBounds((5567 & 27623) + (var2 - (3 >> 1)) * (126 & 117), 21878 & 11263, 91 & 127, 46 & 115);
         } else {
            if (var2 == --3) {
               this.aos[var2] = new Class379("sc/e/161.png", 4 ^ 5, (30431 & 2467) + var2, var1, this);
               this.aos[var2].setBounds(7835 & 25572, 27133 & 6014, 62 & 125, 42);
            }

            var3 = this;
         }

         var3.add(this.aos[var2++]);
      }

      JLabel[] var6 = new JLabel[6];
      var10003 = true;
      this.iv = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.b(365, 155 + 120 * var2, 179, 28, Class681.c("#c6E3D2C"), Class681.h);
         if (var2 >= --2 && var2 <= --3) {
            var3 = this;
            this.iv[var2].setBounds(220, 378 + (var2 - --2) * 25, 72, 18);
            this.iv[var2].setFont(Class681.ak);
         } else {
            if (var2 >= --4 && var2 <= --5) {
               this.iv[var2].setBounds(408 + (var2 - --4) * 116, 406, 120, 16);
               this.iv[var2].setFont(Class681.bm);
            }

            var3 = this;
         }

         var3.iv[var2].setText(var2 == 0 ? "大奖展示" : (var2 == (4 ^ 5) ? "奖池展示" : (var2 == 5 >> 1 ? "累计积分" : (var2 == --3 ? "当前积分" : (var2 == --4 ? "消耗100积分" : (var2 == --5 ? "消耗1000积分" : ""))))));
         this.iv[var2].setHorizontalAlignment(3 & 4);
         this.add(this.iv[var2++]);
      }

      Class556[] var7 = new Class556[--2];
      var10003 = true;
      this.zi = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.zi.length; var10000 = var2) {
         this.zi[var2] = Class133.m(291, 371 + 25 * var2, 118, 30, 2 & 5, Color.white, Class681.q, (MoneyType)null, var1.aej);
         this.zi[var2].eq(Class511.q("sc/d/124.png", 20, 10, 20, 10, (boolean)(5 >> 3)));
         this.add(this.zi[var2++]);
      }

      Class436[] var9 = new Class436[--3];
      var10003 = true;
      this.be = var9;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.be[var2].fw("sc/d/125.png");
            this.be[var2].setBounds(203, 151, 503, 284);
         } else {
            if (var2 >= (2 ^ 3) && var2 <= 5 >> 1) {
               this.be[var2].fw("sc/d/103.png");
               this.be[var2].setBounds(320, 164 + (var2 - (2 ^ 3)) * 120, 278, 11);
            }

            var3 = this;
         }

         var3.add(this.be[var2++]);
      }

   }

   public int ae() {
      return this.aor != null ? this.aor.getId() : 0;
   }

   public <undefinedtype> aga(int var1, int var2) {
      <undefinedtype> var3 = var1 < this.ie.size() ? (<undefinedtype>)this.ie.get(var1) : null;
      if (var3 != null) {
         var3.ab(var2);
         return var3;
      } else {
         Class456 var4 = new Class456() {
            private JLabel bd;
            private int bn;
            private Class44 ae;
            private Class436 ih;

            public void ax(Goodstable var1) {
               Class44 var10000 = this.ae;
               int var10001;
               Goodstable var10002;
               if (var1 != null) {
                  var10001 = --1;
                  var10002 = var1;
               } else {
                  var10001 = 0;
                  var10002 = var1;
               }

               var10000.c(var10001, var10002);
            }

            public {
               this.setLayout((LayoutManager)null);
               this.setBackground(Class681.cu);
               this.ae = new Class44(Class137.this.nz);
               this.ae.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(2 & 5)));
               this.ih = new Class436();
               this.add(this.ae);
               this.add(this.ih);
            }

            public void vx(int var1, ActivityFCBase var2) {
               this.bd.setText(var1 + "/" + var2.getNum());
               this.bd.setForeground(var1 > 0 ? Color.black : Color.red);
               Class603 var3 = Class137.this.nz.vc();
               Goodstable var4 = var3.n(new BigDecimal(var2.getId()));
               Class44 var10000 = this.ae;
               int var10001;
               Goodstable var10002;
               if (var4 != null) {
                  var10001 = 2 ^ 3;
                  var10002 = var4;
               } else {
                  var10001 = 0;
                  var10002 = var4;
               }

               var10000.c(var10001, var10002);
            }

            public void ab(int var1) {
               if (this.bn != var1) {
                  this.bn = var1;
                  if (var1 == (4 ^ 5)) {
                     if (this.bd == null) {
                        this.bd = Class133.b(119 & 30, 94 & 111, 55 & 126, 78 & 63, Color.white, Class681.al);
                        this.bd.setHorizontalAlignment(3 >> 2);
                        this.add(this.bd, 2 & 5);
                     }

                     if (!this.bd.isVisible()) {
                        this.bd.setVisible((boolean)(5 >> 2));
                     }

                     this.ae.ad(Class44.adx);
                     this.ae.setBounds(31 & 119, 94 & 57, 119 & 60, 119 & 60);
                     this.ih.fw("sc/d/122.png");
                     this.ih.setBounds(3 ^ 3, 3 ^ 3, 111 & 118, 119 & 107);
                  } else {
                     if (var1 == (1 ^ 3)) {
                        if (this.bd != null && this.bd.isVisible()) {
                           this.bd.setVisible((boolean)(3 & 4));
                        }

                        this.ae.ad(Class44.ard);
                        this.ae.setBounds(63 & 74, 27 & 111, 59 & 111, 59 & 111);
                        this.ih.fw("sc/d/123.png");
                        this.ih.setBounds(3 >> 2, 3 >> 2, 87 & 105, 72 & 119);
                     }

                  }
               }
            }
         };
         var4.ab(var2);
         this.ie.add(var4);
         this.add(var4, 2 & 5);
         return var4;
      }
   }

   public int mi(int var1) {
      return this.amr != null && var1 < this.amr.length ? this.amr[var1] : 0;
   }

   public void cs(Activity var1, ActivityMenuSet2 var2) {
      Class603 var10 = this.nz.vc();
      ActivityFC var4 = null;
      FormulaNum[] var8;
      int var7 = (var8 = var2.getBases()).length;

      int var3;
      int var6;
      int var9;
      int var10000;
      for(var10000 = var6 = 5 >> 3; var10000 < var7; var10000 = var6) {
         FormulaNum var5 = var8[var6];
         var9 = 3 ^ 3;
         var3 = var5.getSize();
         if (var9 < var3) {
            var4 = var10.m((int)var5.getZhi(var9));
         }

         ++var6;
      }

      if (var4 != null && var4.getType() == --3) {
         this.ex = var1;
         this.aor = var4;
         ActivityFCLucky var27 = (ActivityFCLucky)var4.getData();
         ActivityFCBase[] var19 = var27.getUses();
         ActivityFCBase[] var20 = var27.getLuckys();
         int var23;
         if ((var23 = 3 ^ 3) < var19.length) {
            String var24 = null;
            ActivityFCBase var14;
            MoneyType var16;
            Class137 var28;
            if ((var14 = var19[var23]).getType() == (4 ^ 5)) {
               var24 = "积分";
               var16 = new MoneyType(-1 & -2, (long)var1.getId() << (40 & 119) | (long)var14.getId());
               MoneyType var11 = new MoneyType(-3 & -1, (long)var1.getId() << (48 & 111) | (long)var14.getId());
               var28 = this;
               this.zi[3 ^ 3].xa(var16);
               this.zi[--1].xa(var11);
               this.iv[5 >> 1].setText("累计积分");
               this.iv[--3].setText("当前积分");
            } else {
               if (var14.getType() == --4) {
                  var24 = var14.getKey();
                  var16 = new MoneyType();
                  var16.setId(var14.getId());
                  var16.setKey(var14.getKey());
                  this.zi[3 & 4].xa((MoneyType)null);
                  this.zi[5 >> 2].xa(var16);
                  this.iv[1 ^ 3].setText("累计" + var24);
                  this.iv[--3].setText("当前" + var24);
               }

               var28 = this;
            }

            var28.iv[--4].setText("消耗" + var14.getNum() + var24);
            this.iv[--5].setText("消耗" + var14.getNum() * 10L + var24);
         }

         this.zi[3 >> 2].cc();
         this.zi[--1].cc();
         var23 = (5599 & 27627) - var20.length * (55 & 127);
         var9 = 3 & 4;

         int var10001;
         int var10003;
         int var10004;
         int var10005;
         for(var10000 = var3 = 5 >> 3; var10000 < var20.length; var10000 = var3) {
            ActivityFCBase var17 = var20[var3];
            <undefinedtype> var25 = this.aga(var9, 3 & 5);
            var10001 = --1;
            var25.vx((int)Math.max(0L, var17.getNum() - (long)this.mi(var3)), var17);
            var10003 = var23 + (126 & 111) * var3;
            var10004 = 1019 & 31926;
            var10005 = 111 & 118;
            ++var9;
            var25.setBounds(var10003, var10004, var10005, 115 & 111);
            var25.setVisible((boolean)var10001);
            ++var3;
         }

         String var15;
         int var18;
         if (!Class394.o(var15 = this.nz.vc().cj(var2.getT2()))) {
            var18 = --1 + Class394.f((char)('}' & '~'), var15);
            var23 = (4095 & 29129) - var18 * (63 & 99);
            int var26 = 2 & 5;
            int var13 = 3 >> 2;

            for(var10000 = var6 = 3 & 4; var10000 < var15.length(); var10000 = var6) {
               if ((var6 = var15.indexOf("|", var13 + --1)) == -4 >> 2) {
                  var6 = var15.length();
               }

               Goodstable var22 = var10.n(new BigDecimal(Class394.b(var15, var13, var6)));
               <undefinedtype> var12 = this.aga(var9, --2);
               var10001 = --1;
               var12.ax(var22);
               var10003 = var23 + (86 & 111) * var26;
               var10004 = 20799 & 12266;
               var10005 = 123 & 69;
               ++var9;
               var12.setBounds(var10003, var10004, var10005, 64);
               var12.setVisible((boolean)var10001);
               ++var26;
               var13 = var6 + 1;
            }
         }

         for(var10000 = var18 = var9; var10000 < this.ie.size(); var10000 = var18) {
            Object var29 = this.ie.get(var18);
            ++var18;
            ((<undefinedtype>)var29).setVisible(false);
         }

         String var21 = Agreement.getSendTextAES("activity", var1.getId() + "|S" + var4.getId());
         this.nz.aej.getClient().d(var21);
      }
   }
}
