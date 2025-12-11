package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class19 extends com.xy.q.Class30 {
   private int la;
   private com.xy.q.Class14[] rw;
   private com.xy.i.Class7[] rx;
   private com.xy.q.Class52 ry;
   private com.xy.i.Class4[] rz;
   private JLabel sa;
   private JLabel[] sb;
   private int sc;
   private BigDecimal sd;
   private RichLabel[] se;
   private com.xy.i.Class4[] sf;
   private com.xy.w.Class18[] sg;
   private JLabel[] ew;
   private com.xy.w.Class18[] sh;
   private com.xy.q.Class13 kp;
   private com.xy.q.Class52 si;
   private MoneyType sj;
   private com.xy.q.Class14 nk;
   private com.xy.w.Class18[] sk;
   private int ha;
   private MoneyType on;
   private com.xy.q.Class58 sl;
   private com.xy.i.Class4[] ly;
   private com.xy.q.Class26[] sm;
   private com.xy.i.Class4 hq;

   public int ia() {
      return this.ha;
   }

   public void lm(int var1) {
      if (this.ha == 1) {
         this.sc = var1;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.rx.length; var10000 = ++var2) {
            this.rx[var2].be(var2 == this.sc);
         }

         for (int var5 = var2 = 0; var5 < this.sm.length; var5 = var2) {
            com.xy.q.Class26 var6 = this.sm[var2];
            var2++;
            var6.gs(0, null);
         }

         com.xy.w.Class18 var10002 = this.sg[1];
         int var7 = 0;
         var10002.setVisible(false);
         this.sg[2].setVisible(false);

         for (int var4 = 0; var7 < this.sb.length; var7 = var4) {
            this.sb[var4++].setVisible(false);
         }

         this.ry.setVisible(false);
         Class19 var8;
         if (this.sc == 0) {
            this.kp.ol(522L);
            String var10007 = "垰兡";
            this.hq.setText("培养");
            com.xy.q.Class26 var10005 = this.sm[1];
            String var10006 = "覶春凸";
            var10005.dq("观星册");
            JLabel var10004 = this.sb[0];
            String var14 = "淁耍醘钫";
            var10004.setText("消耗金钱");
            JLabel var10003 = this.sb[1];
            String var12 = "彩刹祤勯";
            var10003.setText("当前神力");
            this.ry.alj(null);
            this.ry.setText(null);
            com.xy.q.Class49.b(this.nk, this.za().l(2, 12) ? 100000L : 1000000L);
            var8 = this;
            this.nk.setBounds(200, 162, 114, 19);
            this.ry.setBounds(200, 188, 114, 19);
            this.sb[0].setVisible(true);
            this.sb[1].setVisible(true);
            this.ry.setVisible(true);
         } else if (this.sc == 1) {
            var8 = this;
            this.kp.ol(500L);
            String var10011 = "匎纽";
            this.hq.setText("升级");
            com.xy.q.Class26 var10009 = this.sm[1];
            String var10010 = "矅瞇";
            var10009.dq("矿石");
            JLabel var10008 = this.sb[0];
            String var17 = "淁耍醘钫";
            var10008.setText("消耗金钱");
            JLabel var15 = this.sb[1];
            String var16 = "彩刹釫铅";
            var15.setText("当前金钱");
            this.ry.alj(this.sj);
            this.nk.setBounds(200, 162, 114, 19);
            this.ry.setBounds(200, 188, 114, 19);
            this.sb[0].setVisible(true);
            this.sb[1].setVisible(true);
            this.ry.setVisible(true);
         } else if (this.sc == 2) {
            var8 = this;
            this.g(0);
         } else {
            if (this.sc == 3) {
               this.kp.ol(521L);
               String var10012 = "烵昅";
               this.hq.setText("炼星");
               com.xy.q.Class26 var18 = this.sm[1];
               String var19 = "烈春瞇";
               var18.dq("炼星石");
               this.nk.setText(null);
               this.nk.setBounds(241, 149, 54, 19);
               this.sb[2].setFont(com.xy.q.Class49.n);
               this.sb[3].setFont(com.xy.q.Class49.n);
               this.sb[2].setBounds(101, 178, 250, 14);
               this.sb[3].setBounds(101, 194, 250, 14);
               JLabel var10 = this.sb[2];
               String var13 = "没\uff00杀业寓出珎圪焗昅筯朚骑筓绮1x！";
               var10.setText("注：有一定几率地煞星符最高等级+1；");
               JLabel var9 = this.sb[3];
               String var11 = "霪\u000bD\nQ截勫Ｖ芑夋赑丷弅哷坄煤晫笜ぶ";
               var9.setText("非100%成功，若失败不影响地煞星符。");
               this.sb[2].setVisible(true);
               this.sb[3].setVisible(true);
            }

            var8 = this;
         }

         var8.h();
         this.ry.l();
      }
   }

   public void hy(boolean var1) {
      int var2;
      if (!var1) {
         for (int var10000 = var2 = 0; var10000 < this.sm.length; var10000 = var2) {
            com.xy.q.Class26 var7 = this.sm[var2];
            var2++;
            var7.gs(0, null);
         }
      }

      for (int var8 = var2 = 0; var8 < this.rx.length; var8 = var2) {
         this.rx[var2++].setVisible(var1);
      }

      for (int var9 = var2 = 0; var9 < this.sg.length; var9 = var2) {
         this.sg[var2++].setVisible(var1);
      }

      for (int var10 = var2 = 0; var10 < this.sm.length; var10 = var2) {
         this.sm[var2++].setVisible(var1);
      }

      for (int var11 = var2 = 0; var11 < this.sb.length; var11 = var2) {
         this.sb[var2++].setVisible(var1);
      }

      this.nk.setVisible(var1);
      this.ry.setVisible(var1);
      this.kp.setVisible(var1);
      this.hq.setVisible(var1);
   }

   // $VF: synthetic method
   static int mz(Class19 var0) {
      return var0.la;
   }

   public int id() {
      return this.la;
   }

   public void bi(int var1) {
      int var10000 = 0;
      this.ha = var1;

      for (int var2 = 0; var10000 < this.ly.length; var10000 = ++var2) {
         this.ly[var2].setKeep(var2 == this.ha);
      }

      this.cr(this.ha == 0);
      this.hy(this.ha == 1);
      if (this.ha == 0) {
         this.bb(null);
      } else {
         if (this.ha == 1) {
            this.lm(0);
         }
      }
   }

   public String na(String var1, String var2) {
      String var10001 = "'";
      String[] var3 = var1.split("=");
      return var3[0] + var2 + var3[1];
   }

   public void br(Goodstable var1) {
      if (this.ha == 0) {
         if (com.xy.v.Class12.x(this.sd, var1.getRgid())) {
            this.ay(null);
         }
      } else {
         if (this.ha == 1) {
            Goodstable var2;
            BigDecimal var10000;
            Goodstable var10001;
            if ((var2 = (Goodstable)this.sm[0].ep().jx()) != null) {
               var10000 = var2.getRgid();
               var10001 = var1;
            } else {
               var10000 = null;
               var10001 = var1;
            }

            if (com.xy.v.Class12.x(var10000, var10001.getRgid())) {
               this.sm[0].gs(0, null);
               this.h();
               return;
            }

            Goodstable var3;
            if ((var3 = (Goodstable)this.sm[1].ep().jx()) != null) {
               var10000 = var3.getRgid();
               var10001 = var1;
            } else {
               var10000 = null;
               var10001 = var1;
            }

            if (com.xy.v.Class12.x(var10000, var10001.getRgid())) {
               this.sm[1].gs(0, null);
               this.h();
               return;
            }
         }
      }
   }

   public void f() {
      if (this.sd != null) {
         Goodstable var1;
         if ((var1 = this.yx().getGood(this.sd)) == null) {
            this.ay(null);
            return;
         }

         if (var1.getRgid() != this.sd) {
            this.ay(var1);
         }
      }
   }

   public Class19(GameView var1) {
      super(95, 2, com.xy.q.Class30.afz, var1);
      this.la = -1;
      this.yy(-1, 0, 637, 443, com.xy.q.Class30.agh);
      com.xy.w.Class9 var56 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10003 = "坄煤晫";
      this.yu(var56, "地煞星");
      com.xy.v.Class32 var2 = new com.xy.v.Class32(6, 21, 0, 18);
      this.rx = new com.xy.i.Class7[4];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.rx.length; var10000 = var3) {
         String[] var16;
         if (var3 == 0) {
            var16 = new String[2];
            var10003 = "埣";
            var16[0] = "培";
            var10003 = "儏";
            var16[1] = "养";
         } else if (var3 == 1) {
            var16 = new String[2];
            var10003 = "卝";
            var16[0] = "升";
            var10003 = "结";
            var16[1] = "级";
         } else if (var3 == 2) {
            var16 = new String[2];
            var10003 = "釗";
            var16[0] = "重";
            var10003 = "浣";
            var16[1] = "洗";
         } else if (var3 == 3) {
            var16 = new String[2];
            var10003 = "炦";
            var16[0] = "炼";
            var10003 = "晫";
            var16[1] = "星";
         } else {
            var16 = null;
         }

         String[] var4 = var16;
         String var10009 = "i*5,5~+gj'}";
         this.rx[var3] = new com.xy.i.Class7("sc/e/71.png", 2, 3 + var3, com.xy.q.Class49.ck, null, var4, this);
         this.rx[var3].wp(var2);
         this.rx[var3].ne(com.xy.q.Class49.d);
         this.rx[var3].setBounds(60, 57 + 49 * var3, 30, 48);
         this.add(this.rx[var3++]);
      }

      this.sj = new MoneyType();
      String var10004 = "釫铅";
      this.sj.setIdAndKey(1, "金钱");
      this.sb = new JLabel[4];

      for (int var17 = var3 = 0; var17 < this.sb.length; var17 = var3) {
         int var10005 = 162 + 26 * var3;
         String var120 = "jyy*y*y*";
         this.sb[var3] = com.xy.q.Class1.f(123, var10005, 72, 19, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         this.add(this.sb[var3++]);
      }

      this.nk = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
      this.ry = com.xy.q.Class1.m(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w, null, var1);
      this.ry.n(2);
      String var10006 = "\u0007Y[^[\u000bC\u0014\u0004T\u0013";
      this.nk.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var111 = "i*5-5x-gj'}";
      this.ry.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ry);
      this.add(this.nk);
      this.sm = new com.xy.q.Class26[2];

      for (int var18 = var3 = 0; var18 < this.sm.length; var18 = var3) {
         this.sm[var3] = new com.xy.q.Class26(this, false);
         this.sm[var3].setBounds(151 + var3 * 87, 90, 59, 58);
         this.add(this.sm[var3++]);
      }

      com.xy.q.Class26 var113 = this.sm[0];
      String var10007 = "坄煤晫";
      var113.dq("地煞星");
      String var10008 = ":yf\u007ff-gj'}";
      String var10013 = "埃儏";
      this.hq = new com.xy.i.Class4("sc/e/7.png", 1, 115, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "培养", this);
      this.hq.setBounds(197, 218, 59, 25);
      this.add(this.hq);
      this.sg = new com.xy.w.Class18[4];

      String var10002;
      for (int var19 = var3 = 0; var19 < this.sg.length; var19 = var3) {
         this.sg[var3] = new com.xy.w.Class18();
         Class19 var20;
         if (var3 == 0) {
            var20 = this;
            com.xy.w.Class18 var60 = this.sg[var3];
            var10003 = "i*5-5x#gj'}";
            var60.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.sg[var3].setBounds(64, 282, 309, 105);
         } else if (var3 == 1) {
            var20 = this;
            this.sg[var3].setBounds(129 + (var3 - 1) * 107, 64, 18, 18);
            this.sg[var3].addMouseListener(new Class17(this));
         } else if (var3 == 2) {
            var20 = this;
            this.sg[var3].setBounds(129 + (var3 - 1) * 107, 64, 18, 18);
            this.sg[var3].addMouseListener(new Class32(this));
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var10001 = this.sg[var3];
               var10002 = "\u0007Y[^[\tG\u0014\u0004T\u0013";
               var10001.mt(com.xy.w.Class16.m("sc/d/33.png", 30, 30, 30, 30, false));
               this.sg[var3].setBounds(87, 58, 287, 196);
            }

            var20 = this;
         }

         var20.add(this.sg[var3++]);
      }

      this.kp = new com.xy.q.Class13(this, 6, 2, 51, 51, 0, 0, 65, 284);
      var10006 = "i*5-5x\"gj'}";
      this.kp.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.kp.ol(-1L);
      this.add(this.kp);
      this.sf = new com.xy.i.Class4[6];

      for (int var21 = var3 = 0; var21 < this.sf.length; var21 = var3) {
         com.xy.i.Class4[] var22 = this.sf;
         var10004 = "I\u0017\u0015\u0011\u0015B\u0014\u0004T\u0013";
         int var115 = 109 + var3;
         String var122;
         Class19 var10010;
         if (var3 == 2) {
            var122 = "蠬兟";
            var122 = "补充";
            var10010 = this;
         } else if (var3 == 3) {
            var122 = "刚阐";
            var122 = "删除";
            var10010 = this;
         } else if (var3 == 4) {
            var122 = "輥秡";
            var122 = "转移";
            var10010 = this;
         } else if (var3 == 5) {
            var122 = "司扬";
            var122 = "参战";
            var10010 = this;
         } else {
            var122 = "";
            var10010 = this;
         }

         com.xy.i.Class4 var63 = new com.xy.i.Class4("sc/e/6.png", 1, var115, com.xy.q.Class49.bz, null, var122, var10010);
         var22[var3] = var63;
         this.sf[var3].setBounds(170, 330, 34, 18);
         Class19 var23;
         if (var3 == 0) {
            var23 = this;
            com.xy.i.Class4 var64 = this.sf[var3];
            var10003 = ":yf\u007ff+gj'}";
            var64.setImage("sc/e/1.png");
            this.sf[var3].setBounds(111, 278, 18, 18);
         } else if (var3 == 1) {
            var23 = this;
            com.xy.i.Class4 var65 = this.sf[var3];
            var10003 = "I\u0017\u0015\u0011\u0015F\u0014\u0004T\u0013";
            var65.setImage("sc/e/2.png");
            this.sf[var3].setBounds(134, 278, 18, 18);
         } else if (var3 != 3 && var3 != 4) {
            if (var3 == 5) {
               this.sf[var3].setForeground(Color.black);
               this.sf[var3].setFont(com.xy.q.Class49.ch);
               com.xy.i.Class4 var40 = this.sf[var3];
               var10002 = ":yf\u007ff-gj'}";
               var40.setImage("sc/e/7.png");
               this.sf[var3].setBounds(104, 356, 59, 25);
            }

            var23 = this;
         } else {
            var23 = this;
            this.sf[var3].setBounds(300, 339 + 21 * (var3 - 3), 34, 18);
         }

         var23.add(this.sf[var3++]);
      }

      this.rw = new com.xy.q.Class14[2];

      for (int var24 = var3 = 0; var24 < this.rw.length; var24 = var3) {
         this.rw[var3] = com.xy.q.Class1.i(95, 304 + 25 * var3, 109, 19, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var68 = this.rw[var3];
         var10003 = "\u0007Y[^[\u000bC\u0014\u0004T\u0013";
         var68.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.rw[var3++]);
      }

      this.ew = new JLabel[5];

      for (int var25 = var3 = 0; var25 < this.ew.length; var25 = ++var3) {
         int var108 = 304 + 25 * var3;
         var10008 = "jyy*y*y*";
         this.ew[var3] = com.xy.q.Class1.f(58, var108, 36, 19, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var26 = this.ew[var3];
         String var42;
         if (var3 == 0) {
            var42 = "祤勯";
            var42 = "神力";
         } else if (var3 == 1) {
            var42 = "扑劁";
            var42 = "战力";
         } else if (var3 == 2) {
            var42 = "孜且亞洵";
            var42 = "学习交流";
         } else if (var3 == 3) {
            var42 = "\"";
            var42 = "8";
         } else if (var3 == 4) {
            var42 = "[\u000bL";
            var42 = "/18";
         } else {
            var42 = "";
         }

         var26.setText(var42);
         this.add(this.ew[var3]);
         if (var3 == 2) {
            this.ew[var3].setFont(com.xy.q.Class49.bx);
            this.ew[var3].setHorizontalAlignment(10);
            this.ew[var3].setBounds(232, 55, 120, 23);
            JLabel var27 = this.ew[var3];
            var42 = "9*\\\u000f\\\u000f\\y*";
            var27.setForeground(com.xy.q.Class49.c("#cFFFFF00"));
         } else if (var3 == 3) {
            this.ew[var3].setFont(com.xy.q.Class49.bb);
            this.ew[var3].setBounds(262, 80, 54, 33);
            JLabel var28 = this.ew[var3];
            var42 = "\u0019\u0017|2|2|2";
            var28.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
         } else if (var3 == 4) {
            this.ew[var3].setFont(com.xy.q.Class49.n);
            this.ew[var3].setHorizontalAlignment(10);
            this.ew[var3].setBounds(316, 96, 54, 13);
            JLabel var29 = this.ew[var3];
            var42 = "jyp#p#p#";
            var29.setForeground(com.xy.q.Class49.c("#c999999"));
         }
      }

      this.se = new RichLabel[4];

      for (int var30 = var3 = 0; var30 < this.se.length; var30 = var3) {
         this.se[var3] = new RichLabel(null, com.xy.q.Class49.n);
         Class19 var31;
         if (var3 == 0) {
            var31 = this;
            this.se[var3].setBounds(216, 91, this.se[var3].getWidth(), this.se[var3].getHeight());
         } else if (var3 == 1) {
            var31 = this;
            this.se[var3].setBounds(216, 126, this.se[var3].getWidth(), this.se[var3].getHeight());
         } else if (var3 == 2) {
            var31 = this;
            this.se[var3].setBounds(216, 192, this.se[var3].getWidth(), this.se[var3].getHeight());
         } else {
            if (var3 == 3) {
               this.se[var3].setBounds(216, 311, this.se[var3].getWidth(), this.se[var3].getHeight());
            }

            var31 = this;
         }

         var31.add(this.se[var3++]);
      }

      RichLabel var71 = this.se[0];
      var10003 = "\u0019\u0017|2|2|2〪笽纝づ";
      var71.setTextSize("#cFFFFFF【等级】", 180);
      this.sk = new com.xy.w.Class18[9];

      for (int var32 = var3 = 0; var32 < this.sk.length; var32 = ++var3) {
         this.sk[var3] = new com.xy.w.Class18();
         this.add(this.sk[var3]);
         if (var3 == 0) {
            com.xy.w.Class18 var50 = this.sk[var3];
            var10002 = "i*5-5\u007f+gj'}";
            var50.dp("sc/d/61.png");
            this.sk[var3].setBounds(51, 51, 160, 221);
         } else if (var3 == 1) {
            this.sk[var3].setBounds(51, 53, 160, 220);
         } else if (var3 == 2) {
            com.xy.w.Class18 var51 = this.sk[var3];
            var10002 = "\u0007Y[^[\tG\u0014\u0004T\u0013";
            var51.mt(com.xy.w.Class16.m("sc/d/33.png", 30, 30, 30, 30, false));
            this.sk[var3].setBounds(51, 270, 162, 117);
         } else if (var3 == 3) {
            com.xy.w.Class18 var52 = this.sk[var3];
            var10002 = "i*5-5z.gj'}";
            var52.dp("sc/d/34.png");
            this.sk[var3].setBounds(212, 55, 143, 23);
         } else if (var3 == 4) {
            this.sk[var3].setBounds(253, 340, 39, 39);
         } else if (var3 == 5) {
            com.xy.w.Class18 var53 = this.sk[var3];
            var10002 = "\u0007Y[^[\u000fE\u0014\u0004T\u0013";
            var53.dp("sc/d/51.png");
            this.sk[var3].setBounds(250, 337, 45, 45);
         } else if (var3 >= 6 && var3 <= 8) {
            com.xy.w.Class18 var54 = this.sk[var3];
            var10002 = "i*5-5\u007f,gj'}";
            var54.mt(com.xy.w.Class16.m("sc/d/66.png", 30, 1, 30, 1, false));
            if (var3 == 6) {
               this.sk[var3].setBounds(212, 118, 185, 2);
            } else if (var3 == 7) {
               this.sk[var3].setBounds(212, 188, 185, 2);
            } else if (var3 == 8) {
               this.sk[var3].setBounds(212, 307, 185, 2);
            }
         }
      }

      this.ly = new com.xy.i.Class4[2];

      for (int var33 = var3 = 0; var33 < this.ly.length; var33 = var3) {
         com.xy.i.Class4[] var34 = this.ly;
         var10004 = "\u0007Y[_[\tM\u0014\u0004T\u0013";
         int var116 = 103 + var3;
         String var127;
         Class19 var134;
         if (var3 == 0) {
            var127 = "尗怽";
            var127 = "属性";
            var134 = this;
         } else if (var3 == 1) {
            var127 = "釷钌";
            var127 = "重铸";
            var134 = this;
         } else {
            var127 = "";
            var134 = this;
         }

         com.xy.i.Class4 var77 = new com.xy.i.Class4("sc/e/39.png", 2, var116, com.xy.q.Class49.ck, null, var127, var134);
         var34[var3] = var77;
         this.ly[var3].setOffsetTexts(com.xy.q.Class49.bo);
         this.ly[var3].setBounds(58 + 65 * var3, 20, 63, 24);
         this.add(this.ly[var3++]);
      }

      this.rz = new com.xy.i.Class4[4];

      for (int var35 = var3 = 0; var35 < this.rz.length; var35 = var3) {
         com.xy.i.Class4[] var36 = this.rz;
         var10004 = ":yf\u007ff-gj'}";
         int var117 = 105 + var3;
         String var130;
         Class19 var135;
         if (var3 == 0) {
            var130 = "八挖";
            var130 = "兑换";
            var135 = this;
         } else if (var3 == 1) {
            var130 = "圪焗昅禹谉";
            var130 = "地煞星称谓";
            var135 = this;
         } else if (var3 == 2) {
            var130 = "召冎";
            var130 = "取出";
            var135 = this;
         } else if (var3 == 3) {
            var130 = "鬋彈";
            var130 = "魂归";
            var135 = this;
         } else {
            var130 = "";
            var135 = this;
         }

         com.xy.i.Class4 var79 = new com.xy.i.Class4("sc/e/7.png", 1, var117, com.xy.q.Class49.ch, null, var130, var135);
         var36[var3] = var79;
         this.rz[var3].setBounds(432 + (var3 - 2) * 82, 371, 59, 25);
         Class19 var37;
         if (var3 == 0) {
            var37 = this;
            this.rz[var3].setFont(com.xy.q.Class49.bz);
            com.xy.i.Class4 var80 = this.rz[var3];
            var10003 = "I\u0017\u0015\u0011\u0015B\u0014\u0004T\u0013";
            var80.setImage("sc/e/6.png");
            this.rz[var3].setBounds(364, 27, 34, 18);
         } else if (var3 == 1) {
            var37 = this;
            this.rz[var3].setFont(com.xy.q.Class49.bz);
            com.xy.i.Class4 var81 = this.rz[var3];
            var10003 = "i*5,5\u007f#gj'}";
            var81.setImage("sc/e/69.png");
            this.rz[var3].setBounds(517, 28, 85, 18);
         } else {
            if (var3 == 2 || var3 == 3) {
               this.rz[var3].setForeground(Color.black);
            }

            var37 = this;
         }

         var37.add(this.rz[var3++]);
      }

      String var10011 = "\u0019\u0017\nD\nD\nD";
      this.sa = com.xy.q.Class1.f(260, 26, 36, 19, 10, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
      var111 = "晖芈";
      this.sa.setText("星芒");
      this.add(this.sa);
      this.on = new MoneyType();
      String var10012 = "春苦";
      this.on.setIdAndKey(0, "星芒");
      this.si = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, this.on, var1);
      this.si.n(2);
      var10007 = "i*5-5x-gj'}";
      this.si.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.si.setBounds(295, 26, 104, 19);
      this.add(this.si);
      this.sh = new com.xy.w.Class18[4];

      for (int var38 = var3 = 0; var38 < this.sh.length; var38 = var3) {
         this.sh[var3] = new com.xy.w.Class18();
         Class19 var39;
         if (var3 == 0) {
            var39 = this;
            com.xy.w.Class18 var83 = this.sh[var3];
            var10003 = "\u0007Y[^[\b@\u0014\u0004T\u0013";
            var83.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.sh[var3].setBounds(402, 354, 205, 58);
         } else if (var3 == 1) {
            var39 = this;
            com.xy.w.Class18 var84 = this.sh[var3];
            var10003 = "i*5-5x#gj'}";
            var84.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.sh[var3].setBounds(401, 46, 207, 309);
         } else if (var3 == 2) {
            var39 = this;
            com.xy.w.Class18 var85 = this.sh[var3];
            var10003 = "\u0007Y[^[\r@\u0014\u0004T\u0013";
            var85.mt(com.xy.w.Class16.m("sc/d/74.png", 16, 16, 16, 16, false));
            this.sh[var3].setBounds(45, 44, 358, 368);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var55 = this.sh[var3];
               var10002 = "i*5-5{.gj'}";
               var55.mt(com.xy.w.Class16.m("sc/d/24.png", 290, 290, 2, 2, false));
               this.sh[var3].setBounds(48, 47, 352, 362);
            }

            var39 = this;
         }

         var39.add(this.sh[var3++]);
      }

      this.sl = new com.xy.q.Class58(this, 4, 6, 51, 51, 0, 0, 402, 48);
      var10003 = "\u0007Y[^[\u000bL\u0014\u0004T\u0013";
      this.sl.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.add(this.sl);
   }

   public void cr(boolean var1) {
      if (!var1) {
         this.sd = null;
      }

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.sf.length; var10000 = var2) {
         this.sf[var2++].setVisible(var1);
      }

      for (int var7 = var2 = 0; var7 < this.rw.length; var7 = var2) {
         this.rw[var2++].setVisible(var1);
      }

      for (int var8 = var2 = 0; var8 < this.ew.length; var8 = var2) {
         this.ew[var2++].setVisible(var1);
      }

      for (int var9 = var2 = 0; var9 < this.se.length; var9 = var2) {
         this.se[var2++].setVisible(var1);
      }

      for (int var10 = var2 = 0; var10 < this.sk.length; var10 = var2) {
         this.sk[var2++].setVisible(var1);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.afx.dh()) {
         this.f();
      }

      super.paintComponent(var1);
   }

   public BigDecimal em() {
      Goodstable var1;
      return (var1 = (Goodstable)this.sm[0].ep().jx()) != null ? var1.getRgid() : null;
   }

   public void ay(Goodstable var1) {
      int var10000 = 0;
      this.sd = null;
      this.rw[0].setText(null);
      this.rw[1].setText(null);
      this.ew[2].setText(null);
      this.ew[3].setText(null);
      this.ew[4].setText(null);
      this.sf[3].setVisible(false);
      this.sf[4].setVisible(false);
      com.xy.i.Class4 var10001 = this.sf[5];
      String var10002 = "变i戂";
      var10001.setText("参 战");

      for (int var2 = 0; var10000 < this.se.length; var10000 = var2) {
         this.se[var2++].setVisible(false);
      }

      this.sk[1].l();
      this.sk[4].l();
      this.sk[4].setVisible(false);
      this.sk[5].setVisible(false);
      if (var1 != null && var1.getType() == 520L) {
         this.sd = var1.getRgid();
         com.xy.i.Class4 var20 = this.sf[5];
         String var30;
         if (var1.getStatus() == 1) {
            String var29 = "忱\u001a李";
            var30 = "待 机";
         } else {
            String var31 = "变i戂";
            var30 = "参 战";
         }

         var20.setText(var30);
         this.sk[1].dp(com.xy.w.Class15.l(var1.getSkin()));
         String var10009 = var1.getValue();
         String var10010 = "f\b";
         String[] var18;
         String[] var72 = var18 = var10009.split("\\|");
         String var10013 = var72[0];
         String var10014 = "5";
         int var3 = var10013.indexOf("/");
         int var4 = Integer.parseInt(var72[0].substring(3, var3));
         int var5 = Integer.parseInt(var72[0].substring(var3 + 1));
         int var6 = Integer.parseInt(var72[1].substring(3));
         var10009 = var72[2];
         var10010 = "I";
         int var7 = Integer.parseInt(var10009.split("=")[1]);
         this.rw[0].setForeground(Color.white);
         com.xy.q.Class14 var10007 = this.rw[0];
         StringBuilder var10008 = new StringBuilder(String.valueOf(var6));
         var10009 = "5";
         var10007.setText(var10008.append("/").append(var4 * 200).toString());
         this.rw[1].setText(String.valueOf(var7));
         this.se[0].setVisible(true);
         this.ew[2].setText(var1.getGoodsname());
         this.ew[3].setText(String.valueOf(var4));
         JLabel var42 = this.ew[4];
         String var10005 = "[";
         var42.setText("/" + var5);
         String var10003 = var18[3];
         String var10004 = "<";
         String[] var8 = var10003.split("&");
         var10002 = var18[4];
         var10003 = "R";
         String[] var9 = var10002.split("&");
         RichLabel var32 = this.se[1];
         var10004 = "jMす祄道》i赞赡\uff00";
         StringBuilder var44 = new StringBuilder("#W【神通】 资质：");
         var10003 = var8[1];
         var10004 = "I";
         StringBuilder var45 = var44.append(var10003.split("=")[1]);
         var10003 = "f+y*jhj]";
         StringBuilder var46 = var45.append("/100#r#G");
         var10004 = var8[2];
         var10005 = "_";
         StringBuilder var47 = var46.append(this.na(var10004, "+"));
         var10003 = "jh";
         StringBuilder var48 = var47.append("#r");
         var10004 = var8[3];
         var10005 = "_";
         var32.setTextSize(var48.append(this.na(var10004, "+")).toString(), 180);
         this.se[1].setVisible(true);
         StringBuffer var10;
         StringBuffer var21 = var10 = new StringBuffer();
         String var33 = "jMす于蠅》";
         var21.append("#W【五行】");
         int var11 = 1;

         for (int var22 = var11; var22 < var9.length; var22 = var11) {
            var10003 = "\u0019\u0006\u0019-";
            StringBuilder var34 = new StringBuilder("#r#Y");
            var10003 = var9[var11];
            var10004 = ":";
            var10002 = this.na(var10003, " ");
            var11++;
            var10.append(var34.append(var10002).toString());
         }

         boolean var19 = false;
         double var12 = 0.0;

         int var14;
         for (int var23 = var14 = 0; var23 < var8.length; var23 = ++var14) {
            String var24 = var8[var14];
            String var35 = "春陁層恓";
            if (var24.startsWith("星阵属性")) {
               String var25 = var8[var14];
               String var36 = "'";
               String[] var15 = var25.split("=");

               int var16;
               for (int var26 = var16 = 1; var26 < var9.length; var26 = var16) {
                  String var27 = var9[var16];
                  String var37 = "I";
                  String[] var17 = var27.split("=");
                  String var38 = var15[2];
                  var10002 = var17[0];
                  var10003 = var17[1];
                  var16++;
                  var12 += MsgUntil.i(var38, var10002, var10003);
               }

               var10003 = "9;9*.z_}^{于蠅劺扙昅陼乑勒:";
               StringBuilder var39 = new StringBuilder("#r#c43E4D2五行加成星阵之力 ");
               var10002 = "\u001fZ\u000b\u0012";
               StringBuilder var40 = var39.append(String.format("%.1f", var12));
               var10002 = "?";
               var10.append(var40.append("%").toString());
               this.sk[4].gt(com.xy.w.Class16.c("sc/skill/" + var15[1] + ".png"));
               this.sk[4].setVisible(true);
               this.sk[5].setVisible(true);
               RichLabel var70 = this.se[3];
               String var71 = "Wmつ春陁乱勯〫T";
               var70.setTextSize("#W【星阵之力】 " + var15[1], 180);
               this.se[3].setVisible(true);
               this.sf[3].setVisible(true);
               this.sf[4].setVisible(true);
               var19 = true;
            }
         }

         if (!var19) {
            String var41 = "jhjC斩昅陼６仝衖曋丗畖敒";
            var10.append("#r#Y无星阵，五行暂不生效");
            RichLabel var53 = this.se[3];
            var10003 = "\u0019#〪晫阏丿务づ\u001a斔";
            var53.setTextSize("#W【星阵之力】 无", 180);
            this.se[3].setVisible(true);
         }

         this.se[2].setTextSize(var10.toString(), 180);
         this.se[2].setVisible(true);
      }
   }

   public int dx() {
      return this.sc;
   }

   public static boolean nb(String var0) {
      String var10001 = "朋隴";
      if (!var0.equals("朱雀")) {
         var10001 = "珍歼";
         if (!var0.equals("玄武")) {
            var10001 = "癇蘺";
            if (!var0.equals("白虎")) {
               var10001 = "霛龃";
               if (!var0.equals("青龙")) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public void bb(Goodstable var1) {
      if (this.ha == 0) {
         this.ay(var1);
      } else {
         if (this.ha == 1) {
            this.sm[var1.getType() == 520L ? 0 : 1].gs(1, var1);
            this.h();
         }
      }
   }

   @Override
   public void l() {
      this.bi(0);
      super.l();
   }

   public void y(int var1) {
      if (var1 == 115) {
         this.dh();
      } else if (var1 == 111 || !this.afx.ah()) {
         RoleData var2 = this.yx();
         Goodstable var3 = this.sd != null ? var2.getGood(this.sd) : null;
         if (var3 == null) {
            String var29 = "词遽拓宍庮盰春匕";
            this.afx._do("请选择对应的星卡");
         } else if (var1 == 107) {
            GameView var18 = this.afx;
            String var30 = var3.getRgid().toString();
            String var31 = "睖皞览双决诿晖卻呞%";
            var18.dm(new ConfirmBean(2, var30, "真的要取出该星卡吗?"));
         } else if (var1 == 111) {
            ((com.xy.a.Class6)this.zc().j(27)).br(var3);
         } else if (var1 == 112) {
            GameView var17 = this.afx;
            String var10004 = var3.getRgid().toString();
            String var10005 = "眥盰覻剔陞讑春匕皾晫阏呣Ｅ剔陞呺丷厛恘她";
            var17.dm(new ConfirmBean(20, var10004, "真的要删除该星卡的星阵吗？删除后不可恢复"));
         } else if (var1 != 113) {
            if (var1 == 114) {
               String var13 = var3.getValue();
               String var23 = "f\b";
               var13 = var13.split("\\|")[2];
               var23 = "'";
               if (Integer.parseInt(var13.split("=")[1]) <= 0) {
                  var23 = "戢勯丷跇旚没司扬";
                  this.afx._do("战力不足无法参战");
                  return;
               }

               Class19 var15;
               if (var3.getStatus() == 1) {
                  var2.ag(var3.getRgid());
                  var3.setStatus(4);
                  var2.aq(var3);
                  var15 = this;
                  ParamTool.j(var3, 0, this.za());
               } else {
                  Goodstable var8;
                  if ((var8 = var2.getEquipGood(13)) != null) {
                     var2.ag(var8.getRgid());
                     var8.setStatus(4);
                     var2.aq(var8);
                     ParamTool.j(var8, 0, this.za());
                  }

                  var2.ag(var3.getRgid());
                  var3.setStatus(1);
                  var2.aq(var3);
                  var15 = this;
                  ParamTool.j(var3, 0, this.za());
               }

               com.xy.i.Class4 var16 = var15.sf[5];
               if (var3.getStatus() == 1) {
                  var23 = "徟i朠";
                  var23 = "待 机";
               } else {
                  var23 = "厶\u001a扬";
                  var23 = "参 战";
               }

               var16.setText(var23);
            }
         } else {
            String var10000 = var3.getValue();
            String var10001 = "\u0015f";
            var10000 = var10000.split("\\|")[3];
            var10001 = "R";
            String[] var5 = var10000.split("&");

            int var6;
            for (int var10 = var6 = 0; var10 < var5.length; var10 = ++var6) {
               var10000 = var5[var6];
               var10001 = "晖阯尗怽";
               if (var10000.startsWith("星阵属性")) {
                  var10000 = var5[var6];
                  var10001 = "I";
                  String[] var7;
                  if (!nb((var7 = var10000.split("="))[1])) {
                     var10001 = "丗晦囁礗內晖阯斩泏輥秡";
                     this.afx._do("不是四神兽星阵无法转移");
                     return;
                  }

                  ((Class43)this.zc().j(97)).aeh(0, var7, var3);
                  return;
               }
            }
         }
      }
   }

   public void h() {
      if (this.ha == 1) {
         if (this.sc == 0 || this.sc == 1 || this.sc == 3) {
            RoleData var1 = this.yx();
            Goodstable var2 = (Goodstable)this.sm[0].ep().jx();
            Goodstable var3 = (Goodstable)this.sm[1].ep().jx();
            if (var2 != null) {
               var2 = var1.getGood(var2.getRgid());
            }

            if (var3 != null) {
               var3 = var1.getGood(var3.getRgid());
            }

            if (var2 == null) {
               if (this.sc == 0) {
                  this.ry.setText(null);
               } else if (this.sc == 1) {
                  this.nk.setText(null);
               } else {
                  if (this.sc == 3) {
                     this.nk.setText(null);
                  }
               }
            } else {
               String var10000 = var2.getValue();
               String var10001 = "\u0015f";
               String[] var4;
               var10000 = (var4 = var10000.split("\\|"))[0];
               var10001 = "I";
               var10000 = var10000.split("=")[1];
               var10001 = "5";
               String[] var5 = var10000.split("/");
               int var6 = Integer.parseInt(var5[0]);
               if (this.sc == 0) {
                  if (var6 >= 14) {
                     this.ry.setText(null);
                  } else {
                     var10000 = var4[1];
                     var10001 = "I";
                     int var9 = Integer.parseInt(var10000.split("=")[1]);
                     com.xy.q.Class52 var15 = this.ry;
                     StringBuilder var22 = new StringBuilder(String.valueOf(var9));
                     String var24 = "5";
                     var15.setText(var22.append("/").append(var6 * 200).toString());
                  }
               } else if (this.sc == 1) {
                  if (this.za().l(2, 12)) {
                     com.xy.q.Class49.b(this.nk, 500000L + var6 * 500000L);
                  } else {
                     com.xy.q.Class49.b(this.nk, var6 * 20000000L);
                  }
               } else {
                  if (this.sc == 3) {
                     int var7;
                     if ((var7 = Integer.parseInt(var5[1])) >= 14) {
                        this.nk.setForeground(Color.white);
                        var10001 = "D\u0015D";
                        this.nk.setText("0/0");
                        return;
                     }

                     if (var3 == null) {
                        this.nk.setText(null);
                        return;
                     }

                     int var8;
                     if ((var8 = var7 / 2 + 2) < var3.getUsetime()) {
                        this.nk.setForeground(Color.white);
                        com.xy.q.Class14 var13 = this.nk;
                        StringBuilder var19 = new StringBuilder(String.valueOf(var8));
                        String var23 = "5";
                        var13.setText(var19.append("/").append(var3.getUsetime()).toString());
                        return;
                     }

                     this.nk.setForeground(Color.red);
                     com.xy.q.Class14 var12 = this.nk;
                     StringBuilder var18 = new StringBuilder(String.valueOf(var8));
                     String var10002 = "[";
                     var12.setText(var18.append("/").append(var3.getUsetime()).toString());
                  }
               }
            }
         }
      }
   }

   public boolean dh() {
      RoleData var1 = this.yx();
      Goodstable var2 = (Goodstable)this.sm[0].ep().jx();
      Goodstable var3 = (Goodstable)this.sm[1].ep().jx();
      if (var2 != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = var1.getGood(var3.getRgid());
      }

      if (var2 == null) {
         String var51 = "语遀拳览埣儲皞晖卻";
         this.afx._do("请选择要培养的星卡");
         return false;
      } else if (var3 == null) {
         String var50 = "讃逳抝杪旭";
         this.afx._do("请选择材料");
         return false;
      } else {
         String var10000 = var2.getValue();
         String var10001 = "\u0015f";
         String[] var15 = var10000.split("\\|");
         var10001 = var15[0];
         String var10002 = "I";
         var10001 = var10001.split("=")[1];
         var10002 = "5";
         String[] var20 = var10001.split("/");
         int var6 = Integer.parseInt(var20[0]);
         int var7 = Integer.parseInt(var20[1]);
         var10000 = var15[1];
         var10001 = "I";
         int var8 = Integer.parseInt(var10000.split("=")[1]);
         int var9 = 1;
         byte var10 = 0;
         if (this.sc == 0) {
            if (var6 >= 14) {
               var10002 = "笀纽嶻绕拼辤乃陊";
               this.afx._do("等级已经抵达上限");
               return false;
            }

            if (var3.getType() != 522L) {
               var10002 = "爝哻乹昕覶春凸";
               this.afx._do("物品不是观星册");
               return false;
            }

            if (var3.getUsetime() < var9) {
               var10002 = "觘晖冖改釕乄趩";
               this.afx._do("观星册数量不足");
               return false;
            }

            if (var8 >= var6 * 200) {
               var10002 = "礪务嶆绵拁辄乾陪ｸ旚没埃儏";
               this.afx._do("神力已经抵达上限，无法培养");
               return false;
            }

            if (Long.parseLong(this.nk.getText().replace(",", "")) > var1.getLoginResult().getGold().longValue()) {
               var10002 = "夽讔帛乄趩";
               this.afx._do("大话币不足");
               return false;
            }

            var10 = 51;
         } else if (this.sc == 1) {
            if (var8 < var6 * 200) {
               var10002 = "礪务法朳拁辄乾陪ｸ旚没卽结";
               this.afx._do("神力没有抵达上限，无法升级");
               return false;
            }

            if (var6 >= var7) {
               var10002 = "筓绮巨纆抯迷筓绮丐阙6斩泏纮绷匎纽";
               this.afx._do("等级已经抵达等级上限,无法继续升级");
               return false;
            }

            if (var3.getType() != 500L) {
               var10002 = "牓咵丷晛矅瞇";
               this.afx._do("物品不是矿石");
               return false;
            }

            var10000 = var3.getValue();
            var10001 = "'";
            int var11 = Integer.parseInt(var10000.split("=")[1]);
            if (this.afx.getClient().l(2, 12)) {
               if (var6 == 1 && var11 != 6) {
                  var10002 = "\u000b结春匕佅畜卹帀寨钵卽结";
                  this.afx._do("1级星卡使用千年寒铁升级");
                  return false;
               }

               if (var6 >= 2 && var6 <= 3 && var11 != 7) {
                  var10002 = "{6z纽晖卻伶甲奠夌颗矩匎纽";
                  this.afx._do("2,3级星卡使用天外飞石升级");
                  return false;
               }

               if (var6 >= 4 && var6 <= 5 && var11 != 8) {
                  var10002 = "\u000eY\f结春匕佅畜盢厐粄钵卽结";
                  this.afx._do("4-6级星卡使用盘古精铁升级");
                  return false;
               }

               if (var6 >= 7 && var6 <= 9 && var11 != 9) {
                  var10002 = "~7p纽晖卻伶甲蠬夳礗矩匎纽";
                  this.afx._do("7-9级星卡使用补天神石升级");
                  return false;
               }

               if (var6 >= 10 && var6 <= 13 && var11 != 10) {
                  var10002 = "\u000bD\u0017E\t结春匕佅畜兗鬶乱珽卽结";
                  this.afx._do("10-13级星卡使用六魂之玉升级");
                  return false;
               }

               if (var6 >= 14 && var11 != 11) {
                  var10002 = "伶甲斩釕瑀璙匎纽";
                  this.afx._do("使用无量琉璃升级");
                  return false;
               }
            } else if (var11 != 11) {
               var10002 = "矅瞇丷晛旚醻琳瓷";
               this.afx._do("矿石不是无量琉璃");
               return false;
            }

            if (var3.getUsetime() < var9) {
               var10002 = "瞶矩改釕乄趩";
               this.afx._do("矿石数量不足");
               return false;
            }

            if (Long.parseLong(this.nk.getText().replace(",", "")) > var1.getLoginResult().getGold().longValue()) {
               var10002 = "奓诧幵丷跇";
               this.afx._do("大话币不足");
               return false;
            }

            var10 = 52;
         } else if (this.sc == 2) {
            if (this.la == 0) {
               if (var3.getType() != 524L) {
                  var10002 = "牳咈丗晦测奠矩";
                  this.afx._do("物品不是浑天石");
                  return false;
               }

               if (var3.getUsetime() < var9) {
                  var10002 = "津夓瞇敊醻丷跇";
                  this.afx._do("浑天石数量不足");
                  return false;
               }

               if (Long.parseLong(this.nk.getText().replace(",", "")) > var1.getLoginResult().getGold().longValue()) {
                  var10002 = "夽讔帛乄趩";
                  this.afx._do("大话币不足");
                  return false;
               }

               var10 = 53;
            } else if (this.la == 1) {
               if (var3.getType() != 523L) {
                  var10002 = "爝哻乹昕晧豛筒";
                  this.afx._do("物品不是易象符");
                  return false;
               }

               if (var3.getUsetime() < var9) {
                  var10002 = "昉谨笼改釕乄趩";
                  this.afx._do("易象符数量不足");
                  return false;
               }

               if (Long.parseLong(this.nk.getText().replace(",", "")) > var1.getLoginResult().getGold().longValue()) {
                  var10002 = "奓诧幵丷跇";
                  this.afx._do("大话币不足");
                  return false;
               }

               var10 = 54;
            }
         } else if (this.sc == 3) {
            if (var7 >= 14) {
               var10002 = "嶻绕匎刪杉夽笀纽";
               this.afx._do("已经升到最大等级");
               return false;
            }

            if (var3.getType() != 521L) {
               var10002 = "爝哻乹昕烈春瞇";
               this.afx._do("物品不是炼星石");
               return false;
            }

            var9 = var7 / 2 + 2;
            if (var3.getUsetime() < var9) {
               var10002 = "炦晖矩改釕乄趩";
               this.afx._do("炼星石数量不足");
               return false;
            }

            var10 = 55;
         }

         SuitOperBean var14;
         (var14 = new SuitOperBean()).setType(var10);
         ArrayList var12;
         (var12 = new ArrayList()).add(var2.getRgid());
         var12.add(var3.getRgid());
         var14.setGoods(var12);
         var3.n(var9);
         if (var3.getUsetime() <= 0) {
            var1.ag(var3.getRgid());
            this.br(var3);
         }

         String var13 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var14));
         this.za().k(var13);
         return true;
      }
   }

   public void g(int var1) {
      if (this.ha == 1 && this.sc == 2) {
         if (this.la != var1) {
            com.xy.w.Class18 var10000 = this.sg[1];
            String var9;
            if (var1 == 0) {
               var9 = "i*5,5\u007f-gj'}";
               var9 = "sc/e/67.png";
            } else {
               var9 = "\u0007Y[_[\fL\u0014\u0004T\u0013";
               var9 = "sc/e/68.png";
            }

            var10000.dp(var9);
            var10000 = this.sg[2];
            if (var1 == 1) {
               var9 = "i*5,5\u007f-gj'}";
               var9 = "sc/e/67.png";
            } else {
               var9 = "\u0007Y[_[\fL\u0014\u0004T\u0013";
               var9 = "sc/e/68.png";
            }

            var10000.dp(var9);
         }

         this.la = var1;

         int var2;
         for (int var4 = var2 = 0; var4 < this.sm.length; var4 = var2) {
            com.xy.q.Class26 var5 = this.sm[var2];
            var2++;
            var5.gs(0, null);
         }

         Class19 var6;
         if (this.la == 0) {
            this.kp.ol(524L);
            var6 = this;
            String var10003 = "醄洍";
            this.hq.setText("重洗");
            com.xy.q.Class26 var14 = this.sm[1];
            String var10002 = "津夓瞇";
            var14.dq("浑天石");
         } else {
            this.kp.ol(523L);
            var6 = this;
            String var19 = "醄洍";
            this.hq.setText("重洗");
            com.xy.q.Class26 var15 = this.sm[1];
            String var17 = "晧豛筒";
            var15.dq("易象符");
         }

         var6.sg[1].setVisible(true);
         this.sg[2].setVisible(true);
         if (this.za().l(2, 12)) {
            com.xy.q.Class49.b(this.nk, 100000L);
            var6 = this;
         } else {
            com.xy.q.Class49.b(this.nk, this.la == 0 ? 1000000L : 5000000L);
            var6 = this;
         }

         JLabel var8 = var6.sb[0];
         String var16 = "淁耍醘钫";
         var8.setText("消耗金钱");
         JLabel var10013 = this.sb[1];
         String var10014 = "彩刹釫铅";
         var10013.setText("当前金钱");
         this.ry.alj(this.sj);
         this.nk.setBounds(200, 162, 114, 19);
         this.ry.setBounds(200, 188, 114, 19);
         this.sb[0].setVisible(true);
         this.sb[1].setVisible(true);
         this.ry.setVisible(true);
         this.sb[2].setFont(com.xy.q.Class49.k);
         this.sb[3].setFont(com.xy.q.Class49.k);
         this.sb[2].setBounds(145, 64, 72, 18);
         this.sb[3].setBounds(252, 64, 72, 18);
         JLabel var20 = this.sb[2];
         String var10004 = "醄洍礗退";
         var20.setText("重洗神通");
         JLabel var18 = this.sb[3];
         String var21 = "釷浣亮蠸";
         var18.setText("重洗五行");
         this.sb[2].setVisible(true);
         this.sb[3].setVisible(true);
      }
   }
}
