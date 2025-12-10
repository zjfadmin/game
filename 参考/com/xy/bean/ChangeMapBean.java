package com.xy.bean;

public class ChangeMapBean {
   private int mapx;
   private int mapy;
   private int type;
   private String mapid;

   public int getMapy() {
      return this.mapy;
   }

   public String getMapid() {
      return this.mapid;
   }

   public int getMapx() {
      return this.mapx;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setMapy(int var1) {
      this.mapy = var1;
   }

   public void setMapx(int var1) {
      this.mapx = var1;
   }

   public int getType() {
      return this.type;
   }

   public void setMapid(String var1) {
      this.mapid = var1;
   }
}
