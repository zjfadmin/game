package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.game.RoleData;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class18 extends com.xy.q.Class30 {
   private int cn;
   private JScrollPane is;
   private com.xy.i.Class4 mn;
   private int ae;
   private JList<String> ro;
   private DefaultListModel<String> rp;
   private com.xy.w.Class18[] cl;

   public void cc(int var1, int var2) {
      this.cn = var1;
      this.ae = var2;
      this.h();
      this.zc().b(this.lj());
   }

   public Class18(GameView var1) {
      super(173, 3, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 282, 345, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "选择坐骑");
      this.mn = new com.xy.i.Class4("sc/e/7.png", 1, 201, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确定", this);
      this.mn.setBounds(124, 297, 59, 25);
      this.add(this.mn);
      this.rp = new DefaultListModel<>();
      this.ro = new JList<>();
      this.ro.setOpaque(false);
      this.ro.setSelectionBackground(com.xy.q.Class53.wu);
      this.ro.setSelectionForeground(Color.white);
      this.ro.setForeground(Color.white);
      this.ro.setFont(com.xy.q.Class49.ac);
      this.ro.setBackground(com.xy.q.Class49.bk);
      this.ro.setModel(this.rp);
      this.is = com.xy.q.Class1.g(54, 59, 197, 229, this.ro, 20);
      this.add(this.is);
      this.cl = new com.xy.w.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.cl.length; var10000 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         Class18 var3;
         if (var2 == 0) {
            var3 = this;
            this.cl[var2].mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(52, 38, 200, 21);
         } else {
            if (var2 == 1) {
               this.cl[var2].mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.cl[var2].setBounds(52, 38, 200, 250);
            }

            var3 = this;
         }

         var3.add(this.cl[var2++]);
      }
   }

   @Override
   public void l() {
      this.h();
      super.l();
   }

   public void g(int var1) {
      if (var1 == 201) {
         RoleData var2 = this.yx();
         Mount var3 = this.ro.getSelectedIndex() >= 0 ? var2.mounts.get(this.ro.getSelectedIndex()) : null;
         if (var3 == null) {
            this.afx._do("没有选中的坐骑");
            return;
         }

         this.zc().f(this.lj());
         if (this.cn == 0) {
            StringBuilder var4 = new StringBuilder("SHGZ").append(var3.getMountid()).append("|").append(this.cn).append("|").append(this.ae);
            this.afx.dm(new ConfirmBean(32, var4.toString(), "#W坐骑移入守护槽后，可#G获得守护石加持#W。坐骑移入守护槽需要花费#G30W#W银两,确认选择此坐骑吗？"));
            return;
         }

         StringBuilder var5 = new StringBuilder("SHGZ").append(var3.getMountid()).append("|").append(this.cn).append("|").append(this.ae);
         this.afx.dm(new ConfirmBean(32, var5.toString(), "#W确认选择此坐骑移入守护槽吗？"));
      }
   }

   public void h() {
      RoleData var1 = this.yx();
      this.rp.removeAllElements();

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.mounts.size(); var10000 = var2) {
         Mount var3 = var1.mounts.get(var2);
         var2++;
         this.rp.addElement(var3.getMountname());
      }

      this.ro.clearSelection();
   }
}
