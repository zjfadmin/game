package com.xy.q;

import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class Class1 {
   public static DefaultTableCellHeaderRenderer a = new Class55();
   static Rectangle b = new Rectangle();
   public static MouseListener c = new Class22();
   public static DefaultTableCellRenderer d = new Class5();

   public static Class52 a(int var0, Color var1, Font var2, MoneyType var3, GameView var4) {
      Class52 var5 = new Class52(var3, var4);
      var5.setHorizontalAlignment(var0);
      var5.setForeground(var1);
      var5.setFont(var2);
      if (10 == var0) {
         var5.n(2);
      }

      return var5;
   }

   public static JPasswordField b(Font var0, Color var1) {
      Class8 var2 = new Class8();
      var2.setBackground(Class49.bk);
      var2.setBorder(BorderFactory.createEmptyBorder());
      var2.setCaretColor(Color.WHITE);
      var2.setForeground(var1);
      if (var0 != null) {
         var2.setFont(var0);
      }

      return var2;
   }

   public static <E> void c(JList<E> var0, Color var1, Font var2) {
      var0.setSelectionBackground(Class49.au);
      var0.setSelectionForeground(var1);
      var0.setForeground(var1);
      var0.setFont(var2);
      var0.setBackground(Class49.bk);
      var0.setSelectionMode(0);
   }

   public static Class16 d(com.xy.w.Class9 var0, Font var1, Color var2) {
      Class16 var3 = new Class16(var0);
      var3.setBorder(BorderFactory.createEmptyBorder());
      var3.setBackground(Class49.bk);
      var3.setForeground(var2);
      var3.setCaretColor(Color.WHITE);
      var3.setOpaque(false);
      if (var1 != null) {
         var3.setFont(var1);
      }

      return var3;
   }

   public static JTextArea e(Font var0, Color var1) {
      Class38 var2 = new Class38();
      var2.setBorder(BorderFactory.createEmptyBorder());
      var2.setBackground(Class49.bk);
      var2.setForeground(var1);
      var2.setCaretColor(Color.WHITE);
      var2.setOpaque(false);
      if (var0 != null) {
         var2.setFont(var0);
      }

      return var2;
   }

   public static JLabel f(int var0, int var1, int var2, int var3, int var4, Color var5, Font var6) {
      JLabel var7 = new JLabel();
      var7.setHorizontalAlignment(var4);
      var7.setBounds(var0, var1, var2, var3);
      var7.setForeground(var5);
      var7.setFont(var6);
      return var7;
   }

   public static JScrollPane g(int var0, int var1, int var2, int var3, Component var4, int var5) {
      Class15 var6 = new Class15(var4);
      var6.setHorizontalScrollBarPolicy(31);
      var6.setVerticalScrollBarPolicy(22);
      var6.getVerticalScrollBar().setUI(com.xy.v.Class13.wo());
      if (var5 != -1) {
         var6.getVerticalScrollBar().setUnitIncrement(var5);
      }

      var6.getViewport().setOpaque(false);
      if (var4 != null) {
         ((JComponent)var4).setOpaque(false);
      }

      var6.setOpaque(false);
      var6.setBorder(BorderFactory.createEmptyBorder());
      var6.setBounds(var0, var1, var2, var3);
      return var6;
   }

   public static Class12 h(com.xy.w.Class9 var0, Font var1, Color var2) {
      Class12 var3 = new Class12(var0);
      var3.setBorder(BorderFactory.createEmptyBorder());
      var3.setBackground(Class49.bk);
      var3.setForeground(var2);
      var3.setCaretColor(Color.WHITE);
      var3.setOpaque(false);
      if (var1 != null) {
         var3.setFont(var1);
      }

      return var3;
   }

   public static Class14 i(int var0, int var1, int var2, int var3, int var4, Color var5, Font var6) {
      Class14 var7 = new Class14();
      var7.setHorizontalAlignment(var4);
      var7.setBounds(var0, var1, var2, var3);
      var7.setForeground(var5);
      var7.setFont(var6);
      return var7;
   }

   public static Class36 j(com.xy.w.Class9 var0, Font var1, Color var2) {
      Class36 var3 = new Class36(var0);
      var3.setBorder(BorderFactory.createEmptyBorder());
      var3.setBackground(Class49.bk);
      var3.setForeground(var2);
      var3.setCaretColor(Color.WHITE);
      var3.setOpaque(false);
      if (var1 != null) {
         var3.setFont(var1);
      }

      return var3;
   }

   public static JLabel k(int var0, int var1, int var2, int var3, Color var4, Font var5) {
      JLabel var6 = new JLabel();
      var6.setBounds(var0, var1, var2, var3);
      var6.setForeground(var4);
      var6.setFont(var5);
      return var6;
   }

   public static JTable l(Vector<Vector<Object>> var0, Vector<String> var1, Font var2, Color var3, int... var4) {
      Class35 var5 = new Class35(var0, var1);
      var5.setSelectionMode(0);
      var5.setDefaultRenderer(Object.class, d);
      var5.setOpaque(false);
      var5.setShowGrid(false);
      var5.getColumnModel().setColumnMargin(0);
      var5.setBorder(BorderFactory.createEmptyBorder());
      var5.setBackground(Class49.bk);
      var5.setForeground(var3);
      var5.setFont(var2);
      var5.setRowHeight(20);
      JTableHeader var6 = var5.getTableHeader();
      var6.setDefaultRenderer(a);
      var6.setResizingAllowed(false);
      var6.setReorderingAllowed(false);
      var6.setBackground(Class49.bk);
      var6.setEnabled(false);
      int var7;
      if (var4 != null) {
         for (int var10000 = var7 = 0; var10000 < var4.length; var10000 = var7) {
            var5.getColumnModel().getColumn(var7).setPreferredWidth(var4[var7++]);
         }
      }

      return var5;
   }

   public static Class52 m(int var0, int var1, int var2, int var3, int var4, Color var5, Font var6, MoneyType var7, GameView var8) {
      Class52 var9 = new Class52(var7, var8);
      var9.setHorizontalAlignment(var4);
      var9.setBounds(var0, var1, var2, var3);
      var9.setForeground(var5);
      var9.setFont(var6);
      return var9;
   }

   static {
      d.setHorizontalAlignment(0);
      a.setHorizontalAlignment(0);
   }

   public static JTextField n(Font var0, Color var1) {
      Class37 var2 = new Class37();
      var2.setBorder(BorderFactory.createEmptyBorder());
      var2.setBackground(Class49.bk);
      var2.setForeground(var1);
      var2.setCaretColor(Color.WHITE);
      var2.setOpaque(false);
      if (var0 != null) {
         var2.setFont(var0);
      }

      return var2;
   }
}
