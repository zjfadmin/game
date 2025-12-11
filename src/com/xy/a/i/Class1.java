package com.xy.a.i;

import com.xy.a.q.Class57;
import com.xy.bean.LoginResult;
import com.xy.bean.QualityClBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class1 extends com.xy.q.Class30 {
   private MoneyType br;
   private BigDecimal bs;
   private BigDecimal bt;
   private QualityClBean bu;
   private boolean bv;
   private Class54 bw;
   private com.xy.q.Class14[] bx;
   private com.xy.i.Class11[] by;
   private com.xy.w.Class18[] ar;
   private Class52[] bz;
   private JLabel[] o;
   private MoneyType ca;

   public boolean at(int var1) {
      if (var1 == 21) {
         this.zc().f(this.lj());
         return false;
      } else {
         Goodstable var2;
         if ((var2 = (Goodstable)this.bw.jx()) != null) {
            var2 = this.yx().getGood(var2.getRgid());
         }

         if (var2 == null) {
            return false;
         } else if (var1 == 22) {
            if (this.bu == null) {
               return false;
            } else {
               String var7 = Agreement.getSendTextAES("extrattroper", com.xy.v.Class31.a().toJson(this.bu));
               this.za().k(var7);
               this.bu.setType(-4);
               this.ba(this.bu);
               return false;
            }
         } else {
            RoleData var3;
            if ((var3 = this.yx()).getLoginResult().getGold().longValue() < this.bs.longValue()) {
               String var12 = "釟幐七跢";
               this.afx.dp("金币不足");
               return false;
            } else {
               LoginResult var10000 = var3.getLoginResult();
               String var10001 = "灬俎倥";
               if (var10000.getScoretype("灵修值").longValue() < this.bt.longValue()) {
                  String var11 = "瀤俠偭七跢";
                  this.afx.dp("灵修值不足");
                  return false;
               } else {
                  SuitOperBean var4 = new SuitOperBean();
                  ArrayList var5 = new ArrayList();
                  var5.add(var2.getRgid());
                  var4.setType(this.bv ? 2 : 1);
                  var4.setGoods(var5);
                  String var6 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var4));
                  this.za().k(var6);
                  var3.getLoginResult().setGold(var3.getLoginResult().getGold().subtract(this.bs));
                  LoginResult var10002 = var3.getLoginResult();
                  String var10003 = var3.getLoginResult().getScore();
                  String var10006 = "灕俷倜$";
                  var10002.setScore(com.xy.v.Class5.a(var10003, "灵修值=" + this.bt.longValue(), 3));
                  GameView var8 = this.afx;
                  String var10004 = "淙耙仗";
                  StringBuilder var9 = new StringBuilder("消耗了").append(this.bs);
                  var10003 = "釈帡咕";
                  StringBuilder var10 = var9.append("金币和").append(this.bt);
                  var10003 = "炷瀤俠偭";
                  var8.dp(var10.append("点灵修值").toString());
                  return true;
               }
            }
         }
      }
   }

   public Class1(GameView var1) {
      super(74, 3, com.xy.q.Class30.afz, var1);
      String var10003 = "}2!5!` !`6";
      this.bt = new BigDecimal(30);
      this.bs = new BigDecimal(100000);
      this.bv = true;
      this.yy(-1, 0, 482, 350, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "套装洗练");
      this.by = new com.xy.i.Class11[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.by.length; var10000 = var2) {
         com.xy.i.Class11[] var7 = this.by;
         String var10004 = "jC6E6\u0012/\u000eiN~";
         int var10006 = 20 + var2;
         String var44;
         Class1 var10010;
         if (var2 == 0) {
            var44 = "弎妚洙纒";
            var44 = "开始洗练";
            var10010 = this;
         } else if (var2 == 1) {
            var44 = "俽畀屾怾";
            var44 = "保留属性";
            var10010 = this;
         } else if (var2 == 2) {
            var44 = "曱挳屐恶";
            var44 = "替换属性";
            var10010 = this;
         } else {
            var44 = "";
            var10010 = this;
         }

         com.xy.i.Class11 var10002 = new com.xy.i.Class11("sc/e/26.png", 1, var10006, Class49.ch, Class49.bv, var44, var10010);
         var7[var2] = var10002;
         Class1 var8;
         if (var2 == 0) {
            var8 = this;
            this.by[var2].setBounds(320, 155, 99, 25);
         } else {
            if (var2 == 1 || var2 == 2) {
               this.by[var2].setBounds(96 + (var2 - 1) * 209, 302, 99, 25);
            }

            var8 = this;
         }

         var8.add(this.by[var2++]);
      }

      this.o = new JLabel[15];

      for (int var9 = var2 = 0; var9 < this.o.length; var9 = ++var2) {
         int var42 = 73 + 30 * var2;
         String var10008 = "\u0003z\u0010)\u0010)\u0010)";
         this.o[var2] = com.xy.q.Class1.f(148, var42, 110, 19, 0, Class49.c("#c000000"), Class49.ch);
         JLabel var10 = this.o[var2];
         String var15;
         if (var2 == 0) {
            var15 = "我霎醀钿ｋ";
            var15 = "所需金钱：";
         } else if (var2 == 1) {
            var15 = "扠霙灕俷倜＃";
            var15 = "所需灵修值：";
         } else if (var2 == 2) {
            var15 = "~";
            var15 = "/";
         } else if (var2 == 3) {
            var15 = "6";
            var15 = "/";
         } else if (var2 == 4) {
            var15 = "芿赨釟铠俓甈厑夆裋小怩こ";
            var15 = "花费金钱保留原套装属性。";
         } else if (var2 == 5) {
            var15 = "玐朐奷補屾怾";
            var15 = "现有套装属性";
         } else if (var2 == 6) {
            var15 = "旡奙袔屐恶";
            var15 = "新套装属性";
         } else {
            var15 = "";
         }

         var10.setText(var15);
         this.add(this.o[var2]);
         if (var2 == 0 || var2 == 1) {
            this.o[var2].setHorizontalAlignment(10);
         }

         if (var2 == 2 || var2 == 3) {
            this.o[var2].setFont(Class49.ab);
            this.o[var2].setBounds(314, 73 + 30 * (var2 - 2), 15, 19);
         } else if (var2 == 4) {
            this.o[var2].setHorizontalAlignment(10);
            this.o[var2].setFont(Class49.k);
            this.o[var2].setBounds(90, 136, 200, 17);
         } else if (var2 >= 5 && var2 <= 6) {
            this.o[var2].setBounds(52 + (var2 - 5) * 210, 217, 191, 20);
            JLabel var11 = this.o[var2];
            var15 = "\u0003zf_f_f_";
            var11.setForeground(Class49.c("#cFFFFFF"));
         } else if (var2 >= 7 && var2 <= 14) {
            this.o[var2].setFont(Class49.w);
            JLabel var22 = this.o[var2];
            String var28 = "-2H\u0017H\u0017H\u0017";
            var22.setForeground(Class49.c("#cFFFFFF"));
            if (var2 == 7) {
               this.o[var2].setBounds(52, 237, 135, 27);
            } else if (var2 == 8) {
               this.o[var2].setBounds(187, 237, 56, 27);
            } else if (var2 == 9) {
               this.o[var2].setBounds(52, 264, 135, 27);
            } else if (var2 == 10) {
               this.o[var2].setBounds(187, 264, 56, 27);
            } else if (var2 == 11) {
               this.o[var2].setBounds(262, 237, 135, 27);
            } else if (var2 == 12) {
               this.o[var2].setBounds(397, 237, 56, 27);
            } else if (var2 == 13) {
               this.o[var2].setBounds(262, 264, 135, 27);
            } else if (var2 == 14) {
               this.o[var2].setBounds(397, 264, 56, 27);
            }
         }
      }

      this.bx = new com.xy.q.Class14[2];
      this.bz = new Class52[2];

      for (int var12 = var2 = 0; var12 < this.bx.length; var12 = var2) {
         this.bx[var2] = com.xy.q.Class1.i(245, 73 + 30 * var2, 69, 19, 10, Color.white, Class49.w);
         com.xy.q.Class14 var29 = this.bx[var2];
         var10003 = "jC6D6\u0011.\u000eiN~";
         var29.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.bx[var2++]);
      }

      this.ca = new MoneyType();
      this.br = new MoneyType();
      var10003 = "釟铠";
      this.ca.setIdAndKey(1, "金钱");
      int var13 = 0;
      var10003 = "灬俎倥";
      this.br.setIdAndKey(0, "灵修值");

      for (int var5 = 0; var13 < this.bz.length; var13 = var5) {
         GameView var43;
         MoneyType var10005;
         if (var5 == 0) {
            var10005 = this.ca;
            var43 = var1;
         } else {
            var10005 = this.br;
            var43 = var1;
         }

         this.bz[var5] = com.xy.q.Class1.a(10, Color.white, Class49.w, var10005, var43);
         this.bz[var5].setBounds(329, 73 + 30 * var5, 109, 19);
         this.bz[var5].n(2);
         Class52 var31 = this.bz[var5];
         var10003 = "\"m~j~?f !`6";
         var31.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.bz[var5++]);
      }

      this.bw = new Class54(this);
      this.bw.setBounds(76, 73, 50, 50);
      this.add(this.bw);
      this.ar = new com.xy.w.Class18[13];

      for (int var14 = var2 = 0; var14 < this.ar.length; var14 = ++var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var24 = this.ar[var2];
            String var33 = "Sz\u000f}\u000f-\u000eiN~";
            var24.dp("sc/d/4.png");
            this.ar[var2].setBounds(72, 69, 59, 57);
         } else if (var2 == 1) {
            com.xy.w.Class18 var34 = this.ar[var2];
            var10003 = "\"m~k~=a !`6";
            var34.dp("sc/e/30.png");
            this.ar[var2].setBounds(72, 136, 17, 17);
            this.ar[var2].addMouseListener(new Class25(this));
         } else if (var2 == 2) {
            com.xy.w.Class18 var25 = this.ar[var2];
            String var35 = "jC6D6\u0013/\u000eiN~";
            var25.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
            this.ar[var2].setBounds(52, 37, 400, 160);
         } else if (var2 >= 3 && var2 <= 12) {
            com.xy.w.Class18 var26 = this.ar[var2];
            String var36 = "\"m~j~<e !`6";
            var26.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            if (var2 >= 3 && var2 <= 4) {
               this.ar[var2].setBounds(52 + (var2 - 3) * 210, 217, 191, 20);
            } else if (var2 == 5) {
               this.ar[var2].setBounds(52, 237, 135, 27);
            } else if (var2 == 6) {
               this.ar[var2].setBounds(187, 237, 56, 27);
            } else if (var2 == 7) {
               this.ar[var2].setBounds(52, 264, 135, 27);
            } else if (var2 == 8) {
               this.ar[var2].setBounds(187, 264, 56, 27);
            } else if (var2 == 9) {
               this.ar[var2].setBounds(262, 237, 135, 27);
            } else if (var2 == 10) {
               this.ar[var2].setBounds(397, 237, 56, 27);
            } else if (var2 == 11) {
               this.ar[var2].setBounds(262, 264, 135, 27);
            } else if (var2 == 12) {
               this.ar[var2].setBounds(397, 264, 56, 27);
            }
         }
      }

      this.bs = new BigDecimal(this.bv ? 100000 : 80000);
      Class49.b(this.bx[0], this.bs.longValue());
      Class49.b(this.bx[1], this.bt.longValue());
   }

   // $VF: synthetic method
   static BigDecimal au(Class1 var0) {
      return var0.bs;
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] av(Class1 var0) {
      return var0.bx;
   }

   // $VF: synthetic method
   static void aw(Class1 var0, BigDecimal var1) {
      var0.bs = var1;
   }

   // $VF: synthetic method
   static void ax(Class1 var0, boolean var1) {
      var0.bv = var1;
   }

   public void ay(Goodstable var1) {
      this.bu = null;
      this.bw.gs(1, var1);
      if (this.za().l(2, 12)) {
         String var10000 = var1.getValue();
         String var10002 = "e";
         String var2;
         Class1 var4;
         if (com.xy.v.Class12.h(var2 = com.xy.v.Class12.ai(var10000, "套装品质=", "|"))) {
            var4 = this;
            this.bt = new BigDecimal(30);
         } else {
            String var10001 = "伮乇";
            if (var2.equals("传世")) {
               var4 = this;
               this.bt = new BigDecimal(30);
            } else {
               var10001 = "旀仮";
               if (var2.equals("无价")) {
                  var4 = this;
                  this.bt = new BigDecimal(25);
               } else {
                  var10001 = "珃薞";
                  if (var2.equals("珍藏")) {
                     var4 = this;
                     this.bt = new BigDecimal(20);
                  } else {
                     var10001 = "贔躲";
                     if (var2.equals("贴身")) {
                        var4 = this;
                        this.bt = new BigDecimal(15);
                     } else {
                        var10001 = "抄珸";
                        if (var2.equals("把玩")) {
                           this.bt = new BigDecimal(10);
                           var4 = this;
                        } else {
                           this.bt = new BigDecimal(30);
                           var4 = this;
                        }
                     }
                  }
               }
            }
         }

         Class49.b(var4.bx[1], this.bt.longValue());
      }

      this.bb(var1);

      int var3;
      for (int var5 = var3 = 0; var5 < this.bz.length; var5 = var3) {
         this.bz[var3++].l();
      }

      this.zc().b(this.lj());
   }

   // $VF: synthetic method
   static boolean az(Class1 var0) {
      return var0.bv;
   }

   public void ba(QualityClBean var1) {
      this.bu = null;
      Goodstable var2;
      if ((var2 = (Goodstable)this.bw.jx()) != null) {
         var2 = this.yx().getGood(var2.getRgid());
      }

      if (var2 != null && var2.getRgid().compareTo(var1.getRgid()) == 0) {
         if (var1.getType() == -4) {
            String var11 = var2.getValue();
            String var10002 = "|e";
            var2.setValue(GoodType.e(var11.split("\\|"), 3, var1.getNewAttr()));
            Class23 var6;
            Class57 var7;
            if ((var7 = (Class57)this.zc().l(61)) != null && var7.dx() == 3 && (var6 = var7.xv()).dx() == 1) {
               var6.wn().e();
            }

            this.bb(var2);
         } else {
            String var10000 = var1.getNewAttr();
            String var10001 = "Rw";
            String[] var3 = var10000.split("\\&");

            int var4;
            for (int var8 = var4 = 4; var8 < 6; var8 = ++var4) {
               if (var4 < var3.length) {
                  var10000 = var3[var4];
                  var10001 = "|$";
                  String[] var5 = var10000.split("\\=");
                  this.o[11 + 2 * (var4 - 4)].setText(var5[0]);
                  this.o[11 + 2 * (var4 - 4) + 1].setText(var5[1] + com.xy.a.Class48.qb(var5[0]));
               } else {
                  this.o[11 + 2 * (var4 - 4)].setText(null);
                  this.o[11 + 2 * (var4 - 4) + 1].setText(null);
               }
            }

            this.bu = var1;
         }
      }
   }

   public void bb(Goodstable var1) {
      int var2;
      for (int var10000 = var2 = 7; var10000 < this.o.length; var10000 = var2) {
         this.o[var2++].setText(null);
      }

      String var6;
      if ((var6 = GoodType.getExtra(var1.getValue(), GoodType.Extras[3])) != null) {
         String var9 = "|?";
         String[] var3 = var6.split("\\&");

         int var4;
         for (int var7 = var4 = 4; var7 < var3.length; var7 = ++var4) {
            String var8 = var3[var4];
            var9 = "Rl";
            String[] var5 = var8.split("\\=");
            this.o[7 + 2 * (var4 - 4)].setText(var5[0]);
            this.o[7 + 2 * (var4 - 4) + 1].setText(var5[1] + com.xy.a.Class48.qb(var5[0]));
            if (var4 == 5) {
               return;
            }
         }
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] bc(Class1 var0) {
      return var0.ar;
   }
}
