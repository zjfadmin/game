package com.xy.readbean;

import com.xy.bw;
import com.xy.hd;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.ActivityPetManualSet;

public class Activity {
   private transient ActivityFCRecord[] records;
   private String baseSet;
   private int modelId;
   private int id;
   private long timeOpen;
   private long timeStop;
   private transient bw[] keys;
   private transient ActivityPetManualSet petManualSet;
   private String activitySet;
   private long timeEnd;
   private transient ActivityMenuSet2[] menuSet2s;

   public ActivityMenuSet2[] getMenuSet2s() {
      return this.menuSet2s;
   }

   public long getTimeEnd() {
      return this.timeEnd;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getId() {
      return this.id;
   }


   private void a(int var1, int var2) {
      bw[] var10001 = new bw[(4 ^ 5) + hd.aj((char)('\u007f' & '='), this.activitySet, var1, var2)];
      boolean var10003 = true;
      this.keys = var10001;
      int var4 = 5 >> 3;
      int var3 = 3 >> 2;
      int var5 = 3 >> 2;

      for(int var10000 = var3; var10000 < var2; var10000 = var3) {
         if ((var3 = this.activitySet.indexOf("=", var1 + (2 ^ 3))) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         var5 = this.activitySet.indexOf("#", var1 + (2 ^ 3));
         this.keys[var4] = new bw();
         this.keys[var4].b = hd.q(this.activitySet, var1, var5);
         this.keys[var4].a = this.activitySet.substring(var5 + --1, var3);
         ++var4;
         var1 = var3 + (2 ^ 3);
      }

   }

   public long getTimeOpen() {
      return this.timeOpen;
   }

   public ActivityPetManualSet getPetManualSet() {
      return this.petManualSet;
   }

   public void setActivitySet(String var1) {
      this.activitySet = var1;
   }

   public static ActivityFCRecord b(String var0, int var1, int var2) {
      ActivityFCRecord var5 = new ActivityFCRecord();
      int var4 = 3 ^ 3;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < var2; var10000 = var3) {
         if ((var3 = var0.indexOf(",", var1 + --1)) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         label56: {
            label55: {
               String var8;
               if (var4 == 0) {
                  var8 = var0;
                  var5.setId(hd.b(var0, var1, var3));
               } else {
                  if (var4 == 5 >> 2) {
                     var5.setType(ActivityFCTarget.getActivityRecordKey(var0.substring(var1, var3)));
                     if (var5.getType() == 0) {
                        throw new ArithmeticException("异常记录类型:" + var0.substring(var1, var3));
                     }
                     break label55;
                  }

                  if (var4 == --2) {
                     if (var5.getType() != (4 ^ 5) && var5.getType() != (1 ^ 3)) {
                        if (var5.getType() != --3 && var5.getType() != --4) {
                           var5.setKey1(hd.b(var0, var1, var3));
                           var10000 = var3;
                           break label56;
                        }

                        int var7;
                        if ((var7 = hd.aj('#', var0, var1, var3)) != 0) {
                           var10000 = var3;
                           var5.a((2 ^ 3) + var7, var0, var1, var3);
                        } else if (hd.aj('-', var0, var1, var3) != 0) {
                           var5.a(3 & 5, var0, var1, var3);
                           var10000 = var3;
                        } else {
                           var5.setKey1(hd.b(var0, var1, var3));
                           var10000 = var3;
                        }
                        break label56;
                     }

                     String var6 = var0.substring(var1, var3);
                     var10000 = var3;
                     var5.setKey1(ActivityFC.getActivityMoneyKey(var6));
                     var5.setKey2(var6);
                     break label56;
                  }

                  var8 = var0;
               }

               if (var8.substring(var1, var3).equals("每日重置")) {
                  var5.setReset(--1);
               }
            }

            var10000 = var3;
         }

         ++var4;
         var1 = var10000 + 1;
      }

      return var5;
   }

   public void setTimeEnd(long var1) {
      this.timeEnd = var1;
   }

   public int getActivityState(long var1) {
      if (var1 < this.timeEnd) {
         if (var1 < this.timeStop) {
            return var1 < this.timeOpen ? 3 ^ 3 : 1;
         } else {
            return 2;
         }
      } else {
         return 0;
      }
   }

   public void c() {
      if (this.modelId != (3 & 5) && this.modelId != --2) {
         if (this.modelId != --3 && this.modelId != --5) {
            if (this.modelId == (70 & 63)) {
               this.petManualSet = new ActivityPetManualSet(this.activitySet);
               return;
            }

            this.activitySet = null;
         }

      } else {
         int var1 = 0;
         int var2 = 5 >> 3;
         int var3 = 2 & 5;

         for(int var10000 = var2; var10000 < this.activitySet.length(); var10000 = var2) {
            if ((var2 = this.activitySet.indexOf("|", var1 + (3 & 5))) == -4 >> 2) {
               var2 = this.activitySet.length();
            }

            if ((var3 = this.activitySet.indexOf("=", var1 + (2 ^ 3))) == -4 >> 2 || var3 > var2) {
               var3 = var2;
            }

            int var10002;
            String var4;
            if ((var4 = this.activitySet.substring(var1, var3)).equals("功能选项")) {
               var10002 = var3 + (4 ^ 5);
               var10000 = var2;
               this.d(var10002, var2);
            } else if (var4.equals("活动数值")) {
               var10002 = var3 + (5 >> 2);
               var10000 = var2;
               this.a(var10002, var2);
            } else {
               if (var4.equals("记录数值")) {
                  this.e(var3 + (5 >> 2), var2);
               }

               var10000 = var2;
            }

            var1 = var10000 + 1;
         }

         this.activitySet = null;
      }
   }

   public String getActivitySet() {
      return this.activitySet;
   }

   public Object getActivityKey(int var1) {
      bw var2;
      if ((var2 = this.getPointKey(var1 < 0 ? -var1 : var1)) != null) {
         return var2;
      } else {
         ActivityFCRecord var3;
         return (var3 = this.getActivityFCRecord(var1)) != null ? var3 : null;
      }
   }

   public ActivityFCRecord getActivityFCRecord(int var1) {
      if (this.records == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.records.length; var10000 = var2) {
            if (this.records[var2].getId() == var1) {
               return this.records[var2];
            }

            ++var2;
         }

         return null;
      }
   }

   public int getModelId() {
      return this.modelId;
   }

   public bw getPointKey(int var1) {
      if (this.keys == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.keys.length; var10000 = var2) {
            if (this.keys[var2].b == (long)var1) {
               return this.keys[var2];
            }

            ++var2;
         }

         return null;
      }
   }

