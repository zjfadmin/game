package com.xy;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.LoginResult;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JPanel;

public class Class74 extends JPanel {
   private int gc;
   private Class345 nz;
   private Class436 et;
   private RichLabel q;
   private RichLabel bv;
   private <undefinedtype>[] oa;
   private ChongjipackBean ob;
   private Class243 oc;

   public void fx(String var1) {
      this.q.setTextSize(var1, 19195 & 13708);
      this.q.setBounds(11135 & 21902, 94 & 43, this.q.getWidth(), this.q.getHeight());
   }

   public ChongjipackBean hz() {
      return this.ob;
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      String[] var1 = "4=1|2,2|3,3|4|5|6|7|9|10|11|12|13|14&&1=1|2|3|4|5|6&&6=1|2|3|4|5|6".split("&&");
      System.out.println(ia(var1, --4, 4 ^ 5));
      System.out.println(ia(var1, --4, 1 ^ 3));
      System.out.println(ia(var1, --4, --3));
      System.out.println(ia(var1, --4, --4));
   }

   public void cc() {
      if (this.ob != null) {
         if (this.nz.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), this.gc) < this.gc) {
            this.nz.aej.f("你的背包不够");
         } else {
            String var1 = Agreement.getSendTextAES("Chongjipacksure", this.ob.getPacktype() + "|" + this.ob.getPackgradetype());
            this.nz.uw().d(var1);
         }
      }
   }

   public static int ia(String[] var0, int var1, int var2) {
      if (var0 == null) {
         return 2 & 5;
      } else {
         String var7 = var1 + "=";

         int var5;
         for(int var10000 = var5 = 2 & 5; var10000 < var0.length; var10000 = var5) {
            if (var0[var5].startsWith(var7)) {
               int var4 = var7.length();
               int var3 = 3 ^ 3;
               int var6 = 5 >> 3;

               for(var10000 = var3; var10000 < var0[var5].length(); var10000 = var3) {
                  if ((var3 = var0[var5].indexOf("|", var4 + --1)) == -4 >> 2) {
                     var3 = var0[var5].length();
                  }

                  if ((var6 = var0[var5].indexOf(",", var4 + (4 ^ 5))) == -4 >> 2 || var6 > var3) {
                     var6 = var3;
                  }

                  if (Class394.b(var0[var5], var4, var6) == var2) {
                     if (var6 < var3) {
                        return Class394.b(var0[var5], var6 + (4 ^ 5), var3);
                     }

                     return 1;
                  }

                  var4 = var3 + 1;
               }

               return 0;
            }

            ++var5;
         }

         return 0;
      }
   }

   public static boolean ib(String[] var0, int var1, int var2) {
      if (var0 == null) {
         return (boolean)(3 & 4);
      } else {
         String var6 = var1 + "=";

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var0.length; var10000 = var3) {
            if (var0[var3].startsWith(var6)) {
               int var4 = var6.length();

               int var5;
               for(var10000 = var5 = 3 ^ 3; var10000 < var0[var3].length(); var10000 = var5) {
                  if ((var5 = var0[var3].indexOf("|", var4 + --1)) == -4 >> 2) {
                     var5 = var0[var3].length();
                  }

                  if (Class394.b(var0[var3], var4, var5) == var2) {
                     return true;
                  }

                  var4 = var5 + 1;
               }

               return false;
            }

            ++var3;
         }

         return false;
      }
   }

   public void q() {
      int var10002 = 3 & 4;
      int var10000 = 3 & 4;
      this.oc.setVisible((boolean)var10002);

      for(int var1 = var10002; var10000 < this.oa.length; var10000 = var1) {
         <undefinedtype> var2 = this.oa[var1];
         ++var1;
         var2.c(3 & 4, (Object)null);
      }

   }

   public Class74(Class345 var1) {
      int var10001 = --5;
      int var10005 = 3 ^ 3;
      super();
      this.nz = var1;
      this.setPreferredSize(new Dimension(25551 & 7679, 127 & 61));
      this.setOpaque((boolean)var10005);
      this.setLayout((LayoutManager)null);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.oa = var3;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.oa.length; var10000 = var2) {
         this.oa[var2] = new Class44(var1) {
            private Class245 cv;

            public {
               int var10004 = 95 & 59;
               this.cv = Class133.a(var10004, 4 ^ 5, 116 & 27, 116 & 27, 2 & 5, Color.GREEN, Class681.r);
               this.cv.eq(Class511.q("sc/b/S24.png", --3, --3, --3, --3, (boolean)(2 & 5)));
               this.add(this.cv);
            }
         };
         this.oa[var2].ad(Class44.art);
         this.oa[var2].fw("sc/d/4.png");
         this.oa[var2].setBounds((62 & 79) + var2 * (55 & 123), 91 & 45, 63 & 110, 63 & 110);
         this.add(this.oa[var2++]);
      }

      this.oc = new Class243("sc/e/31.png", 5 >> 2, 3 >> 2, Class681.ak, Class681.c, "领取", var1);
      this.oc.nw(this);
      this.oc.setBounds(16379 & 16748, 125 & 19, 127 & 79, 25 & 127);
      this.add(this.oc);
      this.q = new RichLabel("1级奖励", Class681.ce);
      this.bv = new RichLabel("#R暂不可领取", Class681.ce);
      this.q.setTextSize("1级奖励", 25496 & 7407);
      this.bv.setTextSize("#R暂不可领取", 3263 & 29640);
      this.q.setBounds(25503 & 7534, 31 & 106, this.q.getWidth(), this.q.getHeight());
      this.bv.setBounds(19231 & 13806, 95 & 62, this.bv.getWidth(), this.bv.getHeight());
      this.add(this.q);
      this.add(this.bv);
      this.et = new Class436(Class511.q("sc/d/66.png", 30, 3 & 5, 30, 3 >> 1, (boolean)(2 & 5)));
      this.et.setBounds(15, 59, 433, 5 >> 1);
      this.add(this.et);
   }

   public void ic(ChongjipackBean var1, int var2) {
      ChongjipackBean var10000 = this.ob = var1;
      this.q();
      if (var10000 != null) {
         List var7 = ChongjipackBean.getGoodsImpactGrade(var1.getPackgoods());
         Class603 var4 = this.nz.vc();
         LoginResult var5 = this.nz.vd().getLoginResult();
         int var6 = 5 >> 3;
         int var3;
         int var10;
         Class74 var11;
         if (Class224.j(var5.getGrade(), var1.getPackgrade())) {
            var3 = -4 >> 2;
            if (var2 == --1) {
               var10 = var3 = --4;
            } else {
               if (var2 - (3 & 5) == var5.getLowOrHihtpack()) {
                  var3 = --5;
               }

               var10 = var3;
            }

            if (var10 != -1) {
               String[] var8 = null;
               if (var5.getVipget() != null) {
                  var8 = var5.getVipget().split("&&");
               }

               if (ib(var8, var3, var1.getPackgradetype())) {
                  var11 = this;
                  this.bv.setText("#G已领取");
               } else {
                  var6 = 1;
                  var11 = this;
                  this.bv.setText("#Y未领取");
               }
            } else {
               var11 = this;
               this.bv.setText("#R暂不可领取");
            }
         } else {
            var11 = this;
            this.bv.setText("#R暂不可领取");
         }

         var11.gc = 0;

         for(var10 = var3 = 5 >> 3; var10 < var7.size() && var3 < this.oa.length; var10 = var3) {
            Goodstable var9 = var4.n(((XXGDBean)var7.get(var3)).getId());
            this.oa[var3].cv.setText(String.valueOf(((XXGDBean)var7.get(var3)).getSum()));
            this.oa[var3].c(--1, var9);
            int var10001 = this.gc + (!GoodType.ag(var9.getType()) ? ((XXGDBean)var7.get(var3)).getSum() : 1);
            ++var3;
            this.gc = var10001;
         }

         this.oc.setVisible((boolean)(var6 == (4 ^ 5) ? --1 : 0));
         this.bv.setBounds(12175 & 20862, 95 & 62, this.bv.getWidth(), this.bv.getHeight());
         this.fx(var1.getPackgrade());
      }
   }
}
