package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.readbean.RoleSuitBean;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class218 extends Class345 {
   private <undefinedtype>[] aac;
   private Class436[] aad;
   private DefaultListModel<String> aae;
   private MoneyType ca;
   private Class319 aaf;
   private boolean gu;
   private JScrollPane ea;
   private JLabel[] er;
   private JList<String> fj;
   private int fk;
   private Class489[] aag;
   public int j;
   private Class245[] nr;
   private Class556 ys;
   private int m;

   public void y(int var1) {
      RoleData var4;
      LoginResult var3 = (var4 = this.vd()).getLoginResult();
      String var6;
      if (var1 == (31 & 111)) {
         BigDecimal var10 = new BigDecimal(this.uw().gameType == 5 >> 1 ? 20000000 : 100000000);
         if (var3.getGold().compareTo(var10) < 0) {
            this.aej.fw("需要" + var10.longValue() / 10000L + "W金币才能增加上限..");
         } else {
            int var13 = var4.getPackRecord().getSuitNum() + (5 >> 2);
            var4.getPackRecord().setSuitNum(var13);
            ParamTool.c(var10.longValue(), this.aej);
            var6 = Agreement.getSendTextAES("1", "3" + var13);
            this.uw().d(var6);
            this.nr[2 & 5].setText(this.j + "/" + var4.getPackRecord().getSuitNum());
         }
      } else if (this.fk != 0) {
         SuitOperBean var8;
         PartJade var12;
         if (var1 == (79 & 62)) {
            if (this.m == -4 >> 2) {
               this.aej.fw("请选择你要激活的玉符..");
            } else if ((new BigDecimal(500000)).compareTo(var3.getGold()) > 0) {
               this.aej.fw("金币不足..");
            } else if (200L > var3.getScoretype("灵修值").longValue()) {
               this.aej.fw("灵修值不足，快去获取吧..");
            } else if (var4.getPackRecord().d(this.fk, this.m) != null) {
               this.aej.fw("没有可激活的部件..");
            } else {
               var8 = new SuitOperBean();
               var12 = new PartJade((long)this.fk, this.m);
               var12.setJade1(3 & 4);
               var8.setJade(var12);
               var8.setType(92 & 43);
               var6 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var8));
               this.uw().d(var6);
               var3.setGold(var3.getGold().subtract(new BigDecimal(500000)));
               var3.setScore(Class509.h(var3.getScore(), "灵修值=200", --3));
               this.aej.fw("消耗了200点灵修值    扣除了50W金币..");
               this.aag[5 >> 3].setBtn(-4 >> 2, "sc/e/54.png");
               this.aag[2 & 5].setForeground(Color.GRAY);
            }
         } else {
            int var10002;
            if (var1 == (95 & 49)) {
               var8 = new SuitOperBean();
               var12 = new PartJade((long)this.fk, 3 >> 2);
               var10002 = 15 & 120;
               var8.setJade(var12);
               var8.setType(var10002);
               var6 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var8));
               this.uw().d(var6);
            } else {
               if (var1 == (95 & 51)) {
                  if (this.m == -4 >> 2) {
                     this.aej.fw("请选择你要生成的玉符..");
                     return;
                  }

                  if (!this.gu) {
                     this.aej.fw("你还没收录过此玉符..");
                     return;
                  }

                  int var2;
                  if ((var2 = (int)this.aaf.gl()) <= 0) {
                     this.aej.fw("请输入你要生成的玉符数量..");
                     return;
                  }

                  long var5 = (long)(this.uw().n(--2, 60 & 79) ? 100000 : 1000000);
                  BigDecimal var7 = new BigDecimal(var5 * (long)var2);
                  BigDecimal var11 = new BigDecimal((106 & 31) * var2);
                  if (var7.compareTo(var3.getGold()) > 0) {
                     this.aej.fw("金币不足..");
                     return;
                  }

                  if (var11.compareTo(var3.getScoretype("灵修值")) > 0) {
                     this.aej.fw("灵修值不足，快去获取吧..");
                     return;
                  }

                  (var12 = new PartJade((long)this.fk, this.m)).setJade(3 & 5, var2);
                  var8 = new SuitOperBean();
                  var10002 = 73 & 63;
                  var8.setJade(var12);
                  var8.setType(var10002);
                  String var9 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var8));
                  this.uw().d(var9);
                  var3.setGold(var3.getGold().subtract(var7));
                  var3.setScore(Class509.h(var3.getScore(), "灵修值=" + var11, --3));
                  this.aej.fw("消耗了" + var11 + "点灵修值    扣除了" + var7.longValue() / 10000L + "W金币..");
                  this.aaf.jj().setText("0");
               }

            }
         }
      }
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(4 ^ 5);
   }

   public void fr(Class44 var1) {
      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.aac.length; var10000 = var2) {
         <undefinedtype> var8 = this.aac[var2];
         ++var2;
         var8.cn.setBorder(BorderFactory.createEmptyBorder());
      }

      var1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5 >> 1));
      PartJade var6 = (PartJade)var1.hr();
      this.m = var6.getPartId();
      int[] var5 = this.vc().bx((int)var6.getSuitid()).getParts();
      String[] var7 = this.vd().getPackRecord().getCollect(this.fk);
      String var3 = String.valueOf(this.m);
      int var4;
      var10000 = var4 = 3 & 4;

      String var9;
      while(true) {
         if (var10000 >= var7.length) {
            var9 = var3;
            break;
         }

         if (var7[var4].equals(var3)) {
            var9 = var3 = null;
            break;
         }

         ++var4;
         var10000 = var4;
      }

      Class218 var10;
      int var10003;
      if (var9 == null) {
         this.aag[3 ^ 3].setBtn(-4 >> 2, "sc/e/54.png");
         var10 = this;
         var10003 = 4 ^ 5;
         this.aag[5 >> 3].setForeground(Color.GRAY);
         this.gu = (boolean)var10003;
      } else if (var7.length + (5 >> 2) == var5.length) {
         this.aag[3 & 4].setBtn(--1, "sc/e/6.png");
         var10 = this;
         int var10005 = 5 >> 3;
         var10003 = 5 >> 3;
         this.aag[var10005].setForeground(Color.WHITE);
         this.gu = (boolean)var10003;
      } else {
         var10 = this;
         this.aag[5 >> 3].setBtn(-4 >> 2, "sc/e/54.png");
         var10003 = 3 >> 2;
         this.aag[3 & 4].setForeground(Color.GRAY);
         this.gu = (boolean)var10003;
      }

      var10.aaf.jj().setText("0");
   }

   public void ql(RoleSuitBean var1) {
      this.fk = var1 != null ? var1.getSuitID() : 0;
      int var10002 = 3 ^ 3;
      this.m = -4 >> 2;
      this.gu = (boolean)var10002;
      this.aag[2 & 5].setBtn(-4 >> 2, "sc/e/54.png");
      int var10001 = 3 & 4;
      this.aag[3 & 4].setForeground(Color.GRAY);
      this.aaf.jj().setText("0");
      this.ys.cc();
      int var2 = var10001;

      int var10000;
      for(var10000 = var2; var10000 < this.aac.length; var10000 = var2) {
         this.aac[var2++].q();
      }

      if (var1 != null) {
         int[] var7 = var1.getParts();
         String[] var6 = this.vd().getPackRecord().getCollect(this.fk);

         int var3;
         for(var10000 = var3 = 3 & 4; var10000 < var7.length && var3 < this.aac.length; var10000 = var3) {
            String var4 = String.valueOf(var7[var3]);
            int var5;
            var10000 = var5 = 3 >> 2;

            Class218 var9;
            while(true) {
               if (var10000 >= var6.length) {
                  var9 = this;
                  break;
               }

               if (var6[var5].equals(var4)) {
                  var4 = null;
                  var9 = this;
                  break;
               }

               ++var5;
               var10000 = var5;
            }

            var9.aac[var3].ir.setText(var4 != null ? "0" : "1");
            PartJade var8;
            (var8 = new PartJade((long)this.fk, var7[var3])).setJade1(var4 != null ? 3 >> 2 : 1);
            this.aac[var3].cn.c(111 & 31, var8);
            <undefinedtype> var10 = this.aac[var3];
            ++var3;
            var10.cn.setBorder(BorderFactory.createEmptyBorder());
         }

      }
   }

   public void d() {
      this.ql((RoleSuitBean)null);
      Class603 var4 = this.vc();
      RoleData var2;
      List var3;
      this.j = (var3 = (var2 = this.vd()).getPackRecord().f()) != null ? var3.size() : 0;
      int var10000 = 3 & 4;
      this.aae.removeAllElements();

      for(int var1 = var10000; var10000 < this.j; var10000 = var1) {
         RoleSuitBean var5;
         if ((var5 = var4.bx((Integer)var3.get(var1))) != null) {
            this.aae.addElement(var5.getSname());
         }

         ++var1;
      }

      this.nr[2 & 5].setText(this.j + "/" + var2.getPackRecord().getSuitNum());
   }

   public void z(long var1, JTextField var3) {
      if (var1 > 0L && this.m != -4 >> 2 && this.gu) {
         long var4 = (long)(this.uw().n(5 >> 1, 77 & 62) ? 100000 : 1000000);
         Class681.j(this.nr[3 >> 1], var4 * var1);
         Class681.j(this.nr[--2], 10L * var1);
      } else {
         Class681.j(this.nr[3 >> 1], 0L);
         Class681.j(this.nr[1 ^ 3], 0L);
      }
   }

   public void q() {
      this.d();
      super.q();
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.m != -4 >> 2 && this.gu) {
         long var4 = (long)(this.uw().n(1 ^ 3, 78 & 61) ? 100000 : 1000000);
         RoleData var10000 = this.vd();
         var4 = var10000.getLoginResult().getGold().longValue() / var4;
         long var6 = var10000.getLoginResult().getScoretype(this.ca.getKey()).longValue() / 10L;
         var4 = Math.min(var4, var6);
         if (var1 > var4 && var4 <= 999L) {
            return var4;
         } else {
            return var1 > 999L ? 999L : null;
         }
      } else {
         return 0L;
      }
   }

   public Class218(GameView var1) {
      int var10001 = 78 & 55;
      int var10005 = 111 & 63;
      int var10019 = -4 >> 2;
      super(113 & 79, 5 >> 1, Class345.aef, var1);
      this.va(var10019, 3 & 4, 5116 & 28203, 1023 & 32185, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 125 & 70, 125 & 70, 125 & 70, 125 & 70, (boolean)(5 >> 3)), "已有符录");
      this.aae = new DefaultListModel();
      this.fj = new JList();
      this.fj.setOpaque((boolean)(3 ^ 3));
      this.fj.setSelectionBackground(new Color(109 & 51, 111 & 58, 117 & 62));
      this.fj.setSelectionForeground(Color.white);
      this.fj.setForeground(Color.white);
      this.fj.setFont(Class681.bx);
      this.fj.setBackground(Class681.cu);
      this.fj.setModel(this.aae);
      this.fj.setSelectionMode(3 ^ 3);
      this.fj.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               RoleSuitBean var2;
               if ((var2 = Class218.this.vc().v().a((String)Class218.this.fj.getSelectedValue())) == null) {
                  return;
               }

               Class218.this.ql(var2);
            }

         }
      });
      this.ea = Class133.f(var10005, 59 & 110, 3815 & 29117, 19454 & 13631, this.fj, -4 >> 2);
      this.add(this.ea);
      Class489[] var7 = new Class489[var10001];
      boolean var10003 = true;
      this.aag = var7;

      int var2;
      Class218 var6;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.aag.length; var10000 = var2) {
         Class489[] var5 = this.aag;
         Class489 var10002 = new Class489;
         var10005 = 3 & 5;
         int var10006 = (47 & 94) + var2;
         Font var10007 = Class681.ak;
         String var10009;
         Class218 var10010;
         if (var2 == 0) {
            var10009 = "激活";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "获得";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "删除";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "收录";
            var10010 = this;
         } else if (var2 == --5) {
            var10009 = "生成玉符";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/6.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.aag[var2].setBounds(29183 & 4014, 26865 & 6095, 98 & 63, 18);
         if (var2 == 0) {
            var6 = this;
            this.aag[var2].setFont(Class681.bm);
         } else if (var2 == (3 & 5)) {
            var6 = this;
            this.aag[var2].setImage("sc/e/60.png");
            this.aag[var2].setBounds(194, 367, 18, 18);
         } else if (var2 == --2) {
            var6 = this;
            this.aag[var2].setFont(Class681.bm);
            this.aag[var2].setBounds(473, 368, 34, 18);
         } else if (var2 != --3 && var2 != --4) {
            if (var2 == --5) {
               this.aag[var2].setForeground(Color.black);
               this.aag[var2].setImage("sc/e/26.png");
               this.aag[var2].setBounds(329, 395, 99, 25);
            }

            var6 = this;
         } else {
            var6 = this;
            this.aag[var2].setForeground(Color.black);
            this.aag[var2].setImage("sc/e/7.png");
            this.aag[var2].setBounds(65 + (var2 - --3) * 71, 395, 59, 25);
         }

         var6.add(this.aag[var2++]);
      }

      JLabel[] var8 = new JLabel[9];
      var10003 = true;
      this.er = var8;

      for(var10000 = var2 = 3 >> 2; var10000 < this.er.length; var10000 = var2) {
         this.er[var2] = Class133.c(45, 21, 165, 21, 10, Class681.c("#c000000"), Class681.ak);
         this.er[var2].setText(var2 == 0 ? "已收录套装名" : (var2 == (2 ^ 3) ? "已收录玉符部件" : (var2 == 5 >> 1 ? "可收录套数" : (var2 == --3 ? "生成个数：" : (var2 == --4 ? "所需金钱：" : (var2 == --5 ? "所需灵修值：" : (var2 == 6 ? "现有灵修值：" : (var2 == 7 ? "同一套装仅一个部件未收录时，点击      获得" : (var2 == 8 ? "使用符录可以生产对应的玉符" : "")))))))));
         if (var2 == 0) {
            this.er[var2].setForeground(Class681.c("#cFFFFFF"));
            this.er[var2].setHorizontalAlignment(3 ^ 3);
         }

         if (var2 == (4 ^ 5)) {
            var6 = this;
            this.er[var2].setForeground(Class681.c("#cFFFFFF"));
            this.er[var2].setHorizontalAlignment(3 ^ 3);
            this.er[var2].setBounds(215, 21, 308, 21);
         } else if (var2 == 2) {
            var6 = this;
            this.er[var2].setBounds(48, 366, 86, 19);
         } else if (var2 >= 3 && var2 <= 6) {
            var6 = this;
            this.er[var2].setHorizontalAlignment(4);
            this.er[var2].setBounds(218, 249 + (var2 - 3) * 39, 110, 20);
         } else if (var2 == 7) {
            var6 = this;
            this.er[var2].setFont(Class681.ab);
            this.er[var2].setBounds(219, 195, 288, 14);
            this.er[var2].setForeground(Class681.c("#cFFFFFF"));
         } else {
            if (var2 == 8) {
               this.er[var2].setFont(Class681.ab);
               this.er[var2].setBounds(218, 223, 288, 14);
            }

            var6 = this;
         }

         var6.add(this.er[var2++]);
      }

      Class245[] var9 = new Class245[3];
      var10003 = true;
      this.nr = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.nr.length; var10000 = var2) {
         this.nr[var2] = Class133.a(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, 10, Color.white, Class681.q);
         this.nr[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
         if (var2 == 0) {
            var6 = this;
            this.nr[var2].setBounds(135, 366, 78, 19);
         } else if (var2 == (3 & 5)) {
            var6 = this;
            this.nr[var2].setBounds(328, 288, 144, 20);
         } else {
            if (var2 == 2) {
               this.nr[var2].setBounds(328, 327, 144, 20);
            }

            var6 = this;
         }

         var6.add(this.nr[var2++]);
      }

      Class217 var4 = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)), Class681.q, Color.white);
      var4.setBounds(328, 249, 144, 20);
      this.add(var4);
      this.aaf = new Class319(15, var4, this);
      this.ca = new MoneyType();
      this.ca.setIdAndKey(3 >> 2, "灵修值");
      this.ys = Class133.m(328, 366, 144, 20, 10, Color.white, Class681.q, this.ca, var1);
      this.ys.ab(2);
      this.ys.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.add(this.ys);
      <undefinedtype>[] var10 = new <undefinedtype>[8];
      var10003 = true;
      this.aac = var10;

      int var3;
      for(var10000 = var3 = 2 & 5; var10000 < this.aac.length; var10000 = var3) {
         this.aac[var3] = new JComponent() {
            private Class436 uc;
            private Class44 cn;
            private JLabel ir;
            private Class436 ih;

            public void q() {
               this.ir.setText((String)null);
               this.cn.c(3 ^ 3, (Object)null);
            }

            public {
               int var10003 = --4;
               this.ir = Class133.b(var10003, --4, 115 & 62, 117 & 26, Color.white, Class681.ce);
               this.add(this.ir);
               this.cn = new Class44(Class218.this.gk());
               this.cn.setBounds(--4, --4, 54 & 123, 54 & 123);
               this.add(this.cn);
               this.uc = new Class436("sc/d/4.png");
               this.ih = new Class436("sc/d/30.png");
               this.uc.setBounds(3 >> 2, 3 >> 2, 59 & 127, 63 & 121);
               this.ih.setBounds(4 ^ 5, 57 & 127, 59 & 126, 4 ^ 5);
               this.add(this.uc);
               this.add(this.ih);
            }
         };
         if (var3 >= 0 && var3 <= 3) {
            var6 = this;
            this.aac[var3].setBounds(230 + 62 * var3, 51, 59, 58);
         } else {
            if (var3 >= 4 && var3 <= 7) {
               this.aac[var3].setBounds(245 + 64 * (var3 - 4), 119, 59, 58);
            }

            var6 = this;
         }

         var6.add(this.aac[var3++]);
      }

      Class436[] var12 = new Class436[4];
      var10003 = true;
      this.aad = var12;

      for(var10000 = var3 = 0; var10000 < this.aad.length; var10000 = var3) {
         this.aad[var3] = new Class436();
         if (var3 == 0) {
            var6 = this;
            this.aad[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
            this.aad[var3].setBounds(45, 21, 165, 21);
         } else if (var3 == 1) {
            var6 = this;
            this.aad[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.aad[var3].setBounds(45, 21, 165, 340);
         } else if (var3 == 2) {
            var6 = this;
            this.aad[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
            this.aad[var3].setBounds(215, 21, 308, 21);
         } else {
            if (var3 == 3) {
               this.aad[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
               this.aad[var3].setBounds(215, 21, 308, 200);
            }

            var6 = this;
         }

         var6.add(this.aad[var3++]);
      }

   }
}
