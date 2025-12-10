package com.xy;

import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
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
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class Class133 {
   public static MouseListener a = new MouseListener() {
      public void mouseClicked(MouseEvent var1) {
      }

      public void mouseEntered(MouseEvent var1) {
      }

      public void mouseExited(MouseEvent var1) {
      }

      public void mouseReleased(MouseEvent var1) {
      }

      public void mousePressed(MouseEvent var1) {
      }
   };
   public static DefaultTableCellHeaderRenderer b = new DefaultTableCellHeaderRenderer() {
      public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
         if (var1 == null) {
            return this;
         } else {
            super.setBackground(Class681.cu);
            super.setForeground(Class133.d);
            this.setFont(Class681.cf);
            this.setValue(var2);
            return this;
         }
      }
   };
   public static DefaultTableCellHeaderRenderer c = new DefaultTableCellHeaderRenderer() {
      public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
         if (var1 == null) {
            return this;
         } else {
            super.setBackground(Class681.cu);
            super.setForeground(Color.white);
            this.setFont(Class681.ak);
            this.setValue(var2);
            return this;
         }
      }
   };
   static Color d = new Color(1269 & 31743, 31983 & 1018, 12267 & 20703);
   static Rectangle e;
   public static DefaultTableCellRenderer f = new DefaultTableCellRenderer() {
      public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
         if (var1 == null) {
            return this;
         } else {
            DropLocation var7;
            if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
               var3 = 5 >> 2;
            }

            <undefinedtype> var10000;
            if (var3 != 0) {
               super.setBackground(Class681.bk);
               var10000 = this;
            } else {
               super.setBackground(Class681.cu);
               var10000 = this;
            }

            var10000.setForeground(var1.getForeground());
            this.setFont(var1.getFont());
            this.setValue(var2);
            return this;
         }
      }
   };

   public static Class245 a(int var0, int var1, int var2, int var3, int var4, Color var5, Font var6) {
      Class245 var7 = new Class245();
      var7.setHorizontalAlignment(var4);
      var7.setBounds(var0, var1, var2, var3);
      var7.setForeground(var5);
      var7.setFont(var6);
      return var7;
   }

   static {
      f.setHorizontalAlignment(3 >> 2);
      c.setHorizontalAlignment(3 >> 2);
      e = new Rectangle();
   }

   public static JLabel b(int var0, int var1, int var2, int var3, Color var4, Font var5) {
      JLabel var6 = new JLabel();
      var6.setBounds(var0, var1, var2, var3);
      var6.setForeground(var4);
      var6.setFont(var5);
      return var6;
   }

   public static JLabel c(int var0, int var1, int var2, int var3, int var4, Color var5, Font var6) {
      JLabel var7 = new JLabel();
      var7.setHorizontalAlignment(var4);
      var7.setBounds(var0, var1, var2, var3);
      var7.setForeground(var5);
      var7.setFont(var6);
      return var7;
   }

   public static JTextArea d(Font var0, Color var1) {
      JTextArea var2 = new JTextArea() {
         public void paintImmediately(int var1, int var2, int var3, int var4) {
         }
      };
      int var10002 = 3 >> 2;
      var2.setBorder(BorderFactory.createEmptyBorder());
      var2.setBackground(Class681.cu);
      var2.setForeground(var1);
      var2.setCaretColor(Color.WHITE);
      var2.setOpaque((boolean)var10002);
      if (var0 != null) {
         var2.setFont(var0);
      }

      return var2;
   }

   public static JTable e(Vector<Vector<Object>> var0, Vector<String> var1, Font var2, Color var3, int... var4) {
      JTable var5 = new JTable(var0, var1) {
         public boolean isCellEditable(int var1, int var2) {
            return (boolean)(3 >> 2);
         }
      };
      int var10002 = 22 & 125;
      int var10011 = 3 >> 2;
      int var10013 = 2 & 5;
      var5.setSelectionMode(5 >> 3);
      var5.setDefaultRenderer(Object.class, f);
      var5.setOpaque((boolean)var10013);
      var5.setShowGrid((boolean)var10011);
      var5.getColumnModel().setColumnMargin(3 >> 2);
      var5.setBorder(BorderFactory.createEmptyBorder());
      var5.setBackground(Class681.cu);
      var5.setForeground(var3);
      var5.setFont(var2);
      var5.setRowHeight(var10002);
      JTableHeader var6 = var5.getTableHeader();
      var10002 = 2 & 5;
      int var10005 = 5 >> 3;
      int var10007 = 5 >> 3;
      var6.setDefaultRenderer(c);
      var6.setResizingAllowed((boolean)var10007);
      var6.setReorderingAllowed((boolean)var10005);
      var6.setBackground(Class681.cu);
      var6.setEnabled((boolean)var10002);
      int var7;
      if (var4 != null) {
         for(int var10000 = var7 = 3 & 4; var10000 < var4.length; var10000 = var7) {
            var5.getColumnModel().getColumn(var7).setPreferredWidth(var4[var7++]);
         }
      }

      return var5;
   }

   public static JScrollPane f(int var0, int var1, int var2, int var3, Component var4, int var5) {
      JScrollPane var6 = new JScrollPane(var4) {
         public void paintImmediately(int var1, int var2, int var3, int var4) {
         }
      };
      int var10003 = 94 & 55;
      var6.setHorizontalScrollBarPolicy(127 & 31);
      var6.setVerticalScrollBarPolicy(var10003);
      var6.getVerticalScrollBar().setUI(Class179.alc());
      if (var5 != -4 >> 2) {
         var6.getVerticalScrollBar().setUnitIncrement(var5);
      }

      var6.getViewport().setOpaque((boolean)(3 >> 2));
      if (var4 != null) {
         ((JComponent)var4).setOpaque((boolean)(5 >> 3));
      }

      var6.setOpaque((boolean)(5 >> 3));
      var6.setBorder(BorderFactory.createEmptyBorder());
      var6.setBounds(var0, var1, var2, var3);
      return var6;
   }

   public static Class72 g(Class604 var0, Font var1, Color var2) {
      Class72 var3 = new Class72(var0);
      int var10002 = 3 >> 2;
      var3.setBorder(BorderFactory.createEmptyBorder());
      var3.setBackground(Class681.cu);
      var3.setForeground(var2);
      var3.setCaretColor(Color.WHITE);
      var3.setOpaque((boolean)var10002);
      if (var1 != null) {
         var3.setFont(var1);
      }

      return var3;
   }

   public static JPasswordField h(Font var0, Color var1) {
      JPasswordField var2 = new JPasswordField() {
         public void paintImmediately(int var1, int var2, int var3, int var4) {
         }
      };
      var2.setBackground(Class681.cu);
      var2.setBorder(BorderFactory.createEmptyBorder());
      var2.setCaretColor(Color.WHITE);
      var2.setForeground(var1);
      if (var0 != null) {
         var2.setFont(var0);
      }

      return var2;
   }

   public static Class556 i(int var0, Color var1, Font var2, MoneyType var3, GameView var4) {
      Class556 var5 = new Class556(var3, var4);
      int var10000 = 62 & 75;
      var5.setHorizontalAlignment(var0);
      var5.setForeground(var1);
      var5.setFont(var2);
      if (var10000 == var0) {
         var5.ab(5 >> 1);
      }

      return var5;
   }

   public static <E> void j(JList<E> var0, Color var1, Font var2) {
      int var10001 = 5 >> 3;
      var0.setSelectionBackground(Class681.bk);
      var0.setSelectionForeground(var1);
      var0.setForeground(var1);
      var0.setFont(var2);
      var0.setBackground(Class681.cu);
      var0.setSelectionMode(var10001);
   }

   public static Class693 k(Class604 var0, Font var1, Color var2) {
      Class693 var3 = new Class693(var0);
      int var10002 = 3 & 4;
      var3.setBorder(BorderFactory.createEmptyBorder());
      var3.setBackground(Class681.cu);
      var3.setForeground(var2);
      var3.setCaretColor(Color.WHITE);
      var3.setOpaque((boolean)var10002);
      if (var1 != null) {
         var3.setFont(var1);
      }

      return var3;
   }

   public static JTextField l(Font var0, Color var1) {
      JTextField var2 = new JTextField() {
         public void paintImmediately(int var1, int var2, int var3, int var4) {
         }
      };
      int var10002 = 3 & 4;
      var2.setBorder(BorderFactory.createEmptyBorder());
      var2.setBackground(Class681.cu);
      var2.setForeground(var1);
      var2.setCaretColor(Color.WHITE);
      var2.setOpaque((boolean)var10002);
      if (var0 != null) {
         var2.setFont(var0);
      }

      return var2;
   }

   public static Class556 m(int var0, int var1, int var2, int var3, int var4, Color var5, Font var6, MoneyType var7, GameView var8) {
      Class556 var9 = new Class556(var7, var8);
      var9.setHorizontalAlignment(var4);
      var9.setBounds(var0, var1, var2, var3);
      var9.setForeground(var5);
      var9.setFont(var6);
      return var9;
   }

   public static Class217 n(Class604 var0, Font var1, Color var2) {
      Class217 var3 = new Class217(var0);
      int var10002 = 2 & 5;
      var3.setBorder(BorderFactory.createEmptyBorder());
      var3.setBackground(Class681.cu);
      var3.setForeground(var2);
      var3.setCaretColor(Color.WHITE);
      var3.setOpaque((boolean)var10002);
      if (var1 != null) {
         var3.setFont(var1);
      }

      return var3;
   }
}
