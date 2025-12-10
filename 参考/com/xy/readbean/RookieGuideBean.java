package com.xy.readbean;

public class RookieGuideBean {
   private String Bootcontent;
   private String Guidename;
   private int Gid;
   private int Fid;

   public String getBootcontent() {
      return this.Bootcontent;
   }

   public String getGuidename() {
      return this.Guidename;
   }

   public void setFid(int var1) {
      this.Fid = var1;
   }

   public void setGuidename(String var1) {
      this.Guidename = var1;
   }

   public void setBootcontent(String var1) {
      this.Bootcontent = var1;
   }

   public int getFid() {
      return this.Fid;
   }

   public void setGid(int var1) {
      this.Gid = var1;
   }

   public int getGid() {
      return this.Gid;
   }
}
