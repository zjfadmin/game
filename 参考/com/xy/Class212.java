package com.xy;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Point;
import java.math.BigDecimal;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class212 extends Class345 {
   private BigDecimal iq;
   private String rw;
   private JList<String> rx;
   private String[] ry;

   public void eb(BigDecimal var1, String var2) {
      this.iq = var1;
      this.rw = var2;
      this.rx.clearSelection();
      Point var3;
      this.vf(Math.min((var3 = this.ux().abg(123 & 103, 31995 & 919)).x, this.aej.screenData.Screen_x - (107 & 119)), var3.y, 107 & 119, 11451 & 21463);
      this.ve().a(this.ae());
   }

   public Class212(GameView var1) {
      int var10001 = --4;
      int var10012 = 114 & 93;
      super(125 & 79, 1 ^ 3, Class345.aei, var1);
      this.va(var10012, 108 & 119, 107 & 119, 22427 & 10487, Class345.aei);
      this.fx("sc/c/59");
      this.rx = new JList();
      this.rx.setOpaque((boolean)(2 & 5));
      this.rx.setBackground(Class681.cu);
      this.rx.setForeground(Color.white);
      this.rx.setFont(Class681.ce);
      this.rx.setSelectionForeground(Color.white);
      this.rx.setSelectionBackground(Class681.cu);
      this.rx.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               Class212.this.y(Class212.this.rx.getSelectedIndex());
            }

         }
      });
      String[] var2 = new String[var10001];
      boolean var10003 = true;
      var2[2 & 5] = "交易";
      var2[3 >> 1] = "组队";
      var2[1 ^ 3] = "加好友";
      var2[--3] = "关闭";
      this.ry = var2;
      this.rx.setListData(this.ry);
      this.rx.setBounds(5 >> 2, --3, 126 & 95, 29581 & 3326);
      this.add(this.rx);
   }

   public void y(int var1) {
      this.ve().n(this.ae());
      if (var1 != -4 >> 2 && var1 != --3) {
         if (var1 == (1 ^ 3)) {
            Class183.ao(this.iq, this.rw, this.ux());
         } else if (var1 == --1) {
            Class183.y(this.iq, this.ux());
         } else {
            Class183 var2;
            if ((var2 = this.ux().mapScene.o(this.iq)) == null) {
               this.ux().fw("玩家离你太远了");
            } else if (var2 == this.ux().roleUnit) {
               this.ux().fw("不能对自己操作");
            } else {
               if (var1 == 0) {
                  Class183.ak(var2, this.ux());
               }

            }
         }
      }
   }
}
