package com.xy.a.v;

import com.xy.scene.BWDHTeam;
import java.awt.Color;
import java.util.Vector;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Class10 extends com.xy.q.Class50 {
   // $VF: synthetic field
   final Class23 mt;
   private Vector<Vector<Object>> fo;
   private JScrollPane ba;
   private JTable fq;

   public Class10(Class23 var1) {
      this.mt = var1;
      Vector var2 = new Vector();
      String var10008 = "灙宋涤老";
      String var10010 = "厶啹儧淕聍";
      String var10012 = "囈吤敦";
      String var10014 = "赂坠";
      String var10016 = "胰圬";
      String var10018 = "禲剜";
      String var10020 = "阉伡君";
      String var10022 = "描呗";
      var2.addElement("排名");
      var2.addElement("队伍名");
      var2.addElement("积分");
      var2.addElement("胜场");
      var2.addElement("负场");
      var2.addElement("回合数");
      var2.addElement("召唤兽消耗");
      var2.addElement("灵宝消耗");
      this.fo = new Vector<>();
      this.fq = com.xy.q.Class1.l(this.fo, var2, com.xy.q.Class49.ac, Color.white, 68, 80, 60, 60, 60, 90, 90);
      Class41 var3;
      (var3 = new Class41(this)).setHorizontalAlignment(0);
      this.fq.setDefaultRenderer(Object.class, var3);
      this.ba = com.xy.q.Class1.g(48, 95, 595, 357, this.fq, 20);
      JScrollBar var10002 = this.ba.getVerticalScrollBar();
      String var10005 = ".9r>rkmls*3=";
      var10002.setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/106.png", 3, 3, 3, 3, false), 8));
      this.add(this.ba);
   }

   public void js(BWDHTeam[] var1) {
      int var10000 = 0;
      this.fo.clear();

      for (int var2 = 0; var10000 < var1.length; var10000 = var2) {
         BWDHTeam var3 = var1[var2];
         Vector var4;
         (var4 = new Vector()).add(String.valueOf(var2 + 1));
         var4.add(var3.getName());
         var4.add(String.valueOf(var3.getData2()[0]));
         var4.add(String.valueOf(var3.getData2()[1]));
         var4.add(String.valueOf(var3.getData2()[2]));
         var4.add(String.valueOf(var3.getData2()[3]));
         var4.add(String.valueOf(var3.getData2()[4]));
         var4.add(String.valueOf(var3.getData2()[5]));
         var2++;
         this.fo.addElement(var4);
      }

      if (this.fq.getRowCount() > 0) {
         this.fq.setRowSelectionInterval(0, 0);
      }

      this.fq.updateUI();
      JScrollBar var5 = this.ba.getVerticalScrollBar();
      var5.setMaximum(this.fq.getHeight());
      var5.setValue(0);
   }
}
