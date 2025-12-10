package com.xy.readbean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllFM {
   private List<FM> allList;
   private List<String> list;

   public List<FM> getAllList() {
      return this.allList;
   }

   public List<String> getFmType() {
      if (this.list == null) {
         this.list = new ArrayList();
         Iterator var2;
         Iterator var10000 = var2 = this.allList.iterator();

         while(var10000.hasNext()) {
            FM var1 = (FM)var2.next();
            if (this.list.contains(var1.getFmType())) {
               var10000 = var2;
            } else {
               this.list.add(var1.getFmType());
               var10000 = var2;
            }
         }
      }

      return this.list;
   }

   public void setAllList(List<FM> var1) {
      this.allList = var1;
   }
}
