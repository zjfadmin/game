package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.bean.PayvipBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class Class106 extends com.xy.q.Class30 {
   private static Image dd;
   private com.xy.w.Class18[] de;
   private int cn;
   private List<Class113> rk;
   private JComponent it;
   int ae;
   private JScrollPane jo;
   private List<Image> iv;
   private List<PayvipBean> jr;

   public void f() {
      String var1 = Agreement.getSendTextAES("Getvipgradepack", null);
      this.za().k(var1);
   }

   public void ajh(JComponent var1) {
      Class113 var2 = (Class113)var1;
      String var10003 = "G";
      String var3 = Agreement.getSendTextAES("Vipgradesure", "v" + Class113.anm(var2).getGrade());
      this.za().k(var3);
   }

   public void fm(List<PayvipBean> var1) {
      this.jr = var1;
      LoginResult var3;
      BigDecimal var4 = (var3 = this.yx().getLoginResult()).getPaysum();
      int var5 = 0;
      Class106 var14;
      if (this.jr.size() == 0) {
         int var6;
         for (int var10000 = var6 = 0; var10000 < this.rk.size(); var10000 = var6) {
            Object var13 = this.rk.get(var6);
            var6++;
            ((Class113)var13).qx(null);
         }

         var14 = this;
      } else {
         String var11 = var3.getVipget();
         String[] var7 = null;
         if (var11 != null) {
            String var10001 = "8\u0003";
            var7 = var11.split("&&");
         }

         int var8;
         for (int var15 = var8 = this.rk.size(); var15 < this.jr.size(); var15 = var8) {
            var8++;
            this.rk.add(new Class113(this));
         }

         for (int var16 = var8 = 0; var16 < this.rk.size(); var16 = ++var8) {
            if (var8 > this.jr.size()) {
               this.rk.get(var8).qx(null);
            } else if (var8 < this.jr.size()) {
               PayvipBean var9 = this.jr.get(var8);
               if (var4.compareTo(new BigDecimal(this.jr.get(var8).getPaynum())) >= 0) {
                  this.ae = this.ae > var9.getGrade() ? this.ae : var9.getGrade();
               }

               var5 = var5 > var9.getGrade() ? var5 : var9.getGrade();
               Class113 var10 = this.rk.get(var8);
               var10.qx(var9);
               if (Class71.aba(var7, 1, var9.getGrade())) {
                  com.xy.i.Class16 var17 = Class113.anl(var10);
                  String var10002 = "B\u000e\u001e\b\u001eX\u0004CA\u0003V";
                  var17.setBtn(-1, "sc/e/55.png");
               } else {
                  com.xy.i.Class16 var18 = Class113.anl(var10);
                  String var19 = "mF1@1\u00120UpB";
                  var18.setBtn(1, "sc/e/7.png");
               }
            }
         }

         var14 = this;
         this.cn = this.amk(var5, var4);
      }

      var14.h();
   }

   public Class106(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      int var10000 = 0;
      this.ae = 0;
      this.cn = 0;
      this.yy(0, 0, 682, 475, com.xy.q.Class30.agf);
      this.iv = new ArrayList<>();

      for (int var2 = 0; var10000 < 10; var10000 = var2) {
         List var4 = this.iv;
         String var10003 = "B\u000e\u001e\u0004E\b\\Bb";
         StringBuilder var10001 = new StringBuilder("sc/item/S").append(var2 + 30).append(".png");
         var2++;
         var4.add(com.xy.w.Class16.c(var10001.toString()));
      }

      this.rk = new ArrayList<>();
      this.it = new Class93(this);
      this.jo = com.xy.q.Class1.g(58, 207, 591, 190, this.it, 20);
      this.add(this.jo);
      this.de = new com.xy.w.Class18[3];

      int var3;
      for (int var5 = var3 = 0; var5 < this.de.length; var5 = var3) {
         this.de[var3] = new com.xy.w.Class18();
         Class106 var6;
         if (var3 == 0) {
            var6 = this;
            com.xy.w.Class18 var10002 = this.de[var3];
            String var11 = "V}\nz\n)\u00150UpB";
            var10002.dp("sc/d/70.png");
            this.de[var3].setBounds(61, 60, 583, 110);
         } else if (var3 == 1) {
            var6 = this;
            com.xy.w.Class18 var8 = this.de[var3];
            String var12 = "B\u000e\u001e\t\u001e^\u0007CA\u0003V";
            var8.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.de[var3].setBounds(58, 57, 591, 57);
         } else {
            if (var3 == 2) {
               com.xy.w.Class18 var7 = this.de[var3];
               String var9 = "V}\nz\n/\u00120UpB";
               var7.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
               this.de[var3].setBounds(59, 187, 588, 7);
            }

            var6 = this;
         }

         var6.add(this.de[var3++]);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (dd == null) {
         String var10000 = "B\u000e\u001e\u000f\u001e>\u0007CA\u0003V";
         dd = com.xy.w.Class16.c("sc/b/S6.png");
      }

      if (this.cn > 0) {
         var1.drawImage(dd, 60, 188, this.cn, 5, this);
      }

      int var2;
      for (int var3 = var2 = 0; var3 < this.iv.size(); var3 = var2) {
         Image var10001 = this.iv.get(var2);
         int var10002 = 68 + 63 * var2;
         var2++;
         var1.drawImage(var10001, var10002, 184, 30, 25, this);
      }
   }

   public void h() {
      this.it.removeAll();
      this.it.repaint();
      int var1 = 0;

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.rk.size(); var10000 = ++var2) {
         Class113 var3;
         if (Class113.anm(var3 = this.rk.get(var2)) != null) {
            int var10001 = 0 + var1 % 4 * 152;
            int var10002 = var1 / 4 * 190;
            var1++;
            var3.setBounds(var10001, var10002, 115, 165);
            this.it.add(var3);
         }
      }

      this.it.setPreferredSize(new Dimension(565, 190 * (var1 % 4 == 0 ? var1 / 4 : var1 / 4 + 1)));
      int var5 = 0;
      this.jo.updateUI();
      this.jo.invalidate();
      this.jo.validate();
      this.jo.repaint();

      for (int var4 = 0; var5 < this.iv.size(); var5 = ++var4) {
         if (this.ae >= var4 + 1) {
            String var10003 = "B\u000e\u001e\u0004E\b\\Bb";
            this.iv.set(var4, com.xy.w.Class16.c("sc/item/S" + (var4 + 20) + ".png"));
         } else {
            String var6 = "V}\nwQ{H1v";
            this.iv.set(var4, com.xy.w.Class16.c("sc/item/S" + (var4 + 30) + ".png"));
         }
      }
   }

   public int amk(Integer var1, BigDecimal var2) {
      if (var1 == 0) {
         return this.cn = 0;
      } else {
         BigDecimal var3 = this.aml(var2).divide(new BigDecimal(var1), 3, 4);
         BigDecimal var4;
         return this.cn = (var4 = var3.multiply(new BigDecimal(587)).setScale(0, 1)).intValue() > 587 ? 587 : var4.intValue();
      }
   }

   public BigDecimal aml(BigDecimal var1) {
      BigDecimal var2 = new BigDecimal(0);
      if (var1.compareTo(new BigDecimal(30)) < 0) {
         return new BigDecimal(0);
      } else if (var1.compareTo(new BigDecimal(100)) < 0) {
         return new BigDecimal(1);
      } else if (var1.compareTo(new BigDecimal(500)) < 0) {
         return new BigDecimal(2);
      } else if (var1.compareTo(new BigDecimal(1000)) < 0) {
         return new BigDecimal(3);
      } else if (var1.compareTo(new BigDecimal(2000)) < 0) {
         return new BigDecimal(4);
      } else if (var1.compareTo(new BigDecimal(5000)) < 0) {
         return new BigDecimal(5);
      } else if (var1.compareTo(new BigDecimal(10000)) < 0) {
         return new BigDecimal(6);
      } else if (var1.compareTo(new BigDecimal(18000)) < 0) {
         return new BigDecimal(7);
      } else if (var1.compareTo(new BigDecimal(30000)) < 0) {
         return new BigDecimal(8);
      } else if (var1.compareTo(new BigDecimal(50000)) < 0) {
         return new BigDecimal(9);
      } else {
         if (var1.compareTo(new BigDecimal(50000)) >= 0) {
            var2 = new BigDecimal(10);
         }

         return var2;
      }
   }
}
