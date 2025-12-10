package com.xy;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Class62 extends Class345 {
   private boolean po;
   private Class322 vo;
   private Vector<String> nw;
   private JTable mo;
   private DefaultTableModel vp;
   private Vector<Vector<String>> vq;

   public Class62(GameView var1) {
      int var10006 = -9 & -1;
      int var10008 = 5 >> 2;
      super(15 & 121, 5 >> 1, Class345.aei, var1);
      this.po = (boolean)var10008;
      this.va(var10006, 3 >> 2, 14559 & 18418, 23548 & 9407, Class345.aei);
      this.im("sc/c/164");
      this.vp = new DefaultTableModel();
      this.vq = new Vector();
      this.nw = new Vector();
      this.vq.add(this.nw);
      Vector var2;
      (var2 = new Vector()).add("");
      var2.add("");
      var2.add("");
      this.vp.setDataVector(this.vq, var2);
      this.mo = new JTable() {
         public boolean isCellEditable(int var1, int var2) {
            return (boolean)(3 >> 2);
         }
      };
      this.mo.setShowGrid((boolean)(3 >> 2));
      DefaultTableCellRenderer var3;
      (var3 = new DefaultTableCellRenderer() {
         public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
            this.setForeground(Color.white);
            return super.getTableCellRendererComponent(var1, var2, var3, var4, var5, var6);
         }
      }).setHorizontalAlignment(5 >> 3);
      this.mo.setDefaultRenderer(Object.class, var3);
      JTableHeader var4 = this.mo.getTableHeader();
      var4.setPreferredSize(new Dimension(var4.getWidth(), 3 & 4));
      this.mo.getTableHeader().setBackground(Class681.cu);
      this.mo.getTableHeader().setVisible((boolean)(4 ^ 5));
      this.mo.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.ORANGE));
      this.mo.setSelectionBackground(Class681.cu);
      this.mo.setSelectionForeground(Color.white);
      this.mo.setForeground(Color.white);
      this.mo.setFont(Class681.bm);
      this.mo.setBackground(Class681.cu);
      this.mo.setModel(this.vp);
      this.mo.getColumnModel().getColumn(5 >> 3).setPreferredWidth(127 & 90);
      this.mo.getColumnModel().getColumn(2 ^ 3).setPreferredWidth(125 & 62);
      this.mo.getColumnModel().getColumn(5 >> 1).setPreferredWidth(127 & 60);
      this.mo.setRowHeight(59 & 93);
      this.mo.setAutoResizeMode(3 >> 2);
      this.mo.isCellEditable(--1, --1);
      this.mo.setEnabled((boolean)(--1));
      this.mo.setBounds(2 & 5, 63 & 117, 30207 & 2770, 943 & 31959);
      this.add(this.mo);
      this.vo = new Class322("sc/c/163", --1, 1763 & 31135, this);
      this.vo.setBounds(30165 & 2794, 3 & 4, 114 & 31, 114 & 31);
      this.add(this.vo);
   }

   public void f(String var1) {
      this.vp.getDataVector().clear();
      if (var1 != null && !var1.equals("")) {
         String[] var6 = var1.split("\\|");

         int var2;
         for(int var10000 = var2 = 3 ^ 3; var10000 < var6.length; var10000 = var2) {
            String[] var3 = var6[var2].split("&");
            Vector var4 = new Vector();

            int var5;
            for(var10000 = var5 = 3 ^ 3; var10000 < var3.length; var10000 = var5) {
               var4.add(var3[var5++]);
            }

            ++var2;
            this.vp.addRow(var4);
         }

      }
   }

   public void d() {
      try {
         Class62 var10000;
         int var10002;
         if (this.po) {
            this.vo.setBounds(2 & 5, 2 & 5, 26 & 119, 26 & 119);
            var10002 = -1 & -9;
            var10000 = this;
            this.vo.setImage("sc/c/3");
            this.vf(var10002, 3 ^ 3, 83 & 62, 83 & 62);
         } else {
            this.vo.setBounds(3303 & 29656, 3 & 4, 19 & 126, 19 & 126);
            var10002 = -9 & -1;
            var10000 = this;
            this.vo.setImage("sc/c/163");
            this.vf(var10002, 2 & 5, 17138 & 15839, 2750 & 30205);
         }

         var10000.po = (boolean)(this.po ? 2 & 5 : 1);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
