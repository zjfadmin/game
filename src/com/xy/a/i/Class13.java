package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class13 extends com.xy.q.Class30 {
   private BigDecimal nj = new BigDecimal(100000);
   private com.xy.q.Class14 nk;
   private Class54[] nl;
   private Class2 nm;
   private com.xy.w.Class18 nn;
   private com.xy.w.Class18[] ar;
   private com.xy.q.Class24 no;
   private com.xy.i.Class11 np;
   private JLabel[] au;

   public Class2 eq() {
      return this.nm;
   }

   public void f() {
      RoleData var1 = this.yx();
      Goodstable var2;
      if ((var2 = (Goodstable)this.nl[0].jx()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      PartJade var3 = (PartJade)this.nl[1].jx();
      if (var2 != null && var3 != null) {
         int var4 = (int)this.nl[1].ee();
         if (this.nj.compareTo(var1.getLoginResult().getGold()) > 0) {
            String var17 = "釨年临跆\u0017[";
            this.afx.dp("金币不足..");
         } else if (var2.getGoodlock() == 1) {
            String var16 = "诗爪哳嶱袙勣锳";
            this.afx.dp("该物品已被加锁");
         } else {
            int var5 = GoodType.r(var2.getType());
            if (var3.getPartId() == 11) {
               if (var5 != 10) {
                  String var12 = "裼奲籂埾咵珼笟乸丹膁\u0017[";
                  this.afx.dp("装备类型和玉符不一致..");
                  return;
               }
            } else if (var5 != var3.getPartId()) {
               String var15 = "袆夵簸垹哏玻筥丿乃臆m\u001c";
               this.afx.dp("装备类型和玉符不一致..");
               return;
            }

            SuitOperBean var6 = new SuitOperBean();
            ArrayList var7;
            (var7 = new ArrayList()).add(var2.getRgid());
            PartJade var8 = new PartJade(var3.getSuitid(), var3.getPartId());
            var8.setJade(var4, 1);
            var6.setType(0);
            var6.setGoods(var7);
            var6.setJade(var8);
            String var9 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var6));
            this.za().k(var9);
            var3.b(var4, 1);
            var1.getLoginResult().setGold(var1.getLoginResult().getGold().subtract(this.nj));
            int var10 = 0;

            for (int var10000 = var10; var10000 < this.nl.length; var10000 = var10) {
               Class54 var11 = this.nl[var10];
               var10++;
               var11.gs(0, null);
            }

            GameView var13 = this.afx;
            String var10004 = "淽耮仳丹也";
            StringBuilder var10002 = new StringBuilder("消耗了一个").append(MsgUntil.j(var4));
            String var10003 = "珊笔m\u001c";
            var13.dp(var10002.append("玉符..").toString());
            String var14 = "涱聢亿D\t\"釨年\u0017[";
            this.afx.dp("消耗了10W金币..");
         }
      } else {
         String var10001 = "诅内夵观吺打皶袆夵哏玻筥〰";
         this.afx.dp("请准备要合成的装备和玉符。");
      }
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.nl.length; var10000 = var1) {
         Class54 var2 = this.nl[var1];
         var1++;
         var2.gs(0, null);
      }

      this.no.vs().a(0);
      this.nm.h();
   }

   public Class54[] ka() {
      return this.nl;
   }

   public Class13(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(46, 74, 490, 428, com.xy.q.Class30.agf);
      this.nn = new com.xy.w.Class18();
      this.nn.setBounds(10, 229, 17, 17);
      this.add(this.nn);
      String var10009 = "A \u001d&\u001dp\u0003mB-U";
      String var10014 = "命\u0019扥";
      this.np = new com.xy.i.Class11("sc/e/31.png", 1, 1, Class49.ch, Class49.bv, "合 成", this);
      this.np.setBounds(48, 385, 79, 25);
      this.add(this.np);
      this.nm = new Class2(this, this.nn);
      this.nm.cl().setBounds(12, 30, 152, 195);
      this.add(this.nm.cl());
      this.nm.cn().setBounds(174, 30, 305, 198);
      this.add(this.nm.cn());
      this.au = new JLabel[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         String var10008 = "`Q\u0005t\u0005t\u0005t";
         this.au[var2] = com.xy.q.Class1.f(55, 83, 155, 21, 0, Class49.c("#cFFFFFF"), Class49.ch);
         JLabel var7 = this.au[var2];
         String var16;
         if (var2 == 0) {
            var16 = "奮袰刮蠝";
            var16 = "套装列表";
         } else if (var2 == 1) {
            var16 = "遊招珊笔";
            var16 = "选择玉符";
         } else if (var2 == 2) {
            var16 = "逰抜裼奲";
            var16 = "选择装备";
         } else if (var2 == 3) {
            var16 = "变晽礈嶱朻珊笔";
            var16 = "只显示已有玉符";
         } else if (var2 == 4) {
            var16 = "涱聢釨铄";
            var16 = "消耗金钱";
         } else {
            var16 = "";
         }

         var7.setText(var16);
         Class13 var8;
         if (var2 == 1) {
            var8 = this;
            this.au[var2].setBounds(218, 83, 307, 21);
         } else if (var2 == 2) {
            var8 = this;
            this.au[var2].setBounds(218, 306, 307, 21);
         } else if (var2 == 3) {
            var8 = this;
            this.au[var2].setFont(Class49.k);
            JLabel var10003 = this.au[var2];
            String var10004 = "`Qs\u0002s\u0002s\u0002";
            var10003.setForeground(Class49.c("#c000000"));
            this.au[var2].setHorizontalAlignment(10);
            this.au[var2].setBounds(74, 303, 136, 17);
         } else {
            if (var2 == 4) {
               JLabel var21 = this.au[var2];
               String var10002 = "\u001a\u0016\tE\tE\tE";
               var21.setForeground(Class49.c("#c000000"));
               this.au[var2].setBounds(51, 404, 79, 19);
            }

            var8 = this;
         }

         var8.au[var2].setBounds(this.au[var2].getX() - 46, this.au[var2].getY() - 74, this.au[var2].getWidth(), this.au[var2].getHeight());
         this.add(this.au[var2++]);
      }

      this.nk = com.xy.q.Class1.i(83, 330, 79, 19, 0, Color.white, Class49.w);
      String var10005 = "A \u001d'\u001dr\u0005mB-U";
      this.nk.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.nk);
      this.nl = new Class54[2];

      for (int var9 = var2 = 0; var9 < this.nl.length; var9 = var2) {
         this.nl[var2] = new Class54(this);
         this.nl[var2].setBounds(68 + var2 * 79 - 46, 263, 50, 50);
         this.add(this.nl[var2++]);
      }

      this.ar = new com.xy.w.Class18[10];

      for (int var10 = var2 = 0; var10 < this.ar.length; var10 = var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         Class13 var14;
         if (var2 == 0) {
            var14 = this;
            com.xy.w.Class18 var34 = this.ar[var2];
            String var42 = "\u0006ZZ]Z\u000b@\u0017\u0005W\u0012";
            var34.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(55, 83, 155, 21);
         } else if (var2 == 1) {
            var14 = this;
            com.xy.w.Class18 var33 = this.ar[var2];
            String var41 = "A \u001d'\u001dq\u0006mB-U";
            var33.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(55, 83, 155, 218);
         } else if (var2 >= 2 && var2 <= 3) {
            var14 = this;
            com.xy.w.Class18 var32 = this.ar[var2];
            String var40 = "J\u0016\u0016\u0011\u0016A\u0017\u0005W\u0012";
            var32.dp("sc/d/4.png");
            this.ar[var2].setBounds(64 + (var2 - 2) * 79, 333, 59, 57);
         } else if (var2 >= 4 && var2 <= 5) {
            var14 = this;
            com.xy.w.Class18 var31 = this.ar[var2];
            String var39 = "A \u001d'\u001dp\u0002mB-U";
            var31.dp("sc/d/30.png");
            this.ar[var2].setBounds(65 + (var2 - 4) * 79, 390, 58, 1);
         } else if (var2 == 6) {
            var14 = this;
            com.xy.w.Class18 var30 = this.ar[var2];
            String var38 = "\u0006ZZ]Z\u000b@\u0017\u0005W\u0012";
            var30.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(218, 83, 307, 21);
         } else if (var2 == 7) {
            var14 = this;
            com.xy.w.Class18 var29 = this.ar[var2];
            String var37 = "A \u001d'\u001dq\u0006mB-U";
            var29.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(218, 83, 307, 219);
         } else if (var2 != 8) {
            if (var2 == 9) {
               com.xy.w.Class18 var22 = this.ar[var2];
               String var28 = "\u0006ZZ]Z\u000b@\u0017\u0005W\u0012";
               var22.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
               this.ar[var2].setBounds(218, 306, 307, 21);
            }

            var14 = this;
         } else {
            com.xy.w.Class18 var26 = this.ar[var2];
            String var36 = "\u0006ZZ]Z\bL\u0017\u0005W\u0012";
            var26.mt(com.xy.w.Class16.m("sc/d/19.png", 2, 2, 2, 2, false));
            this.ar[var2].setBounds(217, 326, 309, 156);
            com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

            int var4;
            for (var10 = var4 = 0; var10 < var3.length; var10 = var4) {
               if (var4 == 0) {
                  String var44 = "A \u001d&\u001dw\u0000mB-U";
                  var3[var4] = new com.xy.i.Class3("sc/e/42.png", 1, 0, this);
                  var10 = var4;
               } else {
                  String var45 = "\u0006ZZ\\Z\rF\u0017\u0005W\u0012";
                  var3[var4] = new com.xy.i.Class3("sc/e/43.png", 1, 1, this);
                  var10 = var4;
               }

               Class13 var13;
               if (var10 == 0) {
                  var13 = this;
                  var3[var4].setBounds(422, 408, 18, 18);
               } else {
                  var3[var4].setBounds(452, 408, 18, 18);
                  var13 = this;
               }

               var13.add(var3[var4++]);
            }

            var14 = this;
            this.no = new com.xy.q.Class24(1, this, 6, 3, 51, 51, 0, 0, 172, 254);
            var10005 = "A \u001d'\u001dr\nmB-U";
            this.no.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.no.vo(var3, 1);
            this.add(this.no);
         }

         var14.ar[var2].setBounds(this.ar[var2].getX() - 46, this.ar[var2].getY() - 74, this.ar[var2].getWidth(), this.ar[var2++].getHeight());
      }

      Class49.b(this.nk, this.nj.longValue());
   }
}
