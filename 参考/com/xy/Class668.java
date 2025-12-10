package com.xy;

import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class668 extends DefaultMutableTreeNode {
   private StallBuyData cp;
   private StallBuyMenu cq;

   public Class668(StallBuyMenu var1) {
      this.cq = var1;
      this.setUserObject(var1.getKey());
   }

   public StallBuyData bf() {
      return this.cp;
   }

   public void bg(StallBuyMenu var1) {
      this.cq = var1;
   }

   public void bh(StallBuyData var1) {
      this.cp = var1;
   }

   public Class668(StallBuyData var1) {
      this.cp = var1;
      this.setUserObject(var1.getName());
   }

   public StallBuyMenu bi() {
      return this.cq;
   }
}
