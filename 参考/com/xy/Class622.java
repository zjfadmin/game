package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.SummonPetBean;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.petExchange;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

public class Class622 extends Class345 {
   private <undefinedtype> anu;
   private <undefinedtype> anv;
   private <undefinedtype> anw;
   private Class436 r;
   private Class322[] jd;
   private <undefinedtype> anx;
   private int m;

   public void z(long var1, JTextField var3) {
      long var4;
      long var6;
      if (this.m == 0) {
         var4 = this.anv.oh[3 & 4] == var3 ? var1 : this.anv.ok[3 & 4].gl();
         var6 = this.anv.oh[4 ^ 5] == var3 ? var1 : this.anv.ok[3 & 5].gl();
         var6 += this.anv.om;
         Class681.j(this.anv.od[--2], var4 * var6);
      } else if (this.m == (3 & 5)) {
         var4 = this.anx.p[3 ^ 3] == var3 ? var1 : this.anx.ns[2 & 5].gl();
         var6 = this.anx.p[5 >> 2] == var3 ? var1 : this.anx.ns[4 ^ 5].gl();
         Class681.j(this.anx.nr[2 ^ 3], var4 * var6);
      } else {
         if (this.m == 5 >> 1) {
            if (var3 == this.anu.p[3 ^ 3]) {
               var4 = this.anu.ahq.getHp() != 0 ? var1 / (long)this.anu.ahq.getHp() * (long)this.anu.ahq.getMp() : 0L;
               Class681.j(this.anu.ls[2 & 5], var4);
               return;
            }

            if (var3 == this.anu.p[3 >> 1]) {
               var4 = this.anu.ahs.getHp() != 0 ? var1 / (long)this.anu.ahs.getHp() * (long)this.anu.ahs.getMp() : 0L;
               Class681.j(this.anu.ls[--1], var4);
            }
         }

      }
   }

   public void gh(long var1) {
      if (this.m == 3 >> 1) {
         int var3;
         for(int var10000 = var3 = 0; var10000 < this.anv.og.length; var10000 = var3) {
            if (this.anv.og[var3].isVisible() && null.aeh(this.anv.og[var3]) == var1) {
               this.anv.og[var3].q();
               return;
            }

            ++var3;
         }

      }
   }

   public Class622(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      super(117 & 127, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 & 4, 19443 & 13805, 16895 & 16382, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 95 & 100, 95 & 100, 95 & 100, 95 & 100, (boolean)(3 >> 2)), "兑换系统");
      Class322[] var5 = new Class322[var10001];
      boolean var10003 = true;
      this.jd = var5;

