package com.xy.formula;

import com.xy.hd;

public class ActivityPetManual {
   private BaseQl[] roles;
   private int skillId;
   private BaseQl[] pet1s;
   private BaseQl[] pet2s;
   private int petId;
   private int id;

   public BaseQl[] getPet2s() {
      return this.pet2s;
   }

   public void setPet1s(BaseQl[] var1) {
      this.pet1s = var1;
   }

   public int getPetId() {
      return this.petId;
   }

   public void setRoles(BaseQl[] var1) {
      this.roles = var1;
   }

   public void setPetId(int var1) {
      this.petId = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setPet2s(BaseQl[] var1) {
      this.pet2s = var1;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public BaseQl[] getRoles() {
      return this.roles;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public BaseQl[] getPet1s() {
      return this.pet1s;
   }

   public void setSkillId(int var1) {
      this.skillId = var1;
   }

   public ActivityPetManual(int var1, String var2) {
      int var10000 = 3 ^ 3;
      super();
      this.id = var1;
      var1 = var10000;
      int var3 = 3 >> 2;

      int var4;
      for(var10000 = var4 = 5 >> 3; var10000 < var2.length(); var10000 = var4) {
         if ((var4 = var2.indexOf("|", var3 + (3 >> 1))) == -4 >> 2 || var4 > var2.length()) {
            var4 = var2.length();
         }

         if (var1 == 0) {
            this.petId = hd.b(var2, var3, var4);
         } else if (var1 == --1) {
            this.skillId = hd.b(var2, var3, var4);
         } else if (var2.charAt(var3) == (111 & 81)) {
            this.roles = this.a(var2, var3 + (3 & 5), var4);
         } else if (var2.charAt(var3) == (79 & 114)) {
            this.pet1s = this.a(var2, var3 + --1, var4);
         } else if (var2.charAt(var3) == (91 & 103)) {
            this.pet2s = this.a(var2, var3 + (2 ^ 3), var4);
         }

         ++var1;
         var3 = var4 + (3 >> 1);
      }

   }

   public BaseQl[] a(String var1, int var2, int var3) {
      BaseQl[] var10000 = new BaseQl[(3 & 5) + hd.aj((char)('3' & 'o'), var1, var2, var3)];
      boolean var10002 = true;
      BaseQl[] var4 = var10000;
      int var5 = 3 ^ 3;

      int var6;
      for(int var7 = var6 = 3 & 4; var7 < var3; var7 = var6) {
         if ((var6 = var1.indexOf("#", var2 + --1)) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         var4[var5] = BaseQl.a(var1, var2, var6);
         ++var5;
         var2 = var6 + (5 >> 2);
      }

      return var4;
   }
}
