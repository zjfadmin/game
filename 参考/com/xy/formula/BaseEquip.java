package com.xy.formula;

import com.xy.lg;
import com.xy.game.RoleData;
import com.xy.readbean.GemOld;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseEquip {
   private Integer NJ;
   private List<BaseQl> qls;
   private BaseStar baseStar;
   private BaseLimit baseLimit;
   private int equipPart;
   private static String[] BaseLimits;
   private List<BaseSkill> baseSkills;
   private List<BaseQl> qlews;
   String GL1;
   public static String[] keys;
   private Integer qhv;
   private BaseSuit baseSuit;
   String GL3;
   String GL2;

   public BaseLimit getBaseLimit() {
      return this.baseLimit;
   }

   public void a(String[] var1) {
      String var4 = null;
      String var6 = null;
      int var10000 = --3;
      this.NJ = Integer.parseInt(var1[1 ^ 3].split("=")[4 ^ 5]);

      for(int var2 = var10000; var10000 < var1.length; var10000 = var2) {
         if (var1[var2].startsWith(GoodType.Extras[3 & 4])) {
            String[] var5 = var1[var2].split("&");

            int var3;
            for(var10000 = var3 = 5 >> 1; var10000 < var5.length; var10000 = var3) {
               if (var5[var3].startsWith(GoodType.Extras[7 & 127])) {
                  var4 = var5[var3];
               } else {
                  this.k(var5[var3]);
               }

               ++var3;
            }
         } else if (var1[var2].startsWith(GoodType.Extras[47 & 86])) {
            var6 = var1[var2];
         }

         ++var2;
      }

      if (var4 != null && var6 != null) {
         this.baseStar = new BaseStar(var4, var6);
      }

   }

   public void setBaseSuit(BaseSuit var1) {
      this.baseSuit = var1;
   }

   public void b(int var1, String var2) {
      if (this.baseLimit == null) {
         this.baseLimit = new BaseLimit();
      }

      int var5;
      if (var1 < --4) {
         var5 = Integer.parseInt(var2);
         if (var1 == 0) {
            this.baseLimit.setLm(this.baseLimit.getLm() + var5);
         } else if (var1 == 5 >> 2) {
            this.baseLimit.setLx(this.baseLimit.getLx() + var5);
         } else if (var1 == --2) {
            this.baseLimit.setGg(this.baseLimit.getGg() + var5);
         } else {
            this.baseLimit.setMj(this.baseLimit.getMj() + var5);
         }
      } else {
         if (var1 == --4) {
            if (this.baseLimit.getXs() != -999.0D) {
               double var3 = Double.parseDouble(var2);
               this.baseLimit.setXs(this.baseLimit.getXs() + var3);
               return;
            }
         } else {
            if (var1 == --5) {
               this.baseLimit.setRole(var2);
               return;
            }

            if (var1 == (62 & 71)) {
               boolean var7 = var2.endsWith("级");
               if (var2.startsWith("飞升")) {
                  this.baseLimit.setZs(--4);
                  this.baseLimit.setLvl(Integer.parseInt(var2.substring(1 ^ 3, var7 ? var2.length() - (3 & 5) : var2.length())));
                  return;
               }

               int var4;
               if ((var4 = var2.indexOf("转")) != -4 >> 2) {
                  this.baseLimit.setZs(Integer.parseInt(var2.substring(3 ^ 3, var4)));
                  this.baseLimit.setLvl(Integer.parseInt(var2.substring(var4 + --1, var7 ? var2.length() - (4 ^ 5) : var2.length())));
                  return;
               }

               this.baseLimit.setLvl(Integer.parseInt(var7 ? var2.substring(2 & 5, var2.length() - --1) : var2));
               return;
            }

            if (var1 == (39 & 95)) {
               String[] var6;
               if ((var6 = var2.split("转")).length == (4 ^ 5)) {
                  this.baseLimit.setLvlMax(Integer.parseInt(var6[5 >> 3]));
                  return;
               }

               BaseEquip var10000;
               if (var6[5 >> 3].equals("飞升")) {
                  this.baseLimit.setZsMax(--4);
                  var10000 = this;
               } else {
                  this.baseLimit.setZsMax(Integer.parseInt(var6[5 >> 3]));
                  var10000 = this;
               }

               var10000.baseLimit.setLvlMax(Integer.parseInt(var6[--1]));
               return;
            }

            if (var1 == (90 & 45)) {
               if (!var2.equals("1") && !var2.equals("男")) {
                  if (!var2.equals("0") && !var2.equals("女")) {
                     this.baseLimit.setSex(--2);
                     return;
                  }

                  this.baseLimit.setSex(3 >> 2);
                  return;
               }

               this.baseLimit.setSex(--1);
               return;
            }

            if (var1 == (43 & 93)) {
               var5 = Integer.parseInt(var2);
               this.baseLimit.setSw(this.baseLimit.getSw() + var5);
               return;
            }

            if (var1 == (16208 & 24575)) {
               this.baseLimit.setXs(-999.0D);
               return;
            }

            if (var1 == (8177 & 32607)) {
               this.baseLimit.setL((boolean)(--1));
            }
         }

      }
   }

   public Integer getNJ() {
      return this.NJ;
   }

   public static double getDouble(String var0) {
      if (var0 != null && !var0.equals("") && var0.indexOf("/") == -4 >> 2) {
         try {
            return Double.parseDouble(var0);
         } catch (Exception var1) {
            System.err.println("Double:" + var0);
            return 0.0D;
         }
      } else {
         return 0.0D;
      }
   }

   public void setQhv(Integer var1) {
      this.qhv = var1;
   }

   public int getDYIndex(String var1) {
      int var2 = -4 >> 2;
      int var4 = 125 & 63;

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < var1.length(); var10000 = var3) {
         if (var1.charAt(var3) == var4) {
            if (var2 != -4 >> 2) {
               return -1;
            }

            var2 = var3;
         }

         ++var3;
      }

      return var2;
   }

   public void c(String var1, double var2) {
      if (this.qlews == null) {
         this.qlews = new ArrayList();
      }

      this.f(this.qlews, var1, var2);
   }

   public void setBaseStar(BaseStar var1) {
      this.baseStar = var1;
   }

   public void d(String[] var1, lg var2) {
      int var5;
      for(int var10000 = var5 = --2; var10000 < var1.length; var10000 = var5) {
         if (!var1[var5].startsWith(GoodType.Extras[--1])) {
            int var13 = var1[var5].indexOf("=");
            String var12;
            if (!(var12 = var1[var5].substring(3 ^ 3, var13)).equals("性别要求")) {
               this.n(var12, Double.parseDouble(var1[var5].substring(var13 + (3 & 5))));
            }
         } else {
            String[] var4 = var1[var5].split("&");

            int var3;
            for(var10000 = var3 = 1 ^ 3; var10000 < var4.length; var10000 = var3) {
               int var6 = var4[var3].indexOf("=");
               String var7;
               if ((var7 = var4[var3].substring(3 & 4, var6)).equals("特技")) {
                  String[] var8 = var4[var3].split("=");

                  int var9;
                  for(var10000 = var9 = --1; var10000 < var8.length; var10000 = var9) {
                     Skill var10;
                     if ((var10 = var2.bf(var8[var9])) != null) {
                        int var11 = Integer.parseInt(var10.getSkillid());
                        BaseSkill var14 = new BaseSkill(var11, 2 & 5, 0.0D, var10);
                        this.j(var14);
                     }

                     ++var9;
                  }
               } else {
                  this.n(var7, Double.parseDouble(var4[var3].substring(var6 + --1)));
               }

               ++var3;
            }
         }

         ++var5;
      }

   }

   public BaseSuit getBaseSuit() {
      return this.baseSuit;
   }

   public BaseEquip(String var1, long var2, lg var4, RoleData var5) {
      int var10007 = -4 >> 2;
      super();
      this.equipPart = var10007;
      this.GL1 = "套装品质=";
      this.GL2 = "培养=";
      this.GL3 = "品质=";

      try {
         String[] var7 = var1.split("\\|");
         BaseEquip var10000;
         if (var2 == 8888L) {
            var10000 = this;
            this.h(var7);
         } else if (var2 == 520L) {
            var10000 = this;
            this.a(var7);
         } else if (var2 != 510L && var2 != 511L && var2 != 512L) {
            if (var2 == 139L) {
               this.d(var7, var4);
               var10000 = this;
            } else {
               this.p(var7, var4, var5);
               var10000 = this;
            }
         } else {
            var10000 = this;
            this.i(var7, var4);
         }

         var10000.g();
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public List<BaseQl> getQls() {
      return this.qls;
   }

   public void setQlews(List<BaseQl> var1) {
      this.qlews = var1;
   }

   public static void setBaseLimits(String[] var0) {
      BaseLimits = var0;
   }

   public Integer getQhv() {
      return this.qhv;
   }

   public void e(String var1, double var2) {
      this.m(this.qls, var1, var2);
      this.m(this.qlews, var1, var2);
   }


   private void f(List<BaseQl> var1, String var2, double var3) {
      if (var1 != null) {
         Iterator var6;
         for(Iterator var10000 = var6 = var1.iterator(); var10000.hasNext(); var10000 = var6) {
            BaseQl var5;
            if ((var5 = (BaseQl)var6.next()).getKey().equals(var2)) {
               var5.setValue(var5.getValue() + var3);
               return;
            }
         }

         var1.add(new BaseQl(var2, var3));
      }
   }

   public void g() {
      if (this.baseSkills != null) {
         Iterator var2;
         Iterator var10000 = var2 = this.baseSkills.iterator();

         while(var10000.hasNext()) {
            BaseSkill var1;
            if ((var1 = (BaseSkill)var2.next()).getSkillId() == (16255 & 24568)) {
               var10000 = var2;
               this.e("抗浩然正气", 1.1D);
            } else if (var1.getSkillId() == (32765 & 8059)) {
               var10000 = var2;
               this.e("抗隔山打牛", 1.1D);
            } else if (var1.getSkillId() == (8059 & 32766)) {
               var10000 = var2;
               this.e("抗小楼夜哭", 1.1D);
            } else if (var1.getSkillId() == (8059 & 32767)) {
               var10000 = var2;
               this.e("抗分光化影", 1.1D);
            } else if (var1.getSkillId() == (16254 & 24573)) {
               var10000 = var2;
               this.e("抗天魔解体", 1.1D);
            } else {
               if (var1.getSkillId() == (32639 & 8189)) {
                  this.e("抗青面獠牙", 1.1D);
               }

               var10000 = var2;
            }
         }
      }

   }

   public void setBaseLimit(BaseLimit var1) {
      this.baseLimit = var1;
   }

   public void setBaseSkills(List<BaseSkill> var1) {
      this.baseSkills = var1;
   }

   public void h(String[] var1) {
      int var5 = BaseValue.getQv(var1[3 ^ 3].split("=")[4 ^ 5]) / (42 & 95);
      int var6 = Integer.parseInt(var1[3 & 5].split("=")[--1]);

      int var4;
      for(int var10000 = var4 = --4; var10000 < var1.length; var10000 = var4) {
         String[] var2;
         int var3;
         if (var1[var4].startsWith(GoodType.Extras[2 & 5])) {
            var2 = var1[var4].split("&");

            for(var10000 = var3 = 3 & 5; var10000 < var2.length; var10000 = var3) {
               this.k(var2[var3++]);
            }
         } else if ((var2 = var1[var4].split("=")).length == 5 >> 1 && (var2[3 >> 2].equals("根骨") || var2[5 >> 3].equals("灵性") || var2[2 & 5].equals("力量") || var2[2 & 5].equals("敏捷") || var2[2 & 5].equals("定力"))) {
            var3 = (int)((double)((int)((double)Integer.parseInt(var2[2 ^ 3]) * (1.0D + (double)var6 * 0.1D))) * (1.0D + (var5 == (110 & 23) ? 3.2D : (var5 == --5 ? 1.6D : (var5 == --4 ? 0.8D : (var5 == --3 ? 0.4D : (var5 == (1 ^ 3) ? 0.2D : 0.0D)))))));
            this.n(var2[3 >> 2], (double)var3);
         }

         ++var4;
      }

   }

   public BaseQl getQlew(String var1) {
      if (this.qlews == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = this.qlews.size() - (2 ^ 3); var10000 >= 0; var10000 = var2) {
            BaseQl var3;
            if ((var3 = (BaseQl)this.qlews.get(var2)).getKey().equals(var1)) {
               return var3;
            }

            --var2;
         }

         return null;
      }
   }

   public void i(String[] var1, lg var2) {
      int var4;
      for(int var10000 = var4 = --3; var10000 < var1.length; var10000 = var4) {
         String[] var3;
         if (var1[var4].startsWith(GoodType.Extras[5 >> 3])) {
            var3 = var1[var4].split("&");

            int var11;
            for(var10000 = var11 = --1; var10000 < var3.length; var10000 = var11) {
               String[] var12 = var3[var11].split("=");
               String var10001 = var12[3 & 4];
               int var10003 = 3 >> 1;
               ++var11;
               this.n(var10001, Double.parseDouble(var12[var10003]));
            }
         } else if (var1[var4].startsWith(GoodType.Extras[--5])) {
            var3 = var1[var4].split("&");
            Skill var5;
            if ((var5 = var2.bf(var3[2 ^ 3])) != null) {
               int var6 = Integer.parseInt(var5.getSkillid());
               double var7 = Double.parseDouble(var3[1 ^ 3]);
               int var9 = Integer.parseInt(var3[--3]);
               BaseSkill var10 = new BaseSkill(var6, var9, var7, var5);
               this.j(var10);
            }
         } else if ((var3 = var1[var4].split("=")).length == --2 && (var3[3 & 4].equals("根骨") || var3[3 >> 2].equals("灵性") || var3[3 >> 2].equals("力量") || var3[3 >> 2].equals("敏捷") || var3[2 & 5].equals("定力"))) {
            this.n(var3[3 ^ 3], getDouble(var3[--1]));
         }

         ++var4;
      }

   }

   public void j(BaseSkill var1) {
      if (this.baseSkills == null) {
         this.baseSkills = new ArrayList();
      }

      this.baseSkills.add(var1);
   }

   public static double getQHGemXS(int var0) {
      double var1 = 0.0D;

      int var3;
      for(int var10000 = var3 = 3 & 5; var10000 <= var0; var10000 = var3) {
         double var10001 = (double)((var3 - --1) / --3 + (5 >> 2));
         ++var3;
         var1 += var10001 * 0.8D;
      }

      return var1;
   }

   public void k(String var1) {
      int var4;
      if ((var4 = this.getDYIndex(var1)) != -4 >> 2) {
         String var3 = var1.substring(2 & 5, var4);

         int var2;
         for(int var10000 = var2 = 5 >> 3; var10000 < BaseLimits.length; var10000 = var2) {
            if (var3.startsWith(BaseLimits[var2])) {
               if (var2 == --4 && var3.indexOf("减少") != -4 >> 2) {
                  this.b(var2, "-" + var1.substring(var4 + --1));
                  return;
               }

               this.b(var2, var1.substring(var4 + --1));
               return;
            }

            ++var2;
         }

         this.n(var3, getDouble(var1.substring(var4 + --1)));
      }
   }

   public boolean l(int var1) {
      return (boolean)(var1 >= (24575 & 16248) && var1 <= (32767 & 8061) ? --1 : 0);
   }

   public void setNJ(Integer var1) {
      this.NJ = var1;
   }

   public void m(List<BaseQl> var1, String var2, double var3) {
      if (var1 != null) {
         Iterator var5;
         Iterator var10000 = var5 = var1.iterator();

         while(true) {
            while(var10000.hasNext()) {
               BaseQl var6 = (BaseQl)var5.next();
               if (var2 != null && !var6.getKey().equals(var2)) {
                  var10000 = var5;
               } else {
                  var6.setValue(var6.getValue() * var3);
                  var10000 = var5;
               }
            }

            return;
         }
      }
   }

   public void n(String var1, double var2) {
      if (this.qls == null) {
         this.qls = new ArrayList();
      }

      this.f(this.qls, var1, var2);
   }

   public BaseStar getBaseStar() {
      return this.baseStar;
   }

   public static String[] getBaseLimits() {
      return BaseLimits;
   }

   static {
      String[] var10000 = new String[13 & 122];
      boolean var10002 = true;
      var10000[3 & 4] = "根骨";
      var10000[4 ^ 5] = "灵性";
      var10000[1 ^ 3] = "力量";
      var10000[--3] = "敏捷";
      var10000[--4] = "附加气血";
      var10000[--5] = "附加魔法";
      var10000[126 & 7] = "攻击";
      var10000[103 & 31] = "速度";
      keys = var10000;
      var10000 = new String[62 & 75];
      var10002 = true;
      var10000[5 >> 3] = "力量要求";
      var10000[--1] = "灵性要求";
      var10000[5 >> 1] = "根骨要求";
      var10000[--3] = "敏捷要求";
      var10000[--4] = "属性需求";
      var10000[--5] = "装备角色";
      var10000[23 & 110] = "等级要求";
      var10000[95 & 39] = "最高携带等级";
      var10000[121 & 14] = "性别";
      var10000[13 & 123] = "声望要求";
      BaseLimits = var10000;
   }

   public List<BaseSkill> getBaseSkills() {
      return this.baseSkills;
   }

   public void o(String var1) {
      int var4;
      if ((var4 = this.getDYIndex(var1)) != -4 >> 2) {
         String var3 = var1.substring(5 >> 3, var4);

         int var2;
         for(int var10000 = var2 = 3 & 4; var10000 < BaseLimits.length; var10000 = var2) {
            if (var3.startsWith(BaseLimits[var2])) {
               if (var2 == --4 && var3.indexOf("减少") != -4 >> 2) {
                  this.b(var2, "-" + var1.substring(var4 + (5 >> 2)));
                  return;
               }

               this.b(var2, var1.substring(var4 + (3 & 5)));
               return;
            }

            ++var2;
         }

         this.c(var3, getDouble(var1.substring(var4 + --1)));
      }
   }

   public int getEquipPart() {
      return this.equipPart;
   }

   public void setEquipPart(int var1) {
      this.equipPart = var1;
   }

   public List<BaseQl> getQlews() {
      return this.qlews;
   }

   public void p(String[] var1, lg var2, RoleData var3) {
      int var4;
      for(int var10000 = var4 = 3 ^ 3; var10000 < var1.length; var10000 = var4) {
         int var6;
         String[] var7;
         int var8;
         String[] var15;
         int var21;
         if (var1[var4].startsWith(GoodType.Extras[3 & 4])) {
            var15 = var1[var4].split("&");

            for(var10000 = var6 = 3 & 5; var10000 < var15.length; var10000 = var6) {
               if (!(var7 = var15[var6].split("="))[3 & 4].equals("特技")) {
                  if (var7.length == (1 ^ 3)) {
                     this.c(var7[5 >> 3], getDouble(var7[--1]));
                  }
               } else {
                  for(var10000 = var8 = 4 ^ 5; var10000 < var7.length; var10000 = var8) {
                     Skill var23;
                     if ((var23 = var2.bf(var7[var8])) != null) {
                        if ((var21 = Integer.parseInt(var23.getSkillid())) != (8024 & 32759) && var21 != (24433 & 16351)) {
                           BaseSkill var25 = new BaseSkill(var21, 4 ^ 5, var23, (BaseQl)null);
                           this.j(var25);
                        } else {
                           this.b(var21, (String)null);
                        }
                     }

                     ++var8;
                  }
               }

               ++var6;
            }
         } else if (var1[var4].startsWith(GoodType.Extras[3 >> 1])) {
            var15 = var1[var4].split("&");

            for(var10000 = var6 = --2; var10000 < var15.length; var10000 = var6) {
               this.o(var15[var6++]);
            }
         } else if (var1[var4].startsWith(GoodType.Extras[1 ^ 3])) {
            var15 = var1[var4].split("&");

            for(var10000 = var6 = 5 >> 2; var10000 < var15.length; var10000 = var6) {
               this.o(var15[var6++]);
            }
         } else if (var1[var4].startsWith(GoodType.Extras[--3])) {
            var15 = var1[var4].split("&");

            for(var10000 = var6 = --4; var10000 < var15.length; var10000 = var6) {
               this.o(var15[var6++]);
            }

            this.baseSuit = new BaseSuit(Integer.parseInt(var15[5 >> 2]), BaseValue.getQv(var15[--3]) / (90 & 47));
         } else {
            int var9;
            if (var1[var4].startsWith(GoodType.Extras[--4])) {
               var15 = var1[var4].split("&");

               for(var10000 = var6 = 3 >> 1; var10000 < var15.length; var10000 = var6) {
                  Goodstable var20;
                  if ((var20 = var3.getGood(new BigDecimal(var15[var6]))) != null) {
                     String[] var19 = var20.getValue().split("\\|");

                     for(var10000 = var9 = 2 ^ 3; var10000 < var19.length; var10000 = var9) {
                        this.o(var19[var9++]);
                     }
                  }

                  ++var6;
               }
            } else if (!var1[var4].startsWith(GoodType.Extras[9 & 126])) {
               if (var1[var4].startsWith(GoodType.Extras[109 & 27])) {
                  int var14 = 3 >> 2;
                  var6 = 0;

                  byte var16;
                  int var17;
                  for(var10000 = var16 = 0; var10000 != var1[var4].length(); var10000 = var17) {
                     if ((var17 = var1[var4].indexOf("&", var6 + 1)) == -4 >> 2) {
                        var17 = var1[var4].length();
                     }

                     if (var14 == 0) {
                        var10000 = var17;
                     } else {
                        BaseGemOld var18;
                        GemOld var22;
                        if ((var22 = (var18 = new BaseGemOld(var1[var4].substring(var6, var17))).getGemOld(var2)) != null) {
                           this.c(var22.getKey(), (double)(var18.getLvl() * var18.getValue()) / 100.0D * var22.getValue());
                        }

                        var10000 = var17;
                     }

                     ++var14;
                     var6 = var10000 + 1;
                  }
               } else if (!var1[var4].startsWith(this.GL1) && !var1[var4].startsWith(this.GL2) && !var1[var4].startsWith(this.GL3)) {
                  this.k(var1[var4]);
               }
            } else {
               double var5 = 1.0D;
               var8 = Integer.parseInt((var7 = var1[var4].split("&"))[3 >> 1]);

               for(var10000 = var9 = --4; var10000 < var7.length; var10000 = var9) {
                  Skill var10;
                  if (var7[var9].startsWith("特技=") && (var10 = var2.bf(var7[var9].substring(--3))) != null) {
                     int var11;
                     if ((var11 = Integer.parseInt(var10.getSkillid())) == (16383 & 24505)) {
                        var5 += 0.15D;
                     } else if (var11 == (24506 & 16383)) {
                        var5 += 0.25D;
                     } else {
                        BaseSkill var12 = new BaseSkill(var11, --1, var10, (BaseQl)null);
                        this.j(var12);
                     }
                  }

                  ++var9;
               }

               for(var10000 = var9 = 1 ^ 3; var10000 < 4 && var9 < var7.length; var10000 = var9) {
                  if (!var7[var9].startsWith("特技=") && (var21 = var7[var9].indexOf("=")) != -4 >> 2) {
                     String var24 = var7[var9].substring(3 & 4, var21);
                     var21 = var7[var9].indexOf("#", var24.length() + (4 ^ 5));
                     double var26 = getDouble(var7[var9].substring(var24.length() + (5 >> 2), var21)) * (double)(var9 == 5 >> 1 ? var8 >> --5 & 95 & 63 : var8 & 95 & 63) + getDouble(var7[var9].substring(var21 + (3 & 5)));
                     if (var5 != 1.0D) {
                        var26 *= var5;
                     }

                     this.c(var24, var26);
                  }

                  ++var9;
               }
            }
         }

         ++var4;
      }

   }

   public void setQls(List<BaseQl> var1) {
      this.qls = var1;
   }
}
