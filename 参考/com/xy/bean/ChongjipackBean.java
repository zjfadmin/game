package com.xy.bean;

import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChongjipackBean {
   private Integer packtype;
   private Integer canpaymoney;
   private String packgrade;
   private Point pointLvl;
   private String datetime;
   private Integer id;
   private static final long serialVersionUID = 203745024714917095L;
   private String packname;
   private String packgoods;
   private Integer getnumber;
   private Integer packgradetype;
   private String huitime;

   public String getPackgoods() {
      return this.packgoods;
   }

   public String getPackname() {
      return this.packname;
   }

   public Integer getCanpaymoney() {
      return this.canpaymoney;
   }

   public Point getPointLvl() {
      return this.pointLvl;
   }

   public void setDatetime(String var1) {
      this.datetime = var1;
   }

   public String getHuitime() {
      return this.huitime;
   }

   public void setPackgoods(String var1) {
      this.packgoods = var1;
   }

   public Integer getPackgradetype() {
      return this.packgradetype;
   }

   public void setPackgrade(String var1) {
      this.packgrade = var1;
   }

   public void setGetnumber(Integer var1) {
      this.getnumber = var1;
   }

   public void setCanpaymoney(Integer var1) {
      this.canpaymoney = var1;
   }

   public void setPackgradetype(Integer var1) {
      this.packgradetype = var1;
   }

   public void setHuitime(String var1) {
      this.huitime = var1;
   }

   public void setPointLvl(Point var1) {
      this.pointLvl = var1;
   }

   public String toString() {
      return "ChongjipackBean [id=" + this.id + ", packtype=" + this.packtype + ", packgradetype=" + this.packgradetype + ", packgrade=" + this.packgrade + ", packgoods=" + this.packgoods + ", getnumber=" + this.getnumber + ", datetime=" + this.datetime + ", canpaymoney=" + this.canpaymoney + ", huitime=" + this.huitime + "]";
   }

   public static List<XXGDBean> getGoodsImpactGrade(String var0) {
      String[] var1 = var0.split("=");
      ArrayList var2 = new ArrayList();
      var1 = var1[3 >> 1].split("&");

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < var1.length; var10000 = var3) {
         String[] var4 = var1[var3].split("\\$");
         XXGDBean var5 = new XXGDBean();
         int var10004 = 2 ^ 3;
         var5.setId(new BigDecimal(var4[3 ^ 3]));
         String var10003 = var4[var10004];
         ++var3;
         var5.setSum(Integer.parseInt(var10003));
         var2.add(var5);
      }

      return var2;
   }

   public void setPacktype(Integer var1) {
      this.packtype = var1;
   }

   public static List<XXGDBean> getGoods(String var0) {
      String[] var4 = var0.split("\\|");
      ArrayList var5 = new ArrayList();

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < var4.length; var10000 = var3) {
         String[] var1;
         XXGDBean var2;
         int var10004;
         if ((var1 = var4[var3].split("=")[2 ^ 3].split("&"))[3 >> 2].equals("0")) {
            var1 = var1[4 ^ 5].split("\\$");
            var2 = new XXGDBean();
            var10004 = 5 >> 1;
            int var10007 = --1;
            var2.setId(new BigDecimal(var1[5 >> 3]));
            var2.setSum(Integer.parseInt(var1[var10007]));
            var2.setTag(Long.parseLong(var1[var10004]));
            var5.add(var2);
         } else {
            var1 = var1[1].split("\\$");
            var2 = new XXGDBean();
            var10004 = --1;
            var2.setId(new BigDecimal(var1[3 & 4]));
            var2.setSum(Integer.parseInt(var1[var10004]));
            var5.add(var2);
         }

         ++var3;
      }

      return var5;
   }

   public void setPackname(String var1) {
      this.packname = var1;
   }

   public void setId(Integer var1) {
      this.id = var1;
   }

   public String getDatetime() {
      return this.datetime;
   }

   public String getPackgrade() {
      return this.packgrade;
   }

   public Integer getPacktype() {
      return this.packtype;
   }

   public Integer getId() {
      return this.id;
   }

   public Integer getGetnumber() {
      return this.getnumber;
   }
}
