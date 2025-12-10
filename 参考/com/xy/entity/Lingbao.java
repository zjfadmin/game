package com.xy.entity;

import com.xy.W;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Lingbao {
   private String skills;
   private BigDecimal roleid;
   private int skillsum;
   private String baoname;
   private BigDecimal lingbaolvl;
   private String baoap;
   private String resistshot;
   private String baoquality;
   private BigDecimal baoid;
   private String baoshot;
   private String assistance;
   private int equipment;
   private String baotype;
   private String tianfuskill;
   private String baospeed;
   private String fushis;
   private String kangxing;
   private String gethard;
   private String goodskill;
   private BigDecimal lingbaoexe;
   private int fusum;
   private String baoreply;
   private long lingbaoqihe;
   private String skin;
   private String operation;
   private Integer baoactive;

   public String getTianfuskill() {
      return this.tianfuskill;
   }

   public double getBaoshot() {
      return Double.parseDouble(this.baoshot);
   }

   public String a(int var1) {
      String[] var2;
      return this.skills != null && !this.skills.equals("") && (var2 = this.skills.split("\\|")).length > var1 ? var2[var1] : null;
   }

   public double getAssistance() {
      return Double.parseDouble(this.assistance);
   }

   public void setFusum(int var1) {
      this.fusum = var1;
   }

   public int b(int var1) {
      return this.skillsum <= var1 ? this.skillsum + (4 ^ 5) : -1;
   }

   public void setEquipment(int var1) {
      this.equipment = var1;
   }

   public void setTianfuskill(String var1) {
      this.tianfuskill = var1;
   }

   public int getEquipment() {
      return this.equipment;
   }

   public int getFusum() {
      return this.fusum;
   }

   public void setBaoquality(String var1) {
      this.baoquality = var1;
   }

   public boolean c(Skill var1, GameView var2) {
      int var3;
      int var8;
      if ((var3 = Integer.parseInt(var1.getSkilltype())) == 0 && !this.baotype.equals("攻击")) {
         var8 = 3 & 4;
         var2.f("学习技能失败,无法学习该类型的技能");
         return (boolean)var8;
      } else if (var3 == (4 ^ 5) && !this.baotype.equals("辅助")) {
         var8 = 3 ^ 3;
         var2.f("学习技能失败,无法学习该类型的技能");
         return (boolean)var8;
      } else if (var3 == (1 ^ 3) && !this.baotype.equals("落宝")) {
         var8 = 5 >> 3;
         var2.f("学习技能失败,无法学习该类型的技能");
         return (boolean)var8;
      } else {
         String var6 = var1.getSkillname();
         String var7 = var1.getSkilllevel();
         var3 = Integer.parseInt(var7.substring(3 ^ 3, 4 ^ 5));
         int var4 = Integer.parseInt(var7.substring(4 ^ 5, --2));
         if ((this.skills == null || this.skills.equals("")) && this.skillsum > 0) {
            var8 = --1;
            this.skills = var6 + "=" + (W.c.nextInt(var4 - var3 + --1) + var3);
            return (boolean)var8;
         } else if (this.skills != null && !this.skills.equals("") && this.skillsum > this.skills.split("\\|").length) {
            String[] var5 = this.skills.split("\\|");
            var3 += W.c.nextInt(var4 - var3 + (3 >> 1));
            var6 = var6 + "=" + var3;

            for(var8 = var3 = 2 & 5; var8 < var5.length; var8 = var3) {
               if (var5[var3].equals(var6)) {
                  var8 = 3 & 4;
                  var2.f("学习技能失败,技能重复");
                  return (boolean)var8;
               }

               ++var3;
            }

            var8 = 3 >> 1;
            this.skills = this.skills + "|" + var6;
            return (boolean)var8;
         } else {
            var2.f("学习技能失败,技能格子已满");
            return (boolean)(5 >> 3);
         }
      }
   }

   public BigDecimal getLingbaolvl() {
      return this.lingbaolvl;
   }

   public void setResistshop(String var1) {
      this.resistshot = var1;
   }

   public String getBaoreply() {
      return this.baoreply;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public void setBaospeed(String var1) {
      this.baospeed = var1;
   }

   public BigDecimal getLingbaoexe() {
      return this.lingbaoexe;
   }

   public String getSkin() {
      return this.skin;
   }

   public BigDecimal d(int var1) {
      String[] var2;
      return this.fushis != null && !this.fushis.equals("") && (var2 = this.fushis.split("\\|")).length > var1 ? new BigDecimal(var2[var1]) : null;
   }

   public void setSkills(String var1) {
      this.skills = var1;
   }

   public void setBaotype(String var1) {
      this.baotype = var1;
   }

   public void setBaoactive(Integer var1) {
      this.baoactive = var1;
   }

   public String getBaospeed() {
      return this.baospeed;
   }

   public void setOperation(String var1) {
      this.operation = var1;
   }

   public void e(boolean var1) {
      if (var1) {
         this.fusum += 5 >> 2;
      } else {
         this.skillsum += 3 >> 1;
      }
   }

   public void setBaoname(String var1) {
      this.baoname = var1;
   }

   public double getResistshop() {
      return Double.parseDouble(this.resistshot);
   }

   public void setAssistance(String var1) {
      this.assistance = var1;
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public int getSkillsum() {
      return this.skillsum;
   }

   public void setKangxing(String var1) {
      this.kangxing = var1;
   }

   public void setGoodskill(String var1) {
      this.goodskill = var1;
   }

   public void f(String var1) {
      ArrayList var4 = new ArrayList();
      int var5 = 3 >> 1;
      int var10000;
      int var3;
      if (this.fushis != null && !this.fushis.equals("")) {
         String[] var2 = this.fushis.split("\\|");

         for(var10000 = var3 = 3 ^ 3; var10000 < var2.length; var10000 = var3) {
            if (!var2[var3].equals(var1)) {
               var4.add(var2[var3]);
            } else {
               var5 = 0;
            }

            ++var3;
         }
      }

      if (var5 != 0) {
         var4.add(var1);
      }

      StringBuffer var6 = new StringBuffer();

      for(var10000 = var3 = 3 >> 2; var10000 < var4.size(); var10000 = var3) {
         if (!var6.toString().equals("")) {
            var6.append("|" + (String)var4.get(var3));
         } else {
            var6.append((String)var4.get(var3));
         }

         ++var3;
      }

      this.fushis = var6.toString();
   }

   public String getBaoquality() {
      return this.baoquality;
   }

   public void setFushis(String var1) {
      this.fushis = var1;
   }

   public String getBaotype() {
      return this.baotype;
   }

   public String getOperation() {
      return this.operation;
   }

   public Integer getBaoactive() {
      return this.baoactive;
   }

   public void setBaoap(String var1) {
      this.baoap = var1;
   }

   public void setLingbaolvl(BigDecimal var1) {
      this.lingbaolvl = var1;
   }

   public BigDecimal getBaoid() {
      return this.baoid;
   }

   public boolean g(String var1) {
      if (this.goodskill != null && !this.goodskill.equals("")) {
         String[] var2 = this.goodskill.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].equals(var1)) {
               return (boolean)(4 ^ 5);
            }

            ++var3;
         }

         return (boolean)(2 & 5);
      } else {
         return false;
      }
   }

   public void setBaoshot(String var1) {
      this.baoshot = var1;
   }

   public void setSkillsum(int var1) {
      this.skillsum = var1;
   }

   public String h(int var1) {
      String[] var2;
      return this.skills != null && !this.skills.equals("") && (var2 = this.skills.split("\\|")).length > var1 ? var2[var1] : null;
   }

   public void setGethard(String var1) {
      this.gethard = var1;
   }

   public void setBaoid(BigDecimal var1) {
      this.baoid = var1;
   }

   public String getFushis() {
      return this.fushis;
   }

   public String getGethard() {
      return this.gethard;
   }

   public String getGoodskill() {
      return this.goodskill;
   }

   public void setLingbaoqihe(long var1) {
      this.lingbaoqihe = var1;
   }

   public void setLingbaoexe(BigDecimal var1) {
      this.lingbaoexe = var1;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public String getBaoname() {
      return this.baoname;
   }

   public String getBaoap() {
      return this.baoap;
   }

   public void setBaoreply(String var1) {
      this.baoreply = var1;
   }

   public int i(int var1) {
      return this.fusum <= var1 ? this.fusum + (2 ^ 3) : -1;
   }

   public String getKangxing() {
      return this.kangxing;
   }

   public long getLingbaoqihe() {
      return this.lingbaoqihe;
   }

   public String getSkills() {
      return this.skills;
   }
}
