package com.xy.readbean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AllTask {
   private List<TaskData> automationList;
   private List<Integer> setList;
   private Map<Integer, TaskSet> allTaskSet;
   private Map<Integer, TaskData> allTaskData;
   private List<String> typeList;

   public List<String> getTypeList() {
      if (this.setList == null) {
         this.a();
      }

      return this.typeList;
   }

   public void setAllTaskData(Map<Integer, TaskData> var1) {
      this.allTaskData = var1;
   }

   public List<TaskData> getAutomationList() {
      return this.automationList;
   }

   public void getSetId(List<Integer> var1) {
      this.getSetList();
      int var2 = this.setList.size() - --1;

      for(int var10000 = var2; var10000 >= 0; var10000 = var2) {
         int var3 = (Integer)this.setList.get(var2);
         if (!var1.contains(var3)) {
            label34: {
               int var4;
               for(var10000 = var4 = 0; var10000 < var1.size(); var10000 = var4) {
                  if ((Integer)var1.get(var4) < var3) {
                     var1.add(var4, var3);
                     break label34;
                  }

                  ++var4;
               }

               var1.add(var3);
            }
         }

         --var2;
      }

   }

   public void a() {
      this.automationList = new ArrayList();

      Iterator var10000;
      Iterator var2;
      for(var10000 = var2 = this.allTaskData.values().iterator(); var10000.hasNext(); var10000 = var2) {
         TaskData var1 = (TaskData)var2.next();
         TaskSet var3 = (TaskSet)this.allTaskSet.get(var1.getTaskSetID());
         var1.setTaskSet(var3);
         if (var1.a("自动领取")) {
            this.automationList.add(var1);
         }
      }

      this.setList = new ArrayList();
      this.typeList = new ArrayList();
      var10000 = var2 = this.allTaskSet.keySet().iterator();

      while(true) {
         int var8;
         label45:
         while(var10000.hasNext()) {
            Integer var4 = (Integer)var2.next();

            int var7;
            for(var8 = var7 = 2 & 5; var8 < this.setList.size(); var8 = var7) {
               if (var4 < (Integer)this.setList.get(var7)) {
                  var10000 = var2;
                  this.setList.add(var7, var4);
                  continue label45;
               }

               ++var7;
            }

            var10000 = var2;
            this.setList.add(var4);
         }

         int var5;
         for(var8 = var5 = this.setList.size() - --1; var8 >= 0; var8 = var5) {
            TaskSet var6;
            if ((var6 = (TaskSet)this.allTaskSet.get(this.setList.get(var5))).getTaskMsgID() == 0) {
               this.setList.remove(var5);
            }

            if (!this.typeList.contains(var6.getTaskType())) {
               this.typeList.add(var6.getTaskType());
            }

            --var5;
         }

         return;
      }
   }

   public Map<Integer, TaskData> getAllTaskData() {
      return this.allTaskData;
   }

   public List<Integer> getSetList() {
      if (this.setList == null) {
         this.a();
      }

      return this.setList;
   }

   public void setAllTaskSet(Map<Integer, TaskSet> var1) {
      this.allTaskSet = var1;
   }

   public Map<Integer, TaskSet> getAllTaskSet() {
      return this.allTaskSet;
   }
}
