package com.xy.readbean;

public class Buff {
   private String bValue;
   private int bLvl;
   private int bType;
   private String bName;
   private int bId;
   private String bText;

   public String getColor() {
      if (this.bLvl == 0) {
         return "#G";
      } else if (this.bLvl == 3 >> 1) {
         return "#B";
      } else if (this.bLvl == --2) {
         return "#c800080";
      } else {
         return this.bLvl == --3 ? "#cFF7F00" : "#R";
      }
   }

   public void setbLvl(int var1) {
      this.bLvl = var1;
   }

   public void setbType(int var1) {
      this.bType = var1;
   }

   public int getbType() {
      return this.bType;
   }

   public String getbValue() {
      return this.bValue;
   }

   public void setbValue(String var1) {
      this.bValue = var1;
   }

   public void setbId(int var1) {
      this.bId = var1;
   }

   public void setbText(String var1) {
      this.bText = var1;
   }

   public String getColorName() {
      return this.getColor() + this.bName + "#Y";
   }

   public int getbLvl() {
      return this.bLvl;
   }

   public void setbName(String var1) {
      this.bName = var1;
   }

   public String getbText() {
      return this.bText;
   }

   public int getbId() {
      return this.bId;
   }

   public String getbName() {
      return this.bName;
   }
}
