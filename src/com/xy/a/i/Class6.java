package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class54;
import com.xy.q.Class60;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Class6 extends com.xy.q.Class30 {
   private int cn;
   private com.xy.q.Class14 ac;
   private com.xy.q.Class13 hb;
   private Class54[] hc;
   private com.xy.i.Class11[] hd;
   private com.xy.w.Class18[] fp;
   private Class12 he;

   public void g(int var1) {
      if (var1 == 71) {
         this.f();
      } else {
         if (var1 == 72) {
            this.dh();
         }
      }
   }

   @Override
   public boolean ah() {
      this.bb(null);
      return super.ah();
   }

   public void cr(boolean var1) {
      if (this.he != null || var1) {
         if (var1) {
            if (this.he == null) {
               this.add(this.he = new Class12(this), 0);
            }

            this.he.nb.be(false);
            this.he.nb.td().removeAllElements();
            int var2 = 0;
            RoleData var3 = this.yx();
            List var4 = null;

            int var5;
            for (int var10000 = var5 = 0; var10000 < var3.babys.size(); var10000 = ++var5) {
               Baby var6;
               BigDecimal[] var7 = (var6 = var3.babys.get(var5)).getpartAll();
               if (var4 != null) {
                  var4.clear();
               }

               if ((var4 = this.fl(var4, var7)) != null && var4.size() != 0) {
                  var2 += var4.size();
                  StringBuilder var10002 = new StringBuilder(String.valueOf(var6.getBabyname()));
                  String var10003 = "\"";
                  var10002 = var10002.append("(").append(var4.size());
                  var10003 = "m";
                  Class60 var8 = new Class60(var10002.append(")").toString(), var6.getBabyid());
                  this.he.nb.afo(var8);
               }
            }

            String var10004 = "兢郯\"";
            StringBuilder var11 = new StringBuilder("全部(").append(var2);
            String var13 = "m";
            Class60 var9 = new Class60(var11.append(")").toString(), null);
            this.he.nb.afo(var9);
            this.he.nb.n(this.he.nb.td().size() - 1);
            this.he.setBounds(30, 108, 330, 150);
         }

         this.he.setVisible(var1);
      }
   }

   public void i(BigDecimal var1) {
      if (this.he != null) {
         RoleData var2 = this.yx();
         Object var3 = new ArrayList();

         int var4;
         for (int var10000 = var4 = 0; var10000 < var2.babys.size(); var10000 = ++var4) {
            Baby var5 = var2.babys.get(var4);
            if (var1 == null || var5.getBabyid().compareTo(var1) == 0) {
               BigDecimal[] var6 = var5.getpartAll();
               var3 = this.fl((List<BigDecimal>)var3, var6);
            }
         }

         this.he.nc.vs().a(0);
         this.he.nc.fm((List<BigDecimal>)var3);
      }
   }

   public boolean dh() {
      RoleData var1;
      Goodstable var2;
      if ((var2 = (var1 = this.yx()).au(137L)) == null) {
         String var9 = "缰尖炳釖矹";
         this.afx._do("缺少点金石");
         return false;
      } else {
         Goodstable var3;
         if ((var3 = (Goodstable)this.hc[0].jx()) != null) {
            var3 = var1.getGood(var3.getRgid());
         }

         if (var3 == null) {
            String var8 = "讳遢抭宒廐爂咅";
            this.afx._do("请选择对应物品");
            return false;
         } else {
            String var10000 = var3.getValue();
            String var10001 = "炻噢屙怭";
            if (GoodType.getExtra(var10000, "炼器属性") != null) {
               String var10002 = "计袮奃嶙纋烒醕扻勛";
               this.afx._do("该装备已经点金成功");
               return false;
            } else {
               SuitOperBean var5 = new SuitOperBean();
               ArrayList var6;
               (var6 = new ArrayList()).add(var3.getRgid());
               var6.add(var2.getRgid());
               var5.setType(134);
               var5.setGoods(var6);
               String var7 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var5));
               this.za().k(var7);
               return true;
            }
         }
      }
   }

   public Class6(GameView var1) {
      super(165, 2, com.xy.q.Class30.afz, var1);
      this.cn = -1;
      this.yy(-1, 0, 382, 375, com.xy.q.Class30.agh);
      com.xy.w.Class9 var25 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "烒醕";
      this.yu(var25, "点金");
      this.hd = new com.xy.i.Class11[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hd.length; var10000 = var2) {
         com.xy.i.Class11[] var8 = this.hd;
         if (var2 == 0) {
            var10004 = "yd%b%52)zim";
            var10004 = "sc/e/28.png";
         } else {
            var10004 = "\u0018'D!DsE4\u0005#";
            var10004 = "sc/e/7.png";
         }

         int var10006 = 71 + var2;
         Font var10007 = var2 == 0 ? Class49.bz : Class49.ch;
         String var36;
         Class6 var10010;
         if (var2 == 0) {
            var36 = "巵穵裂复";
            var36 = "已穿装备";
            var10010 = this;
         } else if (var2 == 1) {
            var36 = "烒醕";
            var36 = "点金";
            var10010 = this;
         } else {
            var36 = "";
            var10010 = this;
         }

         com.xy.i.Class11 var10001 = new com.xy.i.Class11(var10004, 1, var10006, var10007, null, var36, var10010);
         var8[var2] = var10001;
         Class6 var9;
         if (var2 == 0) {
            var9 = this;
            this.hd[var2].setBounds(110, 123, 60, 18);
         } else {
            if (var2 == 1) {
               this.hd[var2].setBounds(172, 190, 59, 25);
               this.hd[var2].setForeground(Color.black);
            }

            var9 = this;
         }

         var9.add(this.hd[var2++]);
      }

      this.ac = com.xy.q.Class1.i(233, 122, 64, 19, 0, Color.white, Class49.w);
      String var10005 = "yd%c%6=)zim";
      this.ac.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ac);
      this.hc = new Class54[2];

      for (int var10 = var2 = 0; var10 < this.hc.length; var10 = var2) {
         this.hc[var2] = new Class54(this);
         Class54 var30 = this.hc[var2];
         var10005 = "\u0018'D DpE4\u0005#";
         var30.dq("sc/d/4.png");
         this.hc[var2].wp(Class54.auc);
         this.hc[var2].setBounds(110 + var2 * 125, 64, 59, 57);
         this.add(this.hc[var2++]);
      }

      this.fp = new com.xy.w.Class18[2];

      for (int var11 = var2 = 0; var11 < this.fp.length; var11 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class6 var12;
         if (var2 == 0) {
            var12 = this;
            com.xy.w.Class18 var20 = this.fp[var2];
            var20.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.fp[var2].setBounds(47, 231, 311, 105);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var16 = this.fp[var2];
               String var21 = "7\bk\u000fk_}E4\u0005#";
               var16.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
               this.fp[var2].setBounds(46, 32, 311, 200);
            }

            var12 = this;
         }

         var12.add(this.fp[var2++]);
      }

      com.xy.i.Class3[] var6 = new com.xy.i.Class3[2];

      int var3;
      for (int var13 = var3 = 0; var13 < var6.length; var13 = var3) {
         if (var3 == 0) {
            var10004 = "yd%b%38)zim";
            var10004 = "sc/e/42.png";
         } else {
            var10004 = "7\bk\u000ek_wE4\u0005#";
            var10004 = "sc/e/43.png";
         }

         com.xy.i.Class3 var17 = new com.xy.i.Class3(var10004, 1, var3, this);
         var6[var3] = var17;
         Class6 var14;
         if (var3 == 0) {
            var6[var3].setBounds(316, 338, 18, 18);
            var14 = this;
         } else {
            var6[var3].setBounds(338, 338, 18, 18);
            var14 = this;
         }

         var14.add(var6[var3++]);
      }

      this.hb = new com.xy.q.Class13(this, 6, 2, 51, 51, 0, 0, 48, 233);
      String var35 = "yd%c%62)zim";
      this.hb.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.hb.vr(var6, 1);
      this.hb.ol(139L);
      this.add(this.hb);
      Goodstable var7 = this.yt().ay(new BigDecimal(667));
      Class54 var15 = this.hc[1];
      byte var18;
      Goodstable var24;
      if (var7 != null) {
         var18 = 1;
         var24 = var7;
      } else {
         var18 = 0;
         var24 = var7;
      }

      var15.gs(var18, var24);
   }

   public void f() {
      if (this.he == null) {
         this.cr(true);
      } else {
         this.cr(!this.he.isVisible());
      }
   }

   public List<BigDecimal> fl(List<BigDecimal> var1, BigDecimal[] var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
         Goodstable var4;
         if ((var4 = this.yx().getGoodEquip(var2[var3])) != null) {
            if (var1 == null) {
               var1 = new ArrayList();
            }

            var1.add(var4.getRgid());
         }
      }

      return var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.afx.dh()) {
         this.h();
      }

      super.paintComponent(var1);
   }

   public void bb(Goodstable var1) {
      Class54 var10000 = this.hc[0];
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      var10000.gs(var10001, var10002);
   }

   @Override
   public void l() {
      this.h();
      super.l();
   }

   public void h() {
      RoleData var1;
      long var2 = (var1 = this.yx()).getGoodTypeNum(137);
      if (this.cn != var2) {
         this.cn = (int)var2;
         String var10003 = "Zk";
         this.ac.setText("1/" + this.cn);
      }

      if (this.hc[0].il() != 0) {
         Goodstable var4;
         if ((var4 = (Goodstable)this.hc[0].jx()) != null) {
            var4 = var1.getGood(var4.getRgid());
         }

         if (var4 == null) {
            this.bb(null);
            return;
         }
      }
   }
}
