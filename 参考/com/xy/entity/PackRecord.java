package com.xy.entity;

import com.xy.el;
import com.xy.hd;
import com.xy.lg;
import com.xy.formula.BaseMountSH;
import com.xy.readbean.RoleTxBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PackRecord {
   private int suitNum;
   private String collect;
   private String suit2;
   private String suit5;
   private String lCard;
   private BigDecimal roleId;
   private String suit3;
   private String suit11;
   private String helpBb;
   private String suit1;
   private String suit7;
   private String labor;
   private String suit8;
   private String helpLing;
   private String record;
   private String suit9;
   private String suit6;
   private String starSoul;
   private String suit10;
   private String tx;
   private String suit4;
   private String equip;

   public String a(String var1) {
      if (this.b(var1)) {
         return this.tx;
      } else {
         PackRecord var10000;
         if (this.tx != null && !this.tx.equals("")) {
            this.tx = this.tx + "|" + var1;
            var10000 = this;
         } else {
            var10000 = this;
            this.tx = var1;
         }

         return var10000.tx;
      }
   }

   public void setSuit(int var1, String var2) {
      if (var1 > 0 && var1 <= (13775 & 19124)) {
         var1 = var1 > (125 & 123) ? var1 - (127 & 122) : (var1 > (110 & 127) ? var1 - (127 & 111) : (var1 - (5 >> 2)) / (90 & 47));
         switch(var1) {
         case 0:
            while(false) {
            }

            this.suit1 = var2;
            return;
         case 1:
            this.suit2 = var2;
            return;
         case 2:
            this.suit3 = var2;
            return;
         case 3:
            this.suit4 = var2;
            return;
         case 4:
            this.suit5 = var2;
            return;
         case 5:
            this.suit6 = var2;
            return;
         case 6:
            this.suit7 = var2;
            return;
         case 7:
            this.suit8 = var2;
            return;
         case 8:
            this.suit9 = var2;
            return;
         case 9:
            this.suit10 = var2;
            return;
         case 10:
            this.suit11 = var2;
         default:
         }
      }
   }

   public BigDecimal getRoleId() {
      return this.roleId;
   }

   public boolean b(String var1) {
      if (this.tx != null && !this.tx.equals("")) {
         String[] var2 = this.tx.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].endsWith("#")) {
               var2[var3] = var2[var3].substring(3 ^ 3, var2[var3].length() - (2 ^ 3));
            }

            if (var1.equals(var2[var3])) {
               return (boolean)(3 & 5);
            }

            ++var3;
         }

         return (boolean)(3 >> 2);
      } else {
         return false;
      }
   }

   public String getSuit(int var1) {
      if (var1 > 0 && var1 <= (6582 & 26317)) {
         var1 = var1 > (121 & 127) ? var1 - (122 & 127) : (var1 > (127 & 110) ? var1 - (111 & 127) : (var1 - (2 ^ 3)) / (74 & 63));
         switch(var1) {
         case 0:
            while(false) {
            }

            return this.suit1;
         case 1:
            return this.suit2;
         case 2:
            return this.suit3;
         case 3:
            return this.suit4;
         case 4:
            return this.suit5;
         case 5:
            return this.suit6;
         case 6:
            return this.suit7;
         case 7:
            return this.suit8;
         case 8:
            return this.suit9;
         case 9:
            return this.suit10;
         case 10:
            return this.suit11;
         default:
            return null;
         }
      } else {
         return null;
      }
   }

   public void setSuit1(String var1) {
      this.suit1 = var1;
   }

   public void setSuit8(String var1) {
      this.suit8 = var1;
   }

   public int getFZType() {
      String var1;
      return (var1 = el.d(this.equip, "FZ", "|")) != null && !var1.equals("") ? Integer.parseInt(var1) : 0;
   }

   public long getLabortype(int var1) {
      String var2;
      return (var2 = el.d(this.labor, var1 + "=", "|")) != null && !var2.equals("") ? Long.parseLong(var2) : 0L;
   }

   public String c(String... var1) {
      if (this.tx != null && !this.tx.equals("")) {
         String[] var5 = this.tx.split("\\|");
         StringBuffer var3 = new StringBuffer();

         int var4;
         for(int var10000 = var4 = 3 & 4; var10000 < var5.length; var10000 = var4) {
            String var2;
            if ((var2 = var5[var4]).endsWith("#")) {
               var2 = var2.substring(2 & 5, var2.length() - (2 ^ 3));
            }

            StringBuffer var7;
            label34: {
               int var6;
               for(var10000 = var6 = 0; var10000 < var1.length; var10000 = var6) {
                  if (var2.equals(var1[var6])) {
                     var2 = var2 + "#";
                     var7 = var3;
                     break label34;
                  }

                  ++var6;
               }

               var7 = var3;
            }

            if (var7.length() != 0) {
               var3.append("|");
            }

            ++var4;
            var3.append(var2);
         }

         this.tx = var3.toString();
         return this.tx;
      } else {
         return this.tx;
      }
   }

   public String getSuit2() {
      return this.suit2;
   }

   public void setStarSoul(String var1) {
      this.starSoul = var1;
   }

   public void setRoleId(BigDecimal var1) {
      this.roleId = var1;
   }

   public void setSuit10(String var1) {
      this.suit10 = var1;
   }

   public String d(int var1, int var2) {
      if (this.collect != null && !this.collect.equals("")) {
         String[] var6 = this.collect.split("\\|");

         int var4;
         for(int var10000 = var4 = 3 & 4; var10000 < var6.length; var10000 = var4) {
            String[] var5;
            int var3 = Integer.parseInt((var5 = var6[var4].split("-"))[3 & 4]);
            if (var1 == var3) {
               for(var10000 = var3 = 1; var10000 < var5.length; var10000 = var3) {
                  if (Integer.parseInt(var5[var3]) == var2) {
                     return "不能重复收录";
                  }

                  ++var3;
               }

               return null;
            }

            ++var4;
         }

         if (this.suitNum <= var6.length) {
            return "达到最大收录数";
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void setLabortype(int var1, long var2) {
      this.labor = el.i(this.labor, var1 + "=", "|", var1 + "=" + var2);
   }

   public BaseMountSH getMountSH(int var1) {
      BaseMountSH var2 = new BaseMountSH(var1, this.getOtherValue(BaseMountSH.SH_HEAD_DATA[var1]));
      int var3 = 5 >> 3;
      var1 = var1 == 0 ? var2.getUnlock() : 0;

      for(int var10000 = var3; var10000 < var1; var10000 = var3) {
         int var10004 = var3;
         var2.b(var3++, this.getOtherValue(BaseMountSH.SH_HEAD_SHS[var10004]));
      }

      return var2;
   }

   public void setHelpBb(String var1) {
      this.helpBb = var1;
   }

   public String getSuit10() {
      return this.suit10;
   }

   public BigDecimal[] getEquipType(String var1) {
      String var2 = el.d(this.equip, var1 + "O", "|");
      int var4 = 47 & 95;
      int var3 = 3 & 4;
      if (var2 != null && !var2.equals("")) {
         var3 = Integer.parseInt(var2);
      }

      PackRecord var10000;
      if (var3 == (4 ^ 5)) {
         var1 = var1 + "B";
         var10000 = this;
      } else if (var3 == 5 >> 1) {
         var1 = var1 + "C";
         var10000 = this;
      } else {
         var1 = var1 + "A";
         var10000 = this;
      }

      return var10000.getBaseValue(var4, var1);
   }

   public String getOtherValue(String var1) {
      return hd.d(this.lCard, var1, "|");
   }

   public void setSuit7(String var1) {
      this.suit7 = var1;
   }

   public String getSuit4() {
      return this.suit4;
   }

   public void setEquip(String var1, String var2) {
      this.equip = el.i(this.equip, var1, "|", var2);
   }

   public String[] getCollect(int var1) {
      if (this.collect != null && !this.collect.equals("")) {
         String[] var5 = this.collect.split("\\|");

         int var6;
         for(int var10000 = var6 = 2 & 5; var10000 < var5.length; var10000 = var6) {
            String[] var4;
            int var2 = Integer.parseInt((var4 = var5[var6].split("-"))[3 >> 2]);
            if (var1 == var2) {
               String[] var8 = new String[var4.length - --1];
               boolean var10002 = true;
               String[] var7 = var8;

               int var3;
               for(var10000 = var3 = 5 >> 2; var10000 < var4.length; var10000 = var3) {
                  int var10001 = var3 - (5 >> 2);
                  String var9 = var4[var3];
                  ++var3;
                  var7[var10001] = var9;
               }

               return var7;
            }

            ++var6;
         }

         return null;
      } else {
         return null;
      }
   }

   public PartJade getPartJade(int var1, int var2) {
      PartJade var4 = new PartJade((long)var1, var2);
      String var3;
      if ((var3 = this.getSuit(var1)) != null && !var3.equals("")) {
         String[] var10 = var3.split("\\|");

         int var5;
         for(int var10000 = var5 = 3 & 4; var10000 < var10.length; var10000 = var5) {
            String[] var6;
            int var7 = Integer.parseInt((var6 = var10[var5].split("-"))[2 & 5]);
            if (var1 == var7) {
               for(var10000 = var7 = 1; var10000 < var6.length; var10000 = var7) {
                  String[] var8;
                  int var9 = Integer.parseInt((var8 = var6[var7].split("_"))[3 ^ 3]);
                  if (var2 == var9) {
                     var4.c(var8);
                     return var4;
                  }

                  ++var7;
               }
            }

            ++var5;
         }

         return var4;
      } else {
         return var4;
      }
   }

   public void setPartJade(PartJade var1) {
      StringBuffer var3;
      String var4;
      int var10000;
      if ((var4 = this.getSuit((int)var1.getSuitid())) != null && !var4.equals("")) {
         var3 = new StringBuffer();
         String[] var10 = var4.split("\\|");
         int var11 = --1;

         int var5;
         for(var10000 = var5 = 3 & 4; var10000 < var10.length; var10000 = var5) {
            String[] var6 = var10[var5].split("-");
            int var7 = Integer.parseInt(var6[3 ^ 3]);
            if (var1.getSuitid() != (long)var7) {
               if (var5 != 0) {
                  var3.append("|");
               }

               var3.append(var10[var5]);
            } else {
               if (var5 != 0) {
                  var3.append("|");
               }

               var11 = 0;
               var7 = 3 & 5;
               var3.append(var6[3 & 4]);
               int var8 = --1;

               for(var10000 = var8; var10000 < var6.length; var10000 = var8) {
                  int var9 = Integer.parseInt(var6[var8].split("_")[3 >> 2]);
                  if (var1.getPartId() != var9) {
                     var3.append("-");
                     var3.append(var6[var8]);
                  } else {
                     var7 = 0;
                     if (!var1.d()) {
                        var3.append("-");
                        var3.append(var1.toString());
                     }
                  }

                  ++var8;
               }

               if (var7 != 0 && !var1.d()) {
                  var3.append("-");
                  var3.append(var1.toString());
               }
            }

            ++var5;
         }

         if (var11 != 0) {
            var3.append("|");
            var3.append(var1.getSuitid());
            if (!var1.d()) {
               var3.append("-");
               var3.append(var1.toString());
            }
         }

         this.setSuit((int)var1.getSuitid(), var3.toString());
      } else {
         (var3 = new StringBuffer()).append(var1.getSuitid());
         var3.append("-");
         var3.append(var1.getPartId());
         int var2 = --1;

         for(var10000 = var2; var10000 < 6; var10000 = var2) {
            var3.append("_");
            var3.append(var1.getJade(var2++));
         }

         this.setSuit((int)var1.getSuitid(), var3.toString());
      }
   }

   public BigDecimal[] setEquipType(int var1) {
      if (this.getEquipType() == var1) {
         return null;
      } else {
         this.equip = el.i(this.equip, "EO", "|", "EO" + var1);
         return this.getEquipType("E");
      }
   }

   public void setSuitNum(int var1) {
      this.suitNum = var1;
   }

   public void setlCard(String var1) {
      this.lCard = var1;
   }

   public String e(String var1) {
      if (this.tx != null && !this.tx.equals("")) {
         String[] var2 = this.tx.split("\\|");
         StringBuffer var3 = new StringBuffer();

         int var4;
         for(int var10000 = var4 = 2 & 5; var10000 < var2.length; var10000 = var4) {
            String var5;
            if ((var5 = var2[var4]).endsWith("#")) {
               var5 = var5.substring(2 & 5, var5.length() - (3 & 5));
            }

            if (!var1.equals(var5)) {
               if (var3.length() != 0) {
                  var3.append("|");
               }

               var3.append(var2[var4]);
            }

            ++var4;
         }

         this.tx = var3.toString();
         return this.tx;
      } else {
         return this.tx;
      }
   }

   public String getRecord() {
      return this.record;
   }

   public String getHelpBb() {
      return this.helpBb;
   }

   public String getShortCutSkills() {
      return hd.d(this.equip, "JN", "|");
   }

   public void setCollect(int var1, int var2) {
      if (this.collect != null && !this.collect.equals("")) {
         StringBuffer var3 = new StringBuffer();
         String[] var4 = this.collect.split("\\|");
         int var5 = 2 ^ 3;

         int var6;
         for(int var10000 = var6 = 3 ^ 3; var10000 < var4.length; var10000 = var6) {
            String[] var7;
            int var8 = Integer.parseInt((var7 = var4[var6].split("-"))[3 & 4]);
            if (var1 != var8) {
               if (var6 != 0) {
                  var3.append("|");
               }

               var3.append(var4[var6]);
            } else {
               if (var6 != 0) {
                  var3.append("|");
               }

               var5 = 0;
               var8 = 4 ^ 5;
               var3.append(var7[2 & 5]);
               int var9 = --1;

               for(var10000 = var9; var10000 < var7.length; var10000 = var9) {
                  int var10 = Integer.parseInt(var7[var9]);
                  if (var2 != var10) {
                     var3.append("-");
                     var3.append(var7[var9]);
                  } else {
                     var8 = 0;
                  }

                  ++var9;
               }

               if (var8 != 0) {
                  var3.append("-");
                  var3.append(var2);
               }
            }

            ++var6;
         }

         if (var5 != 0) {
            var3.append("|");
            var3.append(var1);
            var3.append("-");
            var3.append(var2);
         }

         this.collect = var3.toString();
      } else {
         this.collect = var1 + "-" + var2;
      }
   }

   public String getSuit11() {
      return this.suit11;
   }

   public String getSuit9() {
      return this.suit9;
   }

   public String getStarSoul() {
      return this.starSoul;
   }

   public String getSuit8() {
      return this.suit8;
   }

   public List<Integer> f() {
      if (this.collect != null && !this.collect.equals("")) {
         ArrayList var1 = new ArrayList();
         String[] var2 = this.collect.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            int var4 = Integer.parseInt(var2[var3].split("-")[2 & 5]);
            ++var3;
            var1.add(var4);
         }

         return var1;
      } else {
         return null;
      }
   }

   public String g(int var1, long var2) {
      var2 += this.getStarSoulType(var1);
      this.setStarSoulType(var1, var2);
      return var1 + "=" + var2;
   }

   public void setPartJade(int var1, int var2, int var3, int var4) {
      String var5;
      int var10000;
      if ((var5 = this.getSuit(var1)) != null && !var5.equals("")) {
         PartJade var16 = new PartJade((long)var1, var2);
         StringBuffer var17 = new StringBuffer();
         String[] var15 = var5.split("\\|");
         int var8 = 3 >> 1;

         int var9;
         for(var10000 = var9 = 3 & 4; var10000 < var15.length; var10000 = var9) {
            String[] var10;
            int var11 = Integer.parseInt((var10 = var15[var9].split("-"))[5 >> 3]);
            if (var1 != var11) {
               if (var9 != 0) {
                  var17.append("|");
               }

               var17.append(var15[var9]);
            } else {
               if (var9 != 0) {
                  var17.append("|");
               }

               var8 = 0;
               var11 = 3 >> 1;
               var17.append(var10[5 >> 3]);
               int var12 = 4 ^ 5;

               for(var10000 = var12; var10000 < var10.length; var10000 = var12) {
                  String[] var13;
                  int var14 = Integer.parseInt((var13 = var10[var12].split("_"))[3 >> 2]);
                  if (var2 != var14) {
                     var17.append("-");
                     var17.append(var10[var12]);
                  } else {
                     var11 = 0;
                     var16.c(var13);
                     var16.setJade(var3, var4);
                     if (!var16.d()) {
                        var17.append("-");
                        var17.append(var16.toString());
                     }
                  }

                  ++var12;
               }

               if (var11 != 0) {
                  var16.setJade(var3, var4);
                  if (!var16.d()) {
                     var17.append("-");
                     var17.append(var16.toString());
                  }
               }
            }

            ++var9;
         }

         if (var8 != 0) {
            var17.append("|");
            var17.append(var1);
            var16.setJade(var3, var4);
            if (!var16.d()) {
               var17.append("-");
               var17.append(var16.toString());
            }
         }

         this.setSuit(var1, var17.toString());
      } else {
         StringBuffer var6;
         (var6 = new StringBuffer()).append(var1);
         var6.append("-");
         var6.append(var2);
         int var7 = --1;

         for(var10000 = var7; var10000 < 6; var10000 = var7) {
            var6.append("_");
            if (var7 == var3) {
               var6.append(var4);
            } else {
               var6.append(3 ^ 3);
            }

            ++var7;
         }

         this.setSuit(var1, var6.toString());
      }
   }

   public String getSuit1() {
      return this.suit1;
   }

   public void setTx(String var1) {
      this.tx = var1;
   }

   public List<RoleTxBean> getTX(int var1, lg var2) {
      ArrayList var4 = new ArrayList();
      String var3;
      if ((var3 = this.getTx()) != null && !var3.equals("")) {
         String[] var7 = var3.split("\\|");

         int var5;
         for(int var10000 = var5 = 2 & 5; var10000 < var7.length; var10000 = var5) {
            if (var7[var5].endsWith("#")) {
               var7[var5] = var7[var5].substring(3 >> 2, var7[var5].length() - (4 ^ 5));
            }

            RoleTxBean var6;
            if ((var6 = var2.bw(Integer.parseInt(var7[var5]))) != null && var1 == var6.getRdType()) {
               var4.add(var6);
            }

            ++var5;
         }

         return var4;
      } else {
         return var4;
      }
   }

   public String getlCard() {
      return this.lCard;
   }

   public String getLabor() {
      return this.labor;
   }

   public void setStarSoulType(int var1, long var2) {
      this.starSoul = el.i(this.starSoul, var1 + "=", "|", var1 + "=" + var2);
   }

   public String getHelpLing() {
      return this.helpLing;
   }

   public void setShortCutSkills(String var1) {
      this.equip = hd.af(this.equip, "JN", "|", var1);
   }

   public void setSuit4(String var1) {
      this.suit4 = var1;
   }

   public void setRecord(String var1) {
      this.record = var1 == null ? null : var1.trim();
   }

   public String getSuit6() {
      return this.suit6;
   }

   public void setOtherValue(String var1, String var2) {
      this.lCard = hd.af(this.lCard, var1, "|", var2);
   }

   public void setHelpLing(String var1) {
      this.helpLing = var1;
   }

   public String getCollect() {
      return this.collect;
   }

   public String getSuit3() {
      return this.suit3;
   }

   public void setSuit2(String var1) {
      this.suit2 = var1;
   }

   public void setSuit11(String var1) {
      this.suit11 = var1;
   }

   public void setCollect(String var1) {
      this.collect = var1;
   }

   public void setSuit5(String var1) {
      this.suit5 = var1;
   }

   public int getSuitNum() {
      return this.suitNum;
   }

   public long getStarSoulType(int var1) {
      String var2;
      return (var2 = el.d(this.starSoul, var1 + "=", "|")) != null && !var2.equals("") ? Long.parseLong(var2) : 0L;
   }

   public BigDecimal[] getBaseValue(int var1, String var2) {
      BigDecimal[] var10000 = new BigDecimal[var1];
      boolean var10002 = true;
      BigDecimal[] var8 = var10000;
      if ((var2 = el.d(this.equip, var2, "|")) != null && !var2.equals("")) {
         int var5 = 2 & 5;
         int var4 = 5 >> 3;
         int var3 = 5 >> 3;
         String var9 = var2;

         while(true) {
            var3 = var9.indexOf("=", var4);
            long var6;
            if ((var6 = Long.parseLong(var2.substring(var4, var3 != -4 >> 2 ? var3 : var2.length()))) != 0L) {
               var8[var5] = new BigDecimal(var6);
            }

            if (var3 == -4 >> 2) {
               break;
            }

            ++var5;
            if (var5 >= var8.length) {
               return var8;
            }

            var4 = var3 + (3 >> 1);
            var9 = var2;
         }
      }

      return var8;
   }

   public String getSuit5() {
      return this.suit5;
   }

   public void setStarSoulType(String var1) {
      int var2 = var1.indexOf("=");
      this.starSoul = el.i(this.starSoul, var1.substring(5 >> 3, var2), "|", var1);
   }

   public int getCollectionNum(PartJade var1, lg var2) {
      int[] var8 = var2.bx((int)var1.getSuitid()).getParts();
      String[] var7;
      if ((var7 = this.getCollect((int)var1.getSuitid())) == null) {
         return 3 & 4;
      } else {
         int var6 = 0;

         int var4;
         for(int var10000 = var4 = 5 >> 3; var10000 < var8.length; var10000 = var4) {
            String var5 = String.valueOf(var8[var4]);

            int var3;
            for(var10000 = var3 = 2 & 5; var10000 < var7.length; var10000 = var3) {
               if (var7[var3].equals(var5)) {
                  ++var6;
                  break;
               }

               ++var3;
            }

            ++var4;
         }

         return var6;
      }
   }

   public void setEquip(BigDecimal[] var1) {
      int var2 = this.getEquipType();
      String var3 = null;
      if (var2 == --1) {
         var3 = "EB";
      } else if (var2 == --2) {
         var3 = "EC";
      } else {
         var3 = "EA";
      }

      StringBuffer var5;
      (var5 = new StringBuffer()).append(var3);
      int var4 = 3 & 4;

      for(int var10000 = var4; var10000 < var1.length; var10000 = var4) {
         if (var4 != 0) {
            var5.append("=");
         }

         var5.append(var1[var4] != null ? var1[var4] : 0);
         ++var4;
      }

      this.equip = el.i(this.equip, var3, "|", var5.toString());
   }

   public void setSuit9(String var1) {
      this.suit9 = var1;
   }

   public void setSuit6(String var1) {
      this.suit6 = var1;
   }

   public String getSuit7() {
      return this.suit7;
   }

   public String getTx() {
      return this.tx;
   }

   public void setSuit3(String var1) {
      this.suit3 = var1;
   }

   public List<String> getPutTX() {
      if (this.tx != null && !this.tx.equals("")) {
         ArrayList var1 = null;
         String[] var2 = this.tx.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].endsWith("#")) {
               if (var1 == null) {
                  var1 = new ArrayList();
               }

               var1.add(var2[var3].substring(3 >> 2, var2[var3].length() - --1));
            }

            ++var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   public int getEquipType() {
      String var1;
      return (var1 = el.d(this.equip, "EO", "|")) != null && !var1.equals("") ? Integer.parseInt(var1) : 0;
   }

   public void setLabortype(String var1) {
      int var2 = var1.indexOf("=");
      this.labor = el.i(this.labor, var1.substring(3 & 4, var2), "|", var1);
   }

   public void setLabor(String var1) {
      this.labor = var1;
   }
}
