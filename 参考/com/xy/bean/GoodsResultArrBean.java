package com.xy.bean;

import com.xy.readbean.Goodstable;
import java.util.ArrayList;
import java.util.List;

public class GoodsResultArrBean {
   private List<Goodstable> list;
   private int I;

   public void setList(List<Goodstable> var1) {
      this.list = var1;
   }

   public void setI(int var1) {
      this.I = var1;
   }

   public List<Goodstable> getList() {
      if (this.list == null) {
         this.list = new ArrayList();
      }

      return this.list;
   }

   public int getI() {
      return this.I;
   }
}
