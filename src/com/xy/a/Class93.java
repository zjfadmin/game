package com.xy.a;

import com.xy.bean.ConfirmBean;
import com.xy.bean.SummonPetBean;
import com.xy.readbean.petExchange;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.math.BigDecimal;
import javax.swing.JTextField;

public class Class93 extends com.xy.q.Class30 {
   private Class80 akh;
   private Class76 aki;
   private com.xy.i.Class18[] akb;
   private com.xy.w.Class18 gh;
   private Class130 akj;
   private int eg;
   private Class43 akk;

   // $VF: synthetic method
   static Class130 aco(Class93 var0) {
      return var0.akj;
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         if (this.eg == 0) {
            if (var3 == Class130.amq(this.akj)[0]) {
               long var7;
               var7 = (var7 = this.akj.agx + Class130.amm(this.akj)[1].ee()) > 0L ? this.yx().getLoginResult().getGold().longValue() / var7 : 0L;
               if (var1 > var7) {
                  return var7;
               }

               return null;
            }

            if (var3 == Class130.amq(this.akj)[1]) {
               long var4;
               var4 = (var4 = this.akj.agx + (var1 > 999999L ? 999999L : var1)) > 0L ? this.yx().getLoginResult().getGold().longValue() / var4 : 0L;
               if (var4 < Class130.amm(this.akj)[0].ee()) {
                  Class130.amq(this.akj)[0].setText(String.valueOf(var4));
               }

               if (var1 > 999999L) {
                  return 999999L;
               }

               return null;
            }
         } else if (this.eg == 1) {
            if (var3 == Class76.yh(this.aki)[0]) {
               long var10 = this.yx().getLoginResult().getCodecard().longValue();
               if (var1 > var10) {
                  return var10;
               }

               return null;
            }

            if (var3 == Class76.yh(this.aki)[1]) {
               long var9 = 10000000L;
               if (var1 > var9) {
                  GameView var10000 = this.ze();
                  String var10001 = "杢奯S烱亻珁厍完啌yRxR\u001f奅讕幣";
                  var10000._do("最大1点仙玉可寄售1000W大话币");
               }

               if (var1 > var9) {
                  return var9;
               }

               return null;
            }
         } else if (this.eg == 2) {
            if (var3 == Class43.oi(this.akk)[0]) {
               long var12 = this.yx().getLoginResult().getCodecard().longValue();
               if (var1 > var12) {
                  return var12;
               }

               return null;
            }

            if (var3 == Class43.oi(this.akk)[1]) {
               long var11 = this.yx().getLoginResult().getGold().longValue();
               if (var1 > var11) {
                  return var11;
               }

               return null;
            }
         }

         return null;
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void cp(int var1, String var2) {
      int var10000 = 0;
      this.eg = var1;

      for (int var3 = 0; var10000 < this.akb.length; var10000 = ++var3) {
         this.akb[var3].setKeep(var3 == this.eg);
      }

      Class93 var12;
      if (var1 == 0) {
         int var4;
         for (int var8 = var4 = 0; var8 < Class130.amo(this.akj).length; var8 = var4) {
            this.akj.add(Class130.amo(this.akj)[var4++]);
         }

         for (int var10 = var4 = 0; var10 < Class130.amr(this.akj).length; var10 = var4) {
            this.akj.add(Class130.amr(this.akj)[var4++], 0);
         }

         var12 = this;
         com.xy.i.Class18 var10003 = Class130.amo(this.akj)[4];
         String var10004 = "砦寸赥丒";
         var10003.setText("确定购买");
         this.akj.dq(var2);
         Class130.amp(this.akj).l();
      } else if (var1 == 1) {
         int var6;
         for (int var13 = var6 = 0; var13 < Class130.amo(this.akj).length; var13 = var6) {
            this.aki.add(Class130.amo(this.akj)[var6++]);
         }

         for (int var15 = var6 = 0; var15 < Class130.amr(this.akj).length; var15 = var6) {
            this.aki.add(Class130.amr(this.akj)[var6++], 0);
         }

         var12 = this;
         com.xy.i.Class18 var23 = Class130.amo(this.akj)[4];
         String var10005 = "硊寂寠啶";
         var23.setText("确定寄售");
         this.aki.dq(var2);
         Class76.yi(this.aki)[0].l();
         Class76.yi(this.aki)[1].l();
      } else if (var1 == 2) {
         var12 = this;
         Class43.oj(this.akk, this.yt().e(1));
         Class43.oh(this.akk, this.yt().e(2));
         RichLabel var10009 = Class43.og(this.akk);
         String var10012 = "A+RxRxRx層云珫儙挀托纳珁ｮ儙挀殜俩乲A+$\u000eRxRxB";
         StringBuilder var10010 = new StringBuilder("#c000000将仙玉兑换成绑玉，兑换比例为#cFF0000 ").append(Class43.oe(this.akk).getHp());
         String var10011 = "ｂ";
         var10009.setTextSize(var10010.append("：").append(Class43.oe(this.akk).getMp()).toString(), 360);
         Class43.og(this.akk).setBounds(129, 124, Class43.og(this.akk).getWidth(), Class43.og(this.akk).getHeight());
         RichLabel var10007 = Class43.of(this.akk);
         String var25 = "k\u0001xRxRxR屎奅讕幣儙挀托纳珁ｮ儙挀殜俩乲A+$\u000eRxRxB";
         StringBuilder var10008 = new StringBuilder("#c000000将大话币兑换成绑玉，兑换比例为#cFF0000 ").append(Class43.ob(this.akk).getHp());
         String var24 = "ｂ";
         var10007.setTextSize(var10008.append("：").append(Class43.ob(this.akk).getMp()).toString(), 360);
         Class43.of(this.akk).setBounds(129, 142, Class43.of(this.akk).getWidth(), Class43.of(this.akk).getHeight());
         Class43.oi(this.akk)[0].setText("0");
         Class43.oi(this.akk)[1].setText("0");
         Class43.od(this.akk)[0].l();
         Class43.od(this.akk)[1].l();
         Class43.od(this.akk)[2].l();
      } else {
         if (var1 == 3) {
            this.akh.lr(null);
            Class80.zl(this.akh).l();
         }

         var12 = this;
      }

      var12.akj.setVisible(var1 == 0);
      this.aki.setVisible(var1 == 1);
      this.akk.setVisible(var1 == 2);
      this.akh.setVisible(var1 == 3);
   }

   public void g(int var1) {
      if (var1 != 0 && var1 != 1) {
         this.cp(var1, null);
      } else {
         String var10003 = "\u0000";
         String var2 = Agreement.getSendTextAES("exchange", "X" + var1 + "1");
         this.za().k(var2);
      }
   }

   public void ds(long var1, JTextField var3) {
      if (this.eg == 0) {
         long var10 = Class130.amq(this.akj)[0] == var3 ? var1 : Class130.amm(this.akj)[0].ee();
         long var11 = Class130.amq(this.akj)[1] == var3 ? var1 : Class130.amm(this.akj)[1].ee();
         var11 += this.akj.agx;
         com.xy.q.Class49.b(Class130.amn(this.akj)[2], var10 * var11);
      } else if (this.eg == 1) {
         long var9 = Class76.yh(this.aki)[0] == var3 ? var1 : Class76.yj(this.aki)[0].ee();
         long var6 = Class76.yh(this.aki)[1] == var3 ? var1 : Class76.yj(this.aki)[1].ee();
         com.xy.q.Class49.b(Class76.yg(this.aki)[1], var9 * var6);
      } else {
         if (this.eg == 2) {
            if (var3 == Class43.oi(this.akk)[0]) {
               long var8 = Class43.oe(this.akk).getHp() != 0 ? var1 / Class43.oe(this.akk).getHp() * Class43.oe(this.akk).getMp() : 0L;
               com.xy.q.Class49.b(Class43.oc(this.akk)[0], var8);
               return;
            }

            if (var3 == Class43.oi(this.akk)[1]) {
               long var4 = Class43.ob(this.akk).getHp() != 0 ? var1 / Class43.ob(this.akk).getHp() * Class43.ob(this.akk).getMp() : 0L;
               com.xy.q.Class49.b(Class43.oc(this.akk)[1], var4);
            }
         }
      }
   }

   public void ef(long var1) {
      if (this.eg == 1) {
         int var3;
         for (int var10000 = var3 = 0; var10000 < Class130.amr(this.akj).length; var10000 = ++var3) {
            if (Class130.amr(this.akj)[var3].isVisible() && Class54.ti(Class130.amr(this.akj)[var3]) == var1) {
               Class130.amr(this.akj)[var3].t();
               return;
            }
         }
      }
   }

   public Class93(GameView var1) {
      super(117, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "W;\u000b<\u000bi\n(J?";
      this.yy(-1, 0, 481, 510, com.xy.q.Class30.agh);
      com.xy.w.Class9 var18 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "儙挀粳纽";
      this.yu(var18, "兑换系统");
      this.akb = new com.xy.i.Class18[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.akb.length; var10000 = var2) {
         com.xy.i.Class18[] var7 = this.akb;
         var10004 = "+GwAw\u0017`\n(J?";
         int var10006 = 181 + var2;
         String var20;
         Class93 var10010;
         if (var2 == 0) {
            var20 = "丒云珫";
            var20 = "买仙玉";
            var10010 = this;
         } else if (var2 == 1) {
            var20 = "匎份珑";
            var20 = "卖仙玉";
            var10010 = this;
         } else if (var2 == 2) {
            var20 = "纙珫儙挀";
            var20 = "绑玉兑换";
            var10010 = this;
         } else if (var2 == 3) {
            var20 = "牍咙听扈";
            var20 = "物品合成";
            var10010 = this;
         } else {
            var20 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/38.png", 2, var10006, com.xy.q.Class49.bx, com.xy.q.Class49.bv, var20, var10010);
         var7[var2] = var10002;
         this.akb[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.akb[var2].setBounds(57 + 92 * var2, 20, 85, 33);
         this.add(this.akb[var2++]);
      }

      Class93 var10;
      label92: {
         this.akj = new Class130(this);
         this.aki = new Class76(this);
         this.akk = new Class43(this);
         this.akh = new Class80(this);
         this.akj.setBounds(0, 0, 481, 510);
         this.aki.setBounds(0, 0, 481, 510);
         this.akk.setBounds(0, 0, 481, 510);
         this.akh.setBounds(0, 0, 481, 510);
         this.add(this.akj);
         this.add(this.aki);
         this.add(this.akk);
         this.add(this.akh);
         String var10011 = "\u0011+M,M{Wf\u0012&\u0005";
         this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
         this.gh.setBounds(47, 34, 408, 20);
         this.add(this.gh);
         if (!this.za().l(2, 11)) {
            if (this.za().l(2, 8)) {
               this.akb[2].setVisible(false);
               var2 = 0;
               int var3 = 0;

               for (int var13 = var2; var13 < this.akb.length; var13 = ++var2) {
                  if (this.akb[var2].isVisible()) {
                     com.xy.i.Class18 var14 = this.akb[var2];
                     int var16 = 57 + 92 * var3;
                     var3++;
                     var14.setBounds(var16, 20, 85, 33);
                  }
               }

               var10 = this;
               break label92;
            }

            if (this.za().l(2, 3) || this.za().l(2, 12)) {
               this.akb[0].setVisible(false);
               this.akb[1].setVisible(false);
               this.akb[2].setVisible(false);

               for (int var11 = var2 = 3; var11 < this.akb.length; var11 = var2) {
                  com.xy.i.Class18 var12 = this.akb[var2];
                  int var15 = 57 + 92 * (var2 - 3);
                  var2++;
                  var12.setBounds(var15, 20, 85, 33);
               }

               var10 = this;
               break label92;
            }

            if (this.za().gameType == 1 || this.za().gameType == 2) {
               this.akb[0].setVisible(false);
               this.akb[1].setVisible(false);

               for (int var8 = var2 = 2; var8 < this.akb.length; var8 = var2) {
                  com.xy.i.Class18 var9 = this.akb[var2];
                  int var10001 = 57 + 92 * (var2 - 2);
                  var2++;
                  var9.setBounds(var10001, 20, 85, 33);
               }
            }
         }

         var10 = this;
      }

      var10.g(3);
   }

   public void gs(int var1, Object var2) {
      if (var1 != 185 && var1 != 186 && var1 != 187 && var1 != 188) {
         if (var1 == 189) {
            if (this.eg == 0) {
               if (this.akj.agx <= 0L) {
                  String var31 = "泩杫欫坊镈啌云珫";
                  this.afx._do("没有正在销售仙玉");
                  return;
               }

               long var14;
               if ((var14 = Class130.amm(this.akj)[0].ee()) < 100L) {
                  String var30 = "贉丨敔醗朤屉丞i\u0014h";
                  this.afx._do("购买数量最少为100");
                  return;
               }

               long var19 = Class130.amm(this.akj)[1].ee() + this.akj.agx;
               StringBuffer var21;
               StringBuffer var24 = var21 = new StringBuffer();
               String var29 = "讕砦识靈解淀聵k;";
               var24.append("请确认需要消耗#Y");
               var21.append(var19 * var14);
               String var35 = "{s奿诹幙贉丨\u0007\u0001";
               var21.append("#W大话币购买#Y");
               var21.append(var14);
               String var10005 = "A\u001f烛云珫";
               var21.append("#W点仙玉");
               GameView var36 = this.ze();
               String var10011 = "fh";
               StringBuilder var10009 = new StringBuilder("B0").append(var19);
               String var10010 = "\u001e";
               var36.dm(new ConfirmBean(29, var10009.append("|").append(var14).toString(), var21.toString()));
               return;
            }

            if (this.eg == 1) {
               long var13 = Class76.yj(this.aki)[0].ee();
               long var18 = Class76.yj(this.aki)[1].ee();
               if (var13 < 100L) {
                  String var28 = "唊匎敔醗朤屉丞i\u0014h";
                  this.afx._do("售卖数量最少为100");
                  return;
               }

               if (var18 < 100L) {
                  String var27 = "亿桞久肟乲隔";
                  this.afx._do("价格不能为零");
                  return;
               }

               String var34 = "wh";
               StringBuilder var26 = new StringBuilder("S0").append(var18);
               String var10002 = "\u001e";
               String var20 = Agreement.getSendTextAES("exchange", var26.append("|").append(var13).toString());
               this.za().k(var20);
               return;
            }
         } else {
            if (var1 == 190) {
               Class54 var12 = (Class54)var2;
               if (this.eg == 1 && Class54.ti(var12) != 0L) {
                  String var33 = "wi";
                  String var15 = Agreement.getSendTextAES("exchange", "S1" + Class54.ti(var12));
                  this.za().k(var15);
                  return;
               }

               return;
            }

            if (var1 == 191 || var1 == 192) {
               long var11;
               if ((var11 = Class43.oa(this.akk)[var1 == 191 ? 0 : 1].ee()) <= 0L) {
                  return;
               }

               SummonPetBean var17;
               (var17 = new SummonPetBean()).setOpertype(var1 == 191 ? 3 : 4);
               var17.setPetid(new BigDecimal(var11));
               String var6 = Agreement.getSendTextAES("summonpet", com.xy.v.Class31.a().toJson(var17));
               this.za().k(var6);
               return;
            }

            if (var1 == 193 || var1 == 194) {
               petExchange var10;
               if ((var10 = Class80.zj(this.akh)) == null) {
                  return;
               }

               if (Class80.zk(this.akh) != 0L && Class80.zk(this.akh) > this.yx().getLoginResult().getGold().longValue()) {
                  String var25 = "醙铓久跑";
                  this.afx._do("金钱不足");
                  return;
               }

               if (!this.akh.ah()) {
                  String var10001 = "迦丩剨听扈杅亮";
                  this.afx._do("达不到合成条件");
                  return;
               }

               SummonPetBean var4;
               SummonPetBean var23 = var4 = new SummonPetBean();
               var23.setOpertype(5);
               var23.setPetid(new BigDecimal(var10.geteId()));
               var23.setGoodid(new BigDecimal(var1 == 193 ? 1 : 99));
               String var16 = Agreement.getSendTextAES("summonpet", com.xy.v.Class31.a().toJson(var4));
               this.za().k(var16);
            }
         }
      } else {
         long var3 = this.akj.ia;
         long var5 = this.akj.aa;
         long var7 = var3;
         long var10000;
         if (var1 == 185) {
            var10000 = var7 = 1L;
         } else if (var1 == 187) {
            var10000 = var7 = var3 - 1L;
         } else if (var1 == 188) {
            var10000 = var7 = var3 + 1L;
         } else {
            if (var1 == 186) {
               var7 = var5;
            }

            var10000 = var7;
         }

         if (var10000 <= 0L) {
            var7 = 1L;
         }

         if (var7 > var5) {
            var7 = var5;
         }

         if (var7 == var3) {
            return;
         }

         if (this.eg == 0) {
            String var32 = "\u0010R";
            String var22 = Agreement.getSendTextAES("exchange", "X0" + var7);
            this.za().k(var22);
            return;
         }

         if (this.eg == 1) {
            String var10003 = "|i";
            String var9 = Agreement.getSendTextAES("exchange", "X1" + var7);
            this.za().k(var9);
            return;
         }
      }
   }
}
