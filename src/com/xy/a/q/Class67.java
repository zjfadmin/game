package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.bean.TTWarRecord;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;

public class Class67 extends com.xy.q.Class30 {
   private com.xy.i.Class19[] ahs;
   private Class48[] aht;
   private com.xy.q.Class54 fe;
   private JLabel[] o;
   private JLabel im;

   @Override
   protected void paintComponent(Graphics var1) {
      int var10000 = 0;
      super.paintComponent(var1);

      for (int var2 = 0; var10000 < this.aht.length; var10000 = var2) {
         this.aht[var2++].c(var1);
      }
   }

   public void ci(String var1) {
      LoginResult var3 = this.yx().getLoginResult();
      String var10007 = "i)";
      String[] var4;
      int var5 = Integer.parseInt((var4 = var1.split("\\|"))[0].substring(1));
      this.im.setText(var4[1]);
      this.fe.dp(com.xy.w.Class15.l(var3.getSpecies_id().toString()));
      this.o[0].setText(var3.getRolename());
      this.o[2].setText(com.xy.v.Class4.h(var3.getGrade()));
      this.o[2].setForeground(com.xy.q.Class49.d(com.xy.v.Class4.q(var3.getGrade())));
      this.o[4].setText(com.xy.v.Class4.t(var3.getPkrecord()));
      TTWarRecord var6 = var5 > 0 ? var3.getTTWarRecord(var5) : null;
      JLabel var10000 = this.o[1];
      String var11;
      if (var6 != null) {
         StringBuilder var10001 = new StringBuilder(String.valueOf(var6.getTTSL()));
         String var10002 = "\u0016";
         var11 = var10001.append("/").append(var6.getTTCZ() - var6.getTTSJ()).toString();
      } else {
         var11 = "e\u001ae";
         var11 = "0/0";
      }

      var10000.setText(var11);
      this.o[3].setText(var4[2]);
      var6 = var5 > 1 ? var3.getTTWarRecord(var5 - 1) : null;
      var10000 = this.o[5];
      if (var6 != null && var6.getTTRank() > 0) {
         var11 = String.valueOf(var6.getTTRank());
      } else {
         var11 = "朓乏榥";
         var11 = "未上榜";
      }

      var10000.setText(var11);

      int var7;
      for (int var10 = var7 = 0; var10 < this.aht.length; var10 = ++var7) {
         this.aht[var7].b(var7 + 3 < var4.length ? var4[var7 + 3] : null);
      }

      this.zc().b(this.lj());
   }

   public BigDecimal aaf(int var1) {
      return Class48.a(this.aht[var1]);
   }

   public Class67(GameView var1) {
      super(122, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "&VzWzfg\ra\u001b%[2";
      this.yy(-1, 0, 674, 449, com.xy.q.Class30.agh);
      this._do("sc/b/S284.png");
      this.o = new JLabel[26];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = var2) {
         String var10004 = "洎诬攵捗雑屈";
         this.o[var2] = new JLabel("测试数据隔山");
         Class67 var6;
         if (var2 < 6) {
            this.o[var2].setBounds(var2 % 2 == 0 ? 151 : 351, 62 + var2 / 2 * 31, 100, 18);
            var6 = this;
            this.o[var2].setFont(com.xy.q.Class49.ac);
         } else {
            int var3 = (var2 - 6) / 4;
            var6 = this;
            this.o[var2].setBounds(84 + var3 * 117, 308 + (var2 - 6) % 4 * 19, 80, 18);
            this.o[var2].setFont(com.xy.q.Class49.bz);
         }

         var6.add(this.o[var2++]);
      }

      this.aht = new Class48[5];

      for (int var7 = var2 = 0; var7 < this.aht.length; var7 = var2) {
         Class48[] var8 = this.aht;
         int var11 = var2;
         Class48 var10001 = new Class48(this, var2, this);
         var2++;
         var8[var11] = var10001;
      }

      this.ahs = new com.xy.i.Class19[7];

      for (int var9 = var2 = 0; var9 < this.ahs.length; var9 = var2) {
         Class67 var10;
         label42: {
            if (var2 < 6) {
               String var10007 = "F6\u001a7\u001a\u0017";
               this.ahs[var2] = new com.xy.i.Class19("sc/b/B" + (386 + var2) + ".png", 1, 51 + var2, this);
               if (var2 < 3) {
                  var10 = this;
                  this.ahs[var2].setBounds(440, 58 + 30 * var2, 80, 21);
                  break label42;
               }

               if (var2 < 6) {
                  var10 = this;
                  this.ahs[var2].setBounds(530, 59 + 30 * (var2 - 3), 100, 19);
                  break label42;
               }
            } else if (var2 == 6) {
               String var10005 = "J&\u0016 \u0016w\u0001kI+^";
               String var10010 = "赮嬶奣勤";
               this.ahs[var2] = new com.xy.i.Class19("sc/e/28.png", 1, 57, com.xy.q.Class49.bz, null, "赛季奖励", this);
               this.ahs[var2].setBounds(29, 133, 68, 17);
            }

            var10 = this;
         }

         var10.add(this.ahs[var2++]);
      }

      String var10008 = "笕久赢嬦\u0003w\tw\b帱\u000e杍\b斠\u0019膶\u0019w\tw\b帱\u000e杍\bp旜";
      this.im = new JLabel("第一赛季:2021年7月1日 至 2021年7月15日");
      this.im.setFont(com.xy.q.Class49.bm);
      this.im.setForeground(Color.red);
      this.im.setBounds(28, 159, 460, 16);
      this.add(this.im);
      this.fe = new com.xy.q.Class54(this);
      this.fe.wp(new com.xy.v.Class32(2, 2, 66, 66));
      this.fe.setBounds(28, 55, 70, 70);
      String var15 = "&VzWzfd\u0000`\u001b%[2";
      this.fe.dq("sc/b/S155.png");
      this.add(this.fe);
   }

   // $VF: synthetic method
   static JLabel[] aag(Class67 var0) {
      return var0.o;
   }

   public void g(int var1) {
      if (var1 >= 58 && var1 <= 62) {
         BigDecimal var7;
         if ((var7 = this.aaf(var1 - 58)) != null) {
            String var8 = Agreement.getSendTextAES("teamArena", "M" + var7);
            this.za().k(var8);
         }
      } else if (var1 == 51 || var1 == 52 || var1 == 53 || var1 == 57) {
         String var11 = "k";
         String var6 = Agreement.getSendTextAES("teamArena", "R" + (var1 == 57 ? 0 : var1 - 50));
         this.za().k(var6);
      } else if (var1 == 54) {
         String var10 = "\u0011qd";
         String var5 = Agreement.getSendTextAES("getfivemsg", "DD1");
         this.za().k(var5);
      } else if (var1 == 55) {
         Map var10000 = this.yt().bg().getNpcShopMap();
         String var9 = "w\tw\u000e";
         List var4;
         if ((var4 = (List)var10000.get("2027")) != null) {
            Class82 var3 = (Class82)this.zc().j(88);
            String var10003 = "竫拕秚剓";
            var3.adn(var4, "竞技积分");
            this.zc().b(88);
         }
      } else {
         if (var1 == 56) {
            String var10001 = "z";
            String var2 = Agreement.getSendTextAES("teamArena", "C");
            this.za().k(var2);
         }
      }
   }
}
