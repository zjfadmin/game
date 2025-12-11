/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.iIIIIiiiIiiIi
 *  com.xy.a.w.iiIiIiiiiiIIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.iIIIIiiiIiiIi;
import com.xy.a.w.iiIiIiiiiiIIi;
import com.xy.bean.ConfirmBean;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class IiiIiiiiIIIii
extends IiiiIiiiiIiIi {
    private IIiIiiiiIiIII[] IiIiiiiiIIIII;
    private JList<iiIiIiiiiiIIi> iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi = 0;
    private JScrollPane iIiiIiiiiiiII;
    private iIIiIiiiIiiIi IIiiIiiiIIiIi;
    private JLabel iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = 30;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private IIiIiiiiIiIII[] IiiiiiiiIIIII;
    private int ALLATORIxDEMO = 0;

    static /* synthetic */ int iIiIiiiiIIiii(IiiIiiiiIIIii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiIiiiiIIIii arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiIiiiiIIIii arg0, int arg1) {
        arg0.iiiiIiiiIiiII = arg1;
    }

    public IiiIiiiiIIIii(GameView gameView) {
        super(54, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 432, 395, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "帮派守护神");
        this.IiIiiiiiIIIII = new IIiIiiiiIiIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/53.png", 2, 341 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "小成修炼" : (IiiiiiiiIIIII == 1 ? "大成修炼" : ""), (IiiiIiiiiIiIi)this);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(53 + 111 * IiiiiiiiIIIII, 35, 109, 24);
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new JList();
        this.iiIiIiiiiIIIi.setOpaque(false);
        this.iiIiIiiiiIIIi.removeAll();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 18) {
            iiIiIiiiiiIIi IiiiiiiiIIIII2 = new iiIiIiiiiiIIi(this);
            IiiiiiiiIIIII2.setBounds(0, IiiiiiiiIIIII * 34, 384, 34);
            ++IiiiiiiiIIIII;
            this.iiIiIiiiiIIIi.add((Component)IiiiiiiiIIIII2);
        }
        this.iiIiIiiiiIIIi.setPreferredSize(new Dimension(384, 680));
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)53, (int)60, (int)350, (int)278, this.iiIiIiiiiIIIi, (int)30);
        this.add(this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII = new IIiIiiiiIiIII[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIiIiiiiIiIII(IiiiiiiiIIIII == 3 ? "sc/e/7.png" : "sc/e/6.png", 1, 343 + IiiiiiiiIIIII, IiiiiiiiIIIII == 3 ? iiIIiiiiIiiII.iiiiIiiiIiiII : iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "修炼" : (IiiiiiiiIIIII == 1 ? "洗点" : (IiiiiiiiIIIII == 2 ? "兑换" : (IiiiiiiiIIIII == 3 ? "确定" : ""))), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(342, 348, 59, 25);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.black);
            } else {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(171 + 40 * IiiiiiiiIIIII, 351, 34, 18);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IIiiIiiiIIiIi.setHorizontalAlignment(10);
        this.IIiiIiiiIIiIi.setBounds(122, 352, 83, 17);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)53, (int)352, (int)70, (int)17, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iIiIiiiiIiIii.setText("修炼等级");
        this.add(this.iIiIiiiiIiIii);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iiIiiiiiiiIii.setBounds(53, 59, 350, 280);
        this.add((Component)this.iiIiiiiiiiIii);
    }

    public void ALLATORIxDEMO(boolean b, Object data) {
        iiIiIiiiiiIIi IiiiiiiiIIIII = (iiIiIiiiiiIIi)data;
        if (b) {
            int IiiiiiiiIIIII2;
            if (this.iiiiIiiiIiiII <= 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("剩余点数不足");
                return;
            }
            int n = IiiiiiiiIIIII2 = this.ALLATORIxDEMO == 2 ? 30 : 20;
            if (iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII) >= IiiiiiiiIIIII2) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("不可以再增加点数了");
                return;
            }
            iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII, (int)(iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII) + 1));
            IiiiiiiiIIIII.ALLATORIxDEMO();
            --this.iiiiIiiiIiiII;
            if (iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII) <= iiIiIiiiiiIIi.iIiIiiiiIIiii((iiIiIiiiiiIIi)IiiiiiiiIIIII)) return;
            iiIiIiiiiiIIi.iiiIiiiiiiIIi((iiIiIiiiiiIIi)IiiiiiiiIIIII).setForeground(Color.GREEN);
            iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII).setForeground(Color.GREEN);
            return;
        }
        if (iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII) <= iiIiIiiiiiIIi.iIiIiiiiIIiii((iiIiIiiiiiIIi)IiiiiiiiIIIII)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("不可以再减少点数了");
            return;
        }
        iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII, (int)(iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII) - 1));
        IiiiiiiiIIIII.ALLATORIxDEMO();
        ++this.iiiiIiiiIiiII;
        if (iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII) > iiIiIiiiiiIIi.iIiIiiiiIIiii((iiIiIiiiiiIIi)IiiiiiiiIIIII)) return;
        iiIiIiiiiiIIi.iiiIiiiiiiIIi((iiIiIiiiiiIIi)IiiiiiiiIIIII).setForeground(Color.WHITE);
        iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII).setForeground(Color.WHITE);
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi(int n) {
        void id;
        this.ALLATORIxDEMO = id;
        this.IiIIIiiiiIiiI = id == 2 ? 60 : 30;
        this.IiIiiiiiIIIII[0].setKeep(id == true);
        this.IiIiiiiiIIIII[1].setKeep(id == 2);
        this.iiiIiiiiiiIIi();
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi() {
        block8: {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
            this.iiiiIiiiIiiII = 0;
            if (this.ALLATORIxDEMO != 1) break block8;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getResistance("X");
            this.iiiIiiiiiiiIi = IiiiiiiiIIIII = IiiiiiiiIIIII.getExtraPointInt("X");
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl29
        }
        if (this.ALLATORIxDEMO != 2) return;
        IiiiiiiiIIIII = IiiiiiiiIIIII.getResistance("D");
        this.iiiIiiiiiiiIi = IiiiiiiiIIIII = IiiiiiiiIIIII.getExtraPointInt("D");
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl48
        do {
            if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) || IiiiiiiiIIIII != 0 && IiiiiiiiIIIII != 1 && IiiiiiiiIIIII != 2) {
                IiiiiiiiIIIII = this.iiIiIiiiiIIIi.getComponentCount();
                if (IiiiiiiiIIIII >= 13) {
                    IiiiiiiiIIIII = (iiIiIiiiiiIIi)this.iiIiIiiiiIIIi.getComponent(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, this);
                } else {
                    IiiiiiiiIIIII = new iiIiIiiiiiIIi(this);
                    IiiiiiiiIIIII.setBounds(0, IiiiiiiiIIIII * 34, 384, 34);
                    this.iiIiIiiiiIIIi.add((Component)IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
lbl29:
            // 2 sources

        } while (IiiiiiiiIIIII < 13);
        this.iiIiIiiiiIIIi.setPreferredSize(new Dimension(384, 34 * IiiiiiiiIIIII));
        this.iiiiIiiiIiiII = IiiiiiiiIIIII - this.iiiiIiiiIiiII;
        this.IIiiIiiiIIiIi.setText(String.valueOf(IiiiiiiiIIIII) + "/30");
        return;
        do {
            IiiiiiiiIIIII = IiiiiiiiIIIII + 13;
            if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) || IiiiiiiiIIIII != 23 && IiiiiiiiIIIII != 24 && IiiiiiiiIIIII != 25 && IiiiiiiiIIIII != 28) {
                IiiiiiiiIIIII = this.iiIiIiiiiIIIi.getComponentCount();
                if (IiiiiiiiIIIII >= 18) {
                    IiiiiiiiIIIII = (iiIiIiiiiiIIi)this.iiIiIiiiiIIIi.getComponent(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII + 13, IiiiiiiiIIIII, this);
                } else {
                    IiiiiiiiIIIII = new iiIiIiiiiiIIi(this);
                    IiiiiiiiIIIII.setBounds(0, IiiiiiiiIIIII * 34, 384, 34);
                    this.iiIiIiiiiIIIi.add((Component)IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
lbl48:
            // 2 sources

        } while (IiiiiiiiIIIII < 18);
        this.iiiiIiiiIiiII = IiiiiiiiIIIII - this.iiiiIiiiIiiII;
        this.IIiiIiiiIIiIi.setText(String.valueOf(IiiiiiiiIIIII) + "/60");
        this.iiIiIiiiiIIIi.setPreferredSize(new Dimension(384, 34 * IiiiiiiiIIIII));
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 343) {
            iIIIIiiiIiiIi IiiiiiiiIIIII = (iIIIIiiiIiiIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(106);
            IiiiiiiiIIIII.iIiIiiiiIIiii(this.ALLATORIxDEMO);
            this.ALLATORIxDEMO().iIiIiiiiIIiIi(106);
            return;
        }
        if (id == 344) {
            RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
            String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult().getResistance(this.ALLATORIxDEMO == 1 ? "X" : "D");
            if (IiiiiiiiIIIII2 == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你还没加点怎么洗点");
                return;
            }
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(16, String.valueOf(7) + (this.ALLATORIxDEMO == 1 ? "X" : "D"), "#W确定要花50W银两重置#G" + (this.ALLATORIxDEMO == 1 ? "小成修炼" : "大成修炼") + "？"));
            return;
        }
        if (id == 345) return;
        if (id != 346) return;
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append(7);
        IiiiiiiiIIIII.append(this.ALLATORIxDEMO == 1 ? "X" : "D");
        boolean IiiiiiiiIIIII3 = true;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = this.ALLATORIxDEMO == 1 ? (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) ? 10 : 13) : (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) ? 14 : 18);
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
            iiIiIiiiiiIIi IiiiiiiiIIIII6 = (iiIiIiiiiiIIi)this.iiIiIiiiiIIIi.getComponent(IiiiiiiiIIIII4);
            if (iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII6) != 0) {
                if (iiIiIiiiiiIIi.iIiIiiiiIIiii((iiIiIiiiiiIIi)IiiiiiiiIIIII6) != iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII6)) {
                    IiiiiiiiIIIII3 = false;
                }
                if (IiiiiiiiIIIII.length() > 2) {
                    IiiiiiiiIIIII.append("#");
                }
                IiiiiiiiIIIII.append(iiIiIiiiiiIIi.iIiIiiiiIIiii((iiIiIiiiiiIIi)IiiiiiiiIIIII6).getText());
                IiiiiiiiIIIII.append("=");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII6.ALLATORIxDEMO());
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你还未修改");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"rolechange", (String)IiiiiiiiIIIII.toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }
}
