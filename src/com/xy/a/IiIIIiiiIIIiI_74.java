/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiiIiiiIIIII
 *  com.xy.a.iIiiIiiiIiiIi
 *  com.xy.a.iiiiIiiiiiiII
 *  com.xy.bean.Coordinates
 *  com.xy.bean.RoleShow
 *  com.xy.game.RoleData
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.ActiveAward
 *  com.xy.readbean.ActiveBase
 *  com.xy.readbean.AllActive
 *  com.xy.richtext.RichLabel
 *  com.xy.script.ScriptOpen
 *  com.xy.script.ScriptTask
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IiiiIiiiIIIII;
import com.xy.a.iIiiIiiiIiiIi;
import com.xy.a.iiiiIiiiiiiII;
import com.xy.bean.Coordinates;
import com.xy.bean.RoleShow;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.ActiveAward;
import com.xy.readbean.ActiveBase;
import com.xy.readbean.AllActive;
import com.xy.richtext.RichLabel;
import com.xy.script.ScriptOpen;
import com.xy.script.ScriptTask;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class IiIIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private JScrollPane IiIiiiiiIIIII;
    private IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private JLabel[] iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi = 0;
    private RichLabel iIiiIiiiiiiII;
    private JScrollPane IIiiIiiiIIiIi;
    private JComponent iIiIiiiiIiIii;
    private iIIiIiiiIiiIi IiIIIiiiiIiiI;
    private static Image iiIiiiiiiiIii;
    private List<iiiiIiiiiiiII> IiiiiiiiIIIII;
    private static Image ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int sid) {
        block10: {
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                return;
            }
            if (sid != 2) break block10;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getTaskSystem().ALLATORIxDEMO(2, 3);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl26
        }
        IiiiiiiiIIIII = this.iIiIiiiiIiIii.getComponentCount();
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl42
        do {
            IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.iiIiiiiiiiIii.getText());
            if (IiiiiiiiIIIII > this.iiiIiiiiiiiIi) {
                IiiiiiiiIIIII.ALLATORIxDEMO.setBtn(-1, "sc/b/B309.png");
            } else if ((IiiiiiiiIIIII >> IiiiiiiiIIIII & 1) == 1) {
                IiiiiiiiIIIII.ALLATORIxDEMO.setBtn(-1, "sc/b/B310.png");
            } else {
                IiiiiiiiIIIII.ALLATORIxDEMO.setBtn(1, "sc/b/B308.png");
            }
            ++IiiiiiiiIIIII;
lbl26:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size());
        return;
        do {
            IiiiiiiiIIIII = (IiiiIiiiIIIII)this.iIiIiiiiIiIii.getComponent(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII.iiiIiiiiiiiIi.getSid() != sid) {
                ++IiiiiiiiIIIII;
                continue;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getTaskSystem().ALLATORIxDEMO(sid, 2);
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.iiiIiiiiiiiIi, IiiiiiiiIIIII);
            if (IiiiiiiiIIIII.iiiIiiiiiiiIi.getNum() < IiiiiiiiIIIII) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.iiiIiiiiiiiIi.getNum();
            } else {
                this.iiiIiiiiiiiIi += IiiiiiiiIIIII.iiiIiiiiiiiIi.getValue();
            }
            this.IiIIIiiiiIiiI.setText(String.valueOf(this.iiiIiiiiiiiIi));
            this.iIiIiiiiIIiii(2);
            return;
