package com.xy.formula;

import com.xy.hd;
import com.xy.entity.Mount;
import com.xy.readbean.Goodstable;

public class BaseMountSkill {
   private BaseQl[] bases;
   private String name;
   private double bx;
   private int b2;
   private int bt;
   private int b3;
   private int b1;

   public String getText() {
      if (this.name.equals("夺命追魂")) {
         return "#W增加致命、连击和SP#r【适合】力量、灵性高的坐骑学习#r【熟练度】{熟练度}#r#G增加SP#R{数值}%#G,增加命中率#R{数值2}%#G,增加连击率#R{数值3}%#G,增加致命几率#R{数值4}%#G";
      } else if (this.name.equals("破釜沉舟")) {
         return "#W增加狂暴、AP和忽视物理程度#r【适合】力量高的坐骑学习#r【熟练度】{熟练度}#r#G增加AP#R{数值}%#G,增加狂暴几率#R{数值2}%#G,忽视防御程度#R{数值3}%#G,忽视防御几率#R{数值4}%#G";
      } else if (this.name.equals("后发制人")) {
         return "#W增加狂暴、致命和HP度#r【适合】力量、根骨高的坐骑学习#r【熟练度】{熟练度}#r#G增加HP最大值#R{数值}%#G,增加狂暴几率#R{数值2}%#G,增加致命几率#R{数值3}%#G";
      } else if (this.name.equals("天雷怒火")) {
         return "#W增加雷、火、鬼火法术威力和雷、火、鬼火抗性和MP#r【适合】灵性、根骨高的坐骑学习#r【熟练度】{熟练度}#r#G增加MP最大值#R{数值}%#G,加强雷#R{数值2}%#G,加强火#R{数值2}%#G,加强鬼火#R{数值2}%#G,抗雷#R{数值5}%#G,抗火#R{数值5}%#G,抗鬼火#R{数值5}%#G";
      } else if (this.name.equals("兴风作浪")) {
         return "#W增加风、水、鬼火法术威力和风、水、鬼火抗性和MP#r【适合】灵性、根骨高的坐骑学习#r【熟练度】{熟练度}#r#G增加MP最大值#R{数值}%#G,加强风#R{数值2}%#G,加强水#R{数值2}%#G,加强鬼火#R{数值2}%#G,抗风#R{数值5}%#G,抗水#R{数值5}%#G,抗鬼火#R{数值5}%#G";
      } else if (this.name.equals("万劫不复")) {
         return "#W增加仙族四系法术、鬼火法术威力和MP度#r【适合】灵性高的坐骑学习#r【熟练度】{熟练度}#r#G增加MP最大值#R{数值}%#G,加强火#R{数值2}%#G,加强风#R{数值2}%#G,加强雷#R{数值2}%#G,加强水#R{数值2}%#G,加强鬼火#R{数值3}%#G";
      } else if (this.name.equals("金身不坏")) {
         return "#W增加物理、震慑、毒、三尸虫抗性和HP#r【适合】根骨、力量高的坐骑学习#r【熟练度】{熟练度}#r#G增加HP最大值#R{数值}%#G,抗物理#R{数值2}%#G,抗震慑#R{数值3}%#G,抗毒#R{数值4}%#G,抗三尸虫#R{数值5}#G";
      } else if (this.name.equals("天神护体")) {
         return "#W增加仙族四系法术、鬼火抗性和SP#r【适合】根骨高的坐骑学习#r【熟练度】{熟练度}#r#G增加SP#R{数值}%#G,抗火#R{数值2}%#G,抗水#R{数值2}%#G,抗雷#R{数值2}%#G,抗风#R{数值2}%#G,抗鬼火#R{数值3}%#G";
      } else if (this.name.equals("心如止水")) {
         return "#W增加混乱、昏睡、封印、遗忘抗性和HP#r【适合】根骨、灵性高的坐骑学习#r【熟练度】{熟练度}#r#G增加HP最大值#R{数值}%#G,抗混乱#R{数值2}%#G,抗昏睡#R{数值2}%#G,抗封印#R{数值2}%#G,抗遗忘#R{数值3}%#G";
      } else if (this.name.equals("反客为主")) {
         return "#W增加反击率,触发反击时增加忽视防御几率及程度和AP#r【适合】力量、灵性高的坐骑学习#r【熟练度】{熟练度}#r#G增加AP#R{数值}%#G,增加反击率#R{数值2}%#G,触发反击时增加忽视防御几率#R{数值3}%#G,忽视防御程度#R{数值4}%";
      } else if (this.name.equals("反治其身")) {
         return "#W增加躲闪率、反震率、反震程度和HP#r【适合】力量、根骨高的坐骑学习#r【熟练度】{熟练度}#r#G增加HP最大值#R{数值}%#G,增加躲闪率#R{数值2}%#G,增加反震率#R{数值3}%#G,增加反震程度#R{数值4}%#G";
      } else if (this.name.equals("得心应手")) {
         return "#W增加忽视仙法鬼火抗性、仙法鬼火狂暴几率及程度和MP#r【适合】灵性、根骨高的坐骑学习#r【熟练度】{熟练度}#r#G增加MP最大值#R{数值}%#G,增加忽视仙法鬼火#R{数值2}%#G,增加仙法鬼火狂暴#R{数值4}%#G,加仙法鬼火狂暴程度#R{数值6}%#G";
      } else if (this.name.equals("山外青山")) {
         return "#W增加强克效果和SP#r【适合】灵性、力量高的坐骑学习#r【熟练度】{熟练度}#r#G增加SP#R{数值}%#G,增加强克效果#R{数值2}%#G";
      } else if (this.name.equals("视险如夷")) {
         return "#W增加抵御强克效果和HP#r【适合】根骨、灵性高的坐骑学习#r【熟练度】{熟练度}#r#G增加HP最大值#R{数值}%#G,增加抵御强克效果#R{数值2}%#G";
      } else {
         return this.name.equals("游刃有余") ? "#W增加法术躲闪率、随机抗灵宝伤害和SP#r【适合】根骨、力量高的坐骑学习#r【熟练度】{熟练度}#r#G增加SP#R{数值}%#G,增加法术躲闪率#R{数值2}%#G,增加随机抗灵宝伤害#R{数值3}#G" : null;
      }
   }