      int var3;
      int var10000;
      for(var10000 = var3 = 3 >> 2; var10000 < this.jd.length; var10000 = var3) {
         Class322[] var4 = this.jd;
         Class322 var10002 = new Class322;
         var10005 = 5 >> 1;
         int var10006 = (16821 & 16127) + var3;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class622 var10010;
         if (var3 == 0) {
            var10009 = "买仙玉";
            var10010 = this;
         } else if (var3 == --1) {
            var10009 = "卖仙玉";
            var10010 = this;
         } else if (var3 == --2) {
            var10009 = "绑玉兑换";
            var10010 = this;
         } else if (var3 == --3) {
            var10009 = "物品合成";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var4[var3] = var10002;
         this.jd[var3].setOffsetTexts(Class681.bv);
         this.jd[var3].setBounds((123 & 61) + (94 & 125) * var3, 28 & 119, 85 & 127, 33 & 127);
         this.add(this.jd[var3++]);
      }

      this.anv = new JComponent() {
         private Class245[] od;
         private RichLabel oe;
         private <undefinedtype>[] og;
         private Class217[] oh;
         public int br;
         private Class436[] oi;
         private Class322[] oj;
         private Class319[] ok;
         private JLabel[] iv;
         private MoneyType hz;
         public int j;
         private Class556 ol;
         public long om;
         private RichLabel gi;

         public void fx(String var1) {
            int var10000 = 3 & 4;
            this.om = 0L;

            int var2;
            for(var2 = var10000; var10000 < this.oh.length; var10000 = var2) {
               this.oh[var2++].setText("0");
            }

            for(var10000 = var2 = 3 & 4; var10000 < this.og.length; var10000 = var2) {
               this.og[var2++].setVisible((boolean)(5 >> 3));
            }

            String[] var10 = var1.split("\\|");
            var10000 = 5 >> 1;
            int var10004 = --1;
            this.br = Integer.parseInt(var10[3 ^ 3].substring(5 >> 1));
            this.j = (Integer.parseInt(var10[var10004]) - --1) / (7 & 126) + (3 >> 1);
            this.od[2 & 5].setText(this.br + "/" + this.j);

            for(int var9 = var10000; var10000 < var10.length && var9 < (56 & 79); var10000 = var9) {
               int var3 = var9 - (1 ^ 3);
               <undefinedtype> var4 = this.og[var3];
               var3 = var10[var9].indexOf("=");
               long var5 = Class394.q(var10[var9], 5 >> 3, var3);
               long var7 = Class394.q(var10[var9], var3 + --1, var10[var9].length());
               int var10001 = --1;
               var4.aeg(var5, var7);
               var4.setVisible((boolean)var10001);
               if (var9 == --2) {
                  this.om = var5;
               }

               ++var9;
            }

            Class681.j(this.od[3 & 5], this.om);
         }

         public {
            int var10001 = --5;
            int var10003 = 3 & 5;
            int var10005 = 3 & 5;
            this.br = var10005;
            this.j = var10003;
            Class322[] var6 = new Class322[var10001];
            boolean var12 = true;
            this.oj = var6;

            int var2;
            <undefinedtype> var5;
            int var10000;
            for(var10000 = var2 = 3 ^ 3; var10000 < this.oj.length; var10000 = var2) {
               this.oj[var2] = new Class322("sc/e/6.png", 3 & 5, (18623 & 14329) + var2, Class681.bm, (Color[])null, "", Class622.this.gk());
               this.oj[var2].setBounds((19967 & 12964) + var2 * (29933 & 2974), 6993 & 26095, 127 & 34, 94 & 51);
               this.oj[var2].setText(var2 == 0 ? "首页" : (var2 == (4 ^ 5) ? "末页" : (var2 == --4 ? "确定购买" : "")));
               this.add(this.oj[var2]);
               if (var2 >= --2 && var2 <= --3) {
                  if (var2 == (1 ^ 3)) {
                     var5 = this;
                     this.oj[var2].setImage("sc/e/42.png");
                  } else {
                     if (var2 == --3) {
                        this.oj[var2].setImage("sc/e/43.png");
                     }

                     var5 = this;
                  }

                  var5.oj[var2].setBounds((4845 & 28123) + (var2 - (1 ^ 3)) * (94 & 115), 6617 & 26471, 119 & 26, 119 & 26);
               } else if (var2 == --4) {
                  this.oj[var2].setFont(Class681.ak);
                  this.oj[var2].setForeground(Color.black);
                  this.oj[var2].setImage("sc/e/26.png");
                  this.oj[var2].setBounds(31434 & 1535, 18385 & 14846, 127 & 99, 27 & 125);
               }

               ++var2;
            }

            JLabel[] var7 = new JLabel[123 & 13];
            var12 = true;
            this.iv = var7;

            for(var10000 = var2 = 3 ^ 3; var10000 < this.iv.length; var10000 = var2) {
               this.iv[var2] = Class133.b((111 & 63) + 120 * var2, 57, 150, 19, Color.black, Class681.ak);
               this.iv[var2].setText(var2 == 0 ? "正在售卖的仙玉" : (var2 == --1 ? "(大话币购买)" : (var2 == (1 ^ 3) ? "仙玉" : (var2 == --3 ? "每点售价" : (var2 == --4 ? "总价" : (var2 == --5 ? "购买仙玉" : (var2 == 6 ? "总价" : (var2 == 7 ? "每点售价" : (var2 == 8 ? "现金" : "")))))))));
               this.iv[var2].setHorizontalAlignment(10);
               this.add(this.iv[var2]);
               if (var2 == --1) {
                  this.iv[var2].setForeground(Color.red);
               } else if (var2 >= --2 && var2 <= --4) {
                  this.iv[var2].setForeground(Color.white);
                  if (var2 == --2) {
                     this.iv[var2].setBounds(85, 78, 72, 21);
                  } else if (var2 == --3) {
                     this.iv[var2].setBounds(196, 78, 72, 21);
                  } else if (var2 == 4) {
                     this.iv[var2].setBounds(366, 78, 72, 21);
                  }
               } else if (var2 >= 5 && var2 <= 8) {
                  this.iv[var2].setBounds(116 + (var2 - 5) % 2 * 177, 361 + (var2 - 5) / 2 * 25, 72, 19);
               }

               ++var2;
            }

            <undefinedtype>[] var8 = new <undefinedtype>[6];
            var12 = true;
            this.og = var8;

            for(var10000 = var2 = 3 & 4; var10000 < this.og.length; var10000 = var2) {
               this.og[var2] = new JComponent(Class622.this) {
                  // $FF: synthetic field
                  final Class622 amh;
                  private JLabel as;
                  private Class436 et;
                  private long gf;
                  private JLabel d;
                  private JLabel ir;
                  private JLabel rk;
                  private Class322 sa;

                  public {
                     Class622 var10000 = this.amh = var1;
                     super();
                     this.setPreferredSize(new Dimension(22963 & 10206, 117 & 46));
                     <undefinedtype> var2;
                     if (var10000.uw().n(5 >> 1, 31 & 107)) {
                        this.et = new Class436(Class222.i("yb500"));
                        var2 = this;
                     } else {
                        this.et = new Class436(Class222.i("236"));
                        var2 = this;
                     }

                     var2.et.setBounds(--5, --3, 94 & 63, 94 & 63);
                     this.add(this.et);
                     this.d = new JLabel("0");
                     this.d.setBounds(43 & 119, 111 & 26, 63 & 124, 127 & 16);
                     this.d.setFont(Class681.ad);
                     this.d.setForeground(Color.white);
                     this.add(this.d);
                     this.as = new JLabel("0");
                     this.as.setFont(Class681.ad);
                     this.add(this.as);
                     this.rk = new JLabel("0");
                     this.rk.setFont(Class681.ad);
                     this.add(this.rk);
                     this.ir = new JLabel("0");
                     this.ir.setBounds(7095 & 25982, 47 & 90, 127 & 60, 126 & 17);
                     this.ir.setForeground(Color.white);
                     this.ir.setFont(Class681.ad);
                     this.add(this.ir);
                     this.sa = new Class322("sc/e/6.png", 2 ^ 3, 26047 & 6910, "下架", var1.gk());
                     this.sa.bq(this);
                     this.sa.setOffsetTexts(Class681.am);
                     this.sa.setBounds(10733 & 22399, 89 & 47, 107 & 54, 17);
                     this.add(this.sa);
                  }

                  public void aeg(long var1, long var3) {
                     this.gf = 0L;
                     this.d.setText(String.valueOf(var3));
                     Class681.j(this.as, var1);
                     Class681.j(this.rk, var1 * var3);
                     this.as.setBounds(27863 & 5054, 123 & 14, 119 & 93, 28 & 115);
                     this.rk.setBounds(6636 & 26431, 62 & 75, 127 & 110, 122 & 21);
                     this.ir.setVisible((boolean)(5 >> 3));
                     this.sa.setVisible((boolean)(2 & 5));
                  }

                  public void q() {
                     this.sa.setForeground(Color.gray);
                     this.sa.setBtn(3 ^ 3);
                     this.sa.setText("停售");
                  }

                  public void df(String[] var1) {
                     int var10001 = --4;
                     this.gf = Long.parseLong(var1[3 ^ 3]);
                     this.d.setText(var1[5 >> 2]);
                     Class681.j(this.as, Long.parseLong(var1[--3]));
                     Class681.j(this.rk, Long.parseLong(var1[2 ^ 3]) * Long.parseLong(var1[--3]));
                     this.ir.setText(String.valueOf(Long.parseLong(var1[3 >> 1]) - Long.parseLong(var1[1 ^ 3])));
                     <undefinedtype> var10000;
                     if (var1[var10001].equals("1")) {
                        var10000 = this;
                        this.sa.setForeground(Color.white);
                        this.sa.setBtn(3 >> 1);
                        this.sa.setText("下架");
                     } else if (var1[--4].equals("3")) {
                        this.sa.setForeground(Color.gray);
                        var10000 = this;
                        this.sa.setBtn(3 ^ 3);
                        this.sa.setText("停售");
                     } else {
                        this.sa.setForeground(Color.gray);
                        var10000 = this;
                        this.sa.setBtn(2 & 5);
                        this.sa.setText("售罄");
                     }

                     var10000.as.setBounds(125 & 107, 14 & 123, 85 & 127, 48 & 95);
                     this.rk.setBounds(18123 & 14839, 91 & 46, 111 & 126, 49 & 94);
                     this.ir.setVisible((boolean)(2 ^ 3));
                     this.sa.setVisible((boolean)(--1));
                  }

               
                  static long aeh(Object var0) {
                     return var0.gf;
                  }
               };
               this.og[var2].setBounds(51, 99 + var2 * 36, 402, 36);
               this.add(this.og[var2++]);
            }

            this.gi = new RichLabel("", Class681.ab);
            this.gi.setTextSize("#c000000温馨提示：由于系统时#cFF0000自动帮你按照最低的单价优先购买，当多人同时", 410);
            this.gi.setBounds(41, 418, this.gi.getWidth(), this.gi.getHeight());
            this.add(this.gi);
            this.oe = new RichLabel("", Class681.bm);
            this.oe.setTextSize("#cFF0000购买时可能会发生价格变化，#c000000你能接受比当前单价最多高           大话币", 410);
            this.oe.setBounds(42, 437, this.oe.getWidth(), this.oe.getHeight());
            this.add(this.oe);
            Class604 var4 = Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3));
            this.hz = new MoneyType();
            this.hz.setIdAndKey(5 >> 2, "金钱");
            this.ol = Class133.m(332, 387, 124, 19, 10, Color.white, Class681.q, this.hz, Class622.this.aej);
            this.ol.ab(2);
            this.ol.eq(var4);
            this.add(this.ol);
            Class245[] var9 = new Class245[3];
            var12 = true;
            this.od = var9;
            Class217[] var10 = new Class217[2];
            var12 = true;
            this.oh = var10;
            Class319[] var11 = new Class319[2];
            var12 = true;
            this.ok = var11;

            int var3;
            for(var10000 = var3 = 3 & 4; var10000 < this.od.length; var10000 = var3) {
               this.od[var3] = Class133.a(222, 321, 58, 18, var3 == 0 ? 5 >> 3 : 10, Color.white, Class681.q);
               this.od[var3].eq(var4);
               if (var3 == (2 ^ 3)) {
                  var5 = this;
                  this.od[var3].setBounds(188, 387, 89, 19);
               } else {
                  if (var3 == 2) {
                     this.od[var3].setBounds(332, 362, 124, 19);
                  }

                  var5 = this;
               }

               var5.add(this.od[var3++]);
            }

            for(var10000 = var3 = 3 & 4; var10000 < this.oh.length; var10000 = var3) {
               this.oh[var3] = Class133.n(var4, Class681.q, Color.white);
               if (var3 == 0) {
                  var5 = this;
                  this.oh[var3].setBounds(188, 362, 89, 19);
               } else {
                  if (var3 == (3 & 5)) {
                     this.oh[var3].setBounds(345, 439, 59, 19);
                  }

                  var5 = this;
               }

               var5.add(this.oh[var3]);
               var11 = this.ok;
               int var10002 = var3;
               Class319 var14 = new Class319(15, this.oh[var3], Class622.this.gk());
               ++var3;
               var11[var10002] = var14;
            }

            Class436[] var13 = new Class436[5];
            var12 = true;
            this.oi = var13;

            for(var10000 = var3 = 3 & 4; var10000 < this.oi.length; var10000 = var3) {
               this.oi[var3] = new Class436();
               if (var3 == 0) {
                  var5 = this;
                  this.oi[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 >> 2)));
                  this.oi[var3].setBounds(47, 78, 408, 21);
               } else if (var3 == --1) {
                  var5 = this;
                  this.oi[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
                  this.oi[var3].setBounds(47, 78, 408, 235);
               } else if (var3 == 2) {
                  if (Class622.this.uw().n(2, 11)) {
                     this.oi[var3].hf(Class222.i("yb500"));
                     var5 = this;
                  } else {
                     this.oi[var3].hf(Class222.i("236"));
                     var5 = this;
                  }

                  var5.oi[var3].setBounds(51, 360, 50, 50);
                  var5 = this;
               } else if (var3 == 3) {
                  var5 = this;
                  this.oi[var3].fw("sc/d/4.png");
                  this.oi[var3].setBounds(47, 356, 59, 57);
               } else {
                  if (var3 == 4) {
                     this.oi[var3].eq(Class511.q("sc/d/66.png", 60, 3 >> 1, 60, 1, false));
                     this.oi[var3].setBounds(56, 346, 390, 2);
                  }

                  var5 = this;
               }

               var5.add(this.oi[var3++]);
            }

         }
      };
      this.anx = new JComponent() {
         private RichLabel lt;
         private Class436[] nn;
         private Class556[] ag;
         private MoneyType no;
         private MoneyType np;
         private Class217[] p;
         private long gf;
         private Class245[] nr;
         private JLabel[] ly;
         private Class319[] ns;

         public void fx(String var1) {
            int var10003 = 5 >> 3;
            int var10000 = 5 >> 3;
            this.p[var10003].setText("0");
            this.p[2 ^ 3].setText("0");

            for(int var2 = var10000; var10000 < Class622.this.anv.og.length; var10000 = var2) {
               Class622.this.anv.og[var2++].setVisible((boolean)(3 & 4));
            }

            String[] var5 = var1.split("\\|");
            var10000 = --2;
            Class622.this.anv.br = Integer.parseInt(var5[3 & 4].substring(1 ^ 3));
            Class622.this.anv.j = (Integer.parseInt(var5[2 ^ 3]) - (5 >> 2)) / (110 & 23) + --1;
            this.nr[3 & 4].setText(Class622.this.anv.br + "/" + Class622.this.anv.j);

            for(int var4 = var10000; var10000 < var5.length && var4 < (26 & 109); var10000 = var4) {
               int var3 = var4 - (1 ^ 3);
               <undefinedtype> var6 = Class622.this.anv.og[var3];
               int var10001 = 2 ^ 3;
               String var8 = var5[var4];
               ++var4;
               var6.df(var8.split("="));
               var6.setVisible((boolean)var10001);
            }

         }

         public {
            int var10001 = 31 & 108;
            this.gf = 100000L;
            JLabel[] var6 = new JLabel[var10001];
            boolean var10003 = true;
            this.ly = var6;

            int var2;
            int var10000;
            for(var10000 = var2 = 3 & 4; var10000 < this.ly.length; var10000 = var2) {
               this.ly[var2] = Class133.b((63 & 111) + (28911 & 3993) * var2, 59 & 125, 28159 & 4758, 23 & 123, Color.black, Class681.ak);
               this.ly[var2].setText(var2 == 0 ? "我正在寄售的仙玉" : (var2 == 5 >> 2 ? "(兑换大话币)" : (var2 == 5 >> 1 ? "仙玉" : (var2 == --3 ? "每点售价" : (var2 == --4 ? "总价" : (var2 == --5 ? "已交易" : (var2 == (126 & 7) ? "寄售仙玉" : (var2 == (15 & 119) ? "总价" : (var2 == (24 & 111) ? "每点售价" : (var2 == (25 & 111) ? "押金" : (var2 == (46 & 91) ? "我的仙玉" : (var2 == (47 & 91) ? "现金" : ""))))))))))));
               this.ly[var2].setHorizontalAlignment(43 & 94);
               this.add(this.ly[var2]);
               if (var2 == --1) {
                  this.ly[var2].setForeground(Color.red);
               } else if (var2 >= --2 && var2 <= --5) {
                  this.ly[var2].setForeground(Color.white);
                  if (var2 == 5 >> 1) {
                     this.ly[var2].setBounds(91 & 127, 127 & 78, 104 & 95, 21);
                  } else if (var2 == --3) {
                     this.ly[var2].setBounds(151, 78, 72, 21);
                  } else if (var2 == --4) {
                     this.ly[var2].setBounds(262, 78, 72, 21);
                  } else if (var2 == --5) {
                     this.ly[var2].setBounds(346, 78, 72, 21);
                  }
               } else if (var2 >= 6 && var2 <= 11) {
                  this.ly[var2].setBounds(116 + (var2 - 6) % --2 * 177, 361 + (var2 - 6) / --2 * 25, 72, 19);
               }

               ++var2;
            }

            this.lt = new RichLabel("", Class681.ab);
            this.lt.setTextSize("#c000000温馨提示：如下架仙玉，押金#cFF0000不予退还#c000000。", 410);
            this.lt.setBounds(48, 436, this.lt.getWidth(), this.lt.getHeight());
            this.add(this.lt);
            this.no = new MoneyType();
            this.no.setIdAndKey(--3, "仙玉");
            this.np = new MoneyType();
            this.np.setIdAndKey(--1, "金钱");
            Class604 var4 = Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4));
            Class245[] var7 = new Class245[--3];
            var10003 = true;
            this.nr = var7;
            Class556[] var8 = new Class556[--2];
            var10003 = true;
            this.ag = var8;
            Class217[] var9 = new Class217[1 ^ 3];
            var10003 = true;
            this.p = var9;
            Class319[] var10 = new Class319[2];
            var10003 = true;
            this.ns = var10;

            int var3;
            <undefinedtype> var5;
            int var10002;
            for(var10000 = var3 = 3 & 4; var10000 < this.p.length; var10000 = var3) {
               this.p[var3] = Class133.n(var4, Class681.q, Color.white);
               if (var3 == --1) {
                  var5 = this;
                  this.p[var3].setBounds(188, 387, 89, 19);
               } else {
                  var5 = this;
                  this.p[var3].setBounds(188, 362, 89, 19);
               }

               var5.add(this.p[var3]);
               var10 = this.ns;
               var10002 = var3;
               Class319 var13 = new Class319(15, this.p[var3], Class622.this.gk());
               ++var3;
               var10[var10002] = var13;
            }

            for(var10000 = var3 = 3 & 4; var10000 < this.nr.length; var10000 = var3) {
               this.nr[var3] = Class133.a(222, 321, 58, 18, var3 == 0 ? 5 >> 3 : 10, Color.white, Class681.q);
               this.nr[var3].eq(var4);
               if (var3 == (4 ^ 5)) {
                  var5 = this;
                  this.nr[var3].setBounds(332, 362, 124, 19);
               } else {
                  if (var3 == 2) {
                     this.nr[var3].setBounds(332, 387, 124, 19);
                  }

                  var5 = this;
               }

               var5.add(this.nr[var3++]);
            }

            var10000 = 3 ^ 3;
            Class681.j(this.nr[2], this.gf);

            for(var3 = var10000; var10000 < this.ag.length; var10000 = var3) {
               Class556[] var12 = this.ag;
               var10002 = var3 == 0 ? 188 : 332;
               int var10004 = var3 == 0 ? 89 : 124;
               Color var10007 = Color.white;
               Font var10008 = Class681.q;
               MoneyType var10009;
               Class622 var10010;
               if (var3 == 0) {
                  var10009 = this.no;
                  var10010 = Class622.this;
               } else {
                  var10009 = this.np;
                  var10010 = Class622.this;
               }

               var12[var3] = Class133.m(var10002, 412, var10004, 19, 10, var10007, var10008, var10009, var10010.aej);
               this.ag[var3].ab(2);
               this.ag[var3].eq(var4);
               this.add(this.ag[var3++]);
            }

            Class436[] var11 = new Class436[5];
            var10003 = true;
            this.nn = var11;

            for(var10000 = var3 = 3 & 4; var10000 < this.nn.length; var10000 = var3) {
               this.nn[var3] = new Class436();
               if (var3 == 0) {
                  var5 = this;
                  this.nn[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
                  this.nn[var3].setBounds(47, 78, 408, 21);
               } else if (var3 == (4 ^ 5)) {
                  var5 = this;
                  this.nn[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
                  this.nn[var3].setBounds(47, 78, 408, 235);
               } else if (var3 == 2) {
                  if (Class622.this.uw().n(2, 11)) {
                     this.nn[var3].hf(Class222.i("yb500"));
                     var5 = this;
                  } else {
                     this.nn[var3].hf(Class222.i("236"));
                     var5 = this;
                  }

                  var5.nn[var3].setBounds(51, 372, 50, 50);
                  var5 = this;
               } else if (var3 == 3) {
                  var5 = this;
                  this.nn[var3].fw("sc/d/4.png");
                  this.nn[var3].setBounds(47, 368, 59, 57);
               } else {
                  if (var3 == 4) {
                     this.nn[var3].eq(Class511.q("sc/d/66.png", 60, 2 ^ 3, 60, --1, (boolean)(3 & 4)));
                     this.nn[var3].setBounds(56, 346, 390, 2);
                  }

                  var5 = this;
               }

               var5.add(this.nn[var3++]);
            }

         }
      };
      this.anu = new JComponent() {
         private Class245[] ls;
         private Class556[] ahn;
         private RichLabel aho;
         private Class322[] ahp;
         private RichLabel bt;
         private petExchange ahq;
         private Class217[] p;
         private RichLabel q;
         private Class319[] ahr;
         private JLabel[] ad;
         private Class436[] an;
         private petExchange ahs;

         public {
            int var10001 = 1 ^ 3;
            Class322[] var6 = new Class322[var10001];
            boolean var10003 = true;
            this.ahp = var6;

            int var2;
            int var10000;
            for(var10000 = var2 = 3 & 4; var10000 < this.ahp.length; var10000 = var2) {
               this.ahp[var2] = new Class322("sc/e/7.png", 5 >> 2, (30719 & 2239) + var2, Class681.ak, Class681.c, "兑换", Class622.this.gk());
               this.ahp[var2].setBounds(17914 & 15231, (16122 & 16893) + var2 * (23693 & 9215), 123 & 63, 27 & 125);
               this.add(this.ahp[var2++]);
            }

            JLabel[] var7 = new JLabel[19 & 125];
            var10003 = true;
            this.ad = var7;

            for(var10000 = var2 = 3 & 4; var10000 < this.ad.length; var10000 = var2) {
               this.ad[var2] = Class133.b(127 & 47, 127 & 57, 14326 & 18591, 23 & 123, Color.black, Class681.ak);
               this.ad[var2].setText(var2 == 0 ? "我正在兑换绑玉" : (var2 == (2 ^ 3) ? "您当前共有：" : (var2 == --2 ? "绑玉" : (var2 == --3 ? "仙玉兑换" : (var2 == --4 ? "大话币兑换" : (var2 != --5 && var2 != (45 & 90) ? (var2 != (118 & 15) && var2 != (77 & 59) ? (var2 != (95 & 39) && var2 != (31 & 106) ? (var2 != 11 && var2 != 12 ? (var2 != 13 && var2 != 16 ? (var2 != 14 && var2 != 15 ? "" : "【大话币】") : "【绑玉】") : "【仙玉】") : "获得") : "兑换") : "拥有"))))));
               this.ad[var2].setHorizontalAlignment(10);
               this.add(this.ad[var2]);
               if (var2 >= (4 ^ 5) && var2 <= 5 >> 1) {
                  this.ad[var2].setBounds(131 + 228 * (var2 - (3 & 5)), 95, 84, 19);
                  this.ad[var2].setFont(Class681.al);
               } else if (var2 >= --3 && var2 <= --4) {
                  this.ad[var2].setFont(Class681.cf);
                  this.ad[var2].setHorizontalAlignment(3 & 4);
                  this.ad[var2].setBounds(37, 197 + 141 * (var2 - --3), 119, 21);
               } else if (var2 >= --5 && var2 <= 7) {
                  this.ad[var2].setBounds(147, 226 + 25 * (var2 - --5), 36, 19);
               } else if (var2 >= 8 && var2 <= 10) {
                  this.ad[var2].setBounds(147, 367 + 25 * (var2 - 8), 36, 19);
               } else if (var2 >= 11 && var2 <= 13) {
                  this.ad[var2].setBounds(312, 226 + 25 * (var2 - 11), 72, 19);
                  this.ad[var2].setFont(Class681.bm);
               } else if (var2 >= 14 && var2 <= 16) {
                  this.ad[var2].setBounds(312, 367 + 25 * (var2 - 14), 72, 19);
                  this.ad[var2].setFont(Class681.bm);
               }

               ++var2;
            }

            this.bt = new RichLabel("", Class681.ab);
            this.bt.setTextSize("#c000000将仙玉兑换成绑玉，兑换比例为#cFF0000 1 ：2", 360);
            this.bt.setBounds(129, 124, this.bt.getWidth(), this.bt.getHeight());
            this.add(this.bt);
            this.aho = new RichLabel("", Class681.ab);
            this.aho.setTextSize("#c000000将大话币兑换成绑玉，兑换比例为#cFF0000 100000 ：1", 360);
            this.aho.setBounds(129, 142, this.aho.getWidth(), this.aho.getHeight());
            this.add(this.aho);
            this.q = new RichLabel("", Class681.ab);
            this.q.setTextSize("#c000000温馨提示：大话币兑换绑玉，精确到个位数，#cFF0000所有小数清零#c000000。", 360);
            this.q.setBounds(48, 467, this.q.getWidth(), this.q.getHeight());
            this.add(this.q);
            Class604 var5 = Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5));
            Class245[] var9 = new Class245[1 ^ 3];
            var10003 = true;
            this.ls = var9;
            Class556[] var10 = new Class556[--3];
            var10003 = true;
            this.ahn = var10;
            Class217[] var11 = new Class217[1 ^ 3];
            var10003 = true;
            this.p = var11;
            Class319[] var12 = new Class319[--2];
            var10003 = true;
            this.ahr = var12;

            int var3;
            <undefinedtype> var8;
            for(var10000 = var3 = 2 & 5; var10000 < this.p.length; var10000 = var3) {
               this.p[var3] = Class133.n(var5, Class681.q, Color.white);
               if (var3 == 0) {
                  var8 = this;
                  this.p[var3].setBounds(187, 251, 124, 19);
               } else {
                  if (var3 == 5 >> 2) {
                     this.p[var3].setBounds(187, 392, 124, 19);
                  }

                  var8 = this;
               }

               var8.add(this.p[var3]);
               var12 = this.ahr;
               int var10002 = var3;
               Class319 var14 = new Class319(15, this.p[var3], Class622.this.gk());
               ++var3;
               var12[var10002] = var14;
            }

            for(var10000 = var3 = 3 & 4; var10000 < this.ls.length; var10000 = var3) {
               this.ls[var3] = Class133.a(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, 10, Color.white, Class681.q);
               this.ls[var3].eq(var5);
               if (var3 == 0) {
                  var8 = this;
                  this.ls[var3].setBounds(187, 276, 124, 19);
               } else {
                  if (var3 == --1) {
                     this.ls[var3].setBounds(187, 417, 124, 19);
                  }

                  var8 = this;
               }

               var8.add(this.ls[var3++]);
            }

            for(var10000 = var3 = 3 & 4; var10000 < this.ahn.length; var10000 = var3) {
               MoneyType var4 = new MoneyType();
               if (var3 == 0) {
                  var8 = this;
                  var4.setIdAndKey(5 >> 1, "绑玉");
               } else if (var3 == --1) {
                  var8 = this;
                  var4.setIdAndKey(3, "仙玉");
               } else {
                  if (var3 == 2) {
                     var4.setIdAndKey(2 ^ 3, "金钱");
                  }

                  var8 = this;
               }

               var8.ahn[var3] = Class133.m(5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, 10, Color.white, Class681.q, var4, Class622.this.aej);
               if (var3 == 0) {
                  var8 = this;
                  this.ahn[var3].setBounds(214, 95, 139, 19);
               } else if (var3 == 3 >> 1) {
                  var8 = this;
                  this.ahn[var3].setBounds(187, 226, 124, 19);
               } else {
                  if (var3 == 2) {
                     this.ahn[var3].setBounds(187, 367, 124, 19);
                  }

                  var8 = this;
               }

               var8.ahn[var3].ab(2);
               this.ahn[var3].eq(var5);
               this.add(this.ahn[var3++]);
            }

            Class436[] var13 = new Class436[9];
            var10003 = true;
            this.an = var13;

            for(var10000 = var3 = 2 & 5; var10000 < this.an.length; var10000 = var3) {
               if (var3 != 0) {
                  this.an[var3] = new Class436();
                  this.add(this.an[var3]);
                  if (var3 == 0) {
                     this.an[var3].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 & 4)));
                     this.an[var3].setBounds(47, 34, 408, 20);
                  } else if (var3 == 1) {
                     this.an[var3].fw("sc/d/80.png");
                     this.an[var3].setBounds(64, 93, 50, 70);
                  } else if (var3 == 2) {
                     this.an[var3].eq(Class511.q("sc/d/66.png", 60, 1, 60, 1, false));
                     this.an[var3].setBounds(130, 120, 306, 2);
                  } else if (var3 == 3) {
                     this.an[var3].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
                     this.an[var3].setBounds(47, 78, 408, 100);
                  } else if (var3 != 4 && var3 != 5) {
                     if (var3 != 6 && var3 != 7) {
                        if (var3 == 8) {
                           this.an[var3].eq(Class511.q("sc/d/66.png", 60, 1, 60, 1, false));
                           this.an[var3].setBounds(57, 321, 390, 2);
                        }
                     } else {
                        this.an[var3].eq(Class511.q("sc/d/4.png", 5, 5, 5, 5, false));
                        this.an[var3].setBounds(57, 222 + (var3 - 6) * 141, 79, 77);
                     }
                  } else {
                     this.an[var3].setBounds(61, 226 + (var3 - 4) * 141, 70, 70);
                  }
               }

               ++var3;
            }

         }
      };
      this.anw = new JComponent() {
         private Class322[] abh;
         private JLabel[] abi;
         private JTree abj;
         private Class44 abk;
         private long wj;
         private Class357 abm;
         private Class556 abn;
         private petExchange ze;
         private Class245 eu;
         private DefaultMutableTreeNode abo;
         private JScrollPane nk;
         private <undefinedtype>[] abp;
         private Class436[] g;

         public void bt(Map<Integer, petExchange> var1) {
            this.abo.removeAllChildren();
            ArrayList var5 = new ArrayList();
            Iterator var3;
            Iterator var10000 = var3 = var1.entrySet().iterator();

            while(true) {
               int var2;
               int var12;
               label51:
               while(var10000.hasNext()) {
                  petExchange var4;
                  if ((var4 = (petExchange)((Entry)var3.next()).getValue()).geteType() != --3) {
                     var10000 = var3;
                  } else {
                     for(var12 = var2 = 0; var12 < var5.size(); var12 = var2) {
                        if (((petExchange)var5.get(var2)).geteId() > var4.geteId()) {
                           var10000 = var3;
                           var5.add(var2, var4);
                           continue label51;
                        }

                        ++var2;
                     }

                     var10000 = var3;
                     var5.add(var4);
                  }
               }

               int var8;
               for(var12 = var8 = 3 >> 2; var12 < var5.size(); var12 = var8) {
                  petExchange var9 = (petExchange)var5.get(var8);
                  int var11 = this.abo.getChildCount();

                  label33: {
                     for(var12 = var2 = 2 & 5; var12 < var11; var12 = var2) {
                        DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)this.abo.getChildAt(var2);
                        if (var9.getType().equals(var6.toString())) {
                           DefaultMutableTreeNode var7 = new DefaultMutableTreeNode(new Class656(var9.getName(), String.valueOf(var9.geteId())));
                           var6.add(var7);
                           break label33;
                        }

                        ++var2;
                     }

                     DefaultMutableTreeNode var10 = new DefaultMutableTreeNode(var9.getType());
                     var10.add(new DefaultMutableTreeNode(new Class656(var9.getName(), String.valueOf(var9.geteId()))));
                     this.abo.add(var10);
                  }

                  ++var8;
               }

               return;
            }
         }

         public boolean t() {
            if (this.ze == null) {
               return (boolean)(3 ^ 3);
            } else {
               boolean var1 = false;

               int var2;
               for(int var10000 = var2 = 3 >> 2; var10000 < this.abp.length; var10000 = var2) {
                  if (this.abp[var2].ez() != null) {
                     if (this.abp[var2].fa().getForeground() != Color.green) {
                        return (boolean)(3 & 4);
                     }

                     var1 = true;
                  }

                  ++var2;
               }

               return var1;
            }
         }

         public void bv(petExchange var1) {
            int var10000 = 3 ^ 3;
            this.ze = var1;
            this.abk.c(3 >> 2, (Object)null);
            this.abk.setVisible((boolean)(3 >> 1));

            int var2;
            for(var2 = var10000; var10000 < this.abp.length; var10000 = var2) {
               <undefinedtype> var11 = this.abp[var2];
               ++var2;
               var11.ew((Goodstable)null, 3 & 4);
            }

            this.wj = 0L;
            this.eu.setText((String)null);
            if (var1 != null) {
               Goodstable var8 = Class622.this.vc().n(var1.getPid());
               Class44 var12 = this.abk;
               int var10001;
               Goodstable var10002;
               if (var8 != null) {
                  var10001 = 4 ^ 5;
                  var10002 = var8;
               } else {
                  var10001 = 0;
                  var10002 = var8;
               }

               var12.c(var10001, var10002);
               this.abk.setVisible((boolean)(2 ^ 3));
               String var6;
               if ((var6 = var1.getConsume()) != null && !var6.equals("")) {
                  String[] var7 = var6.split("\\|");
                  var2 = 2 & 5;

                  int var4;
                  for(var10000 = var4 = 2 & 5; var10000 < var7.length; var10000 = var4) {
                     String[] var3;
                     if (var7[var4].startsWith("D")) {
                        var3 = var7[var4].split("=");
                        this.wj = Long.parseLong(var3[5 >> 2]);
                        Class681.j(this.eu, this.wj);
                     } else if (var7[var4].startsWith("G")) {
                        var3 = var7[var4].split("=");
                        BigDecimal var5 = new BigDecimal(var3[4 ^ 5]);
                        Goodstable var10 = Class622.this.vc().n(var5);
                        int var9 = Integer.parseInt(var3[5 >> 1]);
                        if (var2 < this.abp.length) {
                           this.abp[var2].ew(var10, var9);
                        }

                        ++var2;
                     }

                     ++var4;
                  }

               }
            }
         }

         public {
            int var10001 = 5 >> 1;
            Class322[] var7 = new Class322[var10001];
            boolean var10003 = true;
            this.abh = var7;

            int var2;
            <undefinedtype> var6;
            int var10000;
            for(var10000 = var2 = 2 & 5; var10000 < this.abh.length; var10000 = var2) {
               Class322[] var5 = this.abh;
               Class322 var8 = new Class322;
               String var10004 = var2 == --1 ? "sc/e/26.png" : "sc/e/7.png";
               int var10006 = (22005 & 10955) + var2;
               Font var10007 = Class681.ak;
               Color[] var10008 = Class681.c;
               String var10009;
               Class622 var10010;
               if (var2 == 0) {
                  var10009 = "合成";
                  var10010 = Class622.this;
               } else if (var2 == (3 & 5)) {
                  var10009 = "一键合成";
                  var10010 = Class622.this;
               } else {
                  var10009 = "";
                  var10010 = Class622.this;
               }

               var5[var2] = var8;
               if (var2 == 0) {
                  var6 = this;
                  this.abh[var2].setBounds(28543 & 4495, 29995 & 3071, 127 & 59, 123 & 29);
               } else {
                  if (var2 == (4 ^ 5)) {
                     this.abh[var2].setBounds(463 & 32639, 6447 & 26619, 127 & 99, 95 & 57);
                  }

                  var6 = this;
               }

               var6.add(this.abh[var2++]);
            }

            JLabel[] var9 = new JLabel[--4];
            var10003 = true;
            this.abi = var9;

            for(var10000 = var2 = 5 >> 3; var10000 < this.abi.length; var10000 = var2) {
               this.abi[var2] = Class133.b(63 & 111, 63 & 121, 13975 & 18942, 95 & 51, Color.black, Class681.ak);
               this.abi[var2].setText(var2 == 0 ? "我正在合成物品" : (var2 == (2 ^ 3) ? "合成" : (var2 == (1 ^ 3) ? "消耗" : (var2 == --3 ? "现金" : ""))));
               this.abi[var2].setHorizontalAlignment(59 & 78);
               this.add(this.abi[var2]);
               if (var2 == 5 >> 2) {
                  this.abi[var2].setForeground(Class681.c("#cEEEEEE"));
                  this.abi[var2].setBounds(10103 & 22970, 17885 & 15102, 27, 14);
                  this.abi[var2].setFont(Class681.bm);
               } else if (var2 >= 5 >> 1 && var2 <= --3) {
                  this.abi[var2].setForeground(Color.white);
                  this.abi[var2].setFont(Class681.ab);
                  this.abi[var2].setBounds(278, 247 + (var2 - (1 ^ 3)) * 25, 36, 19);
               }

               ++var2;
            }

            MoneyType var3 = new MoneyType();
            var3.setIdAndKey(3 & 5, "金钱");
            this.abn = Class133.m(310, 272, 124, 19, 10, Color.white, Class681.q, var3, Class622.this.aej);
            this.eu = Class133.a(310, 247, 124, 19, 10, Color.white, Class681.q);
            this.abn.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
            this.eu.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
            this.abn.ab(--2);
            this.add(this.abn);
            this.add(this.eu);
            <undefinedtype>[] var10 = new <undefinedtype>[--5];
            var10003 = true;
            this.abp = var10;

            for(var10000 = var2 = 3 ^ 3; var10000 < this.abp.length; var10000 = var2) {
               this.abp[var2] = new JComponent(3 >> 2) {
                  private int gc;
                  private Class44 akj;
                  private BigDecimal ge;
                  private boolean ee;
                  private JLabel d;
                  // $FF: synthetic field
                  final Class622 awm;
                  private JLabel rk;
                  private int m;

                  protected void paintComponent(Graphics var1) {
                     if (this.awm.aej.bl()) {
                        this.q();
                     }

                  }

                  public {
                     int var10011 = 3 ^ 3;
                     this.awm = var1;
                     super();
                     this.setLayout((LayoutManager)null);
                     this.setOpaque((boolean)var10011);
                     this.gc = var2;
                     this.setPreferredSize(new Dimension(119 & 63, 87 & 110));
                     this.rk = new JLabel("", 3 ^ 3);
                     this.rk.setFont(Class681.ad);
                     this.akj = new Class44(var1.gk());
                     this.akj.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 & 4)));
                     this.akj.ad(Class44.asb);
                     this.akj.setBounds(3 ^ 3, 3 ^ 3, 63 & 119, 63 & 119);
                     this.rk.setBounds(3 >> 2, 55 & 127, 55 & 127, 47 & 95);
                     if (this.d != null) {
                        this.add(this.d);
                     }

                     if (this.rk != null) {
                        this.add(this.rk);
                     }

                     if (this.akj != null) {
                        this.add(this.akj);
                     }

                     this.ew((Goodstable)null, 3 >> 2);
                  }

                  public BigDecimal ez() {
                     return this.ge;
                  }

                  public void ak(boolean var1) {
                     this.ee = var1;
                  }

                  public boolean t() {
                     return this.ee;
                  }

                  public void ew(Goodstable var1, int var2) {
                     this.ge = var1 != null ? var1.getGoodsid() : null;
                     this.m = var2;
                     Class44 var10000 = this.akj;
                     int var10001;
                     Goodstable var10002;
                     if (var1 != null) {
                        var10001 = --1;
                        var10002 = var1;
                     } else {
                        var10001 = 0;
                        var10002 = var1;
                     }

                     var10000.c(var10001, var10002);
                     this.akj.setVisible((boolean)(2 ^ 3));
                     if (this.ge != null) {
                        this.q();
                     } else {
                        this.rk.setText((String)null);
                     }
                  }

                  public void q() {
                     if (this.ge != null) {
                        int var1 = this.awm.vd().getGoodNum(this.ge);
                        this.rk.setText(var1 + "/" + this.m);
                        this.rk.setForeground(var1 >= this.m ? Color.green : Color.red);
                     }

                  }

                  public JLabel fa() {
                     return this.rk;
                  }
               };
               if (var2 < --3) {
                  var6 = this;
                  this.abp[var2].setBounds(210 + 80 * var2, 100, 55, 70);
               } else {
                  this.abp[var2].setBounds(210 + (var2 == --4 ? 160 : 0), 170, 55, 70);
                  var6 = this;
               }

               var6.add(this.abp[var2++]);
            }

            this.abk = new Class44(Class622.this.gk());
            this.abk.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(2 & 5)));
            this.abk.ad(Class44.asb);
            this.abk.setBounds(210, 240, 55, 55);
            this.add(this.abk);
            this.abo = new DefaultMutableTreeNode("");
            this.bt(Class622.this.vc().cn().getAllPetExchange());
            this.abj = new JTree(this.abo);
            this.abj.setOpaque((boolean)(3 ^ 3));
            this.abj.putClientProperty("JTree.lineStyle", "None");
            ((BasicTreeUI)this.abj.getUI()).setLeftChildIndent(3 & 4);
            DefaultTreeCellRenderer var4 = new DefaultTreeCellRenderer() {
               public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
                  DefaultMutableTreeNode var8;
                  DefaultMutableTreeNode var10000 = var8 = (DefaultMutableTreeNode)var2;
                  super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
                  if (var10000.getLevel() == 5 >> 1) {
                     Class656 var9 = (Class656)var8.getUserObject();
                     this.setText(var9.f());
                  }

                  return this;
               }
            };
            var4.setLeafIcon((Icon)null);
            var4.setOpenIcon(Class512.azt);
            var4.setClosedIcon(Class512.azr);
            var4.setFont(Class681.ce);
            var4.setBackgroundNonSelectionColor(Class681.cu);
            var4.setBackgroundSelectionColor(new Color(99, 93, 90));
            var4.setBorderSelectionColor(Class681.cu);
            var4.setTextNonSelectionColor(Color.white);
            var4.setTextSelectionColor(Color.white);
            this.abj.setCellRenderer(var4);
            this.abj.setRootVisible((boolean)(2 & 5));
            this.abj.setRowHeight(20);
            this.abj.addMouseListener(new MouseAdapter() {
               public void mousePressed(MouseEvent var1) {
                  if (SwingUtilities.isLeftMouseButton(var1)) {
                     TreePath var2;
                     if ((var2 = abj.getSelectionPath()) != null) {
                        if (abj.isExpanded(var2)) {
                           abj.collapsePath(var2);
                        } else {
                           abj.expandPath(var2);
                        }
                     }
                  }
               }
            });
            this.abj.addTreeSelectionListener(new TreeSelectionListener() {
               public void valueChanged(TreeSelectionEvent var1) {
                  DefaultMutableTreeNode var2;
                  if ((var2 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
                     bv((petExchange)null);
                  } else {
                     if (var2.isLeaf()) {
                        int var3 = Integer.parseInt(((Class656)var2.getUserObject()).a());
                        petExchange var4 = Class622.this.vc().as(var3);
                        bv(var4);
                     }

                  }
               }
            });
            this.nk = Class133.f(50, 98, 145, 230, this.abj, 20);
            this.add(this.nk);
            Class436[] var11 = new Class436[6];
            var10003 = true;
            this.g = var11;

            for(var10000 = var2 = 2 & 5; var10000 < this.g.length; var10000 = var2) {
               this.g[var2] = new Class436();
               this.add(this.g[var2]);
               if (var2 == 0) {
                  this.g[var2].fw("sc/d/71.png");
                  this.g[var2].setBounds(279, 213, 78, 30);
               } else if (var2 == --1) {
                  this.g[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
                  this.g[var2].setBounds(47, 78, 144, 21);
               } else if (var2 == (1 ^ 3)) {
                  this.g[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(2 & 5)));
                  this.g[var2].setBounds(190, 78, 265, 21);
               } else if (var2 == --3) {
                  this.g[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
                  this.g[var2].setBounds(47, 78, 144, 250);
               } else if (var2 == 4) {
                  this.g[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
                  this.g[var2].setBounds(190, 78, 265, 250);
               } else if (var2 == 5) {
                  this.g[var2].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
                  this.g[var2].setBounds(45, 328, 412, 156);
               }

               ++var2;
            }

            this.abm = new Class357(Class622.this.gk(), 8, 3, 51, 51, 0, 0, 46, 330);
            this.abm.hf(Class511.a("sc/d/18.png"));
            long[] var12 = new long[1];
            boolean var10005 = true;
            var12[0] = -1L;
            this.abm.ud(var12);
            this.add(this.abm);
         }
      };
      this.anv.setBounds(5 >> 3, 5 >> 3, 24063 & 9185, 3070 & 30207);
      this.anx.setBounds(3 >> 2, 3 >> 2, 8161 & 25087, 31230 & 2047);
      this.anu.setBounds(5 >> 3, 5 >> 3, 30179 & 3069, 3583 & 29694);
      this.anw.setBounds(3 & 4, 3 & 4, 481, 510);
      this.add(this.anv);
      this.add(this.anx);
      this.add(this.anu);
      this.add(this.anw);
      this.r = new Class436(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(5 >> 3)));
      this.r.setBounds(47, 34, 408, 20);
      this.add(this.r);
      if (this.uw().VALUE.indexOf("W") == -4 >> 2) {
         this.jd[5 >> 3].setVisible((boolean)(5 >> 3));
         this.jd[--1].setVisible((boolean)(5 >> 3));
      }

      if (!this.uw().n(5 >> 1, 11)) {
         if (this.uw().n(--2, 8)) {
            this.jd[--2].setVisible((boolean)(2 & 5));
         } else if (!this.uw().n(--2, --3) && !this.uw().n(--2, 12)) {
            if (this.uw().gameType != --1) {
               var10000 = this.uw().gameType;
            }
         } else {
            this.jd[1 ^ 3].setVisible((boolean)(3 >> 2));
         }
      }

      var3 = 0;
      int var2 = 2 & 5;

      for(var10000 = var3; var10000 < this.jd.length; var10000 = var3) {
         if (this.jd[var3].isVisible()) {
            Class322 var6 = this.jd[var3];
            var10001 = 57 + 92 * var2;
            ++var2;
            var6.setBounds(var10001, 20, 85, 33);
         }

         ++var3;
      }

      this.y(--3);
   }

   public void gd(int var1, String var2) {
      int var10000 = 2 & 5;
      this.m = var1;

      int var3;
      for(var3 = var10000; var10000 < this.jd.length; var10000 = var3) {
         this.jd[var3].setKeep((boolean)(var3 == this.m ? 5 >> 2 : 0));
         ++var3;
      }

      Class622 var6;
      if (var1 == 0) {
         for(var10000 = var3 = 3 & 4; var10000 < this.anv.oj.length; var10000 = var3) {
            this.anv.add(this.anv.oj[var3++]);
         }

         for(var10000 = var3 = 2 & 5; var10000 < this.anv.og.length; var10000 = var3) {
            this.anv.add(this.anv.og[var3++], 3 ^ 3);
         }

         var6 = this;
         this.anv.oj[--4].setText("确定购买");
         this.anv.fx(var2);
         this.anv.ol.cc();
      } else if (var1 == (3 & 5)) {
         for(var10000 = var3 = 2 & 5; var10000 < this.anv.oj.length; var10000 = var3) {
            this.anx.add(this.anv.oj[var3++]);
         }

         for(var10000 = var3 = 3 ^ 3; var10000 < this.anv.og.length; var10000 = var3) {
            this.anx.add(this.anv.og[var3++], 2 & 5);
         }

         var6 = this;
         this.anv.oj[--4].setText("确定寄售");
         this.anx.fx(var2);
         this.anx.ag[3 ^ 3].cc();
         this.anx.ag[5 >> 2].cc();
      } else if (var1 == --2) {
         var6 = this;
         this.anu.ahq = this.vc().as(--1);
         this.anu.ahs = this.vc().as(1 ^ 3);
         this.anu.bt.setTextSize("#c000000将仙玉兑换成绑玉，兑换比例为#cFF0000 " + this.anu.ahq.getHp() + "：" + this.anu.ahq.getMp(), 4586 & 28541);
         this.anu.bt.setBounds(28561 & 4335, 125 & 126, this.anu.bt.getWidth(), this.anu.bt.getHeight());
         this.anu.aho.setTextSize("#c000000将大话币兑换成绑玉，兑换比例为#cFF0000 " + this.anu.ahs.getHp() + "：" + this.anu.ahs.getMp(), 16875 & 16252);
         this.anu.aho.setBounds(23181 & 9715, 13518 & 19391, this.anu.aho.getWidth(), this.anu.aho.getHeight());
         this.anu.p[3 & 4].setText("0");
         this.anu.p[--1].setText("0");
         this.anu.ahn[3 >> 2].cc();
         this.anu.ahn[5 >> 2].cc();
         this.anu.ahn[5 >> 1].cc();
      } else {
         if (var1 == --3) {
            this.anw.bv((petExchange)null);
            this.anw.abn.cc();
         }

         var6 = this;
      }

      var6.anv.setVisible((boolean)(var1 == 0 ? 4 ^ 5 : 0));
      this.anx.setVisible((boolean)(var1 == (3 & 5) ? 5 >> 2 : 0));
      this.anu.setVisible((boolean)(var1 == 5 >> 1 ? --1 : 0));
      this.anw.setVisible(var1 == --3);
   }

   public void c(int var1, Object var2) {
      long var3;
      long var5;
      if (var1 != (6139 & 26813) && var1 != (8959 & 23994) && var1 != (14847 & 18107) && var1 != (20991 & 11964)) {
         if (var1 == (5821 & 27135)) {
            if (this.m == 0) {
               if (this.anv.om <= 0L) {
                  this.aej.f("没有正在销售仙玉");
                  return;
               }

               if ((var3 = this.anv.ok[5 >> 3].gl()) < 100L) {
                  this.aej.f("购买数量最少为100");
                  return;
               }

               var5 = this.anv.ok[--1].gl() + this.anv.om;
               StringBuffer var16;
               (var16 = new StringBuffer()).append("请确认需要消耗#Y");
               var16.append(var5 * var3);
               var16.append("#W大话币购买#Y");
               var16.append(var3);
               var16.append("#W点仙玉");
               this.ux().aal(new ConfirmBean(61 & 95, "B0" + var5 + "|" + var3, var16.toString()));
               return;
            }

            if (this.m == --1) {
               var3 = this.anx.ns[3 & 4].gl();
               var5 = this.anx.ns[3 >> 1].gl();
               if (var3 < 100L) {
                  this.aej.f("售卖数量最少为100");
                  return;
               }

               if (var5 < 100L) {
                  this.aej.f("价格不能为零");
                  return;
               }

               String var15 = Agreement.getSendTextAES("exchange", "S0" + var5 + "|" + var3);
               this.uw().d(var15);
               return;
            }
         } else {
            if (var1 == (30718 & 2239)) {
               <undefinedtype> var11 = (<undefinedtype>)var2;
               if (this.m == 5 >> 2 && null.aeh(var11) != 0L) {
                  String var12 = Agreement.getSendTextAES("exchange", "S1" + null.aeh(var11));
                  this.uw().d(var12);
                  return;
               }

               return;
            }

            if (var1 == (19391 & 13567) || var1 == (12530 & 20429)) {
               if ((var3 = this.anu.ahr[var1 == (13823 & 19135) ? 3 ^ 3 : 1].gl()) <= 0L) {
                  return;
               }

               SummonPetBean var14;
               (var14 = new SummonPetBean()).setOpertype(var1 == (447 & 32511) ? --3 : 4);
               var14.setPetid(new BigDecimal(var3));
               String var6 = Agreement.getSendTextAES("summonpet", Class695.b().toJson(var14));
               this.uw().d(var6);
               return;
            }

            if (var1 == (15313 & 17647) || var1 == 194) {
               petExchange var10;
               if ((var10 = this.anw.ze) == null) {
                  return;
               }

               if (this.anw.wj != 0L && this.anw.wj > this.vd().getLoginResult().getGold().longValue()) {
                  this.aej.f("金钱不足");
                  return;
               }

               if (!this.anw.t()) {
                  this.aej.f("达不到合成条件");
                  return;
               }

               SummonPetBean var4;
               SummonPetBean var17 = var4 = new SummonPetBean();
               var17.setOpertype(--5);
               var17.setPetid(new BigDecimal(var10.geteId()));
               var17.setGoodid(new BigDecimal(var1 == 193 ? 5 >> 2 : 99));
               String var13 = Agreement.getSendTextAES("summonpet", Class695.b().toJson(var4));
               this.uw().d(var13);
            }
         }
      } else {
         var3 = (long)this.anv.br;
         var5 = (long)this.anv.j;
         long var7 = var3;
         long var10000;
         if (var1 == (5627 & 27325)) {
            var10000 = var7 = 1L;
         } else if (var1 == (20735 & 12219)) {
            var10000 = var7 = var3 - 1L;
         } else if (var1 == (20223 & 12732)) {
            var10000 = var7 = var3 + 1L;
         } else {
            if (var1 == (23295 & 9658)) {
               var7 = var5;
            }

            var10000 = var7;
         }

         if (var10000 <= 0L) {
            var7 = 1L;
         }

         if (var7 > var5) {
            var7 = var5;
         }

         if (var7 == var3) {
            return;
         }

         String var9;
         if (this.m == 0) {
            var9 = Agreement.getSendTextAES("exchange", "X0" + var7);
            this.uw().d(var9);
            return;
         }

         if (this.m == (3 & 5)) {
            var9 = Agreement.getSendTextAES("exchange", "X1" + var7);
            this.uw().d(var9);
            return;
         }
      }

   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(4 ^ 5);
   }

   public void y(int var1) {
      if (var1 != 0 && var1 != --1) {
         this.gd(var1, (String)null);
      } else {
         String var2 = Agreement.getSendTextAES("exchange", "X" + var1 + "1");
         this.uw().d(var2);
      }
   }

   public Long x(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         long var4;
         if (this.m == 0) {
            if (var3 == this.anv.oh[3 & 4]) {
               var4 = (var4 = this.anv.om + this.anv.ok[--1].gl()) > 0L ? this.vd().getLoginResult().getGold().longValue() / var4 : 0L;
               if (var1 > var4) {
                  return var4;
               }

               return null;
            }

            if (var3 == this.anv.oh[3 & 5]) {
               var4 = (var4 = this.anv.om + (var1 > 999999L ? 999999L : var1)) > 0L ? this.vd().getLoginResult().getGold().longValue() / var4 : 0L;
               if (var4 < this.anv.ok[3 & 4].gl()) {
                  this.anv.oh[2 & 5].setText(String.valueOf(var4));
               }

               if (var1 > 999999L) {
                  return 999999L;
               }

               return null;
            }
         } else if (this.m == 3 >> 1) {
            if (var3 == this.anx.p[3 & 4]) {
               var4 = this.vd().getLoginResult().getCodecard().longValue();
               if (var1 > var4) {
                  return var4;
               }

               return null;
            }

            if (var3 == this.anx.p[--1]) {
               var4 = 10000000L;
               if (var1 > var4) {
                  this.ux().f("最大1点仙玉可寄售1000W大话币");
               }

               if (var1 > var4) {
                  return var4;
               }

               return null;
            }
         } else if (this.m == --2) {
            if (var3 == this.anu.p[3 >> 2]) {
               var4 = this.vd().getLoginResult().getCodecard().longValue();
               if (var1 > var4) {
                  return var4;
               }

               return null;
            }

            if (var3 == this.anu.p[--1]) {
               var4 = this.vd().getLoginResult().getGold().longValue();
               if (var1 > var4) {
                  return var4;
               }

               return null;
            }
         }

         return null;
      }
   }
}
