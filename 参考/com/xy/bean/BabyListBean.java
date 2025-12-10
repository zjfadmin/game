package com.xy.bean;

import com.xy.entity.Baby;
import java.util.List;

public class BabyListBean {
   private List<Baby> babyList;

   public void setBabyList(List<Baby> var1) {
      this.babyList = var1;
   }

   public List<Baby> getBabyList() {
      return this.babyList;
   }
}
