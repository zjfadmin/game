package com.xy.readbean;

import com.xy.formula.BaseSkill;

public class RoleSuitBean {
   private transient BaseSkill[] Suits;
   private String HaveSkill;
   private String Sname;
   private int Sysex;
   private String Introduce;
   private transient int[] parts;
   private String HaveParts;
   private int SuitID;

   public void setSuitID(int var1) {
      this.SuitID = var1;
   }

   public int getSuitID() {
      return this.SuitID;
   }

   public void setSysex(int var1) {
      this.Sysex = var1;
   }

   public int getSysex() {
      return this.Sysex;
   }

   public void setSname(String var1) {
      this.Sname = var1;
   }

   public void setIntroduce(String var1) {
      this.Introduce = var1;
   }

   public BaseSkill[] getSuits() {
      if (this.HaveSkill != null && !this.HaveSkill.equals("")) {
         String[] var1;
         BaseSkill[] var10001 = new BaseSkill[(var1 = this.HaveSkill.split("\\|")).length];
         boolean var10003 = true;
         this.Suits = var10001;

         int var2;
         for(int var10000 = var2 = 5 >> 3; var10000 < var1.length; var10000 = var2) {
            String[] var3 = var1[var2].split("-");
            BaseSkill[] var4 = this.Suits;
            int var5 = var2;
            BaseSkill var10002 = new BaseSkill(Integer.parseInt(var3[4 ^ 5]), Integer.parseInt(var3[5 >> 3]));
            ++var2;
            var4[var5] = var10002;
         }
      }

      return this.Suits;
   }

   public int[] getParts() {
      synchronized(this) {
         RoleSuitBean var10000;
         if (this.parts == null) {
            int[] var10001;
            boolean var10003;
            if (this.HaveParts != null && !this.HaveParts.equals("")) {
               String[] var2;
               var10001 = new int[(var2 = this.HaveParts.split("\\|")).length];
               var10003 = true;
               this.parts = var10001;

               int var3;
               for(int var5 = var3 = 3 ^ 3; var5 < var2.length; var5 = var3) {
                  int[] var6 = this.parts;
                  int var7 = var3;
                  int var10002 = Integer.parseInt(var2[var3]);
                  ++var3;
                  var6[var7] = var10002;
               }

               var10000 = this;
               return var10000.parts;
            }

            var10001 = new int[3 ^ 3];
            var10003 = true;
            this.parts = var10001;
         }

         var10000 = this;
         return var10000.parts;
      }
   }

   public void setHaveSkill(String var1) {
      this.HaveSkill = var1;
   }

   public void setHaveParts(String var1) {
      this.HaveParts = var1;
   }

   public String getSname() {
      return this.Sname;
   }

   public String getHaveSkill() {
      return this.HaveSkill;
   }

   public String getHaveParts() {
      return this.HaveParts;
   }

   public String getIntroduce() {
      return this.Introduce;
   }
}
