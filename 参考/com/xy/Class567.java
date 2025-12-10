package com.xy;

import com.xy.entity.Mount;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PropertyUtil;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class567 extends Class345 {
   private JScrollPane alf;
   private BigDecimal dh;
   private int agq;
   private Class245[] alg;
   private Class436[] alh;
   private JList<String> ali;
   private DefaultListModel<String> alj;
   private Class643[] alk;
   private int do;
   private int dp;
   private int br;
   private JList<String> all;
   private int gc;
   private int gw;
   private JLabel[] iv;
   private Class659 qc;
   private DefaultListModel<String> alm;
   private int bn;
   private RichLabel[] aln;
   private JScrollPane af;

   public void adg(Mount var1) {
      int var10002 = --4;
      this.dh = var1.getMid();
      this.gw = var1.getMountid();
      this.alg[5 >> 3].setText(var1.getMountname());
      this.adi(var1);
      this.gc = var10002;
      this.alg[4 ^ 5].setText(String.valueOf(this.gc));
      this.alg[5 >> 1].setText(String.valueOf(this.gc == --1 ? --2 : (this.gc == --2 ? 46 & 87 : (this.gc == --3 ? 79 & 60 : 20))));
      this.qc.oy().removeAllElements();
      Class567 var10000;
      if (var1.getMountid() == 5 >> 2) {
         var10000 = this;
         this.qc.fx("加根骨，减力量");
         this.qc.fx("加灵性，减力量");
      } else if (var1.getMountid() == 5 >> 1) {
         var10000 = this;
         this.qc.fx("加力量，减根骨");
      } else if (var1.getMountid() == --3) {
         var10000 = this;
         this.qc.fx("加根骨，减灵性");
         this.qc.fx("加力量，减灵性");
      } else if (var1.getMountid() == --4) {
         var10000 = this;
         this.qc.fx("加根骨，减力量");
      } else {
         if (var1.getMountid() == --5) {
            this.qc.fx("加力量，减根骨");
            this.qc.fx("加灵性，减根骨");
         }

         var10000 = this;
      }

      var10000.ve().a(this.ae());
   }

   public void gd(int var1, String var2) {
      RichLabel var8 = var1 == 0 ? this.aln[46 & 87] : this.aln[95 & 39];
      if (Class394.o(var2)) {
         var2 = (String)this.alj.getElementAt(3 >> 2);
      }

      BaseMountSkill var10;
      if ((var10 = PropertyUtil.getBaseMountSkill(var2)) == null) {
         var8.setTextSize((String)null, 26317 & 6655);
      } else {
         int var4 = this.br;
         int var5 = this.do;
         int var6 = this.dp;
         var1 = var1 == 0 ? this.bn : this.agq;
         int var3;
         int var7;
         if ((var7 = var1 >> (94 & 39)) > 0) {
            for(int var10000 = var3 = 3 & 4; var10000 < 3; var10000 = var3) {
               if ((var1 >> --2 * var3 & 5 >> 2) != 0) {
                  int var9 = (var1 >> (1 ^ 3) * var3 + (3 & 5) & (4 ^ 5)) == 3 >> 1 ? --1 : 0;
                  if (var3 == 0) {
                     var4 += var9 != 0 ? var7 : -var7;
                  } else if (var3 == --1) {
                     var5 += var9 != 0 ? var7 : -var7;
                  } else if (var3 == (1 ^ 3)) {
                     var6 += var9 != 0 ? var7 : -var7;
                  }
               }

               ++var3;
            }
         }

         String var11 = var10.getText(var4, var5, var6, 100000, this.gw).replace("#r【熟练度】100000/100000", "");
         var8.setTextSize(var11, 4319 & 28653);
      }
   }

   public void y(int var1) {
      if (var1 == (17367 & 15551)) {
         if (this.bn == 0) {
            this.ux().f("坐骑没有重塑方案");
         } else {
            String var5 = Agreement.getSendTextAES("usermount", "CZ|" + this.dh + "|0");
            this.uw().d(var5);
         }
      } else {
         int var2;
         if (var1 != (8603 & 24316) && var1 != (6075 & 26845)) {
            if (var1 != (29882 & 3039) && var1 == (17883 & 15039)) {
               var2 = this.gc == (3 & 5) ? 5 >> 1 : (this.gc == 5 >> 1 ? 22 & 111 : (this.gc == --3 ? 44 & 95 : 20));
               Goodstable var6;
               if ((var6 = this.vd().az(721L)) == null || var6.getUsetime() < var2) {
                  this.ux().f("物品数量不足" + var2 + "个");
                  return;
               }

               String var4 = Agreement.getSendTextAES("usermount", "CZ|" + this.dh + "|" + this.agq + "|" + var6.getRgid());
               this.uw().d(var4);
            }

         } else {
            Class567 var10000;
            if (var1 == (14527 & 18392)) {
               if (this.gc <= (4 ^ 5)) {
                  this.ux().f("重塑等级最低为1");
                  return;
               }

               var10000 = this;
               this.gc -= 3 >> 1;
            } else {
               if (this.gc >= --4) {
                  this.ux().f("重塑等级最高为4");
                  return;
               }

               var10000 = this;
               this.gc += 3 >> 1;
            }

            var10000.alg[4 ^ 5].setText(String.valueOf(this.gc));
            this.alg[5 >> 1].setText(String.valueOf(this.gc == --1 ? 5 >> 1 : (this.gc == 5 >> 1 ? 46 & 87 : (this.gc == --3 ? 111 & 28 : 20))));
            var2 = this.agq & 63 & 127;
            int var3 = 3 ^ 3;
            int var7;
            if (this.gw != (1 ^ 3) && this.gw != --4) {
               var3 = this.gc == 3 >> 1 ? 111 & 31 : (this.gc == --2 ? 94 & 63 : (this.gc == --3 ? 126 & 41 : 50));
               var7 = var2;
            } else {
               var3 = this.gc == (3 & 5) ? --2 : (this.gc == (1 ^ 3) ? --4 : (this.gc == --3 ? 31 & 102 : 8));
               var7 = var2;
            }

            var2 = var7 | var3 << (31 & 102);
            this.agq = var2;
            this.d();
         }
      }
   }

   public Class567(GameView var1) {
      int var10001 = --5;
      int var10009 = -4 >> 2;
      super(26863 & 6075, --2, Class345.aef, var1);
      this.va(var10009, 5 >> 3, 10878 & 22431, 23314 & 9967, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 124 & 71, 124 & 71, 124 & 71, 124 & 71, (boolean)(3 & 4)), "坐骑重塑");
      this.qc = new Class659(5 >> 3, 119 & 108, this);
      this.qc.gb((boolean)(3 >> 1));
      this.qc.vf(2004 & 31099, 62 & 93, 9381 & 23551, 85 & 62);
      this.add(this.qc);
      Class643[] var6 = new Class643[var10001];
      boolean var10003 = true;
      this.alk = var6;

      int var3;
      Class567 var5;
      int var10000;
      for(var10000 = var3 = 3 & 4; var10000 < this.alk.length; var10000 = var3) {
         if (var3 == 0) {
            var5 = this;
            this.alk[var3] = new Class643("sc/e/6.png", 3 >> 1, (23231 & 9687) + var3, Class681.bm, (Color[])null, "恢复", this);
            this.alk[var3].setBounds(21247 & 11736, 31 & 125, 35 & 126, 82 & 63);
         } else if (var3 == (3 & 5)) {
            var5 = this;
            this.alk[var3] = new Class643("sc/e/32.png", --1, (32247 & 671) + var3, this);
            this.alk[var3].setBounds(24813 & 8178, 57, 11, 15);
         } else if (var3 == 5 >> 1) {
            var5 = this;
            this.alk[var3] = new Class643("sc/e/34.png", 4 ^ 5, 151 + var3, this);
            this.alk[var3].setBounds(235, 57, 11, 15);
         } else if (var3 == --3) {
            var5 = this;
            this.alk[var3] = new Class643("sc/e/40.png", 3 >> 1, 151 + var3, Class681.bm, (Color[])null, "？", this);
            this.alk[var3].setBounds(502, 56, 18, 18);
         } else {
            if (var3 == --4) {
               this.alk[var3] = new Class643("sc/e/7.png", 4 ^ 5, 151 + var3, Class681.ak, (Color[])null, "确认", this);
               this.alk[var3].setBounds(254, 472, 59, 25);
               this.alk[var3].setForeground(Color.black);
            }

            var5 = this;
         }

         var5.add(this.alk[var3++]);
      }

      JLabel[] var7 = new JLabel[14];
      var10003 = true;
      this.iv = var7;

      for(var10000 = var3 = 3 ^ 3; var10000 < this.iv.length; var10000 = var3) {
         this.iv[var3] = Class133.b(46 + 215 * (var3 % --2), 28 + 28 * (var3 / (1 ^ 3)), 120, 19, Color.black, Class681.ak);
         this.iv[var3].setText(var3 == 0 ? "待重塑坐骑" : (var3 == --1 ? "重塑方向" : (var3 == 5 >> 1 ? "重塑等级" : (var3 == --3 ? "需要筋骨提气丸" : (var3 != --4 && var3 != --5 ? (var3 != 6 && var3 != 7 ? (var3 != 8 && var3 != 9 ? (var3 != 10 && var3 != 11 ? (var3 == 12 ? "重塑前坐骑" : (var3 == 13 ? "重塑后坐骑" : "")) : "技能预览") : "根骨") : "力量") : "灵性")))));
         this.iv[var3].setHorizontalAlignment(10);
         if (var3 >= --4 && var3 <= 9) {
            var5 = this;
            this.iv[var3].setBounds(59 + 242 * ((var3 - --4) % (5 >> 1)), 129 + 25 * ((var3 - --4) / 2), 36, 19);
         } else if (var3 >= 10 && var3 <= 11) {
            var5 = this;
            this.iv[var3].setForeground(Color.white);
            this.iv[var3].setHorizontalAlignment(3 ^ 3);
            this.iv[var3].setBounds(56 + 242 * (var3 - 10), 203, 211, 21);
         } else {
            label331: {
               if (var3 >= 12 && var3 <= 13) {
                  this.iv[var3].setFont(Class681.cg);
                  this.iv[var3].setBounds(70 + (var3 - 12) * 242, 95, 100, 23);
                  if (var3 == 12) {
                     var5 = this;
                     this.iv[var3].setForeground(Color.white);
                     break label331;
                  }

                  if (var3 == 13) {
                     this.iv[var3].setForeground(Color.green);
                  }
               }

               var5 = this;
            }
         }

         var5.add(this.iv[var3++]);
      }

      RichLabel[] var8 = new RichLabel[8];
      var10003 = true;
      this.aln = var8;

      for(var10000 = var3 = 3 ^ 3; var10000 < this.aln.length; var10000 = var3) {
         this.aln[var3] = new RichLabel("", var3 != 6 && var3 != 7 ? Class681.q : Class681.ce);
         if (var3 >= 0 && var3 <= 2) {
            var5 = this;
            this.aln[var3].setBounds(101, 126 + 25 * var3, 155, 19);
         } else if (var3 >= 3 && var3 <= 5) {
            var5 = this;
            this.aln[var3].setBounds(343, 126 + 25 * (var3 - 3), 155, 19);
         } else if (var3 == 6) {
            var5 = this;
            this.aln[var3].setBounds(60, 323, this.aln[var3].getWidth(), this.aln[var3].getHeight());
         } else {
            if (var3 == 7) {
               this.aln[var3].setBounds(301, 323, this.aln[var3].getWidth(), this.aln[var3].getHeight());
            }

            var5 = this;
         }

         var5.add(this.aln[var3++]);
      }

      Class245[] var9 = new Class245[9];
      var10003 = true;
      this.alg = var9;

      for(var10000 = var3 = 5 >> 3; var10000 < this.alg.length; var10000 = var3) {
         this.alg[var3] = Class133.a(136, 28, 114, 19, 10, Color.white, Class681.q);
         if (var3 == (2 ^ 3)) {
            var5 = this;
            this.alg[var3].setBounds(136, 55, 112, 19);
         } else if (var3 == 2) {
            var5 = this;
            this.alg[var3].setBounds(385, 55, 114, 19);
         } else if (var3 >= 3 && var3 <= 5) {
            var5 = this;
            this.alg[var3].setBounds(99, 129 + 25 * (var3 - 3), 155, 19);
         } else {
            if (var3 >= 6 && var3 <= 8) {
               this.alg[var3].setBounds(341, 129 + 25 * (var3 - 6), 155, 19);
            }

            var5 = this;
         }

         var5.alg[var3].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
         this.add(this.alg[var3++]);
      }

      var10000 = 3 ^ 3;
      this.alj = new DefaultListModel();
      this.alm = new DefaultListModel();
      this.all = new JList();
      this.ali = new JList();

      for(var3 = var10000; var10000 < 2; var10000 = var3) {
         JList var2 = var3 == 0 ? this.all : this.ali;
         var2.setOpaque((boolean)(3 ^ 3));
         var2.setSelectionBackground(new Color(33, 42, 52));
         var2.setSelectionForeground(Color.GREEN);
         var2.setForeground(Color.GREEN);
         var2.setFont(Class681.q);
         var2.setBackground(Class681.cu);
         var2.setModel(var3 == 0 ? this.alj : this.alm);
         ++var3;
      }

      var10000 = 0;
      this.all.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               String var2;
               if (Class394.o(var2 = (String)Class567.this.all.getSelectedValue())) {
                  return;
               }

               Class567.this.gd(5 >> 3, var2);
            }

         }
      });
      this.ali.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               String var2;
               if (Class394.o(var2 = (String)Class567.this.ali.getSelectedValue())) {
                  return;
               }

               Class567.this.gd(5 >> 2, var2);
            }

         }
      });

      for(var3 = 0; var10000 < 9; var10000 = var3) {
         String var4 = var3 == 0 ? "夺命追魂" : (var3 == 1 ? "破釜沉舟" : (var3 == 2 ? "后发制人" : (var3 == 3 ? "天雷怒火" : (var3 == 4 ? "兴风作浪" : (var3 == 5 ? "万劫不复" : (var3 == 6 ? "金身不坏" : (var3 == 7 ? "天神护体" : "心如止水")))))));
         this.alj.addElement(var4);
         ++var3;
         this.alm.addElement(var4);
      }

      this.alf = Class133.f(57, 224, 210, 96, this.all, -1);
      this.af = Class133.f(298, 224, 210, 96, this.ali, -1);
      this.add(this.alf);
      this.add(this.af);
      Class436[] var10 = new Class436[10];
      var10003 = true;
      this.alh = var10;

      for(var10000 = var3 = 0; var10000 < this.alh.length; var10000 = var3) {
         this.alh[var3] = new Class436();
         this.add(this.alh[var3]);
         if (var3 >= 0 && var3 <= 1) {
            this.alh[var3].fw("sc/d/34.png");
            this.alh[var3].setBounds(49 + 242 * var3, 95, 205, 23);
         } else if (var3 >= 2 && var3 <= 3) {
            this.alh[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
            this.alh[var3].setBounds(56 + 241 * (var3 - 2), 203, 211, 21);
         } else if (var3 >= 4 && var3 <= 5) {
            this.alh[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.alh[var3].setBounds(56 + 241 * (var3 - 4), 203, 211, 120);
         } else if (var3 >= 6 && var3 <= 7) {
            this.alh[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.alh[var3].setBounds(56 + 241 * (var3 - 6), 322, 211, 130);
         } else if (var3 >= 8 && var3 <= 9) {
            this.alh[var3].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
            this.alh[var3].setBounds(47 + 241 * (var3 - 8), 83, 231, 380);
         }

         ++var3;
      }

   }

   public void d() {
      int var1 = this.agq >> (14 & 119);
      StringBuffer var2 = new StringBuffer();

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < 3; var10000 = var3) {
         var2.setLength(3 & 4);
         var2.append("#W");
         var2.append(var3 == 0 ? this.br : (var3 == (4 ^ 5) ? this.do : this.dp));
         if (var1 > 0 && (this.agq >> (1 ^ 3) * var3 & 5 >> 2) != 0) {
            int var4 = (this.agq >> (5 >> 1) * var3 + (5 >> 2) & (4 ^ 5)) == --1 ? 5 >> 2 : 0;
            var2.append("#R");
            var2.append(var4 != 0 ? "+" : "-");
            var2.append(var1);
         }

         this.aln[var3 + --3].setTextSize(var2.toString(), 7414 & 25503);
         RichLabel var5 = this.aln[var3 + --3];
         int var10001 = this.aln[var3 + --3].getX();
         int var10002 = this.aln[var3 + --3].getY();
         ++var3;
         var5.setBounds(var10001, var10002, 26559 & 6363, 59 & 87);
      }

      this.gd(--1, (String)this.ali.getSelectedValue());
   }

   public void adi(Mount var1) {
      if (this.gw == var1.getMountid()) {
         this.gw = var1.getMountid();
         int var2;
         if ((var2 = var1.getMountlvl()) > (127 & 100)) {
            var2 -= 100;
         }

         this.br = (int)Math.floor((double)((float)var1.getSpri() + (float)var2 / 10.0F * (float)var1.getSpri() / 2.0F));
         this.do = (int)Math.floor((double)((float)var1.getPower() + (float)var2 / 10.0F * (float)var1.getPower() / 2.0F));
         this.dp = (int)Math.floor((double)((float)var1.getBone() + (float)var2 / 10.0F * (float)var1.getBone() / 2.0F));
         this.bn = var1.getMountCZ();
         int var5 = this.bn >> (71 & 62);
         StringBuffer var6 = new StringBuffer();

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < 3; var10000 = var3) {
            var6.setLength(5 >> 3);
            var6.append("#W");
            var6.append(var3 == 0 ? this.br : (var3 == (4 ^ 5) ? this.do : this.dp));
            if (var5 > 0 && (this.bn >> --2 * var3 & --1) != 0) {
               int var4 = (this.bn >> (5 >> 1) * var3 + (4 ^ 5) & (2 ^ 3)) == (4 ^ 5) ? 3 >> 1 : 0;
               var6.append("#R");
               var6.append(var4 != 0 ? "+" : "-");
               var6.append(var5);
            }

            this.aln[var3].setTextSize(var6.toString(), 26590 & 6327);
            RichLabel var7 = this.aln[var3];
            int var10001 = this.aln[var3].getX();
            int var10002 = this.aln[var3].getY();
            ++var3;
            var7.setBounds(var10001, var10002, 27551 & 5371, 95 & 51);
         }

         this.gd(5 >> 3, (String)this.all.getSelectedValue());
      }
   }

   public void f(String var1) {
      int var2 = 2 & 5;
      if (var1.equals("加根骨，减力量")) {
         var2 = 52 & 127;
      } else if (var1.equals("加灵性，减力量")) {
         var2 = 23 & 111;
      } else if (var1.equals("加力量，减根骨")) {
         var2 = 28 & 127;
      } else if (var1.equals("加根骨，减灵性")) {
         var2 = 59 & 117;
      } else if (var1.equals("加力量，减灵性")) {
         var2 = 125 & 15;
      } else if (var1.equals("加灵性，减根骨")) {
         var2 = 31 & 115;
      }

      boolean var3 = false;
      int var10000;
      int var4;
      if (this.gw != 5 >> 1 && this.gw != --4) {
         var4 = this.gc == 5 >> 2 ? 15 & 127 : (this.gc == 5 >> 1 ? 126 & 31 : (this.gc == --3 ? 106 & 61 : 50));
         var10000 = var2;
      } else {
         var4 = this.gc == (4 ^ 5) ? 5 >> 1 : (this.gc == 5 >> 1 ? --4 : (this.gc == --3 ? 86 & 47 : 8));
         var10000 = var2;
      }

      var2 = var10000 | var4 << (62 & 71);
      this.agq = var2;
      this.d();
   }
}
