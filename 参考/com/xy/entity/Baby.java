package com.xy.entity;

import com.xy.em;
import com.xy.hd;
import com.xy.formula.BaseEquip;
import com.xy.formula.BaseQl;
import com.xy.formula.BaseValue;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.math.BigDecimal;
import java.util.Map;

public class Baby {
   private Integer qingmi;
   private Integer wanxing;
   private Integer panni;
   private Integer daode;
   private String outcome;
   private Integer naili;
   private BigDecimal babyid;
   private Integer mingqi;
   private String babyname;
   private BigDecimal roleid;
   private Integer xiaoxin;
   private Integer qizhi;
   private Integer babyage;
   private Integer pilao;
   private Integer wenbao;
   private Integer yangyujin;
   private Integer neili;
   private String Talents;
   private String parts;
   private Integer childSex;
   private Integer zhili;

   public Integer getXiaoxin() {
      return this.xiaoxin;
   }

   public void setDaode(Integer var1) {
      this.daode = var1;
   }

   public Map<String, Double> getBabyMap(RoleData var1) {
      Map var10 = em.e();

      int var3;
      double var4;
      int var10000;
      for(var10000 = var3 = 2 ^ 3; var10000 <= 10; var10000 = var3) {
         var4 = 0.0D;
         double var22;
         if (var3 == 5 >> 2) {
            var22 = var4 = (double)this.getQizhi();
         } else if (var3 == --2) {
            var22 = var4 = (double)this.getNeili();
         } else if (var3 == --3) {
            var22 = var4 = (double)this.getZhili();
         } else if (var3 == --4) {
            var22 = var4 = (double)this.getNaili();
         } else if (var3 == --5) {
            var22 = var4 = (double)this.getMingqi();
         } else if (var3 == (94 & 39)) {
            var22 = var4 = (double)this.getDaode();
         } else if (var3 == (127 & 7)) {
            var22 = var4 = (double)this.getPanni();
         } else if (var3 == (110 & 25)) {
            var22 = var4 = (double)this.getWanxing();
         } else if (var3 == (109 & 27)) {
            var22 = var4 = (double)this.getQingmi();
         } else {
            if (var3 == (78 & 59)) {
               var4 = (double)this.getXiaoxin();
            }

            var22 = var4;
         }

         if (var22 != 0.0D) {
            var10.put(BaseValue.babyKeys[var3], var4);
         }

         ++var3;
      }

      var3 = 3 ^ 3;
      int var19 = 3 & 4;
      int var5 = 3 ^ 3;

      int var2;
      int var6;
      for(var10000 = var6 = 3 >> 2; var10000 < this.parts.length(); var10000 = var6) {
         if ((var6 = this.parts.indexOf("|", var5 + --1)) == -4 >> 2) {
            var6 = this.parts.length();
         }

         long var7;
         Goodstable var9 = (var7 = hd.q(this.parts, var5, var6)) > 0L ? var1.getGoodEquip(new BigDecimal(var7)) : null;
         if (var9 == null) {
            var10000 = var6;
         } else {
            BaseEquip var17;
            var2 = (var17 = new BaseEquip(var9.getValue(), var9.getType(), var1.getObjectArea(), var1)).getQls() != null ? var17.getQls().size() - --1 : -1;

            BaseQl var11;
            String var10001;
            for(var10000 = var2; var10000 >= 0; var10000 = var2) {
               var11 = (BaseQl)var17.getQls().get(var2);
               var10001 = var11.getKey();
               --var2;
               PropertyUtil.d(var10, var10001, var11.getValue());
            }

            var2 = var17.getQlews() != null ? var17.getQlews().size() - --1 : -1;

            for(var10000 = var2; var10000 >= 0; var10000 = var2) {
               var11 = (BaseQl)var17.getQlews().get(var2);
               var10001 = var11.getKey();
               --var2;
               PropertyUtil.d(var10, var10001, var11.getValue());
            }

            var10000 = var6;
         }

         ++var19;
         var5 = var10000 + 1;
      }

      var4 = 0.0D;
      double var18 = 0.0D;
      double var8 = 0.0D;
      var3 = 3 & 4;

      for(var10000 = var2 = --1; var10000 <= 8; var10000 = var2) {
         Double var20;
         if ((var20 = (Double)var10.get(BaseValue.babyKeys[var2])) != null) {
            if (var2 >= (3 & 5) && var2 <= (47 & 87)) {
               var4 += var20;
               ++var8;
               var3 |= (2 ^ 3) << var2;
            } else if (var2 == (13 & 122)) {
               var18 -= var20 * 20.0D;
            }
         }

         ++var2;
      }

      for(var10000 = var2 = 3 ^ 3; (double)var10000 < var8; var10000 = var2) {
         int var21 = 0;
         double var12 = 0.0D;

         int var16;
         for(var10000 = var16 = --1; var10000 <= 7; var10000 = var16) {
            if ((var3 >> var16 & --1) == --1) {
               double var14 = (Double)var10.get(BaseValue.babyKeys[var16]);
               if (var21 == 0 || var14 > var12) {
                  var21 = var16;
                  var12 = var14;
               }
            }

            ++var16;
         }

         var3 &= 5 >> 2 << var21 ^ -4 >> 2;
         double var23 = Math.pow(var12, 0.2D);
         double var10002 = (double)BaseValue.babyTotal3XS[var2];
         ++var2;
         var18 += var23 * var10002;
      }

      var10.put(BaseValue.babyTotal1, var4);
      var10.put(BaseValue.babyTotal3, Math.max(var18, 0.0D));
      return var10;
   }

