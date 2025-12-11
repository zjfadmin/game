package com.xy.a;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class91 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] de;
   private BigDecimal nh;
   private JScrollPane is;
   private com.xy.i.Class18[] akb;
   private DefaultListModel<String> n;
   private com.xy.q.Class14[] dv;
   private JLabel[] o;
   private JList<String> pf;

   public Class91(GameView var1) {
      super(37, 3, com.xy.q.Class30.afz, var1);
      String var10003 = "J\u0016\u0016\u0011\u0016D\u0017\u0005W\u0012";
      this.yy(-1, 0, 266, 330, com.xy.q.Class30.agh);
      com.xy.w.Class9 var29 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "仼呚";
      this.yu(var29, "任命");
      this.akb = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.akb.length; var10000 = var2) {
         com.xy.i.Class18[] var6 = this.akb;
         var10004 = "J\u0016\u0016\u0010\u0016B\u0017\u0005W\u0012";
         int var10006 = 214 + var2;
         String var34;
         Class91 var10010;
         if (var2 == 0) {
            var34 = "硩讃";
            var34 = "确认";
            var10010 = this;
         } else if (var2 == 1) {
            var34 = "可淽";
            var34 = "取消";
            var10010 = this;
         } else {
            var34 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/7.png", 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var34, var10010);
         var6[var2] = var10002;
         this.akb[var2].setBounds(70 + var2 * 89, 286, 59, 25);
         com.xy.i.Class18 var7 = this.akb[var2];
         String var13;
         if (var2 == 0) {
            var13 = "硩讃";
            var13 = "确认";
         } else if (var2 == 1) {
            var13 = "可淽";
            var13 = "取消";
         } else {
            var13 = "";
         }

         var7.setText(var13);
         this.add(this.akb[var2++]);
      }

      this.dv = new com.xy.q.Class14[3];

      for (int var8 = var2 = 0; var8 < this.dv.length; var8 = var2) {
         this.dv[var2] = com.xy.q.Class1.i(87, 32 + var2 * 26, 154, 19, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var23 = this.dv[var2];
         var10003 = "Td\bc\b6\u0010)Wi@";
         var23.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         this.add(this.dv[var2++]);
      }

      this.o = new JLabel[4];

      for (int var9 = var2 = 0; var9 < this.o.length; var9 = ++var2) {
         int var33 = 32 + 26 * var2;
         String var10008 = "\u001a\u0016\tE\tE\tE";
         this.o[var2] = com.xy.q.Class1.f(46, var33, 36, 19, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var10 = this.o[var2];
         String var16;
         if (var2 == 0) {
            var16 = "吊秗";
            var16 = "名称";
         } else if (var2 == 1) {
            var16 = "秴斺";
            var16 = "种族";
         } else if (var2 == 2) {
            var16 = "筎纀";
            var16 = "等级";
         } else if (var2 == 3) {
            var16 = "聵伸刮蠝";
            var16 = "职位列表";
         } else {
            var16 = "";
         }

         var10.setText(var16);
         this.add(this.o[var2]);
         if (var2 == 3) {
            JLabel var20 = this.o[var2];
            String var25 = "$DAaAaAa";
            var20.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
            this.o[var2].setBounds(47, 113, 194, 21);
         }
      }

      this.n = new DefaultListModel<>();
      String var10020 = "抝沠";
      this.n.add(0, "护法");
      String var10019 = "镸耦";
      this.n.add(1, "长老");
      String var10018 = "堻乎";
      this.n.add(2, "堂主");
      String var10017 = "馞东";
      this.n.add(3, "香主");
      String var10016 = "粇芄";
      this.n.add(4, "精英");
      String var10015 = "帩估";
      this.n.add(5, "帮众");
      this.pf = new JList<>();
      this.pf.setSelectionBackground(new Color(33, 42, 52));
      this.pf.setSelectionForeground(Color.GREEN);
      this.pf.setForeground(Color.GREEN);
      this.pf.setFont(com.xy.q.Class49.ac);
      this.pf.setBackground(com.xy.q.Class49.bk);
      this.pf.setModel(this.n);
      this.is = com.xy.q.Class1.g(49, 133, 195, 146, this.pf, -1);
      this.add(this.is);
      this.de = new com.xy.w.Class18[2];

      for (int var11 = var2 = 0; var11 < this.de.length; var11 = var2) {
         this.de[var2] = new com.xy.w.Class18();
         Class91 var12;
         if (var2 == 0) {
            var12 = this;
            com.xy.w.Class18 var26 = this.de[var2];
            var10003 = "\u0006ZZ]Z\u000b@\u0017\u0005W\u0012";
            var26.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.de[var2].setBounds(47, 113, 194, 21);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var21 = this.de[var2];
               String var27 = "Td\bc\b5\u0013)Wi@";
               var21.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.de[var2].setBounds(47, 113, 194, 166);
            }

            var12 = this;
         }

         var12.add(this.de[var2++]);
      }
   }

   public void acg(BigDecimal var1, String var2, String var3, String var4) {
      this.nh = var1;
      this.dv[0].setText(var2);
      this.dv[1].setText(var3);
      this.dv[2].setText(var4);
      this.zc().b(this.lj());
   }

   public void g(int var1) {
      if (var1 == 214) {
         String var2;
         if ((var2 = this.pf.getSelectedValue()) == null || var2.equals("")) {
            return;
         }

         StringBuilder var10001 = new StringBuilder().append(this.nh);
         String var10002 = "\t";
         String var3 = Agreement.getSendTextAES("gangappoint", var10001.append("|").append(var2).toString());
         this.za().k(var3);
         this.zc().f(this.lj());
         Class98 var4;
         if ((var4 = (Class98)this.zc().l(48)) != null) {
            var4.adb(this.nh, var2);
            return;
         }
      } else if (var1 == 215) {
         this.zc().f(this.lj());
      }
   }
}
