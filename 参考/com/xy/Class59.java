package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.MsgUntil;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class59 extends Class456 {
   private JScrollPane za;
   private MoneyType rn;
   private Class436[] nn;
   private RichLabel dr;
   private <undefinedtype>[] ajf;
   private JLabel[] ai;
   private Class643[] aja;
   private Class390 ajg;
   private Class556 ks;
   private RichLabel bw;
   private Class195 ajh;
   private JScrollPane af;

   public void cl(RoleData var1) {
      StringBuffer var2 = new StringBuffer();
      int var10000 = 3 ^ 3;
      PropertyUtil.getMountSHZTString(var1, var2, (boolean)(3 >> 2));
      this.bw.setTextSize(var2.toString(), 32733 & 234);
      this.za.getVerticalScrollBar().setMaximum(this.bw.getHeight());
      this.za.getVerticalScrollBar().setValue((5 >> 1) + (55 & 90) * Math.max(3 & 4, var1.getMountSHByindex(3 & 4).getLvl() - (5 >> 2)));
      var2.setLength(3 >> 2);
      PropertyUtil.getMountSHZTString(var1, var2, (boolean)(4 ^ 5));
      this.dr.setTextSize(var2.toString(), 5867 & 27100);
      this.af.getVerticalScrollBar().setMaximum(this.dr.getHeight());
      this.af.getVerticalScrollBar().setValue(2 & 5);
      BaseMountSH var4 = var1.getMountSHByindex(var10000);

      int var3;
      for(var10000 = var3 = 5 >> 3; var10000 < this.ajf.length; var10000 = var3) {
         <undefinedtype> var5 = this.ajf[var3];
         int var10001;
         BaseMountSH var10002;
         if (var3 < var4.getUnlock()) {
            var10001 = --1;
            var10002 = var4;
         } else {
            var10001 = 0;
            var10002 = var4;
         }

         ++var3;
         var5.lc((boolean)var10001, var10002, var1);
      }

   }

   public void ax(Goodstable var1) {
      if (this.ajg != null) {
         this.ak((boolean)(5 >> 3));
         int var2 = (Integer)this.ajg.qd;
         this.ajh.aej.aal(new ConfirmBean(46 & 113, "SHXQ" + var2 + "|" + var1.getRgid(), "#W确定将守护石移入守护槽？"));
      }
   }

   public void ak(boolean var1) {
      if (this.ajg != null) {
         if (var1) {
            this.ajg.setBounds(18426 & 14653, 87 & 125, 31567 & 1530, 18902 & 14015);
         }

         this.ajg.setVisible(var1);
      }
   }

   public void ab(int var1) {
      if (this.ajg == null) {
         this.ajg = new Class390(this.ajh);
         long[] var10004 = new long[--1];
         boolean var10006 = true;
         var10004[3 >> 2] = 108L;
         this.ajg.cw.ud(var10004);
         this.ajg.qd = var1;
         this.add(this.ajg, 2 & 5);
         this.ak((boolean)(3 & 5));
      } else {
         this.ajg.qd = var1;
         this.ak((boolean)(this.ajg.isVisible() ? 3 >> 2 : 1));
      }
   }

   public Class59(Class195 var1) {
      int var10001 = --3;
      super();
      this.ajh = var1;
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.ai = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.ai.length; var10000 = var2) {
         JLabel[] var3 = this.ai;
         int var10002 = 21167 & 12145;
         int var9 = 63 & 89;
         int var10004 = 93 & 106;
         int var10005 = 27 & 119;
         Color var10006;
         int var10007;
         if (var2 == 0) {
            var10006 = Color.black;
            var10007 = var2;
         } else {
            var10006 = Class681.c("#cCCC09F");
            var10007 = var2;
         }

         var3[var2] = Class133.b(var10002, var9, var10004, var10005, var10006, var10007 == 0 ? Class681.ak : Class681.cm);
         this.ai[var2].setText(var2 == 0 ? "守护之尘" : (var2 == (2 ^ 3) ? "等级属性" : (var2 == --2 ? "加成总览" : "")));
         this.ai[var2].setHorizontalAlignment(5 >> 3);
         if (var2 >= 5 >> 2 && var2 <= --2) {
            this.ai[var2].setBounds((27466 & 5631) + (15870 & 17127) * (var2 - (5 >> 2)), 19295 & 13795, 78 & 125, 19 & 127);
         }

         this.add(this.ai[var2++]);
      }

      var10001 = --2;
      int var10 = 7919 & 25470;
      this.rn = new MoneyType();
      this.rn.setIdAndKey(3 ^ 3, "守护之尘");
      this.ks = Class133.m(var10, 59 & 93, 90 & 111, 23 & 123, 90 & 47, Color.white, Class681.q, this.rn, var1.aej);
      this.ks.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
      this.add(this.ks);
      int var10008 = 31733 & 1534;
      int var10010 = 12655 & 20382;
      this.bw = new RichLabel("", Class681.q);
      this.dr = new RichLabel("", Class681.q);
      this.za = Class133.f(var10010, 343, 205, 74, this.bw, -4 >> 2);
      this.af = Class133.f(var10008, 343, 205, 74, this.dr, -4 >> 2);
      this.za.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/168.png", --3, --3, --3, --3, (boolean)(3 ^ 3)), 6));
      this.af.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/168.png", --3, --3, --3, --3, (boolean)(3 ^ 3)), 6));
      this.add(this.za);
      this.add(this.af);
      Class643[] var6 = new Class643[var10001];
      var10003 = true;
      this.aja = var6;

      Class59 var5;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.aja.length; var10000 = var2) {
         this.aja[var2] = new Class643(var2 == 0 ? "sc/e/175.png" : "sc/e/176.png", 1, 192 + var2, var1);
         if (var2 == 0) {
            var5 = this;
            this.aja[var2].setBounds(258, 281, 81, 26);
         } else {
            if (var2 == --1) {
               this.aja[var2].setBounds(615, 281, 81, 26);
            }

            var5 = this;
         }

         var5.add(this.aja[var2++]);
      }

      <undefinedtype>[] var7 = new <undefinedtype>[7];
      var10003 = true;
      this.ajf = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.ajf.length; var10000 = var2) {
         this.ajf[var2] = new Class456(var2) {
            private JLabel at;
            private int ay;
            private Class44 cn;
            private Class436 bl;
            private Class44 it;

            public void lc(boolean var1, BaseMountSH var2, RoleData var3) {
               if (var1) {
                  BaseMountSkill var4;
                  BaseMountSkill var10000 = var4 = var2.getMounts()[this.ay];
                  this.it.eq(Class511.q("sc/d/160.png", 11 & 126, 11 & 126, 11 & 126, 11 & 126, (boolean)(2 & 5)));
                  <undefinedtype> var6;
                  if (var10000.getB1() > 0) {
                     Mount var5 = var3.getMount(var4.getB1());
                     this.it.ach(Class222.d(var3.getLoginResult().getRace_id().intValue(), var4.getB1()));
                     this.at.setForeground(Class681.c("#cCEB987"));
                     this.at.setText(var5 != null ? var5.getMountname() : MsgUntil.b(var4.getB1()) + "坐骑");
                     var6 = this;
                  } else {
                     var6 = this;
                     this.it.cc();
                     this.at.setText((String)null);
                  }

                  var6.cn.fx(var4.getB2() > 0 ? "sc/e/182.png" : "sc/e/183.png");
                  this.cn.setVisible((boolean)(2 ^ 3));
               } else {
                  this.it.eq(Class511.q("sc/d/161.png", 63 & 74, 63 & 74, 63 & 74, 63 & 74, (boolean)(3 & 4)));
                  this.it.cc();
                  this.cn.setVisible((boolean)(2 & 5));
                  this.at.setForeground(Class681.c("#c959595"));
                  this.at.setText((this.ay == 0 ? "3" : (this.ay == (2 ^ 3) ? "6" : (this.ay == --2 ? "9" : (this.ay == --3 ? "12" : (this.ay == --4 ? "16" : (this.ay == --5 ? "20" : (this.ay == (79 & 54) ? "24" : ""))))))) + "级可解锁");
               }
            }

            public void fv(MouseEvent var1) {
               BaseMountSH var3 = Class59.this.ajh.vd().getMountSHByindex(3 ^ 3);
               if (this.ay < var3.getUnlock()) {
                  BaseMountSkill var4;
                  if ((var4 = var3.getMounts()[this.ay]).getB2() > 0) {
                     Goodstable var2;
                     if ((var2 = Class59.this.ajh.vc().n(new BigDecimal(32727 & 25338))) != null && var2.getType() == 108L) {
                        var4.c(var2);
                        ((Class270)Class59.this.ajh.ve().e(127 & 46)).oj(var2, (boolean)(2 & 5));
                     }
                  }
               }
            }

            public void fy(MouseEvent var1) {
               RoleData var5;
               BaseMountSH var2 = (var5 = Class59.this.ajh.vd()).getMountSHByindex(5 >> 3);
               if (this.ay < var2.getUnlock()) {
                  if (var2.getMounts()[this.ay].getB1() > 0) {
                     Class59.this.ajh.aej.aal(new ConfirmBean(37 & 122, "SHGZ0|0|" + this.ay, "#W坐骑移出守护槽后，将失去#G守护石加持#W。"));
                  } else {
                     ((Class99)Class59.this.ajh.ve().e(2285 & 30655)).cf(5 >> 3, this.ay);
                  }
               } else {
                  Goodstable var3;
                  if ((var3 = var5.az(107L)) == null) {
                     Class59.this.ajh.aej.f("没有足够的灵元晶");
                  } else {
                     String var4 = Agreement.getSendTextAES("usermount", "SHUN0|" + var3.getRgid());
                     var5.getGameView().getClient().d(var4);
                  }
               }
            }

            public void af(MouseEvent var1) {
               BaseMountSH var2 = Class59.this.ajh.vd().getMountSHByindex(2 & 5);
               if (this.ay < var2.getUnlock()) {
                  if (var2.getMounts()[this.ay].getB2() > 0) {
                     Class59.this.ajh.aej.aal(new ConfirmBean(54 & 105, "SHXQ" + this.ay, "#W确定花费#G50W#W银两将守护石移出守护槽？"));
                  } else {
                     Class59.this.ab(this.ay);
                  }
               }
            }

            public {
               int var10006 = 5 >> 3;
               this.ay = var2;
               this.it = new Class44(Class59.this.ajh) {
                  public void af(MouseEvent var1) {
                     fy(var1);
                  }
               };
               this.it.eq(Class511.q("sc/d/161.png", 91 & 46, 91 & 46, 91 & 46, 91 & 46, (boolean)(3 ^ 3)));
               this.it.ad(Class44.aqy);
               this.it.setBounds(30 & 125, 5 >> 3, 127 & 58, 127 & 58);
               this.cn = new Class44(Class59.this.ajh) {
                  public void mouseExited(MouseEvent var1) {
                     this.vu(Boolean.FALSE);
                     this.aqz = Boolean.FALSE;
                     this.ars.ve().n(46 & 127);
                  }

                  public void af(MouseEvent var1) {
                     af(var1);
                  }

                  public void mouseEntered(MouseEvent var1) {
                     this.aqz = Boolean.TRUE;
                     fv(var1);
                  }
               };
               this.cn.setBounds(107 & 86, 55 & 110, 55 & 104, 55 & 104);
               this.at = Class133.b(var10006, 95 & 102, 127 & 115, 126 & 23, Color.white, Class681.q);
               this.at.setHorizontalAlignment(3 ^ 3);
               this.bl = new Class436("sc/d/163.png");
               this.bl.setBounds(46 & 91, 87 & 110, 95 & 127, 86 & 63);
               this.add(this.cn);
               this.add(this.it);
               this.add(this.at);
               this.add(this.bl);
            }
         };
         if (var2 == 0) {
            var5 = this;
            this.ajf[var2].setBounds(420, 66, 115, 92);
         } else if (var2 == (4 ^ 5)) {
            var5 = this;
            this.ajf[var2].setBounds(320, 82, 115, 92);
         } else if (var2 == (1 ^ 3)) {
            var5 = this;
            this.ajf[var2].setBounds(238, 138, 115, 92);
         } else if (var2 == --3) {
            var5 = this;
            this.ajf[var2].setBounds(363, 199, 115, 92);
         } else if (var2 == --4) {
            var5 = this;
            this.ajf[var2].setBounds(482, 199, 115, 92);
         } else if (var2 == --5) {
            var5 = this;
            this.ajf[var2].setBounds(606, 138, 115, 92);
         } else {
            if (var2 == 6) {
               this.ajf[var2].setBounds(520, 82, 115, 92);
            }

            var5 = this;
         }

         var5.add(this.ajf[var2++]);
      }

      Class436[] var8 = new Class436[--4];
      var10003 = true;
      this.nn = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.nn.length; var10000 = var2) {
         this.nn[var2] = new Class436();
         if (var2 >= 0 && var2 <= 3 >> 1) {
            var5 = this;
            this.nn[var2].fw("sc/d/167.png");
            this.nn[var2].setBounds(267 + var2 * 230, 330, 195, --5);
         } else {
            if (var2 >= --2 && var2 <= 3) {
               this.nn[var2].fw("sc/d/164.png");
               this.nn[var2].setBounds(258 + (var2 - 2) * 230, 317, 221, 123);
            }

            var5 = this;
         }

         var5.add(this.nn[var2++]);
      }

      this.setBounds(5 >> 3, 5 >> 3, 743, 519);
   }
}
