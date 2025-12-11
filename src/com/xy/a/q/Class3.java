package com.xy.a.q;

import com.xy.bean.BuyShopBean;
import com.xy.game.HandleOption;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class3 extends com.xy.q.Class30 {
   private com.xy.i.Class19 ev;
   private JLabel[] ew;
   private com.xy.i.Class19[] ex;
   private com.xy.q.Class52 ey;
   private com.xy.q.Class29 ez;
   private int z;
   private com.xy.q.Class14[] fa;
   private com.xy.q.Class27 fb;
   private com.xy.q.Class36 fc;
   private com.xy.w.Class18[] fd;
   private int ae;
   private com.xy.q.Class54 fe;
   private MoneyType ff;
   private Shop fg;

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void eh(String var1, long var2) {
      if (this.fg != null && this.fg.getShopid().equals(var1)) {
         this.fg.setShopprice(var2);
         com.xy.q.Class49.b(this.fa[0], this.fg.getShopprice());
         this.fb.ty().setText(String.valueOf(this.fb.ee()));
      }
   }

   public void bi(int var1) {
      this.ey.l();
      String var2;
      if (var1 == 1) {
         var2 = "赢乧";
         var2 = "购买";
      } else {
         var2 = "军啚";
         var2 = "出售";
      }

      this.ev.setText(var2);
      this.ei(null, false);
      this.z = var1;
      this.g(0);
   }

   public void ds(long var1, JTextField var3) {
      if (this.fg == null) {
         this.fa[1].setText(null);
      } else {
         com.xy.q.Class49.b(this.fa[1], this.fg.getShopprice() * var1);
      }
   }

   public void y(int var1) {
      if (var1 == 307) {
         if (this.afx.ah()) {
            return;
         }

         if (this.zc().l(14) != null) {
            String var10 = "亳晜旡乂胪撂佋";
            this.afx._do("交易时不能操作");
            return;
         }

         Shop var2 = this.fg;
         if (this.fg == null) {
            String var9 = "法杨遽乌盰爈咵";
            this.afx._do("没有选中的物品");
            return;
         }

         int var3;
         if ((var3 = (int)this.fb.ee()) <= 0) {
            String var10001 = "佷远兲政釘乵雡";
            this.afx._do("你输入数量为零");
            return;
         }

         Class3 var10000;
         if (this.z == 1) {
            BuyShopBean var4 = new BuyShopBean();
            var10000 = this;
            var4.setAte(1);
            HandleOption.k(var4, var2, var3, this.ff, this.afx);
         } else {
            StringBuffer var8;
            (var8 = new StringBuffer()).append(var2.getShopid());
            String var5 = this.yx().getGoodNum(var2.getShopiid(), var8, var3);
            if (var5 != null) {
               this.afx._do(var5);
               return;
            }

            BuyShopBean var6 = new BuyShopBean();
            var6.setAte(11);
            var6.setCd(var8.toString());
            String var7 = Agreement.getSendTextAES("nbuy", com.xy.v.Class31.a().toJson(var6));
            var10000 = this;
            this.afx.getClient().k(var7);
         }

         var10000.fc.setText("0");
      }
   }

   public Class3(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 622, 462, com.xy.q.Class30.agf);
      this.ex = new com.xy.i.Class19[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ex.length; var10000 = var2) {
         com.xy.i.Class19[] var9 = this.ex;
         String var10004 = "\u0007\u0002[\u0004[RMO\u0004\u000f\u0013";
         int var10006 = 301 + var2;
         String var36;
         Class3 var10010;
         if (var2 == 0) {
            var36 = "甓牰";
            var36 = "畜牧";
            var10010 = this;
         } else if (var2 == 1) {
            var36 = "禬楹";
            var36 = "种植";
            var10010 = this;
         } else if (var2 == 2) {
            var36 = "醈矨";
            var36 = "采矿";
            var10010 = this;
         } else if (var2 == 3) {
            var36 = "寗儃";
            var36 = "家具";
            var10010 = this;
         } else if (var2 == 4) {
            var36 = "剹荸";
            var36 = "制药";
            var10010 = this;
         } else if (var2 == 5) {
            var36 = "筇旳";
            var36 = "符文";
            var10010 = this;
         } else {
            var36 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var36, var10010);
         var9[var2] = var10002;
         this.ex[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.ex[var2].setBounds(58 + 65 * var2, 53, 63, 24);
         this.add(this.ex[var2++]);
      }

      String var42 = "d,8*8|&ag!p";
      String var10014 = "赙A丄";
      this.ev = new com.xy.i.Class19("sc/e/31.png", 1, 307, com.xy.q.Class49.ch, null, "购 买", this);
      this.ev.setBounds(506, 373, 79, 25);
      this.ev.setForeground(Color.black);
      this.add(this.ev);
      this.ew = new JLabel[4];

      for (int var10 = var2 = 0; var10 < this.ew.length; var10 = ++var2) {
         this.ew[var2] = com.xy.q.Class1.k(472, 88 + 61 * var2, 58, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var11 = this.ew[var2];
         String var17;
         if (var2 == 0) {
            var17 = "匚7o仠";
            var17 = "单  价";
         } else if (var2 == 1) {
            var17 = "恚TA飩";
            var17 = "总  额";
         } else if (var2 == 2) {
            var17 = "政釘";
            var17 = "数量";
         } else if (var2 == 3) {
            var17 = "珄A醥";
            var17 = "现 金";
         } else {
            var17 = "";
         }

         var11.setText(var17);
         this.ew[var2].setHorizontalAlignment(10);
         this.add(this.ew[var2]);
         if (var2 == 2) {
            this.ew[var2].setBounds(485, 345, 36, 19);
         }

         if (var2 == 3) {
            this.ew[var2].setBounds(58, 410, 58, 19);
         }
      }

      this.fa = new com.xy.q.Class14[3];

      for (int var12 = var2 = 0; var12 < this.fa.length; var12 = var2) {
         this.fa[var2] = com.xy.q.Class1.i(472, 111 + 61 * var2, 114, 19, 10, Color.white, com.xy.q.Class49.w);
         if (var2 == 2) {
            this.fa[var2].setBounds(397, 407, 55, 19);
            this.fa[var2].setHorizontalAlignment(0);
         }

         com.xy.q.Class14 var25 = this.fa[var2];
         String var10003 = "d,8+8~ ag!p";
         var25.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.fa[var2++]);
      }

      String var13 = "\u0007\u0002[\u0005[PCO\u0004\u000f\u0013";
      com.xy.q.Class36 var8 = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      var8.setBounds(526, 345, 60, 19);
      var8.setHorizontalAlignment(10);
      this.fb = new com.xy.q.Class27(15, var8, this);
      this.ff = new MoneyType();
      var42 = "玧o釆";
      this.ff.setIdAndKey(1, "现 金");
      this.ey = com.xy.q.Class1.m(109, 410, 169, 19, 10, Color.white, com.xy.q.Class49.w, this.ff, var1);
      String var10005 = "\u0007\u0002[\u0005[PCO\u0004\u000f\u0013";
      this.ey.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.ey.n(2);
      this.add(var8);
      this.add(this.ey);
      this.fe = new com.xy.q.Class54(this);
      this.fe.setBounds(530, 284, 50, 50);
      this.add(this.fe);
      this.fd = new com.xy.w.Class18[3];

      int var3;
      for (int var14 = var3 = 0; var14 < this.fd.length; var14 = ++var3) {
         this.fd[var3] = new com.xy.w.Class18();
         this.add(this.fd[var3]);
         if (var3 == 0) {
            com.xy.w.Class18 var23 = this.fd[var3];
            String var30 = "<t`s`#ag!p";
            var23.dp("sc/d/4.png");
            this.fd[var3].setBounds(526, 280, 59, 57);
         } else if (var3 != 1) {
            if (var3 == 2) {
               com.xy.w.Class18 var22 = this.fd[var3];
               String var29 = "\u0007\u0002[\u0005[RBO\u0004\u000f\u0013";
               var22.mt(com.xy.w.Class16.m("sc/d/36.png", 16, 16, 16, 16, false));
               this.fd[var3].setBounds(45, 77, 549, 360);
            }
         } else {
            com.xy.w.Class18 var27 = this.fd[var3];
            String var31 = "\u0007\u0002[\u0005[PMO\u0004\u000f\u0013";
            var27.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.fd[var3].setBounds(58, 90, 411, 309);
            com.xy.i.Class3[] var4 = new com.xy.i.Class3[2];

            int var5;
            for (int var15 = var5 = 0; var15 < var4.length; var15 = var5) {
               String var33;
               if (var5 == 0) {
                  var33 = "d,8*8{%ag!p";
                  var33 = "sc/e/42.png";
               } else {
                  var33 = "\u0007\u0002[\u0004[UGO\u0004\u000f\u0013";
                  var33 = "sc/e/43.png";
               }

               com.xy.i.Class3 var21 = new com.xy.i.Class3(var33, 1, var5, this);
               var4[var5] = var21;
               Class3 var16;
               if (var5 == 0) {
                  var16 = this;
                  var4[var5].setBounds(378, 408, 18, 18);
               } else {
                  if (var5 == 1) {
                     var4[var5].setBounds(453, 408, 18, 18);
                  }

                  var16 = this;
               }

               var16.add(var4[var5++]);
            }

            this.ez = new com.xy.q.Class29(this, 8, 6, 51, 51, 0, 0, 59, 92);
            var10005 = "d,8+8~/ag!p";
            this.ez.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.ez.vo(var4, 1);
            this.ez.be(true);
            this.add(this.ez);
            this.ez.vs().k(this.fa[2]);
         }
      }
   }

   public void ei(Shop var1, boolean var2) {
      if (this.fg == null || this.fg != var1) {
         this.fg = var1;
         if (this.fg == null) {
            this.fe.gs(0, null);
            this.fa[0].setText(null);
            this.fb.ty().setText("0");
         } else {
            this.fe.gs(13, var1);
            com.xy.q.Class49.b(this.fa[0], this.fg.getShopprice());
            if (this.z == 1) {
               int var9 = var2 ? 99 : 1;
               this.fb.ty().setText(String.valueOf(var9));
            } else {
               long var8 = this.yx().getGoodNum(this.fg.getShopiid());
               long var10 = var2 ? var8 : 1L;
               this.fb.ty().setText(String.valueOf(var10));
            }
         }
      } else if (this.z == 1) {
         long var7 = this.fb.ee() + (var2 ? 99 : 1);
         this.fb.ty().setText(String.valueOf(var7));
      } else {
         long var3 = this.yx().getGoodNum(this.fg.getShopiid());
         long var5 = var2 ? var3 : this.fb.ee() + 1L;
         this.fb.ty().setText(String.valueOf(var5));
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ae = var1;

      for (int var2 = 0; var10000 < this.ex.length; var10000 = ++var2) {
         this.ex[var2].setKeep(var2 == this.ae);
      }

      List var3 = this.yt().bg().getNpcShopMap().get(String.valueOf(5001 + this.ae));
      this.ez.fm(var3);
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 <= 0L || this.fg == null) {
         return 0L;
      } else if (this.z == 1) {
         long var6 = this.yx().getMoney(this.ff) / this.fg.getShopprice();
         return var1 > var6 ? var6 : null;
      } else {
         long var4 = this.yx().getGoodNum(this.fg.getShopiid());
         return var1 > var4 ? var4 : null;
      }
   }
}
