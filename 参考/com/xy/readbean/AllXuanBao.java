package com.xy.readbean;

import java.util.Iterator;
import java.util.Map;

public class AllXuanBao {
   private Map<Integer, XuanBao> xuanbaoMap;
   private Map<Integer, XuanYin> xuanyinMap;

   public Map<Integer, XuanYin> getXuanyinMap() {
      return this.xuanyinMap;
   }

   public void a() {
      Iterator var1;
      for(Iterator var10000 = var1 = this.xuanyinMap.values().iterator(); var10000.hasNext(); var10000 = var1) {
         ((XuanYin)var1.next()).a();
      }

   }

   public Map<Integer, XuanBao> getXuanbaoMap() {
      return this.xuanbaoMap;
   }

   public void setXuanbaoMap(Map<Integer, XuanBao> var1) {
      this.xuanbaoMap = var1;
   }

   public void setXuanyinMap(Map<Integer, XuanYin> var1) {
      this.xuanyinMap = var1;
   }
}
