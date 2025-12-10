package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class40 extends Class345 {
   public String[] ft;
   private Class436[] ej;
   public List<Point> fu;
   private Class44[] fv;
   private Class529[] fw;
   private JLabel[] fx;
   private long fy;
   private int do;
   private long fz;
   private Class245 ga;
   private Class44[] gb;
   public int gc;
   private Image gd;
   public BigDecimal ge;
   private long gf;
   private Class436 r;
   public String[] gg;
   public String[] gh;
   private RichLabel gi;

   public void de(String[] var1, BigDecimal var2) {
      int var10002 = 5 >> 3;
      this.d();
      this.ft = var1;
      this.ge = var2;
      this.fy = Class280.l();
      this.fz = 0L;
      this.gf = 0L;
      this.do = var10002;
      if (this.fu != null) {
         this.fu.clear();
      }

      String[] var10001 = new String[this.gh.length];
      boolean var10003 = true;
      this.gg = var10001;
      System.arraycopy(this.gh, 2 & 5, this.gg, 2 & 5, --5);
   }

   public void s() {
      RoleData var1;
      Goodstable var2;
      if ((var2 = (var1 = this.vd()).az(889L)) == null) {
         this.gc = 5 >> 3;
         this.ga.setText(String.valueOf(this.gc));
         this.aej.fw("你没有通灵宝券，快去购买吧！！");
      } else {
         var2.ab(3 >> 1);
         if (var2.getUsetime() <= 0) {
            var1.h(var2.getRgid());
         }

         this.gc = var2.getUsetime();
         this.ga.setText(String.valueOf(this.gc));
         String var3 = Agreement.getSendTextAES("getfivemsg", "G" + var2.getRgid());
         this.uw().d(var3);
         this.fw[3 & 5].setBtn(-4 >> 2, "sc/e/56.png");
      }
   }

   public Class40(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10003 = --1;
      int var10007 = -4 >> 2;
      super(127 & 71, 5 >> 1, Class345.aef, var1);
      this.gd = Class222.t("p0");
      this.gh = null;
      this.gg = null;
      this.ft = null;
      this.ge = null;
      this.fu = null;
      this.va(var10007, 3 & 4, 5076 & 28091, 5076 & 28091, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 126 & 69, 126 & 69, 126 & 69, 126 & 69, (boolean)(3 & 4)), (String)null);
      this.ak((boolean)var10003);
      Class529[] var7 = new Class529[var10001];
      boolean var12 = true;
      this.fw = var7;

      int var4;
      int var10000;
      for(var10000 = var4 = 5 >> 3; var10000 < this.fw.length; var10000 = var4) {
         Class529[] var6 = this.fw;
         Class529 var10002 = new Class529;
         int var10005 = 3 >> 1;
         int var10006 = (16119 & 16875) + var4;
         Font var13 = Class681.bm;
         String var10009;
         Class40 var10010;
         if (var4 == 0) {
            var10009 = "？";
            var10010 = this;
         } else if (var4 == 5 >> 2) {
            var10009 = "一键召唤";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/40.png", var10005, var10006, var13, (Color[])null, var10009, var10010);
         var6[var4] = var10002;
         this.fw[var4].setBounds(21857 & 11263, 126 & 111, 18 & 127, 18 & 127);
         if (var4 == (2 ^ 3)) {
            this.fw[var4].setFont(Class681.ak);
            this.fw[var4].setForeground(Color.black);
            this.fw[var4].setImage("sc/e/26.png");
            this.fw[var4].setBounds(9979 & 23038, 25978 & 7149, 123 & 103, 27 & 125);
         }

         this.add(this.fw[var4++]);
      }

      JLabel[] var8 = new JLabel[5 >> 1];
      var12 = true;
      this.fx = var8;

      for(var10000 = var4 = 2 & 5; var10000 < this.fx.length; var10000 = var4) {
         this.fx[var4] = Class133.b(1727 & 31195, 127 & 13, 91 & 127, 58 & 93, Color.black, Class681.bd);
         this.fx[var4].setText(var4 == 0 ? "守卫宝宝" : (var4 == --1 ? "通灵宝券" : ""));
         this.fx[var4].setHorizontalAlignment(5 >> 3);
         if (var4 == (4 ^ 5)) {
            this.fx[var4].setFont(Class681.ak);
            this.fx[var4].setBounds(95 & 63, 362, 72, 19);
         }

         this.add(this.fx[var4++]);
      }

      this.gi = new RichLabel("", Class681.q);
      this.gi.setTextSize("#c000000守卫召唤兽#cFF0000种类#c000000(非个数)越多，奖励越好。", 330);
      this.gi.setBounds(32, 106, this.gi.getWidth(), this.gi.getHeight());
      this.add(this.gi);
      this.ga = Class133.a(112, 362, 104, 19, 5 >> 3, Color.white, Class681.q);
      this.ga.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.add(this.ga);
      Class116 var5 = new Class116(7, 8, 35, 35);
      Class116 var2 = new Class116(8, 8, 35, 35);
      Class44[] var9 = new Class44[--5];
      var12 = true;
      this.fv = var9;

      int var3;
      for(var10000 = var3 = 5 >> 3; var10000 < this.fv.length; var10000 = var3) {
         this.fv[var3] = new Class44(this.gk());
         this.fv[var3].setBounds(41 + 66 * var3, 42, 50, 50);
         this.fv[var3].eq(Class511.q("sc/d/49.png", --5, --5, --5, --5, (boolean)(3 & 4)));
         this.fv[var3].ad(var5);
         this.fv[var3].removeMouseListener(this.fv[var3]);
         this.add(this.fv[var3++]);
      }

      this.r = new Class436(this.gd);
      this.r.setBounds(313, 141, 35, 35);
      this.add(this.r);
      Class436[] var11 = new Class436[9];
      var12 = true;
      this.ej = var11;

      for(var10000 = var3 = 3 >> 2; var10000 < this.ej.length; var10000 = var3) {
         this.ej[var3] = new Class436();
         this.add(this.ej[var3]);
         if (var3 == --5) {
            this.ej[var3].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
            this.ej[var3].setBounds(31, 130, 258, 207);
            var9 = new Class44[20];
            var12 = true;
            this.gb = var9;

            for(var10000 = var4 = 3 ^ 3; var10000 < this.gb.length; var10000 = var4) {
               this.gb[var4] = new Class44(this);
               this.gb[var4].ach(this.gd);
               this.gb[var4].ad(var2);
               this.gb[var4].setBounds(32 + 51 * (var4 % --5), 132 + 51 * (var4 / --5), 51, 51);
               this.gb[var4].hf(Class511.a("sc/d/18.png"));
               this.gb[var4].removeMouseListener(this.gb[var4]);
               this.add(this.gb[var4++]);
            }
         } else if (var3 == 6) {
            this.ej[var3].eq(Class511.q("sc/d/28.png", 20, 20, 20, 20, (boolean)(3 ^ 3)));
            this.ej[var3].setBounds(306, 134, 49, 49);
         } else if (var3 == 7) {
            this.ej[var3].eq(Class511.q("sc/d/40.png", 20, 20, 20, 20, (boolean)(5 >> 3)));
            this.ej[var3].setBounds(301, 129, 59, 59);
         } else if (var3 == 8) {
            this.ej[var3].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
            this.ej[var3].setBounds(20, 103, 360, 250);
         }

         ++var3;
      }

   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      int var10000;
      if (this.ft != null) {
         long var2 = (Class280.l() - this.fy) / 5L - this.fz;
         this.gf += var2;
         this.fz += var2;
         if (this.gf >= 30L) {
            this.gf = 0L;
            Image var4 = null;
            if (!this.ft[this.do].equals("0")) {
               var4 = Class222.t("p" + this.ft[this.do]);
            }

            Class40 var9;
            if (this.do == (62 & 85)) {
               var9 = this;
               this.r.hf(var4);
            } else {
               int var5;
               for(var10000 = var5 = 0; var10000 < this.gg.length; var10000 = var5) {
                  if (this.gg[var5] != null && this.gg[var5].equals(this.ft[this.do])) {
                     this.gg[var5] = null;
                     if (this.fu == null) {
                        this.fu = new ArrayList();
                     }

                     int var6 = this.do % --5;
                     int var7 = this.do / --5;
                     this.fu.add(new Point((55 & 106) + var6 * (119 & 59), (12517 & 20383) + var7 * (63 & 115)));
                  }

                  ++var5;
               }

               var9 = this;
               this.gb[this.do].ach(var4);
            }

            var9.do += 2 ^ 3;
            if (this.do > (21 & 126)) {
               this.fw[3 >> 1].setBtn(5 >> 2, "sc/e/26.png");
               this.fw[3 & 5].setText("再来一次");
               if (this.ft[this.ft.length - (3 & 5)].equals("400151")) {
                  this.aej.fw("你遇到了金灵鼠,硕鼠硕鼠,勿食我黍。本次颗粒无收！");
                  var9 = this;
               } else {
                  if (this.ge != null && this.ge.intValue() != 0) {
                     this.aej.fw("获得了" + this.ge + "银两");
                  }

                  var9 = this;
               }

               var9.ft = null;
            }
         }
      }

      if (this.fu != null && this.fu.size() > 0) {
         Class309.nb.d(Class280.l(), 2 & 5);

         int var8;
         for(var10000 = var8 = 3 >> 2; var10000 < this.fu.size(); var10000 = var8) {
            Class8 var10 = Class309.nb;
            int var10002 = ((Point)this.fu.get(var8)).x;
            Object var10003 = this.fu.get(var8);
            ++var8;
            var10.aa(var1, var10002, ((Point)var10003).y);
         }
      }

   }

   public void df(String[] var1) {
      int var10000 = 3 & 4;
      this.d();
      this.gh = var1;

      for(int var2 = var10000; var10000 < var1.length; var10000 = var2) {
         Class44 var4 = this.fv[var2];
         StringBuilder var10001 = (new StringBuilder("p")).append(var1[var2]);
         ++var2;
         var4.ach(Class222.t(var10001.toString()));
      }

      Goodstable var3;
      this.gc = (var3 = this.vd().az(889L)) != null ? var3.getUsetime() : 0;
      this.ga.setText(String.valueOf(this.gc));
      this.fw[5 >> 2].setBtn(--1, "sc/e/26.png");
      this.ve().a(this.ae());
   }

   public void d() {
      int var1;
      for(int var10000 = var1 = 3 >> 2; var10000 < this.gb.length; var10000 = var1) {
         Class44 var2 = this.gb[var1];
         ++var1;
         var2.ach(this.gd);
      }

      this.r.hf(this.gd);
      if (this.fu != null) {
         this.fu.clear();
      }

   }

   public boolean t() {
      if (this.ft != null) {
         int var10000 = 3 >> 2;
         this.aej.f("正在抽奖无法关闭界面");
         return (boolean)var10000;
      } else {
         return super.t();
      }
   }
}
