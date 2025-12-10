package com.xy.readbean;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskTQ {
   private boolean jk;
   private int buyNum;
   private int limitNum;
   private int receiveNum;
   private List<TaskBuy> buyList;

   public void setBuyList(List<TaskBuy> var1) {
      this.buyList = var1;
   }

   public void setBuyNum(int var1) {
      this.buyNum = var1;
   }

   public void setLimitNum(int var1) {
      this.limitNum = var1;
   }

   public int getReceiveNum() {
      return this.receiveNum;
   }

   public int getLimitNum() {
      return this.limitNum;
   }

   public void setJk(boolean var1) {
      this.jk = var1;
   }

   public TaskBuy getTaskBuy(int var1) {
      if (this.buyList != null && var1 >= 0 && var1 < this.buyNum) {
         Iterator var3;
         for(Iterator var10000 = var3 = this.buyList.iterator(); var10000.hasNext(); var10000 = var3) {
            TaskBuy var2 = (TaskBuy)var3.next();
            if ((var1 -= var2.getNum()) < 0) {
               return var2;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean a() {
      return this.jk;
   }

   public void setReceiveNum(int var1) {
      this.receiveNum = var1;
   }

   public TaskTQ(String var1) {
      String[] var6 = var1.split("\\|");

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < var6.length; var10000 = var2) {
         int var3 = var6[var2].indexOf("=");
         String var4;
         if ((var4 = var6[var2].substring(5 >> 3, var3 != -4 >> 2 ? var3 : var6[var2].length())).equals("增加次数设置")) {
            var3 = var6[var2].indexOf("#", var4.length() + (3 & 5));
            this.limitNum = Integer.parseInt(var6[var2].substring(var4.length() + (3 >> 1), var3));
            this.receiveNum = Integer.parseInt(var6[var2].substring(var3 + (4 ^ 5)));
         } else if (var4.equals("季卡特权")) {
            this.jk = (boolean)(--1);
         } else if (var4.endsWith("购买")) {
            TaskBuy var5 = new TaskBuy();
            var5.setType(var4.substring(2 & 5, var4.length() - --2));
            var3 = var6[var2].indexOf("#", var4.length() + (5 >> 2));
            var5.setMoney(Long.parseLong(var6[var2].substring(var4.length() + (3 & 5), var3 != -4 >> 2 ? var3 : var6[var2].length())));
            var5.setNum(var3 != -4 >> 2 ? Integer.parseInt(var6[var2].substring(var3 + (4 ^ 5))) : 1);
            if (var5.getNum() <= 0) {
               var5.setNum(4 ^ 5);
            }

            this.buyNum += var5.getNum();
            if (this.buyList == null) {
               this.buyList = new LinkedList();
            }

            this.buyList.add(var5);
         }

         ++var2;
      }

      if (this.limitNum < 0) {
         this.limitNum = 5 >> 3;
      }

      if (this.receiveNum < 0) {
         this.receiveNum = 3 ^ 3;
      }

      if (this.limitNum == 0 && this.receiveNum == 0) {
         this.buyNum = this.jk = (boolean)(3 >> 2);
         this.buyList = null;
      }

   }

   public List<TaskBuy> getBuyList() {
      return this.buyList;
   }

   public int getBuyNum() {
      return this.buyNum;
   }
}
