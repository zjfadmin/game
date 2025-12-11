package com.xy.a;

import com.xy.richtext.RichLabel;
import java.awt.Dimension;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class Class60 implements TreeSelectionListener {
   // $VF: synthetic field
   final Class112 aav;

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var3;
      if ((var3 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
         Class112.agx(this.aav).setViewportView(null);
      } else {
         String var4;
         String var10000 = var4 = var3.toString();
         String var10001 = "渍戕仾绗";
         if (!var10000.equals("游戏介绍")) {
            var10001 = "光偠毘俗";
            if (!var4.equals("充值比例")) {
               var10001 = "牽朶牌艨";
               if (!var4.equals("版本特色")) {
                  var10001 = "劓股仇纑";
                  if (!var4.equals("功能介绍")) {
                     if (var3.isLeaf()) {
                        Class112.agx(this.aav).setViewportView(null);
                        String var9;
                        if ((var9 = com.xy.v.Class7.b(var4, this.aav.yt())) == null) {
                           return;
                        }

                        RichLabel var11;
                        RichLabel var16 = var11 = new RichLabel(var9, com.xy.q.Class49.bz);
                        Dimension var13;
                        var16.setSize(var13 = var16.computeSize(250));
                        var16.setPreferredSize(var13);
                        Class112.agx(this.aav).setViewportView(var11);
                        return;
                     }

                     Class112.agx(this.aav).setViewportView(null);
                     String var8;
                     if ((var8 = com.xy.v.Class7.c(var4)) == null) {
                        return;
                     }

                     RichLabel var10;
                     RichLabel var15 = var10 = new RichLabel(var8, com.xy.q.Class49.bz);
                     Dimension var12;
                     var15.setSize(var12 = var15.computeSize(250));
                     var15.setPreferredSize(var12);
                     Class112.agx(this.aav).setViewportView(var10);
                     return;
                  }
               }
            }
         }

         Class112.agx(this.aav).setViewportView(null);
         String var5;
         if ((var5 = com.xy.v.Class7.c(var4)) != null) {
            RichLabel var6;
            RichLabel var14 = var6 = new RichLabel(var5, com.xy.q.Class49.bz);
            Dimension var7;
            var14.setSize(var7 = var14.computeSize(250));
            var14.setPreferredSize(var7);
            Class112.agx(this.aav).setViewportView(var6);
         }
      }
   }

   Class60(Class112 var1) {
      this.aav = var1;
   }
}