lbl42:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
    }

    public synchronized void iIiIiiiiIIiIi() {
        iiiiIiiiiiiII IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        AllActive IiiiiiiiIIIII4 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        this.iiiIiiiiiiiIi = 0;
        int IiiiiiiiIIIII5 = this.iIiIiiiiIiIii.getComponentCount();
        ActiveBase[] IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getBases();
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
            ActiveBase IiiiiiiiIIIII8 = IiiiiiiiIIIII6[IiiiiiiiIIIII7];
            IiiiIiiiIIIII IiiiiiiiIIIII9 = null;
            if (IiiiiiiiIIIII7 < IiiiiiiiIIIII5) {
                IiiiiiiiIIIII9 = (IiiiIiiiIIIII)this.iIiIiiiiIiIii.getComponent(IiiiiiiiIIIII7);
            } else {
                IiiiiiiiIIIII9 = new IiiiIiiiIIIII(this);
                this.iIiIiiiiIiIii.add((Component)IiiiiiiiIIIII9);
            }
            int n = IiiiiiiiIIIII3.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII8.getSid(), 2);
            IiiiiiiiIIIII9.ALLATORIxDEMO(IiiiiiiiIIIII8, IiiiiiiiIIIII2);
            IiiiiiiiIIIII9.setBounds(0, 0 + IiiiiiiiIIIII7 * 61, 371, 61);
            if (IiiiiiiiIIIII8.getNum() < IiiiiiiiIIIII2) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII8.getNum();
            }
            ++IiiiiiiiIIIII7;
            this.iiiIiiiiiiiIi += IiiiiiiiIIIII2 * IiiiiiiiIIIII8.getValue();
        }
        IiiiiiiiIIIII7 = IiiiiiiiIIIII5 - 1;
        while (IiiiiiiiIIIII7 >= IiiiiiiiIIIII6.length) {
            this.iIiIiiiiIiIii.remove(IiiiiiiiIIIII7--);
        }
        this.iIiIiiiiIiIii.setPreferredSize(new Dimension(371, 61 * IiiiiiiiIIIII6.length));
        this.IiIIIiiiiIiiI.setText(String.valueOf(this.iiiIiiiiiiiIi));
        ActiveAward[] IiiiiiiiIIIII22 = IiiiiiiiIIIII4.getAwards();
        int IiiiiiiiIIIII10 = 340 / IiiiiiiiIIIII22.length;
        int IiiiiiiiIIIII11 = IiiiiiiiIIIII3.getTaskSystem().ALLATORIxDEMO(2, 3);
        IiiiiiiiIIIII5 = this.IiiiiiiiIIIII.size();
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII22.length) {
            IiiiiiiiIIIII = null;
            if (IiiiiiiiIIIII2 < IiiiiiiiIIIII5) {
                IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII2);
            } else {
                IiiiiiiiIIIII = new iiiiIiiiiiiII(this, IiiiiiiiIIIII2);
                this.add((Component)IiiiiiiiIIIII.ALLATORIxDEMO);
                this.add(IiiiiiiiIIIII.iiIiiiiiiiIii);
                this.IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                this.remove((Component)this.iiIiIiiiiIIIi[6]);
                this.remove((Component)this.iiIiIiiiiIIIi[7]);
                this.add((Component)this.iiIiIiiiiIIIi[6]);
                this.add((Component)this.iiIiIiiiiIIIi[7]);
            }
            IiiiiiiiIIIII.iiIiiiiiiiIii.setText(String.valueOf(IiiiiiiiIIIII22[IiiiiiiiIIIII2].getActive()));
            IiiiiiiiIIIII.ALLATORIxDEMO.setName(IiiiiiiiIIIII22[IiiiiiiiIIIII2].getValue());
            if (IiiiiiiiIIIII22[IiiiiiiiIIIII2].getActive() > this.iiiIiiiiiiiIi) {
                IiiiiiiiIIIII.ALLATORIxDEMO.setBtn(-1, "sc/b/B309.png");
            } else if ((IiiiiiiiIIIII11 >> IiiiiiiiIIIII2 & 1) == 1) {
                IiiiiiiiIIIII.ALLATORIxDEMO.setBtn(-1, "sc/b/B310.png");
            } else {
                IiiiiiiiIIIII.ALLATORIxDEMO.setBtn(1, "sc/b/B308.png");
            }
            IiiiiiiiIIIII.ALLATORIxDEMO.setBounds(90 + IiiiiiiiIIIII10 * (IiiiiiiiIIIII2 + 1), 412, 45, 36);
            int n = 90 + IiiiiiiiIIIII10 * (IiiiiiiiIIIII2 + 1);
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.iiIiiiiiiiIii.setBounds(n, 443, 45, 20);
        }
        IiiiiiiiIIIII2 = IiiiiiiiIIIII5 - 1;
        while (IiiiiiiiIIIII2 >= IiiiiiiiIIIII22.length) {
            IiiiiiiiIIIII = this.IiiiiiiiIIIII.remove(IiiiiiiiIIIII2);
            --IiiiiiiiIIIII2;
            this.remove((Component)IiiiiiiiIIIII.ALLATORIxDEMO);
            this.remove(IiiiiiiiIIIII.iiIiiiiiiiIii);
        }
        this.iiIiIiiiiIIIi[6].setBounds(133, 429, (int)Math.min(342.0, 342.0 * ((double)this.iiiIiiiiiiiIi / 340.0)), 8);
    }

    static /* synthetic */ Image iIiIiiiiIIiii() {
        return iiIiiiiiiiIii;
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIIiIi();
    }

    public int ALLATORIxDEMO(String value, String oldChar) {
        String IiiiiiiiIIIII = value.replace(oldChar, "");
        return value.length() - IiiiiiiiIIIII.length();
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi();
        super.iIiIiiiiIIiii();
    }

    static /* synthetic */ RichLabel ALLATORIxDEMO(IiIIIiiiIIIiI arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    static /* synthetic */ void iIiIiiiiIIiii(Image arg0) {
        iiIiiiiiiiIii = arg0;
    }

    public void ALLATORIxDEMO(int id, Object data) {
        if (id != 154) {
            if (id != 155) return;
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("R2=" + (Integer)data));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIIiiiiIiIIi.getBattleScene() != null) {
            return;
        }
        if (!this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIIiIi()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u662f\u961f\u5458\u65e0\u6cd5\u64cd\u4f5c");
            return;
        }
        if (!this.iiIIiiiiIiIIi.roleUnit.iiiIiiiiiiIIi()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u5728\u6446\u644a");
            return;
        }
        IiiiIiiiIIIII IiiiiiiiIIIII = (IiiiIiiiIIIII)data;
        String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.iiiIiiiiiiiIi.getGuide().split("-");
        if (IiiiiiiiIIIII2.length == 5) {
            this.iiIIiiiiIiIIi.automation.ALLATORIxDEMO(new ScriptTask(IiiiiiiiIIIII2, IiiiiiiiIIIII.iiiIiiiiiiiIi.getSid()));
            return;
        }
        RoleShow IiiiiiiiIIIII3 = this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii;
        Coordinates IiiiiiiiIIIII4 = new Coordinates(Integer.parseInt(IiiiiiiiIIIII2[0]), Integer.parseInt(IiiiiiiiIIIII2[1]), Integer.parseInt(IiiiiiiiIIIII2[2]));
        List IiiiiiiiIIIII5 = this.iiIIiiiiIiIIi.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3.getMapid().intValue(), IiiiiiiiIIIII3.getX(), IiiiiiiiIIIII3.getY(), 0, IiiiiiiiIIIII4.getMapID(), IiiiiiiiIIIII4.getX(), IiiiiiiiIIIII4.getY(), 0, 0, this.iiIIiiiiIiIIi.roleData);
        if (IiiiiiiiIIIII5 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6240\u5728\u4f4d\u7f6e\u65e0\u6cd5\u8fbe\u5230\u76ee\u7684\u5730");
            return;
        }
        ScriptOpen IiiiiiiiIIIII6 = new ScriptOpen(11, (long)Integer.parseInt(IiiiiiiiIIIII2[3]));
        IiiiiiiiIIIII5.add(0, IiiiiiiiIIIII6);
        this.iiIIiiiiIiIIi.automation.ALLATORIxDEMO(IiiiiiiiIIIII5);
    }

    public IiIIIiiiIIIiI(GameView gameView) {
        super(40, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 655, 481, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6d3b\u52a8");
        this.IiiiiiiiIIIII = new ArrayList<iiiiIiiiiiiII>();
        this.iiiiIiiiIiiII = new JLabel[7];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)44, (int)33, (int)90, (int)23, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6bcf\u65e5\u6d3b\u52a8" : (IiiiiiiiIIIII == 1 ? "\u6d3b\u52a8\u65f6\u95f4\u4e8e\u6bcf\u65e5\u51cc\u6668     \u5237\u65b0" : (IiiiiiiiIIIII == 2 ? "24:00" : (IiiiiiiiIIIII == 3 ? "\u6d3b\u52a8\u5217\u8868" : (IiiiiiiiIIIII == 4 ? "\u6d3b\u52a8\u8be6\u60c5" : (IiiiiiiiIIIII == 5 ? "\u6d3b\u8dc3\u5ea6" : (IiiiiiiiIIIII == 6 ? "\u5f53\u524d\u6d3b\u8dc3\u5ea6" : "")))))));
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(384, 38, 250, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(537, 38, 50, 19);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFF0000"));
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                if (IiiiiiiiIIIII == 3) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(52, 62, 385, 21);
                } else if (IiiiiiiiIIIII == 4) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(440, 62, 180, 21);
                }
            } else if (IiiiiiiiIIIII == 5) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(71, 423, 59, 18);
            } else if (IiiiiiiiIIIII == 6) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(511, 418, 97, 18);
            }
            this.add(this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)524, (int)438, (int)71, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii = new iIiiIiiiIiiIi(this);
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)54, (int)84, (int)383, (int)310, (Component)this.iIiIiiiiIiIii, (int)20);
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)442, (int)84, (int)178, (int)310, (Component)this.iIiiIiiiiiiII, (int)20);
        this.add(this.IIiiIiiiIIiIi);
        this.add(this.IiIiiiiiIIIII);
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/34.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(44, 33, 177, 23);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(52, 62, 385, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(440, 62, 180, 21);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(52, 62, 385, 332);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(440, 62, 180, 332);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(42, 27, 587, 380);
            } else if (IiiiiiiiIIIII == 6) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/67.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(133, 429, 342, 8);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(132, 428, 344, 10);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(Image arg0) {
        ALLATORIxDEMO = arg0;
    }

    static /* synthetic */ Image ALLATORIxDEMO() {
        return ALLATORIxDEMO;
    }
}
