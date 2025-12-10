package com.xy.readbean;

import com.xy.hd;
import com.xy.formula.ActivityPetManual;
import com.xy.formula.ActivityPetManualSet;
import com.xy.formula.BaseQl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ActivityPetManualRole implements ActivityRole {
   private transient Activity activityPetManual;
   private int[] lvls;
   private List<BaseQl> roleQls;
   private List<BaseQl> petQls;
   private ConcurrentHashMap<Integer, Long> dataMap;
   private boolean init;

   public int[] a(Activity var1, ActivitySeries var2) {
      this.c(var1, var2);
      return this.lvls;
   }

   public List<BaseQl> getList(int var1, Activity var2, ActivitySeries var3) {
      this.c(var2, var3);
      return var1 == 0 ? this.roleQls : this.petQls;
   }


   private void b(int var1, double var2, List<BaseQl> var4, BaseQl[] var5) {
      if (var4 != null && var5 != null && var1 > 0) {
         int var6;
         for(int var10000 = var6 = 0; var10000 < var5.length; var10000 = var6) {
            String var7 = var5[var6].getKey();
            double var8 = var5[var6].getValue() + (double)var1 * var5[var6].getValue2();
            Iterator var11;
            Iterator var12 = var11 = var4.iterator();

            while(true) {
               if (!var12.hasNext()) {
                  var4.add(new BaseQl(var7, var8, var2));
                  break;
               }

               BaseQl var10;
               if (!(var10 = (BaseQl)var11.next()).getKey().equals(var7)) {
                  var12 = var11;
               } else {
                  if (var10.getValue2() == var2) {
                     var10.setValue(var10.getValue() + var8);
                     break;
                  }

                  var12 = var11;
               }
            }

            ++var6;
         }

      }
   }

   public void c(Activity var1, ActivitySeries var2) {
      if (!this.init || this.activityPetManual != var1) {
         synchronized(this) {
            if (!this.init || this.activityPetManual != var1) {
               this.init = (boolean)(3 & 5);
               this.activityPetManual = var1;
               ActivityPetManualSet var13 = var1.getPetManualSet();
               ActivityPetManualRole var10000;
               int var10001;
               int var19;
               int var21;
               if (this.lvls != null && this.lvls.length == var13.getSkillNum() + (5 >> 2)) {
                  int var4;
                  for(var19 = var4 = 0; var19 < this.lvls.length; var19 = var4) {
                     var10001 = var4;
                     var21 = 3 >> 2;
                     ++var4;
                     this.lvls[var10001] = var21;
                  }

                  var10000 = this;
               } else {
                  var10000 = this;
                  int[] var10002 = new int[var13.getSkillNum() + (2 ^ 3)];
                  boolean var10004 = true;
                  this.lvls = var10002;
               }

               if (var10000.roleQls == null) {
                  this.roleQls = new ArrayList();
                  var10000 = this;
               } else {
                  this.roleQls.clear();
                  var10000 = this;
               }

               if (var10000.petQls == null) {
                  this.petQls = new ArrayList();
               } else {
                  this.petQls.clear();
               }

               HashMap var15 = new HashMap();
               Iterator var5;
               Iterator var22 = var5 = this.dataMap.entrySet().iterator();

               while(true) {
                  int var7;
                  while(var22.hasNext()) {
                     Entry var6;
                     var7 = (Integer)(var6 = (Entry)var5.next()).getKey();
                     long var8 = (Long)var6.getValue();
                     ActivityFC var3;
                     if ((var3 = (ActivityFC)var2.getActivityFCMap().get(var7)) != null) {
                        if (var3.getType() != (57 & 79)) {
                           var22 = var5;
                           continue;
                        }

                        ActivityPetManual var14 = (ActivityPetManual)var3.getData();
                        int var11 = (int)(var8 % 100L);
                        this.b(var11, 0.0D, this.roleQls, var14.getRoles());
                        this.b(var11, 0.0D, this.petQls, var14.getPet1s());
                        this.b(var11, (double)var14.getPetId(), this.petQls, var14.getPet2s());
                        int[] var20 = this.lvls;
                        var20[3 ^ 3] += var11;
                        if (var14.getSkillId() == 0) {
                           var22 = var5;
                           continue;
                        }

                        Long var18 = (Long)var15.get(var14.getSkillId());
                        var15.put(var14.getSkillId(), (var18 != null ? var18 : 0L) + 10L);
                     }

                     var22 = var5;
                  }

                  int var16;
                  for(var19 = var16 = 5 >> 3; var19 < var13.getSkillNum(); var19 = var16) {
                     var7 = var13.getSkillId(var16);
                     Long var17 = (Long)var15.get(var7);
                     int[] var23 = this.lvls;
                     var10001 = var16 + (3 & 5);
                     int var10003;
                     ActivityPetManualRole var24;
                     if (var17 != null) {
                        var10003 = var17.intValue();
                        var24 = this;
                     } else {
                        var10003 = 0;
                        var24 = this;
                     }

                     var21 = var13.getSkillLvl(var10003, var24.lvls[3 & 4]);
                     ++var16;
                     var23[var10001] = var21;
                  }

                  return;
               }
            }
         }
      }
   }

   public int d(int var1, Activity var2, ActivitySeries var3) {
      this.c(var2, var3);
      return (var1 = var2.getPetManualSet().c(var1)) != -4 >> 2 ? this.lvls[var1 + (2 ^ 3)] : 0;
   }


   private void e(String var1, int var2, int var3) {
      this.init = (boolean)(3 ^ 3);
      this.dataMap = new ConcurrentHashMap();
      if (!hd.o(var1) && var2 < var3) {
         byte var4 = 0;
         int var5 = 5 >> 3;

         int var6;
         for(int var10000 = var4; var10000 < var3; var10000 = var6) {
            if ((var6 = var1.indexOf("#", var2 + (2 ^ 3))) == -4 >> 2 || var6 > var3) {
               var6 = var3;
            }

            var5 = var1.indexOf(",", var2 + (3 >> 1));
            this.dataMap.put(hd.b(var1, var2, var5), hd.q(var1, var5 + (3 & 5), var6));
            var2 = var6 + (3 & 5);
         }

      }
   }

   public void f(String var1, int var2, int var3) {
      if (var2 < var3) {
         byte var4 = 0;
         int var5 = 5 >> 3;

         int var9;
         for(int var10000 = var4; var10000 < var3; var10000 = var9) {
            if ((var9 = var1.indexOf("#", var2 + (3 & 5))) == -4 >> 2 || var9 > var3) {
               var9 = var3;
            }

            if ((var5 = var1.indexOf(",", var5 + --1)) == -4 >> 2 || var5 > var9) {
               var5 = var9;
            }

            int var6 = hd.b(var1, var2, var5);
            long var7 = var5 < var9 ? hd.q(var1, var5 + (4 ^ 5), var9) : 0L;
            if (var7 != 0L) {
               this.dataMap.put(var6, var7);
               var10000 = var9;
            } else {
               this.dataMap.remove(var6);
               var10000 = var9;
            }

            var2 = var10000 + 1;
         }

      }
   }

   public ConcurrentHashMap<Integer, Long> getDataMap() {
      return this.dataMap;
   }

   public long getValueByKey(int var1) {
      Long var2;
      return (var2 = (Long)this.dataMap.get(var1)) != null ? var2 : 0L;
   }

   public void setValueByKey(String var1, int var2, int var3) {
      int var4;
      if ((var4 = var1.indexOf(",", var2 + --1)) != -4 >> 2 && var4 <= var3) {
         String var10000 = var1;
         int var8 = hd.b(var1, var2, var4);
         long var5;
         ActivityPetManualRole var9;
         if ((var5 = hd.q(var10000, var4 + --1, var3)) != 0L) {
            this.dataMap.put(var8, var5);
            var9 = this;
         } else {
            this.dataMap.remove(var8);
            var9 = this;
         }

         synchronized(var9) {
            this.init = (boolean)(2 & 5);
            this.activityPetManual = null;
         }
      }
   }

   public ActivityPetManualRole(String var1, int var2, int var3) {
      this.e(var1, var2, var3);
   }
}
