package com.xy;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class432 extends Class345 {
   private JList<String> ja;
   private DefaultListModel<String> jb;
   private BigDecimal ge;
   private Class245[] jc;
   private JLabel[] hj;
   private Class322[] jd;
   private JScrollPane dw;
   private Class436[] g;

   public Class432(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = -4 >> 2;
      super(55 & 109, --3, Class345.aef, var1);
      this.va(var10005, 3 & 4, 6635 & 26398, 24907 & 8190, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(3 >> 2)), "任命");
      Class322[] var4 = new Class322[var10001];
      boolean var10003 = true;
      this.jd = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.jd.length; var10000 = var2) {
         Class322[] var3 = this.jd;
         Class322 var10002 = new Class322;
         var10005 = 4 ^ 5;
         int var10006 = (9438 & 23543) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class432 var10010;
         if (var2 == 0) {
            var10009 = "确认";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "取消";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/7.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.jd[var2].setBounds((126 & 71) + var2 * (89 & 127), 9023 & 24030, 127 & 59, 25 & 127);
         this.jd[var2].setText(var2 == 0 ? "确认" : (var2 == 3 >> 1 ? "取消" : ""));
         this.add(this.jd[var2++]);
      }

      Class245[] var5 = new Class245[--3];
      var10003 = true;
      this.jc = var5;

      for(var10000 = var2 = 3 >> 2; var10000 < this.jc.length; var10000 = var2) {
         this.jc[var2] = Class133.a(87 & 127, (116 & 43) + var2 * (26 & 127), 28062 & 4859, 31 & 115, 27 & 110, Color.white, Class681.q);
         this.jc[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
         this.add(this.jc[var2++]);
      }

      JLabel[] var6 = new JLabel[--4];
      var10003 = true;
      this.hj = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(46, 32 + 26 * var2, 36, 19, 5 >> 3, Class681.c("#c000000"), Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "名称" : (var2 == (4 ^ 5) ? "种族" : (var2 == --2 ? "等级" : (var2 == --3 ? "职位列表" : ""))));
         this.add(this.hj[var2]);
         if (var2 == --3) {
            this.hj[var2].setForeground(Class681.c("#cFFFFFF"));
            this.hj[var2].setBounds(47, 113, 194, 21);
         }

         ++var2;
      }

      var10001 = --2;
      this.jb = new DefaultListModel();
      this.jb.add(3 ^ 3, "护法");
      this.jb.add(3 & 5, "长老");
      this.jb.add(1 ^ 3, "堂主");
      this.jb.add(--3, "香主");
      this.jb.add(--4, "精英");
      this.jb.add(--5, "帮众");
      this.ja = new JList();
      this.ja.setSelectionBackground(new Color(33, 42, 52));
      this.ja.setSelectionForeground(Color.GREEN);
      this.ja.setForeground(Color.GREEN);
      this.ja.setFont(Class681.ce);
      this.ja.setBackground(Class681.cu);
      this.ja.setModel(this.jb);
      this.dw = Class133.f(49, 133, 195, 146, this.ja, -4 >> 2);
      this.add(this.dw);
      Class436[] var8 = new Class436[var10001];
      var10003 = true;
      this.g = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         Class432 var9;
         if (var2 == 0) {
            var9 = this;
            this.g[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
            this.g[var2].setBounds(47, 113, 194, 21);
         } else {
            if (var2 == (2 ^ 3)) {
               this.g[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(2 & 5)));
               this.g[var2].setBounds(47, 113, 194, 166);
            }

            var9 = this;
         }

         var9.add(this.g[var2++]);
      }

   }

   public void y(int var1) {
      if (var1 == (21718 & 11263)) {
         String var2;
         if ((var2 = (String)this.ja.getSelectedValue()) == null || var2.equals("")) {
            return;
         }

         String var3 = Agreement.getSendTextAES("gangappoint", this.ge + "|" + var2);
         this.uw().d(var3);
         this.ve().n(this.ae());
         Class490 var4;
         if ((var4 = (Class490)this.ve().m(114 & 61)) != null) {
            var4.eb(this.ge, var2);
            return;
         }
      } else if (var1 == (2007 & 30975)) {
         this.ve().n(this.ae());
      }

   }

   public void fh(BigDecimal var1, String var2, String var3, String var4) {
      this.ge = var1;
      this.jc[2 & 5].setText(var2);
      this.jc[--1].setText(var3);
      this.jc[5 >> 1].setText(var4);
      this.ve().a(this.ae());
   }
}
