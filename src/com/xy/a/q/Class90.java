package com.xy.a.q;

import com.xy.bean.BuyShopBean;
import com.xy.game.HandleOption;
import com.xy.readbean.Eshop;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class90 extends com.xy.q.Class30 {
   private Eshop aox;
   private JLabel xg;
   private MoneyType sj;
   private com.xy.q.Class14 nk;
   private com.xy.q.Class27 fb;
   private JLabel[] ap;
   private com.xy.w.Class18[] fd;
   private com.xy.q.Class14 iu;
   private Shop aoy;
   private com.xy.i.Class19[] aoz;
   private com.xy.q.Class52 oq;

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         if (this.aox != null) {
            long var4;
            if ((var4 = this.yx().getMoney(this.sj) / Long.parseLong(this.aox.getEshopprice())) < var1 && var4 <= 999L) {
               return var4;
            }
         } else {
            if (this.aoy == null) {
               return 0L;
            }

            long var6;
            if ((var6 = this.yx().getMoney(this.sj) / this.aoy.getShopprice()) < var1 && var6 <= 999L) {
               return var6;
            }
         }

         return var1 > 999L ? 999L : null;
      }
   }

   public void ahb(Eshop var1, Shop var2) {
      this.aoy = var2;
      this.aox = var1;
      if (var1 != null || var2 != null) {
         JLabel var10000 = this.xg;
         String var10003 = "O=\u00078\u001fkO7\u001c1\nkO3\u001c;\u0007u\u0010:\u001f:\u0001hTv5\u00135\u0013CeTk伓砻審觔赞严Oz\u0015:\u001d!Mi\u0015:\u001d!S6\u001c9\u001c'NrPeC\u00135eCrM";
         StringBuilder var10001 = new StringBuilder("<html><body><font color='#FFFF00'>你确定要购买</font><font color='#00FF00'>")
            .append(var1 != null ? var1.getEshopname() : var2.getShopname());
         String var10002 = "\u007f\u001d%]-F}\u000e%]-FcQ,^,@~\u0015`t\u0005t\u0005\u0002s\u0015}吥|\u000elT,\\7\f\u007f\u001d!]'K}\u000elZ7_/\f";
         var10000.setText(var10001.append("</font><font color='#FFFF00'>吗?</font></body></html>").toString());
         this.fd[0].gt(com.xy.w.Class15.d(var1 != null ? var1.getEshopskin() : var2.getShopskin()));
         Class90 var6;
         if (var1 != null) {
            com.xy.q.Class49.b(this.iu, Long.parseLong(var1.getEshopprice()));
            String var4 = var1.getEshoptype();
            String var10 = "F";
            if (var4.equals("5")) {
               var10000 = this.ap[5];
               var10001 = new StringBuilder(String.valueOf(var1.getEshopprice()));
               var10002 = "禬刴";
               var10000.setText(var10001.append("积分").toString());
               var6 = this;
               var10003 = "禜u創";
               this.sj.setIdAndKey(4, "积 分");
            } else {
               var10000 = this.ap[5];
               var10001 = new StringBuilder(String.valueOf(var1.getEshopprice()));
               var10002 = "亚玻";
               var10000.setText(var10001.append("仙玉").toString());
               var6 = this;
               var10003 = "亪u珺";
               this.sj.setIdAndKey(3, "仙 玉");
            }
         } else {
            com.xy.q.Class49.b(this.iu, var2.getShopprice());
            String var3;
            String var8 = var3 = com.xy.i.Class16.ajj(var2, this);
            String var13 = "醒钃";
            Class90 var9;
            if (var8.equals("金钱")) {
               var9 = this;
               var10003 = "醢u铂";
               this.sj.setIdAndKey(1, "金 钱");
            } else {
               String var14 = "纒玻";
               if (var3.equals("绑玉")) {
                  var10002 = "红u珺";
                  this.sj.setIdAndKey(2, "绑 玉");
                  var9 = this;
               } else {
                  this.sj.setIdAndKey(0, var3);
                  var9 = this;
               }
            }

            var9.ap[5].setText(var2.getShopprice() + var3);
            var6 = this;
         }

         var6.ap[3].setText(this.sj.getKey());
         this.oq.l();
         this.fb.ty().setText("1");
         this.zc().b(this.lj());
      }
   }

   public void ds(long var1, JTextField var3) {
      if (var1 <= 0L) {
         com.xy.q.Class49.b(this.nk, 0L);
      } else if (this.aox != null) {
         com.xy.q.Class49.b(this.nk, Long.parseLong(this.aox.getEshopprice()) * var1);
      } else if (this.aoy != null) {
         com.xy.q.Class49.b(this.nk, this.aoy.getShopprice() * var1);
      } else {
         com.xy.q.Class49.b(this.nk, 0L);
      }
   }

   public boolean du(long var1, JTextField var3) {
      return this.aox != null || this.aoy != null;
   }

   public void g(int var1) {
      if (var1 == 101) {
         int var2;
         if ((var2 = (int)this.fb.ee()) <= 0) {
            String var10001 = "赮乂攳釽乎胏乹\u0002";
            this.afx.dp("购买数量不能为0");
            return;
         }

         if (this.aox != null) {
            BuyShopBean var4 = new BuyShopBean();
            var4.setAte(0);
            HandleOption.c(var4, this.aox, var2, this.sj, this.afx);
            return;
         }

         if (this.aoy != null) {
            BuyShopBean var3 = new BuyShopBean();
            var3.setAte(1);
            HandleOption.k(var3, this.aoy, var2, this.sj, this.afx);
            return;
         }
      } else {
         if (var1 == 102) {
            this.fb.ty().setText(String.valueOf(this.fb.ee() - 1L));
            return;
         }

         if (var1 == 103) {
            this.fb.ty().setText(String.valueOf(this.fb.ee() + 1L));
         }
      }
   }

   public Class90(GameView var1) {
      super(44, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "0QlVl\u0003mB-U";
      this.yy(-1, 0, 382, 383, com.xy.q.Class30.agh);
      com.xy.w.Class9 var31 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "S赸S严S";
      this.yu(var31, " 购 买 ");
      this.xg = new JLabel();
      this.xg.setFont(com.xy.q.Class49.ab);
      this.xg.setBounds(44, 48, 310, 40);
      this.xg.setOpaque(false);
      this.xg.setHorizontalAlignment(0);
      this.add(this.xg);
      this.aoz = new com.xy.i.Class19[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aoz.length; var10000 = var2) {
         com.xy.i.Class19[] var6 = this.aoz;
         String var25;
         if (var2 == 0) {
            var25 = "A \u001d&\u001dq\u0004mB-U";
            var25 = "sc/e/26.png";
         } else if (var2 == 1) {
            var25 = "\u00006\\0\\fA{\u0003;\u0014";
            var25 = "sc/e/32.png";
         } else {
            var25 = "A \u001d&\u001dp\u0006mB-U";
            var25 = "sc/e/34.png";
         }

         int var10006 = 101 + var2;
         Class90 var35;
         if (var2 == 0) {
            var10009 = "砻诗赸七";
            var10009 = "确认购买";
            var35 = this;
         } else {
            var10009 = "";
            var35 = this;
         }

         com.xy.i.Class19 var10001 = new com.xy.i.Class19(var25, 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var10009, var35);
         var6[var2] = var10001;
         Class90 var7;
         if (var2 == 0) {
            var7 = this;
            this.aoz[var2].setBounds(260, 335, 99, 25);
         } else {
            if (var2 == 1 || var2 == 2) {
               this.aoz[var2].setBounds(215 + 14 * (var2 - 1), 292, 11, 15);
            }

            var7 = this;
         }

         var7.add(this.aoz[var2++]);
      }

      String var10011 = "A \u001d'\u001dr\u0005mB-U";
      this.iu = com.xy.q.Class1.i(90, 265, 154, 19, 10, Color.white, com.xy.q.Class49.w);
      com.xy.q.Class36 var4 = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.w, Color.white);
      var4.setBounds(90, 290, 154, 19);
      var4.setHorizontalAlignment(10);
      this.fb = new com.xy.q.Class27(15, var4, this);
      this.nk = com.xy.q.Class1.i(90, 315, 154, 19, 10, Color.white, com.xy.q.Class49.w);
      this.sj = new MoneyType();
      var10009 = "亪u珺";
      this.sj.setIdAndKey(3, "仙 玉");
      this.oq = com.xy.q.Class1.m(90, 340, 154, 19, 10, Color.white, com.xy.q.Class49.w, this.sj, var1);
      String var30 = "A \u001d'\u001dr\u0005mB-U";
      this.iu.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      String var10005 = "\u00006\\1\\dD{\u0003;\u0014";
      this.nk.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      String var28 = "A \u001d'\u001dr\u0005mB-U";
      this.oq.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.iu);
      this.add(var4);
      this.add(this.nk);
      this.add(this.oq);
      this.ap = new JLabel[6];

      int var3;
      for (int var8 = var3 = 0; var8 < this.ap.length; var8 = var3) {
         int var29 = 265 + 25 * var3;
         String var10008 = "v\u0010eCeCeC";
         this.ap[var3] = com.xy.q.Class1.f(40, var29, 48, 19, 4, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var9 = this.ap[var3];
         String var12;
         if (var3 == 0) {
            var12 = "卧c仅";
            var12 = "单 价";
         } else if (var3 == 1) {
            var12 = "攃u醼";
            var12 = "数 量";
         } else if (var3 == 2) {
            var12 = "怉c颯";
            var12 = "总 额";
         } else if (var3 == 3) {
            var12 = "亪u珺";
            var12 = "仙 玉";
         } else if (var3 == 4) {
            var12 = "唜亴Ｈ";
            var12 = "售价：";
         } else if (var3 == 5) {
            var12 = "FeCeC二珺";
            var12 = "50000仙玉";
         } else {
            var12 = "";
         }

         var9.setText(var12);
         if (var3 == 4) {
            this.ap[var3].setHorizontalAlignment(0);
            JLabel var19 = this.ap[var3];
            String var10003 = "`Q\u0005t\u0005t\u0005t";
            var19.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
            this.ap[var3].setFont(com.xy.q.Class49.ch);
            this.ap[var3].setBounds(139, 217, 54, 18);
         }

         if (var3 == 5) {
            this.ap[var3].setHorizontalAlignment(10);
            JLabel var20 = this.ap[var3];
            String var24 = "v\u0010\u00135eCeC";
            var20.setForeground(com.xy.q.Class49.c("#cFF0000"));
            this.ap[var3].setFont(com.xy.q.Class49.w);
            this.ap[var3].setBounds(193, 217, 160, 18);
         }

         this.add(this.ap[var3++]);
      }

      this.fd = new com.xy.w.Class18[2];

      for (int var10 = var3 = 0; var10 < this.fd.length; var10 = var3) {
         this.fd[var3] = new com.xy.w.Class18();
         if (var3 == 0) {
            this.fd[var3].setBounds(139, 86, 120, 120);
         }

         if (var3 == 1) {
            com.xy.w.Class18 var18 = this.fd[var3];
            String var22 = "A \u001d'\u001dq\u0006mB-U";
            var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fd[var3].setBounds(44, 36, 309, 207);
         }

         this.add(this.fd[var3++]);
      }
   }
}
