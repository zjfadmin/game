/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiIIiiiIIIiI
 *  com.xy.a.IiIiIiiiiiIiI
 *  com.xy.bean.LoginResult
 *  com.xy.game.RoleData
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIiIIiiiIIIiI;
import com.xy.a.IiIiIiiiiiIiI;
import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;

public class iiIiIiiiiIiIi
extends IiiiIiiiiIiIi {
    private JTable iiiIiiiiiiiIi;
    private JScrollPane iIiiIiiiiiiII;
    private DefaultListModel<String> IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private JScrollPane iiIiiiiiiiIii;
    private JList<String> IiiiiiiiIIIII;
    private Vector<Vector<Object>> ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiiiIiiiIiiII) return;
        this.iiiiIiiiIiiII = false;
        this.iiiIiiiiiiiIi.updateUI();
        this.iIiiIiiiiiiII.updateUI();
    }

    public String ALLATORIxDEMO(int pkrecord) {
        int IiiiiiiiIIIII = pkrecord / 100;
        if (IiiiiiiiIIIII <= 0) {
            return "\u5165\u95e8";
        }
        if (IiiiiiiiIIIII == 1) {
            return "\u8fdb\u9636";
        }
        if (IiiiiiiiIIIII == 2) {
            return "\u7cbe\u9510";
        }
        if (IiiiiiiiIIIII == 3) {
            return "\u82f1\u6770";
        }
        if (IiiiiiiiIIIII == 4) {
            return "\u8c6a\u4fa0";
        }
        if (IiiiiiiiIIIII == 5) {
            return "\u5b97\u5e08";
        }
        if (IiiiiiiiIIIII != 6) return "\u738b\u8005";
        return "\u6b66\u5723";
    }

    static /* synthetic */ JList ALLATORIxDEMO(iiIiIiiiiIiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(int index) {
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"pankinglist", (String)String.valueOf(index));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(int index, List<LoginResult> list) {
        Object IiiiiiiiIIIII;
        if (index == 0) {
            index = this.IiiiiiiiIIIII.getSelectedIndex() + 1;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        this.IiiiiiiiIIIII.setSelectedIndex(index - 1);
        if (index == 1) {
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u91d1\u94b1");
            this.iIiIiiiiIiIii[0].setText("\u4f60\u7684\u91d1\u94b1:");
            this.iIiIiiiiIiIii[1].setText(IiiiiiiiIIIII2.getLoginResult().getGold().toString());
        } else if (index == 2) {
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("");
            this.iIiIiiiiIiIii[0].setText(null);
            this.iIiIiiiiIiIii[1].setText(null);
        } else if (index == 3) {
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u6218\u529f");
            this.iIiIiiiiIiIii[0].setText("\u4f60\u7684\u529f\u7ee9\u503c:");
            this.iIiIiiiiIiIii[1].setText(IiiiiiiiIIIII2.getLoginResult().getScoretype("\u5e2e\u6d3e\u79ef\u5206").toString());
        } else if (index == 4) {
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u79ef\u5206");
            this.iIiIiiiiIiIii[0].setText("\u4f60\u7684\u79ef\u5206:");
            this.iIiIiiiiIiIii[1].setText(IiiiiiiiIIIII2.getLoginResult().getScoretype("\u6c34\u9646\u79ef\u5206").toString());
        } else if (index == 5) {
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u79ef\u5206");
            this.iIiIiiiiIiIii[0].setText("\u4f60\u7684\u79ef\u5206:");
            this.iIiIiiiiIiIii[1].setText("0");
        } else if (index == 6) {
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u79ef\u5206");
            this.iIiIiiiiIiIii[0].setText("\u4f60\u7684\u79ef\u5206:");
            IiiiiiiiIIIII = IiiiiiiiIIIII2.getLoginResult().getPkrecord();
            String IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII != null ? ((BigDecimal)IiiiiiiiIIIII).intValue() : 0);
            this.iIiIiiiiIiIii[1].setText(String.valueOf(IiiiiiiiIIIII3) + (IiiiiiiiIIIII != null ? IiiiiiiiIIIII : Integer.valueOf(0)) + "\u70b9");
        } else if (index == 7) {
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u79ef\u5206");
            this.iIiIiiiiIiIii[0].setText("\u4f60\u7684\u5c42\u6570:");
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getTaskSystem().ALLATORIxDEMO(6, 3);
            int IiiiiiiiIIIII5 = 0;
            int IiiiiiiiIIIII6 = 0;
            if (IiiiiiiiIIIII4 != 0) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4 % 6 != 0 ? IiiiiiiiIIIII4 / 6 + 1 : IiiiiiiiIIIII4 / 6;
                IiiiiiiiIIIII6 = IiiiiiiiIIIII4 % 6 == 0 ? 6 : IiiiiiiiIIIII4 % 6;
            }
            this.iIiIiiiiIiIii[1].setText(String.valueOf(IiiiiiiiIIIII5) + "\u5c42" + IiiiiiiiIIIII6 + "\u5173");
        } else if (index == 8) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2.getTaskSystem().getTaskRecord(8);
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getNewID() >> 8 : 0;
            this.iiiIiiiiiiiIi.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u79ef\u5206");
            this.iIiIiiiiIiIii[0].setText("\u4f60\u7684\u79ef\u5206:");
            this.iIiIiiiiIiIii[1].setText(String.valueOf(IiiiiiiiIIIII7));
        }
        this.ALLATORIxDEMO.clear();
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 < list.size()) {
            LoginResult IiiiiiiiIIIII10 = list.get(IiiiiiiiIIIII9);
            Vector<String> IiiiiiiiIIIII11 = new Vector<String>();
            IiiiiiiiIIIII11.add(String.valueOf(IiiiiiiiIIIII9 + 1));
            IiiiiiiiIIIII11.add(IiiiiiiiIIIII10.getRolename());
            IiiiiiiiIIIII11.add(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII10.getGrade())) + "\u7ea7");
            if (IiiiiiiiIIIII10.getGold() != null && IiiiiiiiIIIII10.getGold().compareTo(new BigDecimal(0)) > 0) {
                IiiiiiiiIIIII11.add(IiiiiiiiIIIII10.getGold().toString());
            } else if (IiiiiiiiIIIII10.getBangScore() != null) {
                if (index == 7) {
                    int IiiiiiiiIIIII12 = IiiiiiiiIIIII10.getBangScore();
                    int IiiiiiiiIIIII13 = 0;
                    int IiiiiiiiIIIII14 = 0;
                    if (IiiiiiiiIIIII12 != 0) {
                        IiiiiiiiIIIII13 = IiiiiiiiIIIII12 % 6 != 0 ? IiiiiiiiIIIII12 / 6 + 1 : IiiiiiiiIIIII12 / 6;
                        IiiiiiiiIIIII14 = IiiiiiiiIIIII12 % 6 == 0 ? 6 : IiiiiiiiIIIII12 % 6;
                    }
                    IiiiiiiiIIIII11.add(String.valueOf(IiiiiiiiIIIII13) + "\u5c42" + IiiiiiiiIIIII14 + "\u5173");
                } else {
                    IiiiiiiiIIIII11.add(String.valueOf(IiiiiiiiIIIII10.getBangScore()));
                }
            } else if (IiiiiiiiIIIII10.getPkrecord() != null && index == 6) {
                BigDecimal IiiiiiiiIIIII15 = IiiiiiiiIIIII10.getPkrecord();
                String IiiiiiiiIIIII16 = this.ALLATORIxDEMO(IiiiiiiiIIIII15 != null ? IiiiiiiiIIIII15.intValue() : 0);
                IiiiiiiiIIIII11.add(String.valueOf(IiiiiiiiIIIII16) + (IiiiiiiiIIIII15 != null ? IiiiiiiiIIIII15 : Integer.valueOf(0)) + "\u70b9");
            }
            if (IiiiiiiiIIIII11.size() == 3) {
                IiiiiiiiIIIII11.add("");
            }
            this.ALLATORIxDEMO.addElement(IiiiiiiiIIIII11);
            if (IiiiiiiiIIIII10.getRole_id().compareTo(this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getRole_id()) == 0) {
                IiiiiiiiIIIII8 = IiiiiiiiIIIII9 + 1;
            }
            ++IiiiiiiiIIIII9;
        }
        iiIiIiiiiIiIi iiIiIiiiiIiIi2 = this;
        if (IiiiiiiiIIIII8 != 0) {
            iiIiIiiiiIiIi2.iIiIiiiiIiIii[3].setText(String.valueOf(IiiiiiiiIIIII8));
        } else {
            iiIiIiiiiIiIi2.iIiIiiiiIiIii[3].setText("\u6682\u65f6\u672a\u80fd\u4e0a\u699c,\u8bf7\u7ee7\u7eed\u52a0\u6cb9");
        }
        if (this.iiiIiiiiiiiIi.getRowCount() > 0) {
            this.iiiIiiiiiiiIi.setRowSelectionInterval(0, 0);
        }
        this.iiiIiiiiiiiIi.updateUI();
        this.iIiiIiiiiiiII.getVerticalScrollBar().setValue(0);
    }

    public void iIiIiiiiIIiii() {
        if (this.IiiiiiiiIIIII.getSelectedIndex() != 0) {
            this.IiiiiiiiIIIII.setSelectedIndex(0);
        } else {
            this.iIiIiiiiIIiii(1);
        }
        super.iIiIiiiiIIiii();
    }

    public iiIiIiiiiIiIi(GameView gameView) {
        super(60, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 702, 470, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6392\u884c\u699c");
        this.iIiIiiiiIiIii = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)250, (int)37, (int)100, (int)17, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "" : (IiiiiiiiIIIII == 1 ? "" : (IiiiiiiiIIIII == 2 ? "\u4f60\u76ee\u524d\u7684\u6392\u884c\uff1a" : (IiiiiiiiIIIII == 3 ? "\u6682\u65f6\u672a\u80fd\u4e0a\u699c\uff0c\u8bf7\u7ee7\u7eed\u52a0\u6cb9" : ""))));
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFF00"));
            }
            if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(360, 37, 250, 17);
            }
            if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFF00"));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(250, 55, 120, 17);
            }
            if (IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(366, 55, 250, 17);
            }
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new DefaultListModel();
        this.IIiiIiiiIIiIi.addElement("  \u8d85\u7ea7\u5bcc\u8c6a\u699c");
        this.IIiiIiiiIIiIi.addElement("  \u7ec3\u529f\u72c2\u4eba\u699c");
        this.IIiiIiiiIIiIi.addElement("  \u5e2e\u6d3e\u6218\u529f\u699c");
        this.IIiiIiiiIIiIi.addElement("  \u6c34\u8def\u79ef\u5206\u699c");
        this.IIiiIiiiIIiIi.addElement("  \u64c2\u53f0\u79ef\u5206\u699c");
        this.IIiiIiiiIIiIi.addElement("  \u5168\u6c11\u7ade\u6280\u699c");
        this.IIiiIiiiIIiIi.addElement("  \u8bd5\u70bc\u5e7b\u5883\u699c");
        if (this.ALLATORIxDEMO().VALUE.indexOf(74) != -1) {
            this.IIiiIiiiIIiIi.addElement("  \u5ba0\u7269\u6bd4\u6597\u699c");
        }
        this.IiiiiiiiIIIII = new JList();
        this.IiiiiiiiIIIII.setOpaque(false);
        this.IiiiiiiiIIIII.setSelectionBackground(new Color(33, 42, 52));
        this.IiiiiiiiIIIII.setSelectionForeground(Color.white);
        this.IiiiiiiiIIIII.setForeground(Color.white);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiiiiiiiIIIII.setModel(this.IIiiIiiiIIiIi);
        this.IiiiiiiiIIIII.setSelectionMode(0);
        this.IiiiiiiiIIIII.addListSelectionListener((ListSelectionListener)new IIiIIiiiIIIiI(this));
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)48, (int)30, (int)190, (int)370, this.IiiiiiiiIIIII, (int)-1);
        this.add(this.iiIiiiiiiiIii);
        Vector<String> IiiiiiiiIIIII2 = new Vector<String>();
        IiiiiiiiIIIII2.addElement("\u540d\u6b21");
        IiiiiiiiIIIII2.addElement("\u6635\u79f0");
        IiiiiiiiIIIII2.addElement("\u7b49\u7ea7");
        IiiiiiiiIIIII2.addElement("\u91d1\u94b1");
        this.ALLATORIxDEMO = new Vector();
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (Color)Color.white, (int[])new int[]{60, 130, 125, 95});
        IiIiIiiiiiIiI IiiiiiiiIIIII3 = new IiIiIiiiiiIiI(this);
        IiiiiiiiIIIII3.setHorizontalAlignment(0);
        this.iiiIiiiiiiiIi.setDefaultRenderer(Object.class, (TableCellRenderer)IiiiiiiiIIIII3);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)239, (int)77, (int)440, (int)372, (Component)this.iiiIiiiiiiiIi, (int)20);
        this.add(this.iIiiIiiiiiiII);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII4] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII4]);
            if (IiiiiiiiIIIII4 == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].setBounds(45, 28, 190, 422);
            }
            if (IiiiiiiiIIIII4 == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].setBounds(239, 29, 440, 48);
            }
            if (IiiiiiiiIIIII4 == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].setBounds(239, 77, 440, 21);
            }
            if (IiiiiiiiIIIII4 == 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].setBounds(239, 77, 440, 372);
            }
            ++IiiiiiiiIIIII4;
        }
    }
}
