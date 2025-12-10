/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.w.IIiIiiiiIIiii;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiiIIii
extends JComponent {
    private IIiIiiiiIIiii IiiiiiiiIIIII;
    private JScrollPane ALLATORIxDEMO;

    public IIIiIiiiiIIii(IIiIiiiiIIiii imgCut, JScrollPane scrollPane) {
        this.IiiiiiiiIIIII = imgCut;
        this.ALLATORIxDEMO = scrollPane;
        this.add(scrollPane);
        this.setBounds(scrollPane.getX(), scrollPane.getY(), scrollPane.getWidth(), scrollPane.getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiiiiiiiIIIII == null) return;
        this.IiiiiiiiIIIII.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
    }

    public JScrollPane ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        if (this.IiiiiiiiIIIII != null) {
            this.ALLATORIxDEMO.setBounds(10, 5, width - 15, height - 9);
            return;
        }
        this.ALLATORIxDEMO.setBounds(0, 0, width, height);
    }

    public void ALLATORIxDEMO(IIiIiiiiIIiii iIiIiiiiIIiii) {
        this.IiiiiiiiIIIII = iIiIiiiiIIiii;
        this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public void ALLATORIxDEMO() {
        this.setBounds(this.getX(), this.getY(), this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
    }
}
