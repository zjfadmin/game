package com.xy.readbean;

import java.util.Map;

public class AllTx {
   private Map<Integer, RoleTxBean> txmap;

   public void setTxmap(Map<Integer, RoleTxBean> var1) {
      this.txmap = var1;
   }

   public Map<Integer, RoleTxBean> getTxmap() {
      return this.txmap;
   }
}