   public int getB3() {
      return this.b3;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public BaseMountSkill() {
   }

   public String getText(Mount var1) {
      int var2;
      if ((var2 = var1.getMountlvl()) > (117 & 110)) {
         var2 -= 100;
      }

      int var7 = (int)Math.floor((double)((float)var1.getSpri() + (float)var2 / 10.0F * (float)var1.getSpri() / 2.0F));
      int var4 = (int)Math.floor((double)((float)var1.getPower() + (float)var2 / 10.0F * (float)var1.getPower() / 2.0F));
      var2 = (int)Math.floor((double)((float)var1.getBone() + (float)var2 / 10.0F * (float)var1.getBone() / 2.0F));
      int var3;
      int var5;
      int var6;
      if ((var6 = (var5 = var1.getMountCZ()) >> (118 & 15)) > 0) {
         for(int var10000 = var3 = 2 & 5; var10000 < 3; var10000 = var3) {
            if ((var5 >> --2 * var3 & --1) != 0) {
               int var8 = (var5 >> --2 * var3 + (5 >> 2) & --1) == 3 >> 1 ? 2 ^ 3 : 0;
               if (var3 == 0) {
                  var7 += var8 != 0 ? var6 : -var6;
               } else if (var3 == (2 ^ 3)) {
                  var4 += var8 != 0 ? var6 : -var6;
               } else if (var3 == 5 >> 1) {
                  var2 += var8 != 0 ? var6 : -var6;
               }
            }

            ++var3;
         }
      }

      return this.getText(var7, var4, var2, var1.getProficiency(), var1.getMountid());
   }

   public void a(String var1) {
      if (hd.o(var1)) {
         this.b3 = this.b2 = 5 >> 3;
         this.bases = null;
      } else {
         int var10001 = hd.f(',', var1);
         this.b3 = this.b2 = 3 >> 2;
         BaseQl[] var10 = new BaseQl[var10001 - (3 >> 1)];
         boolean var10003 = true;
         this.bases = var10;
         int var4 = 5 >> 3;
         int var3 = 3 & 4;
         int var2 = 3 & 4;
         int var5 = 2 & 5;

         for(int var10000 = var2; var10000 < var1.length(); var10000 = var2) {
            if ((var2 = var1.indexOf(",", var3 + --1)) == -4 >> 2) {
               var2 = var1.length();
            }

            label34: {
               if (var4 == 0) {
                  this.b2 = hd.b(var1, var3, var2);
                  if (this.b2 < 0) {
                     var10000 = var2;
                     int var10002 = --1;
                     this.b2 = -this.b2;
                     this.bt = var10002;
                     break label34;
                  }
               } else {
                  if (var4 == (2 ^ 3)) {
                     var10000 = var2;
                     this.b3 = hd.b(var1, var3, var2);
                     break label34;
                  }

                  var5 = var1.indexOf("#", var3 + --1);
                  BaseQl var6 = null;
                  String var7;
                  boolean var8 = (var7 = var1.substring(var3, var5)).equals("技能");
                  BaseQl var11 = new BaseQl;
                  BaseMountSkill var9;
                  if (var8) {
                     var11.<init>(var7, 0.0D);
                     var6 = var11;
                     var3 = var5 + (5 >> 2);
                     var9 = this;
                     var5 = var1.indexOf("#", var3 + --1);
                     var6.setValue(Double.parseDouble(var1.substring(var3, var5)));
                     var6.setValue2(Double.parseDouble(var1.substring(var5 + --1, var2)));
                  } else {
                     var11.<init>(var7, Double.parseDouble(var1.substring(var5 + (3 & 5), var2)));
                     var6 = var11;
                     var9 = this;
                  }

                  var9.bases[var4 - --2] = var6;
               }

               var10000 = var2;
            }

            ++var4;
            var3 = var10000 + 1;
         }

      }
   }

   public int getBt() {
      return this.bt;
   }

   public String getText(int var1, int var2, int var3, int var4, int var5) {
      String var6;
      if (hd.o(var6 = this.getText())) {
         return this.name;
      } else {
         double var7 = this.getXs(var1, var2, var3, var4, var5);
         StringBuffer var10 = new StringBuffer();
         var2 = 3 >> 2;
         var3 = 3 >> 2;
         String var10000 = var6;

         StringBuffer var12;
         while(true) {
            if ((var2 = var10000.indexOf("{", var3)) == -4 >> 2) {
               var12 = var10;
               break;
            }

            if ((var3 = var6.indexOf("}", var2 + (2 ^ 3))) == -4 >> 2) {
               var12 = var10;
               break;
            }

            String var11;
            if ((var11 = var6.substring(var2 + --1, var3)).indexOf("{") != -4 >> 2) {
               var10000 = var6;
               ++var2;
            } else {
               int var9 = var6.length();
               var6 = this.b(var11, var6, var7, var4);
               var3 += var6.length() - var9;
               var10000 = var6;
            }
         }

         var12.append(var6);
         return var10.toString();
      }
   }

   public void setBases(BaseQl[] var1) {
      this.bases = var1;
   }

   public double getMountSHByZTPercentage(int var1, int var2) {
      if (var2 <= 0) {
         return 0.0D;
      } else {
         --var2;
         double var3 = 0.0D;
         int var5 = 2 & 5;
         var1 = Math.min(var2 / --4 + (--1 + var2 % --4 >= var1 ? 5 >> 2 : 0), this.bases.length);

         for(int var10000 = var5; var10000 < var1; var10000 = var5) {
            BaseQl var10001 = this.bases[var5];
            ++var5;
            var3 += var10001.getValue();
         }

         return var3;
      }
   }

   public void setB2(int var1) {
      this.b2 = var1;
   }

   public int getB1() {
      return this.b1;
   }

   public void setB1(int var1) {
      this.b1 = var1;
   }

   public String b(String var1, String var2, double var3, int var5) {
      String var6 = null;
      String var10000;
      if (var1.equals("熟练度")) {
         var10000 = var6 = String.valueOf(var5 + "/100000");
      } else {
         if (var1.startsWith("数值")) {
            var5 = var1.length() > 5 >> 1 ? hd.b(var1, 5 >> 1, var1.length()) - (3 >> 1) : 0;
            double var7 = 0.0D;
            double var9;
            if (var5 == 0) {
               var9 = var3 / this.getBx();
            } else {
               if (var5 >= --1 && var5 - (5 >> 2) < this.bases.length) {
                  var7 = var3 / this.bases[var5 - --1].getValue();
               }

               var9 = var7;
            }

            var6 = hd.ak(PropertyUtil.k(var9), 5 >> 1);
         }

         var10000 = var6;
      }

      return var10000 == null ? var2 : var2.replace("{" + var1 + "}", var6);
   }

   public int getB2() {
      return this.b2;
   }

   public void setBx(double var1) {
      this.bx = var1;
   }

   public double getXs(int var1, int var2, int var3, int var4, int var5) {
      return (double)(var1 * this.b1 + var2 * this.b2 + var3 * this.b3) / 100.0D * (var5 != --2 && var5 != --4 ? 1.0D : 1.2D) + (double)var4 * 3.6D / 10000.0D;
   }

   public String getName() {
      return this.name;
   }

   public void c(Goodstable var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("等级=");
      var2.append(this.b2);
      var2.append("|耐久=");
      var2.append(this.b3);
      int var3 = 2 & 5;

      for(int var10000 = var3; var10000 < this.bases.length; var10000 = var3) {
         var2.append("|");
         var2.append(this.bases[var3].getKey());
         var2.append("=");
         var2.append(hd.ak(this.bases[var3].getValue(), 3 & 5));
         if (this.bases[var3].getKey().equals("技能")) {
            var2.append("#");
            var2.append(hd.ak(this.bases[var3].getValue2(), 3 >> 1));
         }

         ++var3;
      }

      var1.setQuality(this.bt == 0 ? 0L : 1L);
      var1.setValue(var2.toString());
   }

   public BaseMountSkill(String var1, BaseQl[] var2) {
      this.name = var1;
      this.bases = var2;
   }

   public BaseQl[] getBases() {
      return this.bases;
   }

   public double getMountSHByZT(int var1, int var2) {
      if (var2 <= 0) {
         return 1.0D;
      } else {
         --var2;
         double var3 = 0.0D;
         int var5 = 2 & 5;
         var1 = Math.min(var2 / --4 + (--1 + var2 % --4 >= var1 ? 2 ^ 3 : 0), this.bases.length);

         for(int var10000 = var5; var10000 < var1; var10000 = var5) {
            BaseQl var10001 = this.bases[var5];
            ++var5;
            var3 += var10001.getValue();
         }

         return 1.0D + var3 / 100.0D;
      }
   }

   public BaseMountSkill(String var1, int[] var2, int var3, double var4, BaseQl[] var6) {
      int var10007 = 1 ^ 3;
      int var10011 = 3 & 5;
      int var10014 = 5 >> 3;
      super();
      this.name = var1;
      this.b1 = var2[var10014];
      this.b2 = var2[var10011];
      this.b3 = var2[var10007];
      this.bt = var3;
      this.bx = var4;
      this.bases = var6;
   }

   public void setBt(int var1) {
      this.bt = var1;
   }

   public double getBx() {
      return this.bx;
   }

   public void setB3(int var1) {
      this.b3 = var1;
   }
}
