package com.xy;

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
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class95 extends Class345 {
   private Class574[] xv;
   private MoneyType xw;
   private Class556 xx;
   private Class436[] gl;
   private int xy;
   private Class436[] xz;
   private Class226[] ya;
   private Class643[] yb;
   private Class436[] yc;
   private Class643[] yd;
   private BigDecimal ye;
   private JLabel[] fx;
   private Class643 yf;
   private int do;
   private Class245[] yg;
   private Class643[] yh;
   private JLabel[] fb;
   private Class68 yi;
   private int gw;
   private RichLabel[] yj;
   private Class556 yk;
   private JLabel d;
   private Class245 yl;
   private Class357 ym;
   private MoneyType yn;

   public void do(int var1) {
      if (this.xy == (4 ^ 5)) {
         this.do = var1;

         int var10000;
         for(var10000 = var1 = 5 >> 3; var10000 < this.ya.length; var10000 = var1) {
            this.ya[var1].gb((boolean)(var1 == this.do ? 4 ^ 5 : 0));
            ++var1;
         }

         for(var10000 = var1 = 3 ^ 3; var10000 < this.xv.length; var10000 = var1) {
            Class574 var2 = this.xv[var1];
            ++var1;
            var2.c(3 >> 2, (Object)null);
         }

         Class436 var10001 = this.xz[5 >> 2];
         int var10003 = 2 & 5;
         var10000 = 2 & 5;
         var10001.setVisible((boolean)var10003);
         this.xz[1 ^ 3].setVisible((boolean)(3 ^ 3));

         for(var1 = var10003; var10000 < this.fx.length; var10000 = var1) {
            this.fx[var1++].setVisible((boolean)(3 ^ 3));
         }

         this.yk.setVisible((boolean)(3 & 4));
         Class95 var4;
         if (this.do == 0) {
            long[] var10008 = new long[--1];
            boolean var10010 = true;
            var10008[3 & 4] = 522L;
            this.ym.ud(var10008);
            this.yf.setText("培养");
            this.xv[--1].fx("观星册");
            this.fx[2 & 5].setText("消耗金钱");
            this.fx[5 >> 2].setText("当前神力");
            this.yk.xa((MoneyType)null);
            this.yk.setText((String)null);
            Class681.j(this.yl, this.uw().n(--2, 111 & 28) ? 100000L : 1000000L);
            var4 = this;
            this.yl.setBounds(14589 & 18378, 22250 & 10679, 122 & 119, 23 & 123);
            this.yk.setBounds(27386 & 5581, 21181 & 11774, 127 & 114, 127 & 19);
            this.fx[2 & 5].setVisible((boolean)(--1));
            this.fx[2 ^ 3].setVisible((boolean)(4 ^ 5));
            this.yk.setVisible((boolean)(--1));
         } else if (this.do == 1) {
            var4 = this;
            long[] var10012 = new long[1];
            boolean var10014 = true;
            var10012[0] = 500L;
            this.ym.ud(var10012);
            this.yf.setText("升级");
            this.xv[1].fx("矿石");
            this.fx[0].setText("消耗金钱");
            this.fx[1].setText("当前金钱");
            this.yk.xa(this.yn);
            this.yl.setBounds(7151 & 25816, 24054 & 8875, 119 & 122, 31 & 115);
            this.yk.setBounds(20168 & 12799, 16892 & 16063, 123 & 118, 19);
            this.fx[0].setVisible(true);
            this.fx[1].setVisible(true);
            this.yk.setVisible(true);
         } else if (this.do == (1 ^ 3)) {
            var4 = this;
            this.as(0);
         } else {
            if (this.do == --3) {
               long[] var10013 = new long[1];
               boolean var10015 = true;
               var10013[0] = 521L;
               this.ym.ud(var10013);
               this.yf.setText("炼星");
               this.xv[1].fx("炼星石");
               this.yl.setText((String)null);
               this.yl.setBounds(241, 149, 54, 19);
               this.fx[1 ^ 3].setFont(Class681.ab);
               this.fx[--3].setFont(Class681.ab);
               this.fx[5 >> 1].setBounds(101, 178, 250, 14);
               this.fx[--3].setBounds(101, 194, 250, 14);
               this.fx[1 ^ 3].setText("注：有一定几率地煞星符最高等级+1；");
               this.fx[--3].setText("非100%成功，若失败不影响地煞星符。");
               this.fx[5 >> 1].setVisible(true);
               this.fx[--3].setVisible(true);
            }

            var4 = this;
         }

         var4.d();
         this.yk.cc();
      }
   }

   public void s() {
      if (this.ye != null) {
         Goodstable var1;
         if ((var1 = this.vd().getGood(this.ye)) == null) {
            this.av((Goodstable)null);
            return;
         }

         if (var1.getRgid() != this.ye) {
            this.av(var1);
         }
      }

   }

   public void gt(boolean var1) {
      int var10000;
      int var2;
      if (!var1) {
         for(var10000 = var2 = 5 >> 3; var10000 < this.xv.length; var10000 = var2) {
            Class574 var3 = this.xv[var2];
            ++var2;
            var3.c(2 & 5, (Object)null);
         }
      }

      for(var10000 = var2 = 0; var10000 < this.ya.length; var10000 = var2) {
         this.ya[var2++].setVisible(var1);
      }

      for(var10000 = var2 = 3 ^ 3; var10000 < this.xz.length; var10000 = var2) {
         this.xz[var2++].setVisible(var1);
      }

      for(var10000 = var2 = 3 >> 2; var10000 < this.xv.length; var10000 = var2) {
         this.xv[var2++].setVisible(var1);
      }

      for(var10000 = var2 = 3 & 4; var10000 < this.fx.length; var10000 = var2) {
         this.fx[var2++].setVisible(var1);
      }

      this.yl.setVisible(var1);
      this.yk.setVisible(var1);
      this.ym.setVisible(var1);
      this.yf.setVisible(var1);
   }

   public BigDecimal ez() {
      Goodstable var1;
      return (var1 = (Goodstable)this.xv[3 & 4].u().hr()) != null ? var1.getRgid() : null;
   }

   public void dp(int var1) {
      int var10000 = 3 ^ 3;
      this.xy = var1;

      for(var1 = var10000; var10000 < this.yb.length; var10000 = var1) {
         this.yb[var1].setKeep((boolean)(var1 == this.xy ? --1 : 0));
         ++var1;
      }

      this.r((boolean)(this.xy == 0 ? 4 ^ 5 : 0));
      this.gt((boolean)(this.xy == --1 ? 3 >> 1 : 0));
      if (this.xy == 0) {
         this.ly((Goodstable)null);
      } else {
         if (this.xy == (3 & 5)) {
            this.do(3 ^ 3);
         }

      }
   }

   public int ot() {
      return this.do;
   }

   public void as(int var1) {
      if (this.xy == --1 && this.do == 5 >> 1) {
         if (this.gw != var1) {
            this.xz[3 >> 1].fw(var1 == 0 ? "sc/e/67.png" : "sc/e/68.png");
            this.xz[5 >> 1].fw(var1 == (4 ^ 5) ? "sc/e/67.png" : "sc/e/68.png");
         }

         this.gw = var1;

         for(int var10000 = var1 = 3 ^ 3; var10000 < this.xv.length; var10000 = var1) {
            Class574 var2 = this.xv[var1];
            ++var1;
            var2.c(3 & 4, (Object)null);
         }

         long[] var10001;
         boolean var10003;
         Class95 var3;
         if (this.gw == 0) {
            var10001 = new long[--1];
            var10003 = true;
            var10001[3 >> 2] = 524L;
            this.ym.ud(var10001);
            var3 = this;
            this.yf.setText("重洗");
            this.xv[--1].fx("浑天石");
         } else {
            var10001 = new long[--1];
            var10003 = true;
            var10001[2 & 5] = 523L;
            this.ym.ud(var10001);
            var3 = this;
            this.yf.setText("重洗");
            this.xv[4 ^ 5].fx("易象符");
         }

         var3.xz[--1].setVisible((boolean)(2 ^ 3));
         this.xz[--2].setVisible((boolean)(2 ^ 3));
         if (this.uw().n(5 >> 1, 13 & 126)) {
            Class681.j(this.yl, 100000L);
            var3 = this;
         } else {
            Class681.j(this.yl, this.gw == 0 ? 1000000L : 5000000L);
            var3 = this;
         }

         var3.fx[2 & 5].setText("消耗金钱");
         this.fx[3 & 5].setText("当前金钱");
         this.yk.xa(this.yn);
         this.yl.setBounds(13275 & 19692, 11510 & 21419, 123 & 118, 115 & 31);
         this.yk.setBounds(15320 & 17647, 21695 & 11260, 127 & 114, 87 & 59);
         this.fx[3 ^ 3].setVisible((boolean)(--1));
         this.fx[2 ^ 3].setVisible((boolean)(--1));
         this.yk.setVisible(true);
         this.fx[--2].setFont(Class681.bu);
         this.fx[--3].setFont(Class681.bu);
         this.fx[5 >> 1].setBounds(23249 & 9663, 73 & 118, 109 & 90, 19 & 126);
         this.fx[--3].setBounds(10750 & 22269, 96 & 95, 75 & 124, 18);
         this.fx[--2].setText("重洗神通");
         this.fx[--3].setText("重洗五行");
         this.fx[5 >> 1].setVisible(true);
         this.fx[--3].setVisible(true);
      }
   }

   public void ly(Goodstable var1) {
      if (this.xy == 0) {
         this.av(var1);
      } else {
         if (this.xy == (2 ^ 3)) {
            this.xv[var1.getType() == 520L ? 3 & 4 : 1].c(3 & 5, var1);
            this.d();
         }

      }
   }

   public static boolean ee(String var0) {
      return var0.equals("朱雀") || var0.equals("玄武") || var0.equals("白虎") || var0.equals("青龙");
   }

   public int ov() {
      return this.xy;
   }

   public void r(boolean var1) {
      if (!var1) {
         this.ye = null;
      }

      int var10000;
      int var2;
      for(var10000 = var2 = 0; var10000 < this.yh.length; var10000 = var2) {
         this.yh[var2++].setVisible(var1);
      }

      for(var10000 = var2 = 5 >> 3; var10000 < this.yg.length; var10000 = var2) {
         this.yg[var2++].setVisible(var1);
      }

      for(var10000 = var2 = 3 ^ 3; var10000 < this.fb.length; var10000 = var2) {
         this.fb[var2++].setVisible(var1);
      }

      for(var10000 = var2 = 2 & 5; var10000 < this.yj.length; var10000 = var2) {
         this.yj[var2++].setVisible(var1);
      }

      for(var10000 = var2 = 3 ^ 3; var10000 < this.gl.length; var10000 = var2) {
         this.gl[var2++].setVisible(var1);
      }

   }

   public void q() {
      this.dp(3 >> 2);
      super.q();
   }

   public void av(Goodstable var1) {
      int var10000 = 5 >> 3;
      this.ye = null;
      this.yg[5 >> 3].setText((String)null);
      this.yg[4 ^ 5].setText((String)null);
      this.fb[--2].setText((String)null);
      this.fb[--3].setText((String)null);
      this.fb[--4].setText((String)null);
      this.yh[--3].setVisible((boolean)(3 & 4));
      this.yh[--4].setVisible((boolean)(2 & 5));
      this.yh[--5].setText("参 战");

      for(int var2 = var10000; var10000 < this.yj.length; var10000 = var2) {
         this.yj[var2++].setVisible((boolean)(5 >> 3));
      }

      this.gl[2 ^ 3].q();
      this.gl[--4].q();
      this.gl[--4].setVisible((boolean)(3 ^ 3));
      this.gl[--5].setVisible((boolean)(5 >> 3));
      if (var1 != null && var1.getType() == 520L) {
         this.ye = var1.getRgid();
         this.yh[--5].setText(var1.getStatus() == --1 ? "待 机" : "参 战");
         this.gl[3 >> 1].fw(Class222.l(var1.getSkin()));
         String[] var12;
         String[] var10009 = var12 = var1.getValue().split("\\|");
         int var3 = var10009[3 ^ 3].indexOf("/");
         int var4 = Integer.parseInt(var10009[2 & 5].substring(--3, var3));
         var3 = Integer.parseInt(var10009[5 >> 3].substring(var3 + --1));
         int var5 = Integer.parseInt(var10009[--1].substring(--3));
         int var6 = Integer.parseInt(var10009[1 ^ 3].split("=")[3 >> 1]);
         this.yg[3 & 4].setForeground(Color.white);
         this.yg[3 & 4].setText(var5 + "/" + var4 * (510 & 32457));
         this.yg[3 >> 1].setText(String.valueOf(var6));
         this.yj[0].setVisible(true);
         this.fb[--2].setText(var1.getGoodsname());
         this.fb[--3].setText(String.valueOf(var4));
         this.fb[--4].setText("/" + var3);
         String[] var11 = var12[3].split("&");
         var12 = var12[4].split("&");
         this.yj[1].setTextSize("#W【神通】 资质：" + var11[1].split("=")[1] + "/100#r#G" + this.ow(var11[2], "+") + "#r" + this.ow(var11[3], "+"), 20727 & 12220);
         this.yj[1].setVisible(true);
         StringBuffer var13;
         (var13 = new StringBuffer()).append("#W【五行】");
         var4 = 1;

         StringBuilder var16;
         String var10002;
         for(var10000 = var4; var10000 < var12.length; var10000 = var4) {
            var16 = new StringBuilder("#r#Y");
            var10002 = this.ow(var12[var4], " ");
            ++var4;
            var13.append(var16.append(var10002).toString());
         }

         boolean var14 = false;
         double var7 = 0.0D;

         for(var10000 = var5 = 0; var10000 < var11.length; var10000 = var5) {
            if (var11[var5].startsWith("星阵属性")) {
               String[] var15 = var11[var5].split("=");

               int var9;
               for(var10000 = var9 = 1; var10000 < var12.length; var10000 = var9) {
                  String[] var10 = var12[var9].split("=");
                  String var17 = var15[2];
                  var10002 = var10[0];
                  String var10003 = var10[1];
                  ++var9;
                  var7 += MsgUntil.l(var17, var10002, var10003);
               }

               var16 = new StringBuilder("#r#c43E4D2五行加成星阵之力 ");
               Object[] var18 = new Object[1];
               boolean var10005 = true;
               var18[0] = var7;
               var13.append(var16.append(String.format("%.1f", var18)).append("%").toString());
               this.gl[4].hf(Class511.a("sc/skill/" + var15[1] + ".png"));
               this.gl[4].setVisible(true);
               this.gl[5].setVisible(true);
               this.yj[3].setTextSize("#W【星阵之力】 " + var15[1], 1204 & 31743);
               this.yj[3].setVisible(true);
               this.yh[3].setVisible(true);
               this.yh[4].setVisible(true);
               var14 = true;
            }

            ++var5;
         }

         if (!var14) {
            var13.append("#r#Y无星阵，五行暂不生效");
            this.yj[3].setTextSize("#W【星阵之力】 无", 12542 & 20405);
            this.yj[3].setVisible(true);
         }

         this.yj[2].setTextSize(var13.toString(), 3837 & 29110);
         this.yj[2].setVisible(true);
      }
   }

   public void y(int var1) {
      if (var1 == (123 & 119)) {
         this.bl();
      } else if (var1 == (127 & 111) || !this.aej.t()) {
         RoleData var2 = this.vd();
         Goodstable var3 = this.ye != null ? var2.getGood(this.ye) : null;
         if (var3 == null) {
            this.aej.f("请选择对应的星卡");
         } else if (var1 == (107 & 127)) {
            this.aej.aal(new ConfirmBean(--2, var3.getRgid().toString(), "真的要取出该星卡吗?"));
         } else if (var1 == (127 & 111)) {
            ((Class472)this.ve().e(91 & 63)).ly(var3);
         } else if (var1 == (117 & 122)) {
            this.aej.aal(new ConfirmBean(60 & 87, var3.getRgid().toString(), "真的要删除该星卡的星阵吗？删除后不可恢复"));
         } else {
            int var10000;
            if (var1 != (113 & 127)) {
               if (var1 == (122 & 119)) {
                  if (Integer.parseInt(var3.getValue().split("\\|")[5 >> 1].split("=")[3 >> 1]) <= 0) {
                     this.aej.f("战力不足无法参战");
                     return;
                  }

                  Class95 var8;
                  if (var3.getStatus() == --1) {
                     int var10001 = 2 & 5;
                     var2.h(var3.getRgid());
                     var3.setStatus(--4);
                     var2.ao(var3);
                     var8 = this;
                     ParamTool.g(var3, var10001, this.uw());
                  } else {
                     Goodstable var7;
                     if ((var7 = var2.getEquipGood(125 & 15)) != null) {
                        var10000 = 3 ^ 3;
                        var2.h(var7.getRgid());
                        var7.setStatus(--4);
                        var2.ao(var7);
                        ParamTool.g(var7, var10000, this.uw());
                     }

                     var2.h(var3.getRgid());
                     var3.setStatus(4 ^ 5);
                     var2.ao(var3);
                     int var10002 = 2 & 5;
                     var8 = this;
                     ParamTool.g(var3, var10002, this.uw());
                  }

                  var8.yh[--5].setText(var3.getStatus() == (3 & 5) ? "待 机" : "参 战");
               }

            } else {
               String[] var4 = var3.getValue().split("\\|")[--3].split("&");

               int var5;
               for(var10000 = var5 = 5 >> 3; var10000 < var4.length; var10000 = var5) {
                  if (var4[var5].startsWith("星阵属性")) {
                     String[] var6;
                     if (!ee((var6 = var4[var5].split("="))[5 >> 2])) {
                        this.aej.f("不是四神兽星阵无法转移");
                        return;
                     }

                     ((Class649)this.ve().e(123 & 101)).amo(3 & 4, var6, var3);
                     return;
                  }

                  ++var5;
               }

            }
         }
      }
   }

   public void ax(Goodstable var1) {
      if (this.xy == 0) {
         if (Class394.v(this.ye, var1.getRgid())) {
            this.av((Goodstable)null);
         }
      } else {
         if (this.xy == --1) {
            BigDecimal var10000;
            Goodstable var10001;
            Goodstable var2;
            if ((var2 = (Goodstable)this.xv[3 >> 2].u().hr()) != null) {
               var10000 = var2.getRgid();
               var10001 = var1;
            } else {
               var10000 = null;
               var10001 = var1;
            }

            if (Class394.v(var10000, var10001.getRgid())) {
               this.xv[3 >> 2].c(2 & 5, (Object)null);
               this.d();
               return;
            }

            if ((var2 = (Goodstable)this.xv[--1].u().hr()) != null) {
               var10000 = var2.getRgid();
               var10001 = var1;
            } else {
               var10000 = null;
               var10001 = var1;
            }

            if (Class394.v(var10000, var10001.getRgid())) {
               this.xv[4 ^ 5].c(3 & 4, (Object)null);
               this.d();
               return;
            }
         }

      }
   }

   public void d() {
      if (this.xy == --1) {
         if (this.do == 0 || this.do == --1 || this.do == --3) {
            RoleData var1 = this.vd();
            Goodstable var2 = (Goodstable)this.xv[2 & 5].u().hr();
            Goodstable var3 = (Goodstable)this.xv[5 >> 2].u().hr();
            if (var2 != null) {
               var2 = var1.getGood(var2.getRgid());
            }

            if (var3 != null) {
               var3 = var1.getGood(var3.getRgid());
            }

            if (var2 == null) {
               if (this.do == 0) {
                  this.yk.setText((String)null);
               } else if (this.do == 5 >> 2) {
                  this.yl.setText((String)null);
               } else {
                  if (this.do == --3) {
                     this.yl.setText((String)null);
                  }

               }
            } else {
               String[] var6;
               String[] var8 = (var6 = var2.getValue().split("\\|"))[2 & 5].split("=")[2 ^ 3].split("/");
               int var4 = Integer.parseInt(var8[2 & 5]);
               int var5;
               if (this.do == 0) {
                  if (var4 >= (31 & 110)) {
                     this.yk.setText((String)null);
                  } else {
                     var5 = Integer.parseInt(var6[3 & 5].split("=")[5 >> 2]);
                     this.yk.setText(var5 + "/" + var4 * (26073 & 6894));
                  }
               } else if (this.do == 5 >> 2) {
                  if (this.uw().n(1 ^ 3, 46 & 93)) {
                     Class681.j(this.yl, 500000L + (long)var4 * 500000L);
                  } else {
                     Class681.j(this.yl, (long)var4 * 20000000L);
                  }
               } else {
                  if (this.do == --3) {
                     if ((var5 = Integer.parseInt(var8[--1])) >= (78 & 63)) {
                        this.yl.setForeground(Color.white);
                        this.yl.setText("0/0");
                        return;
                     }

                     if (var3 == null) {
                        this.yl.setText((String)null);
                        return;
                     }

                     int var7;
                     if ((var7 = var5 / --2 + (5 >> 1)) < var3.getUsetime()) {
                        this.yl.setForeground(Color.white);
                        this.yl.setText(var7 + "/" + var3.getUsetime());
                        return;
                     }

                     this.yl.setForeground(Color.red);
                     this.yl.setText(var7 + "/" + var3.getUsetime());
                  }

               }
            }
         }
      }
   }

   public int e() {
      return this.gw;
   }

   public boolean bl() {
      RoleData var4 = this.vd();
      Goodstable var9 = (Goodstable)this.xv[5 >> 3].u().hr();
      Goodstable var3 = (Goodstable)this.xv[5 >> 2].u().hr();
      if (var9 != null) {
         var9 = var4.getGood(var9.getRgid());
      }

      if (var3 != null) {
         var3 = var4.getGood(var3.getRgid());
      }

      int var13;
      if (var9 == null) {
         var13 = 2 & 5;
         this.aej.f("请选择要培养的星卡");
         return (boolean)var13;
      } else if (var3 == null) {
         var13 = 2 & 5;
         this.aej.f("请选择材料");
         return (boolean)var13;
      } else {
         String[] var10000 = var9.getValue().split("\\|");
         String[] var10001 = var10000[5 >> 3].split("=")[--1].split("/");
         int var1 = Integer.parseInt(var10001[3 & 4]);
         int var5 = Integer.parseInt(var10001[5 >> 2]);
         int var6 = Integer.parseInt(var10000[3 & 5].split("=")[3 >> 1]);
         int var7 = 3 & 5;
         int var8 = 2 & 5;
         if (this.do == 0) {
            if (var1 >= (78 & 63)) {
               var13 = 2 & 5;
               this.aej.f("等级已经抵达上限");
               return (boolean)var13;
            }

            if (var3.getType() != 522L) {
               var13 = 3 ^ 3;
               this.aej.f("物品不是观星册");
               return (boolean)var13;
            }

            if (var3.getUsetime() < var7) {
               var13 = 3 >> 2;
               this.aej.f("观星册数量不足");
               return (boolean)var13;
            }

            if (var6 >= var1 * (2796 & 30171)) {
               var13 = 5 >> 3;
               this.aej.f("神力已经抵达上限，无法培养");
               return (boolean)var13;
            }

            if (Long.parseLong(this.yl.getText().replace(",", "")) > var4.getLoginResult().getGold().longValue()) {
               var13 = 3 & 4;
               this.aej.f("大话币不足");
               return (boolean)var13;
            }

            var8 = 51;
         } else if (this.do == (4 ^ 5)) {
            if (var6 < var1 * (13775 & 19192)) {
               var13 = 3 >> 2;
               this.aej.f("神力没有抵达上限，无法升级");
               return (boolean)var13;
            }

            if (var1 >= var5) {
               var13 = 3 & 4;
               this.aej.f("等级已经抵达等级上限,无法继续升级");
               return (boolean)var13;
            }

            if (var3.getType() != 500L) {
               this.aej.f("物品不是矿石");
               return false;
            }

            int var2 = Integer.parseInt(var3.getValue().split("=")[1]);
            if (this.aej.getClient().n(--2, 126 & 13)) {
               if (var1 == 1 && var2 != (30 & 103)) {
                  this.aej.f("1级星卡使用千年寒铁升级");
                  return false;
               }

               if (var1 >= (1 ^ 3) && var1 <= --3 && var2 != (111 & 23)) {
                  this.aej.f("2,3级星卡使用天外飞石升级");
                  return false;
               }

               if (var1 >= --4 && var1 <= --5 && var2 != (45 & 90)) {
                  this.aej.f("4-6级星卡使用盘古精铁升级");
                  return false;
               }

               if (var1 >= (31 & 103) && var1 <= (63 & 73) && var2 != (125 & 11)) {
                  this.aej.f("7-9级星卡使用补天神石升级");
                  return false;
               }

               if (var1 >= (123 & 14) && var1 <= (29 & 111) && var2 != (63 & 74)) {
                  this.aej.f("10-13级星卡使用六魂之玉升级");
                  return false;
               }

               if (var1 >= (95 & 46) && var2 != (95 & 43)) {
                  this.aej.f("使用无量琉璃升级");
                  return false;
               }
            } else if (var2 != (43 & 95)) {
               this.aej.f("矿石不是无量琉璃");
               return false;
            }

            if (var3.getUsetime() < var7) {
               this.aej.f("矿石数量不足");
               return false;
            }

            if (Long.parseLong(this.yl.getText().replace(",", "")) > var4.getLoginResult().getGold().longValue()) {
               this.aej.f("大话币不足");
               return false;
            }

            var8 = 52;
         } else if (this.do == --2) {
            if (this.gw == 0) {
               if (var3.getType() != 524L) {
                  this.aej.f("物品不是浑天石");
                  return false;
               }

               if (var3.getUsetime() < var7) {
                  this.aej.f("浑天石数量不足");
                  return false;
               }

               if (Long.parseLong(this.yl.getText().replace(",", "")) > var4.getLoginResult().getGold().longValue()) {
                  this.aej.f("大话币不足");
                  return false;
               }

               var8 = 53;
            } else if (this.gw == 1) {
               if (var3.getType() != 523L) {
                  this.aej.f("物品不是易象符");
                  return false;
               }

               if (var3.getUsetime() < var7) {
                  this.aej.f("易象符数量不足");
                  return false;
               }

               if (Long.parseLong(this.yl.getText().replace(",", "")) > var4.getLoginResult().getGold().longValue()) {
                  this.aej.f("大话币不足");
                  return false;
               }

               var8 = 54;
            }
         } else if (this.do == --3) {
            if (var5 >= 14) {
               this.aej.f("已经升到最大等级");
               return false;
            }

            if (var3.getType() != 521L) {
               this.aej.f("物品不是炼星石");
               return false;
            }

            var7 = var5 / --2 + (5 >> 1);
            if (var3.getUsetime() < var7) {
               this.aej.f("炼星石数量不足");
               return false;
            }

            var8 = 55;
         }

         SuitOperBean var11;
         (var11 = new SuitOperBean()).setType(var8);
         ArrayList var10;
         (var10 = new ArrayList()).add(var9.getRgid());
         var10.add(var3.getRgid());
         var11.setGoods(var10);
         var3.ab(var7);
         if (var3.getUsetime() <= 0) {
            var4.h(var3.getRgid());
            this.ax(var3);
         }

         String var12 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var11));
         this.uw().d(var12);
         return true;
      }
   }

   public String ow(String var1, String var2) {
      String[] var3 = var1.split("=");
      return var3[3 >> 2] + var2 + var3[2 ^ 3];
   }

   public Class95(GameView var1) {
      int var10004 = -4 >> 2;
      int var10006 = -4 >> 2;
      super(95 & 127, 1 ^ 3, Class345.aef, var1);
      this.gw = var10006;
      this.va(var10004, 5 >> 3, 2813 & 30591, 13755 & 19455, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 124 & 71, 124 & 71, 124 & 71, 124 & 71, (boolean)(3 & 4)), "地煞星");
      Class116 var2 = new Class116(118 & 15, 55 & 93, 2 & 5, 82 & 63);
      Class226[] var10001 = new Class226[--4];
      boolean var10003 = true;
      this.ya = var10001;

      int var3;
      int var10000;
      for(var10000 = var3 = 3 >> 2; var10000 < this.ya.length; var10000 = var3) {
         String[] var5;
         boolean var10002;
         if (var3 == 0) {
            var5 = new String[--2];
            var10002 = true;
            var5[3 ^ 3] = "培";
            var5[--1] = "养";
         } else if (var3 == (2 ^ 3)) {
            var5 = new String[1 ^ 3];
            var10002 = true;
            var5[5 >> 3] = "升";
            var5[3 & 5] = "级";
         } else if (var3 == --2) {
            var5 = new String[--2];
            var10002 = true;
            var5[5 >> 3] = "重";
            var5[--1] = "洗";
         } else if (var3 == --3) {
            var5 = new String[1 ^ 3];
            var10002 = true;
            var5[2 & 5] = "炼";
            var5[3 & 5] = "星";
         } else {
            var5 = null;
         }

         String[] var4 = var5;
         this.ya[var3] = new Class226("sc/e/71.png", --2, --3 + var3, Class681.cw, (Color[])null, var4, this);
         this.ya[var3].ad(var2);
         this.ya[var3].ch(Class681.bv);
         this.ya[var3].setBounds(61 & 126, (125 & 59) + (57 & 119) * var3, 63 & 94, 122 & 53);
         this.add(this.ya[var3++]);
      }

      int var6 = --4;
      this.yn = new MoneyType();
      this.yn.setIdAndKey(2 ^ 3, "金钱");
      JLabel[] var7 = new JLabel[var6];
      var10003 = true;
      this.fx = var7;

      for(var10000 = var3 = 3 & 4; var10000 < this.fx.length; var10000 = var3) {
         this.fx[var3] = Class133.c(123 & 127, (15530 & 17399) + (62 & 91) * var3, 106 & 93, 19, 5 >> 3, Class681.c("#c000000"), Class681.ak);
         this.add(this.fx[var3++]);
      }

      var6 = --2;
      int var10008 = 5 >> 3;
      this.yl = Class133.a(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, 10, Color.white, Class681.q);
      this.yk = Class133.m(var10008, 2 & 5, 2 & 5, 2 & 5, 10, Color.white, Class681.q, (MoneyType)null, var1);
      this.yk.ab(1 ^ 3);
      this.yl.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.yk.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.yk);
      this.add(this.yl);
      Class574[] var8 = new Class574[var6];
      var10003 = true;
      this.xv = var8;

      for(var10000 = var3 = 0; var10000 < this.xv.length; var10000 = var3) {
         this.xv[var3] = new Class574(this, false);
         this.xv[var3].setBounds(151 + var3 * 87, 90, 59, 58);
         this.add(this.xv[var3++]);
      }

      var6 = --4;
      this.xv[0].fx("地煞星");
      this.yf = new Class643("sc/e/7.png", 1, 115, Class681.ak, Class681.c, "培养", this);
      this.yf.setBounds(197, 218, 59, 25);
      this.add(this.yf);
      Class436[] var9 = new Class436[var6];
      var10003 = true;
      this.xz = var9;

      Class95 var13;
      for(var10000 = var3 = 0; var10000 < this.xz.length; var10000 = var3) {
         this.xz[var3] = new Class436();
         if (var3 == 0) {
            var13 = this;
            this.xz[var3].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, false));
            this.xz[var3].setBounds(64, 282, 309, 105);
         } else if (var3 == 1) {
            var13 = this;
            this.xz[var3].setBounds(129 + (var3 - 1) * 107, 64, 18, 18);
            this.xz[var3].addMouseListener(new MouseListener() {
               public void mouseExited(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mouseEntered(MouseEvent var1) {
               }

               public void mouseReleased(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (Class95.this.gw != 0) {
                     Class95.this.as(5 >> 3);
                  }
               }
            });
         } else if (var3 == 2) {
            var13 = this;
            this.xz[var3].setBounds(129 + (var3 - 1) * 107, 64, 18, 18);
            this.xz[var3].addMouseListener(new MouseListener() {
               public void mouseEntered(MouseEvent var1) {
               }

               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (Class95.this.gw != (4 ^ 5)) {
                     Class95.this.as(--1);
                  }
               }

               public void mouseExited(MouseEvent var1) {
               }
            });
         } else {
            if (var3 == 3) {
               this.xz[var3].eq(Class511.q("sc/d/33.png", 30, 30, 30, 30, false));
               this.xz[var3].setBounds(87, 58, 287, 196);
            }

            var13 = this;
         }

         var13.add(this.xz[var3++]);
      }

      this.ym = new Class357(this, 6, 2, 51, 51, 0, 0, 65, 284);
      this.ym.hf(Class511.a("sc/d/18.png"));
      long[] var10005 = new long[1];
      boolean var10007 = true;
      var10005[0] = -1L;
      this.ym.ud(var10005);
      this.add(this.ym);
      Class643[] var11 = new Class643[6];
      var10003 = true;
      this.yh = var11;

      Class643 var15;
      Class643[] var16;
      Font var17;
      String var10009;
      Class95 var10010;
      for(var10000 = var3 = 0; var10000 < this.yh.length; var10000 = var3) {
         var16 = this.yh;
         var15 = new Class643;
         var10006 = 109 + var3;
         var17 = Class681.bm;
         if (var3 == 2) {
            var10009 = "补充";
            var10010 = this;
         } else if (var3 == 3) {
            var10009 = "删除";
            var10010 = this;
         } else if (var3 == 4) {
            var10009 = "转移";
            var10010 = this;
         } else if (var3 == 5) {
            var10009 = "参战";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var15.<init>("sc/e/6.png", 1, var10006, var17, (Color[])null, var10009, var10010);
         var16[var3] = var15;
         this.yh[var3].setBounds(170, 330, 34, 18);
         if (var3 == 0) {
            var13 = this;
            this.yh[var3].setImage("sc/e/1.png");
            this.yh[var3].setBounds(111, 278, 18, 18);
         } else if (var3 == 1) {
            var13 = this;
            this.yh[var3].setImage("sc/e/2.png");
            this.yh[var3].setBounds(134, 278, 18, 18);
         } else if (var3 != 3 && var3 != 4) {
            if (var3 == 5) {
               this.yh[var3].setForeground(Color.black);
               this.yh[var3].setFont(Class681.ak);
               this.yh[var3].setImage("sc/e/7.png");
               this.yh[var3].setBounds(104, 356, 59, 25);
            }

            var13 = this;
         } else {
            var13 = this;
            this.yh[var3].setBounds(300, 339 + 21 * (var3 - 3), 34, 18);
         }

         var13.add(this.yh[var3++]);
      }

      Class245[] var12 = new Class245[2];
      var10003 = true;
      this.yg = var12;

      for(var10000 = var3 = 0; var10000 < this.yg.length; var10000 = var3) {
         this.yg[var3] = Class133.a(95, 304 + 25 * var3, 109, 19, 10, Color.white, Class681.q);
         this.yg[var3].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.yg[var3++]);
      }

      var7 = new JLabel[5];
      var10003 = true;
      this.fb = var7;

      for(var10000 = var3 = 0; var10000 < this.fb.length; var10000 = var3) {
         this.fb[var3] = Class133.c(58, 304 + 25 * var3, 36, 19, 0, Class681.c("#c000000"), Class681.ak);
         this.fb[var3].setText(var3 == 0 ? "神力" : (var3 == 1 ? "战力" : (var3 == 2 ? "学习交流" : (var3 == 3 ? "8" : (var3 == 4 ? "/18" : "")))));
         this.add(this.fb[var3]);
         if (var3 == 2) {
            this.fb[var3].setFont(Class681.cf);
            this.fb[var3].setHorizontalAlignment(10);
            this.fb[var3].setBounds(232, 55, 120, 23);
            this.fb[var3].setForeground(Class681.c("#cFFFFF00"));
         } else if (var3 == 3) {
            this.fb[var3].setFont(Class681.a);
            this.fb[var3].setBounds(262, 80, 54, 33);
            this.fb[var3].setForeground(Class681.c("#cFFFFFF"));
         } else if (var3 == 4) {
            this.fb[var3].setFont(Class681.ab);
            this.fb[var3].setHorizontalAlignment(10);
            this.fb[var3].setBounds(316, 96, 54, 13);
            this.fb[var3].setForeground(Class681.c("#c999999"));
         }

         ++var3;
      }

      RichLabel[] var14 = new RichLabel[4];
      var10003 = true;
      this.yj = var14;

      for(var10000 = var3 = 0; var10000 < this.yj.length; var10000 = var3) {
         this.yj[var3] = new RichLabel((String)null, Class681.ab);
         if (var3 == 0) {
            var13 = this;
            this.yj[var3].setBounds(216, 91, this.yj[var3].getWidth(), this.yj[var3].getHeight());
         } else if (var3 == 1) {
            var13 = this;
            this.yj[var3].setBounds(216, 126, this.yj[var3].getWidth(), this.yj[var3].getHeight());
         } else if (var3 == 2) {
            var13 = this;
            this.yj[var3].setBounds(216, 192, this.yj[var3].getWidth(), this.yj[var3].getHeight());
         } else {
            if (var3 == 3) {
               this.yj[var3].setBounds(216, 311, this.yj[var3].getWidth(), this.yj[var3].getHeight());
            }

            var13 = this;
         }

         var13.add(this.yj[var3++]);
      }

      this.yj[0].setTextSize("#cFFFFFF【等级】", 180);
      var9 = new Class436[9];
      var10003 = true;
      this.gl = var9;

      for(var10000 = var3 = 0; var10000 < this.gl.length; var10000 = var3) {
         this.gl[var3] = new Class436();
         this.add(this.gl[var3]);
         if (var3 == 0) {
            this.gl[var3].fw("sc/d/61.png");
            this.gl[var3].setBounds(51, 51, 160, 221);
         } else if (var3 == 1) {
            this.gl[var3].setBounds(51, 53, 160, 220);
         } else if (var3 == 2) {
            this.gl[var3].eq(Class511.q("sc/d/33.png", 30, 30, 30, 30, false));
            this.gl[var3].setBounds(51, 270, 162, 117);
         } else if (var3 == 3) {
            this.gl[var3].fw("sc/d/34.png");
            this.gl[var3].setBounds(212, 55, 143, 23);
         } else if (var3 == 4) {
            this.gl[var3].setBounds(253, 340, 39, 39);
         } else if (var3 == 5) {
            this.gl[var3].fw("sc/d/51.png");
            this.gl[var3].setBounds(250, 337, 45, 45);
         } else if (var3 >= 6 && var3 <= 8) {
            this.gl[var3].eq(Class511.q("sc/d/66.png", 30, 1, 30, 1, false));
            if (var3 == 6) {
               this.gl[var3].setBounds(212, 118, 185, 2);
            } else if (var3 == 7) {
               this.gl[var3].setBounds(212, 188, 185, 2);
            } else if (var3 == 8) {
               this.gl[var3].setBounds(212, 307, 185, 2);
            }
         }

         ++var3;
      }

      var11 = new Class643[2];
      var10003 = true;
      this.yb = var11;

      for(var10000 = var3 = 0; var10000 < this.yb.length; var10000 = var3) {
         var16 = this.yb;
         var15 = new Class643;
         var10006 = 103 + var3;
         var17 = Class681.cw;
         if (var3 == 0) {
            var10009 = "属性";
            var10010 = this;
         } else if (var3 == 1) {
            var10009 = "重铸";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var15.<init>("sc/e/39.png", 2, var10006, var17, (Color[])null, var10009, var10010);
         var16[var3] = var15;
         this.yb[var3].setOffsetTexts(Class681.cl);
         this.yb[var3].setBounds(58 + 65 * var3, 20, 63, 24);
         this.add(this.yb[var3++]);
      }

      var11 = new Class643[4];
      var10003 = true;
      this.yd = var11;

      for(var10000 = var3 = 0; var10000 < this.yd.length; var10000 = var3) {
         var16 = this.yd;
         var15 = new Class643;
         var10006 = 105 + var3;
         var17 = Class681.ak;
         if (var3 == 0) {
            var10009 = "兑换";
            var10010 = this;
         } else if (var3 == 1) {
            var10009 = "地煞星称谓";
            var10010 = this;
         } else if (var3 == 2) {
            var10009 = "取出";
            var10010 = this;
         } else if (var3 == 3) {
            var10009 = "魂归";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var15.<init>("sc/e/7.png", 1, var10006, var17, (Color[])null, var10009, var10010);
         var16[var3] = var15;
         this.yd[var3].setBounds(432 + (var3 - 2) * 82, 371, 59, 25);
         if (var3 == 0) {
            var13 = this;
            this.yd[var3].setFont(Class681.bm);
            this.yd[var3].setImage("sc/e/6.png");
            this.yd[var3].setBounds(364, 27, 34, 18);
         } else if (var3 == 1) {
            var13 = this;
            this.yd[var3].setFont(Class681.bm);
            this.yd[var3].setImage("sc/e/69.png");
            this.yd[var3].setBounds(517, 28, 85, 18);
         } else {
            if (var3 == 2 || var3 == 3) {
               this.yd[var3].setForeground(Color.black);
            }

            var13 = this;
         }

         var13.add(this.yd[var3++]);
      }

      this.d = Class133.c(260, 26, 36, 19, 10, Class681.c("#c000000"), Class681.ak);
      this.d.setText("星芒");
      this.add(this.d);
      this.xw = new MoneyType();
      this.xw.setIdAndKey(0, "星芒");
      this.xx = Class133.i(10, Color.white, Class681.q, this.xw, var1);
      this.xx.ab(2);
      this.xx.eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, false));
      this.xx.setBounds(295, 26, 104, 19);
      this.add(this.xx);
      var9 = new Class436[4];
      var10003 = true;
      this.yc = var9;

      for(var10000 = var3 = 0; var10000 < this.yc.length; var10000 = var3) {
         this.yc[var3] = new Class436();
         if (var3 == 0) {
            var13 = this;
            this.yc[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.yc[var3].setBounds(402, 354, 205, 58);
         } else if (var3 == 1) {
            var13 = this;
            this.yc[var3].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
            this.yc[var3].setBounds(401, 46, 207, 309);
         } else if (var3 == 2) {
            var13 = this;
            this.yc[var3].eq(Class511.q("sc/d/74.png", 16, 16, 16, 16, false));
            this.yc[var3].setBounds(45, 44, 358, 368);
         } else {
            if (var3 == 3) {
               this.yc[var3].eq(Class511.q("sc/d/24.png", 290, 290, 2, 2, false));
               this.yc[var3].setBounds(48, 47, 352, 362);
            }

            var13 = this;
         }

         var13.add(this.yc[var3++]);
      }

      this.yi = new Class68(this, 4, 6, 51, 51, 0, 0, 402, 48);
      this.yi.hf(Class511.a("sc/d/18.png"));
      this.add(this.yi);
   }

   protected void paintComponent(Graphics var1) {
      if (this.aej.bl()) {
         this.s();
      }

      super.paintComponent(var1);
   }
}
