package com.xy.readbean;

public class RoleTxBean {
   private int RdId;
   private String RdName;
   private int RdType;
   private int Gid;
   private String RdAsk;
   private int RdStatues;

   public void setRdStatues(int var1) {
      this.RdStatues = var1;
   }

   public int getGid() {
      return this.Gid;
   }

   public int getRdType() {
      return this.RdType;
   }

   public void setRdType(int var1) {
      this.RdType = var1;
   }

   public String getRdName() {
      return this.RdName;
   }

   public int getRdId() {
      return this.RdId;
   }

   public void setGid(int var1) {
      this.Gid = var1;
   }

   public String getRdAsk() {
      return this.RdAsk;
   }

   public int getRdStatues() {
      return this.RdStatues;
   }

   public void setRdAsk(String var1) {
      this.RdAsk = var1;
   }

   public void setRdId(int var1) {
      this.RdId = var1;
   }

   public void setRdName(String var1) {
      this.RdName = var1;
   }
}
