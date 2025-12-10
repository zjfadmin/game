package com.xy.bean;

public class PrivateData {
   private String taskData;
   private String TimingGood;
   private String taskComplete;
   private String born;
   private String Skills;

   public String[] getSkill(String var1) {
      if (this.Skills != null && !this.Skills.equals("")) {
         String[] var2 = this.Skills.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].startsWith(var1)) {
               return var2[var3].substring(3 >> 1).split("#");
            }

            ++var3;
         }

         return null;
      } else {
         return null;
      }
   }

   public void setTaskData(String var1) {
      this.taskData = var1;
   }

   public String getTimingGood() {
      return this.TimingGood;
   }

   public void setSkills(String var1) {
      this.Skills = var1;
   }

   public String getSkills() {
      return this.Skills == null ? "" : this.Skills;
   }

   public void setSkills(String var1, String var2) {
      if (this.Skills != null && !this.Skills.equals("")) {
         StringBuffer var3 = new StringBuffer();
         String[] var4 = this.Skills.split("\\|");

         int var5;
         for(int var10000 = var5 = 3 & 4; var10000 < var4.length; var10000 = var5) {
            if (!var4[var5].startsWith(var1)) {
               if (var3.length() != 0) {
                  var3.append("|");
               }

               var3.append(var4[var5]);
            }

            ++var5;
         }

         if (var2 != null && !var2.equals("")) {
            if (var3.length() != 0) {
               var3.append("|");
            }

            var3.append(var1);
            var3.append(var2);
         }

         this.Skills = var3.toString();
      } else {
         if (var2 != null && !var2.equals("")) {
            this.Skills = var1 + var2;
         }

      }
   }

   public String getTaskData() {
      return this.taskData;
   }

   public void setBorn(String var1) {
      this.born = var1;
   }

   public String a(String var1) {
      if (this.Skills != null && !this.Skills.equals("")) {
         String[] var2 = this.Skills.split("\\|");

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].startsWith(var1)) {
               return var2[var3].substring(3 >> 1);
            }

            ++var3;
         }

         return null;
      } else {
         return null;
      }
   }

   public String getBorn() {
      return this.born;
   }

   public void setTaskComplete(String var1) {
      this.taskComplete = var1;
   }

   public String getTaskComplete() {
      return this.taskComplete;
   }

   public void setTimingGood(String var1) {
      this.TimingGood = var1;
   }
}
