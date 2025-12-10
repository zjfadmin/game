package com.xy.readbean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AllFB {
   private Map<String, FB> allFB;

   public FB getFB(String var1) {
      Iterator var3;
      for(Iterator var10000 = var3 = this.allFB.values().iterator(); var10000.hasNext(); var10000 = var3) {
         FB var2;
         if ((var2 = (FB)var3.next()).getFbName().equals(var1)) {
            return var2;
         }
      }

      return null;
   }

   public void setAllFB(Map<String, FB> var1) {
      this.allFB = var1;
   }

   public Map<String, FB> getAllFB() {
      return this.allFB;
   }

   public List<FB> getList() {
      ArrayList var1 = new ArrayList();
      Iterator var3;
      Iterator var10000 = var3 = this.allFB.values().iterator();

      while(true) {
         label23:
         while(var10000.hasNext()) {
            FB var2 = (FB)var3.next();

            int var4;
            for(int var5 = var4 = 5 >> 3; var5 < var1.size(); var5 = var4) {
               if (((FB)var1.get(var4)).getFbId() >= var2.getFbId()) {
                  var1.add(var4, var2);
                  var10000 = var3;
                  continue label23;
               }

               ++var4;
            }

            var10000 = var3;
            var1.add(var2);
         }

         return var1;
      }
   }
}
