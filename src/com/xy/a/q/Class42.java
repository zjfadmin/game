package com.xy.a.q;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class42 extends com.xy.q.Class30 {
   private int gs;
   private long yt;
   private int gu;
   private boolean yu;
   private BigDecimal mq;
   private JLabel[] dy;
   private JLabel[] ou;
   private int gz;
   public static com.xy.w.Class1 yv = com.xy.w.Class11.f("sc/mouse/cjwrk.tcp", null);
   private Image lp;
   private int cn;
   private int ha;
   private long qd;
   private com.xy.q.Class54[] hc;
   private JLabel fs;
   private QuackGameBean yw;
   private com.xy.i.Class19 qf;

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.lp == null) {
         String var10001 = "\u001f;C:C\u000b]iZv\u001c6\u000b";
         this.lp = com.xy.w.Class16.c("sc/b/S116.png");
      }

      this.dn(var1);
   }

   static {
      String var10000 = "+\u000fw\u00017\u0019+\tw\u000f2\u001b*\u0007v\u0018;\u001c";
   }

   @Override
   public boolean ah() {
      if (this.ha != 0) {
         String var10002 = "抠契迅沦朔绔杂旧泈兴闰靥杢";
         this.afx._do("抽奖还没有结束无法关闭面板");
         return false;
      } else {
         return super.ah();
      }
   }

   public void h() {
      if (this.ha != 0) {
         String var3 = "抠契迅沦朔绔杂旧泈兴闰靥杢";
         this.afx._do("抽奖还没有结束无法关闭面板");
      } else {
         Goodstable var1;
         if ((var1 = this.yx().getGood(this.mq)) != null && var1.getUsetime() > 0) {
            String var2 = Agreement.getSendTextAES("user", var1.getRgid().toString());
            this.za().k(var2);
            var1.n(1);
            this.fs.setText(var1.getUsetime().toString());
            if (var1.getUsetime() <= 0) {
               this.yx().ag(var1.getRgid());
            }
         } else {
            String var10001 = "拥夺歹攜乕跟";
            this.afx._do("抽奖次数不足");
         }
      }
   }

   public void dn(Graphics var1) {
      if (this.ha == 0) {
         if (this.yu) {
            if (this.yw != null) {
               com.xy.c.Class9.u(this.yw.getAssetUpdate(), this.afx);
               this.yw = null;
            }

            this.yu = false;
         }
      } else {
         long var2 = (com.xy.v.Class22.l() - this.qd) / 17L - this.yt;
         this.yt += var2;
         this.gu = (int)(this.gu + var2);
         if (this.gu > (this.ha > 1 ? 100 / this.ha : 70)) {
            this.ha--;
            this.gz++;
            if (this.gz >= 14) {
               this.gz = 0;
            }

            this.gu = 0;
            Class42 var10000;
            if (this.gz <= 4) {
               var10000 = this;
               this.cn = this.gz * 84;
               this.gs = 121;
            } else if (this.gz <= 7) {
               var10000 = this;
               this.cn = 335;
               this.gs = 121 + (this.gz - 4) * 77;
            } else if (this.gz <= 11) {
               var10000 = this;
               this.cn = 335 - (this.gz - 7) * 84;
               this.gs = 352;
            } else {
               if (this.gz <= 13) {
                  this.cn = 0;
                  this.gs = 352 - (this.gz - 11) * 77;
               }

               var10000 = this;
            }

            if (var10000.ha == 0) {
               this.yu = true;
            }
         }
      }

      yv.j(com.xy.v.Class22.l(), 0);
      yv.ab(var1, this.cn, this.gs - 130);
   }

   public void tm(QuackGameBean var1) {
      if (this.yw != null) {
         this.gz = this.gz + this.ha;
         this.gz %= 14;
         this.ha = 0;
         this.yu = false;
         com.xy.c.Class9.u(this.yw.getAssetUpdate(), this.afx);
      }

      this.yw = var1;
      String var10000 = var1.getPetmsg();
      String var10001 = "[a";
      String[] var2 = var10000.split("\\|");
      int var3 = -1;

      int var4;
      for (int var9 = var4 = 0; var9 < this.hc.length; var9 = ++var4) {
         String[] var5 = var4 < var2.length ? var2[var4].split("_") : null;
         Goodstable var6 = var5 != null ? this.yt().ay(new BigDecimal(var5[0])) : null;
         if (var6 != null) {
            this.hc[var4].gs(1, var6);
            int var7 = Integer.parseInt(var5[1]);
            this.ou[var4].setText(var7 > 1 ? var5[1] : "");
            this.dy[var4].setText(var6.getGoodsname());
            if (var3 == -1) {
               var3 = var5[2].equals("1") ? var4 : -1;
            }
         } else {
            this.hc[var4].gs(0, null);
            this.ou[var4].setText("");
            this.dy[var4].setText("");
         }
      }

      var4 = 14 - this.gz;
      this.qd = com.xy.v.Class22.l();
      this.yt = 0L;
      this.ha = var3 + 14 * (com.xy.v.Class0.a.nextInt(3) == 0 ? 3 : 2) + var4;
   }

   public void bb(Goodstable var1) {
      if (this.ha != 0) {
         String var3 = "拑夎辴泹来纋朳";
         this.afx._do("抽奖还没有结束");
      } else {
         this.mq = var1.getRgid();

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.hc.length; var10000 = var2) {
            this.hc[var2].gs(0, null);
            this.ou[var2].setText("");
            this.dy[var2++].setText("");
         }

         this.fs.setText(var1.getUsetime().toString());
         this.zc().b(this.lj());
      }
   }

   public Class42(GameView var1) {
      super(118, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "nd2e2T,>()miz";
      this.cn = 0;
      this.gs = 121;
      this.yy(-1, 0, 430, 320, com.xy.q.Class30.agf);
      this._do("sc/b/S195.png");
      String var10008 = "\u001f;C=Ck]v\u001c6\u000b";
      String var10013 = "抺奋";
      this.qf = new com.xy.i.Class19("sc/e/31.png", 1, 229, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "抽奖", this);
      this.qf.setBounds(165, 142, 79, 25);
      this.add(this.qf);
      this.hc = new com.xy.q.Class54[14];
      this.ou = new JLabel[14];
      this.dy = new JLabel[14];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hc.length; var10000 = var2) {
         this.hc[var2] = new com.xy.q.Class54(this);
         this.hc[var2].setOpaque(false);
         this.ou[var2] = new JLabel("", 4);
         this.ou[var2].setOpaque(false);
         this.ou[var2].setForeground(Color.red);
         this.dy[var2] = new JLabel("", 0);
         this.dy[var2].setOpaque(false);
         this.dy[var2].setForeground(Color.black);
         Class42 var3;
         if (var2 <= 4) {
            if (var2 >= 3) {
               var3 = this;
               this.hc[var2].setBounds(187 + (var2 - 2) * 84, 11, 51, 51);
            } else {
               var3 = this;
               this.hc[var2].setBounds(20 + var2 * 84, 11, 51, 51);
            }
         } else if (var2 <= 7) {
            var3 = this;
            this.hc[var2].setBounds(355, 11 + (var2 - 4) * 77, 51, 51);
         } else if (var2 <= 11) {
            if (var2 >= 9) {
               var3 = this;
               this.hc[var2].setBounds(355 - (var2 - 7) * 84 + 1, 242, 51, 51);
            } else {
               var3 = this;
               this.hc[var2].setBounds(355 - (var2 - 7) * 84, 242, 51, 51);
            }
         } else {
            if (var2 <= 13) {
               this.hc[var2].setBounds(20, 242 - (var2 - 11) * 77, 51, 51);
            }

            var3 = this;
         }

         var3.ou[var2].setBounds(this.hc[var2].getX() + 32, this.hc[var2].getY() + 2, 17, 12);
         this.dy[var2].setBounds(this.hc[var2].getX() - 8, this.hc[var2].getY() + 50, 75, 20);
         this.hc[var2].setBounds(this.hc[var2].getX() + 1, this.hc[var2].getY() + 1, 51, 51);
         this.add(this.dy[var2]);
         this.add(this.ou[var2]);
         this.add(this.hc[var2++]);
      }

      this.fs = new JLabel("100", 0);
      this.fs.setBounds(233, 188, 40, 14);
      this.fs.setForeground(Color.red);
      this.fs.setFont(com.xy.q.Class49.bz);
      this.add(this.fs);
   }
}
