package com.xy.a;

import com.xy.bean.GangReward;
import com.xy.bean.LoginResult;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Class83 extends com.xy.q.Class30 {
   private int ia;
   private com.xy.q.Class14 aih;
   private MoneyType yj;
   private List<JLabel> lo;
   private com.xy.i.Class18 aii;
   private List<GangReward> kj;
   private com.xy.w.Class18 co;
   private com.xy.q.Class14 gb;
   public Class22[] aij;
   private com.xy.q.Class52 aik;
   private JLabel[] o;
   public static ImageIcon ail = new ImageIcon("sc/b/B162.png");

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ia = var1;
      this.e();

      for (int var2 = 0; var10000 < this.aij.length; var10000 = var2) {
         this.aij[var2].hc(null);
         this.aij[var2++].setBorder(null);
      }

      int var4 = this.kj.size() > (var1 + 1) * 24 ? 24 : this.kj.size() - var1 * 24;

      int var3;
      for (int var5 = var3 = 0; var5 < var4; var5 = var3) {
         Class22 var6 = this.aij[var3];
         int var10002 = var1 * 24 + var3;
         var3++;
         var6.hc(this.kj.get(var10002));
      }
   }

   public void e() {
      int var1 = (this.kj.size() - 1) / 24 + 1;
      if (this.lo == null) {
         this.lo = new ArrayList<>();
      }

      int var2;
      int var10000 = var2 = 0;

      Class83 var8;
      while (true) {
         if (var10000 >= var1) {
            var8 = this;
            break;
         }

         if (var2 >= 8) {
            var8 = this;
            break;
         }

         if (var2 >= this.lo.size()) {
            if (var1 > 8 && var2 == 0) {
               String var12 = "駱頽";
               this.lo.add(this.aaw("首页", var2));
            } else if (var1 > 8 && var2 == 7) {
               String var10002 = "屓顄";
               this.lo.add(this.aaw("尾页", var2));
            } else if (var1 > 8) {
               if (this.ia == 0) {
                  this.lo.add(this.aaw(String.valueOf(var2), var2));
               } else if (this.ia > var1 - 5) {
                  int var3 = var1 - 6;
                  this.lo.add(this.aaw(String.valueOf(var2 + var3), var2));
               } else {
                  this.lo.add(this.aaw(String.valueOf(var2 + this.ia - 1), var2));
               }
            } else {
               this.lo.add(this.aaw(String.valueOf(var2 + 1), var2));
            }
         } else if (var1 > 8 && var2 == 0) {
            JLabel var7 = this.lo.get(var2);
            String var10 = "駱頽";
            var7.setText("首页");
         } else if (var1 > 8 && var2 == 7) {
            JLabel var6 = this.lo.get(var2);
            String var10001 = "屓顄";
            var6.setText("尾页");
         } else if (var1 > 8) {
            if (this.ia == 0) {
               this.lo.get(var2).setText(String.valueOf(var2));
            } else if (this.ia > var1 - 5) {
               int var5 = var1 - 6;
               this.lo.get(var2).setText(String.valueOf(var2 + var5));
            } else {
               this.lo.get(var2).setText(String.valueOf(var2 + this.ia - 1));
            }
         } else {
            this.lo.get(var2).setText(String.valueOf(var2 + 1));
         }

         var10000 = ++var2;
      }

      if (var8.lo.size() > var1) {
         for (int var9 = var2 = this.lo.size() - 1; var9 >= var1; var9 = var2) {
            this.remove(this.lo.get(var2));
            this.lo.remove(var2--);
         }
      }
   }

   // $VF: synthetic method
   static List aau(Class83 var0) {
      return var0.kj;
   }

   public void f() {
      LoginResult var10000 = this.yx().getLoginResult();
      String var10001 = "幉浶禈剎";
      if (var10000.getScoretype("帮派积分").compareTo(new BigDecimal(50)) < 0) {
         var10001 = "悙盩戩勲丼跞仔辶衽拐奧浖劙ｬＰ";
         this.afx.dp("您的战功不足以进行抽奖活动！！");
      } else {
         String var1 = Agreement.getSendTextAES("drawnitems", null);
         this.za().k(var1);
      }
   }

   public static GangReward aav(List<GangReward> var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         Iterator var4;
         for (Iterator var10000 = var4 = var0.iterator(); var10000.hasNext(); var10000 = var4) {
            GangReward var3;
            if ((var3 = (GangReward)var4.next()).getGoodId().intValue() == var1 && var3.getDropNum() == var2) {
               return var3;
            }
         }

         return null;
      }
   }

   public void hc(GangReward var1) {
      GangReward var2;
      if ((var2 = aav(this.kj, var1.getGoodId().intValue(), var1.getDropNum())) != null) {
         var2.setRewardNum(var1.getRewardNum());
         if (var2.getRewardNum() <= 0) {
            this.kj.remove(var2);
         }

         this.g(Math.min((this.kj.size() - 1) / 24, this.ia));
      }
   }

   public JLabel aaw(String var1, int var2) {
      JLabel var3 = new JLabel();
      var3.setBounds(47 + var2 * 41, 238, 39, 23);
      var3.setIcon(ail);
      var3.setBackground(new Color(0, 0, 0, 0));
      var3.setText(var1);
      var3.setForeground(Color.WHITE);
      var3.setHorizontalTextPosition(0);
      var3.setFont(com.xy.q.Class49.ac);
      var3.addMouseListener(new Class38(this, var3));
      this.add(var3);
      return var3;
   }

   public void fm(List<GangReward> var1) {
      this.kj = var1;
      this.g(0);
      this.zc().b(this.lj());
   }

   public Class83(GameView var1) {
      super(59, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "\u0014+H,HyI8\t/";
      this.ia = 0;
      this.yy(-1, 0, 380, 387, com.xy.q.Class30.agh);
      com.xy.w.Class9 var10 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "赾勲堳";
      this.yu(var10, "赏功堂");
      String var10008 = "\u0014+H-H\u007fI8\t/";
      String var10013 = "拐奧";
      this.aii = new com.xy.i.Class18("sc/e/7.png", 1, 216, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "抽奖", this);
      this.aii.setBounds(172, 340, 59, 25);
      this.add(this.aii);
      this.o = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = var2) {
         this.o[var2] = com.xy.q.Class1.k(86, 258 + 25 * var2, 72, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var4 = this.o[var2];
         String var6;
         if (var2 == 0) {
            var6 = "淯聟承勗";
            var6 = "消耗战功";
         } else if (var2 == 1) {
            var6 = "拐奧歌敁";
            var6 = "抽奖次数";
         } else if (var2 == 2) {
            var6 = "扶盌承勗";
            var6 = "我的战功";
         } else {
            var6 = "";
         }

         var4.setText(var6);
         this.o[var2].setHorizontalAlignment(10);
         this.add(this.o[var2++]);
      }

      this.yj = new MoneyType();
      String var10016 = "幃洏禂刷";
      this.yj.setIdAndKey(0, "帮派积分");
      this.gb = com.xy.q.Class1.i(164, 258, 143, 19, 10, Color.white, com.xy.q.Class49.w);
      this.aih = com.xy.q.Class1.i(164, 283, 143, 19, 10, Color.white, com.xy.q.Class49.w);
      this.aik = com.xy.q.Class1.m(164, 308, 143, 19, 10, Color.white, com.xy.q.Class49.w, null, var1);
      var10008 = ";\u0004g\u0003gV\u007fI8\t/";
      this.gb.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      var10007 = "B\u000e\u001e\t\u001e\\\u0006CA\u0003V";
      this.aih.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      var10006 = ";\u0004g\u0003gV\u007fI8\t/";
      this.aik.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.aik.n(2);
      this.add(this.gb);
      this.add(this.aih);
      this.add(this.aik);
      var10013 = "X\u0001";
      this.gb.setText("50");
      this.aih.setText("0");
      this.aik.setText("0");
      this.co = new com.xy.w.Class18();
      String var10009 = ";\u0004g\u0003gVqI8\t/";
      this.co.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.co.setBounds(47, 31, 309, 207);
      this.add(this.co);
      this.aij = new Class22[24];

      for (int var5 = var2 = 0; var5 < this.aij.length; var5 = var2) {
         this.aij[var2] = new Class22(this);
         this.aij[var2].setBounds(48 + 51 * (var2 % 6), 33 + 51 * (var2 / 6), 51, 51);
         Class22 var10003 = this.aij[var2];
         String var10004 = "B\u000e\u001e\t\u001e\\\tCA\u0003V";
         var10003.gr(com.xy.w.Class16.c("sc/d/18.png"));
         this.aij[var2].wp(com.xy.q.Class54.aus);
         this.add(this.aij[var2++]);
      }
   }

   static {
      String var10002 = "B\u000e\u001e\u000f\u001e/\u0000[\u0003CA\u0003V";
   }

   // $VF: synthetic method
   static int aax(Class83 var0) {
      return var0.ia;
   }

   public void h() {
      long var1 = this.yx().getMoney(this.yj);
      if (this.aik.ee() != var1) {
         this.aik.ef(var1);
         this.aih.setText(String.valueOf(var1 / 50L));
      }
   }
}
