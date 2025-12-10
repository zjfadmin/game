package com.xy.readbean;

import com.xy.formula.ActivityPetManual;
import com.xy.formula.ActivityPetManualSet;
import com.xy.formula.ActivityPetManualType;
import java.util.Iterator;
import java.util.Map;

public class ActivitySeries {
   private Activity activityPetManual;
   private Map<Integer, ActivityFC> activityFCMap;
   private Activity activityBeau;
   private Map<Integer, Activity> activityMap;

   public void setActivityBeau(Activity var1) {
      this.activityBeau = var1;
   }

   public Map<Integer, Activity> getActivityMap() {
      return this.activityMap;
   }

   public ActivityFC getPetManualFC(int var1) {
      if (this.activityPetManual == null) {
         return null;
      } else {
         ActivityPetManualSet var5 = this.activityPetManual.getPetManualSet();

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var5.getPets().length; var10000 = var3) {
            int var4;
            for(var10000 = var4 = 0; var10000 < var5.getPets()[var3].getSize(); var10000 = var4) {
               int var2 = (int)var5.getPets()[var3].getZhi(var4);
               ActivityFC var7;
               ActivityPetManual var6 = (var7 = (ActivityFC)this.activityFCMap.get(var2)) != null ? (ActivityPetManual)var7.getData() : null;
               if (var6 != null && var6.getPetId() == var1) {
                  return var7;
               }

               ++var4;
            }

            ++var3;
         }

         return null;
      }
   }

   public Activity getActivityBeau() {
      return this.activityBeau;
   }

   public Map<Integer, ActivityFC> getActivityFCMap() {
      return this.activityFCMap;
   }

   public void setActivityPetManual(Activity var1) {
      this.activityPetManual = var1;
   }

   public void setActivityFCMap(Map<Integer, ActivityFC> var1) {
      this.activityFCMap = var1;
   }

   public void a() {
      Iterator var2;
      Iterator var10000 = var2 = this.activityMap.values().iterator();

      while(var10000.hasNext()) {
         Activity var1;
         Activity var4 = var1 = (Activity)var2.next();
         var4.c();
         if (var4.getModelId() == --5) {
            var10000 = var2;
            this.activityBeau = var1;
         } else {
            if (var1.getModelId() == (31 & 102)) {
               this.activityPetManual = var1;
            }

            var10000 = var2;
         }
      }

      var10000 = var2 = this.activityFCMap.values().iterator();

      while(var10000.hasNext()) {
         ActivityFC var3 = (ActivityFC)var2.next();
         var10000 = var2;
         var3.d();
      }

   }

   public ActivityFC getPetManualTypeFC(int var1) {
      if (this.activityPetManual == null) {
         return null;
      } else {
         ActivityPetManualSet var5 = this.activityPetManual.getPetManualSet();

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var5.getTypes().length; var10000 = var3) {
            int var4;
            for(var10000 = var4 = 0; var10000 < var5.getTypes()[var3].getSize(); var10000 = var4) {
               int var2 = (int)var5.getTypes()[var3].getZhi(var4);
               ActivityFC var7;
               ActivityPetManualType var6 = (var7 = (ActivityFC)this.activityFCMap.get(var2)) != null ? (ActivityPetManualType)var7.getData() : null;
               if (var6 != null && var6.a(var1) != -4 >> 2) {
                  return var7;
               }

               ++var4;
            }

            ++var3;
         }

         return null;
      }
   }

   public Activity getActivityPetManual() {
      return this.activityPetManual;
   }

   public void setActivityMap(Map<Integer, Activity> var1) {
      this.activityMap = var1;
   }
}
