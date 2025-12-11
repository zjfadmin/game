package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.RoleSuitBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class20 extends com.xy.q.Class30 {
   private Class54[] zq;
   private com.xy.q.Class14 nk;
   private com.xy.i.Class11 zr;
   private com.xy.w.Class18[] aw;
   private MoneyType on;
   private BigDecimal gi = new BigDecimal(this.za().l(2, 12) ? 1000000 : (this.za().gameType == 2 ? 5000000 : 10000000));
   private com.xy.q.Class24 no;
   private JLabel[] o;
   private Class52 oq;

   public void e() {
      RoleData var1 = this.yx();
      Goodstable var2;
      if ((var2 = (Goodstable)this.zq[0].jx()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      PartJade var3 = (PartJade)this.zq[1].jx();
      if (var2 != null && var3 != null) {
         int var4 = (int)this.zq[1].ee();
         if (this.gi.compareTo(var1.getLoginResult().getGold()) > 0) {
            String var19 = "醐帤乌趖o\u000b";
            this.afx.dp("金币不足..");
         } else if (var2.getGoodlock() == 1) {
            String var18 = "诧牻哃巠袩劲锃";
            this.afx.dp("该物品已被加锁");
         } else {
            SuitOperBean var5 = new SuitOperBean();
            ArrayList var6;
            (var6 = new ArrayList()).add(var2.getRgid());
            PartJade var7 = new PartJade(var3.getSuitid(), var3.getPartId());
            var7.setJade(var4, 1);
            var5.setType(3);
            var5.setGoods(var6);
            var5.setJade(var7);
            String var8 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var5));
            this.za().k(var8);
            String var10003 = var2.getValue();
            String var10004 = "外裠尟怂";
            String var9 = GoodType.getExtra(var10003, "套装属性");
            String var10002 = var2.getValue();
            var10003 = "N~";
            String[] var10 = var10002.split("\\|");
            String var11 = MsgUntil.n(1, var9);
            boolean var10008 = false;
            var10[0] = "套装品质=" + MsgUntil.n(3, var9);
            var2.setValue(GoodType.e(var10, 3, var11));
            var3.b(var4, 1);
            var1.getLoginResult().setGold(var1.getLoginResult().getGold().subtract(this.gi));
            int var13 = 0;

            for (int var10000 = var13; var10000 < this.zq.length; var10000 = var13) {
               Class54 var14 = this.zq[var13];
               var13++;
               var14.gs(0, null);
            }

            GameView var16 = this.afx;
            var10004 = "涭聖亣乁丏";
            StringBuilder var20 = new StringBuilder("消耗了一个").append(MsgUntil.j(var4));
            var10003 = "玛笤<,";
            var16.dp(var20.append("玉符..").toString());
            GameView var15 = this.afx;
            var10003 = "涭聖亣";
            StringBuilder var17 = new StringBuilder("消耗了").append(this.gi.longValue() / 10000L);
            var10002 = "U釃布<,";
            var15.dp(var17.append("W金币..").toString());
         }
      } else {
         String var10001 = "诵凔夅覓卅纵皆裗夅咞王笴　";
         this.afx.dp("请准备要升级的装备和玉符。");
      }
   }

   public void f() {
      this.zq[1].gs(0, null);
      RoleData var1 = this.yx();
      Goodstable var2;
      if ((var2 = (Goodstable)this.zq[0].jx()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var2 != null) {
         String var10001 = var2.getGoodsname();
         String var10002 = "\u001d\u0092";
         String var3 = var10001.split("\\·")[0];
         String var10000 = var2.getValue();
         var10001 = "N~";
         var10000 = var10000.split("\\|")[1];
         var10001 = "\u0018";
         int var4 = Integer.parseInt(var10000.split("=")[1]);
         RoleSuitBean var5 = this.yt().bs().a(var3);
         PartJade var6;
         if (!(var6 = this.yx().getPackRecord().getPartJade(var5.getSuitID(), var4)).a()) {
            var10001 = var2.getValue();
            var10002 = "奅裇屌急";
            int var7;
            if ((var7 = MsgUntil.g(MsgUntil.n(0, GoodType.getExtra(var10001, "套装属性")))) < 5 && var6.getJade(var7 + 1) > 0) {
               this.zq[1].gs(100 + var7 + 1, var6);
            }
         }
      }
   }

   public Class54[] ka() {
      return this.zq;
   }

   public Class20(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(46, 74, 490, 428, com.xy.q.Class30.agf);
      String var10008 = "qq-w-!3<r|e";
      String var10013 = "卢a纂";
      this.zr = new com.xy.i.Class11("sc/e/31.png", 1, 3, Class49.ch, Class49.bv, "升 级", this);
      this.zr.setBounds(289, 337, 79, 25);
      this.add(this.zr);
      this.o = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = var2) {
         var10008 = "1a\"2\"2\"2";
         this.o[var2] = com.xy.q.Class1.f(57, 88, 37, 17, 0, Class49.c("#c000000"), Class49.ch);
         JLabel var7 = this.o[var2];
         String var15;
         if (var2 == 0) {
            var15 = "外裠";
            var15 = "套装";
         } else if (var2 == 1) {
            var15 = "涚耕釃钳";
            var15 = "消耗金钱";
         } else if (var2 == 2) {
            var15 = "护本醐钔";
            var15 = "拥有金钱";
         } else {
            var15 = "";
         }

         var7.setText(var15);
         if (var2 >= 1 && var2 <= 2) {
            this.o[var2].setBounds(279, 345 + (var2 - 1) * 26, 72, 19);
         }

         this.o[var2].setBounds(this.o[var2].getX() - 46, this.o[var2].getY() - 74, this.o[var2].getWidth(), this.o[var2].getHeight());
         this.add(this.o[var2++]);
      }

      this.on = new MoneyType();
      var10013 = "玲2釓";
      this.on.setIdAndKey(1, "现 金");
      this.oq = com.xy.q.Class1.m(308, 297, 118, 19, 10, Color.white, Class49.w, this.on, var1);
      String var10009 = "V\"\n%\np\u0012oU/B";
      this.oq.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.oq.n(2);
      this.nk = com.xy.q.Class1.i(308, 271, 118, 19, 10, Color.white, Class49.w);
      String var10005 = "qq-v-#5<r|e";
      this.nk.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.nk);
      this.add(this.oq);
      this.zq = new Class54[2];

      for (int var8 = var2 = 0; var8 < this.zq.length; var8 = var2) {
         this.zq[var2] = new Class54(this);
         this.zq[var2].setBounds(241 + var2 * 120, 84, 50, 50);
         this.add(this.zq[var2++]);
      }

      this.aw = new com.xy.w.Class18[6];

      for (int var9 = var2 = 0; var9 < this.aw.length; var9 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         this.add(this.aw[var2]);
         Class20 var10;
         if (var2 == 0) {
            com.xy.w.Class18 var25 = this.aw[var2];
            String var28 = "V\"\n%\np\u001coU/B";
            var25.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.aw[var2].setBounds(59, 109, 156, 360);
            com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

            int var4;
            for (var9 = var4 = 0; var9 < var3.length; var9 = var4) {
               if (var4 == 0) {
                  String var10004 = "qq-w-&0<r|e";
                  var3[var4] = new com.xy.i.Class3("sc/e/42.png", 1, 0, this);
                  var9 = var4;
               } else {
                  String var30 = "V\"\n$\nu\u0016oU/B";
                  var3[var4] = new com.xy.i.Class3("sc/e/43.png", 1, 1, this);
                  var9 = var4;
               }

               Class20 var13;
               if (var9 == 0) {
                  var13 = this;
                  var3[var4].setBounds(111, 395, 18, 18);
               } else {
                  var3[var4].setBounds(140, 395, 18, 18);
                  var13 = this;
               }

               var13.add(var3[var4++]);
            }

            var10 = this;
            this.no = new com.xy.q.Class24(2, this, 3, 7, 51, 51, 0, 0, 14, 37);
            var10005 = "qq-v-#:<r|e";
            this.no.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.no.vo(var3, 1);
            this.add(this.no);
         } else {
            label117: {
               if (var2 >= 1 && var2 <= 3) {
                  com.xy.w.Class18 var19 = this.aw[var2];
                  String var24 = "2FnAn\u0011oU/B";
                  var19.dp("sc/d/4.png");
                  if (var2 >= 1 && var2 <= 2) {
                     var10 = this;
                     this.aw[var2].setBounds(283 + (var2 - 1) * 120, 154, 59, 57);
                     break label117;
                  }

                  if (var2 == 3) {
                     var10 = this;
                     this.aw[var2].setBounds(343, 254, 59, 57);
                     break label117;
                  }
               } else {
                  if (var2 == 4) {
                     var10 = this;
                     com.xy.w.Class18 var23 = this.aw[var2];
                     String var10003 = "qq-v-%3<r|e";
                     var23.dp("sc/d/71.png");
                     this.aw[var2].setBounds(345, 221, 56, 30);
                     break label117;
                  }

                  if (var2 == 5) {
                     com.xy.w.Class18 var18 = this.aw[var2];
                     String var22 = "V\"\n%\nr\u0016oU/B";
                     var18.mt(com.xy.w.Class16.m("sc/d/33.png", 30, 30, 30, 30, false));
                     this.aw[var2].setBounds(229, 111, 289, 358);
                  }
               }

               var10 = this;
            }
         }

         var10.aw[var2].setBounds(this.aw[var2].getX() - 46, this.aw[var2].getY() - 74, this.aw[var2].getWidth(), this.aw[var2++].getHeight());
      }

      Class49.b(this.nk, this.gi.longValue());
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.zq.length; var10000 = var1) {
         Class54 var2 = this.zq[var1];
         var1++;
         var2.gs(0, null);
      }

      this.no.vs().a(0);
      this.oq.l();
   }
}
