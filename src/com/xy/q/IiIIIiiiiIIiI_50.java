/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IIIIiiiiIIIIi
 *  com.xy.q.IIiiiiiiIIIii
 *  com.xy.q.IiIiiiiiIIIiI
 *  com.xy.q.IiiIiiiiIIIIi
 *  com.xy.q.IiiIiiiiIiIIi
 *  com.xy.q.IiiiIiiiiIIII
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIIiiiiiIIIIi
 *  com.xy.q.iiIIIiiiiiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiIiiiiiIIiiI
 *  com.xy.q.iiiiiiiiIIIII
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.q.IIIIiiiiIIIIi;
import com.xy.q.IIiiiiiiIIIii;
import com.xy.q.IiIiiiiiIIIiI;
import com.xy.q.IiiIiiiiIIIIi;
import com.xy.q.IiiIiiiiIiIIi;
import com.xy.q.IiiiIiiiiIIII;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIIiiiiiIIIIi;
import com.xy.q.iiIIIiiiiiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiIiiiiiIIiiI;
import com.xy.q.iiiiiiiiIIIII;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIiIiiiiIIiii;
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
import javax.swing.plaf.ScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiIIiI {
    public static DefaultTableCellHeaderRenderer IiIIIiiiiIiiI;
    static Rectangle iiIiiiiiiiIii;
    public static MouseListener IiiiiiiiIIIII;
    public static DefaultTableCellRenderer ALLATORIxDEMO;

    public static iiIiIiiiiIiIi ALLATORIxDEMO(int horizontalAlignment, Color color, Font font, MoneyType moneyType, GameView gameView) {
        iiIiIiiiiIiIi IiiiiiiiIIIII = new iiIiIiiiiIiIi(moneyType, gameView);
        IiiiiiiiIIIII.setHorizontalAlignment(horizontalAlignment);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setFont(font);
        if (10 != horizontalAlignment) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO(2);
        return IiiiiiiiIIIII;
    }

    public static JPasswordField ALLATORIxDEMO(Font font, Color color) {
        iIIiiiiiIIIIi IiiiiiiiIIIII = new iIIiiiiiIIIIi();
        IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setCaretColor(Color.WHITE);
        IiiiiiiiIIIII.setForeground(color);
        if (font == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static <E> void ALLATORIxDEMO(JList<E> list, Color color, Font font) {
        list.setSelectionBackground(iiIIiiiiIiiII.iIiiIiiiIIIIi);
        list.setSelectionForeground(color);
        list.setForeground(color);
        list.setFont(font);
        list.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        list.setSelectionMode(0);
    }

    public static IIiiiiiiIIIii ALLATORIxDEMO(IIiIiiiiIIiii imgCut, Font font, Color color) {
        IIiiiiiiIIIii IiiiiiiiIIIII = new IIiiiiiiIIIii(imgCut);
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setCaretColor(Color.WHITE);
        IiiiiiiiIIIII.setOpaque(false);
        if (font == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static JTextArea ALLATORIxDEMO(Font font, Color color) {
        iiiiiiiiIIIII IiiiiiiiIIIII = new iiiiiiiiIIIII();
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setCaretColor(Color.WHITE);
        IiiiiiiiIIIII.setOpaque(false);
        if (font == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static JLabel ALLATORIxDEMO(int x1, int x2, int x3, int x4, int horizontalAlignment, Color color, Font font) {
        JLabel IiiiiiiiIIIII = new JLabel();
        IiiiiiiiIIIII.setHorizontalAlignment(horizontalAlignment);
        IiiiiiiiIIIII.setBounds(x1, x2, x3, x4);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static JScrollPane ALLATORIxDEMO(int x1, int x2, int x3, int x4, Component view, int unitIncrement) {
        IIIIiiiiIIIIi IiiiiiiiIIIII = new IIIIiiiiIIIIi(view);
        IiiiiiiiIIIII.setHorizontalScrollBarPolicy(31);
        IiiiiiiiIIIII.setVerticalScrollBarPolicy(22);
        IiiiiiiiIIIII.getVerticalScrollBar().setUI((ScrollBarUI)iiiiiiiiiiIiI.ALLATORIxDEMO());
        if (unitIncrement != -1) {
            IiiiiiiiIIIII.getVerticalScrollBar().setUnitIncrement(unitIncrement);
        }
        IiiiiiiiIIIII.getViewport().setOpaque(false);
        if (view != null) {
            ((JComponent)view).setOpaque(false);
        }
        IiiiiiiiIIIII.setOpaque(false);
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setBounds(x1, x2, x3, x4);
        return IiiiiiiiIIIII;
    }

    public static IiiIiiiiIiIIi ALLATORIxDEMO(IIiIiiiiIIiii imgCut, Font font, Color color) {
        IiiIiiiiIiIIi IiiiiiiiIIIII = new IiiIiiiiIiIIi(imgCut);
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setCaretColor(Color.WHITE);
        IiiiiiiiIIIII.setOpaque(false);
        if (font == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static iIIiIiiiIiiIi ALLATORIxDEMO(int x1, int x2, int x3, int x4, int horizontalAlignment, Color color, Font font) {
        iIIiIiiiIiiIi IiiiiiiiIIIII = new iIIiIiiiIiiIi();
        IiiiiiiiIIIII.setHorizontalAlignment(horizontalAlignment);
        IiiiiiiiIIIII.setBounds(x1, x2, x3, x4);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static IiiiIiiiiIiII ALLATORIxDEMO(IIiIiiiiIIiii imgCut, Font font, Color color) {
        IiiiIiiiiIiII IiiiiiiiIIIII = new IiiiIiiiiIiII(imgCut);
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setCaretColor(Color.WHITE);
        IiiiiiiiIIIII.setOpaque(false);
        if (font == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static JLabel ALLATORIxDEMO(int x1, int x2, int x3, int x4, Color color, Font font) {
        JLabel IiiiiiiiIIIII = new JLabel();
        IiiiiiiiIIIII.setBounds(x1, x2, x3, x4);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    public static JTable ALLATORIxDEMO(Vector<Vector<Object>> datas, Vector<String> titles, Font font, Color color, int ... size) {
        IiIiiiiiIIIiI IiiiiiiiIIIII = new IiIiiiiiIIIiI(datas, titles);
        IiiiiiiiIIIII.setSelectionMode(0);
        IiiiiiiiIIIII.setDefaultRenderer(Object.class, ALLATORIxDEMO);
        IiiiiiiiIIIII.setOpaque(false);
        IiiiiiiiIIIII.setShowGrid(false);
        IiiiiiiiIIIII.getColumnModel().setColumnMargin(0);
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setFont(font);
        IiiiiiiiIIIII.setRowHeight(20);
        JTableHeader IiiiiiiiIIIII2 = IiiiiiiiIIIII.getTableHeader();
        IiiiiiiiIIIII2.setDefaultRenderer(IiIIIiiiiIiiI);
        IiiiiiiiIIIII2.setResizingAllowed(false);
        IiiiiiiiIIIII2.setReorderingAllowed(false);
        IiiiiiiiIIIII2.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.setEnabled(false);
        if (size == null) return IiiiiiiiIIIII;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < size.length) {
            IiiiiiiiIIIII.getColumnModel().getColumn(IiiiiiiiIIIII3).setPreferredWidth(size[IiiiiiiiIIIII3++]);
        }
        return IiiiiiiiIIIII;
    }

    public static iiIiIiiiiIiIi ALLATORIxDEMO(int x1, int x2, int x3, int x4, int horizontalAlignment, Color color, Font font, MoneyType moneyType, GameView gameView) {
        iiIiIiiiiIiIi IiiiiiiiIIIII = new iiIiIiiiiIiIi(moneyType, gameView);
        IiiiiiiiIIIII.setHorizontalAlignment(horizontalAlignment);
        IiiiiiiiIIIII.setBounds(x1, x2, x3, x4);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }

    static {
        IiiiiiiiIIIII = new IiiIiiiiIIIIi();
        ALLATORIxDEMO = new iiIIIiiiiiIII();
        IiIIIiiiiIiiI = new iiIiiiiiIIiiI();
        ALLATORIxDEMO.setHorizontalAlignment(0);
        IiIIIiiiiIiiI.setHorizontalAlignment(0);
        iiIiiiiiiiIii = new Rectangle();
    }

    public static JTextField ALLATORIxDEMO(Font font, Color color) {
        IiiiIiiiiIIII IiiiiiiiIIIII = new IiiiIiiiiIIII();
        IiiiiiiiIIIII.setBorder(BorderFactory.createEmptyBorder());
        IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII.setForeground(color);
        IiiiiiiiIIIII.setCaretColor(Color.WHITE);
        IiiiiiiiIIIII.setOpaque(false);
        if (font == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setFont(font);
        return IiiiiiiiIIIII;
    }
}
