package com.xy.a.q;

import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class59 extends com.xy.q.Class30 {
   private long afq;
   public BigDecimal xu;
   public String[] afr;
   public String[] afs;
   private com.xy.q.Class54[] aft;
   private long afu;
   public List<Point> aaf;
   private com.xy.q.Class14 kn;
   public String[] afv;
   private com.xy.w.Class18 xf;
   private JLabel[] c;
   private com.xy.i.Class19[] hi;
   public int aa;
   private RichLabel ed;
   private Image g;
   private long lx;
   private int ds;
   private com.xy.w.Class18[] fp;
   private com.xy.q.Class54[] afw;

   public void f() {
      RoleData var1;
      Goodstable var2;
      if ((var2 = (var1 = this.yx()).au(889L)) == null) {
         this.aa = 0;
         this.kn.setText(String.valueOf(this.aa));
         String var10001 = "佪沦會逝灿定刲＋忡厼货乷吭＆＋";
         this.afx.dp("你没有通灵宝券，快去购买吧！！");
      } else {
         var2.n(1);
         if (var2.getUsetime() <= 0) {
            var1.ag(var2.getRgid());
         }

         this.aa = var2.getUsetime();
         this.kn.setText(String.valueOf(this.aa));
         String var10005 = "\u0012";
         String var3 = Agreement.getSendTextAES("getfivemsg", "G" + var2.getRgid());
         this.za().k(var3);
         com.xy.i.Class19 var10000 = this.hi[1];
         String var10002 = "yd%b%2<)zim";
         var10000.setBtn(-1, "sc/e/56.png");
      }
   }

   public Class59(GameView var1) {
      super(71, 2, com.xy.q.Class30.afz, var1);
      String var10005 = "\u00136O1OdN%\u000e2";
      String var10019 = "w:";
      this.g = com.xy.w.Class15.e("p0");
      this.afr = null;
      this.afs = null;
      this.afv = null;
      this.xu = null;
      this.aaf = null;
      this.yy(-1, 0, 400, 400, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.rm(true);
      this.hi = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hi.length; var10000 = var2) {
         com.xy.i.Class19[] var9 = this.hi;
         String var10004 = "yd%b%3:)zim";
         int var10006 = 227 + var2;
         String var36;
         Class59 var10010;
         if (var2 == 0) {
            var36 = "ｊ";
            var36 = "？";
            var10010 = this;
         } else if (var2 == 1) {
            var36 = "万锤叫售";
            var36 = "一键召唤";
            var10010 = this;
         } else {
            var36 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/40.png", 1, var10006, Class49.bz, null, var36, var10010);
         var9[var2] = var10002;
         this.hi[var2].setBounds(353, 110, 18, 18);
         if (var2 == 1) {
            this.hi[var2].setFont(com.xy.q.Class49.ch);
            this.hi[var2].setForeground(Color.black);
            com.xy.i.Class19 var10001 = this.hi[var2];
            String var21 = "&\u0003z\u0005zRcN%\u000e2";
            var10001.setImage("sc/e/26.png");
            this.hi[var2].setBounds(250, 360, 99, 25);
         }

         this.add(this.hi[var2++]);
      }

      this.c = new JLabel[2];

      for (int var10 = var2 = 0; var10 < this.c.length; var10 = var2) {
         this.c[var2] = com.xy.q.Class1.k(155, 13, 91, 24, Color.black, com.xy.q.Class49.ak);
         JLabel var11 = this.c[var2];
         String var16;
         if (var2 == 0) {
            var16 = "宏卡定宗";
            var16 = "守卫宝宝";
         } else if (var2 == 1) {
            var16 = "遺瀠寽剭";
            var16 = "通灵宝券";
         } else {
            var16 = "";
         }

         var11.setText(var16);
         this.c[var2].setHorizontalAlignment(0);
         if (var2 == 1) {
            this.c[var2].setFont(com.xy.q.Class49.ch);
            this.c[var2].setBounds(31, 362, 72, 19);
         }

         this.add(this.c[var2++]);
      }

      this.ed = new RichLabel("", com.xy.q.Class49.w);
      var10005 = "$i7:7:7:宏卡叫售兺)dLA:7:7秇籼)d:7:7:7\"静丠敷#趍夐＋奜劶趀奺〈";
      this.ed.setTextSize("#c000000守卫召唤兽#cFF0000种类#c000000(非个数)越多，奖励越好。", 330);
      this.ed.setBounds(32, 106, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      this.kn = com.xy.q.Class1.i(112, 362, 104, 19, 0, Color.white, com.xy.q.Class49.w);
      var10005 = "&\u0003z\u0004zQbN%\u000e2";
      this.kn.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.kn);
      com.xy.v.Class32 var7 = new com.xy.v.Class32(7, 8, 35, 35);
      com.xy.v.Class32 var3 = new com.xy.v.Class32(8, 8, 35, 35);
      this.afw = new com.xy.q.Class54[5];

      int var4;
      for (int var12 = var4 = 0; var12 < this.afw.length; var12 = var4) {
         this.afw[var4] = new com.xy.q.Class54(this.eg());
         this.afw[var4].setBounds(41 + 66 * var4, 42, 50, 50);
         com.xy.q.Class54 var30 = this.afw[var4];
         var10005 = "yd%c%33)zim";
         var30.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
         this.afw[var4].wp(var7);
         this.afw[var4].removeMouseListener(this.afw[var4]);
         this.add(this.afw[var4++]);
      }

      this.xf = new com.xy.w.Class18(this.g);
      this.xf.setBounds(313, 141, 35, 35);
      this.add(this.xf);
      this.fp = new com.xy.w.Class18[9];

      for (int var13 = var4 = 0; var13 < this.fp.length; var13 = ++var4) {
         this.fp[var4] = new com.xy.w.Class18();
         this.add(this.fp[var4]);
         if (var4 == 5) {
            com.xy.w.Class18 var10003 = this.fp[var4];
            String var31 = "&\u0003z\u0004zQlN%\u000e2";
            var10003.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.fp[var4].setBounds(31, 130, 258, 207);
            this.aft = new com.xy.q.Class54[20];

            int var5;
            for (int var14 = var5 = 0; var14 < this.aft.length; var14 = var5) {
               this.aft[var5] = new com.xy.q.Class54(this);
               this.aft[var5].gt(this.g);
               this.aft[var5].wp(var3);
               this.aft[var5].setBounds(32 + 51 * (var5 % 5), 132 + 51 * (var5 / 5), 51, 51);
               com.xy.q.Class54 var29 = this.aft[var5];
               var31 = "yd%c%62)zim";
               var29.gr(com.xy.w.Class16.c("sc/d/18.png"));
               this.aft[var5].removeMouseListener(this.aft[var5]);
               this.add(this.aft[var5++]);
            }
         } else if (var4 == 6) {
            com.xy.w.Class18 var18 = this.fp[var4];
            String var25 = "&\u0003z\u0004zRmN%\u000e2";
            var18.mt(com.xy.w.Class16.m("sc/d/28.png", 20, 20, 20, 20, false));
            this.fp[var4].setBounds(306, 134, 49, 49);
         } else if (var4 == 7) {
            com.xy.w.Class18 var19 = this.fp[var4];
            String var26 = "yd%c%3:)zim";
            var19.mt(com.xy.w.Class16.m("sc/d/40.png", 20, 20, 20, 20, false));
            this.fp[var4].setBounds(301, 129, 59, 59);
         } else if (var4 == 8) {
            com.xy.w.Class18 var20 = this.fp[var4];
            String var27 = "&\u0003z\u0004zScN%\u000e2";
            var20.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.fp[var4].setBounds(20, 103, 360, 250);
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.afv != null) {
         long var2 = (com.xy.v.Class22.l() - this.lx) / 5L - this.afq;
         this.afu += var2;
         this.afq += var2;
         if (this.afu >= 30L) {
            this.afu = 0L;
            Image var4 = null;
            if (!this.afv[this.ds].equals("0")) {
               String var10002 = "%";
               var4 = com.xy.w.Class15.e("p" + this.afv[this.ds]);
            }

            Class59 var9;
            if (this.ds == 20) {
               var9 = this;
               this.xf.gt(var4);
            } else {
               int var5;
               for (int var10000 = var5 = 0; var10000 < this.afs.length; var10000 = ++var5) {
                  if (this.afs[var5] != null && this.afs[var5].equals(this.afv[this.ds])) {
                     this.afs[var5] = null;
                     if (this.aaf == null) {
                        this.aaf = new ArrayList<>();
                     }

                     int var6 = this.ds % 5;
                     int var7 = this.ds / 5;
                     this.aaf.add(new Point(34 + var6 * 51, 133 + var7 * 51));
                  }
               }

               var9 = this;
               this.aft[this.ds].gt(var4);
            }

            var9.ds++;
            if (this.ds > 20) {
               com.xy.i.Class19 var10 = this.hi[1];
               String var18 = "yd%b%5<)zim";
               var10.setBtn(1, "sc/e/26.png");
               com.xy.i.Class19 var19 = this.hi[1];
               String var10003 = "凭朰习歴";
               var19.setText("再来一次");
               String var11 = this.afv[this.afv.length - 1];
               String var10001 = "3:7;2;";
               if (var11.equals("400151")) {
                  var10001 = "伵逧剥仦醄瀕齵L砀齀砀齀y功颊扱麘ぢ杹歁飂糲斵敖ｔ";
                  this.afx.dp("你遇到了金灵鼠,硕鼠硕鼠,勿食我黍。本次颗粒无收！");
                  var9 = this;
               } else {
                  if (this.xu != null && this.xu.intValue() != 0) {
                     GameView var13 = this.afx;
                     var10003 = "莽徐二";
                     StringBuilder var17 = new StringBuilder("获得了").append(this.xu);
                     var18 = "钖乱";
                     var13.dp(var17.append("银两").toString());
                  }

                  var9 = this;
               }

               var9.afv = null;
            }
         }
      }

      if (this.aaf != null && this.aaf.size() > 0) {
         Class44.zk.j(com.xy.v.Class22.l(), 0);

         int var8;
         for (int var14 = var8 = 0; var14 < this.aaf.size(); var14 = var8) {
            com.xy.w.Class1 var15 = Class44.zk;
            int var21 = this.aaf.get(var8).x;
            Object var23 = this.aaf.get(var8);
            var8++;
            var15.ab(var1, var21, ((Point)var23).y);
         }
      }
   }

   public void tg(String[] var1) {
      int var10000 = 0;
      this.h();
      this.afr = var1;

      for (int var2 = 0; var10000 < var1.length; var10000 = var2) {
         com.xy.q.Class54 var4 = this.afw[var2];
         String var10003 = "z";
         StringBuilder var10001 = new StringBuilder("p").append(var1[var2]);
         var2++;
         var4.gt(com.xy.w.Class15.e(var10001.toString()));
      }

      Goodstable var3;
      this.aa = (var3 = this.yx().au(889L)) != null ? var3.getUsetime() : 0;
      this.kn.setText(String.valueOf(this.aa));
      com.xy.i.Class19 var5 = this.hi[1];
      String var10002 = "&\u0003z\u0005zRcN%\u000e2";
      var5.setBtn(1, "sc/e/26.png");
      this.zc().b(this.lj());
   }

   @Override
   public boolean ah() {
      if (this.afv != null) {
         String var10002 = "此圢抺奜旧泟兴闧畋靨";
         this.afx._do("正在抽奖无法关闭界面");
         return false;
      } else {
         return super.ah();
      }
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.aft.length; var10000 = var1) {
         com.xy.q.Class54 var2 = this.aft[var1];
         var1++;
         var2.gt(this.g);
      }

      this.xf.gt(this.g);
      if (this.aaf != null) {
         this.aaf.clear();
      }
   }

   public void yr(String[] var1, BigDecimal var2) {
      this.h();
      this.afv = var1;
      this.xu = var2;
      this.lx = com.xy.v.Class22.l();
      this.afq = 0L;
      this.afu = 0L;
      this.ds = 0;
      if (this.aaf != null) {
         this.aaf.clear();
      }

      this.afs = new String[this.afr.length];
      System.arraycopy(this.afr, 0, this.afs, 0, 5);
   }
}
