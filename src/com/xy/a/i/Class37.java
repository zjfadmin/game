package com.xy.a.i;

import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.Class11;
import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class37 extends com.xy.q.Class30 {
   private Class52[] lm;
   private com.xy.w.Class18[] sh;
   private Class54[] aqv;
   private com.xy.i.Class11[] nv;
   private BigDecimal nj;
   private BigDecimal ej;
   private MoneyType pp;
   private com.xy.q.Class14[] bx;
   private com.xy.q.Class24 aqw;
   private JLabel[] ay;
   private MoneyType ef;
   private com.xy.q.Class24 aqx;
   private BigDecimal hh;

   public void e() {
      int var10000 = 0;
      this.ej = this.nj = null;
      this.hh = null;

      for (int var1 = 0; var10000 < this.bx.length; var10000 = var1) {
         this.bx[var1++].setText(null);
      }

      RoleData var4 = this.yx();
      Goodstable var2 = (Goodstable)this.aqv[0].jx();
      Goodstable var3 = (Goodstable)this.aqv[2].jx();
      if (var2 != null) {
         var2 = var4.getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = var4.getGood(var3.getRgid());
      }

      if (var2 != null) {
         this.nj = new BigDecimal(100000);
         Class49.b(this.bx[0], this.nj.longValue());
         if (var3 != null) {
            this.ej = new BigDecimal(10000000);
            this.hh = new BigDecimal(MsgUntil.getSxlxz(var2.getValue()));
            Class49.b(this.bx[1], this.ej.longValue());
            Class49.b(this.bx[3], this.hh.longValue());
         }
      }
   }

   public void f() {
      com.xy.i.Class23 var10002 = this.aqx.vs();
      int var10000 = 0;
      var10002.a(0);
      this.aqw.vs().a(0);

      for (int var1 = 0; var10000 < this.aqv.length; var10000 = var1) {
         Class54 var2 = this.aqv[var1];
         var1++;
         var2.gs(0, null);
      }

      this.e();
      this.h();
   }

   public Class54[] ka() {
      return this.aqv;
   }

   public void h() {
      RoleData var1;
      long var2 = (var1 = this.yx()).getMoney(this.ef);
      this.lm[0].ef(var2);
      this.lm[1].ef(var2);
      var2 = var1.getMoney(this.pp);
      this.lm[2].ef(var2);
      this.lm[3].ef(var2);
   }

   public void g(int var1) {
      RoleData var2 = this.yx();
      Goodstable var3 = (Goodstable)this.aqv[0].jx();
      Goodstable var4 = (Goodstable)this.aqv[2].jx();
      if (var3 != null) {
         var3 = var2.getGood(var3.getRgid());
      }

      if (var4 != null) {
         var4 = var2.getGood(var4.getRgid());
      }

      if (var1 == 5) {
         if (var3 == null) {
            String var15 = "读這拥佰覍拖觯皔奛裕\">";
            this.afx.dp("请选择你要拆解的套装..");
            return;
         }

         if (var3.getGoodlock() == 1) {
            String var14 = "诗爀哳嶛袙勉锳";
            this.afx.dp("该物品已被加锁");
            return;
         }

         if (var2.getLoginResult().getGold().compareTo(this.nj) < 0) {
            String var10001 = "針帑丁趣\">";
            this.afx.dp("金币不足..");
            return;
         }

         ArrayList var5;
         (var5 = new ArrayList()).add(var3.getRgid());
         SuitOperBean var6 = new SuitOperBean();
         var6.setGoods(var5);
         var6.setType(5);
         String var7 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var6));
         this.za().k(var7);
         var2.getLoginResult().setGold(var2.getLoginResult().getGold().subtract(this.nj));
         String var10002 = "淡耥仯\u0003Ye醸帳G\u001c";
         this.afx.dp("消耗了10W金币..");
      } else if (var1 == 6) {
         if (var3 == null) {
            String var22 = "读這拥吻朅奇裉屎怫皔裉夗\">";
            this.afx.dp("请选择含有套装属性的装备..");
            return;
         }

         if (var4 == null) {
            String var21 = "讞逻技佒觨轞禒屬恎皶袬夵G\u001c";
            this.afx.dp("请选择你要转移属性的装备..");
            return;
         }

         if (var3.getGoodlock() == 1 || var4.getGoodlock() == 1) {
            String var20 = "诵牥哑巾袻劬锑";
            this.afx.dp("该物品已被加锁");
            return;
         }

         if (GoodType.r(var3.getType()) != GoodType.r(var4.getType())) {
            String var19 = "裷奮籉埢丿乩臆G\u001c";
            this.afx.dp("装备类型不一致..");
            return;
         }

         if (var2.getLoginResult().getGold().compareTo(this.ej) < 0) {
            String var18 = "針帑丁趣\">";
            this.afx.dp("金币不足..");
            return;
         }

         LoginResult var10000 = var2.getLoginResult();
         String var16 = "灇侇倎";
         if (var10000.getScoretype("灵修值").longValue() < this.hh.longValue()) {
            var16 = "灥俢倬丁趣\">";
            this.afx.dp("灵修值不足..");
            return;
         }

         ArrayList var8;
         (var8 = new ArrayList()).add(var3.getRgid());
         var8.add(var4.getRgid());
         SuitOperBean var10 = new SuitOperBean();
         var10.setGoods(var8);
         var10.setType(6);
         String var11 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var10));
         this.za().k(var11);
         var2.getLoginResult().setGold(var2.getLoginResult().getGold().subtract(this.ej));
         LoginResult var10004 = var2.getLoginResult();
         String var10005 = var2.getLoginResult().getScore();
         String var10008 = "瀜俜偕\u000f";
         var10004.setScore(com.xy.v.Class5.a(var10005, "灵修值=" + this.hh.toString(), 3));
         String var24 = "涄耇亊!< <G針帑\">";
         this.afx.dp("消耗了1000W金币..");
         GameView var23 = this.afx;
         var10005 = "涺聾亴";
         StringBuilder var10003 = new StringBuilder("消耗了").append(this.hh);
         String var25 = "炵灥俢倬\">";
         var23.dp(var10003.append("点灵修值..").toString());
      }

      int var9;
      for (int var12 = var9 = 0; var12 < this.aqv.length; var12 = var9) {
         Class54 var13 = this.aqv[var9];
         var9++;
         var13.gs(0, null);
      }

      this.e();
   }

   public Class37(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(46, 74, 490, 428, com.xy.q.Class30.agf);
      this.nv = new com.xy.i.Class11[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.nv.length; var10000 = var2) {
         com.xy.i.Class11[] var12 = this.nv;
         String var10004 = "co?i??!\"`bw";
         int var10006 = 5 + var2;
         String var74;
         Class37 var10010;
         if (var2 == 0) {
            var74 = "拴I觑";
            var74 = "拆 解";
            var10010 = this;
         } else if (var2 == 1) {
            var74 = "轼,秫";
            var74 = "转 移";
            var10010 = this;
         } else {
            var74 = "";
            var10010 = this;
         }

         Class11 var10002 = new Class11("sc/e/31.png", 1, var10006, Class49.ch, Class49.bv, var74, var10010);
         var12[var2] = var10002;
         this.nv[var2].setBounds(89 + 244 * var2, 385, 79, 25);
         this.add(this.nv[var2++]);
      }

      this.ay = new JLabel[12];

      for (int var13 = var2 = 0; var13 < this.ay.length; var13 = var2) {
         int var10003 = 66 + 241 * var2;
         String var10008 = "JQY\u0002Y\u0002Y\u0002";
         this.ay[var2] = com.xy.q.Class1.f(var10003, 88, 180, 17, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var14 = this.ay[var2];
         String var35;
         if (var2 == 0) {
            var35 = "奛裕";
            var35 = "套装";
         } else if (var2 == 1) {
            var35 = "朘呡戢珠笔袬夵";
            var35 = "未合成玉符装备";
         } else if (var2 == 2) {
            var35 = "拊觳玅笶";
            var35 = "拆解玉符";
         } else if (var2 == 3) {
            var35 = "輅秉珠笔";
            var35 = "转移玉符";
         } else if (var2 == 4 || var2 == 5) {
            var35 = "涄耇針钡";
            var35 = "消耗金钱";
         } else if (var2 == 6 || var2 == 7) {
            var35 = "抌朻醸钃";
            var35 = "拥有金钱";
         } else if (var2 == 8 || var2 == 9) {
            var35 = "涘耛灥俢倬";
            var35 = "消耗灵修值";
         } else if (var2 != 10 && var2 != 11) {
            var35 = "";
         } else {
            var35 = "拗杠灇侇倎";
            var35 = "拥有灵修值";
         }

         var14.setText(var35);
         Class37 var15;
         if (var2 >= 2 && var2 <= 3) {
            var15 = this;
            JLabel var60 = this.ay[var2];
            String var67 = "/sJVJVJV";
            var60.setForeground(Class49.c("#cFFFFFF"));
            this.ay[var2].setFont(Class49.ck);
            this.ay[var2].setBounds(78 + (var2 - 2) * 244, 249, 100, 23);
         } else {
            if (var2 >= 4 && var2 <= 11) {
               this.ay[var2].setBounds(62 + (var2 - 4) % 2 * 244, 349 + (var2 - 4) / 2 * 26, 90, 19);
            }

            var15 = this;
         }

         var15.ay[var2].setBounds(this.ay[var2].getX() - 46, this.ay[var2].getY() - 74, this.ay[var2].getWidth(), this.ay[var2].getHeight());
         this.add(this.ay[var2++]);
      }

      this.bx = new com.xy.q.Class14[4];
      this.lm = new Class52[4];

      for (int var16 = var2 = 0; var16 < this.bx.length; var16 = var2) {
         this.bx[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, Class49.w);
         com.xy.q.Class14 var17 = this.bx[var2];
         String var43 = "A\n\u001d\r\u001dX\u0005GB\u0007U";
         var17.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         Class37 var18;
         if (var2 == 0) {
            var18 = this;
            this.bx[var2].setBounds(154, 349, 118, 19);
         } else if (var2 == 1) {
            var18 = this;
            this.bx[var2].setBounds(398, 349, 118, 19);
         } else if (var2 == 2) {
            var18 = this;
            this.bx[var2].setBounds(154, 401, 118, 19);
         } else {
            if (var2 == 3) {
               this.bx[var2].setBounds(398, 401, 118, 19);
            }

            var18 = this;
         }

         var18.bx[var2].setBounds(this.bx[var2].getX() - 46, this.bx[var2].getY() - 74, this.bx[var2].getWidth(), this.bx[var2].getHeight());
         this.add(this.bx[var2++]);
      }

      this.ef = new MoneyType();
      this.pp = new MoneyType();
      String var61 = "針钡";
      this.ef.setIdAndKey(1, "金钱");
      int var19 = 0;
      var61 = "灇侇倎";
      this.pp.setIdAndKey(0, "灵修值");

      for (int var7 = 0; var19 < this.lm.length; var19 = var7) {
         this.lm[var7] = com.xy.q.Class1.a(10, Color.white, Class49.w, null, var1);
         this.lm[var7].n(2);
         Class52 var20 = this.lm[var7];
         String var44 = "co?h?='\"`bw";
         var20.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         Class37 var21;
         if (var7 == 0) {
            var21 = this;
            this.lm[var7].setBounds(154, 375, 118, 19);
         } else if (var7 == 1) {
            var21 = this;
            this.lm[var7].setBounds(398, 375, 118, 19);
         } else if (var7 == 2) {
            var21 = this;
            this.lm[var7].setBounds(154, 427, 118, 19);
         } else {
            if (var7 == 3) {
               this.lm[var7].setBounds(398, 427, 118, 19);
            }

            var21 = this;
         }

         var21.lm[var7].setBounds(this.lm[var7].getX() - 46, this.lm[var7].getY() - 74, this.lm[var7].getWidth(), this.lm[var7].getHeight());
         this.add(this.lm[var7++]);
      }

      this.aqv = new Class54[3];

      for (int var22 = var2 = 0; var22 < this.aqv.length; var22 = var2) {
         this.aqv[var2] = new Class54(this);
         Class37 var23;
         if (var2 == 0) {
            var23 = this;
            this.aqv[var2].setBounds(95, 207, 50, 50);
         } else {
            if (var2 >= 1 && var2 <= 2) {
               this.aqv[var2].setBounds(287 + (var2 - 1) * 115, 207, 50, 50);
            }

            var23 = this;
         }

         var23.add(this.aqv[var2++]);
      }

      this.sh = new com.xy.w.Class18[10];

      for (var19 = var2 = 0; var19 < this.sh.length; var19 = var2) {
         this.sh[var2] = new com.xy.w.Class18();
         this.add(this.sh[var2]);
         Class37 var33;
         if (var2 >= 0 && var2 <= 1) {
            var33 = this;
            com.xy.w.Class18 var58 = this.sh[var2];
            var61 = "A\n\u001d\r\u001dX\u000bGB\u0007U";
            var58.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.sh[var2].setBounds(63 + var2 * 241, 108, 207, 105);
         } else if (var2 >= 2 && var2 <= 3) {
            var33 = this;
            com.xy.w.Class18 var57 = this.sh[var2];
            var61 = "co?h??$\"`bw";
            var57.dp("sc/d/34.png");
            this.sh[var2].setBounds(58 + (var2 - 2) * 244, 249, 190, 23);
         } else {
            label272: {
               if (var2 >= 4 && var2 <= 6) {
                  com.xy.w.Class18 var46 = this.sh[var2];
                  String var56 = "\u001aQFVF\u0006GB\u0007U";
                  var46.dp("sc/d/4.png");
                  if (var2 == 4) {
                     var33 = this;
                     this.sh[var2].setBounds(137, 277, 59, 57);
                     break label272;
                  }

                  if (var2 >= 5 && var2 <= 6) {
                     var33 = this;
                     this.sh[var2].setBounds(329 + (var2 - 5) * 115, 277, 59, 57);
                     break label272;
                  }
               } else {
                  if (var2 == 7) {
                     var33 = this;
                     com.xy.w.Class18 var55 = this.sh[var2];
                     var61 = "co?h?:)\"`bw";
                     var55.dp("sc/d/69.png");
                     this.sh[var2].setBounds(401, 278, 30, 56);
                     break label272;
                  }

                  if (var2 >= 8 && var2 <= 9) {
                     Class37 var28;
                     if (var2 == 8) {
                        com.xy.i.Class3[] var10 = new com.xy.i.Class3[2];

                        int var11;
                        for (var19 = var11 = 0; var19 < var10.length; var19 = var11) {
                           if (var11 == 0) {
                              String var70 = "A\n\u001d\f\u001d]\u0000GB\u0007U";
                              var10[var11] = new com.xy.i.Class3("sc/e/42.png", 1, 0, this);
                              var19 = var11;
                           } else {
                              String var71 = "co?i?8#\"`bw";
                              var10[var11] = new com.xy.i.Class3("sc/e/43.png", 1, 1, this);
                              var19 = var11;
                           }

                           Class37 var31;
                           if (var19 == 0) {
                              var31 = this;
                              var10[var11].setBounds(160, 140, 18, 18);
                           } else {
                              var10[var11].setBounds(189, 140, 18, 18);
                              var31 = this;
                           }

                           var31.add(var10[var11++]);
                        }

                        var28 = this;
                        this.aqx = new com.xy.q.Class24(2, this, 4, 2, 51, 51, 0, 0, 18, 36);
                        String var72 = "A\n\u001d\r\u001dX\nGB\u0007U";
                        this.aqx.gt(com.xy.w.Class16.c("sc/d/18.png"));
                        this.aqx.vo(var10, 1);
                        this.add(this.aqx);
                     } else {
                        com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

                        int var4;
                        for (var19 = var4 = 0; var19 < var3.length; var19 = var4) {
                           if (var4 == 0) {
                              String var68 = "co?i?8\"\"`bw";
                              var3[var4] = new com.xy.i.Class3("sc/e/42.png", 1, 0, this);
                              var19 = var4;
                           } else {
                              String var69 = "A\n\u001d\f\u001d]\u0001GB\u0007U";
                              var3[var4] = new com.xy.i.Class3("sc/e/43.png", 1, 1, this);
                              var19 = var4;
                           }

                           Class37 var27;
                           if (var19 == 0) {
                              var27 = this;
                              var3[var4].setBounds(401, 140, 18, 18);
                           } else {
                              var3[var4].setBounds(430, 140, 18, 18);
                              var27 = this;
                           }

                           var27.add(var3[var4++]);
                        }

                        var28 = this;
                        this.aqw = new com.xy.q.Class24(1, this, 4, 2, 51, 51, 0, 0, 259, 36);
                        String var10005 = "co?h?=(\"`bw";
                        this.aqw.gt(com.xy.w.Class16.c("sc/d/18.png"));
                        this.aqw.vo(var3, 1);
                        this.add(this.aqw);
                     }

                     com.xy.w.Class18 var32 = var28.sh[var2];
                     String var45 = "A\n\u001d\r\u001dZ\u0001GB\u0007U";
                     var32.mt(com.xy.w.Class16.m("sc/d/33.png", 30, 30, 30, 30, false));
                     this.sh[var2].setBounds(52 + (var2 - 8) * 244, 243, 229, 248);
                  }
               }

               var33 = this;
            }
         }

         var33.sh[var2].setBounds(this.sh[var2].getX() - 46, this.sh[var2].getY() - 74, this.sh[var2].getWidth(), this.sh[var2++].getHeight());
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }
}
