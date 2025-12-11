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

public class Class98 extends com.xy.q.Class30 {
   private int la;
   private Class28 ard;
   private BigDecimal are;
   private BigDecimal arf;
   private QuackGameBean arg;
   private String arh;
   private Class109[] ari;
   private int sc;
   private List<Class28> arj;
   private int gt;
   private BigDecimal ark;
   private long ll;
   private int gw;
   private JLabel db;
   private String zj;
   private JLabel xg;
   private long agx;
   private com.xy.i.Class19 jv;
   private com.xy.i.Class19 kv;
   private BigDecimal ee;
   private com.xy.q.Class54 yk;
   private int ae;
   private String nq;
   private com.xy.i.Class19 te;
   private int ah;

   public synchronized void tw(QuackGameBean var1) {
      if (this.arg != null) {
         com.xy.c.Class9.u(this.arg.getAssetUpdate(), this.afx);
         this.ci(this.arg.getPetmsg2());
      }

      this.arg = var1;
      if (var1 != null) {
         Class98 var10000;
         if (var1.getIndex() < 10) {
            var10000 = this;
            String var10004 = "h\\";
            this.arh = "00" + var1.getIndex();
         } else if (var1.getIndex() < 100) {
            var10000 = this;
            this.arh = "0" + var1.getIndex();
         } else if (var1.getIndex() < 1000) {
            var10000 = this;
            this.arh = "0" + var1.getIndex();
         } else {
            var10000 = this;
            this.arh = "" + var1.getIndex();
         }

         var10000.gw = 0;
         this.zj = null;
         this.ah = 0;
         this.agx = com.xy.v.Class22.l();
         this.ll = 0L;
         this.la = 0;
         this.sc = 0;
         int var2 = Integer.parseInt(this.arh.substring(this.gw, this.gw + 1));
         this.zj = this.arh.substring(this.arh.length() - this.gw);
         this.ah = 380 - this.arh.length() * 13 / 2;
         this.ah = this.ah + (this.arh.length() - this.zj.length()) * 13;
         this.sc = 500 + var2 * 25;
      }
   }

   public synchronized void tx(QuackGameBean var1) {
      this.tw(var1);
   }

   public synchronized void h() {
      if (this.arg != null) {
         String var7 = "拭夲辈泅杙纷朏";
         this.afx._do("抽奖还没有结束");
      } else if (this.ard == null) {
         String var6 = "泍村遥乵盨拥夺爱咭";
         this.afx._do("没有选中的抽奖物品");
      } else {
         int var1 = 0;
         if (this.ark != null) {
            var1 += this.yx().getGoodNum(this.ark);
         }

         if (this.arf != null && this.are != null) {
            var1 = (int)(var1 + this.arf.longValue() / this.are.longValue());
         }

         if (Class28.d(this.ard) > var1) {
            String var5 = "拙夆歅攠乩跣";
            this.afx._do("抽奖次数不足");
         } else {
            Goodstable var2 = this.yx().bk(this.ark);
            StringBuffer var3 = new StringBuffer();
            String var10002 = ":";
            var3.append("V");
            var3.append(this.ee);
            String var10004 = ",";
            var3.append("|");
            var3.append(Class28.h(this.ard));
            String var10006 = "\u0010";
            var3.append("|");
            var3.append(Class28.d(this.ard));
            if (var2 != null) {
               String var10001 = ",";
               var3.append("|");
               var3.append(var2.getRgid());
            }

            String var4 = Agreement.getSendTextAES("getfivemsg", var3.toString());
            this.za().k(var4);
         }
      }
   }

