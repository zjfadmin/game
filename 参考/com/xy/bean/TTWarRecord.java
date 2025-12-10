package com.xy.bean;

public class TTWarRecord {
   private boolean TTDraw;
   private int TTRank;
   private int TTCZ;
   private int TTJF;
   private int TTSJ;
   private int TTSL;

   public void setTTDraw(boolean var1) {
      this.TTDraw = var1;
   }

   public int getTTCZ() {
      return this.TTCZ;
   }

   public int getTTRank() {
      return this.TTRank;
   }

   public int getTTSJ() {
      return this.TTSJ;
   }

   public int getTTJF() {
      return this.TTJF;
   }

   public TTWarRecord(String var1) {
      String var10005 = var1;
      String var10007 = var1;
      super();
      int var2 = var1.indexOf("=");
      this.TTSJ = Integer.parseInt(var10007.substring(3 >> 2, var2));
      String[] var3;
      this.TTCZ = Integer.parseInt((var3 = var10005.substring(var2 + (3 & 5)).split("&"))[5 >> 3]);
      this.TTSL = Integer.parseInt(var3[3 >> 1]);
      this.TTJF = Integer.parseInt(var3[1 ^ 3]);
      this.TTRank = Integer.parseInt(var3[--3]);
      this.TTDraw = (boolean)(var3[--4].equals("0") ? 3 ^ 3 : 1);
   }

   public String toString() {
      return this.TTCZ + "&" + this.TTSL + "&" + this.TTJF + "&" + this.TTRank + "&" + (this.TTDraw ? 2 ^ 3 : 0);
   }

   public boolean a() {
      return this.TTDraw;
   }

   public int getTTSL() {
      return this.TTSL;
   }
}
