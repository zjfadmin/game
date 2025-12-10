/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiIiiiIiIii
 *  com.xy.a.iiIIIiiiIIiII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.IIiiIiiiIiIii;
import com.xy.a.iiIIIiiiIIiII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class iiIiiiiiIIiIi
extends IiiiIiiiiIiIi {
    private DefaultTableModel IIiiIiiiIIiIi;
    private Vector<String> iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI = true;
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private Vector<Vector<String>> IiiiiiiiIIIII;
    private JTable ALLATORIxDEMO;

    public void iIiIiiiiIIiIi(String boardData) {
        this.IIiiIiiiIIiIi.getDataVector().clear();
        if (boardData == null) return;
        if (boardData.equals("")) {
            return;
        }
        String[] IiiiiiiiIIIII = boardData.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("&");
            Vector<String> IiiiiiiiIIIII4 = new Vector<String>();
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3.length) {
                IiiiiiiiIIIII4.add(IiiiiiiiIIIII3[IiiiiiiiIIIII5++]);
            }
            ++IiiiiiiiIIIII2;
            this.IIiiIiiiIIiIi.addRow(IiiiiiiiIIIII4);
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void iiiIiiiiiiIIi() {
        try {
            if (this.IiIIIiiiiIiiI) {
                this.iiIiiiiiiiIii.setBounds(0, 0, 18, 18);
                this.iiIiiiiiiiIii.setImage("sc/c/3");
                this.iIiIiiiiIIiii(-9, 0, 18, 18);
            } else {
                this.iiIiiiiiiiIii.setBounds(192, 0, 18, 18);
                this.iiIiiiiiiiIii.setImage("sc/c/163");
                this.iIiIiiiiIIiii(-9, 0, 210, 188);
            }
            this.IiIIIiiiiIiiI = !this.IiIIIiiiiIiiI;
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public iiIiiiiiIIiIi(GameView gameView) {
        super(9, 2, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        void IiiiiiiiIIIII;
        this.ALLATORIxDEMO(-9, 0, 210, 188, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iIiIiiiiIIiii("sc/c/164");
        this.IIiiIiiiIIiIi = new DefaultTableModel();
        this.IiiiiiiiIIIII = new Vector();
        this.iIiIiiiiIiIii = new Vector();
        this.IiiiiiiiIIIII.add(this.iIiIiiiiIiIii);
        Vector<String> IiiiiiiiIIIII2 = new Vector<String>();
        IiiiiiiiIIIII2.add("");
        IiiiiiiiIIIII2.add("");
        IiiiiiiiIIIII2.add("");
        this.IIiiIiiiIIiIi.setDataVector(this.IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO = new iiIIIiiiIIiII(this);
        this.ALLATORIxDEMO.setShowGrid(false);
        IIiiIiiiIiIii IiiiiiiiIIIII3 = new IIiiIiiiIiIii(this);
        IiiiiiiiIIIII3.setHorizontalAlignment(0);
        this.ALLATORIxDEMO.setDefaultRenderer(Object.class, (TableCellRenderer)IiiiiiiiIIIII3);
        JTableHeader jTableHeader = this.ALLATORIxDEMO.getTableHeader();
        jTableHeader.setPreferredSize(new Dimension(IiiiiiiiIIIII.getWidth(), 0));
        this.ALLATORIxDEMO.getTableHeader().setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.ALLATORIxDEMO.getTableHeader().setVisible(true);
        this.ALLATORIxDEMO.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        this.ALLATORIxDEMO.setSelectionBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.ALLATORIxDEMO.setSelectionForeground(Color.white);
        this.ALLATORIxDEMO.setForeground(Color.white);
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.ALLATORIxDEMO.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.ALLATORIxDEMO.setModel(this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO.getColumnModel().getColumn(0).setPreferredWidth(90);
        this.ALLATORIxDEMO.getColumnModel().getColumn(1).setPreferredWidth(60);
        this.ALLATORIxDEMO.getColumnModel().getColumn(2).setPreferredWidth(60);
        this.ALLATORIxDEMO.setRowHeight(25);
        this.ALLATORIxDEMO.setAutoResizeMode(0);
        this.ALLATORIxDEMO.isCellEditable(1, 1);
        this.ALLATORIxDEMO.setEnabled(true);
        this.ALLATORIxDEMO.setBounds(0, 53, 210, 135);
        this.add(this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI("sc/c/163", 1, 131, (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(192, 0, 18, 18);
        this.add((Component)this.iiIiiiiiiiIii);
    }
}
