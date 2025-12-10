package com.xy.readbean;

import com.xy.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlchemySet {
   private List<AlchemyUnit> unitList;
   private String type;

   public AlchemyUnit a() {
      return (AlchemyUnit)this.unitList.get(W.c.nextInt(this.unitList.size()));
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public void setUnitList(List<AlchemyUnit> var1) {
      this.unitList = var1;
   }

   public AlchemyUnit getAlchemyUnit(String var1) {
      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.unitList.size(); var10000 = var2) {
         AlchemyUnit var3;
         if ((var3 = (AlchemyUnit)this.unitList.get(var2)).getKey().equals(var1)) {
            return var3;
         }

         ++var2;
      }

      return null;
   }

   public String getType() {
      return this.type;
   }

   public AlchemySet(String var1) {
      int var10000 = 2 & 5;
      super();
      this.unitList = new ArrayList();
      int var4 = var10000;
      int var3 = 3 >> 2;

      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < var1.length(); var10000 = var2) {
         if ((var2 = var1.indexOf("|", var3 + (2 ^ 3))) == -4 >> 2) {
            var2 = var1.length();
         }

         if (var4 == 0) {
            this.type = var1.substring(var3, var2);
            var10000 = var2;
         } else {
            this.unitList.add(new AlchemyUnit(var1, var3, var2));
            var10000 = var2;
         }

         ++var4;
         var3 = var10000 + 1;
      }

   }

   public String toString() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append(this.type);
      Iterator var3 = this.unitList.iterator();
      Iterator var10000 = var3;

      while(var10000.hasNext()) {
         AlchemyUnit var2 = (AlchemyUnit)var3.next();
         var10000 = var3;
         var1.append("|");
         var1.append(var2.getKey());
         var1.append("#");
         var1.append(var2.getMin());
         var1.append("#");
         var1.append(var2.getMax());
      }

      return var1.toString();
   }

   public AlchemySet() {
   }

   public List<AlchemyUnit> getUnitList() {
      return this.unitList;
   }
}
