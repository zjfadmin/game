package com.xy.readbean;

import java.util.Map;

public class AllNpcBean {
   private Map<String, NpcInfoBean> allNpcInfo;

   public Map<String, NpcInfoBean> getAllNpcInfo() {
      return this.allNpcInfo;
   }

   public void setAllNpcInfo(Map<String, NpcInfoBean> var1) {
      this.allNpcInfo = var1;
   }
}
