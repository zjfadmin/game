package com.xy.a.v;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class22;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCLucky;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameTXMask;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class16 extends com.xy.q.Class50 {
   private Activity sn;
   private JLabel[] lt;
   private com.xy.w.Class18[] sk;
   private int[] so;
   private com.xy.q.Class30 sp;
   private ActivityFC sq;
   private List<Class25> eq;
   private Class52[] sr;
   private com.xy.i.Class22[] ss;

   public Class25 nc(int var1, int var2) {
      Class25 var3 = var1 < this.eq.size() ? this.eq.get(var1) : null;
      if (var3 != null) {
         var3.n(var2);
         return var3;
      } else {
         var3 = new Class25(this);
         var3.n(var2);
         this.eq.add(var3);
         this.add(var3, 0);
         return var3;
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class30 nd(Class16 var0) {
      return var0.sp;
   }

   public void mj(Activity var1, ActivityMenuSet2 var2) {
      com.xy.v.Class8 var3 = this.sp.yt();
      ActivityFC var4 = null;
      FormulaNum[] var8;
      int var7 = (var8 = var2.getBases()).length;

      int var6;
      for (int var10000 = var6 = 0; var10000 < var7; var10000 = ++var6) {
         FormulaNum var5 = var8[var6];
         byte var9 = 0;
         int var10 = var5.getSize();
         if (var9 < var10) {
            var4 = var3.ba((int)var5.getZhi(var9));
         }
      }

      if (var4 != null && var4.getType() == 3) {
         this.sn = var1;
         this.sq = var4;
         ActivityFCLucky var35 = (ActivityFCLucky)var4.getData();
         ActivityFCBase[] var17 = var35.getUses();
         ActivityFCBase[] var18 = var35.getLuckys();
         byte var19 = 0;
         if (0 < var17.length) {
            String var22 = null;
            ActivityFCBase var24;
            Class16 var37;
            if ((var24 = var17[var19]).getType() == 1) {
               String var36 = "禥剚";
               var22 = "积分";
               MoneyType var11 = new MoneyType(-2, (long)var1.getId() << 32 | var24.getId());
               MoneyType var12 = new MoneyType(-3, (long)var1.getId() << 32 | var24.getId());
               var37 = this;
               this.sr[0].alj(var11);
               this.sr[1].alj(var12);
               JLabel var10002 = this.lt[2];
               String var10003 = "組论禄初";
               var10002.setText("累计积分");
               JLabel var10001 = this.lt[3];
               String var48 = "弙刑禥剚";
               var10001.setText("当前积分");
            } else {
               if (var24.getType() == 4) {
                  var22 = var24.getKey();
                  MoneyType var27 = new MoneyType();
                  var27.setId(var24.getId());
                  var27.setKey(var24.getKey());
                  this.sr[0].alj(null);
                  this.sr[1].alj(var27);
                  JLabel var45 = this.lt[2];
                  String var10004 = "組论";
                  var45.setText("累计" + var22);
                  JLabel var38 = this.lt[3];
                  String var50 = "弙刑";
                  var38.setText("当前" + var22);
               }

               var37 = this;
            }

            JLabel var39 = var37.lt[4];
            String var51 = "淣而";
            var39.setText("消耗" + var24.getNum() + var22);
            JLabel var40 = this.lt[5];
            var51 = "淂聋";
            var40.setText("消耗" + var24.getNum() * 10L + var22);
         }

         this.sr[0].l();
         this.sr[1].l();
         int var20 = 459 - var18.length * 55;
         int var23 = 0;

         int var25;
         for (int var41 = var25 = 0; var41 < var18.length; var41 = ++var25) {
            ActivityFCBase var28 = var18[var25];
            Class25 var32 = this.nc(var23, 1);
            var32.vj((int)Math.max(0L, var28.getNum() - this.ky(var25)), var28);
            int var53 = var20 + 110 * var25;
            var23++;
            var32.setBounds(var53, 178, 102, 99);
            var32.setVisible(true);
         }

         String var26;
         if (!com.xy.v.Class12.h(var26 = this.sp.yt().aj(var2.getT2()))) {
            int var29 = 1 + com.xy.v.Class12.ac('|', var26);
            int var21 = 457 - var29 * 35;
            int var33 = 0;
            int var13 = 0;
            int var14;
            int var42 = var14 = 0;

            while (var42 < var26.length()) {
               String var46 = "g";
               if ((var14 = var26.indexOf("|", var13 + 1)) == -1) {
                  var14 = var26.length();
               }

               Goodstable var15 = var3.ay(new BigDecimal(com.xy.v.Class12.ad(var26, var13, var14)));
               Class25 var16 = this.nc(var23, 2);
               var16.bb(var15);
               int var54 = var21 + 70 * var33;
               var23++;
               var16.setBounds(var54, 298, 65, 64);
               var16.setVisible(true);
               var33++;
               var13 = var14 + 1;
               var42 = var14;
            }
         }

         int var30;
         for (int var43 = var30 = var23; var43 < this.eq.size(); var43 = var30) {
            Object var44 = this.eq.get(var30);
            var30++;
            ((Class25)var44).setVisible(false);
         }

         StringBuilder var47 = new StringBuilder(String.valueOf(var1.getId()));
         String var49 = "6\u000f";
         String var31 = Agreement.getSendTextAES("activity", var47.append("|S").append(var4.getId()).toString());
         this.sp.afx.getClient().k(var31);
      }
   }

   public void ne(int[] var1) {
      int var10000 = 0;
      this.so = var1;

      for (int var2 = 0; var10000 < this.eq.size(); var10000 = ++var2) {
         Class25 var3;
         if (Class25.vk(var3 = this.eq.get(var2)) == 1 && var3.isVisible()) {
            String var4;
            String var7 = var4 = Class25.vl(var3).getText();
            String var10001 = "4";
            int var5;
            if ((var5 = var7.indexOf("/")) != -1) {
               int var6 = com.xy.v.Class12.ad(var4, var5 + 1, var4.length());
               JLabel var8 = Class25.vl(var3);
               StringBuilder var9 = new StringBuilder(String.valueOf(Math.max(0, var6 - this.ky(var2))));
               String var10002 = "s";
               var8.setText(var9.append("/").append(var6).toString());
            }
         }
      }
   }

   public void n(int var1) {
      if (var1 != 131) {
         if (var1 == 132 || var1 == 133) {
            long var13 = var1 == 132 ? 1 : 10;
            RoleData var4 = this.sp.yx();
            ActivityFCLucky var5;
            ActivityFCBase[] var6 = (var5 = (ActivityFCLucky)this.sq.getData()).getUses();

            int var7;
            for (int var10000 = var7 = 0; var10000 < var6.length; var10000 = ++var7) {
               ActivityFCBase var8;
               if ((var8 = var6[var7]).getType() == 1) {
                  var13 = Math.min(var13, var4.getActivityMoney(this.sn.getId(), var8.getId()) / var8.getNum());
               } else if (var8.getType() == 4) {
                  MoneyType var9;
                  if ((var9 = new MoneyType(ActivityFC.getActivityMoneyKey(var8.getKey()), 0L)).getId() == 0) {
                     var9.setKey(var8.getKey());
                  }

                  var13 = Math.min(var13, var4.getMoney(var9) / var8.getNum());
               }
            }

            if (var13 <= 0L) {
               String var22 = "禄初书趨";
               this.sp.afx._do("积分不足");
               return;
            }

            var7 = 0;
            com.xy.v.Class8 var16 = this.sp.yt();
            ActivityFCBase[] var17 = var5.getGains();

            int var10;
            for (int var18 = var10 = 0; var18 < var17.length; var18 = ++var10) {
               ActivityFCBase var11;
               if ((var11 = var17[var10]).getType() != 1) {
                  if (var11.getType() == 2) {
                     Goodstable var12 = var16.ay(new BigDecimal(var11.getId()));
                     var7 = (int)(var7 + (var12 != null && GoodType.z(var12.getType()) ? 1L : var11.getNum()));
                  } else if (var11.getType() == 3) {
                     var7++;
                  } else {
                     var11.getType();
                  }
               }
            }

            var7 = (int)(var7 * var13);
            if (var4.getGoodPackSum(-1L, new BigDecimal(-1), var7) < var7) {
               String var21 = "伪盘肆卙乇奃";
               this.sp.afx._do("你的背包不够");
               return;
            }

            GameTXMask var19 = this.sp.afx.gameTXMask;
            String var20 = "#_(Q";
            StringBuilder var10003 = new StringBuilder(String.valueOf(this.sn.getId()));
            String var10004 = " ";
            var10003 = var10003.append("|").append(this.sq.getId());
            var10004 = "g";
            var19.a("HDCJ", 2, var10003.append("|").append(var13).toString());
            return;
         }

         if (var1 == 134) {
            StringBuilder var10001 = new StringBuilder(String.valueOf(this.sn.getId()));
            String var10002 = "6\u0010";
            String var2 = Agreement.getSendTextAES("activity", var10001.append("|L").append(this.sq.getId()).toString());
            this.sp.afx.getClient().k(var2);
         }
      }
   }

   public int ky(int var1) {
      return this.so != null && var1 < this.so.length ? this.so[var1] : 0;
   }

   public Class16(com.xy.q.Class30 var1) {
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.setBounds(0, 0, 745, 452);
      this.sp = var1;
      this.eq = new ArrayList<>();
      this.ss = new com.xy.i.Class22[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ss.length; var10000 = var2) {
         Class16 var6;
         if (var2 == 0) {
            var6 = this;
            String var10006 = "9?e9em\u007fdd,$;";
            this.ss[var2] = new com.xy.i.Class22("sc/e/158.png", 1, 131 + var2, var1, this);
            this.ss[var2].setBounds(670, 57, 25, 25);
         } else if (var2 >= 1 && var2 <= 2) {
            com.xy.i.Class22[] var7 = this.ss;
            String var10004 = "\u0018xD~D*^/Ek\u0005|";
            int var32 = 131 + var2;
            String var34;
            com.xy.q.Class30 var10010;
            if (var2 == 1) {
               var34 = "匟拡乊歽";
               var34 = "单抽一次";
               var10010 = var1;
            } else {
               var34 = "辵抦匪欺";
               var34 = "连抽十次";
               var10010 = var1;
            }

            Class22 var10002 = new Class22("sc/e/154.png", 1, var32, Class49.ch, null, var34, var10010, this);
            var7[var2] = var10002;
            var6 = this;
            var10002 = this.ss[var2];
            String var10003 = "i?\u007fnyhxi";
            var10002.setForeground(com.xy.q.Class49.c("#c523425"));
            this.ss[var2].setBounds(423 + (var2 - 1) * 116, 374, 91, 34);
         } else {
            if (var2 == 3) {
               String var10005 = "\u0018xD~D*]*Ek\u0005|";
               this.ss[var2] = new com.xy.i.Class22("sc/e/161.png", 1, 131 + var2, var1, this);
               this.ss[var2].setBounds(640, 380, 60, 42);
            }

            var6 = this;
         }

         var6.add(this.ss[var2++]);
      }

      this.lt = new JLabel[6];

      for (int var8 = var2 = 0; var8 < this.lt.length; var8 = var2) {
         int var29 = 155 + 120 * var2;
         String var33 = "i?|\u0019y\u0018x\u001f";
         this.lt[var2] = com.xy.q.Class1.k(365, var29, 179, 28, com.xy.q.Class49.c("#c6E3D2C"), com.xy.q.Class49.bu);
         Class16 var9;
         if (var2 >= 2 && var2 <= 3) {
            var9 = this;
            this.lt[var2].setBounds(220, 378 + (var2 - 2) * 25, 72, 18);
            this.lt[var2].setFont(com.xy.q.Class49.ch);
         } else {
            if (var2 >= 4 && var2 <= 5) {
               this.lt[var2].setBounds(408 + (var2 - 4) * 116, 406, 120, 16);
               this.lt[var2].setFont(com.xy.q.Class49.bz);
            }

            var9 = this;
         }

         JLabel var10 = var9.lt[var2];
         String var14;
         if (var2 == 0) {
            var14 = "奌奍尾礡";
            var14 = "大奖展示";
         } else if (var2 == 1) {
            var14 = "夜氼尟祦";
            var14 = "奖池展示";
         } else if (var2 == 2) {
            var14 = "組论禄初";
            var14 = "累计积分";
         } else if (var2 == 3) {
            var14 = "弙刑禥剚";
            var14 = "当前积分";
         } else if (var2 == 4) {
            var14 = "涓聼*[+禄初";
            var14 = "消耗100积分";
         } else if (var2 == 5) {
            var14 = "淂聋{lzl禥剚";
            var14 = "消耗1000积分";
         } else {
            var14 = "";
         }

         var10.setText(var14);
         this.lt[var2].setHorizontalAlignment(0);
         this.add(this.lt[var2++]);
      }

      this.sr = new Class52[2];

      for (int var11 = var2 = 0; var11 < this.sr.length; var11 = var2) {
         this.sr[var2] = com.xy.q.Class1.m(291, 371 + 25 * var2, 118, 30, 0, Color.white, com.xy.q.Class49.w, null, var1.afx);
         Class52 var24 = this.sr[var2];
         String var30 = "\u0018xD\u007fD*Y/Ek\u0005|";
         var24.mt(com.xy.w.Class16.m("sc/d/124.png", 20, 10, 20, 10, false));
         this.add(this.sr[var2++]);
      }

      this.sk = new com.xy.w.Class18[3];

      for (int var12 = var2 = 0; var12 < this.sk.length; var12 = var2) {
         this.sk[var2] = new com.xy.w.Class18();
         Class16 var13;
         if (var2 == 0) {
            var13 = this;
            com.xy.w.Class18 var26 = this.sk[var2];
            String var31 = "9?e8emxid,$;";
            var26.dp("sc/d/125.png");
            this.sk[var2].setBounds(203, 151, 503, 284);
         } else {
            if (var2 >= 1 && var2 <= 2) {
               com.xy.w.Class18 var20 = this.sk[var2];
               String var27 = "\u0018xD\u007fD*[(Ek\u0005|";
               var20.dp("sc/d/103.png");
               this.sk[var2].setBounds(320, 164 + (var2 - 1) * 120, 278, 11);
            }

            var13 = this;
         }

         var13.add(this.sk[var2++]);
      }
   }

   public int il() {
      return this.sq != null ? this.sq.getId() : 0;
   }
}
