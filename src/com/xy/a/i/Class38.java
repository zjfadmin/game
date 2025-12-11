package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class38 extends com.xy.q.Class30 {
   private com.xy.i.Class11 ec;
   private Class19[] aqy;
   private com.xy.q.Class14 ac;
   private Class19[] adm;
   private com.xy.w.Class18[] ar;
   private RichLabel cj;
   private JLabel[] o;
   private BigDecimal hh;

   public long ajg(int var1) {
      long var2 = 0L;

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.adm.length; var10000 = ++var4) {
         if (this.adm[var4].lj() == var1) {
            var2++;
         }
      }

      return var2;
   }

   public void wu(Class19 var1, MouseEvent var2) {
      boolean var3 = false;

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.adm.length; var10000 = ++var4) {
         if (this.adm[var4] == var1) {
            var3 = true;
         }
      }

      if (!var3) {
         long var9 = this.ajg(var1.lj());
         long var6 = this.yx().getPackRecord().getStarSoulType(var1.lj()) / 10000L;
         if (var9 < var6) {
            Class19 var8;
            if ((var8 = this.wv(var1.lj())) != null) {
               var8.ef(1L);
            }
         }
      } else if (var2.getButton() == 3 && var1.lj() != 0) {
         var1.tz(0, null);
      }
   }

   public Class19 wv(int var1) {
      Class19 var2 = null;

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.adm.length; var10000 = ++var3) {
         if (this.adm[var3].lj() == 0 && var2 == null) {
            var2 = this.adm[var3];
         }
      }

      if (var2 == null) {
         var2 = this.adm[1];
      }

      if (var2 != null) {
         var2.tz(var1, this.yt());
      }

      return var2;
   }

   @Override
   public void l() {
      this.f();
      super.l();
   }

   public void f() {
      RoleData var1 = this.yx();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aqy.length; var10000 = var2) {
         long var3 = var1.getPackRecord().getStarSoulType(this.aqy[var2].lj()) / 10000L;
         this.aqy[var2++].ef(var3);
      }

      for (int var6 = var2 = 0; var6 < this.adm.length; var6 = var2) {
         Class19 var7 = this.adm[var2];
         var2++;
         var7.tz(0, null);
      }
   }

   public void h() {
      ArrayList var1 = new ArrayList();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.adm.length; var10000 = ++var2) {
         if (this.adm[var2].lj() != 0) {
            var1.add(new BigDecimal(this.adm[var2].lj()));
         }
      }

      if (var1.size() == 2) {
         SuitOperBean var4 = new SuitOperBean();
         var4.setType(111);
         var4.setGoods(var1);
         String var3 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var4));
         this.za().k(var3);
      }
   }

   public Class38(GameView var1) {
      super(139, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "'K{L{\u0019zX:O";
      this.hh = new BigDecimal(1000000);
      this.yy(-2, 0, 382, 495, com.xy.q.Class30.agh);
      com.xy.w.Class9 var26 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "醤炕";
      this.yu(var26, "重炼");
      this.cj = new RichLabel("", Class49.n);
      String var10006 = "wKd\u0018d\u0018d\u0018醙炔呚Ｄ雛朒畋戸乔颿暠髰绳皬晋魪扂吤绳昷鬖〪";
      this.cj.setTextSize("#c000000重炼后，随机生成一颗更高级的星魂或同级星魂。", 300);
      this.cj.setBounds(56, 350, this.cj.getWidth(), this.cj.getHeight());
      this.add(this.cj);
      var10009 = "\u001aJFLF\u001eGY\u0007N";
      String var10014 = "醙炔";
      this.ec = new com.xy.i.Class11("sc/e/7.png", 1, 35, Class49.ch, Class49.bv, "重炼", this);
      this.ec.setBounds(270, 443, 59, 25);
      this.add(this.ec);
      this.o = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = ++var2) {
         var10008 = "JJY\u0019Y\u0019Y\u0019";
         this.o[var2] = com.xy.q.Class1.f(47, 18, 300, 19, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var8 = this.o[var2];
         String var12;
         if (var2 == 0) {
            var12 = "参肩佗畼丌飃吤绳昷鬖迳蠘釥烨〪";
            var12 = "只能使用两颗同级星魂进行重炼。";
         } else if (var2 == 1) {
            var12 = "淡耾醸钘";
            var12 = "消耗金钱";
         } else {
            var12 = "";
         }

         var8.setText(var12);
         this.add(this.o[var2]);
         if (var2 == 1) {
            this.o[var2].setBounds(84, 446, 72, 19);
         }
      }

      this.ac = com.xy.q.Class1.i(156, 446, 104, 19, 10, Color.white, Class49.w);
      String var10005 = "[7\u00070\u0007e\u001fzX:O";
      this.ac.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ac);
      Class49.b(this.ac, this.hh.longValue());
      this.adm = new Class19[2];

      for (int var9 = var2 = 0; var9 < this.adm.length; var9 = var2) {
         this.adm[var2] = new Class19(0, null, true, null, this);
         this.adm[var2].setBounds(86 + var2 * 67, 377, 51, 51);
         this.add(this.adm[var2++]);
      }

      this.ar = new com.xy.w.Class18[9];

      for (int var10 = var2 = 0; var10 < this.ar.length; var10 = ++var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var14 = this.ar[var2];
            String var20 = "Z\n\u0006\r\u0006X\u0010GY\u0007N";
            var14.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.ar[var2].setBounds(46, 37, 309, 309);
         } else if (var2 >= 1 && var2 <= 3) {
            com.xy.w.Class18 var18 = this.ar[var2];
            String var24 = "'K{L{\u001czX:O";
            var18.dp("sc/d/4.png");
            if (var2 == 1 || var2 == 2) {
               this.ar[var2].setBounds(83 + (var2 - 1) * 67, 374, 59, 57);
            } else if (var2 == 3) {
               this.ar[var2].setBounds(269, 373, 59, 57);
            }
         } else if (var2 >= 4 && var2 <= 6) {
            com.xy.w.Class18 var17 = this.ar[var2];
            String var23 = "Z\n\u0006\r\u0006Z\u0019GY\u0007N";
            var17.dp("sc/d/30.png");
            if (var2 == 4 || var2 == 5) {
               this.ar[var2].setBounds(84 + (var2 - 4) * 67, 431, 58, 1);
            } else if (var2 == 6) {
               this.ar[var2].setBounds(270, 430, 58, 1);
            }
         } else if (var2 == 7) {
            com.xy.w.Class18 var15 = this.ar[var2];
            String var21 = "[7\u00070\u0007c\u001bzX:O";
            var15.dp("sc/d/73.png");
            this.ar[var2].setBounds(224, 383, 34, 38);
         } else if (var2 == 8) {
            com.xy.w.Class18 var16 = this.ar[var2];
            String var22 = "Z\n\u0006\r\u0006Z\u001fGY\u0007N";
            var16.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.ar[var2].setBounds(46, 345, 310, 130);
         }
      }

      com.xy.v.Class8 var7 = this.yt();
      String var19 = "[7\u00070\u0007e\u0010zX:O";
      Image var3 = com.xy.w.Class16.c("sc/d/18.png");
      this.aqy = new Class19[36];

      int var4;
      for (int var11 = var4 = 0; var11 < this.aqy.length; var11 = var4) {
         this.aqy[var4] = new Class19(var4 + 1, var3, true, var7, this);
         this.aqy[var4].setBounds(47 + var4 % 6 * 51, 39 + var4 / 6 * 51, 51, 51);
         this.add(this.aqy[var4++]);
      }
   }
}
