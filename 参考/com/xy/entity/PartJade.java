package com.xy.entity;

public class PartJade {
   private int jade4;
   private int jade5;
   private int jade1;
   private long suitid;
   private int partId;
   private int jade2;
   private int jade3;

   public long getSuitid() {
      return this.suitid;
   }

   public int getJade(int var1) {
      int var2 = 2 & 5;
      switch(var1) {
      case 1:
         while(false) {
         }

         return this.jade1;
      case 2:
         return this.jade2;
      case 3:
         return this.jade3;
      case 4:
         return this.jade4;
      case 5:
         var2 = this.jade5;
      default:
         return var2;
      }
   }

   public int getJade4() {
      return this.jade4;
   }

   public void setJade(int var1, int var2) {
      switch(var1) {
      case 1:
         while(false) {
         }

         this.jade1 += var2;
         return;
      case 2:
         this.jade2 += var2;
         return;
      case 3:
         this.jade3 += var2;
         return;
      case 4:
         this.jade4 += var2;
         return;
      case 5:
         this.jade5 += var2;
      default:
      }
   }

   public int getJade3() {
      return this.jade3;
   }

   public void setSuitid(long var1) {
      this.suitid = var1;
   }

   public void setJade3(int var1) {
      this.jade3 = var1;
   }

   public String toString() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append(this.partId);
      var1.append("_");
      var1.append(this.jade1);
      var1.append("_");
      var1.append(this.jade2);
      var1.append("_");
      var1.append(this.jade3);
      var1.append("_");
      var1.append(this.jade4);
      var1.append("_");
      var1.append(this.jade5);
      return var1.toString();
   }

   public void a(PartJade var1) {
      this.suitid = var1.suitid;
      this.partId = var1.partId;
      this.jade1 = var1.jade1;
      this.jade2 = var1.jade2;
      this.jade3 = var1.jade3;
      this.jade4 = var1.jade4;
      this.jade5 = var1.jade5;
   }

   public void b(int var1, int var2) {
      switch(var1) {
      case 1:
         while(false) {
         }

         this.jade1 -= var2;
         if (this.jade1 < 0) {
            this.jade1 = 2 & 5;
            return;
         }
         break;
      case 2:
         this.jade2 -= var2;
         if (this.jade2 < 0) {
            this.jade2 = 2 & 5;
            return;
         }
         break;
      case 3:
         this.jade3 -= var2;
         if (this.jade3 < 0) {
            this.jade3 = 3 & 4;
            return;
         }
         break;
      case 4:
         this.jade4 -= var2;
         if (this.jade4 < 0) {
            this.jade4 = 5 >> 3;
            return;
         }
         break;
      case 5:
         this.jade5 -= var2;
         if (this.jade5 < 0) {
            this.jade5 = 3 & 4;
         }
      }

   }

   public void setPartId(int var1) {
      this.partId = var1;
   }

   public int getJade5() {
      return this.jade5;
   }

   public void c(String[] var1) {
      int var10002 = --5;
      int var10004 = --4;
      int var10008 = --3;
      int var10011 = 5 >> 1;
      this.jade1 = Integer.parseInt(var1[2 ^ 3]);
      this.jade2 = Integer.parseInt(var1[var10011]);
      this.jade3 = Integer.parseInt(var1[var10008]);
      this.jade4 = Integer.parseInt(var1[var10004]);
      this.jade5 = Integer.parseInt(var1[var10002]);
   }

   public void setJade1(int var1) {
      this.jade1 = var1;
   }

   public void setJade2(int var1) {
      this.jade2 = var1;
   }

   public boolean d() {
      return this.jade1 <= 0 && this.jade2 <= 0 && this.jade3 <= 0 && this.jade4 <= 0 && this.jade5 <= 0;
   }

   public int getJade1() {
      return this.jade1;
   }

   public void setJade5(int var1) {
      this.jade5 = var1;
   }

   public int getJade2() {
      return this.jade2;
   }

   public void setJade4(int var1) {
      this.jade4 = var1;
   }

   public int getPartId() {
      return this.partId;
   }

   public PartJade(long var1, int var3) {
      this.suitid = var1;
      this.partId = var3;
   }
}
