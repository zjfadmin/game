package com.xy.a.q;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class44 extends com.xy.q.Class30 {
   private com.xy.i.Class19 zg;
   private int gs;
   private int gt;
   private int gu;
   private BigDecimal zh;
   private QuackGameBean zi;
   private BigDecimal ko;
   private String zj;
   public static com.xy.w.Class1 zk = com.xy.w.Class11.f("sc/mouse/flicker.tcp", null);
   private JLabel ge;
   private int aa;
   private int cn;
   private int ha;
   private int cb;
   private int ae;
   private BigDecimal bn;
   private List<Class7> iv;
   private JLabel im;

   public int dx() {
      int var1;
      return (var1 = 40 - (int)((this.cn - this.gs) * 1.5)) < 4 ? 4 : var1;
   }

   public synchronized void h() {
      if (this.zi != null) {
         String var5 = "抴夀近泷最纅杖";
         this.afx._do("抽奖还没有结束");
      } else if (this.ko == null && this.bn.longValue() * this.aa > this.zh.longValue()) {
         GameView var10000 = this.afx;
         StringBuilder var4 = new StringBuilder(String.valueOf(this.zj));
         String var6 = "丳跎";
         var10000._do(var4.append("不足").append(this.bn.longValue() * this.aa).toString());
      } else {
         Goodstable var1 = this.yx().bk(this.ko);
         StringBuffer var2 = new StringBuffer();
         String var10002 = "M";
         var2.append("D");
         var2.append(this.gt);
         String var10004 = "\u0001";
         var2.append("|");
         var2.append(0);
         String var10006 = "u";
         var2.append("|");
         var2.append(1);
         if (var1 != null) {
            String var10001 = "\u0001";
            var2.append("|");
            var2.append(var1.getRgid());
         }

         String var3 = Agreement.getSendTextAES("getfivemsg", var2.toString());
         this.za().k(var3);
      }
   }

   public void cc(int var1, int var2) {
      this.yv(-1, 0, var1, var2);
   }

   public synchronized void tw(QuackGameBean var1) {
      this.ci(var1.getPetmsg2());
      String var10000 = var1.getPetmsg();
      String var10001 = "b\u0001";
      String[] var2 = var10000.split("\\|");

      int var3;
      for (int var9 = var3 = 0; var9 < var2.length; var9 = var3) {
         Class7 var4 = var3 < this.iv.size() ? this.iv.get(var3) : null;
         if (var4 == null) {
            var4 = new Class7(1, this);
            this.iv.add(var4);
            this.add(var4);
         }

         var10000 = var2[var3];
         var10001 = "4";
         String[] var5 = var10000.split("=");
         Goodstable var10003 = this.yt().ay(new BigDecimal(var5[0]));
         int var10004 = Integer.parseInt(var5[1]);
         String var10005 = var5[2];
         var3++;
         var4.bn(var10003, var10004, Integer.parseInt(var10005));
         var4.setVisible(true);
      }

      this.cb = var2.length;

      for (int var11 = var3 = var2.length; var11 < this.iv.size(); var11 = var3) {
         Object var12 = this.iv.get(var3);
         var3++;
         ((Class7)var12).setVisible(false);
      }

      this.gt = var1.getMoney().intValue();
      if (this.gt == 1) {
         int var13 = 0;
         String var15 = "\u000e]R\\RmO\tK\u0010\rP\u001a";
         this._do("sc/b/S276.png");
         this.zg.setBounds(352, 230, 80, 26);
         this.im.setBounds(350, 198, 75, 18);
         this.ge.setBounds(350, 168, 75, 18);

         for (int var7 = 0; var13 < this.iv.size(); var13 = ++var7) {
            Class7 var8;
            if ((var8 = this.iv.get(var7)).isVisible()) {
               if (var7 < 6) {
                  var8.setBounds(52 + var7 * 94, 52, 75, 70);
               } else if (var7 < 8) {
                  var8.setBounds(522, var7 == 6 ? 145 : 237, 75, 70);
               } else if (var7 < 14) {
                  var8.setBounds(52 + (13 - var7) * 94, 329, 75, 70);
               } else {
                  var8.setBounds(52, var7 == 14 ? 237 : 145, 75, 70);
               }
            }
         }

         this.cc(652, 446);
      }

      this.zc().b(this.lj());
   }

   public synchronized void ci(String var1) {
      String var10001 = "@";
      String[] var2 = var1.split("=");
      var10001 = var2[0];
      String var10002 = "8|:e";
      this.ko = !var10001.equals("null") ? new BigDecimal(var2[0]) : null;
      var10001 = var2[1];
      var10002 = "P\bR\u0011";
      this.zj = !var10001.equals("null") ? var2[1] : null;
      var10001 = var2[2];
      var10002 = "8|:e";
      this.bn = !var10001.equals("null") ? new BigDecimal(var2[2]) : null;
      this.aa = Integer.parseInt(var2[3]);
      if (var2.length == 5) {
         var10001 = var2[4];
         var10002 = "P\bR\u0011";
         this.zh = !var10001.equals("null") ? new BigDecimal(var2[4]) : null;
      }

      this.im.setText(this.bn != null ? String.valueOf(this.bn.longValue() * this.aa) : "");
      this.ge.setText(this.zh != null ? this.zh.toString() : "");
   }

   public Class44(GameView var1) {
      super(119, 2, com.xy.q.Class30.afz, var1);
      String var10005 = "z5&4&\u0005;a?xy8n";
      this.gt = -1;
      this.aa = 1;
      this.yy(-1, 0, 0, 0, com.xy.q.Class30.agh);
      this._do("sc/b/S276.png");
      this.iv = new ArrayList<>();
      String var10006 = "\u000e]R[R\rL\u0010\rP\u001a";
      String var10011 = "拫奟";
      this.zg = new com.xy.i.Class19("sc/e/31.png", 1, 204, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "抽奖", this);
      this.zg.setBounds(165, 142, 79, 25);
      this.add(this.zg);
      this.im = new JLabel("", 0);
      this.im.setBounds(0, 0, 75, 18);
      this.im.setFont(com.xy.q.Class49.bm);
      this.im.setForeground(Color.red);
      this.add(this.im);
      this.ge = new JLabel("", 0);
      this.ge.setBounds(0, 0, 75, 18);
      this.ge.setFont(com.xy.q.Class49.bm);
      this.ge.setForeground(Color.red);
      this.add(this.ge);
   }

   static {
      String var10000 = "M\u001e\u0011\u0010Q\bM\u0018\u0011\u001bR\u0014]\u0016[\u000f\u0010\t]\r";
   }

   public synchronized void tx(QuackGameBean var1) {
      this.tm(var1);
      this.ci(var1.getPetmsg2());
   }

   @Override
   public boolean ah() {
      if (this.zi != null) {
         String var10002 = "抴夀近泷最纅杖斶泜儥闤霴杶";
         this.afx._do("抽奖还没有结束无法关闭面板");
         return false;
      } else {
         return super.ah();
      }
   }

   public synchronized void tm(QuackGameBean var1) {
      if (this.zi != null) {
         com.xy.c.Class9.u(this.zi.getAssetUpdate(), this.afx);
         this.tw(this.zi);
      }

      this.gs = 0;
      this.cn = var1 != null && var1.getIndex() != null ? var1.getIndex() : 0;
      this.ae = 0;
      this.zi = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.zi != null) {
         this.ae++;
         if (this.ae > this.dx()) {
            this.ae = 0;
            this.gs++;
            if (this.cb <= 0) {
               return;
            }

            Class7 var2;
            Class7 var10002 = var2 = this.iv.get(this.gs % this.cb);
            this.ha = var2.getX() + 13;
            this.gu = var10002.getY();
            if (this.gs >= this.cn) {
               this.tm(null);
            }
         }
      }

      if (this.ha > 0) {
         zk.j(com.xy.v.Class22.l(), 0);
         zk.ab(var1, this.ha, this.gu);
      }
   }
}
