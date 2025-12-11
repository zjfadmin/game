package com.xy.a.v;

import com.xy.text.GameView;
import java.util.Vector;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Class46 extends com.xy.q.Class30 {
   private Vector<Vector<Object>> apn;
   private JTable apo;
   private JScrollPane ba;
   private com.xy.w.Class18[] cl;

   // $VF: synthetic method
   static JTable aig(Class46 var0) {
      return var0.apo;
   }

   public void h() {
      JScrollBar var1 = this.ba.getVerticalScrollBar();
      var1.setMaximum(this.apo.getHeight());
      var1.setValue(0);
   }

   public void aih(String var1, int var2) {
      this.apn.clear();
      if (!com.xy.v.Class12.h(var1) && var2 < var1.length()) {
         int var3 = 0;
         int var4;
         int var10000 = var4 = 0;

         while (var10000 < var1.length()) {
            String var10001 = "\r";
            if ((var4 = var1.indexOf("^", var2 + 1)) == -1) {
               var4 = var1.length();
            }

            this.ha(var1, var2, var4);
            var3++;
            var2 = var4 + 1;
            var10000 = var4;
         }
      }

      this.h();
      this.zc().b(this.lj());
   }

   public Class46(GameView var1) {
      super(169, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "\u007f0#7#b>f\"#b4";
      this.yy(-1, 0, 340, 150, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/125.png", 11, 11, 13, 14, false), null);
      this.rm(false);
      this.wp(new com.xy.v.Class32(0, 12, 0, 0));
      String var10007 = "gA;G;\u0013\"\u0012:RzE";
      this.agi = new com.xy.i.Class0("sc/e/160.png", 1, this.lj(), this);
      this.agi.setBounds(319, 0, 21, 21);
      this.add(this.agi);
      Vector var2 = new Vector();
      String var10004 = "旺閧";
      String var10006 = "奂哣";
      var10008 = "吁禣";
      var2.addElement("名称");
      var2.addElement("奖品");
      var2.addElement("时间");
      this.apn = new Vector<>();
      String var10012 = "7A\"g'f&a";
      this.apo = com.xy.q.Class1.l(this.apn, var2, com.xy.q.Class49.n, com.xy.q.Class49.c("#c6E3D2C"), 100, 80, 140);
      this.apo.getSelectionModel().addListSelectionListener(new Class11(this));
      this.ba = com.xy.q.Class1.g(0, 1, 337, 145, this.apo, 20);
      JScrollBar var9 = this.ba.getVerticalScrollBar();
      var10007 = "\u007f0#7#b<e\"#b4";
      var9.setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/106.png", 3, 3, 3, 3, false), 8));
      this.add(this.ba);
      this.ba.addMouseListener(this);
      this.ba.addMouseMotionListener(this);
      this.apo.getTableHeader().addMouseListener(this);
      this.apo.getTableHeader().addMouseMotionListener(this);
      this.cl = new com.xy.w.Class18[6];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.cl.length; var10000 = var3) {
         this.cl[var3] = new com.xy.w.Class18();
         Class46 var4;
         if (var3 == 0) {
            var4 = this;
            com.xy.w.Class18 var10002 = this.cl[var3];
            String var10003 = "gA;F;\u0013$\u0017:RzE";
            var10002.dp("sc/d/105.png");
            this.cl[var3].setBounds(330, 24, 6, 120);
         } else if (var3 == 1) {
            var4 = this;
            com.xy.w.Class18 var5 = this.cl[var3];
            String var8 = " o|h|5g\"#b4";
            var5.mt(com.xy.w.Class16.m("sc/d/94.png", 5, 3, 5, 8, false));
            this.cl[var3].setBounds(-2, 0, 344, 24);
         } else {
            if (var3 >= 2 && var3 <= 5) {
               com.xy.w.Class18 var10001 = this.cl[var3];
               String var6 = "gA;F;\u0013&\u0017:RzE";
               var10001.mt(com.xy.w.Class16.m("sc/d/125.png", 11, 11, 13, 14, false));
               this.cl[var3].setBounds(0, 0, 340, 150);
            }

            var4 = this;
         }

         var4.add(this.cl[var3++]);
      }
   }

   public void ha(String var1, int var2, int var3) {
      String var4 = null;
      String var5 = null;
      long var6 = 0L;
      int var8 = 0;
      int var9;
      int var10000 = var9 = 0;

      while (var10000 < var3) {
         String var10001 = "\u0001";
         if ((var9 = var1.indexOf("#", var2 + 1)) == -1 || var9 > var3) {
            var9 = var3;
         }

         if (var8 == 1) {
            var4 = var1.substring(var2, var9);
            var10000 = var9;
         } else if (var8 == 3) {
            var5 = var1.substring(var2, var9);
            var10000 = var9;
         } else {
            if (var8 == 4) {
               var6 = com.xy.v.Class12.s(var1, var2, var9) * 1000L;
            }

            var10000 = var9;
         }

         var8++;
         var2 = var10000 + 1;
         var10000 = var9;
      }

      Vector var10;
      (var10 = new Vector()).add(var4);
      var10.add(var5);
      var10.add(com.xy.v.Class22.i(var6));
      this.apn.addElement(var10);
   }
}