   public Integer getYangyujin() {
      return this.yangyujin;
   }

   public boolean a(int var1, String var2) {
      String[] var4 = this.getTalents().split("\\|");

      int var10000;
      int var3;
      for(var10000 = var3 = 2 & 5; var10000 < var4.length; var10000 = var3) {
         if (var4[var3].split("=")[3 & 4].equals(var2)) {
            return (boolean)(3 ^ 3);
         }

         ++var3;
      }

      var4[var1] = var2 + "=1";
      StringBuffer var5 = new StringBuffer();
      var10000 = --1;
      var5.append(var4[5 >> 3]);
      var5.append("|");
      var5.append(var4[2 ^ 3]);
      var5.append("|");
      var5.append(var4[5 >> 1]);
      this.Talents = var5.toString();
      return (boolean)var10000;
   }

   public BigDecimal b(BigDecimal var1, int var2) {
      BigDecimal[] var3;
      BigDecimal[] var10000 = var3 = this.getpartAll();
      BigDecimal var4 = var10000[var2];
      var10000[var2] = var1;
      StringBuffer var5 = new StringBuffer();

      for(int var6 = var2 = 2 & 5; var6 < var3.length; var6 = var2) {
         if (var2 != 0) {
            var5.append("|");
         }

         var5.append(var3[var2++]);
      }

      this.parts = var5.toString();
      return var4;
   }

   public Integer getChildSex() {
      return this.childSex;
   }

   public void setChildSex(Integer var1) {
      this.childSex = var1;
   }

   public void setZhili(Integer var1) {
      this.zhili = var1;
   }

   public void setBabyage(Integer var1) {
      this.babyage = var1;
   }

   public String getParts() {
      if (this.parts == null || this.parts.equals("")) {
         this.parts = "-1|-1|-1|-1";
      }

      return this.parts;
   }

   public String getTalents() {
      return this.Talents != null && !this.Talents.equals("") ? this.Talents : "1=1|2=1|3=1";
   }

   public Integer getPanni() {
      return this.panni;
   }

   public Integer getPilao() {
      return this.pilao;
   }

   public void setNaili(Integer var1) {
      this.naili = var1;
   }

   public void setBabyid(BigDecimal var1) {
      this.babyid = var1;
   }

   public Integer getNaili() {
      return this.naili;
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public BigDecimal getBabyid() {
      return this.babyid;
   }

   public void setYangyujin(Integer var1) {
      this.yangyujin = var1;
   }

   public void setNeili(Integer var1) {
      this.neili = var1;
   }

   public BigDecimal[] getpartAll() {
      BigDecimal[] var10000 = new BigDecimal[--4];
      boolean var10002 = true;
      BigDecimal[] var1 = var10000;
      String[] var2 = this.getParts().split("\\|");

      int var3;
      for(int var4 = var3 = 3 >> 2; var4 < 4; var4 = var3) {
         if (var3 < var2.length) {
            var1[var3] = new BigDecimal(var2[var3]);
         } else {
            var1[var3] = new BigDecimal(-4 >> 2);
         }

         ++var3;
      }

      return var1;
   }

   public Integer getNeili() {
      return this.neili;
   }

   public Integer getQizhi() {
      return this.qizhi;
   }

   public void setParts(String var1) {
      this.parts = var1;
   }

   public Integer getBabyage() {
      return this.babyage;
   }

   public void setPanni(Integer var1) {
      this.panni = var1;
   }

   public String getBabyname() {
      return this.babyname;
   }

   public Integer getQingmi() {
      return this.qingmi;
   }

   public void setBabyname(String var1) {
      this.babyname = var1;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public void setWanxing(Integer var1) {
      this.wanxing = var1;
   }

   public Integer getDaode() {
      return this.daode;
   }

   public void setXiaoxin(Integer var1) {
      this.xiaoxin = var1;
   }

   public void setOutcome(String var1) {
      this.outcome = var1;
   }

   public void setMingqi(Integer var1) {
      this.mingqi = var1;
   }

   public void setQizhi(Integer var1) {
      this.qizhi = var1;
   }

   public void setQingmi(Integer var1) {
      this.qingmi = var1;
   }

   public void setWenbao(Integer var1) {
      this.wenbao = var1;
   }

   public void setTalents(String var1) {
      this.Talents = var1;
   }

   public Integer getMingqi() {
      return this.mingqi;
   }

   public BigDecimal getpart(int var1) {
      String[] var2 = this.getParts().split("\\|");
      return var1 < var2.length ? new BigDecimal(var2[var1]) : new BigDecimal(-4 >> 2);
   }

   public String getOutcome() {
      return this.outcome;
   }

   public void setPilao(Integer var1) {
      this.pilao = var1;
   }

   public Integer getZhili() {
      return this.zhili;
   }

   public Integer getWenbao() {
      return this.wenbao;
   }

   public Integer getWanxing() {
      return this.wanxing;
   }
}
