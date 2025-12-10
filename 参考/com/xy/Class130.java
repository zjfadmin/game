package com.xy;

import com.xy.bean.Commodity;
import com.xy.bean.Stall;
import com.xy.bean.StallBean;
import com.xy.bean.StallNeedBean;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class130 extends Class345 {
   private int jf;
   private int jg;
   private Class556 jh;
   private Class319 ji;
   private Class322 jj;
   private int jk;
   private JLabel[] jl;
   private Class217 jm;
   private Class436[] jn;
   private Class436 jo;
   private MoneyType jp;
   private JLabel[] jq;
   private Class217 jr;
   private Class217 js;
   private Class322[] jt;
   private Class217 ju;
   private Class44 jv;
   private Class217 jw;
   private Class132 jx;
   private Class319 jy;
   private Class44 jz;
   private Class245 ka;
   private <undefinedtype>[] kb;
   private Class132 kc;
   private Class556 kd;
   private Class322[] ke;
   private Class319 kf;
   private Class319 kg;
   private Class322[] kh;
   private Class322 ki;
   private Stall kj;
   private Class217 kk;
   private Class322 kl;
   private JComponent km;
   private Class436[] cs;
   private Class245 eu;
   private Class322[] kn;
   private JComponent ko;
   private Class290 kp;
   private Class290 kq;

   public void p() {
      this.jv.c(3 >> 2, (Object)null);
      this.ju.setText("");
      this.jw.setText("");
      this.ke[5 >> 3].setVisible((boolean)(3 >> 2));
      this.ke[--1].setVisible((boolean)(3 ^ 3));
   }

   public void s() {
      // $FF: Couldn't be decompiled
   }

   public Class290 fi() {
      return this.kp;
   }

   public void ew(Goodstable var1, int var2) {
      if (GoodType.e(var1)) {
         this.aej.f("物品无法交易");
      } else {
         Commodity var3;
         if ((var3 = this.kj.getGood(var1.getRgid())) != null) {
            this.jv.c(2 ^ 3, var1);
            this.ju.setText(String.valueOf(var3.getMoney()));
            this.jw.setText(String.valueOf(var3.getGood().getUsetime()));
            this.ke[2 & 5].setText("更新");
            this.ke[5 >> 3].setVisible((boolean)(4 ^ 5));
            this.ke[3 & 5].setVisible((boolean)(5 >> 2));
         } else if (this.kj.getPath(3 ^ 3) == -4 >> 2) {
            this.aej.f("没有空余的位置");
         } else {
            this.jv.c(2 ^ 3, var1);
            this.ju.setText("");
            this.jw.setText(String.valueOf(var2));
            this.ke[3 >> 2].setText("上架");
            this.ke[3 >> 2].setVisible((boolean)(2 ^ 3));
            this.ke[5 >> 2].setVisible((boolean)(5 >> 3));
         }
      }
   }

   public JComponent fj() {
      return this.ko;
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 & 5);
   }

   public Class290 fk() {
      return this.kq;
   }

   public Stall fl() {
      return this.kj;
   }

   public void d() {
      // $FF: Couldn't be decompiled
   }

   public Long x(long var1, JTextField var3) {
      if (this.ju != var3 && this.jw != var3) {
         if (this.jm != var3 && this.kk != var3) {
            return 0L;
         } else if (var1 >= 0L && this.jz.tp() != 0) {
            long var7 = this.vd().getLoginResult().getGold().longValue();
            long var10000;
            if (this.jm == var3) {
               var7 /= Math.max(1L, this.jy.gl());
               var10000 = var1;
            } else {
               var7 /= Math.max(1L, this.kf.gl());
               var10000 = var1;
            }

            return var10000 > var7 ? var7 : null;
         } else {
            return 0L;
         }
      } else if (var1 >= 0L && this.jv.tp() != 0) {
         if (this.jw == var3) {
            if (this.jv.tp() == (2 ^ 3)) {
               Goodstable var4;
               if ((var4 = (Goodstable)this.jv.hr()) != null) {
                  var4 = this.vd().getGood(var4.getRgid());
               }

               long var5 = (long)(var4 != null ? var4.getUsetime() : 0);
               return var1 > var5 ? var5 : null;
            } else {
               return 1L;
            }
         } else {
            return null;
         }
      } else {
         return 0L;
      }
   }

   public void q() {
      int var10006 = 2 & 5;
      int var10008 = 3 >> 2;
      this.uy(this.jx, 16234 & 16895, 75 & 118);
      this.dp(var10008);
      this.as(var10006);
      this.jr.setText(this.vd().getLoginResult().getRolename());
      this.kj = new Stall();
      this.p();
      this.s();
      this.kd.cc();
      super.q();
   }

   public void do(int var1) {
      List var2;
      int var3 = (((var2 = this.kj.getNeeds()) != null ? var2.size() : 0) - 1) / this.kb.length;
      var1 = Math.max(5 >> 3, var1);
      var1 = Math.min(var3, var1) * this.kb.length;

      for(int var10000 = var3 = 3 & 4; var10000 < this.kb.length; var10000 = var3) {
         StallNeedBean var4 = var2 != null && var1 < var2.size() ? (StallNeedBean)var2.get(var1) : null;
         this.kb[var3++].aai(var4);
         ++var1;
      }

   }

   public void v(RoleSummoning var1) {
      if ((var1.getPetlock() >>> (3 >> 2) & 3 & 5) == --1) {
         this.aej.fw("召唤兽" + var1.getSummoningname() + "已被加锁，不可摆摊！！");
      } else if ((var1.getPetlock() >>> (4 ^ 5) & 3 & 5) == (2 ^ 3)) {
         this.aej.fw("召唤兽" + var1.getSummoningname() + "已被禁交易，不可摆摊！！");
      } else {
         int var2;
         if ((var2 = Integer.parseInt(var1.getSummoningid())) >= 100000 && var2 <= 200000) {
            this.aej.fw("召唤兽" + var1.getSummoningname() + "已被禁交易，不可摆摊！！");
         } else if (Class394.v(this.vd().getLoginResult().getSummoning_id(), var1.getSid())) {
            this.aej.fw("该召唤兽在参战中，不可摆摊！");
         } else if (this.vd().getPetMount(var1.getSid()) != null) {
            this.aej.fw("这只召唤兽被管制中，不可摆摊！！！");
         } else {
            Commodity var3;
            if ((var3 = this.kj.getPet(var1.getSid())) != null) {
               this.jv.c(29 & 119, var1);
               this.ju.setText(String.valueOf(var3.getMoney()));
               this.jw.setText("1");
               this.ke[5 >> 3].setText("更新");
               this.ke[3 & 4].setVisible((boolean)(4 ^ 5));
               this.ke[3 >> 1].setVisible((boolean)(2 ^ 3));
            } else if (this.kj.getPath(3 >> 1) == -4 >> 2) {
               this.aej.f("没有空余的位置");
            } else {
               this.jv.c(85 & 63, var1);
               this.ju.setText("");
               this.jw.setText("1");
               this.ke[3 >> 2].setText("上架");
               this.ke[2 & 5].setVisible((boolean)(3 >> 1));
               this.ke[4 ^ 5].setVisible((boolean)(3 >> 2));
            }
         }
      }
   }

   public void z(long var1, JTextField var3) {
      if (this.ju != var3 && this.jw != var3) {
         if (this.jm == var3 || this.kk == var3) {
            if (this.jz.tp() == 0) {
               Class681.j(this.ka, 0L);
               return;
            }

            if (this.jm == var3) {
               Class681.j(this.ka, var1 * this.jy.gl());
               return;
            }

            if (this.kk == var3) {
               Class681.j(this.ka, var1 * this.kf.gl());
            }
         }
      } else {
         if (this.jv.tp() == 0) {
            Class681.j(this.eu, 0L);
            return;
         }

         if (this.ju == var3) {
            Class681.j(this.eu, var1 * this.kg.gl());
            return;
         }

         if (this.jw == var3) {
            Class681.j(this.eu, var1 * this.ji.gl());
            return;
         }
      }

   }

   public void dp(int var1) {
      if (var1 != 3 >> 1 || this.uw().gamePawn) {
         this.jg = var1;

         int var2;
         for(int var10000 = var2 = 3 >> 2; var10000 < this.jt.length; var10000 = var2) {
            this.jt[var2].setKeep((boolean)(var2 == this.jg ? --1 : 0));
            ++var2;
         }

         if (var1 == (2 ^ 3)) {
            int var10009 = 5 >> 3;
            this.kq.q();
            this.kp.bg((StallBuyMenu)null);
            this.jk = var10009;
            this.do(this.jk);
            this.jz.c(2 & 5, (Object)null);
            this.js.setText("");
            this.jm.setText("");
            this.kk.setText("");
            this.kn[--3].setVisible((boolean)(3 & 4));
            this.kn[--4].setVisible((boolean)(3 & 4));
         }

         this.ko.setVisible((boolean)(var1 == 0 ? 4 ^ 5 : 0));
         this.km.setVisible((boolean)(var1 == 5 >> 2 ? 3 & 5 : 0));
      }
   }

   public Class130(GameView var1) {
      int var10001 = --2;
      int var10005 = -4 >> 2;
      super(2303 & 30616, --2, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 958 & 32471, 14783 & 18427, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(3 >> 2)), "摆摊盘点");
      Class322[] var6 = new Class322[var10001];
      boolean var10003 = true;
      this.jt = var6;

      int var2;
      Class322[] var5;
      int var10000;
      Class322 var10002;
      int var10006;
      Font var10007;
      String var10009;
      Class130 var10010;
      for(var10000 = var2 = 5 >> 3; var10000 < this.jt.length; var10000 = var2) {
         var5 = this.jt;
         var10002 = new Class322;
         var10005 = 5 >> 1;
         var10006 = (13787 & 19197) + var2;
         var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10009 = "出售";
            var10010 = this;
         } else if (var2 == (4 ^ 5)) {
            var10009 = "收购";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/72.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var5[var2] = var10002;
         this.jt[var2].setOffsetTexts(Class681.bv);
         this.jt[var2].setBounds((61 & 127) + (92 & 127) * var2, 111 & 31, 125 & 87, 63 & 97);
         this.add(this.jt[var2++]);
      }

      var10001 = 1 ^ 3;
      this.kl = new Class322("sc/e/6.png", 3 & 5, 17125 & 15867, Class681.bm, (Color[])null, "更改", this);
      this.ki = new Class322("sc/e/6.png", 3 & 5, 2811 & 30182, Class681.bm, (Color[])null, "预览", this);
      this.jj = new Class322("sc/e/31.png", 3 >> 1, 30205 & 2791, Class681.ak, (Color[])null, "摆 摊", this);
      this.kl.setBounds(18351 & 14846, 87 & 62, 58 & 103, 18);
      this.ki.setBounds(484, 22, 34, 18);
      this.jj.setBounds(290, 387, 79, 25);
      this.jj.setForeground(Color.black);
      this.add(this.kl);
      this.add(this.ki);
      this.add(this.jj);
      this.jr = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)), Class681.q, Color.white);
      this.jr.setBounds(343, 23, 120, 17);
      this.add(this.jr);
      this.ko = new JComponent() {
      };
      this.km = new JComponent() {
      };
      this.ko.setBounds(3 >> 2, 3 >> 2, 662, 443);
      this.km.setBounds(3 >> 2, 3 >> 2, 662, 443);
      this.add(this.ko);
      this.add(this.km);
      this.jo = new Class436(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 >> 2)));
      this.jo.setBounds(35, 29, 611, 20);
      this.add(this.jo);
      var6 = new Class322[var10001];
      var10003 = true;
      this.kh = var6;

      for(var10000 = var2 = 3 & 4; var10000 < this.kh.length; var10000 = var2) {
         var5 = this.kh;
         var10002 = new Class322;
         var10005 = 5 >> 1;
         var10006 = 221 + var2;
         var10007 = Class681.cw;
         if (var2 == 0) {
            var10009 = "召唤兽";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "灵宝";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.kh[var2].setOffsetTexts(Class681.cl);
         this.kh[var2].setBounds(54 + 65 * var2, 284, 63, 24);
         this.ko.add(this.kh[var2++]);
      }

      var10001 = 1 ^ 3;
      this.kh[--1].setVisible((boolean)(3 & 4));
      var6 = new Class322[var10001];
      var10003 = true;
      this.ke = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.ke.length; var10000 = var2) {
         var5 = this.ke;
         var10002 = new Class322;
         var10005 = 2 ^ 3;
         var10006 = 227 + var2;
         var10007 = Class681.ak;
         if (var2 == 0) {
            var10009 = "上架";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var10009 = "下架";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/31.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.ke[var2].setForeground(Color.black);
         this.ke[var2].setBounds(436 + var2 * 89, 321, 79, 25);
         this.ko.add(this.ke[var2++]);
      }

      JLabel[] var8 = new JLabel[--3];
      var10003 = true;
      this.jq = var8;

      for(var10000 = var2 = 3 & 4; var10000 < this.jq.length; var10000 = var2) {
         this.jq[var2] = Class133.b(433, 213 + 31 * var2, 36, 19, Color.black, Class681.ak);
         this.jq[var2].setText(var2 == 0 ? "单价" : (var2 == 5 >> 2 ? "总价" : (var2 == 5 >> 1 ? "现金" : "")));
         this.jq[var2].setHorizontalAlignment(10);
         this.ko.add(this.jq[var2++]);
      }

      var10001 = --5;
      this.ju = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, false), Class681.q, Color.white);
      this.jw = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, false), Class681.q, Color.white);
      this.ju.setBounds(472, 213, 134, 19);
      this.jw.setBounds(485, 167, 72, 19);
      this.eu = Class133.a(472, 244, 134, 19, 10, Color.white, Class681.q);
      this.eu.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
      this.jp = new MoneyType();
      this.jp.setIdAndKey(1, "金钱");
      this.kd = Class133.m(472, 275, 134, 19, 10, Color.white, Class681.q, this.jp, var1);
      this.kd.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
      this.kd.ab(1 ^ 3);
      this.ko.add(this.ju);
      this.ko.add(this.jw);
      this.ko.add(this.eu);
      this.ko.add(this.kd);
      this.ji = new Class319(15, this.ju, this);
      this.kg = new Class319(15, this.jw, this);
      this.jv = new Class44(this);
      this.jv.setBounds(490, 101, 60, 60);
      this.ko.add(this.jv);
      Class436[] var9 = new Class436[var10001];
      var10003 = true;
      this.jn = var9;

      for(var10000 = var2 = 0; var10000 < this.jn.length; var10000 = var2) {
         this.jn[var2] = new Class436();
         this.ko.add(this.jn[var2]);
         if (var2 == 0) {
            this.jn[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, false));
            this.jn[var2].setBounds(53, 66, 309, 207);
            this.jx = new Class132(0, this, 6, --4, 51, 51, 0, 0, 54, 68);
            this.jx.hf(Class511.a("sc/d/18.png"));
            this.ko.add(this.jx);
         } else if (var2 != 1) {
            if (var2 == 5 >> 1) {
               this.jn[var2].eq(Class511.q("sc/d/4.png", 5, 5, 5, 5, false));
               this.jn[var2].setBounds(486, 97, 69, 67);
            } else if (var2 == 3) {
               this.jn[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
               this.jn[var2].setBounds(45, 55, 370, 320);
            } else if (var2 == 4) {
               this.jn[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
               this.jn[var2].setBounds(421, 55, 200, 320);
            }
         } else {
            var10000 = 1 ^ 3;
            this.jn[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, false));
            this.jn[var2].setBounds(53, 307, 309, 54);
            Class216[] var10 = new Class216[var10000];
            boolean var11 = true;
            Class216[] var4 = var10;

            int var3;
            for(var10000 = var3 = 0; var10000 < var4.length; var10000 = var3) {
               var4[var3] = new Class216(var3 == 0 ? "sc/e/47.png" : "sc/e/48.png", 1, var3, this);
               var4[var3].setBounds(361, 309 + var3 * 32, 18, 18);
               this.ko.add(var4[var3++]);
            }

            this.kc = new Class132(1, this, 6, 1, 51, 51, 0, 0, 54, 309);
            this.kc.hf(Class511.a("sc/d/18.png"));
            this.kc.aiw(var4, 1);
            this.ko.add(this.kc);
         }

         ++var2;
      }

      var6 = new Class322[5];
      var10003 = true;
      this.kn = var6;

      Class130 var14;
      for(var10000 = var2 = 0; var10000 < this.kn.length; var10000 = var2) {
         if (var2 != 0 && var2 != 1) {
            var5 = this.kn;
            Class322 var12 = new Class322;
            String var10004 = var2 == 2 ? "sc/e/7.png" : "sc/e/31.png";
            var10006 = 245 + var2;
            var10007 = Class681.ak;
            if (var2 == 2) {
               var10009 = "搜索";
               var10010 = this;
            } else if (var2 == 3) {
               var10009 = "收购";
               var10010 = this;
            } else if (var2 == 4) {
               var10009 = "取消";
               var10010 = this;
            } else {
               var10009 = "";
               var10010 = this;
            }

            var12.<init>(var10004, 1, var10006, var10007, (Color[])null, var10009, var10010);
            var5[var2] = var12;
            this.kn[var2].setForeground(Color.black);
            if (var2 == 2) {
               var14 = this;
               this.kn[var2].setBounds(570, 254, 59, 25);
            } else {
               var14 = this;
               this.kn[var2].setBounds(544, 321 + (var2 - 3) * 28, 79, 25);
            }
         } else {
            this.kn[var2] = new Class322(var2 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, 245 + var2, this);
            var14 = this;
            this.kn[var2].setBounds(41 + var2 * 32, 382, 18, 18);
         }

         var14.km.add(this.kn[var2++]);
      }

      var8 = new JLabel[6];
      var10003 = true;
      this.jl = var8;

      for(var10000 = var2 = 0; var10000 < this.jl.length; var10000 = var2) {
         this.jl[var2] = Class133.b(41, 54, 282, 21, Color.white, Class681.ak);
         this.jl[var2].setText(var2 == 0 ? "我的收购" : (var2 == 1 ? "列表" : (var2 == 2 ? "详细物品" : (var2 == 3 ? "单价" : (var2 == 4 ? "总价" : (var2 == 5 ? "现金" : ""))))));
         this.jl[var2].setHorizontalAlignment(0);
         if (var2 == 1) {
            var14 = this;
            this.jl[var2].setBounds(327, 54, 132, 21);
         } else if (var2 == 2) {
            var14 = this;
            this.jl[var2].setBounds(462, 54, 166, 21);
         } else {
            if (var2 >= 3 && var2 <= 5) {
               this.jl[var2].setBounds(398, 295 + (var2 - 3) * 28, 36, 19);
               this.jl[var2].setForeground(Color.black);
            }

            var14 = this;
         }

         var14.km.add(this.jl[var2++]);
      }

      this.js = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, false), Class681.q, Color.white);
      this.jm = Class133.n(Class511.q(Class424.iIiiIiiiiiiI("sc/d/17.png"), 6, 6, 6, 6, false), Class681.q, Color.white);
      this.kk = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, false), Class681.q, Color.white);
      this.js.setBounds(463, 257, 104, 19);
      this.jm.setBounds(336, 351, 58, 19);
      this.kk.setBounds(434, 295, 104, 19);
      this.ka = Class133.a(434, 323, 104, 19, 10, Color.white, Class681.q);
      this.ka.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
      this.jh = Class133.m(434, 351, 104, 19, 10, Color.white, Class681.q, this.jp, var1);
      this.jh.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
      this.jh.ab(2);
      this.km.add(this.js);
      this.km.add(this.jm);
      this.km.add(this.kk);
      this.km.add(this.ka);
      this.km.add(this.jh);
      this.kf = new Class319(15, this.jm, this);
      this.jy = new Class319(15, this.kk, this);
      this.kq = new Class290(this);
      this.kp = new Class290(this);
      this.kq.ce().setBounds(329, 75, 130, 204);
      this.kp.ce().setBounds(464, 75, 164, 174);
      this.km.add(this.kq.ce());
      this.km.add(this.kp.ce());
      <undefinedtype>[] var13 = new <undefinedtype>[10];
      var10003 = true;
      this.kb = var13;

      for(var10000 = var2 = 0; var10000 < this.kb.length; var10000 = var2) {
         this.kb[var2] = new MouseListener() {
            private <undefinedtype> ajs;
            private Class44 qm;
            private JLabel bd;
            private JLabel ir;
            private Class436 bl;
            private Class245 abf;

            public void mouseReleased(MouseEvent var1) {
               Class130.this.fo((StallBuyData)null, (StallNeedBean)this.qm.hr());
            }

            public void mousePressed(MouseEvent var1) {
            }

            public {
               int var10008 = 54 & 127;
               int var10010 = 103 & 30;
               int var10012 = 124 & 59;
               this.ajs = this;
               this.ir = Class133.b(var10012, 45 & 90, 124 & 75, 24 & 119, Color.black, Class681.ab);
               this.bd = Class133.b(var10010, 95 & 38, 106 & 61, 47 & 94, Color.white, Class681.ab);
               this.abf = Class133.a(var10008, 88 & 63, 123 & 76, 119 & 27, 15 & 122, Color.white, Class681.q);
               this.abf.eq(Class511.q("sc/d/17.png", 71 & 62, 71 & 62, 71 & 62, 71 & 62, (boolean)(3 >> 2)));
               this.qm = new Class44(Class130.this.gk()) {
                  public void af(MouseEvent var1) {
                     ajs.mouseReleased(var1);
                  }
               };
               this.qm.fw("sc/d/81.png");
               this.qm.setBounds(--5, --5, 63 & 108, 63 & 108);
               this.bl = new Class436(Class511.q("sc/d/36.png", 61 & 86, 61 & 86, 61 & 86, 61 & 86, (boolean)(5 >> 3)));
               this.bl.setBounds(5 >> 3, 5 >> 3, 134, 54);
               this.add(this.ir);
               this.add(this.bd);
               this.add(this.abf);
               this.add(this.qm);
               this.add(this.bl);
               this.addMouseListener(this);
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void aai(StallNeedBean var1) {
               if (var1 != null && var1.getTotal() - var1.getNum() > 0) {
                  StallBuyData var2 = Class130.this.vc().an(var1.getId());
                  this.qm.c(27 & 125, var1);
                  this.ir.setText(var2 != null ? var2.getName() : "未知物品");
                  int var10001 = 3 & 5;
                  this.bd.setText(String.valueOf(var1.getTotal() - var1.getNum()));
                  this.abf.setText(String.valueOf(var1.getMoney()));
                  this.setVisible((boolean)var10001);
               } else {
                  int var10003 = 3 ^ 3;
                  this.qm.c(3 ^ 3, (Object)null);
                  this.setVisible((boolean)var10003);
               }
            }

            public void mouseClicked(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }
         };
         this.kb[var2].setBounds(46 + var2 % 2 * 138, 79 + var2 / 2 * 61, 134, 54);
         this.km.add(this.kb[var2++]);
      }

      this.jz = new Class44(this);
      this.jz.setBounds(339, 294, 50, 50);
      this.km.add(this.jz);
      var9 = new Class436[9];
      var10003 = true;
      this.cs = var9;

      for(var10000 = var2 = 0; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         if (var2 == 0) {
            var14 = this;
            this.cs[var2].fw("sc/d/4.png");
            this.cs[var2].setBounds(335, 290, 59, 57);
         } else if (var2 == 1) {
            var14 = this;
            this.cs[var2].fw("sc/d/30.png");
            this.cs[var2].setBounds(336, 347, 58, 1);
         } else {
            label313: {
               if (var2 >= 2 && var2 <= 4) {
                  this.cs[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
                  if (var2 == 2) {
                     var14 = this;
                     this.cs[var2].setBounds(41, 54, 282, 21);
                     break label313;
                  }

                  if (var2 == 3) {
                     var14 = this;
                     this.cs[var2].setBounds(327, 54, 132, 21);
                     break label313;
                  }

                  if (var2 == 4) {
                     var14 = this;
                     this.cs[var2].setBounds(462, 54, 166, 21);
                     break label313;
                  }
               } else if (var2 >= 5 && var2 <= 6) {
                  this.cs[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
                  if (var2 == 5) {
                     var14 = this;
                     this.cs[var2].setBounds(327, 54, 132, 227);
                     break label313;
                  }

                  if (var2 == 6) {
                     var14 = this;
                     this.cs[var2].setBounds(462, 54, 166, 197);
                     break label313;
                  }
               } else {
                  if (var2 == 7) {
                     var14 = this;
                     this.cs[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
                     this.cs[var2].setBounds(327, 282, 305, 100);
                     break label313;
                  }

                  if (var2 == 8) {
                     this.cs[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
                     this.cs[var2].setBounds(41, 54, 282, 328);
                  }
               }

               var14 = this;
            }
         }

         var14.km.add(this.cs[var2++]);
      }

   }

   public JComponent dl() {
      return this.km;
   }

   public void as(int var1) {
      int var10000 = 3 ^ 3;
      this.jf = var1;

      for(var1 = var10000; var10000 < this.kh.length; var10000 = var1) {
         this.kh[var1].setKeep((boolean)(var1 == this.jf ? 5 >> 2 : 0));
         ++var1;
      }

      this.kc.aiz().i(2 & 5);
      this.kc.as(--1 + this.jf);
   }

   public void fm(StallBean var1) {
      RoleData var5 = this.vd();

      int var10000;
      int var2;
      Commodity var3;
      for(var10000 = var2 = 5 >> 3; var10000 < this.kj.getGoodstables().length; var10000 = var2) {
         if ((var3 = this.kj.getGoodstables()[var2]) != null) {
            Goodstable var4;
            Goodstable var7 = var4 = var5.getGood(var3.getGood().getRgid());
            var7.ab(var3.getGood().getUsetime());
            if (var7.getUsetime() <= 0) {
               var5.h(var4.getRgid());
            }
         }

         ++var2;
      }

      for(var10000 = var2 = 2 & 5; var10000 < this.kj.getPets().length; var10000 = var2) {
         if ((var3 = this.kj.getPets()[var2]) != null) {
            RolePet var6 = var5.getRolePet(var3.getPet().getSid().longValue());
            var5.pets.remove(var6);
            if (var5.bj(var6.getId())) {
               var5.setChosePetId((BigDecimal)null);
            }
         }

         ++var2;
      }

   }

   public void fn(Lingbao var1) {
   }

   public void fo(StallBuyData var1, StallNeedBean var2) {
      StallBuyData var10000;
      if (var2 != null) {
         var10000 = var1 = this.vc().an(var2.getId());
      } else {
         if (var1 != null) {
            var2 = this.kj.getStallNeedBean(var1.getId());
         }

         var10000 = var1;
      }

      if (var10000 == null) {
         this.jz.c(3 & 4, (Object)null);
         this.kk.setText("");
         this.jm.setText("");
         this.kn[--3].setVisible((boolean)(3 ^ 3));
         this.kn[--4].setVisible((boolean)(3 ^ 3));
      } else if (var2 != null) {
         this.jz.c(90 & 61, var1);
         this.kk.setText(String.valueOf(var2.getMoney()));
         this.jm.setText("1");
         this.kn[--3].setText("更新");
         this.kn[--3].setVisible((boolean)(--1));
         this.kn[--4].setVisible((boolean)(5 >> 2));
      } else {
         this.jz.c(60 & 91, var1);
         this.kk.setText("");
         this.jm.setText("1");
         this.kn[--3].setText("收购");
         this.kn[--3].setVisible((boolean)(3 & 5));
         this.kn[--4].setVisible((boolean)(3 >> 2));
      }
   }

   public void y(int param1) {
      // $FF: Couldn't be decompiled
   }
}