   public void setBaseSet(String var1) {
      this.baseSet = var1;
   }


   private void d(int var1, int var2) {
      if (this.modelId == (4 ^ 5) || this.modelId == --2) {
         ActivityMenuSet2[] var10001 = new ActivityMenuSet2[(2 ^ 3) + hd.aj((char)('=' & '\u007f'), this.activitySet, var1, var2)];
         boolean var10003 = true;
         this.menuSet2s = var10001;
         int var4 = 3 & 4;

         int var3;
         for(int var10000 = var3 = 3 >> 2; var10000 < var2; var10000 = var3) {
            if ((var3 = this.activitySet.indexOf("=", var1 + (3 >> 1))) == -4 >> 2 || var3 > var2) {
               var3 = var2;
            }

            this.menuSet2s[var4] = new ActivityMenuSet2(this.activitySet, var1, var3);
            ++var4;
            var1 = var3 + (2 ^ 3);
         }
      }

   }

   public void setTimeOpen(long var1) {
      this.timeOpen = var1;
   }


   private void e(int var1, int var2) {
      ActivityFCRecord[] var10001 = new ActivityFCRecord[(3 >> 1) + hd.aj((char)('=' & '\u007f'), this.activitySet, var1, var2)];
      boolean var10003 = true;
      this.records = var10001;
      int var4 = 3 & 4;

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < var2; var10000 = var3) {
         if ((var3 = this.activitySet.indexOf("=", var1 + --1)) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         this.records[var4] = b(this.activitySet, var1, var3);
         ++var4;
         var1 = var3 + (4 ^ 5);
      }

   }

   public long getTimeStop() {
      return this.timeStop;
   }

   public void setTimeStop(long var1) {
      this.timeStop = var1;
   }

   public String getBaseSet() {
      return this.baseSet;
   }

   public void setModelId(int var1) {
      this.modelId = var1;
   }

   public void setPetManualSet(ActivityPetManualSet var1) {
      this.petManualSet = var1;
   }

   public void setMenuSet2s(ActivityMenuSet2[] var1) {
      this.menuSet2s = var1;
   }
}
