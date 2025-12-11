package com.xy.a.q;

import com.xy.bean.PayvipBean;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;

public class Class6 extends com.xy.q.Class30 {
   private com.xy.i.Class19[] hi;
   private Class100 hj;
   private JLabel bd;
   private Class79 hk;
   private com.xy.q.Class52 hl;
   private com.xy.w.Class18 gh;
   private Class106 hm;
   private Class33 hn;
   private int ah;

   public void fm(List<PayvipBean> var1) {
      this.hm.fm(var1);
   }

   @Override
   public void l() {
      this.y(0);
      this.hl.l();
      super.l();
   }

   public void y(int var1) {
      int var10000 = 0;
      this.ah = var1;

      for (int var2 = 0; var10000 < this.hi.length; var10000 = ++var2) {
         this.hi[var2].setKeep(var2 == this.ah);
      }

      this.g(var1);
      this.hn.setVisible(var1 == 0);
      this.hk.setVisible(var1 == 1);
      this.hj.setVisible(var1 == 2);
      this.hm.setVisible(var1 == 3);
   }

   @Override
   public boolean ah() {
      this.hk.f();
      return super.ah();
   }

   public Class6(GameView var1) {
      super(39, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "1KmLm\u0019lX,O";
      this.yy(-1, 0, 682, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var6 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "夠寴阻";
      this.yu(var6, "多宝阁");
      this.hi = new com.xy.i.Class19[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hi.length; var10000 = var2) {
         com.xy.i.Class19[] var4 = this.hi;
         var10004 = "[!\u0007'\u0007t\u001clX,O";
         int var10006 = 241 + var2;
         String var9;
         Class6 var10010;
         if (var2 == 0) {
            var9 = "唯埴";
            var9 = "商城";
            var10010 = this;
         } else if (var2 == 1) {
            var9 = "镤绋";
            var9 = "锦绣";
            var10010 = this;
         } else if (var2 == 2) {
            var9 = "条卛";
            var9 = "月卡";
            var10010 = this;
         } else if (var2 == 3) {
            var9 = "~\u000bx";
            var9 = "VIP";
            var10010 = this;
         } else {
            var9 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/64.png", 2, var10006, Class49.bx, Class49.bv, var9, var10010);
         var4[var2] = var10002;
         this.hi[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.hi[var2].setBounds(61 + 86 * var2, 21, 79, 33);
         this.add(this.hi[var2++]);
      }

      this.bd = com.xy.q.Class1.k(480, 34, 72, 18, Color.black, com.xy.q.Class49.ch);
      String var10005 = "强剷亰玳";
      this.bd.setText("当前仙玉");
      this.add(this.bd);
      MoneyType var3 = new MoneyType();
      String var8 = "些玡";
      var3.setIdAndKey(3, "仙玉");
      this.hl = com.xy.q.Class1.m(552, 34, 110, 18, 10, Color.white, com.xy.q.Class49.w, var3, var1);
      String var10007 = "I\n\u0015\r\u0015X\rGJ\u0007]";
      this.hl.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.hl.n(2);
      this.add(this.hl);
      String var13 = "[!\u0007&\u0007q\u001dlX,O";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.gh.setBounds(31, 35, 625, 20);
      this.add(this.gh);
      this.add(this.hn = new Class33(var1));
      this.add(this.hk = new Class79(var1));
      this.add(this.hj = new Class100(var1));
      this.add(this.hm = new Class106(var1));
      if (this.za().VALUE.indexOf(71) == -1) {
         this.hi[1].setVisible(false);
         this.hi[2].setBounds(147, 21, 79, 33);
         this.hi[3].setBounds(233, 21, 79, 33);
      }

      if (this.za().VALUE.indexOf(72) == -1) {
         this.hi[3].setVisible(false);
      }

      if (!this.za().d() && this.za().l(2, 12) && this.za().VALUE.indexOf(76) != -1) {
         this.hi[0].setVisible(false);
         this.hi[1].setVisible(false);
         this.hi[3].setVisible(false);
         this.hi[2].setBounds(61, 21, 79, 33);
      }
   }

   public void g(int var1) {
      if (var1 == this.ah) {
         if (this.ah != 0) {
            if (this.ah == 1) {
               this.hk.h();
            } else if (this.ah == 2) {
               this.hj.h();
            } else {
               if (this.ah == 3) {
                  this.hm.f();
               }
            }
         } else {
            int var10000 = 0;
            this.hn.g(0);

            for (int var2 = 0; var10000 < this.hn.rl().length; var10000 = var2) {
               this.hn.rl()[var2++].l();
            }
         }
      }
   }
}
