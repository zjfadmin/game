package com.xy.a;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class94 extends JComponent {
   private Class141 akl;
   // $VF: synthetic field
   final Class41 akm;
   private JComponent jq;
   private List<Class141> eq;
   private JScrollPane ba;
   private JList<Class141> pf;

   // $VF: synthetic method
   static JList acp(Class94 var0) {
      return var0.pf;
   }

   // $VF: synthetic method
   static Class141 acq(Class94 var0) {
      return var0.akl;
   }

   // $VF: synthetic method
   static List acr(Class94 var0) {
      return var0.eq;
   }

   public Class94(Class41 var1) {
      this.akm = var1;
      this.setOpaque(false);
      this.setLayout(null);
      this.jq = new Class24(this);
      this.jq.setBounds(0, 0, 490, 288);
      this.jq.addMouseListener(com.xy.q.Class1.c);
      this.jq.setVisible(false);
      this.add(this.jq);
      this.eq = new ArrayList<>();
      this.pf = new JList<>();
      this.pf.setFont(com.xy.q.Class49.bm);
      this.pf.setBackground(com.xy.q.Class49.bk);
      this.pf.setSelectionMode(0);
      this.ba = com.xy.q.Class1.g(0, 0, 490, 288, this.pf, -1);
      this.add(this.ba);
   }

   // $VF: synthetic method
   static JComponent acs(Class94 var0) {
      return var0.jq;
   }

   // $VF: synthetic method
   static void act(Class94 var0, Class141 var1) {
      var0.akl = var1;
   }
}
