/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.iiIiIiiiIIIiI
 *  com.xy.a.i.iiiIiiiiIiiiI
 *  com.xy.bean.LoginResult
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.RoleSuitBean
 *  com.xy.socket.Agreement
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.i;

import com.xy.a.i.iiIiIiiiIIIiI;
import com.xy.a.i.iiiIiiiiIiiiI;
import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.readbean.RoleSuitBean;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIiiiiiIiI
extends IiiiIiiiiIiIi {
    private DefaultListModel<String> iiiiIiiiIIiii;
    private JScrollPane iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII;
    private iIIiIiiiIiiIi[] iiIIIiiiiiiiI;
    private boolean IiIiiiiiIIIII;
    private IIiIIiiiIIIiI iiIiIiiiiIIIi;
    private iiIiIiiiiIiIi iiiiIiiiIiiII;
    private iiIiIiiiIIIiI[] iiiIiiiiiiiIi;
    private MoneyType iIiiIiiiiiiII;
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private JList<String> iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private iiIiIiiiiIiii[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    public int ALLATORIxDEMO;

    public IiIiIiiiiiIiI(GameView gameView) {
        super(65, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 552, 441, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "已有符录");
        this.iiiiIiiiIIiii = new DefaultListModel();
        this.iIiIiiiiIiIii = new JList();
        this.iIiIiiiiIiIii.setOpaque(false);
        this.iIiIiiiiIiIii.setSelectionBackground(new Color(33, 42, 52));
        this.iIiIiiiiIiIii.setSelectionForeground(Color.white);
        this.iIiIiiiiIiIii.setForeground(Color.white);
        this.iIiIiiiiIiIii.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.iIiIiiiiIiIii.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iIiIiiiiIiIii.setModel(this.iiiiIiiiIIiii);
        this.iIiIiiiiIiIii.setSelectionMode(0);
        this.iIiIiiiiIiIii.addListSelectionListener((ListSelectionListener)new iiiIiiiiIiiiI(this));
        this.iIIiIiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)42, (int)165, (int)318, this.iIiIiiiiIiIii, (int)-1);
        this.add(this.iIIiIiiiiiiIi);
        this.iiIiiiiiiiIii = new iiIiIiiiiIiii[6];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/e/6.png", 1, 14 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "激活" : (IiiiiiiiIIIII == 2 ? "获得" : (IiiiiiiiIIIII == 3 ? "删除" : (IiiiiiiiIIIII == 4 ? "收录" : (IiiiiiiiIIIII == 5 ? "生成玉符" : "")))), (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(430, 193, 34, 18);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/60.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(194, 367, 18, 18);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(473, 368, 34, 18);
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/7.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(65 + (IiiiiiiiIIIII - 3) * 71, 395, 59, 25);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(329, 395, 99, 25);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)45, (int)21, (int)165, (int)21, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5df2\u6536\u5f55\u5957\u88c5\u540d" : (IiiiiiiiIIIII == 1 ? "\u5df2\u6536\u5f55\u7389\u7b26\u90e8\u4ef6" : (IiiiiiiiIIIII == 2 ? "\u53ef\u6536\u5f55\u5957\u6570" : (IiiiiiiiIIIII == 3 ? "\u751f\u6210\u4e2a\u6570\uff1a" : (IiiiiiiiIIIII == 4 ? "\u6240\u9700\u91d1\u94b1\uff1a" : (IiiiiiiiIIIII == 5 ? "\u6240\u9700\u7075\u4fee\u503c\uff1a" : (IiiiiiiiIIIII == 6 ? "\u73b0\u6709\u7075\u4fee\u503c\uff1a" : (IiiiiiiiIIIII == 7 ? "\u540c\u4e00\u5957\u88c5\u4ec5\u4e00\u4e2a\u90e8\u4ef6\u672a\u6536\u5f55\u65f6\uff0c\u70b9\u51fb      \u83b7\u5f97" : (IiiiiiiiIIIII == 8 ? "\u4f7f\u7528\u7b26\u5f55\u53ef\u4ee5\u751f\u4ea7\u5bf9\u5e94\u7684\u7389\u7b26" : "")))))))));
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            }
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(215, 21, 308, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(48, 366, 86, 19);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(4);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(218, 249 + (IiiiiiiiIIIII - 3) * 39, 110, 20);
            } else if (IiiiiiiiIIIII == 7) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(219, 195, 288, 14);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
            } else if (IiiiiiiiIIIII == 8) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(218, 223, 288, 14);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIIIiiiiiiiI = new iIIiIiiiIiiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(135, 366, 78, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(328, 288, 144, 20);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(328, 327, 144, 20);
            }
            this.add((Component)this.iiIIIiiiiiiiI[IiiiiiiiIIIII++]);
        }
        IiiiIiiiiIiII IiiiiiiiIIIII2 = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        IiiiiiiiIIIII2.setBounds(328, 249, 144, 20);
        this.add((Component)IiiiiiiiIIIII2);
        this.iiIiIiiiiIIIi = new IIiIIiiiIIIiI(15, (JTextField)IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII = new MoneyType();
        this.iIiiIiiiiiiII.setIdAndKey(0, "灵修值");
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)328, (int)366, (int)144, (int)20, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iIiiIiiiiiiII, (GameView)gameView);
        this.iiiiIiiiIiiII.ALLATORIxDEMO(2);
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iiiiIiiiIiiII);
        this.iiiIiiiiiiiIi = new iiIiIiiiIIIiI[8];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3] = new iiIiIiiiIIIiI(this);
            if (IiiiiiiiIIIII3 >= 0 && IiiiiiiiIIIII3 <= 3) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].setBounds(230 + 62 * IiiiiiiiIIIII3, 51, 59, 58);
            } else if (IiiiiiiiIIIII3 >= 4 && IiiiiiiiIIIII3 <= 7) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].setBounds(245 + 64 * (IiiiiiiiIIIII3 - 4), 119, 59, 58);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII3++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(45, 21, 165, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(45, 21, 165, 340);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(215, 21, 308, 21);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(215, 21, 308, 200);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII3++]);
        }
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            iiIiIiiiIIIiI iiIiIiiiIIIiI2 = this.iiiIiiiiiiiIi[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)iiIiIiiiIIIiI2).setBorder(BorderFactory.createEmptyBorder());
        }
        imgGrid.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        PartJade IiiiiiiiIIIII2 = (PartJade)imgGrid.ALLATORIxDEMO();
        this.IIIIiiiiiiiII = IiiiiiiiIIIII2.getPartId();
        int[] IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO((int)IiiiiiiiIIIII2.getSuitid()).getParts();
        String[] IiiiiiiiIIIII4 = this.ALLATORIxDEMO().getPackRecord().getCollect(this.IiIIIiiiiIiiI);
        String IiiiiiiiIIIII5 = String.valueOf(this.IIIIiiiiiiiII);
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.length) {
            if (!IiiiiiiiIIIII4[IiiiiiiiIIIII6].equals(IiiiiiiiIIIII5)) {
                ++IiiiiiiiIIIII6;
                continue;
            }
            IiiiiiiiIIIII5 = null;
            break;
        }
        if (IiiiiiiiIIIII5 == null) {
            this.iiIiiiiiiiIii[0].setBtn(-1, "sc/e/54.png");
            this.iiIiiiiiiiIii[0].setForeground(Color.GRAY);
            this.IiIiiiiiIIIII = true;
        } else if (IiiiiiiiIIIII4.length + 1 == IiiiiiiiIIIII3.length) {
            this.iiIiiiiiiiIii[0].setBtn(1, "sc/e/6.png");
            this.iiIiiiiiiiIii[0].setForeground(Color.WHITE);
            this.IiIiiiiiIIIII = false;
        } else {
            this.iiIiiiiiiiIii[0].setBtn(-1, "sc/e/54.png");
            this.iiIiiiiiiiIii[0].setForeground(Color.GRAY);
            this.IiIiiiiiIIIII = false;
        }
        this.iiIiIiiiiIIIi.ALLATORIxDEMO().setText("0");
    }

    /*
     * Handled impossible loop by duplicating code
     */
    public void ALLATORIxDEMO(RoleSuitBean suitBean) {
        block7: {
            int IiiiiiiiIIIII;
            String[] IiiiiiiiIIIII2;
            int[] IiiiiiiiIIIII22;
            block6: {
                this.IiIIIiiiiIiiI = suitBean != null ? suitBean.getSuitID() : 0;
                this.IIIIiiiiiiiII = -1;
                this.IiIiiiiiIIIII = false;
                this.iiIiiiiiiiIii[0].setBtn(-1, "sc/e/54.png");
                this.iiIiiiiiiiIii[0].setForeground(Color.GRAY);
                this.iiIiIiiiiIIIi.ALLATORIxDEMO().setText("0");
                this.iiiiIiiiIiiII.iIiIiiiiIIiii();
                int IiiiiiiiIIIII3 = 0;
                while (IiiiiiiiIIIII3 < this.iiiIiiiiiiiIi.length) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII3++].ALLATORIxDEMO();
                }
                if (suitBean == null) {
                    return;
                }
                IiiiiiiiIIIII22 = suitBean.getParts();
                IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getPackRecord().getCollect(this.IiIIIiiiiIiiI);
                IiiiiiiiIIIII = 0;
                if (!true) break block6;
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII22.length) return;
                if (IiiiiiiiIIIII >= this.iiiIiiiiiiiIi.length) break block7;
            }
            do {
                String IiiiiiiiIIIII4 = String.valueOf(IiiiiiiiIIIII22[IiiiiiiiIIIII]);
                int IiiiiiiiIIIII5 = 0;
                while (IiiiiiiiIIIII5 < IiiiiiiiIIIII2.length) {
                    if (!IiiiiiiiIIIII2[IiiiiiiiIIIII5].equals(IiiiiiiiIIIII4)) {
                        ++IiiiiiiiIIIII5;
                        continue;
                    }
                    IiiiiiiiIIIII4 = null;
                    break;
                }
                iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)this.iiiIiiiiiiiIi[IiiiiiiiIIIII]).setText(IiiiiiiiIIIII4 != null ? "0" : "1");
                PartJade IiiiiiiiIIIII3 = new PartJade((long)this.IiIIIiiiiIiiI, IiiiiiiiIIIII22[IiiiiiiiIIIII]);
                IiiiiiiiIIIII3.setJade1(IiiiiiiiIIIII4 != null ? 0 : 1);
                iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)this.iiiIiiiiiiiIi[IiiiiiiiIIIII]).ALLATORIxDEMO(15, (Object)IiiiiiiiIIIII3);
                iiIiIiiiIIIiI iiIiIiiiIIIiI2 = this.iiiIiiiiiiiIi[IiiiiiiiIIIII];
                ++IiiiiiiiIIIII;
                iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)iiIiIiiiIIIiI2).setBorder(BorderFactory.createEmptyBorder());
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII22.length) return;
            } while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length);
        }
    }

    static /* synthetic */ JList ALLATORIxDEMO(IiIiIiiiiiIiI arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        long IiiiiiiiIIIII;
        if (number == 0L) {
            return null;
        }
        if (number < 0L) return 0L;
        if (this.IIIIiiiiiiiII == -1) return 0L;
        if (!this.IiIiiiiiIIIII) {
            return 0L;
        }
        long IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 100000 : 1000000;
        RoleData roleData = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII3 = roleData.getLoginResult().getGold().longValue() / IiiiiiiiIIIII2;
        long IiiiiiiiIIIII4 = Math.min(IiiiiiiiIIIII3, IiiiiiiiIIIII = roleData.getLoginResult().getScoretype(this.iIiiIiiiiiiII.getKey()).longValue() / 10L);
        if (number > IiiiiiiiIIIII4 && IiiiiiiiIIIII4 <= 999L) {
            return IiiiiiiiIIIII4;
        }
        if (number <= 999L) return null;
        return 999L;
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (number <= 0L || this.IIIIiiiiiiiII == -1 || !this.IiIiiiiiIIIII) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI[1], (long)0L);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI[2], (long)0L);
            return;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 100000 : 1000000;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI[1], (long)(IiiiiiiiIIIII * number));
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI[2], (long)(10L * number));
    }

    public void iiiIiiiiiiIIi() {
        this.ALLATORIxDEMO((RoleSuitBean)null);
        IiiiiiiiiIIII IiiiiiiiIIIII = this.ALLATORIxDEMO();
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        List IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getPackRecord().ALLATORIxDEMO();
        this.ALLATORIxDEMO = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.size() : 0;
        this.iiiiIiiiIIiii.removeAllElements();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.ALLATORIxDEMO) {
            RoleSuitBean IiiiiiiiIIIII5 = IiiiiiiiIIIII.ALLATORIxDEMO(((Integer)IiiiiiiiIIIII3.get(IiiiiiiiIIIII4)).intValue());
            if (IiiiiiiiIIIII5 != null) {
                this.iiiiIiiiIIiii.addElement(IiiiiiiiIIIII5.getSname());
            }
            ++IiiiiiiiIIIII4;
        }
        this.iiIIIiiiiiiiI[0].setText(String.valueOf(this.ALLATORIxDEMO) + "/" + IiiiiiiiIIIII2.getPackRecord().getSuitNum());
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(int id) {
        void IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult();
        if (id == 15) {
            BigDecimal IiiiiiiiIIIII4 = new BigDecimal(this.ALLATORIxDEMO().gameType == 2 ? 20000000 : 100000000);
            if (IiiiiiiiIIIII3.getGold().compareTo(IiiiiiiiIIIII4) < 0) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("需要" + IiiiiiiiIIIII4.longValue() / 10000L + "W金币才能增加上限..");
                return;
            }
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getPackRecord().getSuitNum() + 1;
            IiiiiiiiIIIII2.getPackRecord().setSuitNum(IiiiiiiiIIIII5);
            ParamTool.ALLATORIxDEMO((long)IiiiiiiiIIIII4.longValue(), (GameView)this.iiIIiiiiIiIIi);
            String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"1", (String)("3" + IiiiiiiiIIIII5));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
            this.iiIIIiiiiiiiI[0].setText(String.valueOf(this.ALLATORIxDEMO) + "/" + IiiiiiiiIIIII2.getPackRecord().getSuitNum());
            return;
        }
        if (this.IiIIIiiiiIiiI == 0) {
            return;
        }
        if (id == 14) {
            if (this.IIIIiiiiiiiII == -1) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("请选择你要激活的玉符..");
                return;
            }
            if (new BigDecimal(500000).compareTo(IiiiiiiiIIIII3.getGold()) > 0) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("金币不足..");
                return;
            }
            if (200L > IiiiiiiiIIIII3.getScoretype("灵修值").longValue()) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("灵修值不足，快去获取吧..");
                return;
            }
            if (IiiiiiiiIIIII2.getPackRecord().ALLATORIxDEMO(this.IiIIIiiiiIiiI, this.IIIIiiiiiiiII) != null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("没有可激活的部件..");
                return;
            }
            SuitOperBean IiiiiiiiIIIII7 = new SuitOperBean();
            PartJade IiiiiiiiIIIII5 = new PartJade((long)this.IiIIIiiiiIiiI, this.IIIIiiiiiiiII);
            IiiiiiiiIIIII5.setJade1(0);
            IiiiiiiiIIIII7.setJade(IiiiiiiiIIIII5);
            IiiiiiiiIIIII7.setType(8);
            String IiiiiiiiIIIII8 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII7));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
            IiiiiiiiIIIII3.setGold(IiiiiiiiIIIII3.getGold().subtract(new BigDecimal(500000)));
            IiiiiiiiIIIII3.setScore(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII3.getScore(), (String)"灵修值=200", (int)3));
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("消耗了200点灵修值    扣除了50W金币..");
            this.iiIiiiiiiiIii[0].setBtn(-1, "sc/e/54.png");
            this.iiIiiiiiiiIii[0].setForeground(Color.GRAY);
            return;
        }
        if (id == 17) {
            SuitOperBean IiiiiiiiIIIII9 = new SuitOperBean();
            PartJade IiiiiiiiIIIII10 = new PartJade((long)this.IiIIIiiiiIiiI, 0);
            IiiiiiiiIIIII9.setJade(IiiiiiiiIIIII10);
            IiiiiiiiIIIII9.setType(8);
            String IiiiiiiiIIIII11 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII9));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII11);
            return;
        }
        if (id != 19) return;
        if (this.IIIIiiiiiiiII == -1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("请选择你要生成的玉符..");
            return;
        }
        if (!this.IiIiiiiiIIIII) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("你还没收录过此玉符..");
            return;
        }
        int IiiiiiiiIIIII12 = (int)this.iiIiIiiiiIIIi.ALLATORIxDEMO();
        if (IiiiiiiiIIIII12 <= 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("请输入你要生成的玉符数量..");
            return;
        }
        long IiiiiiiiIIIII13 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 100000 : 1000000;
        BigDecimal IiiiiiiiIIIII14 = new BigDecimal(IiiiiiiiIIIII13 * (long)IiiiiiiiIIIII12);
        BigDecimal IiiiiiiiIIIII15 = new BigDecimal(10 * IiiiiiiiIIIII12);
        if (IiiiiiiiIIIII14.compareTo(IiiiiiiiIIIII3.getGold()) > 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("金币不足..");
            return;
        }
        if (IiiiiiiiIIIII15.compareTo(IiiiiiiiIIIII3.getScoretype("灵修值")) > 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("灵修值不足，快去获取吧..");
            return;
        }
        PartJade IiiiiiiiIIIII16 = new PartJade((long)this.IiIIIiiiiIiiI, this.IIIIiiiiiiiII);
        IiiiiiiiIIIII16.setJade(1, IiiiiiiiIIIII12);
        SuitOperBean suitOperBean = new SuitOperBean();
        IiiiiiiiIIIII.setJade(IiiiiiiiIIIII16);
        IiiiiiiiIIIII.setType(9);
        String IiiiiiiiIIIII17 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII17);
        IiiiiiiiIIIII3.setGold(IiiiiiiiIIIII3.getGold().subtract(IiiiiiiiIIIII14));
        IiiiiiiiIIIII3.setScore(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII3.getScore(), (String)("灵修值=" + IiiiiiiiIIIII15), (int)3));
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("消耗了" + IiiiiiiiIIIII15 + "点灵修值    扣除了" + IiiiiiiiIIIII14.longValue() / 10000L + "W金币..");
        this.iiIiIiiiiIIIi.ALLATORIxDEMO().setText("0");
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }
}
