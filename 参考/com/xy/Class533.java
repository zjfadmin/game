package com.xy;

import com.xy.entity.Gang;
import com.xy.entity.GangGroup;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Class533 extends Class345 {
   private JTextArea oq;
   private Class369 or;
   private Class369 os;
   private Class436[] ot;
   private Class369 ou;
   private Class369 ov;
   private JLabel[] ow;
   private Class322[] ke;
   private Class369 ox;
   private Class369 oy;
   private Class369 oz;
   private Class369 pa;
   private Class369 pb;
   private JScrollPane ea;
   private Class369 pc;
   private Class369 pd;
   private Class369[] pe;
   private Class369 pf;
   private Class245[] al;
   private Class369 pg;
   private Class369 ph;
   private Class369 pi;

   public void y(int var1) {
      if (var1 == (25294 & 7677)) {
         String var2 = Agreement.getSendTextAES("obtainarticle", (String)null);
         this.uw().d(var2);
      }

   }

   public void in(Gang var1, GangGroup var2) {
      this.al[3 ^ 3].setText(var1.getGangname());
      this.al[3 >> 1].setText(var1.getGanggrade().toString());
      this.al[1 ^ 3].setText(var1.getBuilder().toString());
      this.al[--3].setText(var1.getGangnumber().toString());
      this.al[--4].setText(var1.getGangbelong());
      this.oq.setText(var1.getIntroduction());
      this.pa.ab(var1.getGanggrade().intValue());
      if (var2 != null) {
         this.oy.ab(var2.getXy());
         this.ov.ab(var2.getKj());
      }

   }

   public Class533(GameView var1) {
      int var10001 = 5 >> 1;
      int var10003 = 3 & 4;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10003, 3 ^ 3, 9910 & 23519, 24027 & 9215, Class345.aei);
      Class322[] var4 = new Class322[var10001];
      boolean var10 = true;
      this.ke = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.ke.length; var10000 = var2) {
         Class322[] var3 = this.ke;
         Class322 var10002 = new Class322;
         int var10005 = --1;
         int var10006 = (14812 & 18159) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class533 var10010;
         if (var2 == 0) {
            var10009 = "赏功堂";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "帮派仓库";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.ke[var2].setBounds(5791 & 27517, (30198 & 2943) + var2 * (63 & 99), 123 & 103, 95 & 57);
         this.add(this.ke[var2++]);
      }

      JLabel[] var5 = new JLabel[78 & 55];
      var10 = true;
      this.ow = var5;

      for(var10000 = var2 = 3 & 4; var10000 < this.ow.length; var10000 = var2) {
         this.ow[var2] = Class133.b(24477 & 8830, (91 & 103) + (47 & 125) * var2, 89 & 110, 23 & 123, Color.black, Class681.ak);
         this.ow[var2].setText(var2 == 0 ? "帮派名称" : (var2 == --1 ? "帮派等级" : (var2 == (1 ^ 3) ? "帮派贡献" : (var2 == --3 ? "成员数量" : (var2 == --4 ? "现任帮主" : (var2 == --5 ? "帮派宗旨" : ""))))));
         this.ow[var2].setHorizontalAlignment(3 ^ 3);
         this.add(this.ow[var2]);
         if (var2 == --5) {
            this.ow[var2].setForeground(Color.white);
            this.ow[var2].setBounds(47 & 127, 25591 & 7500, 490, 21);
         }

         ++var2;
      }

      Class245[] var6 = new Class245[--5];
      var10 = true;
      this.al = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.al.length; var10000 = var2) {
         this.al[var2] = Class133.a(540, 86 + 45 * var2, 104, 19, 10, Color.white, Class681.q);
         this.al[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         this.add(this.al[var2++]);
      }

      this.oq = Class133.d(Class681.ce, Color.white);
      this.oq.setLineWrap((boolean)(3 & 5));
      this.oq.setEditable((boolean)(3 ^ 3));
      this.ea = Class133.f(50, 345, 490, 88, this.oq, 20);
      this.add(this.ea);
      this.pf = new Class369("sc/b/B292.png", 2 ^ 3, 3 >> 2, this);
      this.pf.setBounds(250, 180, 19, 18);
      this.add(this.pf);
      this.pd = new Class369("sc/b/B294.png", --1, 3 ^ 3, this);
      this.pd.setBounds(203, 202, 22, 19);
      this.add(this.pd);
      this.pb = new Class369("sc/b/B293.png", 4 ^ 5, 3 >> 2, this);
      this.pb.setBounds(293, 204, 20, 22);
      this.add(this.pb);
      this.ox = new Class369("sc/b/B295.png", 4 ^ 5, 3 ^ 3, this);
      this.ox.setBounds(244, 224, 16, 22);
      this.add(this.ox);
      this.ph = new Class369("sc/b/B300.png", 1, 0, this);
      this.ph.setBounds(93, 231, 78, 59);
      this.add(this.ph);
      this.oy = new Class369("sc/b/B301.png", 1, 2023, this);
      this.oy.setBounds(427, 160, 102, 70);
      this.add(this.oy);
      this.pg = new Class369("sc/b/B302.png", 1, 0, this);
      this.pg.setBounds(50, 175, 57, 61);
      this.add(this.pg);
      this.pc = new Class369("sc/b/B304.png", 1, 0, this);
      this.pc.setBounds(438, 62, 87, 71);
      this.add(this.pc);
      this.pa = new Class369("sc/b/B305.png", 1, 2021, this);
      this.pa.setBounds(330, 93, 130, 88);
      this.add(this.pa);
      this.ov = new Class369("sc/b/B299.png", 1, 2022, this);
      this.ov.setBounds(385, 200, 108, 85);
      this.add(this.ov);
      this.oz = new Class369("sc/b/B298.png", 1, 0, this);
      this.oz.setBounds(305, 256, 86, 52);
      this.add(this.oz);
      this.os = new Class369("sc/b/B297.png", 1, 0, this);
      this.os.setBounds(279, 75, 99, 67);
      this.add(this.os);
      this.or = new Class369("sc/b/B296.png", 1, 2026, this);
      this.or.setBounds(241, 179, 38, 47);
      this.add(this.or);
      this.ou = new Class369("sc/b/B290.png", 1, 0, this);
      this.ou.setBounds(326, 134, 21, 32);
      this.add(this.ou);
      this.pi = new Class369("sc/b/B291.png", 1, 0, this);
      this.pi.setBounds(370, 160, 21, 27);
      this.add(this.pi);
      Class369[] var8 = new Class369[8];
      var10 = true;
      this.pe = var8;

      for(var10000 = var2 = 0; var10000 < this.pe.length; var10000 = var2) {
         this.pe[var2] = new Class369("sc/b/B303.png", 1, 0, this);
         this.add(this.pe[var2++]);
      }

      var10001 = --4;
      this.pe[0].setBounds(106, 234, 24, 42);
      this.pe[1].setBounds(152, 257, 24, 42);
      this.pe[1 ^ 3].setBounds(179, 202, 24, 42);
      this.pe[--3].setBounds(210, 222, 24, 42);
      this.pe[--4].setBounds(279, 148, 24, 42);
      this.pe[--5].setBounds(312, 168, 24, 42);
      this.pe[6].setBounds(423, 58, 24, 42);
      this.pe[7].setBounds(496, 100, 24, 42);
      Class436[] var9 = new Class436[var10001];
      var10 = true;
      this.ot = var9;

      for(var10000 = var2 = 0; var10000 < this.ot.length; var10000 = var2) {
         this.ot[var2] = new Class436();
         Class533 var11;
         if (var2 == 0) {
            var11 = this;
            this.ot[var2].fw("sc/b/S166.png");
            this.ot[var2].setBounds(50, 60, 481, 261);
         } else if (var2 == 1) {
            var11 = this;
            this.ot[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
            this.ot[var2].setBounds(47, 55, 490, 269);
         } else if (var2 == --2) {
            var11 = this;
            this.ot[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, false));
            this.ot[var2].setBounds(47, 324, 490, 21);
         } else {
            if (var2 == --3) {
               this.ot[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
               this.ot[var2].setBounds(47, 324, 490, 112);
            }

            var11 = this;
         }

         var11.add(this.ot[var2++]);
      }

   }
}
