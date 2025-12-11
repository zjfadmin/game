package com.xy.a.i;

import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class39 extends DefaultMutableTreeNode {
   private StallBuyMenu art;
   private StallBuyData aru;

   public Class39(StallBuyData var1) {
      this.aru = var1;
      this.setUserObject(var1.getName());
   }

   public StallBuyData ajv() {
      return this.aru;
   }

   public void ahc(StallBuyMenu var1) {
      this.art = var1;
   }

   public Class39(StallBuyMenu var1) {
      this.art = var1;
      this.setUserObject(var1.getKey());
   }

   public void po(StallBuyData var1) {
      this.aru = var1;
   }

   public StallBuyMenu ajw() {
      return this.art;
   }
}
