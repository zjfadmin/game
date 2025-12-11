package com.xy.a.q;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class86 extends com.xy.q.Class30 {
   private BigDecimal sd;
   private double amr;
   private Class114[] ams;
   private int gv;
   private int gw;
   private String amt;
   private JLabel dc;
   private int gz;
   private BigDecimal nj;
   private int aa;
   private BigDecimal nh;
   private QuackGameBean amu;
   private double amv;
   private BigDecimal gi;
   private AffineTransform amw;
   private static com.xy.w.Class1 ahx;
   private com.xy.i.Class19 qf;

   public synchronized void tw(QuackGameBean var1) {
      this.tm(var1);
   }

   @Override
   public boolean ah() {
      if (this.amu != null) {
         String var10002 = "抆大迣泐朲红杤斑泮儂闖霓杄";
         this.afx._do("抽奖还没有结束无法关闭面板");
         return false;
      } else {
         return super.ah();
      }
   }

   public void tx(QuackGameBean var1) {
      this.sd = var1.getMoney();
      this.ci(var1.getPetmsg2());
      String[] var10000;
      if (var1.getPetmsg() != null && !var1.getPetmsg().equals("")) {
         String var14 = var1.getPetmsg();
         String var10001 = "-G";
         var10000 = var14.split("\\|");
      } else {
         var10000 = null;
      }

      String[] var2 = var10000;
      int var3 = -1;

      int var4;
      for (int var15 = var4 = 0; var15 < this.ams.length; var15 = ++var4) {
         if (var2 != null && var4 < var2.length) {
            String[] var5 = var2[var4].split("_");
            Goodstable var6 = this.yt().ay(new BigDecimal(var5[0]));
            this.ams[var4].cb(var6, Integer.parseInt(var5[1]));
            if (var5[2].equals("1")) {
               var3 = var4;
            }
         } else {
            this.ams[var4].cb(null, 0);
         }
      }

      if (var3 >= 0 && var3 < 14) {
         double var8 = 25.714285714285715;
         int var9 = (int)(25.714285714285715 * var3);
         double var16 = var3 + 1;
         var9 += 2;
         int var7 = (int)(var8 * var16);
         var7 -= 2;
         if (var7 - var9 > 0) {
            var9 += com.xy.v.Class0.a.nextInt(var7 - var9);
         }

         var9 += 720;
         var9 += 360 - this.gz % 360;
         this.gw += var9;
      }

      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (ahx == null) {
         String var6 = "cxf}}z";
         ahx = com.xy.w.Class11.x(com.xy.w.Class15.p("drawzp"));
      } else {
         if (this.gz != this.gw) {
            Class86 var10000;
            if (this.gw - this.gz > 150) {
               var10000 = this;
               this.gz = this.gz + 2 + (this.gw - this.gz) / 150;
            } else {
               var10000 = this;
               this.gz += 2;
            }

            if (var10000.gz > this.gw) {
               this.gz = this.gw;
            }

            this.aa = this.gz % 360;
            this.amr = this.aa * this.amv;
            this.aa = (int)(this.aa / 25.714285714285715);
            if (this.gz == this.gw) {
               this.tm(null);
            }
         }

         ahx.j(0L, 0);
         if (this.amr != 0.0) {
            Graphics2D var2;
            Graphics2D var5 = var2 = (Graphics2D)var1;
            this.amw.setToIdentity();
            this.amw.rotate(this.amr, ahx.c().f(), ahx.c().l());
            int var3 = 247 - ahx.c().f();
            int var4 = 250 - ahx.c().l();
            var2.translate(var3, var4);
            var5.drawImage(ahx.c().h(), this.amw, null);
            var2.translate(-var3, -var4);
         } else {
            ahx.ab(var1, 247, 250);
         }
      }
   }

   public synchronized void tm(QuackGameBean var1) {
      if (this.amu != null) {
         com.xy.c.Class9.u(this.amu.getAssetUpdate(), this.afx);
         this.ci(this.amu.getPetmsg2());
      }

      this.amu = var1;
      if (var1 != null) {
         this.tx(var1);
      }
   }

   public synchronized void h() {
      if (this.amu != null) {
         String var5 = "抆大迣泐朲红杤";
         this.afx._do("抽奖还没有结束");
      } else if (this.dc.equals("0")) {
         String var4 = "抺奜欦敺上趹";
         this.afx._do("抽奖次数不足");
      } else {
         Goodstable var1 = this.yx().bk(this.gi);
         StringBuffer var2 = new StringBuffer();
         String var10002 = "i";
         var2.append("R");
         var2.append(this.sd);
         String var10004 = "v";
         var2.append("|");
         var2.append(0);
         String var10006 = "G";
         var2.append("|");
         var2.append(1);
         if (var1 != null) {
            String var10001 = "v";
            var2.append("|");
            var2.append(var1.getRgid());
         }

         String var3 = Agreement.getSendTextAES("getfivemsg", var2.toString());
         this.za().k(var3);
      }
   }

   public Class86(GameView var1) {
      super(126, 2, com.xy.q.Class30.afz, var1);
      String var10011 = "yd%e%T8>?)zim";
      this.gv = 1;
      this.amv = Math.toRadians(1.0);
      this.amw = new AffineTransform();
      this.amr = 0.0;
      this.gz = 0;
      this.gw = 0;
      this.yy(-2, 0, 880, 502, com.xy.q.Class30.agh);
      this._do("sc/b/S295.png");
      String var10010 = "H\u0012\u0014\u0013\u00143\bH\u000e_K\u001f\\";
      this.agi.setBtnPath("sc/b/B395.png");
      this.agi.setBounds(637, 86, 25, 25);
      this.dc = new JLabel("", 0);
      this.dc.setBounds(602, 312, 50, 20);
      this.dc.setFont(com.xy.q.Class49.aw);
      this.dc.setForeground(Color.red);
      this.add(this.dc);
      String var10009 = "yd%b%4;)zim";
      String var10014 = "拌奭";
      this.qf = new com.xy.i.Class19("sc/e/31.png", 1, 203, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "抽奖", this);
      this.qf.setBounds(536, 350, 79, 25);
      this.add(this.qf);
      this.ams = new Class114[14];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ams.length; var10000 = var2) {
         this.ams[var2] = new Class114(this, var2);
         Class86 var3;
         if (var2 == 0) {
            var3 = this;
            this.ams[var2].setBounds(247, 53, 76, 75);
         } else if (var2 == 1) {
            var3 = this;
            this.ams[var2].setBounds(312, 88, 76, 75);
         } else if (var2 == 2) {
            var3 = this;
            this.ams[var2].setBounds(358, 145, 76, 75);
         } else if (var2 == 3) {
            var3 = this;
            this.ams[var2].setBounds(376, 216, 76, 75);
         } else if (var2 == 4) {
            var3 = this;
            this.ams[var2].setBounds(358, 286, 76, 75);
         } else if (var2 == 5) {
            var3 = this;
            this.ams[var2].setBounds(312, 344, 76, 75);
         } else if (var2 == 6) {
            var3 = this;
            this.ams[var2].setBounds(247, 376, 76, 75);
         } else if (var2 == 7) {
            var3 = this;
            this.ams[var2].setBounds(172, 376, 76, 75);
         } else if (var2 == 8) {
            var3 = this;
            this.ams[var2].setBounds(106, 344, 76, 75);
         } else if (var2 == 9) {
            var3 = this;
            this.ams[var2].setBounds(60, 286, 76, 75);
         } else if (var2 == 10) {
            var3 = this;
            this.ams[var2].setBounds(45, 216, 76, 75);
         } else if (var2 == 11) {
            var3 = this;
            this.ams[var2].setBounds(60, 145, 76, 75);
         } else if (var2 == 12) {
            var3 = this;
            this.ams[var2].setBounds(108, 88, 76, 75);
         } else {
            if (var2 == 13) {
               this.ams[var2].setBounds(172, 53, 76, 75);
            }

            var3 = this;
         }

         var3.add(this.ams[var2++]);
      }
   }

   // $VF: synthetic method
   static int age(Class86 var0) {
      return var0.aa;
   }

   public synchronized void ci(String var1) {
      String var10001 = "7";
      String[] var2 = var1.split("=");
      var10001 = var2[0];
      String var10002 = "\u001fN\u001dW";
      this.gi = !var10001.equals("null") ? new BigDecimal(var2[0]) : null;
      var10001 = var2[1];
      var10002 = "i\u007fkf";
      this.amt = !var10001.equals("null") ? var2[1] : null;
      var10001 = var2[2];
      var10002 = "\u001fN\u001dW";
      this.nj = !var10001.equals("null") ? new BigDecimal(var2[2]) : null;
      this.gv = Integer.parseInt(var2[3]);
      if (var2.length == 5) {
         var10001 = var2[4];
         var10002 = "i\u007fkf";
         this.nh = !var10001.equals("null") ? new BigDecimal(var2[4]) : null;
      }

      int var3 = 0;
      if (this.gi != null) {
         var3 += this.yx().getGoodNum(this.gi);
      }

      if (this.nh != null && this.nj != null) {
         var3 = (int)(var3 + this.nh.longValue() / this.nj.longValue());
      }

      this.dc.setText(String.valueOf(var3 / this.gv));
   }
}
