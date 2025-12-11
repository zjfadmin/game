package com.xy.a;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Class110 extends com.xy.q.Class30 {
   private DefaultTableModel aor;
   private Vector<String> aos;
   private boolean dr;
   private com.xy.i.Class18 md;
   private Vector<Vector<String>> aot;
   private JTable fq;

   public void ci(String var1) {
      this.aor.getDataVector().clear();
      if (var1 != null && !var1.equals("")) {
         String var10001 = "\u001f(";
         String[] var2 = var1.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {
            String var7 = var2[var3];
            var10001 = "v";
            String[] var4 = var7.split("&");
            Vector var5 = new Vector();

            int var6;
            for (int var8 = var6 = 0; var8 < var4.length; var8 = var6) {
               var5.add(var4[var6++]);
            }

            var3++;
            this.aor.addRow(var5);
         }
      }
   }

   public void h() {
      try {
         Class110 var10000;
         if (this.dr) {
            var10000 = this;
            this.md.setBounds(0, 0, 18, 18);
            String var10004 = "07l7lg";
            this.md.setImage("sc/c/3");
            this.yv(-9, 0, 18, 18);
         } else {
            var10000 = this;
            this.md.setBounds(192, 0, 18, 18);
            String var3 = "\u00173K3KaRc";
            this.md.setImage("sc/c/163");
            this.yv(-9, 0, 210, 188);
         }

         var10000.dr = !this.dr;
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public Class110(GameView var1) {
      super(9, 2, com.xy.q.Class30.agf, var1);
      String var10004 = "07l7leu`";
      this.dr = true;
      this.yy(-9, 0, 210, 188, com.xy.q.Class30.agf);
      this.dp("sc/c/164");
      this.aor = new DefaultTableModel();
      this.aot = new Vector<>();
      this.aos = new Vector<>();
      this.aot.add(this.aos);
      Vector var2;
      (var2 = new Vector()).add("");
      var2.add("");
      var2.add("");
      this.aor.setDataVector(this.aot, var2);
      this.fq = new Class111(this);
      this.fq.setShowGrid(false);
      Class70 var3;
      (var3 = new Class70(this)).setHorizontalAlignment(0);
      this.fq.setDefaultRenderer(Object.class, var3);
      JTableHeader var4 = this.fq.getTableHeader();
      var4.setPreferredSize(new Dimension(var4.getWidth(), 0));
      this.fq.getTableHeader().setBackground(com.xy.q.Class49.bk);
      this.fq.getTableHeader().setVisible(true);
      this.fq.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.ORANGE));
      this.fq.setSelectionBackground(com.xy.q.Class49.bk);
      this.fq.setSelectionForeground(Color.white);
      this.fq.setForeground(Color.white);
      this.fq.setFont(com.xy.q.Class49.bz);
      this.fq.setBackground(com.xy.q.Class49.bk);
      this.fq.setModel(this.aor);
      this.fq.getColumnModel().getColumn(0).setPreferredWidth(90);
      this.fq.getColumnModel().getColumn(1).setPreferredWidth(60);
      this.fq.getColumnModel().getColumn(2).setPreferredWidth(60);
      this.fq.setRowHeight(25);
      this.fq.setAutoResizeMode(0);
      this.fq.isCellEditable(1, 1);
      this.fq.setEnabled(true);
      this.fq.setBounds(0, 53, 210, 135);
      this.add(this.fq);
      String var10012 = "\u00173K3KaRc";
      this.md = new com.xy.i.Class18("sc/c/163", 1, 131, this);
      this.md.setBounds(192, 0, 18, 18);
      this.add(this.md);
   }
}
