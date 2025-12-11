package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class10 extends com.xy.q.Class30 {
   private com.xy.q.Class14 kn;
   private BigDecimal ko;
   private com.xy.q.Class13 kp;
   private com.xy.w.Class18[] iq;
   private com.xy.i.Class11[] kq;
   private Class54[] an;
   private static Image kr = com.xy.w.Class16.c("sc/d/18.png");
   private int ha;
   private Class21 ks;
   private JLabel[] ay;
   private MoneyType ef;
   private Class52 kt;
   private com.xy.q.Class14 p;

   // $VF: synthetic method
   static Image gu() {
      return kr;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.afx.dh()) {
         this.h();
      }

      super.paintComponent(var1);
   }

   public void h() {
      if (this.an[0].il() != 0) {
         RoleData var1 = this.yx();
         Goodstable var2;
         if ((var2 = (Goodstable)this.an[0].jx()) != null) {
            var2 = var1.getGood(var2.getRgid());
         }

         if (var2 == null) {
            this.bb(null);
            return;
         }

         if (this.ha == 0) {
            String var10004 = "7\"-";
            this.p.setText("50/" + var2.getUsetime());
            this.p.setForeground(var2.getUsetime() < 50 ? Color.red : Color.white);
         }
      }
   }

   public boolean dh() {
      RoleData var1 = this.yx();
      Goodstable var2;
      if ((var2 = (Goodstable)this.an[0].jx()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var2 == null) {
         String var8 = "讲逩抬寙廑牉咄";
         this.afx._do("请选择对应物品");
         return false;
      } else if (this.ko != null && var1.getLoginResult().getGold().compareTo(this.ko) < 0) {
         GameView var10001 = this.afx;
         String var10004 = "夥诏布丟趱";
         StringBuilder var7 = new StringBuilder("大话币不足").append(this.ko.longValue() / 10000L);
         String var10003 = "乂";
         var10001._do(var7.append("万").toString());
         return false;
      } else {
         SuitOperBean var3 = new SuitOperBean();
         if (this.ha == 0) {
            if (this.an[1].ee() == 0L) {
               String var10002 = "诵逛拫寫庖孻孒裗夅籩垉";
               this.afx._do("请选择对应孩子装备类型");
               return false;
            }

            ArrayList var4;
            (var4 = new ArrayList()).add(var2.getRgid());
            var3.setType(132);
            var3.setGoods(var4);
            var3.setJade(new PartJade(this.an[1].ee(), 0));
         } else if (this.ha == 1) {
            ArrayList var5;
            (var5 = new ArrayList()).add(var2.getRgid());
            var3.setType(131);
            var3.setGoods(var5);
         }

         String var6 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var3));
         this.za().k(var6);
         return true;
      }
   }

   public void y(int var1) {
      if (var1 == 61) {
         if (this.ks == null) {
            this.cr(true);
         } else {
            this.cr(!this.ks.isVisible());
         }
      } else {
         if (var1 == 62) {
            this.dh();
         }
      }
   }

   // $VF: synthetic method
   private void cr(boolean var1) {
      if (this.ks != null || var1) {
         if (var1) {
            if (this.ks == null) {
               this.add(this.ks = new Class21(this), 0);
            }

            this.ks.setBounds(87, 134, 224, 122);
         }

         this.ks.setVisible(var1);
      }
   }

   public void g(int var1) {
      if (this.ha != var1) {
         com.xy.w.Class18 var10000 = this.iq[0];
         String var8;
         if (var1 == 0) {
            var8 = "6CjEj\u0016r\u000e5N\"";
            var8 = "sc/e/67.png";
         } else {
            var8 = "qq-w-$:<r|e";
            var8 = "sc/e/68.png";
         }

         var10000.dp(var8);
         var10000 = this.iq[1];
         if (var1 == 1) {
            var8 = "6CjEj\u0016r\u000e5N\"";
            var8 = "sc/e/67.png";
         } else {
            var8 = "qq-w-$:<r|e";
            var8 = "sc/e/68.png";
         }

         var10000.dp(var8);
      }

      int var2;
      for (int var4 = var2 = 0; var4 < this.an.length; var4 = var2) {
         Class54 var5 = this.an[var2];
         var2++;
         var5.gs(0, null);
      }

      this.ha = var1;
      Class10 var6;
      if (this.ha == 0) {
         this.kp.ol(138L);
         var6 = this;
         this.ko = new BigDecimal(5000000);
         Class49.b(this.kn, this.ko.longValue());
         this.p.setBounds(107, 149, 64, 19);
         this.kn.setVisible(true);
         this.kt.setVisible(true);
         this.ay[0].setVisible(true);
         this.ay[1].setVisible(true);
         this.kq[0].setVisible(true);
         com.xy.i.Class11 var10002 = this.kq[1];
         String var10003 = "扳遥";
         var10002.setText("打造");
         this.an[1].gs(16, 650);
      } else {
         if (this.ha == 1) {
            this.kp.ol(139L);
            this.p.setForeground(Color.white);
            this.ko = null;
            this.p.setBounds(223, 149, 64, 19);
            this.kn.setVisible(false);
            this.kt.setVisible(false);
            this.ay[0].setVisible(false);
            this.ay[1].setVisible(false);
            this.kq[0].setVisible(false);
            com.xy.i.Class11 var7 = this.kq[1];
            String var13 = "刔觡";
            var7.setText("分解");
         }

         var6 = this;
      }

      var6.cr(false);
      this.kp.vs().a(0);
   }

   public Class10(GameView var1) {
      super(164, 2, com.xy.q.Class30.afz, var1);
      this.ha = -1;
      this.yy(-1, 0, 382, 413, com.xy.q.Class30.agh);
      com.xy.w.Class9 var31 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "扁逢刔觡";
      this.yu(var31, "打造分解");
      this.kq = new com.xy.i.Class11[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.kq.length; var10000 = var2) {
         com.xy.i.Class11[] var8 = this.kq;
         if (var2 == 0) {
            var10004 = "6CjEj\u0012}\u000e5N\"";
            var10004 = "sc/e/28.png";
         } else {
            var10004 = "aa=g=5<r|e";
            var10004 = "sc/e/7.png";
         }

         int var10006 = 61 + var2;
         Font var10007 = var2 == 0 ? Class49.bz : Class49.ch;
         String var46;
         Class10 var10010;
         if (var2 == 0) {
            var46 = "逩抬郈伈";
            var46 = "选择部位";
            var10010 = this;
         } else if (var2 == 1) {
            var46 = "扁逢";
            var46 = "打造";
            var10010 = this;
         } else {
            var46 = "";
            var10010 = this;
         }

         com.xy.i.Class11 var10001 = new com.xy.i.Class11(var10004, 1, var10006, var10007, null, var46, var10010);
         var8[var2] = var10001;
         Class10 var9;
         if (var2 == 0) {
            var9 = this;
            this.kq[var2].setBounds(225, 150, 60, 18);
         } else {
            if (var2 == 1) {
               this.kq[var2].setBounds(172, 237, 59, 25);
               this.kq[var2].setForeground(Color.black);
            }

            var9 = this;
         }

         var9.add(this.kq[var2++]);
      }

      this.kn = com.xy.q.Class1.i(170, 180, 124, 19, 10, Color.white, Class49.w);
      this.p = com.xy.q.Class1.i(107, 149, 64, 19, 0, Color.white, Class49.w);
      this.ef = new MoneyType();
      String var10011 = "醔\u0000铴";
      this.ef.setIdAndKey(1, "金 钱");
      this.kt = com.xy.q.Class1.m(170, 203, 124, 19, 10, Color.white, Class49.w, this.ef, var1);
      String var45 = "qq-v-#5<r|e";
      this.kn.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var44 = "6CjDj\u0011r\u000e5N\"";
      this.p.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var10005 = "qq-v-#5<r|e";
      this.kt.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.kn);
      this.add(this.kt);
      this.add(this.p);
      this.ay = new JLabel[4];

      for (int var10 = var2 = 0; var10 < this.ay.length; var10 = var2) {
         int var37 = 180 + 23 * var2;
         String var10008 = "\u0003&f\u0003f\u0003f\u0003";
         this.ay[var2] = com.xy.q.Class1.f(104, var37, 60, 19, 10, Class49.c("#cFFFFFF"), Class49.n);
         JLabel var11 = this.ay[var2];
         String var18;
         if (var2 == 0) {
            var18 = "涚耕釃钳";
            var18 = "消耗金钱";
         } else if (var2 == 1) {
            var18 = "担杌釱铴";
            var18 = "拥有金钱";
         } else if (var2 == 2) {
            var18 = "裗夅扁逢";
            var18 = "装备打造";
         } else if (var2 == 3) {
            var18 = "裥奂刦覦";
            var18 = "装备分解";
         } else {
            var18 = "";
         }

         var11.setText(var18);
         if (var2 >= 2 && var2 <= 3) {
            this.ay[var2].setBounds(132 + 101 * (var2 - 2), 49, 60, 18);
         }

         this.add(this.ay[var2++]);
      }

      this.an = new Class54[2];

      for (int var12 = var2 = 0; var12 < this.an.length; var12 = var2) {
         this.an[var2] = new Class54(this);
         Class54 var38 = this.an[var2];
         var10005 = "aa=f=6<r|e";
         var38.dq("sc/d/4.png");
         this.an[var2].wp(Class54.auc);
         this.an[var2].setBounds(109 + var2 * 116, 90, 59, 57);
         this.add(this.an[var2++]);
      }

      this.iq = new com.xy.w.Class18[5];

      for (int var13 = var2 = 0; var13 < this.iq.length; var13 = var2) {
         this.iq[var2] = new com.xy.w.Class18();
         Class10 var14;
         if (var2 == 0) {
            var14 = this;
            this.iq[var2].setBounds(111 + var2 * 101, 49, 18, 18);
            this.iq[var2].addMouseListener(new Class7(this));
         } else if (var2 == 1) {
            var14 = this;
            this.iq[var2].setBounds(111 + var2 * 101, 49, 18, 18);
            this.iq[var2].addMouseListener(new Class30(this));
         } else if (var2 == 2) {
            var14 = this;
            com.xy.w.Class18 var26 = this.iq[var2];
            var26.dp("sc/d/73.png");
            this.iq[var2].setBounds(180, 99, 34, 38);
         } else if (var2 == 3) {
            var14 = this;
            com.xy.w.Class18 var27 = this.iq[var2];
            var27.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.iq[var2].setBounds(47, 272, 311, 105);
         } else {
            if (var2 == 4) {
               com.xy.w.Class18 var22 = this.iq[var2];
               String var28 = "6CjDj\u0014|\u000e5N\"";
               var22.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
               this.iq[var2].setBounds(46, 32, 311, 240);
            }

            var14 = this;
         }

         var14.add(this.iq[var2++]);
      }

      com.xy.i.Class3[] var7 = new com.xy.i.Class3[2];

      int var3;
      for (int var15 = var3 = 0; var15 < var7.length; var15 = var3) {
         if (var3 == 0) {
            var10004 = "qq-w-&0<r|e";
            var10004 = "sc/e/42.png";
         } else {
            var10004 = "6CjEj\u0014v\u000e5N\"";
            var10004 = "sc/e/43.png";
         }

         com.xy.i.Class3 var23 = new com.xy.i.Class3(var10004, 1, var3, this);
         var7[var3] = var23;
         Class10 var16;
         if (var3 == 0) {
            var7[var3].setBounds(316, 378, 18, 18);
            var16 = this;
         } else {
            var7[var3].setBounds(338, 378, 18, 18);
            var16 = this;
         }

         var16.add(var7[var3++]);
      }

      this.kp = new com.xy.q.Class13(this, 6, 2, 51, 51, 0, 0, 48, 273);
      var10004 = "qq-v-#:<r|e";
      this.kp.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.kp.vr(var7, 1);
      this.add(this.kp);
   }

   static {
      String var10000 = "qq-v-#:<r|e";
   }

   // $VF: synthetic method
   static void hl(Class10 var0, boolean var1) {
      var0.cr(var1);
   }

   public void bb(Goodstable var1) {
      if (this.ha == 0) {
         Class54 var4 = this.an[0];
         byte var6;
         Goodstable var8;
         if (var1 != null) {
            var6 = 1;
            var8 = var1;
         } else {
            var6 = 0;
            var8 = var1;
         }

         var4.gs(var6, var8);
         if (var1 != null) {
            String var10004 = "p\u0010j";
            this.p.setText("50/" + var1.getUsetime());
            this.p.setForeground(var1.getUsetime() < 50 ? Color.red : Color.white);
         } else {
            this.p.setText("");
         }
      } else {
         if (this.ha == 1) {
            Class54 var10000 = this.an[0];
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
            Goodstable var2 = var1 != null ? this.yt().ay(new BigDecimal(668)) : null;
            if (var2 != null) {
               String var5 = var1.getValue();
               String var7 = "筋纵?";
               String var10003 = "9";
               int var3 = com.xy.v.Class12.f(var5, "等级=", "|");
               this.an[1].gs(1, var2);
               this.p.setText(String.valueOf(var3 == 3 ? 30 : (var3 == 2 ? 5 : 2)));
               return;
            }

            this.an[1].gs(0, null);
            this.p.setText("");
         }
      }
   }

   // $VF: synthetic method
   static Class54[] hm(Class10 var0) {
      return var0.an;
   }

   // $VF: synthetic method
   static int hn(Class10 var0) {
      return var0.ha;
   }

   @Override
   public void l() {
      this.kt.l();
      this.g(0);
      super.l();
   }
}
