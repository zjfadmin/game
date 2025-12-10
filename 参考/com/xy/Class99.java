package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.game.RoleData;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class99 extends Class345 {
   private JList<String> fj;
   private int fk;
   private JScrollPane fl;
   private int j;
   private Class643 fm;
   private DefaultListModel<String> fn;
   private Class436[] g;

   public Class99(GameView var1) {
      int var10001 = --2;
      int var10008 = -4 >> 2;
      super(25789 & 7151, --3, Class345.aef, var1);
      this.va(var10008, 3 ^ 3, 11711 & 21338, 11769 & 21343, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 109 & 86, 109 & 86, 109 & 86, 109 & 86, (boolean)(3 ^ 3)), "选择坐骑");
      this.fm = new Class643("sc/e/7.png", 2 ^ 3, 15613 & 17355, Class681.ak, Class681.c, "确定", this);
      this.fm.setBounds(126 & 125, 2539 & 30525, 59 & 127, 127 & 25);
      this.add(this.fm);
      int var10006 = 54 & 127;
      this.fn = new DefaultListModel();
      this.fj = new JList();
      this.fj.setOpaque((boolean)(3 >> 2));
      this.fj.setSelectionBackground(Class581.wm);
      this.fj.setSelectionForeground(Color.white);
      this.fj.setForeground(Color.white);
      this.fj.setFont(Class681.ce);
      this.fj.setBackground(Class681.cu);
      this.fj.setModel(this.fn);
      this.fl = Class133.f(var10006, 63 & 123, 21445 & 11519, 25069 & 7927, this.fj, 21 & 126);
      this.add(this.fl);
      Class436[] var4 = new Class436[var10001];
      boolean var10003 = true;
      this.g = var4;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         Class99 var3;
         if (var2 == 0) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 & 4)));
            this.g[var2].setBounds(119 & 60, 110 & 55, 200, 21);
         } else {
            if (var2 == (4 ^ 5)) {
               this.g[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(2 & 5)));
               this.g[var2].setBounds(52, 38, 200, 250);
            }

            var3 = this;
         }

         var3.add(this.g[var2++]);
      }

   }

   public void d() {
      RoleData var1 = this.vd();
      this.fn.removeAllElements();

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < var1.mounts.size(); var10000 = var2) {
         Mount var3 = (Mount)var1.mounts.get(var2);
         ++var2;
         this.fn.addElement(var3.getMountname());
      }

      this.fj.clearSelection();
   }

   public void y(int var1) {
      if (var1 == (13311 & 19657)) {
         RoleData var3 = this.vd();
         Mount var2 = this.fj.getSelectedIndex() >= 0 ? (Mount)var3.mounts.get(this.fj.getSelectedIndex()) : null;
         if (var2 == null) {
            this.aej.f("没有选中的坐骑");
            return;
         }

         this.ve().n(this.ae());
         if (this.fk == 0) {
            this.aej.aal(new ConfirmBean(120 & 39, "SHGZ" + var2.getMountid() + "|" + this.fk + "|" + this.j, "#W坐骑移入守护槽后，可#G获得守护石加持#W。坐骑移入守护槽需要花费#G30W#W银两,确认选择此坐骑吗？"));
            return;
         }

         this.aej.aal(new ConfirmBean(36 & 123, "SHGZ" + var2.getMountid() + "|" + this.fk + "|" + this.j, "#W确认选择此坐骑移入守护槽吗？"));
      }

   }

   public void cf(int var1, int var2) {
      this.fk = var1;
      this.j = var2;
      this.d();
      this.ve().a(this.ae());
   }

   public void q() {
      this.d();
      super.q();
   }
}
