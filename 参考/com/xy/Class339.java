package com.xy;

import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import java.awt.Color;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class339 extends DefaultMutableTreeNode {
   private PartJade ast;
   private Color wh;

   public PartJade aiq() {
      return this.ast;
   }

   public void cb(PartJade var1) {
      PartJade var10001 = this.ast = var1;
      this.setUserObject(MsgUntil.e(String.valueOf(var1.getPartId())));
      this.wh = var10001.d() ? Class681.co : Class681.bj;
   }

   public Class339(PartJade var1) {
      this.cb(var1);
   }

   public Color wr() {
      return this.wh;
   }
}
