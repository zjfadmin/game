package com.xy.readbean;

import java.util.List;

public class AllActive {
   private String[] totals;
   private List<Assist> assistList;
   private ActiveBase[] bases;
   private ActiveAward[] awards;

   public void setAwards(ActiveAward[] var1) {
      this.awards = var1;
   }

   public void setBases(ActiveBase[] var1) {
      this.bases = var1;
   }

   public ActiveAward[] getAwards() {
      return this.awards;
   }

   public List<Assist> getAssistList() {
      return this.assistList;
   }

   public void setTotals(String[] var1) {
      this.totals = var1;
   }

   public void setAssistList(List<Assist> var1) {
      this.assistList = var1;
   }

   public String[] getTotals() {
      return this.totals;
   }

   public ActiveBase[] getBases() {
      return this.bases;
   }
}
