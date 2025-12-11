package com.xy.a.w;

import com.xy.formula.BaseMeridians;
import com.xy.formula.SkillUtil;
import com.xy.q.Class49;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

class Class5 extends com.xy.w.Class18 {
   private com.xy.i.Class20 hw;
   private JLabel[] ch;
   private Class27[] hx;
   private boolean gk;
   private RichLabel bk;
   // $VF: synthetic field
   final Class12 hy;
   private int eg;
   private com.xy.w.Class18 dn;

   public Class5(Class12 var1, int var2) {
      this.hy = var1;
      this.eg = var2;
      this.bk = new RichLabel(null, Class49.n);
      this.add(this.bk);
      this.ch = new JLabel[3];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.ch.length; var10000 = var3) {
         String var9;
         if (var3 == 0) {
            var9 = "uj\u0010K\u00121e:";
            var9 = "#cFBD833";
         } else {
            var9 = "$D7\u00177\u00177\u0017";
            var9 = "#c000000";
         }

         this.ch[var3] = com.xy.q.Class1.f(0, 0, 0, 0, 0, Class49.c(var9), Class49.bu);
         Class5 var5;
         if (var3 == 0) {
            var5 = this;
            this.ch[var3].setBounds(0, 13, 170, 26);
         } else if (var3 == 1) {
            var5 = this;
            this.ch[var3].setBounds(-1, 12, 170, 26);
         } else {
            if (var3 == 2) {
               this.ch[var3].setBounds(1, 14, 170, 26);
            }

            var5 = this;
         }

         var5.add(this.ch[var3++]);
      }

      this.dn = new com.xy.w.Class18();
      String var10006 = "z5&2&`9xy8n";
      this.dn.mt(com.xy.w.Class16.m("sc/d/60.png", 76, 2, 76, 2, false));
      this.dn.setBounds(4, 43, 160, 7);
      this.add(this.dn);
      this.hx = new Class27[2];

      for (int var6 = var3 = 0; var6 < this.hx.length; var6 = var3) {
         this.hx[var3] = new Class27(var1);
         Class27 var7 = this.hx[var3];
         String var10003 = "Td\bc\b3\u001e)Wi@";
         var7.mt(com.xy.w.Class16.m("sc/d/49.png", 6, 6, 6, 6, false));
         this.add(this.hx[var3++]);
      }

      String var11 = "z5&3&e8xy8n";
      int var10009 = 92 + var2;
      String var10012 = "逮'宽";
      this.hw = new com.xy.i.Class20("sc/e/31.png", 1, var10009, Class49.ch, null, "选 定", var1.eg());
      this.hw.setForeground(Color.black);
      this.hw.setBounds(45, 260, 79, 25);
      this.add(this.hw);
   }

   public void ge(int var1, int var2, int var3, BaseMeridians var4) {
      this.gk = this.eg != var1 && var1 != -1;
      this.hw.setVisible(var1 == -1);
      int var5 = SkillUtil.getFMIndex(var2, this.eg);
      this.ch[0].setText(SkillUtil.getFMType(var5));
      this.ch[1].setText(this.ch[0].getText());
      this.ch[2].setText(this.ch[0].getText());
      this.bk.setTextSize(SkillUtil.getFMMsg(var5), 150);
      this.bk.setBounds(14, 52, this.bk.getWidth(), this.bk.getHeight());
      Class27 var10000 = this.hx[0];
      int var10002;
      int var10003;
      if (var4 != null) {
         var10002 = var4.getExp();
         var10003 = var3;
      } else {
         var10002 = 0;
         var10003 = var3;
      }

      var10000.adg(var5, var10002, var10003, this.eg == var1, true);
      var10000 = this.hx[1];
      if (var4 != null) {
         var10002 = var4.getXs();
         var10003 = var3;
      } else {
         var10002 = 0;
         var10003 = var3;
      }

      var10000.adg(var5, var10002, var10003, this.eg == var1, false);
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.gk) {
         if (Class12.lt(this.hy) == null) {
            String var10001 = "z5&2&g>xy8n";
            Class12.lu(this.hy, com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         }

         Graphics2D var2 = (Graphics2D)var1;
         var2.setComposite(com.xy.w.Class1.r);
         var2.setColor(Color.BLACK);
         Class12.lt(this.hy).g(var2, this.getWidth(), this.getHeight());
         var2.setComposite(com.xy.w.Class1.c);
      }
   }
}
