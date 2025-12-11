package com.xy.a.w;

import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.i.Class18;
import com.xy.i.Class20;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class0 extends com.xy.q.Class30 {
   private com.xy.i.Class20[] w;
   private JList<Class15> x;
   private int z;
   private int aa;
   private JScrollPane ab;
   private com.xy.q.Class14 ac;
   private JLabel ad;
   private int ae;
   private com.xy.w.Class18 af;
   private com.xy.i.Class20[] ag;
   private int ah;

   // $VF: synthetic method
   static int u(Class0 var0) {
      return var0.ah;
   }

   // $VF: synthetic method
   static int v(Class0 var0) {
      return var0.z;
   }

   // $VF: synthetic method
   static void w(Class0 var0, int var1) {
      var0.z = var1;
   }

   public Class0(GameView var1) {
      super(54, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0004\u001aX\u001dXHY\t\u0019\u001e";
      this.ah = 0;
      this.ae = 30;
      this.aa = 0;
      this.yy(-1, 0, 432, 395, com.xy.q.Class30.agh);
      com.xy.w.Class9 var13 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "帷洞宑抄祇";
      this.yu(var13, "帮派守护神");
      this.w = new com.xy.i.Class20[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.w.length; var10000 = var2) {
         com.xy.i.Class20[] var6 = this.w;
         var10004 = "\n\u0014V\u0012VBJY\t\u0019\u001e";
         int var10006 = 341 + var2;
         String var21;
         Class0 var10010;
         if (var2 == 0) {
            var21 = "尯戉俎炥";
            var21 = "小成修炼";
            var10010 = this;
         } else if (var2 == 1) {
            var21 = "奐扩侙烅";
            var21 = "大成修炼";
            var10010 = this;
         } else {
            var21 = "";
            var10010 = this;
         }

         Class20 var10002 = new Class20("sc/e/53.png", 2, var10006, Class49.ck, null, var21, var10010);
         var6[var2] = var10002;
         this.w[var2].setOffsetTexts(Class49.bo);
         this.w[var2].setBounds(53 + 111 * var2, 35, 109, 24);
         this.add(this.w[var2++]);
      }

      int var7 = 0;
      this.x = new JList<>();
      this.x.setOpaque(false);
      this.x.removeAll();

      for (int var4 = 0; var7 < 18; var7 = var4) {
         Class15 var3 = new Class15(this);
         var3.setBounds(0, var4 * 34, 384, 34);
         var4++;
         this.x.add(var3);
      }

      this.x.setPreferredSize(new Dimension(384, 680));
      this.ab = com.xy.q.Class1.g(53, 60, 350, 278, this.x, 30);
      this.add(this.ab);
      this.ag = new com.xy.i.Class20[4];

      for (int var8 = var2 = 0; var8 < this.ag.length; var8 = var2) {
         com.xy.i.Class20[] var9 = this.ag;
         if (var2 == 3) {
            var10004 = "Sz\u000f|\u000f.\u000eiN~";
            var10004 = "sc/e/7.png";
         } else {
            var10004 = "\u0004\u001aX\u001cXOY\t\u0019\u001e";
            var10004 = "sc/e/6.png";
         }

         int var19 = 343 + var2;
         Font var10007 = var2 == 3 ? Class49.ch : Class49.bz;
         String var24;
         Class0 var28;
         if (var2 == 0) {
            var24 = "俎炥";
            var24 = "修炼";
            var28 = this;
         } else if (var2 == 1) {
            var24 = "浠烀";
            var24 = "洗点";
            var28 = this;
         } else if (var2 == 2) {
            var24 = "共捻";
            var24 = "兑换";
            var28 = this;
         } else if (var2 == 3) {
            var24 = "砙寣";
            var24 = "确定";
            var28 = this;
         } else {
            var24 = "";
            var28 = this;
         }

         com.xy.i.Class20 var10001 = new com.xy.i.Class20(var10004, 1, var19, var10007, null, var24, var28);
         var9[var2] = var10001;
         Class0 var10;
         if (var2 == 3) {
            var10 = this;
            this.ag[var2].setBounds(342, 348, 59, 25);
            this.ag[var2].setForeground(Color.black);
         } else {
            var10 = this;
            this.ag[var2].setBounds(171 + 40 * var2, 351, 34, 18);
         }

         var10.add(this.ag[var2++]);
      }

      this.ac = com.xy.q.Class1.i(0, 0, 0, 0, 0, Color.white, Class49.n);
      String var10005 = "jC6D6\u0011.\u000eiN~";
      this.ac.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.ac.setHorizontalAlignment(10);
      this.ac.setBounds(122, 352, 83, 17);
      this.add(this.ac);
      String var29 = "T\u001aGIGIGI";
      this.ad = com.xy.q.Class1.f(53, 352, 70, 17, 10, Class49.c("#c000000"), Class49.ch);
      var10004 = "俎炥筩纾";
      this.ad.setText("修炼等级");
      this.add(this.ad);
      this.af = new com.xy.w.Class18();
      String var20 = "\n\u0014V\u0013VEMY\t\u0019\u001e";
      this.af.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.af.setBounds(53, 59, 350, 280);
      this.add(this.af);
   }

   public void x(boolean var1, Object var2) {
      Class15 var3 = (Class15)var2;
      if (var1) {
         if (this.z <= 0) {
            String var5 = "剉佀炙敩中趪";
            this.afx._do("剩余点数不足");
            return;
         }

         int var4 = this.ah == 2 ? 30 : 20;
         if (Class15.no(var3) >= var4) {
            String var10001 = "乴厘亜出壧勗烀攇仿";
            this.afx._do("不可以再增加点数了");
            return;
         }

         Class15.nn(var3, Class15.no(var3) + 1);
         var3.t();
         this.z--;
         if (Class15.no(var3) > Class15.nm(var3)) {
            Class15.np(var3).setForeground(Color.GREEN);
            Class15.ns(var3).setForeground(Color.GREEN);
            return;
         }
      } else {
         if (Class15.no(var3) <= Class15.nm(var3)) {
            String var6 = "且叏仼冭凖就炠敐亟";
            this.afx._do("不可以再减少点数了");
            return;
         }

         Class15.nn(var3, Class15.no(var3) - 1);
         var3.t();
         this.z++;
         if (Class15.no(var3) <= Class15.nm(var3)) {
            Class15.np(var3).setForeground(Color.WHITE);
            Class15.ns(var3).setForeground(Color.WHITE);
         }
      }
   }

   public void y(int var1) {
      this.ah = var1;
      this.ae = var1 == 2 ? 60 : 30;
      this.w[0].setKeep(var1 == 1);
      this.w[1].setKeep(var1 == 2);
      this.h();
   }

   public void h() {
      LoginResult var1 = this.yx().getLoginResult();
      this.z = 0;
      if (this.ah == 1) {
         String var21 = "A";
         String[] var9 = var1.getResistance("X");
         String var18 = "!";
         int var10 = var1.getExtraPointInt("X");
         this.aa = var10;
         int var11 = 0;

         int var12;
         for (int var15 = var12 = 0; var15 < 13; var15 = ++var12) {
            if (!this.za().l(2, 3) || var12 != 0 && var12 != 1 && var12 != 2) {
               int var13;
               if ((var13 = this.x.getComponentCount()) >= 13) {
                  ((Class15)this.x.getComponent(var11)).nt(var12, var9, this);
               } else {
                  Class15 var14 = new Class15(this);
                  var14.setBounds(0, var13 * 34, 384, 34);
                  this.x.add(var14);
               }

               var11++;
            }
         }

         this.x.setPreferredSize(new Dimension(384, 34 * var11));
         this.z = var10 - this.z;
         com.xy.q.Class14 var16 = this.ac;
         StringBuilder var19 = new StringBuilder(String.valueOf(var10));
         var21 = "6\u0013)";
         var16.setText(var19.append("/30").toString());
      } else {
         if (this.ah == 2) {
            String var10002 = "=";
            String[] var2 = var1.getResistance("D");
            String var10001 = "]";
            int var3 = var1.getExtraPointInt("D");
            this.aa = var3;
            int var4 = 0;

            int var5;
            for (int var10000 = var5 = 0; var10000 < 18; var10000 = ++var5) {
               int var6 = var5 + 13;
               if (!this.za().l(2, 3) || var6 != 23 && var6 != 24 && var6 != 25 && var6 != 28) {
                  int var7;
                  if ((var7 = this.x.getComponentCount()) >= 18) {
                     ((Class15)this.x.getComponent(var4)).nt(var5 + 13, var2, this);
                  } else {
                     Class15 var8 = new Class15(this);
                     var8.setBounds(0, var7 * 34, 384, 34);
                     this.x.add(var8);
                  }

                  var4++;
               }
            }

            this.z = var3 - this.z;
            com.xy.q.Class14 var17 = this.ac;
            StringBuilder var20 = new StringBuilder(String.valueOf(var3));
            String var10003 = "VAI";
            var17.setText(var20.append("/60").toString());
            this.x.setPreferredSize(new Dimension(384, 34 * var4));
         }
      }
   }

   public void g(int var1) {
      if (var1 == 343) {
         ((Class28)this.zc().j(106)).g(this.ah);
         this.zc().b(106);
      } else if (var1 == 344) {
         LoginResult var8 = this.yx().getLoginResult();
         String var15;
         if (this.ah == 1) {
            var15 = "A";
            var15 = "X";
         } else {
            var15 = "=";
            var15 = "D";
         }

         if (var8.getResistance(var15) == null) {
            var15 = "佹迸沸劀炠怮乑洷炠";
            this.afx._do("你还没加点怎么洗点");
         } else {
            GameView var9 = this.afx;
            StringBuilder var10004 = new StringBuilder(String.valueOf(7));
            String var20;
            if (this.ah == 1) {
               var20 = "!";
               var20 = "X";
            } else {
               var20 = "]";
               var20 = "D";
            }

            String var19 = var10004.append(var20).toString();
            String var10007 = "Z 砗寭觸苆LG.钁九醺缗T>";
            StringBuilder var22 = new StringBuilder("#W确定要花50W银两重置#G");
            String var24;
            if (this.ah == 1) {
               var24 = "尯戉俎炥";
               var24 = "小成修炼";
            } else {
               var24 = "奐扩侙烅";
               var24 = "大成修炼";
            }

            StringBuilder var23 = var22.append(var24);
            var24 = "＆";
            ConfirmBean var17 = new ConfirmBean(16, var19, var23.append("？").toString());
            var9.dm(var17);
         }
      } else {
         if (var1 != 345 && var1 == 346) {
            StringBuffer var2 = new StringBuffer();
            var2.append(7);
            String var10;
            if (this.ah == 1) {
               var10 = "!";
               var10 = "X";
            } else {
               var10 = "]";
               var10 = "D";
            }

            var2.append(var10);
            boolean var3 = true;
            int var4 = 0;
            int var5 = this.ah == 1 ? (this.za().l(2, 3) ? 10 : 13) : (this.za().l(2, 3) ? 14 : 18);

            for (int var10000 = var4; var10000 < var5; var10000 = ++var4) {
               Class15 var6;
               if (Class15.no(var6 = (Class15)this.x.getComponent(var4)) != 0) {
                  if (Class15.nm(var6) != Class15.no(var6)) {
                     var3 = false;
                  }

                  if (var2.length() > 2) {
                     var10 = "Z";
                     var2.append("#");
                  }

                  var2.append(Class15.nr(var6).getText());
                  String var10002 = "$";
                  var2.append("=");
                  var2.append(var6.jg());
               }
            }

            if (var3) {
               var10 = "伙辯杓侙敀";
               this.afx._do("你还未修改");
               return;
            }

            String var7 = Agreement.getSendTextAES("rolechange", var2.toString());
            this.za().k(var7);
         }
      }
   }
}
