/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiIiiiiiiiii
 *  com.xy.bean.ConfirmBean
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.game.RoleTaskData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.AllFB
 *  com.xy.readbean.FB
 *  com.xy.readbean.TaskBuy
 *  com.xy.readbean.TaskData
 *  com.xy.readbean.TaskSet
 *  com.xy.readbean.TaskTQ
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.IIiIiiiiiiiii;
import com.xy.bean.ConfirmBean;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.AllFB;
import com.xy.readbean.FB;
import com.xy.readbean.TaskBuy;
import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import com.xy.readbean.TaskTQ;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

public class iiiiIiiiiiIiI
extends IiiiIiiiiIiIi {
    private JList<String> iiIIIiiiiiiiI;
    private DefaultListModel<String> IiIiiiiiIIIII;
    private iIIiIiiiIiiIi[] iiIiIiiiiIIIi;
    private FB iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private com.xy.w.IiiiIiiiiIiIi IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private IIIIIiiiIIIiI[] iiIiiiiiiiIii;
    private com.xy.q.IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IIiiIiiiIIiIi == null) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(g, 285, 230, 4, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(FB fb) {
        block18: {
            block21: {
                block20: {
                    block19: {
                        block17: {
                            block16: {
                                this.iiiiIiiiIiiII = fb;
                                if (fb != null) break block16;
                                this.ALLATORIxDEMO.setTextSize("", 192);
                                this.IIiiIiiiIIiIi = null;
                                IiiiiiiiIIIII = 0;
                                if (true) ** GOTO lbl43
                            }
                            IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(fb.getFbDId());
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getTaskSet();
                            if (IiiiiiiiIIIII == null || IiiiiiiiIIIII == null) {
                                this.ALLATORIxDEMO(null);
                                return;
                            }
                            IiiiiiiiIIIII = this.ALLATORIxDEMO();
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getTq();
                            this.ALLATORIxDEMO.setTextSize(fb.getFbMsg(), 192);
                            this.IIiiIiiiIIiIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)fb.getFbSkin(), (int)7, (int)1, null);
                            this.iiIiIiiiiIIIi[0].setText(String.valueOf(IiiiiiiiIIIII.getTeamSum()));
                            this.iiIiIiiiiIIIi[1].setText(RoleTaskData.getMinLvl((String)IiiiiiiiIIIII.getLvl()));
                            this.iiIiIiiiiIIIi[2].setText(String.valueOf(IiiiiiiiIIIII.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII.getTaskSetID(), 1)) + "/" + IiiiiiiiIIIII.getTaskSystem().getTaskSetNum(IiiiiiiiIIIII, 1));
                            if (IiiiiiiiIIIII.getResetcycle() != 0) break block17;
                            this.iiIiIiiiiIIIi[3].setText("\u4e0d\u91cd\u7f6e");
                            break block18;
                        }
                        if (IiiiiiiiIIIII.getResetcycle() != 1) break block19;
                        this.iiIiIiiiiIIIi[3].setText("\u6bcf\u65e5");
                        break block18;
                    }
                    if (IiiiiiiiIIIII.getResetcycle() != 2) break block20;
                    this.iiIiIiiiiIIIi[3].setText("\u6bcf\u5468");
                    break block18;
                }
                if (IiiiiiiiIIIII.getResetcycle() != 3) break block21;
                this.iiIiIiiiiIIIi[3].setText("\u6bcf\u6708");
                break block18;
            }
            if (IiiiiiiiIIIII.getResetcycle() < 1024 || IiiiiiiiIIIII.getResetcycle() >= 2048) break block18;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getResetcycle() - 1000;
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl68
            do {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII++].setText("");
lbl43:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length);
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII++].setVisible(true);
            }
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII++].setVisible(false);
            }
            return;
            do {
                if ((IiiiiiiiIIIII >> IiiiiiiiIIIII & 1) != 0) {
                    if (IiiiiiiiIIIII.length() != 0) {
                        IiiiiiiiIIIII.append(" ");
                    }
                    if (IiiiiiiiIIIII == 6) {
                        IiiiiiiiIIIII.append("\u5468\u65e5");
                    } else {
                        IiiiiiiiIIIII.append("\u5468");
                        IiiiiiiiIIIII.append(MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII + 1)));
                    }
                }
                ++IiiiiiiiIIIII;
