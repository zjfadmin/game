package com.xy.readbean;

public class Door {
   private String doorpoint;
   private String doormap;
   private int[] rects;
   private String doorkey;
   private String doorid;
   private String doorrect;

   public String getDoorrect() {
      return this.doorrect;
   }

   public void setDoormap(String var1) {
      this.doormap = var1;
   }

   public void setDoorkey(String var1) {
      this.doorkey = var1;
   }

   public int[] getRects() {
      if (this.rects == null && this.doorrect != null) {
         if (!this.doorrect.equals("") && !this.doorrect.equals("0|0|0|0")) {
            String[] var1 = this.doorrect.split("\\|");
            int[] var10001 = new int[--4];
            boolean var10003 = true;
            this.rects = var10001;

            int var2;
            for(int var10000 = var2 = 3 ^ 3; var10000 < this.rects.length; var10000 = var2) {
               int[] var3 = this.rects;
               int var4 = var2;
               int var10002 = Math.abs(Integer.parseInt(var1[var2]));
               ++var2;
               var3[var4] = var10002;
            }
         }

         this.doorrect = null;
      }

      return this.rects;
   }

   public String getDoorid() {
      return this.doorid;
   }

   public String getDoorpoint() {
      return this.doorpoint;
   }

   public String getDoorkey() {
      return this.doorkey;
   }

   public void setDoorpoint(String var1) {
      this.doorpoint = var1;
   }

   public String getDoormap() {
      return this.doormap;
   }

   public void setDoorrect(String var1) {
      this.doorrect = var1;
   }

   public void setDoorid(String var1) {
      this.doorid = var1;
   }

   public void setRects(int[] var1) {
      this.rects = var1;
   }
}
