package com.xy;

import com.xy.entity.TeamRole;
import com.xy.formula.SkillUtil;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.List;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class26 extends Class345 {
   private JTable mt;
   private Vector<Vector<Object>> mu;
   private JScrollPane mv;
   private Class554 mw;
   private Class554 mx;
   private Class436 av;
   private Class554 my;
   private Class436 ih;

   public void y(int var1) {
      TeamRole var3;
      String var4;
      int var5;
      if (var1 == (93 & 47)) {
         if ((var5 = this.mt.getSelectedRow()) != -4 >> 2) {
            var3 = (TeamRole)((Vector)this.mu.get(var5)).get(--3);
            this.mu.remove(var5);
            var4 = Agreement.getSendTextAES("team5", "A" + var3.getRoleId());
            this.uw().d(var4);
         }
      } else if (var1 == (78 & 63)) {
         if ((var5 = this.mt.getSelectedRow()) != -4 >> 2) {
            var3 = (TeamRole)((Vector)this.mu.get(var5)).get(--3);
            this.mu.remove(var5);
            var4 = Agreement.getSendTextAES("team5", "R" + var3.getRoleId());
            this.uw().d(var4);
         }
      } else {
         if (var1 == (31 & 111)) {
            this.mu.clear();
            String var2 = Agreement.getSendTextAES("team5", "E");
            this.uw().d(var2);
         }

      }
   }

   public Class26(GameView var1) {
      int var10011 = -4 >> 2;
      super(94 & 63, 1 ^ 3, Class345.aef, var1);
      this.va(var10011, 3 & 4, 11119 & 22015, 9147 & 23935, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 70 & 125, 70 & 125, 70 & 125, 70 & 125, (boolean)(3 & 4)), "申请加入");
      this.ad(new Class116(47 & 94, 5 >> 3, 5 >> 3, 63 & 114));
      this.mx = new Class554("sc/e/7.png", --1, 61 & 79, Class681.ak, Class681.c, "允许", this);
      this.my = new Class554("sc/e/7.png", --1, 110 & 31, Class681.ak, Class681.c, "拒绝", this);
      this.mw = new Class554("sc/e/7.png", 3 >> 1, 111 & 31, Class681.ak, Class681.c, "清空", this);
      this.mx.setBounds(62 & 115, 16119 & 16873, 63 & 123, 26 & 127);
      this.my.setBounds(25823 & 7094, 27365 & 5627, 63 & 123, 26);
      this.mw.setBounds(250, 225, 59, 26);
      this.add(this.mx);
      this.add(this.my);
      this.add(this.mw);
      Vector var2 = new Vector();
      var2.addElement("名称");
      var2.addElement("等级");
      var2.addElement("种族");
      this.mu = new Vector();
      int[] var10013 = new int[--3];
      boolean var10015 = true;
      var10013[5 >> 3] = 120;
      var10013[3 >> 1] = 120;
      var10013[--2] = 90;
      this.mt = Class133.e(this.mu, var2, Class681.ce, Color.white, var10013);
      this.mt.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               if (Class26.this.mt.getSelectedRow() != -4 >> 2) {
                  ;
               }
            }
         }
      });
      this.mv = Class133.f(49, 30, 292, 190, this.mt, 20);
      this.add(this.mv);
      this.av = new Class436(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 ^ 3)));
      this.av.setBounds(49, 30, 292, 21);
      this.add(this.av);
      this.ih = new Class436(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 ^ 3)));
      this.ih.setBounds(49, 30, 292, 191);
      this.add(this.ih);
   }

   public void hd(TeamRole var1) {
      Vector var2;
      (var2 = new Vector()).add(var1.getName());
      var2.add(Class224.r(var1.getGrade()));
      var2.add(SkillUtil.getSepciesN(var1.getSpeciesId()));
      var2.add(var1);
      this.mu.addElement(var2);
   }

   public void ck(List<TeamRole> var1) {
      int var10001 = 2 & 5;
      this.mu.clear();
      int var2 = var10001;
      int var3 = var1 != null ? var1.size() : 0;

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         this.hd((TeamRole)var1.get(var2++));
      }

      if (this.mt.getRowCount() > 0) {
         this.mt.setRowSelectionInterval(3 >> 2, 3 >> 2);
      }

      this.mv.getVerticalScrollBar().setValue(3 >> 2);
      this.ve().a(this.ae());
   }
}