lbl68:
                // 2 sources

            } while (IiiiiiiiIIIII < 7);
            this.iiIiIiiiiIIIi[3].setText(IiiiiiiiIIIII.toString());
        }
        IiiiiiiiIIIII = fb.getFbDrop() != null && fb.getFbDrop().equals("") == false ? fb.getFbDrop().split("\\|") : null;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII != null && IiiiiiiiIIIII < IiiiiiiiIIIII.length ? new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII]) : null;
            IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            v0 = this;
            if (IiiiiiiiIIIII != null) {
                v0.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            } else {
                v0.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setVisible(true);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII.getTaskSetID(), 3);
        if (IiiiiiiiIIIII >> 4 == 0) {
            this.iiIiiiiiiiIii[0].setText("\u9886\u53d6\u5956\u52b1");
            this.iiIiiiiiiiIii[0].setBtn(-1, "sc/e/56.png");
        } else if ((IiiiiiiiIIIII & 1) != 0) {
            this.iiIiiiiiiiIii[0].setText("\u5df2\u9886\u53d6");
            this.iiIiiiiiiiIii[0].setBtn(-1, "sc/e/56.png");
        } else {
            this.iiIiiiiiiiIii[0].setText("\u9886\u53d6\u5956\u52b1");
            this.iiIiiiiiiiIii[0].setBtn(1, "sc/e/26.png");
        }
        this.iiIiiiiiiiIii[0].setVisible(true);
        this.iiIiiiiiiiIii[1].setVisible(true);
        this.iiIiiiiiiiIii[2].setVisible(IiiiiiiiIIIII != null && IiiiiiiiIIIII.getBuyNum() > 0);
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiii(int id) {
        if (this.iiiiIiiiIiiII == null) {
            return;
        }
        TaskData taskData = this.ALLATORIxDEMO().ALLATORIxDEMO(this.iiiiIiiiIiiII.getFbDId());
        TaskSet IiiiiiiiIIIII = taskData.getTaskSet();
        if (taskData == null) return;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (id == 151) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"taskN", (String)("FB" + this.iiiiIiiiIiiII.getFbId()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (id == 152) {
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"taskN", (String)("L" + this.iiiiIiiiIiiII.getFbDId()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (id != 153) return;
        TaskTQ IiiiiiiiIIIII4 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getTq() : null;
        if (IiiiiiiiIIIII4 == null) return;
        if (IiiiiiiiIIIII4.getBuyNum() == 0) {
            return;
        }
        RoleData IiiiiiiiIIIII5 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII5.getLimit("\u6708\u5361") == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9700\u8981\u6708\u5361\u89e3\u9501");
            return;
        }
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII5.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII.getTaskSetID(), 5);
        TaskBuy IiiiiiiiIIIII7 = IiiiiiiiIIIII4.getTaskBuy(IiiiiiiiIIIII6);
        if (IiiiiiiiIIIII7 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8fbe\u5230\u8d2d\u4e70\u4e0a\u9650");
            return;
        }
        StringBuffer IiiiiiiiIIIII8 = new StringBuffer();
        IiiiiiiiIIIII8.append("#W\u4f60\u786e\u5b9a\u8981\u82b1\u8d39#R");
        IiiiiiiiIIIII8.append(IiiiiiiiIIIII7.getMoney());
        IiiiiiiiIIIII8.append("#W");
        IiiiiiiiIIIII8.append(IiiiiiiiIIIII7.getType());
        IiiiiiiiIIIII8.append(",\u8d2d\u4e70\u4e00\u6b21");
        IiiiiiiiIIIII8.append(this.iiiiIiiiIiiII.getFbName());
        IiiiiiiiIIIII8.append("\u6b21\u6570");
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(17, "B" + IiiiiiiiIIIII.getTaskSetID(), IiiiiiiiIIIII8.toString()));
    }

    public boolean ALLATORIxDEMO() {
        this.ALLATORIxDEMO(null);
        return super.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiIi(String value) {
        AllFB IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII.getFB(value));
    }

    public iiiiIiiiiiIiI(GameView gameView) {
        super(113, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 632, 401, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6bcf\u65e5\u526f\u672c");
        this.IiIiiiiiIIIII = new DefaultListModel();
        this.iiIIIiiiiiiiI = new JList();
        this.iiIIIiiiiiiiI.setSelectionBackground(new Color(33, 42, 52));
        this.iiIIIiiiiiiiI.setSelectionForeground(Color.white);
        this.iiIIIiiiiiiiI.setForeground(Color.white);
        this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiIIIiiiiiiiI.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIIIiiiiiiiI.setModel(this.IiIiiiiiIIIII);
        this.iiIIIiiiiiiiI.setSelectionMode(0);
        this.iiIIIiiiiiiiI.addListSelectionListener((ListSelectionListener)new IIiIiiiiiiiii(this));
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)45, (int)148, (int)328, this.iiIIIiiiiiiiI, (int)20);
        this.add(this.iIiIiiiiIiIii);
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)386, (int)67, (int)214, (int)182, (Component)this.ALLATORIxDEMO, (int)20);
        this.add(this.iiiIiiiiiiiIi);
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIIIiiiIIIiI(IiiiiiiiIIIII == 2 ? "sc/e/60.png" : "sc/e/26.png", 1, 151 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u9886\u53d6\u5956\u52b1" : (IiiiiiiiIIIII == 1 ? "\u8fdb\u5165\u526f\u672c" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(354, 326, 18, 18);
            } else {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(384 + 116 * IiiiiiiiIIIII, 346, 99, 25);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new iIIiIiiiIiiIi[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)288, (int)(267 + IiiiiiiiIIIII * 29), (int)84, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new JLabel[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)207, (int)(267 + 29 * IiiiiiiiIIIII), (int)72, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u526f\u672c\u4eba\u6570" : (IiiiiiiiIIIII == 1 ? "\u526f\u672c\u4eba\u6570" : (IiiiiiiiIIIII == 2 ? "\u526f\u672c\u6b21\u6570" : (IiiiiiiiIIIII == 3 ? "\u91cd\u7f6e\u65f6\u95f4" : (IiiiiiiiIIIII == 4 ? "\u526f\u672c\u5217\u8868" : (IiiiiiiiIIIII == 5 ? "\u526f\u672c\u4fe1\u606f" : (IiiiiiiiIIIII == 6 ? "\u5956\u52b1\u9884\u89c8" : (IiiiiiiiIIIII == 7 ? "\u6e29\u99a8\u63d0\u793a\uff1a\u6bcf\u65e5\u51cc\u6668\u4e94\u70b9\u5237\u65b0\u91cd\u7f6e\u3002" : ""))))))));
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 6) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                if (IiiiiiiiIIIII == 4) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(48, 24, 150, 21);
                } else if (IiiiiiiiIIIII == 5) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(384, 48, 215, 21);
                } else if (IiiiiiiiIIIII == 6) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(384, 260, 215, 21);
                }
            }
            if (IiiiiiiiIIIII == 7) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(209, 28, 250, 16);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IiIIIiiiIiiIi);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(389 + 49 * IiiiiiiiIIIII, 283, 48, 48);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 0) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(48, 24, 150, 21);
                } else if (IiiiiiiiIIIII == 1) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(384, 48, 215, 21);
                } else if (IiiiiiiiIIIII == 2) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(384, 260, 215, 21);
                }
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 5) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(48, 24, 150, 350);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(384, 48, 215, 202);
                } else if (IiiiiiiiIIIII == 5) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(384, 260, 215, 75);
                }
            } else if (IiiiiiiiIIIII == 6) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/16.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(209, 48, 165, 202);
            }
            ++IiiiiiiiIIIII;
        }
    }

    static /* synthetic */ JList ALLATORIxDEMO(iiiiIiiiiiIiI arg0) {
        return arg0.iiIIIiiiiiiiI;
    }

    public void iiiIiiiiiiIIi() {
        this.IiIiiiiiIIIII.removeAllElements();
        this.ALLATORIxDEMO(null);
        AllFB IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        List IiiiiiiiIIIII2 = IiiiiiiiIIIII.getList();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.size()) {
            Object e = IiiiiiiiIIIII2.get(IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII3;
            this.IiIiiiiiIIIII.addElement(((FB)e).getFbName());
        }
    }
}
