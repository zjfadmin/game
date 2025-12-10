package com.xy;

import com.xy.entity.Gang;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class15 extends Class345 {
   private Class322 aka;
   private Vector<Vector<Object>> bah;
   private JTable avr;
   private JScrollPane fe;
   private JLabel ir;
   private Class436[] an;
   private RichLabel gi;

   public void d() {
      BigDecimal var1;
      if ((var1 = this.aej.roleUnit.r.getGang_id()) != null && var1.intValue() != 0) {
         this.aej.f("你已有帮派");
      } else {
         int var2;
         if ((var2 = this.avr.getSelectedRow()) == -4 >> 2) {
            this.aej.f("你未选中要加入的帮派");
         } else {
            Gang var3 = (Gang)((Vector)this.bah.get(var2)).get(--4);
            String var4 = Agreement.getSendTextAES("gangapply", var3.getGangid().toString());
            this.uw().d(var4);
         }
      }
   }

   public Class15(GameView var1) {
      int var10007 = -4 >> 2;
      super(31 & 124, 1 ^ 3, Class345.aef, var1);
      this.va(var10007, 3 >> 2, 12765 & 20406, 17909 & 15359, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 85 & 110, 85 & 110, 85 & 110, 85 & 110, (boolean)(3 >> 2)), "加入帮派");
      this.aka = new Class322("sc/e/26.png", --1, 28667 & 4246, Class681.ak, Class681.c, "申请加入", this);
      this.aka.setBounds(8703 & 24225, 14831 & 18391, 127 & 99, 27 & 125);
      this.add(this.aka);
      this.ir = Class133.c(49 & 127, 18815 & 14248, 9542 & 23547, 23 & 125, 3 >> 2, Class681.c("#cFFFFFF"), Class681.ak);
      this.ir.setText("帮派宗旨");
      this.add(this.ir);
      Vector var2 = new Vector();
      var2.addElement("帮派名称");
      var2.addElement("创始人");
      var2.addElement("帮派等级");
      var2.addElement("人数");
      int var10006 = 127 & 50;
      this.bah = new Vector();
      int[] var10013 = new int[--4];
      boolean var10015 = true;
      var10013[3 & 4] = 93 & 119;
      var10013[3 >> 1] = 126 & 111;
      var10013[5 >> 1] = 75;
      var10013[--3] = 55;
      this.avr = Class133.e(this.bah, var2, Class681.ce, Color.white, var10013);
      this.avr.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               int var2;
               if ((var2 = Class15.this.avr.getSelectedRow()) != -4 >> 2) {
                  Class15.this.ara((Vector)Class15.this.bah.get(var2));
               }
            }
         }
      });
      this.fe = Class133.f(var10006, 31, 320, 250, this.avr, 20);
      this.add(this.fe);
      this.gi = new RichLabel((String)null, Class681.ce);
      this.add(this.gi);
      Class436[] var10001 = new Class436[--4];
      boolean var10003 = true;
      this.an = var10001;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.an.length; var10000 = var3) {
         this.an[var3] = new Class436();
         Class15 var4;
         if (var3 >= 0 && var3 <= 3 >> 1) {
            var4 = this;
            this.an[var3].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 ^ 3)));
            this.an[var3].setBounds(49, 31 + var3 * 265, 322, 21);
         } else if (var3 == 5 >> 1) {
            var4 = this;
            this.an[var3].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
            this.an[var3].setBounds(49, 31, 322, 250);
         } else {
            if (var3 == --3) {
               this.an[var3].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
               this.an[var3].setBounds(49, 296, 322, 150);
            }

            var4 = this;
         }

         var4.add(this.an[var3++]);
      }

   }

   public void ara(Vector<Object> var1) {
      Gang var2 = (Gang)var1.get(--4);
      this.gi.setTextSize(var2.getIntroduction(), 26543 & 6524);
      this.gi.setBounds(50 & 127, 4935 & 28152, this.gi.getWidth(), this.gi.getHeight());
   }

   public void ck(List<Gang> var1) {
      int var10000 = 3 >> 2;
      this.bah.clear();

      for(int var4 = var10000; var10000 < var1.size(); var10000 = var4) {
         Gang var3 = (Gang)var1.get(var4);
         Vector var2;
         (var2 = new Vector()).add(var3.getGangname());
         var2.add(var3.getFounder());
         var2.add("" + var3.getGanggrade());
         var2.add("" + var3.getGangnumber());
         var2.add(var3);
         ++var4;
         this.bah.addElement(var2);
      }

      if (this.avr.getRowCount() > 0) {
         this.avr.setRowSelectionInterval(5 >> 3, 5 >> 3);
      }

      this.fe.getVerticalScrollBar().setValue(3 ^ 3);
      this.ve().a(this.ae());
   }
}