   public synchronized void ak(com.xy.q.Class54 var1) {
      if (var1 != this.yk) {
         if (this.arg != null) {
            String var6 = "拑夎辴泹来纋朳";
            this.afx._do("抽奖还没有结束");
         } else {
            Class109 var2;
            if (Class109.anf(var2 = (Class109)var1) != null) {
               this.ard = Class109.anf(var2);
               Goodstable var3 = this.yt().ay(Class28.h(this.ard));
               byte var10001;
               Goodstable var10002;
               if (var3 != null) {
                  var10001 = 1;
                  var10002 = var3;
               } else {
                  var10001 = 0;
                  var10002 = var3;
               }

               this.yk.gs(var10001, var10002);
               if (var3 == null) {
                  this.yk.setVisible(true);
               }

               int var4;
               for (int var10000 = var4 = 0; var10000 < this.ari.length; var10000 = var4) {
                  this.ari[var4++].t();
               }

               String var7 = "#\u0007\u007f\u0006\u007f7cTfJ \n7";
               var2.dq("sc/b/S306.png");
               if (this.are != null) {
                  this.xg.setText(String.valueOf(this.are.longValue() * Class28.d(this.ard)));
               } else {
                  String var10003 = "攜醗V";
                  this.xg.setText("数量:" + Class28.d(this.ard));
               }
            }
         }
      }
   }

