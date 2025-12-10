package com.xy.game;

import com.xy.entity.RoleSummoning;
import java.math.BigDecimal;

public class RolePet {
   private int help;
   private BigDecimal id;
   private RoleSummoning pet;
   private int bb2;
   private int bb;
   private int qy;
   private int bb1;

   public BigDecimal getId() {
      return this.id;
   }

   public int getBb() {
      return this.bb;
   }

   public RolePet(BigDecimal var1) {
      this.id = var1;
   }

   public void a(int var1) {
      if ((this.bb = var1) == 0) {
         int var10001 = 3 ^ 3;
         this.bb1 = 5 >> 3;
         this.bb2 = var10001;
      }

   }

   public void setPet(RoleSummoning var1) {
      this.pet = var1;
   }

   public void setHelp(int var1) {
      this.help = var1;
   }

   public void setBb1(int var1) {
      this.bb1 = var1;
   }

   public int getHelp() {
      return this.help;
   }

   public RolePet(String var1) {
      int var4 = var1.indexOf("=");
      this.id = new BigDecimal(var4 != -4 >> 2 ? var1.substring(5 >> 3, var4) : var1);
      if (var4 != -4 >> 2) {
         String var10000 = var1;

         while(true) {
            int var3;
            String var2 = (var3 = var10000.indexOf("=", var4 + --1)) == -4 >> 2 ? var1.substring(var4 + (3 >> 1)) : var1.substring(var4 + --1, var3);
            int var5;
            if (var2.startsWith("H")) {
               var5 = var3;
               this.help = Integer.parseInt(var2.substring(4 ^ 5));
            } else if (var2.startsWith("B")) {
               if (var2.startsWith("BA")) {
                  var5 = var3;
                  this.bb1 = Integer.parseInt(var2.substring(--2));
               } else if (var2.startsWith("BB")) {
                  this.bb2 = Integer.parseInt(var2.substring(1 ^ 3));
                  var5 = var3;
               } else {
                  this.bb = Integer.parseInt(var2.substring(3 & 5));
                  var5 = var3;
               }
            } else {
               if (var2.startsWith("QY")) {
                  this.qy = Integer.parseInt(var2.substring(1 ^ 3));
               }

               var5 = var3;
            }

            if (var5 == -1) {
               return;
            }

            var4 = var3;
            var10000 = var1;
         }
      }
   }

   public int getBb1() {
      return this.bb1;
   }

   public void setBb2(int var1) {
      this.bb2 = var1;
   }

   public int getQy() {
      return this.qy;
   }

   public void setQy(int var1) {
      this.qy = var1;
   }

   public RoleSummoning getPet() {
      return this.pet;
   }

   public int getBb2() {
      return this.bb2;
   }

   public void b(StringBuffer var1) {
      if (var1.length() != 0) {
         var1.append("|");
      }

      var1.append(this.id);
      if (this.help > 0) {
         var1.append("=H");
         var1.append(this.help);
      }

      if (this.bb > 0) {
         var1.append("=B");
         var1.append(this.bb);
      }

      if (this.bb1 > 0) {
         var1.append("=BA");
         var1.append(this.bb1);
      }

      if (this.bb2 > 0) {
         var1.append("=BB");
         var1.append(this.bb2);
      }

      if (this.qy > 0) {
         var1.append("=QY");
         var1.append(this.qy);
      }

   }

   public void setBb(int var1) {
      this.bb = var1;
   }

   public void setId(BigDecimal var1) {
      this.id = var1;
   }
}
