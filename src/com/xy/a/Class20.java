package com.xy.a;

import com.xy.entity.Gang;
import com.xy.entity.GangGroup;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Class20 extends com.xy.q.Class30 {
   private com.xy.i.Class2 iw;
   private com.xy.i.Class2 ix;
   private com.xy.i.Class2 iy;
   private com.xy.i.Class2 iz;
   private JTextArea ja;
   private com.xy.i.Class2 jb;
   private com.xy.i.Class2 jc;
   private com.xy.i.Class2 jd;
   private com.xy.i.Class2 je;
   private com.xy.i.Class2 jf;
   private com.xy.i.Class2 jg;
   private com.xy.i.Class2 jh;
   private com.xy.w.Class18[] iq;
   private com.xy.i.Class2 ji;
   private com.xy.i.Class18[] jj;
   private com.xy.q.Class14[] jk;
   private com.xy.i.Class2 jl;
   private com.xy.i.Class2[] jm;
   private com.xy.i.Class2 jn;
   private JScrollPane jo;
   private com.xy.i.Class2 jp;
   private JLabel[] au;

   public void gv(Gang var1, GangGroup var2) {
      this.jk[0].setText(var1.getGangname());
      this.jk[1].setText(var1.getGanggrade().toString());
      this.jk[2].setText(var1.getBuilder().toString());
      this.jk[3].setText(var1.getGangnumber().toString());
      this.jk[4].setText(var1.getGangbelong());
      this.ja.setText(var1.getIntroduction());
      this.iw.n(var1.getGanggrade().intValue());
      if (var2 != null) {
         this.jd.n(var2.getXy());
         this.jh.n(var2.getKj());
      }
   }

   public void g(int var1) {
      if (var1 == 204) {
         String var2 = Agreement.getSendTextAES("obtainarticle", null);
         this.za().k(var2);
      }
   }

   public Class20(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 662, 475, com.xy.q.Class30.agf);
      this.jj = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.jj.length; var10000 = var2) {
         com.xy.i.Class18[] var7 = this.jj;
         String var10004 = "$VxPx\u0007a\u001b'[0";
         int var10006 = 204 + var2;
         String var34;
         Class20 var10010;
         if (var2 == 0) {
            var34 = "赪劁堧";
            var34 = "赏功堂";
            var10010 = this;
         } else if (var2 == 1) {
            var34 = "帛浩仦廄";
            var34 = "帮派仓库";
            var10010 = this;
         } else {
            var34 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/26.png", 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var34, var10010);
         var7[var2] = var10002;
         this.jj[var2].setBounds(541, 374 + var2 * 35, 99, 25);
         this.add(this.jj[var2++]);
      }

      this.au = new JLabel[6];

      for (int var8 = var2 = 0; var8 < this.au.length; var8 = ++var2) {
         this.au[var2] = com.xy.q.Class1.k(540, 67 + 45 * var2, 72, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var9 = this.au[var2];
         String var14;
         if (var2 == 0) {
            var14 = "帰洛吓秕";
            var14 = "帮派名称";
         } else if (var2 == 1) {
            var14 = "帛浩筼绰";
            var14 = "帮派等级";
         } else if (var2 == 2) {
            var14 = "帰洛贿猋";
            var14 = "帮派贡献";
         } else if (var2 == 3) {
            var14 = "戥吏故醘";
            var14 = "成员数量";
         } else if (var2 == 4) {
            var14 = "玮仞帰丞";
            var14 = "现任帮主";
         } else if (var2 == 5) {
            var14 = "帛浩客斿";
            var14 = "帮派宗旨";
         } else {
            var14 = "";
         }

         var9.setText(var14);
         this.au[var2].setHorizontalAlignment(0);
         this.add(this.au[var2]);
         if (var2 == 5) {
            this.au[var2].setForeground(Color.white);
            this.au[var2].setBounds(47, 324, 490, 21);
         }
      }

      this.jk = new com.xy.q.Class14[5];

      for (int var10 = var2 = 0; var10 < this.jk.length; var10 = var2) {
         this.jk[var2] = com.xy.q.Class1.i(540, 86 + 45 * var2, 104, 19, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var22 = this.jk[var2];
         String var10003 = "V}\nz\n/\u00120UpB";
         var22.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.jk[var2++]);
      }

      this.ja = com.xy.q.Class1.e(com.xy.q.Class49.ac, Color.white);
      this.ja.setLineWrap(true);
      this.ja.setEditable(false);
      this.jo = com.xy.q.Class1.g(50, 345, 490, 88, this.ja, 20);
      this.add(this.jo);
      String var36 = "$VxWxwe\fe\u001b'[0";
      this.iz = new com.xy.i.Class2("sc/b/B292.png", 1, 0, this);
      this.iz.setBounds(250, 180, 19, 18);
      this.add(this.iz);
      String var37 = "V}\n|\n\\\u0017'\u00110UpB";
      this.jp = new com.xy.i.Class2("sc/b/B294.png", 1, 0, this);
      this.jp.setBounds(203, 202, 22, 19);
      this.add(this.jp);
      String var10011 = "$VxWxwe\fd\u001b'[0";
      this.jg = new com.xy.i.Class2("sc/b/B293.png", 1, 0, this);
      this.jg.setBounds(293, 204, 20, 22);
      this.add(this.jg);
      String var10012 = "V}\n|\n\\\u0017'\u00100UpB";
      this.jl = new com.xy.i.Class2("sc/b/B295.png", 1, 0, this);
      this.jl.setBounds(244, 224, 16, 22);
      this.add(this.jl);
      String var10013 = "$VxWxwd\u0005g\u001b'[0";
      this.ji = new com.xy.i.Class2("sc/b/B300.png", 1, 0, this);
      this.ji.setBounds(93, 231, 78, 59);
      this.add(this.ji);
      String var10014 = "V}\n|\n\\\u0016.\u00140UpB";
      this.jd = new com.xy.i.Class2("sc/b/B301.png", 1, 2023, this);
      this.jd.setBounds(427, 160, 102, 70);
      this.add(this.jd);
      String var10015 = "$VxWxwd\u0005e\u001b'[0";
      this.ix = new com.xy.i.Class2("sc/b/B302.png", 1, 0, this);
      this.ix.setBounds(50, 175, 57, 61);
      this.add(this.ix);
      String var10016 = "V}\n|\n\\\u0016.\u00110UpB";
      this.jn = new com.xy.i.Class2("sc/b/B304.png", 1, 0, this);
      this.jn.setBounds(438, 62, 87, 71);
      this.add(this.jn);
      String var10017 = "$VxWxwd\u0005b\u001b'[0";
      this.iw = new com.xy.i.Class2("sc/b/B305.png", 1, 2021, this);
      this.iw.setBounds(330, 93, 130, 88);
      this.add(this.iw);
      String var10018 = "V}\n|\n\\\u0017'\u001c0UpB";
      this.jh = new com.xy.i.Class2("sc/b/B299.png", 1, 2022, this);
      this.jh.setBounds(385, 200, 108, 85);
      this.add(this.jh);
      String var10019 = "$VxWxwe\fo\u001b'[0";
      this.jb = new com.xy.i.Class2("sc/b/B298.png", 1, 0, this);
      this.jb.setBounds(305, 256, 86, 52);
      this.add(this.jb);
      String var10020 = "V}\n|\n\\\u0017'\u00120UpB";
      this.jf = new com.xy.i.Class2("sc/b/B297.png", 1, 0, this);
      this.jf.setBounds(279, 75, 99, 67);
      this.add(this.jf);
      String var10021 = "$VxWxwe\fa\u001b'[0";
      this.iy = new com.xy.i.Class2("sc/b/B296.png", 1, 2026, this);
      this.iy.setBounds(241, 179, 38, 47);
      this.add(this.iy);
      String var10022 = "V}\n|\n\\\u0017'\u00150UpB";
      this.jc = new com.xy.i.Class2("sc/b/B290.png", 1, 0, this);
      this.jc.setBounds(326, 134, 21, 32);
      this.add(this.jc);
      String var10023 = "$VxWxwe\ff\u001b'[0";
      this.je = new com.xy.i.Class2("sc/b/B291.png", 1, 0, this);
      this.je.setBounds(370, 160, 21, 27);
      this.add(this.je);
      this.jm = new com.xy.i.Class2[8];

      for (int var11 = var2 = 0; var11 < this.jm.length; var11 = var2) {
         String var33 = "V}\n|\n\\\u0016.\u00160UpB";
         this.jm[var2] = new com.xy.i.Class2("sc/b/B303.png", 1, 0, this);
         this.add(this.jm[var2++]);
      }

      this.jm[0].setBounds(106, 234, 24, 42);
      this.jm[1].setBounds(152, 257, 24, 42);
      this.jm[2].setBounds(179, 202, 24, 42);
      this.jm[3].setBounds(210, 222, 24, 42);
      this.jm[4].setBounds(279, 148, 24, 42);
      this.jm[5].setBounds(312, 168, 24, 42);
      this.jm[6].setBounds(423, 58, 24, 42);
      this.jm[7].setBounds(496, 100, 24, 42);
      this.iq = new com.xy.w.Class18[4];

      for (int var12 = var2 = 0; var12 < this.iq.length; var12 = var2) {
         this.iq[var2] = new com.xy.w.Class18();
         Class20 var13;
         if (var2 == 0) {
            var13 = this;
            com.xy.w.Class18 var25 = this.iq[var2];
            String var30 = "$VxWxff\u0003a\u001b'[0";
            var25.dp("sc/b/S166.png");
            this.iq[var2].setBounds(50, 60, 481, 261);
         } else if (var2 == 1) {
            var13 = this;
            com.xy.w.Class18 var26 = this.iq[var2];
            String var31 = "V}\nz\n-\u00130UpB";
            var26.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.iq[var2].setBounds(47, 55, 490, 269);
         } else if (var2 == 2) {
            var13 = this;
            com.xy.w.Class18 var27 = this.iq[var2];
            String var32 = "$VxQx\u0007b\u001b'[0";
            var27.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var2].setBounds(47, 324, 490, 21);
         } else {
            if (var2 == 3) {
               com.xy.w.Class18 var20 = this.iq[var2];
               String var28 = "V}\nz\n,\u00110UpB";
               var20.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.iq[var2].setBounds(47, 324, 490, 112);
            }

            var13 = this;
         }

         var13.add(this.iq[var2++]);
      }
   }
}
