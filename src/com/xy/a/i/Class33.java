package com.xy.a.i;

import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.q.Class49;
import java.awt.Color;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class33 extends DefaultMutableTreeNode {
   private PartJade alq;
   private Color rr;

   public Class33(PartJade var1) {
      this.ck(var1);
   }

   public void ck(PartJade var1) {
      this.alq = var1;
      this.setUserObject(MsgUntil.c(String.valueOf(var1.getPartId())));
      this.rr = var1.a() ? Class49.bn : Class49.az;
   }

   public Color aew() {
      return this.rr;
   }

   public PartJade aex() {
      return this.alq;
   }
}