   public Class98(GameView var1) {
      super(128, 2, com.xy.q.Class30.afz, var1);
      String var10012 = "\u001f;C:C\u000b_hYv\u001c6\u000b";
      this.ae = 1;
      this.yy(-2, 0, 741, 375, com.xy.q.Class30.agh);
      this._do("sc/b/S305.png");
      String var10011 = "#\u0007\u007f\u0006\u007f&c]eJ \n7";
      this.agi.setBtnPath("sc/b/B395.png");
      this.agi.setBounds(456, 15, 45, 46);
      this.arj = new ArrayList<>();
      this.xg = new JLabel("");
      this.xg.setBounds(448, 310, 75, 18);
      this.xg.setFont(com.xy.q.Class49.bm);
      this.xg.setForeground(Color.red);
      this.add(this.xg);
      this.db = new JLabel("");
      this.db.setBounds(325, 23, 75, 18);
      this.db.setFont(com.xy.q.Class49.bm);
      this.db.setForeground(Color.red);
      this.add(this.db);
      String var10010 = "\u001f;C=Cl^v\u001c6\u000b";
      this.kv = new com.xy.i.Class19("sc/e/42.png", 1, 201, this);
      this.kv.setBounds(460, 158, 18, 18);
      this.add(this.kv);
      var10011 = "#\u0007\u007f\u0001\u007fPcJ \n7";
      this.jv = new com.xy.i.Class19("sc/e/43.png", 1, 202, this);
      this.jv.setBounds(478, 158, 18, 18);
      this.add(this.jv);
      var10012 = "\u001f;C:C\u001a_aXv\u001c6\u000b";
      this.te = new com.xy.i.Class19("sc/b/B394.png", 1, 200, this);
      this.te.setBounds(492, 272, 59, 72);
      this.add(this.te);
      this.ari = new Class109[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ari.length; var10000 = var2) {
         this.ari[var2] = new Class109(this);
         this.ari[var2].setBounds(262 + var2 % 4 * 60, 42 + var2 / 4 * 54, 54, 52);
         this.add(this.ari[var2++]);
      }

      this.yk = new com.xy.q.Class54(this);
      this.yk.setBounds(358, 254, 49, 49);
      this.add(this.yk);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.arh != null) {
         var1.setColor(Color.red);
         var1.setFont(com.xy.q.Class49.ad);
         if (this.zj != null) {
            var1.drawString(this.zj, this.ah, 240);
         }

         if (this.sc != 0) {
            long var2 = (com.xy.v.Class22.l() - this.agx) / 5L - this.ll;
            this.la = (int)(this.la + var2);
            this.ll += var2;
            if (this.la >= this.sc) {
               this.la = this.sc;
            }

            int var4;
            var4 = (var4 = this.la / 25) % 10;
            int var5 = this.la % 25;
            var1.setClip(this.ah - 13, 215, 13, 25);
            var1.drawString(String.valueOf(var4), this.ah - 13, 240 - var5);
            var1.drawString(String.valueOf(var4 == 9 ? 0 : var4 + 1), this.ah - 13, 265 - var5);
            var1.setClip(0, 0, this.getWidth(), this.getHeight());
            if (this.la == this.sc) {
               this.la = 0;
               this.gw++;
               this.zj = this.arh.substring(this.arh.length() - this.gw);
               this.ah = 380 - this.arh.length() * 13 / 2;
               this.ah = this.ah + (this.arh.length() - this.zj.length()) * 13;
               if (this.gw >= this.arh.length()) {
                  this.sc = 0;
                  this.tw(null);
                  return;
               }

               int var6 = Integer.parseInt(this.arh.substring(this.gw, this.gw + 1));
               this.sc = 500 + var6 * 25;
            }
         }
      }
   }

   public void tm(QuackGameBean var1) {
      this.ee = var1.getMoney();
      this.ci(var1.getPetmsg2());
      String[] var10000;
      if (var1.getPetmsg() != null && !var1.getPetmsg().equals("")) {
         String var6 = var1.getPetmsg();
         String var10001 = "8,";
         var10000 = var6.split("\\|");
      } else {
         var10000 = null;
      }

      String[] var2 = var10000;
      this.ard = null;
      this.yk.gs(0, null);
      this.yk.setVisible(true);
      this.arj.clear();
      int var3;
      if (var2 != null) {
         for (int var7 = var3 = 0; var7 < var2.length; var7 = var3) {
            String[] var4 = var2[var3].split("_");
            Class28 var5 = new Class28(this);
            var5.c(new BigDecimal(var4[0]));
            var5.g(Integer.parseInt(var4[1]));
            var5.a(Integer.parseInt(var4[2]));
            var3++;
            this.arj.add(var5);
         }
      }

      this.y(0);
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   public synchronized void ci(String var1) {
      String var10001 = "m";
      String[] var2 = var1.split("=");
      var10001 = var2[0];
      String var10002 = "6\u00194\u0000";
      this.ark = !var10001.equals("null") ? new BigDecimal(var2[0]) : null;
      var10001 = var2[1];
      var10002 = "\n%\b<";
      this.nq = !var10001.equals("null") ? var2[1] : null;
      var10001 = var2[2];
      var10002 = "6\u00194\u0000";
      this.are = !var10001.equals("null") ? new BigDecimal(var2[2]) : null;
      this.ae = Integer.parseInt(var2[3]);
      if (var2.length == 5) {
         var10001 = var2[4];
         var10002 = "\n%\b<";
         this.arf = !var10001.equals("null") ? new BigDecimal(var2[4]) : null;
      }

      Class98 var10000;
      if (this.ard != null && this.are != null) {
         var10000 = this;
         this.xg.setText(String.valueOf(this.are.longValue() * Class28.d(this.ard)));
      } else {
         var10000 = this;
         this.xg.setText("");
      }

      var10000.db.setText(this.arf != null ? this.arf.toString() : "");
   }

   public int dx() {
      return this.gt;
   }

   @Override
   public boolean ah() {
      if (this.arg != null) {
         String var10002 = "拑夎辴泹来纋朳斸油儫閁霺朓";
         this.afx._do("抽奖还没有结束无法关闭面板");
         return false;
      } else {
         return super.ah();
      }
   }

   public void y(int var1) {
      this.gt = var1;
      Class98 var10000;
      if (this.gt < 0) {
         var10000 = this;
         this.gt = 0;
      } else {
         if (this.gt > (this.arj.size() - 1) / 8) {
            this.gt = (this.arj.size() - 1) / 8;
         }

         var10000 = this;
      }

      int var2 = var10000.gt * 8;

      int var3;
      for (int var5 = var3 = 0; var5 < this.ari.length; var5 = var3) {
         Class28 var4 = var3 + var2 < this.arj.size() ? this.arj.get(var3 + var2) : null;
         this.ari[var3++].ane(var4);
      }
   }

   public void g(int var1) {
      if (var1 == 200) {
         this.h();
      } else if (var1 == 201) {
         this.y(this.dx() - 1);
      } else {
         if (var1 == 202) {
            this.y(this.dx() + 1);
         }
      }
   }

   // $VF: synthetic method
   static Class28 ajl(Class98 var0) {
      return var0.ard;
   }
}
