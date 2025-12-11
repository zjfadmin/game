package com.xy.a.q;

import com.xy.bean.BuyShopBean;
import com.xy.bean.ShopGoodsBean;
import com.xy.game.HandleOption;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class18 extends com.xy.q.Class30 {
   private com.xy.q.Class29 oj;
   private com.xy.i.Class19 ev;
   private int gw;
   private com.xy.q.Class14 ok;
   private com.xy.i.Class19[] ol;
   private com.xy.w.Class18 kh;
   private List<Shop> lo;
   private com.xy.q.Class14 nk;
   private com.xy.q.Class27 fb;
   private Integer om;
   private MoneyType on;
   private JLabel[] ay;
   private com.xy.q.Class14 oo;
   private Shop op;
   private com.xy.q.Class52 oq;

   public void y(int var1) {
      if ((this.gw = var1) == 1) {
         int var3;
         for (int var4 = var3 = 0; var4 < this.ol.length; var4 = var3) {
            this.ol[var3++].setVisible(true);
         }
      } else {
         int var2;
         for (int var10000 = var2 = 0; var10000 < this.ol.length; var10000 = var2) {
            this.ol[var2++].setVisible(false);
         }
      }
   }

   public void ds(long var1, JTextField var3) {
      if (var1 <= 0L) {
         com.xy.q.Class49.b(this.oo, 0L);
      } else if (this.op != null) {
         com.xy.q.Class49.b(this.oo, this.op.getShopprice() * var1);
      } else {
         com.xy.q.Class49.b(this.oo, 0L);
      }
   }

   public void ei(Shop var1, boolean var2) {
      if (this.op != null && this.op == var1) {
         long var5 = this.fb.ee() + (var2 ? 99 : 1);
         this.fb.ty().setText(String.valueOf(var5));
      } else {
         this.op = var1;
         if (this.op == null) {
            com.xy.q.Class49.b(this.ok, 0L);
            this.fb.ty().setText("0");
         } else {
            int var3 = var2 ? 99 : 1;
            com.xy.q.Class49.b(this.ok, var1.getShopprice());
            this.fb.ty().setText(String.valueOf(var3));
            if (var1.getIsPrice() != null) {
               String var10003 = ":d";
               String var4 = Agreement.getSendTextAES("shopPrice", "1|" + var1.getShopid());
               this.za().k(var4);
            }
         }
      }
   }

   public void eh(String var1, long var2) {
      if (this.op != null && this.op.getShopid().equals(var1)) {
         this.op.setShopprice(var2);
         com.xy.q.Class49.b(this.ok, this.op.getShopprice());
         this.fb.ty().setText(String.valueOf(this.fb.ee()));
      }
   }

   public void h() {
      if (this.op == null) {
         String var3 = "泥杢遍乆盀唭咅";
         this.afx.dp("没有选中的商品");
      } else {
         int var1;
         if ((var1 = (int)this.fb.ee()) <= 0) {
            String var10001 = "账乨敻釗丆胥丱(";
            this.afx.dp("购买数量不能为0");
         } else {
            BuyShopBean var2 = new BuyShopBean();
            BuyShopBean var10000;
            if (this.gw == 1) {
               var10000 = var2;
               var2.setAte(3);
               var2.setnId(this.om);
            } else {
               var10000 = var2;
               var2.setAte(1);
            }

            HandleOption.k(var10000, this.op, var1, this.on, this.afx);
         }
      }
   }

   public Class18(GameView var1) {
      super(23, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "x{$|$)%he\u007f";
      this.yy(-1, 0, 382, 391, com.xy.q.Class30.agh);
      com.xy.w.Class9 var26 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "d赆d丛d";
      this.yu(var26, " 购 买 ");
      this.ol = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ol.length; var10000 = var2) {
         com.xy.i.Class19[] var10 = this.ol;
         var10004 = "kh7n78!%he\u007f";
         int var10006 = 81 + var2;
         String var34;
         Class18 var10010;
         if (var2 == 0) {
            var34 = "亲珍";
            var34 = "仙玉";
            var10010 = this;
         } else if (var2 == 1) {
            var34 = "釚钩";
            var34 = "金钱";
            var10010 = this;
         } else {
            var34 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var34, var10010);
         var10[var2] = var10002;
         this.ol[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.ol[var2].setBounds(48 + 65 * var2, 12, 63, 24);
         this.add(this.ol[var2++]);
      }

      String var10007 = "7\bk\u000ekXuE4\u0005#";
      String var10012 = "贵+乨";
      this.ev = new com.xy.i.Class19("sc/e/31.png", 1, 91, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "购 买", this);
      this.ev.setBounds(270, 343, 79, 25);
      this.add(this.ev);
      var10012 = "7\bk\u000fkZsE4\u0005#";
      this.ok = com.xy.q.Class1.i(96, 273, 154, 19, 10, Color.white, com.xy.q.Class49.w);
      com.xy.q.Class36 var8 = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.w, Color.white);
      var8.setBounds(96, 298, 154, 19);
      var8.setHorizontalAlignment(10);
      this.fb = new com.xy.q.Class27(15, var8, this);
      this.oo = com.xy.q.Class1.i(96, 323, 154, 19, 10, Color.white, com.xy.q.Class49.w);
      this.on = new MoneyType();
      String var36 = "玨+釉";
      this.on.setIdAndKey(1, "现 金");
      this.oq = com.xy.q.Class1.m(96, 348, 154, 19, 10, Color.white, com.xy.q.Class49.w, this.on, var1);
      var10007 = "7\bk\u000fkZsE4\u0005#";
      this.ok.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      String var31 = "kh7o7:/%he\u007f";
      this.oo.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      String var10005 = "7\bk\u000fkZsE4\u0005#";
      this.oq.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.ok);
      this.add(var8);
      this.add(this.oo);
      this.add(this.oq);
      this.ay = new JLabel[4];

      int var3;
      for (int var11 = var3 = 0; var11 < this.ay.length; var11 = var3) {
         int var29 = 273 + 25 * var3;
         String var10008 = "({;(;(;(";
         this.ay[var3] = com.xy.q.Class1.f(5, var29, 90, 19, 4, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var12 = this.ay[var3];
         String var19;
         if (var3 == 0) {
            var19 = "匑K亳";
            var19 = "单 价";
         } else if (var3 == 1) {
            var19 = "敨+釗";
            var19 = "数 量";
         } else if (var3 == 2) {
            var19 = "恿K飙";
            var19 = "总 额";
         } else if (var3 == 3) {
            var19 = "玨+釉";
            var19 = "现 金";
         } else {
            var19 = "";
         }

         var12.setText(var19);
         this.add(this.ay[var3++]);
      }

      this.kh = new com.xy.w.Class18();
      var10005 = "7\bk\u000fkZ}E4\u0005#";
      this.kh.mt(com.xy.w.Class16.m("sc/d/19.png", 30, 30, 30, 30, false));
      this.kh.setBounds(44, 36, 309, 207);
      this.add(this.kh);
      com.xy.i.Class3[] var9 = new com.xy.i.Class3[4];

      int var4;
      for (int var13 = var4 = 0; var13 < var9.length; var13 = var4) {
         int var5 = -1 + var4;
         String var15;
         if (var4 == 0) {
            String var14 = "馝顭";
            var15 = "首页";
         } else if (var4 == 1) {
            String var16 = "乡頱";
            var15 = "上页";
         } else if (var4 == 2) {
            String var17 = "一顭";
            var15 = "下页";
         } else {
            String var18 = "展頱";
            var15 = "尾页";
         }

         String var6 = var15;
         int var7 = var4 == 0 ? 260 : (var4 == 1 ? 294 : (var4 == 2 ? 374 : 408));
         var36 = "x{$}$.%he\u007f";
         var9[var4] = new com.xy.i.Class3("sc/e/6.png", 1, var6, var5, this);
         var9[var4].setOffsetTexts(com.xy.q.Class49.ag);
         var9[var4].setBounds(var7 - 152, 247, 34, 18);
         this.add(var9[var4++]);
      }

      this.nk = com.xy.q.Class1.i(176, 247, 46, 18, 0, Color.white, com.xy.q.Class49.ac);
      var10003 = "7\bk\u000fkZsE4\u0005#";
      this.nk.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.nk);
      this.oj = new com.xy.q.Class29(this, 6, 4, 51, 51, 0, 0, 45, 38);
      var31 = "kh7o7: %he\u007f";
      this.oj.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.oj.vo(var9, 1);
      this.oj.be(true);
      this.add(this.oj);
      this.oj.vs().k(this.nk);
   }

   public void kr(List<Shop> var1, int var2, BigDecimal var3) {
      BigDecimal var10000;
      if (var2 == 45) {
         var10000 = var3;
         String var10003 = "幣忖禄剂";
         this.on.setIdAndKey(0, "师徒积分");
      } else if (var2 == 10) {
         var10000 = var3;
         String var8 = "夢庵秤刞";
         this.on.setIdAndKey(0, "天庭积分");
      } else if (var2 == 61) {
         var10000 = var3;
         String var9 = "幅扜禄剂";
         this.on.setIdAndKey(0, "帮战积分");
      } else if (var2 == 120) {
         var10000 = var3;
         String var10 = "夿雊塌秤刞";
         this.on.setIdAndKey(0, "大雁塔积分");
      } else if (var2 == 121) {
         var10000 = var3;
         String var11 = "坛寯禄剂";
         this.on.setIdAndKey(0, "地宫积分");
      } else if (var2 == 123) {
         var10000 = var3;
         String var12 = "寰芫秤刞";
         this.on.setIdAndKey(0, "寻芳积分");
      } else if (var2 == 124) {
         MoneyType var4 = this.on;
         String var5;
         if (this.za().l(2, 3)) {
            var5 = "刄杨禄剂";
            var5 = "副本积分";
         } else {
            var5 = "朣魙秤刞";
            var5 = "木魁积分";
         }

         var4.setIdAndKey(0, var5);
         var10000 = var3;
      } else if (var2 == 126) {
         var10000 = var3;
         String var13 = "江阂禄剂";
         this.on.setIdAndKey(0, "水陆积分");
      } else if (var2 == 127) {
         var10000 = var3;
         String var14 = "剤朴秤刞";
         this.on.setIdAndKey(0, "副本积分");
      } else if (var2 == 1106) {
         var10000 = var3;
         String var15 = "禉斤负禄剂";
         this.on.setIdAndKey(0, "种族赛积分");
      } else if (var2 == 500) {
         var10000 = var3;
         String var16 = "平迈奝汸秤刞";
         this.on.setIdAndKey(0, "幸运奖池积分");
      } else if (var2 == 515) {
         var10000 = var3;
         String var17 = "撆厛负禄剂";
         this.on.setIdAndKey(0, "擂台赛积分");
      } else if (var2 == 605) {
         var10000 = var3;
         String var18 = "夬闡夢害秤刞";
         this.on.setIdAndKey(0, "大闹天宫积分");
      } else if (var2 == 89) {
         var10000 = var3;
         String var19 = "纕K珍";
         this.on.setIdAndKey(2, "绑 玉");
      } else if (var2 == 2027) {
         var10000 = var3;
         String var20 = "竕折秤刞";
         this.on.setIdAndKey(0, "竞技积分");
      } else {
         String var7 = "珴K醕";
         this.on.setIdAndKey(1, "现 金");
         var10000 = var3;
      }

      if (var10000 != null) {
         this.on.setIdAndMax(-1, var3.longValue());
      }

      this.oq.l();
      this.om = null;
      this.ay[3].setText(this.on.getKey());
      this.y(0);
      this.oj.fm(var1);
      this.ei(null, false);
   }

   public void g(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ol.length; var10000 = ++var2) {
         this.ol[var2].setKeep(var1 == var2);
      }

      Class18 var6;
      if (var1 == 0) {
         var6 = this;
         String var10003 = "亝K珍";
         this.on.setIdAndKey(3, "仙 玉");
      } else {
         if (var1 == 1) {
            String var10002 = "玨+釉";
            this.on.setIdAndKey(1, "现 金");
         }

         var6 = this;
      }

      var6.ay[3].setText(this.on.getKey());
      ArrayList var5 = new ArrayList();
      int var3 = var1 == 0 ? 1 : 0;

      int var4;
      for (int var7 = var4 = 0; var7 < this.lo.size(); var7 = ++var4) {
         if (this.lo.get(var4).getShoptype() == var3) {
            var5.add(this.lo.get(var4));
         }
      }

      this.oj.fm(var5);
   }

   public void ks(ShopGoodsBean var1) {
      if (var1.getType() == 0) {
         this.om = var1.getnId();
         this.lo = var1.getShopList();
         this.g(0);
      }

      this.ei(null, false);
      this.oq.l();
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.op != null) {
         long var4;
         if ((var4 = this.yx().getMoney(this.on) / this.op.getShopprice()) < var1 && var4 <= 999L) {
            return var4;
         } else {
            return var1 > 999L ? 999L : null;
         }
      } else {
         return 0L;
      }
   }

   public boolean du(long var1, JTextField var3) {
      return this.op != null;
   }
}
