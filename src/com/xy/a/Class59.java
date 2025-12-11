package com.xy.a;

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

public class Class59 extends com.xy.q.Class30 {
   private JTable aar;
   private JLabel df;
   private com.xy.w.Class18[] fd;
   private com.xy.i.Class18 fn;
   private Vector<Vector<Object>> fo;
   private JScrollPane ba;
   private RichLabel bj;

   // $VF: synthetic method
   static JTable uy(Class59 var0) {
      return var0.aar;
   }

   public void uz(Vector<Object> var1) {
      Gang var2 = (Gang)var1.get(4);
      this.bj.setTextSize(var2.getIntroduction(), 300);
      this.bj.setBounds(50, 320, this.bj.getWidth(), this.bj.getHeight());
   }

   // $VF: synthetic method
   static Vector va(Class59 var0) {
      return var0.fo;
   }

   public Class59(GameView var1) {
      super(28, 2, com.xy.q.Class30.afz, var1);
      String var10005 = "\u0014+H,HyI8\t/";
      this.yy(-1, 0, 404, 501, com.xy.q.Class30.agh);
      com.xy.w.Class9 var9 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10006 = "劶兢常洹";
      this.yu(var9, "加入帮派");
      String var10007 = ";\u0004g\u0002gU~I8\t/";
      String var10012 = "甥诰劶兢";
      this.fn = new com.xy.i.Class18("sc/e/26.png", 1, 146, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "申请加入", this);
      this.fn.setBounds(161, 455, 99, 25);
      this.add(this.fn);
      String var10011 = "D+!\u000e!\u000e!\u000e";
      this.df = com.xy.q.Class1.f(49, 296, 322, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
      var10005 = "常洹宁旯";
      this.df.setText("帮派宗旨");
      this.add(this.df);
      Vector var2 = new Vector();
      var10005 = "京敷";
      var10007 = "幉浶笮绯";
      String var10009 = "刜姝亽";
      var10011 = "幉浶呪禸";
      var2.addElement("帮派名称");
      var2.addElement("创始人");
      var2.addElement("帮派等级");
      var2.addElement("人数");
      this.fo = new Vector<>();
      this.aar = com.xy.q.Class1.l(this.fo, var2, com.xy.q.Class49.ac, Color.white, 85, 110, 75, 55);
      this.aar.getSelectionModel().addListSelectionListener(new Class32(this));
      this.ba = com.xy.q.Class1.g(50, 31, 320, 250, this.aar, 20);
      this.add(this.ba);
      this.bj = new RichLabel(null, com.xy.q.Class49.ac);
      this.add(this.bj);
      this.fd = new com.xy.w.Class18[4];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.fd.length; var10000 = var3) {
         this.fd[var3] = new com.xy.w.Class18();
         Class59 var4;
         if (var3 >= 0 && var3 <= 1) {
            var4 = this;
            com.xy.w.Class18 var6 = this.fd[var3];
            String var8 = ";\u0004g\u0003gU}I8\t/";
            var6.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fd[var3].setBounds(49, 31 + var3 * 265, 322, 21);
         } else if (var3 == 2) {
            var4 = this;
            com.xy.w.Class18 var10002 = this.fd[var3];
            String var10003 = "tu(r($38wx`";
            var10002.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fd[var3].setBounds(49, 31, 322, 250);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var10001 = this.fd[var3];
               String var5 = ";\u0004g\u0003gU|I8\t/";
               var10001.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.fd[var3].setBounds(49, 296, 322, 150);
            }

            var4 = this;
         }

         var4.add(this.fd[var3++]);
      }
   }

   public void h() {
      BigDecimal var1;
      if ((var1 = this.afx.roleUnit.ap.getGang_id()) != null && var1.intValue() != 0) {
         String var6 = "佧巤朎常洹";
         this.afx._do("你已有帮派");
      } else {
         int var2;
         if ((var2 = this.aar.getSelectedRow()) == -1) {
            String var10001 = "伇杢遮乥触勨儂盌幉浶";
            this.afx._do("你未选中要加入的帮派");
         } else {
            Gang var4 = (Gang)this.fo.get(var2).get(4);
            String var5 = Agreement.getSendTextAES("gangapply", var4.getGangid().toString());
            this.za().k(var5);
         }
      }
   }

   public void fm(List<Gang> var1) {
      int var10000 = 0;
      this.fo.clear();

      for (int var2 = 0; var10000 < var1.size(); var10000 = var2) {
         Gang var3 = var1.get(var2);
         Vector var4;
         (var4 = new Vector()).add(var3.getGangname());
         var4.add(var3.getFounder());
         var4.add("" + var3.getGanggrade());
         var4.add("" + var3.getGangnumber());
         var4.add(var3);
         var2++;
         this.fo.addElement(var4);
      }

      if (this.aar.getRowCount() > 0) {
         this.aar.setRowSelectionInterval(0, 0);
      }

      this.ba.getVerticalScrollBar().setValue(0);
      this.zc().b(this.lj());
   }
}
