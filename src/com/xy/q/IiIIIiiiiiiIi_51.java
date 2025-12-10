/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.q;

import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiiiIi
extends JPanel {
    private DefaultListModel<String> IIiiIiiiIIiIi;
    private JList<String> iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private String iiIiiiiiiiIii;
    private ImageIcon IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int heigth) {
        this.IiIIIiiiiIiiI = heigth;
    }

    public DefaultListModel<String> ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi != null) return this.IIiiIiiiIIiIi;
        this.IIiiIiiiIIiIi = new DefaultListModel();
        return this.IIiiIiiiIIiIi;
    }

    public String ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    /*
     * WARNING - void declaration
     */
    public IiIIIiiiiiiIi(int n, int n2, String string, String[] stringArray) {
        void rowData;
        void backPath;
        void heigth;
        void width;
        this.ALLATORIxDEMO = width;
        this.IiIIIiiiiIiiI = heigth;
        this.iiIiiiiiiiIii = backPath;
        this.setPreferredSize(new Dimension((int)width, (int)heigth));
        this.setLayout(null);
        this.setOpaque(true);
        this.add(IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)(width + 2), (int)(heigth - true), this.ALLATORIxDEMO(), (int)20));
        if (rowData == null) return;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < ((void)rowData).length) {
            this.ALLATORIxDEMO().add(IiiiiiiiIIIII, (String)rowData[IiiiiiiiIIIII++]);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiiiiiiiIIIII == null) {
            this.IiiiiiiiIIIII = new ImageIcon(this.iiIiiiiiiiIii);
        }
        g.drawImage(this.IiiiiiiiIIIII.getImage(), 0, 0, this.ALLATORIxDEMO, this.IiIIIiiiiIiiI, this);
    }

    @Override
    public int getWidth() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(JList<String> jlist) {
        this.iIiIiiiiIiIii = jlist;
    }

    public void ALLATORIxDEMO(DefaultListModel<String> listModel) {
        this.IIiiIiiiIIiIi = listModel;
    }

    public void ALLATORIxDEMO(String[] rowData) {
        this.ALLATORIxDEMO().clear();
        if (rowData == null) return;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < rowData.length) {
            this.ALLATORIxDEMO().add(IiiiiiiiIIIII, rowData[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(String backPath) {
        this.iiIiiiiiiiIii = backPath;
    }

    public JList<String> ALLATORIxDEMO() {
        if (this.iIiIiiiiIiIii != null) return this.iIiIiiiiIiIii;
        this.iIiIiiiiIiIii = new JList();
        this.iIiIiiiiIiIii.setSelectionBackground(new Color(122, 117, 112));
        this.iIiIiiiiIiIii.setSelectionForeground(Color.white);
        this.iIiIiiiiIiIii.setForeground(Color.white);
        this.iIiIiiiiIiIii.setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.iIiIiiiiIiIii.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iIiIiiiiIiIii.setOpaque(false);
        this.iIiIiiiiIiIii.setModel(this.ALLATORIxDEMO());
        return this.iIiIiiiiIiIii;
    }

    public int ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(int width) {
        this.ALLATORIxDEMO = width;
    }
}
