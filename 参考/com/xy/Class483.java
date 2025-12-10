package com.xy;

import com.xy.bean.GangReward;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Class483 extends Class345 {
   private MoneyType ca;
   private Class322 ki;
   public <undefinedtype>[] abc;
   private List<JLabel> abd;
   public static ImageIcon abe = new ImageIcon("sc/b/B162.png");
   private Class245 rd;
   private JLabel[] iv;
   private Class436 uc;
   private Class556 ks;
   private List<GangReward> ie;
   private int cy;
   private Class245 abf;

   public void ck(List<GangReward> var1) {
      int var10002 = 3 & 4;
      this.ie = var1;
      this.y(var10002);
      this.ve().a(this.ae());
   }

   public JLabel qx(String var1, int var2) {
      JLabel var3 = new JLabel();
      int var10006 = 3 & 4;
      var3.setBounds((47 & 127) + var2 * (61 & 107), 16383 & 16622, 103 & 63, 95 & 55);
      var3.setIcon(abe);
      var3.setBackground(new Color(2 & 5, 2 & 5, 2 & 5, 2 & 5));
      var3.setText(var1);
      var3.setForeground(Color.WHITE);
      var3.setHorizontalTextPosition(var10006);
      var3.setFont(Class681.ce);
      var3.addMouseListener(new MouseListener(var3) {
         private JLabel rk;

         public void mouseReleased(MouseEvent var1) {
         }

         public void mouseEntered(MouseEvent var1) {
         }

         public void mouseClicked(MouseEvent var1) {
         }

         public void mousePressed(MouseEvent var1) {
            int var2 = 3 ^ 3;
            if ((this.rk.getText().equals("首页") ? (var2 = 3 & 4) : (this.rk.getText().equals("尾页") ? (var2 = (Class483.this.ie.size() - (3 >> 1)) / (31 & 120)) : (var2 = Integer.parseInt(this.rk.getText()) - --1))) != Class483.this.cy) {
               Class483.this.y(var2);
            }

         }

         public {
            this.rk = var2;
         }

         public void mouseExited(MouseEvent var1) {
         }
      });
      this.add(var3);
      return var3;
   }

   public void nx(GangReward var1) {
      GangReward var2;
      if ((var2 = qy(this.ie, var1.getGoodId().intValue(), var1.getDropNum())) != null) {
         var2.setRewardNum(var1.getRewardNum());
         if (var2.getRewardNum() <= 0) {
            this.ie.remove(var2);
         }

         this.y(Math.min((this.ie.size() - (2 ^ 3)) / (122 & 29), this.cy));
      }
   }

   public static GangReward qy(List<GangReward> var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         Iterator var4;
         for(Iterator var10000 = var4 = var0.iterator(); var10000.hasNext(); var10000 = var4) {
            GangReward var3;
            if ((var3 = (GangReward)var4.next()).getGoodId().intValue() == var1 && var3.getDropNum() == var2) {
               return var3;
            }
         }

         return null;
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.s();
      }

   }

   public void y(int var1) {
      int var10000 = 5 >> 3;
      this.cy = var1;
      this.p();

      int var2;
      for(var2 = var10000; var10000 < this.abc.length; var10000 = var2) {
         this.abc[var2].nx((GangReward)null);
         this.abc[var2++].setBorder((Border)null);
      }

      var2 = this.ie.size() > (var1 + (3 & 5)) * (120 & 31) ? 126 & 25 : this.ie.size() - var1 * (92 & 59);

      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < var2; var10000 = var3) {
         <undefinedtype> var4 = this.abc[var3];
         int var10002 = var1 * (126 & 25) + var3;
         ++var3;
         var4.nx((GangReward)this.ie.get(var10002));
      }

   }

   public void p() {
      int var1 = (this.ie.size() - (3 >> 1)) / (63 & 88) + (3 & 5);
      if (this.abd == null) {
         this.abd = new ArrayList();
      }

      int var2;
      int var10000 = var2 = 0;

      Class483 var4;
      while(true) {
         if (var10000 >= var1) {
            var4 = this;
            break;
         }

         if (var2 >= (92 & 43)) {
            var4 = this;
            break;
         }

         int var3;
         if (var2 >= this.abd.size()) {
            if (var1 > (44 & 91) && var2 == 0) {
               this.abd.add(this.qx("首页", var2));
            } else if (var1 > (126 & 9) && var2 == (7 & 127)) {
               this.abd.add(this.qx("尾页", var2));
            } else if (var1 > (77 & 58)) {
               if (this.cy == 0) {
                  this.abd.add(this.qx(String.valueOf(var2), var2));
               } else if (this.cy > var1 - --5) {
                  var3 = var1 - (78 & 55);
                  this.abd.add(this.qx(String.valueOf(var2 + var3), var2));
               } else {
                  this.abd.add(this.qx(String.valueOf(var2 + this.cy - (3 >> 1)), var2));
               }
            } else {
               this.abd.add(this.qx(String.valueOf(var2 + --1), var2));
            }
         } else if (var1 > (41 & 94) && var2 == 0) {
            ((JLabel)this.abd.get(var2)).setText("首页");
         } else if (var1 > (72 & 63) && var2 == (71 & 63)) {
            ((JLabel)this.abd.get(var2)).setText("尾页");
         } else if (var1 > (78 & 57)) {
            if (this.cy == 0) {
               ((JLabel)this.abd.get(var2)).setText(String.valueOf(var2));
            } else if (this.cy > var1 - --5) {
               var3 = var1 - (22 & 111);
               ((JLabel)this.abd.get(var2)).setText(String.valueOf(var2 + var3));
            } else {
               ((JLabel)this.abd.get(var2)).setText(String.valueOf(var2 + this.cy - (3 & 5)));
            }
         } else {
            ((JLabel)this.abd.get(var2)).setText(String.valueOf(var2 + (3 >> 1)));
         }

         ++var2;
         var10000 = var2;
      }

      if (var4.abd.size() > var1) {
         for(var10000 = var2 = this.abd.size() - (3 & 5); var10000 >= var1; var10000 = var2) {
            this.remove((Component)this.abd.get(var2));
            this.abd.remove(var2--);
         }
      }

   }

   public Class483(GameView var1) {
      int var10001 = --3;
      int var10008 = -4 >> 2;
      int var10010 = 3 & 4;
      super(123 & 63, 5 >> 1, Class345.aef, var1);
      this.cy = var10010;
      this.va(var10008, 3 ^ 3, 22396 & 10751, 4483 & 28671, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 84 & 111, 84 & 111, 84 & 111, 84 & 111, (boolean)(3 & 4)), "赏功堂");
      this.ki = new Class322("sc/e/7.png", --1, 216 & 32767, Class681.ak, Class681.c, "抽奖", this);
      this.ki.setBounds(30143 & 2796, 28116 & 4991, 127 & 59, 127 & 25);
      this.add(this.ki);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.iv = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.b(119 & 94, (23515 & 9510) + (127 & 25) * var2, 88 & 111, 63 & 83, Color.black, Class681.ak);
         this.iv[var2].setText(var2 == 0 ? "消耗战功" : (var2 == --1 ? "抽奖次数" : (var2 == --2 ? "我的战功" : "")));
         this.iv[var2].setHorizontalAlignment(74 & 63);
         this.add(this.iv[var2++]);
      }

      var10001 = 56 & 95;
      this.ca = new MoneyType();
      this.ca.setIdAndKey(3 & 4, "帮派积分");
      this.rd = Class133.a(164, 258, 143, 19, 10, Color.white, Class681.q);
      this.abf = Class133.a(164, 283, 143, 19, 10, Color.white, Class681.q);
      this.ks = Class133.m(164, 308, 143, 19, 10, Color.white, Class681.q, (MoneyType)null, var1);
      this.rd.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.abf.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
      this.ks.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.ks.ab(5 >> 1);
      this.add(this.rd);
      this.add(this.abf);
      this.add(this.ks);
      this.rd.setText("50");
      this.abf.setText("0");
      this.ks.setText("0");
      this.uc = new Class436();
      this.uc.eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
      this.uc.setBounds(47, 31, 309, 207);
      this.add(this.uc);
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      var10003 = true;
      this.abc = var4;

      for(var10000 = var2 = 2 & 5; var10000 < this.abc.length; var10000 = var2) {
         this.abc[var2] = new Class44(this) {
            // $FF: synthetic field
            final Class483 wb;
            private JLabel rk;
            private JLabel ax;

            public void nx(GangReward var1) {
               Goodstable var2 = var1 != null ? this.wb.vc().n(var1.getGoodId()) : null;
               if (var2 == null) {
                  int var10003 = 3 & 5;
                  this.c(5 >> 3, (Object)null);
                  this.setVisible((boolean)var10003);
                  this.rk.setText("");
                  this.ax.setText("");
               } else {
                  this.c(3 >> 1, var2);
                  this.rk.setText(var1.getDropNum() > 5 >> 2 ? String.valueOf(var1.getDropNum()) : "");
                  this.ax.setText(String.valueOf(var1.getRewardNum()));
               }
            }

            public {
               int var10003 = 2 ^ 3;
               this.rk = Class133.c(var10003, 1 ^ 3, 59 & 110, 31 & 108, 106 & 31, Color.WHITE, Class681.bm);
               this.add(this.rk);
               this.ax = Class133.c(87 & 47, 114 & 47, 47 & 122, 79 & 60, --4, Color.RED, Class681.bm);
               this.add(this.ax);
            }
         };
         this.abc[var2].setBounds(48 + 51 * (var2 % 6), 33 + 51 * (var2 / 6), 51, 51);
         this.abc[var2].hf(Class511.a("sc/d/18.png"));
         this.abc[var2].ad(Class44.arj);
         this.add(this.abc[var2++]);
      }

   }

   public void s() {
      long var1 = this.vd().getMoney(this.ca);
      if (this.ks.gl() != var1) {
         this.ks.gh(var1);
         this.abf.setText(String.valueOf(var1 / 50L));
      }
   }

   public void d() {
      if (this.vd().getLoginResult().getScoretype("帮派积分").compareTo(new BigDecimal(59 & 118)) < 0) {
         this.aej.fw("您的战功不足以进行抽奖活动！！");
      } else {
         String var1 = Agreement.getSendTextAES("drawnitems", (String)null);
         this.uw().d(var1);
      }
   }
}
