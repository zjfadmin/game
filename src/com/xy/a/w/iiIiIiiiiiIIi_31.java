/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IiiIiiiiIIIii
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IiiIiiiiIIIii;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiiiIIi
extends JPanel {
    private IIiIiiiiIiIII IiIiiiiiIIIII;
    private IIIiiiiiIiIiI iiIiIiiiiIIIi;
    private JLabel iiiiIiiiIiiII;
    private IIiIiiiiIiIII iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi = 0;
    private JLabel iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = 0;
    private JLabel iiIiiiiiiiIii;
    final /* synthetic */ IiiIiiiiIIIii IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    static /* synthetic */ int iIiIiiiiIIiii(iiIiIiiiiiIIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO() {
        int IiiiiiiiIIIII = IiiIiiiiIIIii.iIiIiiiiIIiii((IiiIiiiiIIIii)((IiiIiiiiIIIii)this.IiiiiiiiIIIII.ALLATORIxDEMO()));
        double IiiiiiiiIIIII2 = 0.0;
        String IiiiiiiiIIIII3 = this.iIiIiiiiIiIii.getText();
        IiiiiiiiIIIII2 = IiiiiiiiIIIII3.equals("\u6297\u4e09\u5c38\u866b") ? (double)this.IIiiIiiiIIiIi * 100.0 : (IiiiiiiiIIIII3.equals("\u7269\u7406\u8eb2\u95ea") ? (double)this.IIiiIiiiIIiIi * 1.0 : (IiiiiiiiIIIII3.endsWith("\u8eb2\u95ea") || IiiiiiiiIIIII3.endsWith("\u51cf\u514d") ? (double)this.IIiiIiiiIIiIi * 0.4 : (double)this.IIiiIiiiIIiIi * 1.5));
        this.iIiiIiiiiiiII.setText(String.valueOf(IiiiiiiiIIIII2) + this.ALLATORIxDEMO(IiiiiiiiIIIII3));
        this.iiiiIiiiIiiII.setText(String.valueOf(this.IIiiIiiiIIiIi) + "/" + (IiiiiiiiIIIII == 1 ? 20 : 30));
    }

    static /* synthetic */ void ALLATORIxDEMO(iiIiIiiiiiIIi arg0, int arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }

    static /* synthetic */ int ALLATORIxDEMO(iiIiIiiiiiIIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public String ALLATORIxDEMO(String text) {
        if (!"\u6297\u4e09\u5c38\u866b".equals(text)) return "%";
        return "";
    }

    public iiIiIiiiiiIIi(IiiIiiiiIIIii iiiIiiiiIIIii) {
        this.IiiiiiiiIIIII = iiiIiiiiIIIii;
        this.setPreferredSize(new Dimension(324, 34));
        this.setOpaque(false);
        this.setLayout(null);
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI();
        this.iiIiIiiiiIIIi.setBounds(5, 2, 30, 30);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)37, (int)7, (int)90, (int)20, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)160, (int)7, (int)50, (int)20, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)244, (int)6, (int)60, (int)22, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add(this.iIiiIiiiiiiII);
        this.add(this.iiiiIiiiIiiII);
        this.add(this.iIiIiiiiIiIii);
        this.iiiIiiiiiiiIi = new IIiIiiiiIiIII("sc/e/32.png", 1, 347, iiiIiiiiIIIii.ALLATORIxDEMO());
        this.iiiIiiiiiiiIi.setBounds(297, 9, 11, 15);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO((Object)this);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiIiiiiiIIIII = new IIiIiiiiIiIII("sc/e/34.png", 1, 348, iiiIiiiiIIIii.ALLATORIxDEMO());
        this.IiIiiiiiIIIII.setBounds(312, 9, 11, 15);
        this.IiIiiiiiIIIII.ALLATORIxDEMO((Object)this);
        this.add((Component)this.IiIiiiiiIIIII);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI("sc/b/S173.png");
        this.ALLATORIxDEMO.setBounds(242, 6, 87, 22);
        this.add((Component)this.ALLATORIxDEMO);
    }

    public String ALLATORIxDEMO() {
        double IiiiiiiiIIIII = 0.0;
        String IiiiiiiiIIIII2 = this.iIiIiiiiIiIii.getText();
        IiiiiiiiIIIII = IiiiiiiiIIIII2.equals("\u6297\u4e09\u5c38\u866b") ? (double)this.IIiiIiiiIIiIi * 100.0 : (IiiiiiiiIIIII2.equals("\u7269\u7406\u8eb2\u95ea") ? (double)this.IIiiIiiiIIiIi * 1.0 : (IiiiiiiiIIIII2.endsWith("\u8eb2\u95ea") || IiiiiiiiIIIII2.endsWith("\u51cf\u514d") ? (double)this.IIiiIiiiIIiIi * 0.4 : (double)this.IIiiIiiiIIiIi * 1.5));
        if (IiiiiiiiIIIII != (double)((int)IiiiiiiiIIIII)) return String.valueOf(IiiiiiiiIIIII);
        return String.valueOf((int)IiiiiiiiIIIII);
    }

    static /* synthetic */ JLabel iiiIiiiiiiIIi(iiIiIiiiiiIIi arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public void ALLATORIxDEMO(String[] values, String prefix, IiiIiiiiIIIii factionAngelJpanel) {
        double IiiiiiiiIIIII = 0.0;
        this.IIiiIiiiIIiIi = this.IiIIIiiiiIiiI = 0;
        if (values == null) return;
        if ("".equals(values)) return;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < values.length) {
            if (values[IiiiiiiiIIIII2].startsWith(prefix)) {
                String[] IiiiiiiiIIIII3 = values[IiiiiiiiIIIII2].split("=");
                if (IiiiiiiiIIIII3[0].equals("\u6297\u4e09\u5c38\u866b")) {
                    this.IiIIIiiiiIiiI = (int)(Double.parseDouble(IiiiiiiiIIIII3[1]) / 100.0);
                    IiiiiiiiIIIII = (double)this.IiIIIiiiiIiiI * 100.0;
                } else if (IiiiiiiiIIIII3[0].equals("\u7269\u7406\u8eb2\u95ea")) {
                    this.IiIIIiiiiIiiI = (int)(Double.parseDouble(IiiiiiiiIIIII3[1]) / 1.0);
                    IiiiiiiiIIIII = (double)this.IiIIIiiiiIiiI * 1.0;
                } else if (IiiiiiiiIIIII3[0].endsWith("\u8eb2\u95ea") || IiiiiiiiIIIII3[0].endsWith("\u51cf\u514d")) {
                    this.IiIIIiiiiIiiI = (int)(Double.parseDouble(IiiiiiiiIIIII3[1]) / 0.4);
                    IiiiiiiiIIIII = (double)this.IiIIIiiiiIiiI * 0.4;
                } else {
                    this.IiIIIiiiiIiiI = (int)(Double.parseDouble(IiiiiiiiIIIII3[1]) / 1.5);
                    IiiiiiiiIIIII = (double)this.IiIIIiiiiIiiI * 1.5;
                }
                this.IIiiIiiiIIiIi = this.IiIIIiiiiIiiI;
                this.iIiiIiiiiiiII.setText(String.valueOf(IiiiiiiiIIIII) + this.ALLATORIxDEMO(IiiiiiiiIIIII3[0]));
                this.iiiiIiiiIiiII.setText(String.valueOf(this.IiIIIiiiiIiiI) + "/" + (IiiIiiiiIIIii.iIiIiiiiIIiii((IiiIiiiiIIIii)factionAngelJpanel) == 1 ? 20 : 30));
                IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)factionAngelJpanel, (int)(IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)factionAngelJpanel) + this.IiIIIiiiiIiiI));
                return;
            }
            ++IiiiiiiiIIIII2;
        }
    }

    static /* synthetic */ JLabel iIiIiiiiIIiii(iiIiIiiiiiIIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(iiIiIiiiiiIIi arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    public void ALLATORIxDEMO(int num, String[] values, IiiIiiiiIIIii factionAngelJpanel) {
        int IiiiiiiiIIIII = 0;
        if (num == 0) {
            this.iIiIiiiiIiIii.setText("\u6297\u9b3c\u706b");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1065;
        } else if (num == 1) {
            this.iIiIiiiiIiIii.setText("\u6297\u4e09\u5c38\u866b");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1070;
        } else if (num == 2) {
            this.iIiIiiiiIiIii.setText("\u6297\u9057\u5fd8");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1075;
        } else if (num == 3) {
            this.iIiIiiiiIiIii.setText("\u6297\u7269\u7406");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1030;
        } else if (num == 4) {
            this.iIiIiiiiIiIii.setText("\u6297\u706b");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1060;
        } else if (num == 5) {
            this.iIiIiiiiIiIii.setText("\u6297\u96f7");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1050;
        } else if (num == 6) {
            this.iIiIiiiiIiIii.setText("\u6297\u6c34");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1055;
        } else if (num == 7) {
            this.iIiIiiiiIiIii.setText("\u6297\u98ce");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1045;
        } else if (num == 8) {
            this.iIiIiiiiIiIii.setText("\u6297\u4e2d\u6bd2");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1020;
        } else if (num == 9) {
            this.iIiIiiiiIiIii.setText("\u6297\u5c01\u5370");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1010;
        } else if (num == 10) {
            this.iIiIiiiiIiIii.setText("\u6297\u660f\u7761");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0");
            IiiiiiiiIIIII = 1015;
        } else if (num == 11) {
            this.iIiIiiiiIiIii.setText("\u6297\u6df7\u4e71");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1005;
        } else if (num == 12) {
            this.iIiIiiiiIiIii.setText("\u6297\u9707\u6151");
            this.iiiiIiiiIiiII.setText("0/20");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1025;
        } else if (num == 13) {
            this.iIiIiiiiIiIii.setText("\u7269\u7406\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1030;
        } else if (num == 14) {
            this.iIiIiiiiIiIii.setText("\u9707\u6151\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1025;
        } else if (num == 15) {
            this.iIiIiiiiIiIii.setText("\u706b\u6cd5\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1060;
        } else if (num == 16) {
            this.iIiIiiiiIiIii.setText("\u96f7\u6cd5\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1050;
        } else if (num == 17) {
            this.iIiIiiiiIiIii.setText("\u6c34\u6cd5\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1055;
        } else if (num == 18) {
            this.iIiIiiiiIiIii.setText("\u98ce\u6cd5\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1045;
        } else if (num == 19) {
            this.iIiIiiiiIiIii.setText("\u6bd2\u6cd5\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1020;
        } else if (num == 20) {
            this.iIiIiiiiIiIii.setText("\u5c01\u5370\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1010;
        } else if (num == 21) {
            this.iIiIiiiiIiIii.setText("\u660f\u7761\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1015;
        } else if (num == 22) {
            this.iIiIiiiiIiIii.setText("\u6df7\u4e71\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1005;
        } else if (num == 23) {
            this.iIiIiiiiIiIii.setText("\u9057\u5fd8\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1075;
        } else if (num == 24) {
            this.iIiIiiiiIiIii.setText("\u9b3c\u706b\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1065;
        } else if (num == 25) {
            this.iIiIiiiiIiIii.setText("\u4e09\u5c38\u866b\u8eb2\u95ea");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1070;
        } else if (num == 26) {
            this.iIiIiiiiIiIii.setText("\u6c34\u6cd5\u4f24\u5bb3\u51cf\u514d");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1055;
        } else if (num == 27) {
            this.iIiIiiiiIiIii.setText("\u706b\u6cd5\u4f24\u5bb3\u51cf\u514d");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1060;
        } else if (num == 28) {
            this.iIiIiiiiIiIii.setText("\u9b3c\u706b\u4f24\u5bb3\u51cf\u514d");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1065;
        } else if (num == 29) {
            this.iIiIiiiiIiIii.setText("\u98ce\u6cd5\u4f24\u5bb3\u51cf\u514d");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1045;
        } else if (num == 30) {
            this.iIiIiiiiIiIii.setText("\u96f7\u6cd5\u4f24\u5bb3\u51cf\u514d");
            this.iiiiIiiiIiiII.setText("0/30");
            this.iIiiIiiiiiiII.setText("0.0%");
            IiiiiiiiIIIII = 1050;
        }
        this.iiIiIiiiiIIIi.iIiIiiiiIIiii("sc/masterDoor/" + IiiiiiiiIIIII + ".png");
        this.iIiiIiiiiiiII.setForeground(Color.white);
        this.iiiiIiiiIiiII.setForeground(Color.WHITE);
        this.ALLATORIxDEMO(values, this.iIiIiiiiIiIii.getText(), factionAngelJpanel);
    }
}
